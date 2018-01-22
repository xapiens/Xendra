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
import org.compiere.model.reference.REF_AD_UserBPAccessType;
import org.compiere.model.reference.REF_C_DocTypeDocBaseType;
/** Generated Model for AD_UserBPAccess
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_AD_UserBPAccess extends PO
{
/** Standard Constructor
@param ctx context
@param AD_UserBPAccess_ID id
@param trxName transaction
*/
public X_AD_UserBPAccess (Properties ctx, int AD_UserBPAccess_ID, String trxName)
{
super (ctx, AD_UserBPAccess_ID, trxName);
/** if (AD_UserBPAccess_ID == 0)
{
setAD_UserBPAccess_ID (0);
setAD_User_ID (0);
setBPAccessType (null);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_AD_UserBPAccess (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=813 */
public static int Table_ID=MTable.getTable_ID("AD_UserBPAccess");

@XendraTrl(Identifier="6a9701f2-3fea-792b-c218-c52a12b16cbf")
public static String es_PE_TAB_BPAccess_Description="Acceso a Usuario/Contacto para información Socio del Negocio y Recursos";

@XendraTrl(Identifier="6a9701f2-3fea-792b-c218-c52a12b16cbf")
public static String es_PE_TAB_BPAccess_Name="Acceso SN";

@XendraTrl(Identifier="6a9701f2-3fea-792b-c218-c52a12b16cbf")
public static String es_PE_TAB_BPAccess_Help="Si en Nivel de Usuario, \"SN Acceso Total\" No es seleccionado, aqui debe proprcionar acceso explícitamente.";

@XendraTab(Name="BP Access",
Description="Access of the User/Contact to Business Partner information and resources",
Help="If on User level, 'Full BP Access' is NOT selected, you need to give access explicitly here. ",
AD_Window_ID="273719a2-ec2e-9b44-d30b-014c7ec70d0e",SeqNo=105,TabLevel=2,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="@IsFullBPAccess@!Y",
DisplayLogic="",IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="6a9701f2-3fea-792b-c218-c52a12b16cbf",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_BPAccess="6a9701f2-3fea-792b-c218-c52a12b16cbf";

@XendraTrl(Identifier="747978f4-c48f-bcba-377c-670964246441")
public static String es_PE_TABLE_AD_UserBPAccess_Name="Usuario SN Acceso";

@XendraTable(Name="User BP Access",
Description="User/concat access to Business Partner information and resources",Help="",
TableName="AD_UserBPAccess",AccessLevel="2",AD_Window_ID="273719a2-ec2e-9b44-d30b-014c7ec70d0e",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=145,IsSecurityEnabled=false,IsDeleteable=false,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.dictionary",
Identifier="747978f4-c48f-bcba-377c-670964246441",Synchronized="2017-08-16 11:41:06.0")
/** TableName=AD_UserBPAccess */
public static final String Table_Name="AD_UserBPAccess";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"AD_UserBPAccess");

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
    Table_ID = MTable.getTable_ID("AD_UserBPAccess");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_AD_UserBPAccess[").append(get_ID()).append("]");
return sb.toString();
}
/** Set User BP Access.
@param AD_UserBPAccess_ID User/concat access to Business Partner information and resources */
public void setAD_UserBPAccess_ID (int AD_UserBPAccess_ID)
{
if (AD_UserBPAccess_ID < 1) throw new IllegalArgumentException ("AD_UserBPAccess_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_AD_UserBPAccess_ID, Integer.valueOf(AD_UserBPAccess_ID));
}
/** Get User BP Access.
@return User/concat access to Business Partner information and resources */
public int getAD_UserBPAccess_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_UserBPAccess_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="cd58b0b7-775d-efe1-ca06-4db4c9ce4f1e")
public static String es_PE_FIELD_BPAccess_UserBPAccess_Description="Usuario/contacto acceso información Socio del Negocio y recursos";

@XendraTrl(Identifier="cd58b0b7-775d-efe1-ca06-4db4c9ce4f1e")
public static String es_PE_FIELD_BPAccess_UserBPAccess_Help="Si en Nivel de Usuario, \"Acceso Total SN\" NO es seleccionado, usted debe dar acceso explicítamente aquí. ";

@XendraTrl(Identifier="cd58b0b7-775d-efe1-ca06-4db4c9ce4f1e")
public static String es_PE_FIELD_BPAccess_UserBPAccess_Name="Usuario SN Acceso";

