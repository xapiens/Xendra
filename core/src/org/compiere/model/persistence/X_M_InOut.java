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
import org.compiere.model.reference.REF_C_OrderDeliveryRule;
import org.compiere.model.reference.REF_C_OrderDeliveryViaRule;
import org.compiere.model.reference.REF__DocumentAction;
import org.compiere.model.reference.REF__DocumentStatus;
import org.compiere.model.reference.REF_C_OrderFreightCostRule;
import org.compiere.model.reference.REF_M_TransactionMovementType;
import org.compiere.model.reference.REF__PriorityRule;
/** Generated Model for M_InOut
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_M_InOut extends PO
{
/** Standard Constructor
@param ctx context
@param M_InOut_ID id
@param trxName transaction
*/
public X_M_InOut (Properties ctx, int M_InOut_ID, String trxName)
{
super (ctx, M_InOut_ID, trxName);
/** if (M_InOut_ID == 0)
{
setC_BPartner_ID (0);
setC_BPartner_Location_ID (0);
setC_DocType_ID (0);
setDateAcct (new Timestamp(System.currentTimeMillis()));	
// @SysDate@
setDeliveryRule (null);	
// A
setDeliveryViaRule (null);	
// P
setDocAction (null);	
// CO
setDocStatus (null);	
// DR
setDocumentNo (null);
setFreightCostRule (null);	
// I
setIsApproved (false);	
// N
setIsInDispute (false);	
// N
setIsInTransit (false);	
// N
setIsPrinted (false);	
// N
setIsSOTrx (false);	
// @IsSOTrx@
setM_InOut_ID (0);
setMovementDate (new Timestamp(System.currentTimeMillis()));	
// @SysDate@
setMovementType (null);
setM_Warehouse_ID (0);
setPosted (false);
setPriorityRule (null);	
// 5
setProcessed (false);	
// N
setSendEMail (false);	
// N
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_M_InOut (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=319 */
public static int Table_ID=MTable.getTable_ID("M_InOut");

@XendraTrl(Identifier="e40e4cfe-ea42-22ef-d7c2-0180fe5eccfe")
public static String es_PE_TAB_PartnerShipments_Description="Entregas Socios de Negocio";

@XendraTrl(Identifier="e40e4cfe-ea42-22ef-d7c2-0180fe5eccfe")
public static String es_PE_TAB_PartnerShipments_Name="Entregas Socios de Negocio";

@XendraTab(Name="Partner Shipments",Description="Business Partner Shipments",Help="",
AD_Window_ID="57133321-6993-bd92-eb4e-d35c10b15e95",SeqNo=30,TabLevel=1,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=true,AD_Column_ID="",HasTree=false,
WhereClause="M_InOut.C_BPartner_ID=@C_BPartner_ID@",OrderByClause="",CommitWarning="",
AD_Process_ID="",AD_ColumnSortOrder_ID="",AD_ColumnSortYesNo_ID="",IsSortTab=false,
Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",IsInsertRecord=false,IsAdvancedTab=false,
Parent_Column_ID="",Identifier="e40e4cfe-ea42-22ef-d7c2-0180fe5eccfe",
Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_PartnerShipments="e40e4cfe-ea42-22ef-d7c2-0180fe5eccfe";

@XendraTrl(Identifier="e8de4016-9c2c-a316-d3a0-490daa151389")
public static String es_PE_TAB_MaterialReceipt_Description="Generar recibos y devoluciones del proveedor";

@XendraTrl(Identifier="e8de4016-9c2c-a316-d3a0-490daa151389")
public static String es_PE_TAB_MaterialReceipt_Name="Recibo de Material";

@XendraTrl(Identifier="e8de4016-9c2c-a316-d3a0-490daa151389")
public static String es_PE_TAB_MaterialReceipt_Help="La pestaña de despachos permite generar; mantener; entrar y procesar despachos de un proveedor ó devoluciones al proveedor.";

@XendraTab(Name="Material Receipt",Description="Enter Receipts and Vendor Returns",
Help="The Shipments Tab allows you to generate, maintain, enter and process Shipments from a Vendor or Returns to a Vendor. ",
AD_Window_ID="6856bd55-6f78-c775-449b-ef4aa2d1e170",SeqNo=10,TabLevel=0,IsSingleRow=true,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="MovementType IN ('R+', 'V+') AND IsSOTrx='N'",OrderByClause="",CommitWarning="",
AD_Process_ID="8406abc3-c373-a7b1-f8ec-0c9b73eb10d5",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="e8de4016-9c2c-a316-d3a0-490daa151389",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_MaterialReceipt="e8de4016-9c2c-a316-d3a0-490daa151389";

@XendraTrl(Identifier="301afa71-2a4c-179a-1524-e4657d76a205")
public static String es_PE_TAB_Shipment_Description="Entregas y devoluciones del cliente";

@XendraTrl(Identifier="301afa71-2a4c-179a-1524-e4657d76a205")
public static String es_PE_TAB_Shipment_Name="Entrega";

@XendraTrl(Identifier="301afa71-2a4c-179a-1524-e4657d76a205")
public static String es_PE_TAB_Shipment_Help="La pestaña Entrega permite generar; mantener; entrar y procesar entregas a clientes ó devoluciones de clientes.";

@XendraTab(Name="Shipment",Description="Shipments and Customer Returns",
Help="The Shipments Tab allows you to generate, maintain, enter and process Shipments to a Customer or Returns from a Customer. ",
AD_Window_ID="e6e007b8-22d0-0418-baa2-2de7b38251fb",SeqNo=10,TabLevel=0,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="MovementType IN ('R-', 'C-','V+')",OrderByClause="",CommitWarning="",
AD_Process_ID="8406abc3-c373-a7b1-f8ec-0c9b73eb10d5",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="301afa71-2a4c-179a-1524-e4657d76a205",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Shipment="301afa71-2a4c-179a-1524-e4657d76a205";

@XendraTrl(Identifier="e7b4b20e-ce60-7a2e-750d-d40107352348")
public static String es_PE_TABLE_M_InOut_Name="Entrega / Recibo";

@XendraTable(Name="Shipment/Receipt",Description="Material Shipment Document",Help="",
TableName="M_InOut",AccessLevel="1",AD_Window_ID="e6e007b8-22d0-0418-baa2-2de7b38251fb",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=115,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=false,
IsChangeLog=false,IsView=false,PO_Window_ID="6856bd55-6f78-c775-449b-ef4aa2d1e170",
ID="org.xendra.material",Identifier="e7b4b20e-ce60-7a2e-750d-d40107352348",
Synchronized="2017-08-16 11:43:13.0")
/** TableName=M_InOut */
public static final String Table_Name="M_InOut";


@XendraIndex(Name="inoutcosted",Identifier="ac6188e3-20db-b981-4d9c-c95ccecb18a4",
Column_Names="ad_client_id, movementdate, iscosted",IsUnique="false",
TableIdentifier="ac6188e3-20db-b981-4d9c-c95ccecb18a4",Synchronized="2016-04-07 23:48:58.0")
public static final String INDEXNAME_inoutcosted = "ac6188e3-20db-b981-4d9c-c95ccecb18a4";


@XendraIndex(Name="m_inout_bpartner",Identifier="8e0f5c0e-351d-d67e-38c9-8e1667013d3b",
Column_Names="c_bpartner_id",IsUnique="false",
TableIdentifier="8e0f5c0e-351d-d67e-38c9-8e1667013d3b",Synchronized="2014-06-01 19:03:58.0")
public static final String INDEXNAME_m_inout_bpartner = "8e0f5c0e-351d-d67e-38c9-8e1667013d3b";


@XendraIndex(Name="m_inout_order",Identifier="0b8d6029-638b-5c80-7cf7-f6b28b0e5938",
Column_Names="c_order_id",IsUnique="false",TableIdentifier="0b8d6029-638b-5c80-7cf7-f6b28b0e5938",
Synchronized="2014-06-01 19:03:58.0")
public static final String INDEXNAME_m_inout_order = "0b8d6029-638b-5c80-7cf7-f6b28b0e5938";


@XendraIndex(Name="m_inout_documentno",Identifier="0d16031e-a6dd-fbb1-43e3-5b330208e013",
Column_Names="documentno",IsUnique="false",TableIdentifier="0d16031e-a6dd-fbb1-43e3-5b330208e013",
Synchronized="2014-06-01 19:03:58.0")
public static final String INDEXNAME_m_inout_documentno = "0d16031e-a6dd-fbb1-43e3-5b330208e013";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"M_InOut");

protected BigDecimal accessLevel = BigDecimal.valueOf(1);
/** AccessLevel
@return 1 - Org 
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
    Table_ID = MTable.getTable_ID("M_InOut");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_M_InOut[").append(get_ID()).append("]");
return sb.toString();
}

/** AD_OrgTrx_ID AD_Reference=54e78591-f7f4-c613-ea27-e64b3dac5198 */
public static final int AD_ORGTRX_ID_AD_Reference_ID=130;
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

@XendraTrl(Identifier="df96a104-49d2-1c44-a741-76cf41490b36")
public static String es_PE_FIELD_Shipment_TrxOrganization_Description="Organización que inicia ó ejecuta la transacción";

@XendraTrl(Identifier="df96a104-49d2-1c44-a741-76cf41490b36")
public static String es_PE_FIELD_Shipment_TrxOrganization_Help="La organización que inicia ó ejecuta la transacción (para otra organización). La organización poseedora puede no ser la organización de la transacción en un ambiente de buró de servicio; con servicios centralizados y transacciones inter- organización.";

@XendraTrl(Identifier="df96a104-49d2-1c44-a741-76cf41490b36")
public static String es_PE_FIELD_Shipment_TrxOrganization_Name="Organización de la Trans.";

@XendraField(AD_Column_ID="AD_OrgTrx_ID",IsCentrallyMaintained=true,
AD_Tab_ID="301afa71-2a4c-179a-1524-e4657d76a205",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@$Element_OT@=Y",DisplayLength=14,IsReadOnly=false,SeqNo=290,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="df96a104-49d2-1c44-a741-76cf41490b36")
public static final String FIELDNAME_Shipment_TrxOrganization="df96a104-49d2-1c44-a741-76cf41490b36";

@XendraTrl(Identifier="5a32c37b-ec06-d091-ec61-58f4e578e53e")
public static String es_PE_FIELD_MaterialReceipt_TrxOrganization_Description="Organización que inicia ó ejecuta la transacción";

@XendraTrl(Identifier="5a32c37b-ec06-d091-ec61-58f4e578e53e")
public static String es_PE_FIELD_MaterialReceipt_TrxOrganization_Help="La organización que inicia ó ejecuta la transacción (para otra organización). La organización poseedora puede no ser la organización de la transacción en un ambiente de buró de servicio; con servicios centralizados y transacciones inter- organización.";

@XendraTrl(Identifier="5a32c37b-ec06-d091-ec61-58f4e578e53e")
public static String es_PE_FIELD_MaterialReceipt_TrxOrganization_Name="Organización de la Trans.";

@XendraField(AD_Column_ID="AD_OrgTrx_ID",IsCentrallyMaintained=true,
AD_Tab_ID="e8de4016-9c2c-a316-d3a0-490daa151389",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@$Element_OT@=Y",DisplayLength=14,IsReadOnly=false,SeqNo=250,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="5a32c37b-ec06-d091-ec61-58f4e578e53e")
public static final String FIELDNAME_MaterialReceipt_TrxOrganization="5a32c37b-ec06-d091-ec61-58f4e578e53e";

@XendraTrl(Identifier="ef8ee3be-7bd1-cda6-6b46-47cc72a706b0")
public static String es_PE_FIELD_PartnerShipments_TrxOrganization_Description="Organización que inicia ó ejecuta la transacción";

@XendraTrl(Identifier="ef8ee3be-7bd1-cda6-6b46-47cc72a706b0")
public static String es_PE_FIELD_PartnerShipments_TrxOrganization_Help="La organización que inicia ó ejecuta la transacción (para otra organización). La organización poseedora puede no ser la organización de la transacción en un ambiente de buró de servicio; con servicios centralizados y transacciones inter- organización.";

@XendraTrl(Identifier="ef8ee3be-7bd1-cda6-6b46-47cc72a706b0")
public static String es_PE_FIELD_PartnerShipments_TrxOrganization_Name="Organización de la Trans.";

@XendraField(AD_Column_ID="AD_OrgTrx_ID",IsCentrallyMaintained=true,
AD_Tab_ID="e40e4cfe-ea42-22ef-d7c2-0180fe5eccfe",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ef8ee3be-7bd1-cda6-6b46-47cc72a706b0")
public static final String FIELDNAME_PartnerShipments_TrxOrganization="ef8ee3be-7bd1-cda6-6b46-47cc72a706b0";

@XendraTrl(Identifier="730c160f-6884-a8ce-51cd-731b86b4d9ef")
public static String es_PE_COLUMN_AD_OrgTrx_ID_Name="Organización de la Trans.";

@XendraColumn(AD_Element_ID="b4180358-67aa-fe55-0409-6367a60e0a2e",ColumnName="AD_OrgTrx_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="54e78591-f7f4-c613-ea27-e64b3dac5198",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="730c160f-6884-a8ce-51cd-731b86b4d9ef",Synchronized="2017-08-05 16:55:07.0")
/** Column name AD_OrgTrx_ID */
public static final String COLUMNNAME_AD_OrgTrx_ID = "AD_OrgTrx_ID";
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

@XendraTrl(Identifier="0839187d-a8c3-14a7-04b8-baffc485f14f")
public static String es_PE_FIELD_Shipment_UserContact_Description="ID de Usuario dentro del sistema";

@XendraTrl(Identifier="0839187d-a8c3-14a7-04b8-baffc485f14f")
public static String es_PE_FIELD_Shipment_UserContact_Help="La ID de usuario identifica un usuario único en el sistema";

@XendraTrl(Identifier="0839187d-a8c3-14a7-04b8-baffc485f14f")
public static String es_PE_FIELD_Shipment_UserContact_Name="Usuario";

@XendraField(AD_Column_ID="AD_User_ID",IsCentrallyMaintained=true,
AD_Tab_ID="301afa71-2a4c-179a-1524-e4657d76a205",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=120,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0839187d-a8c3-14a7-04b8-baffc485f14f")
public static final String FIELDNAME_Shipment_UserContact="0839187d-a8c3-14a7-04b8-baffc485f14f";

@XendraTrl(Identifier="b24b919d-e3f6-bfda-623b-48929da50762")
public static String es_PE_FIELD_MaterialReceipt_UserContact_Description="ID de Usuario dentro del sistema";

@XendraTrl(Identifier="b24b919d-e3f6-bfda-623b-48929da50762")
public static String es_PE_FIELD_MaterialReceipt_UserContact_Help="La ID de usuario identifica un usuario único en el sistema";

@XendraTrl(Identifier="b24b919d-e3f6-bfda-623b-48929da50762")
public static String es_PE_FIELD_MaterialReceipt_UserContact_Name="Contacto";

@XendraField(AD_Column_ID="AD_User_ID",IsCentrallyMaintained=true,
AD_Tab_ID="e8de4016-9c2c-a316-d3a0-490daa151389",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=120,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b24b919d-e3f6-bfda-623b-48929da50762")
public static final String FIELDNAME_MaterialReceipt_UserContact="b24b919d-e3f6-bfda-623b-48929da50762";

@XendraTrl(Identifier="2febcc49-9f9c-d8c5-8751-790480a8bda3")
public static String es_PE_FIELD_PartnerShipments_UserContact_Description="ID de Usuario dentro del sistema";

@XendraTrl(Identifier="2febcc49-9f9c-d8c5-8751-790480a8bda3")
public static String es_PE_FIELD_PartnerShipments_UserContact_Help="La ID de usuario identifica un usuario único en el sistema";

@XendraTrl(Identifier="2febcc49-9f9c-d8c5-8751-790480a8bda3")
public static String es_PE_FIELD_PartnerShipments_UserContact_Name="Usuario";

@XendraField(AD_Column_ID="AD_User_ID",IsCentrallyMaintained=true,
AD_Tab_ID="e40e4cfe-ea42-22ef-d7c2-0180fe5eccfe",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2febcc49-9f9c-d8c5-8751-790480a8bda3")
public static final String FIELDNAME_PartnerShipments_UserContact="2febcc49-9f9c-d8c5-8751-790480a8bda3";

@XendraTrl(Identifier="bf33f2d6-7225-bfa4-27b8-590e61c03d0d")
public static String es_PE_COLUMN_AD_User_ID_Name="Usuario";

@XendraColumn(AD_Element_ID="abdf8dee-d3cd-73ec-c758-683e907797f4",ColumnName="AD_User_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="f4ac36a1-4200-1386-677e-14ac90afb4fe",
FieldLength=22,DefaultValue="-1",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="bf33f2d6-7225-bfa4-27b8-590e61c03d0d",Synchronized="2017-08-05 16:55:07.0")
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

@XendraTrl(Identifier="e71a76c2-30e2-9093-72dc-a8b4e92bb6d5")
public static String es_PE_FIELD_Shipment_Activity_Description="Actividad de Negocio";

@XendraTrl(Identifier="e71a76c2-30e2-9093-72dc-a8b4e92bb6d5")
public static String es_PE_FIELD_Shipment_Activity_Help="Las actividades indican tareas que son ejecutadas en el curso de un negocio; las actividades son usadas para el costeo por actividad (ABC)";

@XendraTrl(Identifier="e71a76c2-30e2-9093-72dc-a8b4e92bb6d5")
public static String es_PE_FIELD_Shipment_Activity_Name="Tipo de Gasto";

@XendraField(AD_Column_ID="C_Activity_ID",IsCentrallyMaintained=true,
AD_Tab_ID="301afa71-2a4c-179a-1524-e4657d76a205",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@$Element_AY@=Y",DisplayLength=14,IsReadOnly=false,SeqNo=280,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="e71a76c2-30e2-9093-72dc-a8b4e92bb6d5")
public static final String FIELDNAME_Shipment_Activity="e71a76c2-30e2-9093-72dc-a8b4e92bb6d5";

@XendraTrl(Identifier="4e633d75-79f1-5422-e9d4-f90100343f2d")
public static String es_PE_FIELD_MaterialReceipt_Activity_Description="Actividad de Negocio";

@XendraTrl(Identifier="4e633d75-79f1-5422-e9d4-f90100343f2d")
public static String es_PE_FIELD_MaterialReceipt_Activity_Help="Las actividades indican tareas que son ejecutadas en el curso de un negocio; las actividades son usadas para el costeo por actividad (ABC)";

@XendraTrl(Identifier="4e633d75-79f1-5422-e9d4-f90100343f2d")
public static String es_PE_FIELD_MaterialReceipt_Activity_Name="Tipo de Gasto";

@XendraField(AD_Column_ID="C_Activity_ID",IsCentrallyMaintained=true,
AD_Tab_ID="e8de4016-9c2c-a316-d3a0-490daa151389",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@$Element_AY@=Y",DisplayLength=14,IsReadOnly=false,SeqNo=240,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="4e633d75-79f1-5422-e9d4-f90100343f2d")
public static final String FIELDNAME_MaterialReceipt_Activity="4e633d75-79f1-5422-e9d4-f90100343f2d";

@XendraTrl(Identifier="6ac060ba-1ef6-92ed-7d3a-1f273e977251")
public static String es_PE_FIELD_PartnerShipments_Activity_Description="Actividad de Negocio";

@XendraTrl(Identifier="6ac060ba-1ef6-92ed-7d3a-1f273e977251")
public static String es_PE_FIELD_PartnerShipments_Activity_Help="Las actividades indican tareas que son ejecutadas en el curso de un negocio; las actividades son usadas para el costeo por actividad (ABC)";

@XendraTrl(Identifier="6ac060ba-1ef6-92ed-7d3a-1f273e977251")
public static String es_PE_FIELD_PartnerShipments_Activity_Name="Tipo de Gasto";

@XendraField(AD_Column_ID="C_Activity_ID",IsCentrallyMaintained=true,
AD_Tab_ID="e40e4cfe-ea42-22ef-d7c2-0180fe5eccfe",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6ac060ba-1ef6-92ed-7d3a-1f273e977251")
public static final String FIELDNAME_PartnerShipments_Activity="6ac060ba-1ef6-92ed-7d3a-1f273e977251";

@XendraTrl(Identifier="5ccd8ec1-4626-ee69-3598-483bdeb840e0")
public static String es_PE_COLUMN_C_Activity_ID_Name="Tipo de Gasto";

@XendraColumn(AD_Element_ID="bfeadbb3-d866-26e3-8eee-3e2fdf0ff753",ColumnName="C_Activity_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5ccd8ec1-4626-ee69-3598-483bdeb840e0",
Synchronized="2017-08-05 16:55:07.0")
/** Column name C_Activity_ID */
public static final String COLUMNNAME_C_Activity_ID = "C_Activity_ID";
/** Set Business Partner .
@param C_BPartner_ID Identifies a Business Partner */
public void setC_BPartner_ID (int C_BPartner_ID)
{
if (C_BPartner_ID < 1) throw new IllegalArgumentException ("C_BPartner_ID is mandatory.");
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

@XendraTrl(Identifier="ed4516aa-3e85-9ccd-963c-4b950abc97f9")
public static String es_PE_FIELD_Shipment_BusinessPartner_Description="Identifica un Socio de Negocio";

@XendraTrl(Identifier="ed4516aa-3e85-9ccd-963c-4b950abc97f9")
public static String es_PE_FIELD_Shipment_BusinessPartner_Help="Un socio de negocio es cualquiera con quien usted realiza transacciones. Este puede incluir Proveedores; Clientes; Empleados ó Vendedores.";

@XendraTrl(Identifier="ed4516aa-3e85-9ccd-963c-4b950abc97f9")
public static String es_PE_FIELD_Shipment_BusinessPartner_Name="Socio de Negocio";

@XendraField(AD_Column_ID="C_BPartner_ID",IsCentrallyMaintained=true,
AD_Tab_ID="301afa71-2a4c-179a-1524-e4657d76a205",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ed4516aa-3e85-9ccd-963c-4b950abc97f9")
public static final String FIELDNAME_Shipment_BusinessPartner="ed4516aa-3e85-9ccd-963c-4b950abc97f9";

@XendraTrl(Identifier="21025e40-685f-c216-32b3-101dca1bdd4c")
public static String es_PE_FIELD_MaterialReceipt_BusinessPartner_Description="Identifica un Socio de Negocio";

@XendraTrl(Identifier="21025e40-685f-c216-32b3-101dca1bdd4c")
public static String es_PE_FIELD_MaterialReceipt_BusinessPartner_Help="Un socio de negocio es cualquiera con quien usted realiza transacciones. Este puede incluir Proveedores; Clientes; Empleados ó Vendedores.";

@XendraTrl(Identifier="21025e40-685f-c216-32b3-101dca1bdd4c")
public static String es_PE_FIELD_MaterialReceipt_BusinessPartner_Name="Socio de Negocio";

@XendraField(AD_Column_ID="C_BPartner_ID",IsCentrallyMaintained=true,
AD_Tab_ID="e8de4016-9c2c-a316-d3a0-490daa151389",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="21025e40-685f-c216-32b3-101dca1bdd4c")
public static final String FIELDNAME_MaterialReceipt_BusinessPartner="21025e40-685f-c216-32b3-101dca1bdd4c";

@XendraTrl(Identifier="3ee65b95-5b0e-dc5c-de65-4aca2afdc7d7")
public static String es_PE_FIELD_PartnerShipments_BusinessPartner_Description="Identifica un Socio de Negocio";

@XendraTrl(Identifier="3ee65b95-5b0e-dc5c-de65-4aca2afdc7d7")
public static String es_PE_FIELD_PartnerShipments_BusinessPartner_Help="Un socio de negocio es cualquiera con quien usted realiza transacciones. Este puede incluir Proveedores; Clientes; Empleados ó Vendedores.";

@XendraTrl(Identifier="3ee65b95-5b0e-dc5c-de65-4aca2afdc7d7")
public static String es_PE_FIELD_PartnerShipments_BusinessPartner_Name="Socio de Negocio";

@XendraField(AD_Column_ID="C_BPartner_ID",IsCentrallyMaintained=true,
AD_Tab_ID="e40e4cfe-ea42-22ef-d7c2-0180fe5eccfe",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3ee65b95-5b0e-dc5c-de65-4aca2afdc7d7")
public static final String FIELDNAME_PartnerShipments_BusinessPartner="3ee65b95-5b0e-dc5c-de65-4aca2afdc7d7";

@XendraTrl(Identifier="348bc97e-7ab2-1def-5323-c3c6c859489e")
public static String es_PE_COLUMN_C_BPartner_ID_Name="Socio de Negocio";

@XendraColumn(AD_Element_ID="fe333dc3-4f40-1276-5f6a-d09bb66dc423",ColumnName="C_BPartner_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="06fdbbe9-e1c4-3ee4-4a9d-73d1a990cc42",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="org.compiere.model.CalloutInOut.bpartner",VFormat="",ValueMin="",ValueMax="",Version="1",
IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="348bc97e-7ab2-1def-5323-c3c6c859489e",Synchronized="2017-08-05 16:55:07.0")
/** Column name C_BPartner_ID */
public static final String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";
/** Set Partner Location.
@param C_BPartner_Location_ID Identifies the (ship to) address for this Business Partner */
public void setC_BPartner_Location_ID (int C_BPartner_Location_ID)
{
if (C_BPartner_Location_ID < 1) throw new IllegalArgumentException ("C_BPartner_Location_ID is mandatory.");
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

@XendraTrl(Identifier="ac2ebbd9-2062-5e9e-8598-3da2d8382d50")
public static String es_PE_FIELD_Shipment_PartnerLocation_Description="Identifica la dirección para este socio de negocio";

@XendraTrl(Identifier="ac2ebbd9-2062-5e9e-8598-3da2d8382d50")
public static String es_PE_FIELD_Shipment_PartnerLocation_Help="La dirección de un socio indica la ubicación de un socio de negocio";

@XendraTrl(Identifier="ac2ebbd9-2062-5e9e-8598-3da2d8382d50")
public static String es_PE_FIELD_Shipment_PartnerLocation_Name="Dirección del Socio del Negocio";

@XendraField(AD_Column_ID="C_BPartner_Location_ID",IsCentrallyMaintained=true,
AD_Tab_ID="301afa71-2a4c-179a-1524-e4657d76a205",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ac2ebbd9-2062-5e9e-8598-3da2d8382d50")
public static final String FIELDNAME_Shipment_PartnerLocation="ac2ebbd9-2062-5e9e-8598-3da2d8382d50";

@XendraTrl(Identifier="c2b7c81b-468a-59d8-81bd-dac7bc88da3f")
public static String es_PE_FIELD_MaterialReceipt_PartnerLocation_Description="Identifica la dirección para este socio de negocio";

@XendraTrl(Identifier="c2b7c81b-468a-59d8-81bd-dac7bc88da3f")
public static String es_PE_FIELD_MaterialReceipt_PartnerLocation_Help="La dirección de un socio indica la ubicación de un socio de negocio";

@XendraTrl(Identifier="c2b7c81b-468a-59d8-81bd-dac7bc88da3f")
public static String es_PE_FIELD_MaterialReceipt_PartnerLocation_Name="Dirección del Socio del Negocio";

@XendraField(AD_Column_ID="C_BPartner_Location_ID",IsCentrallyMaintained=true,
AD_Tab_ID="e8de4016-9c2c-a316-d3a0-490daa151389",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c2b7c81b-468a-59d8-81bd-dac7bc88da3f")
public static final String FIELDNAME_MaterialReceipt_PartnerLocation="c2b7c81b-468a-59d8-81bd-dac7bc88da3f";

@XendraTrl(Identifier="ed6b8c40-ba76-5f1f-c39b-9d793c616885")
public static String es_PE_FIELD_PartnerShipments_PartnerLocation_Description="Identifica la dirección para este socio de negocio";

@XendraTrl(Identifier="ed6b8c40-ba76-5f1f-c39b-9d793c616885")
public static String es_PE_FIELD_PartnerShipments_PartnerLocation_Help="La dirección de un socio indica la ubicación de un socio de negocio";

@XendraTrl(Identifier="ed6b8c40-ba76-5f1f-c39b-9d793c616885")
public static String es_PE_FIELD_PartnerShipments_PartnerLocation_Name="Dirección del Socio del Negocio";

@XendraField(AD_Column_ID="C_BPartner_Location_ID",IsCentrallyMaintained=true,
AD_Tab_ID="e40e4cfe-ea42-22ef-d7c2-0180fe5eccfe",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ed6b8c40-ba76-5f1f-c39b-9d793c616885")
public static final String FIELDNAME_PartnerShipments_PartnerLocation="ed6b8c40-ba76-5f1f-c39b-9d793c616885";

@XendraTrl(Identifier="00d815ab-c7d9-8327-6373-ca67c2044e4b")
public static String es_PE_COLUMN_C_BPartner_Location_ID_Name="Dirección del Socio del Negocio";

@XendraColumn(AD_Element_ID="0dab7dc6-2832-26dc-2462-cba2d40235f2",
ColumnName="C_BPartner_Location_ID",AD_Reference_ID=19,AD_Reference_Value_ID="",
AD_Val_Rule_ID="94403aa1-55e7-94fb-41a3-ae8d99e809ba",FieldLength=22,DefaultValue="",IsKey=false,
IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="00d815ab-c7d9-8327-6373-ca67c2044e4b",
Synchronized="2017-08-05 16:55:07.0")
/** Column name C_BPartner_Location_ID */
public static final String COLUMNNAME_C_BPartner_Location_ID = "C_BPartner_Location_ID";
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

@XendraTrl(Identifier="dfb44407-b47e-eb9d-41a0-d71dc0cfb426")
public static String es_PE_FIELD_Shipment_Campaign_Description="Campaña de Mercadeo";

@XendraTrl(Identifier="dfb44407-b47e-eb9d-41a0-d71dc0cfb426")
public static String es_PE_FIELD_Shipment_Campaign_Help="La Campaña define un programa de mercadotecnia único. Los proyectos pueden estar asociados con una campaña de mercadotecnia única. Usted puede entonces reportar basado en una campaña específica";

@XendraTrl(Identifier="dfb44407-b47e-eb9d-41a0-d71dc0cfb426")
public static String es_PE_FIELD_Shipment_Campaign_Name="Campaña";

@XendraField(AD_Column_ID="C_Campaign_ID",IsCentrallyMaintained=true,
AD_Tab_ID="301afa71-2a4c-179a-1524-e4657d76a205",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@$Element_MC@=Y",DisplayLength=14,IsReadOnly=false,SeqNo=310,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="dfb44407-b47e-eb9d-41a0-d71dc0cfb426")
public static final String FIELDNAME_Shipment_Campaign="dfb44407-b47e-eb9d-41a0-d71dc0cfb426";

@XendraTrl(Identifier="ed0e51b1-e80d-bc23-9d6f-c6b2fef660c0")
public static String es_PE_FIELD_MaterialReceipt_Campaign_Description="Campaña de Mercadeo OJO --------  se cambia a centro de costo para pruebas -----------------------";

@XendraTrl(Identifier="ed0e51b1-e80d-bc23-9d6f-c6b2fef660c0")
public static String es_PE_FIELD_MaterialReceipt_Campaign_Help="La Campaña define un programa de mercadotecnia único. Los proyectos pueden estar asociados con una campaña de mercadotecnia única. Usted puede entonces reportar basado en una campaña específica";

@XendraTrl(Identifier="ed0e51b1-e80d-bc23-9d6f-c6b2fef660c0")
public static String es_PE_FIELD_MaterialReceipt_Campaign_Name="Centro de Costo";

@XendraField(AD_Column_ID="C_Campaign_ID",IsCentrallyMaintained=true,
AD_Tab_ID="e8de4016-9c2c-a316-d3a0-490daa151389",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="@$Element_MC@=Y",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ed0e51b1-e80d-bc23-9d6f-c6b2fef660c0")
public static final String FIELDNAME_MaterialReceipt_Campaign="ed0e51b1-e80d-bc23-9d6f-c6b2fef660c0";

@XendraTrl(Identifier="a9349904-5810-62dd-72c4-0096a2a4acb1")
public static String es_PE_FIELD_PartnerShipments_Campaign_Description="Campaña de Mercadeo";

@XendraTrl(Identifier="a9349904-5810-62dd-72c4-0096a2a4acb1")
public static String es_PE_FIELD_PartnerShipments_Campaign_Help="La Campaña define un programa de mercadotecnia único. Los proyectos pueden estar asociados con una campaña de mercadotecnia única. Usted puede entonces reportar basado en una campaña específica";

@XendraTrl(Identifier="a9349904-5810-62dd-72c4-0096a2a4acb1")
public static String es_PE_FIELD_PartnerShipments_Campaign_Name="Campaña";

@XendraField(AD_Column_ID="C_Campaign_ID",IsCentrallyMaintained=true,
AD_Tab_ID="e40e4cfe-ea42-22ef-d7c2-0180fe5eccfe",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a9349904-5810-62dd-72c4-0096a2a4acb1")
public static final String FIELDNAME_PartnerShipments_Campaign="a9349904-5810-62dd-72c4-0096a2a4acb1";

@XendraTrl(Identifier="37f02f14-7f3f-85a4-648d-d48a929c1ee9")
public static String es_PE_COLUMN_C_Campaign_ID_Name="Campaña";

@XendraColumn(AD_Element_ID="6cf08e31-d355-ee38-9c0b-bee20b3ea5b6",ColumnName="C_Campaign_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="37f02f14-7f3f-85a4-648d-d48a929c1ee9",
Synchronized="2017-08-05 16:55:07.0")
/** Column name C_Campaign_ID */
public static final String COLUMNNAME_C_Campaign_ID = "C_Campaign_ID";

/** C_Charge_ID AD_Reference=f1c5fd9e-f506-616a-8e72-371fc1171092 */
public static final int C_CHARGE_ID_AD_Reference_ID=200;
/** Set Charge.
@param C_Charge_ID Additional document charges */
public void setC_Charge_ID (int C_Charge_ID)
{
if (C_Charge_ID <= 0) set_Value (COLUMNNAME_C_Charge_ID, null);
 else 
set_Value (COLUMNNAME_C_Charge_ID, Integer.valueOf(C_Charge_ID));
}
/** Get Charge.
@return Additional document charges */
public int getC_Charge_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Charge_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="388d61eb-064a-c749-ccc2-b3bd3bab5cfb")
public static String es_PE_FIELD_Shipment_Charge_Description="Cargos adicionales del documento";

@XendraTrl(Identifier="388d61eb-064a-c749-ccc2-b3bd3bab5cfb")
public static String es_PE_FIELD_Shipment_Charge_Help="El cargo indica un tipo de cargo (manejo; despacho; reposición)";

@XendraTrl(Identifier="388d61eb-064a-c749-ccc2-b3bd3bab5cfb")
public static String es_PE_FIELD_Shipment_Charge_Name="Cargo";

@XendraField(AD_Column_ID="C_Charge_ID",IsCentrallyMaintained=true,
AD_Tab_ID="301afa71-2a4c-179a-1524-e4657d76a205",AD_FieldGroup_ID="Shipment",IsDisplayed=true,
DisplayLogic="@HasCharges@='Y'",DisplayLength=14,IsReadOnly=false,SeqNo=260,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="388d61eb-064a-c749-ccc2-b3bd3bab5cfb")
public static final String FIELDNAME_Shipment_Charge="388d61eb-064a-c749-ccc2-b3bd3bab5cfb";

@XendraTrl(Identifier="4ca85565-a196-1d81-b2f3-10835d177037")
public static String es_PE_FIELD_MaterialReceipt_Charge_Description="Cargos adicionales del documento";

@XendraTrl(Identifier="4ca85565-a196-1d81-b2f3-10835d177037")
public static String es_PE_FIELD_MaterialReceipt_Charge_Help="El cargo indica un tipo de cargo (manejo; despacho; reposición)";

@XendraTrl(Identifier="4ca85565-a196-1d81-b2f3-10835d177037")
public static String es_PE_FIELD_MaterialReceipt_Charge_Name="Cargo";

@XendraField(AD_Column_ID="C_Charge_ID",IsCentrallyMaintained=true,
AD_Tab_ID="e8de4016-9c2c-a316-d3a0-490daa151389",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@HasCharges@='Y'",DisplayLength=14,IsReadOnly=false,SeqNo=200,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="4ca85565-a196-1d81-b2f3-10835d177037")
public static final String FIELDNAME_MaterialReceipt_Charge="4ca85565-a196-1d81-b2f3-10835d177037";

@XendraTrl(Identifier="aef72d10-217d-7a40-bcbc-b7ebf7706a91")
public static String es_PE_FIELD_PartnerShipments_Charge_Description="Cargos adicionales del documento";

@XendraTrl(Identifier="aef72d10-217d-7a40-bcbc-b7ebf7706a91")
public static String es_PE_FIELD_PartnerShipments_Charge_Help="El cargo indica un tipo de cargo (manejo; despacho; reposición)";

@XendraTrl(Identifier="aef72d10-217d-7a40-bcbc-b7ebf7706a91")
public static String es_PE_FIELD_PartnerShipments_Charge_Name="Cargo";

@XendraField(AD_Column_ID="C_Charge_ID",IsCentrallyMaintained=true,
AD_Tab_ID="e40e4cfe-ea42-22ef-d7c2-0180fe5eccfe",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="aef72d10-217d-7a40-bcbc-b7ebf7706a91")
public static final String FIELDNAME_PartnerShipments_Charge="aef72d10-217d-7a40-bcbc-b7ebf7706a91";

@XendraTrl(Identifier="1d4ea2a2-07fd-d836-7e2f-92f5536d778b")
public static String es_PE_COLUMN_C_Charge_ID_Name="Cargo";

@XendraColumn(AD_Element_ID="d7e2fc48-a26e-4ded-ea44-fe15849a7883",ColumnName="C_Charge_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="f1c5fd9e-f506-616a-8e72-371fc1171092",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="1d4ea2a2-07fd-d836-7e2f-92f5536d778b",Synchronized="2017-08-05 16:55:07.0")
/** Column name C_Charge_ID */
public static final String COLUMNNAME_C_Charge_ID = "C_Charge_ID";
/** Set ControlActivity.
@param C_ControlActivity_ID Control Activity */
public void setC_ControlActivity_ID (int C_ControlActivity_ID)
{
if (C_ControlActivity_ID <= 0) set_Value (COLUMNNAME_C_ControlActivity_ID, null);
 else 
set_Value (COLUMNNAME_C_ControlActivity_ID, Integer.valueOf(C_ControlActivity_ID));
}
/** Get ControlActivity.
@return Control Activity */
public int getC_ControlActivity_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_ControlActivity_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="e8651dbb-a394-8dfe-f965-76c4cab1583a")
public static String es_PE_FIELD_Shipment_ControlActivity_Description="Actividad de Control";

@XendraTrl(Identifier="e8651dbb-a394-8dfe-f965-76c4cab1583a")
public static String es_PE_FIELD_Shipment_ControlActivity_Name="Actividad de Control";

@XendraField(AD_Column_ID="C_ControlActivity_ID",IsCentrallyMaintained=true,
AD_Tab_ID="301afa71-2a4c-179a-1524-e4657d76a205",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e8651dbb-a394-8dfe-f965-76c4cab1583a")
public static final String FIELDNAME_Shipment_ControlActivity="e8651dbb-a394-8dfe-f965-76c4cab1583a";

@XendraTrl(Identifier="8b56ba86-3b4d-db91-c7d2-2ab75c2d66a4")
public static String es_PE_FIELD_MaterialReceipt_ControlActivity_Description="Actividad de Control";

@XendraTrl(Identifier="8b56ba86-3b4d-db91-c7d2-2ab75c2d66a4")
public static String es_PE_FIELD_MaterialReceipt_ControlActivity_Name="Actividad de Control";

@XendraField(AD_Column_ID="C_ControlActivity_ID",IsCentrallyMaintained=true,
AD_Tab_ID="e8de4016-9c2c-a316-d3a0-490daa151389",AD_FieldGroup_ID="Reference",IsDisplayed=false,
DisplayLogic="",DisplayLength=0,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8b56ba86-3b4d-db91-c7d2-2ab75c2d66a4")
public static final String FIELDNAME_MaterialReceipt_ControlActivity="8b56ba86-3b4d-db91-c7d2-2ab75c2d66a4";

@XendraTrl(Identifier="8b353dcc-365f-672f-87fe-43bc4166d073")
public static String es_PE_COLUMN_C_ControlActivity_ID_Name="Actividad de Control";

@XendraColumn(AD_Element_ID="93cc21ee-0269-d42b-9bdf-df9462976ca0",
ColumnName="C_ControlActivity_ID",AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="8b353dcc-365f-672f-87fe-43bc4166d073",Synchronized="2017-08-05 16:55:07.0")
/** Column name C_ControlActivity_ID */
public static final String COLUMNNAME_C_ControlActivity_ID = "C_ControlActivity_ID";

/** C_DocType_ID AD_Reference=f06eaf85-a231-e1cf-ebf8-59d002c13ab4 */
public static final int C_DOCTYPE_ID_AD_Reference_ID=170;
/** Set Document Type.
@param C_DocType_ID Document type or rules */
public void setC_DocType_ID (int C_DocType_ID)
{
if (C_DocType_ID < 0) throw new IllegalArgumentException ("C_DocType_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_DocType_ID, Integer.valueOf(C_DocType_ID));
}
/** Get Document Type.
@return Document type or rules */
public int getC_DocType_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_DocType_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="b09be411-19e6-660c-e3b5-875a8fe90628")
public static String es_PE_FIELD_Shipment_DocumentType_Description="Tipo de documento ó reglas";

@XendraTrl(Identifier="b09be411-19e6-660c-e3b5-875a8fe90628")
public static String es_PE_FIELD_Shipment_DocumentType_Help="El tipo de documento determina la secuencia del documento y las reglas de proceso";

@XendraTrl(Identifier="b09be411-19e6-660c-e3b5-875a8fe90628")
public static String es_PE_FIELD_Shipment_DocumentType_Name="Tipo de Documento";

@XendraField(AD_Column_ID="C_DocType_ID",IsCentrallyMaintained=true,
AD_Tab_ID="301afa71-2a4c-179a-1524-e4657d76a205",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b09be411-19e6-660c-e3b5-875a8fe90628")
public static final String FIELDNAME_Shipment_DocumentType="b09be411-19e6-660c-e3b5-875a8fe90628";

@XendraTrl(Identifier="e3c6e9a9-617f-74d9-b320-8fe75927a735")
public static String es_PE_FIELD_MaterialReceipt_DocumentType_Description="Tipo de documento ó reglas";

@XendraTrl(Identifier="e3c6e9a9-617f-74d9-b320-8fe75927a735")
public static String es_PE_FIELD_MaterialReceipt_DocumentType_Help="El tipo de documento determina la secuencia del documento y las reglas de proceso";

@XendraTrl(Identifier="e3c6e9a9-617f-74d9-b320-8fe75927a735")
public static String es_PE_FIELD_MaterialReceipt_DocumentType_Name="Tipo de Documento";

@XendraField(AD_Column_ID="C_DocType_ID",IsCentrallyMaintained=true,
AD_Tab_ID="e8de4016-9c2c-a316-d3a0-490daa151389",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e3c6e9a9-617f-74d9-b320-8fe75927a735")
public static final String FIELDNAME_MaterialReceipt_DocumentType="e3c6e9a9-617f-74d9-b320-8fe75927a735";

@XendraTrl(Identifier="ab4a3c02-ca80-8e7c-ae18-b00b1bab2856")
public static String es_PE_FIELD_PartnerShipments_DocumentType_Description="Tipo de documento ó reglas";

@XendraTrl(Identifier="ab4a3c02-ca80-8e7c-ae18-b00b1bab2856")
public static String es_PE_FIELD_PartnerShipments_DocumentType_Help="El tipo de documento determina la secuencia del documento y las reglas de proceso";

@XendraTrl(Identifier="ab4a3c02-ca80-8e7c-ae18-b00b1bab2856")
public static String es_PE_FIELD_PartnerShipments_DocumentType_Name="Tipo de Documento";

@XendraField(AD_Column_ID="C_DocType_ID",IsCentrallyMaintained=true,
AD_Tab_ID="e40e4cfe-ea42-22ef-d7c2-0180fe5eccfe",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=30,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ab4a3c02-ca80-8e7c-ae18-b00b1bab2856")
public static final String FIELDNAME_PartnerShipments_DocumentType="ab4a3c02-ca80-8e7c-ae18-b00b1bab2856";

@XendraTrl(Identifier="bd1386da-a346-7512-afa9-4e42693dcfd0")
public static String es_PE_COLUMN_C_DocType_ID_Name="Tipo de Documento";

@XendraColumn(AD_Element_ID="099a4147-1a72-cdd0-81e0-8bdbc8c0b883",ColumnName="C_DocType_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="f06eaf85-a231-e1cf-ebf8-59d002c13ab4",
AD_Val_Rule_ID="dd6fc25f-c92c-fb01-6714-8c13e0ee2cde",FieldLength=22,DefaultValue="",IsKey=false,
IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="org.compiere.model.CalloutInOut.docType",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=true,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="bd1386da-a346-7512-afa9-4e42693dcfd0",Synchronized="2017-08-05 16:55:07.0")
/** Column name C_DocType_ID */
public static final String COLUMNNAME_C_DocType_ID = "C_DocType_ID";
/** Set Charge amount.
@param ChargeAmt Charge Amount */
public void setChargeAmt (BigDecimal ChargeAmt)
{
set_Value (COLUMNNAME_ChargeAmt, ChargeAmt);
}
/** Get Charge amount.
@return Charge Amount */
public BigDecimal getChargeAmt() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_ChargeAmt);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="df0c98c7-c674-5fcf-abfa-c2d6ea7c4530")
public static String es_PE_FIELD_Shipment_ChargeAmount_Description="Total del Cargo";

@XendraTrl(Identifier="df0c98c7-c674-5fcf-abfa-c2d6ea7c4530")
public static String es_PE_FIELD_Shipment_ChargeAmount_Help="El Total Cargo indica el total para un cargo adicional";

@XendraTrl(Identifier="df0c98c7-c674-5fcf-abfa-c2d6ea7c4530")
public static String es_PE_FIELD_Shipment_ChargeAmount_Name="Total de Cargo";

@XendraField(AD_Column_ID="ChargeAmt",IsCentrallyMaintained=true,
AD_Tab_ID="301afa71-2a4c-179a-1524-e4657d76a205",AD_FieldGroup_ID="Shipment",IsDisplayed=true,
DisplayLogic="@HasCharges@='Y'",DisplayLength=26,IsReadOnly=false,SeqNo=270,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="df0c98c7-c674-5fcf-abfa-c2d6ea7c4530")
public static final String FIELDNAME_Shipment_ChargeAmount="df0c98c7-c674-5fcf-abfa-c2d6ea7c4530";

@XendraTrl(Identifier="4db30306-9150-51de-0d08-49125410b5d6")
public static String es_PE_FIELD_MaterialReceipt_ChargeAmount_Description="Total del Cargo";

@XendraTrl(Identifier="4db30306-9150-51de-0d08-49125410b5d6")
public static String es_PE_FIELD_MaterialReceipt_ChargeAmount_Help="El Total Cargo indica el total para un cargo adicional";

@XendraTrl(Identifier="4db30306-9150-51de-0d08-49125410b5d6")
public static String es_PE_FIELD_MaterialReceipt_ChargeAmount_Name="Total de Cargo";

@XendraField(AD_Column_ID="ChargeAmt",IsCentrallyMaintained=true,
AD_Tab_ID="e8de4016-9c2c-a316-d3a0-490daa151389",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@HasCharges@='Y'",DisplayLength=26,IsReadOnly=false,SeqNo=210,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="4db30306-9150-51de-0d08-49125410b5d6")
public static final String FIELDNAME_MaterialReceipt_ChargeAmount="4db30306-9150-51de-0d08-49125410b5d6";

@XendraTrl(Identifier="30e5fbdc-95d5-d93f-7e55-93405bea9c80")
public static String es_PE_FIELD_PartnerShipments_ChargeAmount_Description="Total del Cargo";

@XendraTrl(Identifier="30e5fbdc-95d5-d93f-7e55-93405bea9c80")
public static String es_PE_FIELD_PartnerShipments_ChargeAmount_Help="El Total Cargo indica el total para un cargo adicional";

@XendraTrl(Identifier="30e5fbdc-95d5-d93f-7e55-93405bea9c80")
public static String es_PE_FIELD_PartnerShipments_ChargeAmount_Name="Total de Cargo";

@XendraField(AD_Column_ID="ChargeAmt",IsCentrallyMaintained=true,
AD_Tab_ID="e40e4cfe-ea42-22ef-d7c2-0180fe5eccfe",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="30e5fbdc-95d5-d93f-7e55-93405bea9c80")
public static final String FIELDNAME_PartnerShipments_ChargeAmount="30e5fbdc-95d5-d93f-7e55-93405bea9c80";

@XendraTrl(Identifier="6982b5a2-cc5a-65f3-b3c8-b83e7c05ea0e")
public static String es_PE_COLUMN_ChargeAmt_Name="Total de Cargo";

@XendraColumn(AD_Element_ID="0700d401-01bb-8f19-a508-aa47155ba852",ColumnName="ChargeAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6982b5a2-cc5a-65f3-b3c8-b83e7c05ea0e",
Synchronized="2017-08-05 16:55:07.0")
/** Column name ChargeAmt */
public static final String COLUMNNAME_ChargeAmt = "ChargeAmt";
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

@XendraTrl(Identifier="f86959a5-3769-4e83-8d45-3a2057579faf")
public static String es_PE_FIELD_Shipment_Invoice_Description="Identificador de la factura";

@XendraTrl(Identifier="f86959a5-3769-4e83-8d45-3a2057579faf")
public static String es_PE_FIELD_Shipment_Invoice_Help="La ID de Factura identifica únicamente un documento de Factura.";

@XendraTrl(Identifier="f86959a5-3769-4e83-8d45-3a2057579faf")
public static String es_PE_FIELD_Shipment_Invoice_Name="Factura";

@XendraField(AD_Column_ID="C_Invoice_ID",IsCentrallyMaintained=true,
AD_Tab_ID="301afa71-2a4c-179a-1524-e4657d76a205",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f86959a5-3769-4e83-8d45-3a2057579faf")
public static final String FIELDNAME_Shipment_Invoice="f86959a5-3769-4e83-8d45-3a2057579faf";

@XendraTrl(Identifier="acfdf083-121c-d71a-e69f-d9665b88e5a9")
public static String es_PE_FIELD_MaterialReceipt_Invoice_Description="Identificador de la factura";

@XendraTrl(Identifier="acfdf083-121c-d71a-e69f-d9665b88e5a9")
public static String es_PE_FIELD_MaterialReceipt_Invoice_Help="La ID de Factura identifica únicamente un documento de Factura.";

@XendraTrl(Identifier="acfdf083-121c-d71a-e69f-d9665b88e5a9")
public static String es_PE_FIELD_MaterialReceipt_Invoice_Name="Factura";

@XendraField(AD_Column_ID="C_Invoice_ID",IsCentrallyMaintained=true,
AD_Tab_ID="e8de4016-9c2c-a316-d3a0-490daa151389",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="acfdf083-121c-d71a-e69f-d9665b88e5a9")
public static final String FIELDNAME_MaterialReceipt_Invoice="acfdf083-121c-d71a-e69f-d9665b88e5a9";

@XendraTrl(Identifier="2a29f1e7-d9f1-1813-f679-599fa8dfaf3d")
public static String es_PE_FIELD_PartnerShipments_Invoice_Description="Identificador de la factura";

@XendraTrl(Identifier="2a29f1e7-d9f1-1813-f679-599fa8dfaf3d")
public static String es_PE_FIELD_PartnerShipments_Invoice_Help="La ID de Factura identifica únicamente un documento de Factura.";

@XendraTrl(Identifier="2a29f1e7-d9f1-1813-f679-599fa8dfaf3d")
public static String es_PE_FIELD_PartnerShipments_Invoice_Name="Factura";

@XendraField(AD_Column_ID="C_Invoice_ID",IsCentrallyMaintained=true,
AD_Tab_ID="e40e4cfe-ea42-22ef-d7c2-0180fe5eccfe",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2a29f1e7-d9f1-1813-f679-599fa8dfaf3d")
public static final String FIELDNAME_PartnerShipments_Invoice="2a29f1e7-d9f1-1813-f679-599fa8dfaf3d";

@XendraTrl(Identifier="a04a8217-0a81-4d0f-2d30-c303bd3a7a8d")
public static String es_PE_COLUMN_C_Invoice_ID_Name="Factura";

@XendraColumn(AD_Element_ID="e526ea57-1bdf-9871-fd57-0df3c1f9dd42",ColumnName="C_Invoice_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a04a8217-0a81-4d0f-2d30-c303bd3a7a8d",
Synchronized="2017-08-05 16:55:07.0")
/** Column name C_Invoice_ID */
public static final String COLUMNNAME_C_Invoice_ID = "C_Invoice_ID";
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

@XendraTrl(Identifier="d1d2581c-99f6-56e1-01a7-05b2eaf9ac07")
public static String es_PE_FIELD_Shipment_Order_Description="Orden de Venta";

@XendraTrl(Identifier="d1d2581c-99f6-56e1-01a7-05b2eaf9ac07")
public static String es_PE_FIELD_Shipment_Order_Help="La ID de la orden de ventas es un identificador único de la orden de ventas; Ésta es controlada por la secuencia del documento para este tipo de documento.";

@XendraTrl(Identifier="d1d2581c-99f6-56e1-01a7-05b2eaf9ac07")
public static String es_PE_FIELD_Shipment_Order_Name="Orden de Venta";

@XendraField(AD_Column_ID="C_Order_ID",IsCentrallyMaintained=true,
AD_Tab_ID="301afa71-2a4c-179a-1524-e4657d76a205",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d1d2581c-99f6-56e1-01a7-05b2eaf9ac07")
public static final String FIELDNAME_Shipment_Order="d1d2581c-99f6-56e1-01a7-05b2eaf9ac07";

@XendraTrl(Identifier="62b8da3c-a8a5-2416-2f02-d997b6dff00d")
public static String es_PE_FIELD_MaterialReceipt_PurchaseOrder_Description="Orden de compra";

@XendraTrl(Identifier="62b8da3c-a8a5-2416-2f02-d997b6dff00d")
public static String es_PE_FIELD_MaterialReceipt_PurchaseOrder_Help="La compra es Identificada con un ID único de orden de compra. Esta controlado por la secuencia de este tipo de documento.";

@XendraTrl(Identifier="62b8da3c-a8a5-2416-2f02-d997b6dff00d")
public static String es_PE_FIELD_MaterialReceipt_PurchaseOrder_Name="Orden de compra";

@XendraField(AD_Column_ID="C_Order_ID",IsCentrallyMaintained=true,
AD_Tab_ID="e8de4016-9c2c-a316-d3a0-490daa151389",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@C_Order_ID@!0",DisplayLength=26,IsReadOnly=true,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="62b8da3c-a8a5-2416-2f02-d997b6dff00d")
public static final String FIELDNAME_MaterialReceipt_PurchaseOrder="62b8da3c-a8a5-2416-2f02-d997b6dff00d";

@XendraTrl(Identifier="f1f9f39c-b633-a295-adf9-c347c33c7bd4")
public static String es_PE_FIELD_PartnerShipments_Order_Description="Orden de Venta";

@XendraTrl(Identifier="f1f9f39c-b633-a295-adf9-c347c33c7bd4")
public static String es_PE_FIELD_PartnerShipments_Order_Help="La ID de la orden de ventas es un identificador único de la orden de ventas; Ésta es controlada por la secuencia del documento para este tipo de documento.";

@XendraTrl(Identifier="f1f9f39c-b633-a295-adf9-c347c33c7bd4")
public static String es_PE_FIELD_PartnerShipments_Order_Name="Orden de Venta";

@XendraField(AD_Column_ID="C_Order_ID",IsCentrallyMaintained=true,
AD_Tab_ID="e40e4cfe-ea42-22ef-d7c2-0180fe5eccfe",AD_FieldGroup_ID="Reference",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=120,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f1f9f39c-b633-a295-adf9-c347c33c7bd4")
public static final String FIELDNAME_PartnerShipments_Order="f1f9f39c-b633-a295-adf9-c347c33c7bd4";

@XendraTrl(Identifier="e8f7b34a-d74b-483e-49cc-8132c59d0cb2")
public static String es_PE_COLUMN_C_Order_ID_Name="Orden de Venta";

@XendraColumn(AD_Element_ID="cc846c60-90b8-6aad-9d07-b5d0c0328787",ColumnName="C_Order_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="org.compiere.model.CalloutInOut.order",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="e8f7b34a-d74b-483e-49cc-8132c59d0cb2",Synchronized="2017-08-05 16:55:07.0")
/** Column name C_Order_ID */
public static final String COLUMNNAME_C_Order_ID = "C_Order_ID";
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

@XendraTrl(Identifier="3f766e7d-2a01-1fec-c85a-b701a469114c")
public static String es_PE_FIELD_Shipment_Project_Description="Identifica un proyecto único";

@XendraTrl(Identifier="3f766e7d-2a01-1fec-c85a-b701a469114c")
public static String es_PE_FIELD_Shipment_Project_Help="La ID de un proyecto es un identificador definido por el usuario para un proyecto";

@XendraTrl(Identifier="3f766e7d-2a01-1fec-c85a-b701a469114c")
public static String es_PE_FIELD_Shipment_Project_Name="Proyecto";

@XendraField(AD_Column_ID="C_Project_ID",IsCentrallyMaintained=true,
AD_Tab_ID="301afa71-2a4c-179a-1524-e4657d76a205",AD_FieldGroup_ID="Reference",IsDisplayed=true,
DisplayLogic="@$Element_PJ@=Y",DisplayLength=14,IsReadOnly=false,SeqNo=300,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="3f766e7d-2a01-1fec-c85a-b701a469114c")
public static final String FIELDNAME_Shipment_Project="3f766e7d-2a01-1fec-c85a-b701a469114c";

@XendraTrl(Identifier="e68abcee-d358-2f7f-7e5d-94349cc99ec7")
public static String es_PE_FIELD_MaterialReceipt_Project_Description="Identifica un proyecto único";

@XendraTrl(Identifier="e68abcee-d358-2f7f-7e5d-94349cc99ec7")
public static String es_PE_FIELD_MaterialReceipt_Project_Help="La ID de un proyecto es un identificador definido por el usuario para un proyecto";

@XendraTrl(Identifier="e68abcee-d358-2f7f-7e5d-94349cc99ec7")
public static String es_PE_FIELD_MaterialReceipt_Project_Name="Proyecto";

@XendraField(AD_Column_ID="C_Project_ID",IsCentrallyMaintained=true,
AD_Tab_ID="e8de4016-9c2c-a316-d3a0-490daa151389",AD_FieldGroup_ID="Reference",IsDisplayed=false,
DisplayLogic="@$Element_PJ@=Y",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e68abcee-d358-2f7f-7e5d-94349cc99ec7")
public static final String FIELDNAME_MaterialReceipt_Project="e68abcee-d358-2f7f-7e5d-94349cc99ec7";

@XendraTrl(Identifier="53e12f48-1be3-48d1-f480-e76df422fe42")
public static String es_PE_FIELD_PartnerShipments_Project_Description="Identifica un proyecto único";

@XendraTrl(Identifier="53e12f48-1be3-48d1-f480-e76df422fe42")
public static String es_PE_FIELD_PartnerShipments_Project_Help="La ID de un proyecto es un identificador definido por el usuario para un proyecto";

@XendraTrl(Identifier="53e12f48-1be3-48d1-f480-e76df422fe42")
public static String es_PE_FIELD_PartnerShipments_Project_Name="Proyecto";

@XendraField(AD_Column_ID="C_Project_ID",IsCentrallyMaintained=true,
AD_Tab_ID="e40e4cfe-ea42-22ef-d7c2-0180fe5eccfe",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="53e12f48-1be3-48d1-f480-e76df422fe42")
public static final String FIELDNAME_PartnerShipments_Project="53e12f48-1be3-48d1-f480-e76df422fe42";

@XendraTrl(Identifier="b59df36f-3d37-9cd3-715a-4254161739ad")
public static String es_PE_COLUMN_C_Project_ID_Name="Proyecto";

@XendraColumn(AD_Element_ID="16ff5dcc-9178-73dd-e618-e88bd79d573b",ColumnName="C_Project_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="961cbc99-cc24-46df-b94e-37fe139285bf",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="b59df36f-3d37-9cd3-715a-4254161739ad",Synchronized="2017-08-05 16:55:07.0")
/** Column name C_Project_ID */
public static final String COLUMNNAME_C_Project_ID = "C_Project_ID";
/** Set Create Confirm.
@param CreateConfirm Create Confirm */
public void setCreateConfirm (String CreateConfirm)
{
if (CreateConfirm != null && CreateConfirm.length() > 1)
{
log.warning("Length > 1 - truncated");
CreateConfirm = CreateConfirm.substring(0,0);
}
set_Value (COLUMNNAME_CreateConfirm, CreateConfirm);
}
/** Get Create Confirm.
@return Create Confirm */
public String getCreateConfirm() 
{
return (String)get_Value(COLUMNNAME_CreateConfirm);
}

@XendraTrl(Identifier="c96e00d2-3ea3-4349-8502-a52811a3cd71")
public static String es_PE_FIELD_Shipment_CreateConfirm_Name="Crea Confirmación";

@XendraField(AD_Column_ID="CreateConfirm",IsCentrallyMaintained=true,
AD_Tab_ID="301afa71-2a4c-179a-1524-e4657d76a205",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=350,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c96e00d2-3ea3-4349-8502-a52811a3cd71")
public static final String FIELDNAME_Shipment_CreateConfirm="c96e00d2-3ea3-4349-8502-a52811a3cd71";

@XendraTrl(Identifier="2e87d195-b074-2fb0-8fa7-45c0db8db7d3")
public static String es_PE_FIELD_MaterialReceipt_CreateConfirm_Name="Crea Confirmación";

@XendraField(AD_Column_ID="CreateConfirm",IsCentrallyMaintained=true,
AD_Tab_ID="e8de4016-9c2c-a316-d3a0-490daa151389",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=290,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2e87d195-b074-2fb0-8fa7-45c0db8db7d3")
public static final String FIELDNAME_MaterialReceipt_CreateConfirm="2e87d195-b074-2fb0-8fa7-45c0db8db7d3";

@XendraTrl(Identifier="8068cd48-8bf7-84fe-89f8-866383696311")
public static String es_PE_FIELD_PartnerShipments_CreateConfirm_Name="Crea Confirmación";

@XendraField(AD_Column_ID="CreateConfirm",IsCentrallyMaintained=true,
AD_Tab_ID="e40e4cfe-ea42-22ef-d7c2-0180fe5eccfe",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8068cd48-8bf7-84fe-89f8-866383696311")
public static final String FIELDNAME_PartnerShipments_CreateConfirm="8068cd48-8bf7-84fe-89f8-866383696311";

@XendraTrl(Identifier="edadb3f2-fe6d-c862-3453-ce96140cbbad")
public static String es_PE_COLUMN_CreateConfirm_Name="Crea Confirmación";

@XendraColumn(AD_Element_ID="53a071cb-7c48-ca4b-1f9b-c37c2a34a0df",ColumnName="CreateConfirm",
AD_Reference_ID=28,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="3c35e67b-2010-8ce9-ce87-2629cf658afa",
IsAlwaysUpdateable=true,ColumnSQL="",IsAllowLogging=false,
Identifier="edadb3f2-fe6d-c862-3453-ce96140cbbad",Synchronized="2017-08-05 16:55:07.0")
/** Column name CreateConfirm */
public static final String COLUMNNAME_CreateConfirm = "CreateConfirm";
/** Set Create lines from.
@param CreateFrom Process which will generate a new document lines based on an existing document */
public void setCreateFrom (String CreateFrom)
{
if (CreateFrom != null && CreateFrom.length() > 1)
{
log.warning("Length > 1 - truncated");
CreateFrom = CreateFrom.substring(0,0);
}
set_Value (COLUMNNAME_CreateFrom, CreateFrom);
}
/** Get Create lines from.
@return Process which will generate a new document lines based on an existing document */
public String getCreateFrom() 
{
return (String)get_Value(COLUMNNAME_CreateFrom);
}

@XendraTrl(Identifier="53a188a5-39f8-d60a-6fec-a65c31f8aea5")
public static String es_PE_FIELD_Shipment_CreateLinesFrom_Description="Proceso que generará un nuevo documento";

@XendraTrl(Identifier="53a188a5-39f8-d60a-6fec-a65c31f8aea5")
public static String es_PE_FIELD_Shipment_CreateLinesFrom_Help="El proceso crear desde creará un nuevo documento basado en información de un documento existente seleccionado por el usuario";

@XendraTrl(Identifier="53a188a5-39f8-d60a-6fec-a65c31f8aea5")
public static String es_PE_FIELD_Shipment_CreateLinesFrom_Name="Crear Desde";

@XendraField(AD_Column_ID="CreateFrom",IsCentrallyMaintained=true,
AD_Tab_ID="301afa71-2a4c-179a-1524-e4657d76a205",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="53a188a5-39f8-d60a-6fec-a65c31f8aea5")
public static final String FIELDNAME_Shipment_CreateLinesFrom="53a188a5-39f8-d60a-6fec-a65c31f8aea5";

@XendraTrl(Identifier="1dc67441-e94c-38f3-9128-85cb7ca5701e")
public static String es_PE_FIELD_MaterialReceipt_CreateLinesFrom_Description="Proceso que generará un nuevo documento";

@XendraTrl(Identifier="1dc67441-e94c-38f3-9128-85cb7ca5701e")
public static String es_PE_FIELD_MaterialReceipt_CreateLinesFrom_Help="El proceso crear desde creará un nuevo documento basado en información de un documento existente seleccionado por el usuario";

@XendraTrl(Identifier="1dc67441-e94c-38f3-9128-85cb7ca5701e")
public static String es_PE_FIELD_MaterialReceipt_CreateLinesFrom_Name="Crear Desde";

@XendraField(AD_Column_ID="CreateFrom",IsCentrallyMaintained=true,
AD_Tab_ID="e8de4016-9c2c-a316-d3a0-490daa151389",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=220,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1dc67441-e94c-38f3-9128-85cb7ca5701e")
public static final String FIELDNAME_MaterialReceipt_CreateLinesFrom="1dc67441-e94c-38f3-9128-85cb7ca5701e";

@XendraTrl(Identifier="08f13e83-941d-6c5a-f267-4ecfd305632a")
public static String es_PE_FIELD_PartnerShipments_CreateLinesFrom_Description="Proceso que generará un nuevo documento";

@XendraTrl(Identifier="08f13e83-941d-6c5a-f267-4ecfd305632a")
public static String es_PE_FIELD_PartnerShipments_CreateLinesFrom_Help="El proceso crear desde creará un nuevo documento basado en información de un documento existente seleccionado por el usuario";

@XendraTrl(Identifier="08f13e83-941d-6c5a-f267-4ecfd305632a")
public static String es_PE_FIELD_PartnerShipments_CreateLinesFrom_Name="Crear Desde";

@XendraField(AD_Column_ID="CreateFrom",IsCentrallyMaintained=true,
AD_Tab_ID="e40e4cfe-ea42-22ef-d7c2-0180fe5eccfe",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="08f13e83-941d-6c5a-f267-4ecfd305632a")
public static final String FIELDNAME_PartnerShipments_CreateLinesFrom="08f13e83-941d-6c5a-f267-4ecfd305632a";

@XendraTrl(Identifier="11188c22-80b5-ac15-dcda-7dc1f469461b")
public static String es_PE_COLUMN_CreateFrom_Name="Crear Desde";

@XendraColumn(AD_Element_ID="7fccccce-83dd-9c79-faa2-d4675bdb0e1c",ColumnName="CreateFrom",
AD_Reference_ID=28,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="11188c22-80b5-ac15-dcda-7dc1f469461b",
Synchronized="2017-08-05 16:55:07.0")
/** Column name CreateFrom */
public static final String COLUMNNAME_CreateFrom = "CreateFrom";
/** Set Create Package.
@param CreatePackage Create Package */
public void setCreatePackage (String CreatePackage)
{
if (CreatePackage != null && CreatePackage.length() > 1)
{
log.warning("Length > 1 - truncated");
CreatePackage = CreatePackage.substring(0,0);
}
set_Value (COLUMNNAME_CreatePackage, CreatePackage);
}
/** Get Create Package.
@return Create Package */
public String getCreatePackage() 
{
return (String)get_Value(COLUMNNAME_CreatePackage);
}

@XendraTrl(Identifier="6778a436-717e-385b-beec-2ede47f0f3a9")
public static String es_PE_FIELD_Shipment_CreatePackage_Name="Crear Paquete";

@XendraField(AD_Column_ID="CreatePackage",IsCentrallyMaintained=true,
AD_Tab_ID="301afa71-2a4c-179a-1524-e4657d76a205",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@DeliveryViaRule@=S",DisplayLength=23,IsReadOnly=false,SeqNo=200,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="6778a436-717e-385b-beec-2ede47f0f3a9")
public static final String FIELDNAME_Shipment_CreatePackage="6778a436-717e-385b-beec-2ede47f0f3a9";

@XendraTrl(Identifier="6e586a85-3fe5-6894-791d-99c4490b87f9")
public static String es_PE_FIELD_MaterialReceipt_CreatePackage_Name="Crear Paquete";

@XendraField(AD_Column_ID="CreatePackage",IsCentrallyMaintained=true,
AD_Tab_ID="e8de4016-9c2c-a316-d3a0-490daa151389",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6e586a85-3fe5-6894-791d-99c4490b87f9")
public static final String FIELDNAME_MaterialReceipt_CreatePackage="6e586a85-3fe5-6894-791d-99c4490b87f9";

@XendraTrl(Identifier="e15bb2c1-496a-55d8-c726-eaac98ae6b10")
public static String es_PE_FIELD_PartnerShipments_CreatePackage_Name="Crear Paquete";

@XendraField(AD_Column_ID="CreatePackage",IsCentrallyMaintained=true,
AD_Tab_ID="e40e4cfe-ea42-22ef-d7c2-0180fe5eccfe",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e15bb2c1-496a-55d8-c726-eaac98ae6b10")
public static final String FIELDNAME_PartnerShipments_CreatePackage="e15bb2c1-496a-55d8-c726-eaac98ae6b10";

@XendraTrl(Identifier="a5278cea-b026-693d-239a-72d75788057a")
public static String es_PE_COLUMN_CreatePackage_Name="Crea Paquete";

@XendraColumn(AD_Element_ID="eea4a472-a489-ca7c-0474-75b51f3379cb",ColumnName="CreatePackage",
AD_Reference_ID=28,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="40167b8d-4082-f969-950c-6146c8b283dc",
IsAlwaysUpdateable=true,ColumnSQL="",IsAllowLogging=false,
Identifier="a5278cea-b026-693d-239a-72d75788057a",Synchronized="2017-08-05 16:55:07.0")
/** Column name CreatePackage */
public static final String COLUMNNAME_CreatePackage = "CreatePackage";
/** Set UnitApplication.
@param C_UnitApplication_ID UnitApplication */
public void setC_UnitApplication_ID (int C_UnitApplication_ID)
{
if (C_UnitApplication_ID <= 0) set_Value (COLUMNNAME_C_UnitApplication_ID, null);
 else 
set_Value (COLUMNNAME_C_UnitApplication_ID, Integer.valueOf(C_UnitApplication_ID));
}
/** Get UnitApplication.
@return UnitApplication */
public int getC_UnitApplication_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_UnitApplication_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="4a7fcdf0-cbaf-fcae-ec5c-e76c9d699e4d")
public static String es_PE_FIELD_Shipment_UnitApplication_Name="UnitApplication";

@XendraField(AD_Column_ID="C_UnitApplication_ID",IsCentrallyMaintained=true,
AD_Tab_ID="301afa71-2a4c-179a-1524-e4657d76a205",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="4a7fcdf0-cbaf-fcae-ec5c-e76c9d699e4d")
public static final String FIELDNAME_Shipment_UnitApplication="4a7fcdf0-cbaf-fcae-ec5c-e76c9d699e4d";

@XendraTrl(Identifier="6802b0ed-99ab-d474-e687-881895a66f2d")
public static String es_PE_COLUMN_C_UnitApplication_ID_Name="UnitApplication";

@XendraColumn(AD_Element_ID="f5c81a47-6e91-7f96-fb33-6da9a07a172f",
ColumnName="C_UnitApplication_ID",AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="6802b0ed-99ab-d474-e687-881895a66f2d",Synchronized="2017-08-05 16:55:07.0")
/** Column name C_UnitApplication_ID */
public static final String COLUMNNAME_C_UnitApplication_ID = "C_UnitApplication_ID";
/** Set Account Date.
@param DateAcct Accounting Date */
public void setDateAcct (Timestamp DateAcct)
{
if (DateAcct == null) throw new IllegalArgumentException ("DateAcct is mandatory.");
set_Value (COLUMNNAME_DateAcct, DateAcct);
}
/** Get Account Date.
@return Accounting Date */
public Timestamp getDateAcct() 
{
return (Timestamp)get_Value(COLUMNNAME_DateAcct);
}

@XendraTrl(Identifier="d0d34731-ec96-4176-7556-1263cc600276")
public static String es_PE_FIELD_Shipment_AccountDate_Description="Fecha contable";

@XendraTrl(Identifier="d0d34731-ec96-4176-7556-1263cc600276")
public static String es_PE_FIELD_Shipment_AccountDate_Help="La fecha contable indica la fecha a ser usada en las cuentas de contabilidad general generadas desde este documento";

@XendraTrl(Identifier="d0d34731-ec96-4176-7556-1263cc600276")
public static String es_PE_FIELD_Shipment_AccountDate_Name="Fecha de Aplicación CG";

@XendraField(AD_Column_ID="DateAcct",IsCentrallyMaintained=true,
AD_Tab_ID="301afa71-2a4c-179a-1524-e4657d76a205",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d0d34731-ec96-4176-7556-1263cc600276")
public static final String FIELDNAME_Shipment_AccountDate="d0d34731-ec96-4176-7556-1263cc600276";

@XendraTrl(Identifier="54395c10-b717-e383-d85d-de681f905218")
public static String es_PE_FIELD_MaterialReceipt_AccountDate_Description="Fecha contable";

@XendraTrl(Identifier="54395c10-b717-e383-d85d-de681f905218")
public static String es_PE_FIELD_MaterialReceipt_AccountDate_Help="La fecha contable indica la fecha a ser usada en las cuentas de contabilidad general generadas desde este documento";

@XendraTrl(Identifier="54395c10-b717-e383-d85d-de681f905218")
public static String es_PE_FIELD_MaterialReceipt_AccountDate_Name="Fecha de Aplicación CG";

@XendraField(AD_Column_ID="DateAcct",IsCentrallyMaintained=true,
AD_Tab_ID="e8de4016-9c2c-a316-d3a0-490daa151389",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="54395c10-b717-e383-d85d-de681f905218")
public static final String FIELDNAME_MaterialReceipt_AccountDate="54395c10-b717-e383-d85d-de681f905218";

@XendraTrl(Identifier="4cb084f0-025f-311e-6cc8-6f6bad22bd38")
public static String es_PE_FIELD_PartnerShipments_AccountDate_Description="Fecha contable";

@XendraTrl(Identifier="4cb084f0-025f-311e-6cc8-6f6bad22bd38")
public static String es_PE_FIELD_PartnerShipments_AccountDate_Help="La fecha contable indica la fecha a ser usada en las cuentas de contabilidad general generadas desde este documento";

@XendraTrl(Identifier="4cb084f0-025f-311e-6cc8-6f6bad22bd38")
public static String es_PE_FIELD_PartnerShipments_AccountDate_Name="Fecha de Aplicación CG";

@XendraField(AD_Column_ID="DateAcct",IsCentrallyMaintained=true,
AD_Tab_ID="e40e4cfe-ea42-22ef-d7c2-0180fe5eccfe",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="4cb084f0-025f-311e-6cc8-6f6bad22bd38")
public static final String FIELDNAME_PartnerShipments_AccountDate="4cb084f0-025f-311e-6cc8-6f6bad22bd38";

@XendraTrl(Identifier="27255160-abc2-74d3-d8d1-e6aaf2712498")
public static String es_PE_COLUMN_DateAcct_Name="Fecha de Aplicación CG";

@XendraColumn(AD_Element_ID="034727d0-e80f-fadf-3d4f-2d8d37b75669",ColumnName="DateAcct",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,
DefaultValue="@SysDate@",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="27255160-abc2-74d3-d8d1-e6aaf2712498",Synchronized="2017-08-05 16:55:07.0")
/** Column name DateAcct */
public static final String COLUMNNAME_DateAcct = "DateAcct";
/** Set Date Ordered.
@param DateOrdered Date of Order */
public void setDateOrdered (Timestamp DateOrdered)
{
set_ValueNoCheck (COLUMNNAME_DateOrdered, DateOrdered);
}
/** Get Date Ordered.
@return Date of Order */
public Timestamp getDateOrdered() 
{
return (Timestamp)get_Value(COLUMNNAME_DateOrdered);
}

@XendraTrl(Identifier="2b80781c-fc0f-5305-e0c9-556e6fd0ebd0")
public static String es_PE_FIELD_Shipment_DateOrdered_Description="Fecha de la orden";

@XendraTrl(Identifier="2b80781c-fc0f-5305-e0c9-556e6fd0ebd0")
public static String es_PE_FIELD_Shipment_DateOrdered_Help="Indica la fecha en que un artículo fue ordenada";

@XendraTrl(Identifier="2b80781c-fc0f-5305-e0c9-556e6fd0ebd0")
public static String es_PE_FIELD_Shipment_DateOrdered_Name="Fecha de la Orden";

@XendraField(AD_Column_ID="DateOrdered",IsCentrallyMaintained=true,
AD_Tab_ID="301afa71-2a4c-179a-1524-e4657d76a205",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=40,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2b80781c-fc0f-5305-e0c9-556e6fd0ebd0")
public static final String FIELDNAME_Shipment_DateOrdered="2b80781c-fc0f-5305-e0c9-556e6fd0ebd0";

@XendraTrl(Identifier="d5c332d1-2e4f-c436-786e-394900f6f116")
public static String es_PE_FIELD_MaterialReceipt_DateOrdered_Description="Fecha de la orden";

@XendraTrl(Identifier="d5c332d1-2e4f-c436-786e-394900f6f116")
public static String es_PE_FIELD_MaterialReceipt_DateOrdered_Help="Indica la fecha en que un artículo fue ordenada";

@XendraTrl(Identifier="d5c332d1-2e4f-c436-786e-394900f6f116")
public static String es_PE_FIELD_MaterialReceipt_DateOrdered_Name="Fecha de la Orden";

@XendraField(AD_Column_ID="DateOrdered",IsCentrallyMaintained=true,
AD_Tab_ID="e8de4016-9c2c-a316-d3a0-490daa151389",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@C_Order_ID@!0",DisplayLength=14,IsReadOnly=true,SeqNo=40,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d5c332d1-2e4f-c436-786e-394900f6f116")
public static final String FIELDNAME_MaterialReceipt_DateOrdered="d5c332d1-2e4f-c436-786e-394900f6f116";

@XendraTrl(Identifier="757b0b06-c38d-89f9-4012-ce61b4da34b1")
public static String es_PE_FIELD_PartnerShipments_DateOrdered_Description="Fecha de la orden";

@XendraTrl(Identifier="757b0b06-c38d-89f9-4012-ce61b4da34b1")
public static String es_PE_FIELD_PartnerShipments_DateOrdered_Help="Indica la fecha en que un artículo fue ordenada";

@XendraTrl(Identifier="757b0b06-c38d-89f9-4012-ce61b4da34b1")
public static String es_PE_FIELD_PartnerShipments_DateOrdered_Name="Fecha de la Orden";

@XendraField(AD_Column_ID="DateOrdered",IsCentrallyMaintained=true,
AD_Tab_ID="e40e4cfe-ea42-22ef-d7c2-0180fe5eccfe",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="757b0b06-c38d-89f9-4012-ce61b4da34b1")
public static final String FIELDNAME_PartnerShipments_DateOrdered="757b0b06-c38d-89f9-4012-ce61b4da34b1";

@XendraTrl(Identifier="d687bde6-61ff-be2f-9120-bd8cfa919c17")
public static String es_PE_COLUMN_DateOrdered_Name="Fecha de la Orden";

@XendraColumn(AD_Element_ID="c265ae59-eec5-5c6b-26ee-1090bf37ce26",ColumnName="DateOrdered",
AD_Reference_ID=15,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d687bde6-61ff-be2f-9120-bd8cfa919c17",
Synchronized="2017-08-05 16:55:07.0")
/** Column name DateOrdered */
public static final String COLUMNNAME_DateOrdered = "DateOrdered";
/** Set Date printed.
@param DatePrinted Date the document was printed. */
public void setDatePrinted (Timestamp DatePrinted)
{
set_Value (COLUMNNAME_DatePrinted, DatePrinted);
}
/** Get Date printed.
@return Date the document was printed. */
public Timestamp getDatePrinted() 
{
return (Timestamp)get_Value(COLUMNNAME_DatePrinted);
}

@XendraTrl(Identifier="6ea3fba1-0609-aca8-1359-630567ad4852")
public static String es_PE_FIELD_Shipment_DatePrinted_Description="Fecha en que el documento fue impreso";

@XendraTrl(Identifier="6ea3fba1-0609-aca8-1359-630567ad4852")
public static String es_PE_FIELD_Shipment_DatePrinted_Help="Indica la fecha en que este documento se imprimió.";

@XendraTrl(Identifier="6ea3fba1-0609-aca8-1359-630567ad4852")
public static String es_PE_FIELD_Shipment_DatePrinted_Name="Fecha de Impresión";

@XendraField(AD_Column_ID="DatePrinted",IsCentrallyMaintained=true,
AD_Tab_ID="301afa71-2a4c-179a-1524-e4657d76a205",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6ea3fba1-0609-aca8-1359-630567ad4852")
public static final String FIELDNAME_Shipment_DatePrinted="6ea3fba1-0609-aca8-1359-630567ad4852";

@XendraTrl(Identifier="405f67b1-d88b-efab-8d9a-3b5d71811e21")
public static String es_PE_FIELD_MaterialReceipt_DatePrinted_Description="Fecha en que el documento fue impreso";

@XendraTrl(Identifier="405f67b1-d88b-efab-8d9a-3b5d71811e21")
public static String es_PE_FIELD_MaterialReceipt_DatePrinted_Help="Indica la fecha en que este documento se imprimió.";

@XendraTrl(Identifier="405f67b1-d88b-efab-8d9a-3b5d71811e21")
public static String es_PE_FIELD_MaterialReceipt_DatePrinted_Name="Fecha de Impresión";

@XendraField(AD_Column_ID="DatePrinted",IsCentrallyMaintained=true,
AD_Tab_ID="e8de4016-9c2c-a316-d3a0-490daa151389",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="405f67b1-d88b-efab-8d9a-3b5d71811e21")
public static final String FIELDNAME_MaterialReceipt_DatePrinted="405f67b1-d88b-efab-8d9a-3b5d71811e21";

@XendraTrl(Identifier="09994989-8721-d151-c7e1-0137a3f6118b")
public static String es_PE_FIELD_PartnerShipments_DatePrinted_Description="Fecha en que el documento fue impreso";

@XendraTrl(Identifier="09994989-8721-d151-c7e1-0137a3f6118b")
public static String es_PE_FIELD_PartnerShipments_DatePrinted_Help="Indica la fecha en que este documento se imprimió.";

@XendraTrl(Identifier="09994989-8721-d151-c7e1-0137a3f6118b")
public static String es_PE_FIELD_PartnerShipments_DatePrinted_Name="Fecha de Impresión";

@XendraField(AD_Column_ID="DatePrinted",IsCentrallyMaintained=true,
AD_Tab_ID="e40e4cfe-ea42-22ef-d7c2-0180fe5eccfe",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="09994989-8721-d151-c7e1-0137a3f6118b")
public static final String FIELDNAME_PartnerShipments_DatePrinted="09994989-8721-d151-c7e1-0137a3f6118b";

@XendraTrl(Identifier="e9dfbcac-ab7d-62f1-06e0-3fa2ca59b4be")
public static String es_PE_COLUMN_DatePrinted_Name="Fecha de Impresión";

@XendraColumn(AD_Element_ID="0b68d937-f4a8-8b9d-aeeb-b029c126580d",ColumnName="DatePrinted",
AD_Reference_ID=15,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e9dfbcac-ab7d-62f1-06e0-3fa2ca59b4be",
Synchronized="2017-08-05 16:55:07.0")
/** Column name DatePrinted */
public static final String COLUMNNAME_DatePrinted = "DatePrinted";
/** Set Date received.
@param DateReceived Date a product was received */
public void setDateReceived (Timestamp DateReceived)
{
set_Value (COLUMNNAME_DateReceived, DateReceived);
}
/** Get Date received.
@return Date a product was received */
public Timestamp getDateReceived() 
{
return (Timestamp)get_Value(COLUMNNAME_DateReceived);
}

@XendraTrl(Identifier="10a3f9bf-6c0b-2414-e9bf-9881b443e508")
public static String es_PE_FIELD_Shipment_DateReceived_Description="Fecha en que un producto fue recibido.";

@XendraTrl(Identifier="10a3f9bf-6c0b-2414-e9bf-9881b443e508")
public static String es_PE_FIELD_Shipment_DateReceived_Help="La fecha de recibo indica la fecha en que el producto fue recibido.";

@XendraTrl(Identifier="10a3f9bf-6c0b-2414-e9bf-9881b443e508")
public static String es_PE_FIELD_Shipment_DateReceived_Name="Fecha de Recibo";

@XendraField(AD_Column_ID="DateReceived",IsCentrallyMaintained=true,
AD_Tab_ID="301afa71-2a4c-179a-1524-e4657d76a205",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=0,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="10a3f9bf-6c0b-2414-e9bf-9881b443e508")
public static final String FIELDNAME_Shipment_DateReceived="10a3f9bf-6c0b-2414-e9bf-9881b443e508";

@XendraTrl(Identifier="90196deb-01fa-2ab7-1877-0ff603865be4")
public static String es_PE_FIELD_MaterialReceipt_DateReceived_Description="Fecha en que un producto fue recibido.";

@XendraTrl(Identifier="90196deb-01fa-2ab7-1877-0ff603865be4")
public static String es_PE_FIELD_MaterialReceipt_DateReceived_Help="La fecha de recibo indica la fecha en que el producto fue recibido.";

@XendraTrl(Identifier="90196deb-01fa-2ab7-1877-0ff603865be4")
public static String es_PE_FIELD_MaterialReceipt_DateReceived_Name="Fecha de Recibo";

@XendraField(AD_Column_ID="DateReceived",IsCentrallyMaintained=true,
AD_Tab_ID="e8de4016-9c2c-a316-d3a0-490daa151389",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=0,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="90196deb-01fa-2ab7-1877-0ff603865be4")
public static final String FIELDNAME_MaterialReceipt_DateReceived="90196deb-01fa-2ab7-1877-0ff603865be4";

@XendraTrl(Identifier="acda9ea9-1f96-a527-1fc4-80d192cfa683")
public static String es_PE_FIELD_PartnerShipments_DateReceived_Description="Fecha en que un producto fue recibido.";

@XendraTrl(Identifier="acda9ea9-1f96-a527-1fc4-80d192cfa683")
public static String es_PE_FIELD_PartnerShipments_DateReceived_Help="La fecha de recibo indica la fecha en que el producto fue recibido.";

@XendraTrl(Identifier="acda9ea9-1f96-a527-1fc4-80d192cfa683")
public static String es_PE_FIELD_PartnerShipments_DateReceived_Name="Fecha de Recibo";

@XendraField(AD_Column_ID="DateReceived",IsCentrallyMaintained=true,
AD_Tab_ID="e40e4cfe-ea42-22ef-d7c2-0180fe5eccfe",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="acda9ea9-1f96-a527-1fc4-80d192cfa683")
public static final String FIELDNAME_PartnerShipments_DateReceived="acda9ea9-1f96-a527-1fc4-80d192cfa683";

@XendraTrl(Identifier="1521940a-5d06-c04f-11b3-082fd7729005")
public static String es_PE_COLUMN_DateReceived_Name="Fecha de Recibo";

@XendraColumn(AD_Element_ID="d69e8488-829e-c9af-4ab0-68f83357b545",ColumnName="DateReceived",
AD_Reference_ID=15,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="1521940a-5d06-c04f-11b3-082fd7729005",
Synchronized="2017-08-05 16:55:07.0")
/** Column name DateReceived */
public static final String COLUMNNAME_DateReceived = "DateReceived";

/** DeliveryRule AD_Reference=dd6ca989-f822-5b38-ea47-5420e7ccb16b */
public static final int DELIVERYRULE_AD_Reference_ID=151;
/** Set Delivery Rule.
@param DeliveryRule Defines the timing of Delivery */
public void setDeliveryRule (String DeliveryRule)
{
if (DeliveryRule == null) throw new IllegalArgumentException ("DeliveryRule is mandatory");
if (DeliveryRule.equals(REF_C_OrderDeliveryRule.Availability) || DeliveryRule.equals(REF_C_OrderDeliveryRule.Manual) || DeliveryRule.equals(REF_C_OrderDeliveryRule.CompleteOrder) || DeliveryRule.equals(REF_C_OrderDeliveryRule.CompleteLine) || DeliveryRule.equals(REF_C_OrderDeliveryRule.AfterReceipt) || DeliveryRule.equals(REF_C_OrderDeliveryRule.Force));
 else throw new IllegalArgumentException ("DeliveryRule Invalid value - " + DeliveryRule + " - Reference_ID=151 - A - M - O - L - R - F");
if (DeliveryRule.length() > 1)
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

@XendraTrl(Identifier="8bfae538-936f-8924-cc90-d54675fe6561")
public static String es_PE_FIELD_Shipment_DeliveryRule_Description="Define los tiempos de entrega";

@XendraTrl(Identifier="8bfae538-936f-8924-cc90-d54675fe6561")
public static String es_PE_FIELD_Shipment_DeliveryRule_Help="La Regla de Entrega indica cuando una orden debe ser entregada. Por Ej. Si la orden debiera entregarse cuando  esta completa; cuando una partida esta completa ó cuando el producto llega a estar disponible.";

@XendraTrl(Identifier="8bfae538-936f-8924-cc90-d54675fe6561")
public static String es_PE_FIELD_Shipment_DeliveryRule_Name="Regla de Entrega";

@XendraField(AD_Column_ID="DeliveryRule",IsCentrallyMaintained=true,
AD_Tab_ID="301afa71-2a4c-179a-1524-e4657d76a205",AD_FieldGroup_ID="Warehouse",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=150,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8bfae538-936f-8924-cc90-d54675fe6561")
public static final String FIELDNAME_Shipment_DeliveryRule="8bfae538-936f-8924-cc90-d54675fe6561";

@XendraTrl(Identifier="c0e610bd-9a06-dca3-0495-e2757f11b779")
public static String es_PE_FIELD_MaterialReceipt_DeliveryRule_Description="Define los tiempos de entrega";

@XendraTrl(Identifier="c0e610bd-9a06-dca3-0495-e2757f11b779")
public static String es_PE_FIELD_MaterialReceipt_DeliveryRule_Help="La Regla de Entrega indica cuando una orden debe ser entregada. Por Ej. Si la orden debiera entregarse cuando  esta completa; cuando una partida esta completa ó cuando el producto llega a estar disponible.";

@XendraTrl(Identifier="c0e610bd-9a06-dca3-0495-e2757f11b779")
public static String es_PE_FIELD_MaterialReceipt_DeliveryRule_Name="Regla de Entrega";

@XendraField(AD_Column_ID="DeliveryRule",IsCentrallyMaintained=true,
AD_Tab_ID="e8de4016-9c2c-a316-d3a0-490daa151389",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@MovementType@='C-' ",DisplayLength=14,IsReadOnly=false,SeqNo=180,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="c0e610bd-9a06-dca3-0495-e2757f11b779")
public static final String FIELDNAME_MaterialReceipt_DeliveryRule="c0e610bd-9a06-dca3-0495-e2757f11b779";

@XendraTrl(Identifier="26239665-f3a9-aa3b-2a1f-061cf71e1cf4")
public static String es_PE_FIELD_PartnerShipments_DeliveryRule_Description="Define los tiempos de entrega";

@XendraTrl(Identifier="26239665-f3a9-aa3b-2a1f-061cf71e1cf4")
public static String es_PE_FIELD_PartnerShipments_DeliveryRule_Help="La Regla de Entrega indica cuando una orden debe ser entregada. Por Ej. Si la orden debiera entregarse cuando  esta completa; cuando una partida esta completa ó cuando el producto llega a estar disponible.";

@XendraTrl(Identifier="26239665-f3a9-aa3b-2a1f-061cf71e1cf4")
public static String es_PE_FIELD_PartnerShipments_DeliveryRule_Name="Regla de Entrega";

@XendraField(AD_Column_ID="DeliveryRule",IsCentrallyMaintained=true,
AD_Tab_ID="e40e4cfe-ea42-22ef-d7c2-0180fe5eccfe",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="26239665-f3a9-aa3b-2a1f-061cf71e1cf4")
public static final String FIELDNAME_PartnerShipments_DeliveryRule="26239665-f3a9-aa3b-2a1f-061cf71e1cf4";

@XendraTrl(Identifier="53fcb87c-1182-91d9-22d9-f4c329e0aa82")
public static String es_PE_COLUMN_DeliveryRule_Name="Regla de Entrega";

@XendraColumn(AD_Element_ID="bfc0b304-42d5-bfa2-4997-a3024ea284f9",ColumnName="DeliveryRule",
AD_Reference_ID=17,AD_Reference_Value_ID="dd6ca989-f822-5b38-ea47-5420e7ccb16b",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="A",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="53fcb87c-1182-91d9-22d9-f4c329e0aa82",Synchronized="2017-08-05 16:55:07.0")
/** Column name DeliveryRule */
public static final String COLUMNNAME_DeliveryRule = "DeliveryRule";

/** DeliveryViaRule AD_Reference=e0d8ddbc-d567-6f32-8ce6-274924c5926f */
public static final int DELIVERYVIARULE_AD_Reference_ID=152;
/** Set Delivery Via.
@param DeliveryViaRule How the order will be delivered */
public void setDeliveryViaRule (String DeliveryViaRule)
{
if (DeliveryViaRule == null) throw new IllegalArgumentException ("DeliveryViaRule is mandatory");
if (DeliveryViaRule.equals(REF_C_OrderDeliveryViaRule.Pickup) || DeliveryViaRule.equals(REF_C_OrderDeliveryViaRule.Delivery) || DeliveryViaRule.equals(REF_C_OrderDeliveryViaRule.Shipper));
 else throw new IllegalArgumentException ("DeliveryViaRule Invalid value - " + DeliveryViaRule + " - Reference_ID=152 - P - D - S");
if (DeliveryViaRule.length() > 1)
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

@XendraTrl(Identifier="a9926bb5-af0c-3188-1397-9d2f20636b6b")
public static String es_PE_FIELD_Shipment_DeliveryVia_Description="Como será entregada la orden";

@XendraTrl(Identifier="a9926bb5-af0c-3188-1397-9d2f20636b6b")
public static String es_PE_FIELD_Shipment_DeliveryVia_Help="La vía de entrega indica como el producto debería ser entregado. Por Ej. Si la orden será recogida ó embarcada.";

@XendraTrl(Identifier="a9926bb5-af0c-3188-1397-9d2f20636b6b")
public static String es_PE_FIELD_Shipment_DeliveryVia_Name="Vía de Entrega";

@XendraField(AD_Column_ID="DeliveryViaRule",IsCentrallyMaintained=true,
AD_Tab_ID="301afa71-2a4c-179a-1524-e4657d76a205",AD_FieldGroup_ID="Shipment",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=180,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a9926bb5-af0c-3188-1397-9d2f20636b6b")
public static final String FIELDNAME_Shipment_DeliveryVia="a9926bb5-af0c-3188-1397-9d2f20636b6b";

@XendraTrl(Identifier="0b09fbb4-59f4-bb1a-4007-683a10171d58")
public static String es_PE_FIELD_MaterialReceipt_DeliveryVia_Description="Como será entregada la orden";

@XendraTrl(Identifier="0b09fbb4-59f4-bb1a-4007-683a10171d58")
public static String es_PE_FIELD_MaterialReceipt_DeliveryVia_Help="La vía de entrega indica como el producto debería ser entregado. Por Ej. Si la orden será recogida ó embarcada.";

@XendraTrl(Identifier="0b09fbb4-59f4-bb1a-4007-683a10171d58")
public static String es_PE_FIELD_MaterialReceipt_DeliveryVia_Name="Vía de Entrega";

@XendraField(AD_Column_ID="DeliveryViaRule",IsCentrallyMaintained=true,
AD_Tab_ID="e8de4016-9c2c-a316-d3a0-490daa151389",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@MovementType@='C-' ",DisplayLength=14,IsReadOnly=false,SeqNo=150,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="0b09fbb4-59f4-bb1a-4007-683a10171d58")
public static final String FIELDNAME_MaterialReceipt_DeliveryVia="0b09fbb4-59f4-bb1a-4007-683a10171d58";

@XendraTrl(Identifier="b66c643d-1cd4-dbd0-79bd-72d8b52e107c")
public static String es_PE_FIELD_PartnerShipments_DeliveryVia_Description="Como será entregada la orden";

@XendraTrl(Identifier="b66c643d-1cd4-dbd0-79bd-72d8b52e107c")
public static String es_PE_FIELD_PartnerShipments_DeliveryVia_Help="La vía de entrega indica como el producto debería ser entregado. Por Ej. Si la orden será recogida ó embarcada.";

@XendraTrl(Identifier="b66c643d-1cd4-dbd0-79bd-72d8b52e107c")
public static String es_PE_FIELD_PartnerShipments_DeliveryVia_Name="Vía de Entrega";

@XendraField(AD_Column_ID="DeliveryViaRule",IsCentrallyMaintained=true,
AD_Tab_ID="e40e4cfe-ea42-22ef-d7c2-0180fe5eccfe",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b66c643d-1cd4-dbd0-79bd-72d8b52e107c")
public static final String FIELDNAME_PartnerShipments_DeliveryVia="b66c643d-1cd4-dbd0-79bd-72d8b52e107c";

@XendraTrl(Identifier="4a61eb7f-8154-94cd-fcd1-6c4adb06d0de")
public static String es_PE_COLUMN_DeliveryViaRule_Name="Vía de Entrega";

@XendraColumn(AD_Element_ID="47ae2232-6c73-dfb6-aa97-18fb2cc876a7",ColumnName="DeliveryViaRule",
AD_Reference_ID=17,AD_Reference_Value_ID="e0d8ddbc-d567-6f32-8ce6-274924c5926f",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="P",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=true,ColumnSQL="",IsAllowLogging=false,
Identifier="4a61eb7f-8154-94cd-fcd1-6c4adb06d0de",Synchronized="2017-08-05 16:55:07.0")
/** Column name DeliveryViaRule */
public static final String COLUMNNAME_DeliveryViaRule = "DeliveryViaRule";
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

@XendraTrl(Identifier="1ef42f5c-adf1-b755-abc2-b1753a25ac96")
public static String es_PE_FIELD_Shipment_Description_Description="Descripción corta opcional del registro";

@XendraTrl(Identifier="1ef42f5c-adf1-b755-abc2-b1753a25ac96")
public static String es_PE_FIELD_Shipment_Description_Help="Una descripción esta limitada a 255 caracteres";

@XendraTrl(Identifier="1ef42f5c-adf1-b755-abc2-b1753a25ac96")
public static String es_PE_FIELD_Shipment_Description_Name="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="301afa71-2a4c-179a-1524-e4657d76a205",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1ef42f5c-adf1-b755-abc2-b1753a25ac96")
public static final String FIELDNAME_Shipment_Description="1ef42f5c-adf1-b755-abc2-b1753a25ac96";

@XendraTrl(Identifier="914a1b95-72eb-d099-69f7-974c44e38b12")
public static String es_PE_FIELD_MaterialReceipt_Description_Description="Descripción corta opcional del registro";

@XendraTrl(Identifier="914a1b95-72eb-d099-69f7-974c44e38b12")
public static String es_PE_FIELD_MaterialReceipt_Description_Help="Una descripción esta limitada a 255 caracteres";

@XendraTrl(Identifier="914a1b95-72eb-d099-69f7-974c44e38b12")
public static String es_PE_FIELD_MaterialReceipt_Description_Name="Observacion";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="e8de4016-9c2c-a316-d3a0-490daa151389",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="914a1b95-72eb-d099-69f7-974c44e38b12")
public static final String FIELDNAME_MaterialReceipt_Description="914a1b95-72eb-d099-69f7-974c44e38b12";

@XendraTrl(Identifier="a463cd6a-6463-2ef8-6da3-d006d23d5d19")
public static String es_PE_FIELD_PartnerShipments_Description_Description="Observación corta opcional del registro";

@XendraTrl(Identifier="a463cd6a-6463-2ef8-6da3-d006d23d5d19")
public static String es_PE_FIELD_PartnerShipments_Description_Help="Una Observación esta limitada a 255 caracteres";

@XendraTrl(Identifier="a463cd6a-6463-2ef8-6da3-d006d23d5d19")
public static String es_PE_FIELD_PartnerShipments_Description_Name="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="e40e4cfe-ea42-22ef-d7c2-0180fe5eccfe",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a463cd6a-6463-2ef8-6da3-d006d23d5d19")
public static final String FIELDNAME_PartnerShipments_Description="a463cd6a-6463-2ef8-6da3-d006d23d5d19";

@XendraTrl(Identifier="3d56abda-479f-e5fa-ac84-dde1df7684c3")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=true,ColumnSQL="",
IsAllowLogging=false,Identifier="3d56abda-479f-e5fa-ac84-dde1df7684c3",
Synchronized="2017-08-05 16:55:07.0")
/** Column name Description */
public static final String COLUMNNAME_Description = "Description";

/** DocAction AD_Reference=e397c9b0-c643-d1cd-8380-20bee13b2a6e */
public static final int DOCACTION_AD_Reference_ID=135;
/** Set Document Action.
@param DocAction The targeted status of the document */
public void setDocAction (String DocAction)
{
if (DocAction == null) throw new IllegalArgumentException ("DocAction is mandatory");
if (DocAction.equals(REF__DocumentAction.Complete) || DocAction.equals(REF__DocumentAction.Approve) || DocAction.equals(REF__DocumentAction.Reject) || DocAction.equals(REF__DocumentAction.Post) || DocAction.equals(REF__DocumentAction.WaitComplete) || DocAction.equals(REF__DocumentAction.Prepare) || DocAction.equals(REF__DocumentAction.Close) || DocAction.equals(REF__DocumentAction.Placed) || DocAction.equals(REF__DocumentAction.Discount) || DocAction.equals(REF__DocumentAction.Portofolio) || DocAction.equals(REF__DocumentAction.Warranty) || DocAction.equals(REF__DocumentAction.Reverse_Correct) || DocAction.equals(REF__DocumentAction.Reverse_Accrual) || DocAction.equals(REF__DocumentAction.Invalidate) || DocAction.equals(REF__DocumentAction.Re_Activate) || DocAction.equals(REF__DocumentAction.None) || DocAction.equals(REF__DocumentAction.Unlock) || DocAction.equals(REF__DocumentAction.Returned) || DocAction.equals(REF__DocumentAction.Apply) || DocAction.equals(REF__DocumentAction.Collect) || DocAction.equals(REF__DocumentAction.ToCollect) || DocAction.equals(REF__DocumentAction.Restore) || DocAction.equals(REF__DocumentAction.Protested) || DocAction.equals(REF__DocumentAction.Receivables) || DocAction.equals(REF__DocumentAction.Void) || DocAction.equals(REF__DocumentAction.Draft) || DocAction.equals(REF__DocumentAction.InProgress) || DocAction.equals(REF__DocumentAction.WaitingPayment));
 else throw new IllegalArgumentException ("DocAction Invalid value - " + DocAction + " - Reference_ID=135 - CO - AP - RJ - PO - WC - PR - CL - PL - DS - PT - WR - RC - RA - IN - RE - -- - XL - RT - AY - CT - TC - RR - PD - RV - VO - DR - IP - WP");
if (DocAction.length() > 2)
{
log.warning("Length > 2 - truncated");
DocAction = DocAction.substring(0,1);
}
set_Value (COLUMNNAME_DocAction, DocAction);
}
/** Get Document Action.
@return The targeted status of the document */
public String getDocAction() 
{
return (String)get_Value(COLUMNNAME_DocAction);
}

@XendraTrl(Identifier="08a3d4d9-a07c-6b51-8560-3a27ad9a8db1")
public static String es_PE_FIELD_Shipment_ProcessShipment_Description="Procesar Entrega (actualiza el inventario)";

@XendraTrl(Identifier="08a3d4d9-a07c-6b51-8560-3a27ad9a8db1")
public static String es_PE_FIELD_Shipment_ProcessShipment_Help="Procesar Entrega, moverá productos del inventario y marca los ítems como Entregados. ";

@XendraTrl(Identifier="08a3d4d9-a07c-6b51-8560-3a27ad9a8db1")
public static String es_PE_FIELD_Shipment_ProcessShipment_Name="Procesar Entrega";

@XendraField(AD_Column_ID="DocAction",IsCentrallyMaintained=true,
AD_Tab_ID="301afa71-2a4c-179a-1524-e4657d76a205",AD_FieldGroup_ID="Status",IsDisplayed=true,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=380,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="08a3d4d9-a07c-6b51-8560-3a27ad9a8db1")
public static final String FIELDNAME_Shipment_ProcessShipment="08a3d4d9-a07c-6b51-8560-3a27ad9a8db1";

@XendraTrl(Identifier="494158ad-2f2f-7155-d03b-c0b8022fba5c")
public static String es_PE_FIELD_MaterialReceipt_ProcessShipment_Description="Procesar Entrega (actualiza el inventario)";

@XendraTrl(Identifier="494158ad-2f2f-7155-d03b-c0b8022fba5c")
public static String es_PE_FIELD_MaterialReceipt_ProcessShipment_Help="Procesar Entrega, moverá productos del inventario y marca los ítems como Entregados. ";

@XendraTrl(Identifier="494158ad-2f2f-7155-d03b-c0b8022fba5c")
public static String es_PE_FIELD_MaterialReceipt_ProcessShipment_Name="Procesar Entrega";

@XendraField(AD_Column_ID="DocAction",IsCentrallyMaintained=true,
AD_Tab_ID="e8de4016-9c2c-a316-d3a0-490daa151389",AD_FieldGroup_ID="Status",IsDisplayed=true,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=320,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="494158ad-2f2f-7155-d03b-c0b8022fba5c")
public static final String FIELDNAME_MaterialReceipt_ProcessShipment="494158ad-2f2f-7155-d03b-c0b8022fba5c";

@XendraTrl(Identifier="57ef1d13-1286-8b88-008e-bf32a6903ac7")
public static String es_PE_FIELD_PartnerShipments_ProcessShipment_Description="Procesar Entrega (actualiza el inventario)";

@XendraTrl(Identifier="57ef1d13-1286-8b88-008e-bf32a6903ac7")
public static String es_PE_FIELD_PartnerShipments_ProcessShipment_Help="Procesar Entrega, moverá productos del inventario y marca los ítems como Entregados. ";

@XendraTrl(Identifier="57ef1d13-1286-8b88-008e-bf32a6903ac7")
public static String es_PE_FIELD_PartnerShipments_ProcessShipment_Name="Procesar Entrega";

@XendraField(AD_Column_ID="DocAction",IsCentrallyMaintained=true,
AD_Tab_ID="e40e4cfe-ea42-22ef-d7c2-0180fe5eccfe",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="57ef1d13-1286-8b88-008e-bf32a6903ac7")
public static final String FIELDNAME_PartnerShipments_ProcessShipment="57ef1d13-1286-8b88-008e-bf32a6903ac7";

@XendraTrl(Identifier="10f006df-4eb7-2054-6f31-4f1bd674ecb4")
public static String es_PE_COLUMN_DocAction_Name="Acción en el Documento";

@XendraColumn(AD_Element_ID="d4b9075b-18e5-ebbb-5565-d217a7e531cb",ColumnName="DocAction",
AD_Reference_ID=28,AD_Reference_Value_ID="e397c9b0-c643-d1cd-8380-20bee13b2a6e",AD_Val_Rule_ID="",
FieldLength=2,DefaultValue="CO",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=true,
AD_Process_ID="79376d0e-3c12-152d-691b-aea1bef23109",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="10f006df-4eb7-2054-6f31-4f1bd674ecb4",
Synchronized="2017-08-05 16:55:07.0")
/** Column name DocAction */
public static final String COLUMNNAME_DocAction = "DocAction";

/** DocStatus AD_Reference=7627125d-fefe-e6bc-bb7d-4a6c772172dc */
public static final int DOCSTATUS_AD_Reference_ID=131;
/** Set Document Status.
@param DocStatus The current status of the document */
public void setDocStatus (String DocStatus)
{
if (DocStatus == null) throw new IllegalArgumentException ("DocStatus is mandatory");
if (DocStatus.equals(REF__DocumentStatus.InProgress) || DocStatus.equals(REF__DocumentStatus.WaitingConfirmation) || DocStatus.equals(REF__DocumentStatus.Drafted) || DocStatus.equals(REF__DocumentStatus.Completed) || DocStatus.equals(REF__DocumentStatus.Approved) || DocStatus.equals(REF__DocumentStatus.WaitingPayment) || DocStatus.equals(REF__DocumentStatus.Placed) || DocStatus.equals(REF__DocumentStatus.Returned) || DocStatus.equals(REF__DocumentStatus.Discount) || DocStatus.equals(REF__DocumentStatus.Protested) || DocStatus.equals(REF__DocumentStatus.NotApproved) || DocStatus.equals(REF__DocumentStatus.Voided) || DocStatus.equals(REF__DocumentStatus.Invalid) || DocStatus.equals(REF__DocumentStatus.Reversed) || DocStatus.equals(REF__DocumentStatus.Closed) || DocStatus.equals(REF__DocumentStatus.Unknown) || DocStatus.equals(REF__DocumentStatus.Portfolio) || DocStatus.equals(REF__DocumentStatus.Warranty) || DocStatus.equals(REF__DocumentStatus.ToCollect) || DocStatus.equals(REF__DocumentStatus.Collect) || DocStatus.equals(REF__DocumentStatus.Receivables) || DocStatus.equals(REF__DocumentStatus.Apply));
 else throw new IllegalArgumentException ("DocStatus Invalid value - " + DocStatus + " - Reference_ID=131 - IP - WC - DR - CO - AP - WP - PL - RT - DS - PD - NA - VO - IN - RE - CL - ?? - PT - WR - TC - CT - RV - AY");
if (DocStatus.length() > 2)
{
log.warning("Length > 2 - truncated");
DocStatus = DocStatus.substring(0,1);
}
set_Value (COLUMNNAME_DocStatus, DocStatus);
}
/** Get Document Status.
@return The current status of the document */
public String getDocStatus() 
{
return (String)get_Value(COLUMNNAME_DocStatus);
}

@XendraTrl(Identifier="5e4886a6-1d7e-fb57-2e8f-5e0d0ef85a33")
public static String es_PE_FIELD_Shipment_DocumentStatus_Description="El estado actual del documento";

@XendraTrl(Identifier="5e4886a6-1d7e-fb57-2e8f-5e0d0ef85a33")
public static String es_PE_FIELD_Shipment_DocumentStatus_Help="El estado del documento indica el estado del documento en este momento. Si usted quiere cambiar el estado de Documento; use el campo acción de documento";

@XendraTrl(Identifier="5e4886a6-1d7e-fb57-2e8f-5e0d0ef85a33")
public static String es_PE_FIELD_Shipment_DocumentStatus_Name="Estado del Documento";

@XendraField(AD_Column_ID="DocStatus",IsCentrallyMaintained=true,
AD_Tab_ID="301afa71-2a4c-179a-1524-e4657d76a205",AD_FieldGroup_ID="Status",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=370,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5e4886a6-1d7e-fb57-2e8f-5e0d0ef85a33")
public static final String FIELDNAME_Shipment_DocumentStatus="5e4886a6-1d7e-fb57-2e8f-5e0d0ef85a33";

@XendraTrl(Identifier="936cfc92-9f1c-aa50-c5c3-33cb1ea7c0b5")
public static String es_PE_FIELD_MaterialReceipt_DocumentStatus_Description="El estado actual del documento";

@XendraTrl(Identifier="936cfc92-9f1c-aa50-c5c3-33cb1ea7c0b5")
public static String es_PE_FIELD_MaterialReceipt_DocumentStatus_Help="El estado del documento indica el estado del documento en este momento. Si usted quiere cambiar el estado de Documento; use el campo acción de documento";

@XendraTrl(Identifier="936cfc92-9f1c-aa50-c5c3-33cb1ea7c0b5")
public static String es_PE_FIELD_MaterialReceipt_DocumentStatus_Name="Estado del Documento";

@XendraField(AD_Column_ID="DocStatus",IsCentrallyMaintained=true,
AD_Tab_ID="e8de4016-9c2c-a316-d3a0-490daa151389",AD_FieldGroup_ID="Status",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=310,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="936cfc92-9f1c-aa50-c5c3-33cb1ea7c0b5")
public static final String FIELDNAME_MaterialReceipt_DocumentStatus="936cfc92-9f1c-aa50-c5c3-33cb1ea7c0b5";

@XendraTrl(Identifier="09456091-74b9-a76f-fb99-e95770fd316d")
public static String es_PE_FIELD_PartnerShipments_DocumentStatus_Description="El estado actual del documento";

@XendraTrl(Identifier="09456091-74b9-a76f-fb99-e95770fd316d")
public static String es_PE_FIELD_PartnerShipments_DocumentStatus_Help="El estado del documento indica el estado del documento en este momento. Si usted quiere cambiar el estado de Documento; use el campo acción de documento";

@XendraTrl(Identifier="09456091-74b9-a76f-fb99-e95770fd316d")
public static String es_PE_FIELD_PartnerShipments_DocumentStatus_Name="Estado del Documento";

@XendraField(AD_Column_ID="DocStatus",IsCentrallyMaintained=true,
AD_Tab_ID="e40e4cfe-ea42-22ef-d7c2-0180fe5eccfe",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="09456091-74b9-a76f-fb99-e95770fd316d")
public static final String FIELDNAME_PartnerShipments_DocumentStatus="09456091-74b9-a76f-fb99-e95770fd316d";

@XendraTrl(Identifier="6675f3cc-0ab4-7127-5091-04ae6c849861")
public static String es_PE_COLUMN_DocStatus_Name="Estado del Documento";

@XendraColumn(AD_Element_ID="e73fa537-3438-bd01-dfd4-f0f080a28c55",ColumnName="DocStatus",
AD_Reference_ID=17,AD_Reference_Value_ID="7627125d-fefe-e6bc-bb7d-4a6c772172dc",AD_Val_Rule_ID="",
FieldLength=2,DefaultValue="DR",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="6675f3cc-0ab4-7127-5091-04ae6c849861",Synchronized="2017-08-05 16:55:07.0")
/** Column name DocStatus */
public static final String COLUMNNAME_DocStatus = "DocStatus";
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

@XendraTrl(Identifier="1ebb3ec8-dc44-9913-5d37-fe2f38325179")
public static String es_PE_FIELD_Shipment_DocumentNo_Description="Número de secuencia del documento para cada documento";

@XendraTrl(Identifier="1ebb3ec8-dc44-9913-5d37-fe2f38325179")
public static String es_PE_FIELD_Shipment_DocumentNo_Help="El número del documento es usualmente generado en automático por el sistema y determinado por el tipo del documento. Si el documento no se salva; el número preliminar se despliega entre \"<>\"";

@XendraTrl(Identifier="1ebb3ec8-dc44-9913-5d37-fe2f38325179")
public static String es_PE_FIELD_Shipment_DocumentNo_Name="No. del Documento";

@XendraField(AD_Column_ID="DocumentNo",IsCentrallyMaintained=true,
AD_Tab_ID="301afa71-2a4c-179a-1524-e4657d76a205",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=50,SortNo=-1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1ebb3ec8-dc44-9913-5d37-fe2f38325179")
public static final String FIELDNAME_Shipment_DocumentNo="1ebb3ec8-dc44-9913-5d37-fe2f38325179";

@XendraTrl(Identifier="c092a6cb-853c-3587-7dd5-9669d86c49c1")
public static String es_PE_FIELD_MaterialReceipt_DocumentNo_Description="Número de secuencia del documento para cada documento";

@XendraTrl(Identifier="c092a6cb-853c-3587-7dd5-9669d86c49c1")
public static String es_PE_FIELD_MaterialReceipt_DocumentNo_Help="El número del documento es usualmente generado en automático por el sistema y determinado por el tipo del documento. Si el documento no se salva; el número preliminar se despliega entre \"<>\"";

@XendraTrl(Identifier="c092a6cb-853c-3587-7dd5-9669d86c49c1")
public static String es_PE_FIELD_MaterialReceipt_DocumentNo_Name="No. del Documento";

@XendraField(AD_Column_ID="DocumentNo",IsCentrallyMaintained=true,
AD_Tab_ID="e8de4016-9c2c-a316-d3a0-490daa151389",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=50,SortNo=-1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c092a6cb-853c-3587-7dd5-9669d86c49c1")
public static final String FIELDNAME_MaterialReceipt_DocumentNo="c092a6cb-853c-3587-7dd5-9669d86c49c1";

@XendraTrl(Identifier="fcfba1d3-b3aa-5865-5a1f-09489a3c418e")
public static String es_PE_FIELD_PartnerShipments_DocumentNo_Description="Número de secuencia del documento para cada documento";

@XendraTrl(Identifier="fcfba1d3-b3aa-5865-5a1f-09489a3c418e")
public static String es_PE_FIELD_PartnerShipments_DocumentNo_Help="El número del documento es usualmente generado en automático por el sistema y determinado por el tipo del documento. Si el documento no se salva; el número preliminar se despliega entre \"<>\"";

@XendraTrl(Identifier="fcfba1d3-b3aa-5865-5a1f-09489a3c418e")
public static String es_PE_FIELD_PartnerShipments_DocumentNo_Name="No. del Documento";

@XendraField(AD_Column_ID="DocumentNo",IsCentrallyMaintained=true,
AD_Tab_ID="e40e4cfe-ea42-22ef-d7c2-0180fe5eccfe",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=40,SortNo=2,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="fcfba1d3-b3aa-5865-5a1f-09489a3c418e")
public static final String FIELDNAME_PartnerShipments_DocumentNo="fcfba1d3-b3aa-5865-5a1f-09489a3c418e";

@XendraTrl(Identifier="d47bf38a-6466-5918-c1f4-2419ef57003a")
public static String es_PE_COLUMN_DocumentNo_Name="No. del Documento";

@XendraColumn(AD_Element_ID="e3ca6e28-702a-2722-d941-b2072a0de9cb",ColumnName="DocumentNo",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=30,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=true,ColumnSQL="",
IsAllowLogging=false,Identifier="d47bf38a-6466-5918-c1f4-2419ef57003a",
Synchronized="2017-08-05 16:55:08.0")
/** Column name DocumentNo */
public static final String COLUMNNAME_DocumentNo = "DocumentNo";

/** DropShip_BPartner_ID AD_Reference=ed87c3fe-720d-c26d-0166-b5178b65db41 */
public static final int DROPSHIP_BPARTNER_ID_AD_Reference_ID=138;
/** Set DropShip_BPartner_ID.
@param DropShip_BPartner_ID DropShip_BPartner_ID */
public void setDropShip_BPartner_ID (int DropShip_BPartner_ID)
{
if (DropShip_BPartner_ID <= 0) set_Value (COLUMNNAME_DropShip_BPartner_ID, null);
 else 
set_Value (COLUMNNAME_DropShip_BPartner_ID, Integer.valueOf(DropShip_BPartner_ID));
}
/** Get DropShip_BPartner_ID.
@return DropShip_BPartner_ID */
public int getDropShip_BPartner_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_DropShip_BPartner_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="7047510a-c52d-c7de-bc3a-b48217b89378")
public static String es_PE_FIELD_Shipment_DropShip_BPartner_ID_Name="dropship_bpartner_id";

@XendraField(AD_Column_ID="DropShip_BPartner_ID",IsCentrallyMaintained=true,
AD_Tab_ID="301afa71-2a4c-179a-1524-e4657d76a205",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7047510a-c52d-c7de-bc3a-b48217b89378")
public static final String FIELDNAME_Shipment_DropShip_BPartner_ID="7047510a-c52d-c7de-bc3a-b48217b89378";

@XendraTrl(Identifier="3a3b35eb-4b97-274e-9780-2d69499268db")
public static String es_PE_COLUMN_DropShip_BPartner_ID_Name="dropship_bpartner_id";

@XendraColumn(AD_Element_ID="edd42966-36ea-b55e-b7e8-20de61228852",
ColumnName="DropShip_BPartner_ID",AD_Reference_ID=18,
AD_Reference_Value_ID="ed87c3fe-720d-c26d-0166-b5178b65db41",AD_Val_Rule_ID="",FieldLength=10,
DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,
ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",
ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,
ColumnSQL="",IsAllowLogging=false,Identifier="3a3b35eb-4b97-274e-9780-2d69499268db",
Synchronized="2017-08-05 16:55:08.0")
/** Column name DropShip_BPartner_ID */
public static final String COLUMNNAME_DropShip_BPartner_ID = "DropShip_BPartner_ID";

/** DropShip_Location_ID AD_Reference=8d01ccac-6606-99a5-ebc2-5a6e01980b37 */
public static final int DROPSHIP_LOCATION_ID_AD_Reference_ID=159;
/** Set DropShip_Location_ID.
@param DropShip_Location_ID DropShip_Location_ID */
public void setDropShip_Location_ID (int DropShip_Location_ID)
{
if (DropShip_Location_ID <= 0) set_Value (COLUMNNAME_DropShip_Location_ID, null);
 else 
set_Value (COLUMNNAME_DropShip_Location_ID, Integer.valueOf(DropShip_Location_ID));
}
/** Get DropShip_Location_ID.
@return DropShip_Location_ID */
public int getDropShip_Location_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_DropShip_Location_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="d8c1ea73-0631-bd75-5a1f-a4e230ba9aee")
public static String es_PE_FIELD_Shipment_DropShip_Location_ID_Name="dropship_location_id";

@XendraField(AD_Column_ID="DropShip_Location_ID",IsCentrallyMaintained=true,
AD_Tab_ID="301afa71-2a4c-179a-1524-e4657d76a205",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d8c1ea73-0631-bd75-5a1f-a4e230ba9aee")
public static final String FIELDNAME_Shipment_DropShip_Location_ID="d8c1ea73-0631-bd75-5a1f-a4e230ba9aee";

@XendraTrl(Identifier="861d3e7e-cbb5-cf95-dcd7-15a658b65d8c")
public static String es_PE_COLUMN_DropShip_Location_ID_Name="dropship_location_id";

@XendraColumn(AD_Element_ID="fe09ceec-0c03-5673-c459-9e0f706ad1b8",
ColumnName="DropShip_Location_ID",AD_Reference_ID=18,
AD_Reference_Value_ID="8d01ccac-6606-99a5-ebc2-5a6e01980b37",AD_Val_Rule_ID="",FieldLength=10,
DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,
ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",
ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,
ColumnSQL="",IsAllowLogging=false,Identifier="861d3e7e-cbb5-cf95-dcd7-15a658b65d8c",
Synchronized="2017-08-05 16:55:08.0")
/** Column name DropShip_Location_ID */
public static final String COLUMNNAME_DropShip_Location_ID = "DropShip_Location_ID";

/** DropShip_User_ID AD_Reference=606fce88-e8f3-4df6-0617-746fb6a85b2b */
public static final int DROPSHIP_USER_ID_AD_Reference_ID=110;
/** Set DropShip_User_ID.
@param DropShip_User_ID DropShip_User_ID */
public void setDropShip_User_ID (int DropShip_User_ID)
{
if (DropShip_User_ID <= 0) set_Value (COLUMNNAME_DropShip_User_ID, null);
 else 
set_Value (COLUMNNAME_DropShip_User_ID, Integer.valueOf(DropShip_User_ID));
}
/** Get DropShip_User_ID.
@return DropShip_User_ID */
public int getDropShip_User_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_DropShip_User_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="17a080bc-a7fd-2442-9949-04ac0bdda6ac")
public static String es_PE_FIELD_Shipment_DropShip_User_ID_Name="dropship_user_id";

@XendraField(AD_Column_ID="DropShip_User_ID",IsCentrallyMaintained=true,
AD_Tab_ID="301afa71-2a4c-179a-1524-e4657d76a205",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="17a080bc-a7fd-2442-9949-04ac0bdda6ac")
public static final String FIELDNAME_Shipment_DropShip_User_ID="17a080bc-a7fd-2442-9949-04ac0bdda6ac";

@XendraTrl(Identifier="10efda98-75ef-c605-2cb3-1b67850ae663")
public static String es_PE_COLUMN_DropShip_User_ID_Name="dropship_user_id";

@XendraColumn(AD_Element_ID="6668bd43-4776-af2e-dc93-f47077c66f43",ColumnName="DropShip_User_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="606fce88-e8f3-4df6-0617-746fb6a85b2b",AD_Val_Rule_ID="",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="10efda98-75ef-c605-2cb3-1b67850ae663",Synchronized="2017-08-05 16:55:08.0")
/** Column name DropShip_User_ID */
public static final String COLUMNNAME_DropShip_User_ID = "DropShip_User_ID";
/** Set Accounting Fact ID (per document).
@param Fact_ID This ID is guaranteed to be unique per client per year per document (in the fact table). */
public void setFact_ID (String Fact_ID)
{
if (Fact_ID != null && Fact_ID.length() > 20)
{
log.warning("Length > 20 - truncated");
Fact_ID = Fact_ID.substring(0,19);
}
set_ValueNoCheck (COLUMNNAME_Fact_ID, Fact_ID);
}
/** Get Accounting Fact ID (per document).
@return This ID is guaranteed to be unique per client per year per document (in the fact table). */
public String getFact_ID() 
{
String value = (String)get_Value(COLUMNNAME_Fact_ID);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="b577bd23-e06d-55ea-a00e-b9de699b1cd1")
public static String es_PE_FIELD_Shipment_AccountingFactIDPerDocument_Description="Se garantiza que este ID sea unico por cada cliente/ano/documento (en la tabla de asientos).";

@XendraTrl(Identifier="b577bd23-e06d-55ea-a00e-b9de699b1cd1")
public static String es_PE_FIELD_Shipment_AccountingFactIDPerDocument_Name="ID Asiento Contable (por documento)";

@XendraField(AD_Column_ID="Fact_ID",IsCentrallyMaintained=true,
AD_Tab_ID="301afa71-2a4c-179a-1524-e4657d76a205",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b577bd23-e06d-55ea-a00e-b9de699b1cd1")
public static final String FIELDNAME_Shipment_AccountingFactIDPerDocument="b577bd23-e06d-55ea-a00e-b9de699b1cd1";

@XendraTrl(Identifier="3ae340cf-f3df-d3f6-62a1-c633871353f3")
public static String es_PE_COLUMN_Fact_ID_Name="ID Asiento Contable (por documento)";

@XendraColumn(AD_Element_ID="20f6c8ee-0151-735b-7a03-2006e09d8eb0",ColumnName="Fact_ID",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=20,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3ae340cf-f3df-d3f6-62a1-c633871353f3",
Synchronized="2017-08-05 16:55:08.0")
/** Column name Fact_ID */
public static final String COLUMNNAME_Fact_ID = "Fact_ID";
/** Set Freight Amount.
@param FreightAmt Freight Amount  */
public void setFreightAmt (BigDecimal FreightAmt)
{
set_Value (COLUMNNAME_FreightAmt, FreightAmt);
}
/** Get Freight Amount.
@return Freight Amount  */
public BigDecimal getFreightAmt() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_FreightAmt);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="d96b5e90-aeb8-4325-0ab9-7da2852c289f")
public static String es_PE_FIELD_Shipment_FreightAmount_Description="Total de la entrega";

@XendraTrl(Identifier="d96b5e90-aeb8-4325-0ab9-7da2852c289f")
public static String es_PE_FIELD_Shipment_FreightAmount_Help="El Total del Flete indica el total cargado por flete en la moneda del documento";

@XendraTrl(Identifier="d96b5e90-aeb8-4325-0ab9-7da2852c289f")
public static String es_PE_FIELD_Shipment_FreightAmount_Name="Total de Flete";

@XendraField(AD_Column_ID="FreightAmt",IsCentrallyMaintained=true,
AD_Tab_ID="301afa71-2a4c-179a-1524-e4657d76a205",AD_FieldGroup_ID="Shipment",IsDisplayed=true,
DisplayLogic="@FreightCostRule@='F'",DisplayLength=26,IsReadOnly=false,SeqNo=250,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="d96b5e90-aeb8-4325-0ab9-7da2852c289f")
public static final String FIELDNAME_Shipment_FreightAmount="d96b5e90-aeb8-4325-0ab9-7da2852c289f";

@XendraTrl(Identifier="c9cf3d1f-f043-6163-6d01-9d853002a73b")
public static String es_PE_FIELD_MaterialReceipt_FreightAmount_Description="Total de la entrega";

@XendraTrl(Identifier="c9cf3d1f-f043-6163-6d01-9d853002a73b")
public static String es_PE_FIELD_MaterialReceipt_FreightAmount_Help="El Total del Flete indica el total cargado por flete en la moneda del documento";

@XendraTrl(Identifier="c9cf3d1f-f043-6163-6d01-9d853002a73b")
public static String es_PE_FIELD_MaterialReceipt_FreightAmount_Name="Total de Flete";

@XendraField(AD_Column_ID="FreightAmt",IsCentrallyMaintained=true,
AD_Tab_ID="e8de4016-9c2c-a316-d3a0-490daa151389",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@FreightCostRule@='F'",DisplayLength=26,IsReadOnly=false,SeqNo=190,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="c9cf3d1f-f043-6163-6d01-9d853002a73b")
public static final String FIELDNAME_MaterialReceipt_FreightAmount="c9cf3d1f-f043-6163-6d01-9d853002a73b";

@XendraTrl(Identifier="6ecbc63d-4fc9-505e-212d-4681bf040678")
public static String es_PE_FIELD_PartnerShipments_FreightAmount_Description="Total de la entrega";

@XendraTrl(Identifier="6ecbc63d-4fc9-505e-212d-4681bf040678")
public static String es_PE_FIELD_PartnerShipments_FreightAmount_Help="El Total del Flete indica el total cargado por flete en la moneda del documento";

@XendraTrl(Identifier="6ecbc63d-4fc9-505e-212d-4681bf040678")
public static String es_PE_FIELD_PartnerShipments_FreightAmount_Name="Total de Flete";

@XendraField(AD_Column_ID="FreightAmt",IsCentrallyMaintained=true,
AD_Tab_ID="e40e4cfe-ea42-22ef-d7c2-0180fe5eccfe",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6ecbc63d-4fc9-505e-212d-4681bf040678")
public static final String FIELDNAME_PartnerShipments_FreightAmount="6ecbc63d-4fc9-505e-212d-4681bf040678";

@XendraTrl(Identifier="169a583d-a661-757a-cf73-5465e2b1bf0d")
public static String es_PE_COLUMN_FreightAmt_Name="Total de Flete";

@XendraColumn(AD_Element_ID="b2162c75-bbbe-b49a-7ffe-6020ce78c453",ColumnName="FreightAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="169a583d-a661-757a-cf73-5465e2b1bf0d",
Synchronized="2017-08-05 16:55:08.0")
/** Column name FreightAmt */
public static final String COLUMNNAME_FreightAmt = "FreightAmt";

/** FreightCostRule AD_Reference=991b4512-0e0d-3494-3835-cc8ecaf3ab12 */
public static final int FREIGHTCOSTRULE_AD_Reference_ID=153;
/** Set Freight Cost Rule.
@param FreightCostRule Method for charging Freight */
public void setFreightCostRule (String FreightCostRule)
{
if (FreightCostRule == null) throw new IllegalArgumentException ("FreightCostRule is mandatory");
if (FreightCostRule.equals(REF_C_OrderFreightCostRule.FreightIncluded) || FreightCostRule.equals(REF_C_OrderFreightCostRule.FixPrice) || FreightCostRule.equals(REF_C_OrderFreightCostRule.Calculated) || FreightCostRule.equals(REF_C_OrderFreightCostRule.Line));
 else throw new IllegalArgumentException ("FreightCostRule Invalid value - " + FreightCostRule + " - Reference_ID=153 - I - F - C - L");
if (FreightCostRule.length() > 1)
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

@XendraTrl(Identifier="8471f9a1-33ab-fbe6-dcac-76aa6fde4943")
public static String es_PE_FIELD_Shipment_FreightCostRule_Description="Método para cargar el flete";

@XendraTrl(Identifier="8471f9a1-33ab-fbe6-dcac-76aa6fde4943")
public static String es_PE_FIELD_Shipment_FreightCostRule_Help="La regla de costo de flete indica el método usado para cargar los fletes.";

@XendraTrl(Identifier="8471f9a1-33ab-fbe6-dcac-76aa6fde4943")
public static String es_PE_FIELD_Shipment_FreightCostRule_Name="Regla de Costo de Flete";

@XendraField(AD_Column_ID="FreightCostRule",IsCentrallyMaintained=true,
AD_Tab_ID="301afa71-2a4c-179a-1524-e4657d76a205",AD_FieldGroup_ID="Shipment",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8471f9a1-33ab-fbe6-dcac-76aa6fde4943")
public static final String FIELDNAME_Shipment_FreightCostRule="8471f9a1-33ab-fbe6-dcac-76aa6fde4943";

@XendraTrl(Identifier="6c1aebff-b18c-9dc6-3b9f-ea3b39fae24b")
public static String es_PE_FIELD_MaterialReceipt_FreightCostRule_Description="Método para cargar el flete";

@XendraTrl(Identifier="6c1aebff-b18c-9dc6-3b9f-ea3b39fae24b")
public static String es_PE_FIELD_MaterialReceipt_FreightCostRule_Help="La regla de costo de flete indica el método usado para cargar los fletes.";

@XendraTrl(Identifier="6c1aebff-b18c-9dc6-3b9f-ea3b39fae24b")
public static String es_PE_FIELD_MaterialReceipt_FreightCostRule_Name="Regla de Costo de Flete";

@XendraField(AD_Column_ID="FreightCostRule",IsCentrallyMaintained=true,
AD_Tab_ID="e8de4016-9c2c-a316-d3a0-490daa151389",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6c1aebff-b18c-9dc6-3b9f-ea3b39fae24b")
public static final String FIELDNAME_MaterialReceipt_FreightCostRule="6c1aebff-b18c-9dc6-3b9f-ea3b39fae24b";

@XendraTrl(Identifier="b8dc3639-f1a4-8ab2-29b8-d48da6255240")
public static String es_PE_FIELD_PartnerShipments_FreightCostRule_Description="Método para cargar el flete";

@XendraTrl(Identifier="b8dc3639-f1a4-8ab2-29b8-d48da6255240")
public static String es_PE_FIELD_PartnerShipments_FreightCostRule_Help="La regla de costo de flete indica el método usado para cargar los fletes.";

@XendraTrl(Identifier="b8dc3639-f1a4-8ab2-29b8-d48da6255240")
public static String es_PE_FIELD_PartnerShipments_FreightCostRule_Name="Regla de Costo de Flete";

@XendraField(AD_Column_ID="FreightCostRule",IsCentrallyMaintained=true,
AD_Tab_ID="e40e4cfe-ea42-22ef-d7c2-0180fe5eccfe",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b8dc3639-f1a4-8ab2-29b8-d48da6255240")
public static final String FIELDNAME_PartnerShipments_FreightCostRule="b8dc3639-f1a4-8ab2-29b8-d48da6255240";

@XendraTrl(Identifier="a64ae015-a2cb-2584-4255-7fc732d3b279")
public static String es_PE_COLUMN_FreightCostRule_Name="Regla de Costo de Flete";

@XendraColumn(AD_Element_ID="b5da4c11-198a-5ff2-38f2-d0d7dbad053e",ColumnName="FreightCostRule",
AD_Reference_ID=17,AD_Reference_Value_ID="991b4512-0e0d-3494-3835-cc8ecaf3ab12",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="I",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="a64ae015-a2cb-2584-4255-7fc732d3b279",Synchronized="2017-08-05 16:55:08.0")
/** Column name FreightCostRule */
public static final String COLUMNNAME_FreightCostRule = "FreightCostRule";
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

@XendraTrl(Identifier="6b2c54ee-cd59-b556-4dce-77a557253b45")
public static String es_PE_FIELD_Shipment_GenerateTo_Description="Crear y procesar la factura desde este recibo. El recibo debe esta correcto y completo";

@XendraTrl(Identifier="6b2c54ee-cd59-b556-4dce-77a557253b45")
public static String es_PE_FIELD_Shipment_GenerateTo_Name="Generar Facturas desde Recibos";

@XendraField(AD_Column_ID="GenerateTo",IsCentrallyMaintained=true,
AD_Tab_ID="301afa71-2a4c-179a-1524-e4657d76a205",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=430,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6b2c54ee-cd59-b556-4dce-77a557253b45")
public static final String FIELDNAME_Shipment_GenerateTo="6b2c54ee-cd59-b556-4dce-77a557253b45";

@XendraTrl(Identifier="04fd0902-0559-a1b0-bdde-1542ffda733a")
public static String es_PE_FIELD_MaterialReceipt_GenerateTo_Description="Crear y procesar la factura desde este recibo. El recibo debe esta correcto y completo";

@XendraTrl(Identifier="04fd0902-0559-a1b0-bdde-1542ffda733a")
public static String es_PE_FIELD_MaterialReceipt_GenerateTo_Name="Generar Facturas desde Recibos";

@XendraField(AD_Column_ID="GenerateTo",IsCentrallyMaintained=true,
AD_Tab_ID="e8de4016-9c2c-a316-d3a0-490daa151389",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=230,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="04fd0902-0559-a1b0-bdde-1542ffda733a")
public static final String FIELDNAME_MaterialReceipt_GenerateTo="04fd0902-0559-a1b0-bdde-1542ffda733a";

@XendraTrl(Identifier="340067b4-5f96-5b42-94b4-ee1e4ca068e2")
public static String es_PE_FIELD_PartnerShipments_GenerateTo_Description="Crear y procesar la factura desde este recibo. El recibo debe esta correcto y completo";

@XendraTrl(Identifier="340067b4-5f96-5b42-94b4-ee1e4ca068e2")
public static String es_PE_FIELD_PartnerShipments_GenerateTo_Name="Generar Facturas desde Recibos";

@XendraField(AD_Column_ID="GenerateTo",IsCentrallyMaintained=true,
AD_Tab_ID="e40e4cfe-ea42-22ef-d7c2-0180fe5eccfe",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="340067b4-5f96-5b42-94b4-ee1e4ca068e2")
public static final String FIELDNAME_PartnerShipments_GenerateTo="340067b4-5f96-5b42-94b4-ee1e4ca068e2";

@XendraTrl(Identifier="069e318b-906f-bb47-fbdc-3b288ff2d6ce")
public static String es_PE_COLUMN_GenerateTo_Name="Generar A";

@XendraColumn(AD_Element_ID="f8860663-2a02-cf9f-e651-8fe92ff99c35",ColumnName="GenerateTo",
AD_Reference_ID=28,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="403b5cc2-2545-583f-21e6-702f0eac1b53",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="069e318b-906f-bb47-fbdc-3b288ff2d6ce",Synchronized="2017-08-05 16:55:08.0")
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
@XendraTrl(Identifier="1bd7e36d-7fde-4e3c-85c0-3f3a21ad3d1c")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="1bd7e36d-7fde-4e3c-85c0-3f3a21ad3d1c",
Synchronized="2017-08-05 16:55:08.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Approved.
@param IsApproved Indicates if this document requires approval */
public void setIsApproved (boolean IsApproved)
{
set_Value (COLUMNNAME_IsApproved, Boolean.valueOf(IsApproved));
}
/** Get Approved.
@return Indicates if this document requires approval */
public boolean isApproved() 
{
Object oo = get_Value(COLUMNNAME_IsApproved);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="9254f3d7-e63f-98d5-12d4-f33bd27c2afd")
public static String es_PE_FIELD_Shipment_Approved_Description="Indica si este documento requiere aprobación";

@XendraTrl(Identifier="9254f3d7-e63f-98d5-12d4-f33bd27c2afd")
public static String es_PE_FIELD_Shipment_Approved_Help="El Cuadro de Verificación  Aprobado indica si este documento requiere aprobación antes de que pueda ser procesado";

@XendraTrl(Identifier="9254f3d7-e63f-98d5-12d4-f33bd27c2afd")
public static String es_PE_FIELD_Shipment_Approved_Name="Aprobación";

@XendraField(AD_Column_ID="IsApproved",IsCentrallyMaintained=true,
AD_Tab_ID="301afa71-2a4c-179a-1524-e4657d76a205",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9254f3d7-e63f-98d5-12d4-f33bd27c2afd")
public static final String FIELDNAME_Shipment_Approved="9254f3d7-e63f-98d5-12d4-f33bd27c2afd";

@XendraTrl(Identifier="2c1f155f-ee14-d7e0-d695-7011b2d4b492")
public static String es_PE_FIELD_MaterialReceipt_Approved_Description="Indica si este documento requiere aprobación";

@XendraTrl(Identifier="2c1f155f-ee14-d7e0-d695-7011b2d4b492")
public static String es_PE_FIELD_MaterialReceipt_Approved_Help="El Cuadro de Verificación  Aprobado indica si este documento requiere aprobación antes de que pueda ser procesado";

@XendraTrl(Identifier="2c1f155f-ee14-d7e0-d695-7011b2d4b492")
public static String es_PE_FIELD_MaterialReceipt_Approved_Name="Aprobación";

@XendraField(AD_Column_ID="IsApproved",IsCentrallyMaintained=true,
AD_Tab_ID="e8de4016-9c2c-a316-d3a0-490daa151389",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2c1f155f-ee14-d7e0-d695-7011b2d4b492")
public static final String FIELDNAME_MaterialReceipt_Approved="2c1f155f-ee14-d7e0-d695-7011b2d4b492";

@XendraTrl(Identifier="c8638ef5-b109-9ce4-0a54-1c987abe1d04")
public static String es_PE_FIELD_PartnerShipments_Approved_Description="Indica si este documento requiere aprobación";

@XendraTrl(Identifier="c8638ef5-b109-9ce4-0a54-1c987abe1d04")
public static String es_PE_FIELD_PartnerShipments_Approved_Help="El Cuadro de Verificación  Aprobado indica si este documento requiere aprobación antes de que pueda ser procesado";

@XendraTrl(Identifier="c8638ef5-b109-9ce4-0a54-1c987abe1d04")
public static String es_PE_FIELD_PartnerShipments_Approved_Name="Aprobación";

@XendraField(AD_Column_ID="IsApproved",IsCentrallyMaintained=true,
AD_Tab_ID="e40e4cfe-ea42-22ef-d7c2-0180fe5eccfe",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c8638ef5-b109-9ce4-0a54-1c987abe1d04")
public static final String FIELDNAME_PartnerShipments_Approved="c8638ef5-b109-9ce4-0a54-1c987abe1d04";

@XendraTrl(Identifier="fec2504e-6410-c160-14c2-d18839e891ce")
public static String es_PE_COLUMN_IsApproved_Name="Aprobación";

@XendraColumn(AD_Element_ID="44388d99-07b7-b005-9e16-78884800beff",ColumnName="IsApproved",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="fec2504e-6410-c160-14c2-d18839e891ce",
Synchronized="2017-08-05 16:55:08.0")
/** Column name IsApproved */
public static final String COLUMNNAME_IsApproved = "IsApproved";
/** Set IsCosted.
@param IsCosted IsCosted */
public void setIsCosted (boolean IsCosted)
{
set_Value (COLUMNNAME_IsCosted, Boolean.valueOf(IsCosted));
}
/** Get IsCosted.
@return IsCosted */
public boolean isCosted() 
{
Object oo = get_Value(COLUMNNAME_IsCosted);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="fc724561-7ecf-43bb-8dd5-7e938b197bde")
public static String es_PE_COLUMN_IsCosted_Name="IsCosted";

@XendraColumn(AD_Element_ID="1d2cca33-7933-6933-e8cd-036ca4cb806e",ColumnName="IsCosted",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="fc724561-7ecf-43bb-8dd5-7e938b197bde",
Synchronized="2015-08-11 20:38:42.0")
/** Column name IsCosted */
public static final String COLUMNNAME_IsCosted = "IsCosted";
/** Set Drop Shipment.
@param IsDropShip Drop Shipments are sent from the Vendor directly to the Customer */
public void setIsDropShip (boolean IsDropShip)
{
set_Value (COLUMNNAME_IsDropShip, Boolean.valueOf(IsDropShip));
}
/** Get Drop Shipment.
@return Drop Shipments are sent from the Vendor directly to the Customer */
public boolean isDropShip() 
{
Object oo = get_Value(COLUMNNAME_IsDropShip);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="a4df38f1-4b96-e1fb-1a17-0432e150215f")
public static String es_PE_FIELD_Shipment_DropShipment_Description="Los envíos de la nota se envían del vendedor directamente al cliente";

@XendraTrl(Identifier="a4df38f1-4b96-e1fb-1a17-0432e150215f")
public static String es_PE_FIELD_Shipment_DropShipment_Help="Los envíos de la nota no causan ningunas reservaciones ó movimientos del inventario mientras que el envío es del inventario del vendedor. El envío del vendedor al cliente debe ser confirmado.";

@XendraTrl(Identifier="a4df38f1-4b96-e1fb-1a17-0432e150215f")
public static String es_PE_FIELD_Shipment_DropShipment_Name="Entrega Directa";

@XendraField(AD_Column_ID="IsDropShip",IsCentrallyMaintained=true,
AD_Tab_ID="301afa71-2a4c-179a-1524-e4657d76a205",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=420,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a4df38f1-4b96-e1fb-1a17-0432e150215f")
public static final String FIELDNAME_Shipment_DropShipment="a4df38f1-4b96-e1fb-1a17-0432e150215f";

@XendraTrl(Identifier="51453c4c-8a37-cd59-5ae1-b89440b1ed86")
public static String es_PE_COLUMN_IsDropShip_Name="Entrega Directa";

@XendraColumn(AD_Element_ID="9169ec42-d87e-a73e-8ef5-81b97661ffb5",ColumnName="IsDropShip",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="51453c4c-8a37-cd59-5ae1-b89440b1ed86",
Synchronized="2017-08-05 16:55:08.0")
/** Column name IsDropShip */
public static final String COLUMNNAME_IsDropShip = "IsDropShip";
/** Set In Dispute.
@param IsInDispute Document is in dispute */
public void setIsInDispute (boolean IsInDispute)
{
set_Value (COLUMNNAME_IsInDispute, Boolean.valueOf(IsInDispute));
}
/** Get In Dispute.
@return Document is in dispute */
public boolean isInDispute() 
{
Object oo = get_Value(COLUMNNAME_IsInDispute);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="30f1433a-d2ea-826c-c946-ec24804d8e22")
public static String es_PE_FIELD_Shipment_InDispute_Description="Documento en negociación";

@XendraTrl(Identifier="30f1433a-d2ea-826c-c946-ec24804d8e22")
public static String es_PE_FIELD_Shipment_InDispute_Help="Documento en negociación";

@XendraTrl(Identifier="30f1433a-d2ea-826c-c946-ec24804d8e22")
public static String es_PE_FIELD_Shipment_InDispute_Name="En Negociación";

@XendraField(AD_Column_ID="IsInDispute",IsCentrallyMaintained=true,
AD_Tab_ID="301afa71-2a4c-179a-1524-e4657d76a205",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=390,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="30f1433a-d2ea-826c-c946-ec24804d8e22")
public static final String FIELDNAME_Shipment_InDispute="30f1433a-d2ea-826c-c946-ec24804d8e22";

@XendraTrl(Identifier="454446b0-246e-dcd8-391d-e38a6bc392d4")
public static String es_PE_FIELD_MaterialReceipt_InDispute_Description="Documento en negociación";

@XendraTrl(Identifier="454446b0-246e-dcd8-391d-e38a6bc392d4")
public static String es_PE_FIELD_MaterialReceipt_InDispute_Help="Documento en negociación";

@XendraTrl(Identifier="454446b0-246e-dcd8-391d-e38a6bc392d4")
public static String es_PE_FIELD_MaterialReceipt_InDispute_Name="En Negociación";

@XendraField(AD_Column_ID="IsInDispute",IsCentrallyMaintained=true,
AD_Tab_ID="e8de4016-9c2c-a316-d3a0-490daa151389",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=330,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="454446b0-246e-dcd8-391d-e38a6bc392d4")
public static final String FIELDNAME_MaterialReceipt_InDispute="454446b0-246e-dcd8-391d-e38a6bc392d4";

@XendraTrl(Identifier="beaee75c-7de2-a8fb-cb74-02a9a3ec9ed6")
public static String es_PE_FIELD_PartnerShipments_InDispute_Description="Documento en negociación";

@XendraTrl(Identifier="beaee75c-7de2-a8fb-cb74-02a9a3ec9ed6")
public static String es_PE_FIELD_PartnerShipments_InDispute_Help="Documento en negociación";

@XendraTrl(Identifier="beaee75c-7de2-a8fb-cb74-02a9a3ec9ed6")
public static String es_PE_FIELD_PartnerShipments_InDispute_Name="En Negociación";

@XendraField(AD_Column_ID="IsInDispute",IsCentrallyMaintained=true,
AD_Tab_ID="e40e4cfe-ea42-22ef-d7c2-0180fe5eccfe",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="beaee75c-7de2-a8fb-cb74-02a9a3ec9ed6")
public static final String FIELDNAME_PartnerShipments_InDispute="beaee75c-7de2-a8fb-cb74-02a9a3ec9ed6";

@XendraTrl(Identifier="33ad8246-2a31-c7a5-efc0-eb56491270d0")
public static String es_PE_COLUMN_IsInDispute_Name="En Negociación";

@XendraColumn(AD_Element_ID="4d75c777-0a61-61e6-1a19-413ad176740e",ColumnName="IsInDispute",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=true,ColumnSQL="",
IsAllowLogging=false,Identifier="33ad8246-2a31-c7a5-efc0-eb56491270d0",
Synchronized="2017-08-05 16:55:08.0")
/** Column name IsInDispute */
public static final String COLUMNNAME_IsInDispute = "IsInDispute";
/** Set In Transit.
@param IsInTransit Movement is in transit */
public void setIsInTransit (boolean IsInTransit)
{
set_Value (COLUMNNAME_IsInTransit, Boolean.valueOf(IsInTransit));
}
/** Get In Transit.
@return Movement is in transit */
public boolean isInTransit() 
{
Object oo = get_Value(COLUMNNAME_IsInTransit);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="7dda4ae2-7b67-aa7a-4a43-9a87355cff03")
public static String es_PE_FIELD_Shipment_InTransit_Description="El Movimiento está en transito";

@XendraTrl(Identifier="7dda4ae2-7b67-aa7a-4a43-9a87355cff03")
public static String es_PE_FIELD_Shipment_InTransit_Help="El movimiento de material está en tránsito - enviado, pero no recibido.";

@XendraTrl(Identifier="7dda4ae2-7b67-aa7a-4a43-9a87355cff03")
public static String es_PE_FIELD_Shipment_InTransit_Name="En Transito";

@XendraField(AD_Column_ID="IsInTransit",IsCentrallyMaintained=true,
AD_Tab_ID="301afa71-2a4c-179a-1524-e4657d76a205",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=true,SeqNo=360,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7dda4ae2-7b67-aa7a-4a43-9a87355cff03")
public static final String FIELDNAME_Shipment_InTransit="7dda4ae2-7b67-aa7a-4a43-9a87355cff03";

@XendraTrl(Identifier="514b517c-a640-0e37-66fd-41d10f1757b9")
public static String es_PE_FIELD_MaterialReceipt_InTransit_Description="El Movimiento está en transito";

@XendraTrl(Identifier="514b517c-a640-0e37-66fd-41d10f1757b9")
public static String es_PE_FIELD_MaterialReceipt_InTransit_Help="El movimiento de material está en tránsito - enviado, pero no recibido.";

@XendraTrl(Identifier="514b517c-a640-0e37-66fd-41d10f1757b9")
public static String es_PE_FIELD_MaterialReceipt_InTransit_Name="En Transito";

@XendraField(AD_Column_ID="IsInTransit",IsCentrallyMaintained=true,
AD_Tab_ID="e8de4016-9c2c-a316-d3a0-490daa151389",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=true,SeqNo=300,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="514b517c-a640-0e37-66fd-41d10f1757b9")
public static final String FIELDNAME_MaterialReceipt_InTransit="514b517c-a640-0e37-66fd-41d10f1757b9";

@XendraTrl(Identifier="58a5f715-8c53-e5a1-a5da-49efc2495ee4")
public static String es_PE_FIELD_PartnerShipments_InTransit_Description="El Movimiento está en transito";

@XendraTrl(Identifier="58a5f715-8c53-e5a1-a5da-49efc2495ee4")
public static String es_PE_FIELD_PartnerShipments_InTransit_Help="El movimiento de material está en tránsito - enviado, pero no recibido.";

@XendraTrl(Identifier="58a5f715-8c53-e5a1-a5da-49efc2495ee4")
public static String es_PE_FIELD_PartnerShipments_InTransit_Name="En Transito";

@XendraField(AD_Column_ID="IsInTransit",IsCentrallyMaintained=true,
AD_Tab_ID="e40e4cfe-ea42-22ef-d7c2-0180fe5eccfe",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="58a5f715-8c53-e5a1-a5da-49efc2495ee4")
public static final String FIELDNAME_PartnerShipments_InTransit="58a5f715-8c53-e5a1-a5da-49efc2495ee4";

@XendraTrl(Identifier="22addef0-c57c-ab5b-f916-6e5df2646ffe")
public static String es_PE_COLUMN_IsInTransit_Name="En Transito";

@XendraColumn(AD_Element_ID="763c0703-d1fd-4d3b-1507-82f4ab57d51c",ColumnName="IsInTransit",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="22addef0-c57c-ab5b-f916-6e5df2646ffe",
Synchronized="2017-08-05 16:55:08.0")
/** Column name IsInTransit */
public static final String COLUMNNAME_IsInTransit = "IsInTransit";
/** Set Printed.
@param IsPrinted Indicates if this document / line is printed */
public void setIsPrinted (boolean IsPrinted)
{
set_Value (COLUMNNAME_IsPrinted, Boolean.valueOf(IsPrinted));
}
/** Get Printed.
@return Indicates if this document / line is printed */
public boolean isPrinted() 
{
Object oo = get_Value(COLUMNNAME_IsPrinted);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="c9d91543-684f-5e7f-68f9-a0d1cbaaac0f")
public static String es_PE_FIELD_Shipment_Printed_Description="Indica si este documento es impreso.";

@XendraTrl(Identifier="c9d91543-684f-5e7f-68f9-a0d1cbaaac0f")
public static String es_PE_FIELD_Shipment_Printed_Help="El cuadro de verificación impreso indica si este documento se imprimirá.";

@XendraTrl(Identifier="c9d91543-684f-5e7f-68f9-a0d1cbaaac0f")
public static String es_PE_FIELD_Shipment_Printed_Name="Impreso";

@XendraField(AD_Column_ID="IsPrinted",IsCentrallyMaintained=true,
AD_Tab_ID="301afa71-2a4c-179a-1524-e4657d76a205",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c9d91543-684f-5e7f-68f9-a0d1cbaaac0f")
public static final String FIELDNAME_Shipment_Printed="c9d91543-684f-5e7f-68f9-a0d1cbaaac0f";

@XendraTrl(Identifier="a882043b-e700-b2f0-38db-29232a74db4d")
public static String es_PE_FIELD_MaterialReceipt_Printed_Description="Indica si este documento es impreso.";

@XendraTrl(Identifier="a882043b-e700-b2f0-38db-29232a74db4d")
public static String es_PE_FIELD_MaterialReceipt_Printed_Help="El cuadro de verificación impreso indica si este documento se imprimirá.";

@XendraTrl(Identifier="a882043b-e700-b2f0-38db-29232a74db4d")
public static String es_PE_FIELD_MaterialReceipt_Printed_Name="Impreso";

@XendraField(AD_Column_ID="IsPrinted",IsCentrallyMaintained=true,
AD_Tab_ID="e8de4016-9c2c-a316-d3a0-490daa151389",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a882043b-e700-b2f0-38db-29232a74db4d")
public static final String FIELDNAME_MaterialReceipt_Printed="a882043b-e700-b2f0-38db-29232a74db4d";

@XendraTrl(Identifier="fae63dae-17e2-19b7-cd3a-22f13d5affc7")
public static String es_PE_FIELD_PartnerShipments_Printed_Description="Indica si este documento es impreso.";

@XendraTrl(Identifier="fae63dae-17e2-19b7-cd3a-22f13d5affc7")
public static String es_PE_FIELD_PartnerShipments_Printed_Help="El cuadro de verificación impreso indica si este documento se imprimirá.";

@XendraTrl(Identifier="fae63dae-17e2-19b7-cd3a-22f13d5affc7")
public static String es_PE_FIELD_PartnerShipments_Printed_Name="Impreso";

@XendraField(AD_Column_ID="IsPrinted",IsCentrallyMaintained=true,
AD_Tab_ID="e40e4cfe-ea42-22ef-d7c2-0180fe5eccfe",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="fae63dae-17e2-19b7-cd3a-22f13d5affc7")
public static final String FIELDNAME_PartnerShipments_Printed="fae63dae-17e2-19b7-cd3a-22f13d5affc7";

@XendraTrl(Identifier="e57e9d51-7aee-f443-367f-2d741106e737")
public static String es_PE_COLUMN_IsPrinted_Name="Impreso";

@XendraColumn(AD_Element_ID="66795cb3-a608-19bb-8cde-40abe30a0130",ColumnName="IsPrinted",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e57e9d51-7aee-f443-367f-2d741106e737",
Synchronized="2017-08-05 16:55:08.0")
/** Column name IsPrinted */
public static final String COLUMNNAME_IsPrinted = "IsPrinted";
/** Set IsRealtimePOS.
@param IsRealtimePOS IsRealtimePOS */
public void setIsRealtimePOS (boolean IsRealtimePOS)
{
set_Value (COLUMNNAME_IsRealtimePOS, Boolean.valueOf(IsRealtimePOS));
}
/** Get IsRealtimePOS.
@return IsRealtimePOS */
public boolean isRealtimePOS() 
{
Object oo = get_Value(COLUMNNAME_IsRealtimePOS);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="47243d79-cdf7-220e-6fcc-29296a78e715")
public static String es_PE_COLUMN_IsRealtimePOS_Name="IsRealTimePOS";

@XendraColumn(AD_Element_ID="d11eaa71-d549-2f36-a313-290a07febb00",ColumnName="IsRealtimePOS",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="47243d79-cdf7-220e-6fcc-29296a78e715",
Synchronized="2017-08-05 16:55:08.0")
/** Column name IsRealtimePOS */
public static final String COLUMNNAME_IsRealtimePOS = "IsRealtimePOS";
/** Set Sales Transaction.
@param IsSOTrx This is a Sales Transaction */
public void setIsSOTrx (boolean IsSOTrx)
{
set_Value (COLUMNNAME_IsSOTrx, Boolean.valueOf(IsSOTrx));
}
/** Get Sales Transaction.
@return This is a Sales Transaction */
public boolean isSOTrx() 
{
Object oo = get_Value(COLUMNNAME_IsSOTrx);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="2dcb654b-b6a1-9f5c-7e16-7050472c37f6")
public static String es_PE_FIELD_Shipment_SalesTransaction_Description="Esta es una transacción de ventas";

@XendraTrl(Identifier="2dcb654b-b6a1-9f5c-7e16-7050472c37f6")
public static String es_PE_FIELD_Shipment_SalesTransaction_Help="El cuadro de verificación Transacción de Ventas indica si este ítem es una transacción de ventas";

@XendraTrl(Identifier="2dcb654b-b6a1-9f5c-7e16-7050472c37f6")
public static String es_PE_FIELD_Shipment_SalesTransaction_Name="Transacción de Ventas";

@XendraField(AD_Column_ID="IsSOTrx",IsCentrallyMaintained=true,
AD_Tab_ID="301afa71-2a4c-179a-1524-e4657d76a205",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2dcb654b-b6a1-9f5c-7e16-7050472c37f6")
public static final String FIELDNAME_Shipment_SalesTransaction="2dcb654b-b6a1-9f5c-7e16-7050472c37f6";

@XendraTrl(Identifier="aef49871-0990-7dbd-4e90-87d76e525e3a")
public static String es_PE_FIELD_MaterialReceipt_SalesTransaction_Description="Esta es una transacción de ventas";

@XendraTrl(Identifier="aef49871-0990-7dbd-4e90-87d76e525e3a")
public static String es_PE_FIELD_MaterialReceipt_SalesTransaction_Help="El cuadro de verificación Transacción de Ventas indica si este ítem es una transacción de ventas";

@XendraTrl(Identifier="aef49871-0990-7dbd-4e90-87d76e525e3a")
public static String es_PE_FIELD_MaterialReceipt_SalesTransaction_Name="Transacción de Ventas";

@XendraField(AD_Column_ID="IsSOTrx",IsCentrallyMaintained=true,
AD_Tab_ID="e8de4016-9c2c-a316-d3a0-490daa151389",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="aef49871-0990-7dbd-4e90-87d76e525e3a")
public static final String FIELDNAME_MaterialReceipt_SalesTransaction="aef49871-0990-7dbd-4e90-87d76e525e3a";

@XendraTrl(Identifier="70c207c5-3072-1f11-2fd8-6a915135a705")
public static String es_PE_FIELD_PartnerShipments_SalesTransaction_Description="Esta es una transacción de ventas";

@XendraTrl(Identifier="70c207c5-3072-1f11-2fd8-6a915135a705")
public static String es_PE_FIELD_PartnerShipments_SalesTransaction_Help="El cuadro de verificación Transacción de Ventas indica si este ítem es una transacción de ventas";

@XendraTrl(Identifier="70c207c5-3072-1f11-2fd8-6a915135a705")
public static String es_PE_FIELD_PartnerShipments_SalesTransaction_Name="Transacción de Ventas";

@XendraField(AD_Column_ID="IsSOTrx",IsCentrallyMaintained=true,
AD_Tab_ID="e40e4cfe-ea42-22ef-d7c2-0180fe5eccfe",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="70c207c5-3072-1f11-2fd8-6a915135a705")
public static final String FIELDNAME_PartnerShipments_SalesTransaction="70c207c5-3072-1f11-2fd8-6a915135a705";

@XendraTrl(Identifier="c3244e1c-41eb-02eb-a689-9dff93acd144")
public static String es_PE_COLUMN_IsSOTrx_Name="Transacción de Ventas";

@XendraColumn(AD_Element_ID="4084b69f-a51d-5676-4d8c-395a13e6b2df",ColumnName="IsSOTrx",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,
DefaultValue="@IsSOTrx@",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="c3244e1c-41eb-02eb-a689-9dff93acd144",Synchronized="2017-08-05 16:55:08.0")
/** Column name IsSOTrx */
public static final String COLUMNNAME_IsSOTrx = "IsSOTrx";
/** Set Shipment/Receipt.
@param M_InOut_ID Material Shipment Document */
public void setM_InOut_ID (int M_InOut_ID)
{
if (M_InOut_ID < 1) throw new IllegalArgumentException ("M_InOut_ID is mandatory.");
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

@XendraTrl(Identifier="4f4e43fb-e9ec-1f67-2567-5eeb8c1bf90d")
public static String es_PE_FIELD_Shipment_ShipmentReceipt_Description="Entrega ó documento de recibo";

@XendraTrl(Identifier="4f4e43fb-e9ec-1f67-2567-5eeb8c1bf90d")
public static String es_PE_FIELD_Shipment_ShipmentReceipt_Help="La ID de Entrega / Recibo indica el documento único para esta entrega ó recibo";

@XendraTrl(Identifier="4f4e43fb-e9ec-1f67-2567-5eeb8c1bf90d")
public static String es_PE_FIELD_Shipment_ShipmentReceipt_Name="Entrega / Recibo";

@XendraField(AD_Column_ID="M_InOut_ID",IsCentrallyMaintained=true,
AD_Tab_ID="301afa71-2a4c-179a-1524-e4657d76a205",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="4f4e43fb-e9ec-1f67-2567-5eeb8c1bf90d")
public static final String FIELDNAME_Shipment_ShipmentReceipt="4f4e43fb-e9ec-1f67-2567-5eeb8c1bf90d";

@XendraTrl(Identifier="44164b96-15c6-5404-c425-bd2cb0081fa1")
public static String es_PE_FIELD_MaterialReceipt_Receipt_Description="Entrega ó documento de recibo";

@XendraTrl(Identifier="44164b96-15c6-5404-c425-bd2cb0081fa1")
public static String es_PE_FIELD_MaterialReceipt_Receipt_Help="La ID de Entrega / Recibo indica el documento único para esta entrega ó recibo";

@XendraTrl(Identifier="44164b96-15c6-5404-c425-bd2cb0081fa1")
public static String es_PE_FIELD_MaterialReceipt_Receipt_Name="Entrega / Recibo";

@XendraField(AD_Column_ID="M_InOut_ID",IsCentrallyMaintained=true,
AD_Tab_ID="e8de4016-9c2c-a316-d3a0-490daa151389",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="44164b96-15c6-5404-c425-bd2cb0081fa1")
public static final String FIELDNAME_MaterialReceipt_Receipt="44164b96-15c6-5404-c425-bd2cb0081fa1";

@XendraTrl(Identifier="e7b48211-8875-3711-4e8c-9583a4333d70")
public static String es_PE_FIELD_PartnerShipments_ShipmentReceipt_Description="Entrega ó documento de recibo";

@XendraTrl(Identifier="e7b48211-8875-3711-4e8c-9583a4333d70")
public static String es_PE_FIELD_PartnerShipments_ShipmentReceipt_Help="La ID de Entrega / Recibo indica el documento único para esta entrega ó recibo";

@XendraTrl(Identifier="e7b48211-8875-3711-4e8c-9583a4333d70")
public static String es_PE_FIELD_PartnerShipments_ShipmentReceipt_Name="Entrega / Recibo";

@XendraField(AD_Column_ID="M_InOut_ID",IsCentrallyMaintained=true,
AD_Tab_ID="e40e4cfe-ea42-22ef-d7c2-0180fe5eccfe",AD_FieldGroup_ID="Reference",IsDisplayed=true,
DisplayLogic="1=2",DisplayLength=14,IsReadOnly=false,SeqNo=130,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e7b48211-8875-3711-4e8c-9583a4333d70")
public static final String FIELDNAME_PartnerShipments_ShipmentReceipt="e7b48211-8875-3711-4e8c-9583a4333d70";
/** Column name M_InOut_ID */
public static final String COLUMNNAME_M_InOut_ID = "M_InOut_ID";
/** Set Movement Date.
@param MovementDate Date a product was moved in or out of inventory */
public void setMovementDate (Timestamp MovementDate)
{
if (MovementDate == null) throw new IllegalArgumentException ("MovementDate is mandatory.");
set_Value (COLUMNNAME_MovementDate, MovementDate);
}
/** Get Movement Date.
@return Date a product was moved in or out of inventory */
public Timestamp getMovementDate() 
{
return (Timestamp)get_Value(COLUMNNAME_MovementDate);
}

@XendraTrl(Identifier="78453c71-3036-01cc-d675-842d6c294526")
public static String es_PE_FIELD_Shipment_MovementDate_Description="Fecha en que un producto fue movido (dentro ó fuera) del inventario";

@XendraTrl(Identifier="78453c71-3036-01cc-d675-842d6c294526")
public static String es_PE_FIELD_Shipment_MovementDate_Help="La fecha del movimiento indica la fecha en que el producto es movido. Éste es el resultado de un embarque; recibo ó movimiento de inventario.";

@XendraTrl(Identifier="78453c71-3036-01cc-d675-842d6c294526")
public static String es_PE_FIELD_Shipment_MovementDate_Name="Fecha de Movimiento";

@XendraField(AD_Column_ID="MovementDate",IsCentrallyMaintained=true,
AD_Tab_ID="301afa71-2a4c-179a-1524-e4657d76a205",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="78453c71-3036-01cc-d675-842d6c294526")
public static final String FIELDNAME_Shipment_MovementDate="78453c71-3036-01cc-d675-842d6c294526";

@XendraTrl(Identifier="613328ae-f8a1-5bd7-7afc-9f718a15dd00")
public static String es_PE_FIELD_MaterialReceipt_MovementDate_Description="Fecha en que un producto fue movido (dentro ó fuera) del inventario";

@XendraTrl(Identifier="613328ae-f8a1-5bd7-7afc-9f718a15dd00")
public static String es_PE_FIELD_MaterialReceipt_MovementDate_Help="La fecha del movimiento indica la fecha en que el producto es movido. Éste es el resultado de un embarque; recibo ó movimiento de inventario.";

@XendraTrl(Identifier="613328ae-f8a1-5bd7-7afc-9f718a15dd00")
public static String es_PE_FIELD_MaterialReceipt_MovementDate_Name="Fecha de Movimiento";

@XendraField(AD_Column_ID="MovementDate",IsCentrallyMaintained=true,
AD_Tab_ID="e8de4016-9c2c-a316-d3a0-490daa151389",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="613328ae-f8a1-5bd7-7afc-9f718a15dd00")
public static final String FIELDNAME_MaterialReceipt_MovementDate="613328ae-f8a1-5bd7-7afc-9f718a15dd00";

@XendraTrl(Identifier="ebc7ae4d-d695-044d-0c7a-51beb3a73c13")
public static String es_PE_FIELD_PartnerShipments_MovementDate_Description="Fecha en que un producto fue movido (dentro ó fuera) del inventario";

@XendraTrl(Identifier="ebc7ae4d-d695-044d-0c7a-51beb3a73c13")
public static String es_PE_FIELD_PartnerShipments_MovementDate_Help="La fecha del movimiento indica la fecha en que el producto es movido. Éste es el resultado de un embarque; recibo ó movimiento de inventario.";

@XendraTrl(Identifier="ebc7ae4d-d695-044d-0c7a-51beb3a73c13")
public static String es_PE_FIELD_PartnerShipments_MovementDate_Name="Fecha de Movimiento";

@XendraField(AD_Column_ID="MovementDate",IsCentrallyMaintained=true,
AD_Tab_ID="e40e4cfe-ea42-22ef-d7c2-0180fe5eccfe",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ebc7ae4d-d695-044d-0c7a-51beb3a73c13")
public static final String FIELDNAME_PartnerShipments_MovementDate="ebc7ae4d-d695-044d-0c7a-51beb3a73c13";

@XendraTrl(Identifier="b3268aad-bccf-f0a4-9763-ea656d23e8a7")
public static String es_PE_COLUMN_MovementDate_Name="Fecha de Movimiento";

@XendraColumn(AD_Element_ID="7a907f01-8525-820d-22d4-98b06d4b902b",ColumnName="MovementDate",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,
DefaultValue="@SysDate@",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=true,SeqNo=2,IsTranslated=false,
Callout="org.compiere.model.CalloutEngine.dateAcct",VFormat="",ValueMin="",ValueMax="",Version="1",
IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b3268aad-bccf-f0a4-9763-ea656d23e8a7",
Synchronized="2017-08-05 16:55:08.0")
/** Column name MovementDate */
public static final String COLUMNNAME_MovementDate = "MovementDate";

/** MovementType AD_Reference=0455b4db-004d-594c-a505-3e493bfda9ad */
public static final int MOVEMENTTYPE_AD_Reference_ID=189;
/** Set Movement Type.
@param MovementType Method of moving the inventory */
public void setMovementType (String MovementType)
{
if (MovementType == null) throw new IllegalArgumentException ("MovementType is mandatory");
if (MovementType.equals(REF_M_TransactionMovementType.WorkOrderPlus) || MovementType.equals(REF_M_TransactionMovementType.WorkOrder_) || MovementType.equals(REF_M_TransactionMovementType.ProductionPlus) || MovementType.equals(REF_M_TransactionMovementType.InventoryIn) || MovementType.equals(REF_M_TransactionMovementType.VendorReturns) || MovementType.equals(REF_M_TransactionMovementType.MovementFrom) || MovementType.equals(REF_M_TransactionMovementType.Production_) || MovementType.equals(REF_M_TransactionMovementType.CustomerShipment) || MovementType.equals(REF_M_TransactionMovementType.VendorReceipts) || MovementType.equals(REF_M_TransactionMovementType.InventoryOut) || MovementType.equals(REF_M_TransactionMovementType.MovementTo) || MovementType.equals(REF_M_TransactionMovementType.CustomerReturns) || MovementType.equals(REF_M_TransactionMovementType.NotApply));
 else throw new IllegalArgumentException ("MovementType Invalid value - " + MovementType + " - Reference_ID=189 - W+ - W- - P+ - I+ - R- - M- - P- - C- - V+ - I- - M+ - R+ - NA");
if (MovementType.length() > 2)
{
log.warning("Length > 2 - truncated");
MovementType = MovementType.substring(0,1);
}
set_ValueNoCheck (COLUMNNAME_MovementType, MovementType);
}
/** Get Movement Type.
@return Method of moving the inventory */
public String getMovementType() 
{
return (String)get_Value(COLUMNNAME_MovementType);
}

@XendraTrl(Identifier="fe1840a5-ebc3-2a65-0def-78f75dc39014")
public static String es_PE_FIELD_Shipment_MovementType_Description="Método de movimiento de inventario";

@XendraTrl(Identifier="fe1840a5-ebc3-2a65-0def-78f75dc39014")
public static String es_PE_FIELD_Shipment_MovementType_Help="El Tipo de Movimiento indica el tipo de movimiento (entradas; salidas a producción etc)";

@XendraTrl(Identifier="fe1840a5-ebc3-2a65-0def-78f75dc39014")
public static String es_PE_FIELD_Shipment_MovementType_Name="Tipo de Movimiento";

@XendraField(AD_Column_ID="MovementType",IsCentrallyMaintained=true,
AD_Tab_ID="301afa71-2a4c-179a-1524-e4657d76a205",AD_FieldGroup_ID="Status",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=340,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="fe1840a5-ebc3-2a65-0def-78f75dc39014")
public static final String FIELDNAME_Shipment_MovementType="fe1840a5-ebc3-2a65-0def-78f75dc39014";

@XendraTrl(Identifier="792560c6-7de7-347c-d9ee-fe2a126393aa")
public static String es_PE_FIELD_MaterialReceipt_MovementType_Description="Método de movimiento de inventario";

@XendraTrl(Identifier="792560c6-7de7-347c-d9ee-fe2a126393aa")
public static String es_PE_FIELD_MaterialReceipt_MovementType_Help="El Tipo de Movimiento indica el tipo de movimiento (entradas; salidas a producción etc)";

@XendraTrl(Identifier="792560c6-7de7-347c-d9ee-fe2a126393aa")
public static String es_PE_FIELD_MaterialReceipt_MovementType_Name="Tipo de Movimiento";

@XendraField(AD_Column_ID="MovementType",IsCentrallyMaintained=true,
AD_Tab_ID="e8de4016-9c2c-a316-d3a0-490daa151389",AD_FieldGroup_ID="Status",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=280,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="792560c6-7de7-347c-d9ee-fe2a126393aa")
public static final String FIELDNAME_MaterialReceipt_MovementType="792560c6-7de7-347c-d9ee-fe2a126393aa";

@XendraTrl(Identifier="6c82c451-9f5a-83ec-7e11-3cd988578cef")
public static String es_PE_FIELD_PartnerShipments_MovementType_Description="Método de movimiento de inventario";

@XendraTrl(Identifier="6c82c451-9f5a-83ec-7e11-3cd988578cef")
public static String es_PE_FIELD_PartnerShipments_MovementType_Help="El Tipo de Movimiento indica el tipo de movimiento (entradas; salidas a producción etc)";

@XendraTrl(Identifier="6c82c451-9f5a-83ec-7e11-3cd988578cef")
public static String es_PE_FIELD_PartnerShipments_MovementType_Name="Tipo de Movimiento";

@XendraField(AD_Column_ID="MovementType",IsCentrallyMaintained=true,
AD_Tab_ID="e40e4cfe-ea42-22ef-d7c2-0180fe5eccfe",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6c82c451-9f5a-83ec-7e11-3cd988578cef")
public static final String FIELDNAME_PartnerShipments_MovementType="6c82c451-9f5a-83ec-7e11-3cd988578cef";

@XendraTrl(Identifier="2f5bb749-2a65-b807-4a44-a0f3232095ff")
public static String es_PE_COLUMN_MovementType_Name="Tipo de Movimiento";

@XendraColumn(AD_Element_ID="6deba235-3003-eca1-becf-5fd99b19b2a9",ColumnName="MovementType",
AD_Reference_ID=17,AD_Reference_Value_ID="0455b4db-004d-594c-a505-3e493bfda9ad",AD_Val_Rule_ID="",
FieldLength=2,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="2f5bb749-2a65-b807-4a44-a0f3232095ff",Synchronized="2017-08-05 16:55:08.0")
/** Column name MovementType */
public static final String COLUMNNAME_MovementType = "MovementType";
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

@XendraTrl(Identifier="4fdb9922-f3e0-105e-3332-9e5e2282e1ef")
public static String es_PE_COLUMN_M_RMA_ID_Name="ADM (RMA)";

@XendraColumn(AD_Element_ID="99f41ef6-5c78-3288-c0ff-9495a4714c13",ColumnName="M_RMA_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="4fdb9922-f3e0-105e-3332-9e5e2282e1ef",
Synchronized="2017-08-05 16:55:08.0")
/** Column name M_RMA_ID */
public static final String COLUMNNAME_M_RMA_ID = "M_RMA_ID";
/** Set Shipper.
@param M_Shipper_ID Method or manner of product delivery */
public void setM_Shipper_ID (int M_Shipper_ID)
{
if (M_Shipper_ID <= 0) set_Value (COLUMNNAME_M_Shipper_ID, null);
 else 
set_Value (COLUMNNAME_M_Shipper_ID, Integer.valueOf(M_Shipper_ID));
}
/** Get Shipper.
@return Method or manner of product delivery */
public int getM_Shipper_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_Shipper_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="e9e7f696-7bff-8d77-50bc-5d0411e663f3")
public static String es_PE_FIELD_Shipment_Shipper_Description="Método ó manera de entrega del producto";

@XendraTrl(Identifier="e9e7f696-7bff-8d77-50bc-5d0411e663f3")
public static String es_PE_FIELD_Shipment_Shipper_Help="El transportista indica el responsable de entregar el producto";

@XendraTrl(Identifier="e9e7f696-7bff-8d77-50bc-5d0411e663f3")
public static String es_PE_FIELD_Shipment_Shipper_Name="Transportista";

@XendraField(AD_Column_ID="M_Shipper_ID",IsCentrallyMaintained=true,
AD_Tab_ID="301afa71-2a4c-179a-1524-e4657d76a205",AD_FieldGroup_ID="Shipment",IsDisplayed=true,
DisplayLogic="@DeliveryViaRule@=S",DisplayLength=14,IsReadOnly=false,SeqNo=190,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="e9e7f696-7bff-8d77-50bc-5d0411e663f3")
public static final String FIELDNAME_Shipment_Shipper="e9e7f696-7bff-8d77-50bc-5d0411e663f3";

@XendraTrl(Identifier="7ef50e9e-32de-d3e3-a744-35ad6303a688")
public static String es_PE_FIELD_MaterialReceipt_Shipper_Description="Método ó manera de entrega del producto";

@XendraTrl(Identifier="7ef50e9e-32de-d3e3-a744-35ad6303a688")
public static String es_PE_FIELD_MaterialReceipt_Shipper_Help="El transportista indica el responsable de entregar el producto";

@XendraTrl(Identifier="7ef50e9e-32de-d3e3-a744-35ad6303a688")
public static String es_PE_FIELD_MaterialReceipt_Shipper_Name="Transportista";

@XendraField(AD_Column_ID="M_Shipper_ID",IsCentrallyMaintained=true,
AD_Tab_ID="e8de4016-9c2c-a316-d3a0-490daa151389",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@DeliveryViaRule@='Y' ",DisplayLength=14,IsReadOnly=false,SeqNo=160,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="7ef50e9e-32de-d3e3-a744-35ad6303a688")
public static final String FIELDNAME_MaterialReceipt_Shipper="7ef50e9e-32de-d3e3-a744-35ad6303a688";

@XendraTrl(Identifier="dd2be58f-2b08-b36e-095a-33df286376d7")
public static String es_PE_FIELD_PartnerShipments_Shipper_Description="Método ó manera de entrega del producto";

@XendraTrl(Identifier="dd2be58f-2b08-b36e-095a-33df286376d7")
public static String es_PE_FIELD_PartnerShipments_Shipper_Help="El transportista indica el responsable de entregar el producto";

@XendraTrl(Identifier="dd2be58f-2b08-b36e-095a-33df286376d7")
public static String es_PE_FIELD_PartnerShipments_Shipper_Name="Transportista";

@XendraField(AD_Column_ID="M_Shipper_ID",IsCentrallyMaintained=true,
AD_Tab_ID="e40e4cfe-ea42-22ef-d7c2-0180fe5eccfe",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="dd2be58f-2b08-b36e-095a-33df286376d7")
public static final String FIELDNAME_PartnerShipments_Shipper="dd2be58f-2b08-b36e-095a-33df286376d7";

@XendraTrl(Identifier="1c4aa36e-2d2a-713e-5022-f221a9732d91")
public static String es_PE_COLUMN_M_Shipper_ID_Name="Transportista";

@XendraColumn(AD_Element_ID="9aa20cfc-6f2b-2463-7be0-888a548ba3ad",ColumnName="M_Shipper_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=true,ColumnSQL="",
IsAllowLogging=false,Identifier="1c4aa36e-2d2a-713e-5022-f221a9732d91",
Synchronized="2017-08-05 16:55:08.0")
/** Column name M_Shipper_ID */
public static final String COLUMNNAME_M_Shipper_ID = "M_Shipper_ID";
/** Set Warehouse.
@param M_Warehouse_ID Storage Warehouse and Service Point */
public void setM_Warehouse_ID (int M_Warehouse_ID)
{
if (M_Warehouse_ID < 1) throw new IllegalArgumentException ("M_Warehouse_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_M_Warehouse_ID, Integer.valueOf(M_Warehouse_ID));
}
/** Get Warehouse.
@return Storage Warehouse and Service Point */
public int getM_Warehouse_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_Warehouse_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="89c4e8e7-c7d1-79a3-8f93-5c50654525b2")
public static String es_PE_FIELD_Shipment_Warehouse_Description="Almacén";

@XendraTrl(Identifier="89c4e8e7-c7d1-79a3-8f93-5c50654525b2")
public static String es_PE_FIELD_Shipment_Warehouse_Help="El Almacén indica un Almacén único donde los productos son almacenados";

@XendraTrl(Identifier="89c4e8e7-c7d1-79a3-8f93-5c50654525b2")
public static String es_PE_FIELD_Shipment_Warehouse_Name="Almacén";

@XendraField(AD_Column_ID="M_Warehouse_ID",IsCentrallyMaintained=true,
AD_Tab_ID="301afa71-2a4c-179a-1524-e4657d76a205",AD_FieldGroup_ID="Warehouse",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=130,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="89c4e8e7-c7d1-79a3-8f93-5c50654525b2")
public static final String FIELDNAME_Shipment_Warehouse="89c4e8e7-c7d1-79a3-8f93-5c50654525b2";

@XendraTrl(Identifier="293e0cac-6404-d82d-bf4a-b7fc4768d41f")
public static String es_PE_FIELD_MaterialReceipt_Warehouse_Description="Almacén";

@XendraTrl(Identifier="293e0cac-6404-d82d-bf4a-b7fc4768d41f")
public static String es_PE_FIELD_MaterialReceipt_Warehouse_Help="El Almacén indica un Almacén único donde los productos son almacenados";

@XendraTrl(Identifier="293e0cac-6404-d82d-bf4a-b7fc4768d41f")
public static String es_PE_FIELD_MaterialReceipt_Warehouse_Name="Almacén";

@XendraField(AD_Column_ID="M_Warehouse_ID",IsCentrallyMaintained=true,
AD_Tab_ID="e8de4016-9c2c-a316-d3a0-490daa151389",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=130,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="293e0cac-6404-d82d-bf4a-b7fc4768d41f")
public static final String FIELDNAME_MaterialReceipt_Warehouse="293e0cac-6404-d82d-bf4a-b7fc4768d41f";

@XendraTrl(Identifier="c7360feb-0c35-fde3-da8f-ca29eb7a244b")
public static String es_PE_FIELD_PartnerShipments_Warehouse_Description="Almacén";

@XendraTrl(Identifier="c7360feb-0c35-fde3-da8f-ca29eb7a244b")
public static String es_PE_FIELD_PartnerShipments_Warehouse_Help="El Almacén indica un Almacén único donde los productos son almacenados";

@XendraTrl(Identifier="c7360feb-0c35-fde3-da8f-ca29eb7a244b")
public static String es_PE_FIELD_PartnerShipments_Warehouse_Name="Almacén";

@XendraField(AD_Column_ID="M_Warehouse_ID",IsCentrallyMaintained=true,
AD_Tab_ID="e40e4cfe-ea42-22ef-d7c2-0180fe5eccfe",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c7360feb-0c35-fde3-da8f-ca29eb7a244b")
public static final String FIELDNAME_PartnerShipments_Warehouse="c7360feb-0c35-fde3-da8f-ca29eb7a244b";

@XendraTrl(Identifier="70863330-9a3a-c869-8883-d9e18a2a9fe2")
public static String es_PE_COLUMN_M_Warehouse_ID_Name="Almacén";

@XendraColumn(AD_Element_ID="402045cd-baa5-aeaf-b148-a921dffb7821",ColumnName="M_Warehouse_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="04acc0b0-f57d-0e15-af5b-80249f6e7906",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="org.compiere.model.CalloutInOut.warehouse",VFormat="",ValueMin="",ValueMax="",Version="1",
IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="70863330-9a3a-c869-8883-d9e18a2a9fe2",Synchronized="2017-08-05 16:55:08.0")
/** Column name M_Warehouse_ID */
public static final String COLUMNNAME_M_Warehouse_ID = "M_Warehouse_ID";
/** Set No Packages.
@param NoPackages Number of packages shipped */
public void setNoPackages (int NoPackages)
{
set_Value (COLUMNNAME_NoPackages, Integer.valueOf(NoPackages));
}
/** Get No Packages.
@return Number of packages shipped */
public int getNoPackages() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_NoPackages);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="b9c650c2-b71b-1083-745a-36339afa3091")
public static String es_PE_FIELD_Shipment_NoPackages_Description="Numero de paquetes embarcados.";

@XendraTrl(Identifier="b9c650c2-b71b-1083-745a-36339afa3091")
public static String es_PE_FIELD_Shipment_NoPackages_Name="No. Paquetes";

@XendraField(AD_Column_ID="NoPackages",IsCentrallyMaintained=true,
AD_Tab_ID="301afa71-2a4c-179a-1524-e4657d76a205",AD_FieldGroup_ID="Shipment",IsDisplayed=true,
DisplayLogic="@DeliveryViaRule@=S",DisplayLength=11,IsReadOnly=false,SeqNo=220,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="b9c650c2-b71b-1083-745a-36339afa3091")
public static final String FIELDNAME_Shipment_NoPackages="b9c650c2-b71b-1083-745a-36339afa3091";

@XendraTrl(Identifier="5c3dc654-b9ab-101a-edb1-a6947817d05f")
public static String es_PE_FIELD_MaterialReceipt_NoPackages_Description="Numero de paquetes embarcados.";

@XendraTrl(Identifier="5c3dc654-b9ab-101a-edb1-a6947817d05f")
public static String es_PE_FIELD_MaterialReceipt_NoPackages_Name="No. Paquetes";

@XendraField(AD_Column_ID="NoPackages",IsCentrallyMaintained=true,
AD_Tab_ID="e8de4016-9c2c-a316-d3a0-490daa151389",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5c3dc654-b9ab-101a-edb1-a6947817d05f")
public static final String FIELDNAME_MaterialReceipt_NoPackages="5c3dc654-b9ab-101a-edb1-a6947817d05f";

@XendraTrl(Identifier="c836fbd3-4af3-6ac8-7db3-d08d5e348609")
public static String es_PE_FIELD_PartnerShipments_NoPackages_Description="Numero de paquetes embarcados.";

@XendraTrl(Identifier="c836fbd3-4af3-6ac8-7db3-d08d5e348609")
public static String es_PE_FIELD_PartnerShipments_NoPackages_Name="No. Paquetes";

@XendraField(AD_Column_ID="NoPackages",IsCentrallyMaintained=true,
AD_Tab_ID="e40e4cfe-ea42-22ef-d7c2-0180fe5eccfe",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c836fbd3-4af3-6ac8-7db3-d08d5e348609")
public static final String FIELDNAME_PartnerShipments_NoPackages="c836fbd3-4af3-6ac8-7db3-d08d5e348609";

@XendraTrl(Identifier="60ea131a-9c3e-202a-ea02-3ca87d4e1a98")
public static String es_PE_COLUMN_NoPackages_Name="No. Paquetes";

@XendraColumn(AD_Element_ID="ebdb4961-cbde-5be6-50dd-02f0a4017597",ColumnName="NoPackages",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=true,ColumnSQL="",
IsAllowLogging=false,Identifier="60ea131a-9c3e-202a-ea02-3ca87d4e1a98",
Synchronized="2017-08-05 16:55:08.0")
/** Column name NoPackages */
public static final String COLUMNNAME_NoPackages = "NoPackages";
/** Set Pick Date.
@param PickDate Date/Time when picked for Shipment */
public void setPickDate (Timestamp PickDate)
{
set_Value (COLUMNNAME_PickDate, PickDate);
}
/** Get Pick Date.
@return Date/Time when picked for Shipment */
public Timestamp getPickDate() 
{
return (Timestamp)get_Value(COLUMNNAME_PickDate);
}

@XendraTrl(Identifier="653ebb6b-cfd9-3e73-1f9f-d9d954b61f1a")
public static String es_PE_FIELD_Shipment_PickDate_Description="Fecha/tiempo cuando está escogido para el envío.";

@XendraTrl(Identifier="653ebb6b-cfd9-3e73-1f9f-d9d954b61f1a")
public static String es_PE_FIELD_Shipment_PickDate_Name="Fecha Elegida";

@XendraField(AD_Column_ID="PickDate",IsCentrallyMaintained=true,
AD_Tab_ID="301afa71-2a4c-179a-1524-e4657d76a205",AD_FieldGroup_ID="Warehouse",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=true,SeqNo=160,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="653ebb6b-cfd9-3e73-1f9f-d9d954b61f1a")
public static final String FIELDNAME_Shipment_PickDate="653ebb6b-cfd9-3e73-1f9f-d9d954b61f1a";

@XendraTrl(Identifier="b81e6ddf-a3c0-077f-e290-ef657ca56db9")
public static String es_PE_FIELD_MaterialReceipt_PickDate_Description="Fecha/tiempo cuando está escogido para el envío.";

@XendraTrl(Identifier="b81e6ddf-a3c0-077f-e290-ef657ca56db9")
public static String es_PE_FIELD_MaterialReceipt_PickDate_Name="Fecha Elegida";

@XendraField(AD_Column_ID="PickDate",IsCentrallyMaintained=true,
AD_Tab_ID="e8de4016-9c2c-a316-d3a0-490daa151389",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b81e6ddf-a3c0-077f-e290-ef657ca56db9")
public static final String FIELDNAME_MaterialReceipt_PickDate="b81e6ddf-a3c0-077f-e290-ef657ca56db9";

@XendraTrl(Identifier="9f3051aa-f21c-967f-cd1f-caa7cb5b40c6")
public static String es_PE_FIELD_PartnerShipments_PickDate_Description="Fecha/tiempo cuando está escogido para el envío.";

@XendraTrl(Identifier="9f3051aa-f21c-967f-cd1f-caa7cb5b40c6")
public static String es_PE_FIELD_PartnerShipments_PickDate_Name="Fecha Elegida";

@XendraField(AD_Column_ID="PickDate",IsCentrallyMaintained=true,
AD_Tab_ID="e40e4cfe-ea42-22ef-d7c2-0180fe5eccfe",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9f3051aa-f21c-967f-cd1f-caa7cb5b40c6")
public static final String FIELDNAME_PartnerShipments_PickDate="9f3051aa-f21c-967f-cd1f-caa7cb5b40c6";

@XendraTrl(Identifier="bd90b01e-e4fb-0f50-d561-0bb08437b00e")
public static String es_PE_COLUMN_PickDate_Name="Fecha Elegida";

@XendraColumn(AD_Element_ID="ce0eb0be-3a95-2a6b-22cd-5eca99d6b7f7",ColumnName="PickDate",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="bd90b01e-e4fb-0f50-d561-0bb08437b00e",
Synchronized="2017-08-05 16:55:08.0")
/** Column name PickDate */
public static final String COLUMNNAME_PickDate = "PickDate";
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
@XendraTrl(Identifier="a9e5205a-0975-79ea-8d9d-a6cac4fdadee")
public static String es_PE_FIELD_Shipment_OrderReference_Description="Número de referencia de de la transacción (Orden de Venta; Orden de Compra) de su socio de negocio)";

@XendraTrl(Identifier="a9e5205a-0975-79ea-8d9d-a6cac4fdadee")
public static String es_PE_FIELD_Shipment_OrderReference_Help="La referencia de orden del socio de negocio es la referencia para esta transacción específica. Frecuentemente los números de orden de compras se dan para ser impresas en las facturas como una referencia más fácil. Un número estándar puede ser definido en la ventana socio de negocio (Cliente).";

@XendraTrl(Identifier="a9e5205a-0975-79ea-8d9d-a6cac4fdadee")
public static String es_PE_FIELD_Shipment_OrderReference_Name="Referencia de Orden de Socio";

@XendraField(AD_Column_ID="POReference",IsCentrallyMaintained=true,
AD_Tab_ID="301afa71-2a4c-179a-1524-e4657d76a205",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a9e5205a-0975-79ea-8d9d-a6cac4fdadee")
public static final String FIELDNAME_Shipment_OrderReference="a9e5205a-0975-79ea-8d9d-a6cac4fdadee";

@XendraTrl(Identifier="990fd8b0-430a-2fa6-60e4-9e454ec145ab")
public static String es_PE_FIELD_MaterialReceipt_OrderReference_Description="Número de referencia de de la transacción (Orden de Venta; Orden de Compra) de su socio de negocio)";

@XendraTrl(Identifier="990fd8b0-430a-2fa6-60e4-9e454ec145ab")
public static String es_PE_FIELD_MaterialReceipt_OrderReference_Help="La referencia de orden del socio de negocio es la referencia para esta transacción específica. Frecuentemente los números de orden de compras se dan para ser impresas en las facturas como una referencia más fácil. Un número estándar puede ser definido en la ventana socio de negocio (Cliente).";

@XendraTrl(Identifier="990fd8b0-430a-2fa6-60e4-9e454ec145ab")
public static String es_PE_FIELD_MaterialReceipt_OrderReference_Name="Referencia de Orden de Socio";

@XendraField(AD_Column_ID="POReference",IsCentrallyMaintained=true,
AD_Tab_ID="e8de4016-9c2c-a316-d3a0-490daa151389",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="990fd8b0-430a-2fa6-60e4-9e454ec145ab")
public static final String FIELDNAME_MaterialReceipt_OrderReference="990fd8b0-430a-2fa6-60e4-9e454ec145ab";

@XendraTrl(Identifier="a61d5e67-93de-0e96-48f3-62eb0ece5665")
public static String es_PE_FIELD_PartnerShipments_OrderReference_Description="Número de referencia de de la transacción (Orden de Venta; Orden de Compra) de su socio de negocio)";

@XendraTrl(Identifier="a61d5e67-93de-0e96-48f3-62eb0ece5665")
public static String es_PE_FIELD_PartnerShipments_OrderReference_Help="La referencia de orden del socio de negocio es la referencia para esta transacción específica. Frecuentemente los números de orden de compras se dan para ser impresas en las facturas como una referencia más fácil. Un número estándar puede ser definido en la ventana socio de negocio (Cliente).";

@XendraTrl(Identifier="a61d5e67-93de-0e96-48f3-62eb0ece5665")
public static String es_PE_FIELD_PartnerShipments_OrderReference_Name="Referencia de Orden de Socio";

@XendraField(AD_Column_ID="POReference",IsCentrallyMaintained=true,
AD_Tab_ID="e40e4cfe-ea42-22ef-d7c2-0180fe5eccfe",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a61d5e67-93de-0e96-48f3-62eb0ece5665")
public static final String FIELDNAME_PartnerShipments_OrderReference="a61d5e67-93de-0e96-48f3-62eb0ece5665";

@XendraTrl(Identifier="08f12108-ab54-5d08-118e-28f4e3192616")
public static String es_PE_COLUMN_POReference_Name="Referencia de Orden de Socio";

@XendraColumn(AD_Element_ID="c3de7eea-53b7-a810-0260-1bcb037a2967",ColumnName="POReference",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=20,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="08f12108-ab54-5d08-118e-28f4e3192616",
Synchronized="2017-08-05 16:55:08.0")
/** Column name POReference */
public static final String COLUMNNAME_POReference = "POReference";
/** Set Posted.
@param Posted Posting status */
public void setPosted (boolean Posted)
{
set_Value (COLUMNNAME_Posted, Boolean.valueOf(Posted));
}
/** Get Posted.
@return Posting status */
public boolean isPosted() 
{
Object oo = get_Value(COLUMNNAME_Posted);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="4580fd46-ac3a-08a6-02f8-3ba6efcbee86")
public static String es_PE_FIELD_Shipment_Posted_Description="Las transacciones de contabilidad general han sido procesadas.";

@XendraTrl(Identifier="4580fd46-ac3a-08a6-02f8-3ba6efcbee86")
public static String es_PE_FIELD_Shipment_Posted_Help="El campo fijado indica el estado de la generación de las Líneas contables a la contabilidad general.";

@XendraTrl(Identifier="4580fd46-ac3a-08a6-02f8-3ba6efcbee86")
public static String es_PE_FIELD_Shipment_Posted_Name="Fijada";
@XendraField(AD_Column_ID="Posted",
IsCentrallyMaintained=true,AD_Tab_ID="301afa71-2a4c-179a-1524-e4657d76a205",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="@Processed@=Y & @#ShowAcct@=Y",DisplayLength=23,IsReadOnly=false,
SeqNo=400,SortNo=0,IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="4580fd46-ac3a-08a6-02f8-3ba6efcbee86")
public static final String FIELDNAME_Shipment_Posted="4580fd46-ac3a-08a6-02f8-3ba6efcbee86";

@XendraTrl(Identifier="760cc572-50c2-0b29-8177-526e8d08ce8b")
public static String es_PE_FIELD_MaterialReceipt_Posted_Description="Las transacciones de contabilidad general han sido procesadas.";

@XendraTrl(Identifier="760cc572-50c2-0b29-8177-526e8d08ce8b")
public static String es_PE_FIELD_MaterialReceipt_Posted_Help="El campo fijado indica el estado de la generación de las Líneas contables a la contabilidad general.";

@XendraTrl(Identifier="760cc572-50c2-0b29-8177-526e8d08ce8b")
public static String es_PE_FIELD_MaterialReceipt_Posted_Name="Fijada";

@XendraField(AD_Column_ID="Posted",IsCentrallyMaintained=true,
AD_Tab_ID="e8de4016-9c2c-a316-d3a0-490daa151389",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@Processed@=Y & @#ShowAcct@=Y",DisplayLength=23,IsReadOnly=false,SeqNo=340,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="760cc572-50c2-0b29-8177-526e8d08ce8b")
public static final String FIELDNAME_MaterialReceipt_Posted="760cc572-50c2-0b29-8177-526e8d08ce8b";

@XendraTrl(Identifier="344fbdea-3830-1122-aea4-acfd32a191f5")
public static String es_PE_FIELD_PartnerShipments_Posted_Description="Las transacciones de contabilidad general han sido procesadas.";

@XendraTrl(Identifier="344fbdea-3830-1122-aea4-acfd32a191f5")
public static String es_PE_FIELD_PartnerShipments_Posted_Help="El campo fijado indica el estado de la generación de las Líneas contables a la contabilidad general.";

@XendraTrl(Identifier="344fbdea-3830-1122-aea4-acfd32a191f5")
public static String es_PE_FIELD_PartnerShipments_Posted_Name="Fijada";

@XendraField(AD_Column_ID="Posted",IsCentrallyMaintained=true,
AD_Tab_ID="e40e4cfe-ea42-22ef-d7c2-0180fe5eccfe",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="344fbdea-3830-1122-aea4-acfd32a191f5")
public static final String FIELDNAME_PartnerShipments_Posted="344fbdea-3830-1122-aea4-acfd32a191f5";

@XendraTrl(Identifier="84989702-64f4-fe3b-bb45-12435c622c62")
public static String es_PE_COLUMN_Posted_Name="Fijada";

@XendraColumn(AD_Element_ID="5eb52ebc-6992-12f5-b85a-e0a136df259b",ColumnName="Posted",
AD_Reference_ID=28,AD_Reference_Value_ID="d2b659dd-6c8c-baf3-fc71-0ee997273154",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="84989702-64f4-fe3b-bb45-12435c622c62",Synchronized="2017-08-05 16:55:08.0")
/** Column name Posted */
public static final String COLUMNNAME_Posted = "Posted";

/** PriorityRule AD_Reference=bfacaeda-bbb9-ba51-d726-52826206b4d7 */
public static final int PRIORITYRULE_AD_Reference_ID=154;
/** Set Priority.
@param PriorityRule Priority of a document */
public void setPriorityRule (String PriorityRule)
{
if (PriorityRule == null) throw new IllegalArgumentException ("PriorityRule is mandatory");
if (PriorityRule.equals(REF__PriorityRule.High) || PriorityRule.equals(REF__PriorityRule.Medium) || PriorityRule.equals(REF__PriorityRule.Low) || PriorityRule.equals(REF__PriorityRule.Urgent) || PriorityRule.equals(REF__PriorityRule.Minor));
 else throw new IllegalArgumentException ("PriorityRule Invalid value - " + PriorityRule + " - Reference_ID=154 - 3 - 5 - 7 - 1 - 9");
if (PriorityRule.length() > 1)
{
log.warning("Length > 1 - truncated");
PriorityRule = PriorityRule.substring(0,0);
}
set_Value (COLUMNNAME_PriorityRule, PriorityRule);
}
/** Get Priority.
@return Priority of a document */
public String getPriorityRule() 
{
return (String)get_Value(COLUMNNAME_PriorityRule);
}

@XendraTrl(Identifier="c8205f85-3d91-63df-798d-3d3b195ccfea")
public static String es_PE_FIELD_Shipment_Priority_Description="Prioridad de un documento";

@XendraTrl(Identifier="c8205f85-3d91-63df-798d-3d3b195ccfea")
public static String es_PE_FIELD_Shipment_Priority_Help="La prioridad indica la importancia (alta; media; baja) de este documento";

@XendraTrl(Identifier="c8205f85-3d91-63df-798d-3d3b195ccfea")
public static String es_PE_FIELD_Shipment_Priority_Name="Prioridad";

@XendraField(AD_Column_ID="PriorityRule",IsCentrallyMaintained=true,
AD_Tab_ID="301afa71-2a4c-179a-1524-e4657d76a205",AD_FieldGroup_ID="Warehouse",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=140,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c8205f85-3d91-63df-798d-3d3b195ccfea")
public static final String FIELDNAME_Shipment_Priority="c8205f85-3d91-63df-798d-3d3b195ccfea";

@XendraTrl(Identifier="d0118d11-09a7-60b6-4f64-f15e0ca8f23b")
public static String es_PE_FIELD_MaterialReceipt_Priority_Description="Prioridad de un documento";

@XendraTrl(Identifier="d0118d11-09a7-60b6-4f64-f15e0ca8f23b")
public static String es_PE_FIELD_MaterialReceipt_Priority_Help="La prioridad indica la importancia (alta; media; baja) de este documento";

@XendraTrl(Identifier="d0118d11-09a7-60b6-4f64-f15e0ca8f23b")
public static String es_PE_FIELD_MaterialReceipt_Priority_Name="Prioridad";

@XendraField(AD_Column_ID="PriorityRule",IsCentrallyMaintained=true,
AD_Tab_ID="e8de4016-9c2c-a316-d3a0-490daa151389",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=140,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d0118d11-09a7-60b6-4f64-f15e0ca8f23b")
public static final String FIELDNAME_MaterialReceipt_Priority="d0118d11-09a7-60b6-4f64-f15e0ca8f23b";

@XendraTrl(Identifier="dcd5c2d5-98fb-09aa-c31f-c7672e880704")
public static String es_PE_FIELD_PartnerShipments_Priority_Description="Prioridad de un documento";

@XendraTrl(Identifier="dcd5c2d5-98fb-09aa-c31f-c7672e880704")
public static String es_PE_FIELD_PartnerShipments_Priority_Help="La prioridad indica la importancia (alta; media; baja) de este documento";

@XendraTrl(Identifier="dcd5c2d5-98fb-09aa-c31f-c7672e880704")
public static String es_PE_FIELD_PartnerShipments_Priority_Name="Prioridad";

@XendraField(AD_Column_ID="PriorityRule",IsCentrallyMaintained=true,
AD_Tab_ID="e40e4cfe-ea42-22ef-d7c2-0180fe5eccfe",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="dcd5c2d5-98fb-09aa-c31f-c7672e880704")
public static final String FIELDNAME_PartnerShipments_Priority="dcd5c2d5-98fb-09aa-c31f-c7672e880704";

@XendraTrl(Identifier="1bb83dd9-e88a-1e9e-a9c1-6eed9f553f5d")
public static String es_PE_COLUMN_PriorityRule_Name="Prioridad";

@XendraColumn(AD_Element_ID="8ff1ec26-d036-3761-33be-8de919b0ed5c",ColumnName="PriorityRule",
AD_Reference_ID=17,AD_Reference_Value_ID="bfacaeda-bbb9-ba51-d726-52826206b4d7",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="5",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="1bb83dd9-e88a-1e9e-a9c1-6eed9f553f5d",Synchronized="2017-08-05 16:55:08.0")
/** Column name PriorityRule */
public static final String COLUMNNAME_PriorityRule = "PriorityRule";
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

@XendraTrl(Identifier="9a24df0d-f7ab-12a7-7086-9fd2ab2bc431")
public static String es_PE_FIELD_Shipment_Processed_Description="El documento ha sido procesado";

@XendraTrl(Identifier="9a24df0d-f7ab-12a7-7086-9fd2ab2bc431")
public static String es_PE_FIELD_Shipment_Processed_Help="El cuadro de verificación procesada indica que un documento ha sido procesado";

@XendraTrl(Identifier="9a24df0d-f7ab-12a7-7086-9fd2ab2bc431")
public static String es_PE_FIELD_Shipment_Processed_Name="Procesado";

@XendraField(AD_Column_ID="Processed",IsCentrallyMaintained=true,
AD_Tab_ID="301afa71-2a4c-179a-1524-e4657d76a205",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9a24df0d-f7ab-12a7-7086-9fd2ab2bc431")
public static final String FIELDNAME_Shipment_Processed="9a24df0d-f7ab-12a7-7086-9fd2ab2bc431";

@XendraTrl(Identifier="b5038059-4d6a-203b-06d7-e8533e8a98f4")
public static String es_PE_FIELD_MaterialReceipt_Processed_Description="El documento ha sido procesado";

@XendraTrl(Identifier="b5038059-4d6a-203b-06d7-e8533e8a98f4")
public static String es_PE_FIELD_MaterialReceipt_Processed_Help="El cuadro de verificación procesada indica que un documento ha sido procesado";

@XendraTrl(Identifier="b5038059-4d6a-203b-06d7-e8533e8a98f4")
public static String es_PE_FIELD_MaterialReceipt_Processed_Name="Procesado";

@XendraField(AD_Column_ID="Processed",IsCentrallyMaintained=true,
AD_Tab_ID="e8de4016-9c2c-a316-d3a0-490daa151389",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b5038059-4d6a-203b-06d7-e8533e8a98f4")
public static final String FIELDNAME_MaterialReceipt_Processed="b5038059-4d6a-203b-06d7-e8533e8a98f4";

@XendraTrl(Identifier="2e952f62-5320-9bd8-c4c1-3bef41825502")
public static String es_PE_FIELD_PartnerShipments_Processed_Description="El documento ha sido procesado";

@XendraTrl(Identifier="2e952f62-5320-9bd8-c4c1-3bef41825502")
public static String es_PE_FIELD_PartnerShipments_Processed_Help="El cuadro de verificación procesada indica que un documento ha sido procesado";

@XendraTrl(Identifier="2e952f62-5320-9bd8-c4c1-3bef41825502")
public static String es_PE_FIELD_PartnerShipments_Processed_Name="Procesado";

@XendraField(AD_Column_ID="Processed",IsCentrallyMaintained=true,
AD_Tab_ID="e40e4cfe-ea42-22ef-d7c2-0180fe5eccfe",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2e952f62-5320-9bd8-c4c1-3bef41825502")
public static final String FIELDNAME_PartnerShipments_Processed="2e952f62-5320-9bd8-c4c1-3bef41825502";

@XendraTrl(Identifier="a81f4ac1-df20-dfe1-0d45-fd7abe4f71ad")
public static String es_PE_COLUMN_Processed_Name="Procesado";

@XendraColumn(AD_Element_ID="3f7035d2-fa5e-7416-fc0c-e49e43f9e083",ColumnName="Processed",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a81f4ac1-df20-dfe1-0d45-fd7abe4f71ad",
Synchronized="2017-08-05 16:55:08.0")
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

@XendraTrl(Identifier="2a8d9f1f-15d4-de83-c4ba-4c7966f33bd6")
public static String es_PE_FIELD_Shipment_ProcessNow_Name="Procesar Ahora";

@XendraField(AD_Column_ID="Processing",IsCentrallyMaintained=true,
AD_Tab_ID="301afa71-2a4c-179a-1524-e4657d76a205",AD_FieldGroup_ID="Status",IsDisplayed=false,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2a8d9f1f-15d4-de83-c4ba-4c7966f33bd6")
public static final String FIELDNAME_Shipment_ProcessNow="2a8d9f1f-15d4-de83-c4ba-4c7966f33bd6";

@XendraTrl(Identifier="2350cead-d235-c6a8-4437-bb523314e5a7")
public static String es_PE_FIELD_MaterialReceipt_ProcessNow_Name="Procesar Ahora";

@XendraField(AD_Column_ID="Processing",IsCentrallyMaintained=true,
AD_Tab_ID="e8de4016-9c2c-a316-d3a0-490daa151389",AD_FieldGroup_ID="Status",IsDisplayed=false,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2350cead-d235-c6a8-4437-bb523314e5a7")
public static final String FIELDNAME_MaterialReceipt_ProcessNow="2350cead-d235-c6a8-4437-bb523314e5a7";

@XendraTrl(Identifier="9b0be0ab-7f96-4424-81df-7f20856d2923")
public static String es_PE_FIELD_PartnerShipments_ProcessNow_Name="Procesar Ahora";

@XendraField(AD_Column_ID="Processing",IsCentrallyMaintained=true,
AD_Tab_ID="e40e4cfe-ea42-22ef-d7c2-0180fe5eccfe",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9b0be0ab-7f96-4424-81df-7f20856d2923")
public static final String FIELDNAME_PartnerShipments_ProcessNow="9b0be0ab-7f96-4424-81df-7f20856d2923";

@XendraTrl(Identifier="43d9267c-5c6c-d876-7540-1c0ac04b2566")
public static String es_PE_COLUMN_Processing_Name="Procesar Ahora";

@XendraColumn(AD_Element_ID="f2096404-1a98-35ec-09ea-273b3e19b7de",ColumnName="Processing",
AD_Reference_ID=28,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="43d9267c-5c6c-d876-7540-1c0ac04b2566",
Synchronized="2017-08-05 16:55:08.0")
/** Column name Processing */
public static final String COLUMNNAME_Processing = "Processing";
/** Set Referenced Shipment.
@param Ref_InOut_ID Referenced Shipment */
public void setRef_InOut_ID (int Ref_InOut_ID)
{
if (Ref_InOut_ID <= 0) set_Value (COLUMNNAME_Ref_InOut_ID, null);
 else 
set_Value (COLUMNNAME_Ref_InOut_ID, Integer.valueOf(Ref_InOut_ID));
}
/** Get Referenced Shipment.
@return Referenced Shipment */
public int getRef_InOut_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_Ref_InOut_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="9c68e117-3c6c-8b64-7169-42884f56a3f7")
public static String es_PE_FIELD_Shipment_ReferencedShipment_Name="Referencia de Entrega";

@XendraField(AD_Column_ID="Ref_InOut_ID",IsCentrallyMaintained=true,
AD_Tab_ID="301afa71-2a4c-179a-1524-e4657d76a205",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9c68e117-3c6c-8b64-7169-42884f56a3f7")
public static final String FIELDNAME_Shipment_ReferencedShipment="9c68e117-3c6c-8b64-7169-42884f56a3f7";

@XendraTrl(Identifier="3d03804f-6c2c-299a-cbf6-f81ce24860c1")
public static String es_PE_FIELD_MaterialReceipt_ReferencedShipment_Name="Referencia de Entrega";

@XendraField(AD_Column_ID="Ref_InOut_ID",IsCentrallyMaintained=true,
AD_Tab_ID="e8de4016-9c2c-a316-d3a0-490daa151389",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3d03804f-6c2c-299a-cbf6-f81ce24860c1")
public static final String FIELDNAME_MaterialReceipt_ReferencedShipment="3d03804f-6c2c-299a-cbf6-f81ce24860c1";

@XendraTrl(Identifier="e8838473-ca81-5574-e9aa-c02d8465f45f")
public static String es_PE_FIELD_PartnerShipments_ReferencedShipment_Name="Referencia de Entrega";

@XendraField(AD_Column_ID="Ref_InOut_ID",IsCentrallyMaintained=true,
AD_Tab_ID="e40e4cfe-ea42-22ef-d7c2-0180fe5eccfe",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e8838473-ca81-5574-e9aa-c02d8465f45f")
public static final String FIELDNAME_PartnerShipments_ReferencedShipment="e8838473-ca81-5574-e9aa-c02d8465f45f";

@XendraTrl(Identifier="90a039f5-0f3c-cf61-988b-79c44074eeba")
public static String es_PE_COLUMN_Ref_InOut_ID_Name="Referencia de Entrega";

@XendraColumn(AD_Element_ID="fbce1ebc-dec4-3806-7b2c-13781a5d978e",ColumnName="Ref_InOut_ID",
AD_Reference_ID=13,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="90a039f5-0f3c-cf61-988b-79c44074eeba",
Synchronized="2017-08-05 16:55:08.0")
/** Column name Ref_InOut_ID */
public static final String COLUMNNAME_Ref_InOut_ID = "Ref_InOut_ID";

/** SalesRep_ID AD_Reference=15251147-a1b6-4a83-a3a5-2d3ae7db69d9 */
public static final int SALESREP_ID_AD_Reference_ID=190;
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

@XendraTrl(Identifier="8afacff9-f98d-4747-d30e-1cdd5892f7d5")
public static String es_PE_FIELD_Shipment_SalesRepresentative_Description="Representante de Ventas";

@XendraTrl(Identifier="8afacff9-f98d-4747-d30e-1cdd5892f7d5")
public static String es_PE_FIELD_Shipment_SalesRepresentative_Help="El representante de ventas indica el representante de ventas para esta región.";

@XendraTrl(Identifier="8afacff9-f98d-4747-d30e-1cdd5892f7d5")
public static String es_PE_FIELD_Shipment_SalesRepresentative_Name="Agente Cía";

@XendraField(AD_Column_ID="SalesRep_ID",IsCentrallyMaintained=true,
AD_Tab_ID="301afa71-2a4c-179a-1524-e4657d76a205",AD_FieldGroup_ID="Warehouse",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=170,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8afacff9-f98d-4747-d30e-1cdd5892f7d5")
public static final String FIELDNAME_Shipment_SalesRepresentative="8afacff9-f98d-4747-d30e-1cdd5892f7d5";

@XendraTrl(Identifier="be6dd4e1-e56b-bda3-ca82-4b93644ea89c")
public static String es_PE_FIELD_MaterialReceipt_CompanyAgent_Description="Comprador/ Agente";

@XendraTrl(Identifier="be6dd4e1-e56b-bda3-ca82-4b93644ea89c")
public static String es_PE_FIELD_MaterialReceipt_CompanyAgent_Help="Agente de compras para el documento.";

@XendraTrl(Identifier="be6dd4e1-e56b-bda3-ca82-4b93644ea89c")
public static String es_PE_FIELD_MaterialReceipt_CompanyAgent_Name="Comprador";

@XendraField(AD_Column_ID="SalesRep_ID",IsCentrallyMaintained=true,
AD_Tab_ID="e8de4016-9c2c-a316-d3a0-490daa151389",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=170,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="be6dd4e1-e56b-bda3-ca82-4b93644ea89c")
public static final String FIELDNAME_MaterialReceipt_CompanyAgent="be6dd4e1-e56b-bda3-ca82-4b93644ea89c";

@XendraTrl(Identifier="a326047e-64ee-1c83-67e1-1e205e27baf5")
public static String es_PE_FIELD_PartnerShipments_SalesRepresentative_Description="Representante de Ventas";

@XendraTrl(Identifier="a326047e-64ee-1c83-67e1-1e205e27baf5")
public static String es_PE_FIELD_PartnerShipments_SalesRepresentative_Help="El representante de ventas indica el representante de ventas para esta región.";

@XendraTrl(Identifier="a326047e-64ee-1c83-67e1-1e205e27baf5")
public static String es_PE_FIELD_PartnerShipments_SalesRepresentative_Name="Agente Cía";

@XendraField(AD_Column_ID="SalesRep_ID",IsCentrallyMaintained=true,
AD_Tab_ID="e40e4cfe-ea42-22ef-d7c2-0180fe5eccfe",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a326047e-64ee-1c83-67e1-1e205e27baf5")
public static final String FIELDNAME_PartnerShipments_SalesRepresentative="a326047e-64ee-1c83-67e1-1e205e27baf5";

@XendraTrl(Identifier="5e321223-62c4-4f8c-db5c-e6313a6b50c1")
public static String es_PE_COLUMN_SalesRep_ID_Name="Agente Cía";

@XendraColumn(AD_Element_ID="197a9c3a-ff10-c291-d65f-5e05a36d3710",ColumnName="SalesRep_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="15251147-a1b6-4a83-a3a5-2d3ae7db69d9",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="5e321223-62c4-4f8c-db5c-e6313a6b50c1",Synchronized="2017-08-05 16:55:08.0")
/** Column name SalesRep_ID */
public static final String COLUMNNAME_SalesRep_ID = "SalesRep_ID";
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

@XendraTrl(Identifier="62f4e17d-c96e-094a-c74e-7f6177453950")
public static String es_PE_FIELD_Shipment_SendEMail_Description="Permite enviar el documento Email";

@XendraTrl(Identifier="62f4e17d-c96e-094a-c74e-7f6177453950")
public static String es_PE_FIELD_Shipment_SendEMail_Help="Envíe los email con el documento unido (ej. factura, nota de entrega, etc.)";

@XendraTrl(Identifier="62f4e17d-c96e-094a-c74e-7f6177453950")
public static String es_PE_FIELD_Shipment_SendEMail_Name="Envía Email";

@XendraField(AD_Column_ID="SendEMail",IsCentrallyMaintained=true,
AD_Tab_ID="301afa71-2a4c-179a-1524-e4657d76a205",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="62f4e17d-c96e-094a-c74e-7f6177453950")
public static final String FIELDNAME_Shipment_SendEMail="62f4e17d-c96e-094a-c74e-7f6177453950";

@XendraTrl(Identifier="07f038f8-0ded-0281-8975-04a76e9915fd")
public static String es_PE_FIELD_MaterialReceipt_SendEMail_Description="Permite enviar el documento Email";

@XendraTrl(Identifier="07f038f8-0ded-0281-8975-04a76e9915fd")
public static String es_PE_FIELD_MaterialReceipt_SendEMail_Help="Envíe los email con el documento unido (ej. factura, nota de entrega, etc.)";

@XendraTrl(Identifier="07f038f8-0ded-0281-8975-04a76e9915fd")
public static String es_PE_FIELD_MaterialReceipt_SendEMail_Name="Envía Email";

@XendraField(AD_Column_ID="SendEMail",IsCentrallyMaintained=true,
AD_Tab_ID="e8de4016-9c2c-a316-d3a0-490daa151389",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="07f038f8-0ded-0281-8975-04a76e9915fd")
public static final String FIELDNAME_MaterialReceipt_SendEMail="07f038f8-0ded-0281-8975-04a76e9915fd";

@XendraTrl(Identifier="1c65262d-4a8e-d696-bc9e-12d4f667f2bb")
public static String es_PE_FIELD_PartnerShipments_SendEMail_Description="Permite enviar el documento Email";

@XendraTrl(Identifier="1c65262d-4a8e-d696-bc9e-12d4f667f2bb")
public static String es_PE_FIELD_PartnerShipments_SendEMail_Help="Envíe los email con el documento unido (ej. factura, nota de entrega, etc.)";

@XendraTrl(Identifier="1c65262d-4a8e-d696-bc9e-12d4f667f2bb")
public static String es_PE_FIELD_PartnerShipments_SendEMail_Name="Envía Email";

@XendraField(AD_Column_ID="SendEMail",IsCentrallyMaintained=true,
AD_Tab_ID="e40e4cfe-ea42-22ef-d7c2-0180fe5eccfe",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1c65262d-4a8e-d696-bc9e-12d4f667f2bb")
public static final String FIELDNAME_PartnerShipments_SendEMail="1c65262d-4a8e-d696-bc9e-12d4f667f2bb";

@XendraTrl(Identifier="92aa9fb8-3c2a-498c-108b-9dcedee3b39c")
public static String es_PE_COLUMN_SendEMail_Name="Envía Email";

@XendraColumn(AD_Element_ID="88409dac-427a-2fc2-2bde-34430996bd43",ColumnName="SendEMail",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="92aa9fb8-3c2a-498c-108b-9dcedee3b39c",
Synchronized="2017-08-05 16:55:08.0")
/** Column name SendEMail */
public static final String COLUMNNAME_SendEMail = "SendEMail";
/** Set Ship Date.
@param ShipDate Shipment Date/Time */
public void setShipDate (Timestamp ShipDate)
{
set_Value (COLUMNNAME_ShipDate, ShipDate);
}
/** Get Ship Date.
@return Shipment Date/Time */
public Timestamp getShipDate() 
{
return (Timestamp)get_Value(COLUMNNAME_ShipDate);
}

@XendraTrl(Identifier="f4a7bba7-1ea0-89b9-2377-94c17b0d4b91")
public static String es_PE_FIELD_Shipment_ShipDate_Description="Fecha de entrega Fecha/Hora";

@XendraTrl(Identifier="f4a7bba7-1ea0-89b9-2377-94c17b0d4b91")
public static String es_PE_FIELD_Shipment_ShipDate_Help="Fecha actual Fecha/Hora de entrega (recolección)";

@XendraTrl(Identifier="f4a7bba7-1ea0-89b9-2377-94c17b0d4b91")
public static String es_PE_FIELD_Shipment_ShipDate_Name="Fecha de entrega";

@XendraField(AD_Column_ID="ShipDate",IsCentrallyMaintained=true,
AD_Tab_ID="301afa71-2a4c-179a-1524-e4657d76a205",AD_FieldGroup_ID="Shipment",IsDisplayed=true,
DisplayLogic="@DeliveryViaRule@=S",DisplayLength=20,IsReadOnly=false,SeqNo=210,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="f4a7bba7-1ea0-89b9-2377-94c17b0d4b91")
public static final String FIELDNAME_Shipment_ShipDate="f4a7bba7-1ea0-89b9-2377-94c17b0d4b91";

@XendraTrl(Identifier="8486e4d5-903d-8764-b7ac-7e5d57182c85")
public static String es_PE_FIELD_MaterialReceipt_ShipDate_Description="Fecha de entrega Fecha/Hora";

@XendraTrl(Identifier="8486e4d5-903d-8764-b7ac-7e5d57182c85")
public static String es_PE_FIELD_MaterialReceipt_ShipDate_Help="Fecha actual Fecha/Hora de entrega (recolección)";

@XendraTrl(Identifier="8486e4d5-903d-8764-b7ac-7e5d57182c85")
public static String es_PE_FIELD_MaterialReceipt_ShipDate_Name="Fecha de entrega";

@XendraField(AD_Column_ID="ShipDate",IsCentrallyMaintained=true,
AD_Tab_ID="e8de4016-9c2c-a316-d3a0-490daa151389",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8486e4d5-903d-8764-b7ac-7e5d57182c85")
public static final String FIELDNAME_MaterialReceipt_ShipDate="8486e4d5-903d-8764-b7ac-7e5d57182c85";

@XendraTrl(Identifier="5ce6104f-973a-887f-1df0-030f5c47db8a")
public static String es_PE_FIELD_PartnerShipments_ShipDate_Description="Fecha de entrega Fecha/Hora";

@XendraTrl(Identifier="5ce6104f-973a-887f-1df0-030f5c47db8a")
public static String es_PE_FIELD_PartnerShipments_ShipDate_Help="Fecha actual Fecha/Hora de entrega (recolección)";

@XendraTrl(Identifier="5ce6104f-973a-887f-1df0-030f5c47db8a")
public static String es_PE_FIELD_PartnerShipments_ShipDate_Name="Fecha de entrega";

@XendraField(AD_Column_ID="ShipDate",IsCentrallyMaintained=true,
AD_Tab_ID="e40e4cfe-ea42-22ef-d7c2-0180fe5eccfe",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5ce6104f-973a-887f-1df0-030f5c47db8a")
public static final String FIELDNAME_PartnerShipments_ShipDate="5ce6104f-973a-887f-1df0-030f5c47db8a";

@XendraTrl(Identifier="eee2e223-5cbc-8ad7-81e3-8845ed35f928")
public static String es_PE_COLUMN_ShipDate_Name="Fecha de entrega";

@XendraColumn(AD_Element_ID="d8b9eadd-d7de-545a-a14d-fe481306c7ec",ColumnName="ShipDate",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=true,ColumnSQL="",
IsAllowLogging=false,Identifier="eee2e223-5cbc-8ad7-81e3-8845ed35f928",
Synchronized="2017-08-05 16:55:08.0")
/** Column name ShipDate */
public static final String COLUMNNAME_ShipDate = "ShipDate";
/** Set Tracking No.
@param TrackingNo Number to track the shipment */
public void setTrackingNo (String TrackingNo)
{
if (TrackingNo != null && TrackingNo.length() > 60)
{
log.warning("Length > 60 - truncated");
TrackingNo = TrackingNo.substring(0,59);
}
set_Value (COLUMNNAME_TrackingNo, TrackingNo);
}
/** Get Tracking No.
@return Number to track the shipment */
public String getTrackingNo() 
{
String value = (String)get_Value(COLUMNNAME_TrackingNo);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="0ac4a7eb-8d20-d87f-b6ff-010a19296183")
public static String es_PE_FIELD_Shipment_TrackingNo_Description="Número de seguimiento de entrega";

@XendraTrl(Identifier="0ac4a7eb-8d20-d87f-b6ff-010a19296183")
public static String es_PE_FIELD_Shipment_TrackingNo_Name="Con Atencion A :";

@XendraField(AD_Column_ID="TrackingNo",IsCentrallyMaintained=true,
AD_Tab_ID="301afa71-2a4c-179a-1524-e4657d76a205",AD_FieldGroup_ID="Shipment",IsDisplayed=true,
DisplayLogic="@DeliveryViaRule@=S",DisplayLength=20,IsReadOnly=false,SeqNo=230,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="0ac4a7eb-8d20-d87f-b6ff-010a19296183")
public static final String FIELDNAME_Shipment_TrackingNo="0ac4a7eb-8d20-d87f-b6ff-010a19296183";

@XendraTrl(Identifier="79591918-5d98-ff45-e477-d8bb27bcc29d")
public static String es_PE_FIELD_MaterialReceipt_TrackingNo_Description="Número de seguimiento de entrega";

@XendraTrl(Identifier="79591918-5d98-ff45-e477-d8bb27bcc29d")
public static String es_PE_FIELD_MaterialReceipt_TrackingNo_Name="No. Seguimiento";

@XendraField(AD_Column_ID="TrackingNo",IsCentrallyMaintained=true,
AD_Tab_ID="e8de4016-9c2c-a316-d3a0-490daa151389",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="79591918-5d98-ff45-e477-d8bb27bcc29d")
public static final String FIELDNAME_MaterialReceipt_TrackingNo="79591918-5d98-ff45-e477-d8bb27bcc29d";

@XendraTrl(Identifier="775458e4-890c-3009-5258-2a845a2583a5")
public static String es_PE_FIELD_PartnerShipments_TrackingNo_Description="Número de seguimiento de entrega";

@XendraTrl(Identifier="775458e4-890c-3009-5258-2a845a2583a5")
public static String es_PE_FIELD_PartnerShipments_TrackingNo_Name="No. Seguimiento";

@XendraField(AD_Column_ID="TrackingNo",IsCentrallyMaintained=true,
AD_Tab_ID="e40e4cfe-ea42-22ef-d7c2-0180fe5eccfe",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="775458e4-890c-3009-5258-2a845a2583a5")
public static final String FIELDNAME_PartnerShipments_TrackingNo="775458e4-890c-3009-5258-2a845a2583a5";

@XendraTrl(Identifier="6c25f095-2d6e-8197-d315-610086adafe1")
public static String es_PE_COLUMN_TrackingNo_Name="Con Atención A :";

@XendraColumn(AD_Element_ID="e8e2d2ef-a81e-d656-dad5-1e2e466ffbb9",ColumnName="TrackingNo",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=true,ColumnSQL="",
IsAllowLogging=false,Identifier="6c25f095-2d6e-8197-d315-610086adafe1",
Synchronized="2017-08-05 16:55:08.0")
/** Column name TrackingNo */
public static final String COLUMNNAME_TrackingNo = "TrackingNo";

/** User1_ID AD_Reference=5a2fe161-044f-67cb-3791-6d615980cabb */
public static final int USER1_ID_AD_Reference_ID=134;
/** Set User List 1.
@param User1_ID User defined list element #1 */
public void setUser1_ID (int User1_ID)
{
if (User1_ID <= 0) set_Value (COLUMNNAME_User1_ID, null);
 else 
set_Value (COLUMNNAME_User1_ID, Integer.valueOf(User1_ID));
}
/** Get User List 1.
@return User defined list element #1 */
public int getUser1_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_User1_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="fad67762-e32b-448b-5c44-da35cb4b7a4b")
public static String es_PE_FIELD_Shipment_UserList_Description="El usuario definió el elemento # 1";

@XendraTrl(Identifier="fad67762-e32b-448b-5c44-da35cb4b7a4b")
public static String es_PE_FIELD_Shipment_UserList_Help="El elemento definido por el usuario despliega los elementos opcionales que han sido definidos para esta combinación de cuentas";

@XendraTrl(Identifier="fad67762-e32b-448b-5c44-da35cb4b7a4b")
public static String es_PE_FIELD_Shipment_UserList_Name="Usuario 1";

@XendraField(AD_Column_ID="User1_ID",IsCentrallyMaintained=true,
AD_Tab_ID="301afa71-2a4c-179a-1524-e4657d76a205",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@$Element_U1@=Y",DisplayLength=14,IsReadOnly=false,SeqNo=320,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="fad67762-e32b-448b-5c44-da35cb4b7a4b")
public static final String FIELDNAME_Shipment_UserList="fad67762-e32b-448b-5c44-da35cb4b7a4b";

@XendraTrl(Identifier="7da25a1f-9fe5-9a2d-eacf-f22d805fec2b")
public static String es_PE_FIELD_MaterialReceipt_UserList_Description="El usuario definió el elemento # 1";

@XendraTrl(Identifier="7da25a1f-9fe5-9a2d-eacf-f22d805fec2b")
public static String es_PE_FIELD_MaterialReceipt_UserList_Help="El elemento definido por el usuario despliega los elementos opcionales que han sido definidos para esta combinación de cuentas";

@XendraTrl(Identifier="7da25a1f-9fe5-9a2d-eacf-f22d805fec2b")
public static String es_PE_FIELD_MaterialReceipt_UserList_Name="Usuario 1";

@XendraField(AD_Column_ID="User1_ID",IsCentrallyMaintained=true,
AD_Tab_ID="e8de4016-9c2c-a316-d3a0-490daa151389",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@$Element_U1@=Y",DisplayLength=14,IsReadOnly=false,SeqNo=260,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="7da25a1f-9fe5-9a2d-eacf-f22d805fec2b")
public static final String FIELDNAME_MaterialReceipt_UserList="7da25a1f-9fe5-9a2d-eacf-f22d805fec2b";

@XendraTrl(Identifier="0dd8f6e5-19d6-98f0-65fc-d5e4fef6e734")
public static String es_PE_FIELD_PartnerShipments_UserList_Description="El usuario definió el elemento # 1";

@XendraTrl(Identifier="0dd8f6e5-19d6-98f0-65fc-d5e4fef6e734")
public static String es_PE_FIELD_PartnerShipments_UserList_Help="El elemento definido por el usuario despliega los elementos opcionales que han sido definidos para esta combinación de cuentas";

@XendraTrl(Identifier="0dd8f6e5-19d6-98f0-65fc-d5e4fef6e734")
public static String es_PE_FIELD_PartnerShipments_UserList_Name="Usuario 1";

@XendraField(AD_Column_ID="User1_ID",IsCentrallyMaintained=true,
AD_Tab_ID="e40e4cfe-ea42-22ef-d7c2-0180fe5eccfe",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0dd8f6e5-19d6-98f0-65fc-d5e4fef6e734")
public static final String FIELDNAME_PartnerShipments_UserList="0dd8f6e5-19d6-98f0-65fc-d5e4fef6e734";

@XendraTrl(Identifier="a65ff5d9-d756-1ce0-1f80-868d0b61ee8d")
public static String es_PE_COLUMN_User1_ID_Name="Usuario 1";

@XendraColumn(AD_Element_ID="07453e74-aadd-d9c9-e543-837a6fdb3094",ColumnName="User1_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="5a2fe161-044f-67cb-3791-6d615980cabb",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="a65ff5d9-d756-1ce0-1f80-868d0b61ee8d",Synchronized="2017-08-05 16:55:08.0")
/** Column name User1_ID */
public static final String COLUMNNAME_User1_ID = "User1_ID";

/** User2_ID AD_Reference=6a357ab2-7bb6-fce4-ffee-8bdd855a77fc */
public static final int USER2_ID_AD_Reference_ID=137;
/** Set User List 2.
@param User2_ID User defined list element #2 */
public void setUser2_ID (int User2_ID)
{
if (User2_ID <= 0) set_Value (COLUMNNAME_User2_ID, null);
 else 
set_Value (COLUMNNAME_User2_ID, Integer.valueOf(User2_ID));
}
/** Get User List 2.
@return User defined list element #2 */
public int getUser2_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_User2_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="33f870d2-60c5-fd0b-6695-ff1f2da36627")
public static String es_PE_FIELD_Shipment_UserList22_Description="El usuario definió el elemento # 2";

@XendraTrl(Identifier="33f870d2-60c5-fd0b-6695-ff1f2da36627")
public static String es_PE_FIELD_Shipment_UserList22_Help="El elemento definido por el usuario despliega los elementos opcionales que han sido definidos para esta combinación de cuentas";

@XendraTrl(Identifier="33f870d2-60c5-fd0b-6695-ff1f2da36627")
public static String es_PE_FIELD_Shipment_UserList22_Name="Usuario 2";

@XendraField(AD_Column_ID="User2_ID",IsCentrallyMaintained=true,
AD_Tab_ID="301afa71-2a4c-179a-1524-e4657d76a205",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@$Element_U2@=Y",DisplayLength=14,IsReadOnly=false,SeqNo=330,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="33f870d2-60c5-fd0b-6695-ff1f2da36627")
public static final String FIELDNAME_Shipment_UserList22="33f870d2-60c5-fd0b-6695-ff1f2da36627";

@XendraTrl(Identifier="80f7bfca-6b02-eaf0-9d33-f2af938f49c7")
public static String es_PE_FIELD_MaterialReceipt_UserList22_Description="El usuario definió el elemento # 2";

@XendraTrl(Identifier="80f7bfca-6b02-eaf0-9d33-f2af938f49c7")
public static String es_PE_FIELD_MaterialReceipt_UserList22_Help="El elemento definido por el usuario despliega los elementos opcionales que han sido definidos para esta combinación de cuentas";

@XendraTrl(Identifier="80f7bfca-6b02-eaf0-9d33-f2af938f49c7")
public static String es_PE_FIELD_MaterialReceipt_UserList22_Name="Usuario 2";

@XendraField(AD_Column_ID="User2_ID",IsCentrallyMaintained=true,
AD_Tab_ID="e8de4016-9c2c-a316-d3a0-490daa151389",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@$Element_U2@=Y",DisplayLength=14,IsReadOnly=false,SeqNo=270,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="80f7bfca-6b02-eaf0-9d33-f2af938f49c7")
public static final String FIELDNAME_MaterialReceipt_UserList22="80f7bfca-6b02-eaf0-9d33-f2af938f49c7";

@XendraTrl(Identifier="0c8ad690-ee2d-d7e1-2f57-c732f0b1a2ac")
public static String es_PE_FIELD_PartnerShipments_UserList22_Description="El usuario definió el elemento # 2";

@XendraTrl(Identifier="0c8ad690-ee2d-d7e1-2f57-c732f0b1a2ac")
public static String es_PE_FIELD_PartnerShipments_UserList22_Help="El elemento definido por el usuario despliega los elementos opcionales que han sido definidos para esta combinación de cuentas";

@XendraTrl(Identifier="0c8ad690-ee2d-d7e1-2f57-c732f0b1a2ac")
public static String es_PE_FIELD_PartnerShipments_UserList22_Name="Usuario 2";

@XendraField(AD_Column_ID="User2_ID",IsCentrallyMaintained=true,
AD_Tab_ID="e40e4cfe-ea42-22ef-d7c2-0180fe5eccfe",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0c8ad690-ee2d-d7e1-2f57-c732f0b1a2ac")
public static final String FIELDNAME_PartnerShipments_UserList22="0c8ad690-ee2d-d7e1-2f57-c732f0b1a2ac";

@XendraTrl(Identifier="a4dc7c13-daf7-effe-64b3-d264bb998026")
public static String es_PE_COLUMN_User2_ID_Name="Usuario 2";

@XendraColumn(AD_Element_ID="1b668c90-6743-20a2-df62-576857d72c06",ColumnName="User2_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="6a357ab2-7bb6-fce4-ffee-8bdd855a77fc",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="a4dc7c13-daf7-effe-64b3-d264bb998026",Synchronized="2017-08-05 16:55:08.0")
/** Column name User2_ID */
public static final String COLUMNNAME_User2_ID = "User2_ID";
/** Set Vehicle.
@param Vehicle Vehicle */
public void setVehicle (String Vehicle)
{
if (Vehicle != null && Vehicle.length() > 10)
{
log.warning("Length > 10 - truncated");
Vehicle = Vehicle.substring(0,9);
}
set_Value (COLUMNNAME_Vehicle, Vehicle);
}
/** Get Vehicle.
@return Vehicle */
public String getVehicle() 
{
String value = (String)get_Value(COLUMNNAME_Vehicle);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="08935164-605a-83fb-d689-ded59c838402")
public static String es_PE_FIELD_Shipment_Vehicle_Name="Vehículo";

@XendraField(AD_Column_ID="Vehicle",IsCentrallyMaintained=true,
AD_Tab_ID="301afa71-2a4c-179a-1524-e4657d76a205",AD_FieldGroup_ID="Shipment",IsDisplayed=true,
DisplayLogic="@DeliveryViaRule@=S",DisplayLength=0,IsReadOnly=false,SeqNo=240,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="08935164-605a-83fb-d689-ded59c838402")
public static final String FIELDNAME_Shipment_Vehicle="08935164-605a-83fb-d689-ded59c838402";

@XendraTrl(Identifier="e3ab2dde-d95b-9ea2-4265-cf6e5b49748d")
public static String es_PE_COLUMN_Vehicle_Name="vehicle";

@XendraColumn(AD_Element_ID="901cf364-a4d1-ac46-30aa-2394da346dc2",ColumnName="Vehicle",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=true,ColumnSQL="",
IsAllowLogging=false,Identifier="e3ab2dde-d95b-9ea2-4265-cf6e5b49748d",
Synchronized="2017-08-05 16:55:08.0")
/** Column name Vehicle */
public static final String COLUMNNAME_Vehicle = "Vehicle";
/** Set Volume.
@param Volume Volume of a product */
public void setVolume (BigDecimal Volume)
{
set_Value (COLUMNNAME_Volume, Volume);
}
/** Get Volume.
@return Volume of a product */
public BigDecimal getVolume() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Volume);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="2acf77eb-5531-b130-abb2-776603cba95c")
public static String es_PE_FIELD_Shipment_Volume_Description="Volúmen del producto";

@XendraTrl(Identifier="2acf77eb-5531-b130-abb2-776603cba95c")
public static String es_PE_FIELD_Shipment_Volume_Help="El Volumen indica el volumen del producto en la UM de volúmen del cliente";

@XendraTrl(Identifier="2acf77eb-5531-b130-abb2-776603cba95c")
public static String es_PE_FIELD_Shipment_Volume_Name="Volúmen";
@XendraField(AD_Column_ID="Volume",
IsCentrallyMaintained=true,AD_Tab_ID="301afa71-2a4c-179a-1524-e4657d76a205",AD_FieldGroup_ID="",
IsDisplayed=false,DisplayLogic="",DisplayLength=22,IsReadOnly=false,SeqNo=0,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="2acf77eb-5531-b130-abb2-776603cba95c")
public static final String FIELDNAME_Shipment_Volume="2acf77eb-5531-b130-abb2-776603cba95c";

@XendraTrl(Identifier="b366247f-938e-8ac1-4554-fbb94cd46a01")
public static String es_PE_COLUMN_Volume_Name="Volúmen";

@XendraColumn(AD_Element_ID="464c5f3e-92af-e641-7d3a-e7e5427af367",ColumnName="Volume",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b366247f-938e-8ac1-4554-fbb94cd46a01",
Synchronized="2017-08-05 16:55:08.0")
/** Column name Volume */
public static final String COLUMNNAME_Volume = "Volume";
/** Set Weight.
@param Weight Weight of a product */
public void setWeight (BigDecimal Weight)
{
set_Value (COLUMNNAME_Weight, Weight);
}
/** Get Weight.
@return Weight of a product */
public BigDecimal getWeight() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Weight);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="a91561f0-89f7-e4b4-3700-3a622775eb0b")
public static String es_PE_FIELD_Shipment_Weight_Description="Peso del producto";

@XendraTrl(Identifier="a91561f0-89f7-e4b4-3700-3a622775eb0b")
public static String es_PE_FIELD_Shipment_Weight_Help="El peso indica el peso del producto en la UM de peso del cliente.";

@XendraTrl(Identifier="a91561f0-89f7-e4b4-3700-3a622775eb0b")
public static String es_PE_FIELD_Shipment_Weight_Name="Peso";
@XendraField(AD_Column_ID="Weight",
IsCentrallyMaintained=true,AD_Tab_ID="301afa71-2a4c-179a-1524-e4657d76a205",AD_FieldGroup_ID="",
IsDisplayed=false,DisplayLogic="",DisplayLength=22,IsReadOnly=false,SeqNo=0,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="a91561f0-89f7-e4b4-3700-3a622775eb0b")
public static final String FIELDNAME_Shipment_Weight="a91561f0-89f7-e4b4-3700-3a622775eb0b";

@XendraTrl(Identifier="e8a66fff-2682-3c2b-26f5-ab4ec9e4fef0")
public static String es_PE_COLUMN_Weight_Name="Peso";

@XendraColumn(AD_Element_ID="712867f4-95e8-b3a8-b07b-f884a12efbb4",ColumnName="Weight",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e8a66fff-2682-3c2b-26f5-ab4ec9e4fef0",
Synchronized="2017-08-05 16:55:08.0")
/** Column name Weight */
public static final String COLUMNNAME_Weight = "Weight";
}
