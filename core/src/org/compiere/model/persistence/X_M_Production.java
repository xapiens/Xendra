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
/** Generated Model for M_Production
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_M_Production extends PO
{
/** Standard Constructor
@param ctx context
@param M_Production_ID id
@param trxName transaction
*/
public X_M_Production (Properties ctx, int M_Production_ID, String trxName)
{
super (ctx, M_Production_ID, trxName);
/** if (M_Production_ID == 0)
{
setDateAcct (new Timestamp(System.currentTimeMillis()));	
// @SysDate@
setDeliveryRule (null);	
// A
setIsApproved (false);	
// N
setIsCreated (false);	
// N
setMovementDate (new Timestamp(System.currentTimeMillis()));	
// @SysDate@
setM_Production_ID (0);
setName (null);
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
public X_M_Production (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=325 */
public static int Table_ID=MTable.getTable_ID("M_Production");

@XendraTrl(Identifier="ba8bae1b-fb19-0175-6d10-67f571bdcab2")
public static String es_PE_TAB_ProductionHeader_Description="Encabezado de Producción";

@XendraTrl(Identifier="ba8bae1b-fb19-0175-6d10-67f571bdcab2")
public static String es_PE_TAB_ProductionHeader_Help="La pestaña Encabezado de Producción define un plan único de producción.";

@XendraTrl(Identifier="ba8bae1b-fb19-0175-6d10-67f571bdcab2")
public static String es_PE_TAB_ProductionHeader_Name="Encabezado de Producción";

@XendraTab(Name="Production Header",Description="Production Header",
Help="The Production Header Tab defines a unique production plan",
AD_Window_ID="735b6408-f744-4421-e308-a3bb880dfd24",SeqNo=10,TabLevel=0,IsSingleRow=true,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="ba8bae1b-fb19-0175-6d10-67f571bdcab2",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_ProductionHeader="ba8bae1b-fb19-0175-6d10-67f571bdcab2";

@XendraTrl(Identifier="a8297d40-c73a-7ea0-bf0e-ed176520db99")
public static String es_PE_TABLE_M_Production_Name="Producción";

@XendraTable(Name="Production",AD_Package_ID="2809ac2d-7d43-20f8-05f0-a478f2e50204",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="Plan for producing a product",
Help="",TableName="M_Production",AccessLevel="3",
AD_Window_ID="735b6408-f744-4421-e308-a3bb880dfd24",AD_Val_Rule_ID="",IsKey=1,LoadSeq=125,
IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=false,IsChangeLog=false,IsView=false,
PO_Window_ID="",ID="org.xendra.material",Identifier="a8297d40-c73a-7ea0-bf0e-ed176520db99",
Synchronized="2020-03-03 21:38:52.0")
/** TableName=M_Production */
public static final String Table_Name="M_Production";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"M_Production");

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
    Table_ID = MTable.getTable_ID("M_Production");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_M_Production[").append(get_ID()).append("]");
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

@XendraTrl(Identifier="298fc037-fa61-0953-c3eb-8e1a20b0ae64")
public static String es_PE_FIELD_ProductionHeader_TrxOrganization_Name="Organización de la Trans.";

@XendraTrl(Identifier="298fc037-fa61-0953-c3eb-8e1a20b0ae64")
public static String es_PE_FIELD_ProductionHeader_TrxOrganization_Description="Organización que inicia ó ejecuta la transacción";

@XendraTrl(Identifier="298fc037-fa61-0953-c3eb-8e1a20b0ae64")
public static String es_PE_FIELD_ProductionHeader_TrxOrganization_Help="La organización que inicia ó ejecuta la transacción (para otra organización). La organización poseedora puede no ser la organización de la transacción en un ambiente de buró de servicio; con servicios centralizados y transacciones inter- organización.";

@XendraField(AD_Column_ID="AD_OrgTrx_ID",IsCentrallyMaintained=true,
AD_Tab_ID="ba8bae1b-fb19-0175-6d10-67f571bdcab2",AD_FieldGroup_ID="Reference",IsDisplayed=true,
DisplayLogic="@$Element_OT@=Y",DisplayLength=14,IsReadOnly=false,SeqNo=100,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="298fc037-fa61-0953-c3eb-8e1a20b0ae64")
public static final String FIELDNAME_ProductionHeader_TrxOrganization="298fc037-fa61-0953-c3eb-8e1a20b0ae64";

@XendraTrl(Identifier="161c198a-8161-de80-9d28-9aeb967bde22")
public static String es_PE_COLUMN_AD_OrgTrx_ID_Name="Organización de la Trans.";

@XendraColumn(AD_Element_ID="b4180358-67aa-fe55-0409-6367a60e0a2e",ColumnName="AD_OrgTrx_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="54e78591-f7f4-c613-ea27-e64b3dac5198",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="161c198a-8161-de80-9d28-9aeb967bde22",Synchronized="2019-08-30 22:23:27.0")
/** Column name AD_OrgTrx_ID */
public static final String COLUMNNAME_AD_OrgTrx_ID = "AD_OrgTrx_ID";
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

@XendraTrl(Identifier="a539ab44-ec97-f9f9-9c49-843cbb54e4ff")
public static String es_PE_FIELD_ProductionHeader_Activity_Name="Tipo de Gasto";

@XendraTrl(Identifier="a539ab44-ec97-f9f9-9c49-843cbb54e4ff")
public static String es_PE_FIELD_ProductionHeader_Activity_Description="Actividad de Negocio";

@XendraTrl(Identifier="a539ab44-ec97-f9f9-9c49-843cbb54e4ff")
public static String es_PE_FIELD_ProductionHeader_Activity_Help="Las actividades indican tareas que son ejecutadas en el curso de un negocio; las actividades son usadas para el costeo por actividad (ABC)";

@XendraField(AD_Column_ID="C_Activity_ID",IsCentrallyMaintained=true,
AD_Tab_ID="ba8bae1b-fb19-0175-6d10-67f571bdcab2",AD_FieldGroup_ID="Reference",IsDisplayed=true,
DisplayLogic="@$Element_AY@=Y",DisplayLength=14,IsReadOnly=false,SeqNo=210,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="a539ab44-ec97-f9f9-9c49-843cbb54e4ff")
public static final String FIELDNAME_ProductionHeader_Activity="a539ab44-ec97-f9f9-9c49-843cbb54e4ff";

@XendraTrl(Identifier="d7250df7-8a69-dc24-b87a-054a40c76c32")
public static String es_PE_COLUMN_C_Activity_ID_Name="Tipo de Gasto";

@XendraColumn(AD_Element_ID="bfeadbb3-d866-26e3-8eee-3e2fdf0ff753",ColumnName="C_Activity_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d7250df7-8a69-dc24-b87a-054a40c76c32",
Synchronized="2019-08-30 22:23:27.0")
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

@XendraTrl(Identifier="2f14807a-5f50-af8c-badc-e6d1c89c4427")
public static String es_PE_FIELD_ProductionHeader_Campaign_Name="Campaña";

@XendraTrl(Identifier="2f14807a-5f50-af8c-badc-e6d1c89c4427")
public static String es_PE_FIELD_ProductionHeader_Campaign_Description="Campaña de Mercadeo";

@XendraTrl(Identifier="2f14807a-5f50-af8c-badc-e6d1c89c4427")
public static String es_PE_FIELD_ProductionHeader_Campaign_Help="La Campaña define un programa de mercadotecnia único. Los proyectos pueden estar asociados con una campaña de mercadotecnia única. Usted puede entonces reportar basado en una campaña específica";

@XendraField(AD_Column_ID="C_Campaign_ID",IsCentrallyMaintained=true,
AD_Tab_ID="ba8bae1b-fb19-0175-6d10-67f571bdcab2",AD_FieldGroup_ID="Reference",IsDisplayed=true,
DisplayLogic="@$Element_MC@=Y",DisplayLength=14,IsReadOnly=false,SeqNo=200,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="2f14807a-5f50-af8c-badc-e6d1c89c4427")
public static final String FIELDNAME_ProductionHeader_Campaign="2f14807a-5f50-af8c-badc-e6d1c89c4427";

@XendraTrl(Identifier="3c7fc403-ba64-e284-5ae2-ce2a9b101389")
public static String es_PE_COLUMN_C_Campaign_ID_Name="Campaña";

@XendraColumn(AD_Element_ID="6cf08e31-d355-ee38-9c0b-bee20b3ea5b6",ColumnName="C_Campaign_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3c7fc403-ba64-e284-5ae2-ce2a9b101389",
Synchronized="2019-08-30 22:23:27.0")
/** Column name C_Campaign_ID */
public static final String COLUMNNAME_C_Campaign_ID = "C_Campaign_ID";
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

@XendraTrl(Identifier="83c18f30-bc49-4959-1ce1-92e4c1723aaa")
public static String es_PE_FIELD_ProductionHeader_DocumentType_Name="Tipo de Documento";

@XendraTrl(Identifier="83c18f30-bc49-4959-1ce1-92e4c1723aaa")
public static String es_PE_FIELD_ProductionHeader_DocumentType_Description="Tipo de documento ó reglas";

@XendraTrl(Identifier="83c18f30-bc49-4959-1ce1-92e4c1723aaa")
public static String es_PE_FIELD_ProductionHeader_DocumentType_Help="El tipo de documento determina la secuencia del documento y las reglas de proceso";

@XendraField(AD_Column_ID="C_DocType_ID",IsCentrallyMaintained=true,
AD_Tab_ID="ba8bae1b-fb19-0175-6d10-67f571bdcab2",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="83c18f30-bc49-4959-1ce1-92e4c1723aaa")
public static final String FIELDNAME_ProductionHeader_DocumentType="83c18f30-bc49-4959-1ce1-92e4c1723aaa";

@XendraTrl(Identifier="90e155dc-a1ae-ef76-19a4-c7bf6f301e5b")
public static String es_PE_COLUMN_C_DocType_ID_Name="Tipo de Documento";

@XendraColumn(AD_Element_ID="099a4147-1a72-cdd0-81e0-8bdbc8c0b883",ColumnName="C_DocType_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="c982c60a-4fc7-af7f-d465-88afee7cfffa",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="90e155dc-a1ae-ef76-19a4-c7bf6f301e5b",Synchronized="2019-08-30 22:23:27.0")
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

@XendraTrl(Identifier="c08a6ede-efeb-0b9e-8fda-74f70fe1f0d8")
public static String es_PE_FIELD_ProductionHeader_Project_Name="Proyecto";

@XendraTrl(Identifier="c08a6ede-efeb-0b9e-8fda-74f70fe1f0d8")
public static String es_PE_FIELD_ProductionHeader_Project_Description="Identifica un proyecto único";

@XendraTrl(Identifier="c08a6ede-efeb-0b9e-8fda-74f70fe1f0d8")
public static String es_PE_FIELD_ProductionHeader_Project_Help="La ID de un proyecto es un identificador definido por el usuario para un proyecto";

@XendraField(AD_Column_ID="C_Project_ID",IsCentrallyMaintained=true,
AD_Tab_ID="ba8bae1b-fb19-0175-6d10-67f571bdcab2",AD_FieldGroup_ID="Reference",IsDisplayed=true,
DisplayLogic="@$Element_PJ@=Y",DisplayLength=14,IsReadOnly=false,SeqNo=190,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="c08a6ede-efeb-0b9e-8fda-74f70fe1f0d8")
public static final String FIELDNAME_ProductionHeader_Project="c08a6ede-efeb-0b9e-8fda-74f70fe1f0d8";

@XendraTrl(Identifier="02a879df-1228-0cf5-c909-8647a28a04c2")
public static String es_PE_COLUMN_C_Project_ID_Name="Proyecto";

@XendraColumn(AD_Element_ID="16ff5dcc-9178-73dd-e618-e88bd79d573b",ColumnName="C_Project_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="992a8502-7fe8-20b8-6bc5-b5b4b225f1e3",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="02a879df-1228-0cf5-c909-8647a28a04c2",Synchronized="2019-08-30 22:23:27.0")
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

@XendraTrl(Identifier="1634420b-ac12-90e1-2b3f-4370af43b717")
public static String es_PE_FIELD_ProductionHeader_AccountDate_Name="Fecha de Aplicación CG";

@XendraTrl(Identifier="1634420b-ac12-90e1-2b3f-4370af43b717")
public static String es_PE_FIELD_ProductionHeader_AccountDate_Description="Fecha contable";

@XendraTrl(Identifier="1634420b-ac12-90e1-2b3f-4370af43b717")
public static String es_PE_FIELD_ProductionHeader_AccountDate_Help="La fecha contable indica la fecha a ser usada en las cuentas de contabilidad general generadas desde este documento";

@XendraField(AD_Column_ID="DateAcct",IsCentrallyMaintained=true,
AD_Tab_ID="ba8bae1b-fb19-0175-6d10-67f571bdcab2",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=29,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1634420b-ac12-90e1-2b3f-4370af43b717")
public static final String FIELDNAME_ProductionHeader_AccountDate="1634420b-ac12-90e1-2b3f-4370af43b717";

@XendraTrl(Identifier="4e6a4b62-06a5-8cec-3290-1cb2ad1c6f7a")
public static String es_PE_COLUMN_DateAcct_Name="Account Date";

@XendraColumn(AD_Element_ID="034727d0-e80f-fadf-3d4f-2d8d37b75669",ColumnName="DateAcct",
AD_Reference_ID=15,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=29,
DefaultValue="@SysDate@",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=true,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="4e6a4b62-06a5-8cec-3290-1cb2ad1c6f7a",Synchronized="2019-08-30 22:23:27.0")
/** Column name DateAcct */
public static final String COLUMNNAME_DateAcct = "DateAcct";
/** Set Delivery Rule.
@param DeliveryRule Defines the timing of Delivery */
public void setDeliveryRule (String DeliveryRule)
{
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

@XendraTrl(Identifier="628f5383-8546-9d27-235c-467904737821")
public static String es_PE_FIELD_ProductionHeader_DeliveryRule_Name="Regla de Entrega";

@XendraTrl(Identifier="628f5383-8546-9d27-235c-467904737821")
public static String es_PE_FIELD_ProductionHeader_DeliveryRule_Description="Define los tiempos de entrega";

@XendraTrl(Identifier="628f5383-8546-9d27-235c-467904737821")
public static String es_PE_FIELD_ProductionHeader_DeliveryRule_Help="La Regla de Entrega indica cuando una orden debe ser entregada. Por Ej. Si la orden debiera entregarse cuando  esta completa; cuando una partida esta completa ó cuando el producto llega a estar disponible.";

@XendraField(AD_Column_ID="DeliveryRule",IsCentrallyMaintained=true,
AD_Tab_ID="ba8bae1b-fb19-0175-6d10-67f571bdcab2",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="628f5383-8546-9d27-235c-467904737821")
public static final String FIELDNAME_ProductionHeader_DeliveryRule="628f5383-8546-9d27-235c-467904737821";

@XendraTrl(Identifier="188a4352-9272-9baf-1d10-23351a4e65e2")
public static String es_PE_COLUMN_DeliveryRule_Name="Delivery Rule";

@XendraColumn(AD_Element_ID="bfc0b304-42d5-bfa2-4997-a3024ea284f9",ColumnName="DeliveryRule",
AD_Reference_ID=17,AD_Reference_Value_ID="dd6ca989-f822-5b38-ea47-5420e7ccb16b",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="A",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="188a4352-9272-9baf-1d10-23351a4e65e2",Synchronized="2019-08-30 22:23:27.0")
/** Column name DeliveryRule */
public static final String COLUMNNAME_DeliveryRule = "DeliveryRule";
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

@XendraTrl(Identifier="37b78842-6ed1-02a0-2d49-c1bb4e0d427b")
public static String es_PE_FIELD_ProductionHeader_Description_Name="Observación";

@XendraTrl(Identifier="37b78842-6ed1-02a0-2d49-c1bb4e0d427b")
public static String es_PE_FIELD_ProductionHeader_Description_Description="Observación corta opcional del registro";

@XendraTrl(Identifier="37b78842-6ed1-02a0-2d49-c1bb4e0d427b")
public static String es_PE_FIELD_ProductionHeader_Description_Help="Una Observación esta limitada a 255 caracteres";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="ba8bae1b-fb19-0175-6d10-67f571bdcab2",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="37b78842-6ed1-02a0-2d49-c1bb4e0d427b")
public static final String FIELDNAME_ProductionHeader_Description="37b78842-6ed1-02a0-2d49-c1bb4e0d427b";

@XendraTrl(Identifier="fdd93fea-921a-b5a9-4266-26f0b0d010e5")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="fdd93fea-921a-b5a9-4266-26f0b0d010e5",
Synchronized="2019-08-30 22:23:27.0")
/** Column name Description */
public static final String COLUMNNAME_Description = "Description";
/** Set Document Action.
@param DocAction The targeted status of the document */
public void setDocAction (String DocAction)
{
if (DocAction != null && DocAction.length() > 2)
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

@XendraTrl(Identifier="c2d50db6-5daf-d60c-05a5-5916aae176f3")
public static String es_PE_FIELD_ProductionHeader_DocumentAction_Name="Acción en el Documento";

@XendraTrl(Identifier="c2d50db6-5daf-d60c-05a5-5916aae176f3")
public static String es_PE_FIELD_ProductionHeader_DocumentAction_Description="El estado destino del documento";

@XendraTrl(Identifier="c2d50db6-5daf-d60c-05a5-5916aae176f3")
public static String es_PE_FIELD_ProductionHeader_DocumentAction_Help="Usted encuentra el estado actual en el campo Estado del Documento";

@XendraField(AD_Column_ID="DocAction",IsCentrallyMaintained=true,
AD_Tab_ID="ba8bae1b-fb19-0175-6d10-67f571bdcab2",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=2,IsReadOnly=false,SeqNo=150,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c2d50db6-5daf-d60c-05a5-5916aae176f3")
public static final String FIELDNAME_ProductionHeader_DocumentAction="c2d50db6-5daf-d60c-05a5-5916aae176f3";

@XendraTrl(Identifier="e5dbbfda-9361-cd48-9f5a-b8ca3b6e6ee0")
public static String es_PE_COLUMN_DocAction_Name="Document Action";

@XendraColumn(AD_Element_ID="d4b9075b-18e5-ebbb-5565-d217a7e531cb",ColumnName="DocAction",
AD_Reference_ID=28,AD_Reference_Value_ID="e397c9b0-c643-d1cd-8380-20bee13b2a6e",AD_Val_Rule_ID="",
FieldLength=2,DefaultValue="CO",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,
AD_Process_ID="82f5b8a1-b9e8-cf9b-7a2a-6d75ad3b92c6",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e5dbbfda-9361-cd48-9f5a-b8ca3b6e6ee0",
Synchronized="2019-08-30 22:23:27.0")
/** Column name DocAction */
public static final String COLUMNNAME_DocAction = "DocAction";
/** Set Document Status.
@param DocStatus The current status of the document */
public void setDocStatus (String DocStatus)
{
if (DocStatus != null && DocStatus.length() > 2)
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

@XendraTrl(Identifier="f991d660-a415-6cb7-e42f-bacaa9efe193")
public static String es_PE_FIELD_ProductionHeader_DocumentStatus_Name="Estado del Documento";

@XendraTrl(Identifier="f991d660-a415-6cb7-e42f-bacaa9efe193")
public static String es_PE_FIELD_ProductionHeader_DocumentStatus_Description="El estado actual del documento";

@XendraTrl(Identifier="f991d660-a415-6cb7-e42f-bacaa9efe193")
public static String es_PE_FIELD_ProductionHeader_DocumentStatus_Help="El estado del documento indica el estado del documento en este momento. Si usted quiere cambiar el estado de Documento; use el campo acción de documento";

@XendraField(AD_Column_ID="DocStatus",IsCentrallyMaintained=true,
AD_Tab_ID="ba8bae1b-fb19-0175-6d10-67f571bdcab2",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=2,IsReadOnly=true,SeqNo=160,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f991d660-a415-6cb7-e42f-bacaa9efe193")
public static final String FIELDNAME_ProductionHeader_DocumentStatus="f991d660-a415-6cb7-e42f-bacaa9efe193";

@XendraTrl(Identifier="2824c74c-7808-c44f-bcef-20707394aa9f")
public static String es_PE_COLUMN_DocStatus_Name="Document Status";

@XendraColumn(AD_Element_ID="e73fa537-3438-bd01-dfd4-f0f080a28c55",ColumnName="DocStatus",
AD_Reference_ID=17,AD_Reference_Value_ID="7627125d-fefe-e6bc-bb7d-4a6c772172dc",AD_Val_Rule_ID="",
FieldLength=2,DefaultValue="DR",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="2824c74c-7808-c44f-bcef-20707394aa9f",Synchronized="2019-08-30 22:23:27.0")
/** Column name DocStatus */
public static final String COLUMNNAME_DocStatus = "DocStatus";
/** Set Document No.
@param DocumentNo Document sequence number of the document */
public void setDocumentNo (String DocumentNo)
{
if (DocumentNo != null && DocumentNo.length() > 30)
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
@XendraTrl(Identifier="324e25d4-5b1d-10f5-8fc1-6c868f1f8d24")
public static String es_PE_FIELD_ProductionHeader_DocumentNo_Name="No. del Documento";

@XendraTrl(Identifier="324e25d4-5b1d-10f5-8fc1-6c868f1f8d24")
public static String es_PE_FIELD_ProductionHeader_DocumentNo_Description="Número de secuencia del documento para cada documento";

@XendraTrl(Identifier="324e25d4-5b1d-10f5-8fc1-6c868f1f8d24")
public static String es_PE_FIELD_ProductionHeader_DocumentNo_Help="El número del documento es usualmente generado en automático por el sistema y determinado por el tipo del documento. Si el documento no se salva; el número preliminar se despliega entre \"<>\"";

@XendraField(AD_Column_ID="DocumentNo",IsCentrallyMaintained=true,
AD_Tab_ID="ba8bae1b-fb19-0175-6d10-67f571bdcab2",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=40,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="324e25d4-5b1d-10f5-8fc1-6c868f1f8d24")
public static final String FIELDNAME_ProductionHeader_DocumentNo="324e25d4-5b1d-10f5-8fc1-6c868f1f8d24";

@XendraTrl(Identifier="9bb13181-d5f3-c279-09e9-eaacafdca3c7")
public static String es_PE_COLUMN_DocumentNo_Name="No. del Documento";

@XendraColumn(AD_Element_ID="e3ca6e28-702a-2722-d941-b2072a0de9cb",ColumnName="DocumentNo",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=30,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9bb13181-d5f3-c279-09e9-eaacafdca3c7",
Synchronized="2019-08-30 22:23:27.0")
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
set_Value (COLUMNNAME_Fact_ID, Fact_ID);
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
@XendraTrl(Identifier="bbabc449-d7e8-4047-a6d5-c6bbb5afac26")
public static String es_PE_COLUMN_Fact_ID_Name="Accounting Fact ID (per document)";

@XendraColumn(AD_Element_ID="20f6c8ee-0151-735b-7a03-2006e09d8eb0",ColumnName="Fact_ID",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=20,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="20",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="bbabc449-d7e8-4047-a6d5-c6bbb5afac26",
Synchronized="2019-08-30 22:23:27.0")
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
@XendraTrl(Identifier="55c39d40-6fee-49d9-83f0-2131955a0c73")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="55c39d40-6fee-49d9-83f0-2131955a0c73",
Synchronized="2019-08-30 22:23:27.0")
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

@XendraTrl(Identifier="3347c623-791a-b1ca-7f16-dc61db63dcbc")
public static String es_PE_FIELD_ProductionHeader_Approved_Name="Aprobación";

@XendraTrl(Identifier="3347c623-791a-b1ca-7f16-dc61db63dcbc")
public static String es_PE_FIELD_ProductionHeader_Approved_Description="Indica si este documento requiere aprobación";

@XendraTrl(Identifier="3347c623-791a-b1ca-7f16-dc61db63dcbc")
public static String es_PE_FIELD_ProductionHeader_Approved_Help="El Cuadro de Verificación  Aprobado indica si este documento requiere aprobación antes de que pueda ser procesado";

@XendraField(AD_Column_ID="IsApproved",IsCentrallyMaintained=true,
AD_Tab_ID="ba8bae1b-fb19-0175-6d10-67f571bdcab2",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=180,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3347c623-791a-b1ca-7f16-dc61db63dcbc")
public static final String FIELDNAME_ProductionHeader_Approved="3347c623-791a-b1ca-7f16-dc61db63dcbc";

@XendraTrl(Identifier="e985d06c-1fe3-f6b1-a2d3-f789f4d4e1fa")
public static String es_PE_COLUMN_IsApproved_Name="Approved";

@XendraColumn(AD_Element_ID="44388d99-07b7-b005-9e16-78884800beff",ColumnName="IsApproved",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e985d06c-1fe3-f6b1-a2d3-f789f4d4e1fa",
Synchronized="2019-08-30 22:23:27.0")
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

@XendraTrl(Identifier="9e410613-ca10-4531-9796-5321b0e4ab6f")
public static String es_PE_COLUMN_IsCosted_Name="IsCosted";

@XendraColumn(AD_Element_ID="1d2cca33-7933-6933-e8cd-036ca4cb806e",ColumnName="IsCosted",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9e410613-ca10-4531-9796-5321b0e4ab6f",
Synchronized="2019-08-30 22:23:27.0")
/** Column name IsCosted */
public static final String COLUMNNAME_IsCosted = "IsCosted";
/** Set Records CREATED.
@param IsCreated Records CREATED */
public void setIsCreated (boolean IsCreated)
{
set_ValueNoCheck (COLUMNNAME_IsCreated, Boolean.valueOf(IsCreated));
}
/** Get Records CREATED.
@return Records CREATED */
public boolean isCreated() 
{
Object oo = get_Value(COLUMNNAME_IsCreated);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="5de0c461-d3d2-9013-7d12-cd465b7c12b5")
public static String es_PE_FIELD_ProductionHeader_RecordsCREATED_Name="Registros Creados";

@XendraField(AD_Column_ID="IsCreated",IsCentrallyMaintained=true,
AD_Tab_ID="ba8bae1b-fb19-0175-6d10-67f571bdcab2",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=true,SeqNo=140,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5de0c461-d3d2-9013-7d12-cd465b7c12b5")
public static final String FIELDNAME_ProductionHeader_RecordsCREATED="5de0c461-d3d2-9013-7d12-cd465b7c12b5";

@XendraTrl(Identifier="2540f084-457c-1527-61b0-62a8245b4d00")
public static String es_PE_COLUMN_IsCreated_Name="Registros Creados";

@XendraColumn(AD_Element_ID="cabbf6d8-5575-c410-16f5-3d50c04fd3fc",ColumnName="IsCreated",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2540f084-457c-1527-61b0-62a8245b4d00",
Synchronized="2019-08-30 22:23:27.0")
/** Column name IsCreated */
public static final String COLUMNNAME_IsCreated = "IsCreated";
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

@XendraTrl(Identifier="a75a7126-fa05-6d31-70d0-d32d8c3c4870")
public static String es_PE_FIELD_ProductionHeader_MovementDate_Name="Fecha de Movimiento";

@XendraTrl(Identifier="a75a7126-fa05-6d31-70d0-d32d8c3c4870")
public static String es_PE_FIELD_ProductionHeader_MovementDate_Description="Fecha en que un producto fue movido (dentro ó fuera) del inventario";

@XendraTrl(Identifier="a75a7126-fa05-6d31-70d0-d32d8c3c4870")
public static String es_PE_FIELD_ProductionHeader_MovementDate_Help="La fecha del movimiento indica la fecha en que el producto es movido. Éste es el resultado de un embarque; recibo ó movimiento de inventario.";

@XendraField(AD_Column_ID="MovementDate",IsCentrallyMaintained=true,
AD_Tab_ID="ba8bae1b-fb19-0175-6d10-67f571bdcab2",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a75a7126-fa05-6d31-70d0-d32d8c3c4870")
public static final String FIELDNAME_ProductionHeader_MovementDate="a75a7126-fa05-6d31-70d0-d32d8c3c4870";

@XendraTrl(Identifier="b6eafb81-2074-2649-ec14-17ea82399fd3")
public static String es_PE_COLUMN_MovementDate_Name="Fecha de Movimiento";

@XendraColumn(AD_Element_ID="7a907f01-8525-820d-22d4-98b06d4b902b",ColumnName="MovementDate",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,
DefaultValue="@SysDate@",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=true,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="b6eafb81-2074-2649-ec14-17ea82399fd3",Synchronized="2019-08-30 22:23:27.0")
/** Column name MovementDate */
public static final String COLUMNNAME_MovementDate = "MovementDate";
/** Set Production.
@param M_Production_ID Plan for producing a product */
public void setM_Production_ID (int M_Production_ID)
{
if (M_Production_ID < 1) throw new IllegalArgumentException ("M_Production_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_M_Production_ID, Integer.valueOf(M_Production_ID));
}
/** Get Production.
@return Plan for producing a product */
public int getM_Production_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_Production_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="844a2362-dce4-3dcd-8957-e419be76b871")
public static String es_PE_FIELD_ProductionHeader_Production_Name="Producción";

@XendraTrl(Identifier="844a2362-dce4-3dcd-8957-e419be76b871")
public static String es_PE_FIELD_ProductionHeader_Production_Description="Plan para producir un producto";

@XendraTrl(Identifier="844a2362-dce4-3dcd-8957-e419be76b871")
public static String es_PE_FIELD_ProductionHeader_Production_Help="La producción únicamente identifica un plan de producción";

@XendraField(AD_Column_ID="M_Production_ID",IsCentrallyMaintained=true,
AD_Tab_ID="ba8bae1b-fb19-0175-6d10-67f571bdcab2",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="844a2362-dce4-3dcd-8957-e419be76b871")
public static final String FIELDNAME_ProductionHeader_Production="844a2362-dce4-3dcd-8957-e419be76b871";
/** Column name M_Production_ID */
public static final String COLUMNNAME_M_Production_ID = "M_Production_ID";
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

@XendraTrl(Identifier="5517f3f7-05f8-92fa-9c93-51e46888a0c0")
public static String es_PE_FIELD_ProductionHeader_Name_Name="Nombre";

@XendraTrl(Identifier="5517f3f7-05f8-92fa-9c93-51e46888a0c0")
public static String es_PE_FIELD_ProductionHeader_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="5517f3f7-05f8-92fa-9c93-51e46888a0c0")
public static String es_PE_FIELD_ProductionHeader_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraField(AD_Column_ID="Name",IsCentrallyMaintained=true,
AD_Tab_ID="ba8bae1b-fb19-0175-6d10-67f571bdcab2",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=50,SortNo=-1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5517f3f7-05f8-92fa-9c93-51e46888a0c0")
public static final String FIELDNAME_ProductionHeader_Name="5517f3f7-05f8-92fa-9c93-51e46888a0c0";

@XendraTrl(Identifier="05ed4a21-8839-7ffb-d69d-043107c41b9f")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="05ed4a21-8839-7ffb-d69d-043107c41b9f",
Synchronized="2019-08-30 22:23:27.0")
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

@XendraTrl(Identifier="d26993d0-5821-b480-5b2d-5c21f0923888")
public static String es_PE_FIELD_ProductionHeader_Posted_Name="Fijada";

@XendraTrl(Identifier="d26993d0-5821-b480-5b2d-5c21f0923888")
public static String es_PE_FIELD_ProductionHeader_Posted_Description="Las transacciones de contabilidad general han sido procesadas.";

@XendraTrl(Identifier="d26993d0-5821-b480-5b2d-5c21f0923888")
public static String es_PE_FIELD_ProductionHeader_Posted_Help="El campo fijado indica el estado de la generación de las Líneas contables a la contabilidad general.";

@XendraField(AD_Column_ID="Posted",IsCentrallyMaintained=true,
AD_Tab_ID="ba8bae1b-fb19-0175-6d10-67f571bdcab2",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@Processed@=Y & @#ShowAcct@=Y",DisplayLength=23,IsReadOnly=false,SeqNo=170,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="d26993d0-5821-b480-5b2d-5c21f0923888")
public static final String FIELDNAME_ProductionHeader_Posted="d26993d0-5821-b480-5b2d-5c21f0923888";

@XendraTrl(Identifier="6a89209e-b665-4c5f-7ec5-2ace3e7a4402")
public static String es_PE_COLUMN_Posted_Name="Fijada";

@XendraColumn(AD_Element_ID="5eb52ebc-6992-12f5-b85a-e0a136df259b",ColumnName="Posted",
AD_Reference_ID=28,AD_Reference_Value_ID="d2b659dd-6c8c-baf3-fc71-0ee997273154",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="6a89209e-b665-4c5f-7ec5-2ace3e7a4402",Synchronized="2019-08-30 22:23:27.0")
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

@XendraTrl(Identifier="fef47336-eeb8-c9ae-5006-1ccc874b7fb6")
public static String es_PE_FIELD_ProductionHeader_Processed_Name="Procesado";

@XendraTrl(Identifier="fef47336-eeb8-c9ae-5006-1ccc874b7fb6")
public static String es_PE_FIELD_ProductionHeader_Processed_Description="El documento ha sido procesado";

@XendraTrl(Identifier="fef47336-eeb8-c9ae-5006-1ccc874b7fb6")
public static String es_PE_FIELD_ProductionHeader_Processed_Help="El cuadro de verificación procesada indica que un documento ha sido procesado";

@XendraField(AD_Column_ID="Processed",IsCentrallyMaintained=true,
AD_Tab_ID="ba8bae1b-fb19-0175-6d10-67f571bdcab2",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="fef47336-eeb8-c9ae-5006-1ccc874b7fb6")
public static final String FIELDNAME_ProductionHeader_Processed="fef47336-eeb8-c9ae-5006-1ccc874b7fb6";

@XendraTrl(Identifier="7688f807-2688-92f9-f68a-81883b256fe9")
public static String es_PE_COLUMN_Processed_Name="Procesado";

@XendraColumn(AD_Element_ID="3f7035d2-fa5e-7416-fc0c-e49e43f9e083",ColumnName="Processed",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7688f807-2688-92f9-f68a-81883b256fe9",
Synchronized="2019-08-30 22:23:27.0")
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

@XendraTrl(Identifier="7e6ec6cf-a273-0f85-1e30-738a005f4082")
public static String es_PE_FIELD_ProductionHeader_ProcessNow_Name="Crear/Aplicar Producción";

@XendraTrl(Identifier="7e6ec6cf-a273-0f85-1e30-738a005f4082")
public static String es_PE_FIELD_ProductionHeader_ProcessNow_Description="Crear líneas de producción; si no están creadas; de otra manera procesa la producción";

@XendraTrl(Identifier="7e6ec6cf-a273-0f85-1e30-738a005f4082")
public static String es_PE_FIELD_ProductionHeader_ProcessNow_Help="Crear/Aplicar producción generará las líneas de producción y procesará la producción. Si las líneas de producción ya existen; entonces la producción será procesada";

@XendraField(AD_Column_ID="Processing",IsCentrallyMaintained=true,
AD_Tab_ID="ba8bae1b-fb19-0175-6d10-67f571bdcab2",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=130,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7e6ec6cf-a273-0f85-1e30-738a005f4082")
public static final String FIELDNAME_ProductionHeader_ProcessNow="7e6ec6cf-a273-0f85-1e30-738a005f4082";

@XendraTrl(Identifier="f7f31242-6242-1100-192c-edad50d0493c")
public static String es_PE_COLUMN_Processing_Name="Procesar Ahora";

@XendraColumn(AD_Element_ID="f2096404-1a98-35ec-09ea-273b3e19b7de",ColumnName="Processing",
AD_Reference_ID=28,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="e18514af-4692-648b-a9d5-830986fbec57",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="f7f31242-6242-1100-192c-edad50d0493c",Synchronized="2019-08-30 22:23:27.0")
/** Column name Processing */
public static final String COLUMNNAME_Processing = "Processing";
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

@XendraTrl(Identifier="b7b22c5e-0243-239f-9233-04100a48ebc2")
public static String es_PE_FIELD_ProductionHeader_UserList_Name="Usuario 1";

@XendraTrl(Identifier="b7b22c5e-0243-239f-9233-04100a48ebc2")
public static String es_PE_FIELD_ProductionHeader_UserList_Description="El usuario definió el elemento # 1";

@XendraTrl(Identifier="b7b22c5e-0243-239f-9233-04100a48ebc2")
public static String es_PE_FIELD_ProductionHeader_UserList_Help="El elemento definido por el usuario despliega los elementos opcionales que han sido definidos para esta combinación de cuentas";

@XendraField(AD_Column_ID="User1_ID",IsCentrallyMaintained=true,
AD_Tab_ID="ba8bae1b-fb19-0175-6d10-67f571bdcab2",AD_FieldGroup_ID="Reference",IsDisplayed=true,
DisplayLogic="@$Element_U1@=Y",DisplayLength=14,IsReadOnly=false,SeqNo=110,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="b7b22c5e-0243-239f-9233-04100a48ebc2")
public static final String FIELDNAME_ProductionHeader_UserList="b7b22c5e-0243-239f-9233-04100a48ebc2";

@XendraTrl(Identifier="cdf9dd25-e374-4e58-f9f5-000aacbf5dd6")
public static String es_PE_COLUMN_User1_ID_Name="Usuario 1";

@XendraColumn(AD_Element_ID="07453e74-aadd-d9c9-e543-837a6fdb3094",ColumnName="User1_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="5a2fe161-044f-67cb-3791-6d615980cabb",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="cdf9dd25-e374-4e58-f9f5-000aacbf5dd6",Synchronized="2019-08-30 22:23:27.0")
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

@XendraTrl(Identifier="27d8db6f-b004-5d68-0397-86ae78fa3333")
public static String es_PE_FIELD_ProductionHeader_UserList22_Name="Usuario 2";

@XendraTrl(Identifier="27d8db6f-b004-5d68-0397-86ae78fa3333")
public static String es_PE_FIELD_ProductionHeader_UserList22_Description="El usuario definió el elemento # 2";

@XendraTrl(Identifier="27d8db6f-b004-5d68-0397-86ae78fa3333")
public static String es_PE_FIELD_ProductionHeader_UserList22_Help="El elemento definido por el usuario despliega los elementos opcionales que han sido definidos para esta combinación de cuentas";

@XendraField(AD_Column_ID="User2_ID",IsCentrallyMaintained=true,
AD_Tab_ID="ba8bae1b-fb19-0175-6d10-67f571bdcab2",AD_FieldGroup_ID="Reference",IsDisplayed=true,
DisplayLogic="@$Element_U2@=Y",DisplayLength=14,IsReadOnly=false,SeqNo=120,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="27d8db6f-b004-5d68-0397-86ae78fa3333")
public static final String FIELDNAME_ProductionHeader_UserList22="27d8db6f-b004-5d68-0397-86ae78fa3333";

@XendraTrl(Identifier="5f6f36b9-760e-901b-dbc2-8fadf7e467f9")
public static String es_PE_COLUMN_User2_ID_Name="Usuario 2";

@XendraColumn(AD_Element_ID="1b668c90-6743-20a2-df62-576857d72c06",ColumnName="User2_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="6a357ab2-7bb6-fce4-ffee-8bdd855a77fc",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="5f6f36b9-760e-901b-dbc2-8fadf7e467f9",Synchronized="2019-08-30 22:23:27.0")
/** Column name User2_ID */
public static final String COLUMNNAME_User2_ID = "User2_ID";
}