@XendraField(AD_Column_ID="AD_UserBPAccess_ID",IsCentrallyMaintained=true,
AD_Tab_ID="6a9701f2-3fea-792b-c218-c52a12b16cbf",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="cd58b0b7-775d-efe1-ca06-4db4c9ce4f1e")
public static final String FIELDNAME_BPAccess_UserBPAccess="cd58b0b7-775d-efe1-ca06-4db4c9ce4f1e";
/** Column name AD_UserBPAccess_ID */
public static final String COLUMNNAME_AD_UserBPAccess_ID = "AD_UserBPAccess_ID";
/** Set User/Contact.
@param AD_User_ID User within the system - Internal or Business Partner Contact */
public void setAD_User_ID (int AD_User_ID)
{
if (AD_User_ID < 1) throw new IllegalArgumentException ("AD_User_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_AD_User_ID, Integer.valueOf(AD_User_ID));
}
/** Get User/Contact.
@return User within the system - Internal or Business Partner Contact */
public int getAD_User_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_User_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="dca8fee2-5df1-a707-75f9-2ee25b9ced3b")
public static String es_PE_FIELD_BPAccess_UserContact_Description="ID de Usuario dentro del sistema";

@XendraTrl(Identifier="dca8fee2-5df1-a707-75f9-2ee25b9ced3b")
public static String es_PE_FIELD_BPAccess_UserContact_Help="La ID de usuario identifica un usuario único en el sistema";

@XendraTrl(Identifier="dca8fee2-5df1-a707-75f9-2ee25b9ced3b")
public static String es_PE_FIELD_BPAccess_UserContact_Name="Usuario";

@XendraField(AD_Column_ID="AD_User_ID",IsCentrallyMaintained=true,
AD_Tab_ID="6a9701f2-3fea-792b-c218-c52a12b16cbf",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=true,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="dca8fee2-5df1-a707-75f9-2ee25b9ced3b")
public static final String FIELDNAME_BPAccess_UserContact="dca8fee2-5df1-a707-75f9-2ee25b9ced3b";

@XendraTrl(Identifier="45a25bab-339e-6b73-9e13-e48ee6a3e8a3")
public static String es_PE_COLUMN_AD_User_ID_Name="Usuario";

@XendraColumn(AD_Element_ID="abdf8dee-d3cd-73ec-c758-683e907797f4",ColumnName="AD_User_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="45a25bab-339e-6b73-9e13-e48ee6a3e8a3",
Synchronized="2017-08-05 16:52:56.0")
/** Column name AD_User_ID */
public static final String COLUMNNAME_AD_User_ID = "AD_User_ID";

/** BPAccessType AD_Reference=b91997d1-0b55-305c-e3a9-787eb5f609e8 */
public static final int BPACCESSTYPE_AD_Reference_ID=358;
/** Set Access Type.
@param BPAccessType Type of Access of the user/contact to Business Partner information and resources */
public void setBPAccessType (String BPAccessType)
{
if (BPAccessType == null) throw new IllegalArgumentException ("BPAccessType is mandatory");
if (BPAccessType.equals(REF_AD_UserBPAccessType.BusinessDocuments) || BPAccessType.equals(REF_AD_UserBPAccessType.Requests) || BPAccessType.equals(REF_AD_UserBPAccessType.AssetsDownload));
 else throw new IllegalArgumentException ("BPAccessType Invalid value - " + BPAccessType + " - Reference_ID=358 - B - R - A");
if (BPAccessType.length() > 1)
{
log.warning("Length > 1 - truncated");
BPAccessType = BPAccessType.substring(0,0);
}
set_Value (COLUMNNAME_BPAccessType, BPAccessType);
}
/** Get Access Type.
@return Type of Access of the user/contact to Business Partner information and resources */
public String getBPAccessType() 
{
return (String)get_Value(COLUMNNAME_BPAccessType);
}

@XendraTrl(Identifier="9c0894db-cfca-adba-0fc8-b70cc679ad08")
public static String es_PE_FIELD_BPAccess_AccessType_Description="Tipo de  Acceso del usuario/contacto para Información del Socio del Negocio y  recursos";

@XendraTrl(Identifier="9c0894db-cfca-adba-0fc8-b70cc679ad08")
public static String es_PE_FIELD_BPAccess_AccessType_Help="Si es Referente a Nivel de Usuario, \"Acceso Total SN\" No es seleccionado, de acceso explícitamente";

@XendraTrl(Identifier="9c0894db-cfca-adba-0fc8-b70cc679ad08")
public static String es_PE_FIELD_BPAccess_AccessType_Name="Tipo Acceso";

