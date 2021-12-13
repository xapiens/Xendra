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
/** Generated Model for I_BPartner
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_I_BPartner extends PO
{
/** Standard Constructor
@param ctx context
@param I_BPartner_ID id
@param trxName transaction
*/
public X_I_BPartner (Properties ctx, int I_BPartner_ID, String trxName)
{
super (ctx, I_BPartner_ID, trxName);
/** if (I_BPartner_ID == 0)
{
setAddress1 (null);
setC_BP_Group_ID (0);
setC_Country_ID (0);
setCity (null);
setC_Region_ID (0);
setI_BPartner_ID (0);
setI_IsImported (false);	
// N
setName (null);
setTaxID (null);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_I_BPartner (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=533 */
public static int Table_ID=MTable.getTable_ID("I_BPartner");

@XendraTrl(Identifier="5e6613b5-656e-2c6a-2d1a-f89e31f022e6")
public static String es_PE_TAB_ImportBusinessPartner_Name="Importar Socios de Negocio";

@XendraTab(Name="Import Business Partner",Description="",Help="",
AD_Window_ID="4284ef94-db25-eaa3-d8c9-8a9342dc3999",SeqNo=10,TabLevel=0,IsSingleRow=true,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="5e6613b5-656e-2c6a-2d1a-f89e31f022e6",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_ImportBusinessPartner="5e6613b5-656e-2c6a-2d1a-f89e31f022e6";

@XendraTrl(Identifier="a0eeffc2-0b34-7edb-a6ed-a06d31c86cd9")
public static String es_PE_TABLE_I_BPartner_Name="Importar Socio de Negocio";

@XendraTable(Name="Import Business Partner",AD_Package_ID="645f34c0-ea3a-ac63-618d-8ca49873c33b",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="",Help="",TableName="I_BPartner",
AccessLevel="2",AD_Window_ID="4284ef94-db25-eaa3-d8c9-8a9342dc3999",AD_Val_Rule_ID="",IsKey=1,
LoadSeq=145,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,
IsView=false,PO_Window_ID="",ID="org.xendra.import",
Identifier="a0eeffc2-0b34-7edb-a6ed-a06d31c86cd9",Synchronized="2020-03-03 21:38:06.0")
/** TableName=I_BPartner */
public static final String Table_Name="I_BPartner";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"I_BPartner");

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
    Table_ID = MTable.getTable_ID("I_BPartner");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_I_BPartner[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Address 1.
@param Address1 Address line 1 for this location */
public void setAddress1 (String Address1)
{
if (Address1 == null) throw new IllegalArgumentException ("Address1 is mandatory.");
if (Address1.length() > 60)
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
@XendraTrl(Identifier="0c9a8701-6ed0-22c9-9039-9a6d997e6d07")
public static String es_PE_FIELD_ImportBusinessPartner_Address_Name="Calle";

@XendraTrl(Identifier="0c9a8701-6ed0-22c9-9039-9a6d997e6d07")
public static String es_PE_FIELD_ImportBusinessPartner_Address_Description="Dirección para esta ubicación";

@XendraTrl(Identifier="0c9a8701-6ed0-22c9-9039-9a6d997e6d07")
public static String es_PE_FIELD_ImportBusinessPartner_Address_Help="La Dirección 1 identifica la dirección para una entidad";

@XendraField(AD_Column_ID="Address1",IsCentrallyMaintained=true,
AD_Tab_ID="5e6613b5-656e-2c6a-2d1a-f89e31f022e6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=330,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0c9a8701-6ed0-22c9-9039-9a6d997e6d07")
public static final String FIELDNAME_ImportBusinessPartner_Address="0c9a8701-6ed0-22c9-9039-9a6d997e6d07";

@XendraTrl(Identifier="fa361941-0420-7e2c-8b7d-714345520979")
public static String es_PE_COLUMN_Address1_Name="Calle";

@XendraColumn(AD_Element_ID="25535414-be76-de81-69b4-106e2150a04a",ColumnName="Address1",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="fa361941-0420-7e2c-8b7d-714345520979",
Synchronized="2019-08-30 22:22:46.0")
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
@XendraTrl(Identifier="f9057008-d581-1ef7-1d11-cc6f05316be4")
public static String es_PE_FIELD_ImportBusinessPartner_Address22_Name="Colonía";

@XendraTrl(Identifier="f9057008-d581-1ef7-1d11-cc6f05316be4")
public static String es_PE_FIELD_ImportBusinessPartner_Address22_Description="Dirección 2 para esta ubicación";

@XendraTrl(Identifier="f9057008-d581-1ef7-1d11-cc6f05316be4")
public static String es_PE_FIELD_ImportBusinessPartner_Address22_Help="La Dirección 2 provee información de la dirección adicional para una entidad. Puede ser usada para integrar la ubicación; número de apartamento; ó información similar";

@XendraField(AD_Column_ID="Address2",IsCentrallyMaintained=true,
AD_Tab_ID="5e6613b5-656e-2c6a-2d1a-f89e31f022e6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=340,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f9057008-d581-1ef7-1d11-cc6f05316be4")
public static final String FIELDNAME_ImportBusinessPartner_Address22="f9057008-d581-1ef7-1d11-cc6f05316be4";

@XendraTrl(Identifier="cae5ad2c-9029-eefc-e166-e18c19b6ba9b")
public static String es_PE_COLUMN_Address2_Name="Colonía";

@XendraColumn(AD_Element_ID="a3cd6592-3282-7ed0-953e-16e24d22cc17",ColumnName="Address2",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="cae5ad2c-9029-eefc-e166-e18c19b6ba9b",
Synchronized="2019-08-30 22:22:46.0")
/** Column name Address2 */
public static final String COLUMNNAME_Address2 = "Address2";
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

@XendraTrl(Identifier="d3898c38-a20f-9a28-61bd-f88a413cb8bc")
public static String es_PE_FIELD_ImportBusinessPartner_UserContact_Name="Usuario";

@XendraTrl(Identifier="d3898c38-a20f-9a28-61bd-f88a413cb8bc")
public static String es_PE_FIELD_ImportBusinessPartner_UserContact_Description="ID de Usuario dentro del sistema";

@XendraTrl(Identifier="d3898c38-a20f-9a28-61bd-f88a413cb8bc")
public static String es_PE_FIELD_ImportBusinessPartner_UserContact_Help="La ID de usuario identifica un usuario único en el sistema";

@XendraField(AD_Column_ID="AD_User_ID",IsCentrallyMaintained=true,
AD_Tab_ID="5e6613b5-656e-2c6a-2d1a-f89e31f022e6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=true,SeqNo=250,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d3898c38-a20f-9a28-61bd-f88a413cb8bc")
public static final String FIELDNAME_ImportBusinessPartner_UserContact="d3898c38-a20f-9a28-61bd-f88a413cb8bc";

@XendraTrl(Identifier="4281f9da-84fb-b6af-7cdc-3a9c437f219a")
public static String es_PE_COLUMN_AD_User_ID_Name="Usuario";

@XendraColumn(AD_Element_ID="abdf8dee-d3cd-73ec-c758-683e907797f4",ColumnName="AD_User_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="f4ac36a1-4200-1386-677e-14ac90afb4fe",
FieldLength=22,DefaultValue="-1",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="4281f9da-84fb-b6af-7cdc-3a9c437f219a",Synchronized="2019-08-30 22:22:46.0")
/** Column name AD_User_ID */
public static final String COLUMNNAME_AD_User_ID = "AD_User_ID";
/** Set Birthday.
@param Birthday Birthday or Anniversary day */
public void setBirthday (Timestamp Birthday)
{
set_Value (COLUMNNAME_Birthday, Birthday);
}
/** Get Birthday.
@return Birthday or Anniversary day */
public Timestamp getBirthday() 
{
return (Timestamp)get_Value(COLUMNNAME_Birthday);
}

@XendraTrl(Identifier="a5d90b9e-f294-dee3-a5c9-ee0b4598f697")
public static String es_PE_FIELD_ImportBusinessPartner_Birthday_Name="Cumpleaños";

@XendraTrl(Identifier="a5d90b9e-f294-dee3-a5c9-ee0b4598f697")
public static String es_PE_FIELD_ImportBusinessPartner_Birthday_Description="Cumpleaños ó día de aniversario";

@XendraTrl(Identifier="a5d90b9e-f294-dee3-a5c9-ee0b4598f697")
public static String es_PE_FIELD_ImportBusinessPartner_Birthday_Help="Cumpleaños ó día de aniversario";

@XendraField(AD_Column_ID="Birthday",IsCentrallyMaintained=true,
AD_Tab_ID="5e6613b5-656e-2c6a-2d1a-f89e31f022e6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=210,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a5d90b9e-f294-dee3-a5c9-ee0b4598f697")
public static final String FIELDNAME_ImportBusinessPartner_Birthday="a5d90b9e-f294-dee3-a5c9-ee0b4598f697";

@XendraTrl(Identifier="5175da30-ac26-e21f-462f-0f247100a623")
public static String es_PE_COLUMN_Birthday_Name="Cumpleaños";

@XendraColumn(AD_Element_ID="5767cb2c-56e6-05de-20a9-958edf7be231",ColumnName="Birthday",
AD_Reference_ID=15,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5175da30-ac26-e21f-462f-0f247100a623",
Synchronized="2019-08-30 22:22:46.0")
/** Column name Birthday */
public static final String COLUMNNAME_Birthday = "Birthday";
/** Set BP Contact Greeting.
@param BPContactGreeting Greeting for Business Partner Contact */
public void setBPContactGreeting (String BPContactGreeting)
{
if (BPContactGreeting != null && BPContactGreeting.length() > 60)
{
log.warning("Length > 60 - truncated");
BPContactGreeting = BPContactGreeting.substring(0,59);
}
set_Value (COLUMNNAME_BPContactGreeting, BPContactGreeting);
}
/** Get BP Contact Greeting.
@return Greeting for Business Partner Contact */
public String getBPContactGreeting() 
{
String value = (String)get_Value(COLUMNNAME_BPContactGreeting);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="a389c591-0995-5640-cd50-0dd27209af25")
public static String es_PE_FIELD_ImportBusinessPartner_BPContactGreeting_Name="Saludo contacto del socio";

@XendraTrl(Identifier="a389c591-0995-5640-cd50-0dd27209af25")
public static String es_PE_FIELD_ImportBusinessPartner_BPContactGreeting_Description="Saludo para el contacto del socio (BP)";

@XendraField(AD_Column_ID="BPContactGreeting",IsCentrallyMaintained=true,
AD_Tab_ID="5e6613b5-656e-2c6a-2d1a-f89e31f022e6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=200,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a389c591-0995-5640-cd50-0dd27209af25")
public static final String FIELDNAME_ImportBusinessPartner_BPContactGreeting="a389c591-0995-5640-cd50-0dd27209af25";

@XendraTrl(Identifier="b8129a05-aa32-2664-9c83-73e240cab42f")
public static String es_PE_COLUMN_BPContactGreeting_Name="Saludo contacto del socio";

@XendraColumn(AD_Element_ID="9608741c-630d-2930-a3bc-a4a519ef9414",ColumnName="BPContactGreeting",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b8129a05-aa32-2664-9c83-73e240cab42f",
Synchronized="2019-08-30 22:22:46.0")
/** Column name BPContactGreeting */
public static final String COLUMNNAME_BPContactGreeting = "BPContactGreeting";
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

@XendraTrl(Identifier="46b0fc20-9510-8285-7cc1-e50dcbdb78d2")
public static String es_PE_FIELD_ImportBusinessPartner_BusinessPartner_Name="Socio de Negocio";

@XendraTrl(Identifier="46b0fc20-9510-8285-7cc1-e50dcbdb78d2")
public static String es_PE_FIELD_ImportBusinessPartner_BusinessPartner_Description="Identifica un Socio de Negocio";

@XendraTrl(Identifier="46b0fc20-9510-8285-7cc1-e50dcbdb78d2")
public static String es_PE_FIELD_ImportBusinessPartner_BusinessPartner_Help="Un socio de negocio es cualquiera con quien usted realiza transacciones. Este puede incluir Proveedores; Clientes; Empleados ó Vendedores.";

@XendraField(AD_Column_ID="C_BPartner_ID",IsCentrallyMaintained=true,
AD_Tab_ID="5e6613b5-656e-2c6a-2d1a-f89e31f022e6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=true,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="46b0fc20-9510-8285-7cc1-e50dcbdb78d2")
public static final String FIELDNAME_ImportBusinessPartner_BusinessPartner="46b0fc20-9510-8285-7cc1-e50dcbdb78d2";

@XendraTrl(Identifier="672a4fa3-a049-f754-0392-7b437b8281af")
public static String es_PE_COLUMN_C_BPartner_ID_Name="Socio de Negocio";

@XendraColumn(AD_Element_ID="fe333dc3-4f40-1276-5f6a-d09bb66dc423",ColumnName="C_BPartner_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="672a4fa3-a049-f754-0392-7b437b8281af",
Synchronized="2019-08-30 22:22:46.0")
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

@XendraTrl(Identifier="3a3e4357-40eb-0cd9-89a3-2ff072252954")
public static String es_PE_FIELD_ImportBusinessPartner_PartnerLocation_Name="Dirección del Socio del Negocio";

@XendraTrl(Identifier="3a3e4357-40eb-0cd9-89a3-2ff072252954")
public static String es_PE_FIELD_ImportBusinessPartner_PartnerLocation_Description="Identifica la dirección para este socio de negocio";

@XendraTrl(Identifier="3a3e4357-40eb-0cd9-89a3-2ff072252954")
public static String es_PE_FIELD_ImportBusinessPartner_PartnerLocation_Help="La dirección de un socio indica la ubicación de un socio de negocio";

@XendraField(AD_Column_ID="C_BPartner_Location_ID",IsCentrallyMaintained=true,
AD_Tab_ID="5e6613b5-656e-2c6a-2d1a-f89e31f022e6",AD_FieldGroup_ID="Location",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=320,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3a3e4357-40eb-0cd9-89a3-2ff072252954")
public static final String FIELDNAME_ImportBusinessPartner_PartnerLocation="3a3e4357-40eb-0cd9-89a3-2ff072252954";

@XendraTrl(Identifier="dd3e0608-5c8b-6e8c-2639-c046cf948e51")
public static String es_PE_COLUMN_C_BPartner_Location_ID_Name="Dirección del Socio del Negocio";

@XendraColumn(AD_Element_ID="0dab7dc6-2832-26dc-2462-cba2d40235f2",
ColumnName="C_BPartner_Location_ID",AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="dd3e0608-5c8b-6e8c-2639-c046cf948e51",Synchronized="2019-08-30 22:22:46.0")
/** Column name C_BPartner_Location_ID */
public static final String COLUMNNAME_C_BPartner_Location_ID = "C_BPartner_Location_ID";
/** Set C_BP_DocTypeI.
@param C_BP_DocTypeI C_BP_DocTypeI */
public void setC_BP_DocTypeI (String C_BP_DocTypeI)
{
if (C_BP_DocTypeI != null && C_BP_DocTypeI.length() > 1)
{
log.warning("Length > 1 - truncated");
C_BP_DocTypeI = C_BP_DocTypeI.substring(0,0);
}
set_Value (COLUMNNAME_C_BP_DocTypeI, C_BP_DocTypeI);
}
/** Get C_BP_DocTypeI.
@return C_BP_DocTypeI */
public String getC_BP_DocTypeI() 
{
return (String)get_Value(COLUMNNAME_C_BP_DocTypeI);
}

@XendraTrl(Identifier="06886157-7cb3-4f30-9d94-ace0105f379e")
public static String es_PE_COLUMN_C_BP_DocTypeI_Name="C_BP_DocTypeI";

@XendraColumn(AD_Element_ID="4a5bde64-addb-3dbc-efc3-f5620842b828",ColumnName="C_BP_DocTypeI",
AD_Reference_ID=17,AD_Reference_Value_ID="246094aa-4294-0df2-51fe-48832dd65b30",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="06886157-7cb3-4f30-9d94-ace0105f379e",Synchronized="2019-08-30 22:22:46.0")
/** Column name C_BP_DocTypeI */
public static final String COLUMNNAME_C_BP_DocTypeI = "C_BP_DocTypeI";
/** Set Business Partner Group.
@param C_BP_Group_ID Business Partner Group */
public void setC_BP_Group_ID (int C_BP_Group_ID)
{
if (C_BP_Group_ID < 1) throw new IllegalArgumentException ("C_BP_Group_ID is mandatory.");
set_Value (COLUMNNAME_C_BP_Group_ID, Integer.valueOf(C_BP_Group_ID));
}
/** Get Business Partner Group.
@return Business Partner Group */
public int getC_BP_Group_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_BP_Group_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="aba85713-5854-2e59-7ebf-cc22c9f095aa")
public static String es_PE_FIELD_ImportBusinessPartner_BusinessPartnerGroup_Name="Grupo de Socio de Negocio";

@XendraTrl(Identifier="aba85713-5854-2e59-7ebf-cc22c9f095aa")
public static String es_PE_FIELD_ImportBusinessPartner_BusinessPartnerGroup_Description="ID del Grupo de Socio de Negocio";

@XendraTrl(Identifier="aba85713-5854-2e59-7ebf-cc22c9f095aa")
public static String es_PE_FIELD_ImportBusinessPartner_BusinessPartnerGroup_Help="La ID Grupo del Socio de Negocio proporciona un método de definir valores predeterminados a ser usados para Socios de Negocio individuales.";

@XendraField(AD_Column_ID="C_BP_Group_ID",IsCentrallyMaintained=true,
AD_Tab_ID="5e6613b5-656e-2c6a-2d1a-f89e31f022e6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=150,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="aba85713-5854-2e59-7ebf-cc22c9f095aa")
public static final String FIELDNAME_ImportBusinessPartner_BusinessPartnerGroup="aba85713-5854-2e59-7ebf-cc22c9f095aa";

@XendraTrl(Identifier="90d999ad-4493-47b2-f0ab-8e96325c9a8c")
public static String es_PE_COLUMN_C_BP_Group_ID_Name="Grupo de Socio de Negocio";

@XendraColumn(AD_Element_ID="e4bea975-0a3a-c828-703f-724f29c7518a",ColumnName="C_BP_Group_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="90d999ad-4493-47b2-f0ab-8e96325c9a8c",
Synchronized="2019-08-30 22:22:46.0")
/** Column name C_BP_Group_ID */
public static final String COLUMNNAME_C_BP_Group_ID = "C_BP_Group_ID";
/** Set Country_ID.
@param C_Country_ID Country  */
public void setC_Country_ID (int C_Country_ID)
{
if (C_Country_ID < 1) throw new IllegalArgumentException ("C_Country_ID is mandatory.");
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

@XendraTrl(Identifier="d0526bb7-1ec8-456a-995e-35f49ba4ca6b")
public static String es_PE_FIELD_ImportBusinessPartner_Country_ID_Name="País";

@XendraTrl(Identifier="d0526bb7-1ec8-456a-995e-35f49ba4ca6b")
public static String es_PE_FIELD_ImportBusinessPartner_Country_ID_Description="País";

@XendraTrl(Identifier="d0526bb7-1ec8-456a-995e-35f49ba4ca6b")
public static String es_PE_FIELD_ImportBusinessPartner_Country_ID_Help="El país define un país. Cada país debe ser definido antes de que pueda ser usado en un documento.";

@XendraField(AD_Column_ID="C_Country_ID",IsCentrallyMaintained=true,
AD_Tab_ID="5e6613b5-656e-2c6a-2d1a-f89e31f022e6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=410,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d0526bb7-1ec8-456a-995e-35f49ba4ca6b")
public static final String FIELDNAME_ImportBusinessPartner_Country_ID="d0526bb7-1ec8-456a-995e-35f49ba4ca6b";

@XendraTrl(Identifier="a5ec2034-2193-caf7-925c-4cb5587599ca")
public static String es_PE_COLUMN_C_Country_ID_Name="País";

@XendraColumn(AD_Element_ID="43379d46-930b-f17e-61f3-a1b7f02135c1",ColumnName="C_Country_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a5ec2034-2193-caf7-925c-4cb5587599ca",
Synchronized="2019-08-30 22:22:46.0")
/** Column name C_Country_ID */
public static final String COLUMNNAME_C_Country_ID = "C_Country_ID";
/** Set Greeting.
@param C_Greeting_ID Greeting to print on correspondence */
public void setC_Greeting_ID (int C_Greeting_ID)
{
if (C_Greeting_ID <= 0) set_Value (COLUMNNAME_C_Greeting_ID, null);
 else 
set_Value (COLUMNNAME_C_Greeting_ID, Integer.valueOf(C_Greeting_ID));
}
/** Get Greeting.
@return Greeting to print on correspondence */
public int getC_Greeting_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Greeting_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="ae1a8bba-ee20-b7cf-dc3f-048243ebea71")
public static String es_PE_FIELD_ImportBusinessPartner_Greeting_Name="Saludo";

@XendraTrl(Identifier="ae1a8bba-ee20-b7cf-dc3f-048243ebea71")
public static String es_PE_FIELD_ImportBusinessPartner_Greeting_Description="Saludo para imprimir en la correspondencia";

@XendraTrl(Identifier="ae1a8bba-ee20-b7cf-dc3f-048243ebea71")
public static String es_PE_FIELD_ImportBusinessPartner_Greeting_Help="Los saludos identifican los saludos a imprimir en la correspondencia";

@XendraField(AD_Column_ID="C_Greeting_ID",IsCentrallyMaintained=true,
AD_Tab_ID="5e6613b5-656e-2c6a-2d1a-f89e31f022e6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=160,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ae1a8bba-ee20-b7cf-dc3f-048243ebea71")
public static final String FIELDNAME_ImportBusinessPartner_Greeting="ae1a8bba-ee20-b7cf-dc3f-048243ebea71";

@XendraTrl(Identifier="3517b420-189c-4118-af08-b39a66714980")
public static String es_PE_COLUMN_C_Greeting_ID_Name="Saludo";

@XendraColumn(AD_Element_ID="2865a1ce-d044-a158-129d-7699708f4ce1",ColumnName="C_Greeting_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3517b420-189c-4118-af08-b39a66714980",
Synchronized="2019-08-30 22:22:46.0")
/** Column name C_Greeting_ID */
public static final String COLUMNNAME_C_Greeting_ID = "C_Greeting_ID";
/** Set City.
@param City Identifies a City */
public void setCity (String City)
{
if (City == null) throw new IllegalArgumentException ("City is mandatory.");
if (City.length() > 60)
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
@XendraTrl(Identifier="0f054415-6121-365e-75ba-6c0ac645752b")
public static String es_PE_FIELD_ImportBusinessPartner_City_Name="Ciudad";

@XendraTrl(Identifier="0f054415-6121-365e-75ba-6c0ac645752b")
public static String es_PE_FIELD_ImportBusinessPartner_City_Description="Identifica una Ciudad";

@XendraTrl(Identifier="0f054415-6121-365e-75ba-6c0ac645752b")
public static String es_PE_FIELD_ImportBusinessPartner_City_Help="La Ciudad identifica una ciudad única para este País ó Región";

@XendraField(AD_Column_ID="City",IsCentrallyMaintained=true,
AD_Tab_ID="5e6613b5-656e-2c6a-2d1a-f89e31f022e6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=370,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0f054415-6121-365e-75ba-6c0ac645752b")
public static final String FIELDNAME_ImportBusinessPartner_City="0f054415-6121-365e-75ba-6c0ac645752b";

@XendraTrl(Identifier="dc2e8b5c-45cb-2e9b-fa3a-feae37229755")
public static String es_PE_COLUMN_City_Name="Ciudad";

@XendraColumn(AD_Element_ID="968cd06b-d53d-9f3f-cbd5-d393f09a0264",ColumnName="City",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="dc2e8b5c-45cb-2e9b-fa3a-feae37229755",
Synchronized="2019-08-30 22:22:46.0")
/** Column name City */
public static final String COLUMNNAME_City = "City";
/** Set CityName.
@param CityName CityName */
public void setCityName (String CityName)
{
if (CityName != null && CityName.length() > 60)
{
log.warning("Length > 60 - truncated");
CityName = CityName.substring(0,59);
}
set_Value (COLUMNNAME_CityName, CityName);
}
/** Get CityName.
@return CityName */
public String getCityName() 
{
String value = (String)get_Value(COLUMNNAME_CityName);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="09d3b694-79af-481a-bfe6-37dfe9d80e49")
public static String es_PE_COLUMN_CityName_Name="CityName";

@XendraColumn(AD_Element_ID="fb93ff32-f8bd-431e-815c-4ddba06e51e8",ColumnName="CityName",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="09d3b694-79af-481a-bfe6-37dfe9d80e49",
Synchronized="2019-08-30 22:22:46.0")
/** Column name CityName */
public static final String COLUMNNAME_CityName = "CityName";
/** Set Comments.
@param Comments Comments or additional information */
public void setComments (String Comments)
{
set_Value (COLUMNNAME_Comments, Comments);
}
/** Get Comments.
@return Comments or additional information */
public String getComments() 
{
String value = (String)get_Value(COLUMNNAME_Comments);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="c549c988-cb2b-c136-0472-2ed86f68dc0c")
public static String es_PE_FIELD_ImportBusinessPartner_Comments_Name="Comentarios";

@XendraTrl(Identifier="c549c988-cb2b-c136-0472-2ed86f68dc0c")
public static String es_PE_FIELD_ImportBusinessPartner_Comments_Description="Comentarios ó información adicional";

@XendraTrl(Identifier="c549c988-cb2b-c136-0472-2ed86f68dc0c")
public static String es_PE_FIELD_ImportBusinessPartner_Comments_Help="El campo comentarios permite entrada en formato libre de información adicional";

@XendraField(AD_Column_ID="Comments",IsCentrallyMaintained=true,
AD_Tab_ID="5e6613b5-656e-2c6a-2d1a-f89e31f022e6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=240,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c549c988-cb2b-c136-0472-2ed86f68dc0c")
public static final String FIELDNAME_ImportBusinessPartner_Comments="c549c988-cb2b-c136-0472-2ed86f68dc0c";

@XendraTrl(Identifier="ecc2b8fa-b626-b3a1-9816-d65e4028bab7")
public static String es_PE_COLUMN_Comments_Name="Comentarios";

@XendraColumn(AD_Element_ID="68725fe2-3419-b727-d8d4-8bf5d0d8cfc2",ColumnName="Comments",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ecc2b8fa-b626-b3a1-9816-d65e4028bab7",
Synchronized="2019-08-30 22:22:46.0")
/** Column name Comments */
public static final String COLUMNNAME_Comments = "Comments";
/** Set Contact Description.
@param ContactDescription Description of Contact */
public void setContactDescription (String ContactDescription)
{
if (ContactDescription != null && ContactDescription.length() > 255)
{
log.warning("Length > 255 - truncated");
ContactDescription = ContactDescription.substring(0,254);
}
set_Value (COLUMNNAME_ContactDescription, ContactDescription);
}
/** Get Contact Description.
@return Description of Contact */
public String getContactDescription() 
{
String value = (String)get_Value(COLUMNNAME_ContactDescription);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="2f4e8166-ca9d-ac0a-3ebd-3f5fa78d9212")
public static String es_PE_FIELD_ImportBusinessPartner_ContactDescription_Name="Descripción del Contado";

@XendraTrl(Identifier="2f4e8166-ca9d-ac0a-3ebd-3f5fa78d9212")
public static String es_PE_FIELD_ImportBusinessPartner_ContactDescription_Description="Descripcion del Contacto";

@XendraField(AD_Column_ID="ContactDescription",IsCentrallyMaintained=true,
AD_Tab_ID="5e6613b5-656e-2c6a-2d1a-f89e31f022e6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=190,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2f4e8166-ca9d-ac0a-3ebd-3f5fa78d9212")
public static final String FIELDNAME_ImportBusinessPartner_ContactDescription="2f4e8166-ca9d-ac0a-3ebd-3f5fa78d9212";

@XendraTrl(Identifier="be6c4876-3fb3-d451-8c36-df0fe0d5bcd6")
public static String es_PE_COLUMN_ContactDescription_Name="Descripción del Contado";

@XendraColumn(AD_Element_ID="0da43d84-53f1-5450-e1a9-8787d17ef89b",ColumnName="ContactDescription",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="be6c4876-3fb3-d451-8c36-df0fe0d5bcd6",
Synchronized="2019-08-30 22:22:46.0")
/** Column name ContactDescription */
public static final String COLUMNNAME_ContactDescription = "ContactDescription";
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
@XendraTrl(Identifier="9f91b91e-0bd3-b279-2af2-c57ed1ac19df")
public static String es_PE_FIELD_ImportBusinessPartner_ContactName_Name="Nombre del Contacto";

@XendraTrl(Identifier="9f91b91e-0bd3-b279-2af2-c57ed1ac19df")
public static String es_PE_FIELD_ImportBusinessPartner_ContactName_Description="Nombre del contacto del socio";

@XendraField(AD_Column_ID="ContactName",IsCentrallyMaintained=true,
AD_Tab_ID="5e6613b5-656e-2c6a-2d1a-f89e31f022e6",AD_FieldGroup_ID="Other options",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=180,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9f91b91e-0bd3-b279-2af2-c57ed1ac19df")
public static final String FIELDNAME_ImportBusinessPartner_ContactName="9f91b91e-0bd3-b279-2af2-c57ed1ac19df";

@XendraTrl(Identifier="3e6f0c3f-2bde-d1b2-17d3-e042dfcc23af")
public static String es_PE_COLUMN_ContactName_Name="Nombre del Contacto";

@XendraColumn(AD_Element_ID="09dc9eae-5f2a-936f-d673-7d269b49db5a",ColumnName="ContactName",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3e6f0c3f-2bde-d1b2-17d3-e042dfcc23af",
Synchronized="2019-08-30 22:22:46.0")
/** Column name ContactName */
public static final String COLUMNNAME_ContactName = "ContactName";
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
@XendraTrl(Identifier="3b002e98-3b95-649f-0e31-ce8bfefbd333")
public static String es_PE_FIELD_ImportBusinessPartner_ISOCountryCode_Name="Código ISO del País";

@XendraTrl(Identifier="3b002e98-3b95-649f-0e31-ce8bfefbd333")
public static String es_PE_FIELD_ImportBusinessPartner_ISOCountryCode_Description="Código ISO de país alfanumérico en mayúsculas de acuerdo al ISO 3166-1 -";

@XendraTrl(Identifier="3b002e98-3b95-649f-0e31-ce8bfefbd333")
public static String es_PE_FIELD_ImportBusinessPartner_ISOCountryCode_Help="Para detalles - http://www.din.de/gremien/nas/nabd/iso3166ma/codlstp1.html or - http://www.unece.org/trade/rec/rec03en.htm";

@XendraField(AD_Column_ID="CountryCode",IsCentrallyMaintained=true,
AD_Tab_ID="5e6613b5-656e-2c6a-2d1a-f89e31f022e6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=400,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3b002e98-3b95-649f-0e31-ce8bfefbd333")
public static final String FIELDNAME_ImportBusinessPartner_ISOCountryCode="3b002e98-3b95-649f-0e31-ce8bfefbd333";

@XendraTrl(Identifier="eca12d79-5d1a-3ad2-f9f0-56ed5b7f36ea")
public static String es_PE_COLUMN_CountryCode_Name="Código ISO del País";

@XendraColumn(AD_Element_ID="45764594-a71a-901c-2c46-bb5485c061d1",ColumnName="CountryCode",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="eca12d79-5d1a-3ad2-f9f0-56ed5b7f36ea",
Synchronized="2019-08-30 22:22:46.0")
/** Column name CountryCode */
public static final String COLUMNNAME_CountryCode = "CountryCode";
/** Set Region.
@param C_Region_ID Identifies a geographical Region */
public void setC_Region_ID (int C_Region_ID)
{
if (C_Region_ID < 1) throw new IllegalArgumentException ("C_Region_ID is mandatory.");
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

@XendraTrl(Identifier="fc62e9e4-e789-5c73-7119-e04a4dc24b9f")
public static String es_PE_FIELD_ImportBusinessPartner_Region_Name="Región";

@XendraTrl(Identifier="fc62e9e4-e789-5c73-7119-e04a4dc24b9f")
public static String es_PE_FIELD_ImportBusinessPartner_Region_Description="Identifica una región geográfica";

@XendraTrl(Identifier="fc62e9e4-e789-5c73-7119-e04a4dc24b9f")
public static String es_PE_FIELD_ImportBusinessPartner_Region_Help="La región indica una región única para este país";

@XendraField(AD_Column_ID="C_Region_ID",IsCentrallyMaintained=true,
AD_Tab_ID="5e6613b5-656e-2c6a-2d1a-f89e31f022e6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=390,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="fc62e9e4-e789-5c73-7119-e04a4dc24b9f")
public static final String FIELDNAME_ImportBusinessPartner_Region="fc62e9e4-e789-5c73-7119-e04a4dc24b9f";

@XendraTrl(Identifier="fa5c648d-d513-db0f-a4c4-85b75eb5f2d9")
public static String es_PE_COLUMN_C_Region_ID_Name="Región";

@XendraColumn(AD_Element_ID="ebf14ae5-8cc5-d3f7-2bd3-ea81d9c6d1fe",ColumnName="C_Region_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="2f48b18b-cc01-4a24-2f77-91b0071e443b",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="fa5c648d-d513-db0f-a4c4-85b75eb5f2d9",Synchronized="2019-08-30 22:22:46.0")
/** Column name C_Region_ID */
public static final String COLUMNNAME_C_Region_ID = "C_Region_ID";
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

@XendraTrl(Identifier="3d237be9-a002-a29d-c6e1-82aabdc4d681")
public static String es_PE_FIELD_ImportBusinessPartner_Description_Name="Observación";

@XendraTrl(Identifier="3d237be9-a002-a29d-c6e1-82aabdc4d681")
public static String es_PE_FIELD_ImportBusinessPartner_Description_Description="Observación corta opcional del registro";

@XendraTrl(Identifier="3d237be9-a002-a29d-c6e1-82aabdc4d681")
public static String es_PE_FIELD_ImportBusinessPartner_Description_Help="Una Observación esta limitada a 255 caracteres";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="5e6613b5-656e-2c6a-2d1a-f89e31f022e6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3d237be9-a002-a29d-c6e1-82aabdc4d681")
public static final String FIELDNAME_ImportBusinessPartner_Description="3d237be9-a002-a29d-c6e1-82aabdc4d681";

@XendraTrl(Identifier="55379343-53dd-88ad-9b5c-ecdd98f3687d")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="55379343-53dd-88ad-9b5c-ecdd98f3687d",
Synchronized="2019-08-30 22:22:46.0")
/** Column name Description */
public static final String COLUMNNAME_Description = "Description";
/** Set D-U-N-S.
@param DUNS Dun & Bradstreet Number */
public void setDUNS (String DUNS)
{
if (DUNS != null && DUNS.length() > 11)
{
log.warning("Length > 11 - truncated");
DUNS = DUNS.substring(0,10);
}
set_Value (COLUMNNAME_DUNS, DUNS);
}
/** Get D-U-N-S.
@return Dun & Bradstreet Number */
public String getDUNS() 
{
String value = (String)get_Value(COLUMNNAME_DUNS);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="e863c631-4a36-67e5-05b5-f83bc9d1ffdc")
public static String es_PE_FIELD_ImportBusinessPartner_D_U_N_S_Name="DUNS";

@XendraTrl(Identifier="e863c631-4a36-67e5-05b5-f83bc9d1ffdc")
public static String es_PE_FIELD_ImportBusinessPartner_D_U_N_S_Description="DUNS";

@XendraTrl(Identifier="e863c631-4a36-67e5-05b5-f83bc9d1ffdc")
public static String es_PE_FIELD_ImportBusinessPartner_D_U_N_S_Help="Usado por EDI - para detalles ver www.dnb.com/dunsno/list.htm";

@XendraField(AD_Column_ID="DUNS",IsCentrallyMaintained=true,
AD_Tab_ID="5e6613b5-656e-2c6a-2d1a-f89e31f022e6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e863c631-4a36-67e5-05b5-f83bc9d1ffdc")
public static final String FIELDNAME_ImportBusinessPartner_D_U_N_S="e863c631-4a36-67e5-05b5-f83bc9d1ffdc";

@XendraTrl(Identifier="7cb704f0-c824-5d90-575c-5fcf4351c6f0")
public static String es_PE_COLUMN_DUNS_Name="DUNS";

@XendraColumn(AD_Element_ID="c0901ff5-fdb0-6e42-8eb2-bcb69b132f2b",ColumnName="DUNS",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=11,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7cb704f0-c824-5d90-575c-5fcf4351c6f0",
Synchronized="2019-08-30 22:22:46.0")
/** Column name DUNS */
public static final String COLUMNNAME_DUNS = "DUNS";
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
@XendraTrl(Identifier="2e16b239-4dc1-4635-72fe-353a54523429")
public static String es_PE_FIELD_ImportBusinessPartner_EMailAddress_Name="Email";

@XendraTrl(Identifier="2e16b239-4dc1-4635-72fe-353a54523429")
public static String es_PE_FIELD_ImportBusinessPartner_EMailAddress_Description="ID de correo electrónico";

@XendraTrl(Identifier="2e16b239-4dc1-4635-72fe-353a54523429")
public static String es_PE_FIELD_ImportBusinessPartner_EMailAddress_Help="El Email indica la ID de correo electrónico para este usuario";

@XendraField(AD_Column_ID="EMail",IsCentrallyMaintained=true,
AD_Tab_ID="5e6613b5-656e-2c6a-2d1a-f89e31f022e6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=450,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2e16b239-4dc1-4635-72fe-353a54523429")
public static final String FIELDNAME_ImportBusinessPartner_EMailAddress="2e16b239-4dc1-4635-72fe-353a54523429";

@XendraTrl(Identifier="37b36044-d52c-10f4-9387-16b39f3211e4")
public static String es_PE_COLUMN_EMail_Name="Email";

@XendraColumn(AD_Element_ID="d18b300c-9ad6-2dd2-36d3-b65969743158",ColumnName="EMail",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="37b36044-d52c-10f4-9387-16b39f3211e4",
Synchronized="2019-08-30 22:22:46.0")
/** Column name EMail */
public static final String COLUMNNAME_EMail = "EMail";
/** Set Fax.
@param Fax Facsimile number */
public void setFax (String Fax)
{
if (Fax != null && Fax.length() > 40)
{
log.warning("Length > 40 - truncated");
Fax = Fax.substring(0,39);
}
set_Value (COLUMNNAME_Fax, Fax);
}
/** Get Fax.
@return Facsimile number */
public String getFax() 
{
String value = (String)get_Value(COLUMNNAME_Fax);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="98539522-5397-0655-afd8-4026298a3ac9")
public static String es_PE_FIELD_ImportBusinessPartner_Fax_Name="Fax";

@XendraTrl(Identifier="98539522-5397-0655-afd8-4026298a3ac9")
public static String es_PE_FIELD_ImportBusinessPartner_Fax_Description="Número de Fax";

@XendraTrl(Identifier="98539522-5397-0655-afd8-4026298a3ac9")
public static String es_PE_FIELD_ImportBusinessPartner_Fax_Help="El Fax indica un número de fax para este socio de negocio ó ubicación";

@XendraField(AD_Column_ID="Fax",IsCentrallyMaintained=true,
AD_Tab_ID="5e6613b5-656e-2c6a-2d1a-f89e31f022e6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=440,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="98539522-5397-0655-afd8-4026298a3ac9")
public static final String FIELDNAME_ImportBusinessPartner_Fax="98539522-5397-0655-afd8-4026298a3ac9";

@XendraTrl(Identifier="2ad03d48-84d6-83b4-8b13-ec5ee874f052")
public static String es_PE_COLUMN_Fax_Name="Fax";

@XendraColumn(AD_Element_ID="8a02a423-cb7b-6c2f-8be1-1423aec1ba37",ColumnName="Fax",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2ad03d48-84d6-83b4-8b13-ec5ee874f052",
Synchronized="2019-08-30 22:22:46.0")
/** Column name Fax */
public static final String COLUMNNAME_Fax = "Fax";
/** Set Group Key.
@param GroupValue Business Partner Group Key */
public void setGroupValue (String GroupValue)
{
if (GroupValue != null && GroupValue.length() > 40)
{
log.warning("Length > 40 - truncated");
GroupValue = GroupValue.substring(0,39);
}
set_Value (COLUMNNAME_GroupValue, GroupValue);
}
/** Get Group Key.
@return Business Partner Group Key */
public String getGroupValue() 
{
String value = (String)get_Value(COLUMNNAME_GroupValue);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="21f55c9f-8ef4-3731-ac2c-23d157998d66")
public static String es_PE_FIELD_ImportBusinessPartner_GroupKey_Name="Grupo de Claves";

@XendraTrl(Identifier="21f55c9f-8ef4-3731-ac2c-23d157998d66")
public static String es_PE_FIELD_ImportBusinessPartner_GroupKey_Description="Grupo de claves de socio de negocios.";

@XendraField(AD_Column_ID="GroupValue",IsCentrallyMaintained=true,
AD_Tab_ID="5e6613b5-656e-2c6a-2d1a-f89e31f022e6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=140,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="21f55c9f-8ef4-3731-ac2c-23d157998d66")
public static final String FIELDNAME_ImportBusinessPartner_GroupKey="21f55c9f-8ef4-3731-ac2c-23d157998d66";

@XendraTrl(Identifier="429a981b-85bb-f5d2-6fed-dd16b67bec62")
public static String es_PE_COLUMN_GroupValue_Name="Grupo de Claves";

@XendraColumn(AD_Element_ID="d9bbc985-0707-375c-dbee-3433279753c5",ColumnName="GroupValue",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="429a981b-85bb-f5d2-6fed-dd16b67bec62",
Synchronized="2019-08-30 22:22:46.0")
/** Column name GroupValue */
public static final String COLUMNNAME_GroupValue = "GroupValue";
/** Set Import Business Partner.
@param I_BPartner_ID Import Business Partner */
public void setI_BPartner_ID (int I_BPartner_ID)
{
if (I_BPartner_ID < 1) throw new IllegalArgumentException ("I_BPartner_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_I_BPartner_ID, Integer.valueOf(I_BPartner_ID));
}
/** Get Import Business Partner.
@return Import Business Partner */
public int getI_BPartner_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_I_BPartner_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="95167149-b84d-bed9-ca11-a193423dc774")
public static String es_PE_FIELD_ImportBusinessPartner_ImportBusinessPartner_Name="Importar Socio de Negocio";

@XendraField(AD_Column_ID="I_BPartner_ID",IsCentrallyMaintained=true,
AD_Tab_ID="5e6613b5-656e-2c6a-2d1a-f89e31f022e6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="Y=N",DisplayLength=10,IsReadOnly=true,SeqNo=10,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="95167149-b84d-bed9-ca11-a193423dc774")
public static final String FIELDNAME_ImportBusinessPartner_ImportBusinessPartner="95167149-b84d-bed9-ca11-a193423dc774";
/** Column name I_BPartner_ID */
public static final String COLUMNNAME_I_BPartner_ID = "I_BPartner_ID";
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
@XendraTrl(Identifier="43e5c931-7b96-4015-8533-210783fa8b2f")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="43e5c931-7b96-4015-8533-210783fa8b2f",
Synchronized="2019-08-30 22:22:46.0")
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
@XendraTrl(Identifier="15be8fe0-9622-2f83-807d-64a8f7594d80")
public static String es_PE_FIELD_ImportBusinessPartner_ImportErrorMessage_Name="Mensajes de Error al Importar";

@XendraTrl(Identifier="15be8fe0-9622-2f83-807d-64a8f7594d80")
public static String es_PE_FIELD_ImportBusinessPartner_ImportErrorMessage_Description="Mensajes generados desde procesos de importación";

@XendraTrl(Identifier="15be8fe0-9622-2f83-807d-64a8f7594d80")
public static String es_PE_FIELD_ImportBusinessPartner_ImportErrorMessage_Help="El mensaje de error de Importación despliega cualquier mensaje de error generado durante el proceso de importación.";

@XendraField(AD_Column_ID="I_ErrorMsg",IsCentrallyMaintained=true,
AD_Tab_ID="5e6613b5-656e-2c6a-2d1a-f89e31f022e6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=true,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="15be8fe0-9622-2f83-807d-64a8f7594d80")
public static final String FIELDNAME_ImportBusinessPartner_ImportErrorMessage="15be8fe0-9622-2f83-807d-64a8f7594d80";

@XendraTrl(Identifier="4f1c91f8-c15c-2d49-c176-46d5b00b67d2")
public static String es_PE_COLUMN_I_ErrorMsg_Name="Mensajes de Error al Importar";

@XendraColumn(AD_Element_ID="e512e524-25c8-eddd-ad88-d2ce6b66fdc7",ColumnName="I_ErrorMsg",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="4f1c91f8-c15c-2d49-c176-46d5b00b67d2",
Synchronized="2019-08-30 22:22:46.0")
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

@XendraTrl(Identifier="ae4da345-e02d-718e-99a7-577c08bb81db")
public static String es_PE_FIELD_ImportBusinessPartner_Imported_Name="Importar";

@XendraTrl(Identifier="ae4da345-e02d-718e-99a7-577c08bb81db")
public static String es_PE_FIELD_ImportBusinessPartner_Imported_Description="Esta importación ha sido procesada";

@XendraTrl(Identifier="ae4da345-e02d-718e-99a7-577c08bb81db")
public static String es_PE_FIELD_ImportBusinessPartner_Imported_Help="El cuadro de verificación Importado indica si esta importación ha sido procesada";

@XendraField(AD_Column_ID="I_IsImported",IsCentrallyMaintained=true,
AD_Tab_ID="5e6613b5-656e-2c6a-2d1a-f89e31f022e6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=true,SeqNo=20,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ae4da345-e02d-718e-99a7-577c08bb81db")
public static final String FIELDNAME_ImportBusinessPartner_Imported="ae4da345-e02d-718e-99a7-577c08bb81db";

@XendraTrl(Identifier="44e87b3a-0835-7784-5adc-7fa543eb124e")
public static String es_PE_COLUMN_I_IsImported_Name="Importar";

@XendraColumn(AD_Element_ID="f4939725-7d85-767d-540d-feafa759184b",ColumnName="I_IsImported",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="44e87b3a-0835-7784-5adc-7fa543eb124e",
Synchronized="2019-08-30 22:22:46.0")
/** Column name I_IsImported */
public static final String COLUMNNAME_I_IsImported = "I_IsImported";
/** Set Interest Area.
@param InterestAreaName Name of the Interest Area */
public void setInterestAreaName (String InterestAreaName)
{
if (InterestAreaName != null && InterestAreaName.length() > 40)
{
log.warning("Length > 40 - truncated");
InterestAreaName = InterestAreaName.substring(0,39);
}
set_Value (COLUMNNAME_InterestAreaName, InterestAreaName);
}
/** Get Interest Area.
@return Name of the Interest Area */
public String getInterestAreaName() 
{
String value = (String)get_Value(COLUMNNAME_InterestAreaName);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="a5ff8a8a-4531-4f83-f14b-f9377513e093")
public static String es_PE_FIELD_ImportBusinessPartner_InterestArea_Name="Area de Interés";

@XendraTrl(Identifier="a5ff8a8a-4531-4f83-f14b-f9377513e093")
public static String es_PE_FIELD_ImportBusinessPartner_InterestArea_Description="Name of the Interest Area";

@XendraTrl(Identifier="a5ff8a8a-4531-4f83-f14b-f9377513e093")
public static String es_PE_FIELD_ImportBusinessPartner_InterestArea_Help="Name of the Interest Area of the user";

@XendraField(AD_Column_ID="InterestAreaName",IsCentrallyMaintained=true,
AD_Tab_ID="5e6613b5-656e-2c6a-2d1a-f89e31f022e6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=220,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a5ff8a8a-4531-4f83-f14b-f9377513e093")
public static final String FIELDNAME_ImportBusinessPartner_InterestArea="a5ff8a8a-4531-4f83-f14b-f9377513e093";

@XendraTrl(Identifier="4928fdc7-23b2-4e95-97c4-d10c2de3b30c")
public static String es_PE_COLUMN_InterestAreaName_Name="Interest Area";

@XendraColumn(AD_Element_ID="8558cd72-f596-6e03-805d-25dd970b55b5",ColumnName="InterestAreaName",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="4928fdc7-23b2-4e95-97c4-d10c2de3b30c",
Synchronized="2019-08-30 22:22:46.0")
/** Column name InterestAreaName */
public static final String COLUMNNAME_InterestAreaName = "InterestAreaName";
/** Set Customer.
@param IsCustomer Indicates if this Business Partner is a Customer */
public void setIsCustomer (boolean IsCustomer)
{
set_Value (COLUMNNAME_IsCustomer, Boolean.valueOf(IsCustomer));
}
/** Get Customer.
@return Indicates if this Business Partner is a Customer */
public boolean isCustomer() 
{
Object oo = get_Value(COLUMNNAME_IsCustomer);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="87173489-5b21-6da5-fe88-462590d39b84")
public static String es_PE_FIELD_ImportBusinessPartner_Customer_Name="Cliente";

@XendraTrl(Identifier="87173489-5b21-6da5-fe88-462590d39b84")
public static String es_PE_FIELD_ImportBusinessPartner_Customer_Description="Indica si el socio de negocio es un cliente";

@XendraTrl(Identifier="87173489-5b21-6da5-fe88-462590d39b84")
public static String es_PE_FIELD_ImportBusinessPartner_Customer_Help="El cuadro de verificación cliente indica si el socio de negocio es un cliente. Si se seleccionan campos adicionales desplegarán información adicional para definir al cliente.";

@XendraField(AD_Column_ID="IsCustomer",IsCentrallyMaintained=true,
AD_Tab_ID="5e6613b5-656e-2c6a-2d1a-f89e31f022e6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=280,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="87173489-5b21-6da5-fe88-462590d39b84")
public static final String FIELDNAME_ImportBusinessPartner_Customer="87173489-5b21-6da5-fe88-462590d39b84";

@XendraTrl(Identifier="9e2932d7-67d2-cdcf-588e-9ec6d6d654e4")
public static String es_PE_COLUMN_IsCustomer_Name="Cliente";

@XendraColumn(AD_Element_ID="fd963fb0-599a-df00-cf6e-96a7e7c7f95a",ColumnName="IsCustomer",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9e2932d7-67d2-cdcf-588e-9ec6d6d654e4",
Synchronized="2019-08-30 22:22:46.0")
/** Column name IsCustomer */
public static final String COLUMNNAME_IsCustomer = "IsCustomer";
/** Set Employee.
@param IsEmployee Indicates if  this Business Partner is an employee */
public void setIsEmployee (boolean IsEmployee)
{
set_Value (COLUMNNAME_IsEmployee, Boolean.valueOf(IsEmployee));
}
/** Get Employee.
@return Indicates if  this Business Partner is an employee */
public boolean isEmployee() 
{
Object oo = get_Value(COLUMNNAME_IsEmployee);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="158d305c-db0d-3610-58f0-f74b68f2cf6f")
public static String es_PE_FIELD_ImportBusinessPartner_Employee_Name="Empleado";

@XendraTrl(Identifier="158d305c-db0d-3610-58f0-f74b68f2cf6f")
public static String es_PE_FIELD_ImportBusinessPartner_Employee_Description="Indica si el socio de negocio es un empleado";

@XendraTrl(Identifier="158d305c-db0d-3610-58f0-f74b68f2cf6f")
public static String es_PE_FIELD_ImportBusinessPartner_Employee_Help="El cuadro de verificación empleado indica si este socio de negocio es un empleado. Si se selecciona; se  desplegarán campos adicionales para identificar a este empleado.";

@XendraField(AD_Column_ID="IsEmployee",IsCentrallyMaintained=true,
AD_Tab_ID="5e6613b5-656e-2c6a-2d1a-f89e31f022e6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=300,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="158d305c-db0d-3610-58f0-f74b68f2cf6f")
public static final String FIELDNAME_ImportBusinessPartner_Employee="158d305c-db0d-3610-58f0-f74b68f2cf6f";

@XendraTrl(Identifier="cc1d0b88-d653-d034-d393-b435ce3c3fe9")
public static String es_PE_COLUMN_IsEmployee_Name="Empleado";

@XendraColumn(AD_Element_ID="84da5ee0-801e-eb21-908e-8114648ff2ec",ColumnName="IsEmployee",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="cc1d0b88-d653-d034-d393-b435ce3c3fe9",
Synchronized="2019-08-30 22:22:46.0")
/** Column name IsEmployee */
public static final String COLUMNNAME_IsEmployee = "IsEmployee";
/** Set Prospect.
@param IsProspect Indicates this is a Prospect */
public void setIsProspect (boolean IsProspect)
{
set_Value (COLUMNNAME_IsProspect, Boolean.valueOf(IsProspect));
}
/** Get Prospect.
@return Indicates this is a Prospect */
public boolean isProspect() 
{
Object oo = get_Value(COLUMNNAME_IsProspect);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="f3f75c85-a4ca-3fd5-0413-391d60e10392")
public static String es_PE_FIELD_ImportBusinessPartner_Prospect_Name="Prospecto Activo";

@XendraTrl(Identifier="f3f75c85-a4ca-3fd5-0413-391d60e10392")
public static String es_PE_FIELD_ImportBusinessPartner_Prospect_Description="Indica un prospecto en oposición a un cliente activo.";

@XendraTrl(Identifier="f3f75c85-a4ca-3fd5-0413-391d60e10392")
public static String es_PE_FIELD_ImportBusinessPartner_Prospect_Help="El cuadro de verificación prospecto indica una entidad que es un prospecto activo pero no es aún un cliente.";

@XendraField(AD_Column_ID="IsProspect",IsCentrallyMaintained=true,
AD_Tab_ID="5e6613b5-656e-2c6a-2d1a-f89e31f022e6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=310,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f3f75c85-a4ca-3fd5-0413-391d60e10392")
public static final String FIELDNAME_ImportBusinessPartner_Prospect="f3f75c85-a4ca-3fd5-0413-391d60e10392";

@XendraTrl(Identifier="a5ed4d8e-5a5a-4421-d6d2-b175a8e54d3c")
public static String es_PE_COLUMN_IsProspect_Name="Prospecto Activo";

@XendraColumn(AD_Element_ID="d8300bf0-1a1d-ddcf-2bd4-b4fc59de4323",ColumnName="IsProspect",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a5ed4d8e-5a5a-4421-d6d2-b175a8e54d3c",
Synchronized="2019-08-30 22:22:46.0")
/** Column name IsProspect */
public static final String COLUMNNAME_IsProspect = "IsProspect";
/** Set Sales Representative.
@param IsSalesRep Indicates if  the business partner is a sales representative or company agent */
public void setIsSalesRep (boolean IsSalesRep)
{
set_Value (COLUMNNAME_IsSalesRep, Boolean.valueOf(IsSalesRep));
}
/** Get Sales Representative.
@return Indicates if  the business partner is a sales representative or company agent */
public boolean isSalesRep() 
{
Object oo = get_Value(COLUMNNAME_IsSalesRep);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="58b2c2b0-33b9-a347-f147-48e4f699033c")
public static String es_PE_FIELD_ImportBusinessPartner_SalesRepresentative_Name="Agente Cía";

@XendraTrl(Identifier="58b2c2b0-33b9-a347-f147-48e4f699033c")
public static String es_PE_FIELD_ImportBusinessPartner_SalesRepresentative_Description="Indica si el empleado es un representante de ventas";

@XendraTrl(Identifier="58b2c2b0-33b9-a347-f147-48e4f699033c")
public static String es_PE_FIELD_ImportBusinessPartner_SalesRepresentative_Help="El cuadro de verificación Agente Cía indica si este empleado es también un representante de ventas.";

@XendraField(AD_Column_ID="IsSalesRep",IsCentrallyMaintained=true,
AD_Tab_ID="5e6613b5-656e-2c6a-2d1a-f89e31f022e6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=290,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="58b2c2b0-33b9-a347-f147-48e4f699033c")
public static final String FIELDNAME_ImportBusinessPartner_SalesRepresentative="58b2c2b0-33b9-a347-f147-48e4f699033c";

@XendraTrl(Identifier="1189a50b-b1f8-4240-721b-f115c9946df9")
public static String es_PE_COLUMN_IsSalesRep_Name="Agente Cía";

@XendraColumn(AD_Element_ID="52b2b164-2824-17c4-3796-8ea71ec9f27c",ColumnName="IsSalesRep",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="1189a50b-b1f8-4240-721b-f115c9946df9",
Synchronized="2019-08-30 22:22:46.0")
/** Column name IsSalesRep */
public static final String COLUMNNAME_IsSalesRep = "IsSalesRep";
/** Set Vendor.
@param IsVendor Indicates if this Business Partner is a Vendor */
public void setIsVendor (boolean IsVendor)
{
set_Value (COLUMNNAME_IsVendor, Boolean.valueOf(IsVendor));
}
/** Get Vendor.
@return Indicates if this Business Partner is a Vendor */
public boolean isVendor() 
{
Object oo = get_Value(COLUMNNAME_IsVendor);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="03f014a4-a825-f94d-bc6e-bc19de153cfc")
public static String es_PE_FIELD_ImportBusinessPartner_Vendor_Name="Proveedor";

@XendraTrl(Identifier="03f014a4-a825-f94d-bc6e-bc19de153cfc")
public static String es_PE_FIELD_ImportBusinessPartner_Vendor_Description="Indica si el socio de negocio es un proveedor.";

@XendraTrl(Identifier="03f014a4-a825-f94d-bc6e-bc19de153cfc")
public static String es_PE_FIELD_ImportBusinessPartner_Vendor_Help="El cuadro de verificación proveedor indica si este socio de negocio es un proveedor. Si se selecciona; campos adicionales serán desplegados para identificar a este proveedor.";

@XendraField(AD_Column_ID="IsVendor",IsCentrallyMaintained=true,
AD_Tab_ID="5e6613b5-656e-2c6a-2d1a-f89e31f022e6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=270,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="03f014a4-a825-f94d-bc6e-bc19de153cfc")
public static final String FIELDNAME_ImportBusinessPartner_Vendor="03f014a4-a825-f94d-bc6e-bc19de153cfc";

@XendraTrl(Identifier="214df277-9b8d-a7f5-94d8-1290a8aa3338")
public static String es_PE_COLUMN_IsVendor_Name="Proveedor";

@XendraColumn(AD_Element_ID="e69964cc-6328-38f7-b561-3468b6500147",ColumnName="IsVendor",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="214df277-9b8d-a7f5-94d8-1290a8aa3338",
Synchronized="2019-08-30 22:22:46.0")
/** Column name IsVendor */
public static final String COLUMNNAME_IsVendor = "IsVendor";
/** Set NAICS/SIC.
@param NAICS Standard Industry Code or its successor NAIC - http://www.osha.gov/oshstats/sicser.html */
public void setNAICS (String NAICS)
{
if (NAICS != null && NAICS.length() > 6)
{
log.warning("Length > 6 - truncated");
NAICS = NAICS.substring(0,5);
}
set_Value (COLUMNNAME_NAICS, NAICS);
}
/** Get NAICS/SIC.
@return Standard Industry Code or its successor NAIC - http://www.osha.gov/oshstats/sicser.html */
public String getNAICS() 
{
String value = (String)get_Value(COLUMNNAME_NAICS);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="13342ee5-fe32-58c4-b380-445074136e60")
public static String es_PE_FIELD_ImportBusinessPartner_NAICSSIC_Name="NAICS/SIC";

@XendraTrl(Identifier="13342ee5-fe32-58c4-b380-445074136e60")
public static String es_PE_FIELD_ImportBusinessPartner_NAICSSIC_Description="Codigo estándard de la industria ó sucesor NAIC - http://www.osha.gov/oshstats/sicser.html";

@XendraTrl(Identifier="13342ee5-fe32-58c4-b380-445074136e60")
public static String es_PE_FIELD_ImportBusinessPartner_NAICSSIC_Help="El NAICS/SIC identifica cualquiera de esos códigos que puedan ser aplicables a este socio de negocio";

@XendraField(AD_Column_ID="NAICS",IsCentrallyMaintained=true,
AD_Tab_ID="5e6613b5-656e-2c6a-2d1a-f89e31f022e6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=120,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="13342ee5-fe32-58c4-b380-445074136e60")
public static final String FIELDNAME_ImportBusinessPartner_NAICSSIC="13342ee5-fe32-58c4-b380-445074136e60";

@XendraTrl(Identifier="cde892b9-8beb-67cf-4927-3a7ffe422e63")
public static String es_PE_COLUMN_NAICS_Name="NAICS/SIC";

@XendraColumn(AD_Element_ID="8b0097fc-5337-5edd-c357-34f7861b14b7",ColumnName="NAICS",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=6,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="cde892b9-8beb-67cf-4927-3a7ffe422e63",
Synchronized="2019-08-30 22:22:46.0")
/** Column name NAICS */
public static final String COLUMNNAME_NAICS = "NAICS";
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
@XendraTrl(Identifier="f125940d-3485-3ea1-6ec7-793cbb073ed2")
public static String es_PE_FIELD_ImportBusinessPartner_Name_Name="Nombre";

@XendraTrl(Identifier="f125940d-3485-3ea1-6ec7-793cbb073ed2")
public static String es_PE_FIELD_ImportBusinessPartner_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="f125940d-3485-3ea1-6ec7-793cbb073ed2")
public static String es_PE_FIELD_ImportBusinessPartner_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraField(AD_Column_ID="Name",IsCentrallyMaintained=true,
AD_Tab_ID="5e6613b5-656e-2c6a-2d1a-f89e31f022e6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f125940d-3485-3ea1-6ec7-793cbb073ed2")
public static final String FIELDNAME_ImportBusinessPartner_Name="f125940d-3485-3ea1-6ec7-793cbb073ed2";

@XendraTrl(Identifier="a5caeccd-d617-5632-a477-6cdff0b9f8bb")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a5caeccd-d617-5632-a477-6cdff0b9f8bb",
Synchronized="2019-08-30 22:22:46.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
/** Set Name 2.
@param Name2 Additional Name */
public void setName2 (String Name2)
{
if (Name2 != null && Name2.length() > 60)
{
log.warning("Length > 60 - truncated");
Name2 = Name2.substring(0,59);
}
set_Value (COLUMNNAME_Name2, Name2);
}
/** Get Name 2.
@return Additional Name */
public String getName2() 
{
String value = (String)get_Value(COLUMNNAME_Name2);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="7e8dba0d-9fe8-fff6-8373-cae68a2d1a92")
public static String es_PE_FIELD_ImportBusinessPartner_Name22_Name="Nombre 2";

@XendraTrl(Identifier="7e8dba0d-9fe8-fff6-8373-cae68a2d1a92")
public static String es_PE_FIELD_ImportBusinessPartner_Name22_Description="Nombre adicional";

@XendraField(AD_Column_ID="Name2",IsCentrallyMaintained=true,
AD_Tab_ID="5e6613b5-656e-2c6a-2d1a-f89e31f022e6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7e8dba0d-9fe8-fff6-8373-cae68a2d1a92")
public static final String FIELDNAME_ImportBusinessPartner_Name22="7e8dba0d-9fe8-fff6-8373-cae68a2d1a92";

@XendraTrl(Identifier="344b27a3-2a30-0605-7571-f9bf0a9b36f5")
public static String es_PE_COLUMN_Name2_Name="Nombre 2";

@XendraColumn(AD_Element_ID="afe4eb43-576b-b3f0-6f41-91106bd959fd",ColumnName="Name2",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="344b27a3-2a30-0605-7571-f9bf0a9b36f5",
Synchronized="2019-08-30 22:22:46.0")
/** Column name Name2 */
public static final String COLUMNNAME_Name2 = "Name2";
/** Set Password.
@param Password Password of any length (case sensitive) */
public void setPassword (String Password)
{
if (Password != null && Password.length() > 20)
{
log.warning("Length > 20 - truncated");
Password = Password.substring(0,19);
}
set_Value (COLUMNNAME_Password, Password);
}
/** Get Password.
@return Password of any length (case sensitive) */
public String getPassword() 
{
String value = (String)get_Value(COLUMNNAME_Password);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="462a7d48-283a-aa71-31c2-615434080675")
public static String es_PE_FIELD_ImportBusinessPartner_Password_Name="Contraseña";

@XendraTrl(Identifier="462a7d48-283a-aa71-31c2-615434080675")
public static String es_PE_FIELD_ImportBusinessPartner_Password_Description="Contraseña de cualquier longitud (Sensible a mayúsculas y minúsculas)";

@XendraTrl(Identifier="462a7d48-283a-aa71-31c2-615434080675")
public static String es_PE_FIELD_ImportBusinessPartner_Password_Help="La contraseña indica la contraseña para esta ID de usuario. Las contraseñas se requieren para identificar usuarios autorizados";

@XendraField(AD_Column_ID="Password",IsCentrallyMaintained=true,
AD_Tab_ID="5e6613b5-656e-2c6a-2d1a-f89e31f022e6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=260,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="462a7d48-283a-aa71-31c2-615434080675")
public static final String FIELDNAME_ImportBusinessPartner_Password="462a7d48-283a-aa71-31c2-615434080675";

@XendraTrl(Identifier="2f0172fa-f362-9be7-3cfa-baeee2df82a0")
public static String es_PE_COLUMN_Password_Name="Contraseña";

@XendraColumn(AD_Element_ID="cd8ab187-f65c-a732-8e67-8675630874c3",ColumnName="Password",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=20,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2f0172fa-f362-9be7-3cfa-baeee2df82a0",
Synchronized="2019-08-30 22:22:46.0")
/** Column name Password */
public static final String COLUMNNAME_Password = "Password";
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
@XendraTrl(Identifier="b33025f9-0258-49c8-f9cd-83aa8baa37b4")
public static String es_PE_FIELD_ImportBusinessPartner_Phone_Name="Teléfono";

@XendraTrl(Identifier="b33025f9-0258-49c8-f9cd-83aa8baa37b4")
public static String es_PE_FIELD_ImportBusinessPartner_Phone_Description="Identifica un número telefónico";

@XendraTrl(Identifier="b33025f9-0258-49c8-f9cd-83aa8baa37b4")
public static String es_PE_FIELD_ImportBusinessPartner_Phone_Help="El campo teléfono identifica un No. telefónico.";

@XendraField(AD_Column_ID="Phone",IsCentrallyMaintained=true,
AD_Tab_ID="5e6613b5-656e-2c6a-2d1a-f89e31f022e6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=420,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b33025f9-0258-49c8-f9cd-83aa8baa37b4")
public static final String FIELDNAME_ImportBusinessPartner_Phone="b33025f9-0258-49c8-f9cd-83aa8baa37b4";

@XendraTrl(Identifier="56b2af31-81ee-966a-752a-e6bcb93c5b06")
public static String es_PE_COLUMN_Phone_Name="Teléfono";

@XendraColumn(AD_Element_ID="4842df23-a82d-d921-7e1e-5869844caceb",ColumnName="Phone",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="56b2af31-81ee-966a-752a-e6bcb93c5b06",
Synchronized="2019-08-30 22:22:46.0")
/** Column name Phone */
public static final String COLUMNNAME_Phone = "Phone";
/** Set 2nd Phone.
@param Phone2 Identifies an alternate telephone number. */
public void setPhone2 (String Phone2)
{
if (Phone2 != null && Phone2.length() > 40)
{
log.warning("Length > 40 - truncated");
Phone2 = Phone2.substring(0,39);
}
set_Value (COLUMNNAME_Phone2, Phone2);
}
/** Get 2nd Phone.
@return Identifies an alternate telephone number. */
public String getPhone2() 
{
String value = (String)get_Value(COLUMNNAME_Phone2);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="acc3c1a6-9636-7e97-ccf3-129ef8859344")
public static String es_PE_FIELD_ImportBusinessPartner_2ndPhone_Name="Teléfono 2";

@XendraTrl(Identifier="acc3c1a6-9636-7e97-ccf3-129ef8859344")
public static String es_PE_FIELD_ImportBusinessPartner_2ndPhone_Description="Identifica un número telefónico alterno";

@XendraTrl(Identifier="acc3c1a6-9636-7e97-ccf3-129ef8859344")
public static String es_PE_FIELD_ImportBusinessPartner_2ndPhone_Help="El campo teléfono 2 identifica un número telefónico alterno.";

@XendraField(AD_Column_ID="Phone2",IsCentrallyMaintained=true,
AD_Tab_ID="5e6613b5-656e-2c6a-2d1a-f89e31f022e6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=430,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="acc3c1a6-9636-7e97-ccf3-129ef8859344")
public static final String FIELDNAME_ImportBusinessPartner_2ndPhone="acc3c1a6-9636-7e97-ccf3-129ef8859344";

@XendraTrl(Identifier="dcba89bc-6805-c60b-0fee-7dd3a58dfdbc")
public static String es_PE_COLUMN_Phone2_Name="Teléfono 2";

@XendraColumn(AD_Element_ID="619d752b-db65-e4fd-b230-313afdd72a83",ColumnName="Phone2",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="dcba89bc-6805-c60b-0fee-7dd3a58dfdbc",
Synchronized="2019-08-30 22:22:46.0")
/** Column name Phone2 */
public static final String COLUMNNAME_Phone2 = "Phone2";
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
@XendraTrl(Identifier="ed23fff6-c64e-311e-c71b-5da62eb03a0e")
public static String es_PE_FIELD_ImportBusinessPartner_ZIP_Name="Código Postal";

@XendraTrl(Identifier="ed23fff6-c64e-311e-c71b-5da62eb03a0e")
public static String es_PE_FIELD_ImportBusinessPartner_ZIP_Description="Código Postal";

@XendraTrl(Identifier="ed23fff6-c64e-311e-c71b-5da62eb03a0e")
public static String es_PE_FIELD_ImportBusinessPartner_ZIP_Help="El campo Código Postal identifica el código postal para esta entidad";

@XendraField(AD_Column_ID="Postal",IsCentrallyMaintained=true,
AD_Tab_ID="5e6613b5-656e-2c6a-2d1a-f89e31f022e6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=350,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ed23fff6-c64e-311e-c71b-5da62eb03a0e")
public static final String FIELDNAME_ImportBusinessPartner_ZIP="ed23fff6-c64e-311e-c71b-5da62eb03a0e";

@XendraTrl(Identifier="9a6fb134-5a20-b48b-0ca2-ec4fcb9598f0")
public static String es_PE_COLUMN_Postal_Name="Código Postal";

@XendraColumn(AD_Element_ID="b91ba048-ef4f-31e3-3865-fa3cff649df8",ColumnName="Postal",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9a6fb134-5a20-b48b-0ca2-ec4fcb9598f0",
Synchronized="2019-08-30 22:22:46.0")
/** Column name Postal */
public static final String COLUMNNAME_Postal = "Postal";
/** Set -.
@param Postal_Add Additional ZIP or Postal code */
public void setPostal_Add (String Postal_Add)
{
if (Postal_Add != null && Postal_Add.length() > 10)
{
log.warning("Length > 10 - truncated");
Postal_Add = Postal_Add.substring(0,9);
}
set_Value (COLUMNNAME_Postal_Add, Postal_Add);
}
/** Get -.
@return Additional ZIP or Postal code */
public String getPostal_Add() 
{
String value = (String)get_Value(COLUMNNAME_Postal_Add);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="9f694c90-beee-5ca8-cf63-1d5a456ca9be")
public static String es_PE_FIELD_ImportBusinessPartner___Name="-";

@XendraTrl(Identifier="9f694c90-beee-5ca8-cf63-1d5a456ca9be")
public static String es_PE_FIELD_ImportBusinessPartner___Description="ZIP adicional o Código Postal";

@XendraTrl(Identifier="9f694c90-beee-5ca8-cf63-1d5a456ca9be")
public static String es_PE_FIELD_ImportBusinessPartner___Help="El código o Zona postal adicional identifica; si es apropiado; cualquier información de código postal adicional";

@XendraField(AD_Column_ID="Postal_Add",IsCentrallyMaintained=true,
AD_Tab_ID="5e6613b5-656e-2c6a-2d1a-f89e31f022e6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=360,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9f694c90-beee-5ca8-cf63-1d5a456ca9be")
public static final String FIELDNAME_ImportBusinessPartner__="9f694c90-beee-5ca8-cf63-1d5a456ca9be";

@XendraTrl(Identifier="b59b0f37-fab1-74fe-175d-0bb437229882")
public static String es_PE_COLUMN_Postal_Add_Name="-";

@XendraColumn(AD_Element_ID="c00d9640-000a-9e1d-4070-f6df5e9b3622",ColumnName="Postal_Add",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b59b0f37-fab1-74fe-175d-0bb437229882",
Synchronized="2019-08-30 22:22:46.0")
/** Column name Postal_Add */
public static final String COLUMNNAME_Postal_Add = "Postal_Add";
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

@XendraTrl(Identifier="7429dd60-af53-0af4-59c3-828c9e886d44")
public static String es_PE_FIELD_ImportBusinessPartner_Processed_Name="Procesado";

@XendraTrl(Identifier="7429dd60-af53-0af4-59c3-828c9e886d44")
public static String es_PE_FIELD_ImportBusinessPartner_Processed_Description="El documento ha sido procesado";

@XendraTrl(Identifier="7429dd60-af53-0af4-59c3-828c9e886d44")
public static String es_PE_FIELD_ImportBusinessPartner_Processed_Help="El cuadro de verificación procesada indica que un documento ha sido procesado";

@XendraField(AD_Column_ID="Processed",IsCentrallyMaintained=true,
AD_Tab_ID="5e6613b5-656e-2c6a-2d1a-f89e31f022e6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=true,SeqNo=460,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7429dd60-af53-0af4-59c3-828c9e886d44")
public static final String FIELDNAME_ImportBusinessPartner_Processed="7429dd60-af53-0af4-59c3-828c9e886d44";

@XendraTrl(Identifier="26c8ddf6-02dc-6f04-e433-d9a45adc24d7")
public static String es_PE_COLUMN_Processed_Name="Procesado";

@XendraColumn(AD_Element_ID="3f7035d2-fa5e-7416-fc0c-e49e43f9e083",ColumnName="Processed",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="26c8ddf6-02dc-6f04-e433-d9a45adc24d7",
Synchronized="2019-08-30 22:22:46.0")
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

@XendraTrl(Identifier="8036349f-8948-363e-0b3e-07ac1f331be6")
public static String es_PE_FIELD_ImportBusinessPartner_ProcessNow_Name="Importar Socios de Negocio";

@XendraTrl(Identifier="8036349f-8948-363e-0b3e-07ac1f331be6")
public static String es_PE_FIELD_ImportBusinessPartner_ProcessNow_Description="Importar Socios de Negocio";

@XendraField(AD_Column_ID="Processing",IsCentrallyMaintained=true,
AD_Tab_ID="5e6613b5-656e-2c6a-2d1a-f89e31f022e6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=470,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8036349f-8948-363e-0b3e-07ac1f331be6")
public static final String FIELDNAME_ImportBusinessPartner_ProcessNow="8036349f-8948-363e-0b3e-07ac1f331be6";

@XendraTrl(Identifier="45b548e0-4518-3e9a-eaea-8bf4f55515f3")
public static String es_PE_COLUMN_Processing_Name="Procesar Ahora";

@XendraColumn(AD_Element_ID="f2096404-1a98-35ec-09ea-273b3e19b7de",ColumnName="Processing",
AD_Reference_ID=28,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="9f24810d-ca67-81f3-41c0-8a9dfeafe82a",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="45b548e0-4518-3e9a-eaea-8bf4f55515f3",Synchronized="2019-08-30 22:22:46.0")
/** Column name Processing */
public static final String COLUMNNAME_Processing = "Processing";
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
@XendraTrl(Identifier="59ac8c5b-c019-b45f-7e0a-b5c4d36237d1")
public static String es_PE_FIELD_ImportBusinessPartner_Region2_Name="Nombre de Región";

@XendraTrl(Identifier="59ac8c5b-c019-b45f-7e0a-b5c4d36237d1")
public static String es_PE_FIELD_ImportBusinessPartner_Region2_Description="Nombre de esta región";

@XendraTrl(Identifier="59ac8c5b-c019-b45f-7e0a-b5c4d36237d1")
public static String es_PE_FIELD_ImportBusinessPartner_Region2_Help="El nombre de región define el nombre que se imprimirá cuando esta región se use en un documento.";

@XendraField(AD_Column_ID="RegionName",IsCentrallyMaintained=true,
AD_Tab_ID="5e6613b5-656e-2c6a-2d1a-f89e31f022e6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=380,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="59ac8c5b-c019-b45f-7e0a-b5c4d36237d1")
public static final String FIELDNAME_ImportBusinessPartner_Region2="59ac8c5b-c019-b45f-7e0a-b5c4d36237d1";

@XendraTrl(Identifier="082a33d5-e01d-e09a-82e0-f7d91df032cc")
public static String es_PE_COLUMN_RegionName_Name="Nombre de Región";

@XendraColumn(AD_Element_ID="b2bf2a97-80d5-f41e-ee37-c6093627a1b0",ColumnName="RegionName",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="082a33d5-e01d-e09a-82e0-f7d91df032cc",
Synchronized="2019-08-30 22:22:46.0")
/** Column name RegionName */
public static final String COLUMNNAME_RegionName = "RegionName";
/** Set Interest Area.
@param R_InterestArea_ID Interest Area or Topic */
public void setR_InterestArea_ID (int R_InterestArea_ID)
{
if (R_InterestArea_ID <= 0) set_Value (COLUMNNAME_R_InterestArea_ID, null);
 else 
set_Value (COLUMNNAME_R_InterestArea_ID, Integer.valueOf(R_InterestArea_ID));
}
/** Get Interest Area.
@return Interest Area or Topic */
public int getR_InterestArea_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_R_InterestArea_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="0ece9ce6-8d36-0888-b9f3-a1fdd7aa2dab")
public static String es_PE_FIELD_ImportBusinessPartner_InterestArea2_Name="Código Area de Interés";

@XendraTrl(Identifier="0ece9ce6-8d36-0888-b9f3-a1fdd7aa2dab")
public static String es_PE_FIELD_ImportBusinessPartner_InterestArea2_Description="Area de interés o tópico";

@XendraTrl(Identifier="0ece9ce6-8d36-0888-b9f3-a1fdd7aa2dab")
public static String es_PE_FIELD_ImportBusinessPartner_InterestArea2_Help="Areas de interés reflejan interés en un tópico por un contacto. Areas de interés pueden ser usadas para campañas de mercadeo";

@XendraField(AD_Column_ID="R_InterestArea_ID",IsCentrallyMaintained=true,
AD_Tab_ID="5e6613b5-656e-2c6a-2d1a-f89e31f022e6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=230,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0ece9ce6-8d36-0888-b9f3-a1fdd7aa2dab")
public static final String FIELDNAME_ImportBusinessPartner_InterestArea2="0ece9ce6-8d36-0888-b9f3-a1fdd7aa2dab";

@XendraTrl(Identifier="7e56c20b-6b0a-e550-fb5a-38d458a0f0a9")
public static String es_PE_COLUMN_R_InterestArea_ID_Name="Area de Interés";

@XendraColumn(AD_Element_ID="dabdec86-c4bc-85ae-f4f8-23ecf76c23c1",ColumnName="R_InterestArea_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7e56c20b-6b0a-e550-fb5a-38d458a0f0a9",
Synchronized="2019-08-30 22:22:46.0")
/** Column name R_InterestArea_ID */
public static final String COLUMNNAME_R_InterestArea_ID = "R_InterestArea_ID";
/** Set Credit Limit.
@param SO_CreditLimit Total outstanding invoice amounts allowed */
public void setSO_CreditLimit (BigDecimal SO_CreditLimit)
{
set_Value (COLUMNNAME_SO_CreditLimit, SO_CreditLimit);
}
/** Get Credit Limit.
@return Total outstanding invoice amounts allowed */
public BigDecimal getSO_CreditLimit() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_SO_CreditLimit);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="536f0bf3-1f78-7c38-29aa-1199b4d4786c")
public static String es_PE_FIELD_ImportBusinessPartner_CreditLimit_Name="Límite de Crédito";

@XendraTrl(Identifier="536f0bf3-1f78-7c38-29aa-1199b4d4786c")
public static String es_PE_FIELD_ImportBusinessPartner_CreditLimit_Description="Total pendiente del total de la factura pendiente.";

@XendraTrl(Identifier="536f0bf3-1f78-7c38-29aa-1199b4d4786c")
public static String es_PE_FIELD_ImportBusinessPartner_CreditLimit_Help="El límite de crédito indica el total de deuda permitida.";

@XendraField(AD_Column_ID="SO_CreditLimit",IsCentrallyMaintained=true,
AD_Tab_ID="5e6613b5-656e-2c6a-2d1a-f89e31f022e6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="536f0bf3-1f78-7c38-29aa-1199b4d4786c")
public static final String FIELDNAME_ImportBusinessPartner_CreditLimit="536f0bf3-1f78-7c38-29aa-1199b4d4786c";

@XendraTrl(Identifier="2ceff1a5-1fc4-d290-bd6a-e636b67651c4")
public static String es_PE_COLUMN_SO_CreditLimit_Name="Credit Limit";

@XendraColumn(AD_Element_ID="a208e785-69be-24f1-a54c-9bdc71e5cb35",ColumnName="SO_CreditLimit",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2ceff1a5-1fc4-d290-bd6a-e636b67651c4",
Synchronized="2019-08-30 22:22:46.0")
/** Column name SO_CreditLimit */
public static final String COLUMNNAME_SO_CreditLimit = "SO_CreditLimit";
/** Set Tax ID.
@param TaxID Tax Identification */
public void setTaxID (String TaxID)
{
if (TaxID == null) throw new IllegalArgumentException ("TaxID is mandatory.");
if (TaxID.length() > 20)
{
log.warning("Length > 20 - truncated");
TaxID = TaxID.substring(0,19);
}
set_Value (COLUMNNAME_TaxID, TaxID);
}
/** Get Tax ID.
@return Tax Identification */
public String getTaxID() 
{
String value = (String)get_Value(COLUMNNAME_TaxID);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="9cb9a40e-170c-480d-8959-27f72d596201")
public static String es_PE_FIELD_ImportBusinessPartner_TaxID_Name="RUC";

@XendraTrl(Identifier="9cb9a40e-170c-480d-8959-27f72d596201")
public static String es_PE_FIELD_ImportBusinessPartner_TaxID_Description="Código de Identificación";

@XendraTrl(Identifier="9cb9a40e-170c-480d-8959-27f72d596201")
public static String es_PE_FIELD_ImportBusinessPartner_TaxID_Help="El código de Identificación es el número de identificación gubernamental de esta entidad";

@XendraField(AD_Column_ID="TaxID",IsCentrallyMaintained=true,
AD_Tab_ID="5e6613b5-656e-2c6a-2d1a-f89e31f022e6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=130,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9cb9a40e-170c-480d-8959-27f72d596201")
public static final String FIELDNAME_ImportBusinessPartner_TaxID="9cb9a40e-170c-480d-8959-27f72d596201";

@XendraTrl(Identifier="edbd0a7d-c564-413c-c1d1-9d538a1da240")
public static String es_PE_COLUMN_TaxID_Name="RFC";

@XendraColumn(AD_Element_ID="e0a9d0f7-835b-4f80-4c13-bff62213e232",ColumnName="TaxID",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=20,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="edbd0a7d-c564-413c-c1d1-9d538a1da240",
Synchronized="2019-08-30 22:22:46.0")
/** Column name TaxID */
public static final String COLUMNNAME_TaxID = "TaxID";
/** Set Title.
@param Title Name this entity is referred to as */
public void setTitle (String Title)
{
if (Title != null && Title.length() > 40)
{
log.warning("Length > 40 - truncated");
Title = Title.substring(0,39);
}
set_Value (COLUMNNAME_Title, Title);
}
/** Get Title.
@return Name this entity is referred to as */
public String getTitle() 
{
String value = (String)get_Value(COLUMNNAME_Title);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="e8aa4ef1-fec0-b82a-c91a-1a9adc200477")
public static String es_PE_FIELD_ImportBusinessPartner_Title_Name="Título";

@XendraTrl(Identifier="e8aa4ef1-fec0-b82a-c91a-1a9adc200477")
public static String es_PE_FIELD_ImportBusinessPartner_Title_Description="Nombre como se conoce esta entidad";

@XendraTrl(Identifier="e8aa4ef1-fec0-b82a-c91a-1a9adc200477")
public static String es_PE_FIELD_ImportBusinessPartner_Title_Help="El título indica el nombre como se conoce esta entidad";

@XendraField(AD_Column_ID="Title",IsCentrallyMaintained=true,
AD_Tab_ID="5e6613b5-656e-2c6a-2d1a-f89e31f022e6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=170,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e8aa4ef1-fec0-b82a-c91a-1a9adc200477")
public static final String FIELDNAME_ImportBusinessPartner_Title="e8aa4ef1-fec0-b82a-c91a-1a9adc200477";

@XendraTrl(Identifier="33ae1f95-fb00-a65e-0d12-5e5aa9692ae9")
public static String es_PE_COLUMN_Title_Name="Título";

@XendraColumn(AD_Element_ID="05a7b975-a2e2-1303-e323-2e3fdda7ebd3",ColumnName="Title",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="33ae1f95-fb00-a65e-0d12-5e5aa9692ae9",
Synchronized="2019-08-30 22:22:46.0")
/** Column name Title */
public static final String COLUMNNAME_Title = "Title";
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
/** Get Record ID/ColumnName
@return ID/ColumnName pair
*/public KeyNamePair getKeyNamePair() 
{
return new KeyNamePair(get_ID(), getValue());
}

@XendraTrl(Identifier="7ca64709-6bfa-e951-fc59-8e4946ef8ae2")
public static String es_PE_FIELD_ImportBusinessPartner_SearchKey_Name="Clave de Búsqueda";

@XendraTrl(Identifier="7ca64709-6bfa-e951-fc59-8e4946ef8ae2")
public static String es_PE_FIELD_ImportBusinessPartner_SearchKey_Description="Clave de búsqueda para el registro en el formato requerido; debe ser única";

@XendraTrl(Identifier="7ca64709-6bfa-e951-fc59-8e4946ef8ae2")
public static String es_PE_FIELD_ImportBusinessPartner_SearchKey_Help="Una clave de búsqueda le permite a usted un método rápido de encontrar un registro en particular";

@XendraField(AD_Column_ID="Value",IsCentrallyMaintained=true,
AD_Tab_ID="5e6613b5-656e-2c6a-2d1a-f89e31f022e6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7ca64709-6bfa-e951-fc59-8e4946ef8ae2")
public static final String FIELDNAME_ImportBusinessPartner_SearchKey="7ca64709-6bfa-e951-fc59-8e4946ef8ae2";

@XendraTrl(Identifier="d987c186-0bf8-fe07-0eb1-a9e911c7bcc8")
public static String es_PE_COLUMN_Value_Name="Clave de Búsqueda";

@XendraColumn(AD_Element_ID="e75e100c-9b41-a643-2cb3-46eeced683d8",ColumnName="Value",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d987c186-0bf8-fe07-0eb1-a9e911c7bcc8",
Synchronized="2019-08-30 22:22:46.0")
/** Column name Value */
public static final String COLUMNNAME_Value = "Value";
}
