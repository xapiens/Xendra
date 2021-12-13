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
/** Generated Model for GL_DistributionLine
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_GL_DistributionLine extends PO
{
/** Standard Constructor
@param ctx context
@param GL_DistributionLine_ID id
@param trxName transaction
*/
public X_GL_DistributionLine (Properties ctx, int GL_DistributionLine_ID, String trxName)
{
super (ctx, GL_DistributionLine_ID, trxName);
/** if (GL_DistributionLine_ID == 0)
{
setAccountSign (null);	
// N
setGL_Distribution_ID (0);
setGL_DistributionLine_ID (0);
setLine (0);	
// @SQL=SELECT COALESCE(MAX(Line),0)+10 AS DefaultValue FROM GL_DistributionLine WHERE GL_Distribution_ID=@GL_Distribution_ID@
setOverwriteAcct (false);	
// N
setOverwriteActivity (false);	
// N
setOverwriteBPartner (false);	
// N
setOverwriteCampaign (false);	
// N
setOverwriteLocFrom (false);	
// N
setOverwriteLocTo (false);	
// N
setOverwriteOrg (false);	
// N
setOverwriteOrgTrx (false);	
// N
setOverwriteProduct (false);	
// N
setOverwriteProject (false);	
// N
setOverwriteSalesRegion (false);	
// N
setOverwriteUser1 (false);	
// N
setOverwriteUser2 (false);	
// N
setPercent (Env.ZERO);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_GL_DistributionLine (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=707 */
public static int Table_ID=MTable.getTable_ID("GL_DistributionLine");

@XendraTrl(Identifier="14a46d50-420f-7989-582b-624b89dbc980")
public static String es_PE_TAB_Line_Description="Ìtem de la distribución del libro mayor general";

@XendraTrl(Identifier="14a46d50-420f-7989-582b-624b89dbc980")
public static String es_PE_TAB_Line_Help="Si los criterios de la combinación de la cuenta de la distribución se resuelven, la fijación a la combinación de la cuenta es substituida por las combinaciones de la cuenta de las líneas de la distribución. La distribución está prorrateada basada en el cociente de las líneas.";

@XendraTrl(Identifier="14a46d50-420f-7989-582b-624b89dbc980")
public static String es_PE_TAB_Line_Name="Línea";
@XendraTab(Name="Line",
Description="General Ledger Distribution Target Line",
Help="If the account combination criteria of the Distribution is met, the posting to the account combination is replaced by the account combinations of the distribution lines.  The distribution is prorated based on the perecent value of the lines. A Percent value of 0 (null) indicates the remainder to 100. There can only be one line with 0 percent.",
AD_Window_ID="10aae78a-1106-df06-4101-244820ee0343",SeqNo=20,TabLevel=1,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="14a46d50-420f-7989-582b-624b89dbc980",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Line="14a46d50-420f-7989-582b-624b89dbc980";

@XendraTrl(Identifier="59642695-53f5-7da6-0b8d-bc5a4f1d2e6b")
public static String es_PE_TABLE_GL_DistributionLine_Name="Linea Distribución CG";

@XendraTable(Name="GL Distribution Line",AD_Package_ID="2ac04657-d663-47c2-4ec1-927ad71f1e96",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="General Ledger Distribution Line",
Help="",TableName="GL_DistributionLine",AccessLevel="2",
AD_Window_ID="10aae78a-1106-df06-4101-244820ee0343",AD_Val_Rule_ID="",IsKey=1,LoadSeq=145,
IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,IsView=false,
PO_Window_ID="",ID="org.xendra.accounting",Identifier="59642695-53f5-7da6-0b8d-bc5a4f1d2e6b",
Synchronized="2020-03-03 21:37:57.0")
/** TableName=GL_DistributionLine */
public static final String Table_Name="GL_DistributionLine";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"GL_DistributionLine");

protected BigDecimal accessLevel = BigDecimal.valueOf(2);
/** AccessLevel
@return 2 - Client 
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
    Table_ID = MTable.getTable_ID("GL_DistributionLine");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_GL_DistributionLine[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Account.
@param Account_ID Account used */
public void setAccount_ID (int Account_ID)
{
if (Account_ID <= 0) set_Value (COLUMNNAME_Account_ID, null);
 else 
set_Value (COLUMNNAME_Account_ID, Integer.valueOf(Account_ID));
}
/** Get Account.
@return Account used */
public int getAccount_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_Account_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="8c8a3f66-704d-b656-33df-e553ce6e87af")
public static String es_PE_FIELD_Line_Account_Name="Cuenta";

@XendraTrl(Identifier="8c8a3f66-704d-b656-33df-e553ce6e87af")
public static String es_PE_FIELD_Line_Account_Description="Cuenta usada";

@XendraTrl(Identifier="8c8a3f66-704d-b656-33df-e553ce6e87af")
public static String es_PE_FIELD_Line_Account_Help="La cuenta (natural) usada";

