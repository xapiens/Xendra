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
/** Generated Model for A_RegistrationAttribute
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_A_RegistrationAttribute extends PO
{
/** Standard Constructor
@param ctx context
@param A_RegistrationAttribute_ID id
@param trxName transaction
*/
public X_A_RegistrationAttribute (Properties ctx, int A_RegistrationAttribute_ID, String trxName)
{
super (ctx, A_RegistrationAttribute_ID, trxName);
/** if (A_RegistrationAttribute_ID == 0)
{
setAD_Reference_ID (0);
setA_RegistrationAttribute_ID (0);
setIsSelfService (true);	
// Y
setName (null);
setSeqNo (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_A_RegistrationAttribute (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=652 */
public static int Table_ID=MTable.getTable_ID("A_RegistrationAttribute");

@XendraTrl(Identifier="5db45099-4d21-6dc0-ec17-f7a24c34fb28")
public static String es_PE_TAB_Attribute_Description="Atributo del Registro de Activo";

@XendraTrl(Identifier="5db45099-4d21-6dc0-ec17-f7a24c34fb28")
public static String es_PE_TAB_Attribute_Help="Define el valor individual para el registro de activo";

@XendraTrl(Identifier="5db45099-4d21-6dc0-ec17-f7a24c34fb28")
public static String es_PE_TAB_Attribute_Name="Atributos";
@XendraTab(Name="Attribute",
Description="Asset Registration Attribute",
Help="Define the individual values for the Asset Registration",
AD_Window_ID="22600d9e-6e66-7a00-961e-591783e32b7a",SeqNo=10,TabLevel=0,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="5db45099-4d21-6dc0-ec17-f7a24c34fb28",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Attribute="5db45099-4d21-6dc0-ec17-f7a24c34fb28";

@XendraTrl(Identifier="bfde050e-6e66-e84d-9c56-a29c4ccf14d1")
public static String es_PE_TABLE_A_RegistrationAttribute_Name="Registro de Atributo";

@XendraTable(Name="Registration Attribute",AD_Package_ID="1b3656e5-71c7-1296-994e-9b2c4549c7fd",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="Asset Registration Attribute",
Help="",TableName="A_RegistrationAttribute",AccessLevel="2",
AD_Window_ID="22600d9e-6e66-7a00-961e-591783e32b7a",AD_Val_Rule_ID="",IsKey=1,LoadSeq=140,
IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,IsView=false,
PO_Window_ID="",ID="org.xendra.standard",Identifier="bfde050e-6e66-e84d-9c56-a29c4ccf14d1",
Synchronized="2020-03-03 21:36:15.0")
/** TableName=A_RegistrationAttribute */
public static final String Table_Name="A_RegistrationAttribute";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"A_RegistrationAttribute");

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
    Table_ID = MTable.getTable_ID("A_RegistrationAttribute");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_A_RegistrationAttribute[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Reference.
@param AD_Reference_ID System Reference and Validation */
public void setAD_Reference_ID (int AD_Reference_ID)
{
if (AD_Reference_ID < 1) throw new IllegalArgumentException ("AD_Reference_ID is mandatory.");
set_Value (COLUMNNAME_AD_Reference_ID, Integer.valueOf(AD_Reference_ID));
}
/** Get Reference.
@return System Reference and Validation */
public int getAD_Reference_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Reference_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="ec41f129-e256-b96f-2125-bb673fc0ceb6")
public static String es_PE_FIELD_Attribute_Reference_Name="Referencia";

@XendraTrl(Identifier="ec41f129-e256-b96f-2125-bb673fc0ceb6")
public static String es_PE_FIELD_Attribute_Reference_Description="Referencia del Sistema (Lista de Selección)";

@XendraTrl(Identifier="ec41f129-e256-b96f-2125-bb673fc0ceb6")
public static String es_PE_FIELD_Attribute_Reference_Help="La Referencia indica el tipo de campo de referencia";

@XendraField(AD_Column_ID="AD_Reference_ID",IsCentrallyMaintained=true,
AD_Tab_ID="5db45099-4d21-6dc0-ec17-f7a24c34fb28",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ec41f129-e256-b96f-2125-bb673fc0ceb6")
public static final String FIELDNAME_Attribute_Reference="ec41f129-e256-b96f-2125-bb673fc0ceb6";

@XendraTrl(Identifier="0f649202-c13a-d590-bf98-ebb28ccef027")
public static String es_PE_COLUMN_AD_Reference_ID_Name="Referencia";

@XendraColumn(AD_Element_ID="bf1912e9-a75f-4e1b-99b4-d04633e7777b",ColumnName="AD_Reference_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="17ec718c-707b-498f-3a6c-e81d1630e510",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="0f649202-c13a-d590-bf98-ebb28ccef027",Synchronized="2019-08-30 22:20:56.0")
/** Column name AD_Reference_ID */
public static final String COLUMNNAME_AD_Reference_ID = "AD_Reference_ID";
/** Set Reference Key.
@param AD_Reference_Value_ID Required to specify, if data type is Table or List */
public void setAD_Reference_Value_ID (int AD_Reference_Value_ID)
{
if (AD_Reference_Value_ID <= 0) set_Value (COLUMNNAME_AD_Reference_Value_ID, null);
 else 
set_Value (COLUMNNAME_AD_Reference_Value_ID, Integer.valueOf(AD_Reference_Value_ID));
}
/** Get Reference Key.
@return Required to specify, if data type is Table or List */
public int getAD_Reference_Value_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Reference_Value_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="2a5dda49-d080-ae49-9e5a-f6fd115a6b13")
public static String es_PE_FIELD_Attribute_ReferenceKey_Name="Valor de Referencia";

@XendraTrl(Identifier="2a5dda49-d080-ae49-9e5a-f6fd115a6b13")
public static String es_PE_FIELD_Attribute_ReferenceKey_Description="Requerido para especificar; si el tipo de datos es tabla ó lista.";

@XendraTrl(Identifier="2a5dda49-d080-ae49-9e5a-f6fd115a6b13")
public static String es_PE_FIELD_Attribute_ReferenceKey_Help="El valor referencia indica dónde los valores referencia son almacenados. Debe especificarce si el tipo de datos es tabla ó lista.";

@XendraField(AD_Column_ID="AD_Reference_Value_ID",IsCentrallyMaintained=true,
AD_Tab_ID="5db45099-4d21-6dc0-ec17-f7a24c34fb28",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@AD_Reference_ID@=17 | @AD_Reference_ID@=18",DisplayLength=14,IsReadOnly=false,
SeqNo=100,SortNo=0,IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="2a5dda49-d080-ae49-9e5a-f6fd115a6b13")
public static final String FIELDNAME_Attribute_ReferenceKey="2a5dda49-d080-ae49-9e5a-f6fd115a6b13";

@XendraTrl(Identifier="1d207967-83b1-9d04-7c9f-a1f79be15880")
public static String es_PE_COLUMN_AD_Reference_Value_ID_Name="Valor de Referencia";

@XendraColumn(AD_Element_ID="1ce26254-3c83-8d1d-3506-37160c076aad",
ColumnName="AD_Reference_Value_ID",AD_Reference_ID=18,
AD_Reference_Value_ID="12253474-e61c-58a4-3fd3-2c2ccf236272",
AD_Val_Rule_ID="147ddeef-c150-2ac8-67e8-346cc5225ef4",FieldLength=22,DefaultValue="",IsKey=false,
IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="1d207967-83b1-9d04-7c9f-a1f79be15880",
Synchronized="2019-08-30 22:20:56.0")
/** Column name AD_Reference_Value_ID */
public static final String COLUMNNAME_AD_Reference_Value_ID = "AD_Reference_Value_ID";
/** Set Registration Attribute.
@param A_RegistrationAttribute_ID Asset Registration Attribute */
public void setA_RegistrationAttribute_ID (int A_RegistrationAttribute_ID)
{
if (A_RegistrationAttribute_ID < 1) throw new IllegalArgumentException ("A_RegistrationAttribute_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_A_RegistrationAttribute_ID, Integer.valueOf(A_RegistrationAttribute_ID));
}
/** Get Registration Attribute.
@return Asset Registration Attribute */
public int getA_RegistrationAttribute_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_A_RegistrationAttribute_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="b93d1cee-6581-912c-c9bc-bcc31e174fc3")
public static String es_PE_FIELD_Attribute_RegistrationAttribute_Name="Registro de Atributo";

@XendraTrl(Identifier="b93d1cee-6581-912c-c9bc-bcc31e174fc3")
public static String es_PE_FIELD_Attribute_RegistrationAttribute_Description="Registro de atributo activo";

@XendraTrl(Identifier="b93d1cee-6581-912c-c9bc-bcc31e174fc3")
public static String es_PE_FIELD_Attribute_RegistrationAttribute_Help="Defina los valores individuales para el registro del activo.";

@XendraField(AD_Column_ID="A_RegistrationAttribute_ID",IsCentrallyMaintained=true,
AD_Tab_ID="5db45099-4d21-6dc0-ec17-f7a24c34fb28",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=10,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b93d1cee-6581-912c-c9bc-bcc31e174fc3")
public static final String FIELDNAME_Attribute_RegistrationAttribute="b93d1cee-6581-912c-c9bc-bcc31e174fc3";
/** Column name A_RegistrationAttribute_ID */
public static final String COLUMNNAME_A_RegistrationAttribute_ID = "A_RegistrationAttribute_ID";
/** Set DB Column Name.
@param ColumnName Name of the column in the database */
public void setColumnName (String ColumnName)
{
if (ColumnName != null && ColumnName.length() > 40)
{
log.warning("Length > 40 - truncated");
ColumnName = ColumnName.substring(0,39);
}
set_Value (COLUMNNAME_ColumnName, ColumnName);
}
/** Get DB Column Name.
@return Name of the column in the database */
public String getColumnName() 
{
String value = (String)get_Value(COLUMNNAME_ColumnName);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="015d18a3-9a63-859a-7f10-669a5475270a")
public static String es_PE_FIELD_Attribute_DBColumnName_Name="Nombre de Columna en BD";

@XendraTrl(Identifier="015d18a3-9a63-859a-7f10-669a5475270a")
public static String es_PE_FIELD_Attribute_DBColumnName_Description="Nombre de la columna en la base de datos";

@XendraTrl(Identifier="015d18a3-9a63-859a-7f10-669a5475270a")
public static String es_PE_FIELD_Attribute_DBColumnName_Help="Indica el nombre de una columna en una tabla como se definió en la base de datos.";

@XendraField(AD_Column_ID="ColumnName",IsCentrallyMaintained=true,
AD_Tab_ID="5db45099-4d21-6dc0-ec17-f7a24c34fb28",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@AD_Reference_ID@=19 | @AD_Reference_ID@=30",DisplayLength=40,IsReadOnly=false,
SeqNo=90,SortNo=0,IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="015d18a3-9a63-859a-7f10-669a5475270a")
public static final String FIELDNAME_Attribute_DBColumnName="015d18a3-9a63-859a-7f10-669a5475270a";

@XendraTrl(Identifier="a69c7a66-98cd-7513-0366-e8cc309a6b56")
public static String es_PE_COLUMN_ColumnName_Name="Nombre de Columna en BD";

@XendraColumn(AD_Element_ID="fadc32aa-cd31-3fee-f9b7-0daa53df76a7",ColumnName="ColumnName",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a69c7a66-98cd-7513-0366-e8cc309a6b56",
Synchronized="2019-08-30 22:20:56.0")
/** Column name ColumnName */
public static final String COLUMNNAME_ColumnName = "ColumnName";
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

@XendraTrl(Identifier="8ff2d768-8805-068c-6bfb-9a01e779384a")
public static String es_PE_FIELD_Attribute_Description_Name="Observación";

@XendraTrl(Identifier="8ff2d768-8805-068c-6bfb-9a01e779384a")
public static String es_PE_FIELD_Attribute_Description_Description="Observación corta opcional del registro";

@XendraTrl(Identifier="8ff2d768-8805-068c-6bfb-9a01e779384a")
public static String es_PE_FIELD_Attribute_Description_Help="Una Observación esta limitada a 255 caracteres";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="5db45099-4d21-6dc0-ec17-f7a24c34fb28",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8ff2d768-8805-068c-6bfb-9a01e779384a")
public static final String FIELDNAME_Attribute_Description="8ff2d768-8805-068c-6bfb-9a01e779384a";

@XendraTrl(Identifier="10e1fe88-0c9f-5817-8237-147fb547d07f")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="10e1fe88-0c9f-5817-8237-147fb547d07f",
Synchronized="2019-08-30 22:20:56.0")
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
@XendraTrl(Identifier="51e707d2-bd75-4487-9aa7-cd7b44326389")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="51e707d2-bd75-4487-9aa7-cd7b44326389",
Synchronized="2019-08-30 22:20:56.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
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

@XendraTrl(Identifier="c899d180-0678-3dfd-6441-686807a994b5")
public static String es_PE_FIELD_Attribute_Self_Service_Name="Auto-Servicio";

@XendraTrl(Identifier="c899d180-0678-3dfd-6441-686807a994b5")
public static String es_PE_FIELD_Attribute_Self_Service_Description="Esta es una entrada del autoservicio ó esta entrada se puede cambiar vía autoservicio";

@XendraTrl(Identifier="c899d180-0678-3dfd-6441-686807a994b5")
public static String es_PE_FIELD_Attribute_Self_Service_Help="El autoservicio permite que los usuarios incorporen datos o que pongan al día sus datos. La bandera indica, que este expediente fue incorporado o creado vía autoservicio o que el usuario puede cambiarlo vía funcionalidad del autoservicio.";

@XendraField(AD_Column_ID="IsSelfService",IsCentrallyMaintained=true,
AD_Tab_ID="5db45099-4d21-6dc0-ec17-f7a24c34fb28",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c899d180-0678-3dfd-6441-686807a994b5")
public static final String FIELDNAME_Attribute_Self_Service="c899d180-0678-3dfd-6441-686807a994b5";

@XendraTrl(Identifier="87fbbba5-f734-90ba-510d-c54941821891")
public static String es_PE_COLUMN_IsSelfService_Name="Auto-Servicio";

@XendraColumn(AD_Element_ID="8f201030-f9ab-66d2-f4de-7209f41f2af8",ColumnName="IsSelfService",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="Y",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="87fbbba5-f734-90ba-510d-c54941821891",
Synchronized="2019-08-30 22:20:56.0")
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

@XendraTrl(Identifier="50171df0-0372-485a-dd39-0cf7a94efce1")
public static String es_PE_FIELD_Attribute_Name_Name="Nombre";

@XendraTrl(Identifier="50171df0-0372-485a-dd39-0cf7a94efce1")
public static String es_PE_FIELD_Attribute_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="50171df0-0372-485a-dd39-0cf7a94efce1")
public static String es_PE_FIELD_Attribute_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraField(AD_Column_ID="Name",IsCentrallyMaintained=true,
AD_Tab_ID="5db45099-4d21-6dc0-ec17-f7a24c34fb28",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=40,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="50171df0-0372-485a-dd39-0cf7a94efce1")
public static final String FIELDNAME_Attribute_Name="50171df0-0372-485a-dd39-0cf7a94efce1";

@XendraTrl(Identifier="d59b204c-e679-d50c-1c0e-4a7633093144")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d59b204c-e679-d50c-1c0e-4a7633093144",
Synchronized="2019-08-30 22:20:56.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
/** Set Sequence.
@param SeqNo Method of ordering records: lowest number comes first */
public void setSeqNo (int SeqNo)
{
set_Value (COLUMNNAME_SeqNo, Integer.valueOf(SeqNo));
}
/** Get Sequence.
@return Method of ordering records: lowest number comes first */
public int getSeqNo() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_SeqNo);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="ce95463b-f002-e167-ead0-5fb2bb3a9985")
public static String es_PE_FIELD_Attribute_Sequence_Name="Secuencia";

