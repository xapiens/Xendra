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
/** Generated Model for C_Cash
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_C_Cash extends PO
{
/** Standard Constructor
@param ctx context
@param C_Cash_ID id
@param trxName transaction
*/
public X_C_Cash (Properties ctx, int C_Cash_ID, String trxName)
{
super (ctx, C_Cash_ID, trxName);
/** if (C_Cash_ID == 0)
{
setBeginningBalance (Env.ZERO);	
// 0
setC_CashBook_ID (0);
setC_Cash_ID (0);
setDateAcct (new Timestamp(System.currentTimeMillis()));	
// @#Date@
setDocAction (null);	
// CO
setDocStatus (null);	
// DR
setEndingBalance (Env.ZERO);	
// 0
setIsApproved (false);	
// N
setName (null);	
// @#Date@
setPosted (false);	
// N
setProcessed (false);	
// N
setStatementDate (new Timestamp(System.currentTimeMillis()));	
// @#Date@
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_C_Cash (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=407 */
public static int Table_ID=MTable.getTable_ID("C_Cash");

@XendraTrl(Identifier="e68dd387-5f14-b188-36a8-b7bbb83b7316")
public static String es_PE_TAB_CashJournal_Description="Diario de Efectivo";

@XendraTrl(Identifier="e68dd387-5f14-b188-36a8-b7bbb83b7316")
public static String es_PE_TAB_CashJournal_Help="La pestaña Diario de Efectivo define los parámetros de esta entrada de diario.";

@XendraTrl(Identifier="e68dd387-5f14-b188-36a8-b7bbb83b7316")
public static String es_PE_TAB_CashJournal_Name="Diario de Efectivo";

@XendraTab(Name="Cash Journal",Description="Cash Journal",
Help="The Cash Journal Tab defines the parameters for this journal.",
AD_Window_ID="8d49c49d-eac3-71bc-171f-8a06ff4f4ab2",SeqNo=10,TabLevel=0,IsSingleRow=true,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="e68dd387-5f14-b188-36a8-b7bbb83b7316",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_CashJournal="e68dd387-5f14-b188-36a8-b7bbb83b7316";

@XendraTrl(Identifier="0ad94ea3-6b1f-830d-408f-4ca92b26cb35")
public static String es_PE_TABLE_C_Cash_Name="Diario de Efectivo";

@XendraTable(Name="Cash Journal",AD_Package_ID="98af94a4-a4cd-bdc0-5651-5880caf79899",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="Cash Journal",Help="",
TableName="C_Cash",AccessLevel="3",AD_Window_ID="8d49c49d-eac3-71bc-171f-8a06ff4f4ab2",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=130,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=false,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.commercial",
Identifier="0ad94ea3-6b1f-830d-408f-4ca92b26cb35",Synchronized="2020-03-28 17:24:25.0")
/** TableName=C_Cash */
public static final String Table_Name="C_Cash";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"C_Cash");

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
    Table_ID = MTable.getTable_ID("C_Cash");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_C_Cash[").append(get_ID()).append("]");
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

@XendraTrl(Identifier="baf02f53-9d84-9bed-b45f-d5104ee86e51")
public static String es_PE_FIELD_CashJournal_TrxOrganization_Name="Organización de la Trans.";

@XendraTrl(Identifier="baf02f53-9d84-9bed-b45f-d5104ee86e51")
public static String es_PE_FIELD_CashJournal_TrxOrganization_Description="Organización que inicia ó ejecuta la transacción";

@XendraTrl(Identifier="baf02f53-9d84-9bed-b45f-d5104ee86e51")
public static String es_PE_FIELD_CashJournal_TrxOrganization_Help="La organización que inicia ó ejecuta la transacción (para otra organización). La organización poseedora puede no ser la organización de la transacción en un ambiente de buró de servicio; con servicios centralizados y transacciones inter- organización.";

@XendraField(AD_Column_ID="AD_OrgTrx_ID",IsCentrallyMaintained=true,
AD_Tab_ID="e68dd387-5f14-b188-36a8-b7bbb83b7316",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@$Element_OT@=Y",DisplayLength=14,IsReadOnly=false,SeqNo=110,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="baf02f53-9d84-9bed-b45f-d5104ee86e51")
public static final String FIELDNAME_CashJournal_TrxOrganization="baf02f53-9d84-9bed-b45f-d5104ee86e51";

@XendraTrl(Identifier="6fea3214-3d4a-4772-202c-63321346bad8")
public static String es_PE_COLUMN_AD_OrgTrx_ID_Name="Organización de la Trans.";

@XendraColumn(AD_Element_ID="b4180358-67aa-fe55-0409-6367a60e0a2e",ColumnName="AD_OrgTrx_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="54e78591-f7f4-c613-ea27-e64b3dac5198",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="6fea3214-3d4a-4772-202c-63321346bad8",Synchronized="2020-03-13 21:02:16.0")
/** Column name AD_OrgTrx_ID */
public static final String COLUMNNAME_AD_OrgTrx_ID = "AD_OrgTrx_ID";
/** Set Beginning Balance.
@param BeginningBalance Balance prior to any transactions */
public void setBeginningBalance (BigDecimal BeginningBalance)
{
if (BeginningBalance == null) throw new IllegalArgumentException ("BeginningBalance is mandatory.");
set_Value (COLUMNNAME_BeginningBalance, BeginningBalance);
}
/** Get Beginning Balance.
@return Balance prior to any transactions */
public BigDecimal getBeginningBalance() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_BeginningBalance);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="4680430a-6f23-f7fa-3ebd-e011bedd2342")
public static String es_PE_FIELD_CashJournal_BeginningBalance_Name="Saldo Inicial";

@XendraTrl(Identifier="4680430a-6f23-f7fa-3ebd-e011bedd2342")
public static String es_PE_FIELD_CashJournal_BeginningBalance_Description="Saldo anterior a cualquier transacción";

@XendraTrl(Identifier="4680430a-6f23-f7fa-3ebd-e011bedd2342")
public static String es_PE_FIELD_CashJournal_BeginningBalance_Help="El saldo Inicial es el saldo anterior a hacer cualquier ajuste a los pagos ó desembolsos.";

@XendraField(AD_Column_ID="BeginningBalance",IsCentrallyMaintained=true,
AD_Tab_ID="e68dd387-5f14-b188-36a8-b7bbb83b7316",AD_FieldGroup_ID="Status",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=160,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="4680430a-6f23-f7fa-3ebd-e011bedd2342")
public static final String FIELDNAME_CashJournal_BeginningBalance="4680430a-6f23-f7fa-3ebd-e011bedd2342";

@XendraTrl(Identifier="7a9f864f-ed9c-6452-7cf2-2d9cda2893f6")
public static String es_PE_COLUMN_BeginningBalance_Name="Saldo Inicial";

@XendraColumn(AD_Element_ID="de1a5546-dd89-8879-f8ba-d6afe929dbd6",ColumnName="BeginningBalance",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7a9f864f-ed9c-6452-7cf2-2d9cda2893f6",
Synchronized="2020-03-13 21:02:16.0")
/** Column name BeginningBalance */
public static final String COLUMNNAME_BeginningBalance = "BeginningBalance";
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

@XendraTrl(Identifier="46b62b31-5ccd-8a5f-a721-1e274a6143a9")
public static String es_PE_FIELD_CashJournal_Activity_Name="Tipo de Gasto";

@XendraTrl(Identifier="46b62b31-5ccd-8a5f-a721-1e274a6143a9")
public static String es_PE_FIELD_CashJournal_Activity_Description="Actividad de Negocio";

@XendraTrl(Identifier="46b62b31-5ccd-8a5f-a721-1e274a6143a9")
public static String es_PE_FIELD_CashJournal_Activity_Help="Las actividades indican tareas que son ejecutadas en el curso de un negocio; las actividades son usadas para el costeo por actividad (ABC)";

@XendraField(AD_Column_ID="C_Activity_ID",IsCentrallyMaintained=true,
AD_Tab_ID="e68dd387-5f14-b188-36a8-b7bbb83b7316",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@$Element_AY@=Y",DisplayLength=14,IsReadOnly=false,SeqNo=100,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="46b62b31-5ccd-8a5f-a721-1e274a6143a9")
public static final String FIELDNAME_CashJournal_Activity="46b62b31-5ccd-8a5f-a721-1e274a6143a9";

@XendraTrl(Identifier="bfb163c1-9643-0ca4-f57c-8a71199d63a7")
public static String es_PE_COLUMN_C_Activity_ID_Name="Tipo de Gasto";

@XendraColumn(AD_Element_ID="bfeadbb3-d866-26e3-8eee-3e2fdf0ff753",ColumnName="C_Activity_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="bfb163c1-9643-0ca4-f57c-8a71199d63a7",
Synchronized="2020-03-13 21:02:17.0")
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

@XendraTrl(Identifier="87c4c35c-9108-0041-2f26-b129b2dfd919")
public static String es_PE_FIELD_CashJournal_BusinessPartner_Name="Socio de Negocio";

@XendraTrl(Identifier="87c4c35c-9108-0041-2f26-b129b2dfd919")
public static String es_PE_FIELD_CashJournal_BusinessPartner_Description="Identifica un Socio de Negocio";

@XendraTrl(Identifier="87c4c35c-9108-0041-2f26-b129b2dfd919")
public static String es_PE_FIELD_CashJournal_BusinessPartner_Help="Un socio de negocio es cualquiera con quien usted realiza transacciones. Este puede incluir Proveedores; Clientes; Empleados ó Vendedores.";

@XendraField(AD_Column_ID="C_BPartner_ID",IsCentrallyMaintained=true,
AD_Tab_ID="e68dd387-5f14-b188-36a8-b7bbb83b7316",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=150,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="87c4c35c-9108-0041-2f26-b129b2dfd919")
public static final String FIELDNAME_CashJournal_BusinessPartner="87c4c35c-9108-0041-2f26-b129b2dfd919";

@XendraTrl(Identifier="2caacdd9-27e1-7b42-be10-d6f012d420c6")
public static String es_PE_COLUMN_C_BPartner_ID_Name="Business Partner ";

@XendraColumn(AD_Element_ID="fe333dc3-4f40-1276-5f6a-d09bb66dc423",ColumnName="C_BPartner_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2caacdd9-27e1-7b42-be10-d6f012d420c6",
Synchronized="2020-03-13 21:02:17.0")
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

@XendraTrl(Identifier="a057fae1-8da2-da52-136b-eb434a755b9d")
public static String es_PE_FIELD_CashJournal_Campaign_Name="Campaña";

@XendraTrl(Identifier="a057fae1-8da2-da52-136b-eb434a755b9d")
public static String es_PE_FIELD_CashJournal_Campaign_Description="Campaña de Mercadeo";

@XendraTrl(Identifier="a057fae1-8da2-da52-136b-eb434a755b9d")
public static String es_PE_FIELD_CashJournal_Campaign_Help="La Campaña define un programa de mercadotecnia único. Los proyectos pueden estar asociados con una campaña de mercadotecnia única. Usted puede entonces reportar basado en una campaña específica";

@XendraField(AD_Column_ID="C_Campaign_ID",IsCentrallyMaintained=true,
AD_Tab_ID="e68dd387-5f14-b188-36a8-b7bbb83b7316",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="@$Element_MC@=Y",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a057fae1-8da2-da52-136b-eb434a755b9d")
public static final String FIELDNAME_CashJournal_Campaign="a057fae1-8da2-da52-136b-eb434a755b9d";

@XendraTrl(Identifier="8cd8b4e7-3e20-2f29-9b31-262688c8fc43")
public static String es_PE_COLUMN_C_Campaign_ID_Name="Campaña";

@XendraColumn(AD_Element_ID="6cf08e31-d355-ee38-9c0b-bee20b3ea5b6",ColumnName="C_Campaign_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="8cd8b4e7-3e20-2f29-9b31-262688c8fc43",
Synchronized="2020-03-13 21:02:17.0")
/** Column name C_Campaign_ID */
public static final String COLUMNNAME_C_Campaign_ID = "C_Campaign_ID";
/** Set Cash Book.
@param C_CashBook_ID Cash Book for recording petty cash transactions */
public void setC_CashBook_ID (int C_CashBook_ID)
{
if (C_CashBook_ID < 1) throw new IllegalArgumentException ("C_CashBook_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_CashBook_ID, Integer.valueOf(C_CashBook_ID));
}
/** Get Cash Book.
@return Cash Book for recording petty cash transactions */
public int getC_CashBook_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_CashBook_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="f0e82448-b278-6e34-ee00-7a7fff6ef629")
public static String es_PE_FIELD_CashJournal_CashBook_Name="Libro de Efectivo";

@XendraTrl(Identifier="f0e82448-b278-6e34-ee00-7a7fff6ef629")
public static String es_PE_FIELD_CashJournal_CashBook_Description="Libro de efectivo para registrar transacciones de caja chica.";

@XendraTrl(Identifier="f0e82448-b278-6e34-ee00-7a7fff6ef629")
public static String es_PE_FIELD_CashJournal_CashBook_Help="El libro de efectivo identifica un libro de efectivo único. El libro de efectivo se usa para registrar transacciones de efectivo.";

@XendraField(AD_Column_ID="C_CashBook_ID",IsCentrallyMaintained=true,
AD_Tab_ID="e68dd387-5f14-b188-36a8-b7bbb83b7316",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f0e82448-b278-6e34-ee00-7a7fff6ef629")
public static final String FIELDNAME_CashJournal_CashBook="f0e82448-b278-6e34-ee00-7a7fff6ef629";

@XendraTrl(Identifier="45398258-2a59-cb4f-3b00-c8dbbd702ea8")
public static String es_PE_COLUMN_C_CashBook_ID_Name="Libro de Efectivo";

@XendraColumn(AD_Element_ID="30688c51-d454-8026-32c4-990b9ea9ddf2",ColumnName="C_CashBook_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="2254195b-0e6b-fd71-d72f-9016f5594470",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=true,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="45398258-2a59-cb4f-3b00-c8dbbd702ea8",Synchronized="2020-03-13 21:02:17.0")
/** Column name C_CashBook_ID */
public static final String COLUMNNAME_C_CashBook_ID = "C_CashBook_ID";
/** Set Cash Journal.
@param C_Cash_ID Cash Journal */
public void setC_Cash_ID (int C_Cash_ID)
{
if (C_Cash_ID < 1) throw new IllegalArgumentException ("C_Cash_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_Cash_ID, Integer.valueOf(C_Cash_ID));
}
/** Get Cash Journal.
@return Cash Journal */
public int getC_Cash_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Cash_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="e7100029-604d-982e-35d2-6f0cd51350f6")
public static String es_PE_FIELD_CashJournal_CashJournal_Name="Diario de Efectivo";

@XendraTrl(Identifier="e7100029-604d-982e-35d2-6f0cd51350f6")
public static String es_PE_FIELD_CashJournal_CashJournal_Description="Diario de efectivo";

@XendraTrl(Identifier="e7100029-604d-982e-35d2-6f0cd51350f6")
public static String es_PE_FIELD_CashJournal_CashJournal_Help="El diario de efectivo identifica únicamente un diario de efectivo. El diario de efectivo registrará las transacciones para la cuenta de bancos";

@XendraField(AD_Column_ID="C_Cash_ID",IsCentrallyMaintained=true,
AD_Tab_ID="e68dd387-5f14-b188-36a8-b7bbb83b7316",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e7100029-604d-982e-35d2-6f0cd51350f6")
public static final String FIELDNAME_CashJournal_CashJournal="e7100029-604d-982e-35d2-6f0cd51350f6";
/** Column name C_Cash_ID */
public static final String COLUMNNAME_C_Cash_ID = "C_Cash_ID";
/** Set Document Type.
@param C_DocType_ID Document type or rules */
public void setC_DocType_ID (int C_DocType_ID)
{
if (C_DocType_ID <= 0) set_Value (COLUMNNAME_C_DocType_ID, null);
 else 
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

@XendraTrl(Identifier="506d582c-0a15-4954-b1ed-7a898ab92b01")
public static String es_PE_FIELD_CashJournal_DocumentType_Name="Tipo de Documento";

@XendraTrl(Identifier="506d582c-0a15-4954-b1ed-7a898ab92b01")
public static String es_PE_FIELD_CashJournal_DocumentType_Description="Tipo de documento ó reglas";

@XendraTrl(Identifier="506d582c-0a15-4954-b1ed-7a898ab92b01")
public static String es_PE_FIELD_CashJournal_DocumentType_Help="El tipo de documento determina la secuencia del documento y las reglas de proceso";

@XendraField(AD_Column_ID="C_DocType_ID",IsCentrallyMaintained=true,
AD_Tab_ID="e68dd387-5f14-b188-36a8-b7bbb83b7316",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=250,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2018-08-19 00:57:13.0",
Identifier="506d582c-0a15-4954-b1ed-7a898ab92b01")
public static final String FIELDNAME_CashJournal_DocumentType="506d582c-0a15-4954-b1ed-7a898ab92b01";

@XendraTrl(Identifier="73271e77-ec2f-496c-a4fa-d6db5704b411")
public static String es_PE_COLUMN_C_DocType_ID_Name="Document Type";

@XendraColumn(AD_Element_ID="099a4147-1a72-cdd0-81e0-8bdbc8c0b883",ColumnName="C_DocType_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="1a786e3c-0d6b-4e6d-a33e-b00b4777587e",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="73271e77-ec2f-496c-a4fa-d6db5704b411",Synchronized="2020-03-13 21:02:17.0")
/** Column name C_DocType_ID */
public static final String COLUMNNAME_C_DocType_ID = "C_DocType_ID";
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

@XendraTrl(Identifier="4ec29c56-86c1-1c66-f485-6aee71b38823")
public static String es_PE_FIELD_CashJournal_Payment_Name="Pago";

@XendraTrl(Identifier="4ec29c56-86c1-1c66-f485-6aee71b38823")
public static String es_PE_FIELD_CashJournal_Payment_Description="Identificador del pago";

@XendraTrl(Identifier="4ec29c56-86c1-1c66-f485-6aee71b38823")
public static String es_PE_FIELD_CashJournal_Payment_Help="El pago es un identificador único de este pago.";

@XendraField(AD_Column_ID="C_Payment_ID",IsCentrallyMaintained=true,
AD_Tab_ID="e68dd387-5f14-b188-36a8-b7bbb83b7316",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=0,IsReadOnly=false,SeqNo=140,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="4ec29c56-86c1-1c66-f485-6aee71b38823")
public static final String FIELDNAME_CashJournal_Payment="4ec29c56-86c1-1c66-f485-6aee71b38823";

@XendraTrl(Identifier="467fc28f-b2e7-6bcb-293e-81a9e901c2b3")
public static String es_PE_COLUMN_C_Payment_ID_Name="Pago";

@XendraColumn(AD_Element_ID="3ded5658-968e-94c5-207b-eed6f6a7bb43",ColumnName="C_Payment_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="5aad417c-0025-18b8-bcd7-8f599dec57a1",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="org.compiere.model.CalloutCashJournal.payment",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="467fc28f-b2e7-6bcb-293e-81a9e901c2b3",
Synchronized="2020-03-13 21:02:17.0")
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

@XendraTrl(Identifier="e6c0ab7c-87b5-e301-c4a1-a10cd6844024")
public static String es_PE_FIELD_CashJournal_Project_Name="Proyecto";

@XendraTrl(Identifier="e6c0ab7c-87b5-e301-c4a1-a10cd6844024")
public static String es_PE_FIELD_CashJournal_Project_Description="Identifica un proyecto único";

@XendraTrl(Identifier="e6c0ab7c-87b5-e301-c4a1-a10cd6844024")
public static String es_PE_FIELD_CashJournal_Project_Help="La ID de un proyecto es un identificador definido por el usuario para un proyecto";

@XendraField(AD_Column_ID="C_Project_ID",IsCentrallyMaintained=true,
AD_Tab_ID="e68dd387-5f14-b188-36a8-b7bbb83b7316",AD_FieldGroup_ID="Reference",IsDisplayed=false,
DisplayLogic="@$Element_PJ@=Y",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e6c0ab7c-87b5-e301-c4a1-a10cd6844024")
public static final String FIELDNAME_CashJournal_Project="e6c0ab7c-87b5-e301-c4a1-a10cd6844024";

@XendraTrl(Identifier="72477d6f-00bb-9437-d616-627b8cabfca3")
public static String es_PE_COLUMN_C_Project_ID_Name="Proyecto";

@XendraColumn(AD_Element_ID="16ff5dcc-9178-73dd-e618-e88bd79d573b",ColumnName="C_Project_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="72477d6f-00bb-9437-d616-627b8cabfca3",
Synchronized="2020-03-13 21:02:17.0")
/** Column name C_Project_ID */
public static final String COLUMNNAME_C_Project_ID = "C_Project_ID";
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

@XendraTrl(Identifier="1af9b2c3-7ad9-99d7-347d-13b864210d9b")
public static String es_PE_FIELD_CashJournal_AccountDate_Name="Fecha de Aplicación CG";

@XendraTrl(Identifier="1af9b2c3-7ad9-99d7-347d-13b864210d9b")
public static String es_PE_FIELD_CashJournal_AccountDate_Description="Fecha contable";

@XendraTrl(Identifier="1af9b2c3-7ad9-99d7-347d-13b864210d9b")
public static String es_PE_FIELD_CashJournal_AccountDate_Help="La fecha contable indica la fecha a ser usada en las cuentas de contabilidad general generadas desde este documento";

@XendraField(AD_Column_ID="DateAcct",IsCentrallyMaintained=true,
AD_Tab_ID="e68dd387-5f14-b188-36a8-b7bbb83b7316",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1af9b2c3-7ad9-99d7-347d-13b864210d9b")
public static final String FIELDNAME_CashJournal_AccountDate="1af9b2c3-7ad9-99d7-347d-13b864210d9b";

@XendraTrl(Identifier="375efa7b-d9c5-dbe1-b53c-c9bda314d8c1")
public static String es_PE_COLUMN_DateAcct_Name="Fecha de Aplicación CG";

@XendraColumn(AD_Element_ID="034727d0-e80f-fadf-3d4f-2d8d37b75669",ColumnName="DateAcct",
AD_Reference_ID=15,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="@#Date@",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="375efa7b-d9c5-dbe1-b53c-c9bda314d8c1",
Synchronized="2020-03-13 21:02:17.0")
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

@XendraTrl(Identifier="00c74170-6f38-58a2-a6c9-e3a80aaca3cf")
public static String es_PE_FIELD_CashJournal_Description_Name="Observación";

@XendraTrl(Identifier="00c74170-6f38-58a2-a6c9-e3a80aaca3cf")
public static String es_PE_FIELD_CashJournal_Description_Description="Observación corta opcional del registro";

@XendraTrl(Identifier="00c74170-6f38-58a2-a6c9-e3a80aaca3cf")
public static String es_PE_FIELD_CashJournal_Description_Help="Una Observación esta limitada a 255 caracteres";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="e68dd387-5f14-b188-36a8-b7bbb83b7316",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="00c74170-6f38-58a2-a6c9-e3a80aaca3cf")
public static final String FIELDNAME_CashJournal_Description="00c74170-6f38-58a2-a6c9-e3a80aaca3cf";

@XendraTrl(Identifier="4805935c-2fd2-2a56-74de-2fc8e559fb66")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=true,ColumnSQL="",
IsAllowLogging=false,Identifier="4805935c-2fd2-2a56-74de-2fc8e559fb66",
Synchronized="2020-03-13 21:02:17.0")
/** Column name Description */
public static final String COLUMNNAME_Description = "Description";
/** Set Document Action.
@param DocAction The targeted status of the document */
public void setDocAction (String DocAction)
{
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

@XendraTrl(Identifier="ca660154-4540-29fb-3bed-15df892aba49")
public static String es_PE_FIELD_CashJournal_ProcessCash_Name="Procesar Caja";

@XendraField(AD_Column_ID="DocAction",IsCentrallyMaintained=true,
AD_Tab_ID="e68dd387-5f14-b188-36a8-b7bbb83b7316",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=210,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ca660154-4540-29fb-3bed-15df892aba49")
public static final String FIELDNAME_CashJournal_ProcessCash="ca660154-4540-29fb-3bed-15df892aba49";

@XendraTrl(Identifier="bc23438f-4313-079d-d948-82f33ab1b760")
public static String es_PE_COLUMN_DocAction_Name="Acción en el Documento";

@XendraColumn(AD_Element_ID="d4b9075b-18e5-ebbb-5565-d217a7e531cb",ColumnName="DocAction",
AD_Reference_ID=28,AD_Reference_Value_ID="e397c9b0-c643-d1cd-8380-20bee13b2a6e",AD_Val_Rule_ID="",
FieldLength=2,DefaultValue="CO",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,
AD_Process_ID="491e8707-6ade-9df0-133e-677a454f13fe",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="bc23438f-4313-079d-d948-82f33ab1b760",
Synchronized="2020-03-13 21:02:17.0")
/** Column name DocAction */
public static final String COLUMNNAME_DocAction = "DocAction";
/** Set Document Status.
@param DocStatus The current status of the document */
public void setDocStatus (String DocStatus)
{
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

@XendraTrl(Identifier="0c167f76-7e78-316a-0219-841ff09a7a11")
public static String es_PE_FIELD_CashJournal_DocumentStatus_Name="Estado del Documento";

@XendraTrl(Identifier="0c167f76-7e78-316a-0219-841ff09a7a11")
public static String es_PE_FIELD_CashJournal_DocumentStatus_Description="El estado actual del documento";

@XendraTrl(Identifier="0c167f76-7e78-316a-0219-841ff09a7a11")
public static String es_PE_FIELD_CashJournal_DocumentStatus_Help="El estado del documento indica el estado del documento en este momento. Si usted quiere cambiar el estado de Documento; use el campo acción de documento";

@XendraField(AD_Column_ID="DocStatus",IsCentrallyMaintained=true,
AD_Tab_ID="e68dd387-5f14-b188-36a8-b7bbb83b7316",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=200,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0c167f76-7e78-316a-0219-841ff09a7a11")
public static final String FIELDNAME_CashJournal_DocumentStatus="0c167f76-7e78-316a-0219-841ff09a7a11";

@XendraTrl(Identifier="c9fdfd3e-52e2-df43-180b-900a12731b81")
public static String es_PE_COLUMN_DocStatus_Name="Estado del Documento";

@XendraColumn(AD_Element_ID="e73fa537-3438-bd01-dfd4-f0f080a28c55",ColumnName="DocStatus",
AD_Reference_ID=17,AD_Reference_Value_ID="7627125d-fefe-e6bc-bb7d-4a6c772172dc",AD_Val_Rule_ID="",
FieldLength=2,DefaultValue="DR",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=true,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="c9fdfd3e-52e2-df43-180b-900a12731b81",Synchronized="2020-03-13 21:02:17.0")
/** Column name DocStatus */
public static final String COLUMNNAME_DocStatus = "DocStatus";
/** Set Ending balance.
@param EndingBalance Ending  or closing balance */
public void setEndingBalance (BigDecimal EndingBalance)
{
if (EndingBalance == null) throw new IllegalArgumentException ("EndingBalance is mandatory.");
set_Value (COLUMNNAME_EndingBalance, EndingBalance);
}
/** Get Ending balance.
@return Ending  or closing balance */
public BigDecimal getEndingBalance() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_EndingBalance);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="4bd13199-bbcf-1c9b-61bf-7fcd374d5736")
public static String es_PE_FIELD_CashJournal_EndingBalance_Name="Saldo Final";

@XendraTrl(Identifier="4bd13199-bbcf-1c9b-61bf-7fcd374d5736")
public static String es_PE_FIELD_CashJournal_EndingBalance_Description="Saldo final ó al cierre";

@XendraTrl(Identifier="4bd13199-bbcf-1c9b-61bf-7fcd374d5736")
public static String es_PE_FIELD_CashJournal_EndingBalance_Help="El saldo final es el resultado de ajustar el saldo Inicial por cualquier pago ó desembolso.";

@XendraField(AD_Column_ID="EndingBalance",IsCentrallyMaintained=true,
AD_Tab_ID="e68dd387-5f14-b188-36a8-b7bbb83b7316",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=190,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="4bd13199-bbcf-1c9b-61bf-7fcd374d5736")
public static final String FIELDNAME_CashJournal_EndingBalance="4bd13199-bbcf-1c9b-61bf-7fcd374d5736";

@XendraTrl(Identifier="2a853272-6f20-8de4-1117-5622438aea7f")
public static String es_PE_COLUMN_EndingBalance_Name="Saldo Final";

@XendraColumn(AD_Element_ID="43c64e50-5b53-2d2d-5fb4-7b5d31e3c043",ColumnName="EndingBalance",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2a853272-6f20-8de4-1117-5622438aea7f",
Synchronized="2020-03-13 21:02:17.0")
/** Column name EndingBalance */
public static final String COLUMNNAME_EndingBalance = "EndingBalance";
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
@XendraTrl(Identifier="c609e90c-a435-27c7-6bb2-5cab739e7415")
public static String es_PE_FIELD_CashJournal_AccountingFactIDPerDocument_Name="ID Asiento Contable";

@XendraTrl(Identifier="c609e90c-a435-27c7-6bb2-5cab739e7415")
public static String es_PE_FIELD_CashJournal_AccountingFactIDPerDocument_Description="Se garantiza que este ID sea unico por cada cliente/ano/documento (en la tabla de asientos).";

@XendraField(AD_Column_ID="Fact_ID",IsCentrallyMaintained=true,
AD_Tab_ID="e68dd387-5f14-b188-36a8-b7bbb83b7316",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=230,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c609e90c-a435-27c7-6bb2-5cab739e7415")
public static final String FIELDNAME_CashJournal_AccountingFactIDPerDocument="c609e90c-a435-27c7-6bb2-5cab739e7415";

@XendraTrl(Identifier="4b715c8a-615c-8b02-0811-27487d74ef60")
public static String es_PE_COLUMN_Fact_ID_Name="ID Asiento Contable";

@XendraColumn(AD_Element_ID="20f6c8ee-0151-735b-7a03-2006e09d8eb0",ColumnName="Fact_ID",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=20,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="4b715c8a-615c-8b02-0811-27487d74ef60",
Synchronized="2020-03-13 21:02:17.0")
/** Column name Fact_ID */
public static final String COLUMNNAME_Fact_ID = "Fact_ID";
/** Set HR_WorkShift_ID.
@param HR_WorkShift_ID HR_WorkShift_ID */
public void setHR_WorkShift_ID (int HR_WorkShift_ID)
{
if (HR_WorkShift_ID <= 0) set_Value (COLUMNNAME_HR_WorkShift_ID, null);
 else 
set_Value (COLUMNNAME_HR_WorkShift_ID, Integer.valueOf(HR_WorkShift_ID));
}
/** Get HR_WorkShift_ID.
@return HR_WorkShift_ID */
public int getHR_WorkShift_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_HR_WorkShift_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="2a4e0f39-8a8f-4131-a242-5d4b333c4203")
public static String es_PE_FIELD_CashJournal_HR_WorkShift_ID_Name="HR_WorkShift";

@XendraField(AD_Column_ID="HR_WorkShift_ID",IsCentrallyMaintained=true,
AD_Tab_ID="e68dd387-5f14-b188-36a8-b7bbb83b7316",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2020-03-13 21:02:17.0",
Identifier="2a4e0f39-8a8f-4131-a242-5d4b333c4203")
public static final String FIELDNAME_CashJournal_HR_WorkShift_ID="2a4e0f39-8a8f-4131-a242-5d4b333c4203";

@XendraTrl(Identifier="5bc3f6ee-688c-4590-8ac3-5a1d9089c58e")
public static String es_PE_COLUMN_HR_WorkShift_ID_Name="Turno";

@XendraColumn(AD_Element_ID="742243ba-9ede-4990-8e52-6da7e53a866b",ColumnName="HR_WorkShift_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5bc3f6ee-688c-4590-8ac3-5a1d9089c58e",
Synchronized="2020-03-13 21:02:17.0")
/** Column name HR_WorkShift_ID */
public static final String COLUMNNAME_HR_WorkShift_ID = "HR_WorkShift_ID";
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
@XendraTrl(Identifier="dfd81b44-19ee-4a83-aca6-c6e6a8fc00e4")
public static String es_PE_FIELD_CashJournal_Identifier_Name="Identifier";

@XendraField(AD_Column_ID="Identifier",IsCentrallyMaintained=true,
AD_Tab_ID="e68dd387-5f14-b188-36a8-b7bbb83b7316",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=36,IsReadOnly=false,SeqNo=240,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2018-08-19 00:57:13.0",
Identifier="dfd81b44-19ee-4a83-aca6-c6e6a8fc00e4")
public static final String FIELDNAME_CashJournal_Identifier="dfd81b44-19ee-4a83-aca6-c6e6a8fc00e4";

@XendraTrl(Identifier="73e986c2-f236-4c2d-902f-6f3b0da6ade2")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="73e986c2-f236-4c2d-902f-6f3b0da6ade2",
Synchronized="2020-03-13 21:02:17.0")
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

@XendraTrl(Identifier="80564c64-ed19-b539-aebd-ea34ed98125b")
public static String es_PE_FIELD_CashJournal_Approved_Name="Aprobación";

@XendraTrl(Identifier="80564c64-ed19-b539-aebd-ea34ed98125b")
public static String es_PE_FIELD_CashJournal_Approved_Description="Indica si este documento requiere aprobación";

@XendraTrl(Identifier="80564c64-ed19-b539-aebd-ea34ed98125b")
public static String es_PE_FIELD_CashJournal_Approved_Help="El Cuadro de Verificación  Aprobado indica si este documento requiere aprobación antes de que pueda ser procesado";

@XendraField(AD_Column_ID="IsApproved",IsCentrallyMaintained=true,
AD_Tab_ID="e68dd387-5f14-b188-36a8-b7bbb83b7316",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=true,SeqNo=170,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="80564c64-ed19-b539-aebd-ea34ed98125b")
public static final String FIELDNAME_CashJournal_Approved="80564c64-ed19-b539-aebd-ea34ed98125b";

@XendraTrl(Identifier="e45bf026-2b74-3a81-ae64-24d22366ded8")
public static String es_PE_COLUMN_IsApproved_Name="Aprobación";

@XendraColumn(AD_Element_ID="44388d99-07b7-b005-9e16-78884800beff",ColumnName="IsApproved",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e45bf026-2b74-3a81-ae64-24d22366ded8",
Synchronized="2020-03-28 17:23:12.0")
/** Column name IsApproved */
public static final String COLUMNNAME_IsApproved = "IsApproved";
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

@XendraTrl(Identifier="569aa1de-be28-4b7c-7d22-e5be9dac317c")
public static String es_PE_FIELD_CashJournal_Name_Name="Nombre";

@XendraTrl(Identifier="569aa1de-be28-4b7c-7d22-e5be9dac317c")
public static String es_PE_FIELD_CashJournal_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="569aa1de-be28-4b7c-7d22-e5be9dac317c")
public static String es_PE_FIELD_CashJournal_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraField(AD_Column_ID="Name",IsCentrallyMaintained=true,
AD_Tab_ID="e68dd387-5f14-b188-36a8-b7bbb83b7316",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=50,SortNo=-1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="569aa1de-be28-4b7c-7d22-e5be9dac317c")
public static final String FIELDNAME_CashJournal_Name="569aa1de-be28-4b7c-7d22-e5be9dac317c";

@XendraTrl(Identifier="72decd6f-918e-5e14-ec05-6c05e88e0bd3")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,
DefaultValue="@#Date@",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=true,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="72decd6f-918e-5e14-ec05-6c05e88e0bd3",Synchronized="2020-03-13 21:02:17.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
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

@XendraTrl(Identifier="d7553511-c709-e765-bfcf-2e56527cda05")
public static String es_PE_FIELD_CashJournal_Posted_Name="Fijada";

@XendraTrl(Identifier="d7553511-c709-e765-bfcf-2e56527cda05")
public static String es_PE_FIELD_CashJournal_Posted_Description="Las transacciones de contabilidad general han sido procesadas.";

@XendraTrl(Identifier="d7553511-c709-e765-bfcf-2e56527cda05")
public static String es_PE_FIELD_CashJournal_Posted_Help="El campo fijado indica el estado de la generación de las Líneas contables a la contabilidad general.";

@XendraField(AD_Column_ID="Posted",IsCentrallyMaintained=true,
AD_Tab_ID="e68dd387-5f14-b188-36a8-b7bbb83b7316",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@Processed@=Y & @#ShowAcct@=Y",DisplayLength=23,IsReadOnly=false,SeqNo=220,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="d7553511-c709-e765-bfcf-2e56527cda05")
public static final String FIELDNAME_CashJournal_Posted="d7553511-c709-e765-bfcf-2e56527cda05";

@XendraTrl(Identifier="9e723ba2-b4d3-3674-c65b-d3b93892d750")
public static String es_PE_COLUMN_Posted_Name="Fijada";

@XendraColumn(AD_Element_ID="5eb52ebc-6992-12f5-b85a-e0a136df259b",ColumnName="Posted",
AD_Reference_ID=28,AD_Reference_Value_ID="d2b659dd-6c8c-baf3-fc71-0ee997273154",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="N",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="9e723ba2-b4d3-3674-c65b-d3b93892d750",Synchronized="2020-03-28 17:23:04.0")
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

@XendraTrl(Identifier="a6e87969-3850-c24a-3546-8f61fde99cac")
public static String es_PE_FIELD_CashJournal_Processed_Name="Procesado";

@XendraTrl(Identifier="a6e87969-3850-c24a-3546-8f61fde99cac")
public static String es_PE_FIELD_CashJournal_Processed_Description="El documento ha sido procesado";

@XendraTrl(Identifier="a6e87969-3850-c24a-3546-8f61fde99cac")
public static String es_PE_FIELD_CashJournal_Processed_Help="El cuadro de verificación procesada indica que un documento ha sido procesado";

@XendraField(AD_Column_ID="Processed",IsCentrallyMaintained=true,
AD_Tab_ID="e68dd387-5f14-b188-36a8-b7bbb83b7316",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a6e87969-3850-c24a-3546-8f61fde99cac")
public static final String FIELDNAME_CashJournal_Processed="a6e87969-3850-c24a-3546-8f61fde99cac";

@XendraTrl(Identifier="959b4a32-710c-9d3c-a3eb-39acfb7014ce")
public static String es_PE_COLUMN_Processed_Name="Procesado";

@XendraColumn(AD_Element_ID="3f7035d2-fa5e-7416-fc0c-e49e43f9e083",ColumnName="Processed",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="959b4a32-710c-9d3c-a3eb-39acfb7014ce",
Synchronized="2020-03-13 21:02:17.0")
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

@XendraTrl(Identifier="c328b96c-c305-3786-6e0c-8add0b33d588")
public static String es_PE_FIELD_CashJournal_ProcessNow_Name="Procesar Ahora";

@XendraField(AD_Column_ID="Processing",IsCentrallyMaintained=true,
AD_Tab_ID="e68dd387-5f14-b188-36a8-b7bbb83b7316",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c328b96c-c305-3786-6e0c-8add0b33d588")
public static final String FIELDNAME_CashJournal_ProcessNow="c328b96c-c305-3786-6e0c-8add0b33d588";

@XendraTrl(Identifier="bd0b5ef1-084c-ed15-9a1f-d20374b77b8b")
public static String es_PE_COLUMN_Processing_Name="Procesar Ahora";

@XendraColumn(AD_Element_ID="f2096404-1a98-35ec-09ea-273b3e19b7de",ColumnName="Processing",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="bd0b5ef1-084c-ed15-9a1f-d20374b77b8b",
Synchronized="2020-03-13 21:02:17.0")
/** Column name Processing */
public static final String COLUMNNAME_Processing = "Processing";
/** Set Statement date.
@param StatementDate Date of the statement */
public void setStatementDate (Timestamp StatementDate)
{
if (StatementDate == null) throw new IllegalArgumentException ("StatementDate is mandatory.");
set_Value (COLUMNNAME_StatementDate, StatementDate);
}
/** Get Statement date.
@return Date of the statement */
public Timestamp getStatementDate() 
{
return (Timestamp)get_Value(COLUMNNAME_StatementDate);
}

@XendraTrl(Identifier="7727e7b2-8572-5aae-8dcc-9fd67f424032")
public static String es_PE_FIELD_CashJournal_StatementDate_Name="Fecha de Diario Efectivo";

@XendraTrl(Identifier="7727e7b2-8572-5aae-8dcc-9fd67f424032")
public static String es_PE_FIELD_CashJournal_StatementDate_Description="Fecha de proceso de un estado de cuentas";

@XendraTrl(Identifier="7727e7b2-8572-5aae-8dcc-9fd67f424032")
public static String es_PE_FIELD_CashJournal_StatementDate_Help="El campo fecha del estado de cuenta define la fecha del estado de cuenta que está siendo procesado.";

@XendraField(AD_Column_ID="StatementDate",IsCentrallyMaintained=true,
AD_Tab_ID="e68dd387-5f14-b188-36a8-b7bbb83b7316",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7727e7b2-8572-5aae-8dcc-9fd67f424032")
public static final String FIELDNAME_CashJournal_StatementDate="7727e7b2-8572-5aae-8dcc-9fd67f424032";

@XendraTrl(Identifier="6cae1531-787d-34d6-b436-322849aa67f7")
public static String es_PE_COLUMN_StatementDate_Name="Fecha de Estado de Cuenta";

@XendraColumn(AD_Element_ID="99499740-aa9e-199a-8ae3-28cd928e33d1",ColumnName="StatementDate",
AD_Reference_ID=15,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="@#Date@",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=2,IsTranslated=false,Callout="org.compiere.model.CalloutEngine.dateAcct",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=true,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="6cae1531-787d-34d6-b436-322849aa67f7",Synchronized="2020-03-28 17:23:03.0")
/** Column name StatementDate */
public static final String COLUMNNAME_StatementDate = "StatementDate";
/** Set Statement difference.
@param StatementDifference Difference between statement ending balance and actual ending balance */
public void setStatementDifference (BigDecimal StatementDifference)
{
set_Value (COLUMNNAME_StatementDifference, StatementDifference);
}
/** Get Statement difference.
@return Difference between statement ending balance and actual ending balance */
public BigDecimal getStatementDifference() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_StatementDifference);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="0322f83d-95f4-feef-f3d6-3d29b27cf26d")
public static String es_PE_FIELD_CashJournal_StatementDifference_Name="Diferencia  Edo. De Cuenta";

@XendraTrl(Identifier="0322f83d-95f4-feef-f3d6-3d29b27cf26d")
public static String es_PE_FIELD_CashJournal_StatementDifference_Description="Diferencia entre el saldo final del estado de cuentas y el saldo final actual";

@XendraTrl(Identifier="0322f83d-95f4-feef-f3d6-3d29b27cf26d")
public static String es_PE_FIELD_CashJournal_StatementDifference_Help="La diferencia del estado de cuenta refleja la diferencia entre el saldo final del estado de cuenta y el saldo final actual";

@XendraField(AD_Column_ID="StatementDifference",IsCentrallyMaintained=true,
AD_Tab_ID="e68dd387-5f14-b188-36a8-b7bbb83b7316",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=180,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0322f83d-95f4-feef-f3d6-3d29b27cf26d")
public static final String FIELDNAME_CashJournal_StatementDifference="0322f83d-95f4-feef-f3d6-3d29b27cf26d";

@XendraTrl(Identifier="9b57e280-2787-8833-7744-26416a657717")
public static String es_PE_COLUMN_StatementDifference_Name="Diferencia  Edo. De Cuenta";

@XendraColumn(AD_Element_ID="8eeef4fb-9625-ed88-3bdd-02e23c8e42a2",
ColumnName="StatementDifference",AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="9b57e280-2787-8833-7744-26416a657717",Synchronized="2020-03-13 21:02:17.0")
/** Column name StatementDifference */
public static final String COLUMNNAME_StatementDifference = "StatementDifference";
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

@XendraTrl(Identifier="9b14000d-a35c-de00-0ca2-17e65aafe746")
public static String es_PE_FIELD_CashJournal_UserList_Name="Usuario 1";

@XendraTrl(Identifier="9b14000d-a35c-de00-0ca2-17e65aafe746")
public static String es_PE_FIELD_CashJournal_UserList_Description="El usuario definió el elemento # 1";

@XendraTrl(Identifier="9b14000d-a35c-de00-0ca2-17e65aafe746")
public static String es_PE_FIELD_CashJournal_UserList_Help="El elemento definido por el usuario despliega los elementos opcionales que han sido definidos para esta combinación de cuentas";

@XendraField(AD_Column_ID="User1_ID",IsCentrallyMaintained=true,
AD_Tab_ID="e68dd387-5f14-b188-36a8-b7bbb83b7316",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@$Element_U1@=Y",DisplayLength=14,IsReadOnly=false,SeqNo=120,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="9b14000d-a35c-de00-0ca2-17e65aafe746")
public static final String FIELDNAME_CashJournal_UserList="9b14000d-a35c-de00-0ca2-17e65aafe746";

@XendraTrl(Identifier="f0dd214a-36df-54cb-aaca-1d43152ddb7a")
public static String es_PE_COLUMN_User1_ID_Name="Usuario 1";

@XendraColumn(AD_Element_ID="07453e74-aadd-d9c9-e543-837a6fdb3094",ColumnName="User1_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="5a2fe161-044f-67cb-3791-6d615980cabb",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="f0dd214a-36df-54cb-aaca-1d43152ddb7a",Synchronized="2020-03-13 21:02:17.0")
/** Column name User1_ID */
public static final String COLUMNNAME_User1_ID = "User1_ID";
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

@XendraTrl(Identifier="13799120-1a76-7a57-23b7-04411cc40013")
public static String es_PE_FIELD_CashJournal_UserList22_Name="Usuario 2";

@XendraTrl(Identifier="13799120-1a76-7a57-23b7-04411cc40013")
public static String es_PE_FIELD_CashJournal_UserList22_Description="El usuario definió el elemento # 2";

@XendraTrl(Identifier="13799120-1a76-7a57-23b7-04411cc40013")
public static String es_PE_FIELD_CashJournal_UserList22_Help="El elemento definido por el usuario despliega los elementos opcionales que han sido definidos para esta combinación de cuentas";

@XendraField(AD_Column_ID="User2_ID",IsCentrallyMaintained=true,
AD_Tab_ID="e68dd387-5f14-b188-36a8-b7bbb83b7316",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@$Element_U2@=Y",DisplayLength=14,IsReadOnly=false,SeqNo=130,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="13799120-1a76-7a57-23b7-04411cc40013")
public static final String FIELDNAME_CashJournal_UserList22="13799120-1a76-7a57-23b7-04411cc40013";

@XendraTrl(Identifier="493f89cb-7034-f421-4021-546c3c24283c")
public static String es_PE_COLUMN_User2_ID_Name="Usuario 2";

@XendraColumn(AD_Element_ID="1b668c90-6743-20a2-df62-576857d72c06",ColumnName="User2_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="6a357ab2-7bb6-fce4-ffee-8bdd855a77fc",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="493f89cb-7034-f421-4021-546c3c24283c",Synchronized="2020-03-13 21:02:17.0")
/** Column name User2_ID */
public static final String COLUMNNAME_User2_ID = "User2_ID";
}
