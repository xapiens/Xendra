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
/** Generated Model for PA_ColorSchema
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_PA_ColorSchema extends PO
{
/** Standard Constructor
@param ctx context
@param PA_ColorSchema_ID id
@param trxName transaction
*/
public X_PA_ColorSchema (Properties ctx, int PA_ColorSchema_ID, String trxName)
{
super (ctx, PA_ColorSchema_ID, trxName);
/** if (PA_ColorSchema_ID == 0)
{
setAD_PrintColor1_ID (0);
setAD_PrintColor2_ID (0);
setEntityType (null);	
// U
setMark1Percent (0);
setMark2Percent (0);
setName (null);
setPA_ColorSchema_ID (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_PA_ColorSchema (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=831 */
public static int Table_ID=MTable.getTable_ID("PA_ColorSchema");

@XendraTrl(Identifier="1fec93db-cd16-fde1-b4d5-b723b995b0b2")
public static String es_PE_TAB_ColorSchema_Description="Desmpeño Esquema de Color";

@XendraTrl(Identifier="1fec93db-cd16-fde1-b4d5-b723b995b0b2")
public static String es_PE_TAB_ColorSchema_Help="Representación Visual del desempeño mediante colores. Frecuentemente el esquema tiene tres niveles (ej. rojo - amarillo - verde). Adempiere soporta dos niveles (ej. rojo - verde) o cuatro niveles (ej. gris - bronce - plata - oro). Note que las medidasd sin límite son representadas en Blanco. Los porcentajes pueden ser entre 0 y sin límite (ej. superior a 100%).";

@XendraTrl(Identifier="1fec93db-cd16-fde1-b4d5-b723b995b0b2")
public static String es_PE_TAB_ColorSchema_Name="Esquema de Color";
@XendraTab(Name="Color Schema",
Description="Performance Color Schema",
Help="Visual representation of performance by color.  The Schema has often three levels (e.g. red-yellow-green).  Adempiere support two levels (e.g. red-green) or four levels (e.g. gray-bronce-silver-gold).  Note that Measures without a goal are represented white.  The percentages could be beween 0 and unlimited (i.e. above 100%).",
AD_Window_ID="01ccb45d-46e4-2670-a5c0-b48d1c47cbc4",SeqNo=10,TabLevel=0,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="1fec93db-cd16-fde1-b4d5-b723b995b0b2",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_ColorSchema="1fec93db-cd16-fde1-b4d5-b723b995b0b2";

@XendraTrl(Identifier="b683b16f-4e65-7222-5a9e-d119f4f5e71a")
public static String es_PE_TABLE_PA_ColorSchema_Name="Esquema de Color ";

@XendraTable(Name="Color Schema",AD_Package_ID="34bf6e21-8c70-8fb9-604c-a300eb925459",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="Performance Color Schema",Help="",
TableName="PA_ColorSchema",AccessLevel="6",AD_Window_ID="01ccb45d-46e4-2670-a5c0-b48d1c47cbc4",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=135,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.performanceanalysis",
Identifier="b683b16f-4e65-7222-5a9e-d119f4f5e71a",Synchronized="2020-03-03 21:39:00.0")
/** TableName=PA_ColorSchema */
public static final String Table_Name="PA_ColorSchema";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"PA_ColorSchema");

protected BigDecimal accessLevel = BigDecimal.valueOf(6);
/** AccessLevel
@return 6 - System - Client 
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
    Table_ID = MTable.getTable_ID("PA_ColorSchema");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_PA_ColorSchema[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Color 1.
@param AD_PrintColor1_ID First color used */
public void setAD_PrintColor1_ID (int AD_PrintColor1_ID)
{
if (AD_PrintColor1_ID < 1) throw new IllegalArgumentException ("AD_PrintColor1_ID is mandatory.");
set_Value (COLUMNNAME_AD_PrintColor1_ID, Integer.valueOf(AD_PrintColor1_ID));
}
/** Get Color 1.
@return First color used */
public int getAD_PrintColor1_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_PrintColor1_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="3f971c73-4362-1c8c-b609-4242c0d8f239")
public static String es_PE_FIELD_ColorSchema_Color_Name="Color 1";

