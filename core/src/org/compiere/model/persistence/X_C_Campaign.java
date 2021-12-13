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
/** Generated Model for C_Campaign
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_C_Campaign extends PO
{
/** Standard Constructor
@param ctx context
@param C_Campaign_ID id
@param trxName transaction
*/
public X_C_Campaign (Properties ctx, int C_Campaign_ID, String trxName)
{
super (ctx, C_Campaign_ID, trxName);
/** if (C_Campaign_ID == 0)
{
setC_Campaign_ID (0);
setCosts (Env.ZERO);
setIsSummary (false);	
// N
setName (null);
setValue (null);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_C_Campaign (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=274 */
public static int Table_ID=MTable.getTable_ID("C_Campaign");

@XendraTrl(Identifier="ad132603-b065-6f3d-8289-7a625d6c3b79")
public static String es_PE_TAB_CampaignDimension_Description="Mantenga el árbol de dimensión de la contabilidad de la campaña de comercialización";

@XendraTrl(Identifier="ad132603-b065-6f3d-8289-7a625d6c3b79")
public static String es_PE_TAB_CampaignDimension_Help="¡Observe por favor que usted no podrá crear entidades nuevas en esta ventana si usted no tiene defecto fijado para todos los valores obligatorios!";

@XendraTrl(Identifier="ad132603-b065-6f3d-8289-7a625d6c3b79")
public static String es_PE_TAB_CampaignDimension_Name="Dimensión de Campaña";

@XendraTab(Name="Campaign Dimension",
Description="Maintain Marketing Campaign Accounting Dimension Tree",
Help="Please note that you will not be able to create new entities in this window if you have not default set for all mandatory values! ",
AD_Window_ID="6d82a0ab-8b9a-fa56-aec1-277a04b274a1",SeqNo=70,TabLevel=0,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=true,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="ad132603-b065-6f3d-8289-7a625d6c3b79",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_CampaignDimension="ad132603-b065-6f3d-8289-7a625d6c3b79";

@XendraTrl(Identifier="0f14f978-9105-df8b-e3c7-202ae020d05f")
public static String es_PE_TAB_Campaign_Description="Campaña de Mercadeo";

@XendraTrl(Identifier="0f14f978-9105-df8b-e3c7-202ae020d05f")
public static String es_PE_TAB_Campaign_Help="La pestaña de Campaña de Mercadeo define los parámetros de una campaña. Estos incluyen una fecha de comienzo y final así como también los totales de las facturas que hayan sido procesadas dentro de esta campaña.";

@XendraTrl(Identifier="0f14f978-9105-df8b-e3c7-202ae020d05f")
public static String es_PE_TAB_Campaign_Name="Campaña";
@XendraTab(Name="Campaign",
Description="Marketing Campaign",
Help="The Marketing Campaign Tab defines the parameters for a Campaign.  These include a start and end date as well as the amount of any invoices that have been processed which reference this campaign.",
AD_Window_ID="5fbd0093-6a0b-0961-2180-55573e4d502a",SeqNo=10,TabLevel=0,IsSingleRow=true,
IsInfoTab=true,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="0f14f978-9105-df8b-e3c7-202ae020d05f",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Campaign="0f14f978-9105-df8b-e3c7-202ae020d05f";

@XendraTrl(Identifier="d89be727-25a7-dee6-12a3-6322f584fe23")
public static String es_PE_TABLE_C_Campaign_Name="Campaña";

@XendraTable(Name="Campaign",AD_Package_ID="98af94a4-a4cd-bdc0-5651-5880caf79899",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="Marketing Campaign",Help="",
TableName="C_Campaign",AccessLevel="3",AD_Window_ID="5fbd0093-6a0b-0961-2180-55573e4d502a",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=95,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.commercial",
Identifier="d89be727-25a7-dee6-12a3-6322f584fe23",Synchronized="2020-03-03 21:36:40.0")
/** TableName=C_Campaign */
public static final String Table_Name="C_Campaign";


@XendraIndex(Name="c_campaign_value",Identifier="bef1e51e-a406-ee67-1407-5b396a31da0f",
Column_Names="ad_client_id, value",IsUnique="true",
TableIdentifier="bef1e51e-a406-ee67-1407-5b396a31da0f",Synchronized="2014-06-01 19:03:58.0")
public static final String INDEXNAME_c_campaign_value = "bef1e51e-a406-ee67-1407-5b396a31da0f";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"C_Campaign");

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
    Table_ID = MTable.getTable_ID("C_Campaign");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_C_Campaign[").append(get_ID()).append("]");
return sb.toString();
}
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

@XendraTrl(Identifier="9697503e-5aea-687d-6eb2-bc0d0b86aee6")
public static String es_PE_FIELD_Campaign_BusinessPartner_Name="Socio de Negocio";

@XendraTrl(Identifier="9697503e-5aea-687d-6eb2-bc0d0b86aee6")
public static String es_PE_FIELD_Campaign_BusinessPartner_Description="Identifica un Socio de Negocio";

@XendraTrl(Identifier="9697503e-5aea-687d-6eb2-bc0d0b86aee6")
public static String es_PE_FIELD_Campaign_BusinessPartner_Help="Un socio de negocio es cualquiera con quien usted realiza transacciones. Este puede incluir Proveedores; Clientes; Empleados ó Vendedores.";

@XendraField(AD_Column_ID="C_BPartner_ID",IsCentrallyMaintained=true,
AD_Tab_ID="0f14f978-9105-df8b-e3c7-202ae020d05f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9697503e-5aea-687d-6eb2-bc0d0b86aee6")
public static final String FIELDNAME_Campaign_BusinessPartner="9697503e-5aea-687d-6eb2-bc0d0b86aee6";

@XendraTrl(Identifier="f409c95a-b377-2577-dc6f-c0a153432eec")
public static String es_PE_COLUMN_C_BPartner_ID_Name="Business Partner ";

@XendraColumn(AD_Element_ID="fe333dc3-4f40-1276-5f6a-d09bb66dc423",ColumnName="C_BPartner_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f409c95a-b377-2577-dc6f-c0a153432eec",
Synchronized="2019-08-30 22:21:16.0")
/** Column name C_BPartner_ID */
public static final String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";
/** Set Campaign.
@param C_Campaign_ID Marketing Campaign */
public void setC_Campaign_ID (int C_Campaign_ID)
{
if (C_Campaign_ID < 1) throw new IllegalArgumentException ("C_Campaign_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_Campaign_ID, Integer.valueOf(C_Campaign_ID));
}
/** Get Campaign.
@return Marketing Campaign */
public int getC_Campaign_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Campaign_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="e2a57586-d711-bee0-e29b-c5810b5d66a5")
public static String es_PE_FIELD_Campaign_Campaign_Name="Campaña";

@XendraTrl(Identifier="e2a57586-d711-bee0-e29b-c5810b5d66a5")
public static String es_PE_FIELD_Campaign_Campaign_Description="Campaña de Mercadeo";

@XendraTrl(Identifier="e2a57586-d711-bee0-e29b-c5810b5d66a5")
public static String es_PE_FIELD_Campaign_Campaign_Help="La Campaña define un programa de mercadotecnia único. Los proyectos pueden estar asociados con una campaña de mercadotecnia única. Usted puede entonces reportar basado en una campaña específica";

@XendraField(AD_Column_ID="C_Campaign_ID",IsCentrallyMaintained=true,
AD_Tab_ID="0f14f978-9105-df8b-e3c7-202ae020d05f",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e2a57586-d711-bee0-e29b-c5810b5d66a5")
public static final String FIELDNAME_Campaign_Campaign="e2a57586-d711-bee0-e29b-c5810b5d66a5";

@XendraTrl(Identifier="141eaf88-f6f2-b031-91d3-d6af76628841")
public static String es_PE_FIELD_CampaignDimension_Campaign_Name="Campaña";

@XendraTrl(Identifier="141eaf88-f6f2-b031-91d3-d6af76628841")
public static String es_PE_FIELD_CampaignDimension_Campaign_Description="Campaña de Mercadeo";

@XendraTrl(Identifier="141eaf88-f6f2-b031-91d3-d6af76628841")
public static String es_PE_FIELD_CampaignDimension_Campaign_Help="La Campaña define un programa de mercadotecnia único. Los proyectos pueden estar asociados con una campaña de mercadotecnia única. Usted puede entonces reportar basado en una campaña específica";

@XendraField(AD_Column_ID="C_Campaign_ID",IsCentrallyMaintained=true,
AD_Tab_ID="ad132603-b065-6f3d-8289-7a625d6c3b79",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=10,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="141eaf88-f6f2-b031-91d3-d6af76628841")
public static final String FIELDNAME_CampaignDimension_Campaign="141eaf88-f6f2-b031-91d3-d6af76628841";
/** Column name C_Campaign_ID */
public static final String COLUMNNAME_C_Campaign_ID = "C_Campaign_ID";
/** Set Channel.
@param C_Channel_ID Sales Channel */
public void setC_Channel_ID (int C_Channel_ID)
{
if (C_Channel_ID <= 0) set_Value (COLUMNNAME_C_Channel_ID, null);
 else 
set_Value (COLUMNNAME_C_Channel_ID, Integer.valueOf(C_Channel_ID));
}
/** Get Channel.
@return Sales Channel */
public int getC_Channel_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Channel_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="e5bc9d58-89fe-2edc-a946-f75864066e89")
public static String es_PE_FIELD_Campaign_Channel_Name="Canal";

@XendraTrl(Identifier="e5bc9d58-89fe-2edc-a946-f75864066e89")
public static String es_PE_FIELD_Campaign_Channel_Description="Canal de Ventas";

@XendraTrl(Identifier="e5bc9d58-89fe-2edc-a946-f75864066e89")
public static String es_PE_FIELD_Campaign_Channel_Help="El Canal de Ventas identifica un canal (o método) de generación de ventas";

@XendraField(AD_Column_ID="C_Channel_ID",IsCentrallyMaintained=true,
AD_Tab_ID="0f14f978-9105-df8b-e3c7-202ae020d05f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e5bc9d58-89fe-2edc-a946-f75864066e89")
public static final String FIELDNAME_Campaign_Channel="e5bc9d58-89fe-2edc-a946-f75864066e89";

@XendraTrl(Identifier="83e4a751-0d69-6ea8-7a74-6da70ae795c3")
public static String es_PE_FIELD_CampaignDimension_Channel_Name="Canal";

@XendraTrl(Identifier="83e4a751-0d69-6ea8-7a74-6da70ae795c3")
public static String es_PE_FIELD_CampaignDimension_Channel_Description="Canal de Ventas";

@XendraTrl(Identifier="83e4a751-0d69-6ea8-7a74-6da70ae795c3")
public static String es_PE_FIELD_CampaignDimension_Channel_Help="El Canal de Ventas identifica un canal (o método) de generación de ventas";

@XendraField(AD_Column_ID="C_Channel_ID",IsCentrallyMaintained=true,
AD_Tab_ID="ad132603-b065-6f3d-8289-7a625d6c3b79",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=120,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="83e4a751-0d69-6ea8-7a74-6da70ae795c3")
public static final String FIELDNAME_CampaignDimension_Channel="83e4a751-0d69-6ea8-7a74-6da70ae795c3";

@XendraTrl(Identifier="286a9675-8584-5ba1-f22f-9f802585f74b")
public static String es_PE_COLUMN_C_Channel_ID_Name="Canal";

@XendraColumn(AD_Element_ID="a09f7327-e57d-5d8c-945a-65677c758bd1",ColumnName="C_Channel_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="286a9675-8584-5ba1-f22f-9f802585f74b",
Synchronized="2019-08-30 22:21:16.0")
/** Column name C_Channel_ID */
public static final String COLUMNNAME_C_Channel_ID = "C_Channel_ID";
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

@XendraTrl(Identifier="d3658177-c261-435c-c544-76dc71a1d599")
public static String es_PE_FIELD_Campaign_CopyFrom_Name="Copiar Desde";

@XendraTrl(Identifier="d3658177-c261-435c-c544-76dc71a1d599")
public static String es_PE_FIELD_Campaign_CopyFrom_Description="Copiar registros desde";

@XendraTrl(Identifier="d3658177-c261-435c-c544-76dc71a1d599")
public static String es_PE_FIELD_Campaign_CopyFrom_Help="Copiar registros desde";

@XendraField(AD_Column_ID="CopyFrom",IsCentrallyMaintained=true,
AD_Tab_ID="0f14f978-9105-df8b-e3c7-202ae020d05f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d3658177-c261-435c-c544-76dc71a1d599")
public static final String FIELDNAME_Campaign_CopyFrom="d3658177-c261-435c-c544-76dc71a1d599";

@XendraTrl(Identifier="10531dc6-7544-dd12-81ca-9eb933b8a502")
public static String es_PE_COLUMN_CopyFrom_Name="Copy From";

@XendraColumn(AD_Element_ID="2d763fac-73d8-32e6-3aa1-e987486f2022",ColumnName="CopyFrom",
AD_Reference_ID=28,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="0970ba02-d845-110d-3452-aa7409db4474",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="10531dc6-7544-dd12-81ca-9eb933b8a502",Synchronized="2019-08-30 22:21:16.0")
/** Column name CopyFrom */
public static final String COLUMNNAME_CopyFrom = "CopyFrom";
/** Set Costs.
@param Costs Costs in accounting currency */
public void setCosts (BigDecimal Costs)
{
if (Costs == null) throw new IllegalArgumentException ("Costs is mandatory.");
set_Value (COLUMNNAME_Costs, Costs);
}
/** Get Costs.
@return Costs in accounting currency */
public BigDecimal getCosts() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Costs);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="8ce0a5a1-22d1-e0a0-4cf7-aa4c647f42c9")
public static String es_PE_FIELD_Campaign_Costs_Name="Costos";

