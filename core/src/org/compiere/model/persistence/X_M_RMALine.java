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
/** Generated Model for M_RMALine
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_M_RMALine extends PO
{
/** Standard Constructor
@param ctx context
@param M_RMALine_ID id
@param trxName transaction
*/
public X_M_RMALine (Properties ctx, int M_RMALine_ID, String trxName)
{
super (ctx, M_RMALine_ID, trxName);
/** if (M_RMALine_ID == 0)
{
setLine (0);
setM_InOutLine_ID (0);
setM_RMA_ID (0);
setM_RMALine_ID (0);
setProcessed (false);	
// N
setQty (Env.ZERO);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_M_RMALine (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=660 */
public static int Table_ID=MTable.getTable_ID("M_RMALine");

@XendraTrl(Identifier="bdc504f6-0a25-e735-1969-ccb843c1c5b8")
public static String es_PE_TAB_RMALine_Description="Ìtem de ADM (RMA)";

@XendraTrl(Identifier="bdc504f6-0a25-e735-1969-ccb843c1c5b8")
public static String es_PE_TAB_RMALine_Help="Información del detalle sobre las mercancías vueltas.";

@XendraTrl(Identifier="bdc504f6-0a25-e735-1969-ccb843c1c5b8")
public static String es_PE_TAB_RMALine_Name="Ítem de Devolución de Material";

@XendraTab(Name="RMA Line",Description="Return Material Authorization Line",
Help="Detail information about the returned goods",
AD_Window_ID="f9fb62fb-17c7-fd5a-e51e-c90c208c467b",SeqNo=20,TabLevel=1,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="bdc504f6-0a25-e735-1969-ccb843c1c5b8",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_RMALine="bdc504f6-0a25-e735-1969-ccb843c1c5b8";

@XendraTrl(Identifier="095c657b-44a3-285e-6fd1-20f8a2f22e9a")
public static String es_PE_TABLE_M_RMALine_Name="Línea ADM (RMA)";

@XendraTable(Name="RMA Line",AD_Package_ID="2809ac2d-7d43-20f8-05f0-a478f2e50204",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",
Description="Return Material Authorization Line",Help="",TableName="M_RMALine",AccessLevel="1",
AD_Window_ID="f9fb62fb-17c7-fd5a-e51e-c90c208c467b",AD_Val_Rule_ID="",IsKey=1,LoadSeq=145,
IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,IsView=false,
PO_Window_ID="",ID="org.xendra.material",Identifier="095c657b-44a3-285e-6fd1-20f8a2f22e9a",
Synchronized="2020-03-03 21:38:56.0")
/** TableName=M_RMALine */
public static final String Table_Name="M_RMALine";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"M_RMALine");

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
    Table_ID = MTable.getTable_ID("M_RMALine");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_M_RMALine[").append(get_ID()).append("]");
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

@XendraTrl(Identifier="5ced48c7-2e2c-8d5f-7304-9c3436d14ace")
public static String es_PE_FIELD_RMALine_TrxOrganization_Name="Organización de la Trans.";

@XendraTrl(Identifier="5ced48c7-2e2c-8d5f-7304-9c3436d14ace")
public static String es_PE_FIELD_RMALine_TrxOrganization_Description="Organización que inicia ó ejecuta la transacción";

@XendraTrl(Identifier="5ced48c7-2e2c-8d5f-7304-9c3436d14ace")
public static String es_PE_FIELD_RMALine_TrxOrganization_Help="La organización que inicia ó ejecuta la transacción (para otra organización). La organización poseedora puede no ser la organización de la transacción en un ambiente de buró de servicio; con servicios centralizados y transacciones inter- organización.";

@XendraField(AD_Column_ID="AD_OrgTrx_ID",IsCentrallyMaintained=true,
AD_Tab_ID="bdc504f6-0a25-e735-1969-ccb843c1c5b8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5ced48c7-2e2c-8d5f-7304-9c3436d14ace")
public static final String FIELDNAME_RMALine_TrxOrganization="5ced48c7-2e2c-8d5f-7304-9c3436d14ace";

@XendraTrl(Identifier="fe0de9d7-9b49-4ecb-66ed-04a13414db1c")
public static String es_PE_COLUMN_AD_OrgTrx_ID_Name="Organización de la Trans.";

@XendraColumn(AD_Element_ID="b4180358-67aa-fe55-0409-6367a60e0a2e",ColumnName="AD_OrgTrx_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="fe0de9d7-9b49-4ecb-66ed-04a13414db1c",
Synchronized="2019-08-30 22:23:31.0")
/** Column name AD_OrgTrx_ID */
public static final String COLUMNNAME_AD_OrgTrx_ID = "AD_OrgTrx_ID";
/** Set Amount.
@param Amt Amount */
public void setAmt (BigDecimal Amt)
{
set_Value (COLUMNNAME_Amt, Amt);
}
/** Get Amount.
@return Amount */
public BigDecimal getAmt() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Amt);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="2a9a9d51-48da-1f99-4a07-04eb419943ec")
public static String es_PE_FIELD_RMALine_Amount_Name="Total";

@XendraTrl(Identifier="2a9a9d51-48da-1f99-4a07-04eb419943ec")
public static String es_PE_FIELD_RMALine_Amount_Description="Total límite para el envío de facturas";

@XendraTrl(Identifier="2a9a9d51-48da-1f99-4a07-04eb419943ec")
public static String es_PE_FIELD_RMALine_Amount_Help="El campo total indica el límite en el que las facturas no serán generadas. Si el total total de la factura esta por debajo de este total; la factura  no será enviada en esta corrida programada. Este campo es solamente desplegado si el cuadro de verificación de total límite es seleccionado";

@XendraField(AD_Column_ID="Amt",IsCentrallyMaintained=true,
AD_Tab_ID="bdc504f6-0a25-e735-1969-ccb843c1c5b8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=150,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2a9a9d51-48da-1f99-4a07-04eb419943ec")
public static final String FIELDNAME_RMALine_Amount="2a9a9d51-48da-1f99-4a07-04eb419943ec";

