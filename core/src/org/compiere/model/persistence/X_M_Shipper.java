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
/** Generated Model for M_Shipper
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_M_Shipper extends PO
{
/** Standard Constructor
@param ctx context
@param M_Shipper_ID id
@param trxName transaction
*/
public X_M_Shipper (Properties ctx, int M_Shipper_ID, String trxName)
{
super (ctx, M_Shipper_ID, trxName);
/** if (M_Shipper_ID == 0)
{
setM_Shipper_ID (0);
setName (null);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_M_Shipper (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=253 */
public static int Table_ID=MTable.getTable_ID("M_Shipper");

@XendraTrl(Identifier="2c869b34-1eaa-34e2-6996-30bbc185a210")
public static String es_PE_TAB_Shipper_Description="Transportista";

@XendraTrl(Identifier="2c869b34-1eaa-34e2-6996-30bbc185a210")
public static String es_PE_TAB_Shipper_Help="La pestaña de transportistas define las entidades que proveerán entregas desde ó hacia una organización.";

@XendraTrl(Identifier="2c869b34-1eaa-34e2-6996-30bbc185a210")
public static String es_PE_TAB_Shipper_Name="Transportista";
@XendraTab(Name="Shipper",
Description="Shippers",
Help="The Shippers Tab defines any entity who will provide shipping to or shipping from an Organization.",
AD_Window_ID="46135d20-8666-538b-b7c0-1e7d07971ac3",SeqNo=10,TabLevel=0,IsSingleRow=true,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="2c869b34-1eaa-34e2-6996-30bbc185a210",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Shipper="2c869b34-1eaa-34e2-6996-30bbc185a210";

@XendraTrl(Identifier="a0d3aedf-3771-f82f-cd74-bc795e59e452")
public static String es_PE_TABLE_M_Shipper_Name="Transportista";

@XendraTable(Name="Shipper",AD_Package_ID="2809ac2d-7d43-20f8-05f0-a478f2e50204",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",
Description="Method or manner of product delivery",Help="",TableName="M_Shipper",AccessLevel="3",
AD_Window_ID="46135d20-8666-538b-b7c0-1e7d07971ac3",AD_Val_Rule_ID="",IsKey=1,LoadSeq=105,
IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=false,IsChangeLog=false,IsView=false,
PO_Window_ID="",ID="org.xendra.material",Identifier="a0d3aedf-3771-f82f-cd74-bc795e59e452",
Synchronized="2020-03-03 21:38:56.0")
/** TableName=M_Shipper */
public static final String Table_Name="M_Shipper";


@XendraIndex(Name="m_shipper_name",Identifier="12a0a4c0-ecce-1971-18ce-726dba72e394",
Column_Names="ad_client_id, name",IsUnique="true",
TableIdentifier="12a0a4c0-ecce-1971-18ce-726dba72e394",Synchronized="2014-06-01 19:03:58.0")
public static final String INDEXNAME_m_shipper_name = "12a0a4c0-ecce-1971-18ce-726dba72e394";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"M_Shipper");

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
    Table_ID = MTable.getTable_ID("M_Shipper");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_M_Shipper[").append(get_ID()).append("]");
return sb.toString();
}
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

@XendraTrl(Identifier="f181aae1-e2b5-b566-a6fa-38975120c3e6")
public static String es_PE_FIELD_Shipper_BusinessPartner_Name="Socio de Negocio";

@XendraTrl(Identifier="f181aae1-e2b5-b566-a6fa-38975120c3e6")
public static String es_PE_FIELD_Shipper_BusinessPartner_Description="Identifica un Socio de Negocio";

@XendraTrl(Identifier="f181aae1-e2b5-b566-a6fa-38975120c3e6")
public static String es_PE_FIELD_Shipper_BusinessPartner_Help="Un socio de negocio es cualquiera con quien usted realiza transacciones. Este puede incluir Proveedores; Clientes; Empleados ó Vendedores.";

