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
/** Generated Model for PA_Hierarchy
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_PA_Hierarchy extends PO
{
/** Standard Constructor
@param ctx context
@param PA_Hierarchy_ID id
@param trxName transaction
*/
public X_PA_Hierarchy (Properties ctx, int PA_Hierarchy_ID, String trxName)
{
super (ctx, PA_Hierarchy_ID, trxName);
/** if (PA_Hierarchy_ID == 0)
{
setAD_Tree_Account_ID (0);
setAD_Tree_Activity_ID (0);
setAD_Tree_BPartner_ID (0);
setAD_Tree_Campaign_ID (0);
setAD_Tree_Org_ID (0);
setAD_Tree_Product_ID (0);
setAD_Tree_Project_ID (0);
setAD_Tree_SalesRegion_ID (0);
setName (null);
setPA_Hierarchy_ID (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_PA_Hierarchy (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=821 */
public static int Table_ID=MTable.getTable_ID("PA_Hierarchy");

@XendraTrl(Identifier="c2ee2ad8-e9b6-f03a-22e6-ba90b46f5184")
public static String es_PE_TAB_ReportingHierarchy_Description="Informe por Jerarquías";

@XendraTrl(Identifier="c2ee2ad8-e9b6-f03a-22e6-ba90b46f5184")
public static String es_PE_TAB_ReportingHierarchy_Help="Informe por Jerarquías le permite seleccionar diferentes Jerarquías/Árboles para el informe.Segmentos deseados de cuenta, Organización, Cuentas, Productos pueden tener alguna jerarquía para acomodar diferentes vistas sobre el negocio.";

@XendraTrl(Identifier="c2ee2ad8-e9b6-f03a-22e6-ba90b46f5184")
public static String es_PE_TAB_ReportingHierarchy_Name="Informe por Jerarquías";

@XendraTab(Name="Reporting Hierarchy",Description="Reporting Hierarchy",
Help="Reporting Hierarchy allows you to select different Hierarchies/Trees for the report. Accounting Segments like Organization, Account, Product may have several hierarchies to accomodate different views on the business",
AD_Window_ID="2eb028f0-ed2c-25ac-5adc-2af3cb4baaab",SeqNo=10,TabLevel=0,IsSingleRow=true,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="c2ee2ad8-e9b6-f03a-22e6-ba90b46f5184",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_ReportingHierarchy="c2ee2ad8-e9b6-f03a-22e6-ba90b46f5184";

@XendraTrl(Identifier="61a4e1c2-25fd-74c7-cc2b-946ed207afdf")
public static String es_PE_TABLE_PA_Hierarchy_Name="Reportando Jerarquías";

@XendraTable(Name="Reporting Hierarchy",AD_Package_ID="34bf6e21-8c70-8fb9-604c-a300eb925459",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="Reporting Hierarchy",Help="",
TableName="PA_Hierarchy",AccessLevel="2",AD_Window_ID="2eb028f0-ed2c-25ac-5adc-2af3cb4baaab",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=130,IsSecurityEnabled=false,IsDeleteable=false,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.performanceanalysis",
Identifier="61a4e1c2-25fd-74c7-cc2b-946ed207afdf",Synchronized="2020-03-03 21:39:03.0")
/** TableName=PA_Hierarchy */
public static final String Table_Name="PA_Hierarchy";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"PA_Hierarchy");

protected BigDecimal accessLevel = BigDecimal.valueOf(2);
/** AccessLevel
@return 2 - Client 
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
    Table_ID = MTable.getTable_ID("PA_Hierarchy");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_PA_Hierarchy[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Account Tree.
@param AD_Tree_Account_ID Tree for Natural Account Tree */
public void setAD_Tree_Account_ID (int AD_Tree_Account_ID)
{
if (AD_Tree_Account_ID < 1) throw new IllegalArgumentException ("AD_Tree_Account_ID is mandatory.");
set_Value (COLUMNNAME_AD_Tree_Account_ID, Integer.valueOf(AD_Tree_Account_ID));
}
/** Get Account Tree.
@return Tree for Natural Account Tree */
public int getAD_Tree_Account_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Tree_Account_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="6e38adcd-06e2-c7c0-3f08-af74d36c789d")
public static String es_PE_FIELD_ReportingHierarchy_AccountTree_Name="Árbol de Cuentas";