@XendraTrl(Identifier="3f971c73-4362-1c8c-b609-4242c0d8f239")
public static String es_PE_FIELD_ColorSchema_Color_Description="Primer color empleado";

@XendraField(AD_Column_ID="AD_PrintColor1_ID",IsCentrallyMaintained=true,
AD_Tab_ID="1fec93db-cd16-fde1-b4d5-b723b995b0b2",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3f971c73-4362-1c8c-b609-4242c0d8f239")
public static final String FIELDNAME_ColorSchema_Color="3f971c73-4362-1c8c-b609-4242c0d8f239";

@XendraTrl(Identifier="5d092102-8ed0-45d6-3bd5-ccdbe10f43a0")
public static String es_PE_COLUMN_AD_PrintColor1_ID_Name="Color 1";

@XendraColumn(AD_Element_ID="24232da6-1ce7-75e1-9662-b57292485903",ColumnName="AD_PrintColor1_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="a7e43a27-3ce0-e9aa-8f3c-78e2921fc1cd",AD_Val_Rule_ID="",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="5d092102-8ed0-45d6-3bd5-ccdbe10f43a0",Synchronized="2019-08-30 22:23:36.0")
/** Column name AD_PrintColor1_ID */
public static final String COLUMNNAME_AD_PrintColor1_ID = "AD_PrintColor1_ID";
/** Set Color 2.
@param AD_PrintColor2_ID Second color used */
public void setAD_PrintColor2_ID (int AD_PrintColor2_ID)
{
if (AD_PrintColor2_ID < 1) throw new IllegalArgumentException ("AD_PrintColor2_ID is mandatory.");
set_Value (COLUMNNAME_AD_PrintColor2_ID, Integer.valueOf(AD_PrintColor2_ID));
}
/** Get Color 2.
@return Second color used */
public int getAD_PrintColor2_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_PrintColor2_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="0af5475a-51da-c9e8-0861-efe5801df76c")
public static String es_PE_FIELD_ColorSchema_Color22_Name="Color 2";

@XendraTrl(Identifier="0af5475a-51da-c9e8-0861-efe5801df76c")
public static String es_PE_FIELD_ColorSchema_Color22_Description="Segundo color empleado";

@XendraField(AD_Column_ID="AD_PrintColor2_ID",IsCentrallyMaintained=true,
AD_Tab_ID="1fec93db-cd16-fde1-b4d5-b723b995b0b2",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0af5475a-51da-c9e8-0861-efe5801df76c")
public static final String FIELDNAME_ColorSchema_Color22="0af5475a-51da-c9e8-0861-efe5801df76c";

@XendraTrl(Identifier="b9173b56-3eec-f46f-0c87-96c6ca112295")
public static String es_PE_COLUMN_AD_PrintColor2_ID_Name="Color 2";

@XendraColumn(AD_Element_ID="884cbded-3214-5571-f072-2cad6175d9c4",ColumnName="AD_PrintColor2_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="a7e43a27-3ce0-e9aa-8f3c-78e2921fc1cd",AD_Val_Rule_ID="",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="b9173b56-3eec-f46f-0c87-96c6ca112295",Synchronized="2019-08-30 22:23:36.0")
/** Column name AD_PrintColor2_ID */
public static final String COLUMNNAME_AD_PrintColor2_ID = "AD_PrintColor2_ID";
/** Set Color 3.
@param AD_PrintColor3_ID Third color used */
public void setAD_PrintColor3_ID (int AD_PrintColor3_ID)
{
if (AD_PrintColor3_ID <= 0) set_Value (COLUMNNAME_AD_PrintColor3_ID, null);
 else 
set_Value (COLUMNNAME_AD_PrintColor3_ID, Integer.valueOf(AD_PrintColor3_ID));
}
/** Get Color 3.
@return Third color used */
public int getAD_PrintColor3_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_PrintColor3_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="b3f0fee4-02bc-1fd5-c879-bb03302214ae")
public static String es_PE_FIELD_ColorSchema_Color33_Name="Color 3";

@XendraTrl(Identifier="b3f0fee4-02bc-1fd5-c879-bb03302214ae")
public static String es_PE_FIELD_ColorSchema_Color33_Description="Tercer color empleado";

@XendraField(AD_Column_ID="AD_PrintColor3_ID",IsCentrallyMaintained=true,
AD_Tab_ID="1fec93db-cd16-fde1-b4d5-b723b995b0b2",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b3f0fee4-02bc-1fd5-c879-bb03302214ae")
public static final String FIELDNAME_ColorSchema_Color33="b3f0fee4-02bc-1fd5-c879-bb03302214ae";

@XendraTrl(Identifier="a70527b0-c604-7273-31d5-b1a7237ddd07")
public static String es_PE_COLUMN_AD_PrintColor3_ID_Name="Color 3";

@XendraColumn(AD_Element_ID="858bbe37-8301-8c18-3a2c-3f8dcaae45fe",ColumnName="AD_PrintColor3_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="a7e43a27-3ce0-e9aa-8f3c-78e2921fc1cd",AD_Val_Rule_ID="",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="a70527b0-c604-7273-31d5-b1a7237ddd07",Synchronized="2019-08-30 22:23:36.0")
/** Column name AD_PrintColor3_ID */
public static final String COLUMNNAME_AD_PrintColor3_ID = "AD_PrintColor3_ID";
/** Set Color 4.
@param AD_PrintColor4_ID Forth color used */
public void setAD_PrintColor4_ID (int AD_PrintColor4_ID)
{
if (AD_PrintColor4_ID <= 0) set_Value (COLUMNNAME_AD_PrintColor4_ID, null);
 else 
set_Value (COLUMNNAME_AD_PrintColor4_ID, Integer.valueOf(AD_PrintColor4_ID));
}
/** Get Color 4.
@return Forth color used */
public int getAD_PrintColor4_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_PrintColor4_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="9e1911d2-a34f-cb45-3244-109a8159d54a")
public static String es_PE_FIELD_ColorSchema_Color44_Name="Color 4";

@XendraTrl(Identifier="9e1911d2-a34f-cb45-3244-109a8159d54a")
public static String es_PE_FIELD_ColorSchema_Color44_Description="Cuarto  color empleado";

@XendraField(AD_Column_ID="AD_PrintColor4_ID",IsCentrallyMaintained=true,
AD_Tab_ID="1fec93db-cd16-fde1-b4d5-b723b995b0b2",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=130,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9e1911d2-a34f-cb45-3244-109a8159d54a")
public static final String FIELDNAME_ColorSchema_Color44="9e1911d2-a34f-cb45-3244-109a8159d54a";

@XendraTrl(Identifier="45d370ba-b21f-e79e-1b89-fb6bc46725e1")
public static String es_PE_COLUMN_AD_PrintColor4_ID_Name="Color 4";

@XendraColumn(AD_Element_ID="cf8a3aca-32e3-18c2-8b44-19be55158660",ColumnName="AD_PrintColor4_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="a7e43a27-3ce0-e9aa-8f3c-78e2921fc1cd",AD_Val_Rule_ID="",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="45d370ba-b21f-e79e-1b89-fb6bc46725e1",Synchronized="2019-08-30 22:23:36.0")
/** Column name AD_PrintColor4_ID */
public static final String COLUMNNAME_AD_PrintColor4_ID = "AD_PrintColor4_ID";
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

@XendraTrl(Identifier="31da9f21-fa06-3dd2-64a3-ce236c662b69")
public static String es_PE_FIELD_ColorSchema_Description_Name="Observación";

@XendraTrl(Identifier="31da9f21-fa06-3dd2-64a3-ce236c662b69")
public static String es_PE_FIELD_ColorSchema_Description_Description="Observación corta opcional del registro";

@XendraTrl(Identifier="31da9f21-fa06-3dd2-64a3-ce236c662b69")
public static String es_PE_FIELD_ColorSchema_Description_Help="Una Observación esta limitada a 255 caracteres";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="1fec93db-cd16-fde1-b4d5-b723b995b0b2",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=255,IsReadOnly=false,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="31da9f21-fa06-3dd2-64a3-ce236c662b69")
public static final String FIELDNAME_ColorSchema_Description="31da9f21-fa06-3dd2-64a3-ce236c662b69";

@XendraTrl(Identifier="3778a3fb-b8f4-738c-a2d0-dd4cbec78886")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3778a3fb-b8f4-738c-a2d0-dd4cbec78886",
Synchronized="2019-08-30 22:23:36.0")
/** Column name Description */
public static final String COLUMNNAME_Description = "Description";
/** Set Entity Type.
@param EntityType Dictionary Entity Type: Determines ownership and synchronization */
public void setEntityType (String EntityType)
{
if (EntityType.length() > 4)
{
log.warning("Length > 4 - truncated");
EntityType = EntityType.substring(0,3);
}
set_Value (COLUMNNAME_EntityType, EntityType);
}
/** Get Entity Type.
@return Dictionary Entity Type: Determines ownership and synchronization */
public String getEntityType() 
{
return (String)get_Value(COLUMNNAME_EntityType);
}

@XendraTrl(Identifier="7543f098-c435-9e3a-d167-325928637f9a")
public static String es_PE_FIELD_ColorSchema_EntityType_Name="Tipo de Entidad";

@XendraTrl(Identifier="7543f098-c435-9e3a-d167-325928637f9a")
public static String es_PE_FIELD_ColorSchema_EntityType_Description="Tipo de Entidad Diccionario; determina propiedad y sincronización";

@XendraTrl(Identifier="7543f098-c435-9e3a-d167-325928637f9a")
public static String es_PE_FIELD_ColorSchema_EntityType_Help="Los tipos de entidad \"Diccionario\"; \"Adempiere\"; y \"Aplicación\" podrían ser automáticamente sincronizados y las personalizaciones eliminadas ó sobreescritas";

@XendraField(AD_Column_ID="EntityType",IsCentrallyMaintained=true,
AD_Tab_ID="1fec93db-cd16-fde1-b4d5-b723b995b0b2",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=4,IsReadOnly=false,SeqNo=140,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7543f098-c435-9e3a-d167-325928637f9a")
public static final String FIELDNAME_ColorSchema_EntityType="7543f098-c435-9e3a-d167-325928637f9a";

@XendraTrl(Identifier="245e7fd3-a919-4565-67be-a62579efac91")
public static String es_PE_COLUMN_EntityType_Name="Tipo de Entidad";

@XendraColumn(AD_Element_ID="5ba917bf-871c-6f19-aa50-962adc5de558",ColumnName="EntityType",
AD_Reference_ID=18,AD_Reference_Value_ID="fae4ad31-8ff1-5d5c-8d47-2426c541cd74",AD_Val_Rule_ID="",
FieldLength=4,DefaultValue="U",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="@EntityType@=D",IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="",VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="245e7fd3-a919-4565-67be-a62579efac91",Synchronized="2019-08-30 22:23:36.0")
/** Column name EntityType */
public static final String COLUMNNAME_EntityType = "EntityType";
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
@XendraTrl(Identifier="3c5e0caf-0210-48e6-ab65-205212b2e0c0")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3c5e0caf-0210-48e6-ab65-205212b2e0c0",
Synchronized="2019-08-30 22:23:36.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Mark 1 Percent.
@param Mark1Percent Percentage up to this color is used */
public void setMark1Percent (int Mark1Percent)
{
set_Value (COLUMNNAME_Mark1Percent, Integer.valueOf(Mark1Percent));
}
/** Get Mark 1 Percent.
@return Percentage up to this color is used */
public int getMark1Percent() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_Mark1Percent);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="cfc365fa-a8c5-a46a-25de-2e6ff20079a6")
public static String es_PE_FIELD_ColorSchema_Mark1Percent_Name="Porcentaje Marca 1";

@XendraTrl(Identifier="cfc365fa-a8c5-a46a-25de-2e6ff20079a6")
public static String es_PE_FIELD_ColorSchema_Mark1Percent_Description="Porcentaje máximo de este color";

@XendraTrl(Identifier="cfc365fa-a8c5-a46a-25de-2e6ff20079a6")
public static String es_PE_FIELD_ColorSchema_Mark1Percent_Help="Ejemplo 50 - ej. debajo del 50% se utiliza este color.";

@XendraField(AD_Column_ID="Mark1Percent",IsCentrallyMaintained=true,
AD_Tab_ID="1fec93db-cd16-fde1-b4d5-b723b995b0b2",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="cfc365fa-a8c5-a46a-25de-2e6ff20079a6")
public static final String FIELDNAME_ColorSchema_Mark1Percent="cfc365fa-a8c5-a46a-25de-2e6ff20079a6";

@XendraTrl(Identifier="9e95d2fa-726a-f5d6-48b0-b57a844ef92e")
public static String es_PE_COLUMN_Mark1Percent_Name="Porcentaje Marca 1";

@XendraColumn(AD_Element_ID="a63d850c-5649-2b57-12e0-9a0056122fe2",ColumnName="Mark1Percent",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9e95d2fa-726a-f5d6-48b0-b57a844ef92e",
Synchronized="2019-08-30 22:23:36.0")
/** Column name Mark1Percent */
public static final String COLUMNNAME_Mark1Percent = "Mark1Percent";
/** Set Mark 2 Percent.
@param Mark2Percent Percentage up to this color is used */
public void setMark2Percent (int Mark2Percent)
{
set_Value (COLUMNNAME_Mark2Percent, Integer.valueOf(Mark2Percent));
}
/** Get Mark 2 Percent.
@return Percentage up to this color is used */
public int getMark2Percent() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_Mark2Percent);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="76eea616-3e5d-1afd-5ec7-04285f0ef856")
public static String es_PE_FIELD_ColorSchema_Mark2Percent_Name="Porcentaje Marca 2 ";