@XendraTrl(Identifier="04e17ad0-d319-b693-6092-780935d74ef9")
public static String es_PE_COLUMN_Amt_Name="Total";

@XendraColumn(AD_Element_ID="42827f15-aceb-2f14-cc38-b4a7c6022136",ColumnName="Amt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=131089,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="04e17ad0-d319-b693-6092-780935d74ef9",
Synchronized="2019-08-30 22:23:31.0")
/** Column name Amt */
public static final String COLUMNNAME_Amt = "Amt";
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

@XendraTrl(Identifier="5e064635-78f4-b9fa-3c76-462528e1f6de")
public static String es_PE_FIELD_RMALine_Activity_Name="Tipo de Gasto";

@XendraTrl(Identifier="5e064635-78f4-b9fa-3c76-462528e1f6de")
public static String es_PE_FIELD_RMALine_Activity_Description="Actividad de Negocio";

@XendraTrl(Identifier="5e064635-78f4-b9fa-3c76-462528e1f6de")
public static String es_PE_FIELD_RMALine_Activity_Help="Las actividades indican tareas que son ejecutadas en el curso de un negocio; las actividades son usadas para el costeo por actividad (ABC)";

@XendraField(AD_Column_ID="C_Activity_ID",IsCentrallyMaintained=true,
AD_Tab_ID="bdc504f6-0a25-e735-1969-ccb843c1c5b8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5e064635-78f4-b9fa-3c76-462528e1f6de")
public static final String FIELDNAME_RMALine_Activity="5e064635-78f4-b9fa-3c76-462528e1f6de";

@XendraTrl(Identifier="e1f20cf6-6fd9-0ba8-8a53-722b9e4e3681")
public static String es_PE_COLUMN_C_Activity_ID_Name="Tipo de Gasto";

@XendraColumn(AD_Element_ID="bfeadbb3-d866-26e3-8eee-3e2fdf0ff753",ColumnName="C_Activity_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e1f20cf6-6fd9-0ba8-8a53-722b9e4e3681",
Synchronized="2019-08-30 22:23:31.0")
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

@XendraTrl(Identifier="39af6599-d6c0-bc56-dd8d-5d4c625a65b9")
public static String es_PE_FIELD_RMALine_Campaign_Name="Campaña";

@XendraTrl(Identifier="39af6599-d6c0-bc56-dd8d-5d4c625a65b9")
public static String es_PE_FIELD_RMALine_Campaign_Description="Campaña de Mercadeo";

@XendraTrl(Identifier="39af6599-d6c0-bc56-dd8d-5d4c625a65b9")
public static String es_PE_FIELD_RMALine_Campaign_Help="La Campaña define un programa de mercadotecnia único. Los proyectos pueden estar asociados con una campaña de mercadotecnia única. Usted puede entonces reportar basado en una campaña específica";

