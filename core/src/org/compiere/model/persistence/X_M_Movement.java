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
import org.compiere.model.reference.REF__PriorityRule;
/** Generated Model for M_Movement
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_M_Movement extends PO
{
/** Standard Constructor
@param ctx context
@param M_Movement_ID id
@param trxName transaction
*/
public X_M_Movement (Properties ctx, int M_Movement_ID, String trxName)
{
super (ctx, M_Movement_ID, trxName);
/** if (M_Movement_ID == 0)
{
setC_DocType_ID (0);
setDeliveryRule (null);	
// A
setDeliveryViaRule (null);	
// S
setDocAction (null);	
// CO
setDocStatus (null);	
// DR
setDocumentNo (null);
setIsApproved (false);	
// N
setIsInTransit (false);	
// N
setM_Movement_ID (0);
setMovementDate (new Timestamp(System.currentTimeMillis()));	
// @SysDate@
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
public X_M_Movement (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=323 */
public static int Table_ID=MTable.getTable_ID("M_Movement");

@XendraTrl(Identifier="a5d52faf-9070-d3e1-6152-a55851e259e7")
public static String es_PE_TAB_Move_Description="Definir Movimiento";

@XendraTrl(Identifier="a5d52faf-9070-d3e1-6152-a55851e259e7")
public static String es_PE_TAB_Move_Name="Movimiento";

@XendraTrl(Identifier="a5d52faf-9070-d3e1-6152-a55851e259e7")
public static String es_PE_TAB_Move_Help="La pestaña Movimientos define e identifica el movimiento de un ítem ó de varios en el inventario.";

@XendraTab(Name="Move",Description="Enter Inventory Movement",
Help="The Move Tab defines and identifies the movement of an item or items in inventory.",
AD_Window_ID="d846fe0a-02ec-74b9-60c7-18dce41e7a56",SeqNo=10,TabLevel=0,IsSingleRow=true,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",
AD_Process_ID="104320f5-6f59-cb52-85e3-e91c6efe7108",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="a5d52faf-9070-d3e1-6152-a55851e259e7",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Move="a5d52faf-9070-d3e1-6152-a55851e259e7";

@XendraTrl(Identifier="34624857-e37e-e31d-b092-7199df9f8d29")
public static String es_PE_TABLE_M_Movement_Name="Movimiento";

@XendraTable(Name="Inventory Move",Description="Movement of Inventory",Help="",
TableName="M_Movement",AccessLevel="1",AD_Window_ID="d846fe0a-02ec-74b9-60c7-18dce41e7a56",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=130,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.material",
Identifier="34624857-e37e-e31d-b092-7199df9f8d29",Synchronized="2017-08-16 11:43:21.0")
/** TableName=M_Movement */
public static final String Table_Name="M_Movement";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"M_Movement");

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
    Table_ID = MTable.getTable_ID("M_Movement");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_M_Movement[").append(get_ID()).append("]");
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

@XendraTrl(Identifier="26dd5e10-79cf-da3f-19ea-917d3080d1e1")
public static String es_PE_FIELD_Move_TrxOrganization_Description="Organización que inicia ó ejecuta la transacción";

@XendraTrl(Identifier="26dd5e10-79cf-da3f-19ea-917d3080d1e1")
public static String es_PE_FIELD_Move_TrxOrganization_Help="La organización que inicia ó ejecuta la transacción (para otra organización). La organización poseedora puede no ser la organización de la transacción en un ambiente de buró de servicio; con servicios centralizados y transacciones inter- organización.";

@XendraTrl(Identifier="26dd5e10-79cf-da3f-19ea-917d3080d1e1")
public static String es_PE_FIELD_Move_TrxOrganization_Name="Organización de la Trans.";

@XendraField(AD_Column_ID="AD_OrgTrx_ID",IsCentrallyMaintained=true,
AD_Tab_ID="a5d52faf-9070-d3e1-6152-a55851e259e7",AD_FieldGroup_ID="Reference",IsDisplayed=true,
DisplayLogic="@$Element_OT@=Y",DisplayLength=14,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="26dd5e10-79cf-da3f-19ea-917d3080d1e1")
public static final String FIELDNAME_Move_TrxOrganization="26dd5e10-79cf-da3f-19ea-917d3080d1e1";

@XendraTrl(Identifier="ea0a7b42-2763-0dbc-4dc5-66d9d864d798")
public static String es_PE_COLUMN_AD_OrgTrx_ID_Name="Organización de la Trans.";

@XendraColumn(AD_Element_ID="b4180358-67aa-fe55-0409-6367a60e0a2e",ColumnName="AD_OrgTrx_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="54e78591-f7f4-c613-ea27-e64b3dac5198",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="ea0a7b42-2763-0dbc-4dc5-66d9d864d798",Synchronized="2017-08-05 16:55:16.0")
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

@XendraTrl(Identifier="cbddcaeb-661b-e868-7c08-2f1a57831ac6")
public static String es_PE_FIELD_Move_ApprovalAmount_Description="Documento de importe aprobado";

@XendraTrl(Identifier="cbddcaeb-661b-e868-7c08-2f1a57831ac6")
public static String es_PE_FIELD_Move_ApprovalAmount_Help="Cantidad de la aprobación para el Flujo de trabajo";

@XendraTrl(Identifier="cbddcaeb-661b-e868-7c08-2f1a57831ac6")
public static String es_PE_FIELD_Move_ApprovalAmount_Name="Importe Aprobado";

@XendraField(AD_Column_ID="ApprovalAmt",IsCentrallyMaintained=true,
AD_Tab_ID="a5d52faf-9070-d3e1-6152-a55851e259e7",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=180,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="cbddcaeb-661b-e868-7c08-2f1a57831ac6")
public static final String FIELDNAME_Move_ApprovalAmount="cbddcaeb-661b-e868-7c08-2f1a57831ac6";

@XendraTrl(Identifier="38efde79-86ac-e66e-e2e7-20ad083ebf3d")
public static String es_PE_COLUMN_ApprovalAmt_Name="Importe Aprobado";

@XendraColumn(AD_Element_ID="fd13a366-3264-4b86-b3f3-66490833103d",ColumnName="ApprovalAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="38efde79-86ac-e66e-e2e7-20ad083ebf3d",
Synchronized="2017-08-05 16:55:16.0")
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

@XendraTrl(Identifier="e0f8c727-7c09-4e32-d13d-7b27fdc5515d")
public static String es_PE_FIELD_Move_Activity_Description="Actividad de Negocio";

@XendraTrl(Identifier="e0f8c727-7c09-4e32-d13d-7b27fdc5515d")
public static String es_PE_FIELD_Move_Activity_Help="Las actividades indican tareas que son ejecutadas en el curso de un negocio; las actividades son usadas para el costeo por actividad (ABC)";

@XendraTrl(Identifier="e0f8c727-7c09-4e32-d13d-7b27fdc5515d")
public static String es_PE_FIELD_Move_Activity_Name="Tipo de Gasto";

@XendraField(AD_Column_ID="C_Activity_ID",IsCentrallyMaintained=true,
AD_Tab_ID="a5d52faf-9070-d3e1-6152-a55851e259e7",AD_FieldGroup_ID="Reference",IsDisplayed=true,
DisplayLogic="@$Element_AY@=Y",DisplayLength=14,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e0f8c727-7c09-4e32-d13d-7b27fdc5515d")
public static final String FIELDNAME_Move_Activity="e0f8c727-7c09-4e32-d13d-7b27fdc5515d";

@XendraTrl(Identifier="c1133d53-aeb0-ad36-6672-26ad7558d801")
public static String es_PE_COLUMN_C_Activity_ID_Name="Tipo de Gasto";

@XendraColumn(AD_Element_ID="bfeadbb3-d866-26e3-8eee-3e2fdf0ff753",ColumnName="C_Activity_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c1133d53-aeb0-ad36-6672-26ad7558d801",
Synchronized="2017-08-05 16:55:16.0")
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

@XendraTrl(Identifier="3f837ac1-a14e-1458-a26d-c92157dd4b5d")
public static String es_PE_FIELD_Move_Campaign_Description="Campaña de Mercadeo";

@XendraTrl(Identifier="3f837ac1-a14e-1458-a26d-c92157dd4b5d")
public static String es_PE_FIELD_Move_Campaign_Help="La Campaña define un programa de mercadotecnia único. Los proyectos pueden estar asociados con una campaña de mercadotecnia única. Usted puede entonces reportar basado en una campaña específica";

@XendraTrl(Identifier="3f837ac1-a14e-1458-a26d-c92157dd4b5d")
public static String es_PE_FIELD_Move_Campaign_Name="Campaña";

@XendraField(AD_Column_ID="C_Campaign_ID",IsCentrallyMaintained=true,
AD_Tab_ID="a5d52faf-9070-d3e1-6152-a55851e259e7",AD_FieldGroup_ID="Reference",IsDisplayed=false,
DisplayLogic="@$Element_MC@=Y",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3f837ac1-a14e-1458-a26d-c92157dd4b5d")
public static final String FIELDNAME_Move_Campaign="3f837ac1-a14e-1458-a26d-c92157dd4b5d";

@XendraTrl(Identifier="2f96ad17-c87a-1fe0-cc58-1805e1fe4a46")
public static String es_PE_COLUMN_C_Campaign_ID_Name="Campaña";

@XendraColumn(AD_Element_ID="6cf08e31-d355-ee38-9c0b-bee20b3ea5b6",ColumnName="C_Campaign_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2f96ad17-c87a-1fe0-cc58-1805e1fe4a46",
Synchronized="2017-08-05 16:55:16.0")
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

@XendraTrl(Identifier="1c0d1f6f-cb70-17fc-1a3e-0e2fe28c32e8")
public static String es_PE_FIELD_Move_DocumentType_Description="Tipo de documento ó reglas";

@XendraTrl(Identifier="1c0d1f6f-cb70-17fc-1a3e-0e2fe28c32e8")
public static String es_PE_FIELD_Move_DocumentType_Help="El tipo de documento determina la secuencia del documento y las reglas de proceso";

@XendraTrl(Identifier="1c0d1f6f-cb70-17fc-1a3e-0e2fe28c32e8")
public static String es_PE_FIELD_Move_DocumentType_Name="Tipo de Documento";

@XendraField(AD_Column_ID="C_DocType_ID",IsCentrallyMaintained=true,
AD_Tab_ID="a5d52faf-9070-d3e1-6152-a55851e259e7",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1c0d1f6f-cb70-17fc-1a3e-0e2fe28c32e8")
public static final String FIELDNAME_Move_DocumentType="1c0d1f6f-cb70-17fc-1a3e-0e2fe28c32e8";

@XendraTrl(Identifier="39018032-397f-b6c5-7112-e3d6997e7a18")
public static String es_PE_COLUMN_C_DocType_ID_Name="Tipo de Documento";

@XendraColumn(AD_Element_ID="099a4147-1a72-cdd0-81e0-8bdbc8c0b883",ColumnName="C_DocType_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="715d788b-8fd0-aeef-92fb-c287a525d0e2",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="org.compiere.model.CalloutMovement.DocType",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="39018032-397f-b6c5-7112-e3d6997e7a18",
Synchronized="2017-08-05 16:55:16.0")
/** Column name C_DocType_ID */
public static final String COLUMNNAME_C_DocType_ID = "C_DocType_ID";
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

@XendraTrl(Identifier="7d7a105e-c4c8-8bfa-56b7-3914038bdac0")
public static String es_PE_FIELD_Move_Project_Description="Identifica un proyecto único";

@XendraTrl(Identifier="7d7a105e-c4c8-8bfa-56b7-3914038bdac0")
public static String es_PE_FIELD_Move_Project_Help="La ID de un proyecto es un identificador definido por el usuario para un proyecto";

@XendraTrl(Identifier="7d7a105e-c4c8-8bfa-56b7-3914038bdac0")
public static String es_PE_FIELD_Move_Project_Name="Proyecto";

@XendraField(AD_Column_ID="C_Project_ID",IsCentrallyMaintained=true,
AD_Tab_ID="a5d52faf-9070-d3e1-6152-a55851e259e7",AD_FieldGroup_ID="Reference",IsDisplayed=false,
DisplayLogic="@$Element_PJ@=Y",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7d7a105e-c4c8-8bfa-56b7-3914038bdac0")
public static final String FIELDNAME_Move_Project="7d7a105e-c4c8-8bfa-56b7-3914038bdac0";

@XendraTrl(Identifier="66af995e-2abb-2405-139a-fcf3f2d7c8c0")
public static String es_PE_COLUMN_C_Project_ID_Name="Proyecto";

@XendraColumn(AD_Element_ID="16ff5dcc-9178-73dd-e618-e88bd79d573b",ColumnName="C_Project_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="992a8502-7fe8-20b8-6bc5-b5b4b225f1e3",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="66af995e-2abb-2405-139a-fcf3f2d7c8c0",Synchronized="2017-08-05 16:55:16.0")
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

@XendraTrl(Identifier="f6235351-dfb8-4a0b-989f-1dca2b63c1ca")
public static String es_PE_COLUMN_DateAcct_Name="dateacct";

@XendraColumn(AD_Element_ID="034727d0-e80f-fadf-3d4f-2d8d37b75669",ColumnName="DateAcct",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=29,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f6235351-dfb8-4a0b-989f-1dca2b63c1ca",
Synchronized="2017-08-05 16:55:16.0")
/** Column name DateAcct */
public static final String COLUMNNAME_DateAcct = "DateAcct";
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

@XendraTrl(Identifier="4c649de3-595f-3b5b-9b7e-1ede5fbb8497")
public static String es_PE_FIELD_Move_DateReceived_Description="Fecha en que un producto fue recibido.";

@XendraTrl(Identifier="4c649de3-595f-3b5b-9b7e-1ede5fbb8497")
public static String es_PE_FIELD_Move_DateReceived_Help="La fecha de recibo indica la fecha en que el producto fue recibido.";

@XendraTrl(Identifier="4c649de3-595f-3b5b-9b7e-1ede5fbb8497")
public static String es_PE_FIELD_Move_DateReceived_Name="Fecha de Recibo";

@XendraField(AD_Column_ID="DateReceived",IsCentrallyMaintained=true,
AD_Tab_ID="a5d52faf-9070-d3e1-6152-a55851e259e7",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=200,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="4c649de3-595f-3b5b-9b7e-1ede5fbb8497")
public static final String FIELDNAME_Move_DateReceived="4c649de3-595f-3b5b-9b7e-1ede5fbb8497";

@XendraTrl(Identifier="1ea81560-46ee-8ba6-586c-7cbeb37971c8")
public static String es_PE_COLUMN_DateReceived_Name="Fecha de Recibo";

@XendraColumn(AD_Element_ID="d69e8488-829e-c9af-4ab0-68f83357b545",ColumnName="DateReceived",
AD_Reference_ID=15,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="1ea81560-46ee-8ba6-586c-7cbeb37971c8",
Synchronized="2017-08-05 16:55:16.0")
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

@XendraTrl(Identifier="22ff803a-e2ce-d028-876e-fca1d42dd817")
public static String es_PE_FIELD_Move_DeliveryRule_Description="Define los tiempos de entrega";

@XendraTrl(Identifier="22ff803a-e2ce-d028-876e-fca1d42dd817")
public static String es_PE_FIELD_Move_DeliveryRule_Help="La Regla de Entrega indica cuando una orden debe ser entregada. Por Ej. Si la orden debiera entregarse cuando  esta completa; cuando una partida esta completa ó cuando el producto llega a estar disponible.";

@XendraTrl(Identifier="22ff803a-e2ce-d028-876e-fca1d42dd817")
public static String es_PE_FIELD_Move_DeliveryRule_Name="Regla de Entrega";

@XendraField(AD_Column_ID="DeliveryRule",IsCentrallyMaintained=true,
AD_Tab_ID="a5d52faf-9070-d3e1-6152-a55851e259e7",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="22ff803a-e2ce-d028-876e-fca1d42dd817")
public static final String FIELDNAME_Move_DeliveryRule="22ff803a-e2ce-d028-876e-fca1d42dd817";

@XendraTrl(Identifier="45394a0f-d886-44a6-d1d9-58114475c916")
public static String es_PE_COLUMN_DeliveryRule_Name="Delivery Rule";

@XendraColumn(AD_Element_ID="bfc0b304-42d5-bfa2-4997-a3024ea284f9",ColumnName="DeliveryRule",
AD_Reference_ID=17,AD_Reference_Value_ID="dd6ca989-f822-5b38-ea47-5420e7ccb16b",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="A",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="45394a0f-d886-44a6-d1d9-58114475c916",Synchronized="2017-08-05 16:55:16.0")
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

@XendraTrl(Identifier="683e678a-1d53-5960-171a-9496028e0ca3")
public static String es_PE_FIELD_Move_DeliveryVia_Description="Como será entregada la orden";

@XendraTrl(Identifier="683e678a-1d53-5960-171a-9496028e0ca3")
public static String es_PE_FIELD_Move_DeliveryVia_Help="La vía de entrega indica como el producto debería ser entregado. Por Ej. Si la orden será recogida ó embarcada.";

@XendraTrl(Identifier="683e678a-1d53-5960-171a-9496028e0ca3")
public static String es_PE_FIELD_Move_DeliveryVia_Name="Vía de Entrega";

@XendraField(AD_Column_ID="DeliveryViaRule",IsCentrallyMaintained=true,
AD_Tab_ID="a5d52faf-9070-d3e1-6152-a55851e259e7",AD_FieldGroup_ID="Reference",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="683e678a-1d53-5960-171a-9496028e0ca3")
public static final String FIELDNAME_Move_DeliveryVia="683e678a-1d53-5960-171a-9496028e0ca3";

@XendraTrl(Identifier="b6bad444-843e-4814-2979-db0fea86215b")
public static String es_PE_COLUMN_DeliveryViaRule_Name="Vía de Entrega";

@XendraColumn(AD_Element_ID="47ae2232-6c73-dfb6-aa97-18fb2cc876a7",ColumnName="DeliveryViaRule",
AD_Reference_ID=17,AD_Reference_Value_ID="e0d8ddbc-d567-6f32-8ce6-274924c5926f",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="S",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="b6bad444-843e-4814-2979-db0fea86215b",Synchronized="2017-08-05 16:55:16.0")
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

@XendraTrl(Identifier="0416d959-04c4-a89c-5c70-5debf635f7cf")
public static String es_PE_FIELD_Move_Description_Description="Descripción corta opcional del registro";

@XendraTrl(Identifier="0416d959-04c4-a89c-5c70-5debf635f7cf")
public static String es_PE_FIELD_Move_Description_Help="Una descripción esta limitada a 255 caracteres";

@XendraTrl(Identifier="0416d959-04c4-a89c-5c70-5debf635f7cf")
public static String es_PE_FIELD_Move_Description_Name="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="a5d52faf-9070-d3e1-6152-a55851e259e7",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0416d959-04c4-a89c-5c70-5debf635f7cf")
public static final String FIELDNAME_Move_Description="0416d959-04c4-a89c-5c70-5debf635f7cf";

@XendraTrl(Identifier="d8793d42-8dd7-2b6d-2152-dcc59a6db108")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=true,ColumnSQL="",
IsAllowLogging=false,Identifier="d8793d42-8dd7-2b6d-2152-dcc59a6db108",
Synchronized="2017-08-05 16:55:16.0")
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

@XendraTrl(Identifier="850ed1d5-6409-6a6d-edde-931da761c5ea")
public static String es_PE_FIELD_Move_ProcessMovements_Description="Procesar movimientos de inventario";

@XendraTrl(Identifier="850ed1d5-6409-6a6d-edde-931da761c5ea")
public static String es_PE_FIELD_Move_ProcessMovements_Help="Procesar movimientos de inventario actualizará cantidades en inventario basados en los movimientos definidos entre bodegas o localizaciones";

@XendraTrl(Identifier="850ed1d5-6409-6a6d-edde-931da761c5ea")
public static String es_PE_FIELD_Move_ProcessMovements_Name="Procesar Movimientos";

@XendraField(AD_Column_ID="DocAction",IsCentrallyMaintained=true,
AD_Tab_ID="a5d52faf-9070-d3e1-6152-a55851e259e7",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=240,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="850ed1d5-6409-6a6d-edde-931da761c5ea")
public static final String FIELDNAME_Move_ProcessMovements="850ed1d5-6409-6a6d-edde-931da761c5ea";

@XendraTrl(Identifier="fa186ee4-e0c4-58b2-3f04-442677d04af4")
public static String es_PE_COLUMN_DocAction_Name="Acción en el Documento";

@XendraColumn(AD_Element_ID="d4b9075b-18e5-ebbb-5565-d217a7e531cb",ColumnName="DocAction",
AD_Reference_ID=28,AD_Reference_Value_ID="e397c9b0-c643-d1cd-8380-20bee13b2a6e",AD_Val_Rule_ID="",
FieldLength=2,DefaultValue="CO",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,
AD_Process_ID="77e3cbb0-ac06-247b-93ad-4473706befac",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="fa186ee4-e0c4-58b2-3f04-442677d04af4",
Synchronized="2017-08-05 16:55:16.0")
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

@XendraTrl(Identifier="a40d23a2-1d5a-4ccb-a822-291d948b8c51")
public static String es_PE_FIELD_Move_DocumentStatus_Description="El estado actual del documento";

@XendraTrl(Identifier="a40d23a2-1d5a-4ccb-a822-291d948b8c51")
public static String es_PE_FIELD_Move_DocumentStatus_Help="El estado del documento indica el estado del documento en este momento. Si usted quiere cambiar el estado de Documento; use el campo acción de documento";

@XendraTrl(Identifier="a40d23a2-1d5a-4ccb-a822-291d948b8c51")
public static String es_PE_FIELD_Move_DocumentStatus_Name="Estado del Documento";

@XendraField(AD_Column_ID="DocStatus",IsCentrallyMaintained=true,
AD_Tab_ID="a5d52faf-9070-d3e1-6152-a55851e259e7",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=230,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a40d23a2-1d5a-4ccb-a822-291d948b8c51")
public static final String FIELDNAME_Move_DocumentStatus="a40d23a2-1d5a-4ccb-a822-291d948b8c51";

@XendraTrl(Identifier="0132b0df-7442-ab01-8ebf-a60120bdf274")
public static String es_PE_COLUMN_DocStatus_Name="Estado del Documento";

@XendraColumn(AD_Element_ID="e73fa537-3438-bd01-dfd4-f0f080a28c55",ColumnName="DocStatus",
AD_Reference_ID=17,AD_Reference_Value_ID="7627125d-fefe-e6bc-bb7d-4a6c772172dc",AD_Val_Rule_ID="",
FieldLength=2,DefaultValue="DR",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="0132b0df-7442-ab01-8ebf-a60120bdf274",Synchronized="2017-08-05 16:55:16.0")
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

@XendraTrl(Identifier="f20d120b-8d03-761f-29cb-5da24120e2dd")
public static String es_PE_FIELD_Move_DocumentNo_Description="Número de secuencia del documento para cada documento";

@XendraTrl(Identifier="f20d120b-8d03-761f-29cb-5da24120e2dd")
public static String es_PE_FIELD_Move_DocumentNo_Help="El número del documento es usualmente generado en automático por el sistema y determinado por el tipo del documento. Si el documento no se salva; el número preliminar se despliega entre \"<>\"";

@XendraTrl(Identifier="f20d120b-8d03-761f-29cb-5da24120e2dd")
public static String es_PE_FIELD_Move_DocumentNo_Name="No. del Documento";

@XendraField(AD_Column_ID="DocumentNo",IsCentrallyMaintained=true,
AD_Tab_ID="a5d52faf-9070-d3e1-6152-a55851e259e7",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=30,SortNo=-1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f20d120b-8d03-761f-29cb-5da24120e2dd")
public static final String FIELDNAME_Move_DocumentNo="f20d120b-8d03-761f-29cb-5da24120e2dd";

@XendraTrl(Identifier="a106d7f9-cbab-d005-4a0c-27447508afd8")
public static String es_PE_COLUMN_DocumentNo_Name="No. del Documento";

@XendraColumn(AD_Element_ID="e3ca6e28-702a-2722-d941-b2072a0de9cb",ColumnName="DocumentNo",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=30,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a106d7f9-cbab-d005-4a0c-27447508afd8",
Synchronized="2017-08-05 16:55:16.0")
/** Column name DocumentNo */
public static final String COLUMNNAME_DocumentNo = "DocumentNo";
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
@XendraTrl(Identifier="baa7f732-7e2b-ae03-a72f-69b437474836")
public static String es_PE_FIELD_Move_AccountingFactIDPerDocument_Description="Se garantiza que este ID sea unico por cada cliente/ano/documento (en la tabla de asientos).";

@XendraTrl(Identifier="baa7f732-7e2b-ae03-a72f-69b437474836")
public static String es_PE_FIELD_Move_AccountingFactIDPerDocument_Name="ID Asiento Contable";

@XendraField(AD_Column_ID="Fact_ID",IsCentrallyMaintained=true,
AD_Tab_ID="a5d52faf-9070-d3e1-6152-a55851e259e7",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=220,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="baa7f732-7e2b-ae03-a72f-69b437474836")
public static final String FIELDNAME_Move_AccountingFactIDPerDocument="baa7f732-7e2b-ae03-a72f-69b437474836";

@XendraTrl(Identifier="881ae6e6-4d6d-70b7-6653-171fb24d681d")
public static String es_PE_COLUMN_Fact_ID_Name="ID Asiento Contable (por documento)";

@XendraColumn(AD_Element_ID="20f6c8ee-0151-735b-7a03-2006e09d8eb0",ColumnName="Fact_ID",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=20,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="881ae6e6-4d6d-70b7-6653-171fb24d681d",
Synchronized="2017-08-05 16:55:16.0")
/** Column name Fact_ID */
public static final String COLUMNNAME_Fact_ID = "Fact_ID";
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
@XendraTrl(Identifier="2f767dfd-824c-40e6-8620-58c5f2e30f24")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2f767dfd-824c-40e6-8620-58c5f2e30f24",
Synchronized="2017-08-05 16:55:16.0")
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

@XendraTrl(Identifier="e75f56da-9113-85d5-aceb-bc5201e8a591")
public static String es_PE_FIELD_Move_Approved_Description="Indica si este documento requiere aprobación";

@XendraTrl(Identifier="e75f56da-9113-85d5-aceb-bc5201e8a591")
public static String es_PE_FIELD_Move_Approved_Help="El Cuadro de Verificación  Aprobado indica si este documento requiere aprobación antes de que pueda ser procesado";

@XendraTrl(Identifier="e75f56da-9113-85d5-aceb-bc5201e8a591")
public static String es_PE_FIELD_Move_Approved_Name="Aprobación";

@XendraField(AD_Column_ID="IsApproved",IsCentrallyMaintained=true,
AD_Tab_ID="a5d52faf-9070-d3e1-6152-a55851e259e7",AD_FieldGroup_ID="Status",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=true,SeqNo=170,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e75f56da-9113-85d5-aceb-bc5201e8a591")
public static final String FIELDNAME_Move_Approved="e75f56da-9113-85d5-aceb-bc5201e8a591";

@XendraTrl(Identifier="84fcf0c9-cf39-8c08-ab07-0f4650b525ca")
public static String es_PE_COLUMN_IsApproved_Name="Aprobación";

@XendraColumn(AD_Element_ID="44388d99-07b7-b005-9e16-78884800beff",ColumnName="IsApproved",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="84fcf0c9-cf39-8c08-ab07-0f4650b525ca",
Synchronized="2017-08-05 16:55:16.0")
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

@XendraTrl(Identifier="87fa1cfc-62a3-4675-b1d1-2d489b052e88")
public static String es_PE_COLUMN_IsCosted_Name="IsCosted";

@XendraColumn(AD_Element_ID="1d2cca33-7933-6933-e8cd-036ca4cb806e",ColumnName="IsCosted",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="87fa1cfc-62a3-4675-b1d1-2d489b052e88",
Synchronized="2015-08-11 20:35:08.0")
/** Column name IsCosted */
public static final String COLUMNNAME_IsCosted = "IsCosted";
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

@XendraTrl(Identifier="22b6b64d-b2fa-c70d-b268-5bd523999fb6")
public static String es_PE_FIELD_Move_InTransit_Description="El Movimiento está en transito";

@XendraTrl(Identifier="22b6b64d-b2fa-c70d-b268-5bd523999fb6")
public static String es_PE_FIELD_Move_InTransit_Help="El movimiento de material está en tránsito - enviado, pero no recibido.";

@XendraTrl(Identifier="22b6b64d-b2fa-c70d-b268-5bd523999fb6")
public static String es_PE_FIELD_Move_InTransit_Name="En Transito";

@XendraField(AD_Column_ID="IsInTransit",IsCentrallyMaintained=true,
AD_Tab_ID="a5d52faf-9070-d3e1-6152-a55851e259e7",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=true,SeqNo=190,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="22b6b64d-b2fa-c70d-b268-5bd523999fb6")
public static final String FIELDNAME_Move_InTransit="22b6b64d-b2fa-c70d-b268-5bd523999fb6";

@XendraTrl(Identifier="741579ed-bfe8-7c2f-5dd3-5a64800d1c59")
public static String es_PE_COLUMN_IsInTransit_Name="En Transito";

@XendraColumn(AD_Element_ID="763c0703-d1fd-4d3b-1507-82f4ab57d51c",ColumnName="IsInTransit",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="741579ed-bfe8-7c2f-5dd3-5a64800d1c59",
Synchronized="2017-08-05 16:55:16.0")
/** Column name IsInTransit */
public static final String COLUMNNAME_IsInTransit = "IsInTransit";
/** Set Inventory Move.
@param M_Movement_ID Movement of Inventory */
public void setM_Movement_ID (int M_Movement_ID)
{
if (M_Movement_ID < 1) throw new IllegalArgumentException ("M_Movement_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_M_Movement_ID, Integer.valueOf(M_Movement_ID));
}
/** Get Inventory Move.
@return Movement of Inventory */
public int getM_Movement_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_Movement_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="84aa3bbd-745f-fee2-3e6a-a2ba7dc638cc")
public static String es_PE_FIELD_Move_InventoryMove_Description="Movimiento de inventario";

@XendraTrl(Identifier="84aa3bbd-745f-fee2-3e6a-a2ba7dc638cc")
public static String es_PE_FIELD_Move_InventoryMove_Help="El Movimiento de Inventario identifica únicamente un grupo de líneas de movimiento";

@XendraTrl(Identifier="84aa3bbd-745f-fee2-3e6a-a2ba7dc638cc")
public static String es_PE_FIELD_Move_InventoryMove_Name="Movimiento";

@XendraField(AD_Column_ID="M_Movement_ID",IsCentrallyMaintained=true,
AD_Tab_ID="a5d52faf-9070-d3e1-6152-a55851e259e7",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="84aa3bbd-745f-fee2-3e6a-a2ba7dc638cc")
public static final String FIELDNAME_Move_InventoryMove="84aa3bbd-745f-fee2-3e6a-a2ba7dc638cc";
/** Column name M_Movement_ID */
public static final String COLUMNNAME_M_Movement_ID = "M_Movement_ID";
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

@XendraTrl(Identifier="34e0009c-ebba-3d7f-6f9d-bc2de8751a36")
public static String es_PE_FIELD_Move_MovementDate_Description="Fecha en que un producto fue movido (dentro ó fuera) del inventario";

@XendraTrl(Identifier="34e0009c-ebba-3d7f-6f9d-bc2de8751a36")
public static String es_PE_FIELD_Move_MovementDate_Help="La fecha del movimiento indica la fecha en que el producto es movido. Éste es el resultado de un embarque; recibo ó movimiento de inventario.";

@XendraTrl(Identifier="34e0009c-ebba-3d7f-6f9d-bc2de8751a36")
public static String es_PE_FIELD_Move_MovementDate_Name="Fecha de Movimiento";

@XendraField(AD_Column_ID="MovementDate",IsCentrallyMaintained=true,
AD_Tab_ID="a5d52faf-9070-d3e1-6152-a55851e259e7",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="34e0009c-ebba-3d7f-6f9d-bc2de8751a36")
public static final String FIELDNAME_Move_MovementDate="34e0009c-ebba-3d7f-6f9d-bc2de8751a36";

@XendraTrl(Identifier="7bc35640-4003-8e3c-9470-aa97ee710127")
public static String es_PE_COLUMN_MovementDate_Name="Fecha de Movimiento";

@XendraColumn(AD_Element_ID="7a907f01-8525-820d-22d4-98b06d4b902b",ColumnName="MovementDate",
AD_Reference_ID=15,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,
DefaultValue="@SysDate@",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=true,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="7bc35640-4003-8e3c-9470-aa97ee710127",Synchronized="2017-08-05 16:55:16.0")
/** Column name MovementDate */
public static final String COLUMNNAME_MovementDate = "MovementDate";
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

@XendraTrl(Identifier="201b0048-63f7-2915-e8a3-e3c8a99ff5f2")
public static String es_PE_FIELD_Move_Shipper_Description="Método ó manera de entrega del producto";

@XendraTrl(Identifier="201b0048-63f7-2915-e8a3-e3c8a99ff5f2")
public static String es_PE_FIELD_Move_Shipper_Help="El transportista indica el responsable de entregar el producto";

@XendraTrl(Identifier="201b0048-63f7-2915-e8a3-e3c8a99ff5f2")
public static String es_PE_FIELD_Move_Shipper_Name="Transportista";

@XendraField(AD_Column_ID="M_Shipper_ID",IsCentrallyMaintained=true,
AD_Tab_ID="a5d52faf-9070-d3e1-6152-a55851e259e7",AD_FieldGroup_ID="Reference",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=150,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="201b0048-63f7-2915-e8a3-e3c8a99ff5f2")
public static final String FIELDNAME_Move_Shipper="201b0048-63f7-2915-e8a3-e3c8a99ff5f2";

@XendraTrl(Identifier="2ee36b86-fa8f-0462-12b1-2d083d098371")
public static String es_PE_COLUMN_M_Shipper_ID_Name="Transportista";

@XendraColumn(AD_Element_ID="9aa20cfc-6f2b-2463-7be0-888a548ba3ad",ColumnName="M_Shipper_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2ee36b86-fa8f-0462-12b1-2d083d098371",
Synchronized="2017-08-05 16:55:16.0")
/** Column name M_Shipper_ID */
public static final String COLUMNNAME_M_Shipper_ID = "M_Shipper_ID";
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

@XendraTrl(Identifier="48a52006-90f0-8bec-89d6-7f4afc29b228")
public static String es_PE_FIELD_Move_NoPackages_Description="Numero de paquetes embarcados.";

@XendraTrl(Identifier="48a52006-90f0-8bec-89d6-7f4afc29b228")
public static String es_PE_FIELD_Move_NoPackages_Name="No. Paquetes";

@XendraField(AD_Column_ID="NoPackages",IsCentrallyMaintained=true,
AD_Tab_ID="a5d52faf-9070-d3e1-6152-a55851e259e7",AD_FieldGroup_ID="Reference",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=140,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="48a52006-90f0-8bec-89d6-7f4afc29b228")
public static final String FIELDNAME_Move_NoPackages="48a52006-90f0-8bec-89d6-7f4afc29b228";

@XendraTrl(Identifier="7c1853f4-68fd-45a4-46a2-627f4686d4d5")
public static String es_PE_COLUMN_NoPackages_Name="No. Paquetes";

@XendraColumn(AD_Element_ID="ebdb4961-cbde-5be6-50dd-02f0a4017597",ColumnName="NoPackages",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7c1853f4-68fd-45a4-46a2-627f4686d4d5",
Synchronized="2017-08-05 16:55:16.0")
/** Column name NoPackages */
public static final String COLUMNNAME_NoPackages = "NoPackages";
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

@XendraTrl(Identifier="8c10f37a-c2fa-1fe8-f5ff-d9b625693e0f")
public static String es_PE_FIELD_Move_Posted_Description="Las transacciones de contabilidad general han sido procesadas.";

@XendraTrl(Identifier="8c10f37a-c2fa-1fe8-f5ff-d9b625693e0f")
public static String es_PE_FIELD_Move_Posted_Help="El campo fijado indica el estado de la generación de las Líneas contables a la contabilidad general.";

@XendraTrl(Identifier="8c10f37a-c2fa-1fe8-f5ff-d9b625693e0f")
public static String es_PE_FIELD_Move_Posted_Name="Fijada";
@XendraField(AD_Column_ID="Posted",
IsCentrallyMaintained=true,AD_Tab_ID="a5d52faf-9070-d3e1-6152-a55851e259e7",
AD_FieldGroup_ID="Status",IsDisplayed=true,DisplayLogic="@Processed@=Y & @#ShowAcct@=Y",
DisplayLength=23,IsReadOnly=false,SeqNo=210,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8c10f37a-c2fa-1fe8-f5ff-d9b625693e0f")
public static final String FIELDNAME_Move_Posted="8c10f37a-c2fa-1fe8-f5ff-d9b625693e0f";

@XendraTrl(Identifier="9d64ba07-e227-9553-4fb6-ec87202240cb")
public static String es_PE_COLUMN_Posted_Name="Fijada";

@XendraColumn(AD_Element_ID="5eb52ebc-6992-12f5-b85a-e0a136df259b",ColumnName="Posted",
AD_Reference_ID=28,AD_Reference_Value_ID="d2b659dd-6c8c-baf3-fc71-0ee997273154",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="9d64ba07-e227-9553-4fb6-ec87202240cb",Synchronized="2017-08-05 16:55:16.0")
/** Column name Posted */
public static final String COLUMNNAME_Posted = "Posted";

/** PriorityRule AD_Reference=bfacaeda-bbb9-ba51-d726-52826206b4d7 */
public static final int PRIORITYRULE_AD_Reference_ID=154;
/** Set Priority.
@param PriorityRule Priority of a document */
public void setPriorityRule (String PriorityRule)
{
if (PriorityRule == null || PriorityRule.equals(REF__PriorityRule.High) || PriorityRule.equals(REF__PriorityRule.Medium) || PriorityRule.equals(REF__PriorityRule.Low) || PriorityRule.equals(REF__PriorityRule.Urgent) || PriorityRule.equals(REF__PriorityRule.Minor));
 else throw new IllegalArgumentException ("PriorityRule Invalid value - " + PriorityRule + " - Reference_ID=154 - 3 - 5 - 7 - 1 - 9");
if (PriorityRule != null && PriorityRule.length() > 1)
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

@XendraTrl(Identifier="e0c86c8c-9266-44d9-962e-de603b8f2b4c")
public static String es_PE_COLUMN_PriorityRule_Name="Priority";

@XendraColumn(AD_Element_ID="8ff1ec26-d036-3761-33be-8de919b0ed5c",ColumnName="PriorityRule",
AD_Reference_ID=17,AD_Reference_Value_ID="bfacaeda-bbb9-ba51-d726-52826206b4d7",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="e0c86c8c-9266-44d9-962e-de603b8f2b4c",Synchronized="2017-08-05 16:55:16.0")
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

@XendraTrl(Identifier="dd3aa356-91a0-4af9-128c-63099da817c1")
public static String es_PE_FIELD_Move_Processed_Description="El documento ha sido procesado";

@XendraTrl(Identifier="dd3aa356-91a0-4af9-128c-63099da817c1")
public static String es_PE_FIELD_Move_Processed_Help="El cuadro de verificación procesada indica que un documento ha sido procesado";

@XendraTrl(Identifier="dd3aa356-91a0-4af9-128c-63099da817c1")
public static String es_PE_FIELD_Move_Processed_Name="Procesado";

@XendraField(AD_Column_ID="Processed",IsCentrallyMaintained=true,
AD_Tab_ID="a5d52faf-9070-d3e1-6152-a55851e259e7",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@Processed@=Y",DisplayLength=1,IsReadOnly=true,SeqNo=250,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="dd3aa356-91a0-4af9-128c-63099da817c1")
public static final String FIELDNAME_Move_Processed="dd3aa356-91a0-4af9-128c-63099da817c1";

@XendraTrl(Identifier="2887836e-a7e3-5839-7668-546ab0d97046")
public static String es_PE_COLUMN_Processed_Name="Procesado";

@XendraColumn(AD_Element_ID="3f7035d2-fa5e-7416-fc0c-e49e43f9e083",ColumnName="Processed",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2887836e-a7e3-5839-7668-546ab0d97046",
Synchronized="2017-08-05 16:55:16.0")
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

@XendraTrl(Identifier="6ec5b196-784f-12e5-a47a-6ce6a589032f")
public static String es_PE_FIELD_Move_ProcessNow_Name="Procesar Ahora";

@XendraField(AD_Column_ID="Processing",IsCentrallyMaintained=true,
AD_Tab_ID="a5d52faf-9070-d3e1-6152-a55851e259e7",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6ec5b196-784f-12e5-a47a-6ce6a589032f")
public static final String FIELDNAME_Move_ProcessNow="6ec5b196-784f-12e5-a47a-6ce6a589032f";

@XendraTrl(Identifier="a143338d-630c-98e3-3cf9-360d6864b127")
public static String es_PE_COLUMN_Processing_Name="Procesar Ahora";

@XendraColumn(AD_Element_ID="f2096404-1a98-35ec-09ea-273b3e19b7de",ColumnName="Processing",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a143338d-630c-98e3-3cf9-360d6864b127",
Synchronized="2017-08-05 16:55:16.0")
/** Column name Processing */
public static final String COLUMNNAME_Processing = "Processing";
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

@XendraTrl(Identifier="32b045d5-8415-bbc4-410c-a6670f2b8a9e")
public static String es_PE_FIELD_Move_ShipDate_Description="Fecha de entrega Fecha/Hora";

@XendraTrl(Identifier="32b045d5-8415-bbc4-410c-a6670f2b8a9e")
public static String es_PE_FIELD_Move_ShipDate_Help="Fecha actual Fecha/Hora de entrega (recolección)";

@XendraTrl(Identifier="32b045d5-8415-bbc4-410c-a6670f2b8a9e")
public static String es_PE_FIELD_Move_ShipDate_Name="Fecha de entrega";

@XendraField(AD_Column_ID="ShipDate",IsCentrallyMaintained=true,
AD_Tab_ID="a5d52faf-9070-d3e1-6152-a55851e259e7",AD_FieldGroup_ID="Reference",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=120,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="32b045d5-8415-bbc4-410c-a6670f2b8a9e")
public static final String FIELDNAME_Move_ShipDate="32b045d5-8415-bbc4-410c-a6670f2b8a9e";

@XendraTrl(Identifier="af422b66-405f-c2f2-655d-51b1965a96d6")
public static String es_PE_COLUMN_ShipDate_Name="Fecha de entrega";

@XendraColumn(AD_Element_ID="d8b9eadd-d7de-545a-a14d-fe481306c7ec",ColumnName="ShipDate",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=29,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="af422b66-405f-c2f2-655d-51b1965a96d6",
Synchronized="2017-08-05 16:55:16.0")
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
@XendraTrl(Identifier="193c1d14-2fc3-a1af-7b8e-82bb8bda25a2")
public static String es_PE_FIELD_Move_TrackingNo_Description="Número de seguimiento de entrega";

@XendraTrl(Identifier="193c1d14-2fc3-a1af-7b8e-82bb8bda25a2")
public static String es_PE_FIELD_Move_TrackingNo_Name="No. Seguimiento";

@XendraField(AD_Column_ID="TrackingNo",IsCentrallyMaintained=true,
AD_Tab_ID="a5d52faf-9070-d3e1-6152-a55851e259e7",AD_FieldGroup_ID="Reference",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=130,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="193c1d14-2fc3-a1af-7b8e-82bb8bda25a2")
public static final String FIELDNAME_Move_TrackingNo="193c1d14-2fc3-a1af-7b8e-82bb8bda25a2";

@XendraTrl(Identifier="9ac7ca5d-a960-0e9b-c11c-b4ff35dd91ad")
public static String es_PE_COLUMN_TrackingNo_Name="No. Seguimiento";

@XendraColumn(AD_Element_ID="e8e2d2ef-a81e-d656-dad5-1e2e466ffbb9",ColumnName="TrackingNo",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9ac7ca5d-a960-0e9b-c11c-b4ff35dd91ad",
Synchronized="2017-08-05 16:55:16.0")
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

@XendraTrl(Identifier="9fd94acf-fb4d-4cf1-00d2-50a3789c6714")
public static String es_PE_FIELD_Move_UserList_Description="El usuario definió el elemento # 1";

@XendraTrl(Identifier="9fd94acf-fb4d-4cf1-00d2-50a3789c6714")
public static String es_PE_FIELD_Move_UserList_Help="El elemento definido por el usuario despliega los elementos opcionales que han sido definidos para esta combinación de cuentas";

@XendraTrl(Identifier="9fd94acf-fb4d-4cf1-00d2-50a3789c6714")
public static String es_PE_FIELD_Move_UserList_Name="Usuario 1";

@XendraField(AD_Column_ID="User1_ID",IsCentrallyMaintained=true,
AD_Tab_ID="a5d52faf-9070-d3e1-6152-a55851e259e7",AD_FieldGroup_ID="Reference",IsDisplayed=true,
DisplayLogic="@$Element_U1@=Y",DisplayLength=14,IsReadOnly=false,SeqNo=90,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="9fd94acf-fb4d-4cf1-00d2-50a3789c6714")
public static final String FIELDNAME_Move_UserList="9fd94acf-fb4d-4cf1-00d2-50a3789c6714";

@XendraTrl(Identifier="f96f5c17-54de-76cf-fc34-d6323a752749")
public static String es_PE_COLUMN_User1_ID_Name="Usuario 1";

@XendraColumn(AD_Element_ID="07453e74-aadd-d9c9-e543-837a6fdb3094",ColumnName="User1_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="5a2fe161-044f-67cb-3791-6d615980cabb",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="f96f5c17-54de-76cf-fc34-d6323a752749",Synchronized="2017-08-05 16:55:16.0")
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

@XendraTrl(Identifier="51e512c2-c895-9819-0269-4ad5d2318562")
public static String es_PE_FIELD_Move_UserList22_Description="El usuario definió el elemento # 2";

@XendraTrl(Identifier="51e512c2-c895-9819-0269-4ad5d2318562")
public static String es_PE_FIELD_Move_UserList22_Help="El elemento definido por el usuario despliega los elementos opcionales que han sido definidos para esta combinación de cuentas";

@XendraTrl(Identifier="51e512c2-c895-9819-0269-4ad5d2318562")
public static String es_PE_FIELD_Move_UserList22_Name="Usuario 2";

@XendraField(AD_Column_ID="User2_ID",IsCentrallyMaintained=true,
AD_Tab_ID="a5d52faf-9070-d3e1-6152-a55851e259e7",AD_FieldGroup_ID="Reference",IsDisplayed=true,
DisplayLogic="@$Element_U2@=Y",DisplayLength=14,IsReadOnly=false,SeqNo=100,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="51e512c2-c895-9819-0269-4ad5d2318562")
public static final String FIELDNAME_Move_UserList22="51e512c2-c895-9819-0269-4ad5d2318562";

@XendraTrl(Identifier="65f10677-9fda-42ed-8812-e7f58864237f")
public static String es_PE_COLUMN_User2_ID_Name="Usuario 2";

@XendraColumn(AD_Element_ID="1b668c90-6743-20a2-df62-576857d72c06",ColumnName="User2_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="6a357ab2-7bb6-fce4-ffee-8bdd855a77fc",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="65f10677-9fda-42ed-8812-e7f58864237f",Synchronized="2017-08-05 16:55:16.0")
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
@XendraTrl(Identifier="05930f2b-03ca-b3aa-f8e9-a025bd4e10a7")
public static String es_PE_FIELD_Move_Vehicle_Help="";

@XendraTrl(Identifier="05930f2b-03ca-b3aa-f8e9-a025bd4e10a7")
public static String es_PE_FIELD_Move_Vehicle_Name="Vehículo";
@XendraField(AD_Column_ID="Vehicle",
IsCentrallyMaintained=true,AD_Tab_ID="a5d52faf-9070-d3e1-6152-a55851e259e7",
AD_FieldGroup_ID="Reference",IsDisplayed=true,DisplayLogic="",DisplayLength=10,IsReadOnly=false,
SeqNo=160,SortNo=0,IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="05930f2b-03ca-b3aa-f8e9-a025bd4e10a7")
public static final String FIELDNAME_Move_Vehicle="05930f2b-03ca-b3aa-f8e9-a025bd4e10a7";

@XendraTrl(Identifier="e4bce6f9-006d-b703-0245-d95e22c31b32")
public static String es_PE_COLUMN_Vehicle_Name="vehicle";

@XendraColumn(AD_Element_ID="901cf364-a4d1-ac46-30aa-2394da346dc2",ColumnName="Vehicle",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e4bce6f9-006d-b703-0245-d95e22c31b32",
Synchronized="2017-08-05 16:55:16.0")
/** Column name Vehicle */
public static final String COLUMNNAME_Vehicle = "Vehicle";
}
