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
/** Generated Model for A_Asset
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_A_Asset extends PO
{
/** Standard Constructor
@param ctx context
@param A_Asset_ID id
@param trxName transaction
*/
public X_A_Asset (Properties ctx, int A_Asset_ID, String trxName)
{
super (ctx, A_Asset_ID, trxName);
/** if (A_Asset_ID == 0)
{
setA_Asset_Group_ID (0);
setA_Asset_ID (0);
setC_BPartner_Location_ID (0);
setIsDepreciated (false);	
// N
setIsDisposed (false);	
// N
setIsFullyDepreciated (false);	
// N
setIsInPosession (false);	
// N
setIsOwned (false);	
// N
setM_AttributeSetInstance_ID (0);
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
public X_A_Asset (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=539 */
public static int Table_ID=MTable.getTable_ID("A_Asset");

@XendraTrl(Identifier="4f87ac11-81f6-543e-7e3e-291a85884206")
public static String es_PE_TAB_Asset_Description="Activo de un Cliente usado internamente";

@XendraTrl(Identifier="4f87ac11-81f6-543e-7e3e-291a85884206")
public static String es_PE_TAB_Asset_Name="Activo";

@XendraTrl(Identifier="4f87ac11-81f6-543e-7e3e-291a85884206")
public static String es_PE_TAB_Asset_Help="Un activo es creado comprando ó entregando un producto. Un activo puede ser utilizado internamente ó ser un activo del cliente.";

@XendraTab(Name="Asset",Description="Asset used internally or by customers",
Help="An asset is either created by purchasing or by delivering a product.  An asset can be used internally or be a customer asset.",
AD_Window_ID="53561d65-4ae5-81a3-c14b-9b09382be0fe",SeqNo=10,TabLevel=0,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="4f87ac11-81f6-543e-7e3e-291a85884206",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Asset="4f87ac11-81f6-543e-7e3e-291a85884206";

@XendraTrl(Identifier="d008ef58-b109-b177-118e-ca3a523b2aa6")
public static String es_PE_TAB_PartnerAssets_Description="Activos Socio de Negocio";

@XendraTrl(Identifier="d008ef58-b109-b177-118e-ca3a523b2aa6")
public static String es_PE_TAB_PartnerAssets_Name="Activos Socio de Negocio";

@XendraTab(Name="Partner Assets",Description="Business Partner Assets",Help="",
AD_Window_ID="57133321-6993-bd92-eb4e-d35c10b15e95",SeqNo=60,TabLevel=1,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=true,AD_Column_ID="",HasTree=false,
WhereClause="A_Asset.C_BPartner_ID=@C_BPartner_ID@",OrderByClause="",CommitWarning="",
AD_Process_ID="",AD_ColumnSortOrder_ID="",AD_ColumnSortYesNo_ID="",IsSortTab=false,
Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",IsInsertRecord=false,IsAdvancedTab=false,
Parent_Column_ID="",Identifier="d008ef58-b109-b177-118e-ca3a523b2aa6",
Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_PartnerAssets="d008ef58-b109-b177-118e-ca3a523b2aa6";

@XendraTrl(Identifier="f0ee5272-ed55-e759-6d1d-1a52c4b8540f")
public static String es_PE_TABLE_A_Asset_Name="Activo";

@XendraTable(Name="Asset",Description="Asset used internally or by customers",Help="",
TableName="A_Asset",AccessLevel="3",AD_Window_ID="53561d65-4ae5-81a3-c14b-9b09382be0fe",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=120,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.asset",
Identifier="f0ee5272-ed55-e759-6d1d-1a52c4b8540f",Synchronized="2017-08-16 11:39:55.0")
/** TableName=A_Asset */
public static final String Table_Name="A_Asset";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"A_Asset");

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
    Table_ID = MTable.getTable_ID("A_Asset");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_A_Asset[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Asset Group.
@param A_Asset_Group_ID Group of Assets */
public void setA_Asset_Group_ID (int A_Asset_Group_ID)
{
if (A_Asset_Group_ID < 1) throw new IllegalArgumentException ("A_Asset_Group_ID is mandatory.");
set_Value (COLUMNNAME_A_Asset_Group_ID, Integer.valueOf(A_Asset_Group_ID));
}
/** Get Asset Group.
@return Group of Assets */
public int getA_Asset_Group_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_A_Asset_Group_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="30e9817e-dd8f-63dc-fbcb-442956abd7c0")
public static String es_PE_FIELD_Asset_AssetGroup_Description="Grupo de Activos";

@XendraTrl(Identifier="30e9817e-dd8f-63dc-fbcb-442956abd7c0")
public static String es_PE_FIELD_Asset_AssetGroup_Help="El grupo de activos determina cuentas por defaul. Si un grupo del activo se selecciona en la categoría de producto, se crean los activos al entregar el activo.";

@XendraTrl(Identifier="30e9817e-dd8f-63dc-fbcb-442956abd7c0")
public static String es_PE_FIELD_Asset_AssetGroup_Name="Grupo de Activos";

@XendraField(AD_Column_ID="A_Asset_Group_ID",IsCentrallyMaintained=true,
AD_Tab_ID="4f87ac11-81f6-543e-7e3e-291a85884206",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=150,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="30e9817e-dd8f-63dc-fbcb-442956abd7c0")
public static final String FIELDNAME_Asset_AssetGroup="30e9817e-dd8f-63dc-fbcb-442956abd7c0";

@XendraTrl(Identifier="f449590d-1d97-2f4c-1799-fe977108db42")
public static String es_PE_FIELD_PartnerAssets_AssetGroup_Description="Grupo de Activos";

@XendraTrl(Identifier="f449590d-1d97-2f4c-1799-fe977108db42")
public static String es_PE_FIELD_PartnerAssets_AssetGroup_Help="El grupo de activos determina cuentas por defaul. Si un grupo del activo se selecciona en la categoría de producto, se crean los activos al entregar el activo.";

@XendraTrl(Identifier="f449590d-1d97-2f4c-1799-fe977108db42")
public static String es_PE_FIELD_PartnerAssets_AssetGroup_Name="Grupo de Activos";

@XendraField(AD_Column_ID="A_Asset_Group_ID",IsCentrallyMaintained=true,
AD_Tab_ID="d008ef58-b109-b177-118e-ca3a523b2aa6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=40,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f449590d-1d97-2f4c-1799-fe977108db42")
public static final String FIELDNAME_PartnerAssets_AssetGroup="f449590d-1d97-2f4c-1799-fe977108db42";

@XendraTrl(Identifier="8068ecce-9a91-6bd0-88d1-3981bd90c2e1")
public static String es_PE_COLUMN_A_Asset_Group_ID_Name="Grupo de Activos";

@XendraColumn(AD_Element_ID="3a79bddc-9d44-ce11-0e83-79f37639b27e",ColumnName="A_Asset_Group_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="8068ecce-9a91-6bd0-88d1-3981bd90c2e1",
Synchronized="2017-08-05 16:52:15.0")
/** Column name A_Asset_Group_ID */
public static final String COLUMNNAME_A_Asset_Group_ID = "A_Asset_Group_ID";
/** Set Asset.
@param A_Asset_ID Asset used internally or by customers */
public void setA_Asset_ID (int A_Asset_ID)
{
if (A_Asset_ID < 1) throw new IllegalArgumentException ("A_Asset_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_A_Asset_ID, Integer.valueOf(A_Asset_ID));
}
/** Get Asset.
@return Asset used internally or by customers */
public int getA_Asset_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_A_Asset_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="a6632248-8b9f-4377-f6fb-c22ea9aaf943")
public static String es_PE_FIELD_Asset_Asset_Description="Activo usado por la compañía o sus clientes";

@XendraTrl(Identifier="a6632248-8b9f-4377-f6fb-c22ea9aaf943")
public static String es_PE_FIELD_Asset_Asset_Help="Indica si es usado por la compañia o sus clientes";

@XendraTrl(Identifier="a6632248-8b9f-4377-f6fb-c22ea9aaf943")
public static String es_PE_FIELD_Asset_Asset_Name="Activo";
@XendraField(AD_Column_ID="A_Asset_ID",
IsCentrallyMaintained=true,AD_Tab_ID="4f87ac11-81f6-543e-7e3e-291a85884206",AD_FieldGroup_ID="",
IsDisplayed=false,DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="a6632248-8b9f-4377-f6fb-c22ea9aaf943")
public static final String FIELDNAME_Asset_Asset="a6632248-8b9f-4377-f6fb-c22ea9aaf943";

@XendraTrl(Identifier="8de146cb-4a22-8969-695d-848b080189cd")
public static String es_PE_FIELD_PartnerAssets_Asset_Description="Activo usado por la compañía o sus clientes";

@XendraTrl(Identifier="8de146cb-4a22-8969-695d-848b080189cd")
public static String es_PE_FIELD_PartnerAssets_Asset_Help="Indica si es usado por la compañia o sus clientes";

@XendraTrl(Identifier="8de146cb-4a22-8969-695d-848b080189cd")
public static String es_PE_FIELD_PartnerAssets_Asset_Name="Activo";

@XendraField(AD_Column_ID="A_Asset_ID",IsCentrallyMaintained=true,
AD_Tab_ID="d008ef58-b109-b177-118e-ca3a523b2aa6",AD_FieldGroup_ID="Reference",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8de146cb-4a22-8969-695d-848b080189cd")
public static final String FIELDNAME_PartnerAssets_Asset="8de146cb-4a22-8969-695d-848b080189cd";
/** Column name A_Asset_ID */
public static final String COLUMNNAME_A_Asset_ID = "A_Asset_ID";
/** Set User/Contact.
@param AD_User_ID User within the system - Internal or Business Partner Contact */
public void setAD_User_ID (int AD_User_ID)
{
if (AD_User_ID <= 0) set_Value (COLUMNNAME_AD_User_ID, null);
 else 
set_Value (COLUMNNAME_AD_User_ID, Integer.valueOf(AD_User_ID));
}
/** Get User/Contact.
@return User within the system - Internal or Business Partner Contact */
public int getAD_User_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_User_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="78d40763-ead7-7a42-1ccd-d9ea7b868ad6")
public static String es_PE_FIELD_Asset_UserContact_Description="ID de Usuario dentro del sistema";

@XendraTrl(Identifier="78d40763-ead7-7a42-1ccd-d9ea7b868ad6")
public static String es_PE_FIELD_Asset_UserContact_Help="La ID de usuario identifica un usuario único en el sistema";

@XendraTrl(Identifier="78d40763-ead7-7a42-1ccd-d9ea7b868ad6")
public static String es_PE_FIELD_Asset_UserContact_Name="Usuario";

@XendraField(AD_Column_ID="AD_User_ID",IsCentrallyMaintained=true,
AD_Tab_ID="4f87ac11-81f6-543e-7e3e-291a85884206",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsInPosession@=N",DisplayLength=14,IsReadOnly=false,SeqNo=240,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="78d40763-ead7-7a42-1ccd-d9ea7b868ad6")
public static final String FIELDNAME_Asset_UserContact="78d40763-ead7-7a42-1ccd-d9ea7b868ad6";

@XendraTrl(Identifier="e6827a5d-4f8e-5976-74fc-d54ef01dae5c")
public static String es_PE_FIELD_PartnerAssets_UserContact_Description="ID de Usuario dentro del sistema";

@XendraTrl(Identifier="e6827a5d-4f8e-5976-74fc-d54ef01dae5c")
public static String es_PE_FIELD_PartnerAssets_UserContact_Help="La ID de usuario identifica un usuario único en el sistema";

@XendraTrl(Identifier="e6827a5d-4f8e-5976-74fc-d54ef01dae5c")
public static String es_PE_FIELD_PartnerAssets_UserContact_Name="Usuario";

@XendraField(AD_Column_ID="AD_User_ID",IsCentrallyMaintained=true,
AD_Tab_ID="d008ef58-b109-b177-118e-ca3a523b2aa6",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e6827a5d-4f8e-5976-74fc-d54ef01dae5c")
public static final String FIELDNAME_PartnerAssets_UserContact="e6827a5d-4f8e-5976-74fc-d54ef01dae5c";

@XendraTrl(Identifier="401e0897-ce1d-4998-5b58-36bc4c3b1b15")
public static String es_PE_COLUMN_AD_User_ID_Name="Usuario";

@XendraColumn(AD_Element_ID="abdf8dee-d3cd-73ec-c758-683e907797f4",ColumnName="AD_User_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="f4ac36a1-4200-1386-677e-14ac90afb4fe",
FieldLength=22,DefaultValue="-1",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="401e0897-ce1d-4998-5b58-36bc4c3b1b15",Synchronized="2017-08-05 16:52:16.0")
/** Column name AD_User_ID */
public static final String COLUMNNAME_AD_User_ID = "AD_User_ID";
/** Set Asset Depreciation Date.
@param AssetDepreciationDate Date of last depreciation */
public void setAssetDepreciationDate (Timestamp AssetDepreciationDate)
{
set_Value (COLUMNNAME_AssetDepreciationDate, AssetDepreciationDate);
}
/** Get Asset Depreciation Date.
@return Date of last depreciation */
public Timestamp getAssetDepreciationDate() 
{
return (Timestamp)get_Value(COLUMNNAME_AssetDepreciationDate);
}

@XendraTrl(Identifier="50761368-ec50-400c-cc94-664e3f65f5d6")
public static String es_PE_FIELD_Asset_AssetDepreciationDate_Description="Fecha de depreciación pasada. ";

@XendraTrl(Identifier="50761368-ec50-400c-cc94-664e3f65f5d6")
public static String es_PE_FIELD_Asset_AssetDepreciationDate_Help="Fecha de la depreciación pasada, si el activo se utiliza internamente y se deprecia.";

@XendraTrl(Identifier="50761368-ec50-400c-cc94-664e3f65f5d6")
public static String es_PE_FIELD_Asset_AssetDepreciationDate_Name="Fecha de Amortización del Activo";

@XendraField(AD_Column_ID="AssetDepreciationDate",IsCentrallyMaintained=true,
AD_Tab_ID="4f87ac11-81f6-543e-7e3e-291a85884206",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsOwned@=Y & @IsDepeciated@=Y",DisplayLength=14,IsReadOnly=false,SeqNo=400,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="50761368-ec50-400c-cc94-664e3f65f5d6")
public static final String FIELDNAME_Asset_AssetDepreciationDate="50761368-ec50-400c-cc94-664e3f65f5d6";

@XendraTrl(Identifier="5b2049ed-78b0-78b7-eb01-073182d64eba")
public static String es_PE_FIELD_PartnerAssets_AssetDepreciationDate_Description="Fecha de depreciación pasada. ";

@XendraTrl(Identifier="5b2049ed-78b0-78b7-eb01-073182d64eba")
public static String es_PE_FIELD_PartnerAssets_AssetDepreciationDate_Help="Fecha de la depreciación pasada, si el activo se utiliza internamente y se deprecia.";

@XendraTrl(Identifier="5b2049ed-78b0-78b7-eb01-073182d64eba")
public static String es_PE_FIELD_PartnerAssets_AssetDepreciationDate_Name="Fecha de Amortización del Activo";

@XendraField(AD_Column_ID="AssetDepreciationDate",IsCentrallyMaintained=true,
AD_Tab_ID="d008ef58-b109-b177-118e-ca3a523b2aa6",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5b2049ed-78b0-78b7-eb01-073182d64eba")
public static final String FIELDNAME_PartnerAssets_AssetDepreciationDate="5b2049ed-78b0-78b7-eb01-073182d64eba";

@XendraTrl(Identifier="0e71d0c3-d0ba-a15d-919a-7426761c35ba")
public static String es_PE_COLUMN_AssetDepreciationDate_Name="Fecha de Amortización del Activo";

@XendraColumn(AD_Element_ID="811f9b21-6759-0392-6660-b2f90e0b4a7b",
ColumnName="AssetDepreciationDate",AD_Reference_ID=15,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=7,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="0e71d0c3-d0ba-a15d-919a-7426761c35ba",Synchronized="2017-08-05 16:52:16.0")
/** Column name AssetDepreciationDate */
public static final String COLUMNNAME_AssetDepreciationDate = "AssetDepreciationDate";
/** Set Asset Disposal Date.
@param AssetDisposalDate Date when the asset is/was disposed */
public void setAssetDisposalDate (Timestamp AssetDisposalDate)
{
set_Value (COLUMNNAME_AssetDisposalDate, AssetDisposalDate);
}
/** Get Asset Disposal Date.
@return Date when the asset is/was disposed */
public Timestamp getAssetDisposalDate() 
{
return (Timestamp)get_Value(COLUMNNAME_AssetDisposalDate);
}

@XendraTrl(Identifier="79c2e50e-aa4c-1b82-0d84-0626fb8b545c")
public static String es_PE_FIELD_Asset_AssetDisposalDate_Description="Fecha desde/cuando el activo esta dispuesto";

@XendraTrl(Identifier="79c2e50e-aa4c-1b82-0d84-0626fb8b545c")
public static String es_PE_FIELD_Asset_AssetDisposalDate_Name="Fecha de Disposición del Activo";

@XendraField(AD_Column_ID="AssetDisposalDate",IsCentrallyMaintained=true,
AD_Tab_ID="4f87ac11-81f6-543e-7e3e-291a85884206",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsDisposed@=Y",DisplayLength=14,IsReadOnly=false,SeqNo=420,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="79c2e50e-aa4c-1b82-0d84-0626fb8b545c")
public static final String FIELDNAME_Asset_AssetDisposalDate="79c2e50e-aa4c-1b82-0d84-0626fb8b545c";

@XendraTrl(Identifier="36818d9b-f622-04df-3e57-58779732328c")
public static String es_PE_FIELD_PartnerAssets_AssetDisposalDate_Description="Fecha desde/cuando el activo esta dispuesto";

@XendraTrl(Identifier="36818d9b-f622-04df-3e57-58779732328c")
public static String es_PE_FIELD_PartnerAssets_AssetDisposalDate_Name="Fecha de Disposición del Activo";

@XendraField(AD_Column_ID="AssetDisposalDate",IsCentrallyMaintained=true,
AD_Tab_ID="d008ef58-b109-b177-118e-ca3a523b2aa6",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="36818d9b-f622-04df-3e57-58779732328c")
public static final String FIELDNAME_PartnerAssets_AssetDisposalDate="36818d9b-f622-04df-3e57-58779732328c";

@XendraTrl(Identifier="f079a8ea-1227-e650-2f55-1a3b38e756a7")
public static String es_PE_COLUMN_AssetDisposalDate_Name="Fecha de Disposición del Activo";

@XendraColumn(AD_Element_ID="d6e1a5b0-33d2-0847-4350-95dd55fc1dc5",ColumnName="AssetDisposalDate",
AD_Reference_ID=15,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f079a8ea-1227-e650-2f55-1a3b38e756a7",
Synchronized="2017-08-05 16:52:16.0")
/** Column name AssetDisposalDate */
public static final String COLUMNNAME_AssetDisposalDate = "AssetDisposalDate";
/** Set In Service Date.
@param AssetServiceDate Date when Asset was put into service */
public void setAssetServiceDate (Timestamp AssetServiceDate)
{
set_Value (COLUMNNAME_AssetServiceDate, AssetServiceDate);
}
/** Get In Service Date.
@return Date when Asset was put into service */
public Timestamp getAssetServiceDate() 
{
return (Timestamp)get_Value(COLUMNNAME_AssetServiceDate);
}

@XendraTrl(Identifier="095125e0-2019-5d6d-a8c9-965008f7308d")
public static String es_PE_FIELD_Asset_InServiceDate_Description="Fecha cuando el activo ha sido puesto en servicio";

@XendraTrl(Identifier="095125e0-2019-5d6d-a8c9-965008f7308d")
public static String es_PE_FIELD_Asset_InServiceDate_Help="La fecha en que el activo fue puesto en servicio - usado generalmente como fecha del comienzo para la depreciación.";

@XendraTrl(Identifier="095125e0-2019-5d6d-a8c9-965008f7308d")
public static String es_PE_FIELD_Asset_InServiceDate_Name="En Fecha de Servicio";

@XendraField(AD_Column_ID="AssetServiceDate",IsCentrallyMaintained=true,
AD_Tab_ID="4f87ac11-81f6-543e-7e3e-291a85884206",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=130,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="095125e0-2019-5d6d-a8c9-965008f7308d")
public static final String FIELDNAME_Asset_InServiceDate="095125e0-2019-5d6d-a8c9-965008f7308d";

@XendraTrl(Identifier="d07ff09c-f45f-d2b0-f5cd-da4f1430100d")
public static String es_PE_FIELD_PartnerAssets_InServiceDate_Description="Fecha cuando el activo ha sido puesto en servicio";

@XendraTrl(Identifier="d07ff09c-f45f-d2b0-f5cd-da4f1430100d")
public static String es_PE_FIELD_PartnerAssets_InServiceDate_Help="La fecha en que el activo fue puesto en servicio - usado generalmente como fecha del comienzo para la depreciación.";

@XendraTrl(Identifier="d07ff09c-f45f-d2b0-f5cd-da4f1430100d")
public static String es_PE_FIELD_PartnerAssets_InServiceDate_Name="En Fecha de Servicio";

@XendraField(AD_Column_ID="AssetServiceDate",IsCentrallyMaintained=true,
AD_Tab_ID="d008ef58-b109-b177-118e-ca3a523b2aa6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=120,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d07ff09c-f45f-d2b0-f5cd-da4f1430100d")
public static final String FIELDNAME_PartnerAssets_InServiceDate="d07ff09c-f45f-d2b0-f5cd-da4f1430100d";

@XendraTrl(Identifier="40141884-e88c-78c0-74d5-383ada139349")
public static String es_PE_COLUMN_AssetServiceDate_Name="En Fecha de Servicio";

@XendraColumn(AD_Element_ID="cef463b7-4708-9a3d-c88d-445ecacd44a3",ColumnName="AssetServiceDate",
AD_Reference_ID=15,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="40141884-e88c-78c0-74d5-383ada139349",
Synchronized="2017-08-05 16:52:16.0")
/** Column name AssetServiceDate */
public static final String COLUMNNAME_AssetServiceDate = "AssetServiceDate";
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

@XendraTrl(Identifier="d9f11424-b932-1c92-40e3-1303dbaddbc5")
public static String es_PE_FIELD_Asset_BusinessPartner_Description="Identifica un Socio de Negocio";

@XendraTrl(Identifier="d9f11424-b932-1c92-40e3-1303dbaddbc5")
public static String es_PE_FIELD_Asset_BusinessPartner_Help="Un socio de negocio es cualquiera con quien usted realiza transacciones. Este puede incluir Proveedores; Clientes; Empleados ó Vendedores.";

@XendraTrl(Identifier="d9f11424-b932-1c92-40e3-1303dbaddbc5")
public static String es_PE_FIELD_Asset_BusinessPartner_Name="Socio de Negocio";

@XendraField(AD_Column_ID="C_BPartner_ID",IsCentrallyMaintained=true,
AD_Tab_ID="4f87ac11-81f6-543e-7e3e-291a85884206",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsInPosession@=N",DisplayLength=26,IsReadOnly=false,SeqNo=210,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="d9f11424-b932-1c92-40e3-1303dbaddbc5")
public static final String FIELDNAME_Asset_BusinessPartner="d9f11424-b932-1c92-40e3-1303dbaddbc5";

@XendraTrl(Identifier="b14164a4-64d5-8c47-7cdb-bcd078d4f2d4")
public static String es_PE_FIELD_PartnerAssets_BusinessPartner_Description="Identifica un Socio de Negocio";

@XendraTrl(Identifier="b14164a4-64d5-8c47-7cdb-bcd078d4f2d4")
public static String es_PE_FIELD_PartnerAssets_BusinessPartner_Help="Un socio de negocio es cualquiera con quien usted realiza transacciones. Este puede incluir Proveedores; Clientes; Empleados ó Vendedores.";

@XendraTrl(Identifier="b14164a4-64d5-8c47-7cdb-bcd078d4f2d4")
public static String es_PE_FIELD_PartnerAssets_BusinessPartner_Name="Socio de Negocio";

@XendraField(AD_Column_ID="C_BPartner_ID",IsCentrallyMaintained=true,
AD_Tab_ID="d008ef58-b109-b177-118e-ca3a523b2aa6",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b14164a4-64d5-8c47-7cdb-bcd078d4f2d4")
public static final String FIELDNAME_PartnerAssets_BusinessPartner="b14164a4-64d5-8c47-7cdb-bcd078d4f2d4";

@XendraTrl(Identifier="9775e654-447e-7d74-44e6-c9edbc9fbc39")
public static String es_PE_COLUMN_C_BPartner_ID_Name="Socio de Negocio";

@XendraColumn(AD_Element_ID="fe333dc3-4f40-1276-5f6a-d09bb66dc423",ColumnName="C_BPartner_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="06fdbbe9-e1c4-3ee4-4a9d-73d1a990cc42",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="9775e654-447e-7d74-44e6-c9edbc9fbc39",Synchronized="2017-08-05 16:52:16.0")
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

@XendraTrl(Identifier="14903e7f-c498-0bc4-c65f-d83582bbd31a")
public static String es_PE_FIELD_Asset_PartnerLocation_Description="Identifica la dirección para este socio de negocio";

@XendraTrl(Identifier="14903e7f-c498-0bc4-c65f-d83582bbd31a")
public static String es_PE_FIELD_Asset_PartnerLocation_Help="La dirección de un socio indica la ubicación de un socio de negocio";

@XendraTrl(Identifier="14903e7f-c498-0bc4-c65f-d83582bbd31a")
public static String es_PE_FIELD_Asset_PartnerLocation_Name="Dirección del Socio del Negocio";

@XendraField(AD_Column_ID="C_BPartner_Location_ID",IsCentrallyMaintained=true,
AD_Tab_ID="4f87ac11-81f6-543e-7e3e-291a85884206",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsInPosession@=N",DisplayLength=14,IsReadOnly=false,SeqNo=230,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="14903e7f-c498-0bc4-c65f-d83582bbd31a")
public static final String FIELDNAME_Asset_PartnerLocation="14903e7f-c498-0bc4-c65f-d83582bbd31a";

@XendraTrl(Identifier="87e56d27-b9cd-d0df-6be0-6895f011b77d")
public static String es_PE_FIELD_PartnerAssets_PartnerLocation_Description="Identifica la dirección para este socio de negocio";

@XendraTrl(Identifier="87e56d27-b9cd-d0df-6be0-6895f011b77d")
public static String es_PE_FIELD_PartnerAssets_PartnerLocation_Help="La dirección de un socio indica la ubicación de un socio de negocio";

@XendraTrl(Identifier="87e56d27-b9cd-d0df-6be0-6895f011b77d")
public static String es_PE_FIELD_PartnerAssets_PartnerLocation_Name="Dirección del Socio del Negocio";

@XendraField(AD_Column_ID="C_BPartner_Location_ID",IsCentrallyMaintained=true,
AD_Tab_ID="d008ef58-b109-b177-118e-ca3a523b2aa6",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="87e56d27-b9cd-d0df-6be0-6895f011b77d")
public static final String FIELDNAME_PartnerAssets_PartnerLocation="87e56d27-b9cd-d0df-6be0-6895f011b77d";

@XendraTrl(Identifier="2c5a0680-de14-746f-814d-65e222918336")
public static String es_PE_COLUMN_C_BPartner_Location_ID_Name="Dirección del Socio del Negocio";

@XendraColumn(AD_Element_ID="0dab7dc6-2832-26dc-2462-cba2d40235f2",
ColumnName="C_BPartner_Location_ID",AD_Reference_ID=19,AD_Reference_Value_ID="",
AD_Val_Rule_ID="3b3664f5-7792-d41b-d8c1-1ed3b015f0c1",FieldLength=22,DefaultValue="",IsKey=false,
IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2c5a0680-de14-746f-814d-65e222918336",
Synchronized="2017-08-05 16:52:16.0")
/** Column name C_BPartner_Location_ID */
public static final String COLUMNNAME_C_BPartner_Location_ID = "C_BPartner_Location_ID";

/** C_BPartnerSR_ID AD_Reference=c6cc3f47-f990-9f4c-33c8-27d755ea2c25 */
public static final int C_BPARTNERSR_ID_AD_Reference_ID=353;
/** Set BPartner (Agent).
@param C_BPartnerSR_ID Business Partner (Agent or Sales Rep) */
public void setC_BPartnerSR_ID (int C_BPartnerSR_ID)
{
if (C_BPartnerSR_ID <= 0) set_Value (COLUMNNAME_C_BPartnerSR_ID, null);
 else 
set_Value (COLUMNNAME_C_BPartnerSR_ID, Integer.valueOf(C_BPartnerSR_ID));
}
/** Get BPartner (Agent).
@return Business Partner (Agent or Sales Rep) */
public int getC_BPartnerSR_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_BPartnerSR_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="f8ebe2d4-f888-aad8-b373-b43feeb80a2a")
public static String es_PE_FIELD_Asset_BPartnerAgent_Description="Socio del Negocio (Agente o rep Ventas)";

@XendraTrl(Identifier="f8ebe2d4-f888-aad8-b373-b43feeb80a2a")
public static String es_PE_FIELD_Asset_BPartnerAgent_Name="SNegocio (Agente)";

@XendraField(AD_Column_ID="C_BPartnerSR_ID",IsCentrallyMaintained=true,
AD_Tab_ID="4f87ac11-81f6-543e-7e3e-291a85884206",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsInPosession@=N",DisplayLength=10,IsReadOnly=false,SeqNo=220,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="f8ebe2d4-f888-aad8-b373-b43feeb80a2a")
public static final String FIELDNAME_Asset_BPartnerAgent="f8ebe2d4-f888-aad8-b373-b43feeb80a2a";

@XendraTrl(Identifier="0849fb5d-b888-76f2-b39e-a951d57f24af")
public static String es_PE_COLUMN_C_BPartnerSR_ID_Name="SNegocio (Agente)";

@XendraColumn(AD_Element_ID="38bec27d-346b-13e8-e9a6-d4668cd3fade",ColumnName="C_BPartnerSR_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="c6cc3f47-f990-9f4c-33c8-27d755ea2c25",AD_Val_Rule_ID="",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="0849fb5d-b888-76f2-b39e-a951d57f24af",Synchronized="2017-08-05 16:52:16.0")
/** Column name C_BPartnerSR_ID */
public static final String COLUMNNAME_C_BPartnerSR_ID = "C_BPartnerSR_ID";
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

@XendraTrl(Identifier="951735f3-1983-d64a-64c3-5446afcf87cc")
public static String es_PE_FIELD_Asset_Address_Description="Ubicación ó dirección";

@XendraTrl(Identifier="951735f3-1983-d64a-64c3-5446afcf87cc")
public static String es_PE_FIELD_Asset_Address_Help="El campo Ubicación / Dirección define la ubicación de una entidad.";

@XendraTrl(Identifier="951735f3-1983-d64a-64c3-5446afcf87cc")
public static String es_PE_FIELD_Asset_Address_Name="Localización / Dirección";

@XendraField(AD_Column_ID="C_Location_ID",IsCentrallyMaintained=true,
AD_Tab_ID="4f87ac11-81f6-543e-7e3e-291a85884206",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsInPosession@=N",DisplayLength=26,IsReadOnly=true,SeqNo=250,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="951735f3-1983-d64a-64c3-5446afcf87cc")
public static final String FIELDNAME_Asset_Address="951735f3-1983-d64a-64c3-5446afcf87cc";

@XendraTrl(Identifier="925a5bf2-2f41-36a4-09d4-7bac3fe6fc01")
public static String es_PE_FIELD_PartnerAssets_Address_Description="Ubicación ó dirección";

@XendraTrl(Identifier="925a5bf2-2f41-36a4-09d4-7bac3fe6fc01")
public static String es_PE_FIELD_PartnerAssets_Address_Help="El campo Ubicación / Dirección define la ubicación de una entidad.";

@XendraTrl(Identifier="925a5bf2-2f41-36a4-09d4-7bac3fe6fc01")
public static String es_PE_FIELD_PartnerAssets_Address_Name="Localización / Dirección";

@XendraField(AD_Column_ID="C_Location_ID",IsCentrallyMaintained=true,
AD_Tab_ID="d008ef58-b109-b177-118e-ca3a523b2aa6",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="925a5bf2-2f41-36a4-09d4-7bac3fe6fc01")
public static final String FIELDNAME_PartnerAssets_Address="925a5bf2-2f41-36a4-09d4-7bac3fe6fc01";

@XendraTrl(Identifier="259046d0-cb4a-aff0-815d-29d59d71a9f2")
public static String es_PE_COLUMN_C_Location_ID_Name="Localización / Dirección";

@XendraColumn(AD_Element_ID="e66e22a8-535b-2af2-6efb-aa600959a885",ColumnName="C_Location_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="259046d0-cb4a-aff0-815d-29d59d71a9f2",
Synchronized="2017-08-05 16:52:16.0")
/** Column name C_Location_ID */
public static final String COLUMNNAME_C_Location_ID = "C_Location_ID";
/** Set Project.
@param C_Project_ID Financial Project */
public void setC_Project_ID (int C_Project_ID)
{
if (C_Project_ID <= 0) set_Value (COLUMNNAME_C_Project_ID, null);
 else 
set_Value (COLUMNNAME_C_Project_ID, Integer.valueOf(C_Project_ID));
}
/** Get Project.
@return Financial Project */
public int getC_Project_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Project_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="e552e0d7-7695-5d10-6241-6c65e0b80bd4")
public static String es_PE_FIELD_Asset_Project_Description="Identifica un proyecto único";

@XendraTrl(Identifier="e552e0d7-7695-5d10-6241-6c65e0b80bd4")
public static String es_PE_FIELD_Asset_Project_Help="La ID de un proyecto es un identificador definido por el usuario para un proyecto";

@XendraTrl(Identifier="e552e0d7-7695-5d10-6241-6c65e0b80bd4")
public static String es_PE_FIELD_Asset_Project_Name="Proyecto";

@XendraField(AD_Column_ID="C_Project_ID",IsCentrallyMaintained=true,
AD_Tab_ID="4f87ac11-81f6-543e-7e3e-291a85884206",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=280,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e552e0d7-7695-5d10-6241-6c65e0b80bd4")
public static final String FIELDNAME_Asset_Project="e552e0d7-7695-5d10-6241-6c65e0b80bd4";

@XendraTrl(Identifier="2a1c944e-28c2-0cb1-1120-71d33be2209b")
public static String es_PE_COLUMN_C_Project_ID_Name="Proyecto";

@XendraColumn(AD_Element_ID="16ff5dcc-9178-73dd-e618-e88bd79d573b",ColumnName="C_Project_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="961cbc99-cc24-46df-b94e-37fe139285bf",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="2a1c944e-28c2-0cb1-1120-71d33be2209b",Synchronized="2017-08-05 16:52:16.0")
/** Column name C_Project_ID */
public static final String COLUMNNAME_C_Project_ID = "C_Project_ID";
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

@XendraTrl(Identifier="d9632f8f-728c-96e1-0f0a-a5c6216a8eff")
public static String es_PE_FIELD_Asset_Description_Description="Observación corta opcional del registro";

@XendraTrl(Identifier="d9632f8f-728c-96e1-0f0a-a5c6216a8eff")
public static String es_PE_FIELD_Asset_Description_Help="Una Observación esta limitada a 255 caracteres";

@XendraTrl(Identifier="d9632f8f-728c-96e1-0f0a-a5c6216a8eff")
public static String es_PE_FIELD_Asset_Description_Name="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="4f87ac11-81f6-543e-7e3e-291a85884206",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d9632f8f-728c-96e1-0f0a-a5c6216a8eff")
public static final String FIELDNAME_Asset_Description="d9632f8f-728c-96e1-0f0a-a5c6216a8eff";

@XendraTrl(Identifier="0a2f9e39-39bb-6b24-ed05-67380151685a")
public static String es_PE_FIELD_PartnerAssets_Description_Description="Observación";

@XendraTrl(Identifier="0a2f9e39-39bb-6b24-ed05-67380151685a")
public static String es_PE_FIELD_PartnerAssets_Description_Help="Observación";

@XendraTrl(Identifier="0a2f9e39-39bb-6b24-ed05-67380151685a")
public static String es_PE_FIELD_PartnerAssets_Description_Name="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="d008ef58-b109-b177-118e-ca3a523b2aa6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0a2f9e39-39bb-6b24-ed05-67380151685a")
public static final String FIELDNAME_PartnerAssets_Description="0a2f9e39-39bb-6b24-ed05-67380151685a";

@XendraTrl(Identifier="6209570b-1d29-bdb0-01fc-58e3a08f1c0c")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6209570b-1d29-bdb0-01fc-58e3a08f1c0c",
Synchronized="2017-08-05 16:52:16.0")
/** Column name Description */
public static final String COLUMNNAME_Description = "Description";
/** Set Guarantee Date.
@param GuaranteeDate Date when guarantee expires */
public void setGuaranteeDate (Timestamp GuaranteeDate)
{
set_Value (COLUMNNAME_GuaranteeDate, GuaranteeDate);
}
/** Get Guarantee Date.
@return Date when guarantee expires */
public Timestamp getGuaranteeDate() 
{
return (Timestamp)get_Value(COLUMNNAME_GuaranteeDate);
}

@XendraTrl(Identifier="d547e47a-0e72-9a2f-4617-a3c5e2eb3569")
public static String es_PE_FIELD_Asset_GuaranteeDate_Description="Fecha cuando la garantía expira";

@XendraTrl(Identifier="d547e47a-0e72-9a2f-4617-a3c5e2eb3569")
public static String es_PE_FIELD_Asset_GuaranteeDate_Help="Fecha cuando la garantía ó disponibilidad normal expira";

@XendraTrl(Identifier="d547e47a-0e72-9a2f-4617-a3c5e2eb3569")
public static String es_PE_FIELD_Asset_GuaranteeDate_Name="Fecha de Garantía";

@XendraField(AD_Column_ID="GuaranteeDate",IsCentrallyMaintained=true,
AD_Tab_ID="4f87ac11-81f6-543e-7e3e-291a85884206",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=140,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d547e47a-0e72-9a2f-4617-a3c5e2eb3569")
public static final String FIELDNAME_Asset_GuaranteeDate="d547e47a-0e72-9a2f-4617-a3c5e2eb3569";

@XendraTrl(Identifier="207a0b02-a5ce-f791-2038-6e790f7d545e")
public static String es_PE_FIELD_PartnerAssets_GuaranteeDate_Description="Fecha cuando la garantía expira";

@XendraTrl(Identifier="207a0b02-a5ce-f791-2038-6e790f7d545e")
public static String es_PE_FIELD_PartnerAssets_GuaranteeDate_Help="Fecha cuando la garantía ó disponibilidad normal expira";

@XendraTrl(Identifier="207a0b02-a5ce-f791-2038-6e790f7d545e")
public static String es_PE_FIELD_PartnerAssets_GuaranteeDate_Name="Fecha de Garantía";

@XendraField(AD_Column_ID="GuaranteeDate",IsCentrallyMaintained=true,
AD_Tab_ID="d008ef58-b109-b177-118e-ca3a523b2aa6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=130,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="207a0b02-a5ce-f791-2038-6e790f7d545e")
public static final String FIELDNAME_PartnerAssets_GuaranteeDate="207a0b02-a5ce-f791-2038-6e790f7d545e";

@XendraTrl(Identifier="5cab631f-fc1d-7d44-4291-e2f945e5a718")
public static String es_PE_COLUMN_GuaranteeDate_Name="Fecha de Garantía";

@XendraColumn(AD_Element_ID="2956aa9d-0dfd-6e86-af9b-584f4c7eca21",ColumnName="GuaranteeDate",
AD_Reference_ID=15,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5cab631f-fc1d-7d44-4291-e2f945e5a718",
Synchronized="2017-08-05 16:52:16.0")
/** Column name GuaranteeDate */
public static final String COLUMNNAME_GuaranteeDate = "GuaranteeDate";
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

@XendraTrl(Identifier="62d3c5fb-6317-86d9-a9c2-ab951a7179ce")
public static String es_PE_FIELD_Asset_CommentHelp_Description="Ayuda; Comentario o Sugerencia";

@XendraTrl(Identifier="62d3c5fb-6317-86d9-a9c2-ab951a7179ce")
public static String es_PE_FIELD_Asset_CommentHelp_Help="El campo ayuda contiene una sugerencia; comentario o ayuda acerca del uso de esta partida";

@XendraTrl(Identifier="62d3c5fb-6317-86d9-a9c2-ab951a7179ce")
public static String es_PE_FIELD_Asset_CommentHelp_Name="Ayuda";
@XendraField(AD_Column_ID="Help",
IsCentrallyMaintained=true,AD_Tab_ID="4f87ac11-81f6-543e-7e3e-291a85884206",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=60,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="62d3c5fb-6317-86d9-a9c2-ab951a7179ce")
public static final String FIELDNAME_Asset_CommentHelp="62d3c5fb-6317-86d9-a9c2-ab951a7179ce";

@XendraTrl(Identifier="9992f4b7-2820-b031-4a25-85dfd5a68a1b")
public static String es_PE_FIELD_PartnerAssets_CommentHelp_Description="Ayuda; Comentario o Sugerencia";

@XendraTrl(Identifier="9992f4b7-2820-b031-4a25-85dfd5a68a1b")
public static String es_PE_FIELD_PartnerAssets_CommentHelp_Help="El campo ayuda contiene una sugerencia; comentario o ayuda acerca del uso de esta partida";

@XendraTrl(Identifier="9992f4b7-2820-b031-4a25-85dfd5a68a1b")
public static String es_PE_FIELD_PartnerAssets_CommentHelp_Name="Ayuda";

@XendraField(AD_Column_ID="Help",IsCentrallyMaintained=true,
AD_Tab_ID="d008ef58-b109-b177-118e-ca3a523b2aa6",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9992f4b7-2820-b031-4a25-85dfd5a68a1b")
public static final String FIELDNAME_PartnerAssets_CommentHelp="9992f4b7-2820-b031-4a25-85dfd5a68a1b";

@XendraTrl(Identifier="c118261a-b8a7-981d-a8d1-efbd18012aa1")
public static String es_PE_COLUMN_Help_Name="Ayuda";

@XendraColumn(AD_Element_ID="a6fda582-56f9-6bb7-8436-285ce4f8de3f",ColumnName="Help",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c118261a-b8a7-981d-a8d1-efbd18012aa1",
Synchronized="2017-08-05 16:52:16.0")
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
@XendraTrl(Identifier="3946191b-1537-4ed0-b3fc-d71b29d53fa2")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3946191b-1537-4ed0-b3fc-d71b29d53fa2",
Synchronized="2017-08-05 16:52:16.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Depreciate.
@param IsDepreciated The asset will be depreciated */
public void setIsDepreciated (boolean IsDepreciated)
{
set_Value (COLUMNNAME_IsDepreciated, Boolean.valueOf(IsDepreciated));
}
/** Get Depreciate.
@return The asset will be depreciated */
public boolean isDepreciated() 
{
Object oo = get_Value(COLUMNNAME_IsDepreciated);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="d2384630-f7e9-9904-5f5b-27237a1c34fe")
public static String es_PE_FIELD_Asset_Depreciate_Description="El activo ha sido depreciado";

@XendraTrl(Identifier="d2384630-f7e9-9904-5f5b-27237a1c34fe")
public static String es_PE_FIELD_Asset_Depreciate_Help="El activo se utiliza internamente y será depreciado";

@XendraTrl(Identifier="d2384630-f7e9-9904-5f5b-27237a1c34fe")
public static String es_PE_FIELD_Asset_Depreciate_Name="Depreciar";

@XendraField(AD_Column_ID="IsDepreciated",IsCentrallyMaintained=true,
AD_Tab_ID="4f87ac11-81f6-543e-7e3e-291a85884206",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsOwned@=Y",DisplayLength=1,IsReadOnly=false,SeqNo=290,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d2384630-f7e9-9904-5f5b-27237a1c34fe")
public static final String FIELDNAME_Asset_Depreciate="d2384630-f7e9-9904-5f5b-27237a1c34fe";

@XendraTrl(Identifier="d91f905e-6235-c296-7224-cf88eb822e87")
public static String es_PE_FIELD_PartnerAssets_Depreciate_Description="El activo ha sido depreciado";

@XendraTrl(Identifier="d91f905e-6235-c296-7224-cf88eb822e87")
public static String es_PE_FIELD_PartnerAssets_Depreciate_Help="El activo se utiliza internamente y será depreciado";

@XendraTrl(Identifier="d91f905e-6235-c296-7224-cf88eb822e87")
public static String es_PE_FIELD_PartnerAssets_Depreciate_Name="Depreciar";

@XendraField(AD_Column_ID="IsDepreciated",IsCentrallyMaintained=true,
AD_Tab_ID="d008ef58-b109-b177-118e-ca3a523b2aa6",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d91f905e-6235-c296-7224-cf88eb822e87")
public static final String FIELDNAME_PartnerAssets_Depreciate="d91f905e-6235-c296-7224-cf88eb822e87";

@XendraTrl(Identifier="ce312d87-6d12-498c-6956-86601370fedf")
public static String es_PE_COLUMN_IsDepreciated_Name="Depreciar";

@XendraColumn(AD_Element_ID="ae896e4e-ba42-d146-eb15-363628246698",ColumnName="IsDepreciated",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ce312d87-6d12-498c-6956-86601370fedf",
Synchronized="2017-08-05 16:52:17.0")
/** Column name IsDepreciated */
public static final String COLUMNNAME_IsDepreciated = "IsDepreciated";
/** Set Disposed.
@param IsDisposed The asset is disposed */
public void setIsDisposed (boolean IsDisposed)
{
set_Value (COLUMNNAME_IsDisposed, Boolean.valueOf(IsDisposed));
}
/** Get Disposed.
@return The asset is disposed */
public boolean isDisposed() 
{
Object oo = get_Value(COLUMNNAME_IsDisposed);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="b622b23f-5484-b63a-e745-198fdfd9eba6")
public static String es_PE_FIELD_Asset_Disposed_Description="El activo esta disponible";

@XendraTrl(Identifier="b622b23f-5484-b63a-e745-198fdfd9eba6")
public static String es_PE_FIELD_Asset_Disposed_Help="El activo no esta utilizado y esta disponible. ";

@XendraTrl(Identifier="b622b23f-5484-b63a-e745-198fdfd9eba6")
public static String es_PE_FIELD_Asset_Disposed_Name="Disponible";

@XendraField(AD_Column_ID="IsDisposed",IsCentrallyMaintained=true,
AD_Tab_ID="4f87ac11-81f6-543e-7e3e-291a85884206",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=410,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b622b23f-5484-b63a-e745-198fdfd9eba6")
public static final String FIELDNAME_Asset_Disposed="b622b23f-5484-b63a-e745-198fdfd9eba6";

@XendraTrl(Identifier="f4ab0d48-76ee-0166-9931-24b788a1cd32")
public static String es_PE_FIELD_PartnerAssets_Disposed_Description="El activo esta disponible";

@XendraTrl(Identifier="f4ab0d48-76ee-0166-9931-24b788a1cd32")
public static String es_PE_FIELD_PartnerAssets_Disposed_Help="El activo no esta utilizado y esta disponible. ";

@XendraTrl(Identifier="f4ab0d48-76ee-0166-9931-24b788a1cd32")
public static String es_PE_FIELD_PartnerAssets_Disposed_Name="Disponible";

@XendraField(AD_Column_ID="IsDisposed",IsCentrallyMaintained=true,
AD_Tab_ID="d008ef58-b109-b177-118e-ca3a523b2aa6",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f4ab0d48-76ee-0166-9931-24b788a1cd32")
public static final String FIELDNAME_PartnerAssets_Disposed="f4ab0d48-76ee-0166-9931-24b788a1cd32";

@XendraTrl(Identifier="36570a03-50ae-b1dc-50d4-c44c6a7edba4")
public static String es_PE_COLUMN_IsDisposed_Name="Disponible";

@XendraColumn(AD_Element_ID="e77fd9b8-d6fc-c779-1e73-77105bf9aba8",ColumnName="IsDisposed",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="36570a03-50ae-b1dc-50d4-c44c6a7edba4",
Synchronized="2017-08-05 16:52:17.0")
/** Column name IsDisposed */
public static final String COLUMNNAME_IsDisposed = "IsDisposed";
/** Set Fully depreciated.
@param IsFullyDepreciated The asset is fully depreciated */
public void setIsFullyDepreciated (boolean IsFullyDepreciated)
{
set_ValueNoCheck (COLUMNNAME_IsFullyDepreciated, Boolean.valueOf(IsFullyDepreciated));
}
/** Get Fully depreciated.
@return The asset is fully depreciated */
public boolean isFullyDepreciated() 
{
Object oo = get_Value(COLUMNNAME_IsFullyDepreciated);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="13b404a5-6dbb-ebbd-f0b4-32fb18472c74")
public static String es_PE_FIELD_Asset_FullyDepreciated_Description="El activo está totalmente depreciado";

@XendraTrl(Identifier="13b404a5-6dbb-ebbd-f0b4-32fb18472c74")
public static String es_PE_FIELD_Asset_FullyDepreciated_Name="Totalmente Depreciado";

@XendraField(AD_Column_ID="IsFullyDepreciated",IsCentrallyMaintained=true,
AD_Tab_ID="4f87ac11-81f6-543e-7e3e-291a85884206",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsOwned@=Y & @IsDepreciated@=Y",DisplayLength=1,IsReadOnly=true,SeqNo=300,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="13b404a5-6dbb-ebbd-f0b4-32fb18472c74")
public static final String FIELDNAME_Asset_FullyDepreciated="13b404a5-6dbb-ebbd-f0b4-32fb18472c74";

@XendraTrl(Identifier="dc472534-aa90-3320-e574-e0626a8177af")
public static String es_PE_FIELD_PartnerAssets_FullyDepreciated_Description="El activo está totalmente depreciado";

@XendraTrl(Identifier="dc472534-aa90-3320-e574-e0626a8177af")
public static String es_PE_FIELD_PartnerAssets_FullyDepreciated_Name="Totalmente Depreciado";

@XendraField(AD_Column_ID="IsFullyDepreciated",IsCentrallyMaintained=true,
AD_Tab_ID="d008ef58-b109-b177-118e-ca3a523b2aa6",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="dc472534-aa90-3320-e574-e0626a8177af")
public static final String FIELDNAME_PartnerAssets_FullyDepreciated="dc472534-aa90-3320-e574-e0626a8177af";

@XendraTrl(Identifier="9975267a-46d4-285c-0788-9d3e1e9a49d4")
public static String es_PE_COLUMN_IsFullyDepreciated_Name="Totalmente Depreciado";

@XendraColumn(AD_Element_ID="873c3880-cbe3-1810-ebf3-7bbdabd16fe4",ColumnName="IsFullyDepreciated",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9975267a-46d4-285c-0788-9d3e1e9a49d4",
Synchronized="2017-08-05 16:52:17.0")
/** Column name IsFullyDepreciated */
public static final String COLUMNNAME_IsFullyDepreciated = "IsFullyDepreciated";
/** Set In Possession.
@param IsInPosession The asset is in the possession of the organization */
public void setIsInPosession (boolean IsInPosession)
{
set_Value (COLUMNNAME_IsInPosession, Boolean.valueOf(IsInPosession));
}
/** Get In Possession.
@return The asset is in the possession of the organization */
public boolean isInPosession() 
{
Object oo = get_Value(COLUMNNAME_IsInPosession);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="20a0db88-8e32-e6ac-3526-842683d39951")
public static String es_PE_FIELD_Asset_InPossession_Description="El activo esta en posesión de la organización";

@XendraTrl(Identifier="20a0db88-8e32-e6ac-3526-842683d39951")
public static String es_PE_FIELD_Asset_InPossession_Help="Los activos que no están en la posesión están ej. en el sitio de cliente y pueden ó no ser poseidos por la compañía.";

@XendraTrl(Identifier="20a0db88-8e32-e6ac-3526-842683d39951")
public static String es_PE_FIELD_Asset_InPossession_Name="En Posesión";

@XendraField(AD_Column_ID="IsInPosession",IsCentrallyMaintained=true,
AD_Tab_ID="4f87ac11-81f6-543e-7e3e-291a85884206",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=180,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="20a0db88-8e32-e6ac-3526-842683d39951")
public static final String FIELDNAME_Asset_InPossession="20a0db88-8e32-e6ac-3526-842683d39951";

@XendraTrl(Identifier="08aafef5-8d4f-7484-236e-efcf21a99f74")
public static String es_PE_FIELD_PartnerAssets_InPossession_Description="El activo esta en posesión de la organización";

@XendraTrl(Identifier="08aafef5-8d4f-7484-236e-efcf21a99f74")
public static String es_PE_FIELD_PartnerAssets_InPossession_Help="Los activos que no están en la posesión están ej. en el sitio de cliente y pueden ó no ser poseidos por la compañía.";

@XendraTrl(Identifier="08aafef5-8d4f-7484-236e-efcf21a99f74")
public static String es_PE_FIELD_PartnerAssets_InPossession_Name="En Posesión";

@XendraField(AD_Column_ID="IsInPosession",IsCentrallyMaintained=true,
AD_Tab_ID="d008ef58-b109-b177-118e-ca3a523b2aa6",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="08aafef5-8d4f-7484-236e-efcf21a99f74")
public static final String FIELDNAME_PartnerAssets_InPossession="08aafef5-8d4f-7484-236e-efcf21a99f74";

@XendraTrl(Identifier="bdd61002-e326-4a9a-f7f1-df462ee372f7")
public static String es_PE_COLUMN_IsInPosession_Name="En Posesión";

@XendraColumn(AD_Element_ID="6970f05d-4d68-08f9-684e-502b9594d8a5",ColumnName="IsInPosession",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="bdd61002-e326-4a9a-f7f1-df462ee372f7",
Synchronized="2017-08-05 16:52:17.0")
/** Column name IsInPosession */
public static final String COLUMNNAME_IsInPosession = "IsInPosession";
/** Set Owned.
@param IsOwned The asset is owned by the organization */
public void setIsOwned (boolean IsOwned)
{
set_Value (COLUMNNAME_IsOwned, Boolean.valueOf(IsOwned));
}
/** Get Owned.
@return The asset is owned by the organization */
public boolean isOwned() 
{
Object oo = get_Value(COLUMNNAME_IsOwned);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="d8d919d9-67c8-ae0a-6037-872973f4a440")
public static String es_PE_FIELD_Asset_Owned_Description="El activo es poseido por la organización";

@XendraTrl(Identifier="d8d919d9-67c8-ae0a-6037-872973f4a440")
public static String es_PE_FIELD_Asset_Owned_Help="El activo puede no estar en la posesión, pero el activo es poseído legalmente por la organización.";

@XendraTrl(Identifier="d8d919d9-67c8-ae0a-6037-872973f4a440")
public static String es_PE_FIELD_Asset_Owned_Name="Propio";
@XendraField(AD_Column_ID="IsOwned",
IsCentrallyMaintained=true,AD_Tab_ID="4f87ac11-81f6-543e-7e3e-291a85884206",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=170,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="d8d919d9-67c8-ae0a-6037-872973f4a440")
public static final String FIELDNAME_Asset_Owned="d8d919d9-67c8-ae0a-6037-872973f4a440";

@XendraTrl(Identifier="12e2df88-30f5-f3d1-ca39-9c3911f02263")
public static String es_PE_FIELD_PartnerAssets_Owned_Description="El activo es poseido por la organización";

@XendraTrl(Identifier="12e2df88-30f5-f3d1-ca39-9c3911f02263")
public static String es_PE_FIELD_PartnerAssets_Owned_Help="El activo puede no estar en la posesión, pero el activo es poseído legalmente por la organización.";

@XendraTrl(Identifier="12e2df88-30f5-f3d1-ca39-9c3911f02263")
public static String es_PE_FIELD_PartnerAssets_Owned_Name="Propio";

@XendraField(AD_Column_ID="IsOwned",IsCentrallyMaintained=true,
AD_Tab_ID="d008ef58-b109-b177-118e-ca3a523b2aa6",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="12e2df88-30f5-f3d1-ca39-9c3911f02263")
public static final String FIELDNAME_PartnerAssets_Owned="12e2df88-30f5-f3d1-ca39-9c3911f02263";

@XendraTrl(Identifier="1667d104-3efc-e8ae-51ff-e79a17079379")
public static String es_PE_COLUMN_IsOwned_Name="Propio";

@XendraColumn(AD_Element_ID="d1cc73c2-f91b-55d5-aded-196c964818f7",ColumnName="IsOwned",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="1667d104-3efc-e8ae-51ff-e79a17079379",
Synchronized="2017-08-05 16:52:17.0")
/** Column name IsOwned */
public static final String COLUMNNAME_IsOwned = "IsOwned";
/** Set Last Maintenance.
@param LastMaintenanceDate Last Maintenance Date */
public void setLastMaintenanceDate (Timestamp LastMaintenanceDate)
{
set_Value (COLUMNNAME_LastMaintenanceDate, LastMaintenanceDate);
}
/** Get Last Maintenance.
@return Last Maintenance Date */
public Timestamp getLastMaintenanceDate() 
{
return (Timestamp)get_Value(COLUMNNAME_LastMaintenanceDate);
}

@XendraTrl(Identifier="83ea0b4d-951d-3ffa-a0d8-146175da420b")
public static String es_PE_FIELD_Asset_LastMaintenance_Description="Fecha de Último Mantenimiento";

@XendraTrl(Identifier="83ea0b4d-951d-3ffa-a0d8-146175da420b")
public static String es_PE_FIELD_Asset_LastMaintenance_Name="Último Mantenimiento";

@XendraField(AD_Column_ID="LastMaintenanceDate",IsCentrallyMaintained=true,
AD_Tab_ID="4f87ac11-81f6-543e-7e3e-291a85884206",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=7,IsReadOnly=false,SeqNo=350,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="83ea0b4d-951d-3ffa-a0d8-146175da420b")
public static final String FIELDNAME_Asset_LastMaintenance="83ea0b4d-951d-3ffa-a0d8-146175da420b";

@XendraTrl(Identifier="c6a3cc7e-8510-1af0-2ff9-8bf29c303bf2")
public static String es_PE_COLUMN_LastMaintenanceDate_Name="Último Mantenimiento";

@XendraColumn(AD_Element_ID="2f3eebfe-5fd6-51a3-035a-9b2d07ff41eb",
ColumnName="LastMaintenanceDate",AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=7,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="c6a3cc7e-8510-1af0-2ff9-8bf29c303bf2",Synchronized="2017-08-05 16:52:17.0")
/** Column name LastMaintenanceDate */
public static final String COLUMNNAME_LastMaintenanceDate = "LastMaintenanceDate";
/** Set Last Note.
@param LastMaintenanceNote Last Maintenance Note */
public void setLastMaintenanceNote (String LastMaintenanceNote)
{
if (LastMaintenanceNote != null && LastMaintenanceNote.length() > 60)
{
log.warning("Length > 60 - truncated");
LastMaintenanceNote = LastMaintenanceNote.substring(0,59);
}
set_Value (COLUMNNAME_LastMaintenanceNote, LastMaintenanceNote);
}
/** Get Last Note.
@return Last Maintenance Note */
public String getLastMaintenanceNote() 
{
String value = (String)get_Value(COLUMNNAME_LastMaintenanceNote);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="44e2505b-4cfc-2db0-1e63-58ad05891051")
public static String es_PE_FIELD_Asset_LastNote_Description="Última Nota de Mantenimiento";

@XendraTrl(Identifier="44e2505b-4cfc-2db0-1e63-58ad05891051")
public static String es_PE_FIELD_Asset_LastNote_Name="Última Nota";

@XendraField(AD_Column_ID="LastMaintenanceNote",IsCentrallyMaintained=true,
AD_Tab_ID="4f87ac11-81f6-543e-7e3e-291a85884206",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=370,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="44e2505b-4cfc-2db0-1e63-58ad05891051")
public static final String FIELDNAME_Asset_LastNote="44e2505b-4cfc-2db0-1e63-58ad05891051";

@XendraTrl(Identifier="02248dc5-ea35-c048-5c98-c61e434b04fe")
public static String es_PE_COLUMN_LastMaintenanceNote_Name="Última Nota";

@XendraColumn(AD_Element_ID="2d71fdf6-bb26-55e1-6aa9-df0719a4ba42",
ColumnName="LastMaintenanceNote",AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=60,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="02248dc5-ea35-c048-5c98-c61e434b04fe",Synchronized="2017-08-05 16:52:17.0")
/** Column name LastMaintenanceNote */
public static final String COLUMNNAME_LastMaintenanceNote = "LastMaintenanceNote";
/** Set Last Unit.
@param LastMaintenanceUnit Last Maintenance Unit */
public void setLastMaintenanceUnit (int LastMaintenanceUnit)
{
set_Value (COLUMNNAME_LastMaintenanceUnit, Integer.valueOf(LastMaintenanceUnit));
}
/** Get Last Unit.
@return Last Maintenance Unit */
public int getLastMaintenanceUnit() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_LastMaintenanceUnit);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="fa27b1f3-b14c-fd5d-5ad0-70610e603f05")
public static String es_PE_FIELD_Asset_LastUnit_Description="Última Unidad de Mantenimiénto";

@XendraTrl(Identifier="fa27b1f3-b14c-fd5d-5ad0-70610e603f05")
public static String es_PE_FIELD_Asset_LastUnit_Name="Última Unidad";

@XendraField(AD_Column_ID="LastMaintenanceUnit",IsCentrallyMaintained=true,
AD_Tab_ID="4f87ac11-81f6-543e-7e3e-291a85884206",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=360,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="fa27b1f3-b14c-fd5d-5ad0-70610e603f05")
public static final String FIELDNAME_Asset_LastUnit="fa27b1f3-b14c-fd5d-5ad0-70610e603f05";

@XendraTrl(Identifier="6f4b14c8-74cb-ffec-f9bb-abf815de5721")
public static String es_PE_COLUMN_LastMaintenanceUnit_Name="Última Unidad";

@XendraColumn(AD_Element_ID="e3f36898-2a7a-3d7e-239c-b435771a2c06",
ColumnName="LastMaintenanceUnit",AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="6f4b14c8-74cb-ffec-f9bb-abf815de5721",Synchronized="2017-08-05 16:52:17.0")
/** Column name LastMaintenanceUnit */
public static final String COLUMNNAME_LastMaintenanceUnit = "LastMaintenanceUnit";
/** Set lastmaintenanceuseunit.
@param lastmaintenanceuseunit lastmaintenanceuseunit */
public void setlastmaintenanceuseunit (int lastmaintenanceuseunit)
{
set_Value (COLUMNNAME_lastmaintenanceuseunit, Integer.valueOf(lastmaintenanceuseunit));
}
/** Get lastmaintenanceuseunit.
@return lastmaintenanceuseunit */
public int getlastmaintenanceuseunit() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_lastmaintenanceuseunit);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="94ea91eb-2301-70e2-ae86-004a84ea5feb")
public static String es_PE_COLUMN_lastmaintenanceuseunit_Name="lastmaintenanceuseunit";

@XendraColumn(AD_Element_ID="2dfbcd33-2d8c-c097-606d-51a158fe795b",
ColumnName="lastmaintenanceuseunit",AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="94ea91eb-2301-70e2-ae86-004a84ea5feb",Synchronized="2017-08-05 16:52:17.0")
/** Column name lastmaintenanceuseunit */
public static final String COLUMNNAME_lastmaintenanceuseunit = "lastmaintenanceuseunit";
/** Set lastmaintenencedate.
@param lastmaintenencedate lastmaintenencedate */
public void setlastmaintenencedate (Timestamp lastmaintenencedate)
{
set_Value (COLUMNNAME_lastmaintenencedate, lastmaintenencedate);
}
/** Get lastmaintenencedate.
@return lastmaintenencedate */
public Timestamp getlastmaintenencedate() 
{
return (Timestamp)get_Value(COLUMNNAME_lastmaintenencedate);
}

@XendraTrl(Identifier="38921ef8-e42d-b2e0-aa1b-70c2df07bcf0")
public static String es_PE_COLUMN_lastmaintenencedate_Name="lastmaintenencedate";

@XendraColumn(AD_Element_ID="eb03aac8-deb1-946a-f0c6-927ce7c50904",
ColumnName="lastmaintenencedate",AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=29,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="38921ef8-e42d-b2e0-aa1b-70c2df07bcf0",Synchronized="2017-08-05 16:52:17.0")
/** Column name lastmaintenencedate */
public static final String COLUMNNAME_lastmaintenencedate = "lastmaintenencedate";

/** Lease_BPartner_ID AD_Reference=e62e2f52-4f98-9202-39f9-f664fd70c2e3 */
public static final int LEASE_BPARTNER_ID_AD_Reference_ID=192;
/** Set Lessor.
@param Lease_BPartner_ID The Business Partner who rents or leases */
public void setLease_BPartner_ID (int Lease_BPartner_ID)
{
if (Lease_BPartner_ID <= 0) set_Value (COLUMNNAME_Lease_BPartner_ID, null);
 else 
set_Value (COLUMNNAME_Lease_BPartner_ID, Integer.valueOf(Lease_BPartner_ID));
}
/** Get Lessor.
@return The Business Partner who rents or leases */
public int getLease_BPartner_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_Lease_BPartner_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="76cd9445-d433-0128-cc9b-8d21b6edfa2d")
public static String es_PE_FIELD_Asset_Lessor_Description="El Socio del Negocio que renta o alquila";

@XendraTrl(Identifier="76cd9445-d433-0128-cc9b-8d21b6edfa2d")
public static String es_PE_FIELD_Asset_Lessor_Name="Arrendador";

@XendraField(AD_Column_ID="Lease_BPartner_ID",IsCentrallyMaintained=true,
AD_Tab_ID="4f87ac11-81f6-543e-7e3e-291a85884206",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsOwned@=N & @IsInPosession@=Y",DisplayLength=10,IsReadOnly=false,SeqNo=190,
SortNo=0,IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="76cd9445-d433-0128-cc9b-8d21b6edfa2d")
public static final String FIELDNAME_Asset_Lessor="76cd9445-d433-0128-cc9b-8d21b6edfa2d";

@XendraTrl(Identifier="2d644d75-5c97-1afa-cef8-232c31b541d7")
public static String es_PE_COLUMN_Lease_BPartner_ID_Name="Arrendador";

@XendraColumn(AD_Element_ID="51a7b18e-3830-6199-9ee4-1b80c31cb4da",ColumnName="Lease_BPartner_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="e62e2f52-4f98-9202-39f9-f664fd70c2e3",AD_Val_Rule_ID="",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="2d644d75-5c97-1afa-cef8-232c31b541d7",Synchronized="2017-08-05 16:52:17.0")
/** Column name Lease_BPartner_ID */
public static final String COLUMNNAME_Lease_BPartner_ID = "Lease_BPartner_ID";
/** Set Lease Termination.
@param LeaseTerminationDate Lease Termination Date */
public void setLeaseTerminationDate (Timestamp LeaseTerminationDate)
{
set_Value (COLUMNNAME_LeaseTerminationDate, LeaseTerminationDate);
}
/** Get Lease Termination.
@return Lease Termination Date */
public Timestamp getLeaseTerminationDate() 
{
return (Timestamp)get_Value(COLUMNNAME_LeaseTerminationDate);
}

@XendraTrl(Identifier="c3d6d7f7-5da4-e586-b448-cca626f0c071")
public static String es_PE_FIELD_Asset_LeaseTermination_Description="Fecha de Vencimiento del Arrendamiento";

@XendraTrl(Identifier="c3d6d7f7-5da4-e586-b448-cca626f0c071")
public static String es_PE_FIELD_Asset_LeaseTermination_Help="Última Fecha de Arrendamiento";

@XendraTrl(Identifier="c3d6d7f7-5da4-e586-b448-cca626f0c071")
public static String es_PE_FIELD_Asset_LeaseTermination_Name="Vencimiento del Arrendamiento";

@XendraField(AD_Column_ID="LeaseTerminationDate",IsCentrallyMaintained=true,
AD_Tab_ID="4f87ac11-81f6-543e-7e3e-291a85884206",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsOwned@=N & @IsInPosession@=Y",DisplayLength=7,IsReadOnly=false,SeqNo=200,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="c3d6d7f7-5da4-e586-b448-cca626f0c071")
public static final String FIELDNAME_Asset_LeaseTermination="c3d6d7f7-5da4-e586-b448-cca626f0c071";

@XendraTrl(Identifier="ea816ff7-673a-75f1-c7ca-bca88e418be0")
public static String es_PE_COLUMN_LeaseTerminationDate_Name="Vencimiento del Arrendamiento";

@XendraColumn(AD_Element_ID="2bbfaa5b-49d0-149a-3ffe-f67ffb561324",
ColumnName="LeaseTerminationDate",AD_Reference_ID=15,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=7,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="ea816ff7-673a-75f1-c7ca-bca88e418be0",Synchronized="2017-08-05 16:52:17.0")
/** Column name LeaseTerminationDate */
public static final String COLUMNNAME_LeaseTerminationDate = "LeaseTerminationDate";
/** Set Life use.
@param LifeUseUnits Units of use until the asset is not usable anymore */
public void setLifeUseUnits (int LifeUseUnits)
{
set_Value (COLUMNNAME_LifeUseUnits, Integer.valueOf(LifeUseUnits));
}
/** Get Life use.
@return Units of use until the asset is not usable anymore */
public int getLifeUseUnits() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_LifeUseUnits);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="436c7236-d93b-91f3-dd36-51bfcf89eb3c")
public static String es_PE_FIELD_Asset_LifeUse_Help="La vida de uso y el uso real se pueden utilizar para calcular la depreciación";

@XendraTrl(Identifier="436c7236-d93b-91f3-dd36-51bfcf89eb3c")
public static String es_PE_FIELD_Asset_LifeUse_Name="Vida Uso";

@XendraField(AD_Column_ID="LifeUseUnits",IsCentrallyMaintained=true,
AD_Tab_ID="4f87ac11-81f6-543e-7e3e-291a85884206",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=330,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="436c7236-d93b-91f3-dd36-51bfcf89eb3c")
public static final String FIELDNAME_Asset_LifeUse="436c7236-d93b-91f3-dd36-51bfcf89eb3c";

@XendraTrl(Identifier="e4f7f452-2aa2-6866-c739-ce5a79a01ff5")
public static String es_PE_FIELD_PartnerAssets_LifeUse_Help="La vida de uso y el uso real se pueden utilizar para calcular la depreciación";

@XendraTrl(Identifier="e4f7f452-2aa2-6866-c739-ce5a79a01ff5")
public static String es_PE_FIELD_PartnerAssets_LifeUse_Name="Vida Uso";

@XendraField(AD_Column_ID="LifeUseUnits",IsCentrallyMaintained=true,
AD_Tab_ID="d008ef58-b109-b177-118e-ca3a523b2aa6",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e4f7f452-2aa2-6866-c739-ce5a79a01ff5")
public static final String FIELDNAME_PartnerAssets_LifeUse="e4f7f452-2aa2-6866-c739-ce5a79a01ff5";

@XendraTrl(Identifier="f4cf123c-9f99-3941-b7b2-413335302f12")
public static String es_PE_COLUMN_LifeUseUnits_Name="Vida Uso";

@XendraColumn(AD_Element_ID="dbc2cd19-2338-b8e5-a8ac-74fd692b4ae1",ColumnName="LifeUseUnits",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f4cf123c-9f99-3941-b7b2-413335302f12",
Synchronized="2017-08-05 16:52:17.0")
/** Column name LifeUseUnits */
public static final String COLUMNNAME_LifeUseUnits = "LifeUseUnits";
/** Set Location comment.
@param LocationComment Additional comments or remarks concerning the location */
public void setLocationComment (String LocationComment)
{
if (LocationComment != null && LocationComment.length() > 255)
{
log.warning("Length > 255 - truncated");
LocationComment = LocationComment.substring(0,254);
}
set_Value (COLUMNNAME_LocationComment, LocationComment);
}
/** Get Location comment.
@return Additional comments or remarks concerning the location */
public String getLocationComment() 
{
String value = (String)get_Value(COLUMNNAME_LocationComment);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="8a739faa-b956-b034-a193-f39e50d998d6")
public static String es_PE_FIELD_Asset_LocationComment_Description="Comentarios adicionales concernientes a la localización";

@XendraTrl(Identifier="8a739faa-b956-b034-a193-f39e50d998d6")
public static String es_PE_FIELD_Asset_LocationComment_Name="Comentarios de localización";

@XendraField(AD_Column_ID="LocationComment",IsCentrallyMaintained=true,
AD_Tab_ID="4f87ac11-81f6-543e-7e3e-291a85884206",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=270,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8a739faa-b956-b034-a193-f39e50d998d6")
public static final String FIELDNAME_Asset_LocationComment="8a739faa-b956-b034-a193-f39e50d998d6";

@XendraTrl(Identifier="621499d9-1f2d-f675-8f53-22eba0ba9fe0")
public static String es_PE_FIELD_PartnerAssets_LocationComment_Description="Comentarios adicionales concernientes a la localización";

@XendraTrl(Identifier="621499d9-1f2d-f675-8f53-22eba0ba9fe0")
public static String es_PE_FIELD_PartnerAssets_LocationComment_Name="Comentarios de localización";

@XendraField(AD_Column_ID="LocationComment",IsCentrallyMaintained=true,
AD_Tab_ID="d008ef58-b109-b177-118e-ca3a523b2aa6",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="621499d9-1f2d-f675-8f53-22eba0ba9fe0")
public static final String FIELDNAME_PartnerAssets_LocationComment="621499d9-1f2d-f675-8f53-22eba0ba9fe0";

@XendraTrl(Identifier="30a71c25-6154-2d82-1e7d-121892a3f4bb")
public static String es_PE_COLUMN_LocationComment_Name="Comentarios de localización";

@XendraColumn(AD_Element_ID="28e2d130-3ce0-e859-8733-3bffd8340c04",ColumnName="LocationComment",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="30a71c25-6154-2d82-1e7d-121892a3f4bb",
Synchronized="2017-08-05 16:52:17.0")
/** Column name LocationComment */
public static final String COLUMNNAME_LocationComment = "LocationComment";
/** Set Lot No.
@param Lot Lot number (alphanumeric) */
public void setLot (String Lot)
{
if (Lot != null && Lot.length() > 255)
{
log.warning("Length > 255 - truncated");
Lot = Lot.substring(0,254);
}
set_Value (COLUMNNAME_Lot, Lot);
}
/** Get Lot No.
@return Lot number (alphanumeric) */
public String getLot() 
{
String value = (String)get_Value(COLUMNNAME_Lot);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="65210650-c0da-b4aa-76e9-0976ae50696f")
public static String es_PE_FIELD_Asset_LotNo_Description="Número de Lote";

@XendraTrl(Identifier="65210650-c0da-b4aa-76e9-0976ae50696f")
public static String es_PE_FIELD_Asset_LotNo_Help="Indica el número de lote específico del que un producto fue parte.";

@XendraTrl(Identifier="65210650-c0da-b4aa-76e9-0976ae50696f")
public static String es_PE_FIELD_Asset_LotNo_Name="No. Lote";
@XendraField(AD_Column_ID="Lot",
IsCentrallyMaintained=true,AD_Tab_ID="4f87ac11-81f6-543e-7e3e-291a85884206",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=110,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="65210650-c0da-b4aa-76e9-0976ae50696f")
public static final String FIELDNAME_Asset_LotNo="65210650-c0da-b4aa-76e9-0976ae50696f";

@XendraTrl(Identifier="b37ecb8d-cab8-fc2e-3378-f72195eb2ae3")
public static String es_PE_FIELD_PartnerAssets_LotNo_Description="Número de Lote";

@XendraTrl(Identifier="b37ecb8d-cab8-fc2e-3378-f72195eb2ae3")
public static String es_PE_FIELD_PartnerAssets_LotNo_Help="Indica el número de lote específico del que un producto fue parte.";

@XendraTrl(Identifier="b37ecb8d-cab8-fc2e-3378-f72195eb2ae3")
public static String es_PE_FIELD_PartnerAssets_LotNo_Name="No. Lote";

@XendraField(AD_Column_ID="Lot",IsCentrallyMaintained=true,
AD_Tab_ID="d008ef58-b109-b177-118e-ca3a523b2aa6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b37ecb8d-cab8-fc2e-3378-f72195eb2ae3")
public static final String FIELDNAME_PartnerAssets_LotNo="b37ecb8d-cab8-fc2e-3378-f72195eb2ae3";

@XendraTrl(Identifier="87af037d-025e-72f5-087d-12028b2ea4e1")
public static String es_PE_COLUMN_Lot_Name="No. Lote";

@XendraColumn(AD_Element_ID="e8a3022e-4a91-6f2a-e27c-3739825075c7",ColumnName="Lot",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="87af037d-025e-72f5-087d-12028b2ea4e1",
Synchronized="2017-08-05 16:52:17.0")
/** Column name Lot */
public static final String COLUMNNAME_Lot = "Lot";
/** Set Attribute Set Instance.
@param M_AttributeSetInstance_ID Product Attribute Set Instance */
public void setM_AttributeSetInstance_ID (int M_AttributeSetInstance_ID)
{
if (M_AttributeSetInstance_ID < 0) throw new IllegalArgumentException ("M_AttributeSetInstance_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_M_AttributeSetInstance_ID, Integer.valueOf(M_AttributeSetInstance_ID));
}
/** Get Attribute Set Instance.
@return Product Attribute Set Instance */
public int getM_AttributeSetInstance_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_AttributeSetInstance_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="758e409e-40d9-7b3d-79e9-a2785ea54ee3")
public static String es_PE_FIELD_Asset_AttributeSetInstance_Description="Instancia del conjunto de atributos del producto";

@XendraTrl(Identifier="758e409e-40d9-7b3d-79e9-a2785ea54ee3")
public static String es_PE_FIELD_Asset_AttributeSetInstance_Help="Valor actual de Instancia del conjunto de atributos del producto";

@XendraTrl(Identifier="758e409e-40d9-7b3d-79e9-a2785ea54ee3")
public static String es_PE_FIELD_Asset_AttributeSetInstance_Name="Instancia del Conjunto de Atributos";

@XendraField(AD_Column_ID="M_AttributeSetInstance_ID",IsCentrallyMaintained=true,
AD_Tab_ID="4f87ac11-81f6-543e-7e3e-291a85884206",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=90,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="758e409e-40d9-7b3d-79e9-a2785ea54ee3")
public static final String FIELDNAME_Asset_AttributeSetInstance="758e409e-40d9-7b3d-79e9-a2785ea54ee3";

@XendraTrl(Identifier="a7fe3216-84b3-ff93-9de4-263debc64a33")
public static String es_PE_FIELD_PartnerAssets_AttributeSetInstance_Description="Instancia del conjunto de atributos del producto";

@XendraTrl(Identifier="a7fe3216-84b3-ff93-9de4-263debc64a33")
public static String es_PE_FIELD_PartnerAssets_AttributeSetInstance_Help="Valor actual de Instancia del conjunto de atributos del producto";

@XendraTrl(Identifier="a7fe3216-84b3-ff93-9de4-263debc64a33")
public static String es_PE_FIELD_PartnerAssets_AttributeSetInstance_Name="Instancia del Conjunto de Atributos";

@XendraField(AD_Column_ID="M_AttributeSetInstance_ID",IsCentrallyMaintained=true,
AD_Tab_ID="d008ef58-b109-b177-118e-ca3a523b2aa6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=80,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a7fe3216-84b3-ff93-9de4-263debc64a33")
public static final String FIELDNAME_PartnerAssets_AttributeSetInstance="a7fe3216-84b3-ff93-9de4-263debc64a33";

@XendraTrl(Identifier="6247304b-069e-d091-fe31-9d5caf54da0a")
public static String es_PE_COLUMN_M_AttributeSetInstance_ID_Name="Instancia del Conjunto de Atributos";

@XendraColumn(AD_Element_ID="137807f2-3c52-e193-3ceb-f10b819cf955",
ColumnName="M_AttributeSetInstance_ID",AD_Reference_ID=35,AD_Reference_Value_ID="",
AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,
IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="",VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="6247304b-069e-d091-fe31-9d5caf54da0a",Synchronized="2017-08-05 16:52:17.0")
/** Column name M_AttributeSetInstance_ID */
public static final String COLUMNNAME_M_AttributeSetInstance_ID = "M_AttributeSetInstance_ID";
/** Set Shipment/Receipt Line.
@param M_InOutLine_ID Line on Shipment or Receipt document */
public void setM_InOutLine_ID (int M_InOutLine_ID)
{
if (M_InOutLine_ID <= 0) set_Value (COLUMNNAME_M_InOutLine_ID, null);
 else 
set_Value (COLUMNNAME_M_InOutLine_ID, Integer.valueOf(M_InOutLine_ID));
}
/** Get Shipment/Receipt Line.
@return Line on Shipment or Receipt document */
public int getM_InOutLine_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_InOutLine_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="0c386936-22a8-25db-0bd4-1d8e83b5c735")
public static String es_PE_FIELD_Asset_ShipmentReceiptLine_Description="Item de entrega ó documento de recibo.";

@XendraTrl(Identifier="0c386936-22a8-25db-0bd4-1d8e83b5c735")
public static String es_PE_FIELD_Asset_ShipmentReceiptLine_Help="Indica un Item único en un documento de entrega / recibo";

@XendraTrl(Identifier="0c386936-22a8-25db-0bd4-1d8e83b5c735")
public static String es_PE_FIELD_Asset_ShipmentReceiptLine_Name="Item Entrega / Recibo";

@XendraField(AD_Column_ID="M_InOutLine_ID",IsCentrallyMaintained=true,
AD_Tab_ID="4f87ac11-81f6-543e-7e3e-291a85884206",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0c386936-22a8-25db-0bd4-1d8e83b5c735")
public static final String FIELDNAME_Asset_ShipmentReceiptLine="0c386936-22a8-25db-0bd4-1d8e83b5c735";

@XendraTrl(Identifier="aecb8c8c-40a4-650a-8cbe-42b881706d40")
public static String es_PE_COLUMN_M_InOutLine_ID_Name="Línea Entrega / Recibo";

@XendraColumn(AD_Element_ID="a4d9928e-fbec-fd6c-b061-d3dbbd7de02c",ColumnName="M_InOutLine_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="aecb8c8c-40a4-650a-8cbe-42b881706d40",
Synchronized="2017-08-05 16:52:17.0")
/** Column name M_InOutLine_ID */
public static final String COLUMNNAME_M_InOutLine_ID = "M_InOutLine_ID";
/** Set Locator.
@param M_Locator_ID Warehouse Locator */
public void setM_Locator_ID (int M_Locator_ID)
{
if (M_Locator_ID <= 0) set_Value (COLUMNNAME_M_Locator_ID, null);
 else 
set_Value (COLUMNNAME_M_Locator_ID, Integer.valueOf(M_Locator_ID));
}
/** Get Locator.
@return Warehouse Locator */
public int getM_Locator_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_Locator_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="7d773dd1-1dac-5613-349a-697f723b7762")
public static String es_PE_FIELD_Asset_Locator_Description="Ubicación de Almacén";

@XendraTrl(Identifier="7d773dd1-1dac-5613-349a-697f723b7762")
public static String es_PE_FIELD_Asset_Locator_Help="El ID de la ubicación indica en que parte del almacén se localiza el producto";

@XendraTrl(Identifier="7d773dd1-1dac-5613-349a-697f723b7762")
public static String es_PE_FIELD_Asset_Locator_Name="Ubicación";

@XendraField(AD_Column_ID="M_Locator_ID",IsCentrallyMaintained=true,
AD_Tab_ID="4f87ac11-81f6-543e-7e3e-291a85884206",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsInPosession@=Y",DisplayLength=14,IsReadOnly=false,SeqNo=260,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="7d773dd1-1dac-5613-349a-697f723b7762")
public static final String FIELDNAME_Asset_Locator="7d773dd1-1dac-5613-349a-697f723b7762";

@XendraTrl(Identifier="72b3205d-930d-b357-00fd-abf549dffbcf")
public static String es_PE_FIELD_PartnerAssets_Locator_Description="Ubicación de Almacén";

@XendraTrl(Identifier="72b3205d-930d-b357-00fd-abf549dffbcf")
public static String es_PE_FIELD_PartnerAssets_Locator_Help="El ID de la ubicación indica en que parte del almacén se localiza el producto";

@XendraTrl(Identifier="72b3205d-930d-b357-00fd-abf549dffbcf")
public static String es_PE_FIELD_PartnerAssets_Locator_Name="Ubicación";

@XendraField(AD_Column_ID="M_Locator_ID",IsCentrallyMaintained=true,
AD_Tab_ID="d008ef58-b109-b177-118e-ca3a523b2aa6",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="72b3205d-930d-b357-00fd-abf549dffbcf")
public static final String FIELDNAME_PartnerAssets_Locator="72b3205d-930d-b357-00fd-abf549dffbcf";

@XendraTrl(Identifier="61b13f4f-941d-7e2f-01db-d666a8291982")
public static String es_PE_COLUMN_M_Locator_ID_Name="Ubicación";

@XendraColumn(AD_Element_ID="67f044ce-2864-93f9-fd0d-320945150933",ColumnName="M_Locator_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="61b13f4f-941d-7e2f-01db-d666a8291982",
Synchronized="2017-08-05 16:52:17.0")
/** Column name M_Locator_ID */
public static final String COLUMNNAME_M_Locator_ID = "M_Locator_ID";
/** Set Product.
@param M_Product_ID Product, Service, Item */
public void setM_Product_ID (int M_Product_ID)
{
if (M_Product_ID <= 0) set_ValueNoCheck (COLUMNNAME_M_Product_ID, null);
 else 
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

@XendraTrl(Identifier="64269fa8-b137-dd1a-92e1-ae6aca395e23")
public static String es_PE_FIELD_Asset_Product_Description="Producto; servicio ó artículo.";

@XendraTrl(Identifier="64269fa8-b137-dd1a-92e1-ae6aca395e23")
public static String es_PE_FIELD_Asset_Product_Help="Identifica un artículo que puede ser comprado ó vendido es esta organización.";

@XendraTrl(Identifier="64269fa8-b137-dd1a-92e1-ae6aca395e23")
public static String es_PE_FIELD_Asset_Product_Name="Producto";

@XendraField(AD_Column_ID="M_Product_ID",IsCentrallyMaintained=true,
AD_Tab_ID="4f87ac11-81f6-543e-7e3e-291a85884206",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="64269fa8-b137-dd1a-92e1-ae6aca395e23")
public static final String FIELDNAME_Asset_Product="64269fa8-b137-dd1a-92e1-ae6aca395e23";

@XendraTrl(Identifier="f71b50c3-a328-e935-3a34-d3649888ef1b")
public static String es_PE_FIELD_PartnerAssets_Product_Description="Producto; servicio ó artículo.";

@XendraTrl(Identifier="f71b50c3-a328-e935-3a34-d3649888ef1b")
public static String es_PE_FIELD_PartnerAssets_Product_Help="Identifica un artículo que puede ser comprado ó vendido es esta organización.";

@XendraTrl(Identifier="f71b50c3-a328-e935-3a34-d3649888ef1b")
public static String es_PE_FIELD_PartnerAssets_Product_Name="Producto";

@XendraField(AD_Column_ID="M_Product_ID",IsCentrallyMaintained=true,
AD_Tab_ID="d008ef58-b109-b177-118e-ca3a523b2aa6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=70,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f71b50c3-a328-e935-3a34-d3649888ef1b")
public static final String FIELDNAME_PartnerAssets_Product="f71b50c3-a328-e935-3a34-d3649888ef1b";

@XendraTrl(Identifier="f8aeed5e-b4ae-030d-0ead-3a84a963dcb5")
public static String es_PE_COLUMN_M_Product_ID_Name="Producto";

@XendraColumn(AD_Element_ID="b4701f57-f2fc-567c-58e2-a6aefbc3932c",ColumnName="M_Product_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="4281f8eb-238e-6b28-eb66-8cc866e6312c",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="f8aeed5e-b4ae-030d-0ead-3a84a963dcb5",Synchronized="2017-08-05 16:52:17.0")
/** Column name M_Product_ID */
public static final String COLUMNNAME_M_Product_ID = "M_Product_ID";
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

@XendraTrl(Identifier="4b9f1273-0296-77e7-d391-5c47fda8ee77")
public static String es_PE_FIELD_Asset_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="4b9f1273-0296-77e7-d391-5c47fda8ee77")
public static String es_PE_FIELD_Asset_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraTrl(Identifier="4b9f1273-0296-77e7-d391-5c47fda8ee77")
public static String es_PE_FIELD_Asset_Name_Name="Nombre";
@XendraField(AD_Column_ID="Name",
IsCentrallyMaintained=true,AD_Tab_ID="4f87ac11-81f6-543e-7e3e-291a85884206",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=40,SortNo=1,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="4b9f1273-0296-77e7-d391-5c47fda8ee77")
public static final String FIELDNAME_Asset_Name="4b9f1273-0296-77e7-d391-5c47fda8ee77";

@XendraTrl(Identifier="eb605ca6-ca0f-3782-a80d-ab39d6bd3ae9")
public static String es_PE_FIELD_PartnerAssets_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="eb605ca6-ca0f-3782-a80d-ab39d6bd3ae9")
public static String es_PE_FIELD_PartnerAssets_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraTrl(Identifier="eb605ca6-ca0f-3782-a80d-ab39d6bd3ae9")
public static String es_PE_FIELD_PartnerAssets_Name_Name="Nombre";
@XendraField(AD_Column_ID="Name",
IsCentrallyMaintained=true,AD_Tab_ID="d008ef58-b109-b177-118e-ca3a523b2aa6",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=50,SortNo=2,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="eb605ca6-ca0f-3782-a80d-ab39d6bd3ae9")
public static final String FIELDNAME_PartnerAssets_Name="eb605ca6-ca0f-3782-a80d-ab39d6bd3ae9";

@XendraTrl(Identifier="581503a0-c3ce-830a-bdfc-da48a71bfa6b")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="581503a0-c3ce-830a-bdfc-da48a71bfa6b",
Synchronized="2017-08-05 16:52:17.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
/** Set nextmaintenanceuseunit.
@param nextmaintenanceuseunit nextmaintenanceuseunit */
public void setnextmaintenanceuseunit (int nextmaintenanceuseunit)
{
set_Value (COLUMNNAME_nextmaintenanceuseunit, Integer.valueOf(nextmaintenanceuseunit));
}
/** Get nextmaintenanceuseunit.
@return nextmaintenanceuseunit */
public int getnextmaintenanceuseunit() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_nextmaintenanceuseunit);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="c0ce6c85-6728-f4db-e243-9a5afd9d026a")
public static String es_PE_COLUMN_nextmaintenanceuseunit_Name="nextmaintenanceuseunit";

@XendraColumn(AD_Element_ID="b8bca857-8949-a257-9624-f4357063f86b",
ColumnName="nextmaintenanceuseunit",AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="c0ce6c85-6728-f4db-e243-9a5afd9d026a",Synchronized="2017-08-05 16:52:17.0")
/** Column name nextmaintenanceuseunit */
public static final String COLUMNNAME_nextmaintenanceuseunit = "nextmaintenanceuseunit";
/** Set Next Maintenence.
@param NextMaintenenceDate Next Maintenence Date */
public void setNextMaintenenceDate (Timestamp NextMaintenenceDate)
{
set_Value (COLUMNNAME_NextMaintenenceDate, NextMaintenenceDate);
}
/** Get Next Maintenence.
@return Next Maintenence Date */
public Timestamp getNextMaintenenceDate() 
{
return (Timestamp)get_Value(COLUMNNAME_NextMaintenenceDate);
}

@XendraTrl(Identifier="8b7ec8c2-aa3e-e73f-0f78-e7a2ad136f27")
public static String es_PE_FIELD_Asset_NextMaintenence_Description="Fecha del Siguiente Mantenimiénto";

@XendraTrl(Identifier="8b7ec8c2-aa3e-e73f-0f78-e7a2ad136f27")
public static String es_PE_FIELD_Asset_NextMaintenence_Name="Siguiente Mantenimiénto";

@XendraField(AD_Column_ID="NextMaintenenceDate",IsCentrallyMaintained=true,
AD_Tab_ID="4f87ac11-81f6-543e-7e3e-291a85884206",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=7,IsReadOnly=false,SeqNo=380,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8b7ec8c2-aa3e-e73f-0f78-e7a2ad136f27")
public static final String FIELDNAME_Asset_NextMaintenence="8b7ec8c2-aa3e-e73f-0f78-e7a2ad136f27";

@XendraTrl(Identifier="ea5acf16-b753-5d94-df1b-0128bec8a168")
public static String es_PE_COLUMN_NextMaintenenceDate_Name="Siguiente Mantenimiénto";

@XendraColumn(AD_Element_ID="1038df41-21f7-ab3c-1633-31064cbde7ca",
ColumnName="NextMaintenenceDate",AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=7,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="ea5acf16-b753-5d94-df1b-0128bec8a168",Synchronized="2017-08-05 16:52:17.0")
/** Column name NextMaintenenceDate */
public static final String COLUMNNAME_NextMaintenenceDate = "NextMaintenenceDate";
/** Set Next Unit.
@param NextMaintenenceUnit Next Maintenence Unit */
public void setNextMaintenenceUnit (int NextMaintenenceUnit)
{
set_Value (COLUMNNAME_NextMaintenenceUnit, Integer.valueOf(NextMaintenenceUnit));
}
/** Get Next Unit.
@return Next Maintenence Unit */
public int getNextMaintenenceUnit() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_NextMaintenenceUnit);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="f6705aab-cc51-03f4-c98e-2fc09950af3e")
public static String es_PE_FIELD_Asset_NextUnit_Description="Unidad Siguiente de Mantenimiénto";

@XendraTrl(Identifier="f6705aab-cc51-03f4-c98e-2fc09950af3e")
public static String es_PE_FIELD_Asset_NextUnit_Name="Unidad Siguiente";

@XendraField(AD_Column_ID="NextMaintenenceUnit",IsCentrallyMaintained=true,
AD_Tab_ID="4f87ac11-81f6-543e-7e3e-291a85884206",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=390,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f6705aab-cc51-03f4-c98e-2fc09950af3e")
public static final String FIELDNAME_Asset_NextUnit="f6705aab-cc51-03f4-c98e-2fc09950af3e";

@XendraTrl(Identifier="5ad94a58-0988-89dd-c88b-a8ebbc1b1b2e")
public static String es_PE_COLUMN_NextMaintenenceUnit_Name="Unidad Siguiente";

@XendraColumn(AD_Element_ID="def6643a-1c70-5a22-c988-a79098c80bbc",
ColumnName="NextMaintenenceUnit",AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="5ad94a58-0988-89dd-c88b-a8ebbc1b1b2e",Synchronized="2017-08-05 16:52:17.0")
/** Column name NextMaintenenceUnit */
public static final String COLUMNNAME_NextMaintenenceUnit = "NextMaintenenceUnit";
/** Set Quantity.
@param Qty Quantity */
public void setQty (BigDecimal Qty)
{
set_Value (COLUMNNAME_Qty, Qty);
}
/** Get Quantity.
@return Quantity */
public BigDecimal getQty() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Qty);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="35bc5fc5-4aa8-3a0e-a597-2d023ac3e744")
public static String es_PE_FIELD_Asset_Quantity_Description="Cantidad";

@XendraTrl(Identifier="35bc5fc5-4aa8-3a0e-a597-2d023ac3e744")
public static String es_PE_FIELD_Asset_Quantity_Help="La Cantidad indica el número de un producto específico o artículo para este documento";

@XendraTrl(Identifier="35bc5fc5-4aa8-3a0e-a597-2d023ac3e744")
public static String es_PE_FIELD_Asset_Quantity_Name="Cantidad";
@XendraField(AD_Column_ID="Qty",
IsCentrallyMaintained=true,AD_Tab_ID="4f87ac11-81f6-543e-7e3e-291a85884206",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=160,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="35bc5fc5-4aa8-3a0e-a597-2d023ac3e744")
public static final String FIELDNAME_Asset_Quantity="35bc5fc5-4aa8-3a0e-a597-2d023ac3e744";

@XendraTrl(Identifier="581b7055-4fda-8931-9495-beeb65b4f673")
public static String es_PE_FIELD_PartnerAssets_Quantity_Description="Cantidad";

@XendraTrl(Identifier="581b7055-4fda-8931-9495-beeb65b4f673")
public static String es_PE_FIELD_PartnerAssets_Quantity_Help="La Cantidad indica el número de un producto específico o artículo para este documento";

@XendraTrl(Identifier="581b7055-4fda-8931-9495-beeb65b4f673")
public static String es_PE_FIELD_PartnerAssets_Quantity_Name="Cantidad";

@XendraField(AD_Column_ID="Qty",IsCentrallyMaintained=true,
AD_Tab_ID="d008ef58-b109-b177-118e-ca3a523b2aa6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="581b7055-4fda-8931-9495-beeb65b4f673")
public static final String FIELDNAME_PartnerAssets_Quantity="581b7055-4fda-8931-9495-beeb65b4f673";

@XendraTrl(Identifier="76e4ee82-5241-ca56-538d-a83cee1174a4")
public static String es_PE_COLUMN_Qty_Name="Cantidad";

@XendraColumn(AD_Element_ID="c9d74a25-87c5-9592-5660-4f397607dad3",ColumnName="Qty",
AD_Reference_ID=29,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="76e4ee82-5241-ca56-538d-a83cee1174a4",
Synchronized="2017-08-05 16:52:17.0")
/** Column name Qty */
public static final String COLUMNNAME_Qty = "Qty";
/** Set Serial No.
@param SerNo Product Serial Number  */
public void setSerNo (String SerNo)
{
if (SerNo != null && SerNo.length() > 255)
{
log.warning("Length > 255 - truncated");
SerNo = SerNo.substring(0,254);
}
set_Value (COLUMNNAME_SerNo, SerNo);
}
/** Get Serial No.
@return Product Serial Number  */
public String getSerNo() 
{
String value = (String)get_Value(COLUMNNAME_SerNo);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="c720d1c0-11ce-f8b2-a7ab-2f87db9cea83")
public static String es_PE_FIELD_Asset_SerialNo_Description="Número de serie del producto";

@XendraTrl(Identifier="c720d1c0-11ce-f8b2-a7ab-2f87db9cea83")
public static String es_PE_FIELD_Asset_SerialNo_Help="El número de serie identifica un producto garantizado; monitoreado. Puede solamente ser usado cuando la cantidad es 1.";

@XendraTrl(Identifier="c720d1c0-11ce-f8b2-a7ab-2f87db9cea83")
public static String es_PE_FIELD_Asset_SerialNo_Name="No. de Serie";

@XendraField(AD_Column_ID="SerNo",IsCentrallyMaintained=true,
AD_Tab_ID="4f87ac11-81f6-543e-7e3e-291a85884206",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=120,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c720d1c0-11ce-f8b2-a7ab-2f87db9cea83")
public static final String FIELDNAME_Asset_SerialNo="c720d1c0-11ce-f8b2-a7ab-2f87db9cea83";

@XendraTrl(Identifier="aaf38943-90cb-4ef4-7141-14e53abb7629")
public static String es_PE_FIELD_PartnerAssets_SerialNo_Description="Número de serie del producto";

@XendraTrl(Identifier="aaf38943-90cb-4ef4-7141-14e53abb7629")
public static String es_PE_FIELD_PartnerAssets_SerialNo_Help="El número de serie identifica un producto garantizado; monitoreado. Puede solamente ser usado cuando la cantidad es 1.";

@XendraTrl(Identifier="aaf38943-90cb-4ef4-7141-14e53abb7629")
public static String es_PE_FIELD_PartnerAssets_SerialNo_Name="No. de Serie";

@XendraField(AD_Column_ID="SerNo",IsCentrallyMaintained=true,
AD_Tab_ID="d008ef58-b109-b177-118e-ca3a523b2aa6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="aaf38943-90cb-4ef4-7141-14e53abb7629")
public static final String FIELDNAME_PartnerAssets_SerialNo="aaf38943-90cb-4ef4-7141-14e53abb7629";

@XendraTrl(Identifier="24271d52-5206-cc5e-03bb-7610a31fa8ea")
public static String es_PE_COLUMN_SerNo_Name="No. de Serie";

@XendraColumn(AD_Element_ID="9aac6ac8-a553-7ad4-9bc7-40f85e011f4b",ColumnName="SerNo",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="24271d52-5206-cc5e-03bb-7610a31fa8ea",
Synchronized="2017-08-05 16:52:17.0")
/** Column name SerNo */
public static final String COLUMNNAME_SerNo = "SerNo";
/** Set Usable Life - Months.
@param UseLifeMonths Months of the usable life of the asset */
public void setUseLifeMonths (int UseLifeMonths)
{
set_Value (COLUMNNAME_UseLifeMonths, Integer.valueOf(UseLifeMonths));
}
/** Get Usable Life - Months.
@return Months of the usable life of the asset */
public int getUseLifeMonths() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_UseLifeMonths);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="e0f623c9-2061-f3dd-f8db-ea08b4a06493")
public static String es_PE_FIELD_Asset_UsableLife_Months_Description="Vida util del activo en Meses";

@XendraTrl(Identifier="e0f623c9-2061-f3dd-f8db-ea08b4a06493")
public static String es_PE_FIELD_Asset_UsableLife_Months_Name="Vida Util en - Meses";

@XendraField(AD_Column_ID="UseLifeMonths",IsCentrallyMaintained=true,
AD_Tab_ID="4f87ac11-81f6-543e-7e3e-291a85884206",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsOwned@=Y",DisplayLength=11,IsReadOnly=false,SeqNo=320,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e0f623c9-2061-f3dd-f8db-ea08b4a06493")
public static final String FIELDNAME_Asset_UsableLife_Months="e0f623c9-2061-f3dd-f8db-ea08b4a06493";

@XendraTrl(Identifier="0ac58f6d-2d3c-9a64-6af1-efb9474b399d")
public static String es_PE_FIELD_PartnerAssets_UsableLife_Months_Description="Vida util del activo en Meses";

@XendraTrl(Identifier="0ac58f6d-2d3c-9a64-6af1-efb9474b399d")
public static String es_PE_FIELD_PartnerAssets_UsableLife_Months_Name="Vida Util en - Meses";

@XendraField(AD_Column_ID="UseLifeMonths",IsCentrallyMaintained=true,
AD_Tab_ID="d008ef58-b109-b177-118e-ca3a523b2aa6",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0ac58f6d-2d3c-9a64-6af1-efb9474b399d")
public static final String FIELDNAME_PartnerAssets_UsableLife_Months="0ac58f6d-2d3c-9a64-6af1-efb9474b399d";

@XendraTrl(Identifier="cd7cbb5e-99c6-916e-b475-fb53eecc078e")
public static String es_PE_COLUMN_UseLifeMonths_Name="Vida Util en - Meses";

@XendraColumn(AD_Element_ID="18790214-83ef-6f36-030f-ea77b878824e",ColumnName="UseLifeMonths",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="cd7cbb5e-99c6-916e-b475-fb53eecc078e",
Synchronized="2017-08-05 16:52:17.0")
/** Column name UseLifeMonths */
public static final String COLUMNNAME_UseLifeMonths = "UseLifeMonths";
/** Set Usable Life - Years.
@param UseLifeYears Years of the usable life of the asset */
public void setUseLifeYears (int UseLifeYears)
{
set_Value (COLUMNNAME_UseLifeYears, Integer.valueOf(UseLifeYears));
}
/** Get Usable Life - Years.
@return Years of the usable life of the asset */
public int getUseLifeYears() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_UseLifeYears);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="dba65bdb-bd8f-56ce-554c-a2f04816b519")
public static String es_PE_FIELD_Asset_UsableLife_Years_Description="Vida util del activo en años";

@XendraTrl(Identifier="dba65bdb-bd8f-56ce-554c-a2f04816b519")
public static String es_PE_FIELD_Asset_UsableLife_Years_Name="Vida Util en Años";

@XendraField(AD_Column_ID="UseLifeYears",IsCentrallyMaintained=true,
AD_Tab_ID="4f87ac11-81f6-543e-7e3e-291a85884206",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsOwned@=Y",DisplayLength=11,IsReadOnly=false,SeqNo=310,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="dba65bdb-bd8f-56ce-554c-a2f04816b519")
public static final String FIELDNAME_Asset_UsableLife_Years="dba65bdb-bd8f-56ce-554c-a2f04816b519";

@XendraTrl(Identifier="b0a003b4-760a-f048-b415-5d7092e9cbc7")
public static String es_PE_FIELD_PartnerAssets_UsableLife_Years_Description="Vida util del activo en años";

@XendraTrl(Identifier="b0a003b4-760a-f048-b415-5d7092e9cbc7")
public static String es_PE_FIELD_PartnerAssets_UsableLife_Years_Name="Vida Util en Años";

@XendraField(AD_Column_ID="UseLifeYears",IsCentrallyMaintained=true,
AD_Tab_ID="d008ef58-b109-b177-118e-ca3a523b2aa6",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b0a003b4-760a-f048-b415-5d7092e9cbc7")
public static final String FIELDNAME_PartnerAssets_UsableLife_Years="b0a003b4-760a-f048-b415-5d7092e9cbc7";

@XendraTrl(Identifier="de405c1f-c49e-3c81-b950-97350f3f448c")
public static String es_PE_COLUMN_UseLifeYears_Name="Vida Util en Años";

@XendraColumn(AD_Element_ID="06e02a8d-c72e-3419-9583-f9960be07aa8",ColumnName="UseLifeYears",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="de405c1f-c49e-3c81-b950-97350f3f448c",
Synchronized="2017-08-05 16:52:17.0")
/** Column name UseLifeYears */
public static final String COLUMNNAME_UseLifeYears = "UseLifeYears";
/** Set Use units.
@param UseUnits Currently used units of the assets */
public void setUseUnits (int UseUnits)
{
set_ValueNoCheck (COLUMNNAME_UseUnits, Integer.valueOf(UseUnits));
}
/** Get Use units.
@return Currently used units of the assets */
public int getUseUnits() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_UseUnits);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="e8ba601b-2ab4-15b4-a188-dc979758937a")
public static String es_PE_FIELD_Asset_UseUnits_Description="Unidades actualmente utilizadas en el activo.";

@XendraTrl(Identifier="e8ba601b-2ab4-15b4-a188-dc979758937a")
public static String es_PE_FIELD_Asset_UseUnits_Help="Unidades actualmente utilizadas en el activo";

@XendraTrl(Identifier="e8ba601b-2ab4-15b4-a188-dc979758937a")
public static String es_PE_FIELD_Asset_UseUnits_Name="Unidades Actualmente Utilizadas";

@XendraField(AD_Column_ID="UseUnits",IsCentrallyMaintained=true,
AD_Tab_ID="4f87ac11-81f6-543e-7e3e-291a85884206",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=340,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e8ba601b-2ab4-15b4-a188-dc979758937a")
public static final String FIELDNAME_Asset_UseUnits="e8ba601b-2ab4-15b4-a188-dc979758937a";

@XendraTrl(Identifier="954ff665-b348-fb45-265b-e04c04048e46")
public static String es_PE_FIELD_PartnerAssets_UseUnits_Description="Unidades actualmente utilizadas en el activo.";

@XendraTrl(Identifier="954ff665-b348-fb45-265b-e04c04048e46")
public static String es_PE_FIELD_PartnerAssets_UseUnits_Help="Unidades actualmente utilizadas en el activo";

@XendraTrl(Identifier="954ff665-b348-fb45-265b-e04c04048e46")
public static String es_PE_FIELD_PartnerAssets_UseUnits_Name="Unidades Actualmente Utilizadas";

@XendraField(AD_Column_ID="UseUnits",IsCentrallyMaintained=true,
AD_Tab_ID="d008ef58-b109-b177-118e-ca3a523b2aa6",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="954ff665-b348-fb45-265b-e04c04048e46")
public static final String FIELDNAME_PartnerAssets_UseUnits="954ff665-b348-fb45-265b-e04c04048e46";

@XendraTrl(Identifier="ae58d0f0-affc-3790-ce54-0386d1aefd1b")
public static String es_PE_COLUMN_UseUnits_Name="Unidades Actualmente Utilizadas";

@XendraColumn(AD_Element_ID="f6cd9455-bb4f-4868-e3fe-7195c3b2ed14",ColumnName="UseUnits",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ae58d0f0-affc-3790-ce54-0386d1aefd1b",
Synchronized="2017-08-05 16:52:17.0")
/** Column name UseUnits */
public static final String COLUMNNAME_UseUnits = "UseUnits";
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
@XendraTrl(Identifier="2e33eafc-5e1b-e34e-e317-73fdcf836cdc")
public static String es_PE_FIELD_Asset_SearchKey_Description="Clave de búsqueda para el registro en el formato requerido; debe ser única";

@XendraTrl(Identifier="2e33eafc-5e1b-e34e-e317-73fdcf836cdc")
public static String es_PE_FIELD_Asset_SearchKey_Help="Una clave de búsqueda le permite a usted un método rápido de encontrar un registro en particular";

@XendraTrl(Identifier="2e33eafc-5e1b-e34e-e317-73fdcf836cdc")
public static String es_PE_FIELD_Asset_SearchKey_Name="Clave de Búsqueda";

@XendraField(AD_Column_ID="Value",IsCentrallyMaintained=true,
AD_Tab_ID="4f87ac11-81f6-543e-7e3e-291a85884206",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2e33eafc-5e1b-e34e-e317-73fdcf836cdc")
public static final String FIELDNAME_Asset_SearchKey="2e33eafc-5e1b-e34e-e317-73fdcf836cdc";

@XendraTrl(Identifier="e2ece754-0e08-aec1-6c07-dea8818ed0c3")
public static String es_PE_FIELD_PartnerAssets_SearchKey_Description="Clave de búsqueda para el registro en el formato requerido; debe ser única";

@XendraTrl(Identifier="e2ece754-0e08-aec1-6c07-dea8818ed0c3")
public static String es_PE_FIELD_PartnerAssets_SearchKey_Help="Una clave de búsqueda le permite a usted un método rápido de encontrar un registro en particular";

@XendraTrl(Identifier="e2ece754-0e08-aec1-6c07-dea8818ed0c3")
public static String es_PE_FIELD_PartnerAssets_SearchKey_Name="Clave de Búsqueda";

@XendraField(AD_Column_ID="Value",IsCentrallyMaintained=true,
AD_Tab_ID="d008ef58-b109-b177-118e-ca3a523b2aa6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e2ece754-0e08-aec1-6c07-dea8818ed0c3")
public static final String FIELDNAME_PartnerAssets_SearchKey="e2ece754-0e08-aec1-6c07-dea8818ed0c3";

@XendraTrl(Identifier="b03be2c1-7778-d40d-7328-a11a5b2d0f4c")
public static String es_PE_COLUMN_Value_Name="Clave de Búsqueda";

@XendraColumn(AD_Element_ID="e75e100c-9b41-a643-2cb3-46eeced683d8",ColumnName="Value",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b03be2c1-7778-d40d-7328-a11a5b2d0f4c",
Synchronized="2017-08-05 16:52:18.0")
/** Column name Value */
public static final String COLUMNNAME_Value = "Value";
/** Set Version No.
@param VersionNo Version Number */
public void setVersionNo (String VersionNo)
{
if (VersionNo != null && VersionNo.length() > 20)
{
log.warning("Length > 20 - truncated");
VersionNo = VersionNo.substring(0,19);
}
set_Value (COLUMNNAME_VersionNo, VersionNo);
}
/** Get Version No.
@return Version Number */
public String getVersionNo() 
{
String value = (String)get_Value(COLUMNNAME_VersionNo);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="39c8bcb2-0cce-7d50-feb8-310b3ceb4394")
public static String es_PE_FIELD_Asset_VersionNo_Description="Número de versión";

@XendraTrl(Identifier="39c8bcb2-0cce-7d50-feb8-310b3ceb4394")
public static String es_PE_FIELD_Asset_VersionNo_Name="No. de Versión";

@XendraField(AD_Column_ID="VersionNo",IsCentrallyMaintained=true,
AD_Tab_ID="4f87ac11-81f6-543e-7e3e-291a85884206",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="39c8bcb2-0cce-7d50-feb8-310b3ceb4394")
public static final String FIELDNAME_Asset_VersionNo="39c8bcb2-0cce-7d50-feb8-310b3ceb4394";

@XendraTrl(Identifier="7a69886a-4fec-6d42-9db6-4b4f316f53ca")
public static String es_PE_FIELD_PartnerAssets_VersionNo_Description="Número de versión";

@XendraTrl(Identifier="7a69886a-4fec-6d42-9db6-4b4f316f53ca")
public static String es_PE_FIELD_PartnerAssets_VersionNo_Name="No. de Versión";

@XendraField(AD_Column_ID="VersionNo",IsCentrallyMaintained=true,
AD_Tab_ID="d008ef58-b109-b177-118e-ca3a523b2aa6",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7a69886a-4fec-6d42-9db6-4b4f316f53ca")
public static final String FIELDNAME_PartnerAssets_VersionNo="7a69886a-4fec-6d42-9db6-4b4f316f53ca";

@XendraTrl(Identifier="89ee7143-8e9d-010b-5476-84591b288741")
public static String es_PE_COLUMN_VersionNo_Name="No. de Versión";

@XendraColumn(AD_Element_ID="be2c9d9c-6f4c-295d-d62f-5aaf587fb5a0",ColumnName="VersionNo",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=20,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="89ee7143-8e9d-010b-5476-84591b288741",
Synchronized="2017-08-05 16:52:18.0")
/** Column name VersionNo */
public static final String COLUMNNAME_VersionNo = "VersionNo";
}