@XendraField(AD_Column_ID="C_Campaign_ID",IsCentrallyMaintained=true,
AD_Tab_ID="bdc504f6-0a25-e735-1969-ccb843c1c5b8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="39af6599-d6c0-bc56-dd8d-5d4c625a65b9")
public static final String FIELDNAME_RMALine_Campaign="39af6599-d6c0-bc56-dd8d-5d4c625a65b9";

@XendraTrl(Identifier="f0d0d29d-57aa-f30c-1f92-f8318fefdbe5")
public static String es_PE_COLUMN_C_Campaign_ID_Name="Campaña";

@XendraColumn(AD_Element_ID="6cf08e31-d355-ee38-9c0b-bee20b3ea5b6",ColumnName="C_Campaign_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f0d0d29d-57aa-f30c-1f92-f8318fefdbe5",
Synchronized="2019-08-30 22:23:31.0")
/** Column name C_Campaign_ID */
public static final String COLUMNNAME_C_Campaign_ID = "C_Campaign_ID";
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

@XendraTrl(Identifier="3be948fc-0af5-7d86-8a1e-369d80db32ed")
public static String es_PE_FIELD_RMALine_Charge_Name="Cargo";

@XendraTrl(Identifier="3be948fc-0af5-7d86-8a1e-369d80db32ed")
public static String es_PE_FIELD_RMALine_Charge_Description="Cargos adicionales del documento";

@XendraTrl(Identifier="3be948fc-0af5-7d86-8a1e-369d80db32ed")
public static String es_PE_FIELD_RMALine_Charge_Help="El cargo indica un tipo de cargo (manejo; despacho; reposición)";

@XendraField(AD_Column_ID="C_Charge_ID",IsCentrallyMaintained=true,
AD_Tab_ID="bdc504f6-0a25-e735-1969-ccb843c1c5b8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=120,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3be948fc-0af5-7d86-8a1e-369d80db32ed")
public static final String FIELDNAME_RMALine_Charge="3be948fc-0af5-7d86-8a1e-369d80db32ed";

@XendraTrl(Identifier="3fd6dd6a-cbdf-7645-67c0-33f250eda061")
public static String es_PE_COLUMN_C_Charge_ID_Name="Cargo";

@XendraColumn(AD_Element_ID="d7e2fc48-a26e-4ded-ea44-fe15849a7883",ColumnName="C_Charge_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3fd6dd6a-cbdf-7645-67c0-33f250eda061",
Synchronized="2019-08-30 22:23:31.0")
/** Column name C_Charge_ID */
public static final String COLUMNNAME_C_Charge_ID = "C_Charge_ID";
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

@XendraTrl(Identifier="8bd3d309-5994-a575-7a16-24b0eb8a6007")
public static String es_PE_FIELD_RMALine_Project_Name="Proyecto";

@XendraTrl(Identifier="8bd3d309-5994-a575-7a16-24b0eb8a6007")
public static String es_PE_FIELD_RMALine_Project_Description="Identifica un proyecto único";

@XendraTrl(Identifier="8bd3d309-5994-a575-7a16-24b0eb8a6007")
public static String es_PE_FIELD_RMALine_Project_Help="La ID de un proyecto es un identificador definido por el usuario para un proyecto";

@XendraField(AD_Column_ID="C_Project_ID",IsCentrallyMaintained=true,
AD_Tab_ID="bdc504f6-0a25-e735-1969-ccb843c1c5b8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8bd3d309-5994-a575-7a16-24b0eb8a6007")
public static final String FIELDNAME_RMALine_Project="8bd3d309-5994-a575-7a16-24b0eb8a6007";

@XendraTrl(Identifier="854af4c5-362f-eac0-6dee-b599ce91a758")
public static String es_PE_COLUMN_C_Project_ID_Name="Proyecto";

@XendraColumn(AD_Element_ID="16ff5dcc-9178-73dd-e618-e88bd79d573b",ColumnName="C_Project_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="854af4c5-362f-eac0-6dee-b599ce91a758",
Synchronized="2019-08-30 22:23:31.0")
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

@XendraTrl(Identifier="c57db8be-a1ca-0c5f-8e36-a6076f2435a6")
public static String es_PE_FIELD_RMALine_ProjectPhase_Name="Fase del Proyecto";

@XendraTrl(Identifier="c57db8be-a1ca-0c5f-8e36-a6076f2435a6")
public static String es_PE_FIELD_RMALine_ProjectPhase_Description="Fase del Proyecto";

@XendraField(AD_Column_ID="C_ProjectPhase_ID",IsCentrallyMaintained=true,
AD_Tab_ID="bdc504f6-0a25-e735-1969-ccb843c1c5b8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c57db8be-a1ca-0c5f-8e36-a6076f2435a6")
public static final String FIELDNAME_RMALine_ProjectPhase="c57db8be-a1ca-0c5f-8e36-a6076f2435a6";

@XendraTrl(Identifier="6ac2f5fa-a90b-b148-66df-304085861c49")
public static String es_PE_COLUMN_C_ProjectPhase_ID_Name="Fase del Proyecto";

@XendraColumn(AD_Element_ID="ba6e5aab-8337-208a-03da-5712e50d4da9",ColumnName="C_ProjectPhase_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6ac2f5fa-a90b-b148-66df-304085861c49",
Synchronized="2019-08-30 22:23:31.0")
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

@XendraTrl(Identifier="549cf26d-c268-192e-a2a3-d407cbd65abb")
public static String es_PE_FIELD_RMALine_ProjectTask_Name="Tarea del Proyecto";

@XendraTrl(Identifier="549cf26d-c268-192e-a2a3-d407cbd65abb")
public static String es_PE_FIELD_RMALine_ProjectTask_Description="Actual tarea en la fase del proyecto.";

@XendraTrl(Identifier="549cf26d-c268-192e-a2a3-d407cbd65abb")
public static String es_PE_FIELD_RMALine_ProjectTask_Help="Una tarea de proyecto en una fase de proyecto representa el trabajo real.";

@XendraField(AD_Column_ID="C_ProjectTask_ID",IsCentrallyMaintained=true,
AD_Tab_ID="bdc504f6-0a25-e735-1969-ccb843c1c5b8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="549cf26d-c268-192e-a2a3-d407cbd65abb")
public static final String FIELDNAME_RMALine_ProjectTask="549cf26d-c268-192e-a2a3-d407cbd65abb";

@XendraTrl(Identifier="b7177ba0-d1ad-52bd-fba1-5cae03917623")
public static String es_PE_COLUMN_C_ProjectTask_ID_Name="Tarea del Proyecto";

@XendraColumn(AD_Element_ID="1b2d7a20-215c-4f56-6077-83adcead0920",ColumnName="C_ProjectTask_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b7177ba0-d1ad-52bd-fba1-5cae03917623",
Synchronized="2019-08-30 22:23:31.0")
/** Column name C_ProjectTask_ID */
public static final String COLUMNNAME_C_ProjectTask_ID = "C_ProjectTask_ID";
/** Set Tax.
@param C_Tax_ID Tax identifier */
public void setC_Tax_ID (int C_Tax_ID)
{
if (C_Tax_ID <= 0) set_Value (COLUMNNAME_C_Tax_ID, null);
 else 
set_Value (COLUMNNAME_C_Tax_ID, Integer.valueOf(C_Tax_ID));
}
/** Get Tax.
@return Tax identifier */
public int getC_Tax_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Tax_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="ad2b6cf2-6d5b-2473-dffe-e9a7ceb30228")
public static String es_PE_FIELD_RMALine_Tax_Name="Impuesto";

@XendraTrl(Identifier="ad2b6cf2-6d5b-2473-dffe-e9a7ceb30228")
public static String es_PE_FIELD_RMALine_Tax_Description="Identificador del Impuesto";

@XendraTrl(Identifier="ad2b6cf2-6d5b-2473-dffe-e9a7ceb30228")
public static String es_PE_FIELD_RMALine_Tax_Help="El Impuesto indica el tipo de impuesto para esta línea del documento";

@XendraField(AD_Column_ID="C_Tax_ID",IsCentrallyMaintained=true,
AD_Tab_ID="bdc504f6-0a25-e735-1969-ccb843c1c5b8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ad2b6cf2-6d5b-2473-dffe-e9a7ceb30228")
public static final String FIELDNAME_RMALine_Tax="ad2b6cf2-6d5b-2473-dffe-e9a7ceb30228";

@XendraTrl(Identifier="f3f0d025-d0b9-099d-4c82-417f0a454c99")
public static String es_PE_COLUMN_C_Tax_ID_Name="Impuesto";

@XendraColumn(AD_Element_ID="38ff24fc-b68c-51a9-60f8-ef2a1f060de2",ColumnName="C_Tax_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f3f0d025-d0b9-099d-4c82-417f0a454c99",
Synchronized="2019-08-30 22:23:31.0")
/** Column name C_Tax_ID */
public static final String COLUMNNAME_C_Tax_ID = "C_Tax_ID";
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

@XendraTrl(Identifier="4ef12979-a1cb-b413-99bd-73d2ff97d805")
public static String es_PE_FIELD_RMALine_UOM_Name="UM";

@XendraTrl(Identifier="4ef12979-a1cb-b413-99bd-73d2ff97d805")
public static String es_PE_FIELD_RMALine_UOM_Description="Unidad de Medida";

@XendraTrl(Identifier="4ef12979-a1cb-b413-99bd-73d2ff97d805")
public static String es_PE_FIELD_RMALine_UOM_Help="La UM define una unidad de medida única no monetaria";

@XendraField(AD_Column_ID="C_UOM_ID",IsCentrallyMaintained=true,
AD_Tab_ID="bdc504f6-0a25-e735-1969-ccb843c1c5b8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="4ef12979-a1cb-b413-99bd-73d2ff97d805")
public static final String FIELDNAME_RMALine_UOM="4ef12979-a1cb-b413-99bd-73d2ff97d805";

@XendraTrl(Identifier="890f17ea-b4c3-4ff8-2e21-89f8417c7723")
public static String es_PE_COLUMN_C_UOM_ID_Name="UM";

@XendraColumn(AD_Element_ID="d0345019-4fcc-44c8-4fd1-e38e3b4adeed",ColumnName="C_UOM_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="890f17ea-b4c3-4ff8-2e21-89f8417c7723",
Synchronized="2019-08-30 22:23:31.0")
/** Column name C_UOM_ID */
public static final String COLUMNNAME_C_UOM_ID = "C_UOM_ID";
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

@XendraTrl(Identifier="d2bc3d07-32c4-8a17-6069-fd53bbfc02e3")
public static String es_PE_FIELD_RMALine_Description_Name="Observación";

@XendraTrl(Identifier="d2bc3d07-32c4-8a17-6069-fd53bbfc02e3")
public static String es_PE_FIELD_RMALine_Description_Description="Observación corta opcional del registro";

@XendraTrl(Identifier="d2bc3d07-32c4-8a17-6069-fd53bbfc02e3")
public static String es_PE_FIELD_RMALine_Description_Help="Una Observación esta limitada a 255 caracteres";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="bdc504f6-0a25-e735-1969-ccb843c1c5b8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d2bc3d07-32c4-8a17-6069-fd53bbfc02e3")
public static final String FIELDNAME_RMALine_Description="d2bc3d07-32c4-8a17-6069-fd53bbfc02e3";

@XendraTrl(Identifier="f94ca096-d849-f15e-b0df-fe84e311daea")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=true,ColumnSQL="",
IsAllowLogging=false,Identifier="f94ca096-d849-f15e-b0df-fe84e311daea",
Synchronized="2019-08-30 22:23:31.0")
/** Column name Description */
public static final String COLUMNNAME_Description = "Description";
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
@XendraTrl(Identifier="d6d4c9f6-1d8f-412c-b3f6-d30d1993a694")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d6d4c9f6-1d8f-412c-b3f6-d30d1993a694",
Synchronized="2019-08-30 22:23:31.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
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

