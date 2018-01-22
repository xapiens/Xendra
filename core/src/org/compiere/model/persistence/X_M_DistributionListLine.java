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
/** Generated Model for M_DistributionListLine
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_M_DistributionListLine extends PO
{
/** Standard Constructor
@param ctx context
@param M_DistributionListLine_ID id
@param trxName transaction
*/
public X_M_DistributionListLine (Properties ctx, int M_DistributionListLine_ID, String trxName)
{
super (ctx, M_DistributionListLine_ID, trxName);
/** if (M_DistributionListLine_ID == 0)
{
setC_BPartner_ID (0);
setC_BPartner_Location_ID (0);
setM_DistributionList_ID (0);
setM_DistributionListLine_ID (0);
setMinQty (Env.ZERO);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_M_DistributionListLine (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=665 */
public static int Table_ID=MTable.getTable_ID("M_DistributionListLine");

@XendraTrl(Identifier="e4a1b34e-4de9-e90b-bd58-885164369e5f")
public static String es_PE_TAB_DistributionLine_Description="Línea de la lista de distribución con el socio de negocio y Cantidad/Porcentaje.";

@XendraTrl(Identifier="e4a1b34e-4de9-e90b-bd58-885164369e5f")
public static String es_PE_TAB_DistributionLine_Name="Lineas Distribución";

@XendraTrl(Identifier="e4a1b34e-4de9-e90b-bd58-885164369e5f")
public static String es_PE_TAB_DistributionLine_Help="La distribución se puede basar en cociente, cantidad fija ó ambas. Si el cociente y la cantidad no es 0, se calcula la cantidad basada en el cociente, pero con la cantidad como mínimo.";

@XendraTab(Name="Distribution Line",
Description="Distribution List Line with Business Partner and Quantity/Percentage",
Help="The distribution can be based on Ratio, fixed quantity or both. If the ratio and quantity is not 0, the quantity is calculated based on the ratio, but with the Quantity as a minimum.",
AD_Window_ID="03fdd9ab-3028-a4cb-326c-022a2d5cadfe",SeqNo=20,TabLevel=1,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="e4a1b34e-4de9-e90b-bd58-885164369e5f",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_DistributionLine="e4a1b34e-4de9-e90b-bd58-885164369e5f";

@XendraTrl(Identifier="05751b4c-8e63-3066-b01e-c5e8870a0f20")
public static String es_PE_TABLE_M_DistributionListLine_Name="Línea Lista de Distribución";


@XendraTable(Name="Distribution List Line",
Description="Distribution List Line with Business Partner and Quantity/Percentage",Help="",
TableName="M_DistributionListLine",AccessLevel="3",
AD_Window_ID="03fdd9ab-3028-a4cb-326c-022a2d5cadfe",AD_Val_Rule_ID="",IsKey=1,LoadSeq=140,
IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,IsView=false,
PO_Window_ID="",ID="org.xendra.material",Identifier="05751b4c-8e63-3066-b01e-c5e8870a0f20",
Synchronized="2017-08-16 11:43:10.0")
/** TableName=M_DistributionListLine */
public static final String Table_Name="M_DistributionListLine";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"M_DistributionListLine");

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
    Table_ID = MTable.getTable_ID("M_DistributionListLine");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_M_DistributionListLine[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Business Partner .
@param C_BPartner_ID Identifies a Business Partner */
public void setC_BPartner_ID (int C_BPartner_ID)
{
if (C_BPartner_ID < 1) throw new IllegalArgumentException ("C_BPartner_ID is mandatory.");
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

@XendraTrl(Identifier="99facb44-b0fa-ffee-a51d-22b597d9b69a")
public static String es_PE_FIELD_DistributionLine_BusinessPartner_Description="Identifica un Socio de Negocio";

@XendraTrl(Identifier="99facb44-b0fa-ffee-a51d-22b597d9b69a")
public static String es_PE_FIELD_DistributionLine_BusinessPartner_Help="Un socio de negocio es cualquiera con quien usted realiza transacciones. Este puede incluir Proveedores; Clientes; Empleados ó Vendedores.";

@XendraTrl(Identifier="99facb44-b0fa-ffee-a51d-22b597d9b69a")
public static String es_PE_FIELD_DistributionLine_BusinessPartner_Name="Socio de Negocio";

@XendraField(AD_Column_ID="C_BPartner_ID",IsCentrallyMaintained=true,
AD_Tab_ID="e4a1b34e-4de9-e90b-bd58-885164369e5f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=70,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="99facb44-b0fa-ffee-a51d-22b597d9b69a")
public static final String FIELDNAME_DistributionLine_BusinessPartner="99facb44-b0fa-ffee-a51d-22b597d9b69a";

@XendraTrl(Identifier="2283fe03-f0a6-af80-4190-f591a3f10510")
public static String es_PE_COLUMN_C_BPartner_ID_Name="Socio de Negocio";

@XendraColumn(AD_Element_ID="fe333dc3-4f40-1276-5f6a-d09bb66dc423",ColumnName="C_BPartner_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="06fdbbe9-e1c4-3ee4-4a9d-73d1a990cc42",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=true,SeqNo=2,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="2283fe03-f0a6-af80-4190-f591a3f10510",Synchronized="2017-08-05 16:55:05.0")
/** Column name C_BPartner_ID */
public static final String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";
/** Set Partner Location.
@param C_BPartner_Location_ID Identifies the (ship to) address for this Business Partner */
public void setC_BPartner_Location_ID (int C_BPartner_Location_ID)
{
if (C_BPartner_Location_ID < 1) throw new IllegalArgumentException ("C_BPartner_Location_ID is mandatory.");
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

@XendraTrl(Identifier="18854a9b-b021-146d-a20d-25f1f2919d52")
public static String es_PE_FIELD_DistributionLine_PartnerLocation_Description="Identifica la dirección para este socio de negocio";

@XendraTrl(Identifier="18854a9b-b021-146d-a20d-25f1f2919d52")
public static String es_PE_FIELD_DistributionLine_PartnerLocation_Help="La dirección de un socio indica la ubicación de un socio de negocio";

@XendraTrl(Identifier="18854a9b-b021-146d-a20d-25f1f2919d52")
public static String es_PE_FIELD_DistributionLine_PartnerLocation_Name="Dirección del Socio del Negocio";

@XendraField(AD_Column_ID="C_BPartner_Location_ID",IsCentrallyMaintained=true,
AD_Tab_ID="e4a1b34e-4de9-e90b-bd58-885164369e5f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="18854a9b-b021-146d-a20d-25f1f2919d52")
public static final String FIELDNAME_DistributionLine_PartnerLocation="18854a9b-b021-146d-a20d-25f1f2919d52";

@XendraTrl(Identifier="7a44d946-bd4a-2bba-443f-449cf816d4a3")
public static String es_PE_COLUMN_C_BPartner_Location_ID_Name="Dirección del Socio del Negocio";

@XendraColumn(AD_Element_ID="0dab7dc6-2832-26dc-2462-cba2d40235f2",
ColumnName="C_BPartner_Location_ID",AD_Reference_ID=19,AD_Reference_Value_ID="",
AD_Val_Rule_ID="623d98c0-19fc-56a2-f511-8992974d3c05",FieldLength=22,DefaultValue="",IsKey=false,
IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7a44d946-bd4a-2bba-443f-449cf816d4a3",
Synchronized="2017-08-05 16:55:05.0")
/** Column name C_BPartner_Location_ID */
public static final String COLUMNNAME_C_BPartner_Location_ID = "C_BPartner_Location_ID";
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

@XendraTrl(Identifier="4c4b47c8-8938-492a-4707-c2c9bacefa92")
public static String es_PE_FIELD_DistributionLine_Description_Description="Observación corta opcional del registro";

@XendraTrl(Identifier="4c4b47c8-8938-492a-4707-c2c9bacefa92")
public static String es_PE_FIELD_DistributionLine_Description_Help="Una Observación esta limitada a 255 caracteres";

@XendraTrl(Identifier="4c4b47c8-8938-492a-4707-c2c9bacefa92")
public static String es_PE_FIELD_DistributionLine_Description_Name="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="e4a1b34e-4de9-e90b-bd58-885164369e5f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="4c4b47c8-8938-492a-4707-c2c9bacefa92")
public static final String FIELDNAME_DistributionLine_Description="4c4b47c8-8938-492a-4707-c2c9bacefa92";

@XendraTrl(Identifier="9ac1cfaf-e80a-900a-ecd6-0d002aa3ba0c")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9ac1cfaf-e80a-900a-ecd6-0d002aa3ba0c",
Synchronized="2017-08-05 16:55:05.0")
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
@XendraTrl(Identifier="ab2e50d9-d0f2-417f-816b-d2cd728747d7")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ab2e50d9-d0f2-417f-816b-d2cd728747d7",
Synchronized="2017-08-05 16:55:05.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Distribution List.
@param M_DistributionList_ID Distribution Lists allow to distribute products to a selected list of partners */
public void setM_DistributionList_ID (int M_DistributionList_ID)
{
if (M_DistributionList_ID < 1) throw new IllegalArgumentException ("M_DistributionList_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_M_DistributionList_ID, Integer.valueOf(M_DistributionList_ID));
}
/** Get Distribution List.
@return Distribution Lists allow to distribute products to a selected list of partners */
public int getM_DistributionList_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_DistributionList_ID);
if (ii == null) return 0;
return ii.intValue();
}
/** Get Record ID/ColumnName
@return ID/ColumnName pair
*/public KeyNamePair getKeyNamePair() 
{
return new KeyNamePair(get_ID(), String.valueOf(getM_DistributionList_ID()));
}

@XendraTrl(Identifier="3c66f02c-5452-889b-34b7-b6c6d2b7d645")
public static String es_PE_FIELD_DistributionLine_DistributionList_Description="Las listas de distribución permiten para distribuir productos a una lista seleccionada de socios.";

@XendraTrl(Identifier="3c66f02c-5452-889b-34b7-b6c6d2b7d645")
public static String es_PE_FIELD_DistributionLine_DistributionList_Help="La lista de distribución contiene socios de negocio y una cantidad ó un cociente de la distribución para crear órdenes.";

@XendraTrl(Identifier="3c66f02c-5452-889b-34b7-b6c6d2b7d645")
public static String es_PE_FIELD_DistributionLine_DistributionList_Name="Lista de Distribución";

@XendraField(AD_Column_ID="M_DistributionList_ID",IsCentrallyMaintained=true,
AD_Tab_ID="e4a1b34e-4de9-e90b-bd58-885164369e5f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3c66f02c-5452-889b-34b7-b6c6d2b7d645")
public static final String FIELDNAME_DistributionLine_DistributionList="3c66f02c-5452-889b-34b7-b6c6d2b7d645";

@XendraTrl(Identifier="13e03ed5-566f-9f84-1fcd-2cedc81999f8")
public static String es_PE_COLUMN_M_DistributionList_ID_Name="Lista de Distribución";

@XendraColumn(AD_Element_ID="21142264-c420-5fa7-6238-fa3db90a45a8",
ColumnName="M_DistributionList_ID",AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,
IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="13e03ed5-566f-9f84-1fcd-2cedc81999f8",Synchronized="2017-08-05 16:55:05.0")
/** Column name M_DistributionList_ID */
public static final String COLUMNNAME_M_DistributionList_ID = "M_DistributionList_ID";
/** Set Distribution List Line.
@param M_DistributionListLine_ID Distribution List Line with Business Partner and Quantity/Percentage */
public void setM_DistributionListLine_ID (int M_DistributionListLine_ID)
{
if (M_DistributionListLine_ID < 1) throw new IllegalArgumentException ("M_DistributionListLine_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_M_DistributionListLine_ID, Integer.valueOf(M_DistributionListLine_ID));
}
/** Get Distribution List Line.
@return Distribution List Line with Business Partner and Quantity/Percentage */
public int getM_DistributionListLine_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_DistributionListLine_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="49de13a7-018b-3edb-025d-a3b61d244931")
public static String es_PE_FIELD_DistributionLine_DistributionListLine_Description="Item de la lista de distribución con el socio de negocio y Cantidad/Percentaje.";

@XendraTrl(Identifier="49de13a7-018b-3edb-025d-a3b61d244931")
public static String es_PE_FIELD_DistributionLine_DistributionListLine_Help="La distribución se puede basar en cociente, cantidad fija ó ambas. Si el cociente y la cantidad no es 0, se calcula la cantidad basada en el cociente, pero con la cantidad como mínimo.";

@XendraTrl(Identifier="49de13a7-018b-3edb-025d-a3b61d244931")
public static String es_PE_FIELD_DistributionLine_DistributionListLine_Name="Item Lista de Distribución";

@XendraField(AD_Column_ID="M_DistributionListLine_ID",IsCentrallyMaintained=true,
AD_Tab_ID="e4a1b34e-4de9-e90b-bd58-885164369e5f",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=10,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="49de13a7-018b-3edb-025d-a3b61d244931")
public static final String FIELDNAME_DistributionLine_DistributionListLine="49de13a7-018b-3edb-025d-a3b61d244931";
/** Column name M_DistributionListLine_ID */
public static final String COLUMNNAME_M_DistributionListLine_ID = "M_DistributionListLine_ID";
/** Set Minimum Quantity.
@param MinQty Minimum quantity for the business partner */
public void setMinQty (BigDecimal MinQty)
{
if (MinQty == null) throw new IllegalArgumentException ("MinQty is mandatory.");
set_Value (COLUMNNAME_MinQty, MinQty);
}
/** Get Minimum Quantity.
@return Minimum quantity for the business partner */
public BigDecimal getMinQty() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_MinQty);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="2e43be0b-d67e-6bed-6d52-7d977f32cce9")
public static String es_PE_FIELD_DistributionLine_MinimumQuantity_Description="Cantidad mínima para el socio de negocio";

@XendraTrl(Identifier="2e43be0b-d67e-6bed-6d52-7d977f32cce9")
public static String es_PE_FIELD_DistributionLine_MinimumQuantity_Help="Si la cantidad mínima es definida, y la cantidad basada en el porcentaje es más baja, la cantidad mínima es utilizada.";

@XendraTrl(Identifier="2e43be0b-d67e-6bed-6d52-7d977f32cce9")
public static String es_PE_FIELD_DistributionLine_MinimumQuantity_Name="Cantidad Mín";

@XendraField(AD_Column_ID="MinQty",IsCentrallyMaintained=true,
AD_Tab_ID="e4a1b34e-4de9-e90b-bd58-885164369e5f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2e43be0b-d67e-6bed-6d52-7d977f32cce9")
public static final String FIELDNAME_DistributionLine_MinimumQuantity="2e43be0b-d67e-6bed-6d52-7d977f32cce9";

@XendraTrl(Identifier="cf43e661-0579-b442-0a36-b42b0706882d")
public static String es_PE_COLUMN_MinQty_Name="Cantidad Mín";

@XendraColumn(AD_Element_ID="dd9a9570-cfde-d9b6-0ddd-c3a4e58e0e04",ColumnName="MinQty",
AD_Reference_ID=29,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="cf43e661-0579-b442-0a36-b42b0706882d",
Synchronized="2017-08-05 16:55:05.0")
/** Column name MinQty */
public static final String COLUMNNAME_MinQty = "MinQty";
/** Set Ratio.
@param Ratio Relative Ratio for Distributions */
public void setRatio (BigDecimal Ratio)
{
set_Value (COLUMNNAME_Ratio, Ratio);
}
/** Get Ratio.
@return Relative Ratio for Distributions */
public BigDecimal getRatio() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Ratio);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="20cf6109-af1e-a18c-3f8e-10ca8066ec22")
public static String es_PE_FIELD_DistributionLine_Ratio_Description="Relación de cociente para las distribuciones.";