@XendraTrl(Identifier="6e38adcd-06e2-c7c0-3f08-af74d36c789d")
public static String es_PE_FIELD_ReportingHierarchy_AccountTree_Description="Árbol para Árbol de Cuentas Naturales";

@XendraField(AD_Column_ID="AD_Tree_Account_ID",IsCentrallyMaintained=true,
AD_Tab_ID="c2ee2ad8-e9b6-f03a-22e6-ba90b46f5184",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6e38adcd-06e2-c7c0-3f08-af74d36c789d")
public static final String FIELDNAME_ReportingHierarchy_AccountTree="6e38adcd-06e2-c7c0-3f08-af74d36c789d";

@XendraTrl(Identifier="63caa19d-86e5-c6da-c47a-6a9f9b2bb91b")
public static String es_PE_COLUMN_AD_Tree_Account_ID_Name="Árbol de Cuentas";

@XendraColumn(AD_Element_ID="8bff8a31-2fc8-e6a7-b322-491393855f19",ColumnName="AD_Tree_Account_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="79a8ec82-b2c4-01ef-3d8c-2a2a8d8a2952",
AD_Val_Rule_ID="3b3dc93e-35ae-587a-82f6-333bf12e0787",FieldLength=10,DefaultValue="",IsKey=false,
IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="63caa19d-86e5-c6da-c47a-6a9f9b2bb91b",
Synchronized="2019-08-30 22:23:37.0")
/** Column name AD_Tree_Account_ID */
public static final String COLUMNNAME_AD_Tree_Account_ID = "AD_Tree_Account_ID";
/** Set Activity Tree.
@param AD_Tree_Activity_ID Tree to determine activity hierarchy */
public void setAD_Tree_Activity_ID (int AD_Tree_Activity_ID)
{
if (AD_Tree_Activity_ID < 1) throw new IllegalArgumentException ("AD_Tree_Activity_ID is mandatory.");
set_Value (COLUMNNAME_AD_Tree_Activity_ID, Integer.valueOf(AD_Tree_Activity_ID));
}
/** Get Activity Tree.
@return Tree to determine activity hierarchy */
public int getAD_Tree_Activity_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Tree_Activity_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="d6c3b552-a469-8519-5aee-59c72f7825a6")
public static String es_PE_FIELD_ReportingHierarchy_ActivityTree_Name="Actividad Árbol primario";

@XendraField(AD_Column_ID="AD_Tree_Activity_ID",IsCentrallyMaintained=true,
AD_Tab_ID="c2ee2ad8-e9b6-f03a-22e6-ba90b46f5184",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d6c3b552-a469-8519-5aee-59c72f7825a6")
public static final String FIELDNAME_ReportingHierarchy_ActivityTree="d6c3b552-a469-8519-5aee-59c72f7825a6";

@XendraTrl(Identifier="7609f45d-c1b2-47da-0795-6fb1caac9a94")
public static String es_PE_COLUMN_AD_Tree_Activity_ID_Name="Actividad Árbol primario";

@XendraColumn(AD_Element_ID="e0df1bfd-05d9-e649-2d02-be0397329dfb",
ColumnName="AD_Tree_Activity_ID",AD_Reference_ID=18,
AD_Reference_Value_ID="79a8ec82-b2c4-01ef-3d8c-2a2a8d8a2952",
AD_Val_Rule_ID="3d37e6f8-5904-2067-5029-ad37232f3a6b",FieldLength=10,DefaultValue="",IsKey=false,
IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7609f45d-c1b2-47da-0795-6fb1caac9a94",
Synchronized="2019-08-30 22:23:37.0")
/** Column name AD_Tree_Activity_ID */
public static final String COLUMNNAME_AD_Tree_Activity_ID = "AD_Tree_Activity_ID";
/** Set BPartner Tree.
@param AD_Tree_BPartner_ID Tree to determine business partner hierarchy */
public void setAD_Tree_BPartner_ID (int AD_Tree_BPartner_ID)
{
if (AD_Tree_BPartner_ID < 1) throw new IllegalArgumentException ("AD_Tree_BPartner_ID is mandatory.");
set_Value (COLUMNNAME_AD_Tree_BPartner_ID, Integer.valueOf(AD_Tree_BPartner_ID));
}
/** Get BPartner Tree.
@return Tree to determine business partner hierarchy */
public int getAD_Tree_BPartner_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Tree_BPartner_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="16fac3b0-6837-6feb-1f47-ce68f7778db3")
public static String es_PE_FIELD_ReportingHierarchy_BPartnerTree_Name="Árbol Primario de Socio";