@XendraField(AD_Column_ID="Account_ID",IsCentrallyMaintained=true,
AD_Tab_ID="14a46d50-420f-7989-582b-624b89dbc980",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@OverwriteAcct@=Y",DisplayLength=14,IsReadOnly=false,SeqNo=90,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="8c8a3f66-704d-b656-33df-e553ce6e87af")
public static final String FIELDNAME_Line_Account="8c8a3f66-704d-b656-33df-e553ce6e87af";

@XendraTrl(Identifier="b8525ec7-4dab-6afa-d8b5-6282a50fbe73")
public static String es_PE_COLUMN_Account_ID_Name="Cuenta";

@XendraColumn(AD_Element_ID="80f1c2b7-bd3e-7c80-0596-67c2f7ca3812",ColumnName="Account_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="fca59846-3472-6195-37e9-9b8f95376f02",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="b8525ec7-4dab-6afa-d8b5-6282a50fbe73",Synchronized="2019-08-30 22:22:33.0")
/** Column name Account_ID */
public static final String COLUMNNAME_Account_ID = "Account_ID";
/** Set Account Sign.
@param AccountSign Indicates the Natural Sign of the Account as a Debit or Credit */
public void setAccountSign (String AccountSign)
{
if (AccountSign.length() > 1)
{
log.warning("Length > 1 - truncated");
AccountSign = AccountSign.substring(0,0);
}
set_Value (COLUMNNAME_AccountSign, AccountSign);
}
/** Get Account Sign.
@return Indicates the Natural Sign of the Account as a Debit or Credit */
public String getAccountSign() 
{
return (String)get_Value(COLUMNNAME_AccountSign);
}

@XendraTrl(Identifier="656efea7-02d5-965b-ba92-de8b72463eec")
public static String en_GB_FIELD_Line_AccountSign_Name="Account Sign";

@XendraTrl(Identifier="656efea7-02d5-965b-ba92-de8b72463eec")
public static String es_PE_FIELD_Line_AccountSign_Name="Naturaleza de Cuenta";

@XendraTrl(Identifier="656efea7-02d5-965b-ba92-de8b72463eec")
public static String en_GB_FIELD_Line_AccountSign_Description="Indicates the Natural Sign of the Account as a Debit or Credit";

@XendraTrl(Identifier="656efea7-02d5-965b-ba92-de8b72463eec")
public static String es_PE_FIELD_Line_AccountSign_Description="Indica el signo natural de la cuenta ya sea débito ó crédito";

@XendraTrl(Identifier="656efea7-02d5-965b-ba92-de8b72463eec")
public static String en_GB_FIELD_Line_AccountSign_Help="Indicates if the expected balance for this account should be a Debit or a Credit. If set to Natural, the account sign for an asset or expense account is Debit Sign (i.e. negative if a credit balance).";

@XendraTrl(Identifier="656efea7-02d5-965b-ba92-de8b72463eec")
public static String es_PE_FIELD_Line_AccountSign_Help="Indica si el saldo esperado para esta cuenta debería ser deudor ó acreedor";

@XendraField(AD_Column_ID="AccountSign",IsCentrallyMaintained=true,
AD_Tab_ID="14a46d50-420f-7989-582b-624b89dbc980",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="656efea7-02d5-965b-ba92-de8b72463eec")
public static final String FIELDNAME_Line_AccountSign="656efea7-02d5-965b-ba92-de8b72463eec";

@XendraTrl(Identifier="f201bdeb-1c18-5d43-18d9-a301c54ad618")
public static String en_GB_COLUMN_AccountSign_Name="Account Sign";

@XendraTrl(Identifier="f201bdeb-1c18-5d43-18d9-a301c54ad618")
public static String es_PE_COLUMN_AccountSign_Name="Naturaleza de Cuenta";

@XendraColumn(AD_Element_ID="bec935a6-86d9-7793-51fb-4ce378612a32",ColumnName="AccountSign",
AD_Reference_ID=17,AD_Reference_Value_ID="f63281b9-9b5a-42c0-e4ec-3240ca6a08f1",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="N",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="f201bdeb-1c18-5d43-18d9-a301c54ad618",Synchronized="2019-08-30 22:22:33.0")
/** Column name AccountSign */
public static final String COLUMNNAME_AccountSign = "AccountSign";
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

@XendraTrl(Identifier="dcfe0151-45e0-6480-bc57-76dd8609020e")
public static String es_PE_FIELD_Line_TrxOrganization_Name="Organización de la Trans.";

@XendraTrl(Identifier="dcfe0151-45e0-6480-bc57-76dd8609020e")
public static String es_PE_FIELD_Line_TrxOrganization_Description="Organización que inicia ó ejecuta la transacción";

@XendraTrl(Identifier="dcfe0151-45e0-6480-bc57-76dd8609020e")
public static String es_PE_FIELD_Line_TrxOrganization_Help="La organización que inicia ó ejecuta la transacción (para otra organización). La organización poseedora puede no ser la organización de la transacción en un ambiente de buró de servicio; con servicios centralizados y transacciones inter- organización.";

@XendraField(AD_Column_ID="AD_OrgTrx_ID",IsCentrallyMaintained=true,
AD_Tab_ID="14a46d50-420f-7989-582b-624b89dbc980",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="@$Element_OT@=Y & @OverwriteOrgTrx@=Y",DisplayLength=14,IsReadOnly=false,SeqNo=0,
SortNo=0,IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="dcfe0151-45e0-6480-bc57-76dd8609020e")
public static final String FIELDNAME_Line_TrxOrganization="dcfe0151-45e0-6480-bc57-76dd8609020e";

@XendraTrl(Identifier="87c34596-b1a5-88ea-2a9c-35c205708599")
public static String es_PE_COLUMN_AD_OrgTrx_ID_Name="Organización de la Trans.";

@XendraColumn(AD_Element_ID="b4180358-67aa-fe55-0409-6367a60e0a2e",ColumnName="AD_OrgTrx_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="54e78591-f7f4-c613-ea27-e64b3dac5198",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="87c34596-b1a5-88ea-2a9c-35c205708599",Synchronized="2019-08-30 22:22:33.0")
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

@XendraTrl(Identifier="6403fb98-7dab-ccba-0e3d-fdf0dd6c8d3a")
public static String es_PE_FIELD_Line_Activity_Name="Tipo de Gasto";

@XendraTrl(Identifier="6403fb98-7dab-ccba-0e3d-fdf0dd6c8d3a")
public static String es_PE_FIELD_Line_Activity_Description="Actividad de Negocio";

@XendraTrl(Identifier="6403fb98-7dab-ccba-0e3d-fdf0dd6c8d3a")
public static String es_PE_FIELD_Line_Activity_Help="Las actividades indican tareas que son ejecutadas en el curso de un negocio; las actividades son usadas para el costeo por actividad (ABC)";

@XendraField(AD_Column_ID="C_Activity_ID",IsCentrallyMaintained=true,
AD_Tab_ID="14a46d50-420f-7989-582b-624b89dbc980",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="@$Element_AY@=Y & @OverwriteActivity@=Y",DisplayLength=14,IsReadOnly=false,SeqNo=0,
SortNo=0,IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="6403fb98-7dab-ccba-0e3d-fdf0dd6c8d3a")
public static final String FIELDNAME_Line_Activity="6403fb98-7dab-ccba-0e3d-fdf0dd6c8d3a";

@XendraTrl(Identifier="bec99b97-4c5a-fdb3-a283-a1a29338abda")
public static String es_PE_COLUMN_C_Activity_ID_Name="Tipo de Gasto";

@XendraColumn(AD_Element_ID="bfeadbb3-d866-26e3-8eee-3e2fdf0ff753",ColumnName="C_Activity_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="bec99b97-4c5a-fdb3-a283-a1a29338abda",
Synchronized="2019-08-30 22:22:33.0")
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

@XendraTrl(Identifier="d2b799e9-c3d7-7ae0-fc9e-b3fc07e30c5d")
public static String es_PE_FIELD_Line_BusinessPartner_Name="Socio de Negocio";

@XendraTrl(Identifier="d2b799e9-c3d7-7ae0-fc9e-b3fc07e30c5d")
public static String es_PE_FIELD_Line_BusinessPartner_Description="Identifica un Socio de Negocio";

@XendraTrl(Identifier="d2b799e9-c3d7-7ae0-fc9e-b3fc07e30c5d")
public static String es_PE_FIELD_Line_BusinessPartner_Help="Un socio de negocio es cualquiera con quien usted realiza transacciones. Este puede incluir Proveedores; Clientes; Empleados ó Vendedores.";

@XendraField(AD_Column_ID="C_BPartner_ID",IsCentrallyMaintained=true,
AD_Tab_ID="14a46d50-420f-7989-582b-624b89dbc980",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="@$Element_BP@=Y & @OverwriteBPartner@=Y",DisplayLength=26,IsReadOnly=false,SeqNo=0,
SortNo=0,IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="d2b799e9-c3d7-7ae0-fc9e-b3fc07e30c5d")
public static final String FIELDNAME_Line_BusinessPartner="d2b799e9-c3d7-7ae0-fc9e-b3fc07e30c5d";

@XendraTrl(Identifier="bd83ffec-593c-3849-198e-84cf30801aa6")
public static String es_PE_COLUMN_C_BPartner_ID_Name="Socio de Negocio";

@XendraColumn(AD_Element_ID="fe333dc3-4f40-1276-5f6a-d09bb66dc423",ColumnName="C_BPartner_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="06fdbbe9-e1c4-3ee4-4a9d-73d1a990cc42",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="bd83ffec-593c-3849-198e-84cf30801aa6",Synchronized="2019-08-30 22:22:33.0")
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

@XendraTrl(Identifier="a976c643-af6a-1558-8380-98bafa2786e0")
public static String es_PE_FIELD_Line_Campaign_Name="Campaña";

@XendraTrl(Identifier="a976c643-af6a-1558-8380-98bafa2786e0")
public static String es_PE_FIELD_Line_Campaign_Description="Campaña de Mercadeo";

@XendraTrl(Identifier="a976c643-af6a-1558-8380-98bafa2786e0")
public static String es_PE_FIELD_Line_Campaign_Help="La Campaña define un programa de mercadotecnia único. Los proyectos pueden estar asociados con una campaña de mercadotecnia única. Usted puede entonces reportar basado en una campaña específica";

@XendraField(AD_Column_ID="C_Campaign_ID",IsCentrallyMaintained=true,
AD_Tab_ID="14a46d50-420f-7989-582b-624b89dbc980",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="@$Element_MC@=Y & @OverwriteCampaign@=Y",DisplayLength=14,IsReadOnly=false,SeqNo=0,
SortNo=0,IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="a976c643-af6a-1558-8380-98bafa2786e0")
public static final String FIELDNAME_Line_Campaign="a976c643-af6a-1558-8380-98bafa2786e0";

@XendraTrl(Identifier="10dbf933-1b43-f433-c8f4-07f27b57e270")
public static String es_PE_COLUMN_C_Campaign_ID_Name="Campaña";

@XendraColumn(AD_Element_ID="6cf08e31-d355-ee38-9c0b-bee20b3ea5b6",ColumnName="C_Campaign_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="10dbf933-1b43-f433-c8f4-07f27b57e270",
Synchronized="2019-08-30 22:22:34.0")
/** Column name C_Campaign_ID */
public static final String COLUMNNAME_C_Campaign_ID = "C_Campaign_ID";
/** Set Location From.
@param C_LocFrom_ID Location that inventory was moved from */
public void setC_LocFrom_ID (int C_LocFrom_ID)
{
if (C_LocFrom_ID <= 0) set_Value (COLUMNNAME_C_LocFrom_ID, null);
 else 
set_Value (COLUMNNAME_C_LocFrom_ID, Integer.valueOf(C_LocFrom_ID));
}
/** Get Location From.
@return Location that inventory was moved from */
public int getC_LocFrom_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_LocFrom_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="a5707503-6d66-ea00-014f-3c0f6183e677")
public static String es_PE_FIELD_Line_LocationFrom_Name="Desde Localización";

@XendraTrl(Identifier="a5707503-6d66-ea00-014f-3c0f6183e677")
public static String es_PE_FIELD_Line_LocationFrom_Description="Ubicación desde la que el inventario fue movido";

@XendraTrl(Identifier="a5707503-6d66-ea00-014f-3c0f6183e677")
public static String es_PE_FIELD_Line_LocationFrom_Help="La ubicación desde indica la ubicación desde la que un producto fue movido";

@XendraField(AD_Column_ID="C_LocFrom_ID",IsCentrallyMaintained=true,
AD_Tab_ID="14a46d50-420f-7989-582b-624b89dbc980",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="@$Element_LF@=Y & @OverwriteLocFrom@=Y",DisplayLength=14,IsReadOnly=false,SeqNo=0,
SortNo=0,IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="a5707503-6d66-ea00-014f-3c0f6183e677")
public static final String FIELDNAME_Line_LocationFrom="a5707503-6d66-ea00-014f-3c0f6183e677";

@XendraTrl(Identifier="d95794f3-7f91-da4e-1325-1deef6af930e")
public static String es_PE_COLUMN_C_LocFrom_ID_Name="Desde Localización";

@XendraColumn(AD_Element_ID="5c54374e-b27b-3cd4-f5a8-8705436152bc",ColumnName="C_LocFrom_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="69189951-7109-d2c7-f034-b4660d43b572",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="d95794f3-7f91-da4e-1325-1deef6af930e",Synchronized="2019-08-30 22:22:34.0")
/** Column name C_LocFrom_ID */
public static final String COLUMNNAME_C_LocFrom_ID = "C_LocFrom_ID";
/** Set Location To.
@param C_LocTo_ID Location that inventory was moved to */
public void setC_LocTo_ID (int C_LocTo_ID)
{
if (C_LocTo_ID <= 0) set_Value (COLUMNNAME_C_LocTo_ID, null);
 else 
set_Value (COLUMNNAME_C_LocTo_ID, Integer.valueOf(C_LocTo_ID));
}
/** Get Location To.
@return Location that inventory was moved to */
public int getC_LocTo_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_LocTo_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="306664d9-5534-6bb6-003c-03ea47a25ad6")
public static String es_PE_FIELD_Line_LocationTo_Name="A Localización";

@XendraTrl(Identifier="306664d9-5534-6bb6-003c-03ea47a25ad6")
public static String es_PE_FIELD_Line_LocationTo_Description="Ubicación a la que el inventario fue movido.";

@XendraTrl(Identifier="306664d9-5534-6bb6-003c-03ea47a25ad6")
public static String es_PE_FIELD_Line_LocationTo_Help="La Ubicación A indica la ubicación a la que un producto fue movido.";

@XendraField(AD_Column_ID="C_LocTo_ID",IsCentrallyMaintained=true,
AD_Tab_ID="14a46d50-420f-7989-582b-624b89dbc980",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="@$Element_LT@=Y & @OverwriteLocTo@=Y",DisplayLength=14,IsReadOnly=false,SeqNo=0,
SortNo=0,IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="306664d9-5534-6bb6-003c-03ea47a25ad6")
public static final String FIELDNAME_Line_LocationTo="306664d9-5534-6bb6-003c-03ea47a25ad6";

@XendraTrl(Identifier="b585e098-1a91-be12-6cce-87a3d0d57819")
public static String es_PE_COLUMN_C_LocTo_ID_Name="A Localización";

@XendraColumn(AD_Element_ID="531e981d-5722-db37-a6eb-54ec21b60a90",ColumnName="C_LocTo_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="69189951-7109-d2c7-f034-b4660d43b572",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="b585e098-1a91-be12-6cce-87a3d0d57819",Synchronized="2019-08-30 22:22:34.0")
/** Column name C_LocTo_ID */
public static final String COLUMNNAME_C_LocTo_ID = "C_LocTo_ID";
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

@XendraTrl(Identifier="d43447e7-b108-e10a-eed7-6acbb889496e")
public static String es_PE_FIELD_Line_Project_Name="Proyecto";

@XendraTrl(Identifier="d43447e7-b108-e10a-eed7-6acbb889496e")
public static String es_PE_FIELD_Line_Project_Description="Identifica un proyecto único";

@XendraTrl(Identifier="d43447e7-b108-e10a-eed7-6acbb889496e")
public static String es_PE_FIELD_Line_Project_Help="La ID de un proyecto es un identificador definido por el usuario para un proyecto";

@XendraField(AD_Column_ID="C_Project_ID",IsCentrallyMaintained=true,
AD_Tab_ID="14a46d50-420f-7989-582b-624b89dbc980",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="@$Element_PJ@=Y & @OverwriteProject@=Y",DisplayLength=14,IsReadOnly=false,SeqNo=0,
SortNo=0,IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="d43447e7-b108-e10a-eed7-6acbb889496e")
public static final String FIELDNAME_Line_Project="d43447e7-b108-e10a-eed7-6acbb889496e";

@XendraTrl(Identifier="85231bb5-e6bb-30e8-5fd8-411b166a26f8")
public static String es_PE_COLUMN_C_Project_ID_Name="Proyecto";

@XendraColumn(AD_Element_ID="16ff5dcc-9178-73dd-e618-e88bd79d573b",ColumnName="C_Project_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="85231bb5-e6bb-30e8-5fd8-411b166a26f8",
Synchronized="2019-08-30 22:22:34.0")
/** Column name C_Project_ID */
public static final String COLUMNNAME_C_Project_ID = "C_Project_ID";
/** Set Sales Region.
@param C_SalesRegion_ID Sales coverage region */
public void setC_SalesRegion_ID (int C_SalesRegion_ID)
{
if (C_SalesRegion_ID <= 0) set_Value (COLUMNNAME_C_SalesRegion_ID, null);
 else 
set_Value (COLUMNNAME_C_SalesRegion_ID, Integer.valueOf(C_SalesRegion_ID));
}
/** Get Sales Region.
@return Sales coverage region */
public int getC_SalesRegion_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_SalesRegion_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="03e0bbef-8134-68e4-50e3-daac67bb3fda")
public static String es_PE_FIELD_Line_SalesRegion_Name="Región de Ventas";

@XendraTrl(Identifier="03e0bbef-8134-68e4-50e3-daac67bb3fda")
public static String es_PE_FIELD_Line_SalesRegion_Description="Región de cobertura de ventas.";

@XendraTrl(Identifier="03e0bbef-8134-68e4-50e3-daac67bb3fda")
public static String es_PE_FIELD_Line_SalesRegion_Help="La región de ventas indica una área de cobertura de ventas específica.";

@XendraField(AD_Column_ID="C_SalesRegion_ID",IsCentrallyMaintained=true,
AD_Tab_ID="14a46d50-420f-7989-582b-624b89dbc980",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="@$Element_SR@=Y & @OverwriteSalesRegion@=Y",DisplayLength=14,IsReadOnly=false,
SeqNo=0,SortNo=0,IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="03e0bbef-8134-68e4-50e3-daac67bb3fda")
public static final String FIELDNAME_Line_SalesRegion="03e0bbef-8134-68e4-50e3-daac67bb3fda";

@XendraTrl(Identifier="dc2e656d-d6fb-a6a1-93d8-4c1f2d7a444c")
public static String es_PE_COLUMN_C_SalesRegion_ID_Name="Región de Ventas";

@XendraColumn(AD_Element_ID="26b40f06-df79-27f7-adb4-8ae6c5a1c9b8",ColumnName="C_SalesRegion_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="dc2e656d-d6fb-a6a1-93d8-4c1f2d7a444c",
Synchronized="2019-08-30 22:22:34.0")
/** Column name C_SalesRegion_ID */
public static final String COLUMNNAME_C_SalesRegion_ID = "C_SalesRegion_ID";
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

@XendraTrl(Identifier="caf92bfa-916d-677d-170e-fe61a9dbc094")
public static String es_PE_FIELD_Line_Description_Name="Observación";

@XendraTrl(Identifier="caf92bfa-916d-677d-170e-fe61a9dbc094")
public static String es_PE_FIELD_Line_Description_Description="Observación corta opcional del registro";

@XendraTrl(Identifier="caf92bfa-916d-677d-170e-fe61a9dbc094")
public static String es_PE_FIELD_Line_Description_Help="Una Observación esta limitada a 255 caracteres";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="14a46d50-420f-7989-582b-624b89dbc980",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="caf92bfa-916d-677d-170e-fe61a9dbc094")
public static final String FIELDNAME_Line_Description="caf92bfa-916d-677d-170e-fe61a9dbc094";

@XendraTrl(Identifier="225df965-2b87-81aa-9957-55547635ac82")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="225df965-2b87-81aa-9957-55547635ac82",
Synchronized="2019-08-30 22:22:34.0")
/** Column name Description */
public static final String COLUMNNAME_Description = "Description";
/** Set GL Distribution.
@param GL_Distribution_ID General Ledger Distribution */
public void setGL_Distribution_ID (int GL_Distribution_ID)
{
if (GL_Distribution_ID < 1) throw new IllegalArgumentException ("GL_Distribution_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_GL_Distribution_ID, Integer.valueOf(GL_Distribution_ID));
}
/** Get GL Distribution.
@return General Ledger Distribution */
public int getGL_Distribution_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_GL_Distribution_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="30646d17-eccc-c24b-e16d-a85e8456e672")
public static String es_PE_FIELD_Line_GLDistribution_Name="Distribución CG";

@XendraTrl(Identifier="30646d17-eccc-c24b-e16d-a85e8456e672")
public static String es_PE_FIELD_Line_GLDistribution_Description="Distribución de contabilidad general";

@XendraTrl(Identifier="30646d17-eccc-c24b-e16d-a85e8456e672")
public static String es_PE_FIELD_Line_GLDistribution_Help="Si los criterios de combinación de la cuenta de distribución se resuelven, la fijación a la combinación de la cuenta es substituida por las combinaciones de la cuenta de líneas de distribución. La distribución está prorrateada basada en el cociente de las líneas. La distribución debe ser válida para ser utilizada.";

@XendraField(AD_Column_ID="GL_Distribution_ID",IsCentrallyMaintained=true,
AD_Tab_ID="14a46d50-420f-7989-582b-624b89dbc980",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="30646d17-eccc-c24b-e16d-a85e8456e672")
public static final String FIELDNAME_Line_GLDistribution="30646d17-eccc-c24b-e16d-a85e8456e672";

@XendraTrl(Identifier="3fb1ca96-0fca-c99d-3ee0-5176ba6f0b7b")
public static String es_PE_COLUMN_GL_Distribution_ID_Name="Distribución CG";

@XendraColumn(AD_Element_ID="80f4499e-1999-46a5-8fed-e80cd90729d3",ColumnName="GL_Distribution_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3fb1ca96-0fca-c99d-3ee0-5176ba6f0b7b",
Synchronized="2019-08-30 22:22:34.0")
/** Column name GL_Distribution_ID */
public static final String COLUMNNAME_GL_Distribution_ID = "GL_Distribution_ID";
/** Set GL Distribution Line.
@param GL_DistributionLine_ID General Ledger Distribution Line */
public void setGL_DistributionLine_ID (int GL_DistributionLine_ID)
{
if (GL_DistributionLine_ID < 1) throw new IllegalArgumentException ("GL_DistributionLine_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_GL_DistributionLine_ID, Integer.valueOf(GL_DistributionLine_ID));
}
/** Get GL Distribution Line.
@return General Ledger Distribution Line */
public int getGL_DistributionLine_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_GL_DistributionLine_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="285f6be4-2632-3ace-9af8-894114a5f6ee")
public static String es_PE_FIELD_Line_GLDistributionLine_Name="Linea Distribución CG";

@XendraTrl(Identifier="285f6be4-2632-3ace-9af8-894114a5f6ee")
public static String es_PE_FIELD_Line_GLDistributionLine_Description="Línea de la distribución del libro mayor general.";

@XendraTrl(Identifier="285f6be4-2632-3ace-9af8-894114a5f6ee")
public static String es_PE_FIELD_Line_GLDistributionLine_Help="Si los criterios de combinación de la cuenta de distribución se resuelven, la fijación a la combinación de cuenta es substituida por las combinaciones de cuenta de las líneas de distribución. La distribución está prorrateada en el cociente de las líneas.";

@XendraField(AD_Column_ID="GL_DistributionLine_ID",IsCentrallyMaintained=true,
AD_Tab_ID="14a46d50-420f-7989-582b-624b89dbc980",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="285f6be4-2632-3ace-9af8-894114a5f6ee")
public static final String FIELDNAME_Line_GLDistributionLine="285f6be4-2632-3ace-9af8-894114a5f6ee";
/** Column name GL_DistributionLine_ID */
public static final String COLUMNNAME_GL_DistributionLine_ID = "GL_DistributionLine_ID";
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
@XendraTrl(Identifier="a99f9137-05e6-47f7-9dbd-73c96c45a176")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a99f9137-05e6-47f7-9dbd-73c96c45a176",
Synchronized="2019-08-30 22:22:34.0")
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
/** Get Record ID/ColumnName
@return ID/ColumnName pair
*/public KeyNamePair getKeyNamePair() 
{
return new KeyNamePair(get_ID(), String.valueOf(getLine()));
}