@XendraField(AD_Column_ID="C_BPartner_ID",IsCentrallyMaintained=true,
AD_Tab_ID="2c869b34-1eaa-34e2-6996-30bbc185a210",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f181aae1-e2b5-b566-a6fa-38975120c3e6")
public static final String FIELDNAME_Shipper_BusinessPartner="f181aae1-e2b5-b566-a6fa-38975120c3e6";

@XendraTrl(Identifier="86e4d812-7217-72cd-7aa7-8e326f8573c4")
public static String es_PE_COLUMN_C_BPartner_ID_Name="Socio de Negocio";

@XendraColumn(AD_Element_ID="fe333dc3-4f40-1276-5f6a-d09bb66dc423",ColumnName="C_BPartner_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="06fdbbe9-e1c4-3ee4-4a9d-73d1a990cc42",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=true,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="86e4d812-7217-72cd-7aa7-8e326f8573c4",Synchronized="2019-08-30 22:23:32.0")
/** Column name C_BPartner_ID */
public static final String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";
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

@XendraTrl(Identifier="56be2bb2-ef1d-3feb-2cc6-2cfbe70ac60e")
public static String es_PE_FIELD_Shipper_Description_Name="Observación";

@XendraTrl(Identifier="56be2bb2-ef1d-3feb-2cc6-2cfbe70ac60e")
public static String es_PE_FIELD_Shipper_Description_Description="Observación corta opcional del registro";

@XendraTrl(Identifier="56be2bb2-ef1d-3feb-2cc6-2cfbe70ac60e")
public static String es_PE_FIELD_Shipper_Description_Help="Una Observación esta limitada a 255 caracteres";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="2c869b34-1eaa-34e2-6996-30bbc185a210",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="56be2bb2-ef1d-3feb-2cc6-2cfbe70ac60e")
public static final String FIELDNAME_Shipper_Description="56be2bb2-ef1d-3feb-2cc6-2cfbe70ac60e";

@XendraTrl(Identifier="915b39d7-67fe-1ab4-e707-407f91fb26be")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="915b39d7-67fe-1ab4-e707-407f91fb26be",
Synchronized="2019-08-30 22:23:32.0")
/** Column name Description */
public static final String COLUMNNAME_Description = "Description";
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
@XendraTrl(Identifier="ab5929b2-44c1-4652-8126-58c9c42ab46a")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ab5929b2-44c1-4652-8126-58c9c42ab46a",
Synchronized="2019-08-30 22:23:32.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set License.
@param License License */
public void setLicense (String License)
{
if (License != null && License.length() > 60)
{
log.warning("Length > 60 - truncated");
License = License.substring(0,59);
}
set_Value (COLUMNNAME_License, License);
}
/** Get License.
@return License */
public String getLicense() 
{
String value = (String)get_Value(COLUMNNAME_License);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="d1993eb1-cbcc-0600-6fc6-e1fc921cbaca")
public static String es_PE_FIELD_Shipper_License_Name="Licencia";