@XendraField(AD_Column_ID="AD_Tree_BPartner_ID",IsCentrallyMaintained=true,
AD_Tab_ID="c2ee2ad8-e9b6-f03a-22e6-ba90b46f5184",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="16fac3b0-6837-6feb-1f47-ce68f7778db3")
public static final String FIELDNAME_ReportingHierarchy_BPartnerTree="16fac3b0-6837-6feb-1f47-ce68f7778db3";

@XendraTrl(Identifier="ec475f2d-c04f-a999-da89-fd8b172ebb9e")
public static String es_PE_COLUMN_AD_Tree_BPartner_ID_Name="Árbol Primario de Socio";

@XendraColumn(AD_Element_ID="e61fdac0-07c9-6eac-fb7f-dbac5cd56cd1",
ColumnName="AD_Tree_BPartner_ID",AD_Reference_ID=18,
AD_Reference_Value_ID="79a8ec82-b2c4-01ef-3d8c-2a2a8d8a2952",
AD_Val_Rule_ID="df866435-c3de-fcaa-a147-47df0e89f72b",FieldLength=10,DefaultValue="",IsKey=false,
IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ec475f2d-c04f-a999-da89-fd8b172ebb9e",
Synchronized="2019-08-30 22:23:37.0")
/** Column name AD_Tree_BPartner_ID */
public static final String COLUMNNAME_AD_Tree_BPartner_ID = "AD_Tree_BPartner_ID";
/** Set Campaign Tree.
@param AD_Tree_Campaign_ID Tree to determine marketing campaign hierarchy */
public void setAD_Tree_Campaign_ID (int AD_Tree_Campaign_ID)
{
if (AD_Tree_Campaign_ID < 1) throw new IllegalArgumentException ("AD_Tree_Campaign_ID is mandatory.");
set_Value (COLUMNNAME_AD_Tree_Campaign_ID, Integer.valueOf(AD_Tree_Campaign_ID));
}
/** Get Campaign Tree.
@return Tree to determine marketing campaign hierarchy */
public int getAD_Tree_Campaign_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Tree_Campaign_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="1036de14-0087-88cd-e938-08ed229ee002")
public static String es_PE_FIELD_ReportingHierarchy_CampaignTree_Name="Campaña Árbol primario";

