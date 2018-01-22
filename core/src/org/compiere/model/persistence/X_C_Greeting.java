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
/** Generated Model for C_Greeting
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_C_Greeting extends PO
{
/** Standard Constructor
@param ctx context
@param C_Greeting_ID id
@param trxName transaction
*/
public X_C_Greeting (Properties ctx, int C_Greeting_ID, String trxName)
{
super (ctx, C_Greeting_ID, trxName);
/** if (C_Greeting_ID == 0)
{
setC_Greeting_ID (0);
setIsDefault (false);	
// N
setIsFirstNameOnly (false);	
// N
setName (null);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_C_Greeting (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=346 */
public static int Table_ID=MTable.getTable_ID("C_Greeting");

@XendraTrl(Identifier="a3764399-b4a1-33a8-8b2a-e3974e7ca3ac")
public static String es_PE_TAB_Greeting_Description="Definir Saludo";

@XendraTrl(Identifier="a3764399-b4a1-33a8-8b2a-e3974e7ca3ac")
public static String es_PE_TAB_Greeting_Name="Saludo";

@XendraTrl(Identifier="a3764399-b4a1-33a8-8b2a-e3974e7ca3ac")
public static String es_PE_TAB_Greeting_Help="La pestaña Saludo define la manera en la cual el saludo inicial será desplegado en los documentos del socio de negocio.";

@XendraTab(Name="Greeting",Description="Define Greeting",
Help="The Greeting Tab defines the manner in which you will address business partners on documents.",
AD_Window_ID="87dd4401-751b-8c4a-3185-a0c670b2e966",SeqNo=10,TabLevel=0,IsSingleRow=true,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="a3764399-b4a1-33a8-8b2a-e3974e7ca3ac",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Greeting="a3764399-b4a1-33a8-8b2a-e3974e7ca3ac";

@XendraTrl(Identifier="ff8bfe02-be79-284e-8b01-dd7e84a8e131")
public static String es_PE_TABLE_C_Greeting_Name="Saludo";

@XendraTable(Name="Greeting",Description="Greeting to print on correspondence",Help="",
TableName="C_Greeting",AccessLevel="3",AD_Window_ID="87dd4401-751b-8c4a-3185-a0c670b2e966",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=65,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.commercial",
Identifier="ff8bfe02-be79-284e-8b01-dd7e84a8e131",Synchronized="2017-08-16 11:41:47.0")
/** TableName=C_Greeting */
public static final String Table_Name="C_Greeting";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"C_Greeting");

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
    Table_ID = MTable.getTable_ID("C_Greeting");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_C_Greeting[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Greeting.
@param C_Greeting_ID Greeting to print on correspondence */
public void setC_Greeting_ID (int C_Greeting_ID)
{
if (C_Greeting_ID < 1) throw new IllegalArgumentException ("C_Greeting_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_Greeting_ID, Integer.valueOf(C_Greeting_ID));
}
/** Get Greeting.
@return Greeting to print on correspondence */
public int getC_Greeting_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Greeting_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="482b6802-d884-507e-cf4f-9fbff3b3d08c")
public static String es_PE_FIELD_Greeting_Greeting_Description="Saludo para imprimir en la correspondencia";

@XendraTrl(Identifier="482b6802-d884-507e-cf4f-9fbff3b3d08c")
public static String es_PE_FIELD_Greeting_Greeting_Help="Los saludos identifican los saludos a imprimir en la correspondencia";

@XendraTrl(Identifier="482b6802-d884-507e-cf4f-9fbff3b3d08c")
public static String es_PE_FIELD_Greeting_Greeting_Name="Saludo";

@XendraField(AD_Column_ID="C_Greeting_ID",IsCentrallyMaintained=true,
AD_Tab_ID="a3764399-b4a1-33a8-8b2a-e3974e7ca3ac",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=10,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="482b6802-d884-507e-cf4f-9fbff3b3d08c")
public static final String FIELDNAME_Greeting_Greeting="482b6802-d884-507e-cf4f-9fbff3b3d08c";
/** Column name C_Greeting_ID */
public static final String COLUMNNAME_C_Greeting_ID = "C_Greeting_ID";
/** Set Greeting.
@param Greeting For letters, e.g. 'Dear 
{
0}
' or 'Dear Mr. 
{
0}
' - At runtime, '
{
0}
' is replaced by the NAME */
public void setGreeting (String Greeting)
{
if (Greeting != null && Greeting.length() > 60)
{
log.warning("Length > 60 - truncated");
Greeting = Greeting.substring(0,59);
}
set_Value (COLUMNNAME_Greeting, Greeting);
}
/** Get Greeting.
@return For letters, e.g. 'Dear 
{
0}
' or 'Dear Mr. 
{
0}
' - At runtime, '
{
0}
' is replaced by the NAME */
public String getGreeting() 
{
String value = (String)get_Value(COLUMNNAME_Greeting);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="424991e8-a0b0-2a83-c74a-98ea2ad9fa06")
public static String es_PE_FIELD_Greeting_Greeting2_Description="Para cartas; Ej. \"Querido {0}\" ó \"Querido Mr.{0}\" - En el timpo pasado; \"{0}\" es substituido por el nombre.";

@XendraTrl(Identifier="424991e8-a0b0-2a83-c74a-98ea2ad9fa06")
public static String es_PE_FIELD_Greeting_Greeting2_Help="Los saludos serán impresos en cartas enviadas a socios de negocio.";

@XendraTrl(Identifier="424991e8-a0b0-2a83-c74a-98ea2ad9fa06")
public static String es_PE_FIELD_Greeting_Greeting2_Name="Saludo";

@XendraField(AD_Column_ID="Greeting",IsCentrallyMaintained=true,
AD_Tab_ID="a3764399-b4a1-33a8-8b2a-e3974e7ca3ac",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="424991e8-a0b0-2a83-c74a-98ea2ad9fa06")
public static final String FIELDNAME_Greeting_Greeting2="424991e8-a0b0-2a83-c74a-98ea2ad9fa06";

@XendraTrl(Identifier="7c68b72a-0d83-955d-4aab-533c17760346")
public static String es_PE_COLUMN_Greeting_Name="Saludo";

@XendraColumn(AD_Element_ID="ac4d5f57-8f7d-f617-a536-c604ba8aadf9",ColumnName="Greeting",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=true,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7c68b72a-0d83-955d-4aab-533c17760346",
Synchronized="2017-08-05 16:53:40.0")
/** Column name Greeting */
public static final String COLUMNNAME_Greeting = "Greeting";
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
@XendraTrl(Identifier="f86c8c3e-7598-48ee-8b77-27b19cf3a4b9")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f86c8c3e-7598-48ee-8b77-27b19cf3a4b9",
Synchronized="2017-08-05 16:53:40.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Default.
@param IsDefault Default value */
public void setIsDefault (boolean IsDefault)
{
set_Value (COLUMNNAME_IsDefault, Boolean.valueOf(IsDefault));
}
/** Get Default.
@return Default value */
public boolean isDefault() 
{
Object oo = get_Value(COLUMNNAME_IsDefault);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="97b5f120-6e2d-4eb2-92ea-60dd6ff1af13")
public static String es_PE_FIELD_Greeting_Default_Description="Valor Predeterminado";

@XendraTrl(Identifier="97b5f120-6e2d-4eb2-92ea-60dd6ff1af13")
public static String es_PE_FIELD_Greeting_Default_Help="El cuadro de verificación indica si este registro será usado como un valor predeterminado";

@XendraTrl(Identifier="97b5f120-6e2d-4eb2-92ea-60dd6ff1af13")
public static String es_PE_FIELD_Greeting_Default_Name="Predeterminado";

@XendraField(AD_Column_ID="IsDefault",IsCentrallyMaintained=true,
AD_Tab_ID="a3764399-b4a1-33a8-8b2a-e3974e7ca3ac",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="97b5f120-6e2d-4eb2-92ea-60dd6ff1af13")
public static final String FIELDNAME_Greeting_Default="97b5f120-6e2d-4eb2-92ea-60dd6ff1af13";

@XendraTrl(Identifier="71e53cc2-b302-42e5-0e93-40aaac61218c")
public static String es_PE_COLUMN_IsDefault_Name="Predeterminado";

@XendraColumn(AD_Element_ID="8617f892-e113-a5fd-8715-687f792f136c",ColumnName="IsDefault",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="71e53cc2-b302-42e5-0e93-40aaac61218c",
Synchronized="2017-08-05 16:53:40.0")
/** Column name IsDefault */
public static final String COLUMNNAME_IsDefault = "IsDefault";
/** Set First NAME only.
@param IsFirstNameOnly Print only the first NAME in greetings */
public void setIsFirstNameOnly (boolean IsFirstNameOnly)
{
set_Value (COLUMNNAME_IsFirstNameOnly, Boolean.valueOf(IsFirstNameOnly));
}
/** Get First NAME only.
@return Print only the first NAME in greetings */
public boolean isFirstNameOnly() 
{
Object oo = get_Value(COLUMNNAME_IsFirstNameOnly);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="d164e5a2-c980-798b-b836-03bc067b6498")
public static String es_PE_FIELD_Greeting_FirstNAMEOnly_Description="Imprimir solamente el primer nombre en el saludo";

@XendraTrl(Identifier="d164e5a2-c980-798b-b836-03bc067b6498")
public static String es_PE_FIELD_Greeting_FirstNAMEOnly_Help="El cuadro de verificación sólo primer nombre indica que sólo el primer nombre de este contacto se deberá imprimir en los saludos.";

@XendraTrl(Identifier="d164e5a2-c980-798b-b836-03bc067b6498")
public static String es_PE_FIELD_Greeting_FirstNAMEOnly_Name="Sólo Primer Nombre";

@XendraField(AD_Column_ID="IsFirstNameOnly",IsCentrallyMaintained=true,
AD_Tab_ID="a3764399-b4a1-33a8-8b2a-e3974e7ca3ac",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d164e5a2-c980-798b-b836-03bc067b6498")
public static final String FIELDNAME_Greeting_FirstNAMEOnly="d164e5a2-c980-798b-b836-03bc067b6498";

@XendraTrl(Identifier="a6b1695b-6b73-9a8c-c7c1-c95a39eaaf82")
public static String es_PE_COLUMN_IsFirstNameOnly_Name="Sólo Primer Nombre";

@XendraColumn(AD_Element_ID="6947afd0-d373-36c1-e892-dd3610aa00b8",ColumnName="IsFirstNameOnly",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a6b1695b-6b73-9a8c-c7c1-c95a39eaaf82",
Synchronized="2017-08-05 16:53:40.0")
/** Column name IsFirstNameOnly */
public static final String COLUMNNAME_IsFirstNameOnly = "IsFirstNameOnly";
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

@XendraTrl(Identifier="13477c6d-e088-9d72-1121-3368006a0b02")
public static String es_PE_FIELD_Greeting_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="13477c6d-e088-9d72-1121-3368006a0b02")
public static String es_PE_FIELD_Greeting_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraTrl(Identifier="13477c6d-e088-9d72-1121-3368006a0b02")
public static String es_PE_FIELD_Greeting_Name_Name="Nombre";
@XendraField(AD_Column_ID="Name",
IsCentrallyMaintained=true,AD_Tab_ID="a3764399-b4a1-33a8-8b2a-e3974e7ca3ac",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=40,SortNo=1,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="13477c6d-e088-9d72-1121-3368006a0b02")
public static final String FIELDNAME_Greeting_Name="13477c6d-e088-9d72-1121-3368006a0b02";

@XendraTrl(Identifier="d8e730f8-9664-3157-898f-05609cf378b7")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=true,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d8e730f8-9664-3157-898f-05609cf378b7",
Synchronized="2017-08-05 16:53:40.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
}
