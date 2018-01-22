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
/** Generated Model for M_DistributionRun
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_M_DistributionRun extends PO
{
/** Standard Constructor
@param ctx context
@param M_DistributionRun_ID id
@param trxName transaction
*/
public X_M_DistributionRun (Properties ctx, int M_DistributionRun_ID, String trxName)
{
super (ctx, M_DistributionRun_ID, trxName);
/** if (M_DistributionRun_ID == 0)
{
setIsCreateSingleOrder (false);	
// N
setM_DistributionRun_ID (0);
setName (null);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_M_DistributionRun (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=712 */
public static int Table_ID=MTable.getTable_ID("M_DistributionRun");

@XendraTrl(Identifier="73f2a1d4-ceec-8a62-c3fa-bf7494d4c8d7")
public static String es_PE_TAB_DistributionRun_Description="El funcionamiento de la distribución crea órdenes para distribuir productos a una lista seleccionada de socios";

@XendraTrl(Identifier="73f2a1d4-ceec-8a62-c3fa-bf7494d4c8d7")
public static String es_PE_TAB_DistributionRun_Name="Ejecutar Distribución";

@XendraTrl(Identifier="73f2a1d4-ceec-8a62-c3fa-bf7494d4c8d7")
public static String es_PE_TAB_DistributionRun_Help="El funcionamiento de la distribución define cómo se crean las órdenes basadas en listas de distribución";

@XendraTab(Name="Distribution Run",
Description="Distribution Run create Orders to distribute products to a selected list of partners",
Help="Distribution Run defines how Orders are created based on Distribution Lists",
AD_Window_ID="ed3d93df-76c1-5e54-7703-bc1fceeb5bd1",SeqNo=10,TabLevel=0,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="73f2a1d4-ceec-8a62-c3fa-bf7494d4c8d7",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_DistributionRun="73f2a1d4-ceec-8a62-c3fa-bf7494d4c8d7";

@XendraTrl(Identifier="96ac5c9b-b616-dd1e-0120-204a06089a44")
public static String es_PE_TABLE_M_DistributionRun_Name="Corrida de Distribución";

@XendraTable(Name="Distribution Run",
Description="Distribution Run create Orders to distribute products to a selected list of partners",
Help="",TableName="M_DistributionRun",AccessLevel="3",
AD_Window_ID="ed3d93df-76c1-5e54-7703-bc1fceeb5bd1",AD_Val_Rule_ID="",IsKey=1,LoadSeq=135,
IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,IsView=false,
PO_Window_ID="",ID="org.xendra.material",Identifier="96ac5c9b-b616-dd1e-0120-204a06089a44",
Synchronized="2017-08-16 11:43:10.0")
/** TableName=M_DistributionRun */
public static final String Table_Name="M_DistributionRun";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"M_DistributionRun");

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
    Table_ID = MTable.getTable_ID("M_DistributionRun");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_M_DistributionRun[").append(get_ID()).append("]");
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

@XendraTrl(Identifier="34677914-f3f1-a127-c581-d56007376819")
public static String es_PE_FIELD_DistributionRun_BusinessPartner_Description="Identifica un Socio de Negocio";

@XendraTrl(Identifier="34677914-f3f1-a127-c581-d56007376819")
public static String es_PE_FIELD_DistributionRun_BusinessPartner_Help="Un socio de negocio es cualquiera con quien usted realiza transacciones. Este puede incluir Proveedores; Clientes; Empleados ó Vendedores.";

@XendraTrl(Identifier="34677914-f3f1-a127-c581-d56007376819")
public static String es_PE_FIELD_DistributionRun_BusinessPartner_Name="Socio de Negocio";

@XendraField(AD_Column_ID="C_BPartner_ID",IsCentrallyMaintained=true,
AD_Tab_ID="73f2a1d4-ceec-8a62-c3fa-bf7494d4c8d7",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsCreateSingleOrder@=Y",DisplayLength=26,IsReadOnly=false,SeqNo=80,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="34677914-f3f1-a127-c581-d56007376819")
public static final String FIELDNAME_DistributionRun_BusinessPartner="34677914-f3f1-a127-c581-d56007376819";

@XendraTrl(Identifier="d3d03b8d-4f0a-30a5-6a82-a6dbfd3a9018")
public static String es_PE_COLUMN_C_BPartner_ID_Name="Socio de Negocio";

@XendraColumn(AD_Element_ID="fe333dc3-4f40-1276-5f6a-d09bb66dc423",ColumnName="C_BPartner_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="06fdbbe9-e1c4-3ee4-4a9d-73d1a990cc42",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="d3d03b8d-4f0a-30a5-6a82-a6dbfd3a9018",Synchronized="2017-08-05 16:55:05.0")
/** Column name C_BPartner_ID */
public static final String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";
/** Set Partner Location.
@param C_BPartner_Location_ID Identifies the (ship to) address for this Business Partner */
public void setC_BPartner_Location_ID (int C_BPartner_Location_ID)
{
if (C_BPartner_Location_ID <= 0) set_Value (COLUMNNAME_C_BPartner_Location_ID, null);
 else 
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

@XendraTrl(Identifier="81fd7fcf-ba2d-8eaa-3b1e-debccaee6de4")
public static String es_PE_FIELD_DistributionRun_PartnerLocation_Description="Identifica la dirección para este socio de negocio";

@XendraTrl(Identifier="81fd7fcf-ba2d-8eaa-3b1e-debccaee6de4")
public static String es_PE_FIELD_DistributionRun_PartnerLocation_Help="La dirección de un socio indica la ubicación de un socio de negocio";

@XendraTrl(Identifier="81fd7fcf-ba2d-8eaa-3b1e-debccaee6de4")
public static String es_PE_FIELD_DistributionRun_PartnerLocation_Name="Dirección del Socio del Negocio";

@XendraField(AD_Column_ID="C_BPartner_Location_ID",IsCentrallyMaintained=true,
AD_Tab_ID="73f2a1d4-ceec-8a62-c3fa-bf7494d4c8d7",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsCreateSingleOrder@=Y",DisplayLength=14,IsReadOnly=false,SeqNo=90,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="81fd7fcf-ba2d-8eaa-3b1e-debccaee6de4")
public static final String FIELDNAME_DistributionRun_PartnerLocation="81fd7fcf-ba2d-8eaa-3b1e-debccaee6de4";

@XendraTrl(Identifier="bb22a00f-cfbb-fd8c-abfd-8d51bc3694ef")
public static String es_PE_COLUMN_C_BPartner_Location_ID_Name="Dirección del Socio del Negocio";

@XendraColumn(AD_Element_ID="0dab7dc6-2832-26dc-2462-cba2d40235f2",
ColumnName="C_BPartner_Location_ID",AD_Reference_ID=19,AD_Reference_Value_ID="",
AD_Val_Rule_ID="623d98c0-19fc-56a2-f511-8992974d3c05",FieldLength=22,DefaultValue="",IsKey=false,
IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="bb22a00f-cfbb-fd8c-abfd-8d51bc3694ef",
Synchronized="2017-08-05 16:55:06.0")
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

@XendraTrl(Identifier="29001aed-b437-0596-81f5-0d921f35ee42")
public static String es_PE_FIELD_DistributionRun_Description_Description="Observación corta opcional del registro";

@XendraTrl(Identifier="29001aed-b437-0596-81f5-0d921f35ee42")
public static String es_PE_FIELD_DistributionRun_Description_Help="Una Observación esta limitada a 255 caracteres";

@XendraTrl(Identifier="29001aed-b437-0596-81f5-0d921f35ee42")
public static String es_PE_FIELD_DistributionRun_Description_Name="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="73f2a1d4-ceec-8a62-c3fa-bf7494d4c8d7",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="29001aed-b437-0596-81f5-0d921f35ee42")
public static final String FIELDNAME_DistributionRun_Description="29001aed-b437-0596-81f5-0d921f35ee42";

@XendraTrl(Identifier="ed7cf7ea-ccd4-f81d-ea48-d2b00df06cad")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ed7cf7ea-ccd4-f81d-ea48-d2b00df06cad",
Synchronized="2017-08-05 16:55:06.0")
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
@XendraTrl(Identifier="59ad4820-11a0-49b3-adae-e7b61de7fd2a")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="59ad4820-11a0-49b3-adae-e7b61de7fd2a",
Synchronized="2017-08-05 16:55:06.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Create Single Order.
@param IsCreateSingleOrder For all shipments create one Order */
public void setIsCreateSingleOrder (boolean IsCreateSingleOrder)
{
set_Value (COLUMNNAME_IsCreateSingleOrder, Boolean.valueOf(IsCreateSingleOrder));
}
/** Get Create Single Order.
@return For all shipments create one Order */
public boolean isCreateSingleOrder() 
{
Object oo = get_Value(COLUMNNAME_IsCreateSingleOrder);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="a9402f36-5726-cce8-5056-629acb73a9ac")
public static String es_PE_FIELD_DistributionRun_CreateSingleOrder_Description="Para todos los envios cree una orden";

@XendraTrl(Identifier="a9402f36-5726-cce8-5056-629acb73a9ac")
public static String es_PE_FIELD_DistributionRun_CreateSingleOrder_Name="Crear Orden Simple";

@XendraField(AD_Column_ID="IsCreateSingleOrder",IsCentrallyMaintained=true,
AD_Tab_ID="73f2a1d4-ceec-8a62-c3fa-bf7494d4c8d7",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a9402f36-5726-cce8-5056-629acb73a9ac")
public static final String FIELDNAME_DistributionRun_CreateSingleOrder="a9402f36-5726-cce8-5056-629acb73a9ac";

@XendraTrl(Identifier="260ab4fa-bfa8-2b0f-03fa-e0c1dc9af640")
public static String es_PE_COLUMN_IsCreateSingleOrder_Name="Crear Orden Simple";

@XendraColumn(AD_Element_ID="a2565f72-7450-244f-14c6-6da2bc9e3bd2",
ColumnName="IsCreateSingleOrder",AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="N",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="260ab4fa-bfa8-2b0f-03fa-e0c1dc9af640",Synchronized="2017-08-05 16:55:06.0")
/** Column name IsCreateSingleOrder */
public static final String COLUMNNAME_IsCreateSingleOrder = "IsCreateSingleOrder";
/** Set Distribution Run.
@param M_DistributionRun_ID Distribution Run create Orders to distribute products to a selected list of partners */
public void setM_DistributionRun_ID (int M_DistributionRun_ID)
{
if (M_DistributionRun_ID < 1) throw new IllegalArgumentException ("M_DistributionRun_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_M_DistributionRun_ID, Integer.valueOf(M_DistributionRun_ID));
}
/** Get Distribution Run.
@return Distribution Run create Orders to distribute products to a selected list of partners */
public int getM_DistributionRun_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_DistributionRun_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="f4ce7744-c3dc-efc1-c911-b179c38c60cc")
public static String es_PE_FIELD_DistributionRun_DistributionRun_Description="El funcionamiento de la distribución crea órdenes para distribuir productos a una lista seleccionada de socios.";

@XendraTrl(Identifier="f4ce7744-c3dc-efc1-c911-b179c38c60cc")
public static String es_PE_FIELD_DistributionRun_DistributionRun_Help="El funcionamiento de la distribución define cómo se crean las órdenes basadas en listas de distribución.";

@XendraTrl(Identifier="f4ce7744-c3dc-efc1-c911-b179c38c60cc")
public static String es_PE_FIELD_DistributionRun_DistributionRun_Name="Corrida de Distribución";

@XendraField(AD_Column_ID="M_DistributionRun_ID",IsCentrallyMaintained=true,
AD_Tab_ID="73f2a1d4-ceec-8a62-c3fa-bf7494d4c8d7",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=10,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f4ce7744-c3dc-efc1-c911-b179c38c60cc")
public static final String FIELDNAME_DistributionRun_DistributionRun="f4ce7744-c3dc-efc1-c911-b179c38c60cc";
/** Column name M_DistributionRun_ID */
public static final String COLUMNNAME_M_DistributionRun_ID = "M_DistributionRun_ID";
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

@XendraTrl(Identifier="9932de7d-5fa9-b4e3-8567-93e199b2b33b")
public static String es_PE_FIELD_DistributionRun_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="9932de7d-5fa9-b4e3-8567-93e199b2b33b")
public static String es_PE_FIELD_DistributionRun_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraTrl(Identifier="9932de7d-5fa9-b4e3-8567-93e199b2b33b")
public static String es_PE_FIELD_DistributionRun_Name_Name="Nombre";

@XendraField(AD_Column_ID="Name",IsCentrallyMaintained=true,
AD_Tab_ID="73f2a1d4-ceec-8a62-c3fa-bf7494d4c8d7",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=40,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9932de7d-5fa9-b4e3-8567-93e199b2b33b")
public static final String FIELDNAME_DistributionRun_Name="9932de7d-5fa9-b4e3-8567-93e199b2b33b";

@XendraTrl(Identifier="29c5d781-5ba3-d7da-be44-d559b13e42ed")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="29c5d781-5ba3-d7da-be44-d559b13e42ed",
Synchronized="2017-08-05 16:55:06.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
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

@XendraTrl(Identifier="82af916d-c067-0ccb-dc3a-98bd86c2db9d")
public static String es_PE_FIELD_DistributionRun_ProcessNow_Description="Crea Oden Basada en las líneas de la lista de distribución de los productos.";

@XendraTrl(Identifier="82af916d-c067-0ccb-dc3a-98bd86c2db9d")
public static String es_PE_FIELD_DistributionRun_ProcessNow_Help="Observe al hacer el redondeo, la cantidad total de orden(es) es probable ser más alto a la cantidad incorporada.";

@XendraTrl(Identifier="82af916d-c067-0ccb-dc3a-98bd86c2db9d")
public static String es_PE_FIELD_DistributionRun_ProcessNow_Name="Crea Ordenes";

@XendraField(AD_Column_ID="Processing",IsCentrallyMaintained=true,
AD_Tab_ID="73f2a1d4-ceec-8a62-c3fa-bf7494d4c8d7",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="82af916d-c067-0ccb-dc3a-98bd86c2db9d")
public static final String FIELDNAME_DistributionRun_ProcessNow="82af916d-c067-0ccb-dc3a-98bd86c2db9d";

@XendraTrl(Identifier="e99b31c6-5136-13fd-47f6-ddf933d54d5e")
public static String es_PE_COLUMN_Processing_Name="Procesar Ahora";

@XendraColumn(AD_Element_ID="f2096404-1a98-35ec-09ea-273b3e19b7de",ColumnName="Processing",
AD_Reference_ID=28,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="b8c6d83a-badf-a130-33e7-d82d00120e84",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="e99b31c6-5136-13fd-47f6-ddf933d54d5e",Synchronized="2017-08-05 16:55:06.0")
/** Column name Processing */
public static final String COLUMNNAME_Processing = "Processing";
}
