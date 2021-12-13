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
/** Generated Model for C_ServiceLevel
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_C_ServiceLevel extends PO
{
/** Standard Constructor
@param ctx context
@param C_ServiceLevel_ID id
@param trxName transaction
*/
public X_C_ServiceLevel (Properties ctx, int C_ServiceLevel_ID, String trxName)
{
super (ctx, C_ServiceLevel_ID, trxName);
/** if (C_ServiceLevel_ID == 0)
{
setC_RevenueRecognition_Plan_ID (0);
setC_ServiceLevel_ID (0);
setM_Product_ID (0);
setServiceLevelInvoiced (Env.ZERO);
setServiceLevelProvided (Env.ZERO);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_C_ServiceLevel (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=337 */
public static int Table_ID=MTable.getTable_ID("C_ServiceLevel");

@XendraTrl(Identifier="5805fe9f-d96f-828f-6fa5-92d9720b7cb8")
public static String es_PE_TAB_ServiceLevel_Description="Ver nivel de servicio";

@XendraTrl(Identifier="5805fe9f-d96f-828f-6fa5-92d9720b7cb8")
public static String es_PE_TAB_ServiceLevel_Help="El nivel de servicio es creado automáticamente cuando se crea una factura con productos definidos con reconocimiento de ingresos basado en servicios.";

@XendraTrl(Identifier="5805fe9f-d96f-828f-6fa5-92d9720b7cb8")
public static String es_PE_TAB_ServiceLevel_Name="Nivel de Servicios";

@XendraTab(Name="Service Level",Description="View Service Level",
Help="The service level is automatically created when creating an invoice with products using revenue recognition based on service levels.",
AD_Window_ID="ada6f57e-aa4d-9c4f-7f16-8f7ec312ac8b",SeqNo=10,TabLevel=0,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="5805fe9f-d96f-828f-6fa5-92d9720b7cb8",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_ServiceLevel="5805fe9f-d96f-828f-6fa5-92d9720b7cb8";

@XendraTrl(Identifier="847f1ab7-45cd-ba51-e70e-92aa46255e87")
public static String es_PE_TABLE_C_ServiceLevel_Name="Nivel de Servicio";

@XendraTable(Name="Service Level",AD_Package_ID="98af94a4-a4cd-bdc0-5651-5880caf79899",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",
Description="Product Revenue Recognition Service Level ",Help="",TableName="C_ServiceLevel",
AccessLevel="1",AD_Window_ID="ada6f57e-aa4d-9c4f-7f16-8f7ec312ac8b",AD_Val_Rule_ID="",IsKey=1,
LoadSeq=140,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,
IsView=false,PO_Window_ID="",ID="org.xendra.commercial",
Identifier="847f1ab7-45cd-ba51-e70e-92aa46255e87",Synchronized="2020-03-03 21:37:40.0")
/** TableName=C_ServiceLevel */
public static final String Table_Name="C_ServiceLevel";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"C_ServiceLevel");

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
    Table_ID = MTable.getTable_ID("C_ServiceLevel");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_C_ServiceLevel[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Revenue Recognition Plan.
@param C_RevenueRecognition_Plan_ID Plan for recognizing or recording revenue */
public void setC_RevenueRecognition_Plan_ID (int C_RevenueRecognition_Plan_ID)
{
if (C_RevenueRecognition_Plan_ID < 1) throw new IllegalArgumentException ("C_RevenueRecognition_Plan_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_RevenueRecognition_Plan_ID, Integer.valueOf(C_RevenueRecognition_Plan_ID));
}
/** Get Revenue Recognition Plan.
@return Plan for recognizing or recording revenue */
public int getC_RevenueRecognition_Plan_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_RevenueRecognition_Plan_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="547fded7-7481-080b-1997-6d647c19ec08")
public static String es_PE_FIELD_ServiceLevel_RevenueRecognitionPlan_Name="Plan de Reconocimiento de ingresos";

@XendraTrl(Identifier="547fded7-7481-080b-1997-6d647c19ec08")
public static String es_PE_FIELD_ServiceLevel_RevenueRecognitionPlan_Description="Plan para reconocer ó registrar ingresos";

@XendraTrl(Identifier="547fded7-7481-080b-1997-6d647c19ec08")
public static String es_PE_FIELD_ServiceLevel_RevenueRecognitionPlan_Help="El plan de reconocimiento de Ingresos identifica un plan de reconocimiento de Ingresos único.";

@XendraField(AD_Column_ID="C_RevenueRecognition_Plan_ID",IsCentrallyMaintained=true,
AD_Tab_ID="5805fe9f-d96f-828f-6fa5-92d9720b7cb8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=40,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="547fded7-7481-080b-1997-6d647c19ec08")
public static final String FIELDNAME_ServiceLevel_RevenueRecognitionPlan="547fded7-7481-080b-1997-6d647c19ec08";

@XendraTrl(Identifier="57cb806f-35bd-2999-c7ce-ccd3c0cc9f95")
public static String es_PE_COLUMN_C_RevenueRecognition_Plan_ID_Name="Plan de Reconocimiento de ingresos";

@XendraColumn(AD_Element_ID="586441d3-6d88-48e5-60d3-d0954989d053",
ColumnName="C_RevenueRecognition_Plan_ID",AD_Reference_ID=19,AD_Reference_Value_ID="",
AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,
IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="",VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="57cb806f-35bd-2999-c7ce-ccd3c0cc9f95",Synchronized="2019-08-30 22:22:17.0")
/** Column name C_RevenueRecognition_Plan_ID */
public static final String COLUMNNAME_C_RevenueRecognition_Plan_ID = "C_RevenueRecognition_Plan_ID";
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

@XendraTrl(Identifier="4cd7bf53-c516-db50-cb54-1333e3277984")
public static String es_PE_FIELD_ServiceLevel_ServiceLevel_Name="Nivel de Servicio";

@XendraTrl(Identifier="4cd7bf53-c516-db50-cb54-1333e3277984")
public static String es_PE_FIELD_ServiceLevel_ServiceLevel_Description="Reconocimiento de ingresos basados en el nivel de servicio.";

@XendraTrl(Identifier="4cd7bf53-c516-db50-cb54-1333e3277984")
public static String es_PE_FIELD_ServiceLevel_ServiceLevel_Help="El nivel de servicio define un nivel de servicio único.";

@XendraField(AD_Column_ID="C_ServiceLevel_ID",IsCentrallyMaintained=true,
AD_Tab_ID="5805fe9f-d96f-828f-6fa5-92d9720b7cb8",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=10,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="4cd7bf53-c516-db50-cb54-1333e3277984")
public static final String FIELDNAME_ServiceLevel_ServiceLevel="4cd7bf53-c516-db50-cb54-1333e3277984";
/** Column name C_ServiceLevel_ID */
public static final String COLUMNNAME_C_ServiceLevel_ID = "C_ServiceLevel_ID";
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
/** Get Record ID/ColumnName
@return ID/ColumnName pair
*/public KeyNamePair getKeyNamePair() 
{
return new KeyNamePair(get_ID(), getDescription());
}

@XendraTrl(Identifier="9fcd2c5a-743e-cd89-b813-25fd5f34a2bf")
public static String es_PE_FIELD_ServiceLevel_Description_Name="Observación";

@XendraTrl(Identifier="9fcd2c5a-743e-cd89-b813-25fd5f34a2bf")
public static String es_PE_FIELD_ServiceLevel_Description_Description="Observación corta opcional del registro";

@XendraTrl(Identifier="9fcd2c5a-743e-cd89-b813-25fd5f34a2bf")
public static String es_PE_FIELD_ServiceLevel_Description_Help="Una Observación esta limitada a 255 caracteres";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="5805fe9f-d96f-828f-6fa5-92d9720b7cb8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9fcd2c5a-743e-cd89-b813-25fd5f34a2bf")
public static final String FIELDNAME_ServiceLevel_Description="9fcd2c5a-743e-cd89-b813-25fd5f34a2bf";

@XendraTrl(Identifier="800bfb7c-145f-0d89-ab18-610e8a6333c7")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="800bfb7c-145f-0d89-ab18-610e8a6333c7",
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
@XendraTrl(Identifier="75bc7abb-60c6-472a-b90d-0a6e2ddda6e1")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="75bc7abb-60c6-472a-b90d-0a6e2ddda6e1",
Synchronized="2019-08-30 22:22:17.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Product.
@param M_Product_ID Product, Service, Item */
public void setM_Product_ID (int M_Product_ID)
{
if (M_Product_ID < 1) throw new IllegalArgumentException ("M_Product_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_M_Product_ID, Integer.valueOf(M_Product_ID));
}
/** Get Product.
@return Product, Service, Item */
public int getM_Product_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_Product_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="83803e5b-6594-eda4-68f5-4e9e9179892a")
public static String es_PE_FIELD_ServiceLevel_Product_Name="Producto";

@XendraTrl(Identifier="83803e5b-6594-eda4-68f5-4e9e9179892a")
public static String es_PE_FIELD_ServiceLevel_Product_Description="Producto; servicio ó artículo.";

@XendraTrl(Identifier="83803e5b-6594-eda4-68f5-4e9e9179892a")
public static String es_PE_FIELD_ServiceLevel_Product_Help="Identifica un artículo que puede ser comprado ó vendido es esta organización.";

@XendraField(AD_Column_ID="M_Product_ID",IsCentrallyMaintained=true,
AD_Tab_ID="5805fe9f-d96f-828f-6fa5-92d9720b7cb8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="83803e5b-6594-eda4-68f5-4e9e9179892a")
public static final String FIELDNAME_ServiceLevel_Product="83803e5b-6594-eda4-68f5-4e9e9179892a";

@XendraTrl(Identifier="979fcf68-376d-e783-2992-9b88fc77e9e9")
public static String es_PE_COLUMN_M_Product_ID_Name="Producto";

@XendraColumn(AD_Element_ID="b4701f57-f2fc-567c-58e2-a6aefbc3932c",ColumnName="M_Product_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="4281f8eb-238e-6b28-eb66-8cc866e6312c",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="979fcf68-376d-e783-2992-9b88fc77e9e9",Synchronized="2019-08-30 22:22:17.0")
/** Column name M_Product_ID */
public static final String COLUMNNAME_M_Product_ID = "M_Product_ID";
/** Set Processed.
@param Processed The document has been processed */
public void setProcessed (boolean Processed)
{
set_Value (COLUMNNAME_Processed, Boolean.valueOf(Processed));
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

@XendraTrl(Identifier="ce7a838f-a97c-8244-853d-489a06f93d00")
public static String es_PE_FIELD_ServiceLevel_Processed_Name="Procesado";

@XendraTrl(Identifier="ce7a838f-a97c-8244-853d-489a06f93d00")
public static String es_PE_FIELD_ServiceLevel_Processed_Description="El documento ha sido procesado";

@XendraTrl(Identifier="ce7a838f-a97c-8244-853d-489a06f93d00")
public static String es_PE_FIELD_ServiceLevel_Processed_Help="El cuadro de verificación procesada indica que un documento ha sido procesado";

@XendraField(AD_Column_ID="Processed",IsCentrallyMaintained=true,
AD_Tab_ID="5805fe9f-d96f-828f-6fa5-92d9720b7cb8",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ce7a838f-a97c-8244-853d-489a06f93d00")
public static final String FIELDNAME_ServiceLevel_Processed="ce7a838f-a97c-8244-853d-489a06f93d00";

@XendraTrl(Identifier="f18bedd4-4561-fc28-e5ff-fed5b6c94ad8")
public static String es_PE_COLUMN_Processed_Name="Procesado";

@XendraColumn(AD_Element_ID="3f7035d2-fa5e-7416-fc0c-e49e43f9e083",ColumnName="Processed",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f18bedd4-4561-fc28-e5ff-fed5b6c94ad8",
Synchronized="2019-08-30 22:22:17.0")
/** Column name Processed */
public static final String COLUMNNAME_Processed = "Processed";
/** Set Process Now.
@param Processing Process Now */
public void setProcessing (boolean Processing)
{
set_Value (COLUMNNAME_Processing, Boolean.valueOf(Processing));
}
/** Get Process Now.
@return Process Now */
public boolean isProcessing() 
{
Object oo = get_Value(COLUMNNAME_Processing);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="2e30bb5d-fd3e-2bc0-e074-c98829d3a4c8")
public static String es_PE_FIELD_ServiceLevel_ProcessNow_Name="Procesar Ahora";

@XendraField(AD_Column_ID="Processing",IsCentrallyMaintained=true,
AD_Tab_ID="5805fe9f-d96f-828f-6fa5-92d9720b7cb8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2e30bb5d-fd3e-2bc0-e074-c98829d3a4c8")
public static final String FIELDNAME_ServiceLevel_ProcessNow="2e30bb5d-fd3e-2bc0-e074-c98829d3a4c8";

@XendraTrl(Identifier="27ef6e49-af96-3983-e4c5-681906361b49")
public static String es_PE_COLUMN_Processing_Name="Procesar Ahora";

@XendraColumn(AD_Element_ID="f2096404-1a98-35ec-09ea-273b3e19b7de",ColumnName="Processing",
AD_Reference_ID=28,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="27ef6e49-af96-3983-e4c5-681906361b49",
Synchronized="2019-08-30 22:22:17.0")
/** Column name Processing */
public static final String COLUMNNAME_Processing = "Processing";
/** Set Quantity Invoiced.
@param ServiceLevelInvoiced Quantity of product or service invoiced */
public void setServiceLevelInvoiced (BigDecimal ServiceLevelInvoiced)
{
if (ServiceLevelInvoiced == null) throw new IllegalArgumentException ("ServiceLevelInvoiced is mandatory.");
set_ValueNoCheck (COLUMNNAME_ServiceLevelInvoiced, ServiceLevelInvoiced);
}
/** Get Quantity Invoiced.
@return Quantity of product or service invoiced */
public BigDecimal getServiceLevelInvoiced() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_ServiceLevelInvoiced);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="4d89341e-85be-6c6e-c345-492cf00d7507")
public static String es_PE_FIELD_ServiceLevel_QuantityInvoiced_Name="Cantidad Facturada";

@XendraTrl(Identifier="4d89341e-85be-6c6e-c345-492cf00d7507")
public static String es_PE_FIELD_ServiceLevel_QuantityInvoiced_Description="Cantidad de producto ó servicio facturado";

@XendraTrl(Identifier="4d89341e-85be-6c6e-c345-492cf00d7507")
public static String es_PE_FIELD_ServiceLevel_QuantityInvoiced_Help="La cantidad facturada indica la cantidad total de un producto ó servicio facturado";

@XendraField(AD_Column_ID="ServiceLevelInvoiced",IsCentrallyMaintained=true,
AD_Tab_ID="5805fe9f-d96f-828f-6fa5-92d9720b7cb8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="4d89341e-85be-6c6e-c345-492cf00d7507")
public static final String FIELDNAME_ServiceLevel_QuantityInvoiced="4d89341e-85be-6c6e-c345-492cf00d7507";

@XendraTrl(Identifier="25d5492b-0f82-3e5b-c165-5d5b897025d6")
public static String es_PE_COLUMN_ServiceLevelInvoiced_Name="Cantidad Facturada";

@XendraColumn(AD_Element_ID="1f63b2f8-d622-1260-98bc-eecfa93c26be",
ColumnName="ServiceLevelInvoiced",AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="25d5492b-0f82-3e5b-c165-5d5b897025d6",Synchronized="2019-08-30 22:22:17.0")
/** Column name ServiceLevelInvoiced */
public static final String COLUMNNAME_ServiceLevelInvoiced = "ServiceLevelInvoiced";
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

@XendraTrl(Identifier="e99d96c2-b22a-737c-4c40-9b583c4e4adc")
public static String es_PE_FIELD_ServiceLevel_QuantityProvided_Name="Cantidad Entregada";

@XendraTrl(Identifier="e99d96c2-b22a-737c-4c40-9b583c4e4adc")
public static String es_PE_FIELD_ServiceLevel_QuantityProvided_Description="Cantidad de producto ó servicio proporcionado";

@XendraTrl(Identifier="e99d96c2-b22a-737c-4c40-9b583c4e4adc")
public static String es_PE_FIELD_ServiceLevel_QuantityProvided_Help="La cantidad proveída indica la cantidad total de un producto ó servicio que ha sido recibido por el cliente";

@XendraField(AD_Column_ID="ServiceLevelProvided",IsCentrallyMaintained=true,
AD_Tab_ID="5805fe9f-d96f-828f-6fa5-92d9720b7cb8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e99d96c2-b22a-737c-4c40-9b583c4e4adc")
public static final String FIELDNAME_ServiceLevel_QuantityProvided="e99d96c2-b22a-737c-4c40-9b583c4e4adc";

@XendraTrl(Identifier="935a1999-168d-2a74-f19e-c80b40fd8657")
public static String es_PE_COLUMN_ServiceLevelProvided_Name="Cantidad Entregada";

@XendraColumn(AD_Element_ID="88a9dd3e-64f8-2537-bd81-642e2911c9e2",
ColumnName="ServiceLevelProvided",AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="935a1999-168d-2a74-f19e-c80b40fd8657",Synchronized="2019-08-30 22:22:17.0")
/** Column name ServiceLevelProvided */
public static final String COLUMNNAME_ServiceLevelProvided = "ServiceLevelProvided";
}
