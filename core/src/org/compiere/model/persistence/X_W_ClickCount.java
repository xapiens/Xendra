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
/** Generated Model for W_ClickCount
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_W_ClickCount extends PO
{
/** Standard Constructor
@param ctx context
@param W_ClickCount_ID id
@param trxName transaction
*/
public X_W_ClickCount (Properties ctx, int W_ClickCount_ID, String trxName)
{
super (ctx, W_ClickCount_ID, trxName);
/** if (W_ClickCount_ID == 0)
{
setName (null);
setTargetURL (null);
setW_ClickCount_ID (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_W_ClickCount (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=553 */
public static int Table_ID=MTable.getTable_ID("W_ClickCount");

@XendraTrl(Identifier="ca86b416-4ac9-bdd7-c084-9f25719cbffb")
public static String es_PE_TAB_Click_Description="Click de Cuenta";

@XendraTrl(Identifier="ca86b416-4ac9-bdd7-c084-9f25719cbffb")
public static String es_PE_TAB_Click_Name="Click";
@XendraTab(Name="Click",
Description="Click Count",Help="Define the link / target you want to track.",
AD_Window_ID="03db8034-9fa0-fcc4-bab8-b9e48ee18661",SeqNo=10,TabLevel=0,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="ca86b416-4ac9-bdd7-c084-9f25719cbffb",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Click="ca86b416-4ac9-bdd7-c084-9f25719cbffb";

@XendraTrl(Identifier="c9055321-f2d7-ecab-1856-6762c7a262ed")
public static String es_PE_TABLE_W_ClickCount_Name="Contador Clic";

@XendraTable(Name="Click Count",AD_Package_ID="1b3656e5-71c7-1296-994e-9b2c4549c7fd",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="Web Click Management",Help="",
TableName="W_ClickCount",AccessLevel="3",AD_Window_ID="03db8034-9fa0-fcc4-bab8-b9e48ee18661",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=140,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.standard",
Identifier="c9055321-f2d7-ecab-1856-6762c7a262ed",Synchronized="2020-03-03 21:40:32.0")
/** TableName=W_ClickCount */
public static final String Table_Name="W_ClickCount";


@XendraIndex(Name="w_clickcount_targeturl",Identifier="a92b4b3e-47a6-4e46-96cf-9fdd9607a86c",
Column_Names="ad_client_id, targeturl",IsUnique="true",
TableIdentifier="a92b4b3e-47a6-4e46-96cf-9fdd9607a86c",Synchronized="2014-06-01 19:03:58.0")
public static final String INDEXNAME_w_clickcount_targeturl = "a92b4b3e-47a6-4e46-96cf-9fdd9607a86c";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"W_ClickCount");

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
    Table_ID = MTable.getTable_ID("W_ClickCount");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_W_ClickCount[").append(get_ID()).append("]");
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

@XendraTrl(Identifier="fca9c757-f33a-2f16-287b-70bef25cb01f")
public static String es_PE_FIELD_Click_BusinessPartner_Name="Socio de Negocio";

@XendraTrl(Identifier="fca9c757-f33a-2f16-287b-70bef25cb01f")
public static String es_PE_FIELD_Click_BusinessPartner_Description="Identifica un Socio de Negocio";

@XendraTrl(Identifier="fca9c757-f33a-2f16-287b-70bef25cb01f")
public static String es_PE_FIELD_Click_BusinessPartner_Help="Un socio de negocio es cualquiera con quien usted realiza transacciones. Este puede incluir Proveedores; Clientes; Empleados ó Vendedores.";

@XendraField(AD_Column_ID="C_BPartner_ID",IsCentrallyMaintained=true,
AD_Tab_ID="ca86b416-4ac9-bdd7-c084-9f25719cbffb",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="fca9c757-f33a-2f16-287b-70bef25cb01f")
public static final String FIELDNAME_Click_BusinessPartner="fca9c757-f33a-2f16-287b-70bef25cb01f";

@XendraTrl(Identifier="cf34d088-6b15-8201-1b76-5e34c2e03211")
public static String es_PE_COLUMN_C_BPartner_ID_Name="Socio de Negocio";

@XendraColumn(AD_Element_ID="fe333dc3-4f40-1276-5f6a-d09bb66dc423",ColumnName="C_BPartner_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="60ae0c61-2010-74a0-d56f-a6f27933c4c4",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="cf34d088-6b15-8201-1b76-5e34c2e03211",Synchronized="2019-08-30 22:24:30.0")
/** Column name C_BPartner_ID */
public static final String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";
/** Set Counter.
@param Counter Count Value */
public void setCounter (int Counter)
{
throw new IllegalArgumentException ("Counter is virtual column");
}
/** Get Counter.
@return Count Value */
public int getCounter() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_Counter);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="42ca0ef7-c591-9c33-3190-8e5424649fa8")
public static String es_PE_FIELD_Click_Counter_Name="Contador";