@XendraTrl(Identifier="75387d7c-e9a8-0782-5ba6-7eb5822ce619")
public static String es_PE_FIELD_RMALine_LineNo_Name="No. Línea";

@XendraTrl(Identifier="75387d7c-e9a8-0782-5ba6-7eb5822ce619")
public static String es_PE_FIELD_RMALine_LineNo_Description="No. Línea único para este documento";

@XendraTrl(Identifier="75387d7c-e9a8-0782-5ba6-7eb5822ce619")
public static String es_PE_FIELD_RMALine_LineNo_Help="Indica el No. Línea para un documento. También controlará el orden de despliegue de las líneas dentro de un documento";

@XendraField(AD_Column_ID="Line",IsCentrallyMaintained=true,
AD_Tab_ID="bdc504f6-0a25-e735-1969-ccb843c1c5b8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="75387d7c-e9a8-0782-5ba6-7eb5822ce619")
public static final String FIELDNAME_RMALine_LineNo="75387d7c-e9a8-0782-5ba6-7eb5822ce619";

@XendraTrl(Identifier="17f92769-1781-860c-6949-bc628b0e387c")
public static String es_PE_COLUMN_Line_Name="No. Línea";

@XendraColumn(AD_Element_ID="986ef077-61da-f9cf-1c6d-aefe3a35113b",ColumnName="Line",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="17f92769-1781-860c-6949-bc628b0e387c",
Synchronized="2019-08-30 22:23:31.0")
/** Column name Line */
public static final String COLUMNNAME_Line = "Line";
/** Set Line Amount.
@param LineNetAmt Line Extended Amount (Quantity * Actual Price) without Freight and Charges */
public void setLineNetAmt (BigDecimal LineNetAmt)
{
set_Value (COLUMNNAME_LineNetAmt, LineNetAmt);
}
/** Get Line Amount.
@return Line Extended Amount (Quantity * Actual Price) without Freight and Charges */
public BigDecimal getLineNetAmt() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_LineNetAmt);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="d320a59b-9cd0-72ed-a5d6-d374312c78b9")
public static String es_PE_FIELD_RMALine_LineAmount_Name="Neto de Línea";

@XendraTrl(Identifier="d320a59b-9cd0-72ed-a5d6-d374312c78b9")
public static String es_PE_FIELD_RMALine_LineAmount_Description="Total neto de la línea (Cantidad * Precio Actual) sin fletes ni cargos";

