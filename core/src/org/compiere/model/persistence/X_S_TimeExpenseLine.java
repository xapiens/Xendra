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
/** Generated Model for S_TimeExpenseLine
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_S_TimeExpenseLine extends PO
{
/** Standard Constructor
@param ctx context
@param S_TimeExpenseLine_ID id
@param trxName transaction
*/
public X_S_TimeExpenseLine (Properties ctx, int S_TimeExpenseLine_ID, String trxName)
{
super (ctx, S_TimeExpenseLine_ID, trxName);
/** if (S_TimeExpenseLine_ID == 0)
{
setDateExpense (new Timestamp(System.currentTimeMillis()));	
// @DateExpense@;
@DateReport@
setIsInvoiced (false);	
// N
setIsTimeReport (false);	
// N
setLine (0);	
// @SQL=SELECT COALESCE(MAX(Line),0)+10 AS DefaultValue FROM S_TimeExpenseLine WHERE S_TimeExpense_ID=@S_TimeExpense_ID@
setProcessed (false);	
// N
setS_TimeExpense_ID (0);
setS_TimeExpenseLine_ID (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_S_TimeExpenseLine (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=488 */
public static int Table_ID=MTable.getTable_ID("S_TimeExpenseLine");

@XendraTrl(Identifier="a445d1e6-d00f-41d7-db6d-29d792ace001")
public static String es_PE_TAB_ReportLine_Description="Ìtem del Informe de tiempo y gasto (no facturado)";

@XendraTrl(Identifier="a445d1e6-d00f-41d7-db6d-29d792ace001")
public static String es_PE_TAB_ReportLine_Help="Ver y modificar Ìtems del Informe de tiempo y gastos.";

@XendraTrl(Identifier="a445d1e6-d00f-41d7-db6d-29d792ace001")
public static String es_PE_TAB_ReportLine_Name="Ìtem del Informe";
@XendraTab(Name="Report Line",
Description="Time and Expense Report Line (not invoiced)",
Help="View and modify Time and Expense Report Lines.  It lists expense items for the business partner on the expense line where the expense lines have no orders yet. (Sales Orders are created).",
AD_Window_ID="f00f61c4-b5c1-2481-0eb4-be8a127d0d12",SeqNo=20,TabLevel=1,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,
AD_Column_ID="7202eaac-44b3-be18-ca52-d924f641a7c4",HasTree=false,
WhereClause="S_TimeExpenseLine.IsInvoiced='Y' AND S_TimeExpenseLine.C_OrderLine_ID IS NULL AND EXISTS (SELECT * FROM S_TimeExpense t WHERE t.S_TimeExpense_ID=S_TimeExpenseLine.S_TimeExpense_ID AND t.Processed='Y')",
OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="a445d1e6-d00f-41d7-db6d-29d792ace001",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_ReportLine="a445d1e6-d00f-41d7-db6d-29d792ace001";

@XendraTrl(Identifier="a55b6ca2-12a4-8350-eda7-21fedb393102")
public static String es_PE_TAB_ReportLine2_Description="Ìtem de Informe de tiempo y gasto";

@XendraTrl(Identifier="a55b6ca2-12a4-8350-eda7-21fedb393102")
public static String es_PE_TAB_ReportLine2_Name="Ìtem del Informe";
@XendraTab(Name="Report Line",
Description="Time and Expense Report Line",
Help="Enter the expense items and billable or non-billable hours. If you enter a non-zero amount in Invoiced Amount, that amount will be used for billing the customer - otherwise the price on the current sales price list of the customer.",
AD_Window_ID="34a30f99-cf17-9a6b-fa47-63536a0d865c",SeqNo=20,TabLevel=1,IsSingleRow=true,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="@Processed@=Y",
DisplayLogic="",IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="a55b6ca2-12a4-8350-eda7-21fedb393102",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_ReportLine2="a55b6ca2-12a4-8350-eda7-21fedb393102";

@XendraTrl(Identifier="6e8ab691-2e95-c842-15b3-8cc772502eda")
public static String es_PE_TAB_ReportLine3_Description="Ìtem del tiempo y del informe de costo (no reembolsada)";

@XendraTrl(Identifier="6e8ab691-2e95-c842-15b3-8cc772502eda")
public static String es_PE_TAB_ReportLine3_Help="Opinión y modificación de los Ìtems de tiempo y de informe del costo.";

@XendraTrl(Identifier="6e8ab691-2e95-c842-15b3-8cc772502eda")
public static String es_PE_TAB_ReportLine3_Name="Ìtem de Informe";
@XendraTab(Name="Report Line",
Description="Time and Expense Report Line (not reimbursed)",
Help="View and modify Time and Expense Report Lines. It lists expense items for the business partner on the expense header where the expense lines were not invoiced yet.",
AD_Window_ID="ff165b6f-c3df-d9a1-01a0-146b19160d8f",SeqNo=20,TabLevel=1,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,
AD_Column_ID="8ca28818-3ad2-2f6f-5a69-2a652c9cdda7",HasTree=false,
WhereClause="S_TimeExpenseLine.ConvertedAmt <> 0 AND S_TimeExpenseLine.C_InvoiceLine_ID IS NULL  AND EXISTS (SELECT * FROM S_TimeExpense t   WHERE t.S_TimeExpense_ID=S_TimeExpenseLine.S_TimeExpense_ID  AND t.C_BPartner_ID=@C_BPartner_ID@ AND t.Processed='Y') ",
OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="6e8ab691-2e95-c842-15b3-8cc772502eda",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_ReportLine3="6e8ab691-2e95-c842-15b3-8cc772502eda";

@XendraTrl(Identifier="d50a23fb-d52d-be76-e357-d8583666dc2f")
public static String es_PE_TABLE_S_TimeExpenseLine_Name="Línea de Gasto";

@XendraTable(Name="Expense Line",AD_Package_ID="4bb6f0e4-f72d-dcbb-9183-88af0357143f",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="Time and Expense Report Line",
Help="",TableName="S_TimeExpenseLine",AccessLevel="1",
AD_Window_ID="34a30f99-cf17-9a6b-fa47-63536a0d865c",AD_Val_Rule_ID="",IsKey=1,LoadSeq=130,
IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,IsView=false,
PO_Window_ID="",ID="org.xendra.services",Identifier="d50a23fb-d52d-be76-e357-d8583666dc2f",
Synchronized="2020-03-03 21:40:13.0")
/** TableName=S_TimeExpenseLine */
public static final String Table_Name="S_TimeExpenseLine";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"S_TimeExpenseLine");

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
    Table_ID = MTable.getTable_ID("S_TimeExpenseLine");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_S_TimeExpenseLine[").append(get_ID()).append("]");
return sb.toString();
}
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

@XendraTrl(Identifier="9539e214-a572-75c9-3dd9-814a14eb7b69")
public static String es_PE_FIELD_ReportLine_Activity_Name="Tipo de Gasto";

@XendraTrl(Identifier="9539e214-a572-75c9-3dd9-814a14eb7b69")
public static String es_PE_FIELD_ReportLine_Activity_Description="Actividad de Negocio";

@XendraTrl(Identifier="9539e214-a572-75c9-3dd9-814a14eb7b69")
public static String es_PE_FIELD_ReportLine_Activity_Help="Las actividades indican tareas que son ejecutadas en el curso de un negocio; las actividades son usadas para el costeo por actividad (ABC)";

@XendraField(AD_Column_ID="C_Activity_ID",IsCentrallyMaintained=true,
AD_Tab_ID="a55b6ca2-12a4-8350-eda7-21fedb393102",AD_FieldGroup_ID="Reference",IsDisplayed=true,
DisplayLogic="@$Element_AY@=Y",DisplayLength=14,IsReadOnly=false,SeqNo=230,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="9539e214-a572-75c9-3dd9-814a14eb7b69")
public static final String FIELDNAME_ReportLine_Activity="9539e214-a572-75c9-3dd9-814a14eb7b69";

@XendraTrl(Identifier="00c3527e-f466-30c7-3ef1-573711dff594")
public static String es_PE_FIELD_ReportLine_Activity2_Name="Tipo de Gasto";

@XendraTrl(Identifier="00c3527e-f466-30c7-3ef1-573711dff594")
public static String es_PE_FIELD_ReportLine_Activity2_Description="Actividad de Negocio";

@XendraTrl(Identifier="00c3527e-f466-30c7-3ef1-573711dff594")
public static String es_PE_FIELD_ReportLine_Activity2_Help="Las actividades indican tareas que son ejecutadas en el curso de un negocio; las actividades son usadas para el costeo por actividad (ABC)";

@XendraField(AD_Column_ID="C_Activity_ID",IsCentrallyMaintained=true,
AD_Tab_ID="a445d1e6-d00f-41d7-db6d-29d792ace001",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@$Element_AY@=Y",DisplayLength=14,IsReadOnly=false,SeqNo=260,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="00c3527e-f466-30c7-3ef1-573711dff594")
public static final String FIELDNAME_ReportLine_Activity2="00c3527e-f466-30c7-3ef1-573711dff594";

@XendraTrl(Identifier="c9ec233f-374d-4cb5-6e25-66cefbb1f570")
public static String es_PE_FIELD_ReportLine_Activity3_Name="Tipo de Gasto";

@XendraTrl(Identifier="c9ec233f-374d-4cb5-6e25-66cefbb1f570")
public static String es_PE_FIELD_ReportLine_Activity3_Description="Actividad de Negocio";

@XendraTrl(Identifier="c9ec233f-374d-4cb5-6e25-66cefbb1f570")
public static String es_PE_FIELD_ReportLine_Activity3_Help="Las actividades indican tareas que son ejecutadas en el curso de un negocio; las actividades son usadas para el costeo por actividad (ABC)";

@XendraField(AD_Column_ID="C_Activity_ID",IsCentrallyMaintained=true,
AD_Tab_ID="6e8ab691-2e95-c842-15b3-8cc772502eda",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@$Element_AY@=Y",DisplayLength=14,IsReadOnly=false,SeqNo=250,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="c9ec233f-374d-4cb5-6e25-66cefbb1f570")
public static final String FIELDNAME_ReportLine_Activity3="c9ec233f-374d-4cb5-6e25-66cefbb1f570";

@XendraTrl(Identifier="2730a1ef-5bef-cb9e-6fec-2e1cb95418f8")
public static String es_PE_COLUMN_C_Activity_ID_Name="Tipo de Gasto";

@XendraColumn(AD_Element_ID="bfeadbb3-d866-26e3-8eee-3e2fdf0ff753",ColumnName="C_Activity_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="079b2687-77a7-3004-9b77-18ca68ffe4fc",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="2730a1ef-5bef-cb9e-6fec-2e1cb95418f8",Synchronized="2019-08-30 22:24:17.0")
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

@XendraTrl(Identifier="fd6fe777-a161-53c0-0f27-391e4caf5ee8")
public static String es_PE_FIELD_ReportLine_BusinessPartner_Name="Socio de Negocio";

@XendraTrl(Identifier="fd6fe777-a161-53c0-0f27-391e4caf5ee8")
public static String es_PE_FIELD_ReportLine_BusinessPartner_Description="Identifica un Socio de Negocio";

@XendraTrl(Identifier="fd6fe777-a161-53c0-0f27-391e4caf5ee8")
public static String es_PE_FIELD_ReportLine_BusinessPartner_Help="Un socio de negocio es cualquiera con quien usted realiza transacciones. Este puede incluir Proveedores; Clientes; Empleados ó Vendedores.";

@XendraField(AD_Column_ID="C_BPartner_ID",IsCentrallyMaintained=true,
AD_Tab_ID="a55b6ca2-12a4-8350-eda7-21fedb393102",AD_FieldGroup_ID="Reference",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=180,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="fd6fe777-a161-53c0-0f27-391e4caf5ee8")
public static final String FIELDNAME_ReportLine_BusinessPartner="fd6fe777-a161-53c0-0f27-391e4caf5ee8";

@XendraTrl(Identifier="b1fbc25b-a828-2eeb-af87-76da3a9aed5c")
public static String es_PE_FIELD_ReportLine_BusinessPartner2_Name="Socio de Negocio";

@XendraTrl(Identifier="b1fbc25b-a828-2eeb-af87-76da3a9aed5c")
public static String es_PE_FIELD_ReportLine_BusinessPartner2_Description="Identifica un Socio de Negocio";

@XendraTrl(Identifier="b1fbc25b-a828-2eeb-af87-76da3a9aed5c")
public static String es_PE_FIELD_ReportLine_BusinessPartner2_Help="Un socio de negocio es cualquiera con quien usted realiza transacciones. Este puede incluir Proveedores; Clientes; Empleados ó Vendedores.";

@XendraField(AD_Column_ID="C_BPartner_ID",IsCentrallyMaintained=true,
AD_Tab_ID="a445d1e6-d00f-41d7-db6d-29d792ace001",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=30,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b1fbc25b-a828-2eeb-af87-76da3a9aed5c")
public static final String FIELDNAME_ReportLine_BusinessPartner2="b1fbc25b-a828-2eeb-af87-76da3a9aed5c";

@XendraTrl(Identifier="383e23e4-806d-128d-9b44-c83b0c738203")
public static String es_PE_FIELD_ReportLine_BusinessPartner3_Name="Business Partner ";

@XendraTrl(Identifier="383e23e4-806d-128d-9b44-c83b0c738203")
public static String es_PE_FIELD_ReportLine_BusinessPartner3_Description="Identifies a Business Partner";

@XendraTrl(Identifier="383e23e4-806d-128d-9b44-c83b0c738203")
public static String es_PE_FIELD_ReportLine_BusinessPartner3_Help="A Business Partner is anyone with whom you transact.  This can include Vendor, Customer, Employee or Salesperson";

@XendraField(AD_Column_ID="C_BPartner_ID",IsCentrallyMaintained=true,
AD_Tab_ID="6e8ab691-2e95-c842-15b3-8cc772502eda",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=30,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="383e23e4-806d-128d-9b44-c83b0c738203")
public static final String FIELDNAME_ReportLine_BusinessPartner3="383e23e4-806d-128d-9b44-c83b0c738203";

@XendraTrl(Identifier="7202eaac-44b3-be18-ca52-d924f641a7c4")
public static String es_PE_COLUMN_C_BPartner_ID_Name="Socio de Negocio";

@XendraColumn(AD_Element_ID="fe333dc3-4f40-1276-5f6a-d09bb66dc423",ColumnName="C_BPartner_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="06fdbbe9-e1c4-3ee4-4a9d-73d1a990cc42",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="7202eaac-44b3-be18-ca52-d924f641a7c4",Synchronized="2019-08-30 22:24:17.0")
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

@XendraTrl(Identifier="a0a50f26-e329-b9ea-75a6-1e1548a57a6b")
public static String es_PE_FIELD_ReportLine_Campaign_Name="Campaña";

@XendraTrl(Identifier="a0a50f26-e329-b9ea-75a6-1e1548a57a6b")
public static String es_PE_FIELD_ReportLine_Campaign_Description="Campaña de Mercadeo";

@XendraTrl(Identifier="a0a50f26-e329-b9ea-75a6-1e1548a57a6b")
public static String es_PE_FIELD_ReportLine_Campaign_Help="La Campaña define un programa de mercadotecnia único. Los proyectos pueden estar asociados con una campaña de mercadotecnia única. Usted puede entonces reportar basado en una campaña específica";

@XendraField(AD_Column_ID="C_Campaign_ID",IsCentrallyMaintained=true,
AD_Tab_ID="a55b6ca2-12a4-8350-eda7-21fedb393102",AD_FieldGroup_ID="Reference",IsDisplayed=true,
DisplayLogic="@$Element_MC@=Y",DisplayLength=14,IsReadOnly=false,SeqNo=190,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="a0a50f26-e329-b9ea-75a6-1e1548a57a6b")
public static final String FIELDNAME_ReportLine_Campaign="a0a50f26-e329-b9ea-75a6-1e1548a57a6b";

@XendraTrl(Identifier="9a3a6bf7-5ac5-6660-e11b-4c93481df26e")
public static String es_PE_FIELD_ReportLine_Campaign2_Name="Campaña";

@XendraTrl(Identifier="9a3a6bf7-5ac5-6660-e11b-4c93481df26e")
public static String es_PE_FIELD_ReportLine_Campaign2_Description="Campaña de Mercadeo";

@XendraTrl(Identifier="9a3a6bf7-5ac5-6660-e11b-4c93481df26e")
public static String es_PE_FIELD_ReportLine_Campaign2_Help="La Campaña define un programa de mercadotecnia único. Los proyectos pueden estar asociados con una campaña de mercadotecnia única. Usted puede entonces reportar basado en una campaña específica";

@XendraField(AD_Column_ID="C_Campaign_ID",IsCentrallyMaintained=true,
AD_Tab_ID="a445d1e6-d00f-41d7-db6d-29d792ace001",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@$Element_MC@=Y",DisplayLength=14,IsReadOnly=false,SeqNo=240,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="9a3a6bf7-5ac5-6660-e11b-4c93481df26e")
public static final String FIELDNAME_ReportLine_Campaign2="9a3a6bf7-5ac5-6660-e11b-4c93481df26e";

@XendraTrl(Identifier="1c963c01-66aa-f79a-28d1-f3deb051f385")
public static String es_PE_FIELD_ReportLine_Campaign3_Name="Campaña";

@XendraTrl(Identifier="1c963c01-66aa-f79a-28d1-f3deb051f385")
public static String es_PE_FIELD_ReportLine_Campaign3_Description="Campaña de Mercadeo";

@XendraTrl(Identifier="1c963c01-66aa-f79a-28d1-f3deb051f385")
public static String es_PE_FIELD_ReportLine_Campaign3_Help="La Campaña define un programa de mercadotecnia único. Los proyectos pueden estar asociados con una campaña de mercadotecnia única. Usted puede entonces reportar basado en una campaña específica";

@XendraField(AD_Column_ID="C_Campaign_ID",IsCentrallyMaintained=true,
AD_Tab_ID="6e8ab691-2e95-c842-15b3-8cc772502eda",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@$Element_MC@=Y",DisplayLength=14,IsReadOnly=false,SeqNo=230,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="1c963c01-66aa-f79a-28d1-f3deb051f385")
public static final String FIELDNAME_ReportLine_Campaign3="1c963c01-66aa-f79a-28d1-f3deb051f385";

@XendraTrl(Identifier="bfbbeecc-e20f-6f9b-499e-102aceea9c52")
public static String es_PE_COLUMN_C_Campaign_ID_Name="Campaña";

@XendraColumn(AD_Element_ID="6cf08e31-d355-ee38-9c0b-bee20b3ea5b6",ColumnName="C_Campaign_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="8e0d532d-2e55-9877-ef0b-a5950455e031",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="bfbbeecc-e20f-6f9b-499e-102aceea9c52",Synchronized="2019-08-30 22:24:17.0")
/** Column name C_Campaign_ID */
public static final String COLUMNNAME_C_Campaign_ID = "C_Campaign_ID";
/** Set Currency.
@param C_Currency_ID The Currency for this record */
public void setC_Currency_ID (int C_Currency_ID)
{
if (C_Currency_ID <= 0) set_Value (COLUMNNAME_C_Currency_ID, null);
 else 
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

@XendraTrl(Identifier="9d393d22-10da-2657-a730-ae6378568fbb")
public static String es_PE_FIELD_ReportLine_Currency_Name="Moneda";

@XendraTrl(Identifier="9d393d22-10da-2657-a730-ae6378568fbb")
public static String es_PE_FIELD_ReportLine_Currency_Description="Moneda para este registro";

@XendraTrl(Identifier="9d393d22-10da-2657-a730-ae6378568fbb")
public static String es_PE_FIELD_ReportLine_Currency_Help="Indica la moneda a ser usada cuando se procese ó Informe este registro";

@XendraField(AD_Column_ID="C_Currency_ID",IsCentrallyMaintained=true,
AD_Tab_ID="a55b6ca2-12a4-8350-eda7-21fedb393102",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsTimeReport@=N | @IsInvoiced@=Y",DisplayLength=14,IsReadOnly=false,SeqNo=130,
SortNo=0,IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="9d393d22-10da-2657-a730-ae6378568fbb")
public static final String FIELDNAME_ReportLine_Currency="9d393d22-10da-2657-a730-ae6378568fbb";

@XendraTrl(Identifier="28f39c4e-21d4-d2f9-4668-99cc1666379b")
public static String es_PE_FIELD_ReportLine_Currency2_Name="Moneda";

@XendraTrl(Identifier="28f39c4e-21d4-d2f9-4668-99cc1666379b")
public static String es_PE_FIELD_ReportLine_Currency2_Description="Moneda para este registro";

@XendraTrl(Identifier="28f39c4e-21d4-d2f9-4668-99cc1666379b")
public static String es_PE_FIELD_ReportLine_Currency2_Help="Indica la moneda a ser usada cuando se procese ó Informe este registro";

@XendraField(AD_Column_ID="C_Currency_ID",IsCentrallyMaintained=true,
AD_Tab_ID="a445d1e6-d00f-41d7-db6d-29d792ace001",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=170,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="28f39c4e-21d4-d2f9-4668-99cc1666379b")
public static final String FIELDNAME_ReportLine_Currency2="28f39c4e-21d4-d2f9-4668-99cc1666379b";

@XendraTrl(Identifier="18def4b0-5358-7ee5-b4fb-923aa0d2a1b8")
public static String es_PE_FIELD_ReportLine_Currency3_Name="Moneda";

@XendraTrl(Identifier="18def4b0-5358-7ee5-b4fb-923aa0d2a1b8")
public static String es_PE_FIELD_ReportLine_Currency3_Description="Moneda para este registro";

@XendraTrl(Identifier="18def4b0-5358-7ee5-b4fb-923aa0d2a1b8")
public static String es_PE_FIELD_ReportLine_Currency3_Help="Indica la moneda a ser usada cuando se procese ó Informe este registro";

@XendraField(AD_Column_ID="C_Currency_ID",IsCentrallyMaintained=true,
AD_Tab_ID="6e8ab691-2e95-c842-15b3-8cc772502eda",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=170,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="18def4b0-5358-7ee5-b4fb-923aa0d2a1b8")
public static final String FIELDNAME_ReportLine_Currency3="18def4b0-5358-7ee5-b4fb-923aa0d2a1b8";

@XendraTrl(Identifier="39620750-2ec1-943a-65b3-6543543140a8")
public static String es_PE_COLUMN_C_Currency_ID_Name="Moneda";

@XendraColumn(AD_Element_ID="8daec488-bca2-50fe-f9de-abf0cba2a34a",ColumnName="C_Currency_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,
DefaultValue="@$C_Currency_ID@",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="org.compiere.model.CalloutTimeExpense.amount",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="39620750-2ec1-943a-65b3-6543543140a8",
Synchronized="2019-08-30 22:24:17.0")
/** Column name C_Currency_ID */
public static final String COLUMNNAME_C_Currency_ID = "C_Currency_ID";
/** Set Invoice Line.
@param C_InvoiceLine_ID Invoice Detail Line */
public void setC_InvoiceLine_ID (int C_InvoiceLine_ID)
{
if (C_InvoiceLine_ID <= 0) set_ValueNoCheck (COLUMNNAME_C_InvoiceLine_ID, null);
 else 
set_ValueNoCheck (COLUMNNAME_C_InvoiceLine_ID, Integer.valueOf(C_InvoiceLine_ID));
}
/** Get Invoice Line.
@return Invoice Detail Line */
public int getC_InvoiceLine_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_InvoiceLine_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="25939d97-e7b5-3c06-9cbc-bbfcd43b200e")
public static String es_PE_FIELD_ReportLine_InvoiceLine_Name="Item de Factura";

@XendraTrl(Identifier="25939d97-e7b5-3c06-9cbc-bbfcd43b200e")
public static String es_PE_FIELD_ReportLine_InvoiceLine_Description="Item de detalle de factura";

@XendraTrl(Identifier="25939d97-e7b5-3c06-9cbc-bbfcd43b200e")
public static String es_PE_FIELD_ReportLine_InvoiceLine_Help="Identifica de manera única un Item de la factura";

@XendraField(AD_Column_ID="C_InvoiceLine_ID",IsCentrallyMaintained=true,
AD_Tab_ID="a55b6ca2-12a4-8350-eda7-21fedb393102",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="25939d97-e7b5-3c06-9cbc-bbfcd43b200e")
public static final String FIELDNAME_ReportLine_InvoiceLine="25939d97-e7b5-3c06-9cbc-bbfcd43b200e";

@XendraTrl(Identifier="ab8f1348-22e9-265f-cc51-f43bf1b5f286")
public static String es_PE_FIELD_ReportLine_InvoiceLine2_Name="Item de Factura";

@XendraTrl(Identifier="ab8f1348-22e9-265f-cc51-f43bf1b5f286")
public static String es_PE_FIELD_ReportLine_InvoiceLine2_Description="Item de detalle de factura";

@XendraTrl(Identifier="ab8f1348-22e9-265f-cc51-f43bf1b5f286")
public static String es_PE_FIELD_ReportLine_InvoiceLine2_Help="Identifica de manera única un Item de la factura";

@XendraField(AD_Column_ID="C_InvoiceLine_ID",IsCentrallyMaintained=true,
AD_Tab_ID="a445d1e6-d00f-41d7-db6d-29d792ace001",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ab8f1348-22e9-265f-cc51-f43bf1b5f286")
public static final String FIELDNAME_ReportLine_InvoiceLine2="ab8f1348-22e9-265f-cc51-f43bf1b5f286";

@XendraTrl(Identifier="ac83dfc2-21b3-eea2-a184-6012ddd2a337")
public static String es_PE_FIELD_ReportLine_InvoiceLine3_Name="Item de Factura";

@XendraTrl(Identifier="ac83dfc2-21b3-eea2-a184-6012ddd2a337")
public static String es_PE_FIELD_ReportLine_InvoiceLine3_Description="Item de detalle de factura";

@XendraTrl(Identifier="ac83dfc2-21b3-eea2-a184-6012ddd2a337")
public static String es_PE_FIELD_ReportLine_InvoiceLine3_Help="Identifica de manera única un Item de la factura";

@XendraField(AD_Column_ID="C_InvoiceLine_ID",IsCentrallyMaintained=true,
AD_Tab_ID="6e8ab691-2e95-c842-15b3-8cc772502eda",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=90,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ac83dfc2-21b3-eea2-a184-6012ddd2a337")
public static final String FIELDNAME_ReportLine_InvoiceLine3="ac83dfc2-21b3-eea2-a184-6012ddd2a337";

@XendraTrl(Identifier="af1f7f57-446a-a4ca-504b-f387b0ca856b")
public static String es_PE_COLUMN_C_InvoiceLine_ID_Name="Línea de Factura";

@XendraColumn(AD_Element_ID="56a4b078-1c5d-e08d-5d9d-847e94161779",ColumnName="C_InvoiceLine_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="af1f7f57-446a-a4ca-504b-f387b0ca856b",
Synchronized="2019-08-30 22:24:17.0")
/** Column name C_InvoiceLine_ID */
public static final String COLUMNNAME_C_InvoiceLine_ID = "C_InvoiceLine_ID";
/** Set Converted Amount.
@param ConvertedAmt Converted Amount */
public void setConvertedAmt (BigDecimal ConvertedAmt)
{
set_Value (COLUMNNAME_ConvertedAmt, ConvertedAmt);
}
/** Get Converted Amount.
@return Converted Amount */
public BigDecimal getConvertedAmt() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_ConvertedAmt);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="b75d1c8e-de51-c742-54a0-90397cf1629c")
public static String es_PE_FIELD_ReportLine_ConvertedAmount_Name="Total Convertido";

@XendraTrl(Identifier="b75d1c8e-de51-c742-54a0-90397cf1629c")
public static String es_PE_FIELD_ReportLine_ConvertedAmount_Description="Total Convertido";

@XendraTrl(Identifier="b75d1c8e-de51-c742-54a0-90397cf1629c")
public static String es_PE_FIELD_ReportLine_ConvertedAmount_Help="El Total convertido es el resultado de multiplicar el total fuente por la tasa de conversión para esta moneda destino.";

@XendraField(AD_Column_ID="ConvertedAmt",IsCentrallyMaintained=true,
AD_Tab_ID="a55b6ca2-12a4-8350-eda7-21fedb393102",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsTimeReport@=N | @IsInvoiced@=Y",DisplayLength=26,IsReadOnly=true,SeqNo=150,
SortNo=0,IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="b75d1c8e-de51-c742-54a0-90397cf1629c")
public static final String FIELDNAME_ReportLine_ConvertedAmount="b75d1c8e-de51-c742-54a0-90397cf1629c";

@XendraTrl(Identifier="9d711fa5-26bd-34ba-89d8-e9425fe3a607")
public static String es_PE_FIELD_ReportLine_ConvertedAmount2_Name="Total Convertido";

@XendraTrl(Identifier="9d711fa5-26bd-34ba-89d8-e9425fe3a607")
public static String es_PE_FIELD_ReportLine_ConvertedAmount2_Description="Total Convertido";

@XendraTrl(Identifier="9d711fa5-26bd-34ba-89d8-e9425fe3a607")
public static String es_PE_FIELD_ReportLine_ConvertedAmount2_Help="El Total convertido es el resultado de multiplicar el total fuente por la tasa de conversión para esta moneda destino.";

@XendraField(AD_Column_ID="ConvertedAmt",IsCentrallyMaintained=true,
AD_Tab_ID="a445d1e6-d00f-41d7-db6d-29d792ace001",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=190,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9d711fa5-26bd-34ba-89d8-e9425fe3a607")
public static final String FIELDNAME_ReportLine_ConvertedAmount2="9d711fa5-26bd-34ba-89d8-e9425fe3a607";

@XendraTrl(Identifier="86c86506-f4f1-b597-d34f-f819e1d31c47")
public static String es_PE_FIELD_ReportLine_ConvertedAmount3_Name="Total Convertido";

@XendraTrl(Identifier="86c86506-f4f1-b597-d34f-f819e1d31c47")
public static String es_PE_FIELD_ReportLine_ConvertedAmount3_Description="Total Convertido";

@XendraTrl(Identifier="86c86506-f4f1-b597-d34f-f819e1d31c47")
public static String es_PE_FIELD_ReportLine_ConvertedAmount3_Help="El Total convertido es el resultado de multiplicar el total fuente por la tasa de conversión para esta moneda destino.";

@XendraField(AD_Column_ID="ConvertedAmt",IsCentrallyMaintained=true,
AD_Tab_ID="6e8ab691-2e95-c842-15b3-8cc772502eda",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=180,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="86c86506-f4f1-b597-d34f-f819e1d31c47")
public static final String FIELDNAME_ReportLine_ConvertedAmount3="86c86506-f4f1-b597-d34f-f819e1d31c47";

@XendraTrl(Identifier="683b6c2a-ce55-a4aa-54cb-77c79aad6be1")
public static String es_PE_COLUMN_ConvertedAmt_Name="Total Convertido";

@XendraColumn(AD_Element_ID="6b6925fc-75bd-914f-a973-fc059d2b2f46",ColumnName="ConvertedAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="683b6c2a-ce55-a4aa-54cb-77c79aad6be1",
Synchronized="2019-08-30 22:24:17.0")
/** Column name ConvertedAmt */
public static final String COLUMNNAME_ConvertedAmt = "ConvertedAmt";
/** Set Sales Order Line.
@param C_OrderLine_ID Sales Order Line */
public void setC_OrderLine_ID (int C_OrderLine_ID)
{
if (C_OrderLine_ID <= 0) set_ValueNoCheck (COLUMNNAME_C_OrderLine_ID, null);
 else 
set_ValueNoCheck (COLUMNNAME_C_OrderLine_ID, Integer.valueOf(C_OrderLine_ID));
}
/** Get Sales Order Line.
@return Sales Order Line */
public int getC_OrderLine_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_OrderLine_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="b85b81ad-1a71-7fb3-a21e-f58527d95162")
public static String es_PE_FIELD_ReportLine_SalesOrderLine_Name="Item";

@XendraTrl(Identifier="b85b81ad-1a71-7fb3-a21e-f58527d95162")
public static String es_PE_FIELD_ReportLine_SalesOrderLine_Description="Item de orden de venta";

@XendraTrl(Identifier="b85b81ad-1a71-7fb3-a21e-f58527d95162")
public static String es_PE_FIELD_ReportLine_SalesOrderLine_Help="Identificador único para un Item en una orden.";

@XendraField(AD_Column_ID="C_OrderLine_ID",IsCentrallyMaintained=true,
AD_Tab_ID="a55b6ca2-12a4-8350-eda7-21fedb393102",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b85b81ad-1a71-7fb3-a21e-f58527d95162")
public static final String FIELDNAME_ReportLine_SalesOrderLine="b85b81ad-1a71-7fb3-a21e-f58527d95162";

@XendraTrl(Identifier="328f3eba-5f25-808d-b157-d13b0572df78")
public static String es_PE_FIELD_ReportLine_SalesOrderLine2_Name="Item";

@XendraTrl(Identifier="328f3eba-5f25-808d-b157-d13b0572df78")
public static String es_PE_FIELD_ReportLine_SalesOrderLine2_Description="Item de orden de venta";

@XendraTrl(Identifier="328f3eba-5f25-808d-b157-d13b0572df78")
public static String es_PE_FIELD_ReportLine_SalesOrderLine2_Help="Identificador único para un Item en una orden.";

@XendraField(AD_Column_ID="C_OrderLine_ID",IsCentrallyMaintained=true,
AD_Tab_ID="a445d1e6-d00f-41d7-db6d-29d792ace001",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=100,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="328f3eba-5f25-808d-b157-d13b0572df78")
public static final String FIELDNAME_ReportLine_SalesOrderLine2="328f3eba-5f25-808d-b157-d13b0572df78";

@XendraTrl(Identifier="5482b71f-a7fc-16be-a63d-0dd7b051f78a")
public static String es_PE_FIELD_ReportLine_PurchaseOrderLine_Name="Item";

@XendraTrl(Identifier="5482b71f-a7fc-16be-a63d-0dd7b051f78a")
public static String es_PE_FIELD_ReportLine_PurchaseOrderLine_Description="Item de orden de compra";

@XendraTrl(Identifier="5482b71f-a7fc-16be-a63d-0dd7b051f78a")
public static String es_PE_FIELD_ReportLine_PurchaseOrderLine_Help="Identificador único para un Item en una orden.";

@XendraField(AD_Column_ID="C_OrderLine_ID",IsCentrallyMaintained=true,
AD_Tab_ID="6e8ab691-2e95-c842-15b3-8cc772502eda",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5482b71f-a7fc-16be-a63d-0dd7b051f78a")
public static final String FIELDNAME_ReportLine_PurchaseOrderLine="5482b71f-a7fc-16be-a63d-0dd7b051f78a";

@XendraTrl(Identifier="813965c8-538f-de84-90cd-1f30f6ff12f0")
public static String es_PE_COLUMN_C_OrderLine_ID_Name="Línea";

@XendraColumn(AD_Element_ID="a94fbec0-0ef5-0f6c-033d-8286782321b0",ColumnName="C_OrderLine_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="813965c8-538f-de84-90cd-1f30f6ff12f0",
Synchronized="2019-08-30 22:24:17.0")
/** Column name C_OrderLine_ID */
public static final String COLUMNNAME_C_OrderLine_ID = "C_OrderLine_ID";
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

@XendraTrl(Identifier="66b09750-a526-69dc-b7dd-915a710500a2")
public static String es_PE_FIELD_ReportLine_Project_Name="Proyecto";

@XendraTrl(Identifier="66b09750-a526-69dc-b7dd-915a710500a2")
public static String es_PE_FIELD_ReportLine_Project_Description="Identifica un proyecto único";

@XendraTrl(Identifier="66b09750-a526-69dc-b7dd-915a710500a2")
public static String es_PE_FIELD_ReportLine_Project_Help="La ID de un proyecto es un identificador definido por el usuario para un proyecto";

@XendraField(AD_Column_ID="C_Project_ID",IsCentrallyMaintained=true,
AD_Tab_ID="a55b6ca2-12a4-8350-eda7-21fedb393102",AD_FieldGroup_ID="Reference",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=200,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="66b09750-a526-69dc-b7dd-915a710500a2")
public static final String FIELDNAME_ReportLine_Project="66b09750-a526-69dc-b7dd-915a710500a2";

@XendraTrl(Identifier="fe874214-59fe-1ae5-7c38-9a043716af49")
public static String es_PE_FIELD_ReportLine_Project2_Name="Proyecto";

@XendraTrl(Identifier="fe874214-59fe-1ae5-7c38-9a043716af49")
public static String es_PE_FIELD_ReportLine_Project2_Description="Identifica un proyecto único";

@XendraTrl(Identifier="fe874214-59fe-1ae5-7c38-9a043716af49")
public static String es_PE_FIELD_ReportLine_Project2_Help="La ID de un proyecto es un identificador definido por el usuario para un proyecto";

@XendraField(AD_Column_ID="C_Project_ID",IsCentrallyMaintained=true,
AD_Tab_ID="a445d1e6-d00f-41d7-db6d-29d792ace001",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=250,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="fe874214-59fe-1ae5-7c38-9a043716af49")
public static final String FIELDNAME_ReportLine_Project2="fe874214-59fe-1ae5-7c38-9a043716af49";

@XendraTrl(Identifier="9c004937-5fc8-ed11-225f-9280e93a5e10")
public static String es_PE_FIELD_ReportLine_Project3_Name="Proyecto";

@XendraTrl(Identifier="9c004937-5fc8-ed11-225f-9280e93a5e10")
public static String es_PE_FIELD_ReportLine_Project3_Description="Identifica un proyecto único";

@XendraTrl(Identifier="9c004937-5fc8-ed11-225f-9280e93a5e10")
public static String es_PE_FIELD_ReportLine_Project3_Help="La ID de un proyecto es un identificador definido por el usuario para un proyecto";

@XendraField(AD_Column_ID="C_Project_ID",IsCentrallyMaintained=true,
AD_Tab_ID="6e8ab691-2e95-c842-15b3-8cc772502eda",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=240,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9c004937-5fc8-ed11-225f-9280e93a5e10")
public static final String FIELDNAME_ReportLine_Project3="9c004937-5fc8-ed11-225f-9280e93a5e10";

@XendraTrl(Identifier="f9884c82-08b4-056c-2483-daee4dba0221")
public static String es_PE_COLUMN_C_Project_ID_Name="Proyecto";

@XendraColumn(AD_Element_ID="16ff5dcc-9178-73dd-e618-e88bd79d573b",ColumnName="C_Project_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="961cbc99-cc24-46df-b94e-37fe139285bf",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=true,ColumnSQL="",IsAllowLogging=false,
Identifier="f9884c82-08b4-056c-2483-daee4dba0221",Synchronized="2019-08-30 22:24:17.0")
/** Column name C_Project_ID */
public static final String COLUMNNAME_C_Project_ID = "C_Project_ID";
/** Set Project Phase.
@param C_ProjectPhase_ID Phase of a Project */
public void setC_ProjectPhase_ID (int C_ProjectPhase_ID)
{
if (C_ProjectPhase_ID <= 0) set_Value (COLUMNNAME_C_ProjectPhase_ID, null);
 else 
set_Value (COLUMNNAME_C_ProjectPhase_ID, Integer.valueOf(C_ProjectPhase_ID));
}
/** Get Project Phase.
@return Phase of a Project */
public int getC_ProjectPhase_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_ProjectPhase_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="69bb803e-f168-d87d-20fd-b670e229266f")
public static String es_PE_FIELD_ReportLine_ProjectPhase_Name="Fase del Proyecto";

@XendraTrl(Identifier="69bb803e-f168-d87d-20fd-b670e229266f")
public static String es_PE_FIELD_ReportLine_ProjectPhase_Description="Fase del Proyecto";

@XendraField(AD_Column_ID="C_ProjectPhase_ID",IsCentrallyMaintained=true,
AD_Tab_ID="a55b6ca2-12a4-8350-eda7-21fedb393102",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@C_Project_ID@!'' | @C_Project_ID@!0",DisplayLength=14,IsReadOnly=false,SeqNo=210,
SortNo=0,IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="69bb803e-f168-d87d-20fd-b670e229266f")
public static final String FIELDNAME_ReportLine_ProjectPhase="69bb803e-f168-d87d-20fd-b670e229266f";

@XendraTrl(Identifier="f7022015-c72c-9de8-01e4-b675d536ea70")
public static String es_PE_FIELD_ReportLine_ProjectPhase2_Name="Fase del Proyecto";

@XendraTrl(Identifier="f7022015-c72c-9de8-01e4-b675d536ea70")
public static String es_PE_FIELD_ReportLine_ProjectPhase2_Description="Fase del Proyecto";

@XendraField(AD_Column_ID="C_ProjectPhase_ID",IsCentrallyMaintained=true,
AD_Tab_ID="a445d1e6-d00f-41d7-db6d-29d792ace001",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@C_Project_ID@!'' | @C_Project_ID@!0",DisplayLength=14,IsReadOnly=false,SeqNo=270,
SortNo=0,IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="f7022015-c72c-9de8-01e4-b675d536ea70")
public static final String FIELDNAME_ReportLine_ProjectPhase2="f7022015-c72c-9de8-01e4-b675d536ea70";

@XendraTrl(Identifier="9bef1ce5-0db5-e3f8-4b2d-93c51de1ba79")
public static String es_PE_FIELD_ReportLine_ProjectPhase3_Name="Fase del Proyecto";

@XendraTrl(Identifier="9bef1ce5-0db5-e3f8-4b2d-93c51de1ba79")
public static String es_PE_FIELD_ReportLine_ProjectPhase3_Description="Fase del Proyecto";

@XendraField(AD_Column_ID="C_ProjectPhase_ID",IsCentrallyMaintained=true,
AD_Tab_ID="6e8ab691-2e95-c842-15b3-8cc772502eda",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@C_Project_ID@!'' | @C_Project_ID@!0",DisplayLength=14,IsReadOnly=false,SeqNo=260,
SortNo=0,IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="9bef1ce5-0db5-e3f8-4b2d-93c51de1ba79")
public static final String FIELDNAME_ReportLine_ProjectPhase3="9bef1ce5-0db5-e3f8-4b2d-93c51de1ba79";

@XendraTrl(Identifier="6e1d745c-d2a3-0c87-523c-99722cf5907f")
public static String es_PE_COLUMN_C_ProjectPhase_ID_Name="Fase del Proyecto";

@XendraColumn(AD_Element_ID="ba6e5aab-8337-208a-03da-5712e50d4da9",ColumnName="C_ProjectPhase_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="da3e27d3-eb4b-f867-a599-6db31fbeddf1",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=true,ColumnSQL="",IsAllowLogging=false,
Identifier="6e1d745c-d2a3-0c87-523c-99722cf5907f",Synchronized="2019-08-30 22:24:17.0")
/** Column name C_ProjectPhase_ID */
public static final String COLUMNNAME_C_ProjectPhase_ID = "C_ProjectPhase_ID";
/** Set Project Task.
@param C_ProjectTask_ID Actual Project Task in a Phase */
public void setC_ProjectTask_ID (int C_ProjectTask_ID)
{
if (C_ProjectTask_ID <= 0) set_Value (COLUMNNAME_C_ProjectTask_ID, null);
 else 
set_Value (COLUMNNAME_C_ProjectTask_ID, Integer.valueOf(C_ProjectTask_ID));
}
/** Get Project Task.
@return Actual Project Task in a Phase */
public int getC_ProjectTask_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_ProjectTask_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="15625706-5aa1-af4c-8889-d20cb6daf0a6")
public static String es_PE_FIELD_ReportLine_ProjectTask_Name="Tarea del Proyecto";

@XendraTrl(Identifier="15625706-5aa1-af4c-8889-d20cb6daf0a6")
public static String es_PE_FIELD_ReportLine_ProjectTask_Description="Actual tarea en la fase del proyecto.";

@XendraTrl(Identifier="15625706-5aa1-af4c-8889-d20cb6daf0a6")
public static String es_PE_FIELD_ReportLine_ProjectTask_Help="Una tarea de proyecto en una fase de proyecto representa el trabajo real.";

@XendraField(AD_Column_ID="C_ProjectTask_ID",IsCentrallyMaintained=true,
AD_Tab_ID="a55b6ca2-12a4-8350-eda7-21fedb393102",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@C_Project_ID@!'' | @C_Project_ID@!0",DisplayLength=14,IsReadOnly=false,SeqNo=220,
SortNo=0,IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="15625706-5aa1-af4c-8889-d20cb6daf0a6")
public static final String FIELDNAME_ReportLine_ProjectTask="15625706-5aa1-af4c-8889-d20cb6daf0a6";

@XendraTrl(Identifier="5f58e0ef-39a3-3fd3-8940-3fedfbaffcd9")
public static String es_PE_FIELD_ReportLine_ProjectTask2_Name="Tarea del Proyecto";

@XendraTrl(Identifier="5f58e0ef-39a3-3fd3-8940-3fedfbaffcd9")
public static String es_PE_FIELD_ReportLine_ProjectTask2_Description="Actual tarea en la fase del proyecto.";

@XendraTrl(Identifier="5f58e0ef-39a3-3fd3-8940-3fedfbaffcd9")
public static String es_PE_FIELD_ReportLine_ProjectTask2_Help="Una tarea de proyecto en una fase de proyecto representa el trabajo real.";

@XendraField(AD_Column_ID="C_ProjectTask_ID",IsCentrallyMaintained=true,
AD_Tab_ID="a445d1e6-d00f-41d7-db6d-29d792ace001",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@C_Project_ID@!'' | @C_Project_ID@!0",DisplayLength=14,IsReadOnly=false,SeqNo=280,
SortNo=0,IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="5f58e0ef-39a3-3fd3-8940-3fedfbaffcd9")
public static final String FIELDNAME_ReportLine_ProjectTask2="5f58e0ef-39a3-3fd3-8940-3fedfbaffcd9";

@XendraTrl(Identifier="8fe98f65-8b10-64b3-7960-9936c79d7b18")
public static String es_PE_FIELD_ReportLine_ProjectTask3_Name="Tarea del Proyecto";

@XendraTrl(Identifier="8fe98f65-8b10-64b3-7960-9936c79d7b18")
public static String es_PE_FIELD_ReportLine_ProjectTask3_Description="Actual tarea en la fase del proyecto.";

@XendraTrl(Identifier="8fe98f65-8b10-64b3-7960-9936c79d7b18")
public static String es_PE_FIELD_ReportLine_ProjectTask3_Help="Una tarea de proyecto en una fase de proyecto representa el trabajo real.";

@XendraField(AD_Column_ID="C_ProjectTask_ID",IsCentrallyMaintained=true,
AD_Tab_ID="6e8ab691-2e95-c842-15b3-8cc772502eda",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@C_Project_ID@!'' | @C_Project_ID@!0",DisplayLength=14,IsReadOnly=false,SeqNo=270,
SortNo=0,IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="8fe98f65-8b10-64b3-7960-9936c79d7b18")
public static final String FIELDNAME_ReportLine_ProjectTask3="8fe98f65-8b10-64b3-7960-9936c79d7b18";

@XendraTrl(Identifier="f1c994a5-a19d-ff27-6c24-58d34c70799f")
public static String es_PE_COLUMN_C_ProjectTask_ID_Name="Tarea del Proyecto";

@XendraColumn(AD_Element_ID="1b2d7a20-215c-4f56-6077-83adcead0920",ColumnName="C_ProjectTask_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="15226120-466d-4ea7-4165-d8f32823be21",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=true,ColumnSQL="",IsAllowLogging=false,
Identifier="f1c994a5-a19d-ff27-6c24-58d34c70799f",Synchronized="2019-08-30 22:24:17.0")
/** Column name C_ProjectTask_ID */
public static final String COLUMNNAME_C_ProjectTask_ID = "C_ProjectTask_ID";
/** Set UOM.
@param C_UOM_ID Unit of Measure */
public void setC_UOM_ID (int C_UOM_ID)
{
if (C_UOM_ID <= 0) set_Value (COLUMNNAME_C_UOM_ID, null);
 else 
set_Value (COLUMNNAME_C_UOM_ID, Integer.valueOf(C_UOM_ID));
}
/** Get UOM.
@return Unit of Measure */
public int getC_UOM_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_UOM_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="f6aedcef-0778-0d2d-77e3-ddd5b20dab51")
public static String es_PE_FIELD_ReportLine_UOM_Name="UM";

@XendraTrl(Identifier="f6aedcef-0778-0d2d-77e3-ddd5b20dab51")
public static String es_PE_FIELD_ReportLine_UOM_Description="Unidad de Medida";

@XendraTrl(Identifier="f6aedcef-0778-0d2d-77e3-ddd5b20dab51")
public static String es_PE_FIELD_ReportLine_UOM_Help="La UM define una unidad de medida única no monetaria";

@XendraField(AD_Column_ID="C_UOM_ID",IsCentrallyMaintained=true,
AD_Tab_ID="a55b6ca2-12a4-8350-eda7-21fedb393102",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsTimeReport@=Y & @IsInvoiced@=N",DisplayLength=14,IsReadOnly=false,SeqNo=110,
SortNo=0,IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="f6aedcef-0778-0d2d-77e3-ddd5b20dab51")
public static final String FIELDNAME_ReportLine_UOM="f6aedcef-0778-0d2d-77e3-ddd5b20dab51";

@XendraTrl(Identifier="af681e16-35aa-6152-3bb3-f7a2b015c450")
public static String es_PE_FIELD_ReportLine_UOM2_Name="UM";

@XendraTrl(Identifier="af681e16-35aa-6152-3bb3-f7a2b015c450")
public static String es_PE_FIELD_ReportLine_UOM2_Description="Unidad de Medida";

@XendraTrl(Identifier="af681e16-35aa-6152-3bb3-f7a2b015c450")
public static String es_PE_FIELD_ReportLine_UOM2_Help="La UM define una unidad de medida única no monetaria";

@XendraField(AD_Column_ID="C_UOM_ID",IsCentrallyMaintained=true,
AD_Tab_ID="a445d1e6-d00f-41d7-db6d-29d792ace001",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsTimeReport@=Y & @IsInvoiced@=N",DisplayLength=14,IsReadOnly=true,SeqNo=140,
SortNo=0,IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="af681e16-35aa-6152-3bb3-f7a2b015c450")
public static final String FIELDNAME_ReportLine_UOM2="af681e16-35aa-6152-3bb3-f7a2b015c450";

@XendraTrl(Identifier="0ac2ee95-ddf8-1ef9-0636-0a1e387d78f0")
public static String es_PE_FIELD_ReportLine_UOM3_Name="UM";

@XendraTrl(Identifier="0ac2ee95-ddf8-1ef9-0636-0a1e387d78f0")
public static String es_PE_FIELD_ReportLine_UOM3_Description="Unidad de Medida";

@XendraTrl(Identifier="0ac2ee95-ddf8-1ef9-0636-0a1e387d78f0")
public static String es_PE_FIELD_ReportLine_UOM3_Help="La UM define una unidad de medida única no monetaria";

@XendraField(AD_Column_ID="C_UOM_ID",IsCentrallyMaintained=true,
AD_Tab_ID="6e8ab691-2e95-c842-15b3-8cc772502eda",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsTimeReport@=Y & @IsInvoiced@=N",DisplayLength=14,IsReadOnly=false,SeqNo=140,
SortNo=0,IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="0ac2ee95-ddf8-1ef9-0636-0a1e387d78f0")
public static final String FIELDNAME_ReportLine_UOM3="0ac2ee95-ddf8-1ef9-0636-0a1e387d78f0";

@XendraTrl(Identifier="617f08e8-efb6-288d-33ea-63cb7d8cb9b5")
public static String es_PE_COLUMN_C_UOM_ID_Name="UM";

@XendraColumn(AD_Element_ID="d0345019-4fcc-44c8-4fd1-e38e3b4adeed",ColumnName="C_UOM_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="617f08e8-efb6-288d-33ea-63cb7d8cb9b5",
Synchronized="2019-08-30 22:24:17.0")
/** Column name C_UOM_ID */
public static final String COLUMNNAME_C_UOM_ID = "C_UOM_ID";
/** Set Expense Date.
@param DateExpense Date of expense */
public void setDateExpense (Timestamp DateExpense)
{
if (DateExpense == null) throw new IllegalArgumentException ("DateExpense is mandatory.");
set_Value (COLUMNNAME_DateExpense, DateExpense);
}
/** Get Expense Date.
@return Date of expense */
public Timestamp getDateExpense() 
{
return (Timestamp)get_Value(COLUMNNAME_DateExpense);
}

@XendraTrl(Identifier="7ca42df0-7831-55f6-a145-e59e3d7a378f")
public static String es_PE_FIELD_ReportLine_ExpenseDate_Name="Fecha de Gasto";

@XendraTrl(Identifier="7ca42df0-7831-55f6-a145-e59e3d7a378f")
public static String es_PE_FIELD_ReportLine_ExpenseDate_Description="Fecha del gasto";

@XendraTrl(Identifier="7ca42df0-7831-55f6-a145-e59e3d7a378f")
public static String es_PE_FIELD_ReportLine_ExpenseDate_Help="Fecha del gasto";

@XendraField(AD_Column_ID="DateExpense",IsCentrallyMaintained=true,
AD_Tab_ID="a55b6ca2-12a4-8350-eda7-21fedb393102",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7ca42df0-7831-55f6-a145-e59e3d7a378f")
public static final String FIELDNAME_ReportLine_ExpenseDate="7ca42df0-7831-55f6-a145-e59e3d7a378f";

@XendraTrl(Identifier="e76f24c7-5e9a-50d1-71dc-8409a4dec8d0")
public static String es_PE_FIELD_ReportLine_ExpenseDate2_Name="Fecha de Gasto";

@XendraTrl(Identifier="e76f24c7-5e9a-50d1-71dc-8409a4dec8d0")
public static String es_PE_FIELD_ReportLine_ExpenseDate2_Description="Fecha del gasto";

@XendraTrl(Identifier="e76f24c7-5e9a-50d1-71dc-8409a4dec8d0")
public static String es_PE_FIELD_ReportLine_ExpenseDate2_Help="Fecha del gasto";

@XendraField(AD_Column_ID="DateExpense",IsCentrallyMaintained=true,
AD_Tab_ID="a445d1e6-d00f-41d7-db6d-29d792ace001",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e76f24c7-5e9a-50d1-71dc-8409a4dec8d0")
public static final String FIELDNAME_ReportLine_ExpenseDate2="e76f24c7-5e9a-50d1-71dc-8409a4dec8d0";

@XendraTrl(Identifier="12b31891-f396-5e97-30c3-e3ce912dc9a6")
public static String es_PE_FIELD_ReportLine_ExpenseDate3_Name="Fecha de Gasto";

@XendraTrl(Identifier="12b31891-f396-5e97-30c3-e3ce912dc9a6")
public static String es_PE_FIELD_ReportLine_ExpenseDate3_Description="Fecha del gasto";

@XendraTrl(Identifier="12b31891-f396-5e97-30c3-e3ce912dc9a6")
public static String es_PE_FIELD_ReportLine_ExpenseDate3_Help="Fecha del gasto";

@XendraField(AD_Column_ID="DateExpense",IsCentrallyMaintained=true,
AD_Tab_ID="6e8ab691-2e95-c842-15b3-8cc772502eda",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="12b31891-f396-5e97-30c3-e3ce912dc9a6")
public static final String FIELDNAME_ReportLine_ExpenseDate3="12b31891-f396-5e97-30c3-e3ce912dc9a6";

@XendraTrl(Identifier="a6735147-5072-24b8-b6aa-116be3d97f6d")
public static String es_PE_COLUMN_DateExpense_Name="Fecha de Gasto";

@XendraColumn(AD_Element_ID="33536060-f29f-8c59-eccd-ba0528859071",ColumnName="DateExpense",
AD_Reference_ID=15,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,
DefaultValue="@DateExpense@;@DateReport@",IsKey=false,IsInternal=false,IsParent=false,
IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="",VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="a6735147-5072-24b8-b6aa-116be3d97f6d",Synchronized="2019-08-30 22:24:18.0")
/** Column name DateExpense */
public static final String COLUMNNAME_DateExpense = "DateExpense";
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

@XendraTrl(Identifier="f4db7fb3-a55e-bf7f-370f-d97a0462218d")
public static String es_PE_FIELD_ReportLine_Description_Name="Observación";

@XendraTrl(Identifier="f4db7fb3-a55e-bf7f-370f-d97a0462218d")
public static String es_PE_FIELD_ReportLine_Description_Description="Observación";

@XendraTrl(Identifier="f4db7fb3-a55e-bf7f-370f-d97a0462218d")
public static String es_PE_FIELD_ReportLine_Description_Help="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="a55b6ca2-12a4-8350-eda7-21fedb393102",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=160,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f4db7fb3-a55e-bf7f-370f-d97a0462218d")
public static final String FIELDNAME_ReportLine_Description="f4db7fb3-a55e-bf7f-370f-d97a0462218d";

@XendraTrl(Identifier="b9deccb4-c408-b4d8-3c9c-3a50e2d2c5ac")
public static String es_PE_FIELD_ReportLine_Description2_Name="Observación";

@XendraTrl(Identifier="b9deccb4-c408-b4d8-3c9c-3a50e2d2c5ac")
public static String es_PE_FIELD_ReportLine_Description2_Description="Observación corta opcional del registro";

@XendraTrl(Identifier="b9deccb4-c408-b4d8-3c9c-3a50e2d2c5ac")
public static String es_PE_FIELD_ReportLine_Description2_Help="Una Observación esta limitada a 255 caracteres";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="a445d1e6-d00f-41d7-db6d-29d792ace001",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=220,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b9deccb4-c408-b4d8-3c9c-3a50e2d2c5ac")
public static final String FIELDNAME_ReportLine_Description2="b9deccb4-c408-b4d8-3c9c-3a50e2d2c5ac";

@XendraTrl(Identifier="37663874-62b8-3489-dea9-0e4c3ea726f4")
public static String es_PE_FIELD_ReportLine_Description3_Name="Observación";

@XendraTrl(Identifier="37663874-62b8-3489-dea9-0e4c3ea726f4")
public static String es_PE_FIELD_ReportLine_Description3_Description="Observación corta opcional del registro";

@XendraTrl(Identifier="37663874-62b8-3489-dea9-0e4c3ea726f4")
public static String es_PE_FIELD_ReportLine_Description3_Help="Una Observación esta limitada a 255 caracteres";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="6e8ab691-2e95-c842-15b3-8cc772502eda",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=210,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="37663874-62b8-3489-dea9-0e4c3ea726f4")
public static final String FIELDNAME_ReportLine_Description3="37663874-62b8-3489-dea9-0e4c3ea726f4";

@XendraTrl(Identifier="4ebe9c80-a930-ecef-e6f3-d51ddccb52c5")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="4ebe9c80-a930-ecef-e6f3-d51ddccb52c5",
Synchronized="2019-08-30 22:24:18.0")
/** Column name Description */
public static final String COLUMNNAME_Description = "Description";
/** Set Expense Amount.
@param ExpenseAmt Amount for this expense */
public void setExpenseAmt (BigDecimal ExpenseAmt)
{
set_Value (COLUMNNAME_ExpenseAmt, ExpenseAmt);
}
/** Get Expense Amount.
@return Amount for this expense */
public BigDecimal getExpenseAmt() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_ExpenseAmt);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="a0f1b443-55ed-14f7-f558-14920f895cdb")
public static String es_PE_FIELD_ReportLine_ExpenseAmount_Name="Total del Gasto";

@XendraTrl(Identifier="a0f1b443-55ed-14f7-f558-14920f895cdb")
public static String es_PE_FIELD_ReportLine_ExpenseAmount_Description="Total para este gasto";

@XendraTrl(Identifier="a0f1b443-55ed-14f7-f558-14920f895cdb")
public static String es_PE_FIELD_ReportLine_ExpenseAmount_Help="Total del gasto expresado en la moneda de la transacción";

@XendraField(AD_Column_ID="ExpenseAmt",IsCentrallyMaintained=true,
AD_Tab_ID="a55b6ca2-12a4-8350-eda7-21fedb393102",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsTimeReport@=N | @IsInvoiced@=Y",DisplayLength=26,IsReadOnly=false,SeqNo=120,
SortNo=0,IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="a0f1b443-55ed-14f7-f558-14920f895cdb")
public static final String FIELDNAME_ReportLine_ExpenseAmount="a0f1b443-55ed-14f7-f558-14920f895cdb";

@XendraTrl(Identifier="7c029018-c97e-8050-2a52-42fb1861cf25")
public static String es_PE_FIELD_ReportLine_ExpenseAmount2_Name="Total del Gasto";

@XendraTrl(Identifier="7c029018-c97e-8050-2a52-42fb1861cf25")
public static String es_PE_FIELD_ReportLine_ExpenseAmount2_Description="Total para este gasto";

@XendraTrl(Identifier="7c029018-c97e-8050-2a52-42fb1861cf25")
public static String es_PE_FIELD_ReportLine_ExpenseAmount2_Help="Total del gasto expresado en la moneda de la transacción";

@XendraField(AD_Column_ID="ExpenseAmt",IsCentrallyMaintained=true,
AD_Tab_ID="a445d1e6-d00f-41d7-db6d-29d792ace001",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=160,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7c029018-c97e-8050-2a52-42fb1861cf25")
public static final String FIELDNAME_ReportLine_ExpenseAmount2="7c029018-c97e-8050-2a52-42fb1861cf25";

@XendraTrl(Identifier="14cabc55-fefd-10c4-2243-2430df7205f6")
public static String es_PE_FIELD_ReportLine_ExpenseAmount3_Name="Total del Gasto";

@XendraTrl(Identifier="14cabc55-fefd-10c4-2243-2430df7205f6")
public static String es_PE_FIELD_ReportLine_ExpenseAmount3_Description="Total para este gasto";

@XendraTrl(Identifier="14cabc55-fefd-10c4-2243-2430df7205f6")
public static String es_PE_FIELD_ReportLine_ExpenseAmount3_Help="Total del gasto expresado en la moneda de la transacción";

@XendraField(AD_Column_ID="ExpenseAmt",IsCentrallyMaintained=true,
AD_Tab_ID="6e8ab691-2e95-c842-15b3-8cc772502eda",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=160,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="14cabc55-fefd-10c4-2243-2430df7205f6")
public static final String FIELDNAME_ReportLine_ExpenseAmount3="14cabc55-fefd-10c4-2243-2430df7205f6";

@XendraTrl(Identifier="d06e8835-0db4-652b-c744-0d412b3d27b9")
public static String es_PE_COLUMN_ExpenseAmt_Name="Total del Gasto";

@XendraColumn(AD_Element_ID="efdc05b4-f924-b016-36bb-17a22e995746",ColumnName="ExpenseAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="org.compiere.model.CalloutTimeExpense.amount",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d06e8835-0db4-652b-c744-0d412b3d27b9",
Synchronized="2019-08-30 22:24:18.0")
/** Column name ExpenseAmt */
public static final String COLUMNNAME_ExpenseAmt = "ExpenseAmt";
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
@XendraTrl(Identifier="595aa502-43f0-4b7e-9519-94d0ff740bb7")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="595aa502-43f0-4b7e-9519-94d0ff740bb7",
Synchronized="2019-08-30 22:24:18.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Invoice Price.
@param InvoicePrice Unit price to be invoiced or 0 for default price */
public void setInvoicePrice (BigDecimal InvoicePrice)
{
set_Value (COLUMNNAME_InvoicePrice, InvoicePrice);
}
/** Get Invoice Price.
@return Unit price to be invoiced or 0 for default price */
public BigDecimal getInvoicePrice() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_InvoicePrice);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="24fed52c-061d-9e31-ad4c-ff22695ab678")
public static String es_PE_FIELD_ReportLine_InvoicePrice_Name="Precio de Factura";

@XendraTrl(Identifier="24fed52c-061d-9e31-ad4c-ff22695ab678")
public static String es_PE_FIELD_ReportLine_InvoicePrice_Description="Precio unitario para ser facturado";

@XendraTrl(Identifier="24fed52c-061d-9e31-ad4c-ff22695ab678")
public static String es_PE_FIELD_ReportLine_InvoicePrice_Help="Precio unitario en la moneda del socio";

@XendraField(AD_Column_ID="InvoicePrice",IsCentrallyMaintained=true,
AD_Tab_ID="a55b6ca2-12a4-8350-eda7-21fedb393102",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsInvoiced@=Y",DisplayLength=26,IsReadOnly=false,SeqNo=140,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="24fed52c-061d-9e31-ad4c-ff22695ab678")
public static final String FIELDNAME_ReportLine_InvoicePrice="24fed52c-061d-9e31-ad4c-ff22695ab678";

@XendraTrl(Identifier="72711a60-f55b-fb62-8943-6d181020213f")
public static String es_PE_FIELD_ReportLine_InvoicePrice2_Name="Precio de Factura";

@XendraTrl(Identifier="72711a60-f55b-fb62-8943-6d181020213f")
public static String es_PE_FIELD_ReportLine_InvoicePrice2_Description="Precio unitario para ser facturado";

@XendraTrl(Identifier="72711a60-f55b-fb62-8943-6d181020213f")
public static String es_PE_FIELD_ReportLine_InvoicePrice2_Help="Precio unitario en la moneda del socio";

@XendraField(AD_Column_ID="InvoicePrice",IsCentrallyMaintained=true,
AD_Tab_ID="a445d1e6-d00f-41d7-db6d-29d792ace001",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsInvoiced@=Y",DisplayLength=26,IsReadOnly=true,SeqNo=180,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="72711a60-f55b-fb62-8943-6d181020213f")
public static final String FIELDNAME_ReportLine_InvoicePrice2="72711a60-f55b-fb62-8943-6d181020213f";

@XendraTrl(Identifier="794c0624-28f9-b55d-011e-95b63f45e17d")
public static String es_PE_FIELD_ReportLine_InvoicePrice3_Name="Precio de Factura";

@XendraTrl(Identifier="794c0624-28f9-b55d-011e-95b63f45e17d")
public static String es_PE_FIELD_ReportLine_InvoicePrice3_Description="Precio unitario para ser facturado";

@XendraTrl(Identifier="794c0624-28f9-b55d-011e-95b63f45e17d")
public static String es_PE_FIELD_ReportLine_InvoicePrice3_Help="Precio unitario en la moneda del socio";

@XendraField(AD_Column_ID="InvoicePrice",IsCentrallyMaintained=true,
AD_Tab_ID="6e8ab691-2e95-c842-15b3-8cc772502eda",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="@IsInvoiced@=Y",DisplayLength=26,IsReadOnly=true,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="794c0624-28f9-b55d-011e-95b63f45e17d")
public static final String FIELDNAME_ReportLine_InvoicePrice3="794c0624-28f9-b55d-011e-95b63f45e17d";

@XendraTrl(Identifier="77c453f3-fb31-d174-efb4-bb3701b92d47")
public static String es_PE_COLUMN_InvoicePrice_Name="Precio de Factura";

@XendraColumn(AD_Element_ID="f62a40c7-2a3b-0043-5211-ca2a6535c734",ColumnName="InvoicePrice",
AD_Reference_ID=37,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="77c453f3-fb31-d174-efb4-bb3701b92d47",
Synchronized="2019-08-30 22:24:18.0")
/** Column name InvoicePrice */
public static final String COLUMNNAME_InvoicePrice = "InvoicePrice";
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

@XendraTrl(Identifier="108b9f40-52e0-18ee-0496-e66e60847016")
public static String es_PE_FIELD_ReportLine_Invoiced_Name="Facturado";

@XendraField(AD_Column_ID="IsInvoiced",IsCentrallyMaintained=true,
AD_Tab_ID="a55b6ca2-12a4-8350-eda7-21fedb393102",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="108b9f40-52e0-18ee-0496-e66e60847016")
public static final String FIELDNAME_ReportLine_Invoiced="108b9f40-52e0-18ee-0496-e66e60847016";

@XendraTrl(Identifier="e5c8261b-71b4-c31c-97db-ae952f8a9aad")
public static String es_PE_FIELD_ReportLine_Invoiced2_Name="Facturado";

@XendraField(AD_Column_ID="IsInvoiced",IsCentrallyMaintained=true,
AD_Tab_ID="a445d1e6-d00f-41d7-db6d-29d792ace001",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e5c8261b-71b4-c31c-97db-ae952f8a9aad")
public static final String FIELDNAME_ReportLine_Invoiced2="e5c8261b-71b4-c31c-97db-ae952f8a9aad";

@XendraTrl(Identifier="3df60509-aac6-0991-2460-b878fbb24af9")
public static String es_PE_FIELD_ReportLine_Invoiced3_Name="Facturado";

@XendraField(AD_Column_ID="IsInvoiced",IsCentrallyMaintained=true,
AD_Tab_ID="6e8ab691-2e95-c842-15b3-8cc772502eda",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=true,SeqNo=100,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3df60509-aac6-0991-2460-b878fbb24af9")
public static final String FIELDNAME_ReportLine_Invoiced3="3df60509-aac6-0991-2460-b878fbb24af9";

@XendraTrl(Identifier="bade5a9c-54e6-2d65-6462-40d40f83139f")
public static String es_PE_COLUMN_IsInvoiced_Name="Facturado";

@XendraColumn(AD_Element_ID="a685c688-064e-aa25-7a8b-2b0273e958c1",ColumnName="IsInvoiced",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=true,ColumnSQL="",
IsAllowLogging=false,Identifier="bade5a9c-54e6-2d65-6462-40d40f83139f",
Synchronized="2019-08-30 22:24:18.0")
/** Column name IsInvoiced */
public static final String COLUMNNAME_IsInvoiced = "IsInvoiced";
/** Set Time Report.
@param IsTimeReport Line is a time report only (no expense) */
public void setIsTimeReport (boolean IsTimeReport)
{
set_Value (COLUMNNAME_IsTimeReport, Boolean.valueOf(IsTimeReport));
}
/** Get Time Report.
@return Line is a time report only (no expense) */
public boolean isTimeReport() 
{
Object oo = get_Value(COLUMNNAME_IsTimeReport);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="17805f83-cbe4-99a0-406b-0e7325809f42")
public static String es_PE_FIELD_ReportLine_TimeReport_Name="Informe de Tiempo";

@XendraTrl(Identifier="17805f83-cbe4-99a0-406b-0e7325809f42")
public static String es_PE_FIELD_ReportLine_TimeReport_Description="La línea corresponde a un Informe solo de tiempo; no tiene gastos";

@XendraTrl(Identifier="17805f83-cbe4-99a0-406b-0e7325809f42")
public static String es_PE_FIELD_ReportLine_TimeReport_Help="La línea solo tiene información de tiempo; no tiene gastos.";

@XendraField(AD_Column_ID="IsTimeReport",IsCentrallyMaintained=true,
AD_Tab_ID="a55b6ca2-12a4-8350-eda7-21fedb393102",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="17805f83-cbe4-99a0-406b-0e7325809f42")
public static final String FIELDNAME_ReportLine_TimeReport="17805f83-cbe4-99a0-406b-0e7325809f42";

@XendraTrl(Identifier="7f59abcb-783b-98e8-89c1-b03b1e04a727")
public static String es_PE_FIELD_ReportLine_TimeReport2_Name="Informe de Tiempo";

@XendraTrl(Identifier="7f59abcb-783b-98e8-89c1-b03b1e04a727")
public static String es_PE_FIELD_ReportLine_TimeReport2_Description="La línea corresponde a un Informe solo de tiempo; no tiene gastos";

@XendraTrl(Identifier="7f59abcb-783b-98e8-89c1-b03b1e04a727")
public static String es_PE_FIELD_ReportLine_TimeReport2_Help="La línea solo tiene información de tiempo; no tiene gastos.";

@XendraField(AD_Column_ID="IsTimeReport",IsCentrallyMaintained=true,
AD_Tab_ID="a445d1e6-d00f-41d7-db6d-29d792ace001",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=true,SeqNo=80,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7f59abcb-783b-98e8-89c1-b03b1e04a727")
public static final String FIELDNAME_ReportLine_TimeReport2="7f59abcb-783b-98e8-89c1-b03b1e04a727";

@XendraTrl(Identifier="3e90ab0d-1f36-70c3-e3b3-de33f0b36742")
public static String es_PE_FIELD_ReportLine_TimeReport3_Name="Informe de Tiempo";

@XendraTrl(Identifier="3e90ab0d-1f36-70c3-e3b3-de33f0b36742")
public static String es_PE_FIELD_ReportLine_TimeReport3_Description="La línea corresponde a un Informe solo de tiempo; no tiene gastos";

@XendraTrl(Identifier="3e90ab0d-1f36-70c3-e3b3-de33f0b36742")
public static String es_PE_FIELD_ReportLine_TimeReport3_Help="La línea solo tiene información de tiempo; no tiene gastos.";

@XendraField(AD_Column_ID="IsTimeReport",IsCentrallyMaintained=true,
AD_Tab_ID="6e8ab691-2e95-c842-15b3-8cc772502eda",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=true,SeqNo=80,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3e90ab0d-1f36-70c3-e3b3-de33f0b36742")
public static final String FIELDNAME_ReportLine_TimeReport3="3e90ab0d-1f36-70c3-e3b3-de33f0b36742";

@XendraTrl(Identifier="95641a6a-786e-89b0-5c25-2402ba8abf87")
public static String es_PE_COLUMN_IsTimeReport_Name="Informe de Tiempo";

@XendraColumn(AD_Element_ID="0abc8093-d804-98dc-c3d0-5c15fbe8ef00",ColumnName="IsTimeReport",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="95641a6a-786e-89b0-5c25-2402ba8abf87",
Synchronized="2019-08-30 22:24:18.0")
/** Column name IsTimeReport */
public static final String COLUMNNAME_IsTimeReport = "IsTimeReport";
/** Set Line No.
@param Line Unique line for this document */
public void setLine (int Line)
{
set_Value (COLUMNNAME_Line, Integer.valueOf(Line));
}
/** Get Line No.
@return Unique line for this document */
public int getLine() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_Line);
if (ii == null) return 0;
return ii.intValue();
}
/** Get Record ID/ColumnName
@return ID/ColumnName pair
*/public KeyNamePair getKeyNamePair() 
{
return new KeyNamePair(get_ID(), String.valueOf(getLine()));
}

@XendraTrl(Identifier="e9235d67-e2ee-7a88-3784-ff4557c18ea6")
public static String es_PE_FIELD_ReportLine_LineNo_Name="No. Línea";

@XendraTrl(Identifier="e9235d67-e2ee-7a88-3784-ff4557c18ea6")
public static String es_PE_FIELD_ReportLine_LineNo_Description="No. Línea único para este documento";

@XendraTrl(Identifier="e9235d67-e2ee-7a88-3784-ff4557c18ea6")
public static String es_PE_FIELD_ReportLine_LineNo_Help="Indica el No. Línea para un documento. También controlará el orden de despliegue de las líneas dentro de un documento";

@XendraField(AD_Column_ID="Line",IsCentrallyMaintained=true,
AD_Tab_ID="a55b6ca2-12a4-8350-eda7-21fedb393102",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=40,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e9235d67-e2ee-7a88-3784-ff4557c18ea6")
public static final String FIELDNAME_ReportLine_LineNo="e9235d67-e2ee-7a88-3784-ff4557c18ea6";

@XendraTrl(Identifier="1a49dc58-51bf-9b18-493d-ceefc0ca3eed")
public static String es_PE_FIELD_ReportLine_LineNo2_Name="No. Línea";

@XendraTrl(Identifier="1a49dc58-51bf-9b18-493d-ceefc0ca3eed")
public static String es_PE_FIELD_ReportLine_LineNo2_Description="No. Línea único para este documento";

@XendraTrl(Identifier="1a49dc58-51bf-9b18-493d-ceefc0ca3eed")
public static String es_PE_FIELD_ReportLine_LineNo2_Help="Indica el No. Línea para un documento. También controlará el orden de despliegue de las líneas dentro de un documento";

@XendraField(AD_Column_ID="Line",IsCentrallyMaintained=true,
AD_Tab_ID="a445d1e6-d00f-41d7-db6d-29d792ace001",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=true,SeqNo=50,SortNo=3,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1a49dc58-51bf-9b18-493d-ceefc0ca3eed")
public static final String FIELDNAME_ReportLine_LineNo2="1a49dc58-51bf-9b18-493d-ceefc0ca3eed";

@XendraTrl(Identifier="792c8ff9-65ba-c9a1-3d18-ddda6fef5606")
public static String es_PE_FIELD_ReportLine_LineNo3_Name="No. Línea";

@XendraTrl(Identifier="792c8ff9-65ba-c9a1-3d18-ddda6fef5606")
public static String es_PE_FIELD_ReportLine_LineNo3_Description="No. Línea único para este documento";

@XendraTrl(Identifier="792c8ff9-65ba-c9a1-3d18-ddda6fef5606")
public static String es_PE_FIELD_ReportLine_LineNo3_Help="Indica el No. Línea para un documento. También controlará el orden de despliegue de las líneas dentro de un documento";

@XendraField(AD_Column_ID="Line",IsCentrallyMaintained=true,
AD_Tab_ID="6e8ab691-2e95-c842-15b3-8cc772502eda",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=true,SeqNo=50,SortNo=3,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="792c8ff9-65ba-c9a1-3d18-ddda6fef5606")
public static final String FIELDNAME_ReportLine_LineNo3="792c8ff9-65ba-c9a1-3d18-ddda6fef5606";

@XendraTrl(Identifier="a31b8bb2-63bd-1e15-152c-73811e9ecb61")
public static String es_PE_COLUMN_Line_Name="No. Línea";

@XendraColumn(AD_Element_ID="986ef077-61da-f9cf-1c6d-aefe3a35113b",ColumnName="Line",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,
DefaultValue="@SQL=SELECT COALESCE(MAX(Line),0)+10 AS DefaultValue FROM S_TimeExpenseLine WHERE S_TimeExpense_ID=@S_TimeExpense_ID@",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a31b8bb2-63bd-1e15-152c-73811e9ecb61",
Synchronized="2019-08-30 22:24:18.0")
/** Column name Line */
public static final String COLUMNNAME_Line = "Line";
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

@XendraTrl(Identifier="91c45055-857b-a1fd-ef6a-e909c9269cdc")
public static String es_PE_FIELD_ReportLine_Product_Name="Producto";

@XendraTrl(Identifier="91c45055-857b-a1fd-ef6a-e909c9269cdc")
public static String es_PE_FIELD_ReportLine_Product_Description="Producto; servicio ó artículo.";

@XendraTrl(Identifier="91c45055-857b-a1fd-ef6a-e909c9269cdc")
public static String es_PE_FIELD_ReportLine_Product_Help="Identifica un artículo que puede ser comprado ó vendido es esta organización.";

@XendraField(AD_Column_ID="M_Product_ID",IsCentrallyMaintained=true,
AD_Tab_ID="a55b6ca2-12a4-8350-eda7-21fedb393102",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="91c45055-857b-a1fd-ef6a-e909c9269cdc")
public static final String FIELDNAME_ReportLine_Product="91c45055-857b-a1fd-ef6a-e909c9269cdc";

@XendraTrl(Identifier="6f15f577-c7bd-33c7-fe8b-fe661a4f8b8a")
public static String es_PE_FIELD_ReportLine_Product2_Name="Producto";

@XendraTrl(Identifier="6f15f577-c7bd-33c7-fe8b-fe661a4f8b8a")
public static String es_PE_FIELD_ReportLine_Product2_Description="Producto; servicio ó artículo.";

@XendraTrl(Identifier="6f15f577-c7bd-33c7-fe8b-fe661a4f8b8a")
public static String es_PE_FIELD_ReportLine_Product2_Help="Identifica un artículo que puede ser comprado ó vendido es esta organización.";

@XendraField(AD_Column_ID="M_Product_ID",IsCentrallyMaintained=true,
AD_Tab_ID="a445d1e6-d00f-41d7-db6d-29d792ace001",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=110,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6f15f577-c7bd-33c7-fe8b-fe661a4f8b8a")
public static final String FIELDNAME_ReportLine_Product2="6f15f577-c7bd-33c7-fe8b-fe661a4f8b8a";

@XendraTrl(Identifier="84513d85-b187-a369-61d8-f36e40ec2d17")
public static String es_PE_FIELD_ReportLine_Product3_Name="Producto";

@XendraTrl(Identifier="84513d85-b187-a369-61d8-f36e40ec2d17")
public static String es_PE_FIELD_ReportLine_Product3_Description="Producto; servicio ó artículo.";

@XendraTrl(Identifier="84513d85-b187-a369-61d8-f36e40ec2d17")
public static String es_PE_FIELD_ReportLine_Product3_Help="Identifica un artículo que puede ser comprado ó vendido es esta organización.";

@XendraField(AD_Column_ID="M_Product_ID",IsCentrallyMaintained=true,
AD_Tab_ID="6e8ab691-2e95-c842-15b3-8cc772502eda",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=110,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="84513d85-b187-a369-61d8-f36e40ec2d17")
public static final String FIELDNAME_ReportLine_Product3="84513d85-b187-a369-61d8-f36e40ec2d17";

@XendraTrl(Identifier="60b65933-a5b2-2ceb-9ce9-64dc5df4cdd1")
public static String es_PE_COLUMN_M_Product_ID_Name="Producto";

@XendraColumn(AD_Element_ID="b4701f57-f2fc-567c-58e2-a6aefbc3932c",ColumnName="M_Product_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="4281f8eb-238e-6b28-eb66-8cc866e6312c",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="@S_ResourceAssignment_ID@!0",IsIdentifier=false,SeqNo=0,
IsTranslated=false,Callout="org.compiere.model.CalloutTimeExpense.product",VFormat="",ValueMin="",
ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,
ColumnSQL="",IsAllowLogging=false,Identifier="60b65933-a5b2-2ceb-9ce9-64dc5df4cdd1",
Synchronized="2019-08-30 22:24:18.0")
/** Column name M_Product_ID */
public static final String COLUMNNAME_M_Product_ID = "M_Product_ID";
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
@XendraTrl(Identifier="c17216e5-389d-0ec4-a235-aa7824788320")
public static String es_PE_FIELD_ReportLine_Note_Name="Nota";

@XendraTrl(Identifier="c17216e5-389d-0ec4-a235-aa7824788320")
public static String es_PE_FIELD_ReportLine_Note_Description="Información adicional opcional definida por el usuario";

@XendraTrl(Identifier="c17216e5-389d-0ec4-a235-aa7824788320")
public static String es_PE_FIELD_ReportLine_Note_Help="El campo Nota permite una entrada opcional de información definida por el usuario considerando este registro";

@XendraField(AD_Column_ID="Note",IsCentrallyMaintained=true,
AD_Tab_ID="a55b6ca2-12a4-8350-eda7-21fedb393102",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=170,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c17216e5-389d-0ec4-a235-aa7824788320")
public static final String FIELDNAME_ReportLine_Note="c17216e5-389d-0ec4-a235-aa7824788320";

@XendraTrl(Identifier="238b4a00-5a06-62bd-d520-e860d1c34738")
public static String es_PE_FIELD_ReportLine_Note2_Name="Nota";

@XendraTrl(Identifier="238b4a00-5a06-62bd-d520-e860d1c34738")
public static String es_PE_FIELD_ReportLine_Note2_Description="Información adicional opcional definida por el usuario";

@XendraTrl(Identifier="238b4a00-5a06-62bd-d520-e860d1c34738")
public static String es_PE_FIELD_ReportLine_Note2_Help="El campo Nota permite una entrada opcional de información definida por el usuario considerando este registro";

@XendraField(AD_Column_ID="Note",IsCentrallyMaintained=true,
AD_Tab_ID="a445d1e6-d00f-41d7-db6d-29d792ace001",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=230,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="238b4a00-5a06-62bd-d520-e860d1c34738")
public static final String FIELDNAME_ReportLine_Note2="238b4a00-5a06-62bd-d520-e860d1c34738";

@XendraTrl(Identifier="22e432df-bf25-9a50-76e3-2cba6c65c3f4")
public static String es_PE_FIELD_ReportLine_Note3_Name="Nota";

@XendraTrl(Identifier="22e432df-bf25-9a50-76e3-2cba6c65c3f4")
public static String es_PE_FIELD_ReportLine_Note3_Description="Información adicional opcional definida por el usuario";

@XendraTrl(Identifier="22e432df-bf25-9a50-76e3-2cba6c65c3f4")
public static String es_PE_FIELD_ReportLine_Note3_Help="El campo Nota permite una entrada opcional de información definida por el usuario considerando este registro";

@XendraField(AD_Column_ID="Note",IsCentrallyMaintained=true,
AD_Tab_ID="6e8ab691-2e95-c842-15b3-8cc772502eda",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=220,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="22e432df-bf25-9a50-76e3-2cba6c65c3f4")
public static final String FIELDNAME_ReportLine_Note3="22e432df-bf25-9a50-76e3-2cba6c65c3f4";

@XendraTrl(Identifier="76442d49-c6ef-415f-dc23-4780e9bc8f61")
public static String es_PE_COLUMN_Note_Name="Nota";

@XendraColumn(AD_Element_ID="5fea140b-6b26-b544-b237-3b3fa64ae1c6",ColumnName="Note",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="76442d49-c6ef-415f-dc23-4780e9bc8f61",
Synchronized="2019-08-30 22:24:18.0")
/** Column name Note */
public static final String COLUMNNAME_Note = "Note";
/** Set Price Invoiced.
@param PriceInvoiced The priced invoiced to the customer (in the currency of the customer's AR price list) - 0 for default price */
public void setPriceInvoiced (BigDecimal PriceInvoiced)
{
set_Value (COLUMNNAME_PriceInvoiced, PriceInvoiced);
}
/** Get Price Invoiced.
@return The priced invoiced to the customer (in the currency of the customer's AR price list) - 0 for default price */
public BigDecimal getPriceInvoiced() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_PriceInvoiced);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="14bfdf9d-ba7d-a6d2-1d19-296194cc4b14")
public static String es_PE_FIELD_ReportLine_PriceInvoiced_Name="Precio de Factura";

@XendraTrl(Identifier="14bfdf9d-ba7d-a6d2-1d19-296194cc4b14")
public static String es_PE_FIELD_ReportLine_PriceInvoiced_Description="El precio de la factura de cliente (Es basado en la lista de precios de cuentas por cobrar) - 0 precio por default";

@XendraTrl(Identifier="14bfdf9d-ba7d-a6d2-1d19-296194cc4b14")
public static String es_PE_FIELD_ReportLine_PriceInvoiced_Help="El precio facturado se deriva del precio de la factura incorporado y puede ser sobreescrito. Si el precio es 0, el precio por default en la factura de cliente se utiliza.";

@XendraField(AD_Column_ID="PriceInvoiced",IsCentrallyMaintained=true,
AD_Tab_ID="a55b6ca2-12a4-8350-eda7-21fedb393102",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="14bfdf9d-ba7d-a6d2-1d19-296194cc4b14")
public static final String FIELDNAME_ReportLine_PriceInvoiced="14bfdf9d-ba7d-a6d2-1d19-296194cc4b14";

@XendraTrl(Identifier="b2093863-48c7-4d9f-ff08-9499ea32f3ea")
public static String es_PE_FIELD_ReportLine_PriceInvoiced2_Name="Precio de Factura";

@XendraTrl(Identifier="b2093863-48c7-4d9f-ff08-9499ea32f3ea")
public static String es_PE_FIELD_ReportLine_PriceInvoiced2_Description="El precio de la factura de cliente (Es basado en la lista de precios de cuentas por cobrar) - 0 precio por default";

@XendraTrl(Identifier="b2093863-48c7-4d9f-ff08-9499ea32f3ea")
public static String es_PE_FIELD_ReportLine_PriceInvoiced2_Help="El precio facturado se deriva del precio de la factura incorporado y puede ser sobreescrito. Si el precio es 0, el precio por default en la factura de cliente se utiliza.";

@XendraField(AD_Column_ID="PriceInvoiced",IsCentrallyMaintained=true,
AD_Tab_ID="a445d1e6-d00f-41d7-db6d-29d792ace001",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=200,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b2093863-48c7-4d9f-ff08-9499ea32f3ea")
public static final String FIELDNAME_ReportLine_PriceInvoiced2="b2093863-48c7-4d9f-ff08-9499ea32f3ea";

@XendraTrl(Identifier="adb119a8-a9be-e82a-1b40-aeea02810fcf")
public static String es_PE_FIELD_ReportLine_PriceInvoiced3_Name="Precio de Factura";

@XendraTrl(Identifier="adb119a8-a9be-e82a-1b40-aeea02810fcf")
public static String es_PE_FIELD_ReportLine_PriceInvoiced3_Description="El precio de la factura de cliente (Es basado en la lista de precios de cuentas por cobrar) - 0 precio por default";

@XendraTrl(Identifier="adb119a8-a9be-e82a-1b40-aeea02810fcf")
public static String es_PE_FIELD_ReportLine_PriceInvoiced3_Help="El precio facturado se deriva del precio de la factura incorporado y puede ser sobreescrito. Si el precio es 0, el precio por default en la factura de cliente se utiliza.";

@XendraField(AD_Column_ID="PriceInvoiced",IsCentrallyMaintained=true,
AD_Tab_ID="6e8ab691-2e95-c842-15b3-8cc772502eda",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="adb119a8-a9be-e82a-1b40-aeea02810fcf")
public static final String FIELDNAME_ReportLine_PriceInvoiced3="adb119a8-a9be-e82a-1b40-aeea02810fcf";

@XendraTrl(Identifier="b17dd949-1abc-6eec-2542-16c67eb2309f")
public static String es_PE_COLUMN_PriceInvoiced_Name="Precio de Factura";

@XendraColumn(AD_Element_ID="55ed1c0b-31b2-288d-230e-28954d39c99f",ColumnName="PriceInvoiced",
AD_Reference_ID=37,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=true,ColumnSQL="",
IsAllowLogging=false,Identifier="b17dd949-1abc-6eec-2542-16c67eb2309f",
Synchronized="2019-08-30 22:24:18.0")
/** Column name PriceInvoiced */
public static final String COLUMNNAME_PriceInvoiced = "PriceInvoiced";
/** Set Price Reimbursed.
@param PriceReimbursed The reimbursed price (in currency of the employee's AP price list) */
public void setPriceReimbursed (BigDecimal PriceReimbursed)
{
set_Value (COLUMNNAME_PriceReimbursed, PriceReimbursed);
}
/** Get Price Reimbursed.
@return The reimbursed price (in currency of the employee's AP price list) */
public BigDecimal getPriceReimbursed() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_PriceReimbursed);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="10f04862-4f50-6785-34a9-52a88b751423")
public static String es_PE_FIELD_ReportLine_PriceReimbursed_Name="Precio Reembolsado";

@XendraTrl(Identifier="10f04862-4f50-6785-34a9-52a88b751423")
public static String es_PE_FIELD_ReportLine_PriceReimbursed_Description="El precio reembolsado (en la lista de precios a empleados actual)";

@XendraTrl(Identifier="10f04862-4f50-6785-34a9-52a88b751423")
public static String es_PE_FIELD_ReportLine_PriceReimbursed_Help="La lista de precios reembolsable es derivado de la conversión de precios y puede ser sobreescrita cuando sea aprovado el reporte de gastos.";

@XendraField(AD_Column_ID="PriceReimbursed",IsCentrallyMaintained=true,
AD_Tab_ID="a55b6ca2-12a4-8350-eda7-21fedb393102",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="Processed=Y",DisplayLength=26,IsReadOnly=true,SeqNo=260,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="10f04862-4f50-6785-34a9-52a88b751423")
public static final String FIELDNAME_ReportLine_PriceReimbursed="10f04862-4f50-6785-34a9-52a88b751423";

@XendraTrl(Identifier="7fb61761-23cf-b30b-0a2a-1523dd299fb5")
public static String es_PE_FIELD_ReportLine_PriceReimbursed2_Name="Precio Reembolsado";

@XendraTrl(Identifier="7fb61761-23cf-b30b-0a2a-1523dd299fb5")
public static String es_PE_FIELD_ReportLine_PriceReimbursed2_Description="El precio reembolsado (en la lista de precios a empleados actual)";

@XendraTrl(Identifier="7fb61761-23cf-b30b-0a2a-1523dd299fb5")
public static String es_PE_FIELD_ReportLine_PriceReimbursed2_Help="La lista de precios reembolsable es derivado de la conversión de precios y puede ser sobreescrita cuando sea aprovado el reporte de gastos.";

@XendraField(AD_Column_ID="PriceReimbursed",IsCentrallyMaintained=true,
AD_Tab_ID="a445d1e6-d00f-41d7-db6d-29d792ace001",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7fb61761-23cf-b30b-0a2a-1523dd299fb5")
public static final String FIELDNAME_ReportLine_PriceReimbursed2="7fb61761-23cf-b30b-0a2a-1523dd299fb5";

@XendraTrl(Identifier="18320a10-0cd5-fddd-2d3f-962fdc896e57")
public static String es_PE_FIELD_ReportLine_PriceReimbursed3_Name="Precio Reembolsado";

@XendraTrl(Identifier="18320a10-0cd5-fddd-2d3f-962fdc896e57")
public static String es_PE_FIELD_ReportLine_PriceReimbursed3_Description="El precio reembolsado (en la lista de precios a empleados actual)";

@XendraTrl(Identifier="18320a10-0cd5-fddd-2d3f-962fdc896e57")
public static String es_PE_FIELD_ReportLine_PriceReimbursed3_Help="La lista de precios reembolsable es derivado de la conversión de precios y puede ser sobreescrita cuando sea aprovado el reporte de gastos.";

@XendraField(AD_Column_ID="PriceReimbursed",IsCentrallyMaintained=true,
AD_Tab_ID="6e8ab691-2e95-c842-15b3-8cc772502eda",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=190,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="18320a10-0cd5-fddd-2d3f-962fdc896e57")
public static final String FIELDNAME_ReportLine_PriceReimbursed3="18320a10-0cd5-fddd-2d3f-962fdc896e57";

@XendraTrl(Identifier="e6462c46-8ec7-ea1f-5b2c-40f89f9c791e")
public static String es_PE_COLUMN_PriceReimbursed_Name="Precio Reembolsado";

@XendraColumn(AD_Element_ID="da86346b-40e3-77a8-6a5d-73210407d378",ColumnName="PriceReimbursed",
AD_Reference_ID=37,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=true,ColumnSQL="",
IsAllowLogging=false,Identifier="e6462c46-8ec7-ea1f-5b2c-40f89f9c791e",
Synchronized="2019-08-30 22:24:18.0")
/** Column name PriceReimbursed */
public static final String COLUMNNAME_PriceReimbursed = "PriceReimbursed";
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

@XendraTrl(Identifier="18dcc0be-9f75-0efe-3e0a-8a28d85b777b")
public static String es_PE_FIELD_ReportLine_Processed_Name="Procesado";

@XendraTrl(Identifier="18dcc0be-9f75-0efe-3e0a-8a28d85b777b")
public static String es_PE_FIELD_ReportLine_Processed_Description="El documento ha sido procesado";

@XendraTrl(Identifier="18dcc0be-9f75-0efe-3e0a-8a28d85b777b")
public static String es_PE_FIELD_ReportLine_Processed_Help="El cuadro de verificación procesada indica que un documento ha sido procesado";

@XendraField(AD_Column_ID="Processed",IsCentrallyMaintained=true,
AD_Tab_ID="a55b6ca2-12a4-8350-eda7-21fedb393102",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="1=2",DisplayLength=1,IsReadOnly=true,SeqNo=240,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="18dcc0be-9f75-0efe-3e0a-8a28d85b777b")
public static final String FIELDNAME_ReportLine_Processed="18dcc0be-9f75-0efe-3e0a-8a28d85b777b";

@XendraTrl(Identifier="8fb3e6f1-4d71-bb39-3205-c858d6dda7c8")
public static String es_PE_FIELD_ReportLine_Processed2_Name="Procesado";

@XendraTrl(Identifier="8fb3e6f1-4d71-bb39-3205-c858d6dda7c8")
public static String es_PE_FIELD_ReportLine_Processed2_Description="El documento ha sido procesado";

@XendraTrl(Identifier="8fb3e6f1-4d71-bb39-3205-c858d6dda7c8")
public static String es_PE_FIELD_ReportLine_Processed2_Help="El cuadro de verificación procesada indica que un documento ha sido procesado";

@XendraField(AD_Column_ID="Processed",IsCentrallyMaintained=true,
AD_Tab_ID="a445d1e6-d00f-41d7-db6d-29d792ace001",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=true,SeqNo=70,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8fb3e6f1-4d71-bb39-3205-c858d6dda7c8")
public static final String FIELDNAME_ReportLine_Processed2="8fb3e6f1-4d71-bb39-3205-c858d6dda7c8";

@XendraTrl(Identifier="7d621faf-3309-58e9-a074-940b965b912d")
public static String es_PE_FIELD_ReportLine_Processed3_Name="Procesado";

@XendraTrl(Identifier="7d621faf-3309-58e9-a074-940b965b912d")
public static String es_PE_FIELD_ReportLine_Processed3_Description="El documento ha sido procesado";

@XendraTrl(Identifier="7d621faf-3309-58e9-a074-940b965b912d")
public static String es_PE_FIELD_ReportLine_Processed3_Help="El cuadro de verificación procesada indica que un documento ha sido procesado";

@XendraField(AD_Column_ID="Processed",IsCentrallyMaintained=true,
AD_Tab_ID="6e8ab691-2e95-c842-15b3-8cc772502eda",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=true,SeqNo=70,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7d621faf-3309-58e9-a074-940b965b912d")
public static final String FIELDNAME_ReportLine_Processed3="7d621faf-3309-58e9-a074-940b965b912d";

@XendraTrl(Identifier="b3f07e64-2bcf-a61a-b3d9-975e18587cc0")
public static String es_PE_COLUMN_Processed_Name="Procesado";

@XendraColumn(AD_Element_ID="3f7035d2-fa5e-7416-fc0c-e49e43f9e083",ColumnName="Processed",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b3f07e64-2bcf-a61a-b3d9-975e18587cc0",
Synchronized="2019-08-30 22:24:18.0")
/** Column name Processed */
public static final String COLUMNNAME_Processed = "Processed";
/** Set Quantity.
@param Qty Quantity */
public void setQty (BigDecimal Qty)
{
set_Value (COLUMNNAME_Qty, Qty);
}
/** Get Quantity.
@return Quantity */
public BigDecimal getQty() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Qty);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="1c5b9874-3d6d-3fe4-ab19-5b7d55cf0cc7")
public static String es_PE_FIELD_ReportLine_Quantity_Name="Cantidad";

@XendraTrl(Identifier="1c5b9874-3d6d-3fe4-ab19-5b7d55cf0cc7")
public static String es_PE_FIELD_ReportLine_Quantity_Description="Cantidad";

@XendraTrl(Identifier="1c5b9874-3d6d-3fe4-ab19-5b7d55cf0cc7")
public static String es_PE_FIELD_ReportLine_Quantity_Help="La Cantidad indica el número de un producto específico o artículo para este documento";

@XendraField(AD_Column_ID="Qty",IsCentrallyMaintained=true,
AD_Tab_ID="a55b6ca2-12a4-8350-eda7-21fedb393102",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1c5b9874-3d6d-3fe4-ab19-5b7d55cf0cc7")
public static final String FIELDNAME_ReportLine_Quantity="1c5b9874-3d6d-3fe4-ab19-5b7d55cf0cc7";

@XendraTrl(Identifier="922d6449-486c-6b64-3e0c-bbd44413df51")
public static String es_PE_FIELD_ReportLine_Quantity2_Name="Cantidad";

@XendraTrl(Identifier="922d6449-486c-6b64-3e0c-bbd44413df51")
public static String es_PE_FIELD_ReportLine_Quantity2_Description="Cantidad";

@XendraTrl(Identifier="922d6449-486c-6b64-3e0c-bbd44413df51")
public static String es_PE_FIELD_ReportLine_Quantity2_Help="La Cantidad indica el número de un producto específico o artículo para este documento";

@XendraField(AD_Column_ID="Qty",IsCentrallyMaintained=true,
AD_Tab_ID="a445d1e6-d00f-41d7-db6d-29d792ace001",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=130,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="922d6449-486c-6b64-3e0c-bbd44413df51")
public static final String FIELDNAME_ReportLine_Quantity2="922d6449-486c-6b64-3e0c-bbd44413df51";

@XendraTrl(Identifier="0b04a430-5f67-8d05-21f0-fcbfa9ecfac0")
public static String es_PE_FIELD_ReportLine_Quantity3_Name="Cantidad";

@XendraTrl(Identifier="0b04a430-5f67-8d05-21f0-fcbfa9ecfac0")
public static String es_PE_FIELD_ReportLine_Quantity3_Description="Cantidad";

@XendraTrl(Identifier="0b04a430-5f67-8d05-21f0-fcbfa9ecfac0")
public static String es_PE_FIELD_ReportLine_Quantity3_Help="La Cantidad indica el número de un producto específico o artículo para este documento";

@XendraField(AD_Column_ID="Qty",IsCentrallyMaintained=true,
AD_Tab_ID="6e8ab691-2e95-c842-15b3-8cc772502eda",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=130,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0b04a430-5f67-8d05-21f0-fcbfa9ecfac0")
public static final String FIELDNAME_ReportLine_Quantity3="0b04a430-5f67-8d05-21f0-fcbfa9ecfac0";

@XendraTrl(Identifier="c4d8caa5-ff27-e70d-82da-626d1b5e6dc1")
public static String es_PE_COLUMN_Qty_Name="Cantidad";

@XendraColumn(AD_Element_ID="c9d74a25-87c5-9592-5660-4f397607dad3",ColumnName="Qty",
AD_Reference_ID=29,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="1",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,
ReadOnlyLogic="@S_ResourceAssignment_ID@!0",IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="",VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="c4d8caa5-ff27-e70d-82da-626d1b5e6dc1",Synchronized="2019-08-30 22:24:18.0")
/** Column name Qty */
public static final String COLUMNNAME_Qty = "Qty";
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

@XendraTrl(Identifier="209d8cd6-020c-464b-38f2-10062d6ba6d3")
public static String es_PE_FIELD_ReportLine_QuantityInvoiced_Name="Cantidad Facturada";

@XendraTrl(Identifier="209d8cd6-020c-464b-38f2-10062d6ba6d3")
public static String es_PE_FIELD_ReportLine_QuantityInvoiced_Description="Cantidad facturada";

@XendraTrl(Identifier="209d8cd6-020c-464b-38f2-10062d6ba6d3")
public static String es_PE_FIELD_ReportLine_QuantityInvoiced_Help="La cantidad facturada indica la cantidad de un producto que ha sido facturado";

@XendraField(AD_Column_ID="QtyInvoiced",IsCentrallyMaintained=true,
AD_Tab_ID="a55b6ca2-12a4-8350-eda7-21fedb393102",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="209d8cd6-020c-464b-38f2-10062d6ba6d3")
public static final String FIELDNAME_ReportLine_QuantityInvoiced="209d8cd6-020c-464b-38f2-10062d6ba6d3";

@XendraTrl(Identifier="4f620614-a914-865c-7e27-319ff41a9189")
public static String es_PE_FIELD_ReportLine_QuantityInvoiced2_Name="Cantidad Facturada";

@XendraTrl(Identifier="4f620614-a914-865c-7e27-319ff41a9189")
public static String es_PE_FIELD_ReportLine_QuantityInvoiced2_Description="Cantidad facturada";

@XendraTrl(Identifier="4f620614-a914-865c-7e27-319ff41a9189")
public static String es_PE_FIELD_ReportLine_QuantityInvoiced2_Help="La cantidad facturada indica la cantidad de un producto que ha sido facturado";

@XendraField(AD_Column_ID="QtyInvoiced",IsCentrallyMaintained=true,
AD_Tab_ID="a445d1e6-d00f-41d7-db6d-29d792ace001",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=150,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="4f620614-a914-865c-7e27-319ff41a9189")
public static final String FIELDNAME_ReportLine_QuantityInvoiced2="4f620614-a914-865c-7e27-319ff41a9189";

@XendraTrl(Identifier="fd4561aa-2484-bb1f-55e3-bc0113547146")
public static String es_PE_FIELD_ReportLine_QuantityInvoiced3_Name="Cantidad Facturada";

@XendraTrl(Identifier="fd4561aa-2484-bb1f-55e3-bc0113547146")
public static String es_PE_FIELD_ReportLine_QuantityInvoiced3_Description="Cantidad facturada";

@XendraTrl(Identifier="fd4561aa-2484-bb1f-55e3-bc0113547146")
public static String es_PE_FIELD_ReportLine_QuantityInvoiced3_Help="La cantidad facturada indica la cantidad de un producto que ha sido facturado";

@XendraField(AD_Column_ID="QtyInvoiced",IsCentrallyMaintained=true,
AD_Tab_ID="6e8ab691-2e95-c842-15b3-8cc772502eda",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="fd4561aa-2484-bb1f-55e3-bc0113547146")
public static final String FIELDNAME_ReportLine_QuantityInvoiced3="fd4561aa-2484-bb1f-55e3-bc0113547146";

@XendraTrl(Identifier="10e44971-643e-b568-8656-387d156c25b4")
public static String es_PE_COLUMN_QtyInvoiced_Name="Cantidad Facturada";

@XendraColumn(AD_Element_ID="406c1301-33f0-3d6a-3fbc-b0cf44ccc5b3",ColumnName="QtyInvoiced",
AD_Reference_ID=29,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=true,ColumnSQL="",
IsAllowLogging=false,Identifier="10e44971-643e-b568-8656-387d156c25b4",
Synchronized="2019-08-30 22:24:18.0")
/** Column name QtyInvoiced */
public static final String COLUMNNAME_QtyInvoiced = "QtyInvoiced";
/** Set Quantity Reimbursed.
@param QtyReimbursed The reimbursed quantity */
public void setQtyReimbursed (BigDecimal QtyReimbursed)
{
set_Value (COLUMNNAME_QtyReimbursed, QtyReimbursed);
}
/** Get Quantity Reimbursed.
@return The reimbursed quantity */
public BigDecimal getQtyReimbursed() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_QtyReimbursed);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="8e5bf2b5-2e36-7535-5a31-70b5420931b6")
public static String es_PE_FIELD_ReportLine_QuantityReimbursed_Name="Cantidad Reembolsada";

@XendraTrl(Identifier="8e5bf2b5-2e36-7535-5a31-70b5420931b6")
public static String es_PE_FIELD_ReportLine_QuantityReimbursed_Description="La Cantidad Reembolsada";

@XendraTrl(Identifier="8e5bf2b5-2e36-7535-5a31-70b5420931b6")
public static String es_PE_FIELD_ReportLine_QuantityReimbursed_Help="La cantidad reembolsada se deriva de la cantidad incorporada y puede ser sobreescrita al aprobar el informe del costo.";

@XendraField(AD_Column_ID="QtyReimbursed",IsCentrallyMaintained=true,
AD_Tab_ID="a55b6ca2-12a4-8350-eda7-21fedb393102",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="Processed=Y",DisplayLength=26,IsReadOnly=true,SeqNo=250,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8e5bf2b5-2e36-7535-5a31-70b5420931b6")
public static final String FIELDNAME_ReportLine_QuantityReimbursed="8e5bf2b5-2e36-7535-5a31-70b5420931b6";

@XendraTrl(Identifier="3681b60e-1e8c-d7e3-8956-a87ebe5d5122")
public static String es_PE_FIELD_ReportLine_QuantityReimbursed2_Name="Cantidad Reembolsada";

@XendraTrl(Identifier="3681b60e-1e8c-d7e3-8956-a87ebe5d5122")
public static String es_PE_FIELD_ReportLine_QuantityReimbursed2_Description="La Cantidad Reembolsada";

@XendraTrl(Identifier="3681b60e-1e8c-d7e3-8956-a87ebe5d5122")
public static String es_PE_FIELD_ReportLine_QuantityReimbursed2_Help="La cantidad reembolsada se deriva de la cantidad incorporada y puede ser sobreescrita al aprobar el informe del costo.";

@XendraField(AD_Column_ID="QtyReimbursed",IsCentrallyMaintained=true,
AD_Tab_ID="a445d1e6-d00f-41d7-db6d-29d792ace001",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3681b60e-1e8c-d7e3-8956-a87ebe5d5122")
public static final String FIELDNAME_ReportLine_QuantityReimbursed2="3681b60e-1e8c-d7e3-8956-a87ebe5d5122";

@XendraTrl(Identifier="1de35d54-2edc-b55d-ea35-34f87e28e358")
public static String es_PE_FIELD_ReportLine_QuantityReimbursed3_Name="Cantidad Reembolsada";

@XendraTrl(Identifier="1de35d54-2edc-b55d-ea35-34f87e28e358")
public static String es_PE_FIELD_ReportLine_QuantityReimbursed3_Description="La Cantidad Reembolsada";

@XendraTrl(Identifier="1de35d54-2edc-b55d-ea35-34f87e28e358")
public static String es_PE_FIELD_ReportLine_QuantityReimbursed3_Help="La cantidad reembolsada se deriva de la cantidad incorporada y puede ser sobreescrita al aprobar el informe del costo.";

@XendraField(AD_Column_ID="QtyReimbursed",IsCentrallyMaintained=true,
AD_Tab_ID="6e8ab691-2e95-c842-15b3-8cc772502eda",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=150,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1de35d54-2edc-b55d-ea35-34f87e28e358")
public static final String FIELDNAME_ReportLine_QuantityReimbursed3="1de35d54-2edc-b55d-ea35-34f87e28e358";

@XendraTrl(Identifier="0dbdc928-ddf3-b362-0cfe-6129b3fbe0e8")
public static String es_PE_COLUMN_QtyReimbursed_Name="Cantidad Reembolsada";

@XendraColumn(AD_Element_ID="35017a06-ccc8-d2e3-cb0f-fb3d2b17c06b",ColumnName="QtyReimbursed",
AD_Reference_ID=29,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=true,ColumnSQL="",
IsAllowLogging=false,Identifier="0dbdc928-ddf3-b362-0cfe-6129b3fbe0e8",
Synchronized="2019-08-30 22:24:18.0")
/** Column name QtyReimbursed */
public static final String COLUMNNAME_QtyReimbursed = "QtyReimbursed";
/** Set Resource Assignment.
@param S_ResourceAssignment_ID Resource Assignment */
public void setS_ResourceAssignment_ID (int S_ResourceAssignment_ID)
{
if (S_ResourceAssignment_ID <= 0) set_Value (COLUMNNAME_S_ResourceAssignment_ID, null);
 else 
set_Value (COLUMNNAME_S_ResourceAssignment_ID, Integer.valueOf(S_ResourceAssignment_ID));
}
/** Get Resource Assignment.
@return Resource Assignment */
public int getS_ResourceAssignment_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_S_ResourceAssignment_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="8c817f2f-1f61-6fd0-381f-d878e79bed59")
public static String es_PE_FIELD_ReportLine_ResourceAssignment_Name="Asignación de Recursos";

@XendraTrl(Identifier="8c817f2f-1f61-6fd0-381f-d878e79bed59")
public static String es_PE_FIELD_ReportLine_ResourceAssignment_Description="Asignación de Recursos";

@XendraField(AD_Column_ID="S_ResourceAssignment_ID",IsCentrallyMaintained=true,
AD_Tab_ID="a55b6ca2-12a4-8350-eda7-21fedb393102",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8c817f2f-1f61-6fd0-381f-d878e79bed59")
public static final String FIELDNAME_ReportLine_ResourceAssignment="8c817f2f-1f61-6fd0-381f-d878e79bed59";

@XendraTrl(Identifier="5c0ae28a-7f43-7848-b556-abdedf0f9727")
public static String es_PE_FIELD_ReportLine_ResourceAssignment2_Name="Asignación de Recursos";

@XendraTrl(Identifier="5c0ae28a-7f43-7848-b556-abdedf0f9727")
public static String es_PE_FIELD_ReportLine_ResourceAssignment2_Description="Asignación de Recursos";

@XendraField(AD_Column_ID="S_ResourceAssignment_ID",IsCentrallyMaintained=true,
AD_Tab_ID="a445d1e6-d00f-41d7-db6d-29d792ace001",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=120,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5c0ae28a-7f43-7848-b556-abdedf0f9727")
public static final String FIELDNAME_ReportLine_ResourceAssignment2="5c0ae28a-7f43-7848-b556-abdedf0f9727";

@XendraTrl(Identifier="5f9105bf-99c4-742c-18e0-3c1ea96b38e8")
public static String es_PE_FIELD_ReportLine_ResourceAssignment3_Name="Asignación de Recursos";

@XendraTrl(Identifier="5f9105bf-99c4-742c-18e0-3c1ea96b38e8")
public static String es_PE_FIELD_ReportLine_ResourceAssignment3_Description="Asignación de Recursos";

@XendraField(AD_Column_ID="S_ResourceAssignment_ID",IsCentrallyMaintained=true,
AD_Tab_ID="6e8ab691-2e95-c842-15b3-8cc772502eda",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=120,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5f9105bf-99c4-742c-18e0-3c1ea96b38e8")
public static final String FIELDNAME_ReportLine_ResourceAssignment3="5f9105bf-99c4-742c-18e0-3c1ea96b38e8";

@XendraTrl(Identifier="ea92ed42-907c-f819-dd70-416466c76690")
public static String es_PE_COLUMN_S_ResourceAssignment_ID_Name="Asignación de Recursos";

@XendraColumn(AD_Element_ID="5b04aabc-c98f-1f47-d00c-ef5ca7e86447",
ColumnName="S_ResourceAssignment_ID",AD_Reference_ID=33,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="org.compiere.model.CalloutAssignment.product",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ea92ed42-907c-f819-dd70-416466c76690",
Synchronized="2019-08-30 22:24:18.0")
/** Column name S_ResourceAssignment_ID */
public static final String COLUMNNAME_S_ResourceAssignment_ID = "S_ResourceAssignment_ID";
/** Set Expense Report.
@param S_TimeExpense_ID Time and Expense Report */
public void setS_TimeExpense_ID (int S_TimeExpense_ID)
{
if (S_TimeExpense_ID < 1) throw new IllegalArgumentException ("S_TimeExpense_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_S_TimeExpense_ID, Integer.valueOf(S_TimeExpense_ID));
}
/** Get Expense Report.
@return Time and Expense Report */
public int getS_TimeExpense_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_S_TimeExpense_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="9a81b266-37a5-867a-6a32-2cd9f80d2f06")
public static String es_PE_FIELD_ReportLine_ExpenseReport_Name="Informe de Gasto";

@XendraTrl(Identifier="9a81b266-37a5-867a-6a32-2cd9f80d2f06")
public static String es_PE_FIELD_ReportLine_ExpenseReport_Description="Informe de tiempo y gasto";

@XendraField(AD_Column_ID="S_TimeExpense_ID",IsCentrallyMaintained=true,
AD_Tab_ID="a55b6ca2-12a4-8350-eda7-21fedb393102",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9a81b266-37a5-867a-6a32-2cd9f80d2f06")
public static final String FIELDNAME_ReportLine_ExpenseReport="9a81b266-37a5-867a-6a32-2cd9f80d2f06";

@XendraTrl(Identifier="24353052-4e29-9335-6c03-49091a639f6e")
public static String es_PE_FIELD_ReportLine_ExpenseReport2_Name="Informe de Gasto";

@XendraTrl(Identifier="24353052-4e29-9335-6c03-49091a639f6e")
public static String es_PE_FIELD_ReportLine_ExpenseReport2_Description="Informe de tiempo y gasto";

@XendraField(AD_Column_ID="S_TimeExpense_ID",IsCentrallyMaintained=true,
AD_Tab_ID="a445d1e6-d00f-41d7-db6d-29d792ace001",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=40,SortNo=2,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="24353052-4e29-9335-6c03-49091a639f6e")
public static final String FIELDNAME_ReportLine_ExpenseReport2="24353052-4e29-9335-6c03-49091a639f6e";

@XendraTrl(Identifier="61eacce0-6861-874d-cbd8-356b7c8044d9")
public static String es_PE_FIELD_ReportLine_ExpenseReport3_Name="Informe de Gasto";

@XendraTrl(Identifier="61eacce0-6861-874d-cbd8-356b7c8044d9")
public static String es_PE_FIELD_ReportLine_ExpenseReport3_Description="Informe de tiempo y gasto";

@XendraField(AD_Column_ID="S_TimeExpense_ID",IsCentrallyMaintained=true,
AD_Tab_ID="6e8ab691-2e95-c842-15b3-8cc772502eda",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=40,SortNo=2,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="61eacce0-6861-874d-cbd8-356b7c8044d9")
public static final String FIELDNAME_ReportLine_ExpenseReport3="61eacce0-6861-874d-cbd8-356b7c8044d9";

@XendraTrl(Identifier="a18b068e-c47a-6864-0b83-4c5f4fb49949")
public static String es_PE_COLUMN_S_TimeExpense_ID_Name="Informe de Gasto";

@XendraColumn(AD_Element_ID="884c6414-54e4-4d47-7b8f-293a4fdb0806",ColumnName="S_TimeExpense_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a18b068e-c47a-6864-0b83-4c5f4fb49949",
Synchronized="2019-08-30 22:24:18.0")
/** Column name S_TimeExpense_ID */
public static final String COLUMNNAME_S_TimeExpense_ID = "S_TimeExpense_ID";
/** Set Expense Line.
@param S_TimeExpenseLine_ID Time and Expense Report Line */
public void setS_TimeExpenseLine_ID (int S_TimeExpenseLine_ID)
{
if (S_TimeExpenseLine_ID < 1) throw new IllegalArgumentException ("S_TimeExpenseLine_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_S_TimeExpenseLine_ID, Integer.valueOf(S_TimeExpenseLine_ID));
}
/** Get Expense Line.
@return Time and Expense Report Line */
public int getS_TimeExpenseLine_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_S_TimeExpenseLine_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="d193bb1b-a21d-a886-a023-0363c49321bb")
public static String es_PE_FIELD_ReportLine_ExpenseLine_Name="Item de Gasto";

@XendraTrl(Identifier="d193bb1b-a21d-a886-a023-0363c49321bb")
public static String es_PE_FIELD_ReportLine_ExpenseLine_Description="Item de informe de tiempo y gasto.";

@XendraField(AD_Column_ID="S_TimeExpenseLine_ID",IsCentrallyMaintained=true,
AD_Tab_ID="a55b6ca2-12a4-8350-eda7-21fedb393102",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d193bb1b-a21d-a886-a023-0363c49321bb")
public static final String FIELDNAME_ReportLine_ExpenseLine="d193bb1b-a21d-a886-a023-0363c49321bb";

@XendraTrl(Identifier="2efbf8c7-445c-1c4b-6db6-e32c0bbebe29")
public static String es_PE_FIELD_ReportLine_ExpenseLine2_Name="Item de Gasto";

@XendraTrl(Identifier="2efbf8c7-445c-1c4b-6db6-e32c0bbebe29")
public static String es_PE_FIELD_ReportLine_ExpenseLine2_Description="Item de informe de tiempo y gasto.";

@XendraField(AD_Column_ID="S_TimeExpenseLine_ID",IsCentrallyMaintained=true,
AD_Tab_ID="a445d1e6-d00f-41d7-db6d-29d792ace001",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2efbf8c7-445c-1c4b-6db6-e32c0bbebe29")
public static final String FIELDNAME_ReportLine_ExpenseLine2="2efbf8c7-445c-1c4b-6db6-e32c0bbebe29";

@XendraTrl(Identifier="f02f0e88-1dd5-2570-ff94-a799830035a2")
public static String es_PE_FIELD_ReportLine_ExpenseLine3_Name="Item de Gasto";

@XendraTrl(Identifier="f02f0e88-1dd5-2570-ff94-a799830035a2")
public static String es_PE_FIELD_ReportLine_ExpenseLine3_Description="Item de informe de tiempo y gasto.";

@XendraField(AD_Column_ID="S_TimeExpenseLine_ID",IsCentrallyMaintained=true,
AD_Tab_ID="6e8ab691-2e95-c842-15b3-8cc772502eda",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f02f0e88-1dd5-2570-ff94-a799830035a2")
public static final String FIELDNAME_ReportLine_ExpenseLine3="f02f0e88-1dd5-2570-ff94-a799830035a2";
/** Column name S_TimeExpenseLine_ID */
public static final String COLUMNNAME_S_TimeExpenseLine_ID = "S_TimeExpenseLine_ID";
/** Set Time Type.
@param S_TimeType_ID Type of time recorded */
public void setS_TimeType_ID (int S_TimeType_ID)
{
if (S_TimeType_ID <= 0) set_Value (COLUMNNAME_S_TimeType_ID, null);
 else 
set_Value (COLUMNNAME_S_TimeType_ID, Integer.valueOf(S_TimeType_ID));
}
/** Get Time Type.
@return Type of time recorded */
public int getS_TimeType_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_S_TimeType_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="129a1bce-2f9b-6613-cca6-ee41df93172d")
public static String es_PE_FIELD_ReportLine_TimeType_Name="Tipo de Tiempo";

@XendraTrl(Identifier="129a1bce-2f9b-6613-cca6-ee41df93172d")
public static String es_PE_FIELD_ReportLine_TimeType_Description="Registro del tipo de tiempo";

@XendraTrl(Identifier="129a1bce-2f9b-6613-cca6-ee41df93172d")
public static String es_PE_FIELD_ReportLine_TimeType_Help="Diferencia de tipos de tiempo para reportar propositos (en paralelo a las actividades)";

@XendraField(AD_Column_ID="S_TimeType_ID",IsCentrallyMaintained=true,
AD_Tab_ID="a55b6ca2-12a4-8350-eda7-21fedb393102",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="129a1bce-2f9b-6613-cca6-ee41df93172d")
public static final String FIELDNAME_ReportLine_TimeType="129a1bce-2f9b-6613-cca6-ee41df93172d";

@XendraTrl(Identifier="34961f32-e3d6-2255-aad9-2b9656ccde18")
public static String es_PE_FIELD_ReportLine_TimeType2_Name="Tipo de Tiempo";

@XendraTrl(Identifier="34961f32-e3d6-2255-aad9-2b9656ccde18")
public static String es_PE_FIELD_ReportLine_TimeType2_Description="Registro del tipo de tiempo";

@XendraTrl(Identifier="34961f32-e3d6-2255-aad9-2b9656ccde18")
public static String es_PE_FIELD_ReportLine_TimeType2_Help="Diferencia de tipos de tiempo para reportar propositos (en paralelo a las actividades)";

@XendraField(AD_Column_ID="S_TimeType_ID",IsCentrallyMaintained=true,
AD_Tab_ID="a445d1e6-d00f-41d7-db6d-29d792ace001",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=210,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="34961f32-e3d6-2255-aad9-2b9656ccde18")
public static final String FIELDNAME_ReportLine_TimeType2="34961f32-e3d6-2255-aad9-2b9656ccde18";

@XendraTrl(Identifier="27d2e863-a160-b035-1527-3ebc905d41f5")
public static String es_PE_FIELD_ReportLine_TimeType3_Name=" ";

@XendraField(AD_Column_ID="S_TimeType_ID",IsCentrallyMaintained=true,
AD_Tab_ID="6e8ab691-2e95-c842-15b3-8cc772502eda",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=200,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="27d2e863-a160-b035-1527-3ebc905d41f5")
public static final String FIELDNAME_ReportLine_TimeType3="27d2e863-a160-b035-1527-3ebc905d41f5";

@XendraTrl(Identifier="2c61b63e-4fea-e07b-37a4-457a7db0d0ea")
public static String es_PE_COLUMN_S_TimeType_ID_Name="Tipo de Tiempo";

@XendraColumn(AD_Element_ID="44764484-de61-d8eb-b7c6-456966f2ccad",ColumnName="S_TimeType_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2c61b63e-4fea-e07b-37a4-457a7db0d0ea",
Synchronized="2019-08-30 22:24:18.0")
/** Column name S_TimeType_ID */
public static final String COLUMNNAME_S_TimeType_ID = "S_TimeType_ID";
}
