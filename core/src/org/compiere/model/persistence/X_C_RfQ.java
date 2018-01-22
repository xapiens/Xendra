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
import org.compiere.model.reference.REF_C_RfQQuoteType;
/** Generated Model for C_RfQ
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_C_RfQ extends PO
{
/** Standard Constructor
@param ctx context
@param C_RfQ_ID id
@param trxName transaction
*/
public X_C_RfQ (Properties ctx, int C_RfQ_ID, String trxName)
{
super (ctx, C_RfQ_ID, trxName);
/** if (C_RfQ_ID == 0)
{
setC_Currency_ID (0);	
// @$C_Currency_ID @
setC_RfQ_ID (0);
setC_RfQ_Topic_ID (0);
setDateResponse (new Timestamp(System.currentTimeMillis()));
setDocumentNo (null);
setIsInvitedVendorsOnly (false);	
// N
setIsQuoteAllQty (false);	
// N
setIsQuoteTotalAmt (false);	
// N
setIsRfQResponseAccepted (true);	
// Y
setIsSelfService (true);	
// Y
setName (null);
setProcessed (false);	
// N
setQuoteType (null);	
// S
setSalesRep_ID (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_C_RfQ (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=677 */
public static int Table_ID=MTable.getTable_ID("C_RfQ");

@XendraTrl(Identifier="64e91f91-7cb7-1241-06fa-ba7cc28b4049")
public static String es_PE_TAB_RfQ_Description="Solicitud para Cotización";

@XendraTrl(Identifier="64e91f91-7cb7-1241-06fa-ba7cc28b4049")
public static String es_PE_TAB_RfQ_Name="Solicitud de Cotización";

@XendraTrl(Identifier="64e91f91-7cb7-1241-06fa-ba7cc28b4049")
public static String es_PE_TAB_RfQ_Help="Solicitud para Cotización para ser enviada a los proveedores asignados en el asunto de SPC (RfQ), opcionalmente crea orden de venta ó cotización para cliente para despues realizar la orden de compra al proveedor.";

@XendraTab(Name="RfQ",Description="Request for Quotation",
Help="Request for Quotation to be sent out to vendors of a RfQ Topic. After Vendor selection, optionally create Sales Order or Quote for Customer as well as Purchase Order  for Vendor(s)",
AD_Window_ID="5489b4f6-e5c1-38be-86b2-ee5f7e420113",SeqNo=10,TabLevel=0,IsSingleRow=true,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="64e91f91-7cb7-1241-06fa-ba7cc28b4049",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_RfQ="64e91f91-7cb7-1241-06fa-ba7cc28b4049";

@XendraTrl(Identifier="b6a3f939-dad2-e60f-f1ee-46fb98adef39")
public static String es_PE_TABLE_C_RfQ_Name="SPC (RfQ)";

@XendraTable(Name="RfQ",Description="Request for Quotation",Help="",TableName="C_RfQ",
AccessLevel="1",AD_Window_ID="5489b4f6-e5c1-38be-86b2-ee5f7e420113",AD_Val_Rule_ID="",IsKey=1,
LoadSeq=130,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,
IsView=false,PO_Window_ID="",ID="org.xendra.commercial",
Identifier="b6a3f939-dad2-e60f-f1ee-46fb98adef39",Synchronized="2017-08-16 11:42:25.0")
/** TableName=C_RfQ */
public static final String Table_Name="C_RfQ";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"C_RfQ");

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
    Table_ID = MTable.getTable_ID("C_RfQ");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_C_RfQ[").append(get_ID()).append("]");
return sb.toString();
}
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

@XendraTrl(Identifier="ec9d090f-b11a-6c84-29aa-b0e047cb6762")
public static String es_PE_FIELD_RfQ_UserContact_Description="ID de Usuario dentro del sistema";

@XendraTrl(Identifier="ec9d090f-b11a-6c84-29aa-b0e047cb6762")
public static String es_PE_FIELD_RfQ_UserContact_Help="La ID de usuario identifica un usuario único en el sistema";

@XendraTrl(Identifier="ec9d090f-b11a-6c84-29aa-b0e047cb6762")
public static String es_PE_FIELD_RfQ_UserContact_Name="Usuario";

