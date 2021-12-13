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
/** Generated Model for C_RfQ_TopicSubscriber
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_C_RfQ_TopicSubscriber extends PO
{
/** Standard Constructor
@param ctx context
@param C_RfQ_TopicSubscriber_ID id
@param trxName transaction
*/
public X_C_RfQ_TopicSubscriber (Properties ctx, int C_RfQ_TopicSubscriber_ID, String trxName)
{
super (ctx, C_RfQ_TopicSubscriber_ID, trxName);
/** if (C_RfQ_TopicSubscriber_ID == 0)
{
setC_BPartner_ID (0);
setC_BPartner_Location_ID (0);
setC_RfQ_Topic_ID (0);
setC_RfQ_TopicSubscriber_ID (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_C_RfQ_TopicSubscriber (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=670 */
public static int Table_ID=MTable.getTable_ID("C_RfQ_TopicSubscriber");

@XendraTrl(Identifier="852893f9-8eff-8fef-fb05-0ae7614924c3")
public static String es_PE_TAB_Subscriber_Description="Solicitud para el asunto de la cita del suscriptor";

@XendraTrl(Identifier="852893f9-8eff-8fef-fb05-0ae7614924c3")
public static String es_PE_TAB_Subscriber_Help="Suscribir para invitar a responder a RfQs";

@XendraTrl(Identifier="852893f9-8eff-8fef-fb05-0ae7614924c3")
public static String es_PE_TAB_Subscriber_Name="Suscriptor";
@XendraTab(Name="Subscriber",
Description="Request for Quotation Topic Subscriber",Help="Subcriber to invite to respond to RfQs",
AD_Window_ID="84f4c768-9e31-b7c2-85a4-97fc1fd84d22",SeqNo=20,TabLevel=1,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="852893f9-8eff-8fef-fb05-0ae7614924c3",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Subscriber="852893f9-8eff-8fef-fb05-0ae7614924c3";

@XendraTrl(Identifier="061d6fd6-6e14-2e05-2951-23408ab87068")
public static String es_PE_TABLE_C_RfQ_TopicSubscriber_Name="Subscriptor SPC (RfQ)";

@XendraTable(Name="RfQ Subscriber",AD_Package_ID="98af94a4-a4cd-bdc0-5651-5880caf79899",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",
Description="Request for Quotation Topic Subscriber",Help="",TableName="C_RfQ_TopicSubscriber",
AccessLevel="3",AD_Window_ID="84f4c768-9e31-b7c2-85a4-97fc1fd84d22",AD_Val_Rule_ID="",IsKey=1,
LoadSeq=140,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,
IsView=false,PO_Window_ID="",ID="org.xendra.commercial",
Identifier="061d6fd6-6e14-2e05-2951-23408ab87068",Synchronized="2020-03-03 21:37:40.0")
/** TableName=C_RfQ_TopicSubscriber */
public static final String Table_Name="C_RfQ_TopicSubscriber";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"C_RfQ_TopicSubscriber");

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
    Table_ID = MTable.getTable_ID("C_RfQ_TopicSubscriber");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_C_RfQ_TopicSubscriber[").append(get_ID()).append("]");
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

@XendraTrl(Identifier="b29ce4ee-5b7f-142e-b68f-fede0b5afbac")
public static String es_PE_FIELD_Subscriber_UserContact_Name="Usuario";

@XendraTrl(Identifier="b29ce4ee-5b7f-142e-b68f-fede0b5afbac")
public static String es_PE_FIELD_Subscriber_UserContact_Description="ID de Usuario dentro del sistema";

@XendraTrl(Identifier="b29ce4ee-5b7f-142e-b68f-fede0b5afbac")
public static String es_PE_FIELD_Subscriber_UserContact_Help="La ID de usuario identifica un usuario único en el sistema";

@XendraField(AD_Column_ID="AD_User_ID",IsCentrallyMaintained=true,
AD_Tab_ID="852893f9-8eff-8fef-fb05-0ae7614924c3",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b29ce4ee-5b7f-142e-b68f-fede0b5afbac")
public static final String FIELDNAME_Subscriber_UserContact="b29ce4ee-5b7f-142e-b68f-fede0b5afbac";

@XendraTrl(Identifier="aa5c64e3-5448-8400-3cda-b383833dfaa2")
public static String es_PE_COLUMN_AD_User_ID_Name="Usuario";

@XendraColumn(AD_Element_ID="abdf8dee-d3cd-73ec-c758-683e907797f4",ColumnName="AD_User_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="f4ac36a1-4200-1386-677e-14ac90afb4fe",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="aa5c64e3-5448-8400-3cda-b383833dfaa2",Synchronized="2019-08-30 22:22:16.0")
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

@XendraTrl(Identifier="a6beb9e9-07de-9135-84ed-77cdbffb5cdb")
public static String es_PE_FIELD_Subscriber_BusinessPartner_Name="Socio de Negocio";

@XendraTrl(Identifier="a6beb9e9-07de-9135-84ed-77cdbffb5cdb")
public static String es_PE_FIELD_Subscriber_BusinessPartner_Description="Identifica un Socio de Negocio";

@XendraTrl(Identifier="a6beb9e9-07de-9135-84ed-77cdbffb5cdb")
public static String es_PE_FIELD_Subscriber_BusinessPartner_Help="Un socio de negocio es cualquiera con quien usted realiza transacciones. Este puede incluir Proveedores; Clientes; Empleados ó Vendedores.";

@XendraField(AD_Column_ID="C_BPartner_ID",IsCentrallyMaintained=true,
AD_Tab_ID="852893f9-8eff-8fef-fb05-0ae7614924c3",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=50,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a6beb9e9-07de-9135-84ed-77cdbffb5cdb")
public static final String FIELDNAME_Subscriber_BusinessPartner="a6beb9e9-07de-9135-84ed-77cdbffb5cdb";

@XendraTrl(Identifier="092bbe35-3ffc-0b21-01cc-3bdbc58fd1c6")
public static String es_PE_COLUMN_C_BPartner_ID_Name="Socio de Negocio";

@XendraColumn(AD_Element_ID="fe333dc3-4f40-1276-5f6a-d09bb66dc423",ColumnName="C_BPartner_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="06fdbbe9-e1c4-3ee4-4a9d-73d1a990cc42",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=true,SeqNo=2,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="092bbe35-3ffc-0b21-01cc-3bdbc58fd1c6",Synchronized="2019-08-30 22:22:16.0")
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

@XendraTrl(Identifier="66429b43-aa90-5a0c-3cee-69841d14d29b")
public static String es_PE_FIELD_Subscriber_PartnerLocation_Name="Dirección del Socio del Negocio";

@XendraTrl(Identifier="66429b43-aa90-5a0c-3cee-69841d14d29b")
public static String es_PE_FIELD_Subscriber_PartnerLocation_Description="Identifica la dirección para este socio de negocio";

@XendraTrl(Identifier="66429b43-aa90-5a0c-3cee-69841d14d29b")
public static String es_PE_FIELD_Subscriber_PartnerLocation_Help="La dirección de un socio indica la ubicación de un socio de negocio";

@XendraField(AD_Column_ID="C_BPartner_Location_ID",IsCentrallyMaintained=true,
AD_Tab_ID="852893f9-8eff-8fef-fb05-0ae7614924c3",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="66429b43-aa90-5a0c-3cee-69841d14d29b")
public static final String FIELDNAME_Subscriber_PartnerLocation="66429b43-aa90-5a0c-3cee-69841d14d29b";

@XendraTrl(Identifier="59ae8b8f-82f3-0a05-dae1-7a7263cb29e6")
public static String es_PE_COLUMN_C_BPartner_Location_ID_Name="Dirección del Socio del Negocio";

@XendraColumn(AD_Element_ID="0dab7dc6-2832-26dc-2462-cba2d40235f2",
ColumnName="C_BPartner_Location_ID",AD_Reference_ID=19,AD_Reference_Value_ID="",
AD_Val_Rule_ID="623d98c0-19fc-56a2-f511-8992974d3c05",FieldLength=22,DefaultValue="",IsKey=false,
IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="59ae8b8f-82f3-0a05-dae1-7a7263cb29e6",
Synchronized="2019-08-30 22:22:16.0")
/** Column name C_BPartner_Location_ID */
public static final String COLUMNNAME_C_BPartner_Location_ID = "C_BPartner_Location_ID";
/** Set RfQ Topic.
@param C_RfQ_Topic_ID Topic for Request for Quotations */
public void setC_RfQ_Topic_ID (int C_RfQ_Topic_ID)
{
if (C_RfQ_Topic_ID < 1) throw new IllegalArgumentException ("C_RfQ_Topic_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_RfQ_Topic_ID, Integer.valueOf(C_RfQ_Topic_ID));
}
/** Get RfQ Topic.
@return Topic for Request for Quotations */
public int getC_RfQ_Topic_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_RfQ_Topic_ID);
if (ii == null) return 0;
return ii.intValue();
}
/** Get Record ID/ColumnName
@return ID/ColumnName pair
*/public KeyNamePair getKeyNamePair() 
{
return new KeyNamePair(get_ID(), String.valueOf(getC_RfQ_Topic_ID()));
}

@XendraTrl(Identifier="019d9baa-1cf8-8678-427f-ed4c1dad7f19")
public static String es_PE_FIELD_Subscriber_RfQTopic_Name="Asunto de Solicitudes de Cotización";

@XendraTrl(Identifier="019d9baa-1cf8-8678-427f-ed4c1dad7f19")
public static String es_PE_FIELD_Subscriber_RfQTopic_Description="Asunto para la petición de citas";

@XendraTrl(Identifier="019d9baa-1cf8-8678-427f-ed4c1dad7f19")
public static String es_PE_FIELD_Subscriber_RfQTopic_Help="Un asunto para la petición de citas permite que usted mantenga una lista del suscriptor de vendedores potenciales para responder a RfQs";

@XendraField(AD_Column_ID="C_RfQ_Topic_ID",IsCentrallyMaintained=true,
AD_Tab_ID="852893f9-8eff-8fef-fb05-0ae7614924c3",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="019d9baa-1cf8-8678-427f-ed4c1dad7f19")
public static final String FIELDNAME_Subscriber_RfQTopic="019d9baa-1cf8-8678-427f-ed4c1dad7f19";

@XendraTrl(Identifier="cdd74cfd-c1e2-0f16-ae36-88582bd316a2")
public static String es_PE_COLUMN_C_RfQ_Topic_ID_Name="Asunto SPC (RfQ)";

@XendraColumn(AD_Element_ID="30dfa974-9a6d-0184-a80a-3952eb7eb992",ColumnName="C_RfQ_Topic_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="cdd74cfd-c1e2-0f16-ae36-88582bd316a2",
Synchronized="2019-08-30 22:22:16.0")
/** Column name C_RfQ_Topic_ID */
public static final String COLUMNNAME_C_RfQ_Topic_ID = "C_RfQ_Topic_ID";
/** Set RfQ Subscriber.
@param C_RfQ_TopicSubscriber_ID Request for Quotation Topic Subscriber */
public void setC_RfQ_TopicSubscriber_ID (int C_RfQ_TopicSubscriber_ID)
{
if (C_RfQ_TopicSubscriber_ID < 1) throw new IllegalArgumentException ("C_RfQ_TopicSubscriber_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_RfQ_TopicSubscriber_ID, Integer.valueOf(C_RfQ_TopicSubscriber_ID));
}
/** Get RfQ Subscriber.
@return Request for Quotation Topic Subscriber */
public int getC_RfQ_TopicSubscriber_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_RfQ_TopicSubscriber_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="1a3404fb-0c44-8d63-d94c-0f81a08ec768")
public static String es_PE_FIELD_Subscriber_RfQSubscriber_Name="Subscriptor SPC (RfQ)";

@XendraTrl(Identifier="1a3404fb-0c44-8d63-d94c-0f81a08ec768")
public static String es_PE_FIELD_Subscriber_RfQSubscriber_Description="Solicitud para la cita de tipo de subscripción.";

@XendraTrl(Identifier="1a3404fb-0c44-8d63-d94c-0f81a08ec768")
public static String es_PE_FIELD_Subscriber_RfQSubscriber_Help="Subscriptor para invitar responder a RfQs.";

@XendraField(AD_Column_ID="C_RfQ_TopicSubscriber_ID",IsCentrallyMaintained=true,
AD_Tab_ID="852893f9-8eff-8fef-fb05-0ae7614924c3",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=10,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1a3404fb-0c44-8d63-d94c-0f81a08ec768")
public static final String FIELDNAME_Subscriber_RfQSubscriber="1a3404fb-0c44-8d63-d94c-0f81a08ec768";
/** Column name C_RfQ_TopicSubscriber_ID */
public static final String COLUMNNAME_C_RfQ_TopicSubscriber_ID = "C_RfQ_TopicSubscriber_ID";
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
@XendraTrl(Identifier="5558910d-1ddb-4660-afe5-3ac3f41532a5")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5558910d-1ddb-4660-afe5-3ac3f41532a5",
Synchronized="2019-08-30 22:22:16.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Opt-out Date.
@param OptOutDate Date the contact opted out */
public void setOptOutDate (Timestamp OptOutDate)
{
set_Value (COLUMNNAME_OptOutDate, OptOutDate);
}
/** Get Opt-out Date.
@return Date the contact opted out */
public Timestamp getOptOutDate() 
{
return (Timestamp)get_Value(COLUMNNAME_OptOutDate);
}

@XendraTrl(Identifier="60eeea39-2ba3-2c29-387b-f0a276f27492")
public static String es_PE_FIELD_Subscriber_Opt_OutDate_Name="Fecha de Baja";

@XendraTrl(Identifier="60eeea39-2ba3-2c29-387b-f0a276f27492")
public static String es_PE_FIELD_Subscriber_Opt_OutDate_Description="Fecha en que el contacto se dio de baja";

@XendraTrl(Identifier="60eeea39-2ba3-2c29-387b-f0a276f27492")
public static String es_PE_FIELD_Subscriber_Opt_OutDate_Help="Si el campo tiene una fecha; el cliente ha decidido cancelar su suscripción y no puede recibir correo sobre el área de interés.";

@XendraField(AD_Column_ID="OptOutDate",IsCentrallyMaintained=true,
AD_Tab_ID="852893f9-8eff-8fef-fb05-0ae7614924c3",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=100,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="60eeea39-2ba3-2c29-387b-f0a276f27492")
public static final String FIELDNAME_Subscriber_Opt_OutDate="60eeea39-2ba3-2c29-387b-f0a276f27492";

@XendraTrl(Identifier="9f87b4dc-29b0-6831-f35d-5c5dbef6a809")
public static String es_PE_COLUMN_OptOutDate_Name="Fecha de Baja";

@XendraColumn(AD_Element_ID="e4c11893-5217-7a6d-9a7a-e6a6c0401fd9",ColumnName="OptOutDate",
AD_Reference_ID=15,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9f87b4dc-29b0-6831-f35d-5c5dbef6a809",
Synchronized="2019-08-30 22:22:16.0")
/** Column name OptOutDate */
public static final String COLUMNNAME_OptOutDate = "OptOutDate";
/** Set Subscribe Date.
@param SubscribeDate Date the contact actively subscribed */
public void setSubscribeDate (Timestamp SubscribeDate)
{
set_Value (COLUMNNAME_SubscribeDate, SubscribeDate);
}
/** Get Subscribe Date.
@return Date the contact actively subscribed */
public Timestamp getSubscribeDate() 
{
return (Timestamp)get_Value(COLUMNNAME_SubscribeDate);
}

@XendraTrl(Identifier="fa6cb99d-af89-00f0-810d-2220367b706e")
public static String es_PE_FIELD_Subscriber_SubscribeDate_Name="Fecha de Alta";

@XendraTrl(Identifier="fa6cb99d-af89-00f0-810d-2220367b706e")
public static String es_PE_FIELD_Subscriber_SubscribeDate_Description="Fecha en la que el contacto se suscribió";

@XendraTrl(Identifier="fa6cb99d-af89-00f0-810d-2220367b706e")
public static String es_PE_FIELD_Subscriber_SubscribeDate_Help="Fecha en la que el contacto se suscribió a un área de interés";

@XendraField(AD_Column_ID="SubscribeDate",IsCentrallyMaintained=true,
AD_Tab_ID="852893f9-8eff-8fef-fb05-0ae7614924c3",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="fa6cb99d-af89-00f0-810d-2220367b706e")
public static final String FIELDNAME_Subscriber_SubscribeDate="fa6cb99d-af89-00f0-810d-2220367b706e";

@XendraTrl(Identifier="0e0de5e9-795b-e2d2-8d01-dba7ab664873")
public static String es_PE_COLUMN_SubscribeDate_Name="Fecha de Alta";

@XendraColumn(AD_Element_ID="5dd4bc63-aa12-af97-0dd4-dcf0c73d0cc8",ColumnName="SubscribeDate",
AD_Reference_ID=15,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0e0de5e9-795b-e2d2-8d01-dba7ab664873",
Synchronized="2019-08-30 22:22:16.0")
/** Column name SubscribeDate */
public static final String COLUMNNAME_SubscribeDate = "SubscribeDate";
}