@XendraTrl(Identifier="8ce0a5a1-22d1-e0a0-4cf7-aa4c647f42c9")
public static String es_PE_FIELD_Campaign_Costs_Description="Costos en la moneda contable";

@XendraTrl(Identifier="8ce0a5a1-22d1-e0a0-4cf7-aa4c647f42c9")
public static String es_PE_FIELD_Campaign_Costs_Help="El costo indica el costo de una campaña en una moneda contable de una organización";

@XendraField(AD_Column_ID="Costs",IsCentrallyMaintained=true,
AD_Tab_ID="0f14f978-9105-df8b-e3c7-202ae020d05f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=130,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8ce0a5a1-22d1-e0a0-4cf7-aa4c647f42c9")
public static final String FIELDNAME_Campaign_Costs="8ce0a5a1-22d1-e0a0-4cf7-aa4c647f42c9";

@XendraTrl(Identifier="9373a2ce-8e3d-9c84-56b4-e1b66b3783a9")
public static String es_PE_FIELD_CampaignDimension_Costs_Name="Costos";

@XendraTrl(Identifier="9373a2ce-8e3d-9c84-56b4-e1b66b3783a9")
public static String es_PE_FIELD_CampaignDimension_Costs_Description="Costos en la moneda contable";

@XendraTrl(Identifier="9373a2ce-8e3d-9c84-56b4-e1b66b3783a9")
public static String es_PE_FIELD_CampaignDimension_Costs_Help="El costo indica el costo de una campaña en una moneda contable de una organización";