@XendraTrl(Identifier="9c26d55b-4c9f-5439-d011-e7cb40a7b216")
public static String es_PE_FIELD_Line_LineNo_Name="No. Línea";

@XendraTrl(Identifier="9c26d55b-4c9f-5439-d011-e7cb40a7b216")
public static String es_PE_FIELD_Line_LineNo_Description="No. Línea único para este documento";

@XendraTrl(Identifier="9c26d55b-4c9f-5439-d011-e7cb40a7b216")
public static String es_PE_FIELD_Line_LineNo_Help="Indica el No. Línea para un documento. También controlará el orden de despliegue de las líneas dentro de un documento";

@XendraField(AD_Column_ID="Line",IsCentrallyMaintained=true,
AD_Tab_ID="14a46d50-420f-7989-582b-624b89dbc980",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=40,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9c26d55b-4c9f-5439-d011-e7cb40a7b216")
public static final String FIELDNAME_Line_LineNo="9c26d55b-4c9f-5439-d011-e7cb40a7b216";

@XendraTrl(Identifier="04c58c4c-5a27-6832-bed8-afc85260388a")
public static String es_PE_COLUMN_Line_Name="No. Línea";

@XendraColumn(AD_Element_ID="986ef077-61da-f9cf-1c6d-aefe3a35113b",ColumnName="Line",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,
DefaultValue="@SQL=SELECT COALESCE(MAX(Line),0)+10 AS DefaultValue FROM GL_DistributionLine WHERE GL_Distribution_ID=@GL_Distribution_ID@",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="04c58c4c-5a27-6832-bed8-afc85260388a",
Synchronized="2019-08-30 22:22:34.0")
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

@XendraTrl(Identifier="68415cbd-97ee-7871-c056-e8c1d397951f")
public static String es_PE_FIELD_Line_Product_Name="Producto";

@XendraTrl(Identifier="68415cbd-97ee-7871-c056-e8c1d397951f")
public static String es_PE_FIELD_Line_Product_Description="Producto; servicio ó artículo.";

@XendraTrl(Identifier="68415cbd-97ee-7871-c056-e8c1d397951f")
public static String es_PE_FIELD_Line_Product_Help="Identifica un artículo que puede ser comprado ó vendido es esta organización.";

@XendraField(AD_Column_ID="M_Product_ID",IsCentrallyMaintained=true,
AD_Tab_ID="14a46d50-420f-7989-582b-624b89dbc980",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="@$Element_PR@=Y & @OverwriteProduct@=Y",DisplayLength=26,IsReadOnly=false,SeqNo=0,
SortNo=0,IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="68415cbd-97ee-7871-c056-e8c1d397951f")
public static final String FIELDNAME_Line_Product="68415cbd-97ee-7871-c056-e8c1d397951f";

@XendraTrl(Identifier="fa9876b9-caab-f1bb-6eeb-45f6c70e52f7")
public static String es_PE_COLUMN_M_Product_ID_Name="Producto";

@XendraColumn(AD_Element_ID="b4701f57-f2fc-567c-58e2-a6aefbc3932c",ColumnName="M_Product_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="4281f8eb-238e-6b28-eb66-8cc866e6312c",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="fa9876b9-caab-f1bb-6eeb-45f6c70e52f7",Synchronized="2019-08-30 22:22:34.0")
/** Column name M_Product_ID */
public static final String COLUMNNAME_M_Product_ID = "M_Product_ID";
/** Set Organization.
@param Org_ID Organizational entity within client */
public void setOrg_ID (int Org_ID)
{
if (Org_ID <= 0) set_Value (COLUMNNAME_Org_ID, null);
 else 
set_Value (COLUMNNAME_Org_ID, Integer.valueOf(Org_ID));
}
/** Get Organization.
@return Organizational entity within client */
public int getOrg_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_Org_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="82d08ef4-507a-7403-1c6c-a2d15ad337c1")
public static String es_PE_FIELD_Line_Organization_Name="Organización";

@XendraTrl(Identifier="82d08ef4-507a-7403-1c6c-a2d15ad337c1")
public static String es_PE_FIELD_Line_Organization_Description="Entidad organizacional dentro de la empresa.";

@XendraTrl(Identifier="82d08ef4-507a-7403-1c6c-a2d15ad337c1")
public static String es_PE_FIELD_Line_Organization_Help="Una organización es una unidad de su compañía ó entidad legal. Ej. tiendas; departamentos";

@XendraField(AD_Column_ID="Org_ID",IsCentrallyMaintained=true,
AD_Tab_ID="14a46d50-420f-7989-582b-624b89dbc980",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="@OverwriteOrg@=Y",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="82d08ef4-507a-7403-1c6c-a2d15ad337c1")
public static final String FIELDNAME_Line_Organization="82d08ef4-507a-7403-1c6c-a2d15ad337c1";

@XendraTrl(Identifier="9c74d4ea-70c9-6129-8c9c-1962f95ca343")
public static String es_PE_COLUMN_Org_ID_Name="Organización";

@XendraColumn(AD_Element_ID="a4e75444-9eb1-c885-3445-9b55e2eb765a",ColumnName="Org_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="54e78591-f7f4-c613-ea27-e64b3dac5198",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="9c74d4ea-70c9-6129-8c9c-1962f95ca343",Synchronized="2019-08-30 22:22:34.0")
/** Column name Org_ID */
public static final String COLUMNNAME_Org_ID = "Org_ID";
/** Set Overwrite Account.
@param OverwriteAcct Overwrite the account segment Account with the value specified */
public void setOverwriteAcct (boolean OverwriteAcct)
{
set_Value (COLUMNNAME_OverwriteAcct, Boolean.valueOf(OverwriteAcct));
}
/** Get Overwrite Account.
@return Overwrite the account segment Account with the value specified */
public boolean isOverwriteAcct() 
{
Object oo = get_Value(COLUMNNAME_OverwriteAcct);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="82f77d1c-826f-998c-f6f7-7dddd31b822b")
public static String es_PE_FIELD_Line_OverwriteAccount_Name="Sobreescribe la cuenta";

@XendraTrl(Identifier="82f77d1c-826f-998c-f6f7-7dddd31b822b")
public static String es_PE_FIELD_Line_OverwriteAccount_Description="Sobreescriba la cuenta del segmento de la cuenta con el valor especificado";

@XendraTrl(Identifier="82f77d1c-826f-998c-f6f7-7dddd31b822b")
public static String es_PE_FIELD_Line_OverwriteAccount_Help="Si no es sobreescrito, el valor de la combinación original de la cuenta se utiliza. Si está seleccionado, pero no especificado, el segmento se fija a la falta de información.";

@XendraField(AD_Column_ID="OverwriteAcct",IsCentrallyMaintained=true,
AD_Tab_ID="14a46d50-420f-7989-582b-624b89dbc980",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="82f77d1c-826f-998c-f6f7-7dddd31b822b")
public static final String FIELDNAME_Line_OverwriteAccount="82f77d1c-826f-998c-f6f7-7dddd31b822b";

@XendraTrl(Identifier="6dbf1a75-e7df-fdfa-fa41-9ffcef405cac")
public static String es_PE_COLUMN_OverwriteAcct_Name="Sobreescribe la cuenta";

@XendraColumn(AD_Element_ID="91181c07-29f4-f9da-b8f4-54c3e1988932",ColumnName="OverwriteAcct",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6dbf1a75-e7df-fdfa-fa41-9ffcef405cac",
Synchronized="2019-08-30 22:22:34.0")
/** Column name OverwriteAcct */
public static final String COLUMNNAME_OverwriteAcct = "OverwriteAcct";
/** Set Overwrite Activity.
@param OverwriteActivity Overwrite the account segment Activity with the value specified */
public void setOverwriteActivity (boolean OverwriteActivity)
{
set_Value (COLUMNNAME_OverwriteActivity, Boolean.valueOf(OverwriteActivity));
}
/** Get Overwrite Activity.
@return Overwrite the account segment Activity with the value specified */
public boolean isOverwriteActivity() 
{
Object oo = get_Value(COLUMNNAME_OverwriteActivity);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="15d9f274-fe73-42e3-6fc5-18f176f15c33")
public static String es_PE_FIELD_Line_OverwriteActivity_Name="Sobreesccribe la Actividad";

@XendraTrl(Identifier="15d9f274-fe73-42e3-6fc5-18f176f15c33")
public static String es_PE_FIELD_Line_OverwriteActivity_Description="Sobreescriba la cuenta del segmento de la Actividad con el valor especificado";

@XendraTrl(Identifier="15d9f274-fe73-42e3-6fc5-18f176f15c33")
public static String es_PE_FIELD_Line_OverwriteActivity_Help="Si no es sobreescrito, el valor de la combinación original de la cuenta se utiliza. Si está seleccionado, pero no especificado, el segmento se fija a la falta de información.";

@XendraField(AD_Column_ID="OverwriteActivity",IsCentrallyMaintained=true,
AD_Tab_ID="14a46d50-420f-7989-582b-624b89dbc980",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="@$Element_AY@=Y",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="15d9f274-fe73-42e3-6fc5-18f176f15c33")
public static final String FIELDNAME_Line_OverwriteActivity="15d9f274-fe73-42e3-6fc5-18f176f15c33";

@XendraTrl(Identifier="b7927631-7512-d1b7-7439-8d114a111b8b")
public static String es_PE_COLUMN_OverwriteActivity_Name="Sobreesccribe la Actividad";

@XendraColumn(AD_Element_ID="f60a90e5-b7a2-daad-ae84-40a14b2df9f1",ColumnName="OverwriteActivity",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b7927631-7512-d1b7-7439-8d114a111b8b",
Synchronized="2019-08-30 22:22:34.0")
/** Column name OverwriteActivity */
public static final String COLUMNNAME_OverwriteActivity = "OverwriteActivity";
/** Set Overwrite Bus.Partner.
@param OverwriteBPartner Overwrite the account segment Business Partner with the value specified */
public void setOverwriteBPartner (boolean OverwriteBPartner)
{
set_Value (COLUMNNAME_OverwriteBPartner, Boolean.valueOf(OverwriteBPartner));
}
/** Get Overwrite Bus.Partner.
@return Overwrite the account segment Business Partner with the value specified */
public boolean isOverwriteBPartner() 
{
Object oo = get_Value(COLUMNNAME_OverwriteBPartner);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="bcc49179-95e5-d1c8-080c-6a01c33e8cff")
public static String es_PE_FIELD_Line_OverwriteBusPartner_Name="Sobreescribe Socio de Negocio";

@XendraTrl(Identifier="bcc49179-95e5-d1c8-080c-6a01c33e8cff")
public static String es_PE_FIELD_Line_OverwriteBusPartner_Description="Sobreescriba la cuenta del segmento del S. Negocio con el valor especificado.";

@XendraTrl(Identifier="bcc49179-95e5-d1c8-080c-6a01c33e8cff")
public static String es_PE_FIELD_Line_OverwriteBusPartner_Help="Si no es sobreescrito, el valor de la combinación original de la cuenta se utiliza. Si está seleccionado, pero no especificado, el segmento se fija a la falta de información.";

@XendraField(AD_Column_ID="OverwriteBPartner",IsCentrallyMaintained=true,
AD_Tab_ID="14a46d50-420f-7989-582b-624b89dbc980",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="@$Element_BP@=Y",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="bcc49179-95e5-d1c8-080c-6a01c33e8cff")
public static final String FIELDNAME_Line_OverwriteBusPartner="bcc49179-95e5-d1c8-080c-6a01c33e8cff";

@XendraTrl(Identifier="c9af7b64-625d-414a-6369-4079b86bc814")
public static String es_PE_COLUMN_OverwriteBPartner_Name="Sobreescribe Socio de Negocio";

@XendraColumn(AD_Element_ID="f1cdd154-93a5-68a8-61be-ea379edfa29d",ColumnName="OverwriteBPartner",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c9af7b64-625d-414a-6369-4079b86bc814",
Synchronized="2019-08-30 22:22:34.0")
/** Column name OverwriteBPartner */
public static final String COLUMNNAME_OverwriteBPartner = "OverwriteBPartner";
/** Set Overwrite Campaign.
@param OverwriteCampaign Overwrite the account segment Campaign with the value specified */
public void setOverwriteCampaign (boolean OverwriteCampaign)
{
set_Value (COLUMNNAME_OverwriteCampaign, Boolean.valueOf(OverwriteCampaign));
}
/** Get Overwrite Campaign.
@return Overwrite the account segment Campaign with the value specified */
public boolean isOverwriteCampaign() 
{
Object oo = get_Value(COLUMNNAME_OverwriteCampaign);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="d8a9706f-fef7-14e6-f141-bc3f0c38deb4")
public static String es_PE_FIELD_Line_OverwriteCampaign_Name="Sobreescribe Compañía";

@XendraTrl(Identifier="d8a9706f-fef7-14e6-f141-bc3f0c38deb4")
public static String es_PE_FIELD_Line_OverwriteCampaign_Description="Sobreescriba la cuenta del segmento de Compañía con el valor especificado";

@XendraTrl(Identifier="d8a9706f-fef7-14e6-f141-bc3f0c38deb4")
public static String es_PE_FIELD_Line_OverwriteCampaign_Help="Si no es sobreescrito, el valor de la combinación original de la cuenta se utiliza. Si está seleccionado, pero no especificado, el segmento se fija a la falta de información.";

@XendraField(AD_Column_ID="OverwriteCampaign",IsCentrallyMaintained=true,
AD_Tab_ID="14a46d50-420f-7989-582b-624b89dbc980",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="@$Element_MC@=Y",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d8a9706f-fef7-14e6-f141-bc3f0c38deb4")
public static final String FIELDNAME_Line_OverwriteCampaign="d8a9706f-fef7-14e6-f141-bc3f0c38deb4";

@XendraTrl(Identifier="ee9bf87e-8c33-3da8-9c14-652f24261888")
public static String es_PE_COLUMN_OverwriteCampaign_Name="Sobreescribe Compañía";

@XendraColumn(AD_Element_ID="0c0c52f3-14f2-c7ba-806e-0cf1d7caf216",ColumnName="OverwriteCampaign",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ee9bf87e-8c33-3da8-9c14-652f24261888",
Synchronized="2019-08-30 22:22:34.0")
/** Column name OverwriteCampaign */
public static final String COLUMNNAME_OverwriteCampaign = "OverwriteCampaign";
/** Set Overwrite Location From.
@param OverwriteLocFrom Overwrite the account segment Location From with the value specified */
public void setOverwriteLocFrom (boolean OverwriteLocFrom)
{
set_Value (COLUMNNAME_OverwriteLocFrom, Boolean.valueOf(OverwriteLocFrom));
}
/** Get Overwrite Location From.
@return Overwrite the account segment Location From with the value specified */
public boolean isOverwriteLocFrom() 
{
Object oo = get_Value(COLUMNNAME_OverwriteLocFrom);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="f0b66af6-b1c1-01ed-4487-ca7b19c9dd28")
public static String es_PE_FIELD_Line_OverwriteLocationFrom_Name="Sobreescribe Localización Desde";

@XendraTrl(Identifier="f0b66af6-b1c1-01ed-4487-ca7b19c9dd28")
public static String es_PE_FIELD_Line_OverwriteLocationFrom_Description="Sobreescriba la cuenta del segmento de Localización desde con el valor especificado";

@XendraTrl(Identifier="f0b66af6-b1c1-01ed-4487-ca7b19c9dd28")
public static String es_PE_FIELD_Line_OverwriteLocationFrom_Help="Si no es sobreescrito, el valor de la combinación original de la cuenta se utiliza. Si está seleccionado, pero no especificado, el segmento se fija a la falta de información.";

@XendraField(AD_Column_ID="OverwriteLocFrom",IsCentrallyMaintained=true,
AD_Tab_ID="14a46d50-420f-7989-582b-624b89dbc980",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="@$Element_LF@=Y",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f0b66af6-b1c1-01ed-4487-ca7b19c9dd28")
public static final String FIELDNAME_Line_OverwriteLocationFrom="f0b66af6-b1c1-01ed-4487-ca7b19c9dd28";

@XendraTrl(Identifier="201ec36f-49fc-2e96-d169-24d822e381b3")
public static String es_PE_COLUMN_OverwriteLocFrom_Name="Sobreescribe Localización Desde";

@XendraColumn(AD_Element_ID="74193e7a-a42c-2f1c-d785-dd677cb7884b",ColumnName="OverwriteLocFrom",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="201ec36f-49fc-2e96-d169-24d822e381b3",
Synchronized="2019-08-30 22:22:34.0")
/** Column name OverwriteLocFrom */
public static final String COLUMNNAME_OverwriteLocFrom = "OverwriteLocFrom";
/** Set Overwrite Location To.
@param OverwriteLocTo Overwrite the account segment Location From with the value specified */
public void setOverwriteLocTo (boolean OverwriteLocTo)
{
set_Value (COLUMNNAME_OverwriteLocTo, Boolean.valueOf(OverwriteLocTo));
}
/** Get Overwrite Location To.
@return Overwrite the account segment Location From with the value specified */
public boolean isOverwriteLocTo() 
{
Object oo = get_Value(COLUMNNAME_OverwriteLocTo);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="03380a55-9400-2711-bc5f-32ad8b43443e")
public static String es_PE_FIELD_Line_OverwriteLocationTo_Name="Sobreescribe Localización Hasta";

@XendraTrl(Identifier="03380a55-9400-2711-bc5f-32ad8b43443e")
public static String es_PE_FIELD_Line_OverwriteLocationTo_Description="Sobreescriba la cuenta del segmento de localización hasta con el valor especificado";

@XendraTrl(Identifier="03380a55-9400-2711-bc5f-32ad8b43443e")
public static String es_PE_FIELD_Line_OverwriteLocationTo_Help="Si no es sobreescrito, el valor de la combinación original de la cuenta se utiliza. Si está seleccionado, pero no especificado, el segmento se fija a la falta de información.";

@XendraField(AD_Column_ID="OverwriteLocTo",IsCentrallyMaintained=true,
AD_Tab_ID="14a46d50-420f-7989-582b-624b89dbc980",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="@$Element_LT@=Y",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="03380a55-9400-2711-bc5f-32ad8b43443e")
public static final String FIELDNAME_Line_OverwriteLocationTo="03380a55-9400-2711-bc5f-32ad8b43443e";

@XendraTrl(Identifier="b362f949-6834-4664-19b0-778706739346")
public static String es_PE_COLUMN_OverwriteLocTo_Name="Sobreescribe Localización Hasta";

@XendraColumn(AD_Element_ID="9aafe472-43d0-df69-b600-4f36a5fe8f9e",ColumnName="OverwriteLocTo",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b362f949-6834-4664-19b0-778706739346",
Synchronized="2019-08-30 22:22:34.0")
/** Column name OverwriteLocTo */
public static final String COLUMNNAME_OverwriteLocTo = "OverwriteLocTo";
/** Set Overwrite Organization.
@param OverwriteOrg Overwrite the account segment Organization with the value specified */
public void setOverwriteOrg (boolean OverwriteOrg)
{
set_Value (COLUMNNAME_OverwriteOrg, Boolean.valueOf(OverwriteOrg));
}
/** Get Overwrite Organization.
@return Overwrite the account segment Organization with the value specified */
public boolean isOverwriteOrg() 
{
Object oo = get_Value(COLUMNNAME_OverwriteOrg);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="e2c26294-64d6-0d38-1d65-66c65efb7f77")
public static String es_PE_FIELD_Line_OverwriteOrganization_Name="Sobreescribe Organización";

@XendraTrl(Identifier="e2c26294-64d6-0d38-1d65-66c65efb7f77")
public static String es_PE_FIELD_Line_OverwriteOrganization_Description="Sobreescriba la cuenta del segmento de Org. con el valor especificado";

@XendraTrl(Identifier="e2c26294-64d6-0d38-1d65-66c65efb7f77")
public static String es_PE_FIELD_Line_OverwriteOrganization_Help="Si no es sobreescrito, el valor de la combinación original de la cuenta se utiliza. Si está seleccionado, pero no especificado, el segmento se fija a la falta de información.";

@XendraField(AD_Column_ID="OverwriteOrg",IsCentrallyMaintained=true,
AD_Tab_ID="14a46d50-420f-7989-582b-624b89dbc980",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e2c26294-64d6-0d38-1d65-66c65efb7f77")
public static final String FIELDNAME_Line_OverwriteOrganization="e2c26294-64d6-0d38-1d65-66c65efb7f77";

@XendraTrl(Identifier="6dce3f9c-f6ae-f376-5a23-f3b1354d498c")
public static String es_PE_COLUMN_OverwriteOrg_Name="Sobreescribe Organización";

@XendraColumn(AD_Element_ID="b352392c-639a-6299-0629-e73ce0874c98",ColumnName="OverwriteOrg",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6dce3f9c-f6ae-f376-5a23-f3b1354d498c",
Synchronized="2019-08-30 22:22:34.0")
/** Column name OverwriteOrg */
public static final String COLUMNNAME_OverwriteOrg = "OverwriteOrg";
/** Set Overwrite Trx Organuzation.
@param OverwriteOrgTrx Overwrite the account segment Transaction Organization with the value specified */
public void setOverwriteOrgTrx (boolean OverwriteOrgTrx)
{
set_Value (COLUMNNAME_OverwriteOrgTrx, Boolean.valueOf(OverwriteOrgTrx));
}
/** Get Overwrite Trx Organuzation.
@return Overwrite the account segment Transaction Organization with the value specified */
public boolean isOverwriteOrgTrx() 
{
Object oo = get_Value(COLUMNNAME_OverwriteOrgTrx);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="b03c2829-8d35-eec3-4e01-76c3c54ade61")
public static String es_PE_FIELD_Line_OverwriteTrxOrganuzation_Name="Sobreescribe Trans. Organización";

@XendraTrl(Identifier="b03c2829-8d35-eec3-4e01-76c3c54ade61")
public static String es_PE_FIELD_Line_OverwriteTrxOrganuzation_Description="Sobreescriba la cuenta del segmento de Trans. Organización con el valor especificado.";

@XendraTrl(Identifier="b03c2829-8d35-eec3-4e01-76c3c54ade61")
public static String es_PE_FIELD_Line_OverwriteTrxOrganuzation_Help="Si no es sobreescrito, el valor de la combinación original de la cuenta se utiliza. Si está seleccionado, pero no especificado, el segmento se fija a la falta de información.";

@XendraField(AD_Column_ID="OverwriteOrgTrx",IsCentrallyMaintained=true,
AD_Tab_ID="14a46d50-420f-7989-582b-624b89dbc980",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="@$Element_OT@=Y",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b03c2829-8d35-eec3-4e01-76c3c54ade61")
public static final String FIELDNAME_Line_OverwriteTrxOrganuzation="b03c2829-8d35-eec3-4e01-76c3c54ade61";

@XendraTrl(Identifier="ef8fdf4c-ac27-8ea5-4e36-e8aa71d767a6")
public static String es_PE_COLUMN_OverwriteOrgTrx_Name="Sobreescribe Trans. Organización";

@XendraColumn(AD_Element_ID="978bfb9f-932e-ded9-9f93-03c9e5809208",ColumnName="OverwriteOrgTrx",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ef8fdf4c-ac27-8ea5-4e36-e8aa71d767a6",
Synchronized="2019-08-30 22:22:34.0")
/** Column name OverwriteOrgTrx */
public static final String COLUMNNAME_OverwriteOrgTrx = "OverwriteOrgTrx";
/** Set Overwrite Product.
@param OverwriteProduct Overwrite the account segment Product with the value specified */
public void setOverwriteProduct (boolean OverwriteProduct)
{
set_Value (COLUMNNAME_OverwriteProduct, Boolean.valueOf(OverwriteProduct));
}
/** Get Overwrite Product.
@return Overwrite the account segment Product with the value specified */
public boolean isOverwriteProduct() 
{
Object oo = get_Value(COLUMNNAME_OverwriteProduct);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="2276d62b-ed69-ede1-4e06-83a42fc2bec6")
public static String es_PE_FIELD_Line_OverwriteProduct_Name="Sobreescribe Producto";

@XendraTrl(Identifier="2276d62b-ed69-ede1-4e06-83a42fc2bec6")
public static String es_PE_FIELD_Line_OverwriteProduct_Description="Sobreescriba la cuenta del segmento de producto con el valor especificado";

@XendraTrl(Identifier="2276d62b-ed69-ede1-4e06-83a42fc2bec6")
public static String es_PE_FIELD_Line_OverwriteProduct_Help="Si no es sobreescrito, el valor de la combinación original de la cuenta se utiliza. Si está seleccionado, pero no especificado, el segmento se fija a la falta de información.";

@XendraField(AD_Column_ID="OverwriteProduct",IsCentrallyMaintained=true,
AD_Tab_ID="14a46d50-420f-7989-582b-624b89dbc980",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="@$Element_PR@=Y",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2276d62b-ed69-ede1-4e06-83a42fc2bec6")
public static final String FIELDNAME_Line_OverwriteProduct="2276d62b-ed69-ede1-4e06-83a42fc2bec6";

@XendraTrl(Identifier="139c42a3-5c76-cba8-8ab9-8a19a869ec1b")
public static String es_PE_COLUMN_OverwriteProduct_Name="Sobreescribe Producto";

@XendraColumn(AD_Element_ID="aa1da857-7c8a-de6f-6b8b-8dfedeac814b",ColumnName="OverwriteProduct",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="139c42a3-5c76-cba8-8ab9-8a19a869ec1b",
Synchronized="2019-08-30 22:22:34.0")
/** Column name OverwriteProduct */
public static final String COLUMNNAME_OverwriteProduct = "OverwriteProduct";
/** Set Overwrite Project.
@param OverwriteProject Overwrite the account segment Project with the value specified */
public void setOverwriteProject (boolean OverwriteProject)
{
set_Value (COLUMNNAME_OverwriteProject, Boolean.valueOf(OverwriteProject));
}
/** Get Overwrite Project.
@return Overwrite the account segment Project with the value specified */
public boolean isOverwriteProject() 
{
Object oo = get_Value(COLUMNNAME_OverwriteProject);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="73a22c78-bc19-becc-2c0a-9d28ac33d2af")
public static String es_PE_FIELD_Line_OverwriteProject_Name="Sobre Escribe Proyecto";

@XendraTrl(Identifier="73a22c78-bc19-becc-2c0a-9d28ac33d2af")
public static String es_PE_FIELD_Line_OverwriteProject_Description="Overwrite the account segment Project with the value specified";

@XendraTrl(Identifier="73a22c78-bc19-becc-2c0a-9d28ac33d2af")
public static String es_PE_FIELD_Line_OverwriteProject_Help="If not overwritten, the value of the original account combination is used. If selected, but not specified, the segment is set to null.";

@XendraField(AD_Column_ID="OverwriteProject",IsCentrallyMaintained=false,
AD_Tab_ID="14a46d50-420f-7989-582b-624b89dbc980",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="@$Element_PJ@=Y",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="73a22c78-bc19-becc-2c0a-9d28ac33d2af")
public static final String FIELDNAME_Line_OverwriteProject="73a22c78-bc19-becc-2c0a-9d28ac33d2af";

@XendraTrl(Identifier="b0860e64-a02c-016b-153b-537d4d25acda")
public static String es_PE_COLUMN_OverwriteProject_Name="Sobreescribe Proyecto";

@XendraColumn(AD_Element_ID="3055b62b-19a8-f938-4553-c21e853ba819",ColumnName="OverwriteProject",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b0860e64-a02c-016b-153b-537d4d25acda",
Synchronized="2019-08-30 22:22:34.0")
/** Column name OverwriteProject */
public static final String COLUMNNAME_OverwriteProject = "OverwriteProject";
/** Set Overwrite Sales Region.
@param OverwriteSalesRegion Overwrite the account segment Sales Region with the value specified */
public void setOverwriteSalesRegion (boolean OverwriteSalesRegion)
{
set_Value (COLUMNNAME_OverwriteSalesRegion, Boolean.valueOf(OverwriteSalesRegion));
}
/** Get Overwrite Sales Region.
@return Overwrite the account segment Sales Region with the value specified */
public boolean isOverwriteSalesRegion() 
{
Object oo = get_Value(COLUMNNAME_OverwriteSalesRegion);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="5a322614-a952-08d7-5cb6-86f263ca9ec6")
public static String es_PE_FIELD_Line_OverwriteSalesRegion_Name="Sobreescribe Región de Venta";

@XendraTrl(Identifier="5a322614-a952-08d7-5cb6-86f263ca9ec6")
public static String es_PE_FIELD_Line_OverwriteSalesRegion_Description="Sobreescriba la cuenta del segmento de región de ventas con el valor especificado.";

@XendraTrl(Identifier="5a322614-a952-08d7-5cb6-86f263ca9ec6")
public static String es_PE_FIELD_Line_OverwriteSalesRegion_Help="Si no es sobreescrito, el valor de la combinación original de la cuenta se utiliza. Si está seleccionado, pero no especificado, el segmento se fija a la falta de información.";

@XendraField(AD_Column_ID="OverwriteSalesRegion",IsCentrallyMaintained=true,
AD_Tab_ID="14a46d50-420f-7989-582b-624b89dbc980",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="@$Element_SR@=Y",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5a322614-a952-08d7-5cb6-86f263ca9ec6")
public static final String FIELDNAME_Line_OverwriteSalesRegion="5a322614-a952-08d7-5cb6-86f263ca9ec6";

@XendraTrl(Identifier="661bac3d-2548-dc42-3926-f7fc2913c808")
public static String es_PE_COLUMN_OverwriteSalesRegion_Name="Sobreescribe Región de Venta";

@XendraColumn(AD_Element_ID="3ebacd06-5748-e388-decf-4081cec027c1",
ColumnName="OverwriteSalesRegion",AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="N",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="661bac3d-2548-dc42-3926-f7fc2913c808",Synchronized="2019-08-30 22:22:34.0")
/** Column name OverwriteSalesRegion */
public static final String COLUMNNAME_OverwriteSalesRegion = "OverwriteSalesRegion";
/** Set Overwrite User1.
@param OverwriteUser1 Overwrite the account segment User 1 with the value specified */
public void setOverwriteUser1 (boolean OverwriteUser1)
{
set_Value (COLUMNNAME_OverwriteUser1, Boolean.valueOf(OverwriteUser1));
}
/** Get Overwrite User1.
@return Overwrite the account segment User 1 with the value specified */
public boolean isOverwriteUser1() 
{
Object oo = get_Value(COLUMNNAME_OverwriteUser1);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="3ae29a8f-1d4a-451b-d0fe-348419676a52")
public static String es_PE_FIELD_Line_OverwriteUser_Name="Sobreecribe Usuario 1";

@XendraTrl(Identifier="3ae29a8f-1d4a-451b-d0fe-348419676a52")
public static String es_PE_FIELD_Line_OverwriteUser_Description="Sobreescriba la cuenta del segmento de Usuario 1 con el valor especificado";

@XendraTrl(Identifier="3ae29a8f-1d4a-451b-d0fe-348419676a52")
public static String es_PE_FIELD_Line_OverwriteUser_Help="Si no es sobreescrito, el valor de la combinación original de la cuenta se utiliza. Si está seleccionado, pero no especificado, el segmento se fija a la falta de información.";

@XendraField(AD_Column_ID="OverwriteUser1",IsCentrallyMaintained=true,
AD_Tab_ID="14a46d50-420f-7989-582b-624b89dbc980",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="@$Element_U1@=Y",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3ae29a8f-1d4a-451b-d0fe-348419676a52")
public static final String FIELDNAME_Line_OverwriteUser="3ae29a8f-1d4a-451b-d0fe-348419676a52";

@XendraTrl(Identifier="a11d99b4-d2bc-645b-dc4a-b6bdf74a95f5")
public static String es_PE_COLUMN_OverwriteUser1_Name="Sobreecribe Usuario 1";

@XendraColumn(AD_Element_ID="3d1f730f-2c1e-0bbd-7e5b-9802c3fc7b60",ColumnName="OverwriteUser1",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a11d99b4-d2bc-645b-dc4a-b6bdf74a95f5",
Synchronized="2019-08-30 22:22:34.0")
/** Column name OverwriteUser1 */
public static final String COLUMNNAME_OverwriteUser1 = "OverwriteUser1";
/** Set Overwrite User2.
@param OverwriteUser2 Overwrite the account segment User 2 with the value specified */
public void setOverwriteUser2 (boolean OverwriteUser2)
{
set_Value (COLUMNNAME_OverwriteUser2, Boolean.valueOf(OverwriteUser2));
}
/** Get Overwrite User2.
@return Overwrite the account segment User 2 with the value specified */
public boolean isOverwriteUser2() 
{
Object oo = get_Value(COLUMNNAME_OverwriteUser2);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="b125d96b-1d52-d09b-2af2-3682a9ba34ce")
public static String es_PE_FIELD_Line_OverwriteUser22_Name="Sobreecribe Usuario 2";

@XendraTrl(Identifier="b125d96b-1d52-d09b-2af2-3682a9ba34ce")
public static String es_PE_FIELD_Line_OverwriteUser22_Description="Sobreescriba la cuenta del segmento de Usuario 2 con el valor especificado";

@XendraTrl(Identifier="b125d96b-1d52-d09b-2af2-3682a9ba34ce")
public static String es_PE_FIELD_Line_OverwriteUser22_Help="Si no es sobreescrito, el valor de la combinación original de la cuenta se utiliza. Si está seleccionado, pero no especificado, el segmento se fija a la falta de información.";

@XendraField(AD_Column_ID="OverwriteUser2",IsCentrallyMaintained=true,
AD_Tab_ID="14a46d50-420f-7989-582b-624b89dbc980",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="@$Element_U2@=Y",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b125d96b-1d52-d09b-2af2-3682a9ba34ce")
public static final String FIELDNAME_Line_OverwriteUser22="b125d96b-1d52-d09b-2af2-3682a9ba34ce";

@XendraTrl(Identifier="a5920cb3-8af5-b9d4-4e2a-3b5edb38a936")
public static String es_PE_COLUMN_OverwriteUser2_Name="Sobreecribe Usuario 2";

@XendraColumn(AD_Element_ID="02d12522-f69f-a634-4fa5-da9c39a9b42d",ColumnName="OverwriteUser2",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a5920cb3-8af5-b9d4-4e2a-3b5edb38a936",
Synchronized="2019-08-30 22:22:34.0")
/** Column name OverwriteUser2 */
public static final String COLUMNNAME_OverwriteUser2 = "OverwriteUser2";
/** Set Percent.
@param Percent Percentage */
public void setPercent (BigDecimal Percent)
{
if (Percent == null) throw new IllegalArgumentException ("Percent is mandatory.");
set_Value (COLUMNNAME_Percent, Percent);
}
/** Get Percent.
@return Percentage */
public BigDecimal getPercent() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Percent);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="5386ef91-8f54-7d8b-80ea-3ae9f5671dcd")
public static String es_PE_FIELD_Line_Percent_Name="Porcentaje";

@XendraTrl(Identifier="5386ef91-8f54-7d8b-80ea-3ae9f5671dcd")
public static String es_PE_FIELD_Line_Percent_Description="Porcentaje de retención";

@XendraTrl(Identifier="5386ef91-8f54-7d8b-80ea-3ae9f5671dcd")
public static String es_PE_FIELD_Line_Percent_Help="El porcentaje indica el porcentaje usado para retención.";

@XendraField(AD_Column_ID="Percent",IsCentrallyMaintained=true,
AD_Tab_ID="14a46d50-420f-7989-582b-624b89dbc980",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5386ef91-8f54-7d8b-80ea-3ae9f5671dcd")
public static final String FIELDNAME_Line_Percent="5386ef91-8f54-7d8b-80ea-3ae9f5671dcd";

@XendraTrl(Identifier="978e3c08-4c18-d90b-c77c-4947f8295beb")
public static String es_PE_COLUMN_Percent_Name="Porcentaje";

@XendraColumn(AD_Element_ID="a70b0c31-700a-d879-f313-b31531c93f04",ColumnName="Percent",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="978e3c08-4c18-d90b-c77c-4947f8295beb",
Synchronized="2019-08-30 22:22:34.0")
/** Column name Percent */
public static final String COLUMNNAME_Percent = "Percent";
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

@XendraTrl(Identifier="a6f3cd7a-8a45-212f-873c-8b397f61f6ae")
public static String es_PE_FIELD_Line_UserList_Name="Usuario 1";

@XendraTrl(Identifier="a6f3cd7a-8a45-212f-873c-8b397f61f6ae")
public static String es_PE_FIELD_Line_UserList_Description="El usuario definió el elemento # 1";

@XendraTrl(Identifier="a6f3cd7a-8a45-212f-873c-8b397f61f6ae")
public static String es_PE_FIELD_Line_UserList_Help="El elemento definido por el usuario despliega los elementos opcionales que han sido definidos para esta combinación de cuentas";

@XendraField(AD_Column_ID="User1_ID",IsCentrallyMaintained=true,
AD_Tab_ID="14a46d50-420f-7989-582b-624b89dbc980",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="@$Element_U1@=Y & @OverwriteUser1@=Y",DisplayLength=14,IsReadOnly=false,SeqNo=0,
SortNo=0,IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="a6f3cd7a-8a45-212f-873c-8b397f61f6ae")
public static final String FIELDNAME_Line_UserList="a6f3cd7a-8a45-212f-873c-8b397f61f6ae";

@XendraTrl(Identifier="7d706590-42d5-d91b-bb2d-b384204fd3af")
public static String es_PE_COLUMN_User1_ID_Name="Usuario 1";

@XendraColumn(AD_Element_ID="07453e74-aadd-d9c9-e543-837a6fdb3094",ColumnName="User1_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="5a2fe161-044f-67cb-3791-6d615980cabb",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="7d706590-42d5-d91b-bb2d-b384204fd3af",Synchronized="2019-08-30 22:22:34.0")
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

@XendraTrl(Identifier="b8a75734-270c-390b-cf64-3a4fbcae3772")
public static String es_PE_FIELD_Line_UserList22_Name="Usuario 2";

@XendraTrl(Identifier="b8a75734-270c-390b-cf64-3a4fbcae3772")
public static String es_PE_FIELD_Line_UserList22_Description="El usuario definió el elemento # 2";

@XendraTrl(Identifier="b8a75734-270c-390b-cf64-3a4fbcae3772")
public static String es_PE_FIELD_Line_UserList22_Help="El elemento definido por el usuario despliega los elementos opcionales que han sido definidos para esta combinación de cuentas";

@XendraField(AD_Column_ID="User2_ID",IsCentrallyMaintained=true,
AD_Tab_ID="14a46d50-420f-7989-582b-624b89dbc980",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="@$Element_U2@=Y & @OverwriteUser2@=Y",DisplayLength=14,IsReadOnly=false,SeqNo=0,
SortNo=0,IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="b8a75734-270c-390b-cf64-3a4fbcae3772")
public static final String FIELDNAME_Line_UserList22="b8a75734-270c-390b-cf64-3a4fbcae3772";

@XendraTrl(Identifier="428088d3-448b-dab1-1978-c8eecd5a2769")
public static String es_PE_COLUMN_User2_ID_Name="Usuario 2";

@XendraColumn(AD_Element_ID="1b668c90-6743-20a2-df62-576857d72c06",ColumnName="User2_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="6a357ab2-7bb6-fce4-ffee-8bdd855a77fc",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="428088d3-448b-dab1-1978-c8eecd5a2769",Synchronized="2019-08-30 22:22:34.0")
/** Column name User2_ID */
public static final String COLUMNNAME_User2_ID = "User2_ID";
}
