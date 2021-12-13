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
/** Generated Model for C_ServiceLevelLine
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_C_ServiceLevelLine extends PO
{
/** Standard Constructor
@param ctx context
@param C_ServiceLevelLine_ID id
@param trxName transaction
*/
public X_C_ServiceLevelLine (Properties ctx, int C_ServiceLevelLine_ID, String trxName)
{
super (ctx, C_ServiceLevelLine_ID, trxName);
/** if (C_ServiceLevelLine_ID == 0)
{
setC_ServiceLevel_ID (0);
setC_ServiceLevelLine_ID (0);
setServiceDate (new Timestamp(System.currentTimeMillis()));
setServiceLevelProvided (Env.ZERO);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_C_ServiceLevelLine (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=338 */
public static int Table_ID=MTable.getTable_ID("C_ServiceLevelLine");

@XendraTrl(Identifier="523e3082-484d-4431-736c-bd130bd6994c")
public static String es_PE_TAB_ServiceLevelLine_Description="Mantener nivel de servicio";

@XendraTrl(Identifier="523e3082-484d-4431-736c-bd130bd6994c")
public static String es_PE_TAB_ServiceLevelLine_Help="Adicionar nuevs Ìtems de nivel de servicio para cambiar el Total reconocido.";

@XendraTrl(Identifier="523e3082-484d-4431-736c-bd130bd6994c")
public static String es_PE_TAB_ServiceLevelLine_Name="Ìtem del Nivel de Servicios";

@XendraTab(Name="Service Level Line",Description="Maintain Service Levels",
Help="Add new service level lines to change the recognized amount",
AD_Window_ID="ada6f57e-aa4d-9c4f-7f16-8f7ec312ac8b",SeqNo=20,TabLevel=1,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="523e3082-484d-4431-736c-bd130bd6994c",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_ServiceLevelLine="523e3082-484d-4431-736c-bd130bd6994c";

@XendraTrl(Identifier="56c72b33-0484-fc0c-77af-8ee6dad8a1ce")
public static String es_PE_TABLE_C_ServiceLevelLine_Name="Línea del Nivel de Servicio";


@XendraTable(Name="Service Level Line",AD_Package_ID="98af94a4-a4cd-bdc0-5651-5880caf79899",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",
Description="Product Revenue Recognition Service Level Line",Help="",
TableName="C_ServiceLevelLine",AccessLevel="1",AD_Window_ID="ada6f57e-aa4d-9c4f-7f16-8f7ec312ac8b",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=145,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.commercial",
Identifier="56c72b33-0484-fc0c-77af-8ee6dad8a1ce",Synchronized="2020-03-03 21:37:40.0")
/** TableName=C_ServiceLevelLine */
public static final String Table_Name="C_ServiceLevelLine";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"C_ServiceLevelLine");

protected BigDecimal accessLevel = BigDecimal.valueOf(1);
/** AccessLevel
@return 1 - Org 
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
    Table_ID = MTable.getTable_ID("C_ServiceLevelLine");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_C_ServiceLevelLine[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Service Level.
@param C_ServiceLevel_ID Product Revenue Recognition Service Level  */
public void setC_ServiceLevel_ID (int C_ServiceLevel_ID)
{
if (C_ServiceLevel_ID < 1) throw new IllegalArgumentException ("C_ServiceLevel_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_ServiceLevel_ID, Integer.valueOf(C_ServiceLevel_ID));
}
/** Get Service Level.
@return Product Revenue Recognition Service Level  */
public int getC_ServiceLevel_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_ServiceLevel_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="17e12aaa-ae8a-95e7-2f79-ac4c399ecac1")
public static String es_PE_FIELD_ServiceLevelLine_ServiceLevel_Name="Nivel de Servicio";

@XendraTrl(Identifier="17e12aaa-ae8a-95e7-2f79-ac4c399ecac1")
public static String es_PE_FIELD_ServiceLevelLine_ServiceLevel_Description="Reconocimiento de ingresos basados en el nivel de servicio.";

@XendraTrl(Identifier="17e12aaa-ae8a-95e7-2f79-ac4c399ecac1")
public static String es_PE_FIELD_ServiceLevelLine_ServiceLevel_Help="El nivel de servicio define un nivel de servicio único.";

@XendraField(AD_Column_ID="C_ServiceLevel_ID",IsCentrallyMaintained=true,
AD_Tab_ID="523e3082-484d-4431-736c-bd130bd6994c",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="17e12aaa-ae8a-95e7-2f79-ac4c399ecac1")
public static final String FIELDNAME_ServiceLevelLine_ServiceLevel="17e12aaa-ae8a-95e7-2f79-ac4c399ecac1";

@XendraTrl(Identifier="57efacce-ceff-0c42-50ba-e178ea72c3d2")
public static String es_PE_COLUMN_C_ServiceLevel_ID_Name="Nivel de Servicio";

@XendraColumn(AD_Element_ID="a83e96ca-a382-d411-e6b0-06b0cb4f1676",ColumnName="C_ServiceLevel_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="57efacce-ceff-0c42-50ba-e178ea72c3d2",
Synchronized="2019-08-30 22:22:17.0")
/** Column name C_ServiceLevel_ID */
public static final String COLUMNNAME_C_ServiceLevel_ID = "C_ServiceLevel_ID";
/** Set Service Level Line.
@param C_ServiceLevelLine_ID Product Revenue Recognition Service Level Line */
public void setC_ServiceLevelLine_ID (int C_ServiceLevelLine_ID)
{
if (C_ServiceLevelLine_ID < 1) throw new IllegalArgumentException ("C_ServiceLevelLine_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_ServiceLevelLine_ID, Integer.valueOf(C_ServiceLevelLine_ID));
}
/** Get Service Level Line.
@return Product Revenue Recognition Service Level Line */
public int getC_ServiceLevelLine_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_ServiceLevelLine_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="b2b10dfc-ed6d-52be-b764-9c6c5450104f")
public static String es_PE_FIELD_ServiceLevelLine_ServiceLevelLine_Name="Item del Nivel de Servicio";

@XendraTrl(Identifier="b2b10dfc-ed6d-52be-b764-9c6c5450104f")
public static String es_PE_FIELD_ServiceLevelLine_ServiceLevelLine_Description="Reconocimiento de Ingresos basado en una instancia del nivel de servicio.";

@XendraTrl(Identifier="b2b10dfc-ed6d-52be-b764-9c6c5450104f")
public static String es_PE_FIELD_ServiceLevelLine_ServiceLevelLine_Help="Indica una instancia única en un nivel de servicio.";

@XendraField(AD_Column_ID="C_ServiceLevelLine_ID",IsCentrallyMaintained=true,
AD_Tab_ID="523e3082-484d-4431-736c-bd130bd6994c",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=10,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b2b10dfc-ed6d-52be-b764-9c6c5450104f")
public static final String FIELDNAME_ServiceLevelLine_ServiceLevelLine="b2b10dfc-ed6d-52be-b764-9c6c5450104f";
/** Column name C_ServiceLevelLine_ID */
public static final String COLUMNNAME_C_ServiceLevelLine_ID = "C_ServiceLevelLine_ID";
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

@XendraTrl(Identifier="6c16206c-c8f7-fd78-a1a9-f34d11a05758")
public static String es_PE_FIELD_ServiceLevelLine_Description_Name="Observación";

@XendraTrl(Identifier="6c16206c-c8f7-fd78-a1a9-f34d11a05758")
public static String es_PE_FIELD_ServiceLevelLine_Description_Description="Observación corta opcional del registro";

@XendraTrl(Identifier="6c16206c-c8f7-fd78-a1a9-f34d11a05758")
public static String es_PE_FIELD_ServiceLevelLine_Description_Help="Una Observación esta limitada a 255 caracteres";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="523e3082-484d-4431-736c-bd130bd6994c",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6c16206c-c8f7-fd78-a1a9-f34d11a05758")
public static final String FIELDNAME_ServiceLevelLine_Description="6c16206c-c8f7-fd78-a1a9-f34d11a05758";

@XendraTrl(Identifier="92a0910a-9341-8dff-b902-73783e608358")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="92a0910a-9341-8dff-b902-73783e608358",
Synchronized="2019-08-30 22:22:17.0")
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
@XendraTrl(Identifier="bcb258eb-6b8d-4feb-aaee-207ec91abe59")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="bcb258eb-6b8d-4feb-aaee-207ec91abe59",
Synchronized="2019-08-30 22:22:17.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Processed.
@param Processed The document has been processed */
public void setProcessed (boolean Processed)
{
set_ValueNoCheck (COLUMNNAME_Processed, Boolean.valueOf(Processed));
}
/** Get Processed.
@return The document has been processed */
public boolean isProcessed() 
{
Object oo = get_Value(COLUMNNAME_Processed);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="964044e0-e3af-0225-b972-418f2746c9a2")
public static String es_PE_FIELD_ServiceLevelLine_Processed_Name="Procesado";

@XendraTrl(Identifier="964044e0-e3af-0225-b972-418f2746c9a2")
public static String es_PE_FIELD_ServiceLevelLine_Processed_Description="El documento ha sido procesado";

@XendraTrl(Identifier="964044e0-e3af-0225-b972-418f2746c9a2")
public static String es_PE_FIELD_ServiceLevelLine_Processed_Help="El cuadro de verificación procesada indica que un documento ha sido procesado";

@XendraField(AD_Column_ID="Processed",IsCentrallyMaintained=true,
AD_Tab_ID="523e3082-484d-4431-736c-bd130bd6994c",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="964044e0-e3af-0225-b972-418f2746c9a2")
public static final String FIELDNAME_ServiceLevelLine_Processed="964044e0-e3af-0225-b972-418f2746c9a2";

@XendraTrl(Identifier="42c0629d-dec2-41c8-700c-f5d5cb27de41")
public static String es_PE_COLUMN_Processed_Name="Procesado";

@XendraColumn(AD_Element_ID="3f7035d2-fa5e-7416-fc0c-e49e43f9e083",ColumnName="Processed",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="42c0629d-dec2-41c8-700c-f5d5cb27de41",
Synchronized="2019-08-30 22:22:17.0")
/** Column name Processed */
public static final String COLUMNNAME_Processed = "Processed";
/** Set Service date.
@param ServiceDate Date service was provided */
public void setServiceDate (Timestamp ServiceDate)
{
if (ServiceDate == null) throw new IllegalArgumentException ("ServiceDate is mandatory.");
set_ValueNoCheck (COLUMNNAME_ServiceDate, ServiceDate);
}
/** Get Service date.
@return Date service was provided */
public Timestamp getServiceDate() 
{
return (Timestamp)get_Value(COLUMNNAME_ServiceDate);
}
/** Get Record ID/ColumnName
@return ID/ColumnName pair
*/public KeyNamePair getKeyNamePair() 
{
return new KeyNamePair(get_ID(), String.valueOf(getServiceDate()));
}

@XendraTrl(Identifier="708a67d0-f83c-5c53-a56d-bccd72f19d5a")
public static String es_PE_FIELD_ServiceLevelLine_ServiceDate_Name="F. Servicio";

@XendraTrl(Identifier="708a67d0-f83c-5c53-a56d-bccd72f19d5a")
public static String es_PE_FIELD_ServiceLevelLine_ServiceDate_Description="Fecha en que el servicio fue proporcionado";

@XendraTrl(Identifier="708a67d0-f83c-5c53-a56d-bccd72f19d5a")
public static String es_PE_FIELD_ServiceLevelLine_ServiceDate_Help="La fecha del servicio indica la fecha en que el servicio fue proveído.";

@XendraField(AD_Column_ID="ServiceDate",IsCentrallyMaintained=true,
AD_Tab_ID="523e3082-484d-4431-736c-bd130bd6994c",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=70,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="708a67d0-f83c-5c53-a56d-bccd72f19d5a")
public static final String FIELDNAME_ServiceLevelLine_ServiceDate="708a67d0-f83c-5c53-a56d-bccd72f19d5a";

@XendraTrl(Identifier="3682a5c0-1350-0ed8-3d29-f0d21a4ad4d4")
public static String es_PE_COLUMN_ServiceDate_Name="F. Servicio";

@XendraColumn(AD_Element_ID="99e6be5a-1737-5ca4-7cf9-74454571eafc",ColumnName="ServiceDate",
AD_Reference_ID=15,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3682a5c0-1350-0ed8-3d29-f0d21a4ad4d4",
Synchronized="2019-08-30 22:22:17.0")
/** Column name ServiceDate */
public static final String COLUMNNAME_ServiceDate = "ServiceDate";
/** Set Quantity Provided.
@param ServiceLevelProvided Quantity of service or product provided */
public void setServiceLevelProvided (BigDecimal ServiceLevelProvided)
{
if (ServiceLevelProvided == null) throw new IllegalArgumentException ("ServiceLevelProvided is mandatory.");
set_ValueNoCheck (COLUMNNAME_ServiceLevelProvided, ServiceLevelProvided);
}
/** Get Quantity Provided.
@return Quantity of service or product provided */
public BigDecimal getServiceLevelProvided() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_ServiceLevelProvided);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="59c0d57c-80e3-7e6b-55d0-473d918092c9")
public static String es_PE_FIELD_ServiceLevelLine_QuantityProvided_Name="Cantidad Entregada";

