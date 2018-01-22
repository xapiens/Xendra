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
/** Generated Model for W_CounterCount
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_W_CounterCount extends PO
{
/** Standard Constructor
@param ctx context
@param W_CounterCount_ID id
@param trxName transaction
*/
public X_W_CounterCount (Properties ctx, int W_CounterCount_ID, String trxName)
{
super (ctx, W_CounterCount_ID, trxName);
/** if (W_CounterCount_ID == 0)
{
setName (null);
setPageURL (null);
setW_CounterCount_ID (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_W_CounterCount (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=552 */
public static int Table_ID=MTable.getTable_ID("W_CounterCount");

@XendraTrl(Identifier="6bf2ffe9-fe57-a248-1248-20d40ffa2d3d")
public static String es_PE_TAB_Count_Description="Cuenta del Contador de la Web";

@XendraTrl(Identifier="6bf2ffe9-fe57-a248-1248-20d40ffa2d3d")
public static String es_PE_TAB_Count_Name="Contador";
@XendraTab(Name="Count",
Description="Web Counter Count",Help="",AD_Window_ID="8f8d4e21-4aa4-aea5-05d8-e157ddc1d91a",
SeqNo=10,TabLevel=0,IsSingleRow=false,IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,
AD_Column_ID="",HasTree=false,WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",
AD_ColumnSortOrder_ID="",AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",
ReadOnlyLogic="",DisplayLogic="",IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="6bf2ffe9-fe57-a248-1248-20d40ffa2d3d",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Count="6bf2ffe9-fe57-a248-1248-20d40ffa2d3d";

@XendraTrl(Identifier="6c6dca6d-af09-071e-2d6a-dcac20f35209")
public static String es_PE_TABLE_W_CounterCount_Name="Cuenta Contraria";

@XendraTable(Name="Counter Count",Description="Web Counter Count Management",Help="",
TableName="W_CounterCount",AccessLevel="3",AD_Window_ID="8f8d4e21-4aa4-aea5-05d8-e157ddc1d91a",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=140,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.standard",
Identifier="6c6dca6d-af09-071e-2d6a-dcac20f35209",Synchronized="2017-08-16 11:44:29.0")
/** TableName=W_CounterCount */
public static final String Table_Name="W_CounterCount";


@XendraIndex(Name="w_countercount_pageurl",Identifier="c5591794-2682-fc5a-2875-af843f912912",
Column_Names="ad_client_id, pageurl",IsUnique="true",
TableIdentifier="c5591794-2682-fc5a-2875-af843f912912",Synchronized="2014-06-01 19:03:58.0")
public static final String INDEXNAME_w_countercount_pageurl = "c5591794-2682-fc5a-2875-af843f912912";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"W_CounterCount");

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
    Table_ID = MTable.getTable_ID("W_CounterCount");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_W_CounterCount[").append(get_ID()).append("]");
return sb.toString();
}

/** C_BPartner_ID AD_Reference=60ae0c61-2010-74a0-d56f-a6f27933c4c4 */
public static final int C_BPARTNER_ID_AD_Reference_ID=232;
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

@XendraTrl(Identifier="2264e00b-167a-e0c0-1685-2eb78ec5f835")
public static String es_PE_FIELD_Count_BusinessPartner_Description="Identifica un Socio de Negocio";

@XendraTrl(Identifier="2264e00b-167a-e0c0-1685-2eb78ec5f835")
public static String es_PE_FIELD_Count_BusinessPartner_Help="Un socio de negocio es cualquiera con quien usted realiza transacciones. Este puede incluir Proveedores; Clientes; Empleados ó Vendedores.";

@XendraTrl(Identifier="2264e00b-167a-e0c0-1685-2eb78ec5f835")
public static String es_PE_FIELD_Count_BusinessPartner_Name="Socio de Negocio";

@XendraField(AD_Column_ID="C_BPartner_ID",IsCentrallyMaintained=true,
AD_Tab_ID="6bf2ffe9-fe57-a248-1248-20d40ffa2d3d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2264e00b-167a-e0c0-1685-2eb78ec5f835")
public static final String FIELDNAME_Count_BusinessPartner="2264e00b-167a-e0c0-1685-2eb78ec5f835";

