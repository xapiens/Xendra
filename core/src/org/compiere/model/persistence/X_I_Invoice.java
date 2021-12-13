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
/** Generated Model for I_Invoice
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_I_Invoice extends PO
{
/** Standard Constructor
@param ctx context
@param I_Invoice_ID id
@param trxName transaction
*/
public X_I_Invoice (Properties ctx, int I_Invoice_ID, String trxName)
{
super (ctx, I_Invoice_ID, trxName);
/** if (I_Invoice_ID == 0)
{
setI_Invoice_ID (0);
setI_IsImported (false);	
// N
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_I_Invoice (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=598 */
public static int Table_ID=MTable.getTable_ID("I_Invoice");

@XendraTrl(Identifier="11efe735-03c1-85ba-6012-804fe516b95d")
public static String es_PE_TAB_Invoice_Description="Importar Facturas";

@XendraTrl(Identifier="11efe735-03c1-85ba-6012-804fe516b95d")
public static String es_PE_TAB_Invoice_Help="Usted debe proveer el nombre del tipo de documento (ó la identificación). El tipo de documento está en el propósito derivado no completamente pues tiene también muchas consecuencias si es incorrecto. La mejor manera es fijar el nombre del tipo de documento pues una constante en su formato del archivo de la importación ó como campo importado en el archivo.";

@XendraTrl(Identifier="11efe735-03c1-85ba-6012-804fe516b95d")
public static String es_PE_TAB_Invoice_Name="Factura";
@XendraTab(Name="Invoice",
Description="Import Invoices",
Help="You should supply the Document Type Name (or ID). The Document Type is on purpose not fully derived as it has too many consequences if it's wrong.  The best way is to set the Document Type Name as a Constant in your Import File Format or as an imported field in the file.",
AD_Window_ID="794b319d-43fd-54c8-846e-060e2c877917",SeqNo=10,TabLevel=0,IsSingleRow=true,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="11efe735-03c1-85ba-6012-804fe516b95d",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Invoice="11efe735-03c1-85ba-6012-804fe516b95d";

@XendraTrl(Identifier="82337fb0-dd30-4b3a-001a-745fc857ce38")
public static String es_PE_TABLE_I_Invoice_Name="Importar Factura";

@XendraTable(Name="Import Invoice",AD_Package_ID="645f34c0-ea3a-ac63-618d-8ca49873c33b",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="Import Invoice",Help="",
TableName="I_Invoice",AccessLevel="2",AD_Window_ID="794b319d-43fd-54c8-846e-060e2c877917",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=145,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.import",
Identifier="82337fb0-dd30-4b3a-001a-745fc857ce38",Synchronized="2020-03-03 21:38:10.0")
/** TableName=I_Invoice */
public static final String Table_Name="I_Invoice";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"I_Invoice");

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
    Table_ID = MTable.getTable_ID("I_Invoice");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_I_Invoice[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Address 1.
@param Address1 Address line 1 for this location */
public void setAddress1 (String Address1)
{
if (Address1 != null && Address1.length() > 60)
{
log.warning("Length > 60 - truncated");
Address1 = Address1.substring(0,59);
}
set_Value (COLUMNNAME_Address1, Address1);
}
/** Get Address 1.
@return Address line 1 for this location */
public String getAddress1() 
{
String value = (String)get_Value(COLUMNNAME_Address1);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="943375ce-0a47-15ea-8929-cc77f73a1cd9")
public static String es_PE_FIELD_Invoice_Address_Name="Calle";

@XendraTrl(Identifier="943375ce-0a47-15ea-8929-cc77f73a1cd9")
public static String es_PE_FIELD_Invoice_Address_Description="Dirección para esta ubicación";

@XendraTrl(Identifier="943375ce-0a47-15ea-8929-cc77f73a1cd9")
public static String es_PE_FIELD_Invoice_Address_Help="La Dirección 1 identifica la dirección para una entidad";

@XendraField(AD_Column_ID="Address1",IsCentrallyMaintained=true,
AD_Tab_ID="11efe735-03c1-85ba-6012-804fe516b95d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=240,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="943375ce-0a47-15ea-8929-cc77f73a1cd9")
public static final String FIELDNAME_Invoice_Address="943375ce-0a47-15ea-8929-cc77f73a1cd9";

@XendraTrl(Identifier="6865de96-9dde-97f3-341e-6080c999ba7f")
public static String es_PE_COLUMN_Address1_Name="Calle";

@XendraColumn(AD_Element_ID="25535414-be76-de81-69b4-106e2150a04a",ColumnName="Address1",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6865de96-9dde-97f3-341e-6080c999ba7f",
Synchronized="2019-08-30 22:22:50.0")
/** Column name Address1 */
public static final String COLUMNNAME_Address1 = "Address1";
/** Set Address 2.
@param Address2 Address line 2 for this location */
public void setAddress2 (String Address2)
{
if (Address2 != null && Address2.length() > 60)
{
log.warning("Length > 60 - truncated");
Address2 = Address2.substring(0,59);
}
set_Value (COLUMNNAME_Address2, Address2);
}
/** Get Address 2.
@return Address line 2 for this location */
public String getAddress2() 
{
String value = (String)get_Value(COLUMNNAME_Address2);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="9d4e6995-c7b8-5a10-72de-90c4732ada22")
public static String es_PE_FIELD_Invoice_Address22_Name="Colonía";

@XendraTrl(Identifier="9d4e6995-c7b8-5a10-72de-90c4732ada22")
public static String es_PE_FIELD_Invoice_Address22_Description="Dirección 2 para esta ubicación";

@XendraTrl(Identifier="9d4e6995-c7b8-5a10-72de-90c4732ada22")
public static String es_PE_FIELD_Invoice_Address22_Help="La Dirección 2 provee información de la dirección adicional para una entidad. Puede ser usada para integrar la ubicación; número de apartamento; ó información similar";

@XendraField(AD_Column_ID="Address2",IsCentrallyMaintained=true,
AD_Tab_ID="11efe735-03c1-85ba-6012-804fe516b95d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=250,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9d4e6995-c7b8-5a10-72de-90c4732ada22")
public static final String FIELDNAME_Invoice_Address22="9d4e6995-c7b8-5a10-72de-90c4732ada22";

@XendraTrl(Identifier="efdf8e9b-67c5-d706-95ce-6ecd086848d1")
public static String es_PE_COLUMN_Address2_Name="Colonía";

@XendraColumn(AD_Element_ID="a3cd6592-3282-7ed0-953e-16e24d22cc17",ColumnName="Address2",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="efdf8e9b-67c5-d706-95ce-6ecd086848d1",
Synchronized="2019-08-30 22:22:50.0")
/** Column name Address2 */
public static final String COLUMNNAME_Address2 = "Address2";
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

@XendraTrl(Identifier="6cbc4292-0d82-be9c-bde8-3a9c0c450d93")
public static String es_PE_FIELD_Invoice_TrxOrganization_Name="Organización de la Trans.";

@XendraTrl(Identifier="6cbc4292-0d82-be9c-bde8-3a9c0c450d93")
public static String es_PE_FIELD_Invoice_TrxOrganization_Description="Organización que inicia ó ejecuta la transacción";

@XendraTrl(Identifier="6cbc4292-0d82-be9c-bde8-3a9c0c450d93")
public static String es_PE_FIELD_Invoice_TrxOrganization_Help="La organización que inicia ó ejecuta la transacción (para otra organización). La organización poseedora puede no ser la organización de la transacción en un ambiente de buró de servicio; con servicios centralizados y transacciones inter- organización.";

@XendraField(AD_Column_ID="AD_OrgTrx_ID",IsCentrallyMaintained=true,
AD_Tab_ID="11efe735-03c1-85ba-6012-804fe516b95d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=510,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6cbc4292-0d82-be9c-bde8-3a9c0c450d93")
public static final String FIELDNAME_Invoice_TrxOrganization="6cbc4292-0d82-be9c-bde8-3a9c0c450d93";

@XendraTrl(Identifier="698fa501-7290-ca19-7b7d-9d3762bdb4d7")
public static String es_PE_COLUMN_AD_OrgTrx_ID_Name="Organización de la Trans.";

@XendraColumn(AD_Element_ID="b4180358-67aa-fe55-0409-6367a60e0a2e",ColumnName="AD_OrgTrx_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="54e78591-f7f4-c613-ea27-e64b3dac5198",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="698fa501-7290-ca19-7b7d-9d3762bdb4d7",Synchronized="2019-08-30 22:22:50.0")
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

@XendraTrl(Identifier="d37a8349-9970-a27e-859b-ff2f6f32bacb")
public static String es_PE_FIELD_Invoice_UserContact_Name="Usuario";

@XendraTrl(Identifier="d37a8349-9970-a27e-859b-ff2f6f32bacb")
public static String es_PE_FIELD_Invoice_UserContact_Description="ID de Usuario dentro del sistema";

@XendraTrl(Identifier="d37a8349-9970-a27e-859b-ff2f6f32bacb")
public static String es_PE_FIELD_Invoice_UserContact_Help="La ID de usuario identifica un usuario único en el sistema";

@XendraField(AD_Column_ID="AD_User_ID",IsCentrallyMaintained=true,
AD_Tab_ID="11efe735-03c1-85ba-6012-804fe516b95d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=320,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d37a8349-9970-a27e-859b-ff2f6f32bacb")
public static final String FIELDNAME_Invoice_UserContact="d37a8349-9970-a27e-859b-ff2f6f32bacb";

@XendraTrl(Identifier="3dab228f-825a-7ac9-41ab-3da4edf211bb")
public static String es_PE_COLUMN_AD_User_ID_Name="Usuario";

@XendraColumn(AD_Element_ID="abdf8dee-d3cd-73ec-c758-683e907797f4",ColumnName="AD_User_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="f4ac36a1-4200-1386-677e-14ac90afb4fe",
FieldLength=22,DefaultValue="-1",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="3dab228f-825a-7ac9-41ab-3da4edf211bb",Synchronized="2019-08-30 22:22:50.0")
/** Column name AD_User_ID */
public static final String COLUMNNAME_AD_User_ID = "AD_User_ID";
/** Set Business Partner Key.
@param BPartnerValue Key of the Business Partner */
public void setBPartnerValue (String BPartnerValue)
{
if (BPartnerValue != null && BPartnerValue.length() > 40)
{
log.warning("Length > 40 - truncated");
BPartnerValue = BPartnerValue.substring(0,39);
}
set_Value (COLUMNNAME_BPartnerValue, BPartnerValue);
}
/** Get Business Partner Key.
@return Key of the Business Partner */
public String getBPartnerValue() 
{
String value = (String)get_Value(COLUMNNAME_BPartnerValue);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="44230883-57b4-4144-b316-01381ce58d64")
public static String es_PE_FIELD_Invoice_BusinessPartnerKey_Name="Clave de S.N.";

@XendraTrl(Identifier="44230883-57b4-4144-b316-01381ce58d64")
public static String es_PE_FIELD_Invoice_BusinessPartnerKey_Description="Clave para el S.N.";

@XendraField(AD_Column_ID="BPartnerValue",IsCentrallyMaintained=true,
AD_Tab_ID="11efe735-03c1-85ba-6012-804fe516b95d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=200,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="44230883-57b4-4144-b316-01381ce58d64")
public static final String FIELDNAME_Invoice_BusinessPartnerKey="44230883-57b4-4144-b316-01381ce58d64";

@XendraTrl(Identifier="58f4f2c5-923d-4c75-5866-85ccbc017be7")
public static String es_PE_COLUMN_BPartnerValue_Name="Clave de S.N.";

@XendraColumn(AD_Element_ID="8128a796-0c52-a502-d53b-7f4fe35f5f78",ColumnName="BPartnerValue",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="58f4f2c5-923d-4c75-5866-85ccbc017be7",
Synchronized="2019-08-30 22:22:50.0")
/** Column name BPartnerValue */
public static final String COLUMNNAME_BPartnerValue = "BPartnerValue";
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

@XendraTrl(Identifier="b98f9589-590d-a57c-34ec-24db80b89bbe")
public static String es_PE_FIELD_Invoice_Activity_Name="Tipo de Gasto";

@XendraTrl(Identifier="b98f9589-590d-a57c-34ec-24db80b89bbe")
public static String es_PE_FIELD_Invoice_Activity_Description="Actividad de Negocio";

@XendraTrl(Identifier="b98f9589-590d-a57c-34ec-24db80b89bbe")
public static String es_PE_FIELD_Invoice_Activity_Help="Las actividades indican tareas que son ejecutadas en el curso de un negocio; las actividades son usadas para el costeo por actividad (ABC)";

@XendraField(AD_Column_ID="C_Activity_ID",IsCentrallyMaintained=true,
AD_Tab_ID="11efe735-03c1-85ba-6012-804fe516b95d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=500,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b98f9589-590d-a57c-34ec-24db80b89bbe")
public static final String FIELDNAME_Invoice_Activity="b98f9589-590d-a57c-34ec-24db80b89bbe";

@XendraTrl(Identifier="549ac18a-8bb5-adf5-0195-efcaf2e6b33b")
public static String es_PE_COLUMN_C_Activity_ID_Name="Tipo de Gasto";

@XendraColumn(AD_Element_ID="bfeadbb3-d866-26e3-8eee-3e2fdf0ff753",ColumnName="C_Activity_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="549ac18a-8bb5-adf5-0195-efcaf2e6b33b",
Synchronized="2019-08-30 22:22:50.0")
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

@XendraTrl(Identifier="1c3eb91d-4826-cde0-5ae0-4b231b7b705a")
public static String es_PE_FIELD_Invoice_BusinessPartner_Name="Socio de Negocio";

@XendraTrl(Identifier="1c3eb91d-4826-cde0-5ae0-4b231b7b705a")
public static String es_PE_FIELD_Invoice_BusinessPartner_Description="Identifica un Socio de Negocio";

@XendraTrl(Identifier="1c3eb91d-4826-cde0-5ae0-4b231b7b705a")
public static String es_PE_FIELD_Invoice_BusinessPartner_Help="Un socio de negocio es cualquiera con quien usted realiza transacciones. Este puede incluir Proveedores; Clientes; Empleados ó Vendedores.";

@XendraField(AD_Column_ID="C_BPartner_ID",IsCentrallyMaintained=true,
AD_Tab_ID="11efe735-03c1-85ba-6012-804fe516b95d",AD_FieldGroup_ID="Business Partner",
IsDisplayed=true,DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=190,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="1c3eb91d-4826-cde0-5ae0-4b231b7b705a")
public static final String FIELDNAME_Invoice_BusinessPartner="1c3eb91d-4826-cde0-5ae0-4b231b7b705a";

@XendraTrl(Identifier="c01b3aec-1edc-9fbf-7fbf-e4e49dc28b11")
public static String es_PE_COLUMN_C_BPartner_ID_Name="Socio de Negocio";

@XendraColumn(AD_Element_ID="fe333dc3-4f40-1276-5f6a-d09bb66dc423",ColumnName="C_BPartner_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c01b3aec-1edc-9fbf-7fbf-e4e49dc28b11",
Synchronized="2019-08-30 22:22:50.0")
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

@XendraTrl(Identifier="913195df-04be-194a-3966-9a75a2096e4d")
public static String es_PE_FIELD_Invoice_PartnerLocation_Name="Dirección del Socio del Negocio";

@XendraTrl(Identifier="913195df-04be-194a-3966-9a75a2096e4d")
public static String es_PE_FIELD_Invoice_PartnerLocation_Description="Identifica la dirección para este socio de negocio";

@XendraTrl(Identifier="913195df-04be-194a-3966-9a75a2096e4d")
public static String es_PE_FIELD_Invoice_PartnerLocation_Help="La dirección de un socio indica la ubicación de un socio de negocio";

@XendraField(AD_Column_ID="C_BPartner_Location_ID",IsCentrallyMaintained=true,
AD_Tab_ID="11efe735-03c1-85ba-6012-804fe516b95d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=220,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="913195df-04be-194a-3966-9a75a2096e4d")
public static final String FIELDNAME_Invoice_PartnerLocation="913195df-04be-194a-3966-9a75a2096e4d";

@XendraTrl(Identifier="02ef013e-7423-5fe9-6860-4dc136931c7f")
public static String es_PE_COLUMN_C_BPartner_Location_ID_Name="Dirección del Socio del Negocio";

@XendraColumn(AD_Element_ID="0dab7dc6-2832-26dc-2462-cba2d40235f2",
ColumnName="C_BPartner_Location_ID",AD_Reference_ID=19,AD_Reference_Value_ID="",
AD_Val_Rule_ID="623d98c0-19fc-56a2-f511-8992974d3c05",FieldLength=22,DefaultValue="",IsKey=false,
IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="02ef013e-7423-5fe9-6860-4dc136931c7f",
Synchronized="2019-08-30 22:22:50.0")
/** Column name C_BPartner_Location_ID */
public static final String COLUMNNAME_C_BPartner_Location_ID = "C_BPartner_Location_ID";
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

@XendraTrl(Identifier="63e7d7af-3bda-64db-6e33-3c4d4dc17d65")
public static String es_PE_FIELD_Invoice_Campaign_Name="Campaña";

@XendraTrl(Identifier="63e7d7af-3bda-64db-6e33-3c4d4dc17d65")
public static String es_PE_FIELD_Invoice_Campaign_Description="Campaña de Mercadeo";

@XendraTrl(Identifier="63e7d7af-3bda-64db-6e33-3c4d4dc17d65")
public static String es_PE_FIELD_Invoice_Campaign_Help="La Campaña define un programa de mercadotecnia único. Los proyectos pueden estar asociados con una campaña de mercadotecnia única. Usted puede entonces reportar basado en una campaña específica";

@XendraField(AD_Column_ID="C_Campaign_ID",IsCentrallyMaintained=true,
AD_Tab_ID="11efe735-03c1-85ba-6012-804fe516b95d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=490,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="63e7d7af-3bda-64db-6e33-3c4d4dc17d65")
public static final String FIELDNAME_Invoice_Campaign="63e7d7af-3bda-64db-6e33-3c4d4dc17d65";

@XendraTrl(Identifier="47052224-3869-ed93-fd55-6583c7a7d77c")
public static String es_PE_COLUMN_C_Campaign_ID_Name="Campaña";

@XendraColumn(AD_Element_ID="6cf08e31-d355-ee38-9c0b-bee20b3ea5b6",ColumnName="C_Campaign_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="47052224-3869-ed93-fd55-6583c7a7d77c",
Synchronized="2019-08-30 22:22:50.0")
/** Column name C_Campaign_ID */
public static final String COLUMNNAME_C_Campaign_ID = "C_Campaign_ID";
/** Set Country_ID.
@param C_Country_ID Country  */
public void setC_Country_ID (int C_Country_ID)
{
if (C_Country_ID <= 0) set_Value (COLUMNNAME_C_Country_ID, null);
 else 
set_Value (COLUMNNAME_C_Country_ID, Integer.valueOf(C_Country_ID));
}
/** Get Country_ID.
@return Country  */
public int getC_Country_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Country_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="5a38ef8a-76e6-c0f9-9a72-58cdebfcb1ab")
public static String es_PE_FIELD_Invoice_Country_ID_Name="País";

@XendraTrl(Identifier="5a38ef8a-76e6-c0f9-9a72-58cdebfcb1ab")
public static String es_PE_FIELD_Invoice_Country_ID_Description="País";

@XendraTrl(Identifier="5a38ef8a-76e6-c0f9-9a72-58cdebfcb1ab")
public static String es_PE_FIELD_Invoice_Country_ID_Help="El país define un país. Cada país debe ser definido antes de que pueda ser usado en un documento.";

@XendraField(AD_Column_ID="C_Country_ID",IsCentrallyMaintained=true,
AD_Tab_ID="11efe735-03c1-85ba-6012-804fe516b95d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=310,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5a38ef8a-76e6-c0f9-9a72-58cdebfcb1ab")
public static final String FIELDNAME_Invoice_Country_ID="5a38ef8a-76e6-c0f9-9a72-58cdebfcb1ab";

@XendraTrl(Identifier="9d067efa-8cdf-484d-bca4-6ab355fddf37")
public static String es_PE_COLUMN_C_Country_ID_Name="País";

@XendraColumn(AD_Element_ID="43379d46-930b-f17e-61f3-a1b7f02135c1",ColumnName="C_Country_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9d067efa-8cdf-484d-bca4-6ab355fddf37",
Synchronized="2019-08-30 22:22:50.0")
/** Column name C_Country_ID */
public static final String COLUMNNAME_C_Country_ID = "C_Country_ID";
/** Set Currency.
@param C_Currency_ID The Currency for this record */
public void setC_Currency_ID (int C_Currency_ID)
{
if (C_Currency_ID <= 0) set_Value (COLUMNNAME_C_Currency_ID, null);
 else 
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

@XendraTrl(Identifier="aeed6c09-76fe-fedf-fb85-29b6093336da")
public static String es_PE_FIELD_Invoice_Currency_Name="Moneda";

@XendraTrl(Identifier="aeed6c09-76fe-fedf-fb85-29b6093336da")
public static String es_PE_FIELD_Invoice_Currency_Description="Moneda para este registro";

@XendraTrl(Identifier="aeed6c09-76fe-fedf-fb85-29b6093336da")
public static String es_PE_FIELD_Invoice_Currency_Help="Indica la moneda a ser usada cuando se procese ó Informe este registro";

@XendraField(AD_Column_ID="C_Currency_ID",IsCentrallyMaintained=true,
AD_Tab_ID="11efe735-03c1-85ba-6012-804fe516b95d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=150,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="aeed6c09-76fe-fedf-fb85-29b6093336da")
public static final String FIELDNAME_Invoice_Currency="aeed6c09-76fe-fedf-fb85-29b6093336da";

@XendraTrl(Identifier="b7f43080-f08a-2076-c714-b9e08c549772")
public static String es_PE_COLUMN_C_Currency_ID_Name="Moneda";

@XendraColumn(AD_Element_ID="8daec488-bca2-50fe-f9de-abf0cba2a34a",ColumnName="C_Currency_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b7f43080-f08a-2076-c714-b9e08c549772",
Synchronized="2019-08-30 22:22:50.0")
/** Column name C_Currency_ID */
public static final String COLUMNNAME_C_Currency_ID = "C_Currency_ID";
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

@XendraTrl(Identifier="f51cff26-9aa7-0ad7-ea19-737ccb37bba3")
public static String es_PE_FIELD_Invoice_DocumentType_Name="Tipo de Documento";

@XendraTrl(Identifier="f51cff26-9aa7-0ad7-ea19-737ccb37bba3")
public static String es_PE_FIELD_Invoice_DocumentType_Description="Tipo de documento ó reglas";

@XendraTrl(Identifier="f51cff26-9aa7-0ad7-ea19-737ccb37bba3")
public static String es_PE_FIELD_Invoice_DocumentType_Help="El tipo de documento determina la secuencia del documento y las reglas de proceso";

@XendraField(AD_Column_ID="C_DocType_ID",IsCentrallyMaintained=true,
AD_Tab_ID="11efe735-03c1-85ba-6012-804fe516b95d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f51cff26-9aa7-0ad7-ea19-737ccb37bba3")
public static final String FIELDNAME_Invoice_DocumentType="f51cff26-9aa7-0ad7-ea19-737ccb37bba3";

@XendraTrl(Identifier="a82ba24d-e377-95f9-d1a6-0e2df2cf1609")
public static String es_PE_COLUMN_C_DocType_ID_Name="Tipo de Documento";

@XendraColumn(AD_Element_ID="099a4147-1a72-cdd0-81e0-8bdbc8c0b883",ColumnName="C_DocType_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="2d69299a-c4ca-bc09-ad70-5a0009c2e11c",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="a82ba24d-e377-95f9-d1a6-0e2df2cf1609",Synchronized="2019-08-30 22:22:50.0")
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

@XendraTrl(Identifier="f9a2c348-da1a-d402-0080-8008dd3ced76")
public static String es_PE_FIELD_Invoice_Invoice_Name="Factura";

@XendraTrl(Identifier="f9a2c348-da1a-d402-0080-8008dd3ced76")
public static String es_PE_FIELD_Invoice_Invoice_Description="Identificador de la factura";

@XendraTrl(Identifier="f9a2c348-da1a-d402-0080-8008dd3ced76")
public static String es_PE_FIELD_Invoice_Invoice_Help="La ID de Factura identifica únicamente un documento de Factura.";

@XendraField(AD_Column_ID="C_Invoice_ID",IsCentrallyMaintained=true,
AD_Tab_ID="11efe735-03c1-85ba-6012-804fe516b95d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f9a2c348-da1a-d402-0080-8008dd3ced76")
public static final String FIELDNAME_Invoice_Invoice="f9a2c348-da1a-d402-0080-8008dd3ced76";

@XendraTrl(Identifier="2fe4e388-7d0a-6587-c7f9-c2f071ea5f8a")
public static String es_PE_COLUMN_C_Invoice_ID_Name="Factura";

@XendraColumn(AD_Element_ID="e526ea57-1bdf-9871-fd57-0df3c1f9dd42",ColumnName="C_Invoice_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2fe4e388-7d0a-6587-c7f9-c2f071ea5f8a",
Synchronized="2019-08-30 22:22:50.0")
/** Column name C_Invoice_ID */
public static final String COLUMNNAME_C_Invoice_ID = "C_Invoice_ID";
/** Set Invoice Line.
@param C_InvoiceLine_ID Invoice Detail Line */
public void setC_InvoiceLine_ID (int C_InvoiceLine_ID)
{
if (C_InvoiceLine_ID <= 0) set_Value (COLUMNNAME_C_InvoiceLine_ID, null);
 else 
set_Value (COLUMNNAME_C_InvoiceLine_ID, Integer.valueOf(C_InvoiceLine_ID));
}
/** Get Invoice Line.
@return Invoice Detail Line */
public int getC_InvoiceLine_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_InvoiceLine_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="2e659040-dc25-843b-bfbc-7bbb9ac74e6d")
public static String es_PE_FIELD_Invoice_InvoiceLine_Name="Item de Factura";

@XendraTrl(Identifier="2e659040-dc25-843b-bfbc-7bbb9ac74e6d")
public static String es_PE_FIELD_Invoice_InvoiceLine_Description="Item de detalle de factura";

@XendraTrl(Identifier="2e659040-dc25-843b-bfbc-7bbb9ac74e6d")
public static String es_PE_FIELD_Invoice_InvoiceLine_Help="Identifica de manera única un Item de la factura";

@XendraField(AD_Column_ID="C_InvoiceLine_ID",IsCentrallyMaintained=true,
AD_Tab_ID="11efe735-03c1-85ba-6012-804fe516b95d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=50,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2e659040-dc25-843b-bfbc-7bbb9ac74e6d")
public static final String FIELDNAME_Invoice_InvoiceLine="2e659040-dc25-843b-bfbc-7bbb9ac74e6d";

@XendraTrl(Identifier="5f78e980-62b1-20e4-1954-7bec20c87932")
public static String es_PE_COLUMN_C_InvoiceLine_ID_Name="Línea de Factura";

@XendraColumn(AD_Element_ID="56a4b078-1c5d-e08d-5d9d-847e94161779",ColumnName="C_InvoiceLine_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5f78e980-62b1-20e4-1954-7bec20c87932",
Synchronized="2019-08-30 22:22:50.0")
/** Column name C_InvoiceLine_ID */
public static final String COLUMNNAME_C_InvoiceLine_ID = "C_InvoiceLine_ID";
/** Set City.
@param City Identifies a City */
public void setCity (String City)
{
if (City != null && City.length() > 60)
{
log.warning("Length > 60 - truncated");
City = City.substring(0,59);
}
set_Value (COLUMNNAME_City, City);
}
/** Get City.
@return Identifies a City */
public String getCity() 
{
String value = (String)get_Value(COLUMNNAME_City);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="1b9bcccd-8679-935d-d532-2f88baf028e7")
public static String es_PE_FIELD_Invoice_City_Name="Ciudad";

@XendraTrl(Identifier="1b9bcccd-8679-935d-d532-2f88baf028e7")
public static String es_PE_FIELD_Invoice_City_Description="Identifica una Ciudad";

@XendraTrl(Identifier="1b9bcccd-8679-935d-d532-2f88baf028e7")
public static String es_PE_FIELD_Invoice_City_Help="La Ciudad identifica una ciudad única para este País ó Región";

@XendraField(AD_Column_ID="City",IsCentrallyMaintained=true,
AD_Tab_ID="11efe735-03c1-85ba-6012-804fe516b95d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=260,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1b9bcccd-8679-935d-d532-2f88baf028e7")
public static final String FIELDNAME_Invoice_City="1b9bcccd-8679-935d-d532-2f88baf028e7";

@XendraTrl(Identifier="35547344-41ed-809b-08ac-e30e23620f39")
public static String es_PE_COLUMN_City_Name="Ciudad";

@XendraColumn(AD_Element_ID="968cd06b-d53d-9f3f-cbd5-d393f09a0264",ColumnName="City",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="35547344-41ed-809b-08ac-e30e23620f39",
Synchronized="2019-08-30 22:22:50.0")
/** Column name City */
public static final String COLUMNNAME_City = "City";
/** Set Address.
@param C_Location_ID Location or Address */
public void setC_Location_ID (int C_Location_ID)
{
if (C_Location_ID <= 0) set_Value (COLUMNNAME_C_Location_ID, null);
 else 
set_Value (COLUMNNAME_C_Location_ID, Integer.valueOf(C_Location_ID));
}
/** Get Address.
@return Location or Address */
public int getC_Location_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Location_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="0341c328-318a-92d8-d199-537e120608b7")
public static String es_PE_FIELD_Invoice_Address3_Name="Localización / Dirección";

@XendraTrl(Identifier="0341c328-318a-92d8-d199-537e120608b7")
public static String es_PE_FIELD_Invoice_Address3_Description="Ubicación ó dirección";

@XendraTrl(Identifier="0341c328-318a-92d8-d199-537e120608b7")
public static String es_PE_FIELD_Invoice_Address3_Help="El campo Ubicación / Dirección define la ubicación de una entidad.";

@XendraField(AD_Column_ID="C_Location_ID",IsCentrallyMaintained=true,
AD_Tab_ID="11efe735-03c1-85ba-6012-804fe516b95d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=230,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0341c328-318a-92d8-d199-537e120608b7")
public static final String FIELDNAME_Invoice_Address3="0341c328-318a-92d8-d199-537e120608b7";

@XendraTrl(Identifier="6bed029a-7b27-b9f2-f83f-715f6a37cd1f")
public static String es_PE_COLUMN_C_Location_ID_Name="Localización / Dirección";

@XendraColumn(AD_Element_ID="e66e22a8-535b-2af2-6efb-aa600959a885",ColumnName="C_Location_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6bed029a-7b27-b9f2-f83f-715f6a37cd1f",
Synchronized="2019-08-30 22:22:50.0")
/** Column name C_Location_ID */
public static final String COLUMNNAME_C_Location_ID = "C_Location_ID";
/** Set Contact Name.
@param ContactName Business Partner Contact Name */
public void setContactName (String ContactName)
{
if (ContactName != null && ContactName.length() > 60)
{
log.warning("Length > 60 - truncated");
ContactName = ContactName.substring(0,59);
}
set_Value (COLUMNNAME_ContactName, ContactName);
}
/** Get Contact Name.
@return Business Partner Contact Name */
public String getContactName() 
{
String value = (String)get_Value(COLUMNNAME_ContactName);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="ed311697-7ddb-2625-d0b3-027237b6131a")
public static String es_PE_FIELD_Invoice_ContactName_Name="Nombre del Contacto";

@XendraTrl(Identifier="ed311697-7ddb-2625-d0b3-027237b6131a")
public static String es_PE_FIELD_Invoice_ContactName_Description="Nombre del contacto del socio";

@XendraField(AD_Column_ID="ContactName",IsCentrallyMaintained=true,
AD_Tab_ID="11efe735-03c1-85ba-6012-804fe516b95d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=330,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ed311697-7ddb-2625-d0b3-027237b6131a")
public static final String FIELDNAME_Invoice_ContactName="ed311697-7ddb-2625-d0b3-027237b6131a";

@XendraTrl(Identifier="acae22c3-f4e5-6eb4-14b7-21143541f577")
public static String es_PE_COLUMN_ContactName_Name="Nombre del Contacto";

@XendraColumn(AD_Element_ID="09dc9eae-5f2a-936f-d673-7d269b49db5a",ColumnName="ContactName",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="acae22c3-f4e5-6eb4-14b7-21143541f577",
Synchronized="2019-08-30 22:22:50.0")
/** Column name ContactName */
public static final String COLUMNNAME_ContactName = "ContactName";
/** Set ISO Country Code.
@param CountryCode Upper-case two-letter alphanumeric ISO Country code according to ISO 3166-1 - http://www.chemie.fu-berlin.de/diverse/doc/ISO_3166.html */
public void setCountryCode (boolean CountryCode)
{
set_Value (COLUMNNAME_CountryCode, Boolean.valueOf(CountryCode));
}
/** Get ISO Country Code.
@return Upper-case two-letter alphanumeric ISO Country code according to ISO 3166-1 - http://www.chemie.fu-berlin.de/diverse/doc/ISO_3166.html */
public boolean isCountryCode() 
{
Object oo = get_Value(COLUMNNAME_CountryCode);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="2eba82d0-e20a-5452-fade-5b0ab92d83e9")
public static String es_PE_FIELD_Invoice_ISOCountryCode_Name="Código ISO del País";

@XendraTrl(Identifier="2eba82d0-e20a-5452-fade-5b0ab92d83e9")
public static String es_PE_FIELD_Invoice_ISOCountryCode_Description="Código ISO de país alfanumérico en mayúsculas de acuerdo al ISO 3166-1 -";

@XendraTrl(Identifier="2eba82d0-e20a-5452-fade-5b0ab92d83e9")
public static String es_PE_FIELD_Invoice_ISOCountryCode_Help="Para detalles - http://www.din.de/gremien/nas/nabd/iso3166ma/codlstp1.html or - http://www.unece.org/trade/rec/rec03en.htm";

@XendraField(AD_Column_ID="CountryCode",IsCentrallyMaintained=true,
AD_Tab_ID="11efe735-03c1-85ba-6012-804fe516b95d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=300,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2eba82d0-e20a-5452-fade-5b0ab92d83e9")
public static final String FIELDNAME_Invoice_ISOCountryCode="2eba82d0-e20a-5452-fade-5b0ab92d83e9";

@XendraTrl(Identifier="e940404a-7850-0159-8721-6009238c2642")
public static String es_PE_COLUMN_CountryCode_Name="Código ISO del País";

@XendraColumn(AD_Element_ID="45764594-a71a-901c-2c46-bb5485c061d1",ColumnName="CountryCode",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e940404a-7850-0159-8721-6009238c2642",
Synchronized="2019-08-30 22:22:50.0")
/** Column name CountryCode */
public static final String COLUMNNAME_CountryCode = "CountryCode";
/** Set Payment Term.
@param C_PaymentTerm_ID The terms of Payment (timing, discount) */
public void setC_PaymentTerm_ID (int C_PaymentTerm_ID)
{
if (C_PaymentTerm_ID <= 0) set_Value (COLUMNNAME_C_PaymentTerm_ID, null);
 else 
set_Value (COLUMNNAME_C_PaymentTerm_ID, Integer.valueOf(C_PaymentTerm_ID));
}
/** Get Payment Term.
@return The terms of Payment (timing, discount) */
public int getC_PaymentTerm_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_PaymentTerm_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="df012429-9d69-5f3d-3bc8-1ce596629020")
public static String es_PE_FIELD_Invoice_PaymentTerm_Name="Término de Pago";

@XendraTrl(Identifier="df012429-9d69-5f3d-3bc8-1ce596629020")
public static String es_PE_FIELD_Invoice_PaymentTerm_Description="Condiciones de pago de esta transacción";

@XendraTrl(Identifier="df012429-9d69-5f3d-3bc8-1ce596629020")
public static String es_PE_FIELD_Invoice_PaymentTerm_Help="Las condiciones de pago indican el método y tiempo de pago para esta transacción.";

@XendraField(AD_Column_ID="C_PaymentTerm_ID",IsCentrallyMaintained=true,
AD_Tab_ID="11efe735-03c1-85ba-6012-804fe516b95d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=180,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="df012429-9d69-5f3d-3bc8-1ce596629020")
public static final String FIELDNAME_Invoice_PaymentTerm="df012429-9d69-5f3d-3bc8-1ce596629020";

@XendraTrl(Identifier="5d267ecf-9bc4-8375-ed45-0678833ebc31")
public static String es_PE_COLUMN_C_PaymentTerm_ID_Name="Término de Pago";

@XendraColumn(AD_Element_ID="9b2224b8-8020-a83c-2d1e-ea35741c781a",ColumnName="C_PaymentTerm_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5d267ecf-9bc4-8375-ed45-0678833ebc31",
Synchronized="2019-08-30 22:22:50.0")
/** Column name C_PaymentTerm_ID */
public static final String COLUMNNAME_C_PaymentTerm_ID = "C_PaymentTerm_ID";
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

@XendraTrl(Identifier="ee2e2f2f-9f17-082d-d3c2-d9b40b9469c1")
public static String es_PE_FIELD_Invoice_Project_Name="Proyecto";

@XendraTrl(Identifier="ee2e2f2f-9f17-082d-d3c2-d9b40b9469c1")
public static String es_PE_FIELD_Invoice_Project_Description="Identifica un proyecto único";

@XendraTrl(Identifier="ee2e2f2f-9f17-082d-d3c2-d9b40b9469c1")
public static String es_PE_FIELD_Invoice_Project_Help="La ID de un proyecto es un identificador definido por el usuario para un proyecto";

@XendraField(AD_Column_ID="C_Project_ID",IsCentrallyMaintained=true,
AD_Tab_ID="11efe735-03c1-85ba-6012-804fe516b95d",AD_FieldGroup_ID="Reference",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=480,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ee2e2f2f-9f17-082d-d3c2-d9b40b9469c1")
public static final String FIELDNAME_Invoice_Project="ee2e2f2f-9f17-082d-d3c2-d9b40b9469c1";

@XendraTrl(Identifier="0d7fd810-2412-a1f0-ed84-ba9c5f5b2147")
public static String es_PE_COLUMN_C_Project_ID_Name="Proyecto";

@XendraColumn(AD_Element_ID="16ff5dcc-9178-73dd-e618-e88bd79d573b",ColumnName="C_Project_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0d7fd810-2412-a1f0-ed84-ba9c5f5b2147",
Synchronized="2019-08-30 22:22:50.0")
/** Column name C_Project_ID */
public static final String COLUMNNAME_C_Project_ID = "C_Project_ID";
/** Set Region.
@param C_Region_ID Identifies a geographical Region */
public void setC_Region_ID (int C_Region_ID)
{
if (C_Region_ID <= 0) set_Value (COLUMNNAME_C_Region_ID, null);
 else 
set_Value (COLUMNNAME_C_Region_ID, Integer.valueOf(C_Region_ID));
}
/** Get Region.
@return Identifies a geographical Region */
public int getC_Region_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Region_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="f2f72ce7-41ca-ad77-d620-b0cf12c7acf4")
public static String es_PE_FIELD_Invoice_Region_Name="Región";

@XendraTrl(Identifier="f2f72ce7-41ca-ad77-d620-b0cf12c7acf4")
public static String es_PE_FIELD_Invoice_Region_Description="Identifica una región geográfica";

@XendraTrl(Identifier="f2f72ce7-41ca-ad77-d620-b0cf12c7acf4")
public static String es_PE_FIELD_Invoice_Region_Help="La región indica una región única para este país";

@XendraField(AD_Column_ID="C_Region_ID",IsCentrallyMaintained=true,
AD_Tab_ID="11efe735-03c1-85ba-6012-804fe516b95d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=290,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f2f72ce7-41ca-ad77-d620-b0cf12c7acf4")
public static final String FIELDNAME_Invoice_Region="f2f72ce7-41ca-ad77-d620-b0cf12c7acf4";

@XendraTrl(Identifier="67f868e4-7b96-78be-3d22-3d9db6d656c5")
public static String es_PE_COLUMN_C_Region_ID_Name="Región";

@XendraColumn(AD_Element_ID="ebf14ae5-8cc5-d3f7-2bd3-ea81d9c6d1fe",ColumnName="C_Region_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="67f868e4-7b96-78be-3d22-3d9db6d656c5",
Synchronized="2019-08-30 22:22:50.0")
/** Column name C_Region_ID */
public static final String COLUMNNAME_C_Region_ID = "C_Region_ID";
/** Set Tax.
@param C_Tax_ID Tax identifier */
public void setC_Tax_ID (int C_Tax_ID)
{
if (C_Tax_ID <= 0) set_Value (COLUMNNAME_C_Tax_ID, null);
 else 
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

@XendraTrl(Identifier="93d0bec4-ff2d-e432-bf15-67687137d69b")
public static String es_PE_FIELD_Invoice_Tax_Name="Impuesto";

@XendraTrl(Identifier="93d0bec4-ff2d-e432-bf15-67687137d69b")
public static String es_PE_FIELD_Invoice_Tax_Description="Identificador del Impuesto";

@XendraTrl(Identifier="93d0bec4-ff2d-e432-bf15-67687137d69b")
public static String es_PE_FIELD_Invoice_Tax_Help="El Impuesto indica el tipo de impuesto para esta línea del documento";

@XendraField(AD_Column_ID="C_Tax_ID",IsCentrallyMaintained=true,
AD_Tab_ID="11efe735-03c1-85ba-6012-804fe516b95d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=460,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="93d0bec4-ff2d-e432-bf15-67687137d69b")
public static final String FIELDNAME_Invoice_Tax="93d0bec4-ff2d-e432-bf15-67687137d69b";

@XendraTrl(Identifier="b616f250-d286-5cf4-a7cd-f0f7dc0b7308")
public static String es_PE_COLUMN_C_Tax_ID_Name="Impuesto";

@XendraColumn(AD_Element_ID="38ff24fc-b68c-51a9-60f8-ef2a1f060de2",ColumnName="C_Tax_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b616f250-d286-5cf4-a7cd-f0f7dc0b7308",
Synchronized="2019-08-30 22:22:50.0")
/** Column name C_Tax_ID */
public static final String COLUMNNAME_C_Tax_ID = "C_Tax_ID";
/** Set Account Date.
@param DateAcct Accounting Date */
public void setDateAcct (Timestamp DateAcct)
{
set_Value (COLUMNNAME_DateAcct, DateAcct);
}
/** Get Account Date.
@return Accounting Date */
public Timestamp getDateAcct() 
{
return (Timestamp)get_Value(COLUMNNAME_DateAcct);
}

@XendraTrl(Identifier="fbb429a4-58a3-c1b7-5710-1cc5ab00fc75")
public static String es_PE_FIELD_Invoice_AccountDate_Name="Fecha de Aplicación CG";

@XendraTrl(Identifier="fbb429a4-58a3-c1b7-5710-1cc5ab00fc75")
public static String es_PE_FIELD_Invoice_AccountDate_Description="Fecha contable";

@XendraTrl(Identifier="fbb429a4-58a3-c1b7-5710-1cc5ab00fc75")
public static String es_PE_FIELD_Invoice_AccountDate_Help="La fecha contable indica la fecha a ser usada en las cuentas de contabilidad general generadas desde este documento";

@XendraField(AD_Column_ID="DateAcct",IsCentrallyMaintained=true,
AD_Tab_ID="11efe735-03c1-85ba-6012-804fe516b95d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=370,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="fbb429a4-58a3-c1b7-5710-1cc5ab00fc75")
public static final String FIELDNAME_Invoice_AccountDate="fbb429a4-58a3-c1b7-5710-1cc5ab00fc75";

@XendraTrl(Identifier="910a8a18-ac61-5e58-cccb-14f250595083")
public static String es_PE_COLUMN_DateAcct_Name="Fecha de Aplicación CG";

@XendraColumn(AD_Element_ID="034727d0-e80f-fadf-3d4f-2d8d37b75669",ColumnName="DateAcct",
AD_Reference_ID=15,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="910a8a18-ac61-5e58-cccb-14f250595083",
Synchronized="2019-08-30 22:22:50.0")
/** Column name DateAcct */
public static final String COLUMNNAME_DateAcct = "DateAcct";
/** Set Date Invoiced.
@param DateInvoiced Date printed on Invoice */
public void setDateInvoiced (Timestamp DateInvoiced)
{
set_Value (COLUMNNAME_DateInvoiced, DateInvoiced);
}
/** Get Date Invoiced.
@return Date printed on Invoice */
public Timestamp getDateInvoiced() 
{
return (Timestamp)get_Value(COLUMNNAME_DateInvoiced);
}

@XendraTrl(Identifier="01693104-c024-a993-1151-9b0aec275228")
public static String es_PE_FIELD_Invoice_DateInvoiced_Name="Fecha de Facturación";

@XendraTrl(Identifier="01693104-c024-a993-1151-9b0aec275228")
public static String es_PE_FIELD_Invoice_DateInvoiced_Description="Fecha impresa en la factura";

@XendraTrl(Identifier="01693104-c024-a993-1151-9b0aec275228")
public static String es_PE_FIELD_Invoice_DateInvoiced_Help="La fecha de la factura indica la fecha impresa en la factura.";

@XendraField(AD_Column_ID="DateInvoiced",IsCentrallyMaintained=true,
AD_Tab_ID="11efe735-03c1-85ba-6012-804fe516b95d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=360,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="01693104-c024-a993-1151-9b0aec275228")
public static final String FIELDNAME_Invoice_DateInvoiced="01693104-c024-a993-1151-9b0aec275228";

@XendraTrl(Identifier="c631195c-2295-a485-539d-1f0117791b03")
public static String es_PE_COLUMN_DateInvoiced_Name="Fecha de Facturación";

@XendraColumn(AD_Element_ID="5e3c1a65-f97d-82ed-a21c-bc730ca3c080",ColumnName="DateInvoiced",
AD_Reference_ID=15,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c631195c-2295-a485-539d-1f0117791b03",
Synchronized="2019-08-30 22:22:50.0")
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

@XendraTrl(Identifier="f96ba752-75d8-d935-94c1-e3c96610ba9b")
public static String es_PE_FIELD_Invoice_Description_Name="Observación";

@XendraTrl(Identifier="f96ba752-75d8-d935-94c1-e3c96610ba9b")
public static String es_PE_FIELD_Invoice_Description_Description="Observación corta opcional del registro";

@XendraTrl(Identifier="f96ba752-75d8-d935-94c1-e3c96610ba9b")
public static String es_PE_FIELD_Invoice_Description_Help="Una Observación esta limitada a 255 caracteres";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="11efe735-03c1-85ba-6012-804fe516b95d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=130,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f96ba752-75d8-d935-94c1-e3c96610ba9b")
public static final String FIELDNAME_Invoice_Description="f96ba752-75d8-d935-94c1-e3c96610ba9b";

@XendraTrl(Identifier="c31e2ba3-d2f8-3bff-6c59-3b770e7f82e8")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c31e2ba3-d2f8-3bff-6c59-3b770e7f82e8",
Synchronized="2019-08-30 22:22:50.0")
/** Column name Description */
public static final String COLUMNNAME_Description = "Description";
/** Set Document Type Name.
@param DocTypeName Name of the Document Type */
public void setDocTypeName (String DocTypeName)
{
if (DocTypeName != null && DocTypeName.length() > 60)
{
log.warning("Length > 60 - truncated");
DocTypeName = DocTypeName.substring(0,59);
}
set_Value (COLUMNNAME_DocTypeName, DocTypeName);
}
/** Get Document Type Name.
@return Name of the Document Type */
public String getDocTypeName() 
{
String value = (String)get_Value(COLUMNNAME_DocTypeName);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="49361b75-c525-cc67-c2bb-b8cceaa92637")
public static String es_PE_FIELD_Invoice_DocumentTypeName_Name="Nombre del Tipo de Documento";

@XendraTrl(Identifier="49361b75-c525-cc67-c2bb-b8cceaa92637")
public static String es_PE_FIELD_Invoice_DocumentTypeName_Description="Nombre del tipo de documento";

@XendraField(AD_Column_ID="DocTypeName",IsCentrallyMaintained=true,
AD_Tab_ID="11efe735-03c1-85ba-6012-804fe516b95d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="49361b75-c525-cc67-c2bb-b8cceaa92637")
public static final String FIELDNAME_Invoice_DocumentTypeName="49361b75-c525-cc67-c2bb-b8cceaa92637";

@XendraTrl(Identifier="7d6c6d65-70b7-cf82-71fd-c91098dad254")
public static String es_PE_COLUMN_DocTypeName_Name="Nombre del Tipo de Documento";

@XendraColumn(AD_Element_ID="af613457-d4ac-9b3e-87a0-02ba8501326b",ColumnName="DocTypeName",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7d6c6d65-70b7-cf82-71fd-c91098dad254",
Synchronized="2019-08-30 22:22:50.0")
/** Column name DocTypeName */
public static final String COLUMNNAME_DocTypeName = "DocTypeName";
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
@XendraTrl(Identifier="110eef94-9d96-81ee-58aa-09f4303645cc")
public static String es_PE_FIELD_Invoice_DocumentNo_Name="No. del Documento";

@XendraTrl(Identifier="110eef94-9d96-81ee-58aa-09f4303645cc")
public static String es_PE_FIELD_Invoice_DocumentNo_Description="Número de secuencia del documento para cada documento";

@XendraTrl(Identifier="110eef94-9d96-81ee-58aa-09f4303645cc")
public static String es_PE_FIELD_Invoice_DocumentNo_Help="El número del documento es usualmente generado en automático por el sistema y determinado por el tipo del documento. Si el documento no se salva; el número preliminar se despliega entre \"<>\"";

@XendraField(AD_Column_ID="DocumentNo",IsCentrallyMaintained=true,
AD_Tab_ID="11efe735-03c1-85ba-6012-804fe516b95d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="110eef94-9d96-81ee-58aa-09f4303645cc")
public static final String FIELDNAME_Invoice_DocumentNo="110eef94-9d96-81ee-58aa-09f4303645cc";

@XendraTrl(Identifier="30d9eb7e-a8c8-a5d5-dceb-0310d1f0b0a7")
public static String es_PE_COLUMN_DocumentNo_Name="No. del Documento";

@XendraColumn(AD_Element_ID="e3ca6e28-702a-2722-d941-b2072a0de9cb",ColumnName="DocumentNo",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=30,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="30d9eb7e-a8c8-a5d5-dceb-0310d1f0b0a7",
Synchronized="2019-08-30 22:22:50.0")
/** Column name DocumentNo */
public static final String COLUMNNAME_DocumentNo = "DocumentNo";
/** Set EMail Address.
@param EMail Electronic Mail Address */
public void setEMail (String EMail)
{
if (EMail != null && EMail.length() > 60)
{
log.warning("Length > 60 - truncated");
EMail = EMail.substring(0,59);
}
set_Value (COLUMNNAME_EMail, EMail);
}
/** Get EMail Address.
@return Electronic Mail Address */
public String getEMail() 
{
String value = (String)get_Value(COLUMNNAME_EMail);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="cc83005f-58ac-1c3c-b5c4-721953c60e9b")
public static String es_PE_FIELD_Invoice_EMailAddress_Name="Email";

@XendraTrl(Identifier="cc83005f-58ac-1c3c-b5c4-721953c60e9b")
public static String es_PE_FIELD_Invoice_EMailAddress_Description="ID de correo electrónico";

@XendraTrl(Identifier="cc83005f-58ac-1c3c-b5c4-721953c60e9b")
public static String es_PE_FIELD_Invoice_EMailAddress_Help="El Email indica la ID de correo electrónico para este usuario";

@XendraField(AD_Column_ID="EMail",IsCentrallyMaintained=true,
AD_Tab_ID="11efe735-03c1-85ba-6012-804fe516b95d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=350,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="cc83005f-58ac-1c3c-b5c4-721953c60e9b")
public static final String FIELDNAME_Invoice_EMailAddress="cc83005f-58ac-1c3c-b5c4-721953c60e9b";

@XendraTrl(Identifier="9016b215-af5c-dc5c-ac93-3fa2041248e1")
public static String es_PE_COLUMN_EMail_Name="Email";

@XendraColumn(AD_Element_ID="d18b300c-9ad6-2dd2-36d3-b65969743158",ColumnName="EMail",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9016b215-af5c-dc5c-ac93-3fa2041248e1",
Synchronized="2019-08-30 22:22:50.0")
/** Column name EMail */
public static final String COLUMNNAME_EMail = "EMail";
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
@XendraTrl(Identifier="9c94c03a-da57-4bf3-a26d-224c117dc12a")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9c94c03a-da57-4bf3-a26d-224c117dc12a",
Synchronized="2019-08-30 22:22:50.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Import Error Message.
@param I_ErrorMsg Messages generated from import process */
public void setI_ErrorMsg (String I_ErrorMsg)
{
if (I_ErrorMsg != null && I_ErrorMsg.length() > 2000)
{
log.warning("Length > 2000 - truncated");
I_ErrorMsg = I_ErrorMsg.substring(0,1999);
}
set_Value (COLUMNNAME_I_ErrorMsg, I_ErrorMsg);
}
/** Get Import Error Message.
@return Messages generated from import process */
public String getI_ErrorMsg() 
{
String value = (String)get_Value(COLUMNNAME_I_ErrorMsg);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="d3c57588-cc84-0b0d-1b6f-85b7ae7b6cb9")
public static String es_PE_FIELD_Invoice_ImportErrorMessage_Name="Mensajes de Error al Importar";

@XendraTrl(Identifier="d3c57588-cc84-0b0d-1b6f-85b7ae7b6cb9")
public static String es_PE_FIELD_Invoice_ImportErrorMessage_Description="Mensajes generados desde procesos de importación";

@XendraTrl(Identifier="d3c57588-cc84-0b0d-1b6f-85b7ae7b6cb9")
public static String es_PE_FIELD_Invoice_ImportErrorMessage_Help="El mensaje de error de Importación despliega cualquier mensaje de error generado durante el proceso de importación.";

@XendraField(AD_Column_ID="I_ErrorMsg",IsCentrallyMaintained=true,
AD_Tab_ID="11efe735-03c1-85ba-6012-804fe516b95d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=true,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d3c57588-cc84-0b0d-1b6f-85b7ae7b6cb9")
public static final String FIELDNAME_Invoice_ImportErrorMessage="d3c57588-cc84-0b0d-1b6f-85b7ae7b6cb9";

@XendraTrl(Identifier="193202df-0ba3-772a-aed5-8c3691fc878a")
public static String es_PE_COLUMN_I_ErrorMsg_Name="Mensajes de Error al Importar";

@XendraColumn(AD_Element_ID="e512e524-25c8-eddd-ad88-d2ce6b66fdc7",ColumnName="I_ErrorMsg",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="193202df-0ba3-772a-aed5-8c3691fc878a",
Synchronized="2019-08-30 22:22:50.0")
/** Column name I_ErrorMsg */
public static final String COLUMNNAME_I_ErrorMsg = "I_ErrorMsg";
/** Set Import Invoice.
@param I_Invoice_ID Import Invoice */
public void setI_Invoice_ID (int I_Invoice_ID)
{
if (I_Invoice_ID < 1) throw new IllegalArgumentException ("I_Invoice_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_I_Invoice_ID, Integer.valueOf(I_Invoice_ID));
}
/** Get Import Invoice.
@return Import Invoice */
public int getI_Invoice_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_I_Invoice_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="2110dcf7-741f-4518-293e-c9e869c257b7")
public static String es_PE_FIELD_Invoice_ImportInvoice_Name="Importar Factura";

@XendraTrl(Identifier="2110dcf7-741f-4518-293e-c9e869c257b7")
public static String es_PE_FIELD_Invoice_ImportInvoice_Description="Importar Factura";

@XendraField(AD_Column_ID="I_Invoice_ID",IsCentrallyMaintained=true,
AD_Tab_ID="11efe735-03c1-85ba-6012-804fe516b95d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="Y=N",DisplayLength=14,IsReadOnly=false,SeqNo=20,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2110dcf7-741f-4518-293e-c9e869c257b7")
public static final String FIELDNAME_Invoice_ImportInvoice="2110dcf7-741f-4518-293e-c9e869c257b7";
/** Column name I_Invoice_ID */
public static final String COLUMNNAME_I_Invoice_ID = "I_Invoice_ID";
/** Set Imported.
@param I_IsImported Has this import been processed */
public void setI_IsImported (boolean I_IsImported)
{
set_Value (COLUMNNAME_I_IsImported, Boolean.valueOf(I_IsImported));
}
/** Get Imported.
@return Has this import been processed */
public boolean isI_IsImported() 
{
Object oo = get_Value(COLUMNNAME_I_IsImported);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="ee48d4b5-3ab7-b62a-c5c5-17db55a4407b")
public static String es_PE_FIELD_Invoice_Imported_Name="Importar";

@XendraTrl(Identifier="ee48d4b5-3ab7-b62a-c5c5-17db55a4407b")
public static String es_PE_FIELD_Invoice_Imported_Description="Esta importación ha sido procesada";

@XendraTrl(Identifier="ee48d4b5-3ab7-b62a-c5c5-17db55a4407b")
public static String es_PE_FIELD_Invoice_Imported_Help="El cuadro de verificación Importado indica si esta importación ha sido procesada";

@XendraField(AD_Column_ID="I_IsImported",IsCentrallyMaintained=true,
AD_Tab_ID="11efe735-03c1-85ba-6012-804fe516b95d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=true,SeqNo=30,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ee48d4b5-3ab7-b62a-c5c5-17db55a4407b")
public static final String FIELDNAME_Invoice_Imported="ee48d4b5-3ab7-b62a-c5c5-17db55a4407b";

@XendraTrl(Identifier="2668a2b8-c5ea-dea4-04b3-e4e656881990")
public static String es_PE_COLUMN_I_IsImported_Name="Importar";

@XendraColumn(AD_Element_ID="f4939725-7d85-767d-540d-feafa759184b",ColumnName="I_IsImported",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2668a2b8-c5ea-dea4-04b3-e4e656881990",
Synchronized="2019-08-30 22:22:50.0")
/** Column name I_IsImported */
public static final String COLUMNNAME_I_IsImported = "I_IsImported";
/** Set Sales Transaction.
@param IsSOTrx This is a Sales Transaction */
public void setIsSOTrx (boolean IsSOTrx)
{
set_Value (COLUMNNAME_IsSOTrx, Boolean.valueOf(IsSOTrx));
}
/** Get Sales Transaction.
@return This is a Sales Transaction */
public boolean isSOTrx() 
{
Object oo = get_Value(COLUMNNAME_IsSOTrx);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="83e76f96-a177-9f0d-68ec-c46ca9c18529")
public static String es_PE_FIELD_Invoice_SalesTransaction_Name="Transacción de Ventas";

@XendraTrl(Identifier="83e76f96-a177-9f0d-68ec-c46ca9c18529")
public static String es_PE_FIELD_Invoice_SalesTransaction_Description="Esta es una transacción de ventas";

@XendraTrl(Identifier="83e76f96-a177-9f0d-68ec-c46ca9c18529")
public static String es_PE_FIELD_Invoice_SalesTransaction_Help="El cuadro de verificación Transacción de Ventas indica si este ítem es una transacción de ventas";

@XendraField(AD_Column_ID="IsSOTrx",IsCentrallyMaintained=true,
AD_Tab_ID="11efe735-03c1-85ba-6012-804fe516b95d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=120,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="83e76f96-a177-9f0d-68ec-c46ca9c18529")
public static final String FIELDNAME_Invoice_SalesTransaction="83e76f96-a177-9f0d-68ec-c46ca9c18529";

@XendraTrl(Identifier="f1cf8758-d56d-3946-30f9-f5c0acbf0238")
public static String es_PE_COLUMN_IsSOTrx_Name="Transacción de Ventas";

@XendraColumn(AD_Element_ID="4084b69f-a51d-5676-4d8c-395a13e6b2df",ColumnName="IsSOTrx",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f1cf8758-d56d-3946-30f9-f5c0acbf0238",
Synchronized="2019-08-30 22:22:50.0")
/** Column name IsSOTrx */
public static final String COLUMNNAME_IsSOTrx = "IsSOTrx";
/** Set Line Description.
@param LineDescription Description of the Line */
public void setLineDescription (String LineDescription)
{
if (LineDescription != null && LineDescription.length() > 255)
{
log.warning("Length > 255 - truncated");
LineDescription = LineDescription.substring(0,254);
}
set_Value (COLUMNNAME_LineDescription, LineDescription);
}
/** Get Line Description.
@return Description of the Line */
public String getLineDescription() 
{
String value = (String)get_Value(COLUMNNAME_LineDescription);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="8c7f7ea9-2cac-e6b8-095e-258be69580b5")
public static String es_PE_FIELD_Invoice_LineDescription_Name="Descrición de la Línea";

@XendraTrl(Identifier="8c7f7ea9-2cac-e6b8-095e-258be69580b5")
public static String es_PE_FIELD_Invoice_LineDescription_Description="Descripción de la Línea";

@XendraField(AD_Column_ID="LineDescription",IsCentrallyMaintained=true,
AD_Tab_ID="11efe735-03c1-85ba-6012-804fe516b95d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=440,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8c7f7ea9-2cac-e6b8-095e-258be69580b5")
public static final String FIELDNAME_Invoice_LineDescription="8c7f7ea9-2cac-e6b8-095e-258be69580b5";

@XendraTrl(Identifier="a9aeb181-f861-3021-5d95-c47d3c55b381")
public static String es_PE_COLUMN_LineDescription_Name="Descrición de la Línea";

@XendraColumn(AD_Element_ID="733f7ba4-3f04-2155-01fd-78a2da4f49a3",ColumnName="LineDescription",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a9aeb181-f861-3021-5d95-c47d3c55b381",
Synchronized="2019-08-30 22:22:50.0")
/** Column name LineDescription */
public static final String COLUMNNAME_LineDescription = "LineDescription";
/** Set M_PriceList_ID.
@param M_PriceList_ID Unique identifier of a Price List */
public void setM_PriceList_ID (int M_PriceList_ID)
{
if (M_PriceList_ID <= 0) set_Value (COLUMNNAME_M_PriceList_ID, null);
 else 
set_Value (COLUMNNAME_M_PriceList_ID, Integer.valueOf(M_PriceList_ID));
}
/** Get M_PriceList_ID.
@return Unique identifier of a Price List */
public int getM_PriceList_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_PriceList_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="a1008f93-ce87-8835-ddc9-f600ef1e18ff")
public static String es_PE_FIELD_Invoice_M_PriceList_ID_Name="Lista de Precios";

@XendraTrl(Identifier="a1008f93-ce87-8835-ddc9-f600ef1e18ff")
public static String es_PE_FIELD_Invoice_M_PriceList_ID_Description="Identificador único de mi lista de precios";

@XendraTrl(Identifier="a1008f93-ce87-8835-ddc9-f600ef1e18ff")
public static String es_PE_FIELD_Invoice_M_PriceList_ID_Help="Listas de precios son usadas para determinar el precio; margen y costo de artículos comprados ó vendidos.";

@XendraField(AD_Column_ID="M_PriceList_ID",IsCentrallyMaintained=true,
AD_Tab_ID="11efe735-03c1-85ba-6012-804fe516b95d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=160,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a1008f93-ce87-8835-ddc9-f600ef1e18ff")
public static final String FIELDNAME_Invoice_M_PriceList_ID="a1008f93-ce87-8835-ddc9-f600ef1e18ff";

@XendraTrl(Identifier="11b01e74-d034-40fa-3316-a79c6aabf078")
public static String es_PE_COLUMN_M_PriceList_ID_Name="Lista de Precios";

@XendraColumn(AD_Element_ID="652afdd3-9ff1-082d-5831-6aad828e0e09",ColumnName="M_PriceList_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="11b01e74-d034-40fa-3316-a79c6aabf078",
Synchronized="2019-08-30 22:22:50.0")
/** Column name M_PriceList_ID */
public static final String COLUMNNAME_M_PriceList_ID = "M_PriceList_ID";
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

@XendraTrl(Identifier="44026de0-8f4e-0ca3-a73f-2bc6089cfc0b")
public static String es_PE_FIELD_Invoice_Product_Name="Producto";

@XendraTrl(Identifier="44026de0-8f4e-0ca3-a73f-2bc6089cfc0b")
public static String es_PE_FIELD_Invoice_Product_Description="Producto; servicio ó artículo.";

@XendraTrl(Identifier="44026de0-8f4e-0ca3-a73f-2bc6089cfc0b")
public static String es_PE_FIELD_Invoice_Product_Help="Identifica un artículo que puede ser comprado ó vendido es esta organización.";

@XendraField(AD_Column_ID="M_Product_ID",IsCentrallyMaintained=true,
AD_Tab_ID="11efe735-03c1-85ba-6012-804fe516b95d",AD_FieldGroup_ID="Product",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=380,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="44026de0-8f4e-0ca3-a73f-2bc6089cfc0b")
public static final String FIELDNAME_Invoice_Product="44026de0-8f4e-0ca3-a73f-2bc6089cfc0b";

@XendraTrl(Identifier="8253df00-1ebb-14fc-61d0-eb921dccf5d8")
public static String es_PE_COLUMN_M_Product_ID_Name="Producto";

@XendraColumn(AD_Element_ID="b4701f57-f2fc-567c-58e2-a6aefbc3932c",ColumnName="M_Product_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="8253df00-1ebb-14fc-61d0-eb921dccf5d8",
Synchronized="2019-08-30 22:22:50.0")
/** Column name M_Product_ID */
public static final String COLUMNNAME_M_Product_ID = "M_Product_ID";
/** Set Name.
@param Name Alphanumeric identifier of the entity */
public void setName (String Name)
{
if (Name != null && Name.length() > 60)
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
@XendraTrl(Identifier="7182ad1d-0fe7-1f6c-b3d4-1b62bd7be7fc")
public static String es_PE_FIELD_Invoice_Name_Name="Nombre";

@XendraTrl(Identifier="7182ad1d-0fe7-1f6c-b3d4-1b62bd7be7fc")
public static String es_PE_FIELD_Invoice_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="7182ad1d-0fe7-1f6c-b3d4-1b62bd7be7fc")
public static String es_PE_FIELD_Invoice_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraField(AD_Column_ID="Name",IsCentrallyMaintained=true,
AD_Tab_ID="11efe735-03c1-85ba-6012-804fe516b95d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=210,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7182ad1d-0fe7-1f6c-b3d4-1b62bd7be7fc")
public static final String FIELDNAME_Invoice_Name="7182ad1d-0fe7-1f6c-b3d4-1b62bd7be7fc";

@XendraTrl(Identifier="dd817a27-d136-0646-d6d1-c580bcc0ba6f")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="dd817a27-d136-0646-d6d1-c580bcc0ba6f",
Synchronized="2019-08-30 22:22:50.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
/** Set Payment Term Key.
@param PaymentTermValue Key of the Payment Term */
public void setPaymentTermValue (String PaymentTermValue)
{
if (PaymentTermValue != null && PaymentTermValue.length() > 40)
{
log.warning("Length > 40 - truncated");
PaymentTermValue = PaymentTermValue.substring(0,39);
}
set_Value (COLUMNNAME_PaymentTermValue, PaymentTermValue);
}
/** Get Payment Term Key.
@return Key of the Payment Term */
public String getPaymentTermValue() 
{
String value = (String)get_Value(COLUMNNAME_PaymentTermValue);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="b7a86f27-5aa6-e4dc-94ce-4756a05390ec")
public static String es_PE_FIELD_Invoice_PaymentTermKey_Name="Clave Termino Pagos";

@XendraTrl(Identifier="b7a86f27-5aa6-e4dc-94ce-4756a05390ec")
public static String es_PE_FIELD_Invoice_PaymentTermKey_Description="Clave del termino de Pago";

@XendraField(AD_Column_ID="PaymentTermValue",IsCentrallyMaintained=true,
AD_Tab_ID="11efe735-03c1-85ba-6012-804fe516b95d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=170,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b7a86f27-5aa6-e4dc-94ce-4756a05390ec")
public static final String FIELDNAME_Invoice_PaymentTermKey="b7a86f27-5aa6-e4dc-94ce-4756a05390ec";

@XendraTrl(Identifier="e59497aa-0268-9d30-84d5-4156101174c4")
public static String es_PE_COLUMN_PaymentTermValue_Name="Clave Termino Pagos";

@XendraColumn(AD_Element_ID="5c0d18e2-ed10-54b1-2224-726d719adbf6",ColumnName="PaymentTermValue",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e59497aa-0268-9d30-84d5-4156101174c4",
Synchronized="2019-08-30 22:22:50.0")
/** Column name PaymentTermValue */
public static final String COLUMNNAME_PaymentTermValue = "PaymentTermValue";
/** Set Phone.
@param Phone Identifies a telephone number */
public void setPhone (String Phone)
{
if (Phone != null && Phone.length() > 40)
{
log.warning("Length > 40 - truncated");
Phone = Phone.substring(0,39);
}
set_Value (COLUMNNAME_Phone, Phone);
}
/** Get Phone.
@return Identifies a telephone number */
public String getPhone() 
{
String value = (String)get_Value(COLUMNNAME_Phone);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="d382f8fa-a216-9587-44d1-6272a5c92600")
public static String es_PE_FIELD_Invoice_Phone_Name="Teléfono";

@XendraTrl(Identifier="d382f8fa-a216-9587-44d1-6272a5c92600")
public static String es_PE_FIELD_Invoice_Phone_Description="Identifica un número telefónico";

@XendraTrl(Identifier="d382f8fa-a216-9587-44d1-6272a5c92600")
public static String es_PE_FIELD_Invoice_Phone_Help="El campo teléfono identifica un No. telefónico.";

@XendraField(AD_Column_ID="Phone",IsCentrallyMaintained=true,
AD_Tab_ID="11efe735-03c1-85ba-6012-804fe516b95d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=340,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d382f8fa-a216-9587-44d1-6272a5c92600")
public static final String FIELDNAME_Invoice_Phone="d382f8fa-a216-9587-44d1-6272a5c92600";

@XendraTrl(Identifier="1769daa0-159e-7cc7-f910-fac5a7c46bf3")
public static String es_PE_COLUMN_Phone_Name="Teléfono";

@XendraColumn(AD_Element_ID="4842df23-a82d-d921-7e1e-5869844caceb",ColumnName="Phone",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="1769daa0-159e-7cc7-f910-fac5a7c46bf3",
Synchronized="2019-08-30 22:22:50.0")
/** Column name Phone */
public static final String COLUMNNAME_Phone = "Phone";
/** Set ZIP.
@param Postal Postal code */
public void setPostal (String Postal)
{
if (Postal != null && Postal.length() > 10)
{
log.warning("Length > 10 - truncated");
Postal = Postal.substring(0,9);
}
set_Value (COLUMNNAME_Postal, Postal);
}
/** Get ZIP.
@return Postal code */
public String getPostal() 
{
String value = (String)get_Value(COLUMNNAME_Postal);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="e9771476-4594-8416-e8d6-262c1a2bfc27")
public static String es_PE_FIELD_Invoice_ZIP_Name="Código Postal";

@XendraTrl(Identifier="e9771476-4594-8416-e8d6-262c1a2bfc27")
public static String es_PE_FIELD_Invoice_ZIP_Description="Código Postal";

@XendraTrl(Identifier="e9771476-4594-8416-e8d6-262c1a2bfc27")
public static String es_PE_FIELD_Invoice_ZIP_Help="El campo Código Postal identifica el código postal para esta entidad";

@XendraField(AD_Column_ID="Postal",IsCentrallyMaintained=true,
AD_Tab_ID="11efe735-03c1-85ba-6012-804fe516b95d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=270,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e9771476-4594-8416-e8d6-262c1a2bfc27")
public static final String FIELDNAME_Invoice_ZIP="e9771476-4594-8416-e8d6-262c1a2bfc27";

@XendraTrl(Identifier="bb9598ba-5a4b-c8cf-1eef-728d55d20cf2")
public static String es_PE_COLUMN_Postal_Name="Código Postal";

@XendraColumn(AD_Element_ID="b91ba048-ef4f-31e3-3865-fa3cff649df8",ColumnName="Postal",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="bb9598ba-5a4b-c8cf-1eef-728d55d20cf2",
Synchronized="2019-08-30 22:22:50.0")
/** Column name Postal */
public static final String COLUMNNAME_Postal = "Postal";
/** Set Unit Price.
@param PriceActual Actual Price  */
public void setPriceActual (BigDecimal PriceActual)
{
set_Value (COLUMNNAME_PriceActual, PriceActual);
}
/** Get Unit Price.
@return Actual Price  */
public BigDecimal getPriceActual() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_PriceActual);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="8f61bf53-4fb7-94d3-d56e-0a404f5fd95d")
public static String es_PE_FIELD_Invoice_UnitPrice_Name="Precio Actual";

@XendraTrl(Identifier="8f61bf53-4fb7-94d3-d56e-0a404f5fd95d")
public static String es_PE_FIELD_Invoice_UnitPrice_Description="Precio Actual";

@XendraTrl(Identifier="8f61bf53-4fb7-94d3-d56e-0a404f5fd95d")
public static String es_PE_FIELD_Invoice_UnitPrice_Help="El precio Actual ó Unitario indica el precio para un producto en la moneda fuente.";

@XendraField(AD_Column_ID="PriceActual",IsCentrallyMaintained=true,
AD_Tab_ID="11efe735-03c1-85ba-6012-804fe516b95d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=430,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8f61bf53-4fb7-94d3-d56e-0a404f5fd95d")
public static final String FIELDNAME_Invoice_UnitPrice="8f61bf53-4fb7-94d3-d56e-0a404f5fd95d";

@XendraTrl(Identifier="448911e8-1a71-582f-b4b9-8fc4f3f7cd7c")
public static String es_PE_COLUMN_PriceActual_Name="Precio Actual";

@XendraColumn(AD_Element_ID="8ee15d33-8f4b-598f-dc4c-9d67f968a13c",ColumnName="PriceActual",
AD_Reference_ID=37,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="448911e8-1a71-582f-b4b9-8fc4f3f7cd7c",
Synchronized="2019-08-30 22:22:50.0")
/** Column name PriceActual */
public static final String COLUMNNAME_PriceActual = "PriceActual";
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

@XendraTrl(Identifier="d1fb5571-0a3e-7924-8628-f7f0162df4fd")
public static String es_PE_FIELD_Invoice_Processed_Name="Procesado";

@XendraTrl(Identifier="d1fb5571-0a3e-7924-8628-f7f0162df4fd")
public static String es_PE_FIELD_Invoice_Processed_Description="El documento ha sido procesado";

@XendraTrl(Identifier="d1fb5571-0a3e-7924-8628-f7f0162df4fd")
public static String es_PE_FIELD_Invoice_Processed_Help="El cuadro de verificación procesada indica que un documento ha sido procesado";

@XendraField(AD_Column_ID="Processed",IsCentrallyMaintained=true,
AD_Tab_ID="11efe735-03c1-85ba-6012-804fe516b95d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=true,SeqNo=530,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d1fb5571-0a3e-7924-8628-f7f0162df4fd")
public static final String FIELDNAME_Invoice_Processed="d1fb5571-0a3e-7924-8628-f7f0162df4fd";

@XendraTrl(Identifier="7d55d4ea-8386-a199-6f70-adc54853cefd")
public static String es_PE_COLUMN_Processed_Name="Procesado";

@XendraColumn(AD_Element_ID="3f7035d2-fa5e-7416-fc0c-e49e43f9e083",ColumnName="Processed",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7d55d4ea-8386-a199-6f70-adc54853cefd",
Synchronized="2019-08-30 22:22:50.0")
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

@XendraTrl(Identifier="dc266ce2-fc54-22f7-1beb-87f0321a490d")
public static String es_PE_FIELD_Invoice_ProcessNow_Name="Importación de Factura";

@XendraTrl(Identifier="dc266ce2-fc54-22f7-1beb-87f0321a490d")
public static String es_PE_FIELD_Invoice_ProcessNow_Description="Importación de Factura";

@XendraTrl(Identifier="dc266ce2-fc54-22f7-1beb-87f0321a490d")
public static String es_PE_FIELD_Invoice_ProcessNow_Help="Los parámetros son valores prefijados para los valores nulos del expediente de la importación, ellos no sobreescriben ningunos datos.";

@XendraField(AD_Column_ID="Processing",IsCentrallyMaintained=true,
AD_Tab_ID="11efe735-03c1-85ba-6012-804fe516b95d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=520,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="dc266ce2-fc54-22f7-1beb-87f0321a490d")
public static final String FIELDNAME_Invoice_ProcessNow="dc266ce2-fc54-22f7-1beb-87f0321a490d";

@XendraTrl(Identifier="f641496c-2aa3-5373-168c-b7470aa12d52")
public static String es_PE_COLUMN_Processing_Name="Procesar Ahora";

@XendraColumn(AD_Element_ID="f2096404-1a98-35ec-09ea-273b3e19b7de",ColumnName="Processing",
AD_Reference_ID=28,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="dc683745-d469-dbed-8820-63e4dc2084cb",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="f641496c-2aa3-5373-168c-b7470aa12d52",Synchronized="2019-08-30 22:22:50.0")
/** Column name Processing */
public static final String COLUMNNAME_Processing = "Processing";
/** Set Product Key.
@param ProductValue Key of the Product */
public void setProductValue (String ProductValue)
{
if (ProductValue != null && ProductValue.length() > 40)
{
log.warning("Length > 40 - truncated");
ProductValue = ProductValue.substring(0,39);
}
set_Value (COLUMNNAME_ProductValue, ProductValue);
}
/** Get Product Key.
@return Key of the Product */
public String getProductValue() 
{
String value = (String)get_Value(COLUMNNAME_ProductValue);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="73438299-2ec3-778b-4d35-2f769254a04b")
public static String es_PE_FIELD_Invoice_ProductKey_Name="Sólo Valor de Producto";

@XendraTrl(Identifier="73438299-2ec3-778b-4d35-2f769254a04b")
public static String es_PE_FIELD_Invoice_ProductKey_Description="Generar lista de conteo solamente para este valor del producto (Usted puede usar %)";

@XendraField(AD_Column_ID="ProductValue",IsCentrallyMaintained=true,
AD_Tab_ID="11efe735-03c1-85ba-6012-804fe516b95d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=390,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="73438299-2ec3-778b-4d35-2f769254a04b")
public static final String FIELDNAME_Invoice_ProductKey="73438299-2ec3-778b-4d35-2f769254a04b";

@XendraTrl(Identifier="26f97236-4508-5bcc-431c-3e546cf3f848")
public static String es_PE_COLUMN_ProductValue_Name="Sólo Valor de Producto";

@XendraColumn(AD_Element_ID="3c72be08-8fa7-5282-1e16-ddcbc46035d8",ColumnName="ProductValue",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="26f97236-4508-5bcc-431c-3e546cf3f848",
Synchronized="2019-08-30 22:22:50.0")
/** Column name ProductValue */
public static final String COLUMNNAME_ProductValue = "ProductValue";
/** Set Ordered Quantity.
@param QtyOrdered Ordered Quantity */
public void setQtyOrdered (BigDecimal QtyOrdered)
{
set_Value (COLUMNNAME_QtyOrdered, QtyOrdered);
}
/** Get Ordered Quantity.
@return Ordered Quantity */
public BigDecimal getQtyOrdered() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_QtyOrdered);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="4a2648cf-9c93-4fdf-24e3-91614e8da65e")
public static String es_PE_FIELD_Invoice_OrderedQuantity_Name="Cantidad Ordenada";

@XendraTrl(Identifier="4a2648cf-9c93-4fdf-24e3-91614e8da65e")
public static String es_PE_FIELD_Invoice_OrderedQuantity_Description="Cantidad ordenada";

@XendraTrl(Identifier="4a2648cf-9c93-4fdf-24e3-91614e8da65e")
public static String es_PE_FIELD_Invoice_OrderedQuantity_Help="La Cantidad Ordenada indica la cantidad de un producto que fue ordenada";

@XendraField(AD_Column_ID="QtyOrdered",IsCentrallyMaintained=true,
AD_Tab_ID="11efe735-03c1-85ba-6012-804fe516b95d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=420,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="4a2648cf-9c93-4fdf-24e3-91614e8da65e")
public static final String FIELDNAME_Invoice_OrderedQuantity="4a2648cf-9c93-4fdf-24e3-91614e8da65e";

@XendraTrl(Identifier="0ec3b85b-5407-fd15-0b56-e78f28173ead")
public static String es_PE_COLUMN_QtyOrdered_Name="Cantidad Ordenada";

@XendraColumn(AD_Element_ID="2f601325-19ce-9544-d9df-693c76cbde8a",ColumnName="QtyOrdered",
AD_Reference_ID=29,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0ec3b85b-5407-fd15-0b56-e78f28173ead",
Synchronized="2019-08-30 22:22:50.0")
/** Column name QtyOrdered */
public static final String COLUMNNAME_QtyOrdered = "QtyOrdered";
/** Set Region.
@param RegionName Name of the Region */
public void setRegionName (String RegionName)
{
if (RegionName != null && RegionName.length() > 60)
{
log.warning("Length > 60 - truncated");
RegionName = RegionName.substring(0,59);
}
set_Value (COLUMNNAME_RegionName, RegionName);
}
/** Get Region.
@return Name of the Region */
public String getRegionName() 
{
String value = (String)get_Value(COLUMNNAME_RegionName);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="3247c811-b826-f1ed-6e61-6839f112cc37")
public static String es_PE_FIELD_Invoice_Region2_Name="Nombre de Región";

@XendraTrl(Identifier="3247c811-b826-f1ed-6e61-6839f112cc37")
public static String es_PE_FIELD_Invoice_Region2_Description="Nombre de esta región";

@XendraTrl(Identifier="3247c811-b826-f1ed-6e61-6839f112cc37")
public static String es_PE_FIELD_Invoice_Region2_Help="El nombre de región define el nombre que se imprimirá cuando esta región se use en un documento.";

@XendraField(AD_Column_ID="RegionName",IsCentrallyMaintained=true,
AD_Tab_ID="11efe735-03c1-85ba-6012-804fe516b95d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=280,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3247c811-b826-f1ed-6e61-6839f112cc37")
public static final String FIELDNAME_Invoice_Region2="3247c811-b826-f1ed-6e61-6839f112cc37";

@XendraTrl(Identifier="95d7b059-b721-cd44-c126-85ee26ab38ee")
public static String es_PE_COLUMN_RegionName_Name="Nombre de Región";

@XendraColumn(AD_Element_ID="b2bf2a97-80d5-f41e-ee37-c6093627a1b0",ColumnName="RegionName",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="95d7b059-b721-cd44-c126-85ee26ab38ee",
Synchronized="2019-08-30 22:22:50.0")
/** Column name RegionName */
public static final String COLUMNNAME_RegionName = "RegionName";
/** Set Sales Representative.
@param SalesRep_ID Sales Representative or Company Agent */
public void setSalesRep_ID (int SalesRep_ID)
{
if (SalesRep_ID <= 0) set_Value (COLUMNNAME_SalesRep_ID, null);
 else 
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

@XendraTrl(Identifier="44f041d5-1f33-a80a-f220-d8991b957b8f")
public static String es_PE_FIELD_Invoice_SalesRepresentative_Name="Agente Cía";

@XendraTrl(Identifier="44f041d5-1f33-a80a-f220-d8991b957b8f")
public static String es_PE_FIELD_Invoice_SalesRepresentative_Description="Representante de Ventas";

@XendraTrl(Identifier="44f041d5-1f33-a80a-f220-d8991b957b8f")
public static String es_PE_FIELD_Invoice_SalesRepresentative_Help="El representante de ventas indica el representante de ventas para esta región.";

@XendraField(AD_Column_ID="SalesRep_ID",IsCentrallyMaintained=true,
AD_Tab_ID="11efe735-03c1-85ba-6012-804fe516b95d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=140,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="44f041d5-1f33-a80a-f220-d8991b957b8f")
public static final String FIELDNAME_Invoice_SalesRepresentative="44f041d5-1f33-a80a-f220-d8991b957b8f";

@XendraTrl(Identifier="3d3ee242-fe2d-a563-dd22-f0c2094d2c82")
public static String es_PE_COLUMN_SalesRep_ID_Name="Agente Cía";

@XendraColumn(AD_Element_ID="197a9c3a-ff10-c291-d65f-5e05a36d3710",ColumnName="SalesRep_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="15251147-a1b6-4a83-a3a5-2d3ae7db69d9",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="3d3ee242-fe2d-a563-dd22-f0c2094d2c82",Synchronized="2019-08-30 22:22:51.0")
/** Column name SalesRep_ID */
public static final String COLUMNNAME_SalesRep_ID = "SalesRep_ID";
/** Set Document Serial.
@param Serial Serial Number for the Document */
public void setSerial (String Serial)
{
if (Serial != null && Serial.length() > 10)
{
log.warning("Length > 10 - truncated");
Serial = Serial.substring(0,9);
}
set_Value (COLUMNNAME_Serial, Serial);
}
/** Get Document Serial.
@return Serial Number for the Document */
public String getSerial() 
{
String value = (String)get_Value(COLUMNNAME_Serial);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="83ef0a56-423d-3a41-ef4f-aa29a8eaea7d")
public static String es_PE_COLUMN_Serial_Name="Document Serial";

@XendraColumn(AD_Element_ID="56277733-3963-25db-320e-99e754ca1e9c",ColumnName="Serial",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="83ef0a56-423d-3a41-ef4f-aa29a8eaea7d",
Synchronized="2019-08-30 22:22:51.0")
/** Column name Serial */
public static final String COLUMNNAME_Serial = "Serial";
/** Set SKU.
@param SKU Stock Keeping Unit */
public void setSKU (String SKU)
{
if (SKU != null && SKU.length() > 30)
{
log.warning("Length > 30 - truncated");
SKU = SKU.substring(0,29);
}
set_Value (COLUMNNAME_SKU, SKU);
}
/** Get SKU.
@return Stock Keeping Unit */
public String getSKU() 
{
String value = (String)get_Value(COLUMNNAME_SKU);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="1e515c5a-647b-0757-64e5-a623c902c22c")
public static String es_PE_FIELD_Invoice_SKU_Name="UM Almacenamiento";

@XendraTrl(Identifier="1e515c5a-647b-0757-64e5-a623c902c22c")
public static String es_PE_FIELD_Invoice_SKU_Description="Unidad de Mantenimiento en Inventario";

@XendraTrl(Identifier="1e515c5a-647b-0757-64e5-a623c902c22c")
public static String es_PE_FIELD_Invoice_SKU_Help="El SKU indica la unidad de almacenamiento de inventario definida por el usuario. Puede ser usada por  una simbología adicional de código de barras ó por su propio esquema .";

@XendraField(AD_Column_ID="SKU",IsCentrallyMaintained=true,
AD_Tab_ID="11efe735-03c1-85ba-6012-804fe516b95d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=400,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1e515c5a-647b-0757-64e5-a623c902c22c")
public static final String FIELDNAME_Invoice_SKU="1e515c5a-647b-0757-64e5-a623c902c22c";

@XendraTrl(Identifier="49afff16-037f-f4d2-73e0-9da4ff1df6a5")
public static String es_PE_COLUMN_SKU_Name="UM Almacenamiento";

@XendraColumn(AD_Element_ID="f473a6ed-4a3f-b6fd-5b0f-06d49c1e65e2",ColumnName="SKU",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=30,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="49afff16-037f-f4d2-73e0-9da4ff1df6a5",
Synchronized="2019-08-30 22:22:51.0")
/** Column name SKU */
public static final String COLUMNNAME_SKU = "SKU";
/** Set Tax Amount.
@param TaxAmt Tax Amount for a document */
public void setTaxAmt (BigDecimal TaxAmt)
{
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

@XendraTrl(Identifier="d9641935-c2c1-5089-4310-4c9fdf9dbadb")
public static String es_PE_FIELD_Invoice_TaxAmount_Name="Total del Impuesto";

@XendraTrl(Identifier="d9641935-c2c1-5089-4310-4c9fdf9dbadb")
public static String es_PE_FIELD_Invoice_TaxAmount_Description="Total del impuesto para un documento";

@XendraTrl(Identifier="d9641935-c2c1-5089-4310-4c9fdf9dbadb")
public static String es_PE_FIELD_Invoice_TaxAmount_Help="El Total de Impuesto despliega el total de impuesto para un documento";

@XendraField(AD_Column_ID="TaxAmt",IsCentrallyMaintained=true,
AD_Tab_ID="11efe735-03c1-85ba-6012-804fe516b95d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=470,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d9641935-c2c1-5089-4310-4c9fdf9dbadb")
public static final String FIELDNAME_Invoice_TaxAmount="d9641935-c2c1-5089-4310-4c9fdf9dbadb";

@XendraTrl(Identifier="42fee7ff-adbb-e72b-a380-c23126f8f76f")
public static String es_PE_COLUMN_TaxAmt_Name="Total del Impuesto";

@XendraColumn(AD_Element_ID="462941e1-a196-170f-fd16-84da06ba50ea",ColumnName="TaxAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="42fee7ff-adbb-e72b-a380-c23126f8f76f",
Synchronized="2019-08-30 22:22:51.0")
/** Column name TaxAmt */
public static final String COLUMNNAME_TaxAmt = "TaxAmt";
/** Set Tax Indicator.
@param TaxIndicator Short form for Tax to be printed on documents */
public void setTaxIndicator (String TaxIndicator)
{
if (TaxIndicator != null && TaxIndicator.length() > 5)
{
log.warning("Length > 5 - truncated");
TaxIndicator = TaxIndicator.substring(0,4);
}
set_Value (COLUMNNAME_TaxIndicator, TaxIndicator);
}
/** Get Tax Indicator.
@return Short form for Tax to be printed on documents */
public String getTaxIndicator() 
{
String value = (String)get_Value(COLUMNNAME_TaxIndicator);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="6b913a67-c977-b37c-804f-6c2e74797da0")
public static String es_PE_FIELD_Invoice_TaxIndicator_Name="Identificador de Impuesto";

@XendraTrl(Identifier="6b913a67-c977-b37c-804f-6c2e74797da0")
public static String es_PE_FIELD_Invoice_TaxIndicator_Description="Forma corta para que el impuesto sea impreso en los documentos";

@XendraTrl(Identifier="6b913a67-c977-b37c-804f-6c2e74797da0")
public static String es_PE_FIELD_Invoice_TaxIndicator_Help="El Indicador de Impuesto identifica el nombre corto que se imprimirá en un documento haciendo referencia a este impuesto.";

@XendraField(AD_Column_ID="TaxIndicator",IsCentrallyMaintained=true,
AD_Tab_ID="11efe735-03c1-85ba-6012-804fe516b95d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=5,IsReadOnly=false,SeqNo=450,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6b913a67-c977-b37c-804f-6c2e74797da0")
public static final String FIELDNAME_Invoice_TaxIndicator="6b913a67-c977-b37c-804f-6c2e74797da0";

@XendraTrl(Identifier="42932ea1-873d-3ce2-71e9-966ec40993a3")
public static String es_PE_COLUMN_TaxIndicator_Name="Identificador de Impuesto";

@XendraColumn(AD_Element_ID="099119b1-a377-e966-4537-2f056d06fb9d",ColumnName="TaxIndicator",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=5,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="42932ea1-873d-3ce2-71e9-966ec40993a3",
Synchronized="2019-08-30 22:22:51.0")
/** Column name TaxIndicator */
public static final String COLUMNNAME_TaxIndicator = "TaxIndicator";
/** Set UPC/EAN.
@param UPC Bar Code (Universal Product Code or its superset European Article Number) */
public void setUPC (String UPC)
{
if (UPC != null && UPC.length() > 30)
{
log.warning("Length > 30 - truncated");
UPC = UPC.substring(0,29);
}
set_Value (COLUMNNAME_UPC, UPC);
}
/** Get UPC/EAN.
@return Bar Code (Universal Product Code or its superset European Article Number) */
public String getUPC() 
{
String value = (String)get_Value(COLUMNNAME_UPC);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="9bc94d30-92ba-f178-9a85-fdb5f9a281c1")
public static String es_PE_FIELD_Invoice_UPCEAN_Name="UPC/EAN";

@XendraTrl(Identifier="9bc94d30-92ba-f178-9a85-fdb5f9a281c1")
public static String es_PE_FIELD_Invoice_UPCEAN_Description="Código de Barras (Codigo universal del Producto ó su super conjunto, Número de Articulo europeo)";

@XendraTrl(Identifier="9bc94d30-92ba-f178-9a85-fdb5f9a281c1")
public static String es_PE_FIELD_Invoice_UPCEAN_Help="Use este campo para introducir el código de barras para el producto en cualquiera de las simbologías del código de barras  (Codabar; Código 25; Código 39; Código 93; Código 128; UPC (A); UPC (E); EAN-13; EAN-8; ITF; ITF-14; ISBN; ISSN; JAN-13; JAN-8; POSTNET y FIM; MSI/Plessey; y Pharmacode)";

@XendraField(AD_Column_ID="UPC",IsCentrallyMaintained=true,
AD_Tab_ID="11efe735-03c1-85ba-6012-804fe516b95d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=410,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9bc94d30-92ba-f178-9a85-fdb5f9a281c1")
public static final String FIELDNAME_Invoice_UPCEAN="9bc94d30-92ba-f178-9a85-fdb5f9a281c1";

@XendraTrl(Identifier="c9b4b65e-0d0c-f2b5-6d42-c2c7c8071486")
public static String es_PE_COLUMN_UPC_Name="UPC/EAN";

@XendraColumn(AD_Element_ID="9e36272a-ec41-b187-d531-cec50070c612",ColumnName="UPC",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=30,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c9b4b65e-0d0c-f2b5-6d42-c2c7c8071486",
Synchronized="2019-08-30 22:22:51.0")
/** Column name UPC */
public static final String COLUMNNAME_UPC = "UPC";
}
