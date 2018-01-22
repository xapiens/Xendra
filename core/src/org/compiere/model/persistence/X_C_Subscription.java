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
/** Generated Model for C_Subscription
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_C_Subscription extends PO
{
/** Standard Constructor
@param ctx context
@param C_Subscription_ID id
@param trxName transaction
*/
public X_C_Subscription (Properties ctx, int C_Subscription_ID, String trxName)
{
super (ctx, C_Subscription_ID, trxName);
/** if (C_Subscription_ID == 0)
{
setC_BPartner_ID (0);
setC_Subscription_ID (0);
setC_SubscriptionType_ID (0);
setIsDue (false);	
// N
setM_Product_ID (0);
setName (null);
setRenewalDate (new Timestamp(System.currentTimeMillis()));
setStartDate (new Timestamp(System.currentTimeMillis()));
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_C_Subscription (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=669 */
public static int Table_ID=MTable.getTable_ID("C_Subscription");

@XendraTrl(Identifier="efe09e31-93db-dbb0-2820-8cc5e39e63c2")
public static String es_PE_TAB_Subscription_Description="suscripción de un socio de negocio de un producto a renovar.";

@XendraTrl(Identifier="efe09e31-93db-dbb0-2820-8cc5e39e63c2")
public static String es_PE_TAB_Subscription_Name="Suscripción";
@XendraTab(Name="Subscription",
Description="Subscription of a Business Partner of a Product to renew",Help="",
AD_Window_ID="373de6ec-d5d0-3388-abbd-f4ba4739d419",SeqNo=10,TabLevel=0,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="efe09e31-93db-dbb0-2820-8cc5e39e63c2",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Subscription="efe09e31-93db-dbb0-2820-8cc5e39e63c2";

@XendraTrl(Identifier="1eb34e33-8c7f-0317-2c47-fb65af886e2e")
public static String es_PE_TABLE_C_Subscription_Name="Suscripción";

@XendraTable(Name="Subscription",
Description="Subscription of a Business Partner of a Product to renew",Help="",
TableName="C_Subscription",AccessLevel="3",AD_Window_ID="373de6ec-d5d0-3388-abbd-f4ba4739d419",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=140,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.commercial",
Identifier="1eb34e33-8c7f-0317-2c47-fb65af886e2e",Synchronized="2017-08-16 11:42:30.0")
/** TableName=C_Subscription */
public static final String Table_Name="C_Subscription";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"C_Subscription");

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
    Table_ID = MTable.getTable_ID("C_Subscription");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_C_Subscription[").append(get_ID()).append("]");
return sb.toString();
}
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

@XendraTrl(Identifier="2a10dc0e-3c63-26cd-b5de-85e9947c439e")
public static String es_PE_FIELD_Subscription_BusinessPartner_Description="Identifica un Socio de Negocio";

@XendraTrl(Identifier="2a10dc0e-3c63-26cd-b5de-85e9947c439e")
public static String es_PE_FIELD_Subscription_BusinessPartner_Help="Un socio de negocio es cualquiera con quien usted realiza transacciones. Este puede incluir Proveedores; Clientes; Empleados ó Vendedores.";

@XendraTrl(Identifier="2a10dc0e-3c63-26cd-b5de-85e9947c439e")
public static String es_PE_FIELD_Subscription_BusinessPartner_Name="Socio de Negocio";