@XendraField(AD_Column_ID="AD_Tree_Campaign_ID",IsCentrallyMaintained=true,
AD_Tab_ID="c2ee2ad8-e9b6-f03a-22e6-ba90b46f5184",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=130,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1036de14-0087-88cd-e938-08ed229ee002")
public static final String FIELDNAME_ReportingHierarchy_CampaignTree="1036de14-0087-88cd-e938-08ed229ee002";

@XendraTrl(Identifier="5e2d8909-ecca-c4c0-087d-49ad196902f2")
public static String es_PE_COLUMN_AD_Tree_Campaign_ID_Name="Campaña Árbol primario";

@XendraColumn(AD_Element_ID="1eddfa44-4f1d-5fab-5a35-1b14c621548f",
ColumnName="AD_Tree_Campaign_ID",AD_Reference_ID=18,
AD_Reference_Value_ID="79a8ec82-b2c4-01ef-3d8c-2a2a8d8a2952",
AD_Val_Rule_ID="bf228b0c-2548-f234-65bb-e0fe0b2885f2",FieldLength=10,DefaultValue="",IsKey=false,
IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5e2d8909-ecca-c4c0-087d-49ad196902f2",
Synchronized="2019-08-30 22:23:37.0")
/** Column name AD_Tree_Campaign_ID */
public static final String COLUMNNAME_AD_Tree_Campaign_ID = "AD_Tree_Campaign_ID";
/** Set Organization Tree.
@param AD_Tree_Org_ID Tree to determine organizational hierarchy */
public void setAD_Tree_Org_ID (int AD_Tree_Org_ID)
{
if (AD_Tree_Org_ID < 1) throw new IllegalArgumentException ("AD_Tree_Org_ID is mandatory.");
set_Value (COLUMNNAME_AD_Tree_Org_ID, Integer.valueOf(AD_Tree_Org_ID));
}
/** Get Organization Tree.
@return Tree to determine organizational hierarchy */
public int getAD_Tree_Org_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Tree_Org_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="fb543828-e37b-ffbc-b0de-aa9e440a3947")
public static String es_PE_FIELD_ReportingHierarchy_OrganizationTree_Name="Árbol Primario de Organización";

@XendraField(AD_Column_ID="AD_Tree_Org_ID",IsCentrallyMaintained=true,
AD_Tab_ID="c2ee2ad8-e9b6-f03a-22e6-ba90b46f5184",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="fb543828-e37b-ffbc-b0de-aa9e440a3947")
public static final String FIELDNAME_ReportingHierarchy_OrganizationTree="fb543828-e37b-ffbc-b0de-aa9e440a3947";

@XendraTrl(Identifier="dc1bedfe-6891-e1e6-59ba-558048391532")
public static String es_PE_COLUMN_AD_Tree_Org_ID_Name="Árbol Primario de Organización";

@XendraColumn(AD_Element_ID="ece986ac-8411-7f5a-662f-34ed42e25cc6",ColumnName="AD_Tree_Org_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="79a8ec82-b2c4-01ef-3d8c-2a2a8d8a2952",
AD_Val_Rule_ID="0d0fbf0f-d08c-51a5-6ab9-692a6550b14d",FieldLength=10,DefaultValue="",IsKey=false,
IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="dc1bedfe-6891-e1e6-59ba-558048391532",
Synchronized="2019-08-30 22:23:37.0")
/** Column name AD_Tree_Org_ID */
public static final String COLUMNNAME_AD_Tree_Org_ID = "AD_Tree_Org_ID";
/** Set Product Tree.
@param AD_Tree_Product_ID Tree to determine product hierarchy */
public void setAD_Tree_Product_ID (int AD_Tree_Product_ID)
{
if (AD_Tree_Product_ID < 1) throw new IllegalArgumentException ("AD_Tree_Product_ID is mandatory.");
set_Value (COLUMNNAME_AD_Tree_Product_ID, Integer.valueOf(AD_Tree_Product_ID));
}
/** Get Product Tree.
@return Tree to determine product hierarchy */
public int getAD_Tree_Product_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Tree_Product_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="7facc3f8-ae7a-a202-49c2-09db4653a8ac")
public static String es_PE_FIELD_ReportingHierarchy_ProductTree_Name="Árbol Primario del Producto";

