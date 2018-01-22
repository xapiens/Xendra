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
/** Generated Model for C_RfQResponse
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_C_RfQResponse extends PO
{
/** Standard Constructor
@param ctx context
@param C_RfQResponse_ID id
@param trxName transaction
*/
public X_C_RfQResponse (Properties ctx, int C_RfQResponse_ID, String trxName)
{
super (ctx, C_RfQResponse_ID, trxName);
/** if (C_RfQResponse_ID == 0)
{
setC_BPartner_ID (0);
setC_BPartner_Location_ID (0);
setC_Currency_ID (0);	
// @C_Currency_ID@
setC_RfQ_ID (0);
setC_RfQResponse_ID (0);
setIsComplete (false);	
// N
setIsSelectedWinner (false);	
// N
setIsSelfService (false);	
// N
setName (null);
setPrice (Env.ZERO);
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
public X_C_RfQResponse (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=674 */
public static int Table_ID=MTable.getTable_ID("C_RfQResponse");

@XendraTrl(Identifier="c3dee43c-306d-69c9-ae5b-c6efb7699611")
public static String es_PE_TAB_Response_Description="Respuesta RfQ ";

@XendraTrl(Identifier="c3dee43c-306d-69c9-ae5b-c6efb7699611")
public static String es_PE_TAB_Response_Name="Respuesta";

@XendraTrl(Identifier="c3dee43c-306d-69c9-ae5b-c6efb7699611")
public static String es_PE_TAB_Response_Help="Solicitud para respuesta de la cita de un vendedor potencial";

@XendraTab(Name="Response",Description="RfQ Response",
Help="Request for Quotation Response from a potential Vendor",
AD_Window_ID="00321465-3813-5160-b116-f76e77af89f6",SeqNo=10,TabLevel=1,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",
AD_Process_ID="45e3a681-8010-acda-c685-2d8855581a97",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="c3dee43c-306d-69c9-ae5b-c6efb7699611",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Response="c3dee43c-306d-69c9-ae5b-c6efb7699611";

@XendraTrl(Identifier="7efe47b2-1095-efaa-2a82-f9b090d126eb")
public static String es_PE_TABLE_C_RfQResponse_Name="Respuesta SPC (RfQ)";

@XendraTable(Name="RfQ Response",
Description="Request for Quotation Response from a potential Vendor",Help="",
TableName="C_RfQResponse",AccessLevel="1",AD_Window_ID="00321465-3813-5160-b116-f76e77af89f6",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=135,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.commercial",
Identifier="7efe47b2-1095-efaa-2a82-f9b090d126eb",Synchronized="2017-08-16 11:42:26.0")
/** TableName=C_RfQResponse */
public static final String Table_Name="C_RfQResponse";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"C_RfQResponse");

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
    Table_ID = MTable.getTable_ID("C_RfQResponse");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_C_RfQResponse[").append(get_ID()).append("]");
return sb.toString();
}
/** Set User/Contact.
@param AD_User_ID User within the system - Internal or Business Partner Contact */
public void setAD_User_ID (int AD_User_ID)
{
if (AD_User_ID <= 0) set_ValueNoCheck (COLUMNNAME_AD_User_ID, null);
 else 
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

@XendraTrl(Identifier="5360da49-e2fc-8733-827c-bcfed9531dbc")
public static String es_PE_FIELD_Response_UserContact_Description="ID de Usuario dentro del sistema";

@XendraTrl(Identifier="5360da49-e2fc-8733-827c-bcfed9531dbc")
public static String es_PE_FIELD_Response_UserContact_Help="La ID de usuario identifica un usuario único en el sistema";

@XendraTrl(Identifier="5360da49-e2fc-8733-827c-bcfed9531dbc")
public static String es_PE_FIELD_Response_UserContact_Name="Usuario";

@XendraField(AD_Column_ID="AD_User_ID",IsCentrallyMaintained=true,
AD_Tab_ID="c3dee43c-306d-69c9-ae5b-c6efb7699611",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5360da49-e2fc-8733-827c-bcfed9531dbc")
public static final String FIELDNAME_Response_UserContact="5360da49-e2fc-8733-827c-bcfed9531dbc";

@XendraTrl(Identifier="58f2dba1-4f5b-6b6a-4930-2d6b1a4c4afc")
public static String es_PE_COLUMN_AD_User_ID_Name="Usuario";

@XendraColumn(AD_Element_ID="abdf8dee-d3cd-73ec-c758-683e907797f4",ColumnName="AD_User_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="f4ac36a1-4200-1386-677e-14ac90afb4fe",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="58f2dba1-4f5b-6b6a-4930-2d6b1a4c4afc",Synchronized="2017-08-05 16:54:23.0")
/** Column name AD_User_ID */
public static final String COLUMNNAME_AD_User_ID = "AD_User_ID";
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

@XendraTrl(Identifier="435d328c-8298-6906-aee0-07ab623323c3")
public static String es_PE_FIELD_Response_BusinessPartner_Description="Identifica un Socio de Negocio";

@XendraTrl(Identifier="435d328c-8298-6906-aee0-07ab623323c3")
public static String es_PE_FIELD_Response_BusinessPartner_Help="Un socio de negocio es cualquiera con quien usted realiza transacciones. Este puede incluir Proveedores; Clientes; Empleados ó Vendedores.";

@XendraTrl(Identifier="435d328c-8298-6906-aee0-07ab623323c3")
public static String es_PE_FIELD_Response_BusinessPartner_Name="Socio de Negocio";

@XendraField(AD_Column_ID="C_BPartner_ID",IsCentrallyMaintained=true,
AD_Tab_ID="c3dee43c-306d-69c9-ae5b-c6efb7699611",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="435d328c-8298-6906-aee0-07ab623323c3")
public static final String FIELDNAME_Response_BusinessPartner="435d328c-8298-6906-aee0-07ab623323c3";

@XendraTrl(Identifier="c2b90d16-14d3-5cf6-19ab-9017c1e38cb7")
public static String es_PE_COLUMN_C_BPartner_ID_Name="Socio de Negocio";

@XendraColumn(AD_Element_ID="fe333dc3-4f40-1276-5f6a-d09bb66dc423",ColumnName="C_BPartner_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="06fdbbe9-e1c4-3ee4-4a9d-73d1a990cc42",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="c2b90d16-14d3-5cf6-19ab-9017c1e38cb7",Synchronized="2017-08-05 16:54:23.0")
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

@XendraTrl(Identifier="25b8de41-1804-af5d-db7b-7088a97511da")
public static String es_PE_FIELD_Response_PartnerLocation_Description="Identifica la dirección para este socio de negocio";

@XendraTrl(Identifier="25b8de41-1804-af5d-db7b-7088a97511da")
public static String es_PE_FIELD_Response_PartnerLocation_Help="La dirección de un socio indica la ubicación de un socio de negocio";

@XendraTrl(Identifier="25b8de41-1804-af5d-db7b-7088a97511da")
public static String es_PE_FIELD_Response_PartnerLocation_Name="Dirección del Socio del Negocio";

@XendraField(AD_Column_ID="C_BPartner_Location_ID",IsCentrallyMaintained=true,
AD_Tab_ID="c3dee43c-306d-69c9-ae5b-c6efb7699611",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="25b8de41-1804-af5d-db7b-7088a97511da")
public static final String FIELDNAME_Response_PartnerLocation="25b8de41-1804-af5d-db7b-7088a97511da";

@XendraTrl(Identifier="960ba4cb-c01c-dd7f-bef5-ddca9872b384")
public static String es_PE_COLUMN_C_BPartner_Location_ID_Name="Dirección del Socio del Negocio";

@XendraColumn(AD_Element_ID="0dab7dc6-2832-26dc-2462-cba2d40235f2",
ColumnName="C_BPartner_Location_ID",AD_Reference_ID=19,AD_Reference_Value_ID="",
AD_Val_Rule_ID="623d98c0-19fc-56a2-f511-8992974d3c05",FieldLength=22,DefaultValue="",IsKey=false,
IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="960ba4cb-c01c-dd7f-bef5-ddca9872b384",
Synchronized="2017-08-05 16:54:23.0")
/** Column name C_BPartner_Location_ID */
public static final String COLUMNNAME_C_BPartner_Location_ID = "C_BPartner_Location_ID";
/** Set Currency.
@param C_Currency_ID The Currency for this record */
public void setC_Currency_ID (int C_Currency_ID)
{
if (C_Currency_ID < 1) throw new IllegalArgumentException ("C_Currency_ID is mandatory.");
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

@XendraTrl(Identifier="81ac102d-1985-ef12-a70d-916f4be67721")
public static String es_PE_FIELD_Response_Currency_Description="Moneda para este registro";

@XendraTrl(Identifier="81ac102d-1985-ef12-a70d-916f4be67721")
public static String es_PE_FIELD_Response_Currency_Help="Indica la moneda a ser usada cuando se procese ó Informe este registro";

@XendraTrl(Identifier="81ac102d-1985-ef12-a70d-916f4be67721")
public static String es_PE_FIELD_Response_Currency_Name="Moneda";

@XendraField(AD_Column_ID="C_Currency_ID",IsCentrallyMaintained=true,
AD_Tab_ID="c3dee43c-306d-69c9-ae5b-c6efb7699611",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=150,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="81ac102d-1985-ef12-a70d-916f4be67721")
public static final String FIELDNAME_Response_Currency="81ac102d-1985-ef12-a70d-916f4be67721";

@XendraTrl(Identifier="150d8733-6157-28ef-7b35-a5d9b091dad2")
public static String es_PE_COLUMN_C_Currency_ID_Name="Moneda";

@XendraColumn(AD_Element_ID="8daec488-bca2-50fe-f9de-abf0cba2a34a",ColumnName="C_Currency_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,
DefaultValue="@C_Currency_ID@",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="150d8733-6157-28ef-7b35-a5d9b091dad2",Synchronized="2017-08-05 16:54:23.0")
/** Column name C_Currency_ID */
public static final String COLUMNNAME_C_Currency_ID = "C_Currency_ID";
/** Set Check Complete.
@param CheckComplete Check Complete */
public void setCheckComplete (String CheckComplete)
{
if (CheckComplete != null && CheckComplete.length() > 1)
{
log.warning("Length > 1 - truncated");
CheckComplete = CheckComplete.substring(0,0);
}
set_Value (COLUMNNAME_CheckComplete, CheckComplete);
}
/** Get Check Complete.
@return Check Complete */
public String getCheckComplete() 
{
return (String)get_Value(COLUMNNAME_CheckComplete);
}

@XendraTrl(Identifier="ef0d7e46-c3c3-ed6b-4e2a-0001143196b6")
public static String es_PE_FIELD_Response_CheckComplete_Description="Compruebe si la respuesta es completa basada en los ajustes de SPC (RfQ)";

@XendraTrl(Identifier="ef0d7e46-c3c3-ed6b-4e2a-0001143196b6")
public static String es_PE_FIELD_Response_CheckComplete_Name="Completar Verificación";

@XendraField(AD_Column_ID="CheckComplete",IsCentrallyMaintained=true,
AD_Tab_ID="c3dee43c-306d-69c9-ae5b-c6efb7699611",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=240,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ef0d7e46-c3c3-ed6b-4e2a-0001143196b6")
public static final String FIELDNAME_Response_CheckComplete="ef0d7e46-c3c3-ed6b-4e2a-0001143196b6";

@XendraTrl(Identifier="ab659fea-b336-3c4e-2715-07b7c8a355ab")
public static String es_PE_COLUMN_CheckComplete_Name="Completar Verificación";

@XendraColumn(AD_Element_ID="9dcabfd8-f303-aa4c-18cf-5dbbf78b491c",ColumnName="CheckComplete",
AD_Reference_ID=28,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="634c7c95-4b88-b3a1-a5b6-7911ee9a68aa",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="ab659fea-b336-3c4e-2715-07b7c8a355ab",Synchronized="2017-08-05 16:54:23.0")
/** Column name CheckComplete */
public static final String COLUMNNAME_CheckComplete = "CheckComplete";
/** Set Order.
@param C_Order_ID Order */
public void setC_Order_ID (int C_Order_ID)
{
if (C_Order_ID <= 0) set_Value (COLUMNNAME_C_Order_ID, null);
 else 
set_Value (COLUMNNAME_C_Order_ID, Integer.valueOf(C_Order_ID));
}
/** Get Order.
@return Order */
public int getC_Order_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Order_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="ffa92ec3-b24b-3f69-4412-9fec56ab0628")
public static String es_PE_FIELD_Response_Order_Description="Orden de Venta";

@XendraTrl(Identifier="ffa92ec3-b24b-3f69-4412-9fec56ab0628")
public static String es_PE_FIELD_Response_Order_Help="La ID de la orden de ventas es un identificador único de la orden de ventas; Ésta es controlada por la secuencia del documento para este tipo de documento.";

@XendraTrl(Identifier="ffa92ec3-b24b-3f69-4412-9fec56ab0628")
public static String es_PE_FIELD_Response_Order_Name="Orden de Venta";

@XendraField(AD_Column_ID="C_Order_ID",IsCentrallyMaintained=true,
AD_Tab_ID="c3dee43c-306d-69c9-ae5b-c6efb7699611",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=230,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ffa92ec3-b24b-3f69-4412-9fec56ab0628")
public static final String FIELDNAME_Response_Order="ffa92ec3-b24b-3f69-4412-9fec56ab0628";

@XendraTrl(Identifier="4f785387-fadc-4b47-d62e-aed64946a4c5")
public static String es_PE_COLUMN_C_Order_ID_Name="Orden de Venta";

@XendraColumn(AD_Element_ID="cc846c60-90b8-6aad-9d07-b5d0c0328787",ColumnName="C_Order_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="4f785387-fadc-4b47-d62e-aed64946a4c5",
Synchronized="2017-08-05 16:54:23.0")
/** Column name C_Order_ID */
public static final String COLUMNNAME_C_Order_ID = "C_Order_ID";
/** Set RfQ.
@param C_RfQ_ID Request for Quotation */
public void setC_RfQ_ID (int C_RfQ_ID)
{
if (C_RfQ_ID < 1) throw new IllegalArgumentException ("C_RfQ_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_RfQ_ID, Integer.valueOf(C_RfQ_ID));
}
/** Get RfQ.
@return Request for Quotation */
public int getC_RfQ_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_RfQ_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="97a27f72-c07a-f6fa-5182-ef443c5e519c")
public static String es_PE_FIELD_Response_RfQ_Description="Solicitud de cita";

@XendraTrl(Identifier="97a27f72-c07a-f6fa-5182-ef443c5e519c")
public static String es_PE_FIELD_Response_RfQ_Help="Solicitud de cita para ser enviada a los proveedores de un RfQ asunto. Despues de seleccionar el proveedor, opcionalmente crea las ordenes de venta ó cotización para el cliente así como la orden de compra para proveedor (s)";

@XendraTrl(Identifier="97a27f72-c07a-f6fa-5182-ef443c5e519c")
public static String es_PE_FIELD_Response_RfQ_Name="SPC (RfQ)";

@XendraField(AD_Column_ID="C_RfQ_ID",IsCentrallyMaintained=true,
AD_Tab_ID="c3dee43c-306d-69c9-ae5b-c6efb7699611",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="97a27f72-c07a-f6fa-5182-ef443c5e519c")
public static final String FIELDNAME_Response_RfQ="97a27f72-c07a-f6fa-5182-ef443c5e519c";

@XendraTrl(Identifier="35c7d8dd-1329-344b-9e92-b5c4f773e406")
public static String es_PE_COLUMN_C_RfQ_ID_Name="SPC (RfQ)";

@XendraColumn(AD_Element_ID="8b6564e2-4b5a-7abd-5fdd-c2ab5ad134a1",ColumnName="C_RfQ_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="35c7d8dd-1329-344b-9e92-b5c4f773e406",
Synchronized="2017-08-05 16:54:23.0")
/** Column name C_RfQ_ID */
public static final String COLUMNNAME_C_RfQ_ID = "C_RfQ_ID";
/** Set RfQ Response.
@param C_RfQResponse_ID Request for Quotation Response from a potential Vendor */
public void setC_RfQResponse_ID (int C_RfQResponse_ID)
{
if (C_RfQResponse_ID < 1) throw new IllegalArgumentException ("C_RfQResponse_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_RfQResponse_ID, Integer.valueOf(C_RfQResponse_ID));
}
/** Get RfQ Response.
@return Request for Quotation Response from a potential Vendor */
public int getC_RfQResponse_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_RfQResponse_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="eaa5bee9-b75c-5480-6a87-fec15e2b1964")
public static String es_PE_FIELD_Response_RfQResponse_Description="Solicitud de respuesta de la cita de un proveedor potencial";

@XendraTrl(Identifier="eaa5bee9-b75c-5480-6a87-fec15e2b1964")
public static String es_PE_FIELD_Response_RfQResponse_Help="Solicitud de respuesta de la cita de un proveedor potencial";

@XendraTrl(Identifier="eaa5bee9-b75c-5480-6a87-fec15e2b1964")
public static String es_PE_FIELD_Response_RfQResponse_Name="Respuesta SPC (RfQ)";

@XendraField(AD_Column_ID="C_RfQResponse_ID",IsCentrallyMaintained=true,
AD_Tab_ID="c3dee43c-306d-69c9-ae5b-c6efb7699611",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=10,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="eaa5bee9-b75c-5480-6a87-fec15e2b1964")
public static final String FIELDNAME_Response_RfQResponse="eaa5bee9-b75c-5480-6a87-fec15e2b1964";
/** Column name C_RfQResponse_ID */
public static final String COLUMNNAME_C_RfQResponse_ID = "C_RfQResponse_ID";
/** Set Invited.
@param DateInvited Date when (last) invitation was sent */
public void setDateInvited (Timestamp DateInvited)
{
set_Value (COLUMNNAME_DateInvited, DateInvited);
}
/** Get Invited.
@return Date when (last) invitation was sent */
public Timestamp getDateInvited() 
{
return (Timestamp)get_Value(COLUMNNAME_DateInvited);
}

@XendraTrl(Identifier="912794ff-77d0-6548-6958-58f1706f2ddd")
public static String es_PE_FIELD_Response_Invited_Description="Fecha cuando la invitación (pasada) fue enviada.";

@XendraTrl(Identifier="912794ff-77d0-6548-6958-58f1706f2ddd")
public static String es_PE_FIELD_Response_Invited_Name="Invitado";

@XendraField(AD_Column_ID="DateInvited",IsCentrallyMaintained=true,
AD_Tab_ID="c3dee43c-306d-69c9-ae5b-c6efb7699611",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=120,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="912794ff-77d0-6548-6958-58f1706f2ddd")
public static final String FIELDNAME_Response_Invited="912794ff-77d0-6548-6958-58f1706f2ddd";

@XendraTrl(Identifier="34d94a82-9abb-81e4-b30f-c1f8142050e5")
public static String es_PE_COLUMN_DateInvited_Name="Invitado";

@XendraColumn(AD_Element_ID="430f4651-a6c0-256d-0cef-5464d8313bde",ColumnName="DateInvited",
AD_Reference_ID=15,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="34d94a82-9abb-81e4-b30f-c1f8142050e5",
Synchronized="2017-08-05 16:54:23.0")
/** Column name DateInvited */
public static final String COLUMNNAME_DateInvited = "DateInvited";
/** Set Response Date.
@param DateResponse Date of the Response */
public void setDateResponse (Timestamp DateResponse)
{
set_Value (COLUMNNAME_DateResponse, DateResponse);
}
/** Get Response Date.
@return Date of the Response */
public Timestamp getDateResponse() 
{
return (Timestamp)get_Value(COLUMNNAME_DateResponse);
}

@XendraTrl(Identifier="1bd8c138-5742-df7f-1ba8-2f9f2cafa748")
public static String es_PE_FIELD_Response_ResponseDate_Description="Fecha de la respuesta";

@XendraTrl(Identifier="1bd8c138-5742-df7f-1ba8-2f9f2cafa748")
public static String es_PE_FIELD_Response_ResponseDate_Help="Fecha de la respuesta";

@XendraTrl(Identifier="1bd8c138-5742-df7f-1ba8-2f9f2cafa748")
public static String es_PE_FIELD_Response_ResponseDate_Name="Fecha de Respuesta";

@XendraField(AD_Column_ID="DateResponse",IsCentrallyMaintained=true,
AD_Tab_ID="c3dee43c-306d-69c9-ae5b-c6efb7699611",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=130,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1bd8c138-5742-df7f-1ba8-2f9f2cafa748")
public static final String FIELDNAME_Response_ResponseDate="1bd8c138-5742-df7f-1ba8-2f9f2cafa748";

@XendraTrl(Identifier="a7acfe8d-abe3-4160-fac1-5736f80a208c")
public static String es_PE_COLUMN_DateResponse_Name="Fecha de Respuesta";

@XendraColumn(AD_Element_ID="d9166ff5-a258-a8dd-e207-99d527a46298",ColumnName="DateResponse",
AD_Reference_ID=15,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a7acfe8d-abe3-4160-fac1-5736f80a208c",
Synchronized="2017-08-05 16:54:23.0")
/** Column name DateResponse */
public static final String COLUMNNAME_DateResponse = "DateResponse";
/** Set Work Complete.
@param DateWorkComplete Date when work is (planned to be) complete */
public void setDateWorkComplete (Timestamp DateWorkComplete)
{
set_Value (COLUMNNAME_DateWorkComplete, DateWorkComplete);
}
/** Get Work Complete.
@return Date when work is (planned to be) complete */
public Timestamp getDateWorkComplete() 
{
return (Timestamp)get_Value(COLUMNNAME_DateWorkComplete);
}

@XendraTrl(Identifier="8082915e-9109-7f5f-6311-2eb1d02b2647")
public static String es_PE_FIELD_Response_WorkComplete_Description="Fecha cuando es el trabajo (planeado) termina";

@XendraTrl(Identifier="8082915e-9109-7f5f-6311-2eb1d02b2647")
public static String es_PE_FIELD_Response_WorkComplete_Name="Trabajo Completo";

@XendraField(AD_Column_ID="DateWorkComplete",IsCentrallyMaintained=true,
AD_Tab_ID="c3dee43c-306d-69c9-ae5b-c6efb7699611",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=190,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8082915e-9109-7f5f-6311-2eb1d02b2647")
public static final String FIELDNAME_Response_WorkComplete="8082915e-9109-7f5f-6311-2eb1d02b2647";

@XendraTrl(Identifier="7c5bcc5f-d5ea-bcb1-fad6-8aca466541e7")
public static String es_PE_COLUMN_DateWorkComplete_Name="Trabajo Completo";

@XendraColumn(AD_Element_ID="079fae2c-844c-a019-755f-7222cea008ac",ColumnName="DateWorkComplete",
AD_Reference_ID=15,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7c5bcc5f-d5ea-bcb1-fad6-8aca466541e7",
Synchronized="2017-08-05 16:54:23.0")
/** Column name DateWorkComplete */
public static final String COLUMNNAME_DateWorkComplete = "DateWorkComplete";
/** Set Work Start.
@param DateWorkStart Date when work is (planned to be) started */
public void setDateWorkStart (Timestamp DateWorkStart)
{
set_Value (COLUMNNAME_DateWorkStart, DateWorkStart);
}
/** Get Work Start.
@return Date when work is (planned to be) started */
public Timestamp getDateWorkStart() 
{
return (Timestamp)get_Value(COLUMNNAME_DateWorkStart);
}

@XendraTrl(Identifier="1cca1c3b-db18-adfe-8d0d-25cb17bee7d1")
public static String es_PE_FIELD_Response_WorkStart_Description="Fecha cuando el trabajo (planeado para) se comienza.";

@XendraTrl(Identifier="1cca1c3b-db18-adfe-8d0d-25cb17bee7d1")
public static String es_PE_FIELD_Response_WorkStart_Name="Inicia el Trabajo";

@XendraField(AD_Column_ID="DateWorkStart",IsCentrallyMaintained=true,
AD_Tab_ID="c3dee43c-306d-69c9-ae5b-c6efb7699611",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=170,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1cca1c3b-db18-adfe-8d0d-25cb17bee7d1")
public static final String FIELDNAME_Response_WorkStart="1cca1c3b-db18-adfe-8d0d-25cb17bee7d1";

@XendraTrl(Identifier="e1822724-f37f-3c51-1511-4bb4b9d4d4bf")
public static String es_PE_COLUMN_DateWorkStart_Name="Inicia el Trabajo";

@XendraColumn(AD_Element_ID="eacd3b09-4768-e18d-b651-2ec68cc53f56",ColumnName="DateWorkStart",
AD_Reference_ID=15,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e1822724-f37f-3c51-1511-4bb4b9d4d4bf",
Synchronized="2017-08-05 16:54:23.0")
/** Column name DateWorkStart */
public static final String COLUMNNAME_DateWorkStart = "DateWorkStart";
/** Set Delivery Days.
@param DeliveryDays Number of Days (planned) until Delivery */
public void setDeliveryDays (int DeliveryDays)
{
set_Value (COLUMNNAME_DeliveryDays, Integer.valueOf(DeliveryDays));
}
/** Get Delivery Days.
@return Number of Days (planned) until Delivery */
public int getDeliveryDays() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_DeliveryDays);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="52719e56-b50e-b460-5e84-2987458b5314")
public static String es_PE_FIELD_Response_DeliveryDays_Description="Numero de dias (planeado) hasta la entega";

@XendraTrl(Identifier="52719e56-b50e-b460-5e84-2987458b5314")
public static String es_PE_FIELD_Response_DeliveryDays_Name="Días de Entrega";

@XendraField(AD_Column_ID="DeliveryDays",IsCentrallyMaintained=true,
AD_Tab_ID="c3dee43c-306d-69c9-ae5b-c6efb7699611",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=180,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="52719e56-b50e-b460-5e84-2987458b5314")
public static final String FIELDNAME_Response_DeliveryDays="52719e56-b50e-b460-5e84-2987458b5314";

@XendraTrl(Identifier="75ca8b84-08d2-474f-e67f-615746b3db95")
public static String es_PE_COLUMN_DeliveryDays_Name="Días de Entrega";

@XendraColumn(AD_Element_ID="be6b99df-af16-3107-0958-5fe3af220ffc",ColumnName="DeliveryDays",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="75ca8b84-08d2-474f-e67f-615746b3db95",
Synchronized="2017-08-05 16:54:23.0")
/** Column name DeliveryDays */
public static final String COLUMNNAME_DeliveryDays = "DeliveryDays";
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

@XendraTrl(Identifier="2bcf5632-18e5-1775-97a9-6d23f896ed4c")
public static String es_PE_FIELD_Response_Description_Description="Observación corta opcional del registro";

@XendraTrl(Identifier="2bcf5632-18e5-1775-97a9-6d23f896ed4c")
public static String es_PE_FIELD_Response_Description_Help="Una Observación esta limitada a 255 caracteres";

@XendraTrl(Identifier="2bcf5632-18e5-1775-97a9-6d23f896ed4c")
public static String es_PE_FIELD_Response_Description_Name="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="c3dee43c-306d-69c9-ae5b-c6efb7699611",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2bcf5632-18e5-1775-97a9-6d23f896ed4c")
public static final String FIELDNAME_Response_Description="2bcf5632-18e5-1775-97a9-6d23f896ed4c";

@XendraTrl(Identifier="ef5170de-f0c6-1406-00c5-54044287262a")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ef5170de-f0c6-1406-00c5-54044287262a",
Synchronized="2017-08-05 16:54:23.0")
/** Column name Description */
public static final String COLUMNNAME_Description = "Description";
/** Set Comment/Help.
@param Help Comment or Hint */
public void setHelp (String Help)
{
set_Value (COLUMNNAME_Help, Help);
}
/** Get Comment/Help.
@return Comment or Hint */
public String getHelp() 
{
String value = (String)get_Value(COLUMNNAME_Help);
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

@XendraTrl(Identifier="d89a807a-ba8d-f1f3-d711-94fbc2d4e540")
public static String es_PE_FIELD_Response_CommentHelp_Description="Ayuda; Comentario o Sugerencia";

@XendraTrl(Identifier="d89a807a-ba8d-f1f3-d711-94fbc2d4e540")
public static String es_PE_FIELD_Response_CommentHelp_Help="El campo ayuda contiene una sugerencia; comentario o ayuda acerca del uso de esta partida";

@XendraTrl(Identifier="d89a807a-ba8d-f1f3-d711-94fbc2d4e540")
public static String es_PE_FIELD_Response_CommentHelp_Name="Ayuda";

@XendraField(AD_Column_ID="Help",IsCentrallyMaintained=true,
AD_Tab_ID="c3dee43c-306d-69c9-ae5b-c6efb7699611",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d89a807a-ba8d-f1f3-d711-94fbc2d4e540")
public static final String FIELDNAME_Response_CommentHelp="d89a807a-ba8d-f1f3-d711-94fbc2d4e540";

@XendraTrl(Identifier="c29e6262-f4a9-da85-78f7-de437572f1cb")
public static String es_PE_COLUMN_Help_Name="Ayuda";

@XendraColumn(AD_Element_ID="a6fda582-56f9-6bb7-8436-285ce4f8de3f",ColumnName="Help",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c29e6262-f4a9-da85-78f7-de437572f1cb",
Synchronized="2017-08-05 16:54:23.0")
/** Column name Help */
public static final String COLUMNNAME_Help = "Help";
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
@XendraTrl(Identifier="f4ec8bc1-8f8b-423b-9927-fd84325a2b13")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f4ec8bc1-8f8b-423b-9927-fd84325a2b13",
Synchronized="2017-08-05 16:54:23.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Complete.
@param IsComplete It is complete */
public void setIsComplete (boolean IsComplete)
{
set_Value (COLUMNNAME_IsComplete, Boolean.valueOf(IsComplete));
}
/** Get Complete.
@return It is complete */
public boolean isComplete() 
{
Object oo = get_Value(COLUMNNAME_IsComplete);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="abc6ed5c-6875-4895-c64a-ae24e04eefe0")
public static String es_PE_FIELD_Response_Complete_Description="Esta completo";

@XendraTrl(Identifier="abc6ed5c-6875-4895-c64a-ae24e04eefe0")
public static String es_PE_FIELD_Response_Complete_Help="Indica que esta completo.";

@XendraTrl(Identifier="abc6ed5c-6875-4895-c64a-ae24e04eefe0")
public static String es_PE_FIELD_Response_Complete_Name="Completo";

@XendraField(AD_Column_ID="IsComplete",IsCentrallyMaintained=true,
AD_Tab_ID="c3dee43c-306d-69c9-ae5b-c6efb7699611",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=true,SeqNo=250,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="abc6ed5c-6875-4895-c64a-ae24e04eefe0")
public static final String FIELDNAME_Response_Complete="abc6ed5c-6875-4895-c64a-ae24e04eefe0";

@XendraTrl(Identifier="a4845212-af03-455d-9342-28ad74742028")
public static String es_PE_COLUMN_IsComplete_Name="Completo";

@XendraColumn(AD_Element_ID="21e7bef5-031b-47dc-2d6d-fa6a789b02c5",ColumnName="IsComplete",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a4845212-af03-455d-9342-28ad74742028",
Synchronized="2017-08-05 16:54:23.0")
/** Column name IsComplete */
public static final String COLUMNNAME_IsComplete = "IsComplete";
/** Set Selected Winner.
@param IsSelectedWinner The resonse is the selected winner */
public void setIsSelectedWinner (boolean IsSelectedWinner)
{
set_Value (COLUMNNAME_IsSelectedWinner, Boolean.valueOf(IsSelectedWinner));
}
/** Get Selected Winner.
@return The resonse is the selected winner */
public boolean isSelectedWinner() 
{
Object oo = get_Value(COLUMNNAME_IsSelectedWinner);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="4f767d75-ffd3-00b5-5de3-60c52d1749c1")
public static String es_PE_FIELD_Response_SelectedWinner_Description="La respuesta es el ganador seleccionado";

@XendraTrl(Identifier="4f767d75-ffd3-00b5-5de3-60c52d1749c1")
public static String es_PE_FIELD_Response_SelectedWinner_Help="La respuesta es el ganador seleccionado. Si están seleccionadas en nivel de la respuesta, se no hacen caso las selecciones de línea.";

@XendraTrl(Identifier="4f767d75-ffd3-00b5-5de3-60c52d1749c1")
public static String es_PE_FIELD_Response_SelectedWinner_Name="Ganador Seleccionado";

@XendraField(AD_Column_ID="IsSelectedWinner",IsCentrallyMaintained=true,
AD_Tab_ID="c3dee43c-306d-69c9-ae5b-c6efb7699611",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=220,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="4f767d75-ffd3-00b5-5de3-60c52d1749c1")
public static final String FIELDNAME_Response_SelectedWinner="4f767d75-ffd3-00b5-5de3-60c52d1749c1";

@XendraTrl(Identifier="80908858-2ad0-1898-a579-03a7106fae6a")
public static String es_PE_COLUMN_IsSelectedWinner_Name="Ganador Seleccionado";

@XendraColumn(AD_Element_ID="355329e9-c7ca-11f3-ed90-90ddacc86007",ColumnName="IsSelectedWinner",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="80908858-2ad0-1898-a579-03a7106fae6a",
Synchronized="2017-08-05 16:54:23.0")
/** Column name IsSelectedWinner */
public static final String COLUMNNAME_IsSelectedWinner = "IsSelectedWinner";
/** Set Self-Service.
@param IsSelfService This is a Self-Service entry or this entry can be changed via Self-Service */
public void setIsSelfService (boolean IsSelfService)
{
set_Value (COLUMNNAME_IsSelfService, Boolean.valueOf(IsSelfService));
}
/** Get Self-Service.
@return This is a Self-Service entry or this entry can be changed via Self-Service */
public boolean isSelfService() 
{
Object oo = get_Value(COLUMNNAME_IsSelfService);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="5c5b9196-7e50-5c86-08c5-a58c673889cd")
public static String es_PE_FIELD_Response_Self_Service_Description="Esta es una entrada del autoservicio ó esta entrada se puede cambiar vía autoservicio";

@XendraTrl(Identifier="5c5b9196-7e50-5c86-08c5-a58c673889cd")
public static String es_PE_FIELD_Response_Self_Service_Help="El autoservicio permite que los usuarios incorporen datos o que pongan al día sus datos. La bandera indica, que este expediente fue incorporado o creado vía autoservicio o que el usuario puede cambiarlo vía funcionalidad del autoservicio.";

@XendraTrl(Identifier="5c5b9196-7e50-5c86-08c5-a58c673889cd")
public static String es_PE_FIELD_Response_Self_Service_Name="Auto-Servicio";

@XendraField(AD_Column_ID="IsSelfService",IsCentrallyMaintained=true,
AD_Tab_ID="c3dee43c-306d-69c9-ae5b-c6efb7699611",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=true,SeqNo=140,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5c5b9196-7e50-5c86-08c5-a58c673889cd")
public static final String FIELDNAME_Response_Self_Service="5c5b9196-7e50-5c86-08c5-a58c673889cd";

@XendraTrl(Identifier="060896e0-affb-2d5b-a65b-669667139623")
public static String es_PE_COLUMN_IsSelfService_Name="Auto-Servicio";

@XendraColumn(AD_Element_ID="8f201030-f9ab-66d2-f4de-7209f41f2af8",ColumnName="IsSelfService",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="060896e0-affb-2d5b-a65b-669667139623",
Synchronized="2017-08-05 16:54:23.0")
/** Column name IsSelfService */
public static final String COLUMNNAME_IsSelfService = "IsSelfService";
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

@XendraTrl(Identifier="9ad2563d-f417-7251-14ef-96d05141ac14")
public static String es_PE_FIELD_Response_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="9ad2563d-f417-7251-14ef-96d05141ac14")
public static String es_PE_FIELD_Response_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraTrl(Identifier="9ad2563d-f417-7251-14ef-96d05141ac14")
public static String es_PE_FIELD_Response_Name_Name="Nombre";
@XendraField(AD_Column_ID="Name",
IsCentrallyMaintained=true,AD_Tab_ID="c3dee43c-306d-69c9-ae5b-c6efb7699611",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=50,SortNo=-1,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="9ad2563d-f417-7251-14ef-96d05141ac14")
public static final String FIELDNAME_Response_Name="9ad2563d-f417-7251-14ef-96d05141ac14";

@XendraTrl(Identifier="edb1ca32-f49d-20d0-93d8-f683fb0bc12f")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="edb1ca32-f49d-20d0-93d8-f683fb0bc12f",
Synchronized="2017-08-05 16:54:23.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
/** Set Price.
@param Price Price */
public void setPrice (BigDecimal Price)
{
if (Price == null) throw new IllegalArgumentException ("Price is mandatory.");
set_Value (COLUMNNAME_Price, Price);
}
/** Get Price.
@return Price */
public BigDecimal getPrice() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Price);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="4174c2f7-f875-426a-387e-86305ed8f4ca")
public static String es_PE_FIELD_Response_Price_Description="Precio";

@XendraTrl(Identifier="4174c2f7-f875-426a-387e-86305ed8f4ca")
public static String es_PE_FIELD_Response_Price_Help="El Precio indica el precio de un producto ó servicio";

@XendraTrl(Identifier="4174c2f7-f875-426a-387e-86305ed8f4ca")
public static String es_PE_FIELD_Response_Price_Name="Precio";
@XendraField(AD_Column_ID="Price",
IsCentrallyMaintained=true,AD_Tab_ID="c3dee43c-306d-69c9-ae5b-c6efb7699611",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=160,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="4174c2f7-f875-426a-387e-86305ed8f4ca")
public static final String FIELDNAME_Response_Price="4174c2f7-f875-426a-387e-86305ed8f4ca";

@XendraTrl(Identifier="536b1950-99d8-af04-a168-fab17f881a11")
public static String es_PE_COLUMN_Price_Name="Precio";

@XendraColumn(AD_Element_ID="aafaa7a6-6897-fb14-1b29-1dc3b61047b9",ColumnName="Price",
AD_Reference_ID=37,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="536b1950-99d8-af04-a168-fab17f881a11",
Synchronized="2017-08-05 16:54:23.0")
/** Column name Price */
public static final String COLUMNNAME_Price = "Price";
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

@XendraTrl(Identifier="e8a88e86-b994-d0ca-31cc-532ce809f4f2")
public static String es_PE_FIELD_Response_Processed_Description="El documento ha sido procesado";

@XendraTrl(Identifier="e8a88e86-b994-d0ca-31cc-532ce809f4f2")
public static String es_PE_FIELD_Response_Processed_Help="El cuadro de verificación procesada indica que un documento ha sido procesado";

@XendraTrl(Identifier="e8a88e86-b994-d0ca-31cc-532ce809f4f2")
public static String es_PE_FIELD_Response_Processed_Name="Procesado";

@XendraField(AD_Column_ID="Processed",IsCentrallyMaintained=true,
AD_Tab_ID="c3dee43c-306d-69c9-ae5b-c6efb7699611",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=true,SeqNo=260,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e8a88e86-b994-d0ca-31cc-532ce809f4f2")
public static final String FIELDNAME_Response_Processed="e8a88e86-b994-d0ca-31cc-532ce809f4f2";

@XendraTrl(Identifier="45e04976-8990-b931-12c8-7a87d9bca27e")
public static String es_PE_COLUMN_Processed_Name="Procesado";

@XendraColumn(AD_Element_ID="3f7035d2-fa5e-7416-fc0c-e49e43f9e083",ColumnName="Processed",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="45e04976-8990-b931-12c8-7a87d9bca27e",
Synchronized="2017-08-05 16:54:23.0")
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

@XendraTrl(Identifier="55c04205-d6ed-000d-e633-89d79c9861b5")
public static String es_PE_FIELD_Response_ProcessNow_Description="Email Invitación y recordatorio al provedor para contestar la SPC (RfQ)";

@XendraTrl(Identifier="55c04205-d6ed-000d-e633-89d79c9861b5")
public static String es_PE_FIELD_Response_ProcessNow_Help="Envía Invitación/Recordatorio al proveedor para la respuesta de SPC (RfQ) por email";

@XendraTrl(Identifier="55c04205-d6ed-000d-e633-89d79c9861b5")
public static String es_PE_FIELD_Response_ProcessNow_Name="Invitación y Recordatorio";

@XendraField(AD_Column_ID="Processing",IsCentrallyMaintained=true,
AD_Tab_ID="c3dee43c-306d-69c9-ae5b-c6efb7699611",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=200,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="55c04205-d6ed-000d-e633-89d79c9861b5")
public static final String FIELDNAME_Response_ProcessNow="55c04205-d6ed-000d-e633-89d79c9861b5";

@XendraTrl(Identifier="ee74289b-ace1-56b8-56ad-6c4a8abb4691")
public static String es_PE_COLUMN_Processing_Name="Procesar Ahora";

@XendraColumn(AD_Element_ID="f2096404-1a98-35ec-09ea-273b3e19b7de",ColumnName="Processing",
AD_Reference_ID=28,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="9bf05e85-6f80-ccf8-d746-0f888aeb39ed",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="ee74289b-ace1-56b8-56ad-6c4a8abb4691",Synchronized="2017-08-05 16:54:23.0")
/** Column name Processing */
public static final String COLUMNNAME_Processing = "Processing";
/** Set Ranking.
@param Ranking Relative Rank Number */
public void setRanking (int Ranking)
{
set_Value (COLUMNNAME_Ranking, Integer.valueOf(Ranking));
}
/** Get Ranking.
@return Relative Rank Number */
public int getRanking() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_Ranking);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="dde906e7-ec70-7f33-ec5c-2974419d1392")
public static String es_PE_FIELD_Response_Ranking_Description="Numero relativo de fila";

@XendraTrl(Identifier="dde906e7-ec70-7f33-ec5c-2974419d1392")
public static String es_PE_FIELD_Response_Ranking_Help="Uno es la fila más alta";

@XendraTrl(Identifier="dde906e7-ec70-7f33-ec5c-2974419d1392")
public static String es_PE_FIELD_Response_Ranking_Name="Evaluación";

@XendraField(AD_Column_ID="Ranking",IsCentrallyMaintained=true,
AD_Tab_ID="c3dee43c-306d-69c9-ae5b-c6efb7699611",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=210,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="dde906e7-ec70-7f33-ec5c-2974419d1392")
public static final String FIELDNAME_Response_Ranking="dde906e7-ec70-7f33-ec5c-2974419d1392";

@XendraTrl(Identifier="6f669a06-f118-825c-f65a-ceb7d52282cb")
public static String es_PE_COLUMN_Ranking_Name="Evaluación";

@XendraColumn(AD_Element_ID="1e16005e-4845-d720-5cdf-d2257a4078aa",ColumnName="Ranking",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6f669a06-f118-825c-f65a-ceb7d52282cb",
Synchronized="2017-08-05 16:54:23.0")
/** Column name Ranking */
public static final String COLUMNNAME_Ranking = "Ranking";
}