@XendraField(AD_Column_ID="BPAccessType",IsCentrallyMaintained=true,
AD_Tab_ID="6a9701f2-3fea-792b-c218-c52a12b16cbf",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9c0894db-cfca-adba-0fc8-b70cc679ad08")
public static final String FIELDNAME_BPAccess_AccessType="9c0894db-cfca-adba-0fc8-b70cc679ad08";

@XendraTrl(Identifier="f65ea09f-bfe2-0ab5-8357-4bb185b93be7")
public static String es_PE_COLUMN_BPAccessType_Name="Tipo Acceso";

@XendraColumn(AD_Element_ID="20374e56-8fb5-3dcc-a3f8-5bf6004b6bd7",ColumnName="BPAccessType",
AD_Reference_ID=17,AD_Reference_Value_ID="b91997d1-0b55-305c-e3a9-787eb5f609e8",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="f65ea09f-bfe2-0ab5-8357-4bb185b93be7",Synchronized="2017-08-05 16:52:56.0")
/** Column name BPAccessType */
public static final String COLUMNNAME_BPAccessType = "BPAccessType";

/** DocBaseType AD_Reference=c1999318-834d-4c66-5345-371ffe3c1f06 */
public static final int DOCBASETYPE_AD_Reference_ID=183;
/** Set Document BaseType.
@param DocBaseType Logical type of document */
public void setDocBaseType (String DocBaseType)
{
if (DocBaseType == null || DocBaseType.equals(REF_C_DocTypeDocBaseType.PurchaseOrder) || DocBaseType.equals(REF_C_DocTypeDocBaseType.PurchaseRequisition) || DocBaseType.equals(REF_C_DocTypeDocBaseType.MatchInvoice) || DocBaseType.equals(REF_C_DocTypeDocBaseType.MaterialProduction) || DocBaseType.equals(REF_C_DocTypeDocBaseType.ProjectIssue) || DocBaseType.equals(REF_C_DocTypeDocBaseType.APCreditMemo) || DocBaseType.equals(REF_C_DocTypeDocBaseType.ARCreditMemo) || DocBaseType.equals(REF_C_DocTypeDocBaseType.GLJournal) || DocBaseType.equals(REF_C_DocTypeDocBaseType.GLDocument) || DocBaseType.equals(REF_C_DocTypeDocBaseType.APInvoice) || DocBaseType.equals(REF_C_DocTypeDocBaseType.MatchPO) || DocBaseType.equals(REF_C_DocTypeDocBaseType.CashJournal) || DocBaseType.equals(REF_C_DocTypeDocBaseType.BillOfExchange) || DocBaseType.equals(REF_C_DocTypeDocBaseType.PersonalFeeShip) || DocBaseType.equals(REF_C_DocTypeDocBaseType.MaterialReturnOfVendor) || DocBaseType.equals(REF_C_DocTypeDocBaseType.MaterialReturnOfCustomer) || DocBaseType.equals(REF_C_DocTypeDocBaseType.APPayment) || DocBaseType.equals(REF_C_DocTypeDocBaseType.ARInvoice) || DocBaseType.equals(REF_C_DocTypeDocBaseType.ARReceipt) || DocBaseType.equals(REF_C_DocTypeDocBaseType.SalesOrder) || DocBaseType.equals(REF_C_DocTypeDocBaseType.ARProFormaInvoice) || DocBaseType.equals(REF_C_DocTypeDocBaseType.MaterialDelivery) || DocBaseType.equals(REF_C_DocTypeDocBaseType.MaterialReceipt) || DocBaseType.equals(REF_C_DocTypeDocBaseType.PaymentAllocation) || DocBaseType.equals(REF_C_DocTypeDocBaseType.MaterialPhysicalInventory) || DocBaseType.equals(REF_C_DocTypeDocBaseType.Retention) || DocBaseType.equals(REF_C_DocTypeDocBaseType.ARInvoiceFreeTransfer) || DocBaseType.equals(REF_C_DocTypeDocBaseType.DeclarationCustomsValue) || DocBaseType.equals(REF_C_DocTypeDocBaseType.APCreditMemoDiscount) || DocBaseType.equals(REF_C_DocTypeDocBaseType.MaterialMovement) || DocBaseType.equals(REF_C_DocTypeDocBaseType.BankAccountTransfer) || DocBaseType.equals(REF_C_DocTypeDocBaseType.BankStatement) || DocBaseType.equals(REF_C_DocTypeDocBaseType.Withholding) || DocBaseType.equals(REF_C_DocTypeDocBaseType.MaterialProductionReversed) || DocBaseType.equals(REF_C_DocTypeDocBaseType.Payroll) || DocBaseType.equals(REF_C_DocTypeDocBaseType.APDebit));
 else throw new IllegalArgumentException ("DocBaseType Invalid value - " + DocBaseType + " - Reference_ID=183 - POO - POR - MXI - MMP - PJI - APC - ARC - GLJ - GLD - API - MXP - CMC - BOE - FPS - MRV - MRC - APP - ARI - ARR - SOO - ARF - MMS - MMR - CMA - MMI - RET - ART - DCV - APD - MMM - BAT - CMB - WIT - MPR - HRP - APB");
if (DocBaseType != null && DocBaseType.length() > 10)
{
log.warning("Length > 10 - truncated");
DocBaseType = DocBaseType.substring(0,9);
}
set_Value (COLUMNNAME_DocBaseType, DocBaseType);
}
/** Get Document BaseType.
@return Logical type of document */
public String getDocBaseType() 
{
return (String)get_Value(COLUMNNAME_DocBaseType);
}

@XendraTrl(Identifier="c952289e-eb70-7303-0ee3-dab72a3e12ee")
public static String es_PE_FIELD_BPAccess_DocumentBaseType_Description="Identifica el punto de inicio para un documento";

@XendraTrl(Identifier="c952289e-eb70-7303-0ee3-dab72a3e12ee")
public static String es_PE_FIELD_BPAccess_DocumentBaseType_Help="El tipo base de documento identifica la base ó punto de inicio de un documento. Múltiples tipos de documento pueden compartir un tipo base de documento simple.";

@XendraTrl(Identifier="c952289e-eb70-7303-0ee3-dab72a3e12ee")
public static String es_PE_FIELD_BPAccess_DocumentBaseType_Name="Tipo de Documento Base";

@XendraField(AD_Column_ID="DocBaseType",IsCentrallyMaintained=true,
AD_Tab_ID="6a9701f2-3fea-792b-c218-c52a12b16cbf",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="@BPAccessType@=D",DisplayLength=10,IsReadOnly=false,SeqNo=60,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="c952289e-eb70-7303-0ee3-dab72a3e12ee")
public static final String FIELDNAME_BPAccess_DocumentBaseType="c952289e-eb70-7303-0ee3-dab72a3e12ee";

@XendraTrl(Identifier="20745db2-9fe4-eee8-eeb1-c6f80b3bc82b")
public static String es_PE_COLUMN_DocBaseType_Name="Tipo de Documento Base";

@XendraColumn(AD_Element_ID="d03cb659-5074-3721-d480-034c74c562e4",ColumnName="DocBaseType",
AD_Reference_ID=17,AD_Reference_Value_ID="c1999318-834d-4c66-5345-371ffe3c1f06",AD_Val_Rule_ID="",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="20745db2-9fe4-eee8-eeb1-c6f80b3bc82b",Synchronized="2017-08-05 16:52:56.0")
/** Column name DocBaseType */
public static final String COLUMNNAME_DocBaseType = "DocBaseType";
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
@XendraTrl(Identifier="938f91c9-10ab-474f-be44-4676acf10550")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="938f91c9-10ab-474f-be44-4676acf10550",
Synchronized="2017-08-05 16:52:57.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Request Type.
@param R_RequestType_ID Type of request (e.g. Inquiry, Complaint, ..) */
public void setR_RequestType_ID (int R_RequestType_ID)
{
if (R_RequestType_ID <= 0) set_Value (COLUMNNAME_R_RequestType_ID, null);
 else 
set_Value (COLUMNNAME_R_RequestType_ID, Integer.valueOf(R_RequestType_ID));
}
/** Get Request Type.
@return Type of request (e.g. Inquiry, Complaint, ..) */
public int getR_RequestType_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_R_RequestType_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="e9a4e95a-c2af-043c-fdb8-57f80f2bdb06")
public static String es_PE_FIELD_BPAccess_RequestType_Description="Tipo de Solicitud (pregunta; queja).";

