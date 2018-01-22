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
import org.compiere.model.reference.REF_C_BOEConfirmType;
import org.compiere.model.reference.REF_C_PaymentTenderType;
/** Generated Model for C_BOEConfirmLine
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_C_BOEConfirmLine extends PO
{
/** Standard Constructor
@param ctx context
@param C_BOEConfirmLine_ID id
@param trxName transaction
*/
public X_C_BOEConfirmLine (Properties ctx, int C_BOEConfirmLine_ID, String trxName)
{
super (ctx, C_BOEConfirmLine_ID, trxName);
/** if (C_BOEConfirmLine_ID == 0)
{
setC_BOEConfirm_ID (0);
setC_BOEConfirmLine_ID (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_C_BOEConfirmLine (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=1000118 */
public static int Table_ID=MTable.getTable_ID("C_BOEConfirmLine");

@XendraTrl(Identifier="6540e7b7-3f70-542c-655c-c346b3065a91")
public static String es_PE_TAB_C_BOEConfirmLine_Name="Línea Planilla Bco / Letra";

@XendraTab(Name="C_BOEConfirmLine",Description="",Help="",
AD_Window_ID="85165053-23f9-b5e5-7ca7-3410730a2454",SeqNo=20,TabLevel=1,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="6540e7b7-3f70-542c-655c-c346b3065a91",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_C_BOEConfirmLine="6540e7b7-3f70-542c-655c-c346b3065a91";

@XendraTrl(Identifier="506e1266-4cf8-1d8c-5131-4487b52be0ea")
public static String es_PE_TABLE_C_BOEConfirmLine_Name="C_BoeConfirmLine";

@XendraTable(Name="C_BOEConfirmLine",Description="C_BOEConfirmLine",Help="",
TableName="C_BOEConfirmLine",AccessLevel="3",AD_Window_ID="85165053-23f9-b5e5-7ca7-3410730a2454",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=120,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.commercial",
Identifier="506e1266-4cf8-1d8c-5131-4487b52be0ea",Synchronized="2017-08-16 11:41:26.0")
/** TableName=C_BOEConfirmLine */
public static final String Table_Name="C_BOEConfirmLine";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"C_BOEConfirmLine");

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
    Table_ID = MTable.getTable_ID("C_BOEConfirmLine");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_C_BOEConfirmLine[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Amount.
@param Amount Amount in a defined currency */
public void setAmount (BigDecimal Amount)
{
set_Value (COLUMNNAME_Amount, Amount);
}
/** Get Amount.
@return Amount in a defined currency */
public BigDecimal getAmount() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Amount);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="0fa50595-6bdf-2542-a44f-f3b47a539296")
public static String es_PE_FIELD_C_BOEConfirmLine_Amount_Description="Total en una moneda definida";

@XendraTrl(Identifier="0fa50595-6bdf-2542-a44f-f3b47a539296")
public static String es_PE_FIELD_C_BOEConfirmLine_Amount_Help="Indica el total para esta línea del documento";

@XendraTrl(Identifier="0fa50595-6bdf-2542-a44f-f3b47a539296")
public static String es_PE_FIELD_C_BOEConfirmLine_Amount_Name="Total";