@XendraField(AD_Column_ID="C_BPartner_ID",IsCentrallyMaintained=true,
AD_Tab_ID="efe09e31-93db-dbb0-2820-8cc5e39e63c2",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2a10dc0e-3c63-26cd-b5de-85e9947c439e")
public static final String FIELDNAME_Subscription_BusinessPartner="2a10dc0e-3c63-26cd-b5de-85e9947c439e";

@XendraTrl(Identifier="b4eaf3f2-beb6-5206-5467-686e1ac044a5")
public static String es_PE_COLUMN_C_BPartner_ID_Name="Socio de Negocio";

@XendraColumn(AD_Element_ID="fe333dc3-4f40-1276-5f6a-d09bb66dc423",ColumnName="C_BPartner_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="06fdbbe9-e1c4-3ee4-4a9d-73d1a990cc42",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="b4eaf3f2-beb6-5206-5467-686e1ac044a5",Synchronized="2017-08-05 16:54:27.0")
/** Column name C_BPartner_ID */
public static final String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";
/** Set Subscription.
@param C_Subscription_ID Subscription of a Business Partner of a Product to renew */
public void setC_Subscription_ID (int C_Subscription_ID)
{
if (C_Subscription_ID < 1) throw new IllegalArgumentException ("C_Subscription_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_Subscription_ID, Integer.valueOf(C_Subscription_ID));
}
/** Get Subscription.
@return Subscription of a Business Partner of a Product to renew */
public int getC_Subscription_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Subscription_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="8354f23b-9b69-a332-fd35-bbdb12135efa")
public static String es_PE_FIELD_Subscription_Subscription_Description="Suscripción del socio de negocio para renovar producto.";

@XendraTrl(Identifier="8354f23b-9b69-a332-fd35-bbdb12135efa")
public static String es_PE_FIELD_Subscription_Subscription_Help="Suscripción del socio de negocio para renovar producto.";

@XendraTrl(Identifier="8354f23b-9b69-a332-fd35-bbdb12135efa")
public static String es_PE_FIELD_Subscription_Subscription_Name="Suscripción";

@XendraField(AD_Column_ID="C_Subscription_ID",IsCentrallyMaintained=true,
AD_Tab_ID="efe09e31-93db-dbb0-2820-8cc5e39e63c2",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=10,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8354f23b-9b69-a332-fd35-bbdb12135efa")
public static final String FIELDNAME_Subscription_Subscription="8354f23b-9b69-a332-fd35-bbdb12135efa";
/** Column name C_Subscription_ID */
public static final String COLUMNNAME_C_Subscription_ID = "C_Subscription_ID";
/** Set Subscription Type.
@param C_SubscriptionType_ID Type of subscription */
public void setC_SubscriptionType_ID (int C_SubscriptionType_ID)
{
if (C_SubscriptionType_ID < 1) throw new IllegalArgumentException ("C_SubscriptionType_ID is mandatory.");
set_Value (COLUMNNAME_C_SubscriptionType_ID, Integer.valueOf(C_SubscriptionType_ID));
}
/** Get Subscription Type.
@return Type of subscription */
public int getC_SubscriptionType_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_SubscriptionType_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="1ceceb26-0a04-a841-b3c0-8c4af0794d23")
public static String es_PE_FIELD_Subscription_SubscriptionType_Description="Tipo de suscripción ";

@XendraTrl(Identifier="1ceceb26-0a04-a841-b3c0-8c4af0794d23")
public static String es_PE_FIELD_Subscription_SubscriptionType_Help="Tipo de suscripción y frecuencia de la renovación.";

@XendraTrl(Identifier="1ceceb26-0a04-a841-b3c0-8c4af0794d23")
public static String es_PE_FIELD_Subscription_SubscriptionType_Name="Tipo de suscripción ";

@XendraField(AD_Column_ID="C_SubscriptionType_ID",IsCentrallyMaintained=true,
AD_Tab_ID="efe09e31-93db-dbb0-2820-8cc5e39e63c2",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1ceceb26-0a04-a841-b3c0-8c4af0794d23")
public static final String FIELDNAME_Subscription_SubscriptionType="1ceceb26-0a04-a841-b3c0-8c4af0794d23";

@XendraTrl(Identifier="c46d5f4e-cd9b-ecff-2a03-ad5397382cd7")
public static String es_PE_COLUMN_C_SubscriptionType_ID_Name="Tipo de suscripción ";

@XendraColumn(AD_Element_ID="680dfbf9-387a-19a6-3b56-a8ab812c2801",
ColumnName="C_SubscriptionType_ID",AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="c46d5f4e-cd9b-ecff-2a03-ad5397382cd7",Synchronized="2017-08-05 16:54:27.0")
/** Column name C_SubscriptionType_ID */
public static final String COLUMNNAME_C_SubscriptionType_ID = "C_SubscriptionType_ID";
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
@XendraTrl(Identifier="43db28aa-5939-4f6f-bccf-21d808ba2305")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="43db28aa-5939-4f6f-bccf-21d808ba2305",
Synchronized="2017-08-05 16:54:27.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Due.
@param IsDue Subscription Renewal is Due */
public void setIsDue (boolean IsDue)
{
set_Value (COLUMNNAME_IsDue, Boolean.valueOf(IsDue));
}
/** Get Due.
@return Subscription Renewal is Due */
public boolean isDue() 
{
Object oo = get_Value(COLUMNNAME_IsDue);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="afb323b0-a3e3-83cd-668d-c82455b1d402")
public static String es_PE_FIELD_Subscription_Due_Description="La renovación de la suscripción es vencida";

@XendraTrl(Identifier="afb323b0-a3e3-83cd-668d-c82455b1d402")
public static String es_PE_FIELD_Subscription_Due_Name="Vencido";
@XendraField(AD_Column_ID="IsDue",
IsCentrallyMaintained=true,AD_Tab_ID="efe09e31-93db-dbb0-2820-8cc5e39e63c2",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=120,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="afb323b0-a3e3-83cd-668d-c82455b1d402")
public static final String FIELDNAME_Subscription_Due="afb323b0-a3e3-83cd-668d-c82455b1d402";

@XendraTrl(Identifier="4b6e46cb-5d20-1de0-b823-c4e91d6d8457")
public static String es_PE_COLUMN_IsDue_Name="Vencido";

@XendraColumn(AD_Element_ID="daae261a-51af-395a-2778-14a38b38a13c",ColumnName="IsDue",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="4b6e46cb-5d20-1de0-b823-c4e91d6d8457",
Synchronized="2017-08-05 16:54:27.0")
/** Column name IsDue */
public static final String COLUMNNAME_IsDue = "IsDue";
/** Set Product.
@param M_Product_ID Product, Service, Item */
public void setM_Product_ID (int M_Product_ID)
{
if (M_Product_ID < 1) throw new IllegalArgumentException ("M_Product_ID is mandatory.");
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

@XendraTrl(Identifier="31d794f1-4b64-633b-36b2-304bc4bbb52c")
public static String es_PE_FIELD_Subscription_Product_Description="Producto; servicio ó artículo.";

@XendraTrl(Identifier="31d794f1-4b64-633b-36b2-304bc4bbb52c")
public static String es_PE_FIELD_Subscription_Product_Help="Identifica un artículo que puede ser comprado ó vendido es esta organización.";

@XendraTrl(Identifier="31d794f1-4b64-633b-36b2-304bc4bbb52c")
public static String es_PE_FIELD_Subscription_Product_Name="Producto";

@XendraField(AD_Column_ID="M_Product_ID",IsCentrallyMaintained=true,
AD_Tab_ID="efe09e31-93db-dbb0-2820-8cc5e39e63c2",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="31d794f1-4b64-633b-36b2-304bc4bbb52c")
public static final String FIELDNAME_Subscription_Product="31d794f1-4b64-633b-36b2-304bc4bbb52c";

@XendraTrl(Identifier="bc901bb5-8a6e-051c-45b2-d9a503e05483")
public static String es_PE_COLUMN_M_Product_ID_Name="Producto";

@XendraColumn(AD_Element_ID="b4701f57-f2fc-567c-58e2-a6aefbc3932c",ColumnName="M_Product_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="4281f8eb-238e-6b28-eb66-8cc866e6312c",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="bc901bb5-8a6e-051c-45b2-d9a503e05483",Synchronized="2017-08-05 16:54:27.0")
/** Column name M_Product_ID */
public static final String COLUMNNAME_M_Product_ID = "M_Product_ID";
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

@XendraTrl(Identifier="ca63944d-1156-4f57-1558-dc3e0506dbc2")
public static String es_PE_FIELD_Subscription_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="ca63944d-1156-4f57-1558-dc3e0506dbc2")
public static String es_PE_FIELD_Subscription_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraTrl(Identifier="ca63944d-1156-4f57-1558-dc3e0506dbc2")
public static String es_PE_FIELD_Subscription_Name_Name="Nombre";
@XendraField(AD_Column_ID="Name",
IsCentrallyMaintained=true,AD_Tab_ID="efe09e31-93db-dbb0-2820-8cc5e39e63c2",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=40,SortNo=1,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="ca63944d-1156-4f57-1558-dc3e0506dbc2")
public static final String FIELDNAME_Subscription_Name="ca63944d-1156-4f57-1558-dc3e0506dbc2";

@XendraTrl(Identifier="b08555c8-f037-6d4a-246f-00a7437acb2d")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b08555c8-f037-6d4a-246f-00a7437acb2d",
Synchronized="2017-08-05 16:54:27.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
/** Set Paid Until.
@param PaidUntilDate Subscription is paid/valid until this date */
public void setPaidUntilDate (Timestamp PaidUntilDate)
{
set_Value (COLUMNNAME_PaidUntilDate, PaidUntilDate);
}
/** Get Paid Until.
@return Subscription is paid/valid until this date */
public Timestamp getPaidUntilDate() 
{
return (Timestamp)get_Value(COLUMNNAME_PaidUntilDate);
}

@XendraTrl(Identifier="9020bd2b-ea7b-7898-abff-ded63ebf24e0")
public static String es_PE_FIELD_Subscription_PaidUntil_Description="Subscripción es pagada / valida hasta esta fecha.";

@XendraTrl(Identifier="9020bd2b-ea7b-7898-abff-ded63ebf24e0")
public static String es_PE_FIELD_Subscription_PaidUntil_Name="Pagado Hasta";

@XendraField(AD_Column_ID="PaidUntilDate",IsCentrallyMaintained=true,
AD_Tab_ID="efe09e31-93db-dbb0-2820-8cc5e39e63c2",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=100,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9020bd2b-ea7b-7898-abff-ded63ebf24e0")
public static final String FIELDNAME_Subscription_PaidUntil="9020bd2b-ea7b-7898-abff-ded63ebf24e0";

@XendraTrl(Identifier="6d07c4bd-26b7-bb5f-b664-544bc536ebbb")
public static String es_PE_COLUMN_PaidUntilDate_Name="Pagado Hasta";

@XendraColumn(AD_Element_ID="2d8b8dd5-1c3c-51e0-83fa-f7724be9bdce",ColumnName="PaidUntilDate",
AD_Reference_ID=15,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6d07c4bd-26b7-bb5f-b664-544bc536ebbb",
Synchronized="2017-08-05 16:54:27.0")
/** Column name PaidUntilDate */
public static final String COLUMNNAME_PaidUntilDate = "PaidUntilDate";
/** Set Renewal Date.
@param RenewalDate Renewal Date */
public void setRenewalDate (Timestamp RenewalDate)
{
if (RenewalDate == null) throw new IllegalArgumentException ("RenewalDate is mandatory.");
set_Value (COLUMNNAME_RenewalDate, RenewalDate);
}
/** Get Renewal Date.
@return Renewal Date */
public Timestamp getRenewalDate() 
{
return (Timestamp)get_Value(COLUMNNAME_RenewalDate);
}

@XendraTrl(Identifier="2c46e2e4-55fc-b48e-99a3-bd5fda1b42ae")
public static String es_PE_FIELD_Subscription_RenewalDate_Name="Fecha de la Renovación";

@XendraField(AD_Column_ID="RenewalDate",IsCentrallyMaintained=true,
AD_Tab_ID="efe09e31-93db-dbb0-2820-8cc5e39e63c2",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2c46e2e4-55fc-b48e-99a3-bd5fda1b42ae")
public static final String FIELDNAME_Subscription_RenewalDate="2c46e2e4-55fc-b48e-99a3-bd5fda1b42ae";

@XendraTrl(Identifier="1e4b56fe-39ad-e2e8-65ed-e30f9abbfa18")
public static String es_PE_COLUMN_RenewalDate_Name="Fecha de la Renovación";

@XendraColumn(AD_Element_ID="94b3d8e3-2391-f6d5-539d-30e594ae5801",ColumnName="RenewalDate",
AD_Reference_ID=15,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="1e4b56fe-39ad-e2e8-65ed-e30f9abbfa18",
Synchronized="2017-08-05 16:54:27.0")
/** Column name RenewalDate */
public static final String COLUMNNAME_RenewalDate = "RenewalDate";
/** Set Start Date.
@param StartDate First effective day (inclusive) */
public void setStartDate (Timestamp StartDate)
{
if (StartDate == null) throw new IllegalArgumentException ("StartDate is mandatory.");
set_Value (COLUMNNAME_StartDate, StartDate);
}
/** Get Start Date.
@return First effective day (inclusive) */
public Timestamp getStartDate() 
{
return (Timestamp)get_Value(COLUMNNAME_StartDate);
}

@XendraTrl(Identifier="13220ff1-8d9a-5d54-176c-6bb8c3b51004")
public static String es_PE_FIELD_Subscription_StartDate_Description="Primer día efectivo (inclusive)";

@XendraTrl(Identifier="13220ff1-8d9a-5d54-176c-6bb8c3b51004")
public static String es_PE_FIELD_Subscription_StartDate_Help="La fecha de Inicio indica la primera fecha ó fecha inicial de un rango";

@XendraTrl(Identifier="13220ff1-8d9a-5d54-176c-6bb8c3b51004")
public static String es_PE_FIELD_Subscription_StartDate_Name="Fecha de Inicio";

@XendraField(AD_Column_ID="StartDate",IsCentrallyMaintained=true,
AD_Tab_ID="efe09e31-93db-dbb0-2820-8cc5e39e63c2",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="13220ff1-8d9a-5d54-176c-6bb8c3b51004")
public static final String FIELDNAME_Subscription_StartDate="13220ff1-8d9a-5d54-176c-6bb8c3b51004";

@XendraTrl(Identifier="cf9d3563-4f79-78d3-291a-d18ccfba1b76")
public static String es_PE_COLUMN_StartDate_Name="Fecha de Inicio";

@XendraColumn(AD_Element_ID="3fe42406-cab3-a569-bf0b-3614f5d95711",ColumnName="StartDate",
AD_Reference_ID=15,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="cf9d3563-4f79-78d3-291a-d18ccfba1b76",
Synchronized="2017-08-05 16:54:27.0")
/** Column name StartDate */
public static final String COLUMNNAME_StartDate = "StartDate";
}
