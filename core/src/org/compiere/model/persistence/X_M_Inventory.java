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
import org.compiere.model.reference.REF__DocumentAction;
import org.compiere.model.reference.REF__DocumentStatus;
/** Generated Model for M_Inventory
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_M_Inventory extends PO
{
/** Standard Constructor
@param ctx context
@param M_Inventory_ID id
@param trxName transaction
*/
public X_M_Inventory (Properties ctx, int M_Inventory_ID, String trxName)
{
super (ctx, M_Inventory_ID, trxName);
/** if (M_Inventory_ID == 0)
{
setC_DocType_ID (0);
setDocAction (null);	
// CO
setDocStatus (null);	
// DR
setDocumentNo (null);
setIsApproved (false);	
// N
setM_Inventory_ID (0);
setMovementDate (new Timestamp(System.currentTimeMillis()));	
// @#Date@
setM_Warehouse_ID (0);
setPosted (false);
setProcessed (false);	
// N
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_M_Inventory (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=321 */
public static int Table_ID=MTable.getTable_ID("M_Inventory");

@XendraTrl(Identifier="1974faf3-e1de-1b7d-de14-978310cbda43")
public static String es_PE_TAB_InternalUse_Description="Define uso interno del inventario";

@XendraTrl(Identifier="1974faf3-e1de-1b7d-de14-978310cbda43")
public static String es_PE_TAB_InternalUse_Name="Inventario, Uso Interno ";

@XendraTab(Name="Internal Use",Description="Define Internal Use Inventory",Help="",
AD_Window_ID="b293be42-ad17-266d-d98c-612c2bfd5d35",SeqNo=10,TabLevel=0,IsSingleRow=true,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",
AD_Process_ID="1183a526-291b-df12-f6a3-1814defc10ad",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="1974faf3-e1de-1b7d-de14-978310cbda43",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_InternalUse="1974faf3-e1de-1b7d-de14-978310cbda43";

@XendraTrl(Identifier="aeda3d7f-69c1-a7b9-05a5-eaf352404f5d")
public static String es_PE_TAB_InventoryCount_Description="Definir conteo del inventario";

@XendraTrl(Identifier="aeda3d7f-69c1-a7b9-05a5-eaf352404f5d")
public static String es_PE_TAB_InventoryCount_Name="Conteo de Inventario";

@XendraTrl(Identifier="aeda3d7f-69c1-a7b9-05a5-eaf352404f5d")
public static String es_PE_TAB_InventoryCount_Help="La pestaña Conteo del Inventario define los parámetros para un conteo manual y ajuste del inventario.";

@XendraTab(Name="Inventory Count",Description="Define Inventory Count",
Help="The Inventory Count Tab defines the parameters for a manual count and adjustment of inventory.  When creating the inventory count list automatically, only the actual stored products are included. The exception is when you select the equals 0 (=0) option, then zero on hand records of all stocked products is created for that location.",
AD_Window_ID="a8fe7291-40b1-7bfb-fc66-0a724a144092",SeqNo=10,TabLevel=0,IsSingleRow=true,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",
AD_Process_ID="1183a526-291b-df12-f6a3-1814defc10ad",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="aeda3d7f-69c1-a7b9-05a5-eaf352404f5d",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_InventoryCount="aeda3d7f-69c1-a7b9-05a5-eaf352404f5d";

@XendraTrl(Identifier="1c7507ad-a889-efc9-fbf9-42cb4f81dcb1")
public static String es_PE_TABLE_M_Inventory_Name="Inventario Físico";

@XendraTable(Name="Phys.Inventory",Description="Parameters for a Physical Inventory",Help="",
TableName="M_Inventory",AccessLevel="1",AD_Window_ID="a8fe7291-40b1-7bfb-fc66-0a724a144092",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=130,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=false,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.material",
Identifier="1c7507ad-a889-efc9-fbf9-42cb4f81dcb1",Synchronized="2017-08-16 11:43:17.0")
/** TableName=M_Inventory */
public static final String Table_Name="M_Inventory";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"M_Inventory");

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
    Table_ID = MTable.getTable_ID("M_Inventory");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_M_Inventory[").append(get_ID()).append("]");
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

@XendraTrl(Identifier="bb5912f1-257f-9efd-4184-eebf04ffe0d4")
public static String es_PE_FIELD_InventoryCount_TrxOrganization_Description="Organización que inicia ó ejecuta la transacción";

@XendraTrl(Identifier="bb5912f1-257f-9efd-4184-eebf04ffe0d4")
public static String es_PE_FIELD_InventoryCount_TrxOrganization_Help="La organización que inicia ó ejecuta la transacción (para otra organización). La organización poseedora puede no ser la organización de la transacción en un ambiente de buró de servicio; con servicios centralizados y transacciones inter- organización.";

@XendraTrl(Identifier="bb5912f1-257f-9efd-4184-eebf04ffe0d4")
public static String es_PE_FIELD_InventoryCount_TrxOrganization_Name="Organización de la Trans.";

@XendraField(AD_Column_ID="AD_OrgTrx_ID",IsCentrallyMaintained=true,
AD_Tab_ID="aeda3d7f-69c1-a7b9-05a5-eaf352404f5d",AD_FieldGroup_ID="Reference",IsDisplayed=true,
DisplayLogic="@$Element_OT@=Y",DisplayLength=14,IsReadOnly=false,SeqNo=110,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="bb5912f1-257f-9efd-4184-eebf04ffe0d4")
public static final String FIELDNAME_InventoryCount_TrxOrganization="bb5912f1-257f-9efd-4184-eebf04ffe0d4";

@XendraTrl(Identifier="95e235c3-5027-2f7f-7268-832503d6f041")
public static String es_PE_FIELD_InternalUse_TrxOrganization_Description="Organización que inicia ó ejecuta la transacción";

@XendraTrl(Identifier="95e235c3-5027-2f7f-7268-832503d6f041")
public static String es_PE_FIELD_InternalUse_TrxOrganization_Help="La organización que inicia ó ejecuta la transacción (para otra organización). La organización poseedora puede no ser la organización de la transacción en un ambiente de buró de servicio; con servicios centralizados y transacciones inter- organización.";

@XendraTrl(Identifier="95e235c3-5027-2f7f-7268-832503d6f041")
public static String es_PE_FIELD_InternalUse_TrxOrganization_Name="Organización de la Trans.";

@XendraField(AD_Column_ID="AD_OrgTrx_ID",IsCentrallyMaintained=true,
AD_Tab_ID="1974faf3-e1de-1b7d-de14-978310cbda43",AD_FieldGroup_ID="Reference",IsDisplayed=true,
DisplayLogic="@$Element_OT@=Y",DisplayLength=14,IsReadOnly=false,SeqNo=110,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="95e235c3-5027-2f7f-7268-832503d6f041")
public static final String FIELDNAME_InternalUse_TrxOrganization="95e235c3-5027-2f7f-7268-832503d6f041";

@XendraTrl(Identifier="c652376e-e27d-2cf1-30e9-c137a03a70af")
public static String es_PE_COLUMN_AD_OrgTrx_ID_Name="Organización de la Trans.";

@XendraColumn(AD_Element_ID="b4180358-67aa-fe55-0409-6367a60e0a2e",ColumnName="AD_OrgTrx_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="54e78591-f7f4-c613-ea27-e64b3dac5198",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="c652376e-e27d-2cf1-30e9-c137a03a70af",Synchronized="2017-08-05 16:55:12.0")
/** Column name AD_OrgTrx_ID */
public static final String COLUMNNAME_AD_OrgTrx_ID = "AD_OrgTrx_ID";
/** Set Approval Amount.
@param ApprovalAmt Document Approval Amount */
public void setApprovalAmt (BigDecimal ApprovalAmt)
{
set_Value (COLUMNNAME_ApprovalAmt, ApprovalAmt);
}
/** Get Approval Amount.
@return Document Approval Amount */
public BigDecimal getApprovalAmt() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_ApprovalAmt);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="0a70e25f-07cf-5fab-f5ff-c1dfef5f8c63")
public static String es_PE_FIELD_InventoryCount_ApprovalAmount_Description="Documento de importe aprobado";

@XendraTrl(Identifier="0a70e25f-07cf-5fab-f5ff-c1dfef5f8c63")
public static String es_PE_FIELD_InventoryCount_ApprovalAmount_Help="Cantidad de la aprobación para el Flujo de trabajo";

@XendraTrl(Identifier="0a70e25f-07cf-5fab-f5ff-c1dfef5f8c63")
public static String es_PE_FIELD_InventoryCount_ApprovalAmount_Name="Importe Aprobado";

@XendraField(AD_Column_ID="ApprovalAmt",IsCentrallyMaintained=true,
AD_Tab_ID="aeda3d7f-69c1-a7b9-05a5-eaf352404f5d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=150,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0a70e25f-07cf-5fab-f5ff-c1dfef5f8c63")
public static final String FIELDNAME_InventoryCount_ApprovalAmount="0a70e25f-07cf-5fab-f5ff-c1dfef5f8c63";

@XendraTrl(Identifier="c6a796d6-e1b0-78dc-3b68-8b1378c23bfd")
public static String es_PE_FIELD_InternalUse_ApprovalAmount_Description="Documento de importe aprobado";

@XendraTrl(Identifier="c6a796d6-e1b0-78dc-3b68-8b1378c23bfd")
public static String es_PE_FIELD_InternalUse_ApprovalAmount_Help="Cantidad de la aprobación para el Flujo de trabajo";

@XendraTrl(Identifier="c6a796d6-e1b0-78dc-3b68-8b1378c23bfd")
public static String es_PE_FIELD_InternalUse_ApprovalAmount_Name="Importe Aprobado";

@XendraField(AD_Column_ID="ApprovalAmt",IsCentrallyMaintained=true,
AD_Tab_ID="1974faf3-e1de-1b7d-de14-978310cbda43",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=150,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c6a796d6-e1b0-78dc-3b68-8b1378c23bfd")
public static final String FIELDNAME_InternalUse_ApprovalAmount="c6a796d6-e1b0-78dc-3b68-8b1378c23bfd";

@XendraTrl(Identifier="07b0c467-77e0-c1f4-bb02-85313c43129a")
public static String es_PE_COLUMN_ApprovalAmt_Name="Importe Aprobado";

@XendraColumn(AD_Element_ID="fd13a366-3264-4b86-b3f3-66490833103d",ColumnName="ApprovalAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="07b0c467-77e0-c1f4-bb02-85313c43129a",
Synchronized="2017-08-05 16:55:12.0")
/** Column name ApprovalAmt */
public static final String COLUMNNAME_ApprovalAmt = "ApprovalAmt";
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

@XendraTrl(Identifier="39f8c021-8b9f-8adc-50fb-038db948a9a1")
public static String es_PE_FIELD_InventoryCount_Activity_Description="Actividad de Negocio";

@XendraTrl(Identifier="39f8c021-8b9f-8adc-50fb-038db948a9a1")
public static String es_PE_FIELD_InventoryCount_Activity_Help="Las actividades indican tareas que son ejecutadas en el curso de un negocio; las actividades son usadas para el costeo por actividad (ABC)";

@XendraTrl(Identifier="39f8c021-8b9f-8adc-50fb-038db948a9a1")
public static String es_PE_FIELD_InventoryCount_Activity_Name="Tipo de Gasto";

@XendraField(AD_Column_ID="C_Activity_ID",IsCentrallyMaintained=true,
AD_Tab_ID="aeda3d7f-69c1-a7b9-05a5-eaf352404f5d",AD_FieldGroup_ID="Reference",IsDisplayed=true,
DisplayLogic="@$Element_AY@=Y",DisplayLength=14,IsReadOnly=false,SeqNo=100,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="39f8c021-8b9f-8adc-50fb-038db948a9a1")
public static final String FIELDNAME_InventoryCount_Activity="39f8c021-8b9f-8adc-50fb-038db948a9a1";

@XendraTrl(Identifier="11a8bece-9248-adca-a522-82d31cb35867")
public static String es_PE_FIELD_InternalUse_Activity_Description="Actividad de Negocio";

@XendraTrl(Identifier="11a8bece-9248-adca-a522-82d31cb35867")
public static String es_PE_FIELD_InternalUse_Activity_Help="Las actividades indican tareas que son ejecutadas en el curso de un negocio; las actividades son usadas para el costeo por actividad (ABC)";

@XendraTrl(Identifier="11a8bece-9248-adca-a522-82d31cb35867")
public static String es_PE_FIELD_InternalUse_Activity_Name="Tipo de Gasto";

@XendraField(AD_Column_ID="C_Activity_ID",IsCentrallyMaintained=true,
AD_Tab_ID="1974faf3-e1de-1b7d-de14-978310cbda43",AD_FieldGroup_ID="Reference",IsDisplayed=true,
DisplayLogic="@$Element_AY@=Y",DisplayLength=14,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="11a8bece-9248-adca-a522-82d31cb35867")
public static final String FIELDNAME_InternalUse_Activity="11a8bece-9248-adca-a522-82d31cb35867";

@XendraTrl(Identifier="6877e646-21a6-20f8-3bf4-c00727576b3b")
public static String es_PE_COLUMN_C_Activity_ID_Name="Tipo de Gasto";

@XendraColumn(AD_Element_ID="bfeadbb3-d866-26e3-8eee-3e2fdf0ff753",ColumnName="C_Activity_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6877e646-21a6-20f8-3bf4-c00727576b3b",
Synchronized="2017-08-05 16:55:12.0")
/** Column name C_Activity_ID */
public static final String COLUMNNAME_C_Activity_ID = "C_Activity_ID";
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

@XendraTrl(Identifier="1c411817-cd88-4dee-6702-e80f04bec598")
public static String es_PE_FIELD_InventoryCount_Campaign_Description="Campaña de Mercadeo";

@XendraTrl(Identifier="1c411817-cd88-4dee-6702-e80f04bec598")
public static String es_PE_FIELD_InventoryCount_Campaign_Help="La Campaña define un programa de mercadotecnia único. Los proyectos pueden estar asociados con una campaña de mercadotecnia única. Usted puede entonces reportar basado en una campaña específica";

@XendraTrl(Identifier="1c411817-cd88-4dee-6702-e80f04bec598")
public static String es_PE_FIELD_InventoryCount_Campaign_Name="Campaña";

@XendraField(AD_Column_ID="C_Campaign_ID",IsCentrallyMaintained=true,
AD_Tab_ID="aeda3d7f-69c1-a7b9-05a5-eaf352404f5d",AD_FieldGroup_ID="Reference",IsDisplayed=false,
DisplayLogic="@$Element_MC@=Y",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1c411817-cd88-4dee-6702-e80f04bec598")
public static final String FIELDNAME_InventoryCount_Campaign="1c411817-cd88-4dee-6702-e80f04bec598";

@XendraTrl(Identifier="379b4127-728f-8b64-c4d8-e485d29c1d55")
public static String es_PE_FIELD_InternalUse_Campaign_Description="Campaña de Mercadeo";

@XendraTrl(Identifier="379b4127-728f-8b64-c4d8-e485d29c1d55")
public static String es_PE_FIELD_InternalUse_Campaign_Help="La Campaña define un programa de mercadotecnia único. Los proyectos pueden estar asociados con una campaña de mercadotecnia única. Usted puede entonces reportar basado en una campaña específica";

@XendraTrl(Identifier="379b4127-728f-8b64-c4d8-e485d29c1d55")
public static String es_PE_FIELD_InternalUse_Campaign_Name="Campaña";

@XendraField(AD_Column_ID="C_Campaign_ID",IsCentrallyMaintained=true,
AD_Tab_ID="1974faf3-e1de-1b7d-de14-978310cbda43",AD_FieldGroup_ID="Reference",IsDisplayed=true,
DisplayLogic="@$Element_MC@=Y",DisplayLength=14,IsReadOnly=false,SeqNo=100,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="379b4127-728f-8b64-c4d8-e485d29c1d55")
public static final String FIELDNAME_InternalUse_Campaign="379b4127-728f-8b64-c4d8-e485d29c1d55";

@XendraTrl(Identifier="80f4beab-0ad6-3485-0d17-1720ead767e4")
public static String es_PE_COLUMN_C_Campaign_ID_Name="Campaña";

@XendraColumn(AD_Element_ID="6cf08e31-d355-ee38-9c0b-bee20b3ea5b6",ColumnName="C_Campaign_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="80f4beab-0ad6-3485-0d17-1720ead767e4",
Synchronized="2017-08-05 16:55:12.0")
/** Column name C_Campaign_ID */
public static final String COLUMNNAME_C_Campaign_ID = "C_Campaign_ID";
/** Set Document Type.
@param C_DocType_ID Document type or rules */
public void setC_DocType_ID (int C_DocType_ID)
{
if (C_DocType_ID < 0) throw new IllegalArgumentException ("C_DocType_ID is mandatory.");
set_Value (COLUMNNAME_C_DocType_ID, Integer.valueOf(C_DocType_ID));
}
/** Get Document Type.
@return Document type or rules */
public int getC_DocType_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_DocType_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="1ea8e266-720e-d080-3e78-55b4b6124fd4")
public static String es_PE_FIELD_InventoryCount_DocumentType_Description="Tipo de documento ó reglas";

@XendraTrl(Identifier="1ea8e266-720e-d080-3e78-55b4b6124fd4")
public static String es_PE_FIELD_InventoryCount_DocumentType_Help="El tipo de documento determina la secuencia del documento y las reglas de proceso";

@XendraTrl(Identifier="1ea8e266-720e-d080-3e78-55b4b6124fd4")
public static String es_PE_FIELD_InventoryCount_DocumentType_Name="Tipo de Documento";

@XendraField(AD_Column_ID="C_DocType_ID",IsCentrallyMaintained=true,
AD_Tab_ID="aeda3d7f-69c1-a7b9-05a5-eaf352404f5d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1ea8e266-720e-d080-3e78-55b4b6124fd4")
public static final String FIELDNAME_InventoryCount_DocumentType="1ea8e266-720e-d080-3e78-55b4b6124fd4";

@XendraTrl(Identifier="6958fa36-af2e-09a3-19e7-457b90b0794e")
public static String es_PE_FIELD_InternalUse_DocumentType_Description="Tipo de documento ó reglas";

@XendraTrl(Identifier="6958fa36-af2e-09a3-19e7-457b90b0794e")
public static String es_PE_FIELD_InternalUse_DocumentType_Help="El tipo de documento determina la secuencia del documento y las reglas de proceso";

@XendraTrl(Identifier="6958fa36-af2e-09a3-19e7-457b90b0794e")
public static String es_PE_FIELD_InternalUse_DocumentType_Name="Tipo de Documento";

@XendraField(AD_Column_ID="C_DocType_ID",IsCentrallyMaintained=true,
AD_Tab_ID="1974faf3-e1de-1b7d-de14-978310cbda43",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6958fa36-af2e-09a3-19e7-457b90b0794e")
public static final String FIELDNAME_InternalUse_DocumentType="6958fa36-af2e-09a3-19e7-457b90b0794e";

@XendraTrl(Identifier="a585f69f-d82e-8c36-9728-7fd51a5797d5")
public static String es_PE_COLUMN_C_DocType_ID_Name="Tipo de Documento";

@XendraColumn(AD_Element_ID="099a4147-1a72-cdd0-81e0-8bdbc8c0b883",ColumnName="C_DocType_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="1fa9d307-259c-57fb-38a4-ee982d81be31",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=true,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="a585f69f-d82e-8c36-9728-7fd51a5797d5",Synchronized="2017-08-05 16:55:12.0")
/** Column name C_DocType_ID */
public static final String COLUMNNAME_C_DocType_ID = "C_DocType_ID";
/** Set C_GroupDoc_ID.
@param C_GroupDoc_ID C_GroupDoc_ID */
public void setC_GroupDoc_ID (int C_GroupDoc_ID)
{
if (C_GroupDoc_ID <= 0) set_Value (COLUMNNAME_C_GroupDoc_ID, null);
 else 
set_Value (COLUMNNAME_C_GroupDoc_ID, Integer.valueOf(C_GroupDoc_ID));
}
/** Get C_GroupDoc_ID.
@return C_GroupDoc_ID */
public int getC_GroupDoc_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_GroupDoc_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="32a897d9-3821-bee3-1d40-361eb37ee426")
public static String es_PE_COLUMN_C_GroupDoc_ID_Name="C_GroupDoc_ID";

@XendraColumn(AD_Element_ID="6376cf94-c145-e9e0-11ce-5b020ca6bff7",ColumnName="C_GroupDoc_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="32a897d9-3821-bee3-1d40-361eb37ee426",
Synchronized="2017-08-05 16:55:13.0")
/** Column name C_GroupDoc_ID */
public static final String COLUMNNAME_C_GroupDoc_ID = "C_GroupDoc_ID";
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

@XendraTrl(Identifier="5e6be8d1-7f1d-8004-87ee-303ba7c05a1a")
public static String es_PE_FIELD_InventoryCount_Project_Description="Identifica un proyecto único";

@XendraTrl(Identifier="5e6be8d1-7f1d-8004-87ee-303ba7c05a1a")
public static String es_PE_FIELD_InventoryCount_Project_Help="La ID de un proyecto es un identificador definido por el usuario para un proyecto";

@XendraTrl(Identifier="5e6be8d1-7f1d-8004-87ee-303ba7c05a1a")
public static String es_PE_FIELD_InventoryCount_Project_Name="Proyecto";

@XendraField(AD_Column_ID="C_Project_ID",IsCentrallyMaintained=true,
AD_Tab_ID="aeda3d7f-69c1-a7b9-05a5-eaf352404f5d",AD_FieldGroup_ID="Reference",IsDisplayed=false,
DisplayLogic="@$Element_PJ@=Y",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5e6be8d1-7f1d-8004-87ee-303ba7c05a1a")
public static final String FIELDNAME_InventoryCount_Project="5e6be8d1-7f1d-8004-87ee-303ba7c05a1a";

@XendraTrl(Identifier="1d738064-fea7-dff4-b7db-c07968b4430d")
public static String es_PE_FIELD_InternalUse_Project_Description="Identifica un proyecto único";

@XendraTrl(Identifier="1d738064-fea7-dff4-b7db-c07968b4430d")
public static String es_PE_FIELD_InternalUse_Project_Help="La ID de un proyecto es un identificador definido por el usuario para un proyecto";

@XendraTrl(Identifier="1d738064-fea7-dff4-b7db-c07968b4430d")
public static String es_PE_FIELD_InternalUse_Project_Name="Proyecto";

@XendraField(AD_Column_ID="C_Project_ID",IsCentrallyMaintained=true,
AD_Tab_ID="1974faf3-e1de-1b7d-de14-978310cbda43",AD_FieldGroup_ID="Reference",IsDisplayed=true,
DisplayLogic="@$Element_PJ@=Y",DisplayLength=14,IsReadOnly=false,SeqNo=80,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="1d738064-fea7-dff4-b7db-c07968b4430d")
public static final String FIELDNAME_InternalUse_Project="1d738064-fea7-dff4-b7db-c07968b4430d";

@XendraTrl(Identifier="2e5cee26-00a7-7807-462e-6c46b7ee6469")
public static String es_PE_COLUMN_C_Project_ID_Name="Proyecto";

@XendraColumn(AD_Element_ID="16ff5dcc-9178-73dd-e618-e88bd79d573b",ColumnName="C_Project_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2e5cee26-00a7-7807-462e-6c46b7ee6469",
Synchronized="2017-08-05 16:55:13.0")
/** Column name C_Project_ID */
public static final String COLUMNNAME_C_Project_ID = "C_Project_ID";
/** Set Account Date.
@param DateAcct Accounting Date */
public void setDateAcct (Timestamp DateAcct)
{
set_Value (COLUMNNAME_DateAcct, DateAcct);
}
/** Get Account Date.
@return Accounting Date */
public Timestamp getDateAcct() 
{
return (Timestamp)get_Value(COLUMNNAME_DateAcct);
}

@XendraTrl(Identifier="5b941007-9b6f-4d3f-aa9f-3b4634f80363")
public static String es_PE_COLUMN_DateAcct_Name="dateacct";

@XendraColumn(AD_Element_ID="034727d0-e80f-fadf-3d4f-2d8d37b75669",ColumnName="DateAcct",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=29,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5b941007-9b6f-4d3f-aa9f-3b4634f80363",
Synchronized="2017-08-05 16:55:13.0")
/** Column name DateAcct */
public static final String COLUMNNAME_DateAcct = "DateAcct";
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

@XendraTrl(Identifier="a58ab655-576f-3426-51fa-7ba904a1c53b")
public static String es_PE_FIELD_InventoryCount_Description_Description="Descripción corta opcional del registro";

@XendraTrl(Identifier="a58ab655-576f-3426-51fa-7ba904a1c53b")
public static String es_PE_FIELD_InventoryCount_Description_Help="Una descripción esta limitada a 255 caracteres";

@XendraTrl(Identifier="a58ab655-576f-3426-51fa-7ba904a1c53b")
public static String es_PE_FIELD_InventoryCount_Description_Name="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="aeda3d7f-69c1-a7b9-05a5-eaf352404f5d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a58ab655-576f-3426-51fa-7ba904a1c53b")
public static final String FIELDNAME_InventoryCount_Description="a58ab655-576f-3426-51fa-7ba904a1c53b";

@XendraTrl(Identifier="bf7da060-080d-25d0-a688-13686f476a6f")
public static String es_PE_FIELD_InternalUse_Description_Description="Observación";

@XendraTrl(Identifier="bf7da060-080d-25d0-a688-13686f476a6f")
public static String es_PE_FIELD_InternalUse_Description_Help="Observación";

@XendraTrl(Identifier="bf7da060-080d-25d0-a688-13686f476a6f")
public static String es_PE_FIELD_InternalUse_Description_Name="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="1974faf3-e1de-1b7d-de14-978310cbda43",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="bf7da060-080d-25d0-a688-13686f476a6f")
public static final String FIELDNAME_InternalUse_Description="bf7da060-080d-25d0-a688-13686f476a6f";

@XendraTrl(Identifier="325fbf89-767d-748e-6b82-65e8f09b6db7")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=true,ColumnSQL="",
IsAllowLogging=false,Identifier="325fbf89-767d-748e-6b82-65e8f09b6db7",
Synchronized="2017-08-05 16:55:13.0")
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

@XendraTrl(Identifier="e5e633fc-e685-68d7-91ed-682a3c0ecb4f")
public static String es_PE_FIELD_InventoryCount_ProcessInventoryCount_Description="Procesar conteo físico y actualizar el inventario";

@XendraTrl(Identifier="e5e633fc-e685-68d7-91ed-682a3c0ecb4f")
public static String es_PE_FIELD_InventoryCount_ProcessInventoryCount_Name="Procesar Conteo Físico";

@XendraField(AD_Column_ID="DocAction",IsCentrallyMaintained=true,
AD_Tab_ID="aeda3d7f-69c1-a7b9-05a5-eaf352404f5d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=170,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e5e633fc-e685-68d7-91ed-682a3c0ecb4f")
public static final String FIELDNAME_InventoryCount_ProcessInventoryCount="e5e633fc-e685-68d7-91ed-682a3c0ecb4f";

@XendraTrl(Identifier="33f87195-c525-41be-3552-3a6d17ece2e2")
public static String es_PE_FIELD_InternalUse_ProcessInventoryCount_Description="Procesar conteo físico y actualizar el inventario";

@XendraTrl(Identifier="33f87195-c525-41be-3552-3a6d17ece2e2")
public static String es_PE_FIELD_InternalUse_ProcessInventoryCount_Name="Procesar Conteo Físico";

@XendraField(AD_Column_ID="DocAction",IsCentrallyMaintained=true,
AD_Tab_ID="1974faf3-e1de-1b7d-de14-978310cbda43",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=170,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="33f87195-c525-41be-3552-3a6d17ece2e2")
public static final String FIELDNAME_InternalUse_ProcessInventoryCount="33f87195-c525-41be-3552-3a6d17ece2e2";

@XendraTrl(Identifier="ca13f6c5-1412-c64d-2b91-b05b58b87f59")
public static String es_PE_COLUMN_DocAction_Name="Acción en el Documento";

@XendraColumn(AD_Element_ID="d4b9075b-18e5-ebbb-5565-d217a7e531cb",ColumnName="DocAction",
AD_Reference_ID=28,AD_Reference_Value_ID="e397c9b0-c643-d1cd-8380-20bee13b2a6e",AD_Val_Rule_ID="",
FieldLength=2,DefaultValue="CO",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,
AD_Process_ID="af89c9fc-f513-1d61-47d1-138440c69f44",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ca13f6c5-1412-c64d-2b91-b05b58b87f59",
Synchronized="2017-08-05 16:55:13.0")
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

@XendraTrl(Identifier="20bc49c9-bc6c-267d-18b4-9fd5743cf1d5")
public static String es_PE_FIELD_InventoryCount_DocumentStatus_Description="El estado actual del documento";

@XendraTrl(Identifier="20bc49c9-bc6c-267d-18b4-9fd5743cf1d5")
public static String es_PE_FIELD_InventoryCount_DocumentStatus_Help="El estado del documento indica el estado del documento en este momento. Si usted quiere cambiar el estado de Documento; use el campo acción de documento";

@XendraTrl(Identifier="20bc49c9-bc6c-267d-18b4-9fd5743cf1d5")
public static String es_PE_FIELD_InventoryCount_DocumentStatus_Name="Estado del Documento";

@XendraField(AD_Column_ID="DocStatus",IsCentrallyMaintained=true,
AD_Tab_ID="aeda3d7f-69c1-a7b9-05a5-eaf352404f5d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=160,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="20bc49c9-bc6c-267d-18b4-9fd5743cf1d5")
public static final String FIELDNAME_InventoryCount_DocumentStatus="20bc49c9-bc6c-267d-18b4-9fd5743cf1d5";

@XendraTrl(Identifier="6475582d-8fa6-535e-1eee-9bd6c66aa8b0")
public static String es_PE_FIELD_InternalUse_DocumentStatus_Description="El estado actual del documento";

@XendraTrl(Identifier="6475582d-8fa6-535e-1eee-9bd6c66aa8b0")
public static String es_PE_FIELD_InternalUse_DocumentStatus_Help="El estado del documento indica el estado del documento en este momento. Si usted quiere cambiar el estado de Documento; use el campo acción de documento";

@XendraTrl(Identifier="6475582d-8fa6-535e-1eee-9bd6c66aa8b0")
public static String es_PE_FIELD_InternalUse_DocumentStatus_Name="Estado del Documento";

@XendraField(AD_Column_ID="DocStatus",IsCentrallyMaintained=true,
AD_Tab_ID="1974faf3-e1de-1b7d-de14-978310cbda43",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=160,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6475582d-8fa6-535e-1eee-9bd6c66aa8b0")
public static final String FIELDNAME_InternalUse_DocumentStatus="6475582d-8fa6-535e-1eee-9bd6c66aa8b0";

@XendraTrl(Identifier="d70feab2-03bc-a5cc-e8ef-b7e9b8893470")
public static String es_PE_COLUMN_DocStatus_Name="Estado del Documento";

@XendraColumn(AD_Element_ID="e73fa537-3438-bd01-dfd4-f0f080a28c55",ColumnName="DocStatus",
AD_Reference_ID=17,AD_Reference_Value_ID="7627125d-fefe-e6bc-bb7d-4a6c772172dc",AD_Val_Rule_ID="",
FieldLength=2,DefaultValue="DR",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="d70feab2-03bc-a5cc-e8ef-b7e9b8893470",Synchronized="2017-08-05 16:55:13.0")
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

@XendraTrl(Identifier="8ec8340d-9ec2-92a0-23dc-fe21cffe865b")
public static String es_PE_FIELD_InventoryCount_DocumentNo_Description="Número de secuencia del documento para cada documento";

@XendraTrl(Identifier="8ec8340d-9ec2-92a0-23dc-fe21cffe865b")
public static String es_PE_FIELD_InventoryCount_DocumentNo_Help="El número del documento es usualmente generado en automático por el sistema y determinado por el tipo del documento. Si el documento no se salva; el número preliminar se despliega entre \"<>\"";

@XendraTrl(Identifier="8ec8340d-9ec2-92a0-23dc-fe21cffe865b")
public static String es_PE_FIELD_InventoryCount_DocumentNo_Name="No. del Documento";

@XendraField(AD_Column_ID="DocumentNo",IsCentrallyMaintained=true,
AD_Tab_ID="aeda3d7f-69c1-a7b9-05a5-eaf352404f5d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=30,SortNo=-1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8ec8340d-9ec2-92a0-23dc-fe21cffe865b")
public static final String FIELDNAME_InventoryCount_DocumentNo="8ec8340d-9ec2-92a0-23dc-fe21cffe865b";

@XendraTrl(Identifier="8ce0e34a-a1a1-6a87-1e87-9e18d24847ef")
public static String es_PE_FIELD_InternalUse_DocumentNo_Description="Número de secuencia del documento para cada documento";

@XendraTrl(Identifier="8ce0e34a-a1a1-6a87-1e87-9e18d24847ef")
public static String es_PE_FIELD_InternalUse_DocumentNo_Help="El número del documento es usualmente generado en automático por el sistema y determinado por el tipo del documento. Si el documento no se salva; el número preliminar se despliega entre \"<>\"";

@XendraTrl(Identifier="8ce0e34a-a1a1-6a87-1e87-9e18d24847ef")
public static String es_PE_FIELD_InternalUse_DocumentNo_Name="No. del Documento";

@XendraField(AD_Column_ID="DocumentNo",IsCentrallyMaintained=true,
AD_Tab_ID="1974faf3-e1de-1b7d-de14-978310cbda43",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=30,SortNo=-1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8ce0e34a-a1a1-6a87-1e87-9e18d24847ef")
public static final String FIELDNAME_InternalUse_DocumentNo="8ce0e34a-a1a1-6a87-1e87-9e18d24847ef";

@XendraTrl(Identifier="d9c2b7d6-76fd-ff2a-6ccc-5f0668215dbd")
public static String es_PE_COLUMN_DocumentNo_Name="No. del Documento";

@XendraColumn(AD_Element_ID="e3ca6e28-702a-2722-d941-b2072a0de9cb",ColumnName="DocumentNo",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=30,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d9c2b7d6-76fd-ff2a-6ccc-5f0668215dbd",
Synchronized="2017-08-05 16:55:13.0")
/** Column name DocumentNo */
public static final String COLUMNNAME_DocumentNo = "DocumentNo";
/** Set Generate List.
@param GenerateList Generate List */
public void setGenerateList (String GenerateList)
{
if (GenerateList != null && GenerateList.length() > 1)
{
log.warning("Length > 1 - truncated");
GenerateList = GenerateList.substring(0,0);
}
set_Value (COLUMNNAME_GenerateList, GenerateList);
}
/** Get Generate List.
@return Generate List */
public String getGenerateList() 
{
return (String)get_Value(COLUMNNAME_GenerateList);
}

@XendraTrl(Identifier="3b1f5b65-bc72-41cb-713c-d3e8a1f43a87")
public static String es_PE_FIELD_InventoryCount_GenerateList_Description="Crear lista de conteo físico del inventario";

@XendraTrl(Identifier="3b1f5b65-bc72-41cb-713c-d3e8a1f43a87")
public static String es_PE_FIELD_InventoryCount_GenerateList_Help="Las líneas de conteo físico del inventario son generadas. Se puede adicionar o borrar líneas";

@XendraTrl(Identifier="3b1f5b65-bc72-41cb-713c-d3e8a1f43a87")
public static String es_PE_FIELD_InventoryCount_GenerateList_Name="Crear Lista de Conteo Físico";

@XendraField(AD_Column_ID="GenerateList",IsCentrallyMaintained=true,
AD_Tab_ID="aeda3d7f-69c1-a7b9-05a5-eaf352404f5d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3b1f5b65-bc72-41cb-713c-d3e8a1f43a87")
public static final String FIELDNAME_InventoryCount_GenerateList="3b1f5b65-bc72-41cb-713c-d3e8a1f43a87";

@XendraTrl(Identifier="f4e73b38-30b6-f31a-42aa-7d344b7410d6")
public static String es_PE_FIELD_InternalUse_GenerateList_Description="Crear lista de conteo físico del inventario";

@XendraTrl(Identifier="f4e73b38-30b6-f31a-42aa-7d344b7410d6")
public static String es_PE_FIELD_InternalUse_GenerateList_Help="Las líneas de conteo físico del inventario son generadas. Se puede adicionar o borrar líneas";

@XendraTrl(Identifier="f4e73b38-30b6-f31a-42aa-7d344b7410d6")
public static String es_PE_FIELD_InternalUse_GenerateList_Name="Crear Lista de Conteo Físico";

@XendraField(AD_Column_ID="GenerateList",IsCentrallyMaintained=true,
AD_Tab_ID="1974faf3-e1de-1b7d-de14-978310cbda43",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f4e73b38-30b6-f31a-42aa-7d344b7410d6")
public static final String FIELDNAME_InternalUse_GenerateList="f4e73b38-30b6-f31a-42aa-7d344b7410d6";

@XendraTrl(Identifier="0fc33ad0-1955-4904-289e-82eff012678c")
public static String es_PE_COLUMN_GenerateList_Name="Generar Lista";

@XendraColumn(AD_Element_ID="e4e10ef9-3eb5-b4f0-f2f2-36359b60e1e7",ColumnName="GenerateList",
AD_Reference_ID=28,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="ae85e325-f1ca-9259-d0ee-84b04668afe5",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="0fc33ad0-1955-4904-289e-82eff012678c",Synchronized="2017-08-05 16:55:13.0")
/** Column name GenerateList */
public static final String COLUMNNAME_GenerateList = "GenerateList";
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
@XendraTrl(Identifier="e4fc5590-82ba-4bd2-827f-a49f08bd06d3")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e4fc5590-82ba-4bd2-827f-a49f08bd06d3",
Synchronized="2017-08-05 16:55:13.0")
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

@XendraTrl(Identifier="f0d8e9ab-e2f7-e942-35f4-c9459e8f1233")
public static String es_PE_FIELD_InventoryCount_Approved_Description="Indica si este documento requiere aprobación";

@XendraTrl(Identifier="f0d8e9ab-e2f7-e942-35f4-c9459e8f1233")
public static String es_PE_FIELD_InventoryCount_Approved_Help="El Cuadro de Verificación  Aprobado indica si este documento requiere aprobación antes de que pueda ser procesado";

@XendraTrl(Identifier="f0d8e9ab-e2f7-e942-35f4-c9459e8f1233")
public static String es_PE_FIELD_InventoryCount_Approved_Name="Aprobación";

@XendraField(AD_Column_ID="IsApproved",IsCentrallyMaintained=true,
AD_Tab_ID="aeda3d7f-69c1-a7b9-05a5-eaf352404f5d",AD_FieldGroup_ID="Status",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=true,SeqNo=140,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f0d8e9ab-e2f7-e942-35f4-c9459e8f1233")
public static final String FIELDNAME_InventoryCount_Approved="f0d8e9ab-e2f7-e942-35f4-c9459e8f1233";

@XendraTrl(Identifier="79b1885b-1bfd-8e5d-d89b-b540e7cda926")
public static String es_PE_FIELD_InternalUse_Approved_Description="Indica si este documento requiere aprobación";

@XendraTrl(Identifier="79b1885b-1bfd-8e5d-d89b-b540e7cda926")
public static String es_PE_FIELD_InternalUse_Approved_Help="El Cuadro de Verificación  Aprobado indica si este documento requiere aprobación antes de que pueda ser procesado";

@XendraTrl(Identifier="79b1885b-1bfd-8e5d-d89b-b540e7cda926")
public static String es_PE_FIELD_InternalUse_Approved_Name="Aprobación";

@XendraField(AD_Column_ID="IsApproved",IsCentrallyMaintained=true,
AD_Tab_ID="1974faf3-e1de-1b7d-de14-978310cbda43",AD_FieldGroup_ID="Status",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=true,SeqNo=140,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="79b1885b-1bfd-8e5d-d89b-b540e7cda926")
public static final String FIELDNAME_InternalUse_Approved="79b1885b-1bfd-8e5d-d89b-b540e7cda926";

@XendraTrl(Identifier="a24a07fe-ce18-3732-02b6-d245a883dbfb")
public static String es_PE_COLUMN_IsApproved_Name="Aprobación";

@XendraColumn(AD_Element_ID="44388d99-07b7-b005-9e16-78884800beff",ColumnName="IsApproved",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a24a07fe-ce18-3732-02b6-d245a883dbfb",
Synchronized="2017-08-05 16:55:13.0")
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

@XendraTrl(Identifier="7d6f6add-9771-4bdc-989b-5daff2357492")
public static String es_PE_COLUMN_IsCosted_Name="IsCosted";

@XendraColumn(AD_Element_ID="1d2cca33-7933-6933-e8cd-036ca4cb806e",ColumnName="IsCosted",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7d6f6add-9771-4bdc-989b-5daff2357492",
Synchronized="2015-08-11 20:38:27.0")
/** Column name IsCosted */
public static final String COLUMNNAME_IsCosted = "IsCosted";
/** Set Phys.Inventory.
@param M_Inventory_ID Parameters for a Physical Inventory */
public void setM_Inventory_ID (int M_Inventory_ID)
{
if (M_Inventory_ID < 1) throw new IllegalArgumentException ("M_Inventory_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_M_Inventory_ID, Integer.valueOf(M_Inventory_ID));
}
/** Get Phys.Inventory.
@return Parameters for a Physical Inventory */
public int getM_Inventory_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_Inventory_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="9b7713d5-78f7-f67a-617c-c36f0944cc7b")
public static String es_PE_FIELD_InventoryCount_PhysInventory_Description="Parámetros para el inventario físico.";

@XendraTrl(Identifier="9b7713d5-78f7-f67a-617c-c36f0944cc7b")
public static String es_PE_FIELD_InventoryCount_PhysInventory_Help="El inventario físico indica parámetros únicos para el inventario físico.";

@XendraTrl(Identifier="9b7713d5-78f7-f67a-617c-c36f0944cc7b")
public static String es_PE_FIELD_InventoryCount_PhysInventory_Name="Inventario Físico";

@XendraField(AD_Column_ID="M_Inventory_ID",IsCentrallyMaintained=true,
AD_Tab_ID="aeda3d7f-69c1-a7b9-05a5-eaf352404f5d",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9b7713d5-78f7-f67a-617c-c36f0944cc7b")
public static final String FIELDNAME_InventoryCount_PhysInventory="9b7713d5-78f7-f67a-617c-c36f0944cc7b";

@XendraTrl(Identifier="a782ed95-c92c-8417-6517-e966fe1214ae")
public static String es_PE_FIELD_InternalUse_PhysInventory_Description="Parámetros para el inventario físico.";

@XendraTrl(Identifier="a782ed95-c92c-8417-6517-e966fe1214ae")
public static String es_PE_FIELD_InternalUse_PhysInventory_Help="El inventario físico indica parámetros únicos para el inventario físico.";

@XendraTrl(Identifier="a782ed95-c92c-8417-6517-e966fe1214ae")
public static String es_PE_FIELD_InternalUse_PhysInventory_Name="Inventario Físico";

@XendraField(AD_Column_ID="M_Inventory_ID",IsCentrallyMaintained=true,
AD_Tab_ID="1974faf3-e1de-1b7d-de14-978310cbda43",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a782ed95-c92c-8417-6517-e966fe1214ae")
public static final String FIELDNAME_InternalUse_PhysInventory="a782ed95-c92c-8417-6517-e966fe1214ae";
/** Column name M_Inventory_ID */
public static final String COLUMNNAME_M_Inventory_ID = "M_Inventory_ID";
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

@XendraTrl(Identifier="f94e542e-9d1c-3b14-bea3-4fdc041da44b")
public static String es_PE_FIELD_InventoryCount_MovementDate_Description="Fecha en que un producto fue movido (dentro ó fuera) del inventario";

@XendraTrl(Identifier="f94e542e-9d1c-3b14-bea3-4fdc041da44b")
public static String es_PE_FIELD_InventoryCount_MovementDate_Help="La fecha del movimiento indica la fecha en que el producto es movido. Éste es el resultado de un embarque; recibo ó movimiento de inventario.";

@XendraTrl(Identifier="f94e542e-9d1c-3b14-bea3-4fdc041da44b")
public static String es_PE_FIELD_InventoryCount_MovementDate_Name="Fecha de Movimiento";

@XendraField(AD_Column_ID="MovementDate",IsCentrallyMaintained=true,
AD_Tab_ID="aeda3d7f-69c1-a7b9-05a5-eaf352404f5d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f94e542e-9d1c-3b14-bea3-4fdc041da44b")
public static final String FIELDNAME_InventoryCount_MovementDate="f94e542e-9d1c-3b14-bea3-4fdc041da44b";

@XendraTrl(Identifier="2dfc2113-3755-18b7-1cc8-4a9c7518a965")
public static String es_PE_FIELD_InternalUse_MovementDate_Description="Fecha en que un producto fue movido (dentro ó fuera) del inventario";

@XendraTrl(Identifier="2dfc2113-3755-18b7-1cc8-4a9c7518a965")
public static String es_PE_FIELD_InternalUse_MovementDate_Help="La fecha del movimiento indica la fecha en que el producto es movido. Éste es el resultado de un embarque; recibo ó movimiento de inventario.";

@XendraTrl(Identifier="2dfc2113-3755-18b7-1cc8-4a9c7518a965")
public static String es_PE_FIELD_InternalUse_MovementDate_Name="Fecha de Movimiento";

@XendraField(AD_Column_ID="MovementDate",IsCentrallyMaintained=true,
AD_Tab_ID="1974faf3-e1de-1b7d-de14-978310cbda43",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2dfc2113-3755-18b7-1cc8-4a9c7518a965")
public static final String FIELDNAME_InternalUse_MovementDate="2dfc2113-3755-18b7-1cc8-4a9c7518a965";

@XendraTrl(Identifier="88b4d120-3699-900e-170f-8bf39355615c")
public static String es_PE_COLUMN_MovementDate_Name="Fecha de Movimiento";

@XendraColumn(AD_Element_ID="7a907f01-8525-820d-22d4-98b06d4b902b",ColumnName="MovementDate",
AD_Reference_ID=15,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="@#Date@",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="88b4d120-3699-900e-170f-8bf39355615c",
Synchronized="2017-08-05 16:55:13.0")
/** Column name MovementDate */
public static final String COLUMNNAME_MovementDate = "MovementDate";
/** Set Perpetual Inventory.
@param M_PerpetualInv_ID Rules for generating physical inventory */
public void setM_PerpetualInv_ID (int M_PerpetualInv_ID)
{
if (M_PerpetualInv_ID <= 0) set_ValueNoCheck (COLUMNNAME_M_PerpetualInv_ID, null);
 else 
set_ValueNoCheck (COLUMNNAME_M_PerpetualInv_ID, Integer.valueOf(M_PerpetualInv_ID));
}
/** Get Perpetual Inventory.
@return Rules for generating physical inventory */
public int getM_PerpetualInv_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_PerpetualInv_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="c2c6385c-b9e8-eb3c-653c-7a443dbe2479")
public static String es_PE_FIELD_InventoryCount_PerpetualInventory_Description="Reglas para generar el inventario físico";

@XendraTrl(Identifier="c2c6385c-b9e8-eb3c-653c-7a443dbe2479")
public static String es_PE_FIELD_InventoryCount_PerpetualInventory_Help="El inventario perpetuo identifica la regla del inventario perpetuo que generó este inventario físico.";

@XendraTrl(Identifier="c2c6385c-b9e8-eb3c-653c-7a443dbe2479")
public static String es_PE_FIELD_InventoryCount_PerpetualInventory_Name="Inventario Perpetuo";

@XendraField(AD_Column_ID="M_PerpetualInv_ID",IsCentrallyMaintained=true,
AD_Tab_ID="aeda3d7f-69c1-a7b9-05a5-eaf352404f5d",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=0,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c2c6385c-b9e8-eb3c-653c-7a443dbe2479")
public static final String FIELDNAME_InventoryCount_PerpetualInventory="c2c6385c-b9e8-eb3c-653c-7a443dbe2479";

@XendraTrl(Identifier="bd167d83-aa67-988d-6017-02d533745465")
public static String es_PE_FIELD_InternalUse_PerpetualInventory_Description="Reglas para generar el inventario físico";

@XendraTrl(Identifier="bd167d83-aa67-988d-6017-02d533745465")
public static String es_PE_FIELD_InternalUse_PerpetualInventory_Help="El inventario perpetuo identifica la regla del inventario perpetuo que generó este inventario físico.";

@XendraTrl(Identifier="bd167d83-aa67-988d-6017-02d533745465")
public static String es_PE_FIELD_InternalUse_PerpetualInventory_Name="Inventario Perpetuo";

@XendraField(AD_Column_ID="M_PerpetualInv_ID",IsCentrallyMaintained=true,
AD_Tab_ID="1974faf3-e1de-1b7d-de14-978310cbda43",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=0,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="bd167d83-aa67-988d-6017-02d533745465")
public static final String FIELDNAME_InternalUse_PerpetualInventory="bd167d83-aa67-988d-6017-02d533745465";

@XendraTrl(Identifier="36e4eff4-9143-d55d-66fb-83b514ac9429")
public static String es_PE_COLUMN_M_PerpetualInv_ID_Name="Inventario Perpetuo";

@XendraColumn(AD_Element_ID="a5f899f7-b20a-2e9c-e945-9a1f3145b815",ColumnName="M_PerpetualInv_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="36e4eff4-9143-d55d-66fb-83b514ac9429",
Synchronized="2017-08-05 16:55:13.0")
/** Column name M_PerpetualInv_ID */
public static final String COLUMNNAME_M_PerpetualInv_ID = "M_PerpetualInv_ID";
/** Set Warehouse.
@param M_Warehouse_ID Storage Warehouse and Service Point */
public void setM_Warehouse_ID (int M_Warehouse_ID)
{
if (M_Warehouse_ID < 1) throw new IllegalArgumentException ("M_Warehouse_ID is mandatory.");
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

@XendraTrl(Identifier="b422a588-5aaf-6b0e-f5a5-3d0a4977013f")
public static String es_PE_FIELD_InventoryCount_Warehouse_Description="Almacén";

@XendraTrl(Identifier="b422a588-5aaf-6b0e-f5a5-3d0a4977013f")
public static String es_PE_FIELD_InventoryCount_Warehouse_Help="El Almacén indica un Almacén único donde los productos son almacenados";

@XendraTrl(Identifier="b422a588-5aaf-6b0e-f5a5-3d0a4977013f")
public static String es_PE_FIELD_InventoryCount_Warehouse_Name="Almacén";

@XendraField(AD_Column_ID="M_Warehouse_ID",IsCentrallyMaintained=true,
AD_Tab_ID="aeda3d7f-69c1-a7b9-05a5-eaf352404f5d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b422a588-5aaf-6b0e-f5a5-3d0a4977013f")
public static final String FIELDNAME_InventoryCount_Warehouse="b422a588-5aaf-6b0e-f5a5-3d0a4977013f";

@XendraTrl(Identifier="3d0157f6-f79a-8f15-8cb7-2bec32c245a4")
public static String es_PE_FIELD_InternalUse_Warehouse_Description="Almacén";

@XendraTrl(Identifier="3d0157f6-f79a-8f15-8cb7-2bec32c245a4")
public static String es_PE_FIELD_InternalUse_Warehouse_Help="El Almacén indica un Almacén único donde los productos son almacenados";

@XendraTrl(Identifier="3d0157f6-f79a-8f15-8cb7-2bec32c245a4")
public static String es_PE_FIELD_InternalUse_Warehouse_Name="Almacén";

@XendraField(AD_Column_ID="M_Warehouse_ID",IsCentrallyMaintained=true,
AD_Tab_ID="1974faf3-e1de-1b7d-de14-978310cbda43",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3d0157f6-f79a-8f15-8cb7-2bec32c245a4")
public static final String FIELDNAME_InternalUse_Warehouse="3d0157f6-f79a-8f15-8cb7-2bec32c245a4";

@XendraTrl(Identifier="e2b3d6be-3aab-d5d7-8f14-4c32a7af4706")
public static String es_PE_COLUMN_M_Warehouse_ID_Name="Almacén";

@XendraColumn(AD_Element_ID="402045cd-baa5-aeaf-b148-a921dffb7821",ColumnName="M_Warehouse_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="04acc0b0-f57d-0e15-af5b-80249f6e7906",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=true,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="e2b3d6be-3aab-d5d7-8f14-4c32a7af4706",Synchronized="2017-08-05 16:55:13.0")
/** Column name M_Warehouse_ID */
public static final String COLUMNNAME_M_Warehouse_ID = "M_Warehouse_ID";
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

@XendraTrl(Identifier="16017a58-b562-c4b8-c2e6-efe6d42e97dd")
public static String es_PE_FIELD_InventoryCount_Posted_Description="Las transacciones de contabilidad general han sido procesadas.";

@XendraTrl(Identifier="16017a58-b562-c4b8-c2e6-efe6d42e97dd")
public static String es_PE_FIELD_InventoryCount_Posted_Help="El campo fijado indica el estado de la generación de las Líneas contables a la contabilidad general.";

@XendraTrl(Identifier="16017a58-b562-c4b8-c2e6-efe6d42e97dd")
public static String es_PE_FIELD_InventoryCount_Posted_Name="Fijada";

@XendraField(AD_Column_ID="Posted",IsCentrallyMaintained=true,
AD_Tab_ID="aeda3d7f-69c1-a7b9-05a5-eaf352404f5d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@Processed@=Y & @#ShowAcct@=Y",DisplayLength=23,IsReadOnly=false,SeqNo=180,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="16017a58-b562-c4b8-c2e6-efe6d42e97dd")
public static final String FIELDNAME_InventoryCount_Posted="16017a58-b562-c4b8-c2e6-efe6d42e97dd";

@XendraTrl(Identifier="26259ff4-46ac-7fa5-5d12-e3f8d8bfddba")
public static String es_PE_FIELD_InternalUse_Posted_Description="Las transacciones de contabilidad general han sido procesadas.";

@XendraTrl(Identifier="26259ff4-46ac-7fa5-5d12-e3f8d8bfddba")
public static String es_PE_FIELD_InternalUse_Posted_Help="El campo fijado indica el estado de la generación de las Líneas contables a la contabilidad general.";

@XendraTrl(Identifier="26259ff4-46ac-7fa5-5d12-e3f8d8bfddba")
public static String es_PE_FIELD_InternalUse_Posted_Name="Fijada";

@XendraField(AD_Column_ID="Posted",IsCentrallyMaintained=true,
AD_Tab_ID="1974faf3-e1de-1b7d-de14-978310cbda43",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@Processed@=Y & @#ShowAcct@=Y",DisplayLength=23,IsReadOnly=false,SeqNo=180,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="26259ff4-46ac-7fa5-5d12-e3f8d8bfddba")
public static final String FIELDNAME_InternalUse_Posted="26259ff4-46ac-7fa5-5d12-e3f8d8bfddba";

@XendraTrl(Identifier="1c16276d-f5b1-995a-3d3b-833861065da9")
public static String es_PE_COLUMN_Posted_Name="Fijada";

@XendraColumn(AD_Element_ID="5eb52ebc-6992-12f5-b85a-e0a136df259b",ColumnName="Posted",
AD_Reference_ID=28,AD_Reference_Value_ID="d2b659dd-6c8c-baf3-fc71-0ee997273154",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="1c16276d-f5b1-995a-3d3b-833861065da9",Synchronized="2017-08-05 16:55:13.0")
/** Column name Posted */
public static final String COLUMNNAME_Posted = "Posted";
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

@XendraTrl(Identifier="597e765b-1226-d110-401f-530963dffd98")
public static String es_PE_FIELD_InventoryCount_Processed_Description="El documento ha sido procesado";

@XendraTrl(Identifier="597e765b-1226-d110-401f-530963dffd98")
public static String es_PE_FIELD_InventoryCount_Processed_Help="El cuadro de verificación procesada indica que un documento ha sido procesado";

@XendraTrl(Identifier="597e765b-1226-d110-401f-530963dffd98")
public static String es_PE_FIELD_InventoryCount_Processed_Name="Procesado";

@XendraField(AD_Column_ID="Processed",IsCentrallyMaintained=true,
AD_Tab_ID="aeda3d7f-69c1-a7b9-05a5-eaf352404f5d",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=true,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="597e765b-1226-d110-401f-530963dffd98")
public static final String FIELDNAME_InventoryCount_Processed="597e765b-1226-d110-401f-530963dffd98";

@XendraTrl(Identifier="bf4a1b20-1ea8-88f6-00d8-4d23f539dc50")
public static String es_PE_FIELD_InternalUse_Processed_Description="El documento ha sido procesado";

@XendraTrl(Identifier="bf4a1b20-1ea8-88f6-00d8-4d23f539dc50")
public static String es_PE_FIELD_InternalUse_Processed_Help="El cuadro de verificación procesada indica que un documento ha sido procesado";

@XendraTrl(Identifier="bf4a1b20-1ea8-88f6-00d8-4d23f539dc50")
public static String es_PE_FIELD_InternalUse_Processed_Name="Procesado";

@XendraField(AD_Column_ID="Processed",IsCentrallyMaintained=true,
AD_Tab_ID="1974faf3-e1de-1b7d-de14-978310cbda43",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=true,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="bf4a1b20-1ea8-88f6-00d8-4d23f539dc50")
public static final String FIELDNAME_InternalUse_Processed="bf4a1b20-1ea8-88f6-00d8-4d23f539dc50";

@XendraTrl(Identifier="c85f2852-f445-3fc4-7f42-fc15eb5535ca")
public static String es_PE_COLUMN_Processed_Name="Procesado";

@XendraColumn(AD_Element_ID="3f7035d2-fa5e-7416-fc0c-e49e43f9e083",ColumnName="Processed",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c85f2852-f445-3fc4-7f42-fc15eb5535ca",
Synchronized="2017-08-05 16:55:13.0")
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

@XendraTrl(Identifier="471a48a3-3722-c0f0-8248-20f7c43f644e")
public static String es_PE_FIELD_InventoryCount_ProcessNow_Name="Procesar Ahora";

@XendraField(AD_Column_ID="Processing",IsCentrallyMaintained=true,
AD_Tab_ID="aeda3d7f-69c1-a7b9-05a5-eaf352404f5d",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="471a48a3-3722-c0f0-8248-20f7c43f644e")
public static final String FIELDNAME_InventoryCount_ProcessNow="471a48a3-3722-c0f0-8248-20f7c43f644e";

@XendraTrl(Identifier="09dfc333-2489-ff44-c06d-58c31b5b0167")
public static String es_PE_FIELD_InternalUse_ProcessNow_Name="Procesar Ahora";

@XendraField(AD_Column_ID="Processing",IsCentrallyMaintained=true,
AD_Tab_ID="1974faf3-e1de-1b7d-de14-978310cbda43",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="09dfc333-2489-ff44-c06d-58c31b5b0167")
public static final String FIELDNAME_InternalUse_ProcessNow="09dfc333-2489-ff44-c06d-58c31b5b0167";

@XendraTrl(Identifier="7fe35de8-8683-484b-0052-64d0f3280bc0")
public static String es_PE_COLUMN_Processing_Name="Procesar Ahora";

@XendraColumn(AD_Element_ID="f2096404-1a98-35ec-09ea-273b3e19b7de",ColumnName="Processing",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7fe35de8-8683-484b-0052-64d0f3280bc0",
Synchronized="2017-08-05 16:55:13.0")
/** Column name Processing */
public static final String COLUMNNAME_Processing = "Processing";
/** Set Update Quantities.
@param UpdateQty Update Quantities */
public void setUpdateQty (String UpdateQty)
{
if (UpdateQty != null && UpdateQty.length() > 1)
{
log.warning("Length > 1 - truncated");
UpdateQty = UpdateQty.substring(0,0);
}
set_Value (COLUMNNAME_UpdateQty, UpdateQty);
}
/** Get Update Quantities.
@return Update Quantities */
public String getUpdateQty() 
{
return (String)get_Value(COLUMNNAME_UpdateQty);
}

@XendraTrl(Identifier="10df1ad7-443d-3fdb-57d5-8c1f3ba1139a")
public static String es_PE_FIELD_InventoryCount_UpdateQuantities_Description="La cantidad en libros es actualizada con la cantidad real en libros";

@XendraTrl(Identifier="10df1ad7-443d-3fdb-57d5-8c1f3ba1139a")
public static String es_PE_FIELD_InventoryCount_UpdateQuantities_Help="(vacio)";

@XendraTrl(Identifier="10df1ad7-443d-3fdb-57d5-8c1f3ba1139a")
public static String es_PE_FIELD_InventoryCount_UpdateQuantities_Name="Actualizar Cantidad";

@XendraField(AD_Column_ID="UpdateQty",IsCentrallyMaintained=true,
AD_Tab_ID="aeda3d7f-69c1-a7b9-05a5-eaf352404f5d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="10df1ad7-443d-3fdb-57d5-8c1f3ba1139a")
public static final String FIELDNAME_InventoryCount_UpdateQuantities="10df1ad7-443d-3fdb-57d5-8c1f3ba1139a";

@XendraTrl(Identifier="377fa974-4044-c671-b438-88cf8a470e0c")
public static String es_PE_FIELD_InternalUse_UpdateQuantities_Description="La cantidad en libros es actualizada con la cantidad real en libros";

@XendraTrl(Identifier="377fa974-4044-c671-b438-88cf8a470e0c")
public static String es_PE_FIELD_InternalUse_UpdateQuantities_Help="(vacio)";

@XendraTrl(Identifier="377fa974-4044-c671-b438-88cf8a470e0c")
public static String es_PE_FIELD_InternalUse_UpdateQuantities_Name="Actualizar Cantidad";

@XendraField(AD_Column_ID="UpdateQty",IsCentrallyMaintained=true,
AD_Tab_ID="1974faf3-e1de-1b7d-de14-978310cbda43",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="377fa974-4044-c671-b438-88cf8a470e0c")
public static final String FIELDNAME_InternalUse_UpdateQuantities="377fa974-4044-c671-b438-88cf8a470e0c";

@XendraTrl(Identifier="944eefd1-50c9-8c9f-b34c-43b52671adee")
public static String es_PE_COLUMN_UpdateQty_Name="Actualizar Cantidades";

@XendraColumn(AD_Element_ID="89cd303b-821b-4016-409f-19dc6165d6c1",ColumnName="UpdateQty",
AD_Reference_ID=28,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="dfc468db-3bac-af08-daa4-52d2df1b03da",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="944eefd1-50c9-8c9f-b34c-43b52671adee",Synchronized="2017-08-05 16:55:13.0")
/** Column name UpdateQty */
public static final String COLUMNNAME_UpdateQty = "UpdateQty";

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

@XendraTrl(Identifier="4072d1b3-a980-3fbb-a037-acfc4236ef6b")
public static String es_PE_FIELD_InventoryCount_UserList_Description="El usuario definió el elemento # 1";

@XendraTrl(Identifier="4072d1b3-a980-3fbb-a037-acfc4236ef6b")
public static String es_PE_FIELD_InventoryCount_UserList_Help="El elemento definido por el usuario despliega los elementos opcionales que han sido definidos para esta combinación de cuentas";

@XendraTrl(Identifier="4072d1b3-a980-3fbb-a037-acfc4236ef6b")
public static String es_PE_FIELD_InventoryCount_UserList_Name="Usuario 1";

@XendraField(AD_Column_ID="User1_ID",IsCentrallyMaintained=true,
AD_Tab_ID="aeda3d7f-69c1-a7b9-05a5-eaf352404f5d",AD_FieldGroup_ID="Reference",IsDisplayed=true,
DisplayLogic="@$Element_U1@=Y",DisplayLength=14,IsReadOnly=false,SeqNo=120,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="4072d1b3-a980-3fbb-a037-acfc4236ef6b")
public static final String FIELDNAME_InventoryCount_UserList="4072d1b3-a980-3fbb-a037-acfc4236ef6b";

@XendraTrl(Identifier="d27c0ec4-6e97-b1c7-6248-2df5390f30a2")
public static String es_PE_FIELD_InternalUse_UserList_Description="El usuario definió el elemento # 1";

@XendraTrl(Identifier="d27c0ec4-6e97-b1c7-6248-2df5390f30a2")
public static String es_PE_FIELD_InternalUse_UserList_Help="El elemento definido por el usuario despliega los elementos opcionales que han sido definidos para esta combinación de cuentas";

@XendraTrl(Identifier="d27c0ec4-6e97-b1c7-6248-2df5390f30a2")
public static String es_PE_FIELD_InternalUse_UserList_Name="Usuario 1";

@XendraField(AD_Column_ID="User1_ID",IsCentrallyMaintained=true,
AD_Tab_ID="1974faf3-e1de-1b7d-de14-978310cbda43",AD_FieldGroup_ID="Reference",IsDisplayed=true,
DisplayLogic="@$Element_U1@=Y",DisplayLength=14,IsReadOnly=false,SeqNo=120,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="d27c0ec4-6e97-b1c7-6248-2df5390f30a2")
public static final String FIELDNAME_InternalUse_UserList="d27c0ec4-6e97-b1c7-6248-2df5390f30a2";

@XendraTrl(Identifier="80d5aef3-4a13-03d7-bfad-40aa610417f6")
public static String es_PE_COLUMN_User1_ID_Name="Usuario 1";

@XendraColumn(AD_Element_ID="07453e74-aadd-d9c9-e543-837a6fdb3094",ColumnName="User1_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="5a2fe161-044f-67cb-3791-6d615980cabb",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="80d5aef3-4a13-03d7-bfad-40aa610417f6",Synchronized="2017-08-05 16:55:13.0")
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

@XendraTrl(Identifier="79c21c32-ecda-76e8-9858-a44356fabd6d")
public static String es_PE_FIELD_InventoryCount_UserList22_Description="El usuario definió el elemento # 2";

@XendraTrl(Identifier="79c21c32-ecda-76e8-9858-a44356fabd6d")
public static String es_PE_FIELD_InventoryCount_UserList22_Help="El elemento definido por el usuario despliega los elementos opcionales que han sido definidos para esta combinación de cuentas";

@XendraTrl(Identifier="79c21c32-ecda-76e8-9858-a44356fabd6d")
public static String es_PE_FIELD_InventoryCount_UserList22_Name="Usuario 2";

@XendraField(AD_Column_ID="User2_ID",IsCentrallyMaintained=true,
AD_Tab_ID="aeda3d7f-69c1-a7b9-05a5-eaf352404f5d",AD_FieldGroup_ID="Reference",IsDisplayed=true,
DisplayLogic="@$Element_U2@=Y",DisplayLength=14,IsReadOnly=false,SeqNo=130,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="79c21c32-ecda-76e8-9858-a44356fabd6d")
public static final String FIELDNAME_InventoryCount_UserList22="79c21c32-ecda-76e8-9858-a44356fabd6d";

@XendraTrl(Identifier="14c5fabb-dced-eda4-2878-9819406863fd")
public static String es_PE_FIELD_InternalUse_UserList22_Description="El usuario definió el elemento # 2";

@XendraTrl(Identifier="14c5fabb-dced-eda4-2878-9819406863fd")
public static String es_PE_FIELD_InternalUse_UserList22_Help="El elemento definido por el usuario despliega los elementos opcionales que han sido definidos para esta combinación de cuentas";

@XendraTrl(Identifier="14c5fabb-dced-eda4-2878-9819406863fd")
public static String es_PE_FIELD_InternalUse_UserList22_Name="Usuario 2";

@XendraField(AD_Column_ID="User2_ID",IsCentrallyMaintained=true,
AD_Tab_ID="1974faf3-e1de-1b7d-de14-978310cbda43",AD_FieldGroup_ID="Reference",IsDisplayed=true,
DisplayLogic="@$Element_U2@=Y",DisplayLength=14,IsReadOnly=false,SeqNo=130,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="14c5fabb-dced-eda4-2878-9819406863fd")
public static final String FIELDNAME_InternalUse_UserList22="14c5fabb-dced-eda4-2878-9819406863fd";

@XendraTrl(Identifier="4fc0fe5a-5224-d32d-6673-714b7dd4735d")
public static String es_PE_COLUMN_User2_ID_Name="Usuario 2";

@XendraColumn(AD_Element_ID="1b668c90-6743-20a2-df62-576857d72c06",ColumnName="User2_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="6a357ab2-7bb6-fce4-ffee-8bdd855a77fc",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="4fc0fe5a-5224-d32d-6673-714b7dd4735d",Synchronized="2017-08-05 16:55:13.0")
/** Column name User2_ID */
public static final String COLUMNNAME_User2_ID = "User2_ID";
}