@XendraTrl(Identifier="76eea616-3e5d-1afd-5ec7-04285f0ef856")
public static String es_PE_FIELD_ColorSchema_Mark2Percent_Description="Porcentaje máximo de este color";

@XendraTrl(Identifier="76eea616-3e5d-1afd-5ec7-04285f0ef856")
public static String es_PE_FIELD_ColorSchema_Mark2Percent_Help="Ejemplo 80 - ej Si Marca 1 es 50  - se emplea este color entre 50% y 80%.";

@XendraField(AD_Column_ID="Mark2Percent",IsCentrallyMaintained=true,
AD_Tab_ID="1fec93db-cd16-fde1-b4d5-b723b995b0b2",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="76eea616-3e5d-1afd-5ec7-04285f0ef856")
public static final String FIELDNAME_ColorSchema_Mark2Percent="76eea616-3e5d-1afd-5ec7-04285f0ef856";

@XendraTrl(Identifier="0ba32aee-c052-00ea-c1f1-23cf60f23990")
public static String es_PE_COLUMN_Mark2Percent_Name="Porcentaje Marca 2 ";

@XendraColumn(AD_Element_ID="5e9419e1-9514-4996-02ac-05c5f4efed49",ColumnName="Mark2Percent",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0ba32aee-c052-00ea-c1f1-23cf60f23990",
Synchronized="2019-08-30 22:23:36.0")
/** Column name Mark2Percent */
public static final String COLUMNNAME_Mark2Percent = "Mark2Percent";
/** Set Mark 3 Percent.
@param Mark3Percent Percentage up to this color is used */
public void setMark3Percent (int Mark3Percent)
{
set_Value (COLUMNNAME_Mark3Percent, Integer.valueOf(Mark3Percent));
}
/** Get Mark 3 Percent.
@return Percentage up to this color is used */
public int getMark3Percent() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_Mark3Percent);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="d9803e27-17cf-9ce5-952c-27adb8270c6f")
public static String es_PE_FIELD_ColorSchema_Mark3Percent_Name="Porcentaje Marca 3";