@XendraTrl(Identifier="42ca0ef7-c591-9c33-3190-8e5424649fa8")
public static String es_PE_FIELD_Click_Counter_Description="Valor de contador";

@XendraTrl(Identifier="42ca0ef7-c591-9c33-3190-8e5424649fa8")
public static String es_PE_FIELD_Click_Counter_Help="Numero de contador";

@XendraField(AD_Column_ID="Counter",IsCentrallyMaintained=true,
AD_Tab_ID="ca86b416-4ac9-bdd7-c084-9f25719cbffb",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=true,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="42ca0ef7-c591-9c33-3190-8e5424649fa8")
public static final String FIELDNAME_Click_Counter="42ca0ef7-c591-9c33-3190-8e5424649fa8";

@XendraTrl(Identifier="8e3ee082-b5e6-be10-775e-88ca5f0e4ce5")
public static String es_PE_COLUMN_Counter_Name="Contador";

@XendraColumn(AD_Element_ID="6df3cd8b-301f-ac7d-aca8-acf148db3ac0",ColumnName="Counter",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,
ColumnSQL="(SELECT COUNT(*) FROM W_Click c WHERE W_ClickCount.W_ClickCount_ID=c.W_ClickCount_ID)",
IsAllowLogging=false,Identifier="8e3ee082-b5e6-be10-775e-88ca5f0e4ce5",
Synchronized="2019-08-30 22:24:30.0")
/** Column name Counter */
public static final String COLUMNNAME_Counter = "Counter";
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

@XendraTrl(Identifier="8040125d-bac4-edd3-5b5e-3204b25ba251")
public static String es_PE_FIELD_Click_Description_Name="Observación";

@XendraTrl(Identifier="8040125d-bac4-edd3-5b5e-3204b25ba251")
public static String es_PE_FIELD_Click_Description_Description="Observación corta opcional del registro";

@XendraTrl(Identifier="8040125d-bac4-edd3-5b5e-3204b25ba251")
public static String es_PE_FIELD_Click_Description_Help="Una Observación esta limitada a 255 caracteres";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="ca86b416-4ac9-bdd7-c084-9f25719cbffb",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8040125d-bac4-edd3-5b5e-3204b25ba251")
public static final String FIELDNAME_Click_Description="8040125d-bac4-edd3-5b5e-3204b25ba251";

@XendraTrl(Identifier="a7508dd5-fff5-43d6-e3f2-f1ae26488ad2")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a7508dd5-fff5-43d6-e3f2-f1ae26488ad2",
Synchronized="2019-08-30 22:24:30.0")
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
@XendraTrl(Identifier="5d239739-9b08-4596-ab6a-a315b32d2a68")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5d239739-9b08-4596-ab6a-a315b32d2a68",
Synchronized="2019-08-30 22:24:30.0")
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
/** Get Record ID/ColumnName
@return ID/ColumnName pair
*/public KeyNamePair getKeyNamePair() 
{
return new KeyNamePair(get_ID(), getName());
}

@XendraTrl(Identifier="b0e54afa-ea66-b3c5-b2f8-82b04ee03405")
public static String es_PE_FIELD_Click_Name_Name="Nombre";