@XendraTrl(Identifier="e9a4e95a-c2af-043c-fdb8-57f80f2bdb06")
public static String es_PE_FIELD_BPAccess_RequestType_Help="Tipos de solicitud son usados para procesar y categorizar solicitudes. Ejemplos: consultas de cuentas; garantías; etc.";

@XendraTrl(Identifier="e9a4e95a-c2af-043c-fdb8-57f80f2bdb06")
public static String es_PE_FIELD_BPAccess_RequestType_Name="Tipo de Solicitud";

@XendraField(AD_Column_ID="R_RequestType_ID",IsCentrallyMaintained=true,
AD_Tab_ID="6a9701f2-3fea-792b-c218-c52a12b16cbf",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@BPAccessType@=R",DisplayLength=10,IsReadOnly=false,SeqNo=70,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="e9a4e95a-c2af-043c-fdb8-57f80f2bdb06")
public static final String FIELDNAME_BPAccess_RequestType="e9a4e95a-c2af-043c-fdb8-57f80f2bdb06";

@XendraTrl(Identifier="613a6b8e-8d7b-98fd-19df-ab83cb9be76f")
public static String es_PE_COLUMN_R_RequestType_ID_Name="Tipo de Solicitud";

@XendraColumn(AD_Element_ID="5d38239d-4d14-9ae8-35a8-4f92ae90ab59",ColumnName="R_RequestType_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="613a6b8e-8d7b-98fd-19df-ab83cb9be76f",
Synchronized="2017-08-05 16:52:57.0")
/** Column name R_RequestType_ID */
public static final String COLUMNNAME_R_RequestType_ID = "R_RequestType_ID";
}