@XendraTrl(Identifier="ce95463b-f002-e167-ead0-5fb2bb3a9985")
public static String es_PE_FIELD_Attribute_Sequence_Description="Método de ordenar registros; el número más bajo viene primero";

@XendraTrl(Identifier="ce95463b-f002-e167-ead0-5fb2bb3a9985")
public static String es_PE_FIELD_Attribute_Sequence_Help="La Secuencia indica el orden de los registros";

@XendraField(AD_Column_ID="SeqNo",IsCentrallyMaintained=true,
AD_Tab_ID="5db45099-4d21-6dc0-ec17-f7a24c34fb28",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ce95463b-f002-e167-ead0-5fb2bb3a9985")
public static final String FIELDNAME_Attribute_Sequence="ce95463b-f002-e167-ead0-5fb2bb3a9985";

@XendraTrl(Identifier="947d0d28-ffbf-adb1-af03-3b89610210a1")
public static String es_PE_COLUMN_SeqNo_Name="Secuencia";

@XendraColumn(AD_Element_ID="38fa26fe-b59d-fce1-c129-420b57da738b",ColumnName="SeqNo",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="947d0d28-ffbf-adb1-af03-3b89610210a1",
Synchronized="2019-08-30 22:20:56.0")
/** Column name SeqNo */
public static final String COLUMNNAME_SeqNo = "SeqNo";
}
