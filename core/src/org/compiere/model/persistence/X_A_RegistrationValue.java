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
/** Generated Model for A_RegistrationValue
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_A_RegistrationValue extends PO
{
/** Standard Constructor
@param ctx context
@param A_RegistrationValue_ID id
@param trxName transaction
*/
public X_A_RegistrationValue (Properties ctx, int A_RegistrationValue_ID, String trxName)
{
super (ctx, A_RegistrationValue_ID, trxName);
/** if (A_RegistrationValue_ID == 0)
{
setA_RegistrationAttribute_ID (0);
setA_Registration_ID (0);
setName (null);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_A_RegistrationValue (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=653 */
public static int Table_ID=MTable.getTable_ID("A_RegistrationValue");

@XendraTrl(Identifier="f5dfaf8a-0404-386a-f1e0-d925e74d5ff3")
public static String es_PE_TAB_Value_Description="Valores del registro";

@XendraTrl(Identifier="f5dfaf8a-0404-386a-f1e0-d925e74d5ff3")
public static String es_PE_TAB_Value_Help="Valores Individuales de atributos del registro";

@XendraTrl(Identifier="f5dfaf8a-0404-386a-f1e0-d925e74d5ff3")
public static String es_PE_TAB_Value_Name="Valor";
@XendraTab(Name="Value",
Description="Registration Values",Help="Indivifual values of Registration Attribute",
AD_Window_ID="ca233263-48b6-c157-cd25-6ffa7446944f",SeqNo=20,TabLevel=1,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,
AD_Column_ID="c9bd5ef2-2435-fe7e-3801-6d2d1b19b489",HasTree=false,WhereClause="",OrderByClause="",
CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",AD_ColumnSortYesNo_ID="",
IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",IsInsertRecord=true,
IsAdvancedTab=false,Parent_Column_ID="",Identifier="f5dfaf8a-0404-386a-f1e0-d925e74d5ff3",
Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Value="f5dfaf8a-0404-386a-f1e0-d925e74d5ff3";

@XendraTrl(Identifier="9dc4515c-2304-a83b-d2aa-aa5684a0b36f")
public static String es_PE_TABLE_A_RegistrationValue_Name="A_RegistrationValue";

@XendraTable(Name="A_RegistrationValue",AD_Package_ID="1b3656e5-71c7-1296-994e-9b2c4549c7fd",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="",Help="",
TableName="A_RegistrationValue",AccessLevel="3",
AD_Window_ID="ca233263-48b6-c157-cd25-6ffa7446944f",AD_Val_Rule_ID="",IsKey=0,LoadSeq=145,
IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,IsView=false,
PO_Window_ID="",ID="org.xendra.standard",Identifier="9dc4515c-2304-a83b-d2aa-aa5684a0b36f",
Synchronized="2020-03-03 21:36:16.0")
/** TableName=A_RegistrationValue */
public static final String Table_Name="A_RegistrationValue";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"A_RegistrationValue");

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
    Table_ID = MTable.getTable_ID("A_RegistrationValue");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_A_RegistrationValue[").append(get_ID()).append("]");
return sb.toString();
}
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
/** Get Record ID/ColumnName
@return ID/ColumnName pair
*/public KeyNamePair getKeyNamePair() 
{
return new KeyNamePair(get_ID(), String.valueOf(getA_RegistrationAttribute_ID()));
}

@XendraTrl(Identifier="82f6e8f3-b644-0c03-eba9-3f795800ae0f")
public static String es_PE_FIELD_Value_RegistrationAttribute_Name="Registro de Atributo";

@XendraTrl(Identifier="82f6e8f3-b644-0c03-eba9-3f795800ae0f")
public static String es_PE_FIELD_Value_RegistrationAttribute_Description="Registro de atributo activo";

@XendraTrl(Identifier="82f6e8f3-b644-0c03-eba9-3f795800ae0f")
public static String es_PE_FIELD_Value_RegistrationAttribute_Help="Defina los valores individuales para el registro del activo.";

@XendraField(AD_Column_ID="A_RegistrationAttribute_ID",IsCentrallyMaintained=true,
AD_Tab_ID="f5dfaf8a-0404-386a-f1e0-d925e74d5ff3",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="82f6e8f3-b644-0c03-eba9-3f795800ae0f")
public static final String FIELDNAME_Value_RegistrationAttribute="82f6e8f3-b644-0c03-eba9-3f795800ae0f";

@XendraTrl(Identifier="5fa92506-8139-3822-a701-0ad928ca8747")
public static String es_PE_COLUMN_A_RegistrationAttribute_ID_Name="Registro de Atributo";