@XendraField(AD_Column_ID="Costs",IsCentrallyMaintained=true,
AD_Tab_ID="ad132603-b065-6f3d-8289-7a625d6c3b79",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9373a2ce-8e3d-9c84-56b4-e1b66b3783a9")
public static final String FIELDNAME_CampaignDimension_Costs="9373a2ce-8e3d-9c84-56b4-e1b66b3783a9";

@XendraTrl(Identifier="ad5a4caa-51db-e27e-e8a6-d3a46a2ed8e6")
public static String es_PE_COLUMN_Costs_Name="Costos";

@XendraColumn(AD_Element_ID="a1fedbdf-558b-e4fd-d79a-b7fca1bac5ac",ColumnName="Costs",
AD_Reference_ID=37,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ad5a4caa-51db-e27e-e8a6-d3a46a2ed8e6",
Synchronized="2019-08-30 22:21:16.0")
/** Column name Costs */
public static final String COLUMNNAME_Costs = "Costs";
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

@XendraTrl(Identifier="95005145-42b3-de47-7382-cae60ff54b14")
public static String es_PE_FIELD_Campaign_Description_Name="Observación";

@XendraTrl(Identifier="95005145-42b3-de47-7382-cae60ff54b14")
public static String es_PE_FIELD_Campaign_Description_Description="Observación corta opcional del registro";

@XendraTrl(Identifier="95005145-42b3-de47-7382-cae60ff54b14")
public static String es_PE_FIELD_Campaign_Description_Help="Una Observación esta limitada a 255 caracteres";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="0f14f978-9105-df8b-e3c7-202ae020d05f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="95005145-42b3-de47-7382-cae60ff54b14")
public static final String FIELDNAME_Campaign_Description="95005145-42b3-de47-7382-cae60ff54b14";

@XendraTrl(Identifier="088eebbc-4b93-ebd6-5042-5755c3a79db4")
public static String es_PE_FIELD_CampaignDimension_Description_Name="Observación";

@XendraTrl(Identifier="088eebbc-4b93-ebd6-5042-5755c3a79db4")
public static String es_PE_FIELD_CampaignDimension_Description_Description="Observación corta opcional del registro";

@XendraTrl(Identifier="088eebbc-4b93-ebd6-5042-5755c3a79db4")
public static String es_PE_FIELD_CampaignDimension_Description_Help="Una Observación esta limitada a 255 caracteres";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="ad132603-b065-6f3d-8289-7a625d6c3b79",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="088eebbc-4b93-ebd6-5042-5755c3a79db4")
public static final String FIELDNAME_CampaignDimension_Description="088eebbc-4b93-ebd6-5042-5755c3a79db4";

