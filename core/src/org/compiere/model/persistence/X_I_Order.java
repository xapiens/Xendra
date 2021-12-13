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
/** Generated Model for I_Order
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_I_Order extends PO
{
/** Standard Constructor
@param ctx context
@param I_Order_ID id
@param trxName transaction
*/
public X_I_Order (Properties ctx, int I_Order_ID, String trxName)
{
super (ctx, I_Order_ID, trxName);
/** if (I_Order_ID == 0)
{
setI_IsImported (false);	
// N
setI_Order_ID (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_I_Order (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=591 */
public static int Table_ID=MTable.getTable_ID("I_Order");

@XendraTrl(Identifier="0117aed8-fd79-d3b4-27b9-7da5aa03a9e6")
public static String es_PE_TAB_Order_Description="Importar Ordenes";

@XendraTrl(Identifier="0117aed8-fd79-d3b4-27b9-7da5aa03a9e6")
public static String es_PE_TAB_Order_Help="Usted debe proveer el nombre del tipo de documento (ó la identificación). El tipo de documento está en el propósito derivado no completamente pues tiene también muchas consecuencias si es incorrecto. La mejor manera es fijar el nombre del tipo de documento pues una constante en su formato del archivo de la importación ó como campo importado en el archivo.";

@XendraTrl(Identifier="0117aed8-fd79-d3b4-27b9-7da5aa03a9e6")
public static String es_PE_TAB_Order_Name="Orden";
@XendraTab(Name="Order",
Description="Import Orders",
Help="You should supply the Document Type Name (or ID). The Document Type is on purpose not fully derived as it has too many consequences if it's wrong.  The best way is to set the Document Type Name as a Constant in your Import File Format or as an imported field in the file.",
AD_Window_ID="dca446ef-997f-51e1-b7bf-5764f23efd28",SeqNo=10,TabLevel=0,IsSingleRow=true,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="0117aed8-fd79-d3b4-27b9-7da5aa03a9e6",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Order="0117aed8-fd79-d3b4-27b9-7da5aa03a9e6";

@XendraTrl(Identifier="0683341b-870b-a9ec-500c-bf6601562f67")
public static String es_PE_TABLE_I_Order_Name="Importar Ordenes";

@XendraTable(Name="Import Order",AD_Package_ID="645f34c0-ea3a-ac63-618d-8ca49873c33b",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="Import Orders",Help="",
TableName="I_Order",AccessLevel="2",AD_Window_ID="dca446ef-997f-51e1-b7bf-5764f23efd28",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=145,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.import",
Identifier="0683341b-870b-a9ec-500c-bf6601562f67",Synchronized="2020-03-03 21:38:11.0")
/** TableName=I_Order */
public static final String Table_Name="I_Order";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"I_Order");

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
    Table_ID = MTable.getTable_ID("I_Order");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_I_Order[").append(get_ID()).append("]");
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
@XendraTrl(Identifier="a74b036d-d9a2-8544-308c-0bfcf3cfc9dd")
public static String es_PE_FIELD_Order_Address_Name="Calle";

@XendraTrl(Identifier="a74b036d-d9a2-8544-308c-0bfcf3cfc9dd")
public static String es_PE_FIELD_Order_Address_Description="Dirección para esta ubicación";

@XendraTrl(Identifier="a74b036d-d9a2-8544-308c-0bfcf3cfc9dd")
public static String es_PE_FIELD_Order_Address_Help="La Dirección 1 identifica la dirección para una entidad";

@XendraField(AD_Column_ID="Address1",IsCentrallyMaintained=true,
AD_Tab_ID="0117aed8-fd79-d3b4-27b9-7da5aa03a9e6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=280,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a74b036d-d9a2-8544-308c-0bfcf3cfc9dd")
public static final String FIELDNAME_Order_Address="a74b036d-d9a2-8544-308c-0bfcf3cfc9dd";

@XendraTrl(Identifier="b250d476-68eb-04dc-d1d0-813d6fa11d69")
public static String es_PE_COLUMN_Address1_Name="Calle";

@XendraColumn(AD_Element_ID="25535414-be76-de81-69b4-106e2150a04a",ColumnName="Address1",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b250d476-68eb-04dc-d1d0-813d6fa11d69",
Synchronized="2019-08-30 22:22:51.0")
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
@XendraTrl(Identifier="f3e6f2f3-fb84-f72e-8528-51caf3f37bc1")
public static String es_PE_FIELD_Order_Address22_Name="Colonía";

@XendraTrl(Identifier="f3e6f2f3-fb84-f72e-8528-51caf3f37bc1")
public static String es_PE_FIELD_Order_Address22_Description="Dirección 2 para esta ubicación";

@XendraTrl(Identifier="f3e6f2f3-fb84-f72e-8528-51caf3f37bc1")
public static String es_PE_FIELD_Order_Address22_Help="La Dirección 2 provee información de la dirección adicional para una entidad. Puede ser usada para integrar la ubicación; número de apartamento; ó información similar";

@XendraField(AD_Column_ID="Address2",IsCentrallyMaintained=true,
AD_Tab_ID="0117aed8-fd79-d3b4-27b9-7da5aa03a9e6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=290,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f3e6f2f3-fb84-f72e-8528-51caf3f37bc1")
public static final String FIELDNAME_Order_Address22="f3e6f2f3-fb84-f72e-8528-51caf3f37bc1";

@XendraTrl(Identifier="ab4343ab-2b81-98ca-f888-3651cb42aade")
public static String es_PE_COLUMN_Address2_Name="Colonía";

@XendraColumn(AD_Element_ID="a3cd6592-3282-7ed0-953e-16e24d22cc17",ColumnName="Address2",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ab4343ab-2b81-98ca-f888-3651cb42aade",
Synchronized="2019-08-30 22:22:51.0")
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

@XendraTrl(Identifier="b75d6851-59ab-f020-55bd-e685b513b110")
public static String es_PE_FIELD_Order_TrxOrganization_Name="Organización de la Trans.";

@XendraTrl(Identifier="b75d6851-59ab-f020-55bd-e685b513b110")
public static String es_PE_FIELD_Order_TrxOrganization_Description="Organización que inicia ó ejecuta la transacción";

@XendraTrl(Identifier="b75d6851-59ab-f020-55bd-e685b513b110")
public static String es_PE_FIELD_Order_TrxOrganization_Help="La organización que inicia ó ejecuta la transacción (para otra organización). La organización poseedora puede no ser la organización de la transacción en un ambiente de buró de servicio; con servicios centralizados y transacciones inter- organización.";

@XendraField(AD_Column_ID="AD_OrgTrx_ID",IsCentrallyMaintained=true,
AD_Tab_ID="0117aed8-fd79-d3b4-27b9-7da5aa03a9e6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=560,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b75d6851-59ab-f020-55bd-e685b513b110")
public static final String FIELDNAME_Order_TrxOrganization="b75d6851-59ab-f020-55bd-e685b513b110";

@XendraTrl(Identifier="d00b0520-5f6e-44f2-3a6a-b90116189d33")
public static String es_PE_COLUMN_AD_OrgTrx_ID_Name="Organización de la Trans.";

@XendraColumn(AD_Element_ID="b4180358-67aa-fe55-0409-6367a60e0a2e",ColumnName="AD_OrgTrx_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="54e78591-f7f4-c613-ea27-e64b3dac5198",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="d00b0520-5f6e-44f2-3a6a-b90116189d33",Synchronized="2019-08-30 22:22:51.0")
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

@XendraTrl(Identifier="91751575-75e9-fa05-c032-5ee836da787c")
public static String es_PE_FIELD_Order_UserContact_Name="Usuario";

@XendraTrl(Identifier="91751575-75e9-fa05-c032-5ee836da787c")
public static String es_PE_FIELD_Order_UserContact_Description="ID de Usuario dentro del sistema";

@XendraTrl(Identifier="91751575-75e9-fa05-c032-5ee836da787c")
public static String es_PE_FIELD_Order_UserContact_Help="La ID de usuario identifica un usuario único en el sistema";

@XendraField(AD_Column_ID="AD_User_ID",IsCentrallyMaintained=true,
AD_Tab_ID="0117aed8-fd79-d3b4-27b9-7da5aa03a9e6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=360,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="91751575-75e9-fa05-c032-5ee836da787c")
public static final String FIELDNAME_Order_UserContact="91751575-75e9-fa05-c032-5ee836da787c";

@XendraTrl(Identifier="f99e6d0d-91b1-ca95-f211-8cad0d87e618")
public static String es_PE_COLUMN_AD_User_ID_Name="Usuario";

@XendraColumn(AD_Element_ID="abdf8dee-d3cd-73ec-c758-683e907797f4",ColumnName="AD_User_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="f4ac36a1-4200-1386-677e-14ac90afb4fe",
FieldLength=22,DefaultValue="-1",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="f99e6d0d-91b1-ca95-f211-8cad0d87e618",Synchronized="2019-08-30 22:22:51.0")
/** Column name AD_User_ID */
public static final String COLUMNNAME_AD_User_ID = "AD_User_ID";
/** Set Invoice To.
@param BillTo_ID Bill to Address */
public void setBillTo_ID (int BillTo_ID)
{
if (BillTo_ID <= 0) set_Value (COLUMNNAME_BillTo_ID, null);
 else 
set_Value (COLUMNNAME_BillTo_ID, Integer.valueOf(BillTo_ID));
}
/** Get Invoice To.
@return Bill to Address */
public int getBillTo_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_BillTo_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="062f7c6c-66ce-6c6f-32a6-f7f520f58331")
public static String es_PE_FIELD_Order_InvoiceTo_Name="Facturar A";

@XendraTrl(Identifier="062f7c6c-66ce-6c6f-32a6-f7f520f58331")
public static String es_PE_FIELD_Order_InvoiceTo_Description="Dirección de Facturar A";

@XendraTrl(Identifier="062f7c6c-66ce-6c6f-32a6-f7f520f58331")
public static String es_PE_FIELD_Order_InvoiceTo_Help="El Facturar A indica la dirección a usar cuando se emiten las facturas";

@XendraField(AD_Column_ID="BillTo_ID",IsCentrallyMaintained=true,
AD_Tab_ID="0117aed8-fd79-d3b4-27b9-7da5aa03a9e6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=250,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="062f7c6c-66ce-6c6f-32a6-f7f520f58331")
public static final String FIELDNAME_Order_InvoiceTo="062f7c6c-66ce-6c6f-32a6-f7f520f58331";

@XendraTrl(Identifier="59e521c6-f37c-1972-053e-296129d08b16")
public static String es_PE_COLUMN_BillTo_ID_Name="Facturar A";

@XendraColumn(AD_Element_ID="25e579cd-9b0c-fba9-a72a-27d3818949c7",ColumnName="BillTo_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="8d01ccac-6606-99a5-ebc2-5a6e01980b37",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="59e521c6-f37c-1972-053e-296129d08b16",Synchronized="2019-08-30 22:22:51.0")
/** Column name BillTo_ID */
public static final String COLUMNNAME_BillTo_ID = "BillTo_ID";
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
@XendraTrl(Identifier="69c45254-2941-63a2-64e1-0a4920f37072")
public static String es_PE_FIELD_Order_BusinessPartnerKey_Name="Clave de S.N.";

@XendraTrl(Identifier="69c45254-2941-63a2-64e1-0a4920f37072")
public static String es_PE_FIELD_Order_BusinessPartnerKey_Description="Clave para el S.N.";

@XendraField(AD_Column_ID="BPartnerValue",IsCentrallyMaintained=true,
AD_Tab_ID="0117aed8-fd79-d3b4-27b9-7da5aa03a9e6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=230,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="69c45254-2941-63a2-64e1-0a4920f37072")
public static final String FIELDNAME_Order_BusinessPartnerKey="69c45254-2941-63a2-64e1-0a4920f37072";

@XendraTrl(Identifier="d257640e-8206-8bf6-318c-f5980596f385")
public static String es_PE_COLUMN_BPartnerValue_Name="Clave de S.N.";

@XendraColumn(AD_Element_ID="8128a796-0c52-a502-d53b-7f4fe35f5f78",ColumnName="BPartnerValue",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d257640e-8206-8bf6-318c-f5980596f385",
Synchronized="2019-08-30 22:22:51.0")
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

@XendraTrl(Identifier="3c4aa751-fdd9-478a-e66a-a55ae35603b4")
public static String es_PE_FIELD_Order_Activity_Name="Tipo de Gasto";

@XendraTrl(Identifier="3c4aa751-fdd9-478a-e66a-a55ae35603b4")
public static String es_PE_FIELD_Order_Activity_Description="Actividad de Negocio";

@XendraTrl(Identifier="3c4aa751-fdd9-478a-e66a-a55ae35603b4")
public static String es_PE_FIELD_Order_Activity_Help="Las actividades indican tareas que son ejecutadas en el curso de un negocio; las actividades son usadas para el costeo por actividad (ABC)";

@XendraField(AD_Column_ID="C_Activity_ID",IsCentrallyMaintained=true,
AD_Tab_ID="0117aed8-fd79-d3b4-27b9-7da5aa03a9e6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=550,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3c4aa751-fdd9-478a-e66a-a55ae35603b4")
public static final String FIELDNAME_Order_Activity="3c4aa751-fdd9-478a-e66a-a55ae35603b4";

@XendraTrl(Identifier="d4981eba-adfc-cbb6-06c6-87ccd9330022")
public static String es_PE_COLUMN_C_Activity_ID_Name="Tipo de Gasto";

@XendraColumn(AD_Element_ID="bfeadbb3-d866-26e3-8eee-3e2fdf0ff753",ColumnName="C_Activity_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d4981eba-adfc-cbb6-06c6-87ccd9330022",
Synchronized="2019-08-30 22:22:51.0")
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

@XendraTrl(Identifier="bb3f37aa-1125-e906-ca5f-f0d815037a12")
public static String es_PE_FIELD_Order_BusinessPartner_Name="Socio de Negocio";

@XendraTrl(Identifier="bb3f37aa-1125-e906-ca5f-f0d815037a12")
public static String es_PE_FIELD_Order_BusinessPartner_Description="Identifica un Socio de Negocio";

@XendraTrl(Identifier="bb3f37aa-1125-e906-ca5f-f0d815037a12")
public static String es_PE_FIELD_Order_BusinessPartner_Help="Un socio de negocio es cualquiera con quien usted realiza transacciones. Este puede incluir Proveedores; Clientes; Empleados ó Vendedores.";

@XendraField(AD_Column_ID="C_BPartner_ID",IsCentrallyMaintained=true,
AD_Tab_ID="0117aed8-fd79-d3b4-27b9-7da5aa03a9e6",AD_FieldGroup_ID="Business Partner",
IsDisplayed=true,DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=220,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="bb3f37aa-1125-e906-ca5f-f0d815037a12")
public static final String FIELDNAME_Order_BusinessPartner="bb3f37aa-1125-e906-ca5f-f0d815037a12";

@XendraTrl(Identifier="0ae3a52f-27f7-c973-066d-0608be0086b6")
public static String es_PE_COLUMN_C_BPartner_ID_Name="Socio de Negocio";

@XendraColumn(AD_Element_ID="fe333dc3-4f40-1276-5f6a-d09bb66dc423",ColumnName="C_BPartner_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0ae3a52f-27f7-c973-066d-0608be0086b6",
Synchronized="2019-08-30 22:22:51.0")
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

@XendraTrl(Identifier="3ee4cd53-b310-ef0b-c309-3699c266aa9b")
public static String es_PE_FIELD_Order_PartnerLocation_Name="Dirección del Socio del Negocio";

@XendraTrl(Identifier="3ee4cd53-b310-ef0b-c309-3699c266aa9b")
public static String es_PE_FIELD_Order_PartnerLocation_Description="Identifica la dirección para este socio de negocio";

@XendraTrl(Identifier="3ee4cd53-b310-ef0b-c309-3699c266aa9b")
public static String es_PE_FIELD_Order_PartnerLocation_Help="La dirección de un socio indica la ubicación de un socio de negocio";

@XendraField(AD_Column_ID="C_BPartner_Location_ID",IsCentrallyMaintained=true,
AD_Tab_ID="0117aed8-fd79-d3b4-27b9-7da5aa03a9e6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=260,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3ee4cd53-b310-ef0b-c309-3699c266aa9b")
public static final String FIELDNAME_Order_PartnerLocation="3ee4cd53-b310-ef0b-c309-3699c266aa9b";

@XendraTrl(Identifier="051ef6bc-effe-1712-5b25-814e1d51edb3")
public static String es_PE_COLUMN_C_BPartner_Location_ID_Name="Dirección del Socio del Negocio";

@XendraColumn(AD_Element_ID="0dab7dc6-2832-26dc-2462-cba2d40235f2",
ColumnName="C_BPartner_Location_ID",AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="051ef6bc-effe-1712-5b25-814e1d51edb3",Synchronized="2019-08-30 22:22:51.0")
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

@XendraTrl(Identifier="f73d0a49-e64b-6173-c2b0-02552cafc321")
public static String es_PE_FIELD_Order_Campaign_Name="Campaña";

@XendraTrl(Identifier="f73d0a49-e64b-6173-c2b0-02552cafc321")
public static String es_PE_FIELD_Order_Campaign_Description="Campaña de Mercadeo";

@XendraTrl(Identifier="f73d0a49-e64b-6173-c2b0-02552cafc321")
public static String es_PE_FIELD_Order_Campaign_Help="La Campaña define un programa de mercadotecnia único. Los proyectos pueden estar asociados con una campaña de mercadotecnia única. Usted puede entonces reportar basado en una campaña específica";

@XendraField(AD_Column_ID="C_Campaign_ID",IsCentrallyMaintained=true,
AD_Tab_ID="0117aed8-fd79-d3b4-27b9-7da5aa03a9e6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=540,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f73d0a49-e64b-6173-c2b0-02552cafc321")
public static final String FIELDNAME_Order_Campaign="f73d0a49-e64b-6173-c2b0-02552cafc321";

@XendraTrl(Identifier="4eece8dd-fcfd-e15d-df61-239ec72c7080")
public static String es_PE_COLUMN_C_Campaign_ID_Name="Campaña";

@XendraColumn(AD_Element_ID="6cf08e31-d355-ee38-9c0b-bee20b3ea5b6",ColumnName="C_Campaign_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="4eece8dd-fcfd-e15d-df61-239ec72c7080",
Synchronized="2019-08-30 22:22:51.0")
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

@XendraTrl(Identifier="5408c109-87ec-7a39-3ce9-15fcf50f4a12")
public static String es_PE_FIELD_Order_Country_ID_Name="País";

@XendraTrl(Identifier="5408c109-87ec-7a39-3ce9-15fcf50f4a12")
public static String es_PE_FIELD_Order_Country_ID_Description="País";

@XendraTrl(Identifier="5408c109-87ec-7a39-3ce9-15fcf50f4a12")
public static String es_PE_FIELD_Order_Country_ID_Help="El país define un país. Cada país debe ser definido antes de que pueda ser usado en un documento.";

@XendraField(AD_Column_ID="C_Country_ID",IsCentrallyMaintained=true,
AD_Tab_ID="0117aed8-fd79-d3b4-27b9-7da5aa03a9e6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=350,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5408c109-87ec-7a39-3ce9-15fcf50f4a12")
public static final String FIELDNAME_Order_Country_ID="5408c109-87ec-7a39-3ce9-15fcf50f4a12";

@XendraTrl(Identifier="aa7a1cd6-c07b-1ca6-c01d-979730661513")
public static String es_PE_COLUMN_C_Country_ID_Name="País";

@XendraColumn(AD_Element_ID="43379d46-930b-f17e-61f3-a1b7f02135c1",ColumnName="C_Country_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="aa7a1cd6-c07b-1ca6-c01d-979730661513",
Synchronized="2019-08-30 22:22:51.0")
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

@XendraTrl(Identifier="c0b8f003-ff36-53e5-5881-1982d0f654ae")
public static String es_PE_FIELD_Order_Currency_Name="Moneda";

@XendraTrl(Identifier="c0b8f003-ff36-53e5-5881-1982d0f654ae")
public static String es_PE_FIELD_Order_Currency_Description="Moneda para este registro";

@XendraTrl(Identifier="c0b8f003-ff36-53e5-5881-1982d0f654ae")
public static String es_PE_FIELD_Order_Currency_Help="Indica la moneda a ser usada cuando se procese ó Informe este registro";

@XendraField(AD_Column_ID="C_Currency_ID",IsCentrallyMaintained=true,
AD_Tab_ID="0117aed8-fd79-d3b4-27b9-7da5aa03a9e6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=160,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c0b8f003-ff36-53e5-5881-1982d0f654ae")
public static final String FIELDNAME_Order_Currency="c0b8f003-ff36-53e5-5881-1982d0f654ae";

@XendraTrl(Identifier="d7d47a87-1563-7f0b-ad25-57fd7e057cde")
public static String es_PE_COLUMN_C_Currency_ID_Name="Moneda";

@XendraColumn(AD_Element_ID="8daec488-bca2-50fe-f9de-abf0cba2a34a",ColumnName="C_Currency_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d7d47a87-1563-7f0b-ad25-57fd7e057cde",
Synchronized="2019-08-30 22:22:51.0")
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

@XendraTrl(Identifier="d88fae62-21ae-c4be-722d-c2d77f5d7047")
public static String es_PE_FIELD_Order_DocumentType_Name="Tipo de Documento";

@XendraTrl(Identifier="d88fae62-21ae-c4be-722d-c2d77f5d7047")
public static String es_PE_FIELD_Order_DocumentType_Description="Tipo de documento ó reglas";

@XendraTrl(Identifier="d88fae62-21ae-c4be-722d-c2d77f5d7047")
public static String es_PE_FIELD_Order_DocumentType_Help="El tipo de documento determina la secuencia del documento y las reglas de proceso";

@XendraField(AD_Column_ID="C_DocType_ID",IsCentrallyMaintained=true,
AD_Tab_ID="0117aed8-fd79-d3b4-27b9-7da5aa03a9e6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d88fae62-21ae-c4be-722d-c2d77f5d7047")
public static final String FIELDNAME_Order_DocumentType="d88fae62-21ae-c4be-722d-c2d77f5d7047";

@XendraTrl(Identifier="989a14b5-7f21-0f61-6445-4c8f47c4046f")
public static String es_PE_COLUMN_C_DocType_ID_Name="Tipo de Documento";

@XendraColumn(AD_Element_ID="099a4147-1a72-cdd0-81e0-8bdbc8c0b883",ColumnName="C_DocType_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="c413f4f5-83b1-ead3-73ab-5dce071e3c20",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="989a14b5-7f21-0f61-6445-4c8f47c4046f",Synchronized="2019-08-30 22:22:51.0")
/** Column name C_DocType_ID */
public static final String COLUMNNAME_C_DocType_ID = "C_DocType_ID";
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
@XendraTrl(Identifier="2814f859-6c39-9597-6676-333208eba870")
public static String es_PE_FIELD_Order_City_Name="Ciudad";

@XendraTrl(Identifier="2814f859-6c39-9597-6676-333208eba870")
public static String es_PE_FIELD_Order_City_Description="Identifica una Ciudad";

@XendraTrl(Identifier="2814f859-6c39-9597-6676-333208eba870")
public static String es_PE_FIELD_Order_City_Help="La Ciudad identifica una ciudad única para este País ó Región";

@XendraField(AD_Column_ID="City",IsCentrallyMaintained=true,
AD_Tab_ID="0117aed8-fd79-d3b4-27b9-7da5aa03a9e6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=300,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2814f859-6c39-9597-6676-333208eba870")
public static final String FIELDNAME_Order_City="2814f859-6c39-9597-6676-333208eba870";

@XendraTrl(Identifier="7928e98f-a908-6703-5d63-94add6ff4c35")
public static String es_PE_COLUMN_City_Name="Ciudad";

@XendraColumn(AD_Element_ID="968cd06b-d53d-9f3f-cbd5-d393f09a0264",ColumnName="City",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7928e98f-a908-6703-5d63-94add6ff4c35",
Synchronized="2019-08-30 22:22:51.0")
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

@XendraTrl(Identifier="c749ff24-9673-d85d-340c-df4e3d458b12")
public static String es_PE_FIELD_Order_Address3_Name="Localización / Dirección";

@XendraTrl(Identifier="c749ff24-9673-d85d-340c-df4e3d458b12")
public static String es_PE_FIELD_Order_Address3_Description="Ubicación ó dirección";

@XendraTrl(Identifier="c749ff24-9673-d85d-340c-df4e3d458b12")
public static String es_PE_FIELD_Order_Address3_Help="El campo Ubicación / Dirección define la ubicación de una entidad.";

@XendraField(AD_Column_ID="C_Location_ID",IsCentrallyMaintained=true,
AD_Tab_ID="0117aed8-fd79-d3b4-27b9-7da5aa03a9e6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=270,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c749ff24-9673-d85d-340c-df4e3d458b12")
public static final String FIELDNAME_Order_Address3="c749ff24-9673-d85d-340c-df4e3d458b12";

@XendraTrl(Identifier="5287a978-c006-2585-f512-a55b0aec5e63")
public static String es_PE_COLUMN_C_Location_ID_Name="Localización / Dirección";

@XendraColumn(AD_Element_ID="e66e22a8-535b-2af2-6efb-aa600959a885",ColumnName="C_Location_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5287a978-c006-2585-f512-a55b0aec5e63",
Synchronized="2019-08-30 22:22:51.0")
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
@XendraTrl(Identifier="2e3e3bbd-7334-d0da-a3ea-3f666e6deb36")
public static String es_PE_FIELD_Order_ContactName_Name="Nombre del Contacto";

@XendraTrl(Identifier="2e3e3bbd-7334-d0da-a3ea-3f666e6deb36")
public static String es_PE_FIELD_Order_ContactName_Description="Nombre del contacto del socio";

@XendraField(AD_Column_ID="ContactName",IsCentrallyMaintained=true,
AD_Tab_ID="0117aed8-fd79-d3b4-27b9-7da5aa03a9e6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=370,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2e3e3bbd-7334-d0da-a3ea-3f666e6deb36")
public static final String FIELDNAME_Order_ContactName="2e3e3bbd-7334-d0da-a3ea-3f666e6deb36";

@XendraTrl(Identifier="19ef90ed-f3ed-298a-d578-83f5ea384890")
public static String es_PE_COLUMN_ContactName_Name="Nombre del Contacto";

@XendraColumn(AD_Element_ID="09dc9eae-5f2a-936f-d673-7d269b49db5a",ColumnName="ContactName",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="19ef90ed-f3ed-298a-d578-83f5ea384890",
Synchronized="2019-08-30 22:22:51.0")
/** Column name ContactName */
public static final String COLUMNNAME_ContactName = "ContactName";
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

@XendraTrl(Identifier="ce9e5101-d1cc-fe73-33d9-c78d36ed3c07")
public static String es_PE_FIELD_Order_Order_Name="Orden de Venta";

@XendraTrl(Identifier="ce9e5101-d1cc-fe73-33d9-c78d36ed3c07")
public static String es_PE_FIELD_Order_Order_Description="Orden de Venta";

@XendraTrl(Identifier="ce9e5101-d1cc-fe73-33d9-c78d36ed3c07")
public static String es_PE_FIELD_Order_Order_Help="La ID de la orden de ventas es un identificador único de la orden de ventas; Ésta es controlada por la secuencia del documento para este tipo de documento.";

@XendraField(AD_Column_ID="C_Order_ID",IsCentrallyMaintained=true,
AD_Tab_ID="0117aed8-fd79-d3b4-27b9-7da5aa03a9e6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ce9e5101-d1cc-fe73-33d9-c78d36ed3c07")
public static final String FIELDNAME_Order_Order="ce9e5101-d1cc-fe73-33d9-c78d36ed3c07";

@XendraTrl(Identifier="58f621bd-6e08-af6a-f17c-d64f1b75f9e6")
public static String es_PE_COLUMN_C_Order_ID_Name="Orden de Venta";

@XendraColumn(AD_Element_ID="cc846c60-90b8-6aad-9d07-b5d0c0328787",ColumnName="C_Order_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="58f621bd-6e08-af6a-f17c-d64f1b75f9e6",
Synchronized="2019-08-30 22:22:51.0")
/** Column name C_Order_ID */
public static final String COLUMNNAME_C_Order_ID = "C_Order_ID";
/** Set Sales Order Line.
@param C_OrderLine_ID Sales Order Line */
public void setC_OrderLine_ID (int C_OrderLine_ID)
{
if (C_OrderLine_ID <= 0) set_Value (COLUMNNAME_C_OrderLine_ID, null);
 else 
set_Value (COLUMNNAME_C_OrderLine_ID, Integer.valueOf(C_OrderLine_ID));
}
/** Get Sales Order Line.
@return Sales Order Line */
public int getC_OrderLine_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_OrderLine_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="ef70b8b8-628b-6506-10a4-19e6141d0d2e")
public static String es_PE_FIELD_Order_SalesOrderLine_Name="Item";

@XendraTrl(Identifier="ef70b8b8-628b-6506-10a4-19e6141d0d2e")
public static String es_PE_FIELD_Order_SalesOrderLine_Description="Item de orden de venta";

@XendraTrl(Identifier="ef70b8b8-628b-6506-10a4-19e6141d0d2e")
public static String es_PE_FIELD_Order_SalesOrderLine_Help="Identificador único para un Item en una orden.";

@XendraField(AD_Column_ID="C_OrderLine_ID",IsCentrallyMaintained=true,
AD_Tab_ID="0117aed8-fd79-d3b4-27b9-7da5aa03a9e6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=60,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ef70b8b8-628b-6506-10a4-19e6141d0d2e")
public static final String FIELDNAME_Order_SalesOrderLine="ef70b8b8-628b-6506-10a4-19e6141d0d2e";

@XendraTrl(Identifier="b0adfda1-897e-eb5b-0aa0-cd2a1611badd")
public static String es_PE_COLUMN_C_OrderLine_ID_Name="Línea";

@XendraColumn(AD_Element_ID="a94fbec0-0ef5-0f6c-033d-8286782321b0",ColumnName="C_OrderLine_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b0adfda1-897e-eb5b-0aa0-cd2a1611badd",
Synchronized="2019-08-30 22:22:51.0")
/** Column name C_OrderLine_ID */
public static final String COLUMNNAME_C_OrderLine_ID = "C_OrderLine_ID";
/** Set ISO Country Code.
@param CountryCode Upper-case two-letter alphanumeric ISO Country code according to ISO 3166-1 - http://www.chemie.fu-berlin.de/diverse/doc/ISO_3166.html */
public void setCountryCode (String CountryCode)
{
if (CountryCode != null && CountryCode.length() > 2)
{
log.warning("Length > 2 - truncated");
CountryCode = CountryCode.substring(0,1);
}
set_Value (COLUMNNAME_CountryCode, CountryCode);
}
/** Get ISO Country Code.
@return Upper-case two-letter alphanumeric ISO Country code according to ISO 3166-1 - http://www.chemie.fu-berlin.de/diverse/doc/ISO_3166.html */
public String getCountryCode() 
{
String value = (String)get_Value(COLUMNNAME_CountryCode);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="adb629bd-82b8-6326-db33-808fc781dbdf")
public static String es_PE_FIELD_Order_ISOCountryCode_Name="Código ISO del País";

@XendraTrl(Identifier="adb629bd-82b8-6326-db33-808fc781dbdf")
public static String es_PE_FIELD_Order_ISOCountryCode_Description="Código ISO de país alfanumérico en mayúsculas de acuerdo al ISO 3166-1 -";

@XendraTrl(Identifier="adb629bd-82b8-6326-db33-808fc781dbdf")
public static String es_PE_FIELD_Order_ISOCountryCode_Help="Para detalles - http://www.din.de/gremien/nas/nabd/iso3166ma/codlstp1.html or - http://www.unece.org/trade/rec/rec03en.htm";

@XendraField(AD_Column_ID="CountryCode",IsCentrallyMaintained=true,
AD_Tab_ID="0117aed8-fd79-d3b4-27b9-7da5aa03a9e6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=5,IsReadOnly=false,SeqNo=340,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="adb629bd-82b8-6326-db33-808fc781dbdf")
public static final String FIELDNAME_Order_ISOCountryCode="adb629bd-82b8-6326-db33-808fc781dbdf";

@XendraTrl(Identifier="242e849b-79ba-d042-b163-168e2853c5d0")
public static String es_PE_COLUMN_CountryCode_Name="Código ISO del País";

@XendraColumn(AD_Element_ID="45764594-a71a-901c-2c46-bb5485c061d1",ColumnName="CountryCode",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="242e849b-79ba-d042-b163-168e2853c5d0",
Synchronized="2019-08-30 22:22:51.0")
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

@XendraTrl(Identifier="09306183-eddb-c5f1-22ee-51d09d4e600d")
public static String es_PE_FIELD_Order_PaymentTerm_Name="Término de Pago";

@XendraTrl(Identifier="09306183-eddb-c5f1-22ee-51d09d4e600d")
public static String es_PE_FIELD_Order_PaymentTerm_Description="Condiciones de pago de esta transacción";

@XendraTrl(Identifier="09306183-eddb-c5f1-22ee-51d09d4e600d")
public static String es_PE_FIELD_Order_PaymentTerm_Help="Las condiciones de pago indican el método y tiempo de pago para esta transacción.";

@XendraField(AD_Column_ID="C_PaymentTerm_ID",IsCentrallyMaintained=true,
AD_Tab_ID="0117aed8-fd79-d3b4-27b9-7da5aa03a9e6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=190,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="09306183-eddb-c5f1-22ee-51d09d4e600d")
public static final String FIELDNAME_Order_PaymentTerm="09306183-eddb-c5f1-22ee-51d09d4e600d";

@XendraTrl(Identifier="8469aec3-489d-3e38-ada8-a148a8c39d6b")
public static String es_PE_COLUMN_C_PaymentTerm_ID_Name="Término de Pago";

@XendraColumn(AD_Element_ID="9b2224b8-8020-a83c-2d1e-ea35741c781a",ColumnName="C_PaymentTerm_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="8469aec3-489d-3e38-ada8-a148a8c39d6b",
Synchronized="2019-08-30 22:22:51.0")
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

@XendraTrl(Identifier="994b3f4a-47be-9e94-9059-57f8b7f2ae24")
public static String es_PE_FIELD_Order_Project_Name="Proyecto";

@XendraTrl(Identifier="994b3f4a-47be-9e94-9059-57f8b7f2ae24")
public static String es_PE_FIELD_Order_Project_Description="Identifica un proyecto único";

@XendraTrl(Identifier="994b3f4a-47be-9e94-9059-57f8b7f2ae24")
public static String es_PE_FIELD_Order_Project_Help="La ID de un proyecto es un identificador definido por el usuario para un proyecto";

@XendraField(AD_Column_ID="C_Project_ID",IsCentrallyMaintained=true,
AD_Tab_ID="0117aed8-fd79-d3b4-27b9-7da5aa03a9e6",AD_FieldGroup_ID="Reference",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=530,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="994b3f4a-47be-9e94-9059-57f8b7f2ae24")
public static final String FIELDNAME_Order_Project="994b3f4a-47be-9e94-9059-57f8b7f2ae24";

@XendraTrl(Identifier="9091d05c-a8aa-fff0-b887-3045a25cba1a")
public static String es_PE_COLUMN_C_Project_ID_Name="Proyecto";

@XendraColumn(AD_Element_ID="16ff5dcc-9178-73dd-e618-e88bd79d573b",ColumnName="C_Project_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9091d05c-a8aa-fff0-b887-3045a25cba1a",
Synchronized="2019-08-30 22:22:51.0")
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

@XendraTrl(Identifier="f5d6717d-393e-e777-5637-5a6683e91c3f")
public static String es_PE_FIELD_Order_Region_Name="Región";

@XendraTrl(Identifier="f5d6717d-393e-e777-5637-5a6683e91c3f")
public static String es_PE_FIELD_Order_Region_Description="Identifica una región geográfica";

@XendraTrl(Identifier="f5d6717d-393e-e777-5637-5a6683e91c3f")
public static String es_PE_FIELD_Order_Region_Help="La región indica una región única para este país";

@XendraField(AD_Column_ID="C_Region_ID",IsCentrallyMaintained=true,
AD_Tab_ID="0117aed8-fd79-d3b4-27b9-7da5aa03a9e6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=330,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f5d6717d-393e-e777-5637-5a6683e91c3f")
public static final String FIELDNAME_Order_Region="f5d6717d-393e-e777-5637-5a6683e91c3f";

@XendraTrl(Identifier="2f193886-880b-d117-c64b-46344ed79f6d")
public static String es_PE_COLUMN_C_Region_ID_Name="Región";

@XendraColumn(AD_Element_ID="ebf14ae5-8cc5-d3f7-2bd3-ea81d9c6d1fe",ColumnName="C_Region_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2f193886-880b-d117-c64b-46344ed79f6d",
Synchronized="2019-08-30 22:22:51.0")
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

@XendraTrl(Identifier="96a18a71-8b0b-ce79-e304-00ba5edc6588")
public static String es_PE_FIELD_Order_Tax_Name="Impuesto";

@XendraTrl(Identifier="96a18a71-8b0b-ce79-e304-00ba5edc6588")
public static String es_PE_FIELD_Order_Tax_Description="Identificador del Impuesto";

@XendraTrl(Identifier="96a18a71-8b0b-ce79-e304-00ba5edc6588")
public static String es_PE_FIELD_Order_Tax_Help="El Impuesto indica el tipo de impuesto para esta línea del documento";

@XendraField(AD_Column_ID="C_Tax_ID",IsCentrallyMaintained=true,
AD_Tab_ID="0117aed8-fd79-d3b4-27b9-7da5aa03a9e6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=510,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="96a18a71-8b0b-ce79-e304-00ba5edc6588")
public static final String FIELDNAME_Order_Tax="96a18a71-8b0b-ce79-e304-00ba5edc6588";

@XendraTrl(Identifier="d7609e92-2ccd-10b0-fd63-fe6021daf49f")
public static String es_PE_COLUMN_C_Tax_ID_Name="Impuesto";

@XendraColumn(AD_Element_ID="38ff24fc-b68c-51a9-60f8-ef2a1f060de2",ColumnName="C_Tax_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d7609e92-2ccd-10b0-fd63-fe6021daf49f",
Synchronized="2019-08-30 22:22:51.0")
/** Column name C_Tax_ID */
public static final String COLUMNNAME_C_Tax_ID = "C_Tax_ID";
/** Set UOM.
@param C_UOM_ID Unit of Measure */
public void setC_UOM_ID (int C_UOM_ID)
{
if (C_UOM_ID <= 0) set_Value (COLUMNNAME_C_UOM_ID, null);
 else 
set_Value (COLUMNNAME_C_UOM_ID, Integer.valueOf(C_UOM_ID));
}
/** Get UOM.
@return Unit of Measure */
public int getC_UOM_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_UOM_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="a38a64f7-77b6-8a8b-abd8-698ed2e2fa81")
public static String es_PE_FIELD_Order_UOM_Name="UM";

@XendraTrl(Identifier="a38a64f7-77b6-8a8b-abd8-698ed2e2fa81")
public static String es_PE_FIELD_Order_UOM_Description="Unidad de Medida";

@XendraTrl(Identifier="a38a64f7-77b6-8a8b-abd8-698ed2e2fa81")
public static String es_PE_FIELD_Order_UOM_Help="La UM define una unidad de medida única no monetaria";

@XendraField(AD_Column_ID="C_UOM_ID",IsCentrallyMaintained=true,
AD_Tab_ID="0117aed8-fd79-d3b4-27b9-7da5aa03a9e6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=460,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a38a64f7-77b6-8a8b-abd8-698ed2e2fa81")
public static final String FIELDNAME_Order_UOM="a38a64f7-77b6-8a8b-abd8-698ed2e2fa81";

@XendraTrl(Identifier="9d3fa34a-ca3c-23e2-f072-05b63bfa527a")
public static String es_PE_COLUMN_C_UOM_ID_Name="UM";

@XendraColumn(AD_Element_ID="d0345019-4fcc-44c8-4fd1-e38e3b4adeed",ColumnName="C_UOM_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9d3fa34a-ca3c-23e2-f072-05b63bfa527a",
Synchronized="2019-08-30 22:22:51.0")
/** Column name C_UOM_ID */
public static final String COLUMNNAME_C_UOM_ID = "C_UOM_ID";
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

@XendraTrl(Identifier="b216618b-1bca-d96c-a6be-e4488da0178e")
public static String es_PE_FIELD_Order_AccountDate_Name="Fecha de Aplicación CG";

@XendraTrl(Identifier="b216618b-1bca-d96c-a6be-e4488da0178e")
public static String es_PE_FIELD_Order_AccountDate_Description="Fecha contable";

@XendraTrl(Identifier="b216618b-1bca-d96c-a6be-e4488da0178e")
public static String es_PE_FIELD_Order_AccountDate_Help="La fecha contable indica la fecha a ser usada en las cuentas de contabilidad general generadas desde este documento";

@XendraField(AD_Column_ID="DateAcct",IsCentrallyMaintained=true,
AD_Tab_ID="0117aed8-fd79-d3b4-27b9-7da5aa03a9e6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=410,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b216618b-1bca-d96c-a6be-e4488da0178e")
public static final String FIELDNAME_Order_AccountDate="b216618b-1bca-d96c-a6be-e4488da0178e";

@XendraTrl(Identifier="b1943dfc-91ea-16ee-f27b-46c455b2bb1e")
public static String es_PE_COLUMN_DateAcct_Name="Fecha de Aplicación CG";

@XendraColumn(AD_Element_ID="034727d0-e80f-fadf-3d4f-2d8d37b75669",ColumnName="DateAcct",
AD_Reference_ID=15,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b1943dfc-91ea-16ee-f27b-46c455b2bb1e",
Synchronized="2019-08-30 22:22:51.0")
/** Column name DateAcct */
public static final String COLUMNNAME_DateAcct = "DateAcct";
/** Set Date Ordered.
@param DateOrdered Date of Order */
public void setDateOrdered (Timestamp DateOrdered)
{
set_Value (COLUMNNAME_DateOrdered, DateOrdered);
}
/** Get Date Ordered.
@return Date of Order */
public Timestamp getDateOrdered() 
{
return (Timestamp)get_Value(COLUMNNAME_DateOrdered);
}

@XendraTrl(Identifier="643ea6e3-b572-0584-aa64-2869d7af6ba1")
public static String es_PE_FIELD_Order_DateOrdered_Name="Fecha de la Orden";

@XendraTrl(Identifier="643ea6e3-b572-0584-aa64-2869d7af6ba1")
public static String es_PE_FIELD_Order_DateOrdered_Description="Fecha de la orden";

@XendraTrl(Identifier="643ea6e3-b572-0584-aa64-2869d7af6ba1")
public static String es_PE_FIELD_Order_DateOrdered_Help="Indica la fecha en que un artículo fue ordenada";

@XendraField(AD_Column_ID="DateOrdered",IsCentrallyMaintained=true,
AD_Tab_ID="0117aed8-fd79-d3b4-27b9-7da5aa03a9e6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=400,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="643ea6e3-b572-0584-aa64-2869d7af6ba1")
public static final String FIELDNAME_Order_DateOrdered="643ea6e3-b572-0584-aa64-2869d7af6ba1";

@XendraTrl(Identifier="c3f621e8-06a8-5fdc-2c20-342a47dc523c")
public static String es_PE_COLUMN_DateOrdered_Name="Fecha de la Orden";

@XendraColumn(AD_Element_ID="c265ae59-eec5-5c6b-26ee-1090bf37ce26",ColumnName="DateOrdered",
AD_Reference_ID=15,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c3f621e8-06a8-5fdc-2c20-342a47dc523c",
Synchronized="2019-08-30 22:22:51.0")
/** Column name DateOrdered */
public static final String COLUMNNAME_DateOrdered = "DateOrdered";
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

@XendraTrl(Identifier="2f94d9dd-9e13-0984-c559-316bbc5dd540")
public static String es_PE_FIELD_Order_Description_Name="Observación";

@XendraTrl(Identifier="2f94d9dd-9e13-0984-c559-316bbc5dd540")
public static String es_PE_FIELD_Order_Description_Description="Observación";

@XendraTrl(Identifier="2f94d9dd-9e13-0984-c559-316bbc5dd540")
public static String es_PE_FIELD_Order_Description_Help="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="0117aed8-fd79-d3b4-27b9-7da5aa03a9e6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=140,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2f94d9dd-9e13-0984-c559-316bbc5dd540")
public static final String FIELDNAME_Order_Description="2f94d9dd-9e13-0984-c559-316bbc5dd540";

@XendraTrl(Identifier="c93bc7e3-f8ab-cb64-4071-4324df92deef")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c93bc7e3-f8ab-cb64-4071-4324df92deef",
Synchronized="2019-08-30 22:22:51.0")
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
@XendraTrl(Identifier="dd7ed052-c7a5-3b13-b5bc-a3b7bdddc94c")
public static String es_PE_FIELD_Order_DocumentTypeName_Name="Nombre del Tipo de Documento";

@XendraTrl(Identifier="dd7ed052-c7a5-3b13-b5bc-a3b7bdddc94c")
public static String es_PE_FIELD_Order_DocumentTypeName_Description="Nombre del tipo de documento";

@XendraField(AD_Column_ID="DocTypeName",IsCentrallyMaintained=true,
AD_Tab_ID="0117aed8-fd79-d3b4-27b9-7da5aa03a9e6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="dd7ed052-c7a5-3b13-b5bc-a3b7bdddc94c")
public static final String FIELDNAME_Order_DocumentTypeName="dd7ed052-c7a5-3b13-b5bc-a3b7bdddc94c";

@XendraTrl(Identifier="fbb9ecd8-aade-f5df-fd02-4fe48ab29468")
public static String es_PE_COLUMN_DocTypeName_Name="Nombre del Tipo de Documento";

@XendraColumn(AD_Element_ID="af613457-d4ac-9b3e-87a0-02ba8501326b",ColumnName="DocTypeName",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="fbb9ecd8-aade-f5df-fd02-4fe48ab29468",
Synchronized="2019-08-30 22:22:51.0")
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
@XendraTrl(Identifier="f952dba4-ab74-b90a-0ee0-900adcbd5a24")
public static String es_PE_FIELD_Order_DocumentNo_Name="No. del Documento";

@XendraTrl(Identifier="f952dba4-ab74-b90a-0ee0-900adcbd5a24")
public static String es_PE_FIELD_Order_DocumentNo_Description="Número de secuencia del documento para cada documento";

@XendraTrl(Identifier="f952dba4-ab74-b90a-0ee0-900adcbd5a24")
public static String es_PE_FIELD_Order_DocumentNo_Help="El número del documento es usualmente generado en automático por el sistema y determinado por el tipo del documento. Si el documento no se salva; el número preliminar se despliega entre \"<>\"";

@XendraField(AD_Column_ID="DocumentNo",IsCentrallyMaintained=true,
AD_Tab_ID="0117aed8-fd79-d3b4-27b9-7da5aa03a9e6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=120,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f952dba4-ab74-b90a-0ee0-900adcbd5a24")
public static final String FIELDNAME_Order_DocumentNo="f952dba4-ab74-b90a-0ee0-900adcbd5a24";

@XendraTrl(Identifier="de8f07db-556c-2998-e8db-04441c3334fe")
public static String es_PE_COLUMN_DocumentNo_Name="No. del Documento";

@XendraColumn(AD_Element_ID="e3ca6e28-702a-2722-d941-b2072a0de9cb",ColumnName="DocumentNo",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=30,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="de8f07db-556c-2998-e8db-04441c3334fe",
Synchronized="2019-08-30 22:22:51.0")
/** Column name DocumentNo */
public static final String COLUMNNAME_DocumentNo = "DocumentNo";
/** Set Due Date.
@param DueDate Date when the payment is due */
public void setDueDate (Timestamp DueDate)
{
set_Value (COLUMNNAME_DueDate, DueDate);
}
/** Get Due Date.
@return Date when the payment is due */
public Timestamp getDueDate() 
{
return (Timestamp)get_Value(COLUMNNAME_DueDate);
}

@XendraTrl(Identifier="e8457294-994f-8531-5d52-6666c3fc0095")
public static String es_PE_COLUMN_DueDate_Name="Due Date";

@XendraColumn(AD_Element_ID="37bdf028-bb21-2699-2840-6730e99633c6",ColumnName="DueDate",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=29,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e8457294-994f-8531-5d52-6666c3fc0095",
Synchronized="2019-08-30 22:22:51.0")
/** Column name DueDate */
public static final String COLUMNNAME_DueDate = "DueDate";
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
@XendraTrl(Identifier="0d07da83-5d52-8941-f507-cd6cdb979b52")
public static String es_PE_FIELD_Order_EMailAddress_Name="Email";

@XendraTrl(Identifier="0d07da83-5d52-8941-f507-cd6cdb979b52")
public static String es_PE_FIELD_Order_EMailAddress_Description="ID de correo electrónico";

@XendraTrl(Identifier="0d07da83-5d52-8941-f507-cd6cdb979b52")
public static String es_PE_FIELD_Order_EMailAddress_Help="El Email indica la ID de correo electrónico para este usuario";

@XendraField(AD_Column_ID="EMail",IsCentrallyMaintained=true,
AD_Tab_ID="0117aed8-fd79-d3b4-27b9-7da5aa03a9e6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=390,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0d07da83-5d52-8941-f507-cd6cdb979b52")
public static final String FIELDNAME_Order_EMailAddress="0d07da83-5d52-8941-f507-cd6cdb979b52";

@XendraTrl(Identifier="e143fb42-624b-ed5b-ae72-fd75b10153dc")
public static String es_PE_COLUMN_EMail_Name="Email";

@XendraColumn(AD_Element_ID="d18b300c-9ad6-2dd2-36d3-b65969743158",ColumnName="EMail",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e143fb42-624b-ed5b-ae72-fd75b10153dc",
Synchronized="2019-08-30 22:22:51.0")
/** Column name EMail */
public static final String COLUMNNAME_EMail = "EMail";
/** Set Freight Amount.
@param FreightAmt Freight Amount  */
public void setFreightAmt (BigDecimal FreightAmt)
{
set_Value (COLUMNNAME_FreightAmt, FreightAmt);
}
/** Get Freight Amount.
@return Freight Amount  */
public BigDecimal getFreightAmt() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_FreightAmt);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="b4185c39-7645-8816-5520-d3f80d370044")
public static String es_PE_FIELD_Order_FreightAmount_Name="Total de Flete";

@XendraTrl(Identifier="b4185c39-7645-8816-5520-d3f80d370044")
public static String es_PE_FIELD_Order_FreightAmount_Description="Total de la entrega";

@XendraTrl(Identifier="b4185c39-7645-8816-5520-d3f80d370044")
public static String es_PE_FIELD_Order_FreightAmount_Help="El Total del Flete indica el total cargado por flete en la moneda del documento";

@XendraField(AD_Column_ID="FreightAmt",IsCentrallyMaintained=true,
AD_Tab_ID="0117aed8-fd79-d3b4-27b9-7da5aa03a9e6",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=10,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b4185c39-7645-8816-5520-d3f80d370044")
public static final String FIELDNAME_Order_FreightAmount="b4185c39-7645-8816-5520-d3f80d370044";

@XendraTrl(Identifier="87e5a01c-ce93-8d97-944f-390556b9e872")
public static String es_PE_COLUMN_FreightAmt_Name="Total de Flete";

@XendraColumn(AD_Element_ID="b2162c75-bbbe-b49a-7ffe-6020ce78c453",ColumnName="FreightAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="87e5a01c-ce93-8d97-944f-390556b9e872",
Synchronized="2019-08-30 22:22:51.0")
/** Column name FreightAmt */
public static final String COLUMNNAME_FreightAmt = "FreightAmt";
/** Set Guarantee Date.
@param GuaranteeDate Date when guarantee expires */
public void setGuaranteeDate (Timestamp GuaranteeDate)
{
set_Value (COLUMNNAME_GuaranteeDate, GuaranteeDate);
}
/** Get Guarantee Date.
@return Date when guarantee expires */
public Timestamp getGuaranteeDate() 
{
return (Timestamp)get_Value(COLUMNNAME_GuaranteeDate);
}

@XendraTrl(Identifier="0a94d7c0-09ff-25ea-7e23-fe7d4ea3dc18")
public static String es_PE_COLUMN_GuaranteeDate_Name="Guarantee Date";

@XendraColumn(AD_Element_ID="2956aa9d-0dfd-6e86-af9b-584f4c7eca21",ColumnName="GuaranteeDate",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=29,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0a94d7c0-09ff-25ea-7e23-fe7d4ea3dc18",
Synchronized="2019-08-30 22:22:51.0")
/** Column name GuaranteeDate */
public static final String COLUMNNAME_GuaranteeDate = "GuaranteeDate";
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
@XendraTrl(Identifier="603dfac8-7e52-492f-8963-8861d355c89d")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="603dfac8-7e52-492f-8963-8861d355c89d",
Synchronized="2019-08-30 22:22:51.0")
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
@XendraTrl(Identifier="b8f2b26a-bc62-4a9f-2a32-813b0cdc1f18")
public static String es_PE_FIELD_Order_ImportErrorMessage_Name="Mensajes de Error al Importar";

@XendraTrl(Identifier="b8f2b26a-bc62-4a9f-2a32-813b0cdc1f18")
public static String es_PE_FIELD_Order_ImportErrorMessage_Description="Mensajes generados desde procesos de importación";

@XendraTrl(Identifier="b8f2b26a-bc62-4a9f-2a32-813b0cdc1f18")
public static String es_PE_FIELD_Order_ImportErrorMessage_Help="El mensaje de error de Importación despliega cualquier mensaje de error generado durante el proceso de importación.";

@XendraField(AD_Column_ID="I_ErrorMsg",IsCentrallyMaintained=true,
AD_Tab_ID="0117aed8-fd79-d3b4-27b9-7da5aa03a9e6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=true,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b8f2b26a-bc62-4a9f-2a32-813b0cdc1f18")
public static final String FIELDNAME_Order_ImportErrorMessage="b8f2b26a-bc62-4a9f-2a32-813b0cdc1f18";

@XendraTrl(Identifier="f63ee8c8-6571-93d9-1d7e-01e68eafee75")
public static String es_PE_COLUMN_I_ErrorMsg_Name="Mensajes de Error al Importar";

@XendraColumn(AD_Element_ID="e512e524-25c8-eddd-ad88-d2ce6b66fdc7",ColumnName="I_ErrorMsg",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f63ee8c8-6571-93d9-1d7e-01e68eafee75",
Synchronized="2019-08-30 22:22:51.0")
/** Column name I_ErrorMsg */
public static final String COLUMNNAME_I_ErrorMsg = "I_ErrorMsg";
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

@XendraTrl(Identifier="7ec1f2f8-f484-6d78-9457-b0a2a5fb5489")
public static String es_PE_FIELD_Order_Imported_Name="Importar";

@XendraTrl(Identifier="7ec1f2f8-f484-6d78-9457-b0a2a5fb5489")
public static String es_PE_FIELD_Order_Imported_Description="Esta importación ha sido procesada";

@XendraTrl(Identifier="7ec1f2f8-f484-6d78-9457-b0a2a5fb5489")
public static String es_PE_FIELD_Order_Imported_Help="El cuadro de verificación Importado indica si esta importación ha sido procesada";

@XendraField(AD_Column_ID="I_IsImported",IsCentrallyMaintained=true,
AD_Tab_ID="0117aed8-fd79-d3b4-27b9-7da5aa03a9e6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=true,SeqNo=40,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7ec1f2f8-f484-6d78-9457-b0a2a5fb5489")
public static final String FIELDNAME_Order_Imported="7ec1f2f8-f484-6d78-9457-b0a2a5fb5489";

@XendraTrl(Identifier="9209e7d8-734d-97ce-7b6f-5741caeb85f8")
public static String es_PE_COLUMN_I_IsImported_Name="Importar";

@XendraColumn(AD_Element_ID="f4939725-7d85-767d-540d-feafa759184b",ColumnName="I_IsImported",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9209e7d8-734d-97ce-7b6f-5741caeb85f8",
Synchronized="2019-08-30 22:22:51.0")
/** Column name I_IsImported */
public static final String COLUMNNAME_I_IsImported = "I_IsImported";
/** Set Import Order.
@param I_Order_ID Import Orders */
public void setI_Order_ID (int I_Order_ID)
{
if (I_Order_ID < 1) throw new IllegalArgumentException ("I_Order_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_I_Order_ID, Integer.valueOf(I_Order_ID));
}
/** Get Import Order.
@return Import Orders */
public int getI_Order_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_I_Order_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="543d448a-8566-431f-f3a0-91a3c1b52b2d")
public static String es_PE_FIELD_Order_ImportOrder_Name="Importar Ordenes";

@XendraTrl(Identifier="543d448a-8566-431f-f3a0-91a3c1b52b2d")
public static String es_PE_FIELD_Order_ImportOrder_Description="Importar Ordenes";

@XendraField(AD_Column_ID="I_Order_ID",IsCentrallyMaintained=true,
AD_Tab_ID="0117aed8-fd79-d3b4-27b9-7da5aa03a9e6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="Y=N",DisplayLength=14,IsReadOnly=false,SeqNo=30,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="543d448a-8566-431f-f3a0-91a3c1b52b2d")
public static final String FIELDNAME_Order_ImportOrder="543d448a-8566-431f-f3a0-91a3c1b52b2d";
/** Column name I_Order_ID */
public static final String COLUMNNAME_I_Order_ID = "I_Order_ID";
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

@XendraTrl(Identifier="a62afae8-4c04-d773-7a43-fa9487a1a818")
public static String es_PE_FIELD_Order_SalesTransaction_Name="Transacción de Ventas";

@XendraTrl(Identifier="a62afae8-4c04-d773-7a43-fa9487a1a818")
public static String es_PE_FIELD_Order_SalesTransaction_Description="Esta es una transacción de ventas";

@XendraTrl(Identifier="a62afae8-4c04-d773-7a43-fa9487a1a818")
public static String es_PE_FIELD_Order_SalesTransaction_Help="El cuadro de verificación Transacción de Ventas indica si este ítem es una transacción de ventas";

@XendraField(AD_Column_ID="IsSOTrx",IsCentrallyMaintained=true,
AD_Tab_ID="0117aed8-fd79-d3b4-27b9-7da5aa03a9e6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=130,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a62afae8-4c04-d773-7a43-fa9487a1a818")
public static final String FIELDNAME_Order_SalesTransaction="a62afae8-4c04-d773-7a43-fa9487a1a818";

@XendraTrl(Identifier="d05466ea-960e-a39d-580f-4a5c229cc928")
public static String es_PE_COLUMN_IsSOTrx_Name="Transacción de Ventas";

@XendraColumn(AD_Element_ID="4084b69f-a51d-5676-4d8c-395a13e6b2df",ColumnName="IsSOTrx",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d05466ea-960e-a39d-580f-4a5c229cc928",
Synchronized="2019-08-30 22:22:51.0")
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
@XendraTrl(Identifier="41519f7f-af26-a11d-52f7-80e1314ee9a1")
public static String es_PE_FIELD_Order_LineDescription_Name="Descrición de la Línea";

@XendraTrl(Identifier="41519f7f-af26-a11d-52f7-80e1314ee9a1")
public static String es_PE_FIELD_Order_LineDescription_Description="Descripción de la Línea";

@XendraField(AD_Column_ID="LineDescription",IsCentrallyMaintained=true,
AD_Tab_ID="0117aed8-fd79-d3b4-27b9-7da5aa03a9e6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=490,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="41519f7f-af26-a11d-52f7-80e1314ee9a1")
public static final String FIELDNAME_Order_LineDescription="41519f7f-af26-a11d-52f7-80e1314ee9a1";

@XendraTrl(Identifier="5ccb56bd-a21e-e3c2-e65d-a528d55c9dd9")
public static String es_PE_COLUMN_LineDescription_Name="Descrición de la Línea";

@XendraColumn(AD_Element_ID="733f7ba4-3f04-2155-01fd-78a2da4f49a3",ColumnName="LineDescription",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5ccb56bd-a21e-e3c2-e65d-a528d55c9dd9",
Synchronized="2019-08-30 22:22:51.0")
/** Column name LineDescription */
public static final String COLUMNNAME_LineDescription = "LineDescription";
/** Set Lot No.
@param Lot Lot number (alphanumeric) */
public void setLot (String Lot)
{
if (Lot != null && Lot.length() > 40)
{
log.warning("Length > 40 - truncated");
Lot = Lot.substring(0,39);
}
set_Value (COLUMNNAME_Lot, Lot);
}
/** Get Lot No.
@return Lot number (alphanumeric) */
public String getLot() 
{
String value = (String)get_Value(COLUMNNAME_Lot);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="8ccde11c-1d9a-18ad-6c00-443a85d3d4af")
public static String es_PE_COLUMN_Lot_Name="Lot No";

@XendraColumn(AD_Element_ID="e8a3022e-4a91-6f2a-e27c-3739825075c7",ColumnName="Lot",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="8ccde11c-1d9a-18ad-6c00-443a85d3d4af",
Synchronized="2019-08-30 22:22:52.0")
/** Column name Lot */
public static final String COLUMNNAME_Lot = "Lot";
/** Set Attribute Set Instance.
@param M_AttributeSetInstance_ID Product Attribute Set Instance */
public void setM_AttributeSetInstance_ID (int M_AttributeSetInstance_ID)
{
if (M_AttributeSetInstance_ID <= 0) set_Value (COLUMNNAME_M_AttributeSetInstance_ID, null);
 else 
set_Value (COLUMNNAME_M_AttributeSetInstance_ID, Integer.valueOf(M_AttributeSetInstance_ID));
}
/** Get Attribute Set Instance.
@return Product Attribute Set Instance */
public int getM_AttributeSetInstance_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_AttributeSetInstance_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="3fa4fc62-fff6-fb91-15ca-c83be475ca6c")
public static String es_PE_COLUMN_M_AttributeSetInstance_ID_Name="Attribute Set Instance";

@XendraColumn(AD_Element_ID="137807f2-3c52-e193-3ceb-f10b819cf955",
ColumnName="M_AttributeSetInstance_ID",AD_Reference_ID=35,AD_Reference_Value_ID="",
AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,
IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="",VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="3fa4fc62-fff6-fb91-15ca-c83be475ca6c",Synchronized="2019-08-30 22:22:52.0")
/** Column name M_AttributeSetInstance_ID */
public static final String COLUMNNAME_M_AttributeSetInstance_ID = "M_AttributeSetInstance_ID";
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

@XendraTrl(Identifier="723d1c77-340b-5872-cb42-704100de3352")
public static String es_PE_FIELD_Order_M_PriceList_ID_Name="Lista de Precios";

@XendraTrl(Identifier="723d1c77-340b-5872-cb42-704100de3352")
public static String es_PE_FIELD_Order_M_PriceList_ID_Description="Identificador único de mi lista de precios";

@XendraTrl(Identifier="723d1c77-340b-5872-cb42-704100de3352")
public static String es_PE_FIELD_Order_M_PriceList_ID_Help="Listas de precios son usadas para determinar el precio; margen y costo de artículos comprados ó vendidos.";

@XendraField(AD_Column_ID="M_PriceList_ID",IsCentrallyMaintained=true,
AD_Tab_ID="0117aed8-fd79-d3b4-27b9-7da5aa03a9e6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=170,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="723d1c77-340b-5872-cb42-704100de3352")
public static final String FIELDNAME_Order_M_PriceList_ID="723d1c77-340b-5872-cb42-704100de3352";

@XendraTrl(Identifier="031bf516-9624-b6f9-4496-d838e367dc2b")
public static String es_PE_COLUMN_M_PriceList_ID_Name="Lista de Precios";

@XendraColumn(AD_Element_ID="652afdd3-9ff1-082d-5831-6aad828e0e09",ColumnName="M_PriceList_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="031bf516-9624-b6f9-4496-d838e367dc2b",
Synchronized="2019-08-30 22:22:52.0")
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

@XendraTrl(Identifier="720b4cbe-4bc8-895a-efd6-3ac3a0daf5b0")
public static String es_PE_FIELD_Order_Product_Name="Producto";

@XendraTrl(Identifier="720b4cbe-4bc8-895a-efd6-3ac3a0daf5b0")
public static String es_PE_FIELD_Order_Product_Description="Producto; servicio ó artículo.";

@XendraTrl(Identifier="720b4cbe-4bc8-895a-efd6-3ac3a0daf5b0")
public static String es_PE_FIELD_Order_Product_Help="Identifica un artículo que puede ser comprado ó vendido es esta organización.";

@XendraField(AD_Column_ID="M_Product_ID",IsCentrallyMaintained=true,
AD_Tab_ID="0117aed8-fd79-d3b4-27b9-7da5aa03a9e6",AD_FieldGroup_ID="Product",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=420,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="720b4cbe-4bc8-895a-efd6-3ac3a0daf5b0")
public static final String FIELDNAME_Order_Product="720b4cbe-4bc8-895a-efd6-3ac3a0daf5b0";

@XendraTrl(Identifier="bc033e19-f2e3-e36f-5d4b-08682cd33a5a")
public static String es_PE_COLUMN_M_Product_ID_Name="Producto";

@XendraColumn(AD_Element_ID="b4701f57-f2fc-567c-58e2-a6aefbc3932c",ColumnName="M_Product_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="bc033e19-f2e3-e36f-5d4b-08682cd33a5a",
Synchronized="2019-08-30 22:22:52.0")
/** Column name M_Product_ID */
public static final String COLUMNNAME_M_Product_ID = "M_Product_ID";
/** Set Shipper.
@param M_Shipper_ID Method or manner of product delivery */
public void setM_Shipper_ID (int M_Shipper_ID)
{
if (M_Shipper_ID <= 0) set_Value (COLUMNNAME_M_Shipper_ID, null);
 else 
set_Value (COLUMNNAME_M_Shipper_ID, Integer.valueOf(M_Shipper_ID));
}
/** Get Shipper.
@return Method or manner of product delivery */
public int getM_Shipper_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_Shipper_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="70fbd63f-7de6-4ac1-aba1-d266d9c36152")
public static String es_PE_FIELD_Order_Shipper_Name="Transportista";

@XendraTrl(Identifier="70fbd63f-7de6-4ac1-aba1-d266d9c36152")
public static String es_PE_FIELD_Order_Shipper_Description="Método ó manera de entrega del producto";

@XendraTrl(Identifier="70fbd63f-7de6-4ac1-aba1-d266d9c36152")
public static String es_PE_FIELD_Order_Shipper_Help="El transportista indica el responsable de entregar el producto";

@XendraField(AD_Column_ID="M_Shipper_ID",IsCentrallyMaintained=true,
AD_Tab_ID="0117aed8-fd79-d3b4-27b9-7da5aa03a9e6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=210,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="70fbd63f-7de6-4ac1-aba1-d266d9c36152")
public static final String FIELDNAME_Order_Shipper="70fbd63f-7de6-4ac1-aba1-d266d9c36152";

@XendraTrl(Identifier="d5a1fd6b-f4bf-c1c1-054e-70dd80a2061b")
public static String es_PE_COLUMN_M_Shipper_ID_Name="Transportista";

@XendraColumn(AD_Element_ID="9aa20cfc-6f2b-2463-7be0-888a548ba3ad",ColumnName="M_Shipper_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d5a1fd6b-f4bf-c1c1-054e-70dd80a2061b",
Synchronized="2019-08-30 22:22:52.0")
/** Column name M_Shipper_ID */
public static final String COLUMNNAME_M_Shipper_ID = "M_Shipper_ID";
/** Set Warehouse.
@param M_Warehouse_ID Storage Warehouse and Service Point */
public void setM_Warehouse_ID (int M_Warehouse_ID)
{
if (M_Warehouse_ID <= 0) set_Value (COLUMNNAME_M_Warehouse_ID, null);
 else 
set_Value (COLUMNNAME_M_Warehouse_ID, Integer.valueOf(M_Warehouse_ID));
}
/** Get Warehouse.
@return Storage Warehouse and Service Point */
public int getM_Warehouse_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_Warehouse_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="4850cc8c-4136-9745-020c-b4deae00623e")
public static String es_PE_FIELD_Order_Warehouse_Name="Almacén";

@XendraTrl(Identifier="4850cc8c-4136-9745-020c-b4deae00623e")
public static String es_PE_FIELD_Order_Warehouse_Description="Almacén";

@XendraTrl(Identifier="4850cc8c-4136-9745-020c-b4deae00623e")
public static String es_PE_FIELD_Order_Warehouse_Help="El Almacén indica un Almacén único donde los productos son almacenados";

@XendraField(AD_Column_ID="M_Warehouse_ID",IsCentrallyMaintained=true,
AD_Tab_ID="0117aed8-fd79-d3b4-27b9-7da5aa03a9e6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=200,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="4850cc8c-4136-9745-020c-b4deae00623e")
public static final String FIELDNAME_Order_Warehouse="4850cc8c-4136-9745-020c-b4deae00623e";

@XendraTrl(Identifier="a60036e8-0674-d535-d699-98ad99db1c98")
public static String es_PE_COLUMN_M_Warehouse_ID_Name="Almacén";

@XendraColumn(AD_Element_ID="402045cd-baa5-aeaf-b148-a921dffb7821",ColumnName="M_Warehouse_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a60036e8-0674-d535-d699-98ad99db1c98",
Synchronized="2019-08-30 22:22:52.0")
/** Column name M_Warehouse_ID */
public static final String COLUMNNAME_M_Warehouse_ID = "M_Warehouse_ID";
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
@XendraTrl(Identifier="d283634f-ef2d-b602-466e-ffb52bd928c9")
public static String es_PE_FIELD_Order_Name_Name="Nombre";

@XendraTrl(Identifier="d283634f-ef2d-b602-466e-ffb52bd928c9")
public static String es_PE_FIELD_Order_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="d283634f-ef2d-b602-466e-ffb52bd928c9")
public static String es_PE_FIELD_Order_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraField(AD_Column_ID="Name",IsCentrallyMaintained=true,
AD_Tab_ID="0117aed8-fd79-d3b4-27b9-7da5aa03a9e6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=240,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d283634f-ef2d-b602-466e-ffb52bd928c9")
public static final String FIELDNAME_Order_Name="d283634f-ef2d-b602-466e-ffb52bd928c9";

@XendraTrl(Identifier="5e55f5ba-446b-591d-d163-95a94ad6f36d")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5e55f5ba-446b-591d-d163-95a94ad6f36d",
Synchronized="2019-08-30 22:22:52.0")
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
@XendraTrl(Identifier="b96d41a2-fc8f-e313-197a-fa38f9fb3276")
public static String es_PE_FIELD_Order_PaymentTermKey_Name="Clave Termino Pagos";

@XendraTrl(Identifier="b96d41a2-fc8f-e313-197a-fa38f9fb3276")
public static String es_PE_FIELD_Order_PaymentTermKey_Description="Clave del termino de Pago";

@XendraField(AD_Column_ID="PaymentTermValue",IsCentrallyMaintained=true,
AD_Tab_ID="0117aed8-fd79-d3b4-27b9-7da5aa03a9e6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=180,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b96d41a2-fc8f-e313-197a-fa38f9fb3276")
public static final String FIELDNAME_Order_PaymentTermKey="b96d41a2-fc8f-e313-197a-fa38f9fb3276";

@XendraTrl(Identifier="28b876ac-10a9-ac24-e98f-ff3a2b35852b")
public static String es_PE_COLUMN_PaymentTermValue_Name="Clave Termino Pagos";

@XendraColumn(AD_Element_ID="5c0d18e2-ed10-54b1-2224-726d719adbf6",ColumnName="PaymentTermValue",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="28b876ac-10a9-ac24-e98f-ff3a2b35852b",
Synchronized="2019-08-30 22:22:52.0")
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
@XendraTrl(Identifier="a9d156d7-ef85-064f-d4c6-cf3cea149f6e")
public static String es_PE_FIELD_Order_Phone_Name="Teléfono";

@XendraTrl(Identifier="a9d156d7-ef85-064f-d4c6-cf3cea149f6e")
public static String es_PE_FIELD_Order_Phone_Description="Identifica un número telefónico";

@XendraTrl(Identifier="a9d156d7-ef85-064f-d4c6-cf3cea149f6e")
public static String es_PE_FIELD_Order_Phone_Help="El campo teléfono identifica un No. telefónico.";

@XendraField(AD_Column_ID="Phone",IsCentrallyMaintained=true,
AD_Tab_ID="0117aed8-fd79-d3b4-27b9-7da5aa03a9e6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=380,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a9d156d7-ef85-064f-d4c6-cf3cea149f6e")
public static final String FIELDNAME_Order_Phone="a9d156d7-ef85-064f-d4c6-cf3cea149f6e";

@XendraTrl(Identifier="1e60ae12-325b-d48e-98e4-ada415bdc975")
public static String es_PE_COLUMN_Phone_Name="Teléfono";

@XendraColumn(AD_Element_ID="4842df23-a82d-d921-7e1e-5869844caceb",ColumnName="Phone",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="1e60ae12-325b-d48e-98e4-ada415bdc975",
Synchronized="2019-08-30 22:22:52.0")
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
@XendraTrl(Identifier="4fddf520-c7e6-872b-681c-757b6b25c1b2")
public static String es_PE_FIELD_Order_ZIP_Name="Código Postal";

@XendraTrl(Identifier="4fddf520-c7e6-872b-681c-757b6b25c1b2")
public static String es_PE_FIELD_Order_ZIP_Description="Código Postal";

@XendraTrl(Identifier="4fddf520-c7e6-872b-681c-757b6b25c1b2")
public static String es_PE_FIELD_Order_ZIP_Help="El campo Código Postal identifica el código postal para esta entidad";

@XendraField(AD_Column_ID="Postal",IsCentrallyMaintained=true,
AD_Tab_ID="0117aed8-fd79-d3b4-27b9-7da5aa03a9e6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=310,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="4fddf520-c7e6-872b-681c-757b6b25c1b2")
public static final String FIELDNAME_Order_ZIP="4fddf520-c7e6-872b-681c-757b6b25c1b2";

@XendraTrl(Identifier="454f7eed-ec37-0ed8-92ba-a2d573abd6c1")
public static String es_PE_COLUMN_Postal_Name="Código Postal";

@XendraColumn(AD_Element_ID="b91ba048-ef4f-31e3-3865-fa3cff649df8",ColumnName="Postal",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="454f7eed-ec37-0ed8-92ba-a2d573abd6c1",
Synchronized="2019-08-30 22:22:52.0")
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

@XendraTrl(Identifier="7833c47e-7081-2799-3b78-06fd84881931")
public static String es_PE_FIELD_Order_UnitPrice_Name="Precio Actual";

@XendraTrl(Identifier="7833c47e-7081-2799-3b78-06fd84881931")
public static String es_PE_FIELD_Order_UnitPrice_Description="Precio Actual";

@XendraTrl(Identifier="7833c47e-7081-2799-3b78-06fd84881931")
public static String es_PE_FIELD_Order_UnitPrice_Help="El precio Actual ó Unitario indica el precio para un producto en la moneda fuente.";

@XendraField(AD_Column_ID="PriceActual",IsCentrallyMaintained=true,
AD_Tab_ID="0117aed8-fd79-d3b4-27b9-7da5aa03a9e6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=480,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7833c47e-7081-2799-3b78-06fd84881931")
public static final String FIELDNAME_Order_UnitPrice="7833c47e-7081-2799-3b78-06fd84881931";

@XendraTrl(Identifier="41de0980-d507-4b83-45f3-268fe2066caf")
public static String es_PE_COLUMN_PriceActual_Name="Precio Actual";

@XendraColumn(AD_Element_ID="8ee15d33-8f4b-598f-dc4c-9d67f968a13c",ColumnName="PriceActual",
AD_Reference_ID=37,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="41de0980-d507-4b83-45f3-268fe2066caf",
Synchronized="2019-08-30 22:22:52.0")
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

@XendraTrl(Identifier="34bd70bb-ac9e-ccb1-b573-8cf122b97f6b")
public static String es_PE_FIELD_Order_Processed_Name="Procesado";

@XendraTrl(Identifier="34bd70bb-ac9e-ccb1-b573-8cf122b97f6b")
public static String es_PE_FIELD_Order_Processed_Description="El documento ha sido procesado";

@XendraTrl(Identifier="34bd70bb-ac9e-ccb1-b573-8cf122b97f6b")
public static String es_PE_FIELD_Order_Processed_Help="El cuadro de verificación procesada indica que un documento ha sido procesado";

@XendraField(AD_Column_ID="Processed",IsCentrallyMaintained=true,
AD_Tab_ID="0117aed8-fd79-d3b4-27b9-7da5aa03a9e6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=true,SeqNo=580,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="34bd70bb-ac9e-ccb1-b573-8cf122b97f6b")
public static final String FIELDNAME_Order_Processed="34bd70bb-ac9e-ccb1-b573-8cf122b97f6b";

@XendraTrl(Identifier="57d2d6fe-b059-b4ba-3b5d-b004c22bb06b")
public static String es_PE_COLUMN_Processed_Name="Procesado";

@XendraColumn(AD_Element_ID="3f7035d2-fa5e-7416-fc0c-e49e43f9e083",ColumnName="Processed",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="57d2d6fe-b059-b4ba-3b5d-b004c22bb06b",
Synchronized="2019-08-30 22:22:52.0")
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

@XendraTrl(Identifier="e4d5bcb2-55c0-ac7f-639b-dcbe79be717d")
public static String es_PE_FIELD_Order_ProcessNow_Name="Importa Ordenes";

@XendraTrl(Identifier="e4d5bcb2-55c0-ac7f-639b-dcbe79be717d")
public static String es_PE_FIELD_Order_ProcessNow_Description="Importa Ordenes";

@XendraTrl(Identifier="e4d5bcb2-55c0-ac7f-639b-dcbe79be717d")
public static String es_PE_FIELD_Order_ProcessNow_Help="Los parámetros son valores prefijados para los valores nulos del expediente de la importación, ellos no sobreescriben ningunos datos.";

@XendraField(AD_Column_ID="Processing",IsCentrallyMaintained=true,
AD_Tab_ID="0117aed8-fd79-d3b4-27b9-7da5aa03a9e6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=570,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e4d5bcb2-55c0-ac7f-639b-dcbe79be717d")
public static final String FIELDNAME_Order_ProcessNow="e4d5bcb2-55c0-ac7f-639b-dcbe79be717d";

@XendraTrl(Identifier="5bc6b3b6-288c-d0ae-453b-1c69ba650f7a")
public static String es_PE_COLUMN_Processing_Name="Procesar Ahora";

@XendraColumn(AD_Element_ID="f2096404-1a98-35ec-09ea-273b3e19b7de",ColumnName="Processing",
AD_Reference_ID=28,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="3adaf467-d579-de9c-943a-7add85f9ba7f",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="5bc6b3b6-288c-d0ae-453b-1c69ba650f7a",Synchronized="2019-08-30 22:22:52.0")
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
@XendraTrl(Identifier="57b4cc6b-9bbe-5a68-6b0d-a0de39785e94")
public static String es_PE_FIELD_Order_ProductKey_Name="Sólo Valor de Producto";

@XendraTrl(Identifier="57b4cc6b-9bbe-5a68-6b0d-a0de39785e94")
public static String es_PE_FIELD_Order_ProductKey_Description="Generar lista de conteo solamente para este valor del producto (Usted puede usar %)";

@XendraField(AD_Column_ID="ProductValue",IsCentrallyMaintained=true,
AD_Tab_ID="0117aed8-fd79-d3b4-27b9-7da5aa03a9e6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=430,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="57b4cc6b-9bbe-5a68-6b0d-a0de39785e94")
public static final String FIELDNAME_Order_ProductKey="57b4cc6b-9bbe-5a68-6b0d-a0de39785e94";

@XendraTrl(Identifier="9aaad5ee-8f4c-e9bb-bf61-0b02578fec18")
public static String es_PE_COLUMN_ProductValue_Name="Sólo Valor de Producto";

@XendraColumn(AD_Element_ID="3c72be08-8fa7-5282-1e16-ddcbc46035d8",ColumnName="ProductValue",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9aaad5ee-8f4c-e9bb-bf61-0b02578fec18",
Synchronized="2019-08-30 22:22:52.0")
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

@XendraTrl(Identifier="98969026-040a-b19e-f975-e547cb15998a")
public static String es_PE_FIELD_Order_OrderedQuantity_Name="Cantidad Ordenada";

@XendraTrl(Identifier="98969026-040a-b19e-f975-e547cb15998a")
public static String es_PE_FIELD_Order_OrderedQuantity_Description="Cantidad ordenada";

@XendraTrl(Identifier="98969026-040a-b19e-f975-e547cb15998a")
public static String es_PE_FIELD_Order_OrderedQuantity_Help="La Cantidad Ordenada indica la cantidad de un producto que fue ordenada";

@XendraField(AD_Column_ID="QtyOrdered",IsCentrallyMaintained=true,
AD_Tab_ID="0117aed8-fd79-d3b4-27b9-7da5aa03a9e6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=470,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="98969026-040a-b19e-f975-e547cb15998a")
public static final String FIELDNAME_Order_OrderedQuantity="98969026-040a-b19e-f975-e547cb15998a";

@XendraTrl(Identifier="94b0e108-1394-102a-4472-8905f5d2255d")
public static String es_PE_COLUMN_QtyOrdered_Name="Cantidad Ordenada";

@XendraColumn(AD_Element_ID="2f601325-19ce-9544-d9df-693c76cbde8a",ColumnName="QtyOrdered",
AD_Reference_ID=29,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="94b0e108-1394-102a-4472-8905f5d2255d",
Synchronized="2019-08-30 22:22:52.0")
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
@XendraTrl(Identifier="750b9763-6cfe-71d0-e5ac-f2d5301cd318")
public static String es_PE_FIELD_Order_Region2_Name="Nombre de Región";

@XendraTrl(Identifier="750b9763-6cfe-71d0-e5ac-f2d5301cd318")
public static String es_PE_FIELD_Order_Region2_Description="Nombre de esta región";

@XendraTrl(Identifier="750b9763-6cfe-71d0-e5ac-f2d5301cd318")
public static String es_PE_FIELD_Order_Region2_Help="El nombre de región define el nombre que se imprimirá cuando esta región se use en un documento.";

@XendraField(AD_Column_ID="RegionName",IsCentrallyMaintained=true,
AD_Tab_ID="0117aed8-fd79-d3b4-27b9-7da5aa03a9e6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=320,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="750b9763-6cfe-71d0-e5ac-f2d5301cd318")
public static final String FIELDNAME_Order_Region2="750b9763-6cfe-71d0-e5ac-f2d5301cd318";

@XendraTrl(Identifier="accc8726-6357-d677-e17f-5cc9f0c7f50b")
public static String es_PE_COLUMN_RegionName_Name="Nombre de Región";

@XendraColumn(AD_Element_ID="b2bf2a97-80d5-f41e-ee37-c6093627a1b0",ColumnName="RegionName",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="accc8726-6357-d677-e17f-5cc9f0c7f50b",
Synchronized="2019-08-30 22:22:52.0")
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

@XendraTrl(Identifier="1f435c51-14f3-7997-5d62-f9d2e303a9fd")
public static String es_PE_FIELD_Order_SalesRepresentative_Name="Agente Cía";

@XendraTrl(Identifier="1f435c51-14f3-7997-5d62-f9d2e303a9fd")
public static String es_PE_FIELD_Order_SalesRepresentative_Description="Representante de Ventas";

@XendraTrl(Identifier="1f435c51-14f3-7997-5d62-f9d2e303a9fd")
public static String es_PE_FIELD_Order_SalesRepresentative_Help="El representante de ventas indica el representante de ventas para esta región.";

@XendraField(AD_Column_ID="SalesRep_ID",IsCentrallyMaintained=true,
AD_Tab_ID="0117aed8-fd79-d3b4-27b9-7da5aa03a9e6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=150,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1f435c51-14f3-7997-5d62-f9d2e303a9fd")
public static final String FIELDNAME_Order_SalesRepresentative="1f435c51-14f3-7997-5d62-f9d2e303a9fd";

@XendraTrl(Identifier="e72d822f-6c7b-a251-a0a3-b5d9b108892b")
public static String es_PE_COLUMN_SalesRep_ID_Name="Agente Cía";

@XendraColumn(AD_Element_ID="197a9c3a-ff10-c291-d65f-5e05a36d3710",ColumnName="SalesRep_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="15251147-a1b6-4a83-a3a5-2d3ae7db69d9",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="e72d822f-6c7b-a251-a0a3-b5d9b108892b",Synchronized="2019-08-30 22:22:52.0")
/** Column name SalesRep_ID */
public static final String COLUMNNAME_SalesRep_ID = "SalesRep_ID";
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
@XendraTrl(Identifier="d2c034d0-16a4-0cc2-5c37-e8487c0b288e")
public static String es_PE_FIELD_Order_SKU_Name="UM Almacenamiento";

@XendraTrl(Identifier="d2c034d0-16a4-0cc2-5c37-e8487c0b288e")
public static String es_PE_FIELD_Order_SKU_Description="Unidad de Mantenimiento en Inventario";

@XendraTrl(Identifier="d2c034d0-16a4-0cc2-5c37-e8487c0b288e")
public static String es_PE_FIELD_Order_SKU_Help="El SKU indica la unidad de almacenamiento de inventario definida por el usuario. Puede ser usada por  una simbología adicional de código de barras ó por su propio esquema .";

@XendraField(AD_Column_ID="SKU",IsCentrallyMaintained=true,
AD_Tab_ID="0117aed8-fd79-d3b4-27b9-7da5aa03a9e6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=440,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d2c034d0-16a4-0cc2-5c37-e8487c0b288e")
public static final String FIELDNAME_Order_SKU="d2c034d0-16a4-0cc2-5c37-e8487c0b288e";

@XendraTrl(Identifier="d9b28730-86ec-5054-fa03-7ab954f3b4e3")
public static String es_PE_COLUMN_SKU_Name="UM Almacenamiento";

@XendraColumn(AD_Element_ID="f473a6ed-4a3f-b6fd-5b0f-06d49c1e65e2",ColumnName="SKU",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=30,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d9b28730-86ec-5054-fa03-7ab954f3b4e3",
Synchronized="2019-08-30 22:22:52.0")
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

@XendraTrl(Identifier="fc9d2768-0722-ef18-2ecd-1cc19a2b2d6f")
public static String es_PE_FIELD_Order_TaxAmount_Name="Total del Impuesto";

@XendraTrl(Identifier="fc9d2768-0722-ef18-2ecd-1cc19a2b2d6f")
public static String es_PE_FIELD_Order_TaxAmount_Description="Total del impuesto para un documento";

@XendraTrl(Identifier="fc9d2768-0722-ef18-2ecd-1cc19a2b2d6f")
public static String es_PE_FIELD_Order_TaxAmount_Help="El Total de Impuesto despliega el total de impuesto para un documento";

@XendraField(AD_Column_ID="TaxAmt",IsCentrallyMaintained=true,
AD_Tab_ID="0117aed8-fd79-d3b4-27b9-7da5aa03a9e6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=520,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="fc9d2768-0722-ef18-2ecd-1cc19a2b2d6f")
public static final String FIELDNAME_Order_TaxAmount="fc9d2768-0722-ef18-2ecd-1cc19a2b2d6f";

@XendraTrl(Identifier="ffd4210a-684d-6f24-b84a-27be323c9a02")
public static String es_PE_COLUMN_TaxAmt_Name="Total del Impuesto";

@XendraColumn(AD_Element_ID="462941e1-a196-170f-fd16-84da06ba50ea",ColumnName="TaxAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ffd4210a-684d-6f24-b84a-27be323c9a02",
Synchronized="2019-08-30 22:22:52.0")
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
@XendraTrl(Identifier="8dbf218d-eb8b-13cf-77e9-9e05ab7f1414")
public static String es_PE_FIELD_Order_TaxIndicator_Name="Identificador de Impuesto";

@XendraTrl(Identifier="8dbf218d-eb8b-13cf-77e9-9e05ab7f1414")
public static String es_PE_FIELD_Order_TaxIndicator_Description="Forma corta para que el impuesto sea impreso en los documentos";

@XendraTrl(Identifier="8dbf218d-eb8b-13cf-77e9-9e05ab7f1414")
public static String es_PE_FIELD_Order_TaxIndicator_Help="El Indicador de Impuesto identifica el nombre corto que se imprimirá en un documento haciendo referencia a este impuesto.";

@XendraField(AD_Column_ID="TaxIndicator",IsCentrallyMaintained=true,
AD_Tab_ID="0117aed8-fd79-d3b4-27b9-7da5aa03a9e6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=5,IsReadOnly=false,SeqNo=500,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8dbf218d-eb8b-13cf-77e9-9e05ab7f1414")
public static final String FIELDNAME_Order_TaxIndicator="8dbf218d-eb8b-13cf-77e9-9e05ab7f1414";

@XendraTrl(Identifier="1dce073b-0218-379a-805a-f058d9862093")
public static String es_PE_COLUMN_TaxIndicator_Name="Identificador de Impuesto";

@XendraColumn(AD_Element_ID="099119b1-a377-e966-4537-2f056d06fb9d",ColumnName="TaxIndicator",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=5,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="1dce073b-0218-379a-805a-f058d9862093",
Synchronized="2019-08-30 22:22:52.0")
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
@XendraTrl(Identifier="179ec665-68cf-8202-155e-d307ad3e06b3")
public static String es_PE_FIELD_Order_UPCEAN_Name="UPC/EAN";

@XendraTrl(Identifier="179ec665-68cf-8202-155e-d307ad3e06b3")
public static String es_PE_FIELD_Order_UPCEAN_Description="Código de Barras (Codigo universal del Producto ó su super conjunto, Número de Articulo europeo)";

@XendraTrl(Identifier="179ec665-68cf-8202-155e-d307ad3e06b3")
public static String es_PE_FIELD_Order_UPCEAN_Help="Use este campo para introducir el código de barras para el producto en cualquiera de las simbologías del código de barras  (Codabar; Código 25; Código 39; Código 93; Código 128; UPC (A); UPC (E); EAN-13; EAN-8; ITF; ITF-14; ISBN; ISSN; JAN-13; JAN-8; POSTNET y FIM; MSI/Plessey; y Pharmacode)";

@XendraField(AD_Column_ID="UPC",IsCentrallyMaintained=true,
AD_Tab_ID="0117aed8-fd79-d3b4-27b9-7da5aa03a9e6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=450,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="179ec665-68cf-8202-155e-d307ad3e06b3")
public static final String FIELDNAME_Order_UPCEAN="179ec665-68cf-8202-155e-d307ad3e06b3";

@XendraTrl(Identifier="6f90a016-fc5c-a105-0d61-b2fcacebd455")
public static String es_PE_COLUMN_UPC_Name="UPC/EAN";

@XendraColumn(AD_Element_ID="9e36272a-ec41-b187-d531-cec50070c612",ColumnName="UPC",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=30,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6f90a016-fc5c-a105-0d61-b2fcacebd455",
Synchronized="2019-08-30 22:22:52.0")
/** Column name UPC */
public static final String COLUMNNAME_UPC = "UPC";
/** Set Search Key.
@param Value Search key for the record in the format required - must be unique */
public void setValue (String Value)
{
if (Value != null && Value.length() > 40)
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
@XendraTrl(Identifier="27a105dd-a573-810e-ab3b-4f0703f30d02")
public static String es_PE_FIELD_Order_SearchKey_Name="Clave de Búsqueda";

@XendraTrl(Identifier="27a105dd-a573-810e-ab3b-4f0703f30d02")
public static String es_PE_FIELD_Order_SearchKey_Description="Clave de búsqueda para el registro en el formato requerido; debe ser única";

@XendraTrl(Identifier="27a105dd-a573-810e-ab3b-4f0703f30d02")
public static String es_PE_FIELD_Order_SearchKey_Help="Una clave de búsqueda le permite a usted un método rápido de encontrar un registro en particular";

@XendraField(AD_Column_ID="Value",IsCentrallyMaintained=true,
AD_Tab_ID="0117aed8-fd79-d3b4-27b9-7da5aa03a9e6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=40,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="27a105dd-a573-810e-ab3b-4f0703f30d02")
public static final String FIELDNAME_Order_SearchKey="27a105dd-a573-810e-ab3b-4f0703f30d02";

@XendraTrl(Identifier="1f546f2f-f978-cdbb-f770-0a24cc93ca98")
public static String es_PE_COLUMN_Value_Name="Search Key";

@XendraColumn(AD_Element_ID="e75e100c-9b41-a643-2cb3-46eeced683d8",ColumnName="Value",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="1f546f2f-f978-cdbb-f770-0a24cc93ca98",
Synchronized="2019-08-30 22:22:52.0")
/** Column name Value */
public static final String COLUMNNAME_Value = "Value";
}