@XendraTrl(Identifier="d320a59b-9cd0-72ed-a5d6-d374312c78b9")
public static String es_PE_FIELD_RMALine_LineAmount_Help="Indica el total neto de la línea basado en la cantidad y el precio actual. Cualquier cargo adicional ó flete no es incluido.";

@XendraField(AD_Column_ID="LineNetAmt",IsCentrallyMaintained=true,
AD_Tab_ID="bdc504f6-0a25-e735-1969-ccb843c1c5b8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=130,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d320a59b-9cd0-72ed-a5d6-d374312c78b9")
public static final String FIELDNAME_RMALine_LineAmount="d320a59b-9cd0-72ed-a5d6-d374312c78b9";

@XendraTrl(Identifier="bff0a21b-e5d2-4890-0710-a64166ad5271")
public static String es_PE_COLUMN_LineNetAmt_Name="Neto de Línea";

@XendraColumn(AD_Element_ID="ba57a535-4ae3-c6eb-74ec-3dcb0973d6f6",ColumnName="LineNetAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=131089,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="bff0a21b-e5d2-4890-0710-a64166ad5271",
Synchronized="2019-08-30 22:23:31.0")
/** Column name LineNetAmt */
public static final String COLUMNNAME_LineNetAmt = "LineNetAmt";
/** Set Attribute Set Instance.
@param M_AttributeSetInstance_ID Product Attribute Set Instance */
public void setM_AttributeSetInstance_ID (int M_AttributeSetInstance_ID)
{
if (M_AttributeSetInstance_ID <= 0) set_Value (COLUMNNAME_M_AttributeSetInstance_ID, null);
 else 
set_Value (COLUMNNAME_M_AttributeSetInstance_ID, Integer.valueOf(M_AttributeSetInstance_ID));
}
/** Get Attribute Set Instance.
@return Product Attribute Set Instance */
public int getM_AttributeSetInstance_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_AttributeSetInstance_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="026dcfaa-42eb-092f-a2a6-39d6443641ef")
public static String es_PE_FIELD_RMALine_AttributeSetInstance_Name="Instancia del Conjunto de Atributos";

@XendraTrl(Identifier="026dcfaa-42eb-092f-a2a6-39d6443641ef")
public static String es_PE_FIELD_RMALine_AttributeSetInstance_Description="Instancia del conjunto de atributos del producto";

@XendraTrl(Identifier="026dcfaa-42eb-092f-a2a6-39d6443641ef")
public static String es_PE_FIELD_RMALine_AttributeSetInstance_Help="Valor actual de Instancia del conjunto de atributos del producto";

@XendraField(AD_Column_ID="M_AttributeSetInstance_ID",IsCentrallyMaintained=true,
AD_Tab_ID="bdc504f6-0a25-e735-1969-ccb843c1c5b8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="026dcfaa-42eb-092f-a2a6-39d6443641ef")
public static final String FIELDNAME_RMALine_AttributeSetInstance="026dcfaa-42eb-092f-a2a6-39d6443641ef";

@XendraTrl(Identifier="fd63aa6f-02c2-5f72-847d-12fce79e9bfe")
public static String es_PE_COLUMN_M_AttributeSetInstance_ID_Name="Instancia del Conjunto de Atributos";

@XendraColumn(AD_Element_ID="137807f2-3c52-e193-3ceb-f10b819cf955",
ColumnName="M_AttributeSetInstance_ID",AD_Reference_ID=35,AD_Reference_Value_ID="",
AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,
IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="",VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="fd63aa6f-02c2-5f72-847d-12fce79e9bfe",Synchronized="2019-08-30 22:23:31.0")
/** Column name M_AttributeSetInstance_ID */
public static final String COLUMNNAME_M_AttributeSetInstance_ID = "M_AttributeSetInstance_ID";
/** Set Shipment/Receipt Line.
@param M_InOutLine_ID Line on Shipment or Receipt document */
public void setM_InOutLine_ID (int M_InOutLine_ID)
{
if (M_InOutLine_ID < 1) throw new IllegalArgumentException ("M_InOutLine_ID is mandatory.");
set_Value (COLUMNNAME_M_InOutLine_ID, Integer.valueOf(M_InOutLine_ID));
}
/** Get Shipment/Receipt Line.
@return Line on Shipment or Receipt document */
public int getM_InOutLine_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_InOutLine_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="e9e5fb62-9e34-6450-0cf8-f6a63218685a")
public static String es_PE_FIELD_RMALine_ShipmentReceiptLine_Name="Item Entrega / Recibo";

@XendraTrl(Identifier="e9e5fb62-9e34-6450-0cf8-f6a63218685a")
public static String es_PE_FIELD_RMALine_ShipmentReceiptLine_Description="Item de entrega ó documento de recibo.";

@XendraTrl(Identifier="e9e5fb62-9e34-6450-0cf8-f6a63218685a")
public static String es_PE_FIELD_RMALine_ShipmentReceiptLine_Help="Indica un Item único en un documento de entrega / recibo";

@XendraField(AD_Column_ID="M_InOutLine_ID",IsCentrallyMaintained=true,
AD_Tab_ID="bdc504f6-0a25-e735-1969-ccb843c1c5b8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=50,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e9e5fb62-9e34-6450-0cf8-f6a63218685a")
public static final String FIELDNAME_RMALine_ShipmentReceiptLine="e9e5fb62-9e34-6450-0cf8-f6a63218685a";

@XendraTrl(Identifier="3d4ba89c-2b9e-1656-be53-f5641fdb719b")
public static String es_PE_COLUMN_M_InOutLine_ID_Name="Línea Entrega / Recibo";