@XendraTrl(Identifier="59c0d57c-80e3-7e6b-55d0-473d918092c9")
public static String es_PE_FIELD_ServiceLevelLine_QuantityProvided_Description="Cantidad de producto ó servicio proporcionado";

@XendraTrl(Identifier="59c0d57c-80e3-7e6b-55d0-473d918092c9")
public static String es_PE_FIELD_ServiceLevelLine_QuantityProvided_Help="La cantidad proveída indica la cantidad total de un producto ó servicio que ha sido recibido por el cliente";

@XendraField(AD_Column_ID="ServiceLevelProvided",IsCentrallyMaintained=true,
AD_Tab_ID="523e3082-484d-4431-736c-bd130bd6994c",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="59c0d57c-80e3-7e6b-55d0-473d918092c9")
public static final String FIELDNAME_ServiceLevelLine_QuantityProvided="59c0d57c-80e3-7e6b-55d0-473d918092c9";

@XendraTrl(Identifier="c4294285-e0b2-09ad-7c49-f55943874e72")
public static String es_PE_COLUMN_ServiceLevelProvided_Name="Cantidad Entregada";

@XendraColumn(AD_Element_ID="88a9dd3e-64f8-2537-bd81-642e2911c9e2",
ColumnName="ServiceLevelProvided",AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=true,SeqNo=2,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="c4294285-e0b2-09ad-7c49-f55943874e72",Synchronized="2019-08-30 22:22:17.0")
/** Column name ServiceLevelProvided */
public static final String COLUMNNAME_ServiceLevelProvided = "ServiceLevelProvided";
}