@XendraTrl(Identifier="cb052bc0-6021-405b-0f0f-1b2cf4f5244e")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="cb052bc0-6021-405b-0f0f-1b2cf4f5244e",
Synchronized="2019-08-30 22:21:16.0")
/** Column name Description */
public static final String COLUMNNAME_Description = "Description";
/** Set End Date.
@param EndDate Last effective date (inclusive) */
public void setEndDate (Timestamp EndDate)
{
set_Value (COLUMNNAME_EndDate, EndDate);
}
/** Get End Date.
@return Last effective date (inclusive) */
public Timestamp getEndDate() 
{
return (Timestamp)get_Value(COLUMNNAME_EndDate);
}

@XendraTrl(Identifier="ebc3c85e-6fb9-c88b-0858-70e380b96c85")
public static String es_PE_FIELD_Campaign_EndDate_Name="Fecha Final";

@XendraTrl(Identifier="ebc3c85e-6fb9-c88b-0858-70e380b96c85")
public static String es_PE_FIELD_Campaign_EndDate_Description="Última fecha efectiva (inclusive)";

@XendraTrl(Identifier="ebc3c85e-6fb9-c88b-0858-70e380b96c85")
public static String es_PE_FIELD_Campaign_EndDate_Help="La fecha final indica la última fecha en este rango.";