@XendraColumn(AD_Element_ID="a4d9928e-fbec-fd6c-b061-d3dbbd7de02c",ColumnName="M_InOutLine_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="adb6a9a7-f36f-cf40-6dfe-c2c0b1249f3b",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=true,SeqNo=2,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="3d4ba89c-2b9e-1656-be53-f5641fdb719b",Synchronized="2019-08-30 22:23:31.0")
/** Column name M_InOutLine_ID */
public static final String COLUMNNAME_M_InOutLine_ID = "M_InOutLine_ID";
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

@XendraTrl(Identifier="f71932a5-b176-e93a-cf2a-01d269b077a3")
public static String es_PE_FIELD_RMALine_Product_Name="Producto";

@XendraTrl(Identifier="f71932a5-b176-e93a-cf2a-01d269b077a3")
public static String es_PE_FIELD_RMALine_Product_Description="Producto; servicio ó artículo.";

@XendraTrl(Identifier="f71932a5-b176-e93a-cf2a-01d269b077a3")
public static String es_PE_FIELD_RMALine_Product_Help="Identifica un artículo que puede ser comprado ó vendido es esta organización.";

@XendraField(AD_Column_ID="M_Product_ID",IsCentrallyMaintained=true,
AD_Tab_ID="bdc504f6-0a25-e735-1969-ccb843c1c5b8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f71932a5-b176-e93a-cf2a-01d269b077a3")
public static final String FIELDNAME_RMALine_Product="f71932a5-b176-e93a-cf2a-01d269b077a3";

@XendraTrl(Identifier="6f289bee-6aa8-5d19-c0fa-50b643860718")
public static String es_PE_COLUMN_M_Product_ID_Name="Producto";

@XendraColumn(AD_Element_ID="b4701f57-f2fc-567c-58e2-a6aefbc3932c",ColumnName="M_Product_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6f289bee-6aa8-5d19-c0fa-50b643860718",
Synchronized="2019-08-30 22:23:31.0")
/** Column name M_Product_ID */
public static final String COLUMNNAME_M_Product_ID = "M_Product_ID";
/** Set RMA.
@param M_RMA_ID Return Material Authorization */
public void setM_RMA_ID (int M_RMA_ID)
{
if (M_RMA_ID < 1) throw new IllegalArgumentException ("M_RMA_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_M_RMA_ID, Integer.valueOf(M_RMA_ID));
}
/** Get RMA.
@return Return Material Authorization */
public int getM_RMA_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_RMA_ID);
if (ii == null) return 0;
return ii.intValue();
}
/** Get Record ID/ColumnName
@return ID/ColumnName pair
*/public KeyNamePair getKeyNamePair() 
{
return new KeyNamePair(get_ID(), String.valueOf(getM_RMA_ID()));
}

@XendraTrl(Identifier="fadfc9dd-e879-5aa6-14c0-f63d18ea428a")
public static String es_PE_FIELD_RMALine_RMA_Name="Devolución de Material";

@XendraTrl(Identifier="fadfc9dd-e879-5aa6-14c0-f63d18ea428a")
public static String es_PE_FIELD_RMALine_RMA_Description="Autorización de Devolución de Material";

@XendraTrl(Identifier="fadfc9dd-e879-5aa6-14c0-f63d18ea428a")
public static String es_PE_FIELD_RMALine_RMA_Help="La Autorización de Devolución de Material se requiere para aceptar devoluciones y para crear memos de credito.";