@XendraField(AD_Column_ID="License",IsCentrallyMaintained=true,
AD_Tab_ID="2c869b34-1eaa-34e2-6996-30bbc185a210",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=0,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d1993eb1-cbcc-0600-6fc6-e1fc921cbaca")
public static final String FIELDNAME_Shipper_License="d1993eb1-cbcc-0600-6fc6-e1fc921cbaca";

@XendraTrl(Identifier="57000553-2c94-7f99-0ec2-9c76687091aa")
public static String es_PE_COLUMN_License_Name="license";

@XendraColumn(AD_Element_ID="6971f6fa-98a0-c699-0c38-1df41b1db212",ColumnName="License",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="57000553-2c94-7f99-0ec2-9c76687091aa",
Synchronized="2019-08-30 22:23:32.0")
/** Column name License */
public static final String COLUMNNAME_License = "License";
/** Set Shipper.
@param M_Shipper_ID Method or manner of product delivery */
public void setM_Shipper_ID (int M_Shipper_ID)
{
if (M_Shipper_ID < 1) throw new IllegalArgumentException ("M_Shipper_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_M_Shipper_ID, Integer.valueOf(M_Shipper_ID));
}
/** Get Shipper.
@return Method or manner of product delivery */
public int getM_Shipper_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_Shipper_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="8771b010-6463-5919-79be-e894e9ddc0f8")
public static String es_PE_FIELD_Shipper_Shipper_Name="Transportista";

@XendraTrl(Identifier="8771b010-6463-5919-79be-e894e9ddc0f8")
public static String es_PE_FIELD_Shipper_Shipper_Description="Método ó manera de entrega del producto";

@XendraTrl(Identifier="8771b010-6463-5919-79be-e894e9ddc0f8")
public static String es_PE_FIELD_Shipper_Shipper_Help="El transportista indica el responsable de entregar el producto";

@XendraField(AD_Column_ID="M_Shipper_ID",IsCentrallyMaintained=true,
AD_Tab_ID="2c869b34-1eaa-34e2-6996-30bbc185a210",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=10,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8771b010-6463-5919-79be-e894e9ddc0f8")
public static final String FIELDNAME_Shipper_Shipper="8771b010-6463-5919-79be-e894e9ddc0f8";
/** Column name M_Shipper_ID */
public static final String COLUMNNAME_M_Shipper_ID = "M_Shipper_ID";
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

@XendraTrl(Identifier="cdfb41d1-9cfd-c399-80e7-cae7c026a630")
public static String es_PE_FIELD_Shipper_Name_Name="Nombre";

@XendraTrl(Identifier="cdfb41d1-9cfd-c399-80e7-cae7c026a630")
public static String es_PE_FIELD_Shipper_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="cdfb41d1-9cfd-c399-80e7-cae7c026a630")
public static String es_PE_FIELD_Shipper_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraField(AD_Column_ID="Name",IsCentrallyMaintained=true,
AD_Tab_ID="2c869b34-1eaa-34e2-6996-30bbc185a210",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=40,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="cdfb41d1-9cfd-c399-80e7-cae7c026a630")
public static final String FIELDNAME_Shipper_Name="cdfb41d1-9cfd-c399-80e7-cae7c026a630";

@XendraTrl(Identifier="614a8990-f2cc-0c17-2c81-b3984d344a2e")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="614a8990-f2cc-0c17-2c81-b3984d344a2e",
Synchronized="2019-08-30 22:23:32.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
/** Set Tracking URL.
@param TrackingURL URL of the shipper to track shipments */
public void setTrackingURL (String TrackingURL)
{
if (TrackingURL != null && TrackingURL.length() > 120)
{
log.warning("Length > 120 - truncated");
TrackingURL = TrackingURL.substring(0,119);
}
set_Value (COLUMNNAME_TrackingURL, TrackingURL);
}
/** Get Tracking URL.
@return URL of the shipper to track shipments */
public String getTrackingURL() 
{
String value = (String)get_Value(COLUMNNAME_TrackingURL);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="111c111c-2323-29e4-588e-2a5ed9486c6c")
public static String es_PE_FIELD_Shipper_TrackingURL_Name="Seguimiento URL";

@XendraTrl(Identifier="111c111c-2323-29e4-588e-2a5ed9486c6c")
public static String es_PE_FIELD_Shipper_TrackingURL_Description="URL de la entrega, seguimiento de entrega";

@XendraTrl(Identifier="111c111c-2323-29e4-588e-2a5ed9486c6c")
public static String es_PE_FIELD_Shipper_TrackingURL_Help="La variable @No seguir@ en el URL es remplazado por el actual número de seguimiento de envio.";

@XendraField(AD_Column_ID="TrackingURL",IsCentrallyMaintained=true,
AD_Tab_ID="2c869b34-1eaa-34e2-6996-30bbc185a210",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="111c111c-2323-29e4-588e-2a5ed9486c6c")
public static final String FIELDNAME_Shipper_TrackingURL="111c111c-2323-29e4-588e-2a5ed9486c6c";

@XendraTrl(Identifier="51eae2b1-080d-deec-f3ec-811661bedbf9")
public static String es_PE_COLUMN_TrackingURL_Name="Seguimiento URL";

@XendraColumn(AD_Element_ID="eaba5e49-ca50-028d-69d3-62300c6f61da",ColumnName="TrackingURL",
AD_Reference_ID=40,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=120,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="51eae2b1-080d-deec-f3ec-811661bedbf9",
Synchronized="2019-08-30 22:23:32.0")
/** Column name TrackingURL */
public static final String COLUMNNAME_TrackingURL = "TrackingURL";
}