@XendraTrl(Identifier="60da8075-9493-c85f-18e4-ed2519266747")
public static String es_PE_COLUMN_C_BPartner_ID_Name="Socio de Negocio";

@XendraColumn(AD_Element_ID="fe333dc3-4f40-1276-5f6a-d09bb66dc423",ColumnName="C_BPartner_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="60ae0c61-2010-74a0-d56f-a6f27933c4c4",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="60da8075-9493-c85f-18e4-ed2519266747",Synchronized="2017-08-05 16:56:32.0")
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

@XendraTrl(Identifier="e4987b42-f1cf-e319-21a4-27785d2ee838")
public static String es_PE_FIELD_Count_Counter_Description="Valor de contador";

@XendraTrl(Identifier="e4987b42-f1cf-e319-21a4-27785d2ee838")
public static String es_PE_FIELD_Count_Counter_Help="Numero de contador";

@XendraTrl(Identifier="e4987b42-f1cf-e319-21a4-27785d2ee838")
public static String es_PE_FIELD_Count_Counter_Name="Contador";
@XendraField(AD_Column_ID="Counter",
IsCentrallyMaintained=true,AD_Tab_ID="6bf2ffe9-fe57-a248-1248-20d40ffa2d3d",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=11,IsReadOnly=true,SeqNo=90,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="e4987b42-f1cf-e319-21a4-27785d2ee838")
public static final String FIELDNAME_Count_Counter="e4987b42-f1cf-e319-21a4-27785d2ee838";

@XendraTrl(Identifier="eae9ccc9-8776-7573-f31a-3f13c4dee76b")
public static String es_PE_COLUMN_Counter_Name="Contador";

@XendraColumn(AD_Element_ID="6df3cd8b-301f-ac7d-aca8-acf148db3ac0",ColumnName="Counter",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,
ColumnSQL="(SELECT COUNT(*) FROM W_Counter c WHERE c.W_CounterCount_ID=W_CounterCount.W_CounterCount_ID)",
IsAllowLogging=false,Identifier="eae9ccc9-8776-7573-f31a-3f13c4dee76b",
Synchronized="2017-08-05 16:56:32.0")
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

@XendraTrl(Identifier="744cf24a-01c4-7372-80a3-1ebaa41aec8a")
public static String es_PE_FIELD_Count_Description_Description="Observación corta opcional del registro";

@XendraTrl(Identifier="744cf24a-01c4-7372-80a3-1ebaa41aec8a")
public static String es_PE_FIELD_Count_Description_Help="Una Observación esta limitada a 255 caracteres";

@XendraTrl(Identifier="744cf24a-01c4-7372-80a3-1ebaa41aec8a")
public static String es_PE_FIELD_Count_Description_Name="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="6bf2ffe9-fe57-a248-1248-20d40ffa2d3d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="744cf24a-01c4-7372-80a3-1ebaa41aec8a")
public static final String FIELDNAME_Count_Description="744cf24a-01c4-7372-80a3-1ebaa41aec8a";

@XendraTrl(Identifier="4328d5f7-e8ee-2a07-431e-30f52ad599e7")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="4328d5f7-e8ee-2a07-431e-30f52ad599e7",
Synchronized="2017-08-05 16:56:32.0")
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
@XendraTrl(Identifier="b861c325-0dbf-4dad-985b-89ac12fbaadb")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b861c325-0dbf-4dad-985b-89ac12fbaadb",
Synchronized="2017-08-05 16:56:32.0")
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