@XendraField(AD_Column_ID="M_RMA_ID",IsCentrallyMaintained=true,
AD_Tab_ID="bdc504f6-0a25-e735-1969-ccb843c1c5b8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="fadfc9dd-e879-5aa6-14c0-f63d18ea428a")
public static final String FIELDNAME_RMALine_RMA="fadfc9dd-e879-5aa6-14c0-f63d18ea428a";

@XendraTrl(Identifier="2a5bff80-1ac5-bab3-0d0a-1357cf921d12")
public static String es_PE_COLUMN_M_RMA_ID_Name="ADM (RMA)";

@XendraColumn(AD_Element_ID="99f41ef6-5c78-3288-c0ff-9495a4714c13",ColumnName="M_RMA_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2a5bff80-1ac5-bab3-0d0a-1357cf921d12",
Synchronized="2019-08-30 22:23:31.0")
/** Column name M_RMA_ID */
public static final String COLUMNNAME_M_RMA_ID = "M_RMA_ID";
/** Set RMA Line.
@param M_RMALine_ID Return Material Authorization Line */
public void setM_RMALine_ID (int M_RMALine_ID)
{
if (M_RMALine_ID < 1) throw new IllegalArgumentException ("M_RMALine_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_M_RMALine_ID, Integer.valueOf(M_RMALine_ID));
}
/** Get RMA Line.
@return Return Material Authorization Line */
public int getM_RMALine_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_RMALine_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="9761c566-1648-85c0-4ad7-39f112113595")
public static String es_PE_FIELD_RMALine_RMALine_Name="Item ADM (RMA)";

@XendraTrl(Identifier="9761c566-1648-85c0-4ad7-39f112113595")
public static String es_PE_FIELD_RMALine_RMALine_Description="Item de Autorización de Devolución de Material";

@XendraTrl(Identifier="9761c566-1648-85c0-4ad7-39f112113595")
public static String es_PE_FIELD_RMALine_RMALine_Help="Información del detalle sobre las mercancías devueltas";

@XendraField(AD_Column_ID="M_RMALine_ID",IsCentrallyMaintained=true,
AD_Tab_ID="bdc504f6-0a25-e735-1969-ccb843c1c5b8",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9761c566-1648-85c0-4ad7-39f112113595")
public static final String FIELDNAME_RMALine_RMALine="9761c566-1648-85c0-4ad7-39f112113595";
/** Column name M_RMALine_ID */
public static final String COLUMNNAME_M_RMALine_ID = "M_RMALine_ID";
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

@XendraTrl(Identifier="c430c6f2-e1ca-0b0d-3bed-41898829b9f1")
public static String es_PE_FIELD_RMALine_Processed_Name="Procesado";

@XendraTrl(Identifier="c430c6f2-e1ca-0b0d-3bed-41898829b9f1")
public static String es_PE_FIELD_RMALine_Processed_Description="El documento ha sido procesado";

@XendraTrl(Identifier="c430c6f2-e1ca-0b0d-3bed-41898829b9f1")
public static String es_PE_FIELD_RMALine_Processed_Help="El cuadro de verificación procesada indica que un documento ha sido procesado";

@XendraField(AD_Column_ID="Processed",IsCentrallyMaintained=true,
AD_Tab_ID="bdc504f6-0a25-e735-1969-ccb843c1c5b8",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c430c6f2-e1ca-0b0d-3bed-41898829b9f1")
public static final String FIELDNAME_RMALine_Processed="c430c6f2-e1ca-0b0d-3bed-41898829b9f1";

@XendraTrl(Identifier="9f5a99e1-eb6d-4597-bf0c-c3b03df2e548")
public static String es_PE_COLUMN_Processed_Name="Procesado";

@XendraColumn(AD_Element_ID="3f7035d2-fa5e-7416-fc0c-e49e43f9e083",ColumnName="Processed",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9f5a99e1-eb6d-4597-bf0c-c3b03df2e548",
Synchronized="2019-08-30 22:23:31.0")
/** Column name Processed */
public static final String COLUMNNAME_Processed = "Processed";
/** Set Quantity.
@param Qty Quantity */
public void setQty (BigDecimal Qty)
{
if (Qty == null) throw new IllegalArgumentException ("Qty is mandatory.");
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

@XendraTrl(Identifier="6eff3082-b8fa-4431-f60e-24b32404dcf5")
public static String es_PE_FIELD_RMALine_Quantity_Name="Cantidad";

@XendraTrl(Identifier="6eff3082-b8fa-4431-f60e-24b32404dcf5")
public static String es_PE_FIELD_RMALine_Quantity_Description="Cantidad";

@XendraTrl(Identifier="6eff3082-b8fa-4431-f60e-24b32404dcf5")
public static String es_PE_FIELD_RMALine_Quantity_Help="La Cantidad indica el número de un producto específico o artículo para este documento";

@XendraField(AD_Column_ID="Qty",IsCentrallyMaintained=true,
AD_Tab_ID="bdc504f6-0a25-e735-1969-ccb843c1c5b8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6eff3082-b8fa-4431-f60e-24b32404dcf5")
public static final String FIELDNAME_RMALine_Quantity="6eff3082-b8fa-4431-f60e-24b32404dcf5";

@XendraTrl(Identifier="bedde6c7-fc4f-2484-9b77-578d0bb0a740")
public static String es_PE_COLUMN_Qty_Name="Cantidad";

@XendraColumn(AD_Element_ID="c9d74a25-87c5-9592-5660-4f397607dad3",ColumnName="Qty",
AD_Reference_ID=29,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="bedde6c7-fc4f-2484-9b77-578d0bb0a740",
Synchronized="2019-08-30 22:23:31.0")
/** Column name Qty */
public static final String COLUMNNAME_Qty = "Qty";
/** Set Delivered Quantity.
@param QtyDelivered Delivered Quantity */
public void setQtyDelivered (BigDecimal QtyDelivered)
{
set_Value (COLUMNNAME_QtyDelivered, QtyDelivered);
}
/** Get Delivered Quantity.
@return Delivered Quantity */
public BigDecimal getQtyDelivered() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_QtyDelivered);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="f82ae3b9-045e-c329-3ed0-d6d38ff5d51c")
public static String es_PE_FIELD_RMALine_DeliveredQuantity_Name="Cantidad Entregada";

@XendraTrl(Identifier="f82ae3b9-045e-c329-3ed0-d6d38ff5d51c")
public static String es_PE_FIELD_RMALine_DeliveredQuantity_Description="Cantidad entregada";

@XendraTrl(Identifier="f82ae3b9-045e-c329-3ed0-d6d38ff5d51c")
public static String es_PE_FIELD_RMALine_DeliveredQuantity_Help="La cantidad entregada indica la cantidad de un producto que ha sido entregada";

@XendraField(AD_Column_ID="QtyDelivered",IsCentrallyMaintained=true,
AD_Tab_ID="bdc504f6-0a25-e735-1969-ccb843c1c5b8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f82ae3b9-045e-c329-3ed0-d6d38ff5d51c")
public static final String FIELDNAME_RMALine_DeliveredQuantity="f82ae3b9-045e-c329-3ed0-d6d38ff5d51c";

@XendraTrl(Identifier="68ca444c-909c-dcb4-adeb-311e5943cf87")
public static String es_PE_COLUMN_QtyDelivered_Name="Cantidad Entregada";

@XendraColumn(AD_Element_ID="a3a641d6-7605-bf7c-26be-366ed1709eb0",ColumnName="QtyDelivered",
AD_Reference_ID=29,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=131089,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="68ca444c-909c-dcb4-adeb-311e5943cf87",
Synchronized="2019-08-30 22:23:31.0")
/** Column name QtyDelivered */
public static final String COLUMNNAME_QtyDelivered = "QtyDelivered";
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

@XendraTrl(Identifier="88fa4244-1fe7-0659-88ba-6ec02ee20530")
public static String es_PE_FIELD_RMALine_QuantityInvoiced_Name="Cantidad Facturada";

@XendraTrl(Identifier="88fa4244-1fe7-0659-88ba-6ec02ee20530")
public static String es_PE_FIELD_RMALine_QuantityInvoiced_Description="Cantidad facturada";

@XendraTrl(Identifier="88fa4244-1fe7-0659-88ba-6ec02ee20530")
public static String es_PE_FIELD_RMALine_QuantityInvoiced_Help="La cantidad facturada indica la cantidad de un producto que ha sido facturado";

@XendraField(AD_Column_ID="QtyInvoiced",IsCentrallyMaintained=true,
AD_Tab_ID="bdc504f6-0a25-e735-1969-ccb843c1c5b8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="88fa4244-1fe7-0659-88ba-6ec02ee20530")
public static final String FIELDNAME_RMALine_QuantityInvoiced="88fa4244-1fe7-0659-88ba-6ec02ee20530";

@XendraTrl(Identifier="b0e13546-eea5-bc57-1e92-d3bc29647690")
public static String es_PE_COLUMN_QtyInvoiced_Name="Cantidad Facturada";

@XendraColumn(AD_Element_ID="406c1301-33f0-3d6a-3fbc-b0cf44ccc5b3",ColumnName="QtyInvoiced",
AD_Reference_ID=29,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=131089,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b0e13546-eea5-bc57-1e92-d3bc29647690",
Synchronized="2019-08-30 22:23:31.0")
/** Column name QtyInvoiced */
public static final String COLUMNNAME_QtyInvoiced = "QtyInvoiced";
/** Set Ref_Rmaline_ID.
@param Ref_Rmaline_ID Ref_Rmaline_ID */
public void setRef_Rmaline_ID (int Ref_Rmaline_ID)
{
if (Ref_Rmaline_ID <= 0) set_Value (COLUMNNAME_Ref_Rmaline_ID, null);
 else 
set_Value (COLUMNNAME_Ref_Rmaline_ID, Integer.valueOf(Ref_Rmaline_ID));
}
/** Get Ref_Rmaline_ID.
@return Ref_Rmaline_ID */
public int getRef_Rmaline_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_Ref_Rmaline_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="b60df183-f5d9-3c0a-28c4-5f56ac0b907e")
public static String es_PE_FIELD_RMALine_Ref_Rmaline_ID_Name="Referencia";

@XendraField(AD_Column_ID="Ref_Rmaline_ID",IsCentrallyMaintained=true,
AD_Tab_ID="bdc504f6-0a25-e735-1969-ccb843c1c5b8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=140,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b60df183-f5d9-3c0a-28c4-5f56ac0b907e")
public static final String FIELDNAME_RMALine_Ref_Rmaline_ID="b60df183-f5d9-3c0a-28c4-5f56ac0b907e";

@XendraTrl(Identifier="bd7d20f7-c456-f14d-593d-ff85e6404182")
public static String es_PE_COLUMN_Ref_Rmaline_ID_Name="ref_rmaline_id";

@XendraColumn(AD_Element_ID="333d82f0-466d-89a0-8991-a12090815b82",ColumnName="Ref_Rmaline_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="6ab4b59d-04c4-3ae9-0a5c-fca29678e934",AD_Val_Rule_ID="",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="bd7d20f7-c456-f14d-593d-ff85e6404182",Synchronized="2019-08-30 22:23:31.0")
/** Column name Ref_Rmaline_ID */
public static final String COLUMNNAME_Ref_Rmaline_ID = "Ref_Rmaline_ID";
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

@XendraTrl(Identifier="cb2c465c-962f-eac2-8e5f-af3a0ae978de")
public static String es_PE_FIELD_RMALine_UserList_Name="Usuario 1";

@XendraTrl(Identifier="cb2c465c-962f-eac2-8e5f-af3a0ae978de")
public static String es_PE_FIELD_RMALine_UserList_Description="El usuario definió el elemento # 1";

@XendraTrl(Identifier="cb2c465c-962f-eac2-8e5f-af3a0ae978de")
public static String es_PE_FIELD_RMALine_UserList_Help="El elemento definido por el usuario despliega los elementos opcionales que han sido definidos para esta combinación de cuentas";

@XendraField(AD_Column_ID="User1_ID",IsCentrallyMaintained=true,
AD_Tab_ID="bdc504f6-0a25-e735-1969-ccb843c1c5b8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="cb2c465c-962f-eac2-8e5f-af3a0ae978de")
public static final String FIELDNAME_RMALine_UserList="cb2c465c-962f-eac2-8e5f-af3a0ae978de";

@XendraTrl(Identifier="99bf6b49-dfcd-589b-15db-af2a73198318")
public static String es_PE_COLUMN_User1_ID_Name="Usuario 1";

@XendraColumn(AD_Element_ID="07453e74-aadd-d9c9-e543-837a6fdb3094",ColumnName="User1_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="99bf6b49-dfcd-589b-15db-af2a73198318",
Synchronized="2019-08-30 22:23:31.0")
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

@XendraTrl(Identifier="6f688f40-6aa9-cbd3-e817-0127263d8bf7")
public static String es_PE_FIELD_RMALine_UserList22_Name="Usuario 2";

@XendraTrl(Identifier="6f688f40-6aa9-cbd3-e817-0127263d8bf7")
public static String es_PE_FIELD_RMALine_UserList22_Description="El usuario definió el elemento # 2";

@XendraTrl(Identifier="6f688f40-6aa9-cbd3-e817-0127263d8bf7")
public static String es_PE_FIELD_RMALine_UserList22_Help="El elemento definido por el usuario despliega los elementos opcionales que han sido definidos para esta combinación de cuentas";

@XendraField(AD_Column_ID="User2_ID",IsCentrallyMaintained=true,
AD_Tab_ID="bdc504f6-0a25-e735-1969-ccb843c1c5b8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6f688f40-6aa9-cbd3-e817-0127263d8bf7")
public static final String FIELDNAME_RMALine_UserList22="6f688f40-6aa9-cbd3-e817-0127263d8bf7";

@XendraTrl(Identifier="38d44d9e-1671-6f6b-acfe-97d08be08af2")
public static String es_PE_COLUMN_User2_ID_Name="Usuario 2";

@XendraColumn(AD_Element_ID="1b668c90-6743-20a2-df62-576857d72c06",ColumnName="User2_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="38d44d9e-1671-6f6b-acfe-97d08be08af2",
Synchronized="2019-08-30 22:23:31.0")
/** Column name User2_ID */
public static final String COLUMNNAME_User2_ID = "User2_ID";
}