@XendraTrl(Identifier="b0e54afa-ea66-b3c5-b2f8-82b04ee03405")
public static String es_PE_FIELD_Click_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="b0e54afa-ea66-b3c5-b2f8-82b04ee03405")
public static String es_PE_FIELD_Click_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraField(AD_Column_ID="Name",IsCentrallyMaintained=true,
AD_Tab_ID="ca86b416-4ac9-bdd7-c084-9f25719cbffb",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=40,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b0e54afa-ea66-b3c5-b2f8-82b04ee03405")
public static final String FIELDNAME_Click_Name="b0e54afa-ea66-b3c5-b2f8-82b04ee03405";

@XendraTrl(Identifier="3c23df9f-6496-c44e-b8f3-facd39d8249d")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3c23df9f-6496-c44e-b8f3-facd39d8249d",
Synchronized="2019-08-30 22:24:30.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
/** Set Target URL.
@param TargetURL URL for the Target */
public void setTargetURL (String TargetURL)
{
if (TargetURL == null) throw new IllegalArgumentException ("TargetURL is mandatory.");
if (TargetURL.length() > 120)
{
log.warning("Length > 120 - truncated");
TargetURL = TargetURL.substring(0,119);
}
set_Value (COLUMNNAME_TargetURL, TargetURL);
}
/** Get Target URL.
@return URL for the Target */
public String getTargetURL() 
{
String value = (String)get_Value(COLUMNNAME_TargetURL);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="aadde66e-3773-d9b7-5cea-1d96ec72bf1e")
public static String es_PE_FIELD_Click_TargetURL_Name="Destino URL";

@XendraTrl(Identifier="aadde66e-3773-d9b7-5cea-1d96ec72bf1e")
public static String es_PE_FIELD_Click_TargetURL_Description="URL para la tarjeta";

@XendraTrl(Identifier="aadde66e-3773-d9b7-5cea-1d96ec72bf1e")
public static String es_PE_FIELD_Click_TargetURL_Help="URL de el sitio de la tarjeta";

@XendraField(AD_Column_ID="TargetURL",IsCentrallyMaintained=true,
AD_Tab_ID="ca86b416-4ac9-bdd7-c084-9f25719cbffb",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="aadde66e-3773-d9b7-5cea-1d96ec72bf1e")
public static final String FIELDNAME_Click_TargetURL="aadde66e-3773-d9b7-5cea-1d96ec72bf1e";

@XendraTrl(Identifier="8e959e6a-c6a0-4e71-e733-affd21f4b215")
public static String es_PE_COLUMN_TargetURL_Name="Destino URL";

@XendraColumn(AD_Element_ID="431635a1-2839-94c8-aba8-c0e8e38fc288",ColumnName="TargetURL",
AD_Reference_ID=40,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=120,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="8e959e6a-c6a0-4e71-e733-affd21f4b215",
Synchronized="2019-08-30 22:24:31.0")
/** Column name TargetURL */
public static final String COLUMNNAME_TargetURL = "TargetURL";
/** Set Click Count.
@param W_ClickCount_ID Web Click Management */
public void setW_ClickCount_ID (int W_ClickCount_ID)
{
if (W_ClickCount_ID < 1) throw new IllegalArgumentException ("W_ClickCount_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_W_ClickCount_ID, Integer.valueOf(W_ClickCount_ID));
}
/** Get Click Count.
@return Web Click Management */
public int getW_ClickCount_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_W_ClickCount_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="a5b0bdf8-b4df-da36-7161-286334dc96bf")
public static String es_PE_FIELD_Click_ClickCount_Name="Contador Clic";

@XendraTrl(Identifier="a5b0bdf8-b4df-da36-7161-286334dc96bf")
public static String es_PE_FIELD_Click_ClickCount_Description="Gerencia de tecleo Web";

@XendraTrl(Identifier="a5b0bdf8-b4df-da36-7161-286334dc96bf")
public static String es_PE_FIELD_Click_ClickCount_Help="Gerencia de tecleo Web";

@XendraField(AD_Column_ID="W_ClickCount_ID",IsCentrallyMaintained=true,
AD_Tab_ID="ca86b416-4ac9-bdd7-c084-9f25719cbffb",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=10,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a5b0bdf8-b4df-da36-7161-286334dc96bf")
public static final String FIELDNAME_Click_ClickCount="a5b0bdf8-b4df-da36-7161-286334dc96bf";
/** Column name W_ClickCount_ID */
public static final String COLUMNNAME_W_ClickCount_ID = "W_ClickCount_ID";
}
