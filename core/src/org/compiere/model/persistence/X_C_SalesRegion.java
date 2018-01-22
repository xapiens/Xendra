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
/** Generated Model for C_SalesRegion
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_C_SalesRegion extends PO
{
/** Standard Constructor
@param ctx context
@param C_SalesRegion_ID id
@param trxName transaction
*/
public X_C_SalesRegion (Properties ctx, int C_SalesRegion_ID, String trxName)
{
super (ctx, C_SalesRegion_ID, trxName);
/** if (C_SalesRegion_ID == 0)
{
setC_SalesRegion_ID (0);
setIsDefault (false);	
// N
setIsSummary (false);	
// N
setName (null);
setValue (null);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_C_SalesRegion (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=230 */
public static int Table_ID=MTable.getTable_ID("C_SalesRegion");

@XendraTrl(Identifier="9976f025-73b5-3880-0e4a-a8b5fe81e38c")
public static String es_PE_TAB_SalesRegion_Description="Region de Ventas";

@XendraTrl(Identifier="9976f025-73b5-3880-0e4a-a8b5fe81e38c")
public static String es_PE_TAB_SalesRegion_Name="Region de Ventas";

@XendraTrl(Identifier="9976f025-73b5-3880-0e4a-a8b5fe81e38c")
public static String es_PE_TAB_SalesRegion_Help="La pestaña de Región de Ventas define las diferentes regiones donde se conducen negocios. Regiones de ventas pueden ser usadas cuando se generan Informes ó se calculan comisiones.";

@XendraTab(Name="Sales Region",Description="Sales Region",
Help="The Sales Region Tab defines the different regions where you do business.  Sales Regions can be used when generating reports or calculating commissions.",
AD_Window_ID="7d669032-8adb-e620-9961-f4730cab7f5d",SeqNo=10,TabLevel=0,IsSingleRow=true,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=true,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="9976f025-73b5-3880-0e4a-a8b5fe81e38c",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_SalesRegion="9976f025-73b5-3880-0e4a-a8b5fe81e38c";

@XendraTrl(Identifier="41f7806d-892c-7a5e-6f7f-7c0fae0cbfd0")
public static String es_PE_TAB_SalesRegionDimension_Description="Mantenga la dimensión del árbol de la contabilidad de la región de las ventas.";

@XendraTrl(Identifier="41f7806d-892c-7a5e-6f7f-7c0fae0cbfd0")
public static String es_PE_TAB_SalesRegionDimension_Name="Dimensión Región de Ventas";

@XendraTrl(Identifier="41f7806d-892c-7a5e-6f7f-7c0fae0cbfd0")
public static String es_PE_TAB_SalesRegionDimension_Help="¡Observe por favor que usted no podrá crear entidades nuevas en esta ventana si usted no tiene defecto fijado para todos los valores obligatorios!.";

@XendraTab(Name="Sales Region Dimension",
Description="Maintain Sales Region Accounting Dimension Tree",
Help="Please note that you will not be able to create new entities in this window if you have not default set for all mandatory values! ",
AD_Window_ID="6d82a0ab-8b9a-fa56-aec1-277a04b274a1",SeqNo=20,TabLevel=0,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=true,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="41f7806d-892c-7a5e-6f7f-7c0fae0cbfd0",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_SalesRegionDimension="41f7806d-892c-7a5e-6f7f-7c0fae0cbfd0";

@XendraTrl(Identifier="7c0da3f1-ffb9-c267-f6a2-f14b49fb34ff")
public static String es_PE_TABLE_C_SalesRegion_Name="Región de Ventas";

@XendraTable(Name="Sales Region",Description="Sales coverage region",Help="",
TableName="C_SalesRegion",AccessLevel="3",AD_Window_ID="7d669032-8adb-e620-9961-f4730cab7f5d",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=70,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.commercial",
Identifier="7c0da3f1-ffb9-c267-f6a2-f14b49fb34ff",Synchronized="2017-08-16 11:42:28.0")
/** TableName=C_SalesRegion */
public static final String Table_Name="C_SalesRegion";


@XendraIndex(Name="c_salesregion_value",Identifier="f0547d40-92e0-b878-421f-5a2943eb6e1b",
Column_Names="ad_client_id, value",IsUnique="true",
TableIdentifier="f0547d40-92e0-b878-421f-5a2943eb6e1b",Synchronized="2014-06-01 19:03:58.0")
public static final String INDEXNAME_c_salesregion_value = "f0547d40-92e0-b878-421f-5a2943eb6e1b";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"C_SalesRegion");

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
    Table_ID = MTable.getTable_ID("C_SalesRegion");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_C_SalesRegion[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Sales Region.
@param C_SalesRegion_ID Sales coverage region */
public void setC_SalesRegion_ID (int C_SalesRegion_ID)
{
if (C_SalesRegion_ID < 1) throw new IllegalArgumentException ("C_SalesRegion_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_SalesRegion_ID, Integer.valueOf(C_SalesRegion_ID));
}
/** Get Sales Region.
@return Sales coverage region */
public int getC_SalesRegion_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_SalesRegion_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="e4fdd186-9feb-8f80-82e2-33b4f141ea11")
public static String es_PE_FIELD_SalesRegion_SalesRegion_Description="Región de cobertura de ventas.";

@XendraTrl(Identifier="e4fdd186-9feb-8f80-82e2-33b4f141ea11")
public static String es_PE_FIELD_SalesRegion_SalesRegion_Help="La región de ventas indica una área de cobertura de ventas específica.";

@XendraTrl(Identifier="e4fdd186-9feb-8f80-82e2-33b4f141ea11")
public static String es_PE_FIELD_SalesRegion_SalesRegion_Name="Región de Ventas";

@XendraField(AD_Column_ID="C_SalesRegion_ID",IsCentrallyMaintained=true,
AD_Tab_ID="9976f025-73b5-3880-0e4a-a8b5fe81e38c",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=10,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e4fdd186-9feb-8f80-82e2-33b4f141ea11")
public static final String FIELDNAME_SalesRegion_SalesRegion="e4fdd186-9feb-8f80-82e2-33b4f141ea11";

@XendraTrl(Identifier="1141b9d2-7ea0-4f34-bd38-879fb73aa8d1")
public static String es_PE_FIELD_SalesRegionDimension_SalesRegion_Description="Región de cobertura de ventas.";

@XendraTrl(Identifier="1141b9d2-7ea0-4f34-bd38-879fb73aa8d1")
public static String es_PE_FIELD_SalesRegionDimension_SalesRegion_Help="La región de ventas indica una área de cobertura de ventas específica.";

@XendraTrl(Identifier="1141b9d2-7ea0-4f34-bd38-879fb73aa8d1")
public static String es_PE_FIELD_SalesRegionDimension_SalesRegion_Name="Región de Ventas";

@XendraField(AD_Column_ID="C_SalesRegion_ID",IsCentrallyMaintained=true,
AD_Tab_ID="41f7806d-892c-7a5e-6f7f-7c0fae0cbfd0",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=10,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1141b9d2-7ea0-4f34-bd38-879fb73aa8d1")
public static final String FIELDNAME_SalesRegionDimension_SalesRegion="1141b9d2-7ea0-4f34-bd38-879fb73aa8d1";
/** Column name C_SalesRegion_ID */
public static final String COLUMNNAME_C_SalesRegion_ID = "C_SalesRegion_ID";
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

@XendraTrl(Identifier="3e19456c-eecd-9415-e588-a24083fe303e")
public static String es_PE_FIELD_SalesRegion_Description_Description="Observación";

@XendraTrl(Identifier="3e19456c-eecd-9415-e588-a24083fe303e")
public static String es_PE_FIELD_SalesRegion_Description_Help="Observación";

@XendraTrl(Identifier="3e19456c-eecd-9415-e588-a24083fe303e")
public static String es_PE_FIELD_SalesRegion_Description_Name="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="9976f025-73b5-3880-0e4a-a8b5fe81e38c",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3e19456c-eecd-9415-e588-a24083fe303e")
public static final String FIELDNAME_SalesRegion_Description="3e19456c-eecd-9415-e588-a24083fe303e";

@XendraTrl(Identifier="b83221e2-5384-9cbc-615e-5a1fab387488")
public static String es_PE_FIELD_SalesRegionDimension_Description_Description="Observación";

@XendraTrl(Identifier="b83221e2-5384-9cbc-615e-5a1fab387488")
public static String es_PE_FIELD_SalesRegionDimension_Description_Help="Observación";

@XendraTrl(Identifier="b83221e2-5384-9cbc-615e-5a1fab387488")
public static String es_PE_FIELD_SalesRegionDimension_Description_Name="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="41f7806d-892c-7a5e-6f7f-7c0fae0cbfd0",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b83221e2-5384-9cbc-615e-5a1fab387488")
public static final String FIELDNAME_SalesRegionDimension_Description="b83221e2-5384-9cbc-615e-5a1fab387488";

@XendraTrl(Identifier="689d80cc-5d1a-371d-a0eb-3c9aea285467")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="689d80cc-5d1a-371d-a0eb-3c9aea285467",
Synchronized="2017-08-05 16:54:25.0")
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
@XendraTrl(Identifier="90cc3a3c-93fb-4a9b-8c64-8c300b472255")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="90cc3a3c-93fb-4a9b-8c64-8c300b472255",
Synchronized="2017-08-05 16:54:25.0")
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

@XendraTrl(Identifier="b876b4db-5088-eb0b-63c5-4ed1f7ee601f")
public static String es_PE_FIELD_SalesRegion_Default_Description="Valor Predeterminado";

@XendraTrl(Identifier="b876b4db-5088-eb0b-63c5-4ed1f7ee601f")
public static String es_PE_FIELD_SalesRegion_Default_Help="El cuadro de verificación indica si este registro será usado como un valor predeterminado";

@XendraTrl(Identifier="b876b4db-5088-eb0b-63c5-4ed1f7ee601f")
public static String es_PE_FIELD_SalesRegion_Default_Name="Predeterminado";

@XendraField(AD_Column_ID="IsDefault",IsCentrallyMaintained=true,
AD_Tab_ID="9976f025-73b5-3880-0e4a-a8b5fe81e38c",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b876b4db-5088-eb0b-63c5-4ed1f7ee601f")
public static final String FIELDNAME_SalesRegion_Default="b876b4db-5088-eb0b-63c5-4ed1f7ee601f";

@XendraTrl(Identifier="535930f3-d253-5e98-fc58-217831a06120")
public static String es_PE_FIELD_SalesRegionDimension_Default_Description="Valor Predeterminado";

@XendraTrl(Identifier="535930f3-d253-5e98-fc58-217831a06120")
public static String es_PE_FIELD_SalesRegionDimension_Default_Help="El cuadro de verificación indica si este registro será usado como un valor predeterminado";

@XendraTrl(Identifier="535930f3-d253-5e98-fc58-217831a06120")
public static String es_PE_FIELD_SalesRegionDimension_Default_Name="Predeterminado";

@XendraField(AD_Column_ID="IsDefault",IsCentrallyMaintained=true,
AD_Tab_ID="41f7806d-892c-7a5e-6f7f-7c0fae0cbfd0",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="535930f3-d253-5e98-fc58-217831a06120")
public static final String FIELDNAME_SalesRegionDimension_Default="535930f3-d253-5e98-fc58-217831a06120";

@XendraTrl(Identifier="074e77f7-8358-8c47-17f4-4709e64c065e")
public static String es_PE_COLUMN_IsDefault_Name="Predeterminado";

@XendraColumn(AD_Element_ID="8617f892-e113-a5fd-8715-687f792f136c",ColumnName="IsDefault",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="074e77f7-8358-8c47-17f4-4709e64c065e",
Synchronized="2017-08-05 16:54:25.0")
/** Column name IsDefault */
public static final String COLUMNNAME_IsDefault = "IsDefault";
/** Set Summary Level.
@param IsSummary This is a summary entity */
public void setIsSummary (boolean IsSummary)
{
set_Value (COLUMNNAME_IsSummary, Boolean.valueOf(IsSummary));
}
/** Get Summary Level.
@return This is a summary entity */
public boolean isSummary() 
{
Object oo = get_Value(COLUMNNAME_IsSummary);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="6f5e213f-eb13-fd37-9629-37af8cf83df7")
public static String es_PE_FIELD_SalesRegion_SummaryLevel_Description="Esta es una entidad sumaria";

@XendraTrl(Identifier="6f5e213f-eb13-fd37-9629-37af8cf83df7")
public static String es_PE_FIELD_SalesRegion_SummaryLevel_Help="Una entidad sumaria representa una rama en un árbol mas bien que un nodo final. Las entidades sumarias son usadas para reportar y no tienen valores propios";

@XendraTrl(Identifier="6f5e213f-eb13-fd37-9629-37af8cf83df7")
public static String es_PE_FIELD_SalesRegion_SummaryLevel_Name="Entidad Acumulada";

@XendraField(AD_Column_ID="IsSummary",IsCentrallyMaintained=true,
AD_Tab_ID="9976f025-73b5-3880-0e4a-a8b5fe81e38c",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6f5e213f-eb13-fd37-9629-37af8cf83df7")
public static final String FIELDNAME_SalesRegion_SummaryLevel="6f5e213f-eb13-fd37-9629-37af8cf83df7";

@XendraTrl(Identifier="88477914-28ee-2e24-c0cb-603930c76201")
public static String es_PE_FIELD_SalesRegionDimension_SummaryLevel_Description="Esta es una entidad sumaria";

@XendraTrl(Identifier="88477914-28ee-2e24-c0cb-603930c76201")
public static String es_PE_FIELD_SalesRegionDimension_SummaryLevel_Help="Una entidad sumaria representa una rama en un árbol mas bien que un nodo final. Las entidades sumarias son usadas para reportar y no tienen valores propios";

@XendraTrl(Identifier="88477914-28ee-2e24-c0cb-603930c76201")
public static String es_PE_FIELD_SalesRegionDimension_SummaryLevel_Name="Entidad Acumulada";

@XendraField(AD_Column_ID="IsSummary",IsCentrallyMaintained=true,
AD_Tab_ID="41f7806d-892c-7a5e-6f7f-7c0fae0cbfd0",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="88477914-28ee-2e24-c0cb-603930c76201")
public static final String FIELDNAME_SalesRegionDimension_SummaryLevel="88477914-28ee-2e24-c0cb-603930c76201";

@XendraTrl(Identifier="39d667a7-cacc-ca3c-7720-be39a489c8f1")
public static String es_PE_COLUMN_IsSummary_Name="Entidad Acumulada";

@XendraColumn(AD_Element_ID="0ecd1d56-9e2b-8778-7b05-92730d811ad4",ColumnName="IsSummary",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="39d667a7-cacc-ca3c-7720-be39a489c8f1",
Synchronized="2017-08-05 16:54:26.0")
/** Column name IsSummary */
public static final String COLUMNNAME_IsSummary = "IsSummary";
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

@XendraTrl(Identifier="430e2bf5-11cc-781f-7779-ec0a395875a4")
public static String es_PE_FIELD_SalesRegion_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="430e2bf5-11cc-781f-7779-ec0a395875a4")
public static String es_PE_FIELD_SalesRegion_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraTrl(Identifier="430e2bf5-11cc-781f-7779-ec0a395875a4")
public static String es_PE_FIELD_SalesRegion_Name_Name="Nombre";
@XendraField(AD_Column_ID="Name",
IsCentrallyMaintained=true,AD_Tab_ID="9976f025-73b5-3880-0e4a-a8b5fe81e38c",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=50,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="430e2bf5-11cc-781f-7779-ec0a395875a4")
public static final String FIELDNAME_SalesRegion_Name="430e2bf5-11cc-781f-7779-ec0a395875a4";

@XendraTrl(Identifier="c563f76e-cb56-24d2-7dd2-488948e7b7b4")
public static String es_PE_FIELD_SalesRegionDimension_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="c563f76e-cb56-24d2-7dd2-488948e7b7b4")
public static String es_PE_FIELD_SalesRegionDimension_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraTrl(Identifier="c563f76e-cb56-24d2-7dd2-488948e7b7b4")
public static String es_PE_FIELD_SalesRegionDimension_Name_Name="Nombre";

@XendraField(AD_Column_ID="Name",IsCentrallyMaintained=true,
AD_Tab_ID="41f7806d-892c-7a5e-6f7f-7c0fae0cbfd0",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c563f76e-cb56-24d2-7dd2-488948e7b7b4")
public static final String FIELDNAME_SalesRegionDimension_Name="c563f76e-cb56-24d2-7dd2-488948e7b7b4";

@XendraTrl(Identifier="fd254df9-671b-89ae-0255-db8ba94090cb")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="fd254df9-671b-89ae-0255-db8ba94090cb",
Synchronized="2017-08-05 16:54:26.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";

/** SalesRep_ID AD_Reference=15251147-a1b6-4a83-a3a5-2d3ae7db69d9 */
public static final int SALESREP_ID_AD_Reference_ID=190;
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

@XendraTrl(Identifier="99d687ed-13e0-b396-9ae5-9c65e3c88414")
public static String es_PE_FIELD_SalesRegion_SalesRepresentative_Description="Representante de Ventas";

@XendraTrl(Identifier="99d687ed-13e0-b396-9ae5-9c65e3c88414")
public static String es_PE_FIELD_SalesRegion_SalesRepresentative_Help="El representante de ventas indica el representante de ventas para esta región.";

@XendraTrl(Identifier="99d687ed-13e0-b396-9ae5-9c65e3c88414")
public static String es_PE_FIELD_SalesRegion_SalesRepresentative_Name="Agente Cía";

@XendraField(AD_Column_ID="SalesRep_ID",IsCentrallyMaintained=true,
AD_Tab_ID="9976f025-73b5-3880-0e4a-a8b5fe81e38c",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="99d687ed-13e0-b396-9ae5-9c65e3c88414")
public static final String FIELDNAME_SalesRegion_SalesRepresentative="99d687ed-13e0-b396-9ae5-9c65e3c88414";

@XendraTrl(Identifier="3c0fdedb-fb37-55d8-00d1-c0f2986dfc2c")
public static String es_PE_FIELD_SalesRegionDimension_SalesRepresentative_Description="Representante de Ventas";

@XendraTrl(Identifier="3c0fdedb-fb37-55d8-00d1-c0f2986dfc2c")
public static String es_PE_FIELD_SalesRegionDimension_SalesRepresentative_Help="El representante de ventas indica el representante de ventas para esta región.";

@XendraTrl(Identifier="3c0fdedb-fb37-55d8-00d1-c0f2986dfc2c")
public static String es_PE_FIELD_SalesRegionDimension_SalesRepresentative_Name="Agente Cía";

@XendraField(AD_Column_ID="SalesRep_ID",IsCentrallyMaintained=true,
AD_Tab_ID="41f7806d-892c-7a5e-6f7f-7c0fae0cbfd0",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=20,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3c0fdedb-fb37-55d8-00d1-c0f2986dfc2c")
public static final String FIELDNAME_SalesRegionDimension_SalesRepresentative="3c0fdedb-fb37-55d8-00d1-c0f2986dfc2c";

@XendraTrl(Identifier="d3f5e6a0-eb9d-80cd-0677-bab6a33caa13")
public static String es_PE_COLUMN_SalesRep_ID_Name="Agente Cía";

@XendraColumn(AD_Element_ID="197a9c3a-ff10-c291-d65f-5e05a36d3710",ColumnName="SalesRep_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="15251147-a1b6-4a83-a3a5-2d3ae7db69d9",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="d3f5e6a0-eb9d-80cd-0677-bab6a33caa13",Synchronized="2017-08-05 16:54:26.0")
/** Column name SalesRep_ID */
public static final String COLUMNNAME_SalesRep_ID = "SalesRep_ID";
/** Set Search Key.
@param Value Search key for the record in the format required - must be unique */
public void setValue (String Value)
{
if (Value == null) throw new IllegalArgumentException ("Value is mandatory.");
if (Value.length() > 40)
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
@XendraTrl(Identifier="73d7dcf3-bf26-65d1-1f63-1f6021053783")
public static String es_PE_FIELD_SalesRegion_SearchKey_Description="Clave de búsqueda para el registro en el formato requerido; debe ser única";

@XendraTrl(Identifier="73d7dcf3-bf26-65d1-1f63-1f6021053783")
public static String es_PE_FIELD_SalesRegion_SearchKey_Help="Una clave de búsqueda le permite a usted un método rápido de encontrar un registro en particular";

@XendraTrl(Identifier="73d7dcf3-bf26-65d1-1f63-1f6021053783")
public static String es_PE_FIELD_SalesRegion_SearchKey_Name="Clave de Búsqueda";

@XendraField(AD_Column_ID="Value",IsCentrallyMaintained=true,
AD_Tab_ID="9976f025-73b5-3880-0e4a-a8b5fe81e38c",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=40,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="73d7dcf3-bf26-65d1-1f63-1f6021053783")
public static final String FIELDNAME_SalesRegion_SearchKey="73d7dcf3-bf26-65d1-1f63-1f6021053783";

@XendraTrl(Identifier="3e498354-9eb1-e560-fdf4-1b9cab6a6a69")
public static String es_PE_FIELD_SalesRegionDimension_SearchKey_Description="Clave de búsqueda para el registro en el formato requerido; debe ser única";

@XendraTrl(Identifier="3e498354-9eb1-e560-fdf4-1b9cab6a6a69")
public static String es_PE_FIELD_SalesRegionDimension_SearchKey_Help="Una clave de búsqueda le permite a usted un método rápido de encontrar un registro en particular";

@XendraTrl(Identifier="3e498354-9eb1-e560-fdf4-1b9cab6a6a69")
public static String es_PE_FIELD_SalesRegionDimension_SearchKey_Name="Clave de Búsqueda";

@XendraField(AD_Column_ID="Value",IsCentrallyMaintained=true,
AD_Tab_ID="41f7806d-892c-7a5e-6f7f-7c0fae0cbfd0",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=40,IsReadOnly=false,SeqNo=60,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3e498354-9eb1-e560-fdf4-1b9cab6a6a69")
public static final String FIELDNAME_SalesRegionDimension_SearchKey="3e498354-9eb1-e560-fdf4-1b9cab6a6a69";

@XendraTrl(Identifier="6946f585-4ad7-6620-d0a6-116686400c61")
public static String es_PE_COLUMN_Value_Name="Clave de Búsqueda";

@XendraColumn(AD_Element_ID="e75e100c-9b41-a643-2cb3-46eeced683d8",ColumnName="Value",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6946f585-4ad7-6620-d0a6-116686400c61",
Synchronized="2017-08-05 16:54:26.0")
/** Column name Value */
public static final String COLUMNNAME_Value = "Value";
}