@XendraTrl(Identifier="968dc04c-2e40-cacb-eeb8-6fc73dfaf9a5")
public static String es_PE_FIELD_Count_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="968dc04c-2e40-cacb-eeb8-6fc73dfaf9a5")
public static String es_PE_FIELD_Count_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraTrl(Identifier="968dc04c-2e40-cacb-eeb8-6fc73dfaf9a5")
public static String es_PE_FIELD_Count_Name_Name="Nombre";
@XendraField(AD_Column_ID="Name",
IsCentrallyMaintained=true,AD_Tab_ID="6bf2ffe9-fe57-a248-1248-20d40ffa2d3d",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=40,SortNo=1,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="968dc04c-2e40-cacb-eeb8-6fc73dfaf9a5")
public static final String FIELDNAME_Count_Name="968dc04c-2e40-cacb-eeb8-6fc73dfaf9a5";

@XendraTrl(Identifier="730fe9f4-3fc9-d81a-3a65-62c6fef4a82a")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="730fe9f4-3fc9-d81a-3a65-62c6fef4a82a",
Synchronized="2017-08-05 16:56:32.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
/** Set Page URL.
@param PageURL Page URL */
public void setPageURL (String PageURL)
{
if (PageURL == null) throw new IllegalArgumentException ("PageURL is mandatory.");
if (PageURL.length() > 120)
{
log.warning("Length > 120 - truncated");
PageURL = PageURL.substring(0,119);
}
set_Value (COLUMNNAME_PageURL, PageURL);
}
/** Get Page URL.
@return Page URL */
public String getPageURL() 
{
String value = (String)get_Value(COLUMNNAME_PageURL);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="e4cb551b-e0b0-650d-b72a-427f12a79ff0")
public static String es_PE_FIELD_Count_PageURL_Name="URL de la Página";

@XendraField(AD_Column_ID="PageURL",IsCentrallyMaintained=true,
AD_Tab_ID="6bf2ffe9-fe57-a248-1248-20d40ffa2d3d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e4cb551b-e0b0-650d-b72a-427f12a79ff0")
public static final String FIELDNAME_Count_PageURL="e4cb551b-e0b0-650d-b72a-427f12a79ff0";

@XendraTrl(Identifier="c9efce9a-dca2-53fb-1c48-2b408fde8044")
public static String es_PE_COLUMN_PageURL_Name="URL de la Página";

@XendraColumn(AD_Element_ID="cfdc4b8b-1b18-e1ed-01b2-b5d6539274f1",ColumnName="PageURL",
AD_Reference_ID=40,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=120,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c9efce9a-dca2-53fb-1c48-2b408fde8044",
Synchronized="2017-08-05 16:56:32.0")
/** Column name PageURL */
public static final String COLUMNNAME_PageURL = "PageURL";
/** Set Counter Count.
@param W_CounterCount_ID Web Counter Count Management */
public void setW_CounterCount_ID (int W_CounterCount_ID)
{
if (W_CounterCount_ID < 1) throw new IllegalArgumentException ("W_CounterCount_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_W_CounterCount_ID, Integer.valueOf(W_CounterCount_ID));
}
/** Get Counter Count.
@return Web Counter Count Management */
public int getW_CounterCount_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_W_CounterCount_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="876dec3c-23e2-1ee3-bdf8-c61fc196b14b")
public static String es_PE_FIELD_Count_CounterCount_Description="Gerencia contraria de la cuenta Web";

@XendraTrl(Identifier="876dec3c-23e2-1ee3-bdf8-c61fc196b14b")
public static String es_PE_FIELD_Count_CounterCount_Help="Información de la cuenta contaria en Web";

@XendraTrl(Identifier="876dec3c-23e2-1ee3-bdf8-c61fc196b14b")
public static String es_PE_FIELD_Count_CounterCount_Name="Cuenta Contraria";

@XendraField(AD_Column_ID="W_CounterCount_ID",IsCentrallyMaintained=true,
AD_Tab_ID="6bf2ffe9-fe57-a248-1248-20d40ffa2d3d",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=10,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="876dec3c-23e2-1ee3-bdf8-c61fc196b14b")
public static final String FIELDNAME_Count_CounterCount="876dec3c-23e2-1ee3-bdf8-c61fc196b14b";
/** Column name W_CounterCount_ID */
public static final String COLUMNNAME_W_CounterCount_ID = "W_CounterCount_ID";
}