@XendraField(AD_Column_ID="AD_Tree_Product_ID",IsCentrallyMaintained=true,
AD_Tab_ID="c2ee2ad8-e9b6-f03a-22e6-ba90b46f5184",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7facc3f8-ae7a-a202-49c2-09db4653a8ac")
public static final String FIELDNAME_ReportingHierarchy_ProductTree="7facc3f8-ae7a-a202-49c2-09db4653a8ac";

@XendraTrl(Identifier="b445467f-5b2a-d45f-0a82-26049869b213")
public static String es_PE_COLUMN_AD_Tree_Product_ID_Name="Árbol Primario del Producto";

@XendraColumn(AD_Element_ID="41ddf96d-d52b-c2e6-7a44-34d62b5319c6",ColumnName="AD_Tree_Product_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="79a8ec82-b2c4-01ef-3d8c-2a2a8d8a2952",
AD_Val_Rule_ID="69eb448a-64cf-b54f-12a1-c19ad55dddb1",FieldLength=10,DefaultValue="",IsKey=false,
IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b445467f-5b2a-d45f-0a82-26049869b213",
Synchronized="2019-08-30 22:23:37.0")
/** Column name AD_Tree_Product_ID */
public static final String COLUMNNAME_AD_Tree_Product_ID = "AD_Tree_Product_ID";
/** Set Project Tree.
@param AD_Tree_Project_ID Tree to determine project hierarchy */
public void setAD_Tree_Project_ID (int AD_Tree_Project_ID)
{
if (AD_Tree_Project_ID < 1) throw new IllegalArgumentException ("AD_Tree_Project_ID is mandatory.");
set_Value (COLUMNNAME_AD_Tree_Project_ID, Integer.valueOf(AD_Tree_Project_ID));
}
/** Get Project Tree.
@return Tree to determine project hierarchy */
public int getAD_Tree_Project_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Tree_Project_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="30e38ea1-104f-eaad-e3ca-bf0ffc64aaa5")
public static String es_PE_FIELD_ReportingHierarchy_ProjectTree_Name="Árbol Primario de Proyectos";

@XendraField(AD_Column_ID="AD_Tree_Project_ID",IsCentrallyMaintained=true,
AD_Tab_ID="c2ee2ad8-e9b6-f03a-22e6-ba90b46f5184",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=120,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="30e38ea1-104f-eaad-e3ca-bf0ffc64aaa5")
public static final String FIELDNAME_ReportingHierarchy_ProjectTree="30e38ea1-104f-eaad-e3ca-bf0ffc64aaa5";

@XendraTrl(Identifier="a6164b72-82ef-864a-1175-f9f6bca0ff1f")
public static String es_PE_COLUMN_AD_Tree_Project_ID_Name="Árbol Primario de Proyectos";

@XendraColumn(AD_Element_ID="61735bf6-cf9c-70b4-a9b1-a396d86f8460",ColumnName="AD_Tree_Project_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="79a8ec82-b2c4-01ef-3d8c-2a2a8d8a2952",
AD_Val_Rule_ID="20fc2aa0-b11e-adf8-df71-c836b35c928f",FieldLength=10,DefaultValue="",IsKey=false,
IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a6164b72-82ef-864a-1175-f9f6bca0ff1f",
Synchronized="2019-08-30 22:23:37.0")
/** Column name AD_Tree_Project_ID */
public static final String COLUMNNAME_AD_Tree_Project_ID = "AD_Tree_Project_ID";
/** Set Sales Region Tree.
@param AD_Tree_SalesRegion_ID Tree to determine sales regional hierarchy */
public void setAD_Tree_SalesRegion_ID (int AD_Tree_SalesRegion_ID)
{
if (AD_Tree_SalesRegion_ID < 1) throw new IllegalArgumentException ("AD_Tree_SalesRegion_ID is mandatory.");
set_Value (COLUMNNAME_AD_Tree_SalesRegion_ID, Integer.valueOf(AD_Tree_SalesRegion_ID));
}
/** Get Sales Region Tree.
@return Tree to determine sales regional hierarchy */
public int getAD_Tree_SalesRegion_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Tree_SalesRegion_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="0163c413-6dc9-e994-59ad-0e321ed3ee1b")
public static String es_PE_FIELD_ReportingHierarchy_SalesRegionTree_Name="Árbol Primario de Región de Venta";

