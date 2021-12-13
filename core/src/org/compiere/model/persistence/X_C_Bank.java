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
/** Generated Model for C_Bank
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_C_Bank extends PO
{
/** Standard Constructor
@param ctx context
@param C_Bank_ID id
@param trxName transaction
*/
public X_C_Bank (Properties ctx, int C_Bank_ID, String trxName)
{
super (ctx, C_Bank_ID, trxName);
/** if (C_Bank_ID == 0)
{
setC_Bank_ID (0);
setIsOwnBank (true);	
// Y
setName (null);
setRoutingNo (null);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_C_Bank (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=296 */
public static int Table_ID=MTable.getTable_ID("C_Bank");

@XendraTrl(Identifier="da0edea0-f116-797e-76ba-dec16671de16")
public static String es_PE_TAB_Bank_Description="Mantener Bancos";

@XendraTrl(Identifier="da0edea0-f116-797e-76ba-dec16671de16")
public static String es_PE_TAB_Bank_Help="La pestaña Bancos define un banco que es usado por una organización ó socio de negocio. Cada banco contiene un nombre; dirección número de ruta y código Swift.";

@XendraTrl(Identifier="da0edea0-f116-797e-76ba-dec16671de16")
public static String es_PE_TAB_Bank_Name="Banco";
@XendraTab(Name="Bank",
Description="Maintain Bank",
Help="The Bank Tab defines a bank that is used by an organization or business partner.  Each Bank is given an identifying Name, Address, Routing No and Swift Code",
AD_Window_ID="da35b881-e51f-c76d-0c58-a14a86f4a839",SeqNo=10,TabLevel=0,IsSingleRow=true,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="da0edea0-f116-797e-76ba-dec16671de16",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Bank="da0edea0-f116-797e-76ba-dec16671de16";

@XendraTrl(Identifier="be63c79c-eef0-c2db-ce47-df757cd9f072")
public static String es_PE_TABLE_C_Bank_Name="Banco";

@XendraTable(Name="Bank",AD_Package_ID="98af94a4-a4cd-bdc0-5651-5880caf79899",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="Bank",Help="",TableName="C_Bank",
AccessLevel="3",AD_Window_ID="da35b881-e51f-c76d-0c58-a14a86f4a839",AD_Val_Rule_ID="",IsKey=1,
LoadSeq=85,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,
IsView=false,PO_Window_ID="",ID="org.xendra.commercial",
Identifier="be63c79c-eef0-c2db-ce47-df757cd9f072",Synchronized="2020-03-03 21:36:25.0")
/** TableName=C_Bank */
public static final String Table_Name="C_Bank";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"C_Bank");

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
    Table_ID = MTable.getTable_ID("C_Bank");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_C_Bank[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Bank.
@param C_Bank_ID Bank */
public void setC_Bank_ID (int C_Bank_ID)
{
if (C_Bank_ID < 1) throw new IllegalArgumentException ("C_Bank_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_Bank_ID, Integer.valueOf(C_Bank_ID));
}
/** Get Bank.
@return Bank */
public int getC_Bank_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Bank_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="78882d3f-578d-ef69-6732-e82b17fa8ea0")
public static String es_PE_FIELD_Bank_Bank_Name="Banco";

@XendraTrl(Identifier="78882d3f-578d-ef69-6732-e82b17fa8ea0")
public static String es_PE_FIELD_Bank_Bank_Description="Banco";

@XendraTrl(Identifier="78882d3f-578d-ef69-6732-e82b17fa8ea0")
public static String es_PE_FIELD_Bank_Bank_Help="El Banco es un identificador único de un Banco para esta Organización o para un Socio del Negocio con quien esta organización efectúa transacciones";

@XendraField(AD_Column_ID="C_Bank_ID",IsCentrallyMaintained=true,
AD_Tab_ID="da0edea0-f116-797e-76ba-dec16671de16",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="78882d3f-578d-ef69-6732-e82b17fa8ea0")
public static final String FIELDNAME_Bank_Bank="78882d3f-578d-ef69-6732-e82b17fa8ea0";
/** Column name C_Bank_ID */
public static final String COLUMNNAME_C_Bank_ID = "C_Bank_ID";
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

@XendraTrl(Identifier="c68de8d8-3aa7-80db-0700-0b36b2a46f1c")
public static String es_PE_FIELD_Bank_Address_Name="Localización / Dirección";

@XendraTrl(Identifier="c68de8d8-3aa7-80db-0700-0b36b2a46f1c")
public static String es_PE_FIELD_Bank_Address_Description="Ubicación ó dirección";

@XendraTrl(Identifier="c68de8d8-3aa7-80db-0700-0b36b2a46f1c")
public static String es_PE_FIELD_Bank_Address_Help="El campo Ubicación / Dirección define la ubicación de una entidad.";

@XendraField(AD_Column_ID="C_Location_ID",IsCentrallyMaintained=true,
AD_Tab_ID="da0edea0-f116-797e-76ba-dec16671de16",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c68de8d8-3aa7-80db-0700-0b36b2a46f1c")
public static final String FIELDNAME_Bank_Address="c68de8d8-3aa7-80db-0700-0b36b2a46f1c";

@XendraTrl(Identifier="5ac36e58-33ff-c29e-7e91-3c8643bae51d")
public static String es_PE_COLUMN_C_Location_ID_Name="Localización / Dirección";

@XendraColumn(AD_Element_ID="e66e22a8-535b-2af2-6efb-aa600959a885",ColumnName="C_Location_ID",
AD_Reference_ID=21,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5ac36e58-33ff-c29e-7e91-3c8643bae51d",
Synchronized="2019-08-30 22:21:03.0")
/** Column name C_Location_ID */
public static final String COLUMNNAME_C_Location_ID = "C_Location_ID";
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

@XendraTrl(Identifier="b46169a8-f744-6f4b-725f-564a1350d0fe")
public static String es_PE_FIELD_Bank_Description_Name="Observación";

@XendraTrl(Identifier="b46169a8-f744-6f4b-725f-564a1350d0fe")
public static String es_PE_FIELD_Bank_Description_Description="Observación";

@XendraTrl(Identifier="b46169a8-f744-6f4b-725f-564a1350d0fe")
public static String es_PE_FIELD_Bank_Description_Help="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="da0edea0-f116-797e-76ba-dec16671de16",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b46169a8-f744-6f4b-725f-564a1350d0fe")
public static final String FIELDNAME_Bank_Description="b46169a8-f744-6f4b-725f-564a1350d0fe";

@XendraTrl(Identifier="81540f8d-cd86-7fc1-77d1-829f02705a47")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="81540f8d-cd86-7fc1-77d1-829f02705a47",
Synchronized="2019-08-30 22:21:03.0")
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
@XendraTrl(Identifier="b5f1c1eb-8637-4fc4-a706-58aec033b8ea")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b5f1c1eb-8637-4fc4-a706-58aec033b8ea",
Synchronized="2019-08-30 22:21:03.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Own Bank.
@param IsOwnBank Bank for this Organization */
public void setIsOwnBank (boolean IsOwnBank)
{
set_Value (COLUMNNAME_IsOwnBank, Boolean.valueOf(IsOwnBank));
}
/** Get Own Bank.
@return Bank for this Organization */
public boolean isOwnBank() 
{
Object oo = get_Value(COLUMNNAME_IsOwnBank);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="9e249b44-4a51-b2b4-3405-c35e7ace14c0")
public static String es_PE_FIELD_Bank_OwnBank_Name="Banco Propio";

@XendraTrl(Identifier="9e249b44-4a51-b2b4-3405-c35e7ace14c0")
public static String es_PE_FIELD_Bank_OwnBank_Description="Banco para esta organización";

@XendraTrl(Identifier="9e249b44-4a51-b2b4-3405-c35e7ace14c0")
public static String es_PE_FIELD_Bank_OwnBank_Help="El campo Banco Propio indica si este banco es para la organización en lugar del banco de un socio";

@XendraField(AD_Column_ID="IsOwnBank",IsCentrallyMaintained=true,
AD_Tab_ID="da0edea0-f116-797e-76ba-dec16671de16",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9e249b44-4a51-b2b4-3405-c35e7ace14c0")
public static final String FIELDNAME_Bank_OwnBank="9e249b44-4a51-b2b4-3405-c35e7ace14c0";

@XendraTrl(Identifier="1d2e81c4-01a7-06a4-ff3e-84825f01098a")
public static String es_PE_COLUMN_IsOwnBank_Name="Banco Propio";

@XendraColumn(AD_Element_ID="4768fc28-a452-cc4a-fb4f-652d38015895",ColumnName="IsOwnBank",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="Y",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="1d2e81c4-01a7-06a4-ff3e-84825f01098a",
Synchronized="2019-08-30 22:21:03.0")
/** Column name IsOwnBank */
public static final String COLUMNNAME_IsOwnBank = "IsOwnBank";
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

@XendraTrl(Identifier="82421b9f-4b2c-d7f7-1031-30bf4e9efb75")
public static String es_PE_FIELD_Bank_Name_Name="Nombre";

@XendraTrl(Identifier="82421b9f-4b2c-d7f7-1031-30bf4e9efb75")
public static String es_PE_FIELD_Bank_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="82421b9f-4b2c-d7f7-1031-30bf4e9efb75")
public static String es_PE_FIELD_Bank_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraField(AD_Column_ID="Name",IsCentrallyMaintained=true,
AD_Tab_ID="da0edea0-f116-797e-76ba-dec16671de16",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=30,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="82421b9f-4b2c-d7f7-1031-30bf4e9efb75")
public static final String FIELDNAME_Bank_Name="82421b9f-4b2c-d7f7-1031-30bf4e9efb75";

@XendraTrl(Identifier="0174a607-70cc-2107-0769-cee05324ff32")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0174a607-70cc-2107-0769-cee05324ff32",
Synchronized="2019-08-30 22:21:03.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
/** Set Routing No.
@param RoutingNo Bank Routing Number */
public void setRoutingNo (String RoutingNo)
{
if (RoutingNo == null) throw new IllegalArgumentException ("RoutingNo is mandatory.");
if (RoutingNo.length() > 20)
{
log.warning("Length > 20 - truncated");
RoutingNo = RoutingNo.substring(0,19);
}
set_Value (COLUMNNAME_RoutingNo, RoutingNo);
}
/** Get Routing No.
@return Bank Routing Number */
public String getRoutingNo() 
{
String value = (String)get_Value(COLUMNNAME_RoutingNo);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="7f4136e1-7d6f-bef5-97ab-e6a221b6b7a4")
public static String es_PE_FIELD_Bank_RoutingNo_Name="Código Sunat";

@XendraTrl(Identifier="7f4136e1-7d6f-bef5-97ab-e6a221b6b7a4")
public static String es_PE_FIELD_Bank_RoutingNo_Description="Número de sucursal bancaria";

@XendraTrl(Identifier="7f4136e1-7d6f-bef5-97ab-e6a221b6b7a4")
public static String es_PE_FIELD_Bank_RoutingNo_Help="El número de ruta del banco (Número ABA) identifica un banco legal. Se usa en ruteo de cheques y transacciones electrónicas.";

@XendraField(AD_Column_ID="RoutingNo",IsCentrallyMaintained=true,
AD_Tab_ID="da0edea0-f116-797e-76ba-dec16671de16",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7f4136e1-7d6f-bef5-97ab-e6a221b6b7a4")
public static final String FIELDNAME_Bank_RoutingNo="7f4136e1-7d6f-bef5-97ab-e6a221b6b7a4";

@XendraTrl(Identifier="d7d273d5-93e0-17ec-40cf-a7601b8eee62")
public static String es_PE_COLUMN_RoutingNo_Name="No. de Ruta";

@XendraColumn(AD_Element_ID="6fe1dae1-ff7f-9b06-686b-31ba56524158",ColumnName="RoutingNo",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=20,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=2,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d7d273d5-93e0-17ec-40cf-a7601b8eee62",
Synchronized="2019-08-30 22:21:03.0")
/** Column name RoutingNo */
public static final String COLUMNNAME_RoutingNo = "RoutingNo";
/** Set Swift code.
@param SwiftCode Swift Code or BIC */
public void setSwiftCode (String SwiftCode)
{
if (SwiftCode != null && SwiftCode.length() > 20)
{
log.warning("Length > 20 - truncated");
SwiftCode = SwiftCode.substring(0,19);
}
set_Value (COLUMNNAME_SwiftCode, SwiftCode);
}
/** Get Swift code.
@return Swift Code or BIC */
public String getSwiftCode() 
{
String value = (String)get_Value(COLUMNNAME_SwiftCode);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="d3c26c53-1c57-932d-9f56-6ba89822d9cb")
public static String es_PE_FIELD_Bank_SwiftCode_Name="Código Swift";

@XendraTrl(Identifier="d3c26c53-1c57-932d-9f56-6ba89822d9cb")
public static String es_PE_FIELD_Bank_SwiftCode_Description="Código Swift ";

@XendraTrl(Identifier="d3c26c53-1c57-932d-9f56-6ba89822d9cb")
public static String es_PE_FIELD_Bank_SwiftCode_Help="El código SWIFT es un identificador de un banco";

@XendraField(AD_Column_ID="SwiftCode",IsCentrallyMaintained=true,
AD_Tab_ID="da0edea0-f116-797e-76ba-dec16671de16",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d3c26c53-1c57-932d-9f56-6ba89822d9cb")
public static final String FIELDNAME_Bank_SwiftCode="d3c26c53-1c57-932d-9f56-6ba89822d9cb";

@XendraTrl(Identifier="7f252d24-a864-b618-b8bb-4a8751221e17")
public static String es_PE_COLUMN_SwiftCode_Name="Código Swift";

@XendraColumn(AD_Element_ID="fa0f5cf4-2a91-73f5-8a04-88bd9a8d557e",ColumnName="SwiftCode",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=20,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7f252d24-a864-b618-b8bb-4a8751221e17",
Synchronized="2019-08-30 22:21:03.0")
/** Column name SwiftCode */
public static final String COLUMNNAME_SwiftCode = "SwiftCode";
}