@XendraTrl(Identifier="d9803e27-17cf-9ce5-952c-27adb8270c6f")
public static String es_PE_FIELD_ColorSchema_Mark3Percent_Description="Porcentaje máximo de este color";

@XendraTrl(Identifier="d9803e27-17cf-9ce5-952c-27adb8270c6f")
public static String es_PE_FIELD_ColorSchema_Mark3Percent_Help="Ejemplo 100 - ej. Si Marca 2 es 80 - este color es empleado entre 80% y 100%.";

@XendraField(AD_Column_ID="Mark3Percent",IsCentrallyMaintained=true,
AD_Tab_ID="1fec93db-cd16-fde1-b4d5-b723b995b0b2",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d9803e27-17cf-9ce5-952c-27adb8270c6f")
public static final String FIELDNAME_ColorSchema_Mark3Percent="d9803e27-17cf-9ce5-952c-27adb8270c6f";

@XendraTrl(Identifier="0cef3bbb-b2ff-047a-a1dd-088f78444f6f")
public static String es_PE_COLUMN_Mark3Percent_Name="Porcentaje Marca 3";

@XendraColumn(AD_Element_ID="b347c2ff-f5c0-fa22-83a6-f42aef79cba5",ColumnName="Mark3Percent",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0cef3bbb-b2ff-047a-a1dd-088f78444f6f",
Synchronized="2019-08-30 22:23:36.0")
/** Column name Mark3Percent */
public static final String COLUMNNAME_Mark3Percent = "Mark3Percent";
/** Set Mark 4 Percent.
@param Mark4Percent Percentage up to this color is used */
public void setMark4Percent (int Mark4Percent)
{
set_Value (COLUMNNAME_Mark4Percent, Integer.valueOf(Mark4Percent));
}
/** Get Mark 4 Percent.
@return Percentage up to this color is used */
public int getMark4Percent() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_Mark4Percent);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="65b4974e-0e66-b3fa-8a3f-469082471d2d")
public static String es_PE_FIELD_ColorSchema_Mark4Percent_Name="Porcentaje Marca 4";