@XendraField(AD_Column_ID="AD_Tree_SalesRegion_ID",IsCentrallyMaintained=true,
AD_Tab_ID="c2ee2ad8-e9b6-f03a-22e6-ba90b46f5184",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=140,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0163c413-6dc9-e994-59ad-0e321ed3ee1b")
public static final String FIELDNAME_ReportingHierarchy_SalesRegionTree="0163c413-6dc9-e994-59ad-0e321ed3ee1b";

@XendraTrl(Identifier="fe344d66-e175-91d5-2abb-4437aa240041")
public static String es_PE_COLUMN_AD_Tree_SalesRegion_ID_Name="Árbol Primario de Región de Venta";

@XendraColumn(AD_Element_ID="fb3056f6-271f-d89c-0c12-ab622639a3eb",
ColumnName="AD_Tree_SalesRegion_ID",AD_Reference_ID=18,
AD_Reference_Value_ID="79a8ec82-b2c4-01ef-3d8c-2a2a8d8a2952",
AD_Val_Rule_ID="3d58beb4-941c-7504-e320-c14bccf0bdeb",FieldLength=10,DefaultValue="",IsKey=false,
IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="fe344d66-e175-91d5-2abb-4437aa240041",
Synchronized="2019-08-30 22:23:37.0")
/** Column name AD_Tree_SalesRegion_ID */
public static final String COLUMNNAME_AD_Tree_SalesRegion_ID = "AD_Tree_SalesRegion_ID";
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

@XendraTrl(Identifier="52f654b6-7271-b54a-5bc4-71a1737a01ae")
public static String es_PE_FIELD_ReportingHierarchy_Description_Name="Observación";

@XendraTrl(Identifier="52f654b6-7271-b54a-5bc4-71a1737a01ae")
public static String es_PE_FIELD_ReportingHierarchy_Description_Description="Observación";

@XendraTrl(Identifier="52f654b6-7271-b54a-5bc4-71a1737a01ae")
public static String es_PE_FIELD_ReportingHierarchy_Description_Help="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="c2ee2ad8-e9b6-f03a-22e6-ba90b46f5184",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=255,IsReadOnly=false,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="52f654b6-7271-b54a-5bc4-71a1737a01ae")
public static final String FIELDNAME_ReportingHierarchy_Description="52f654b6-7271-b54a-5bc4-71a1737a01ae";

@XendraTrl(Identifier="d21ff86d-bf8c-4024-b878-d8f0837c1cb3")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d21ff86d-bf8c-4024-b878-d8f0837c1cb3",
Synchronized="2019-08-30 22:23:37.0")
/** Column name Description */
public static final String COLUMNNAME_Description = "Description";
/** Set Comment/Help.
@param Help Comment or Hint */
public void setHelp (String Help)
{
set_Value (COLUMNNAME_Help, Help);
}
/** Get Comment/Help.
@return Comment or Hint */
public String getHelp() 
{
String value = (String)get_Value(COLUMNNAME_Help);
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

@XendraTrl(Identifier="ae8e3742-80ab-9af2-ab76-1f00f48d40f5")
public static String es_PE_FIELD_ReportingHierarchy_CommentHelp_Name="Ayuda";

@XendraTrl(Identifier="ae8e3742-80ab-9af2-ab76-1f00f48d40f5")
public static String es_PE_FIELD_ReportingHierarchy_CommentHelp_Description="Ayuda; Comentario o Sugerencia";

@XendraTrl(Identifier="ae8e3742-80ab-9af2-ab76-1f00f48d40f5")
public static String es_PE_FIELD_ReportingHierarchy_CommentHelp_Help="El campo ayuda contiene una sugerencia; comentario o ayuda acerca del uso de esta partida";

@XendraField(AD_Column_ID="Help",IsCentrallyMaintained=true,
AD_Tab_ID="c2ee2ad8-e9b6-f03a-22e6-ba90b46f5184",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=2000,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ae8e3742-80ab-9af2-ab76-1f00f48d40f5")
public static final String FIELDNAME_ReportingHierarchy_CommentHelp="ae8e3742-80ab-9af2-ab76-1f00f48d40f5";

@XendraTrl(Identifier="e75a9650-8263-97de-db3e-203b1afee350")
public static String es_PE_COLUMN_Help_Name="Ayuda";

@XendraColumn(AD_Element_ID="a6fda582-56f9-6bb7-8436-285ce4f8de3f",ColumnName="Help",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e75a9650-8263-97de-db3e-203b1afee350",
Synchronized="2019-08-30 22:23:37.0")
/** Column name Help */
public static final String COLUMNNAME_Help = "Help";
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
@XendraTrl(Identifier="a825e846-7d6e-414c-b9c1-a1fdf87fed5a")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a825e846-7d6e-414c-b9c1-a1fdf87fed5a",
Synchronized="2019-08-30 22:23:37.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
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

@XendraTrl(Identifier="edf06223-fa66-9bcb-d9d3-ed7358fe7e10")
public static String es_PE_FIELD_ReportingHierarchy_Name_Name="Nombre";

@XendraTrl(Identifier="edf06223-fa66-9bcb-d9d3-ed7358fe7e10")
public static String es_PE_FIELD_ReportingHierarchy_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="edf06223-fa66-9bcb-d9d3-ed7358fe7e10")
public static String es_PE_FIELD_ReportingHierarchy_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraField(AD_Column_ID="Name",IsCentrallyMaintained=true,
AD_Tab_ID="c2ee2ad8-e9b6-f03a-22e6-ba90b46f5184",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=120,IsReadOnly=false,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="edf06223-fa66-9bcb-d9d3-ed7358fe7e10")
public static final String FIELDNAME_ReportingHierarchy_Name="edf06223-fa66-9bcb-d9d3-ed7358fe7e10";

@XendraTrl(Identifier="62d3f70f-3de9-a363-48d5-9b4c273c96db")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=120,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="62d3f70f-3de9-a363-48d5-9b4c273c96db",
Synchronized="2019-08-30 22:23:37.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
/** Set Reporting Hierarchy.
@param PA_Hierarchy_ID Optional Reporting Hierarchy - If not selected the default hierarchy trees are used. */
public void setPA_Hierarchy_ID (int PA_Hierarchy_ID)
{
if (PA_Hierarchy_ID < 1) throw new IllegalArgumentException ("PA_Hierarchy_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_PA_Hierarchy_ID, Integer.valueOf(PA_Hierarchy_ID));
}
/** Get Reporting Hierarchy.
@return Optional Reporting Hierarchy - If not selected the default hierarchy trees are used. */
public int getPA_Hierarchy_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_PA_Hierarchy_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="e130e5e0-b45a-0cf6-fce0-a088a95da07e")
public static String es_PE_FIELD_ReportingHierarchy_ReportingHierarchy_Name="Reportando Jerarquías";

@XendraTrl(Identifier="e130e5e0-b45a-0cf6-fce0-a088a95da07e")
public static String es_PE_FIELD_ReportingHierarchy_ReportingHierarchy_Description="Reporte Opcional de Jerarquías - Si no seleccionó se emplea el árbol predeterminado de jerarquías";

@XendraTrl(Identifier="e130e5e0-b45a-0cf6-fce0-a088a95da07e")
public static String es_PE_FIELD_ReportingHierarchy_ReportingHierarchy_Help="Reportar Jerarquías le permite seleccionar diferentes Jerarquías/Árboles para el Reoporte.Segmentos contables deseadosm Organizaciones, Cuentas, Productos pueden tener algunas jerarquías para acomodar siferentes vistas acerca del negocio.";

@XendraField(AD_Column_ID="PA_Hierarchy_ID",IsCentrallyMaintained=true,
AD_Tab_ID="c2ee2ad8-e9b6-f03a-22e6-ba90b46f5184",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e130e5e0-b45a-0cf6-fce0-a088a95da07e")
public static final String FIELDNAME_ReportingHierarchy_ReportingHierarchy="e130e5e0-b45a-0cf6-fce0-a088a95da07e";
/** Column name PA_Hierarchy_ID */
public static final String COLUMNNAME_PA_Hierarchy_ID = "PA_Hierarchy_ID";
}