@XendraField(AD_Column_ID="AD_User_ID",IsCentrallyMaintained=true,
AD_Tab_ID="64e91f91-7cb7-1241-06fa-ba7cc28b4049",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=260,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ec9d090f-b11a-6c84-29aa-b0e047cb6762")
public static final String FIELDNAME_RfQ_UserContact="ec9d090f-b11a-6c84-29aa-b0e047cb6762";

@XendraTrl(Identifier="60c90471-d465-d04d-7e36-a25afab007b4")
public static String es_PE_COLUMN_AD_User_ID_Name="Usuario";

@XendraColumn(AD_Element_ID="abdf8dee-d3cd-73ec-c758-683e907797f4",ColumnName="AD_User_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="f4ac36a1-4200-1386-677e-14ac90afb4fe",
FieldLength=22,DefaultValue="-1",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="60c90471-d465-d04d-7e36-a25afab007b4",Synchronized="2017-08-05 16:54:22.0")
/** Column name AD_User_ID */
public static final String COLUMNNAME_AD_User_ID = "AD_User_ID";
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

@XendraTrl(Identifier="b9e85d7b-b4ae-5f0d-20ce-a0e05efa7c09")
public static String es_PE_FIELD_RfQ_BusinessPartner_Description="Identifica un Socio de Negocio";

@XendraTrl(Identifier="b9e85d7b-b4ae-5f0d-20ce-a0e05efa7c09")
public static String es_PE_FIELD_RfQ_BusinessPartner_Help="Un socio de negocio es cualquiera con quien usted realiza transacciones. Este puede incluir Proveedores; Clientes; Empleados ó Vendedores.";

@XendraTrl(Identifier="b9e85d7b-b4ae-5f0d-20ce-a0e05efa7c09")
public static String es_PE_FIELD_RfQ_BusinessPartner_Name="Socio de Negocio";

@XendraField(AD_Column_ID="C_BPartner_ID",IsCentrallyMaintained=true,
AD_Tab_ID="64e91f91-7cb7-1241-06fa-ba7cc28b4049",AD_FieldGroup_ID="Business Partner",
IsDisplayed=true,DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=240,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="b9e85d7b-b4ae-5f0d-20ce-a0e05efa7c09")
public static final String FIELDNAME_RfQ_BusinessPartner="b9e85d7b-b4ae-5f0d-20ce-a0e05efa7c09";

@XendraTrl(Identifier="c6285d37-f81c-7b07-8065-2bcaf04ee239")
public static String es_PE_COLUMN_C_BPartner_ID_Name="Socio de Negocio";

@XendraColumn(AD_Element_ID="fe333dc3-4f40-1276-5f6a-d09bb66dc423",ColumnName="C_BPartner_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="06fdbbe9-e1c4-3ee4-4a9d-73d1a990cc42",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="c6285d37-f81c-7b07-8065-2bcaf04ee239",Synchronized="2017-08-05 16:54:22.0")
/** Column name C_BPartner_ID */
public static final String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";
/** Set Partner Location.
@param C_BPartner_Location_ID Identifies the (ship to) address for this Business Partner */
public void setC_BPartner_Location_ID (int C_BPartner_Location_ID)
{
if (C_BPartner_Location_ID <= 0) set_Value (COLUMNNAME_C_BPartner_Location_ID, null);
 else 
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

@XendraTrl(Identifier="29212c5b-f20f-add5-c9b8-50086e679abf")
public static String es_PE_FIELD_RfQ_PartnerLocation_Description="Identifica la dirección para este socio de negocio";

@XendraTrl(Identifier="29212c5b-f20f-add5-c9b8-50086e679abf")
public static String es_PE_FIELD_RfQ_PartnerLocation_Help="La dirección de un socio indica la ubicación de un socio de negocio";

@XendraTrl(Identifier="29212c5b-f20f-add5-c9b8-50086e679abf")
public static String es_PE_FIELD_RfQ_PartnerLocation_Name="Dirección del Socio del Negocio";

@XendraField(AD_Column_ID="C_BPartner_Location_ID",IsCentrallyMaintained=true,
AD_Tab_ID="64e91f91-7cb7-1241-06fa-ba7cc28b4049",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=250,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="29212c5b-f20f-add5-c9b8-50086e679abf")
public static final String FIELDNAME_RfQ_PartnerLocation="29212c5b-f20f-add5-c9b8-50086e679abf";

@XendraTrl(Identifier="b8bc2f76-c051-af03-1c4e-d62821e3b4d0")
public static String es_PE_COLUMN_C_BPartner_Location_ID_Name="Dirección del Socio del Negocio";

@XendraColumn(AD_Element_ID="0dab7dc6-2832-26dc-2462-cba2d40235f2",
ColumnName="C_BPartner_Location_ID",AD_Reference_ID=19,AD_Reference_Value_ID="",
AD_Val_Rule_ID="623d98c0-19fc-56a2-f511-8992974d3c05",FieldLength=22,DefaultValue="",IsKey=false,
IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b8bc2f76-c051-af03-1c4e-d62821e3b4d0",
Synchronized="2017-08-05 16:54:22.0")
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

@XendraTrl(Identifier="0fb4c1b6-b18c-491f-c604-ae4f213fac84")
public static String es_PE_FIELD_RfQ_Currency_Description="Moneda para este registro";

@XendraTrl(Identifier="0fb4c1b6-b18c-491f-c604-ae4f213fac84")
public static String es_PE_FIELD_RfQ_Currency_Help="Indica la moneda a ser usada cuando se procese ó Informe este registro";

@XendraTrl(Identifier="0fb4c1b6-b18c-491f-c604-ae4f213fac84")
public static String es_PE_FIELD_RfQ_Currency_Name="Moneda";

@XendraField(AD_Column_ID="C_Currency_ID",IsCentrallyMaintained=true,
AD_Tab_ID="64e91f91-7cb7-1241-06fa-ba7cc28b4049",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=190,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0fb4c1b6-b18c-491f-c604-ae4f213fac84")
public static final String FIELDNAME_RfQ_Currency="0fb4c1b6-b18c-491f-c604-ae4f213fac84";

@XendraTrl(Identifier="467f101c-f929-be66-c8bd-5459238ef2dc")
public static String es_PE_COLUMN_C_Currency_ID_Name="Moneda";

@XendraColumn(AD_Element_ID="8daec488-bca2-50fe-f9de-abf0cba2a34a",ColumnName="C_Currency_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,
DefaultValue="@$C_Currency_ID @",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="467f101c-f929-be66-c8bd-5459238ef2dc",Synchronized="2017-08-05 16:54:22.0")
/** Column name C_Currency_ID */
public static final String COLUMNNAME_C_Currency_ID = "C_Currency_ID";
/** Set Copy Lines.
@param CopyLines Copy Lines */
public void setCopyLines (String CopyLines)
{
if (CopyLines != null && CopyLines.length() > 1)
{
log.warning("Length > 1 - truncated");
CopyLines = CopyLines.substring(0,0);
}
set_Value (COLUMNNAME_CopyLines, CopyLines);
}
/** Get Copy Lines.
@return Copy Lines */
public String getCopyLines() 
{
return (String)get_Value(COLUMNNAME_CopyLines);
}

@XendraTrl(Identifier="a02ca491-2766-7e66-be75-5275579b6368")
public static String es_PE_FIELD_RfQ_CopyLines_Description="Copia Líneas de otra SPC (RfQ)";

@XendraTrl(Identifier="a02ca491-2766-7e66-be75-5275579b6368")
public static String es_PE_FIELD_RfQ_CopyLines_Name="Copia Líneas";

@XendraField(AD_Column_ID="CopyLines",IsCentrallyMaintained=true,
AD_Tab_ID="64e91f91-7cb7-1241-06fa-ba7cc28b4049",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=310,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a02ca491-2766-7e66-be75-5275579b6368")
public static final String FIELDNAME_RfQ_CopyLines="a02ca491-2766-7e66-be75-5275579b6368";

@XendraTrl(Identifier="070fc9c6-7ad0-9b44-0164-db7d93683e5f")
public static String es_PE_COLUMN_CopyLines_Name="Copiar Líneas";

@XendraColumn(AD_Element_ID="e042a8ca-3c6a-439d-3bc6-074c05316d48",ColumnName="CopyLines",
AD_Reference_ID=28,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="050bbab8-1981-647a-6e4e-b844a35b0bdf",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="070fc9c6-7ad0-9b44-0164-db7d93683e5f",Synchronized="2017-08-05 16:54:22.0")
/** Column name CopyLines */
public static final String COLUMNNAME_CopyLines = "CopyLines";
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

@XendraTrl(Identifier="a397cd2d-f281-3bca-18af-c8593d5e0dac")
public static String es_PE_FIELD_RfQ_Order_Description="Orden de Venta";

@XendraTrl(Identifier="a397cd2d-f281-3bca-18af-c8593d5e0dac")
public static String es_PE_FIELD_RfQ_Order_Help="La ID de la orden de ventas es un identificador único de la orden de ventas; Ésta es controlada por la secuencia del documento para este tipo de documento.";

@XendraTrl(Identifier="a397cd2d-f281-3bca-18af-c8593d5e0dac")
public static String es_PE_FIELD_RfQ_Order_Name="Orden de Venta";

@XendraField(AD_Column_ID="C_Order_ID",IsCentrallyMaintained=true,
AD_Tab_ID="64e91f91-7cb7-1241-06fa-ba7cc28b4049",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=290,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a397cd2d-f281-3bca-18af-c8593d5e0dac")
public static final String FIELDNAME_RfQ_Order="a397cd2d-f281-3bca-18af-c8593d5e0dac";

@XendraTrl(Identifier="6cabe154-8831-8286-2ad8-b9139b5a6870")
public static String es_PE_COLUMN_C_Order_ID_Name="Orden de Venta";

@XendraColumn(AD_Element_ID="cc846c60-90b8-6aad-9d07-b5d0c0328787",ColumnName="C_Order_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6cabe154-8831-8286-2ad8-b9139b5a6870",
Synchronized="2017-08-05 16:54:22.0")
/** Column name C_Order_ID */
public static final String COLUMNNAME_C_Order_ID = "C_Order_ID";
/** Set Create PO.
@param CreatePO Create Purchase Order */
public void setCreatePO (String CreatePO)
{
if (CreatePO != null && CreatePO.length() > 1)
{
log.warning("Length > 1 - truncated");
CreatePO = CreatePO.substring(0,0);
}
set_Value (COLUMNNAME_CreatePO, CreatePO);
}
/** Get Create PO.
@return Create Purchase Order */
public String getCreatePO() 
{
return (String)get_Value(COLUMNNAME_CreatePO);
}

@XendraTrl(Identifier="4c75401a-4302-72a3-9ed2-22bc3b5d1dff")
public static String es_PE_FIELD_RfQ_CreatePO_Description="Crea Orden de Compra  Para una SPC (RfQ) de los Ganadores";

@XendraTrl(Identifier="4c75401a-4302-72a3-9ed2-22bc3b5d1dff")
public static String es_PE_FIELD_RfQ_CreatePO_Help="Crea orden(es) de compra para la respuesta(s) y las líneas marcadas como ganador seleccionado usando la cantidad seleccionada de la compra (en la línea cantidad de SPC (RfQ)). Si una respuesta está marcada como ganador seleccionado, se crean todas las líneas (y no hacen caso al ganador seleccionado de otras respuestas). Si no hay respuesta marcada como ganador seleccionado, se utilizan las líneas.";

@XendraTrl(Identifier="4c75401a-4302-72a3-9ed2-22bc3b5d1dff")
public static String es_PE_FIELD_RfQ_CreatePO_Name="Crea Orden de Compra";

@XendraField(AD_Column_ID="CreatePO",IsCentrallyMaintained=true,
AD_Tab_ID="64e91f91-7cb7-1241-06fa-ba7cc28b4049",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=300,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="4c75401a-4302-72a3-9ed2-22bc3b5d1dff")
public static final String FIELDNAME_RfQ_CreatePO="4c75401a-4302-72a3-9ed2-22bc3b5d1dff";

@XendraTrl(Identifier="f83c605b-abdd-f9b2-6b50-855a67c0fdb9")
public static String es_PE_COLUMN_CreatePO_Name="Crear OC";

@XendraColumn(AD_Element_ID="20cd5fd0-fa43-3c4c-3483-7e2a4b0037b7",ColumnName="CreatePO",
AD_Reference_ID=28,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="c7ef0f0f-587f-5a1b-4124-02c85455cd0a",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="f83c605b-abdd-f9b2-6b50-855a67c0fdb9",Synchronized="2017-08-05 16:54:22.0")
/** Column name CreatePO */
public static final String COLUMNNAME_CreatePO = "CreatePO";
/** Set Create SO.
@param CreateSO Create SO */
public void setCreateSO (String CreateSO)
{
if (CreateSO != null && CreateSO.length() > 1)
{
log.warning("Length > 1 - truncated");
CreateSO = CreateSO.substring(0,0);
}
set_Value (COLUMNNAME_CreateSO, CreateSO);
}
/** Get Create SO.
@return Create SO */
public String getCreateSO() 
{
return (String)get_Value(COLUMNNAME_CreateSO);
}

@XendraTrl(Identifier="0587bb56-aadd-57ad-5a53-e961c0c37a7a")
public static String es_PE_FIELD_RfQ_CreateSO_Description="Crea orden de Venta";

@XendraTrl(Identifier="0587bb56-aadd-57ad-5a53-e961c0c37a7a")
public static String es_PE_FIELD_RfQ_CreateSO_Help="Una orden de las ventas se crea para el socio de negocio inscrito. Una línea de la orden de las ventas se crea para cada línea cantidad de SPC (RfQ), donde \"Cantidad Ofrecida\" se selecciona. Si en la línea cantidad de SPC (RfQ), se introduce una cantidad de la oferta (no 0), que el precio se utiliza. Si un margen se incorpora en la línea cantidad de SPC (RfQ), sobreescribe el margen general. El margen es el porcentaje agregado a la mejor cantidad de la respuesta.";

@XendraTrl(Identifier="0587bb56-aadd-57ad-5a53-e961c0c37a7a")
public static String es_PE_FIELD_RfQ_CreateSO_Name="Crea Orden de Venta";

@XendraField(AD_Column_ID="CreateSO",IsCentrallyMaintained=true,
AD_Tab_ID="64e91f91-7cb7-1241-06fa-ba7cc28b4049",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=280,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0587bb56-aadd-57ad-5a53-e961c0c37a7a")
public static final String FIELDNAME_RfQ_CreateSO="0587bb56-aadd-57ad-5a53-e961c0c37a7a";

@XendraTrl(Identifier="ee4e9b56-d3fb-102b-59b5-294518ea4527")
public static String es_PE_COLUMN_CreateSO_Name="Crear OV";

@XendraColumn(AD_Element_ID="de228ad5-ff69-ae82-bdd8-04611567192a",ColumnName="CreateSO",
AD_Reference_ID=28,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="2719a754-14f5-3677-d9ae-104ad4716245",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="ee4e9b56-d3fb-102b-59b5-294518ea4527",Synchronized="2017-08-05 16:54:22.0")
/** Column name CreateSO */
public static final String COLUMNNAME_CreateSO = "CreateSO";
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

@XendraTrl(Identifier="19010551-04bc-785c-1cf9-12eac7c9be2a")
public static String es_PE_FIELD_RfQ_RfQ_Description="Solicitud de cita";

@XendraTrl(Identifier="19010551-04bc-785c-1cf9-12eac7c9be2a")
public static String es_PE_FIELD_RfQ_RfQ_Help="Solicitud de cita para ser enviada a los proveedores de un RfQ asunto. Despues de seleccionar el proveedor, opcionalmente crea las ordenes de venta ó cotización para el cliente así como la orden de compra para proveedor (s)";

@XendraTrl(Identifier="19010551-04bc-785c-1cf9-12eac7c9be2a")
public static String es_PE_FIELD_RfQ_RfQ_Name="SPC (RfQ)";
@XendraField(AD_Column_ID="C_RfQ_ID",
IsCentrallyMaintained=true,AD_Tab_ID="64e91f91-7cb7-1241-06fa-ba7cc28b4049",AD_FieldGroup_ID="",
IsDisplayed=false,DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=10,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="19010551-04bc-785c-1cf9-12eac7c9be2a")
public static final String FIELDNAME_RfQ_RfQ="19010551-04bc-785c-1cf9-12eac7c9be2a";
/** Column name C_RfQ_ID */
public static final String COLUMNNAME_C_RfQ_ID = "C_RfQ_ID";
/** Set RfQ Topic.
@param C_RfQ_Topic_ID Topic for Request for Quotations */
public void setC_RfQ_Topic_ID (int C_RfQ_Topic_ID)
{
if (C_RfQ_Topic_ID < 1) throw new IllegalArgumentException ("C_RfQ_Topic_ID is mandatory.");
set_Value (COLUMNNAME_C_RfQ_Topic_ID, Integer.valueOf(C_RfQ_Topic_ID));
}
/** Get RfQ Topic.
@return Topic for Request for Quotations */
public int getC_RfQ_Topic_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_RfQ_Topic_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="00cf14ee-4581-107a-0110-1aa1fcef6e66")
public static String es_PE_FIELD_RfQ_RfQTopic_Description="Asunto para la petición de citas";

@XendraTrl(Identifier="00cf14ee-4581-107a-0110-1aa1fcef6e66")
public static String es_PE_FIELD_RfQ_RfQTopic_Help="Un asunto para la petición de citas permite que usted mantenga una lista del suscriptor de vendedores potenciales para responder a RfQs";

@XendraTrl(Identifier="00cf14ee-4581-107a-0110-1aa1fcef6e66")
public static String es_PE_FIELD_RfQ_RfQTopic_Name="Asunto SPC (RfQ)";

@XendraField(AD_Column_ID="C_RfQ_Topic_ID",IsCentrallyMaintained=true,
AD_Tab_ID="64e91f91-7cb7-1241-06fa-ba7cc28b4049",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="00cf14ee-4581-107a-0110-1aa1fcef6e66")
public static final String FIELDNAME_RfQ_RfQTopic="00cf14ee-4581-107a-0110-1aa1fcef6e66";

@XendraTrl(Identifier="729cfb4f-3e9e-895a-998b-723d0b4a1d0e")
public static String es_PE_COLUMN_C_RfQ_Topic_ID_Name="Asunto SPC (RfQ)";

@XendraColumn(AD_Element_ID="30dfa974-9a6d-0184-a80a-3952eb7eb992",ColumnName="C_RfQ_Topic_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="729cfb4f-3e9e-895a-998b-723d0b4a1d0e",
Synchronized="2017-08-05 16:54:22.0")
/** Column name C_RfQ_Topic_ID */
public static final String COLUMNNAME_C_RfQ_Topic_ID = "C_RfQ_Topic_ID";
/** Set Response Date.
@param DateResponse Date of the Response */
public void setDateResponse (Timestamp DateResponse)
{
if (DateResponse == null) throw new IllegalArgumentException ("DateResponse is mandatory.");
set_Value (COLUMNNAME_DateResponse, DateResponse);
}
/** Get Response Date.
@return Date of the Response */
public Timestamp getDateResponse() 
{
return (Timestamp)get_Value(COLUMNNAME_DateResponse);
}

@XendraTrl(Identifier="63051712-2e12-9d7e-0a19-95751d3a076b")
public static String es_PE_FIELD_RfQ_ResponseDate_Description="Fecha de la respuesta";

@XendraTrl(Identifier="63051712-2e12-9d7e-0a19-95751d3a076b")
public static String es_PE_FIELD_RfQ_ResponseDate_Help="Fecha de la respuesta";

@XendraTrl(Identifier="63051712-2e12-9d7e-0a19-95751d3a076b")
public static String es_PE_FIELD_RfQ_ResponseDate_Name="Fecha de Respuesta";

@XendraField(AD_Column_ID="DateResponse",IsCentrallyMaintained=true,
AD_Tab_ID="64e91f91-7cb7-1241-06fa-ba7cc28b4049",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=170,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="63051712-2e12-9d7e-0a19-95751d3a076b")
public static final String FIELDNAME_RfQ_ResponseDate="63051712-2e12-9d7e-0a19-95751d3a076b";

@XendraTrl(Identifier="0b0d9037-73d7-1bdb-e041-99c158607ace")
public static String es_PE_COLUMN_DateResponse_Name="Fecha de Respuesta";

@XendraColumn(AD_Element_ID="d9166ff5-a258-a8dd-e207-99d527a46298",ColumnName="DateResponse",
AD_Reference_ID=15,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0b0d9037-73d7-1bdb-e041-99c158607ace",
Synchronized="2017-08-05 16:54:22.0")
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

@XendraTrl(Identifier="ab5243e7-8f28-da5d-40e8-6192ede24976")
public static String es_PE_FIELD_RfQ_WorkComplete_Description="Fecha cuando es el trabajo (planeado) termina";

@XendraTrl(Identifier="ab5243e7-8f28-da5d-40e8-6192ede24976")
public static String es_PE_FIELD_RfQ_WorkComplete_Name="Trabajo Completo";

@XendraField(AD_Column_ID="DateWorkComplete",IsCentrallyMaintained=true,
AD_Tab_ID="64e91f91-7cb7-1241-06fa-ba7cc28b4049",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=210,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ab5243e7-8f28-da5d-40e8-6192ede24976")
public static final String FIELDNAME_RfQ_WorkComplete="ab5243e7-8f28-da5d-40e8-6192ede24976";

@XendraTrl(Identifier="d412f5da-8fca-d721-48f8-a2cd781bb1ed")
public static String es_PE_COLUMN_DateWorkComplete_Name="Trabajo Completo";

@XendraColumn(AD_Element_ID="079fae2c-844c-a019-755f-7222cea008ac",ColumnName="DateWorkComplete",
AD_Reference_ID=15,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d412f5da-8fca-d721-48f8-a2cd781bb1ed",
Synchronized="2017-08-05 16:54:22.0")
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

@XendraTrl(Identifier="6248d432-f308-2c8d-53ea-39576255cb47")
public static String es_PE_FIELD_RfQ_WorkStart_Description="Fecha cuando el trabajo (planeado para) se comienza.";

@XendraTrl(Identifier="6248d432-f308-2c8d-53ea-39576255cb47")
public static String es_PE_FIELD_RfQ_WorkStart_Name="Inicia el Trabajo";

@XendraField(AD_Column_ID="DateWorkStart",IsCentrallyMaintained=true,
AD_Tab_ID="64e91f91-7cb7-1241-06fa-ba7cc28b4049",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=180,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6248d432-f308-2c8d-53ea-39576255cb47")
public static final String FIELDNAME_RfQ_WorkStart="6248d432-f308-2c8d-53ea-39576255cb47";

@XendraTrl(Identifier="28727d34-0d7b-9527-6779-c481828a52ac")
public static String es_PE_COLUMN_DateWorkStart_Name="Inicia el Trabajo";

@XendraColumn(AD_Element_ID="eacd3b09-4768-e18d-b651-2ec68cc53f56",ColumnName="DateWorkStart",
AD_Reference_ID=15,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="28727d34-0d7b-9527-6779-c481828a52ac",
Synchronized="2017-08-05 16:54:22.0")
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

@XendraTrl(Identifier="6ee59bbb-1d09-c7e1-7164-4b544b6c2596")
public static String es_PE_FIELD_RfQ_DeliveryDays_Description="Numero de dias (planeado) hasta la entega";

@XendraTrl(Identifier="6ee59bbb-1d09-c7e1-7164-4b544b6c2596")
public static String es_PE_FIELD_RfQ_DeliveryDays_Name="Días de Entrega";

@XendraField(AD_Column_ID="DeliveryDays",IsCentrallyMaintained=true,
AD_Tab_ID="64e91f91-7cb7-1241-06fa-ba7cc28b4049",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=200,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6ee59bbb-1d09-c7e1-7164-4b544b6c2596")
public static final String FIELDNAME_RfQ_DeliveryDays="6ee59bbb-1d09-c7e1-7164-4b544b6c2596";

@XendraTrl(Identifier="0cf1c15c-f7a4-97f4-0ce0-de5e145aeb40")
public static String es_PE_COLUMN_DeliveryDays_Name="Días de Entrega";

@XendraColumn(AD_Element_ID="be6b99df-af16-3107-0958-5fe3af220ffc",ColumnName="DeliveryDays",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0cf1c15c-f7a4-97f4-0ce0-de5e145aeb40",
Synchronized="2017-08-05 16:54:22.0")
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

@XendraTrl(Identifier="5655ce58-5c4d-3efa-1f03-1817acea5e59")
public static String es_PE_FIELD_RfQ_Description_Description="Observación";

@XendraTrl(Identifier="5655ce58-5c4d-3efa-1f03-1817acea5e59")
public static String es_PE_FIELD_RfQ_Description_Help="Observación";

@XendraTrl(Identifier="5655ce58-5c4d-3efa-1f03-1817acea5e59")
public static String es_PE_FIELD_RfQ_Description_Name="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="64e91f91-7cb7-1241-06fa-ba7cc28b4049",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5655ce58-5c4d-3efa-1f03-1817acea5e59")
public static final String FIELDNAME_RfQ_Description="5655ce58-5c4d-3efa-1f03-1817acea5e59";

@XendraTrl(Identifier="66fd7c99-d060-4472-ebe8-88ec36040c93")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="66fd7c99-d060-4472-ebe8-88ec36040c93",
Synchronized="2017-08-05 16:54:22.0")
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
/** Get Record ID/ColumnName
@return ID/ColumnName pair
*/public KeyNamePair getKeyNamePair() 
{
return new KeyNamePair(get_ID(), getDocumentNo());
}

@XendraTrl(Identifier="47a8ca5b-3418-967a-4fbd-f9caf6c2ce63")
public static String es_PE_FIELD_RfQ_DocumentNo_Description="Número de secuencia del documento para cada documento";

@XendraTrl(Identifier="47a8ca5b-3418-967a-4fbd-f9caf6c2ce63")
public static String es_PE_FIELD_RfQ_DocumentNo_Help="El número del documento es usualmente generado en automático por el sistema y determinado por el tipo del documento. Si el documento no se salva; el número preliminar se despliega entre \"<>\"";

@XendraTrl(Identifier="47a8ca5b-3418-967a-4fbd-f9caf6c2ce63")
public static String es_PE_FIELD_RfQ_DocumentNo_Name="No. del Documento";

@XendraField(AD_Column_ID="DocumentNo",IsCentrallyMaintained=true,
AD_Tab_ID="64e91f91-7cb7-1241-06fa-ba7cc28b4049",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="47a8ca5b-3418-967a-4fbd-f9caf6c2ce63")
public static final String FIELDNAME_RfQ_DocumentNo="47a8ca5b-3418-967a-4fbd-f9caf6c2ce63";

@XendraTrl(Identifier="fa748097-7c22-8cca-e0e8-f17f50812abb")
public static String es_PE_COLUMN_DocumentNo_Name="No. del Documento";

@XendraColumn(AD_Element_ID="e3ca6e28-702a-2722-d941-b2072a0de9cb",ColumnName="DocumentNo",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=30,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="fa748097-7c22-8cca-e0e8-f17f50812abb",
Synchronized="2017-08-05 16:54:22.0")
/** Column name DocumentNo */
public static final String COLUMNNAME_DocumentNo = "DocumentNo";
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

@XendraTrl(Identifier="1f898309-3745-16b6-6891-ac725360cb2b")
public static String es_PE_FIELD_RfQ_CommentHelp_Description="Ayuda; Comentario o Sugerencia";

@XendraTrl(Identifier="1f898309-3745-16b6-6891-ac725360cb2b")
public static String es_PE_FIELD_RfQ_CommentHelp_Help="El campo ayuda contiene una sugerencia; comentario o ayuda acerca del uso de esta partida";

@XendraTrl(Identifier="1f898309-3745-16b6-6891-ac725360cb2b")
public static String es_PE_FIELD_RfQ_CommentHelp_Name="Ayuda";
@XendraField(AD_Column_ID="Help",
IsCentrallyMaintained=true,AD_Tab_ID="64e91f91-7cb7-1241-06fa-ba7cc28b4049",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=70,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="1f898309-3745-16b6-6891-ac725360cb2b")
public static final String FIELDNAME_RfQ_CommentHelp="1f898309-3745-16b6-6891-ac725360cb2b";

@XendraTrl(Identifier="3c25c166-677f-204d-f395-871c851be31d")
public static String es_PE_COLUMN_Help_Name="Ayuda";

@XendraColumn(AD_Element_ID="a6fda582-56f9-6bb7-8436-285ce4f8de3f",ColumnName="Help",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3c25c166-677f-204d-f395-871c851be31d",
Synchronized="2017-08-05 16:54:22.0")
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
@XendraTrl(Identifier="63bf18e0-1a4e-479a-85d0-1722cebb139d")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="63bf18e0-1a4e-479a-85d0-1722cebb139d",
Synchronized="2017-08-05 16:54:22.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Invited Vendors Only.
@param IsInvitedVendorsOnly Only invited vendors can respond to an RfQ */
public void setIsInvitedVendorsOnly (boolean IsInvitedVendorsOnly)
{
set_Value (COLUMNNAME_IsInvitedVendorsOnly, Boolean.valueOf(IsInvitedVendorsOnly));
}
/** Get Invited Vendors Only.
@return Only invited vendors can respond to an RfQ */
public boolean isInvitedVendorsOnly() 
{
Object oo = get_Value(COLUMNNAME_IsInvitedVendorsOnly);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="edb66207-9be4-e5af-df2f-56f5354a669a")
public static String es_PE_FIELD_RfQ_InvitedVendorsOnly_Description="Sólo proveedores invitados pueden responde a la SPC (RfQ)";

@XendraTrl(Identifier="edb66207-9be4-e5af-df2f-56f5354a669a")
public static String es_PE_FIELD_RfQ_InvitedVendorsOnly_Help="La requisición es visible solo a los proveedores invitados.";

@XendraTrl(Identifier="edb66207-9be4-e5af-df2f-56f5354a669a")
public static String es_PE_FIELD_RfQ_InvitedVendorsOnly_Name="Sólo Proveedores Invitados";

@XendraField(AD_Column_ID="IsInvitedVendorsOnly",IsCentrallyMaintained=true,
AD_Tab_ID="64e91f91-7cb7-1241-06fa-ba7cc28b4049",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=140,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="edb66207-9be4-e5af-df2f-56f5354a669a")
public static final String FIELDNAME_RfQ_InvitedVendorsOnly="edb66207-9be4-e5af-df2f-56f5354a669a";

@XendraTrl(Identifier="dd3cca6b-e4ec-085b-c22a-aa9e0b617547")
public static String es_PE_COLUMN_IsInvitedVendorsOnly_Name="Sólo Proveedores Invitados";

@XendraColumn(AD_Element_ID="170ed220-ebf7-6810-126d-48469e50a5bf",
ColumnName="IsInvitedVendorsOnly",AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="N",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="dd3cca6b-e4ec-085b-c22a-aa9e0b617547",Synchronized="2017-08-05 16:54:22.0")
/** Column name IsInvitedVendorsOnly */
public static final String COLUMNNAME_IsInvitedVendorsOnly = "IsInvitedVendorsOnly";
/** Set Quote All Quantities.
@param IsQuoteAllQty Suppliers are requested to provide responses for all quantities */
public void setIsQuoteAllQty (boolean IsQuoteAllQty)
{
set_Value (COLUMNNAME_IsQuoteAllQty, Boolean.valueOf(IsQuoteAllQty));
}
/** Get Quote All Quantities.
@return Suppliers are requested to provide responses for all quantities */
public boolean isQuoteAllQty() 
{
Object oo = get_Value(COLUMNNAME_IsQuoteAllQty);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="04c2ef45-c52e-b859-2da5-9fbc5149ac0c")
public static String es_PE_FIELD_RfQ_QuoteAllQuantities_Description="Solicitan los surtidores proporcionar las respuestas para todas las cantidades";

@XendraTrl(Identifier="04c2ef45-c52e-b859-2da5-9fbc5149ac0c")
public static String es_PE_FIELD_RfQ_QuoteAllQuantities_Help="Si está seleccionada, la respuesta a la petición para la cita necesita tener un precio para todas las cantidades";

@XendraTrl(Identifier="04c2ef45-c52e-b859-2da5-9fbc5149ac0c")
public static String es_PE_FIELD_RfQ_QuoteAllQuantities_Name="Cotiza todas las Cantidades";

@XendraField(AD_Column_ID="IsQuoteAllQty",IsCentrallyMaintained=true,
AD_Tab_ID="64e91f91-7cb7-1241-06fa-ba7cc28b4049",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@QuoteType@!T",DisplayLength=1,IsReadOnly=false,SeqNo=120,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="04c2ef45-c52e-b859-2da5-9fbc5149ac0c")
public static final String FIELDNAME_RfQ_QuoteAllQuantities="04c2ef45-c52e-b859-2da5-9fbc5149ac0c";

@XendraTrl(Identifier="dfea4071-8fd5-36bb-a4b5-45d7c0b24aa1")
public static String es_PE_COLUMN_IsQuoteAllQty_Name="Cotiza todas las Cantidades";

@XendraColumn(AD_Element_ID="ad954263-b321-7c8e-0dce-c224aa476c3d",ColumnName="IsQuoteAllQty",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="dfea4071-8fd5-36bb-a4b5-45d7c0b24aa1",
Synchronized="2017-08-05 16:54:22.0")
/** Column name IsQuoteAllQty */
public static final String COLUMNNAME_IsQuoteAllQty = "IsQuoteAllQty";
/** Set Quote Total Amt.
@param IsQuoteTotalAmt The respnse can have just the total amount for the RfQ */
public void setIsQuoteTotalAmt (boolean IsQuoteTotalAmt)
{
set_Value (COLUMNNAME_IsQuoteTotalAmt, Boolean.valueOf(IsQuoteTotalAmt));
}
/** Get Quote Total Amt.
@return The respnse can have just the total amount for the RfQ */
public boolean isQuoteTotalAmt() 
{
Object oo = get_Value(COLUMNNAME_IsQuoteTotalAmt);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="bfb4ff15-af42-79c4-f596-abd25b8f2bb6")
public static String es_PE_FIELD_RfQ_QuoteTotalAmt_Description="El resultado puede tener apenas la cantidad total para el RfQ";

@XendraTrl(Identifier="bfb4ff15-af42-79c4-f596-abd25b8f2bb6")
public static String es_PE_FIELD_RfQ_QuoteTotalAmt_Help="Si no se selecciona, el resultado se debe proporcionar por línea.";

@XendraTrl(Identifier="bfb4ff15-af42-79c4-f596-abd25b8f2bb6")
public static String es_PE_FIELD_RfQ_QuoteTotalAmt_Name="Importe total de Cotización";

@XendraField(AD_Column_ID="IsQuoteTotalAmt",IsCentrallyMaintained=true,
AD_Tab_ID="64e91f91-7cb7-1241-06fa-ba7cc28b4049",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@QuoteType@=A",DisplayLength=1,IsReadOnly=false,SeqNo=130,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="bfb4ff15-af42-79c4-f596-abd25b8f2bb6")
public static final String FIELDNAME_RfQ_QuoteTotalAmt="bfb4ff15-af42-79c4-f596-abd25b8f2bb6";

@XendraTrl(Identifier="273da29d-e58e-94a9-a3b5-1cec80dad339")
public static String es_PE_COLUMN_IsQuoteTotalAmt_Name="Importe total de Cotización";

@XendraColumn(AD_Element_ID="f4bfb158-c28d-d449-de0b-bbc36994d64c",ColumnName="IsQuoteTotalAmt",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="273da29d-e58e-94a9-a3b5-1cec80dad339",
Synchronized="2017-08-05 16:54:22.0")
/** Column name IsQuoteTotalAmt */
public static final String COLUMNNAME_IsQuoteTotalAmt = "IsQuoteTotalAmt";
/** Set Responses Accepted.
@param IsRfQResponseAccepted Are Resonses to the Request for Quotation accepted */
public void setIsRfQResponseAccepted (boolean IsRfQResponseAccepted)
{
set_Value (COLUMNNAME_IsRfQResponseAccepted, Boolean.valueOf(IsRfQResponseAccepted));
}
/** Get Responses Accepted.
@return Are Resonses to the Request for Quotation accepted */
public boolean isRfQResponseAccepted() 
{
Object oo = get_Value(COLUMNNAME_IsRfQResponseAccepted);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="25530658-82e0-b421-e544-b7404f6c559c")
public static String es_PE_FIELD_RfQ_ResponsesAccepted_Description="Son respuestas aceptadas para la solicitud de citas.";

@XendraTrl(Identifier="25530658-82e0-b421-e544-b7404f6c559c")
public static String es_PE_FIELD_RfQ_ResponsesAccepted_Help="Si esta seleccionada, respuestas para el RfQ son aceptadas.";

@XendraTrl(Identifier="25530658-82e0-b421-e544-b7404f6c559c")
public static String es_PE_FIELD_RfQ_ResponsesAccepted_Name="Respuestas Aceptadas";

@XendraField(AD_Column_ID="IsRfQResponseAccepted",IsCentrallyMaintained=true,
AD_Tab_ID="64e91f91-7cb7-1241-06fa-ba7cc28b4049",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=160,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="25530658-82e0-b421-e544-b7404f6c559c")
public static final String FIELDNAME_RfQ_ResponsesAccepted="25530658-82e0-b421-e544-b7404f6c559c";

@XendraTrl(Identifier="83811a25-e939-4e46-036c-bd0173a6bd66")
public static String es_PE_COLUMN_IsRfQResponseAccepted_Name="Respuestas Aceptadas";

@XendraColumn(AD_Element_ID="6b78aa26-380c-4337-f2e4-f09764dbc51a",
ColumnName="IsRfQResponseAccepted",AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="Y",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="83811a25-e939-4e46-036c-bd0173a6bd66",Synchronized="2017-08-05 16:54:22.0")
/** Column name IsRfQResponseAccepted */
public static final String COLUMNNAME_IsRfQResponseAccepted = "IsRfQResponseAccepted";
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

@XendraTrl(Identifier="e56c10e3-b336-de07-ad94-001c66fdfd19")
public static String es_PE_FIELD_RfQ_Self_Service_Description="Esta es una entrada del autoservicio ó esta entrada se puede cambiar vía autoservicio";

@XendraTrl(Identifier="e56c10e3-b336-de07-ad94-001c66fdfd19")
public static String es_PE_FIELD_RfQ_Self_Service_Help="El autoservicio permite que los usuarios incorporen datos o que pongan al día sus datos. La bandera indica, que este expediente fue incorporado o creado vía autoservicio o que el usuario puede cambiarlo vía funcionalidad del autoservicio.";

@XendraTrl(Identifier="e56c10e3-b336-de07-ad94-001c66fdfd19")
public static String es_PE_FIELD_RfQ_Self_Service_Name="Auto-Servicio";

@XendraField(AD_Column_ID="IsSelfService",IsCentrallyMaintained=true,
AD_Tab_ID="64e91f91-7cb7-1241-06fa-ba7cc28b4049",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=150,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e56c10e3-b336-de07-ad94-001c66fdfd19")
public static final String FIELDNAME_RfQ_Self_Service="e56c10e3-b336-de07-ad94-001c66fdfd19";

@XendraTrl(Identifier="57574d86-4f9d-2e5a-c198-5afbed7ff28e")
public static String es_PE_COLUMN_IsSelfService_Name="Auto-Servicio";

@XendraColumn(AD_Element_ID="8f201030-f9ab-66d2-f4de-7209f41f2af8",ColumnName="IsSelfService",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="Y",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="57574d86-4f9d-2e5a-c198-5afbed7ff28e",
Synchronized="2017-08-05 16:54:22.0")
/** Column name IsSelfService */
public static final String COLUMNNAME_IsSelfService = "IsSelfService";
/** Set Margin %.
@param Margin Margin for a product as a percentage */
public void setMargin (BigDecimal Margin)
{
set_Value (COLUMNNAME_Margin, Margin);
}
/** Get Margin %.
@return Margin for a product as a percentage */
public BigDecimal getMargin() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Margin);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="17ccc75e-0172-e1c4-24b1-8723d85226a8")
public static String es_PE_FIELD_RfQ_Margin_Description="Margen para un producto como porcentaje";

@XendraTrl(Identifier="17ccc75e-0172-e1c4-24b1-8723d85226a8")
public static String es_PE_FIELD_RfQ_Margin_Help="El Margen indica el margen para este producto como un porcentaje del precio límite y precio de venta";

@XendraTrl(Identifier="17ccc75e-0172-e1c4-24b1-8723d85226a8")
public static String es_PE_FIELD_RfQ_Margin_Name="% de Margen";
@XendraField(AD_Column_ID="Margin",
IsCentrallyMaintained=true,AD_Tab_ID="64e91f91-7cb7-1241-06fa-ba7cc28b4049",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=270,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="17ccc75e-0172-e1c4-24b1-8723d85226a8")
public static final String FIELDNAME_RfQ_Margin="17ccc75e-0172-e1c4-24b1-8723d85226a8";

@XendraTrl(Identifier="135507e9-1ea2-bb5e-369d-2e6e1fd53a22")
public static String es_PE_COLUMN_Margin_Name="% de Margen";

@XendraColumn(AD_Element_ID="14b27ba5-057c-e645-4ad3-0c71d34dc0af",ColumnName="Margin",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="135507e9-1ea2-bb5e-369d-2e6e1fd53a22",
Synchronized="2017-08-05 16:54:22.0")
/** Column name Margin */
public static final String COLUMNNAME_Margin = "Margin";
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
@XendraTrl(Identifier="603631bd-d88e-8cfe-901e-895cab1a9b5c")
public static String es_PE_FIELD_RfQ_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="603631bd-d88e-8cfe-901e-895cab1a9b5c")
public static String es_PE_FIELD_RfQ_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraTrl(Identifier="603631bd-d88e-8cfe-901e-895cab1a9b5c")
public static String es_PE_FIELD_RfQ_Name_Name="Nombre";
@XendraField(AD_Column_ID="Name",
IsCentrallyMaintained=true,AD_Tab_ID="64e91f91-7cb7-1241-06fa-ba7cc28b4049",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=50,SortNo=-1,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="603631bd-d88e-8cfe-901e-895cab1a9b5c")
public static final String FIELDNAME_RfQ_Name="603631bd-d88e-8cfe-901e-895cab1a9b5c";

@XendraTrl(Identifier="f0514d11-238a-2042-7aab-6245a3098f5b")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f0514d11-238a-2042-7aab-6245a3098f5b",
Synchronized="2017-08-05 16:54:22.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
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

@XendraTrl(Identifier="df046dda-7582-e638-04ab-e3e3b5146e8f")
public static String es_PE_FIELD_RfQ_Processed_Description="El documento ha sido procesado";

@XendraTrl(Identifier="df046dda-7582-e638-04ab-e3e3b5146e8f")
public static String es_PE_FIELD_RfQ_Processed_Help="El cuadro de verificación procesada indica que un documento ha sido procesado";

@XendraTrl(Identifier="df046dda-7582-e638-04ab-e3e3b5146e8f")
public static String es_PE_FIELD_RfQ_Processed_Name="Procesado";

@XendraField(AD_Column_ID="Processed",IsCentrallyMaintained=true,
AD_Tab_ID="64e91f91-7cb7-1241-06fa-ba7cc28b4049",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=true,SeqNo=330,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="df046dda-7582-e638-04ab-e3e3b5146e8f")
public static final String FIELDNAME_RfQ_Processed="df046dda-7582-e638-04ab-e3e3b5146e8f";

@XendraTrl(Identifier="5c6d0a11-3e35-bcdd-d8d9-5b3957c8420e")
public static String es_PE_COLUMN_Processed_Name="Procesado";

@XendraColumn(AD_Element_ID="3f7035d2-fa5e-7416-fc0c-e49e43f9e083",ColumnName="Processed",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5c6d0a11-3e35-bcdd-d8d9-5b3957c8420e",
Synchronized="2017-08-05 16:54:22.0")
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

@XendraTrl(Identifier="eac90449-c0b8-d365-88bd-94d95cdf8c29")
public static String es_PE_FIELD_RfQ_ProcessNow_Description="Cierra SPC (RfQ) y respuestas";

@XendraTrl(Identifier="eac90449-c0b8-d365-88bd-94d95cdf8c29")
public static String es_PE_FIELD_RfQ_ProcessNow_Help="Cierra SPC (RfQ) y todas sus respuestas";

@XendraTrl(Identifier="eac90449-c0b8-d365-88bd-94d95cdf8c29")
public static String es_PE_FIELD_RfQ_ProcessNow_Name="Cierra SPC (RfQ)";

@XendraField(AD_Column_ID="Processing",IsCentrallyMaintained=true,
AD_Tab_ID="64e91f91-7cb7-1241-06fa-ba7cc28b4049",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=320,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="eac90449-c0b8-d365-88bd-94d95cdf8c29")
public static final String FIELDNAME_RfQ_ProcessNow="eac90449-c0b8-d365-88bd-94d95cdf8c29";

@XendraTrl(Identifier="d876d91e-812f-6ba1-beaa-6ae0567b5e1f")
public static String es_PE_COLUMN_Processing_Name="Procesar Ahora";

@XendraColumn(AD_Element_ID="f2096404-1a98-35ec-09ea-273b3e19b7de",ColumnName="Processing",
AD_Reference_ID=28,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="f902021a-dd08-ddd5-c8bf-36cdff8d2d15",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="d876d91e-812f-6ba1-beaa-6ae0567b5e1f",Synchronized="2017-08-05 16:54:22.0")
/** Column name Processing */
public static final String COLUMNNAME_Processing = "Processing";
/** Set Publish RfQ.
@param PublishRfQ Publish RfQ */
public void setPublishRfQ (String PublishRfQ)
{
if (PublishRfQ != null && PublishRfQ.length() > 1)
{
log.warning("Length > 1 - truncated");
PublishRfQ = PublishRfQ.substring(0,0);
}
set_Value (COLUMNNAME_PublishRfQ, PublishRfQ);
}
/** Get Publish RfQ.
@return Publish RfQ */
public String getPublishRfQ() 
{
return (String)get_Value(COLUMNNAME_PublishRfQ);
}

@XendraTrl(Identifier="9147d985-7a65-343b-dda8-0e6a2cc17636")
public static String es_PE_FIELD_RfQ_PublishRfQ_Description="Crea SPC (RfQ) e invita a los proveedores";

@XendraTrl(Identifier="9147d985-7a65-343b-dda8-0e6a2cc17636")
public static String es_PE_FIELD_RfQ_PublishRfQ_Help="Cree (faltando) las respuestas de SPC (RfQ) y envíe opcionalmente email Invitación/Remitente a los proveedores  para responder a SPC (RfQ)";

@XendraTrl(Identifier="9147d985-7a65-343b-dda8-0e6a2cc17636")
public static String es_PE_FIELD_RfQ_PublishRfQ_Name="Crea e Invita";

@XendraField(AD_Column_ID="PublishRfQ",IsCentrallyMaintained=true,
AD_Tab_ID="64e91f91-7cb7-1241-06fa-ba7cc28b4049",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=220,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9147d985-7a65-343b-dda8-0e6a2cc17636")
public static final String FIELDNAME_RfQ_PublishRfQ="9147d985-7a65-343b-dda8-0e6a2cc17636";

@XendraTrl(Identifier="f1f67ca8-7af3-b54c-f357-3989975de3f9")
public static String es_PE_COLUMN_PublishRfQ_Name="SPC (RfQ) Publicación";

@XendraColumn(AD_Element_ID="3597496b-abd9-149c-85fc-9cffcb758576",ColumnName="PublishRfQ",
AD_Reference_ID=28,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="50f50ca2-b335-b707-50a3-5c800f332824",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="f1f67ca8-7af3-b54c-f357-3989975de3f9",Synchronized="2017-08-05 16:54:22.0")
/** Column name PublishRfQ */
public static final String COLUMNNAME_PublishRfQ = "PublishRfQ";

/** QuoteType AD_Reference=c8f5b695-5ad9-886d-7e73-6214a0a36469 */
public static final int QUOTETYPE_AD_Reference_ID=314;
/** Set RfQ Type.
@param QuoteType Request for Quotation Type */
public void setQuoteType (String QuoteType)
{
if (QuoteType == null) throw new IllegalArgumentException ("QuoteType is mandatory");
if (QuoteType.equals(REF_C_RfQQuoteType.QuoteTotalOnly) || QuoteType.equals(REF_C_RfQQuoteType.QuoteSelectedLines) || QuoteType.equals(REF_C_RfQQuoteType.QuoteAllLines));
 else throw new IllegalArgumentException ("QuoteType Invalid value - " + QuoteType + " - Reference_ID=314 - T - S - A");
if (QuoteType.length() > 1)
{
log.warning("Length > 1 - truncated");
QuoteType = QuoteType.substring(0,0);
}
set_Value (COLUMNNAME_QuoteType, QuoteType);
}
/** Get RfQ Type.
@return Request for Quotation Type */
public String getQuoteType() 
{
return (String)get_Value(COLUMNNAME_QuoteType);
}

@XendraTrl(Identifier="6304bfe1-e04e-15b1-091c-f5edd6ff85d1")
public static String es_PE_FIELD_RfQ_RfQType_Description="Solicitud para el tipo de cita";

@XendraTrl(Identifier="6304bfe1-e04e-15b1-091c-f5edd6ff85d1")
public static String es_PE_FIELD_RfQ_RfQType_Name="Tipo SPC (RfQ)";

@XendraField(AD_Column_ID="QuoteType",IsCentrallyMaintained=true,
AD_Tab_ID="64e91f91-7cb7-1241-06fa-ba7cc28b4049",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6304bfe1-e04e-15b1-091c-f5edd6ff85d1")
public static final String FIELDNAME_RfQ_RfQType="6304bfe1-e04e-15b1-091c-f5edd6ff85d1";

@XendraTrl(Identifier="89c59473-2583-6d94-5e2a-3742179d66df")
public static String es_PE_COLUMN_QuoteType_Name="Tipo SPC (RfQ)";

@XendraColumn(AD_Element_ID="a8e47475-81c4-200f-ee56-b196a865e051",ColumnName="QuoteType",
AD_Reference_ID=17,AD_Reference_Value_ID="c8f5b695-5ad9-886d-7e73-6214a0a36469",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="S",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="89c59473-2583-6d94-5e2a-3742179d66df",Synchronized="2017-08-05 16:54:22.0")
/** Column name QuoteType */
public static final String COLUMNNAME_QuoteType = "QuoteType";
/** Set Rank RfQ.
@param RankRfQ Rank RfQ */
public void setRankRfQ (String RankRfQ)
{
if (RankRfQ != null && RankRfQ.length() > 1)
{
log.warning("Length > 1 - truncated");
RankRfQ = RankRfQ.substring(0,0);
}
set_Value (COLUMNNAME_RankRfQ, RankRfQ);
}
/** Get Rank RfQ.
@return Rank RfQ */
public String getRankRfQ() 
{
return (String)get_Value(COLUMNNAME_RankRfQ);
}

@XendraTrl(Identifier="cbde751d-9606-c87c-424a-1c48fbc4c5d8")
public static String es_PE_FIELD_RfQ_RankRfQ_Description="Valuación de las respuestas a la SPC (RfQ) completas";

@XendraTrl(Identifier="cbde751d-9606-c87c-424a-1c48fbc4c5d8")
public static String es_PE_FIELD_RfQ_RankRfQ_Help="Las respuestas invalidas estan valuadas por 999 en la Cantidad.  Las respuestas de la cantidad estan valuadas entre sí y la mejor respuesta a la SPC (RfQ) es actualizada. Las líneas de respuesta son marcadas como ganador seleccionado, donde esta seleccionada la cantidad de compra.Entonces las valuaciones de todas las respuestas de cantidad se adicionan a la valuación total de la respuesta .  La respuesta con el valor total más bajo se marca como ganador seleccioado.";

@XendraTrl(Identifier="cbde751d-9606-c87c-424a-1c48fbc4c5d8")
public static String es_PE_FIELD_RfQ_RankRfQ_Name="Valuación de Respuestas ";

@XendraField(AD_Column_ID="RankRfQ",IsCentrallyMaintained=true,
AD_Tab_ID="64e91f91-7cb7-1241-06fa-ba7cc28b4049",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=230,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="cbde751d-9606-c87c-424a-1c48fbc4c5d8")
public static final String FIELDNAME_RfQ_RankRfQ="cbde751d-9606-c87c-424a-1c48fbc4c5d8";

@XendraTrl(Identifier="4ce0bea5-3726-57e8-a1c0-d6c969ae7f9a")
public static String es_PE_COLUMN_RankRfQ_Name="Línea SPC (RfQ)";

@XendraColumn(AD_Element_ID="f007e7cf-88c8-4490-b6bb-d7139d169a80",ColumnName="RankRfQ",
AD_Reference_ID=28,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="44b2358c-930f-fdb8-389e-2fe05b72447d",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="4ce0bea5-3726-57e8-a1c0-d6c969ae7f9a",Synchronized="2017-08-05 16:54:22.0")
/** Column name RankRfQ */
public static final String COLUMNNAME_RankRfQ = "RankRfQ";

/** SalesRep_ID AD_Reference=15251147-a1b6-4a83-a3a5-2d3ae7db69d9 */
public static final int SALESREP_ID_AD_Reference_ID=190;
/** Set Sales Representative.
@param SalesRep_ID Sales Representative or Company Agent */
public void setSalesRep_ID (int SalesRep_ID)
{
if (SalesRep_ID < 1) throw new IllegalArgumentException ("SalesRep_ID is mandatory.");
set_Value (COLUMNNAME_SalesRep_ID, Integer.valueOf(SalesRep_ID));
}
/** Get Sales Representative.
@return Sales Representative or Company Agent */
public int getSalesRep_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_SalesRep_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="5ec0b5f7-6d85-f0ca-302c-449f82e9bb3b")
public static String es_PE_FIELD_RfQ_SalesRepresentative_Description="Representante de Ventas";

@XendraTrl(Identifier="5ec0b5f7-6d85-f0ca-302c-449f82e9bb3b")
public static String es_PE_FIELD_RfQ_SalesRepresentative_Help="El representante de ventas indica el representante de ventas para esta región.";

@XendraTrl(Identifier="5ec0b5f7-6d85-f0ca-302c-449f82e9bb3b")
public static String es_PE_FIELD_RfQ_SalesRepresentative_Name="Agente Cía";

@XendraField(AD_Column_ID="SalesRep_ID",IsCentrallyMaintained=true,
AD_Tab_ID="64e91f91-7cb7-1241-06fa-ba7cc28b4049",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5ec0b5f7-6d85-f0ca-302c-449f82e9bb3b")
public static final String FIELDNAME_RfQ_SalesRepresentative="5ec0b5f7-6d85-f0ca-302c-449f82e9bb3b";

@XendraTrl(Identifier="b31daa7a-bcac-e749-2c3d-53ee6ec3b7df")
public static String es_PE_COLUMN_SalesRep_ID_Name="Agente Cía";

@XendraColumn(AD_Element_ID="197a9c3a-ff10-c291-d65f-5e05a36d3710",ColumnName="SalesRep_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="15251147-a1b6-4a83-a3a5-2d3ae7db69d9",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="b31daa7a-bcac-e749-2c3d-53ee6ec3b7df",Synchronized="2017-08-05 16:54:22.0")
/** Column name SalesRep_ID */
public static final String COLUMNNAME_SalesRep_ID = "SalesRep_ID";
}