@XendraTrl(Identifier="65b4974e-0e66-b3fa-8a3f-469082471d2d")
public static String es_PE_FIELD_ColorSchema_Mark4Percent_Description="Porcentaje máximo de este color";

@XendraTrl(Identifier="65b4974e-0e66-b3fa-8a3f-469082471d2d")
public static String es_PE_FIELD_ColorSchema_Mark4Percent_Help="Ejemplo 9999 - ej Si Marca 3 es 100 - este color es empleado por arriba de 100%.";

@XendraField(AD_Column_ID="Mark4Percent",IsCentrallyMaintained=true,
AD_Tab_ID="1fec93db-cd16-fde1-b4d5-b723b995b0b2",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=120,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="65b4974e-0e66-b3fa-8a3f-469082471d2d")
public static final String FIELDNAME_ColorSchema_Mark4Percent="65b4974e-0e66-b3fa-8a3f-469082471d2d";

@XendraTrl(Identifier="d6ff4823-6db9-6fa4-e026-ae6194cd5b92")
public static String es_PE_COLUMN_Mark4Percent_Name="Porcentaje Marca 4";

@XendraColumn(AD_Element_ID="069cd155-15a9-3402-c58c-672bab7ef021",ColumnName="Mark4Percent",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d6ff4823-6db9-6fa4-e026-ae6194cd5b92",
Synchronized="2019-08-30 22:23:36.0")
/** Column name Mark4Percent */
public static final String COLUMNNAME_Mark4Percent = "Mark4Percent";
/** Set Name.
@param Name Alphanumeric identifier of the entity */
public void setName (String Name)
{
if (Name == null) throw new IllegalArgumentException ("Name is mandatory.");
if (Name.length() > 120)
{
log.warning("Length > 120 - truncated");
Name = Name.substring(0,119);
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

@XendraTrl(Identifier="6d8649f8-cb31-03cf-4a0a-92fb8e593f4f")
public static String es_PE_FIELD_ColorSchema_Name_Name="Nombre";

@XendraTrl(Identifier="6d8649f8-cb31-03cf-4a0a-92fb8e593f4f")
public static String es_PE_FIELD_ColorSchema_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="6d8649f8-cb31-03cf-4a0a-92fb8e593f4f")
public static String es_PE_FIELD_ColorSchema_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraField(AD_Column_ID="Name",IsCentrallyMaintained=true,
AD_Tab_ID="1fec93db-cd16-fde1-b4d5-b723b995b0b2",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=120,IsReadOnly=false,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6d8649f8-cb31-03cf-4a0a-92fb8e593f4f")
public static final String FIELDNAME_ColorSchema_Name="6d8649f8-cb31-03cf-4a0a-92fb8e593f4f";

@XendraTrl(Identifier="ba4d0e1f-ecb0-fa9c-dd8b-b1f17294fa19")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=120,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ba4d0e1f-ecb0-fa9c-dd8b-b1f17294fa19",
Synchronized="2019-08-30 22:23:36.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
/** Set Color Schema.
@param PA_ColorSchema_ID Performance Color Schema */
public void setPA_ColorSchema_ID (int PA_ColorSchema_ID)
{
if (PA_ColorSchema_ID < 1) throw new IllegalArgumentException ("PA_ColorSchema_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_PA_ColorSchema_ID, Integer.valueOf(PA_ColorSchema_ID));
}
/** Get Color Schema.
@return Performance Color Schema */
public int getPA_ColorSchema_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_PA_ColorSchema_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="7ba863f6-c688-0849-2d55-6f2e76e1854d")
public static String es_PE_FIELD_ColorSchema_ColorSchema_Name="Esquema de Color ";

@XendraTrl(Identifier="7ba863f6-c688-0849-2d55-6f2e76e1854d")
public static String es_PE_FIELD_ColorSchema_ColorSchema_Description="Desempeño Esquema de Colores";

@XendraTrl(Identifier="7ba863f6-c688-0849-2d55-6f2e76e1854d")
public static String es_PE_FIELD_ColorSchema_ColorSchema_Help="Representación visual del Desempeño mediante colores.  El esquema frrecuentemente tiene 3 niveles (ej. rojo-amarillo-verde).  Adempiere soporta dos niveles (ej. rojo-verde) o cuatro noveles (ej. gris-bronce-plata-oro).  Note que una Meta sin Medida es representada en Blanco.  El  porcentaje puede ser entre 0 y  sin limite  (ej. sobre 100%).";

@XendraField(AD_Column_ID="PA_ColorSchema_ID",IsCentrallyMaintained=true,
AD_Tab_ID="1fec93db-cd16-fde1-b4d5-b723b995b0b2",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7ba863f6-c688-0849-2d55-6f2e76e1854d")
public static final String FIELDNAME_ColorSchema_ColorSchema="7ba863f6-c688-0849-2d55-6f2e76e1854d";
/** Column name PA_ColorSchema_ID */
public static final String COLUMNNAME_PA_ColorSchema_ID = "PA_ColorSchema_ID";
}