@XendraTrl(Identifier="20cf6109-af1e-a18c-3f8e-10ca8066ec22")
public static String es_PE_FIELD_DistributionLine_Ratio_Help="El peso relativo de una distribución. Si el total de todas los cocientes es 100, es igual que por ciento.";

@XendraTrl(Identifier="20cf6109-af1e-a18c-3f8e-10ca8066ec22")
public static String es_PE_FIELD_DistributionLine_Ratio_Name="Relación";

@XendraField(AD_Column_ID="Ratio",IsCentrallyMaintained=true,
AD_Tab_ID="e4a1b34e-4de9-e90b-bd58-885164369e5f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="20cf6109-af1e-a18c-3f8e-10ca8066ec22")
public static final String FIELDNAME_DistributionLine_Ratio="20cf6109-af1e-a18c-3f8e-10ca8066ec22";

@XendraTrl(Identifier="0d3f7c52-ab36-5e4d-2028-bc6b80901a35")
public static String es_PE_COLUMN_Ratio_Name="Relación";

@XendraColumn(AD_Element_ID="b00bfc42-576b-6582-da4e-015a99db0db4",ColumnName="Ratio",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0d3f7c52-ab36-5e4d-2028-bc6b80901a35",
Synchronized="2017-08-05 16:55:05.0")
/** Column name Ratio */
public static final String COLUMNNAME_Ratio = "Ratio";
}