@XendraColumn(AD_Element_ID="afcb188c-7a96-7990-bf5f-31ff35953350",
ColumnName="A_RegistrationAttribute_ID",AD_Reference_ID=19,AD_Reference_Value_ID="",
AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=true,
IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=true,SeqNo=1,IsTranslated=false,
Callout="",VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="5fa92506-8139-3822-a701-0ad928ca8747",Synchronized="2019-08-30 22:20:56.0")
/** Column name A_RegistrationAttribute_ID */
public static final String COLUMNNAME_A_RegistrationAttribute_ID = "A_RegistrationAttribute_ID";
/** Set Registration.
@param A_Registration_ID User Asset Registration */
public void setA_Registration_ID (int A_Registration_ID)
{
if (A_Registration_ID < 1) throw new IllegalArgumentException ("A_Registration_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_A_Registration_ID, Integer.valueOf(A_Registration_ID));
}
/** Get Registration.
@return User Asset Registration */
public int getA_Registration_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_A_Registration_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="0dcf2143-b8a5-e599-1690-b2e43722f38f")
public static String es_PE_FIELD_Value_Registration_Name="Registro";

@XendraTrl(Identifier="0dcf2143-b8a5-e599-1690-b2e43722f38f")
public static String es_PE_FIELD_Value_Registration_Description="Usar registro activo";

@XendraTrl(Identifier="0dcf2143-b8a5-e599-1690-b2e43722f38f")
public static String es_PE_FIELD_Value_Registration_Help="Usar registro de un activo.";

@XendraField(AD_Column_ID="A_Registration_ID",IsCentrallyMaintained=true,
AD_Tab_ID="f5dfaf8a-0404-386a-f1e0-d925e74d5ff3",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0dcf2143-b8a5-e599-1690-b2e43722f38f")
public static final String FIELDNAME_Value_Registration="0dcf2143-b8a5-e599-1690-b2e43722f38f";

@XendraTrl(Identifier="c9bd5ef2-2435-fe7e-3801-6d2d1b19b489")
public static String es_PE_COLUMN_A_Registration_ID_Name="Registro";

@XendraColumn(AD_Element_ID="6b345d51-1f8f-4b4d-06ea-6a433410e1c2",ColumnName="A_Registration_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c9bd5ef2-2435-fe7e-3801-6d2d1b19b489",
Synchronized="2019-08-30 22:20:56.0")
/** Column name A_Registration_ID */
public static final String COLUMNNAME_A_Registration_ID = "A_Registration_ID";
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

@XendraTrl(Identifier="f32b8901-e5cb-994c-1882-6ec74dbbe152")
public static String es_PE_FIELD_Value_Description_Name="Observación";

@XendraTrl(Identifier="f32b8901-e5cb-994c-1882-6ec74dbbe152")
public static String es_PE_FIELD_Value_Description_Description="Observación";

@XendraTrl(Identifier="f32b8901-e5cb-994c-1882-6ec74dbbe152")
public static String es_PE_FIELD_Value_Description_Help="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="f5dfaf8a-0404-386a-f1e0-d925e74d5ff3",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f32b8901-e5cb-994c-1882-6ec74dbbe152")
public static final String FIELDNAME_Value_Description="f32b8901-e5cb-994c-1882-6ec74dbbe152";

@XendraTrl(Identifier="1c1f81b0-6a01-5b5b-7b7a-2d92f550328b")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="1c1f81b0-6a01-5b5b-7b7a-2d92f550328b",
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
@XendraTrl(Identifier="4e612344-b84c-4374-90b2-f0a5f051b5c9")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="4e612344-b84c-4374-90b2-f0a5f051b5c9",
Synchronized="2019-08-30 22:20:56.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
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
@XendraTrl(Identifier="08ba9b1e-d171-dad2-88e2-0b9fb984bbb9")
public static String es_PE_FIELD_Value_Name_Name="Nombre";

@XendraTrl(Identifier="08ba9b1e-d171-dad2-88e2-0b9fb984bbb9")
public static String es_PE_FIELD_Value_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="08ba9b1e-d171-dad2-88e2-0b9fb984bbb9")
public static String es_PE_FIELD_Value_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraField(AD_Column_ID="Name",IsCentrallyMaintained=true,
AD_Tab_ID="f5dfaf8a-0404-386a-f1e0-d925e74d5ff3",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=50,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="08ba9b1e-d171-dad2-88e2-0b9fb984bbb9")
public static final String FIELDNAME_Value_Name="08ba9b1e-d171-dad2-88e2-0b9fb984bbb9";

@XendraTrl(Identifier="e5de520b-1b0c-ffe2-2b97-b4fc9396de69")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=2,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e5de520b-1b0c-ffe2-2b97-b4fc9396de69",
Synchronized="2019-08-30 22:20:56.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
}