@XendraField(AD_Column_ID="EndDate",IsCentrallyMaintained=true,
AD_Tab_ID="0f14f978-9105-df8b-e3c7-202ae020d05f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=120,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ebc3c85e-6fb9-c88b-0858-70e380b96c85")
public static final String FIELDNAME_Campaign_EndDate="ebc3c85e-6fb9-c88b-0858-70e380b96c85";

@XendraTrl(Identifier="1683320b-4ea6-6dcb-2ce5-8d4ee20a9c0a")
public static String es_PE_FIELD_CampaignDimension_EndDate_Name="Fecha Final";

@XendraTrl(Identifier="1683320b-4ea6-6dcb-2ce5-8d4ee20a9c0a")
public static String es_PE_FIELD_CampaignDimension_EndDate_Description="Última fecha efectiva (inclusive)";

@XendraTrl(Identifier="1683320b-4ea6-6dcb-2ce5-8d4ee20a9c0a")
public static String es_PE_FIELD_CampaignDimension_EndDate_Help="La fecha final indica la última fecha en este rango.";

@XendraField(AD_Column_ID="EndDate",IsCentrallyMaintained=true,
AD_Tab_ID="ad132603-b065-6f3d-8289-7a625d6c3b79",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1683320b-4ea6-6dcb-2ce5-8d4ee20a9c0a")
public static final String FIELDNAME_CampaignDimension_EndDate="1683320b-4ea6-6dcb-2ce5-8d4ee20a9c0a";

@XendraTrl(Identifier="6d41ce3c-729f-d05f-a446-6ffed4425aca")
public static String es_PE_COLUMN_EndDate_Name="Fecha Final";

@XendraColumn(AD_Element_ID="16fae692-c943-4a1f-732e-bfce5aecb4b3",ColumnName="EndDate",
AD_Reference_ID=15,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6d41ce3c-729f-d05f-a446-6ffed4425aca",
Synchronized="2019-08-30 22:21:16.0")
/** Column name EndDate */
public static final String COLUMNNAME_EndDate = "EndDate";
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
@XendraTrl(Identifier="b355a834-e0fd-4422-9cbc-af07b01ab112")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b355a834-e0fd-4422-9cbc-af07b01ab112",
Synchronized="2019-08-30 22:21:16.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
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

@XendraTrl(Identifier="d05fb681-954e-d2da-acbd-e1d2af29b57c")
public static String es_PE_FIELD_Campaign_SummaryLevel_Name="Entidad Acumulada";

@XendraTrl(Identifier="d05fb681-954e-d2da-acbd-e1d2af29b57c")
public static String es_PE_FIELD_Campaign_SummaryLevel_Description="Esta es una entidad sumaria";

@XendraTrl(Identifier="d05fb681-954e-d2da-acbd-e1d2af29b57c")
public static String es_PE_FIELD_Campaign_SummaryLevel_Help="Una entidad sumaria representa una rama en un árbol mas bien que un nodo final. Las entidades sumarias son usadas para reportar y no tienen valores propios";

@XendraField(AD_Column_ID="IsSummary",IsCentrallyMaintained=true,
AD_Tab_ID="0f14f978-9105-df8b-e3c7-202ae020d05f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d05fb681-954e-d2da-acbd-e1d2af29b57c")
public static final String FIELDNAME_Campaign_SummaryLevel="d05fb681-954e-d2da-acbd-e1d2af29b57c";

@XendraTrl(Identifier="f4a9c62a-9b38-6767-14e5-2dc321e96c55")
public static String es_PE_FIELD_CampaignDimension_SummaryLevel_Name="Entidad Acumulada";

@XendraTrl(Identifier="f4a9c62a-9b38-6767-14e5-2dc321e96c55")
public static String es_PE_FIELD_CampaignDimension_SummaryLevel_Description="Esta es una entidad sumaria";

@XendraTrl(Identifier="f4a9c62a-9b38-6767-14e5-2dc321e96c55")
public static String es_PE_FIELD_CampaignDimension_SummaryLevel_Help="Una entidad sumaria representa una rama en un árbol mas bien que un nodo final. Las entidades sumarias son usadas para reportar y no tienen valores propios";

@XendraField(AD_Column_ID="IsSummary",IsCentrallyMaintained=true,
AD_Tab_ID="ad132603-b065-6f3d-8289-7a625d6c3b79",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f4a9c62a-9b38-6767-14e5-2dc321e96c55")
public static final String FIELDNAME_CampaignDimension_SummaryLevel="f4a9c62a-9b38-6767-14e5-2dc321e96c55";

@XendraTrl(Identifier="f29ade43-786e-72f1-73a9-e37fc9086625")
public static String es_PE_COLUMN_IsSummary_Name="Entidad Acumulada";

@XendraColumn(AD_Element_ID="0ecd1d56-9e2b-8778-7b05-92730d811ad4",ColumnName="IsSummary",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f29ade43-786e-72f1-73a9-e37fc9086625",
Synchronized="2019-08-30 22:21:16.0")
/** Column name IsSummary */
public static final String COLUMNNAME_IsSummary = "IsSummary";
/** Set Product Brand.
@param M_Product_Brand_ID Brand of a Product */
public void setM_Product_Brand_ID (int M_Product_Brand_ID)
{
if (M_Product_Brand_ID <= 0) set_Value (COLUMNNAME_M_Product_Brand_ID, null);
 else 
set_Value (COLUMNNAME_M_Product_Brand_ID, Integer.valueOf(M_Product_Brand_ID));
}
/** Get Product Brand.
@return Brand of a Product */
public int getM_Product_Brand_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_Product_Brand_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="92500506-33b6-8124-1a88-a27afc839e24")
public static String es_PE_FIELD_Campaign_ProductBrand_Name="Linea";

@XendraTrl(Identifier="92500506-33b6-8124-1a88-a27afc839e24")
public static String es_PE_FIELD_Campaign_ProductBrand_Description="";

@XendraTrl(Identifier="92500506-33b6-8124-1a88-a27afc839e24")
public static String es_PE_FIELD_Campaign_ProductBrand_Help="";

@XendraField(AD_Column_ID="M_Product_Brand_ID",IsCentrallyMaintained=true,
AD_Tab_ID="0f14f978-9105-df8b-e3c7-202ae020d05f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="92500506-33b6-8124-1a88-a27afc839e24")
public static final String FIELDNAME_Campaign_ProductBrand="92500506-33b6-8124-1a88-a27afc839e24";

@XendraTrl(Identifier="8b77857a-62bf-a4b6-62b5-9328c9f76b12")
public static String es_PE_COLUMN_M_Product_Brand_ID_Name="Product Brand";

@XendraColumn(AD_Element_ID="028aa2e6-3ac7-548f-6575-e61a07ea3e9e",ColumnName="M_Product_Brand_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="8b77857a-62bf-a4b6-62b5-9328c9f76b12",
Synchronized="2019-08-30 22:21:16.0")
/** Column name M_Product_Brand_ID */
public static final String COLUMNNAME_M_Product_Brand_ID = "M_Product_Brand_ID";
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

@XendraTrl(Identifier="fd307eb6-0a40-7cb6-eda8-b0dffd5eba2b")
public static String es_PE_FIELD_Campaign_Name_Name="Nombre";

@XendraTrl(Identifier="fd307eb6-0a40-7cb6-eda8-b0dffd5eba2b")
public static String es_PE_FIELD_Campaign_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="fd307eb6-0a40-7cb6-eda8-b0dffd5eba2b")
public static String es_PE_FIELD_Campaign_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraField(AD_Column_ID="Name",IsCentrallyMaintained=true,
AD_Tab_ID="0f14f978-9105-df8b-e3c7-202ae020d05f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=40,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="fd307eb6-0a40-7cb6-eda8-b0dffd5eba2b")
public static final String FIELDNAME_Campaign_Name="fd307eb6-0a40-7cb6-eda8-b0dffd5eba2b";

@XendraTrl(Identifier="6ef576b9-4ac5-6a51-7f90-bf7fc33b554f")
public static String es_PE_FIELD_CampaignDimension_Name_Name="Nombre";

@XendraTrl(Identifier="6ef576b9-4ac5-6a51-7f90-bf7fc33b554f")
public static String es_PE_FIELD_CampaignDimension_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="6ef576b9-4ac5-6a51-7f90-bf7fc33b554f")
public static String es_PE_FIELD_CampaignDimension_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraField(AD_Column_ID="Name",IsCentrallyMaintained=true,
AD_Tab_ID="ad132603-b065-6f3d-8289-7a625d6c3b79",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6ef576b9-4ac5-6a51-7f90-bf7fc33b554f")
public static final String FIELDNAME_CampaignDimension_Name="6ef576b9-4ac5-6a51-7f90-bf7fc33b554f";

@XendraTrl(Identifier="b9181f57-d998-2ac5-25e8-9882819d7c5c")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b9181f57-d998-2ac5-25e8-9882819d7c5c",
Synchronized="2019-08-30 22:21:16.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
/** Set Start Date.
@param StartDate First effective day (inclusive) */
public void setStartDate (Timestamp StartDate)
{
set_Value (COLUMNNAME_StartDate, StartDate);
}
/** Get Start Date.
@return First effective day (inclusive) */
public Timestamp getStartDate() 
{
return (Timestamp)get_Value(COLUMNNAME_StartDate);
}

@XendraTrl(Identifier="fb95f0c4-3e27-c777-9672-93c0e24cdfbf")
public static String es_PE_FIELD_Campaign_StartDate_Name="Fecha de Inicio";

@XendraTrl(Identifier="fb95f0c4-3e27-c777-9672-93c0e24cdfbf")
public static String es_PE_FIELD_Campaign_StartDate_Description="Primer día efectivo (inclusive)";

@XendraTrl(Identifier="fb95f0c4-3e27-c777-9672-93c0e24cdfbf")
public static String es_PE_FIELD_Campaign_StartDate_Help="La fecha de Inicio indica la primera fecha ó fecha inicial de un rango";

@XendraField(AD_Column_ID="StartDate",IsCentrallyMaintained=true,
AD_Tab_ID="0f14f978-9105-df8b-e3c7-202ae020d05f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="fb95f0c4-3e27-c777-9672-93c0e24cdfbf")
public static final String FIELDNAME_Campaign_StartDate="fb95f0c4-3e27-c777-9672-93c0e24cdfbf";

@XendraTrl(Identifier="17403715-d99f-1268-2846-e41999fa398b")
public static String es_PE_FIELD_CampaignDimension_StartDate_Name="Fecha de Inicio";

@XendraTrl(Identifier="17403715-d99f-1268-2846-e41999fa398b")
public static String es_PE_FIELD_CampaignDimension_StartDate_Description="Primer día efectivo (inclusive)";

@XendraTrl(Identifier="17403715-d99f-1268-2846-e41999fa398b")
public static String es_PE_FIELD_CampaignDimension_StartDate_Help="La fecha de Inicio indica la primera fecha ó fecha inicial de un rango";

@XendraField(AD_Column_ID="StartDate",IsCentrallyMaintained=true,
AD_Tab_ID="ad132603-b065-6f3d-8289-7a625d6c3b79",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=20,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="17403715-d99f-1268-2846-e41999fa398b")
public static final String FIELDNAME_CampaignDimension_StartDate="17403715-d99f-1268-2846-e41999fa398b";

@XendraTrl(Identifier="a5d56eaf-fca1-82c9-cf90-0888cdced669")
public static String es_PE_COLUMN_StartDate_Name="Fecha de Inicio";

@XendraColumn(AD_Element_ID="3fe42406-cab3-a569-bf0b-3614f5d95711",ColumnName="StartDate",
AD_Reference_ID=15,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a5d56eaf-fca1-82c9-cf90-0888cdced669",
Synchronized="2019-08-30 22:21:16.0")
/** Column name StartDate */
public static final String COLUMNNAME_StartDate = "StartDate";
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
@XendraTrl(Identifier="50edf64e-57dd-4f6b-6c0d-3332d81f5024")
public static String es_PE_FIELD_Campaign_SearchKey_Name="Clave de Búsqueda";

@XendraTrl(Identifier="50edf64e-57dd-4f6b-6c0d-3332d81f5024")
public static String es_PE_FIELD_Campaign_SearchKey_Description="Clave de búsqueda para el registro en el formato requerido; debe ser única";

@XendraTrl(Identifier="50edf64e-57dd-4f6b-6c0d-3332d81f5024")
public static String es_PE_FIELD_Campaign_SearchKey_Help="Una clave de búsqueda le permite a usted un método rápido de encontrar un registro en particular";

@XendraField(AD_Column_ID="Value",IsCentrallyMaintained=true,
AD_Tab_ID="0f14f978-9105-df8b-e3c7-202ae020d05f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="50edf64e-57dd-4f6b-6c0d-3332d81f5024")
public static final String FIELDNAME_Campaign_SearchKey="50edf64e-57dd-4f6b-6c0d-3332d81f5024";

@XendraTrl(Identifier="4f603bdb-cd3c-c10e-0187-eb1e0903186b")
public static String es_PE_FIELD_CampaignDimension_SearchKey_Name="Clave de Búsqueda";

@XendraTrl(Identifier="4f603bdb-cd3c-c10e-0187-eb1e0903186b")
public static String es_PE_FIELD_CampaignDimension_SearchKey_Description="Clave de búsqueda para el registro en el formato requerido; debe ser única";

@XendraTrl(Identifier="4f603bdb-cd3c-c10e-0187-eb1e0903186b")
public static String es_PE_FIELD_CampaignDimension_SearchKey_Help="Una clave de búsqueda le permite a usted un método rápido de encontrar un registro en particular";

@XendraField(AD_Column_ID="Value",IsCentrallyMaintained=true,
AD_Tab_ID="ad132603-b065-6f3d-8289-7a625d6c3b79",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=40,IsReadOnly=false,SeqNo=70,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="4f603bdb-cd3c-c10e-0187-eb1e0903186b")
public static final String FIELDNAME_CampaignDimension_SearchKey="4f603bdb-cd3c-c10e-0187-eb1e0903186b";

@XendraTrl(Identifier="ad93054f-0995-7536-5cc1-5bf0fcb0d196")
public static String es_PE_COLUMN_Value_Name="Clave de Búsqueda";

@XendraColumn(AD_Element_ID="e75e100c-9b41-a643-2cb3-46eeced683d8",ColumnName="Value",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ad93054f-0995-7536-5cc1-5bf0fcb0d196",
Synchronized="2019-08-30 22:21:17.0")
/** Column name Value */
public static final String COLUMNNAME_Value = "Value";
}
