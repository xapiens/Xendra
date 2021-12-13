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
/** Generated Model for C_InvoiceBatchLine
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_C_InvoiceBatchLine extends PO
{
/** Standard Constructor
@param ctx context
@param C_InvoiceBatchLine_ID id
@param trxName transaction
*/
public X_C_InvoiceBatchLine (Properties ctx, int C_InvoiceBatchLine_ID, String trxName)
{
super (ctx, C_InvoiceBatchLine_ID, trxName);
/** if (C_InvoiceBatchLine_ID == 0)
{
setC_BPartner_ID (0);	
// @C_BPartner_ID@
setC_BPartner_Location_ID (0);	
// @C_BPartner_Location_ID@
setC_Charge_ID (0);
setC_DocType_ID (0);	
// @C_DocType_ID@
setC_InvoiceBatch_ID (0);
setC_InvoiceBatchLine_ID (0);
setC_Tax_ID (0);
setDateAcct (new Timestamp(System.currentTimeMillis()));	
// @DateAcct@;
@DateDoc@
setDateInvoiced (new Timestamp(System.currentTimeMillis()));	
// @DateInvoiced@;
@DateDoc@
setDocumentNo (null);	
// @DocumentNo@
setIsTaxIncluded (false);	
// @IsTaxIncluded@
setLine (0);	
// @SQL=SELECT COALESCE(MAX(Line),0)+10 AS DefaultValue FROM C_InvoiceBatchLine WHERE C_InvoiceBatch_ID=@C_InvoiceBatch_ID@
setLineNetAmt (Env.ZERO);	
// 0
setLineTotalAmt (Env.ZERO);	
// 0
setPriceEntered (Env.ZERO);	
// 0
setProcessed (false);	
// N
setQtyEntered (Env.ZERO);	
// 1
setTaxAmt (Env.ZERO);	
// 0
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_C_InvoiceBatchLine (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=768 */
public static int Table_ID=MTable.getTable_ID("C_InvoiceBatchLine");

@XendraTrl(Identifier="95cfad9b-c387-9e38-a7fe-920e4b524349")
public static String es_PE_TAB_BatchLine_Description="Incorpore la línea de lote de la factura del costo.";

@XendraTrl(Identifier="95cfad9b-c387-9e38-a7fe-920e4b524349")
public static String es_PE_TAB_BatchLine_Help="Se crea una nueva factura, si hay un diverso número de documento, socio de negocio ó localización (dirección).Observe que el número de documento puede ser sobreescrito - dependiendo del control de número del tipo seleccionado del documento.";

@XendraTrl(Identifier="95cfad9b-c387-9e38-a7fe-920e4b524349")
public static String es_PE_TAB_BatchLine_Name="Linea de Lote";
@XendraTab(Name="Batch Line",
Description="Enter Expense Invoice Batch Line",
Help="A new invoice is created, if there is a different Document Number, Business Partner or Location (address). Note that the Document Number may be overwritten - depending on the Number control of the selected Document Type.",
AD_Window_ID="7230d536-ef19-160d-ca94-4a751924cb94",SeqNo=20,TabLevel=1,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="@Processed@=Y",
DisplayLogic="",IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="95cfad9b-c387-9e38-a7fe-920e4b524349",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_BatchLine="95cfad9b-c387-9e38-a7fe-920e4b524349";

@XendraTrl(Identifier="e55958f6-4be1-c153-0523-f9bbf0059e68")
public static String es_PE_TABLE_C_InvoiceBatchLine_Name="Linea Lote de Facturas ";

@XendraTable(Name="Invoice Batch Line",AD_Package_ID="98af94a4-a4cd-bdc0-5651-5880caf79899",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="Expense Invoice Batch Line",
Help="",TableName="C_InvoiceBatchLine",AccessLevel="1",
AD_Window_ID="7230d536-ef19-160d-ca94-4a751924cb94",AD_Val_Rule_ID="",IsKey=1,LoadSeq=145,
IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,IsView=false,
PO_Window_ID="",ID="org.xendra.commercial",Identifier="e55958f6-4be1-c153-0523-f9bbf0059e68",
Synchronized="2020-03-03 21:37:00.0")
/** TableName=C_InvoiceBatchLine */
public static final String Table_Name="C_InvoiceBatchLine";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"C_InvoiceBatchLine");

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
    Table_ID = MTable.getTable_ID("C_InvoiceBatchLine");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_C_InvoiceBatchLine[").append(get_ID()).append("]");
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

@XendraTrl(Identifier="f5e95f8e-6f6d-6e42-bac5-1d0e3361cca7")
public static String es_PE_FIELD_BatchLine_TrxOrganization_Name="Organización de la Trans.";

@XendraTrl(Identifier="f5e95f8e-6f6d-6e42-bac5-1d0e3361cca7")
public static String es_PE_FIELD_BatchLine_TrxOrganization_Description="Organización que inicia ó ejecuta la transacción";

@XendraTrl(Identifier="f5e95f8e-6f6d-6e42-bac5-1d0e3361cca7")
public static String es_PE_FIELD_BatchLine_TrxOrganization_Help="La organización que inicia ó ejecuta la transacción (para otra organización). La organización poseedora puede no ser la organización de la transacción en un ambiente de buró de servicio; con servicios centralizados y transacciones inter- organización.";

@XendraField(AD_Column_ID="AD_OrgTrx_ID",IsCentrallyMaintained=true,
AD_Tab_ID="95cfad9b-c387-9e38-a7fe-920e4b524349",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@$Element_OT@=Y",DisplayLength=14,IsReadOnly=false,SeqNo=230,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="f5e95f8e-6f6d-6e42-bac5-1d0e3361cca7")
public static final String FIELDNAME_BatchLine_TrxOrganization="f5e95f8e-6f6d-6e42-bac5-1d0e3361cca7";

@XendraTrl(Identifier="80be2c5a-b656-1000-a139-c7a3afe157b7")
public static String es_PE_COLUMN_AD_OrgTrx_ID_Name="Organización de la Trans.";

@XendraColumn(AD_Element_ID="b4180358-67aa-fe55-0409-6367a60e0a2e",ColumnName="AD_OrgTrx_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="54e78591-f7f4-c613-ea27-e64b3dac5198",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="80be2c5a-b656-1000-a139-c7a3afe157b7",Synchronized="2019-08-30 22:21:39.0")
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

@XendraTrl(Identifier="ddf49577-4460-bdd7-eddb-a10c83e5588e")
public static String es_PE_FIELD_BatchLine_UserContact_Name="Usuario";

@XendraTrl(Identifier="ddf49577-4460-bdd7-eddb-a10c83e5588e")
public static String es_PE_FIELD_BatchLine_UserContact_Description="ID de Usuario dentro del sistema";

@XendraTrl(Identifier="ddf49577-4460-bdd7-eddb-a10c83e5588e")
public static String es_PE_FIELD_BatchLine_UserContact_Help="La ID de usuario identifica un usuario único en el sistema";

@XendraField(AD_Column_ID="AD_User_ID",IsCentrallyMaintained=true,
AD_Tab_ID="95cfad9b-c387-9e38-a7fe-920e4b524349",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=120,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ddf49577-4460-bdd7-eddb-a10c83e5588e")
public static final String FIELDNAME_BatchLine_UserContact="ddf49577-4460-bdd7-eddb-a10c83e5588e";

@XendraTrl(Identifier="d3d91385-a76c-3fb0-17c7-00ad27ee82e4")
public static String es_PE_COLUMN_AD_User_ID_Name="Usuario";

@XendraColumn(AD_Element_ID="abdf8dee-d3cd-73ec-c758-683e907797f4",ColumnName="AD_User_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="f4ac36a1-4200-1386-677e-14ac90afb4fe",
FieldLength=22,DefaultValue="@AD_User_ID@",IsKey=false,IsInternal=false,IsParent=false,
IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="",VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="d3d91385-a76c-3fb0-17c7-00ad27ee82e4",Synchronized="2019-08-30 22:21:39.0")
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

@XendraTrl(Identifier="2f9db1af-f031-1b68-ae33-473ce80661a9")
public static String es_PE_FIELD_BatchLine_Activity_Name="Tipo de Gasto";

@XendraTrl(Identifier="2f9db1af-f031-1b68-ae33-473ce80661a9")
public static String es_PE_FIELD_BatchLine_Activity_Description="Actividad de Negocio";

@XendraTrl(Identifier="2f9db1af-f031-1b68-ae33-473ce80661a9")
public static String es_PE_FIELD_BatchLine_Activity_Help="Las actividades indican tareas que son ejecutadas en el curso de un negocio; las actividades son usadas para el costeo por actividad (ABC)";

@XendraField(AD_Column_ID="C_Activity_ID",IsCentrallyMaintained=true,
AD_Tab_ID="95cfad9b-c387-9e38-a7fe-920e4b524349",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@$Element_AY@='Y'",DisplayLength=14,IsReadOnly=false,SeqNo=220,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="2f9db1af-f031-1b68-ae33-473ce80661a9")
public static final String FIELDNAME_BatchLine_Activity="2f9db1af-f031-1b68-ae33-473ce80661a9";

@XendraTrl(Identifier="503e3cfd-fcd5-8b5e-167d-11f9ad273d73")
public static String es_PE_COLUMN_C_Activity_ID_Name="Tipo de Gasto";

@XendraColumn(AD_Element_ID="bfeadbb3-d866-26e3-8eee-3e2fdf0ff753",ColumnName="C_Activity_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="503e3cfd-fcd5-8b5e-167d-11f9ad273d73",
Synchronized="2019-08-30 22:21:39.0")
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

@XendraTrl(Identifier="a17fb662-0e5f-faaf-0f09-4cb8f0453cfb")
public static String es_PE_FIELD_BatchLine_BusinessPartner_Name="Socio de Negocio";

@XendraTrl(Identifier="a17fb662-0e5f-faaf-0f09-4cb8f0453cfb")
public static String es_PE_FIELD_BatchLine_BusinessPartner_Description="Identifica un Socio de Negocio";

@XendraTrl(Identifier="a17fb662-0e5f-faaf-0f09-4cb8f0453cfb")
public static String es_PE_FIELD_BatchLine_BusinessPartner_Help="Un socio de negocio es cualquiera con quien usted realiza transacciones. Este puede incluir Proveedores; Clientes; Empleados ó Vendedores.";

@XendraField(AD_Column_ID="C_BPartner_ID",IsCentrallyMaintained=true,
AD_Tab_ID="95cfad9b-c387-9e38-a7fe-920e4b524349",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a17fb662-0e5f-faaf-0f09-4cb8f0453cfb")
public static final String FIELDNAME_BatchLine_BusinessPartner="a17fb662-0e5f-faaf-0f09-4cb8f0453cfb";

@XendraTrl(Identifier="d2adca18-6657-2493-e2f5-8e99a8e8b441")
public static String es_PE_COLUMN_C_BPartner_ID_Name="Socio de Negocio";

@XendraColumn(AD_Element_ID="fe333dc3-4f40-1276-5f6a-d09bb66dc423",ColumnName="C_BPartner_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="06fdbbe9-e1c4-3ee4-4a9d-73d1a990cc42",
FieldLength=22,DefaultValue="@C_BPartner_ID@",IsKey=false,IsInternal=false,IsParent=false,
IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="org.compiere.model.CalloutInvoiceBatch.bPartner",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d2adca18-6657-2493-e2f5-8e99a8e8b441",
Synchronized="2019-08-30 22:21:39.0")
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

@XendraTrl(Identifier="3ef2e6a4-241f-7f50-2179-2ba829a9130e")
public static String es_PE_FIELD_BatchLine_PartnerLocation_Name="Dirección del Socio del Negocio";

@XendraTrl(Identifier="3ef2e6a4-241f-7f50-2179-2ba829a9130e")
public static String es_PE_FIELD_BatchLine_PartnerLocation_Description="Identifica la dirección para este socio de negocio";

@XendraTrl(Identifier="3ef2e6a4-241f-7f50-2179-2ba829a9130e")
public static String es_PE_FIELD_BatchLine_PartnerLocation_Help="La dirección de un socio indica la ubicación de un socio de negocio";

@XendraField(AD_Column_ID="C_BPartner_Location_ID",IsCentrallyMaintained=true,
AD_Tab_ID="95cfad9b-c387-9e38-a7fe-920e4b524349",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3ef2e6a4-241f-7f50-2179-2ba829a9130e")
public static final String FIELDNAME_BatchLine_PartnerLocation="3ef2e6a4-241f-7f50-2179-2ba829a9130e";

@XendraTrl(Identifier="a8c66ba5-e143-59d9-2c32-a2d7caf4106b")
public static String es_PE_COLUMN_C_BPartner_Location_ID_Name="Dirección del Socio del Negocio";

@XendraColumn(AD_Element_ID="0dab7dc6-2832-26dc-2462-cba2d40235f2",
ColumnName="C_BPartner_Location_ID",AD_Reference_ID=19,AD_Reference_Value_ID="",
AD_Val_Rule_ID="623d98c0-19fc-56a2-f511-8992974d3c05",FieldLength=22,
DefaultValue="@C_BPartner_Location_ID@",IsKey=false,IsInternal=false,IsParent=false,
IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="org.compiere.model.CalloutInvoiceBatch.tax",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a8c66ba5-e143-59d9-2c32-a2d7caf4106b",
Synchronized="2019-08-30 22:21:39.0")
/** Column name C_BPartner_Location_ID */
public static final String COLUMNNAME_C_BPartner_Location_ID = "C_BPartner_Location_ID";
/** Set Charge.
@param C_Charge_ID Additional document charges */
public void setC_Charge_ID (int C_Charge_ID)
{
if (C_Charge_ID < 1) throw new IllegalArgumentException ("C_Charge_ID is mandatory.");
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

@XendraTrl(Identifier="c286426a-8b00-a754-b547-3a8068d5a560")
public static String es_PE_FIELD_BatchLine_Charge_Name="Cargo";

@XendraTrl(Identifier="c286426a-8b00-a754-b547-3a8068d5a560")
public static String es_PE_FIELD_BatchLine_Charge_Description="Cargos adicionales del documento";

@XendraTrl(Identifier="c286426a-8b00-a754-b547-3a8068d5a560")
public static String es_PE_FIELD_BatchLine_Charge_Help="El cargo indica un tipo de cargo (manejo; despacho; reposición)";

@XendraField(AD_Column_ID="C_Charge_ID",IsCentrallyMaintained=true,
AD_Tab_ID="95cfad9b-c387-9e38-a7fe-920e4b524349",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=140,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c286426a-8b00-a754-b547-3a8068d5a560")
public static final String FIELDNAME_BatchLine_Charge="c286426a-8b00-a754-b547-3a8068d5a560";

@XendraTrl(Identifier="ad07b75d-8593-1d18-1299-4ef730603a96")
public static String es_PE_COLUMN_C_Charge_ID_Name="Cargo";

@XendraColumn(AD_Element_ID="d7e2fc48-a26e-4ded-ea44-fe15849a7883",ColumnName="C_Charge_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="org.compiere.model.CalloutInvoiceBatch.charge",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ad07b75d-8593-1d18-1299-4ef730603a96",
Synchronized="2019-08-30 22:21:39.0")
/** Column name C_Charge_ID */
public static final String COLUMNNAME_C_Charge_ID = "C_Charge_ID";
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

@XendraTrl(Identifier="1b230ada-2d1b-791b-534f-308e755ca4eb")
public static String es_PE_FIELD_BatchLine_DocumentType_Name="Tipo de Documento";

@XendraTrl(Identifier="1b230ada-2d1b-791b-534f-308e755ca4eb")
public static String es_PE_FIELD_BatchLine_DocumentType_Description="Tipo de documento ó reglas";

@XendraTrl(Identifier="1b230ada-2d1b-791b-534f-308e755ca4eb")
public static String es_PE_FIELD_BatchLine_DocumentType_Help="El tipo de documento determina la secuencia del documento y las reglas de proceso";

@XendraField(AD_Column_ID="C_DocType_ID",IsCentrallyMaintained=true,
AD_Tab_ID="95cfad9b-c387-9e38-a7fe-920e4b524349",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1b230ada-2d1b-791b-534f-308e755ca4eb")
public static final String FIELDNAME_BatchLine_DocumentType="1b230ada-2d1b-791b-534f-308e755ca4eb";

@XendraTrl(Identifier="4ca550d5-f121-bbcc-4587-bc3ffb85619e")
public static String es_PE_COLUMN_C_DocType_ID_Name="Tipo de Documento";

@XendraColumn(AD_Element_ID="099a4147-1a72-cdd0-81e0-8bdbc8c0b883",ColumnName="C_DocType_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="3618c2e5-5c32-687f-83f6-d13e5296d9e4",
FieldLength=22,DefaultValue="@C_DocType_ID@",IsKey=false,IsInternal=false,IsParent=false,
IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="org.compiere.model.CalloutInvoiceBatch.docType",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="4ca550d5-f121-bbcc-4587-bc3ffb85619e",
Synchronized="2019-08-30 22:21:39.0")
/** Column name C_DocType_ID */
public static final String COLUMNNAME_C_DocType_ID = "C_DocType_ID";
/** Set Invoice Batch.
@param C_InvoiceBatch_ID Expense Invoice Batch Header */
public void setC_InvoiceBatch_ID (int C_InvoiceBatch_ID)
{
if (C_InvoiceBatch_ID < 1) throw new IllegalArgumentException ("C_InvoiceBatch_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_InvoiceBatch_ID, Integer.valueOf(C_InvoiceBatch_ID));
}
/** Get Invoice Batch.
@return Expense Invoice Batch Header */
public int getC_InvoiceBatch_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_InvoiceBatch_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="8b8fffdd-37cb-fdb0-d196-4bb4ba1f9c7a")
public static String es_PE_FIELD_BatchLine_InvoiceBatch_Name="Facturas en Lote";

@XendraTrl(Identifier="8b8fffdd-37cb-fdb0-d196-4bb4ba1f9c7a")
public static String es_PE_FIELD_BatchLine_InvoiceBatch_Description="Costo de la factura en lote";

@XendraField(AD_Column_ID="C_InvoiceBatch_ID",IsCentrallyMaintained=true,
AD_Tab_ID="95cfad9b-c387-9e38-a7fe-920e4b524349",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8b8fffdd-37cb-fdb0-d196-4bb4ba1f9c7a")
public static final String FIELDNAME_BatchLine_InvoiceBatch="8b8fffdd-37cb-fdb0-d196-4bb4ba1f9c7a";

@XendraTrl(Identifier="e6031e72-c1ea-8f0f-8f4a-97e12e5abf1e")
public static String es_PE_COLUMN_C_InvoiceBatch_ID_Name="Facturas en Lote";

@XendraColumn(AD_Element_ID="a3091613-cf08-2390-e829-d1f78a197ccf",ColumnName="C_InvoiceBatch_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e6031e72-c1ea-8f0f-8f4a-97e12e5abf1e",
Synchronized="2019-08-30 22:21:39.0")
/** Column name C_InvoiceBatch_ID */
public static final String COLUMNNAME_C_InvoiceBatch_ID = "C_InvoiceBatch_ID";
/** Set Invoice Batch Line.
@param C_InvoiceBatchLine_ID Expense Invoice Batch Line */
public void setC_InvoiceBatchLine_ID (int C_InvoiceBatchLine_ID)
{
if (C_InvoiceBatchLine_ID < 1) throw new IllegalArgumentException ("C_InvoiceBatchLine_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_InvoiceBatchLine_ID, Integer.valueOf(C_InvoiceBatchLine_ID));
}
/** Get Invoice Batch Line.
@return Expense Invoice Batch Line */
public int getC_InvoiceBatchLine_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_InvoiceBatchLine_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="0c25efc2-e630-b2cf-3aaf-a8d810e33903")
public static String es_PE_FIELD_BatchLine_InvoiceBatchLine_Name="Linea Lote de Facturas ";

@XendraTrl(Identifier="0c25efc2-e630-b2cf-3aaf-a8d810e33903")
public static String es_PE_FIELD_BatchLine_InvoiceBatchLine_Description="Línea de lote de la factura del costo.";

@XendraField(AD_Column_ID="C_InvoiceBatchLine_ID",IsCentrallyMaintained=true,
AD_Tab_ID="95cfad9b-c387-9e38-a7fe-920e4b524349",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0c25efc2-e630-b2cf-3aaf-a8d810e33903")
public static final String FIELDNAME_BatchLine_InvoiceBatchLine="0c25efc2-e630-b2cf-3aaf-a8d810e33903";
/** Column name C_InvoiceBatchLine_ID */
public static final String COLUMNNAME_C_InvoiceBatchLine_ID = "C_InvoiceBatchLine_ID";
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

@XendraTrl(Identifier="50515ca5-ebe6-4314-1621-924b91d02ac9")
public static String es_PE_FIELD_BatchLine_Invoice_Name="Factura";

@XendraTrl(Identifier="50515ca5-ebe6-4314-1621-924b91d02ac9")
public static String es_PE_FIELD_BatchLine_Invoice_Description="Identificador de la factura";

@XendraTrl(Identifier="50515ca5-ebe6-4314-1621-924b91d02ac9")
public static String es_PE_FIELD_BatchLine_Invoice_Help="La ID de Factura identifica únicamente un documento de Factura.";

@XendraField(AD_Column_ID="C_Invoice_ID",IsCentrallyMaintained=true,
AD_Tab_ID="95cfad9b-c387-9e38-a7fe-920e4b524349",AD_FieldGroup_ID="Status",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=260,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="50515ca5-ebe6-4314-1621-924b91d02ac9")
public static final String FIELDNAME_BatchLine_Invoice="50515ca5-ebe6-4314-1621-924b91d02ac9";

@XendraTrl(Identifier="816d6f63-bc41-0fb5-358f-8de4add78876")
public static String es_PE_COLUMN_C_Invoice_ID_Name="Factura";

@XendraColumn(AD_Element_ID="e526ea57-1bdf-9871-fd57-0df3c1f9dd42",ColumnName="C_Invoice_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="816d6f63-bc41-0fb5-358f-8de4add78876",
Synchronized="2019-08-30 22:21:39.0")
/** Column name C_Invoice_ID */
public static final String COLUMNNAME_C_Invoice_ID = "C_Invoice_ID";
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

@XendraTrl(Identifier="bbdf1de7-c04c-5fc0-b8bd-f0f9775d3b16")
public static String es_PE_FIELD_BatchLine_InvoiceLine_Name="Item de Factura";

@XendraTrl(Identifier="bbdf1de7-c04c-5fc0-b8bd-f0f9775d3b16")
public static String es_PE_FIELD_BatchLine_InvoiceLine_Description="Item de detalle de factura";

@XendraTrl(Identifier="bbdf1de7-c04c-5fc0-b8bd-f0f9775d3b16")
public static String es_PE_FIELD_BatchLine_InvoiceLine_Help="Identifica de manera única un Item de la factura";

@XendraField(AD_Column_ID="C_InvoiceLine_ID",IsCentrallyMaintained=true,
AD_Tab_ID="95cfad9b-c387-9e38-a7fe-920e4b524349",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=270,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="bbdf1de7-c04c-5fc0-b8bd-f0f9775d3b16")
public static final String FIELDNAME_BatchLine_InvoiceLine="bbdf1de7-c04c-5fc0-b8bd-f0f9775d3b16";

@XendraTrl(Identifier="f4fa330e-96a7-8f1d-616c-44429dc2f059")
public static String es_PE_COLUMN_C_InvoiceLine_ID_Name="Línea de Factura";

@XendraColumn(AD_Element_ID="56a4b078-1c5d-e08d-5d9d-847e94161779",ColumnName="C_InvoiceLine_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f4fa330e-96a7-8f1d-616c-44429dc2f059",
Synchronized="2019-08-30 22:21:39.0")
/** Column name C_InvoiceLine_ID */
public static final String COLUMNNAME_C_InvoiceLine_ID = "C_InvoiceLine_ID";
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

@XendraTrl(Identifier="143141d0-1e1c-f04d-866f-a6b95ad72a86")
public static String es_PE_FIELD_BatchLine_Project_Name="Proyecto";

@XendraTrl(Identifier="143141d0-1e1c-f04d-866f-a6b95ad72a86")
public static String es_PE_FIELD_BatchLine_Project_Description="Identifica un proyecto único";

@XendraTrl(Identifier="143141d0-1e1c-f04d-866f-a6b95ad72a86")
public static String es_PE_FIELD_BatchLine_Project_Help="La ID de un proyecto es un identificador definido por el usuario para un proyecto";

@XendraField(AD_Column_ID="C_Project_ID",IsCentrallyMaintained=true,
AD_Tab_ID="95cfad9b-c387-9e38-a7fe-920e4b524349",AD_FieldGroup_ID="Reference",IsDisplayed=true,
DisplayLogic="@$Element_PJ@=Y",DisplayLength=26,IsReadOnly=false,SeqNo=210,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="143141d0-1e1c-f04d-866f-a6b95ad72a86")
public static final String FIELDNAME_BatchLine_Project="143141d0-1e1c-f04d-866f-a6b95ad72a86";

@XendraTrl(Identifier="41255bc1-09b7-f172-aba0-88e1fe583c69")
public static String es_PE_COLUMN_C_Project_ID_Name="Proyecto";

@XendraColumn(AD_Element_ID="16ff5dcc-9178-73dd-e618-e88bd79d573b",ColumnName="C_Project_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="41255bc1-09b7-f172-aba0-88e1fe583c69",
Synchronized="2019-08-30 22:21:39.0")
/** Column name C_Project_ID */
public static final String COLUMNNAME_C_Project_ID = "C_Project_ID";
/** Set Tax.
@param C_Tax_ID Tax identifier */
public void setC_Tax_ID (int C_Tax_ID)
{
if (C_Tax_ID < 1) throw new IllegalArgumentException ("C_Tax_ID is mandatory.");
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

@XendraTrl(Identifier="3509a2db-8510-f147-8d79-163b754cee1d")
public static String es_PE_FIELD_BatchLine_Tax_Name="Impuesto";

@XendraTrl(Identifier="3509a2db-8510-f147-8d79-163b754cee1d")
public static String es_PE_FIELD_BatchLine_Tax_Description="Identificador del Impuesto";

@XendraTrl(Identifier="3509a2db-8510-f147-8d79-163b754cee1d")
public static String es_PE_FIELD_BatchLine_Tax_Help="El Impuesto indica el tipo de impuesto para esta línea del documento";

@XendraField(AD_Column_ID="C_Tax_ID",IsCentrallyMaintained=true,
AD_Tab_ID="95cfad9b-c387-9e38-a7fe-920e4b524349",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=170,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3509a2db-8510-f147-8d79-163b754cee1d")
public static final String FIELDNAME_BatchLine_Tax="3509a2db-8510-f147-8d79-163b754cee1d";

@XendraTrl(Identifier="2816f033-36a3-57e7-5a19-02f7bf798a32")
public static String es_PE_COLUMN_C_Tax_ID_Name="Impuesto";

@XendraColumn(AD_Element_ID="38ff24fc-b68c-51a9-60f8-ef2a1f060de2",ColumnName="C_Tax_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="org.compiere.model.CalloutInvoiceBatch.amt",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="2816f033-36a3-57e7-5a19-02f7bf798a32",Synchronized="2019-08-30 22:21:39.0")
/** Column name C_Tax_ID */
public static final String COLUMNNAME_C_Tax_ID = "C_Tax_ID";
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

@XendraTrl(Identifier="4ad52909-5b5e-4d78-a1d4-94f9bc9d8a62")
public static String es_PE_FIELD_BatchLine_AccountDate_Name="Fecha de Aplicación CG";

@XendraTrl(Identifier="4ad52909-5b5e-4d78-a1d4-94f9bc9d8a62")
public static String es_PE_FIELD_BatchLine_AccountDate_Description="Fecha contable";

@XendraTrl(Identifier="4ad52909-5b5e-4d78-a1d4-94f9bc9d8a62")
public static String es_PE_FIELD_BatchLine_AccountDate_Help="La fecha contable indica la fecha a ser usada en las cuentas de contabilidad general generadas desde este documento";

@XendraField(AD_Column_ID="DateAcct",IsCentrallyMaintained=true,
AD_Tab_ID="95cfad9b-c387-9e38-a7fe-920e4b524349",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="4ad52909-5b5e-4d78-a1d4-94f9bc9d8a62")
public static final String FIELDNAME_BatchLine_AccountDate="4ad52909-5b5e-4d78-a1d4-94f9bc9d8a62";

@XendraTrl(Identifier="ef0ae675-53d6-62a6-b1a6-6ca136a261b6")
public static String es_PE_COLUMN_DateAcct_Name="Fecha de Aplicación CG";

@XendraColumn(AD_Element_ID="034727d0-e80f-fadf-3d4f-2d8d37b75669",ColumnName="DateAcct",
AD_Reference_ID=15,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,
DefaultValue="@DateAcct@;@DateDoc@",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="ef0ae675-53d6-62a6-b1a6-6ca136a261b6",Synchronized="2019-08-30 22:21:39.0")
/** Column name DateAcct */
public static final String COLUMNNAME_DateAcct = "DateAcct";
/** Set Date Invoiced.
@param DateInvoiced Date printed on Invoice */
public void setDateInvoiced (Timestamp DateInvoiced)
{
if (DateInvoiced == null) throw new IllegalArgumentException ("DateInvoiced is mandatory.");
set_Value (COLUMNNAME_DateInvoiced, DateInvoiced);
}
/** Get Date Invoiced.
@return Date printed on Invoice */
public Timestamp getDateInvoiced() 
{
return (Timestamp)get_Value(COLUMNNAME_DateInvoiced);
}

@XendraTrl(Identifier="73f59e78-f44d-877e-80e5-db01b3f81640")
public static String es_PE_FIELD_BatchLine_DateInvoiced_Name="Fecha de Facturación";

@XendraTrl(Identifier="73f59e78-f44d-877e-80e5-db01b3f81640")
public static String es_PE_FIELD_BatchLine_DateInvoiced_Description="Fecha impresa en la factura";

@XendraTrl(Identifier="73f59e78-f44d-877e-80e5-db01b3f81640")
public static String es_PE_FIELD_BatchLine_DateInvoiced_Help="La fecha de la factura indica la fecha impresa en la factura.";

@XendraField(AD_Column_ID="DateInvoiced",IsCentrallyMaintained=true,
AD_Tab_ID="95cfad9b-c387-9e38-a7fe-920e4b524349",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="73f59e78-f44d-877e-80e5-db01b3f81640")
public static final String FIELDNAME_BatchLine_DateInvoiced="73f59e78-f44d-877e-80e5-db01b3f81640";

@XendraTrl(Identifier="7d626461-fa91-a4ab-4d85-c3e171a142b0")
public static String es_PE_COLUMN_DateInvoiced_Name="Fecha de Facturación";

@XendraColumn(AD_Element_ID="5e3c1a65-f97d-82ed-a21c-bc730ca3c080",ColumnName="DateInvoiced",
AD_Reference_ID=15,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,
DefaultValue="@DateInvoiced@;@DateDoc@",IsKey=false,IsInternal=false,IsParent=false,
IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="org.compiere.model.CalloutInvoiceBatch.date",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7d626461-fa91-a4ab-4d85-c3e171a142b0",
Synchronized="2019-08-30 22:21:39.0")
/** Column name DateInvoiced */
public static final String COLUMNNAME_DateInvoiced = "DateInvoiced";
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

@XendraTrl(Identifier="fadd9cea-09b2-994f-eb56-57550fd32fb4")
public static String es_PE_FIELD_BatchLine_Description_Name="Observación";

@XendraTrl(Identifier="fadd9cea-09b2-994f-eb56-57550fd32fb4")
public static String es_PE_FIELD_BatchLine_Description_Description="Observación";

@XendraTrl(Identifier="fadd9cea-09b2-994f-eb56-57550fd32fb4")
public static String es_PE_FIELD_BatchLine_Description_Help="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="95cfad9b-c387-9e38-a7fe-920e4b524349",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="fadd9cea-09b2-994f-eb56-57550fd32fb4")
public static final String FIELDNAME_BatchLine_Description="fadd9cea-09b2-994f-eb56-57550fd32fb4";

@XendraTrl(Identifier="34fcd19a-9786-d50c-e7df-4398729be368")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=true,ColumnSQL="",
IsAllowLogging=false,Identifier="34fcd19a-9786-d50c-e7df-4398729be368",
Synchronized="2019-08-30 22:21:39.0")
/** Column name Description */
public static final String COLUMNNAME_Description = "Description";
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
@XendraTrl(Identifier="6eaffc74-c023-7806-ef77-a71f2815073c")
public static String es_PE_FIELD_BatchLine_DocumentNo_Name="No. del Documento";

@XendraTrl(Identifier="6eaffc74-c023-7806-ef77-a71f2815073c")
public static String es_PE_FIELD_BatchLine_DocumentNo_Description="Número de secuencia del documento para cada documento";

@XendraTrl(Identifier="6eaffc74-c023-7806-ef77-a71f2815073c")
public static String es_PE_FIELD_BatchLine_DocumentNo_Help="El número del documento es usualmente generado en automático por el sistema y determinado por el tipo del documento. Si el documento no se salva; el número preliminar se despliega entre \"<>\"";

@XendraField(AD_Column_ID="DocumentNo",IsCentrallyMaintained=true,
AD_Tab_ID="95cfad9b-c387-9e38-a7fe-920e4b524349",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6eaffc74-c023-7806-ef77-a71f2815073c")
public static final String FIELDNAME_BatchLine_DocumentNo="6eaffc74-c023-7806-ef77-a71f2815073c";

@XendraTrl(Identifier="4475e979-05ad-2124-9cef-575ac67a28de")
public static String es_PE_COLUMN_DocumentNo_Name="No. del Documento";

@XendraColumn(AD_Element_ID="e3ca6e28-702a-2722-d941-b2072a0de9cb",ColumnName="DocumentNo",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=30,
DefaultValue="@DocumentNo@",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=true,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="4475e979-05ad-2124-9cef-575ac67a28de",Synchronized="2019-08-30 22:21:39.0")
/** Column name DocumentNo */
public static final String COLUMNNAME_DocumentNo = "DocumentNo";
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
@XendraTrl(Identifier="624a48d0-22f0-40e6-9193-09489c6f06f3")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="624a48d0-22f0-40e6-9193-09489c6f06f3",
Synchronized="2019-08-30 22:21:39.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Price includes Tax.
@param IsTaxIncluded Tax is included in the price  */
public void setIsTaxIncluded (boolean IsTaxIncluded)
{
set_Value (COLUMNNAME_IsTaxIncluded, Boolean.valueOf(IsTaxIncluded));
}
/** Get Price includes Tax.
@return Tax is included in the price  */
public boolean isTaxIncluded() 
{
Object oo = get_Value(COLUMNNAME_IsTaxIncluded);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="756b195d-6c68-4ba1-d708-4e86f9887a2d")
public static String es_PE_FIELD_BatchLine_PriceIncludesTax_Name="Impuesto Incluido en el Precio";

@XendraTrl(Identifier="756b195d-6c68-4ba1-d708-4e86f9887a2d")
public static String es_PE_FIELD_BatchLine_PriceIncludesTax_Description="Impuesto incluido en el precio";

@XendraTrl(Identifier="756b195d-6c68-4ba1-d708-4e86f9887a2d")
public static String es_PE_FIELD_BatchLine_PriceIncludesTax_Help="El cuadro de verificación Impuesto Incluido indica que el precio incluye impuestos. Esto es también conocido como el precio bruto";

@XendraField(AD_Column_ID="IsTaxIncluded",IsCentrallyMaintained=true,
AD_Tab_ID="95cfad9b-c387-9e38-a7fe-920e4b524349",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=160,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="756b195d-6c68-4ba1-d708-4e86f9887a2d")
public static final String FIELDNAME_BatchLine_PriceIncludesTax="756b195d-6c68-4ba1-d708-4e86f9887a2d";

@XendraTrl(Identifier="c88fee15-0937-fafd-1233-c24e95ffc6b7")
public static String es_PE_COLUMN_IsTaxIncluded_Name="Impuesto Incluido en el Precio";

@XendraColumn(AD_Element_ID="eb0a6d55-2fff-a462-20b8-744571a3fe60",ColumnName="IsTaxIncluded",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,
DefaultValue="@IsTaxIncluded@",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="org.compiere.model.CalloutInvoiceBatch.amt",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c88fee15-0937-fafd-1233-c24e95ffc6b7",
Synchronized="2019-08-30 22:21:39.0")
/** Column name IsTaxIncluded */
public static final String COLUMNNAME_IsTaxIncluded = "IsTaxIncluded";
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

@XendraTrl(Identifier="2d92c2b3-ee7d-42df-57dd-d974c096baf1")
public static String es_PE_FIELD_BatchLine_LineNo_Name="No. Línea";

@XendraTrl(Identifier="2d92c2b3-ee7d-42df-57dd-d974c096baf1")
public static String es_PE_FIELD_BatchLine_LineNo_Description="No. Línea único para este documento";

@XendraTrl(Identifier="2d92c2b3-ee7d-42df-57dd-d974c096baf1")
public static String es_PE_FIELD_BatchLine_LineNo_Help="Indica el No. Línea para un documento. También controlará el orden de despliegue de las líneas dentro de un documento";

@XendraField(AD_Column_ID="Line",IsCentrallyMaintained=true,
AD_Tab_ID="95cfad9b-c387-9e38-a7fe-920e4b524349",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=40,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2d92c2b3-ee7d-42df-57dd-d974c096baf1")
public static final String FIELDNAME_BatchLine_LineNo="2d92c2b3-ee7d-42df-57dd-d974c096baf1";

@XendraTrl(Identifier="9ec1d830-568d-9a73-8e82-7387b6ffa5bc")
public static String es_PE_COLUMN_Line_Name="No. Línea";

@XendraColumn(AD_Element_ID="986ef077-61da-f9cf-1c6d-aefe3a35113b",ColumnName="Line",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,
DefaultValue="@SQL=SELECT COALESCE(MAX(Line),0)+10 AS DefaultValue FROM C_InvoiceBatchLine WHERE C_InvoiceBatch_ID=@C_InvoiceBatch_ID@",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9ec1d830-568d-9a73-8e82-7387b6ffa5bc",
Synchronized="2019-08-30 22:21:39.0")
/** Column name Line */
public static final String COLUMNNAME_Line = "Line";
/** Set Line Amount.
@param LineNetAmt Line Extended Amount (Quantity * Actual Price) without Freight and Charges */
public void setLineNetAmt (BigDecimal LineNetAmt)
{
if (LineNetAmt == null) throw new IllegalArgumentException ("LineNetAmt is mandatory.");
set_ValueNoCheck (COLUMNNAME_LineNetAmt, LineNetAmt);
}
/** Get Line Amount.
@return Line Extended Amount (Quantity * Actual Price) without Freight and Charges */
public BigDecimal getLineNetAmt() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_LineNetAmt);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="a257463f-f323-fecd-abd3-51b260db0af8")
public static String es_PE_FIELD_BatchLine_LineAmount_Name="Neto de Línea";

@XendraTrl(Identifier="a257463f-f323-fecd-abd3-51b260db0af8")
public static String es_PE_FIELD_BatchLine_LineAmount_Description="Total neto de la línea (Cantidad * Precio Actual) sin fletes ni cargos";

@XendraTrl(Identifier="a257463f-f323-fecd-abd3-51b260db0af8")
public static String es_PE_FIELD_BatchLine_LineAmount_Help="Indica el total neto de la línea basado en la cantidad y el precio actual. Cualquier cargo adicional ó flete no es incluido.";

@XendraField(AD_Column_ID="LineNetAmt",IsCentrallyMaintained=true,
AD_Tab_ID="95cfad9b-c387-9e38-a7fe-920e4b524349",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=180,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a257463f-f323-fecd-abd3-51b260db0af8")
public static final String FIELDNAME_BatchLine_LineAmount="a257463f-f323-fecd-abd3-51b260db0af8";

@XendraTrl(Identifier="c40c25d4-2716-68a1-1f72-352e9f7d7476")
public static String es_PE_COLUMN_LineNetAmt_Name="Neto de Línea";

@XendraColumn(AD_Element_ID="ba57a535-4ae3-c6eb-74ec-3dcb0973d6f6",ColumnName="LineNetAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c40c25d4-2716-68a1-1f72-352e9f7d7476",
Synchronized="2019-08-30 22:21:39.0")
/** Column name LineNetAmt */
public static final String COLUMNNAME_LineNetAmt = "LineNetAmt";
/** Set Line Total.
@param LineTotalAmt Total line amount incl. Tax */
public void setLineTotalAmt (BigDecimal LineTotalAmt)
{
if (LineTotalAmt == null) throw new IllegalArgumentException ("LineTotalAmt is mandatory.");
set_ValueNoCheck (COLUMNNAME_LineTotalAmt, LineTotalAmt);
}
/** Get Line Total.
@return Total line amount incl. Tax */
public BigDecimal getLineTotalAmt() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_LineTotalAmt);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="cdcb9db0-de3a-d5b1-fc31-5650d52a004c")
public static String es_PE_FIELD_BatchLine_LineTotal_Name="Total de la Línea";

@XendraTrl(Identifier="cdcb9db0-de3a-d5b1-fc31-5650d52a004c")
public static String es_PE_FIELD_BatchLine_LineTotal_Description="Cantidad total de la línea, impuestos incluidos";

@XendraTrl(Identifier="cdcb9db0-de3a-d5b1-fc31-5650d52a004c")
public static String es_PE_FIELD_BatchLine_LineTotal_Help="Cantidad de la línea total";

@XendraField(AD_Column_ID="LineTotalAmt",IsCentrallyMaintained=true,
AD_Tab_ID="95cfad9b-c387-9e38-a7fe-920e4b524349",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=200,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="cdcb9db0-de3a-d5b1-fc31-5650d52a004c")
public static final String FIELDNAME_BatchLine_LineTotal="cdcb9db0-de3a-d5b1-fc31-5650d52a004c";

@XendraTrl(Identifier="7e80f2cd-4050-d3df-e1f7-35c1f59c0b51")
public static String es_PE_COLUMN_LineTotalAmt_Name="Total de la Línea";

@XendraColumn(AD_Element_ID="582be6fc-dd62-5c60-3398-a0f8435f0670",ColumnName="LineTotalAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7e80f2cd-4050-d3df-e1f7-35c1f59c0b51",
Synchronized="2019-08-30 22:21:39.0")
/** Column name LineTotalAmt */
public static final String COLUMNNAME_LineTotalAmt = "LineTotalAmt";
/** Set Price.
@param PriceEntered Price Entered - the price based on the selected/base UoM */
public void setPriceEntered (BigDecimal PriceEntered)
{
if (PriceEntered == null) throw new IllegalArgumentException ("PriceEntered is mandatory.");
set_Value (COLUMNNAME_PriceEntered, PriceEntered);
}
/** Get Price.
@return Price Entered - the price based on the selected/base UoM */
public BigDecimal getPriceEntered() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_PriceEntered);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="35756a92-583e-c12e-50e4-a01335c5d08e")
public static String es_PE_FIELD_BatchLine_Price_Name="Precio";

@XendraTrl(Identifier="35756a92-583e-c12e-50e4-a01335c5d08e")
public static String es_PE_FIELD_BatchLine_Price_Description="Precio cargado - El Precio esta basado en la selección de UM";

@XendraTrl(Identifier="35756a92-583e-c12e-50e4-a01335c5d08e")
public static String es_PE_FIELD_BatchLine_Price_Help="El precio incorporado es convertido al precio real basado en la conversión de UM";

@XendraField(AD_Column_ID="PriceEntered",IsCentrallyMaintained=true,
AD_Tab_ID="95cfad9b-c387-9e38-a7fe-920e4b524349",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=150,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="35756a92-583e-c12e-50e4-a01335c5d08e")
public static final String FIELDNAME_BatchLine_Price="35756a92-583e-c12e-50e4-a01335c5d08e";

@XendraTrl(Identifier="c24f66fc-4091-5de8-d121-bf8459b7b08b")
public static String es_PE_COLUMN_PriceEntered_Name="Precio";

@XendraColumn(AD_Element_ID="c0a272c7-da17-7089-b9a4-6aeab9e222ef",ColumnName="PriceEntered",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="org.compiere.model.CalloutInvoiceBatch.amt",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="c24f66fc-4091-5de8-d121-bf8459b7b08b",Synchronized="2019-08-30 22:21:39.0")
/** Column name PriceEntered */
public static final String COLUMNNAME_PriceEntered = "PriceEntered";
/** Set Processed.
@param Processed The document has been processed */
public void setProcessed (boolean Processed)
{
set_ValueNoCheck (COLUMNNAME_Processed, Boolean.valueOf(Processed));
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

@XendraTrl(Identifier="c34772bf-2b2b-2315-869d-b4f8e6a2d533")
public static String es_PE_FIELD_BatchLine_Processed_Name="Procesado";

@XendraTrl(Identifier="c34772bf-2b2b-2315-869d-b4f8e6a2d533")
public static String es_PE_FIELD_BatchLine_Processed_Description="El documento ha sido procesado";

@XendraTrl(Identifier="c34772bf-2b2b-2315-869d-b4f8e6a2d533")
public static String es_PE_FIELD_BatchLine_Processed_Help="El cuadro de verificación procesada indica que un documento ha sido procesado";

@XendraField(AD_Column_ID="Processed",IsCentrallyMaintained=true,
AD_Tab_ID="95cfad9b-c387-9e38-a7fe-920e4b524349",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="1=2",DisplayLength=1,IsReadOnly=true,SeqNo=280,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c34772bf-2b2b-2315-869d-b4f8e6a2d533")
public static final String FIELDNAME_BatchLine_Processed="c34772bf-2b2b-2315-869d-b4f8e6a2d533";

@XendraTrl(Identifier="cb4a825a-148a-ea69-a7c9-482db6cdf011")
public static String es_PE_COLUMN_Processed_Name="Procesado";

@XendraColumn(AD_Element_ID="3f7035d2-fa5e-7416-fc0c-e49e43f9e083",ColumnName="Processed",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="cb4a825a-148a-ea69-a7c9-482db6cdf011",
Synchronized="2019-08-30 22:21:39.0")
/** Column name Processed */
public static final String COLUMNNAME_Processed = "Processed";
/** Set Quantity.
@param QtyEntered The Quantity Entered is based on the selected UoM */
public void setQtyEntered (BigDecimal QtyEntered)
{
if (QtyEntered == null) throw new IllegalArgumentException ("QtyEntered is mandatory.");
set_Value (COLUMNNAME_QtyEntered, QtyEntered);
}
/** Get Quantity.
@return The Quantity Entered is based on the selected UoM */
public BigDecimal getQtyEntered() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_QtyEntered);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="d4a9a4f1-cd08-12ab-1bb2-5883bd029f34")
public static String es_PE_FIELD_BatchLine_Quantity_Name="Cantidad";

@XendraTrl(Identifier="d4a9a4f1-cd08-12ab-1bb2-5883bd029f34")
public static String es_PE_FIELD_BatchLine_Quantity_Description="La cantidad incorporada se basa en la UM seleccionada.";

@XendraTrl(Identifier="d4a9a4f1-cd08-12ab-1bb2-5883bd029f34")
public static String es_PE_FIELD_BatchLine_Quantity_Help="La cantidad incorporada se convierte a la cantidad baja de UM del producto";

@XendraField(AD_Column_ID="QtyEntered",IsCentrallyMaintained=true,
AD_Tab_ID="95cfad9b-c387-9e38-a7fe-920e4b524349",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=130,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d4a9a4f1-cd08-12ab-1bb2-5883bd029f34")
public static final String FIELDNAME_BatchLine_Quantity="d4a9a4f1-cd08-12ab-1bb2-5883bd029f34";

@XendraTrl(Identifier="d0fad61a-e759-3131-6c74-d85037ab4774")
public static String es_PE_COLUMN_QtyEntered_Name="Cantidad";

@XendraColumn(AD_Element_ID="70a37b06-986d-bf01-1ef9-23e214211841",ColumnName="QtyEntered",
AD_Reference_ID=29,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="1",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="org.compiere.model.CalloutInvoiceBatch.amt",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="d0fad61a-e759-3131-6c74-d85037ab4774",Synchronized="2019-08-30 22:21:39.0")
/** Column name QtyEntered */
public static final String COLUMNNAME_QtyEntered = "QtyEntered";
/** Set Tax Amount.
@param TaxAmt Tax Amount for a document */
public void setTaxAmt (BigDecimal TaxAmt)
{
if (TaxAmt == null) throw new IllegalArgumentException ("TaxAmt is mandatory.");
set_Value (COLUMNNAME_TaxAmt, TaxAmt);
}
/** Get Tax Amount.
@return Tax Amount for a document */
public BigDecimal getTaxAmt() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_TaxAmt);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="ea6e3354-0672-8a33-b0b4-3b4e93e08fb5")
public static String es_PE_FIELD_BatchLine_TaxAmount_Name="Total del Impuesto";

@XendraTrl(Identifier="ea6e3354-0672-8a33-b0b4-3b4e93e08fb5")
public static String es_PE_FIELD_BatchLine_TaxAmount_Description="Total del impuesto para un documento";

@XendraTrl(Identifier="ea6e3354-0672-8a33-b0b4-3b4e93e08fb5")
public static String es_PE_FIELD_BatchLine_TaxAmount_Help="El Total de Impuesto despliega el total de impuesto para un documento";

@XendraField(AD_Column_ID="TaxAmt",IsCentrallyMaintained=true,
AD_Tab_ID="95cfad9b-c387-9e38-a7fe-920e4b524349",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=190,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ea6e3354-0672-8a33-b0b4-3b4e93e08fb5")
public static final String FIELDNAME_BatchLine_TaxAmount="ea6e3354-0672-8a33-b0b4-3b4e93e08fb5";

@XendraTrl(Identifier="030ba6c0-c8f7-9afa-02e2-4dd4f106bfc9")
public static String es_PE_COLUMN_TaxAmt_Name="Total del Impuesto";

@XendraColumn(AD_Element_ID="462941e1-a196-170f-fd16-84da06ba50ea",ColumnName="TaxAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="030ba6c0-c8f7-9afa-02e2-4dd4f106bfc9",
Synchronized="2019-08-30 22:21:39.0")
/** Column name TaxAmt */
public static final String COLUMNNAME_TaxAmt = "TaxAmt";
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

@XendraTrl(Identifier="f8ec880d-b962-2389-b026-585453b6bcac")
public static String es_PE_FIELD_BatchLine_UserList_Name="Usuario 1";

@XendraTrl(Identifier="f8ec880d-b962-2389-b026-585453b6bcac")
public static String es_PE_FIELD_BatchLine_UserList_Description="El usuario definió el elemento # 1";

@XendraTrl(Identifier="f8ec880d-b962-2389-b026-585453b6bcac")
public static String es_PE_FIELD_BatchLine_UserList_Help="El elemento definido por el usuario despliega los elementos opcionales que han sido definidos para esta combinación de cuentas";

@XendraField(AD_Column_ID="User1_ID",IsCentrallyMaintained=true,
AD_Tab_ID="95cfad9b-c387-9e38-a7fe-920e4b524349",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@$Element_U1@=Y",DisplayLength=14,IsReadOnly=false,SeqNo=240,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="f8ec880d-b962-2389-b026-585453b6bcac")
public static final String FIELDNAME_BatchLine_UserList="f8ec880d-b962-2389-b026-585453b6bcac";

@XendraTrl(Identifier="c49da0cd-428a-a7ce-d3b2-126014e50041")
public static String es_PE_COLUMN_User1_ID_Name="Usuario 1";

@XendraColumn(AD_Element_ID="07453e74-aadd-d9c9-e543-837a6fdb3094",ColumnName="User1_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="5a2fe161-044f-67cb-3791-6d615980cabb",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="c49da0cd-428a-a7ce-d3b2-126014e50041",Synchronized="2019-08-30 22:21:39.0")
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

@XendraTrl(Identifier="28b0f983-f40e-636e-6396-75343bd7ee50")
public static String es_PE_FIELD_BatchLine_UserList22_Name="Usuario 2";

@XendraTrl(Identifier="28b0f983-f40e-636e-6396-75343bd7ee50")
public static String es_PE_FIELD_BatchLine_UserList22_Description="El usuario definió el elemento # 2";

@XendraTrl(Identifier="28b0f983-f40e-636e-6396-75343bd7ee50")
public static String es_PE_FIELD_BatchLine_UserList22_Help="El elemento definido por el usuario despliega los elementos opcionales que han sido definidos para esta combinación de cuentas";

@XendraField(AD_Column_ID="User2_ID",IsCentrallyMaintained=true,
AD_Tab_ID="95cfad9b-c387-9e38-a7fe-920e4b524349",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@$Element_U2@=Y",DisplayLength=14,IsReadOnly=false,SeqNo=250,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="28b0f983-f40e-636e-6396-75343bd7ee50")
public static final String FIELDNAME_BatchLine_UserList22="28b0f983-f40e-636e-6396-75343bd7ee50";

@XendraTrl(Identifier="2fc84b7d-4dce-675c-e9bd-deea35819544")
public static String es_PE_COLUMN_User2_ID_Name="Usuario 2";

@XendraColumn(AD_Element_ID="1b668c90-6743-20a2-df62-576857d72c06",ColumnName="User2_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="6a357ab2-7bb6-fce4-ffee-8bdd855a77fc",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="2fc84b7d-4dce-675c-e9bd-deea35819544",Synchronized="2019-08-30 22:21:39.0")
/** Column name User2_ID */
public static final String COLUMNNAME_User2_ID = "User2_ID";
}