@XendraField(AD_Column_ID="Amount",IsCentrallyMaintained=true,
AD_Tab_ID="6540e7b7-3f70-542c-655c-c346b3065a91",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@BOEConfirmType@='P'",DisplayLength=10,IsReadOnly=false,SeqNo=120,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="0fa50595-6bdf-2542-a44f-f3b47a539296")
public static final String FIELDNAME_C_BOEConfirmLine_Amount="0fa50595-6bdf-2542-a44f-f3b47a539296";

@XendraTrl(Identifier="80836a70-e1c7-7891-195d-f239979a5d2e")
public static String es_PE_COLUMN_Amount_Name="Total";

@XendraColumn(AD_Element_ID="d89b3a02-29fd-e2e3-2d01-dbda08fb2454",ColumnName="Amount",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="80836a70-e1c7-7891-195d-f239979a5d2e",
Synchronized="2017-08-05 16:53:18.0")
/** Column name Amount */
public static final String COLUMNNAME_Amount = "Amount";

/** BOEConfirmType AD_Reference=2c81b9b3-ffb3-92a1-d2a9-0475101dc44a */
public static final int BOECONFIRMTYPE_AD_Reference_ID=1000023;
/** Set BOEConfirmType.
@param BOEConfirmType BOEConfirmType */
public void setBOEConfirmType (String BOEConfirmType)
{
if (BOEConfirmType == null || BOEConfirmType.equals(REF_C_BOEConfirmType.BOE) || BOEConfirmType.equals(REF_C_BOEConfirmType.Payment));
 else throw new IllegalArgumentException ("BOEConfirmType Invalid value - " + BOEConfirmType + " - Reference_ID=1000023 - B - P");
if (BOEConfirmType != null && BOEConfirmType.length() > 1)
{
log.warning("Length > 1 - truncated");
BOEConfirmType = BOEConfirmType.substring(0,0);
}
set_Value (COLUMNNAME_BOEConfirmType, BOEConfirmType);
}
/** Get BOEConfirmType.
@return BOEConfirmType */
public String getBOEConfirmType() 
{
return (String)get_Value(COLUMNNAME_BOEConfirmType);
}

@XendraTrl(Identifier="2903322a-dfba-db23-9c33-92db8b5af3fa")
public static String es_PE_FIELD_C_BOEConfirmLine_BOEConfirmType_Name="Tipo de Confirmación";

@XendraField(AD_Column_ID="BOEConfirmType",IsCentrallyMaintained=true,
AD_Tab_ID="6540e7b7-3f70-542c-655c-c346b3065a91",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2903322a-dfba-db23-9c33-92db8b5af3fa")
public static final String FIELDNAME_C_BOEConfirmLine_BOEConfirmType="2903322a-dfba-db23-9c33-92db8b5af3fa";

@XendraTrl(Identifier="245ba411-d2ca-5762-c737-03c0ba16531d")
public static String es_PE_COLUMN_BOEConfirmType_Name="boeconfirmtype";

@XendraColumn(AD_Element_ID="086fedc0-efbd-30c7-c006-b451225a6f4f",ColumnName="BOEConfirmType",
AD_Reference_ID=17,AD_Reference_Value_ID="2c81b9b3-ffb3-92a1-d2a9-0475101dc44a",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="B",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="245ba411-d2ca-5762-c737-03c0ba16531d",Synchronized="2017-08-05 16:53:18.0")
/** Column name BOEConfirmType */
public static final String COLUMNNAME_BOEConfirmType = "BOEConfirmType";
/** Set Bill Of Exchange No of bank.
@param BOENo Number of the Bill Of Exchange */
public void setBOENo (String BOENo)
{
if (BOENo != null && BOENo.length() > 30)
{
log.warning("Length > 30 - truncated");
BOENo = BOENo.substring(0,29);
}
set_Value (COLUMNNAME_BOENo, BOENo);
}
/** Get Bill Of Exchange No of bank.
@return Number of the Bill Of Exchange */
public String getBOENo() 
{
String value = (String)get_Value(COLUMNNAME_BOENo);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="c63ec3fd-02f7-c60e-ed84-7c56bab1dda2")
public static String es_PE_FIELD_C_BOEConfirmLine_BillOfExchangeNoOfBank_Description="Numero de Letra de cambio asignado por el Banco aceptante";

@XendraTrl(Identifier="c63ec3fd-02f7-c60e-ed84-7c56bab1dda2")
public static String es_PE_FIELD_C_BOEConfirmLine_BillOfExchangeNoOfBank_Help="Este es el número que el banco asigna a nuestra letra, en el momento que nos la acepta";

@XendraTrl(Identifier="c63ec3fd-02f7-c60e-ed84-7c56bab1dda2")
public static String es_PE_FIELD_C_BOEConfirmLine_BillOfExchangeNoOfBank_Name="No unico de letra";

@XendraField(AD_Column_ID="BOENo",IsCentrallyMaintained=true,
AD_Tab_ID="6540e7b7-3f70-542c-655c-c346b3065a91",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@BOEConfirmType@='B'",DisplayLength=30,IsReadOnly=false,SeqNo=80,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="c63ec3fd-02f7-c60e-ed84-7c56bab1dda2")
public static final String FIELDNAME_C_BOEConfirmLine_BillOfExchangeNoOfBank="c63ec3fd-02f7-c60e-ed84-7c56bab1dda2";

@XendraTrl(Identifier="31958b1c-c88f-acbb-c292-7dbc1680ed15")
public static String es_PE_COLUMN_BOENo_Name="No de Letra Bco";

@XendraColumn(AD_Element_ID="091eac4c-3fde-7aa3-8516-77e9681245bb",ColumnName="BOENo",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=30,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="31958b1c-c88f-acbb-c292-7dbc1680ed15",
Synchronized="2017-08-05 16:53:18.0")
/** Column name BOENo */
public static final String COLUMNNAME_BOENo = "BOENo";
/** Set C_BOEConfirm_ID.
@param C_BOEConfirm_ID C_BOEConfirm_ID */
public void setC_BOEConfirm_ID (int C_BOEConfirm_ID)
{
if (C_BOEConfirm_ID < 1) throw new IllegalArgumentException ("C_BOEConfirm_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_BOEConfirm_ID, Integer.valueOf(C_BOEConfirm_ID));
}
/** Get C_BOEConfirm_ID.
@return C_BOEConfirm_ID */
public int getC_BOEConfirm_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_BOEConfirm_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="4b48215c-c84a-17d5-8cb2-6ce58ff03c92")
public static String es_PE_FIELD_C_BOEConfirmLine_C_BOEConfirm_ID_Name="Plla de Letra Bco";

@XendraField(AD_Column_ID="C_BOEConfirm_ID",IsCentrallyMaintained=true,
AD_Tab_ID="6540e7b7-3f70-542c-655c-c346b3065a91",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="4b48215c-c84a-17d5-8cb2-6ce58ff03c92")
public static final String FIELDNAME_C_BOEConfirmLine_C_BOEConfirm_ID="4b48215c-c84a-17d5-8cb2-6ce58ff03c92";

@XendraTrl(Identifier="46402eee-fc37-36cf-3ac3-bf94ae718482")
public static String es_PE_COLUMN_C_BOEConfirm_ID_Name="c_boeconfirm_id";

@XendraColumn(AD_Element_ID="1c623ee3-39bb-c6fc-297b-f7c03061acb4",ColumnName="C_BOEConfirm_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="46402eee-fc37-36cf-3ac3-bf94ae718482",
Synchronized="2017-08-05 16:53:18.0")
/** Column name C_BOEConfirm_ID */
public static final String COLUMNNAME_C_BOEConfirm_ID = "C_BOEConfirm_ID";
/** Set C_BOEConfirmLine.
@param C_BOEConfirmLine_ID C_BOEConfirmLine */
public void setC_BOEConfirmLine_ID (int C_BOEConfirmLine_ID)
{
if (C_BOEConfirmLine_ID < 1) throw new IllegalArgumentException ("C_BOEConfirmLine_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_BOEConfirmLine_ID, Integer.valueOf(C_BOEConfirmLine_ID));
}
/** Get C_BOEConfirmLine.
@return C_BOEConfirmLine */
public int getC_BOEConfirmLine_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_BOEConfirmLine_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="3d9ff35a-0a5e-ef39-20d0-773ff648336c")
public static String es_PE_FIELD_C_BOEConfirmLine_C_BOEConfirmLine_Name="C_BoeConfirmLine";

@XendraField(AD_Column_ID="C_BOEConfirmLine_ID",IsCentrallyMaintained=true,
AD_Tab_ID="6540e7b7-3f70-542c-655c-c346b3065a91",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3d9ff35a-0a5e-ef39-20d0-773ff648336c")
public static final String FIELDNAME_C_BOEConfirmLine_C_BOEConfirmLine="3d9ff35a-0a5e-ef39-20d0-773ff648336c";
/** Column name C_BOEConfirmLine_ID */
public static final String COLUMNNAME_C_BOEConfirmLine_ID = "C_BOEConfirmLine_ID";
/** Set Bill Of Exchange.
@param C_BOE_ID Bill Of Exchange Identifier */
public void setC_BOE_ID (int C_BOE_ID)
{
if (C_BOE_ID <= 0) set_Value (COLUMNNAME_C_BOE_ID, null);
 else 
set_Value (COLUMNNAME_C_BOE_ID, Integer.valueOf(C_BOE_ID));
}
/** Get Bill Of Exchange.
@return Bill Of Exchange Identifier */
public int getC_BOE_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_BOE_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="696d6d0b-c1fb-bbd9-de78-3092c4679e75")
public static String es_PE_FIELD_C_BOEConfirmLine_BillOfExchange_Description="Identificador de la Letra de Cambio ";

@XendraTrl(Identifier="696d6d0b-c1fb-bbd9-de78-3092c4679e75")
public static String es_PE_FIELD_C_BOEConfirmLine_BillOfExchange_Help="El docuemnto Letra de Cambio";

@XendraTrl(Identifier="696d6d0b-c1fb-bbd9-de78-3092c4679e75")
public static String es_PE_FIELD_C_BOEConfirmLine_BillOfExchange_Name="Letra de Cambio";

@XendraField(AD_Column_ID="C_BOE_ID",IsCentrallyMaintained=true,
AD_Tab_ID="6540e7b7-3f70-542c-655c-c346b3065a91",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@BOEConfirmType@='B'",DisplayLength=10,IsReadOnly=false,SeqNo=70,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="696d6d0b-c1fb-bbd9-de78-3092c4679e75")
public static final String FIELDNAME_C_BOEConfirmLine_BillOfExchange="696d6d0b-c1fb-bbd9-de78-3092c4679e75";

@XendraTrl(Identifier="20927e62-3326-fe3f-4de9-8884e462366a")
public static String es_PE_COLUMN_C_BOE_ID_Name="Letra de Cambio";

@XendraColumn(AD_Element_ID="7dfa9e28-2055-cea9-fa94-b5ebdac44420",ColumnName="C_BOE_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="bb038921-7210-c906-47a2-90306ba2a8cb",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="org.compiere.model.CalloutBOEConfirmation.boe ",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="20927e62-3326-fe3f-4de9-8884e462366a",
Synchronized="2017-08-05 16:53:18.0")
/** Column name C_BOE_ID */
public static final String COLUMNNAME_C_BOE_ID = "C_BOE_ID";
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

@XendraTrl(Identifier="6ade6803-5251-d26a-cbd1-345df265c769")
public static String es_PE_FIELD_C_BOEConfirmLine_BusinessPartner_Description="Identifica un Socio de Negocio";

@XendraTrl(Identifier="6ade6803-5251-d26a-cbd1-345df265c769")
public static String es_PE_FIELD_C_BOEConfirmLine_BusinessPartner_Help="Un socio de negocio es cualquiera con quien usted realiza transacciones. Este puede incluir Proveedores; Clientes; Empleados ó Vendedores.";

@XendraTrl(Identifier="6ade6803-5251-d26a-cbd1-345df265c769")
public static String es_PE_FIELD_C_BOEConfirmLine_BusinessPartner_Name="Socio de Negocio";

@XendraField(AD_Column_ID="C_BPartner_ID",IsCentrallyMaintained=true,
AD_Tab_ID="6540e7b7-3f70-542c-655c-c346b3065a91",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6ade6803-5251-d26a-cbd1-345df265c769")
public static final String FIELDNAME_C_BOEConfirmLine_BusinessPartner="6ade6803-5251-d26a-cbd1-345df265c769";

@XendraTrl(Identifier="0cf79b4a-7771-b8d9-0e39-1bd813a5ccc6")
public static String es_PE_COLUMN_C_BPartner_ID_Name="Socio de Negocio";

@XendraColumn(AD_Element_ID="fe333dc3-4f40-1276-5f6a-d09bb66dc423",ColumnName="C_BPartner_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0cf79b4a-7771-b8d9-0e39-1bd813a5ccc6",
Synchronized="2017-08-05 16:53:18.0")
/** Column name C_BPartner_ID */
public static final String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";
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

@XendraTrl(Identifier="055bfefe-c84a-fb69-64b3-ab9bd5cbce71")
public static String es_PE_FIELD_C_BOEConfirmLine_Charge_Description="Cargos adicionales del documento";

@XendraTrl(Identifier="055bfefe-c84a-fb69-64b3-ab9bd5cbce71")
public static String es_PE_FIELD_C_BOEConfirmLine_Charge_Help="El cargo indica un tipo de cargo (manejo; despacho; reposición)";

@XendraTrl(Identifier="055bfefe-c84a-fb69-64b3-ab9bd5cbce71")
public static String es_PE_FIELD_C_BOEConfirmLine_Charge_Name="Cargo";

@XendraField(AD_Column_ID="C_Charge_ID",IsCentrallyMaintained=true,
AD_Tab_ID="6540e7b7-3f70-542c-655c-c346b3065a91",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@BOEConfirmType@='P'",DisplayLength=10,IsReadOnly=false,SeqNo=110,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="055bfefe-c84a-fb69-64b3-ab9bd5cbce71")
public static final String FIELDNAME_C_BOEConfirmLine_Charge="055bfefe-c84a-fb69-64b3-ab9bd5cbce71";

@XendraTrl(Identifier="4ee163ee-e947-944c-83ad-8eeffc521cd0")
public static String es_PE_COLUMN_C_Charge_ID_Name="Cargo";

@XendraColumn(AD_Element_ID="d7e2fc48-a26e-4ded-ea44-fe15849a7883",ColumnName="C_Charge_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="4ee163ee-e947-944c-83ad-8eeffc521cd0",
Synchronized="2017-08-05 16:53:18.0")
/** Column name C_Charge_ID */
public static final String COLUMNNAME_C_Charge_ID = "C_Charge_ID";
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

@XendraTrl(Identifier="16a2e4dd-2bfa-41e7-718c-a5ae7063974e")
public static String es_PE_FIELD_C_BOEConfirmLine_DocumentType_Description="Tipo de documento ó reglas";

@XendraTrl(Identifier="16a2e4dd-2bfa-41e7-718c-a5ae7063974e")
public static String es_PE_FIELD_C_BOEConfirmLine_DocumentType_Help="El tipo de documento determina la secuencia del documento y las reglas de proceso";

@XendraTrl(Identifier="16a2e4dd-2bfa-41e7-718c-a5ae7063974e")
public static String es_PE_FIELD_C_BOEConfirmLine_DocumentType_Name="Tipo de Documento";

@XendraField(AD_Column_ID="C_DocType_ID",IsCentrallyMaintained=true,
AD_Tab_ID="6540e7b7-3f70-542c-655c-c346b3065a91",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@BOEConfirmType@='P'",DisplayLength=10,IsReadOnly=false,SeqNo=90,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="16a2e4dd-2bfa-41e7-718c-a5ae7063974e")
public static final String FIELDNAME_C_BOEConfirmLine_DocumentType="16a2e4dd-2bfa-41e7-718c-a5ae7063974e";

@XendraTrl(Identifier="ed8cd6e5-0ea1-9870-7674-749fe8756ee7")
public static String es_PE_COLUMN_C_DocType_ID_Name="Tipo de Documento";

@XendraColumn(AD_Element_ID="099a4147-1a72-cdd0-81e0-8bdbc8c0b883",ColumnName="C_DocType_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="757105c8-f6b5-223c-c6c4-1c7d6405b50e",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="ed8cd6e5-0ea1-9870-7674-749fe8756ee7",Synchronized="2017-08-05 16:53:18.0")
/** Column name C_DocType_ID */
public static final String COLUMNNAME_C_DocType_ID = "C_DocType_ID";
/** Set Invoice.
@param C_Invoice_ID Invoice Identifier */
public void setC_Invoice_ID (int C_Invoice_ID)
{
if (C_Invoice_ID <= 0) set_Value (COLUMNNAME_C_Invoice_ID, null);
 else 
set_Value (COLUMNNAME_C_Invoice_ID, Integer.valueOf(C_Invoice_ID));
}
/** Get Invoice.
@return Invoice Identifier */
public int getC_Invoice_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Invoice_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="d4a85ffc-6f64-1733-0a7a-9b744f969013")
public static String es_PE_COLUMN_C_Invoice_ID_Name="Invoice";

@XendraColumn(AD_Element_ID="e526ea57-1bdf-9871-fd57-0df3c1f9dd42",ColumnName="C_Invoice_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d4a85ffc-6f64-1733-0a7a-9b744f969013",
Synchronized="2017-08-05 16:53:18.0")
/** Column name C_Invoice_ID */
public static final String COLUMNNAME_C_Invoice_ID = "C_Invoice_ID";
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

@XendraTrl(Identifier="feae56f6-006a-21cd-cbd1-1a97ac10326c")
public static String es_PE_FIELD_C_BOEConfirmLine_Payment_Description="Identificador del pago";

@XendraTrl(Identifier="feae56f6-006a-21cd-cbd1-1a97ac10326c")
public static String es_PE_FIELD_C_BOEConfirmLine_Payment_Help="El pago es un identificador único de este pago.";

@XendraTrl(Identifier="feae56f6-006a-21cd-cbd1-1a97ac10326c")
public static String es_PE_FIELD_C_BOEConfirmLine_Payment_Name="Pago";

@XendraField(AD_Column_ID="C_Payment_ID",IsCentrallyMaintained=true,
AD_Tab_ID="6540e7b7-3f70-542c-655c-c346b3065a91",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@BOEConfirmType@='P'",DisplayLength=10,IsReadOnly=true,SeqNo=130,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="feae56f6-006a-21cd-cbd1-1a97ac10326c")
public static final String FIELDNAME_C_BOEConfirmLine_Payment="feae56f6-006a-21cd-cbd1-1a97ac10326c";

@XendraTrl(Identifier="2399905d-2d44-6a3c-1c32-b22e28c5fdf0")
public static String es_PE_COLUMN_C_Payment_ID_Name="Payment";

@XendraColumn(AD_Element_ID="3ded5658-968e-94c5-207b-eed6f6a7bb43",ColumnName="C_Payment_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2399905d-2d44-6a3c-1c32-b22e28c5fdf0",
Synchronized="2017-08-05 16:53:18.0")
/** Column name C_Payment_ID */
public static final String COLUMNNAME_C_Payment_ID = "C_Payment_ID";
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
@XendraTrl(Identifier="76e4cb84-d3ec-4f25-8565-e7b610239ccd")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="76e4cb84-d3ec-4f25-8565-e7b610239ccd",
Synchronized="2017-08-05 16:53:18.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
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

@XendraTrl(Identifier="eba5b52d-8048-1b78-8c1e-78b36bbbde0e")
public static String es_PE_FIELD_C_BOEConfirmLine_Processed_Description="El documento ha sido procesado";

@XendraTrl(Identifier="eba5b52d-8048-1b78-8c1e-78b36bbbde0e")
public static String es_PE_FIELD_C_BOEConfirmLine_Processed_Help="El cuadro de verificación procesada indica que un documento ha sido procesado";

@XendraTrl(Identifier="eba5b52d-8048-1b78-8c1e-78b36bbbde0e")
public static String es_PE_FIELD_C_BOEConfirmLine_Processed_Name="Procesado";

@XendraField(AD_Column_ID="Processed",IsCentrallyMaintained=true,
AD_Tab_ID="6540e7b7-3f70-542c-655c-c346b3065a91",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="eba5b52d-8048-1b78-8c1e-78b36bbbde0e")
public static final String FIELDNAME_C_BOEConfirmLine_Processed="eba5b52d-8048-1b78-8c1e-78b36bbbde0e";

@XendraTrl(Identifier="0e2e33a8-19ac-bcbb-b76b-620e1c8580ed")
public static String es_PE_COLUMN_Processed_Name="Procesado";

@XendraColumn(AD_Element_ID="3f7035d2-fa5e-7416-fc0c-e49e43f9e083",ColumnName="Processed",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0e2e33a8-19ac-bcbb-b76b-620e1c8580ed",
Synchronized="2017-08-05 16:53:18.0")
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

@XendraTrl(Identifier="a3ce6560-9367-e9bd-ece4-99b4f756a84e")
public static String es_PE_FIELD_C_BOEConfirmLine_ProcessNow_Name="Procesar Ahora";

@XendraField(AD_Column_ID="Processing",IsCentrallyMaintained=true,
AD_Tab_ID="6540e7b7-3f70-542c-655c-c346b3065a91",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a3ce6560-9367-e9bd-ece4-99b4f756a84e")
public static final String FIELDNAME_C_BOEConfirmLine_ProcessNow="a3ce6560-9367-e9bd-ece4-99b4f756a84e";

@XendraTrl(Identifier="f431e909-3e97-1d83-1f16-e55ee8a5f883")
public static String es_PE_COLUMN_Processing_Name="Procesar Ahora";

@XendraColumn(AD_Element_ID="f2096404-1a98-35ec-09ea-273b3e19b7de",ColumnName="Processing",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f431e909-3e97-1d83-1f16-e55ee8a5f883",
Synchronized="2017-08-05 16:53:18.0")
/** Column name Processing */
public static final String COLUMNNAME_Processing = "Processing";

/** TenderType AD_Reference=99d2e48b-10ce-666f-5675-0a893b4e12aa */
public static final int TENDERTYPE_AD_Reference_ID=214;
/** Set Tender type.
@param TenderType Method of Payment */
public void setTenderType (String TenderType)
{
if (TenderType == null || TenderType.equals(REF_C_PaymentTenderType.Continet) || TenderType.equals(REF_C_PaymentTenderType.FEC) || TenderType.equals(REF_C_PaymentTenderType.Telecredito) || TenderType.equals(REF_C_PaymentTenderType.DirectDebit) || TenderType.equals(REF_C_PaymentTenderType.CreditCard) || TenderType.equals(REF_C_PaymentTenderType.Check) || TenderType.equals(REF_C_PaymentTenderType.BillOfExchange) || TenderType.equals(REF_C_PaymentTenderType.Giro) || TenderType.equals(REF_C_PaymentTenderType.DirectDeposit) || TenderType.equals(REF_C_PaymentTenderType.Transfer));
 else throw new IllegalArgumentException ("TenderType Invalid value - " + TenderType + " - Reference_ID=214 - CN - FC - TL - D - C - K - B - G - A - T");
if (TenderType != null && TenderType.length() > 10)
{
log.warning("Length > 10 - truncated");
TenderType = TenderType.substring(0,9);
}
set_Value (COLUMNNAME_TenderType, TenderType);
}
/** Get Tender type.
@return Method of Payment */
public String getTenderType() 
{
return (String)get_Value(COLUMNNAME_TenderType);
}

@XendraTrl(Identifier="b7df5e0a-9c70-75b8-a82d-fdd53094638d")
public static String es_PE_FIELD_C_BOEConfirmLine_TenderType_Description="Método de pago";

@XendraTrl(Identifier="b7df5e0a-9c70-75b8-a82d-fdd53094638d")
public static String es_PE_FIELD_C_BOEConfirmLine_TenderType_Help="El Tipo de Pago indica el método de pago  (ACH; Tarjeta de Crédito; Cheque)";

@XendraTrl(Identifier="b7df5e0a-9c70-75b8-a82d-fdd53094638d")
public static String es_PE_FIELD_C_BOEConfirmLine_TenderType_Name="Tipo de Pago";

@XendraField(AD_Column_ID="TenderType",IsCentrallyMaintained=true,
AD_Tab_ID="6540e7b7-3f70-542c-655c-c346b3065a91",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@BOEConfirmType@='P'",DisplayLength=10,IsReadOnly=false,SeqNo=100,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="b7df5e0a-9c70-75b8-a82d-fdd53094638d")
public static final String FIELDNAME_C_BOEConfirmLine_TenderType="b7df5e0a-9c70-75b8-a82d-fdd53094638d";

@XendraTrl(Identifier="e50f6301-1cde-f85c-e94b-5dd51cf19df1")
public static String es_PE_COLUMN_TenderType_Name="Tipo de Pago";

@XendraColumn(AD_Element_ID="a11558e0-04b1-3a6f-e53e-dd508c5dfc1c",ColumnName="TenderType",
AD_Reference_ID=17,AD_Reference_Value_ID="99d2e48b-10ce-666f-5675-0a893b4e12aa",AD_Val_Rule_ID="",
FieldLength=10,DefaultValue="D",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="e50f6301-1cde-f85c-e94b-5dd51cf19df1",Synchronized="2017-08-05 16:53:18.0")
/** Column name TenderType */
public static final String COLUMNNAME_TenderType = "TenderType";
}
