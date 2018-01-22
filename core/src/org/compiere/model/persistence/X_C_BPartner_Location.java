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
/** Generated Model for C_BPartner_Location
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_C_BPartner_Location extends PO
{
/** Standard Constructor
@param ctx context
@param C_BPartner_Location_ID id
@param trxName transaction
*/
public X_C_BPartner_Location (Properties ctx, int C_BPartner_Location_ID, String trxName)
{
super (ctx, C_BPartner_Location_ID, trxName);
/** if (C_BPartner_Location_ID == 0)
{
setC_BPartner_ID (0);
setC_BPartner_Location_ID (0);
setC_Location_ID (0);
setIsBillTo (true);	
// Y
setIsPayFrom (true);	
// Y
setIsRemitTo (true);	
// Y
setIsShipTo (true);	
// Y
setName (null);	
// .
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_C_BPartner_Location (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=293 */
public static int Table_ID=MTable.getTable_ID("C_BPartner_Location");

@XendraTrl(Identifier="2903c6c2-fbe6-0c39-b227-cbc34fc03540")
public static String es_PE_TAB_Location_Description="Definir localización";

@XendraTrl(Identifier="2903c6c2-fbe6-0c39-b227-cbc34fc03540")
public static String es_PE_TAB_Location_Name="Localización";

@XendraTrl(Identifier="2903c6c2-fbe6-0c39-b227-cbc34fc03540")
public static String es_PE_TAB_Location_Help="La pestaña Localización define la localización física de un socio de negocio. Un socio de negocio puede tener registros múltiples de localización.";

@XendraTab(Name="Location",Description="Define Location",
Help="The Location Tab defines the physical location of a business partner.  A business partner may have multiple location records.",
AD_Window_ID="273719a2-ec2e-9b44-d30b-014c7ec70d0e",SeqNo=11,TabLevel=1,IsSingleRow=true,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="2903c6c2-fbe6-0c39-b227-cbc34fc03540",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Location="2903c6c2-fbe6-0c39-b227-cbc34fc03540";

@XendraTrl(Identifier="89f3c0c9-7dd0-2573-e1ad-8ad52805c439")
public static String es_PE_TABLE_C_BPartner_Location_Name="Dirección del Socio del Negocio";


@XendraTable(Name="Partner Location",
Description="Identifies the (ship to) address for this Business Partner",Help="",
TableName="C_BPartner_Location",AccessLevel="3",
AD_Window_ID="273719a2-ec2e-9b44-d30b-014c7ec70d0e",AD_Val_Rule_ID="",IsKey=1,LoadSeq=75,
IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,IsView=false,
PO_Window_ID="",ID="org.xendra.commercial",Identifier="89f3c0c9-7dd0-2573-e1ad-8ad52805c439",
Synchronized="2017-08-16 11:41:31.0")
/** TableName=C_BPartner_Location */
public static final String Table_Name="C_BPartner_Location";


@XendraIndex(Name="c_bplocation_bpartner",Identifier="f8658f25-6c1d-8d26-898d-f640a44796f9",
Column_Names="c_bpartner_id",IsUnique="false",
TableIdentifier="f8658f25-6c1d-8d26-898d-f640a44796f9",Synchronized="2014-06-01 19:03:58.0")
public static final String INDEXNAME_c_bplocation_bpartner = "f8658f25-6c1d-8d26-898d-f640a44796f9";


@XendraIndex(Name="c_bplocation_updated",Identifier="728b72cf-402a-cdd2-525d-b14cfcaa5535",
Column_Names="updated",IsUnique="false",TableIdentifier="728b72cf-402a-cdd2-525d-b14cfcaa5535",
Synchronized="2014-06-01 19:03:58.0")
public static final String INDEXNAME_c_bplocation_updated = "728b72cf-402a-cdd2-525d-b14cfcaa5535";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"C_BPartner_Location");

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
    Table_ID = MTable.getTable_ID("C_BPartner_Location");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_C_BPartner_Location[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Business Partner .
@param C_BPartner_ID Identifies a Business Partner */
public void setC_BPartner_ID (int C_BPartner_ID)
{
if (C_BPartner_ID < 1) throw new IllegalArgumentException ("C_BPartner_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_BPartner_ID, Integer.valueOf(C_BPartner_ID));
}
/** Get Business Partner .
@return Identifies a Business Partner */
public int getC_BPartner_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_BPartner_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="92f9c005-820e-c6bd-f900-a5d68c82bad2")
public static String es_PE_FIELD_Location_BusinessPartner_Description="Identifica un Socio de Negocio";

@XendraTrl(Identifier="92f9c005-820e-c6bd-f900-a5d68c82bad2")
public static String es_PE_FIELD_Location_BusinessPartner_Help="Un socio de negocio es cualquiera con quien usted realiza transacciones. Este puede incluir Proveedores; Clientes; Empleados ó Vendedores.";

@XendraTrl(Identifier="92f9c005-820e-c6bd-f900-a5d68c82bad2")
public static String es_PE_FIELD_Location_BusinessPartner_Name="Socio de Negocio";

@XendraField(AD_Column_ID="C_BPartner_ID",IsCentrallyMaintained=true,
AD_Tab_ID="2903c6c2-fbe6-0c39-b227-cbc34fc03540",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="92f9c005-820e-c6bd-f900-a5d68c82bad2")
public static final String FIELDNAME_Location_BusinessPartner="92f9c005-820e-c6bd-f900-a5d68c82bad2";

@XendraTrl(Identifier="e0a4ea5a-b289-e876-997d-285aa37030d0")
public static String es_PE_COLUMN_C_BPartner_ID_Name="Socio de Negocio";

@XendraColumn(AD_Element_ID="fe333dc3-4f40-1276-5f6a-d09bb66dc423",ColumnName="C_BPartner_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e0a4ea5a-b289-e876-997d-285aa37030d0",
Synchronized="2017-08-05 16:53:23.0")
/** Column name C_BPartner_ID */
public static final String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";
/** Set Partner Location.
@param C_BPartner_Location_ID Identifies the (ship to) address for this Business Partner */
public void setC_BPartner_Location_ID (int C_BPartner_Location_ID)
{
if (C_BPartner_Location_ID < 1) throw new IllegalArgumentException ("C_BPartner_Location_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_BPartner_Location_ID, Integer.valueOf(C_BPartner_Location_ID));
}
/** Get Partner Location.
@return Identifies the (ship to) address for this Business Partner */
public int getC_BPartner_Location_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_BPartner_Location_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="ffd0a3cd-6b15-9b4e-2469-e663fe7d2212")
public static String es_PE_FIELD_Location_PartnerLocation_Description="Identifica la dirección para este socio de negocio";

@XendraTrl(Identifier="ffd0a3cd-6b15-9b4e-2469-e663fe7d2212")
public static String es_PE_FIELD_Location_PartnerLocation_Help="La dirección de un socio indica la ubicación de un socio de negocio";

@XendraTrl(Identifier="ffd0a3cd-6b15-9b4e-2469-e663fe7d2212")
public static String es_PE_FIELD_Location_PartnerLocation_Name="Dirección del Socio del Negocio";

@XendraField(AD_Column_ID="C_BPartner_Location_ID",IsCentrallyMaintained=true,
AD_Tab_ID="2903c6c2-fbe6-0c39-b227-cbc34fc03540",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ffd0a3cd-6b15-9b4e-2469-e663fe7d2212")
public static final String FIELDNAME_Location_PartnerLocation="ffd0a3cd-6b15-9b4e-2469-e663fe7d2212";
/** Column name C_BPartner_Location_ID */
public static final String COLUMNNAME_C_BPartner_Location_ID = "C_BPartner_Location_ID";
/** Set Address.
@param C_Location_ID Location or Address */
public void setC_Location_ID (int C_Location_ID)
{
if (C_Location_ID < 1) throw new IllegalArgumentException ("C_Location_ID is mandatory.");
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

@XendraTrl(Identifier="b44c617c-10a4-97a1-b359-5b97ea7726f5")
public static String es_PE_FIELD_Location_Address_Description="Ubicación ó dirección";

@XendraTrl(Identifier="b44c617c-10a4-97a1-b359-5b97ea7726f5")
public static String es_PE_FIELD_Location_Address_Help="El campo Ubicación / Dirección define la ubicación de una entidad.";

@XendraTrl(Identifier="b44c617c-10a4-97a1-b359-5b97ea7726f5")
public static String es_PE_FIELD_Location_Address_Name="Localización / Dirección";

@XendraField(AD_Column_ID="C_Location_ID",IsCentrallyMaintained=true,
AD_Tab_ID="2903c6c2-fbe6-0c39-b227-cbc34fc03540",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b44c617c-10a4-97a1-b359-5b97ea7726f5")
public static final String FIELDNAME_Location_Address="b44c617c-10a4-97a1-b359-5b97ea7726f5";

@XendraTrl(Identifier="9e5fc827-24f5-5976-446b-78e69e8a02e6")
public static String es_PE_COLUMN_C_Location_ID_Name="Localización / Dirección";

@XendraColumn(AD_Element_ID="e66e22a8-535b-2af2-6efb-aa600959a885",ColumnName="C_Location_ID",
AD_Reference_ID=21,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9e5fc827-24f5-5976-446b-78e69e8a02e6",
Synchronized="2017-08-05 16:53:23.0")
/** Column name C_Location_ID */
public static final String COLUMNNAME_C_Location_ID = "C_Location_ID";
/** Set Sales Region.
@param C_SalesRegion_ID Sales coverage region */
public void setC_SalesRegion_ID (int C_SalesRegion_ID)
{
if (C_SalesRegion_ID <= 0) set_Value (COLUMNNAME_C_SalesRegion_ID, null);
 else 
set_Value (COLUMNNAME_C_SalesRegion_ID, Integer.valueOf(C_SalesRegion_ID));
}
/** Get Sales Region.
@return Sales coverage region */
public int getC_SalesRegion_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_SalesRegion_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="6da34ec9-6010-dc89-9556-1a5e40850362")
public static String es_PE_FIELD_Location_SalesRegion_Description="Región de cobertura de ventas.";

@XendraTrl(Identifier="6da34ec9-6010-dc89-9556-1a5e40850362")
public static String es_PE_FIELD_Location_SalesRegion_Help="La región de ventas indica una área de cobertura de ventas específica.";

@XendraTrl(Identifier="6da34ec9-6010-dc89-9556-1a5e40850362")
public static String es_PE_FIELD_Location_SalesRegion_Name="Región de Ventas";

@XendraField(AD_Column_ID="C_SalesRegion_ID",IsCentrallyMaintained=true,
AD_Tab_ID="2903c6c2-fbe6-0c39-b227-cbc34fc03540",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=160,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6da34ec9-6010-dc89-9556-1a5e40850362")
public static final String FIELDNAME_Location_SalesRegion="6da34ec9-6010-dc89-9556-1a5e40850362";

@XendraTrl(Identifier="d2d7be9c-5a84-e2ce-6e60-d1c3c3e6d63e")
public static String es_PE_COLUMN_C_SalesRegion_ID_Name="Región de Ventas";

@XendraColumn(AD_Element_ID="26b40f06-df79-27f7-adb4-8ae6c5a1c9b8",ColumnName="C_SalesRegion_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d2d7be9c-5a84-e2ce-6e60-d1c3c3e6d63e",
Synchronized="2017-08-05 16:53:23.0")
/** Column name C_SalesRegion_ID */
public static final String COLUMNNAME_C_SalesRegion_ID = "C_SalesRegion_ID";
/** Set Fax.
@param Fax Facsimile number */
public void setFax (String Fax)
{
if (Fax != null && Fax.length() > 40)
{
log.warning("Length > 40 - truncated");
Fax = Fax.substring(0,39);
}
set_Value (COLUMNNAME_Fax, Fax);
}
/** Get Fax.
@return Facsimile number */
public String getFax() 
{
String value = (String)get_Value(COLUMNNAME_Fax);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="2c73582e-d7ea-9de8-7cc9-45c01e3a7766")
public static String es_PE_FIELD_Location_Fax_Description="Número de Fax";

@XendraTrl(Identifier="2c73582e-d7ea-9de8-7cc9-45c01e3a7766")
public static String es_PE_FIELD_Location_Fax_Help="El Fax indica un número de fax para este socio de negocio ó ubicación";

@XendraTrl(Identifier="2c73582e-d7ea-9de8-7cc9-45c01e3a7766")
public static String es_PE_FIELD_Location_Fax_Name="Fax";
@XendraField(AD_Column_ID="Fax",
IsCentrallyMaintained=true,AD_Tab_ID="2903c6c2-fbe6-0c39-b227-cbc34fc03540",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=100,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="2c73582e-d7ea-9de8-7cc9-45c01e3a7766")
public static final String FIELDNAME_Location_Fax="2c73582e-d7ea-9de8-7cc9-45c01e3a7766";

@XendraTrl(Identifier="7c2c89ad-ff25-f805-e780-fa7eb3509077")
public static String es_PE_COLUMN_Fax_Name="Fax";

@XendraColumn(AD_Element_ID="8a02a423-cb7b-6c2f-8be1-1423aec1ba37",ColumnName="Fax",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7c2c89ad-ff25-f805-e780-fa7eb3509077",
Synchronized="2017-08-05 16:53:23.0")
/** Column name Fax */
public static final String COLUMNNAME_Fax = "Fax";
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
@XendraTrl(Identifier="06c02062-5896-4843-aeb7-f2aa325ba45c")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="06c02062-5896-4843-aeb7-f2aa325ba45c",
Synchronized="2017-08-05 16:53:23.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Invoice Address.
@param IsBillTo Business Partner Invoice/Bill Address */
public void setIsBillTo (boolean IsBillTo)
{
set_Value (COLUMNNAME_IsBillTo, Boolean.valueOf(IsBillTo));
}
/** Get Invoice Address.
@return Business Partner Invoice/Bill Address */
public boolean isBillTo() 
{
Object oo = get_Value(COLUMNNAME_IsBillTo);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="c4f8d570-ad67-4585-bc9e-e3a132906add")
public static String es_PE_FIELD_Location_InvoiceAddress_Description="Indica que esta dirección es la dirección de facturar A";

@XendraTrl(Identifier="c4f8d570-ad67-4585-bc9e-e3a132906add")
public static String es_PE_FIELD_Location_InvoiceAddress_Help="El cuadro de verificación facturar A indica si esta ubicación es la dirección de facturar A para este socio de negocio";

@XendraTrl(Identifier="c4f8d570-ad67-4585-bc9e-e3a132906add")
public static String es_PE_FIELD_Location_InvoiceAddress_Name="Dirección Facturar-A";

@XendraField(AD_Column_ID="IsBillTo",IsCentrallyMaintained=true,
AD_Tab_ID="2903c6c2-fbe6-0c39-b227-cbc34fc03540",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=130,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c4f8d570-ad67-4585-bc9e-e3a132906add")
public static final String FIELDNAME_Location_InvoiceAddress="c4f8d570-ad67-4585-bc9e-e3a132906add";

@XendraTrl(Identifier="d9c0e1d3-b1fc-df8b-0758-ed4119ad7def")
public static String es_PE_COLUMN_IsBillTo_Name="Dirección Facturar-A";

@XendraColumn(AD_Element_ID="c81d29d1-fa18-3d8e-50da-e912bd036c1e",ColumnName="IsBillTo",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="Y",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d9c0e1d3-b1fc-df8b-0758-ed4119ad7def",
Synchronized="2017-08-05 16:53:23.0")
/** Column name IsBillTo */
public static final String COLUMNNAME_IsBillTo = "IsBillTo";
/** Set ISDN.
@param ISDN ISDN or modem line */
public void setISDN (String ISDN)
{
if (ISDN != null && ISDN.length() > 40)
{
log.warning("Length > 40 - truncated");
ISDN = ISDN.substring(0,39);
}
set_Value (COLUMNNAME_ISDN, ISDN);
}
/** Get ISDN.
@return ISDN or modem line */
public String getISDN() 
{
String value = (String)get_Value(COLUMNNAME_ISDN);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="6889cccc-f028-9047-e41a-7611b8f9b490")
public static String es_PE_FIELD_Location_ISDN_Description="ISDN ó línea con módem";

@XendraTrl(Identifier="6889cccc-f028-9047-e41a-7611b8f9b490")
public static String es_PE_FIELD_Location_ISDN_Help="El ISDN identifica un número de línea Módem ó ISDN";

@XendraTrl(Identifier="6889cccc-f028-9047-e41a-7611b8f9b490")
public static String es_PE_FIELD_Location_ISDN_Name="ISDN";
@XendraField(AD_Column_ID="ISDN",
IsCentrallyMaintained=true,AD_Tab_ID="2903c6c2-fbe6-0c39-b227-cbc34fc03540",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=110,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="6889cccc-f028-9047-e41a-7611b8f9b490")
public static final String FIELDNAME_Location_ISDN="6889cccc-f028-9047-e41a-7611b8f9b490";

@XendraTrl(Identifier="c1f1a5e3-cff0-ad41-9ac2-e9539150e4e3")
public static String es_PE_COLUMN_ISDN_Name="ISDN";

@XendraColumn(AD_Element_ID="8632ad54-4f45-2537-91e0-73fc523261e7",ColumnName="ISDN",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c1f1a5e3-cff0-ad41-9ac2-e9539150e4e3",
Synchronized="2017-08-05 16:53:23.0")
/** Column name ISDN */
public static final String COLUMNNAME_ISDN = "ISDN";
/** Set Pay-From Address.
@param IsPayFrom Business Partner pays from that address and we'll send dunning letters there */
public void setIsPayFrom (boolean IsPayFrom)
{
set_Value (COLUMNNAME_IsPayFrom, Boolean.valueOf(IsPayFrom));
}
/** Get Pay-From Address.
@return Business Partner pays from that address and we'll send dunning letters there */
public boolean isPayFrom() 
{
Object oo = get_Value(COLUMNNAME_IsPayFrom);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="fe94043e-fe37-95f4-cb56-012adf063d22")
public static String es_PE_FIELD_Location_Pay_FromAddress_Description="El socio de negocio paga desde esta dirección y a donde se envían las cartas de morosidad";

@XendraTrl(Identifier="fe94043e-fe37-95f4-cb56-012adf063d22")
public static String es_PE_FIELD_Location_Pay_FromAddress_Help="El cuadro de verificación pagado desde la dirección; indica si esta localización es la dirección donde paga el socio de negocio y a donde las cartas de morosidad serán enviadas.";

@XendraTrl(Identifier="fe94043e-fe37-95f4-cb56-012adf063d22")
public static String es_PE_FIELD_Location_Pay_FromAddress_Name="Dirección Pagar-Desde";

@XendraField(AD_Column_ID="IsPayFrom",IsCentrallyMaintained=true,
AD_Tab_ID="2903c6c2-fbe6-0c39-b227-cbc34fc03540",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=140,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="fe94043e-fe37-95f4-cb56-012adf063d22")
public static final String FIELDNAME_Location_Pay_FromAddress="fe94043e-fe37-95f4-cb56-012adf063d22";

@XendraTrl(Identifier="aa38461a-ff6b-dd93-9d61-80435c6c0de4")
public static String es_PE_COLUMN_IsPayFrom_Name="Dirección Pagar-Desde";

@XendraColumn(AD_Element_ID="21094cb4-fc60-7b7f-d6d2-48ab08bf2952",ColumnName="IsPayFrom",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="Y",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="aa38461a-ff6b-dd93-9d61-80435c6c0de4",
Synchronized="2017-08-05 16:53:23.0")
/** Column name IsPayFrom */
public static final String COLUMNNAME_IsPayFrom = "IsPayFrom";
/** Set Remit-To Address.
@param IsRemitTo Business Partner payment address */
public void setIsRemitTo (boolean IsRemitTo)
{
set_Value (COLUMNNAME_IsRemitTo, Boolean.valueOf(IsRemitTo));
}
/** Get Remit-To Address.
@return Business Partner payment address */
public boolean isRemitTo() 
{
Object oo = get_Value(COLUMNNAME_IsRemitTo);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="d8d9da21-96b9-6bdb-d0e4-3e1e9a99e952")
public static String es_PE_FIELD_Location_Remit_ToAddress_Description="Dirección a la que enviamos el pago";

@XendraTrl(Identifier="d8d9da21-96b9-6bdb-d0e4-3e1e9a99e952")
public static String es_PE_FIELD_Location_Remit_ToAddress_Help="El cuadro de verificación remitir a la dirección indica si esta localización es la dirección a la cual se deben enviar los pagos a este socio de negocio";

@XendraTrl(Identifier="d8d9da21-96b9-6bdb-d0e4-3e1e9a99e952")
public static String es_PE_FIELD_Location_Remit_ToAddress_Name="Dirección Remitir-A";

@XendraField(AD_Column_ID="IsRemitTo",IsCentrallyMaintained=true,
AD_Tab_ID="2903c6c2-fbe6-0c39-b227-cbc34fc03540",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=150,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d8d9da21-96b9-6bdb-d0e4-3e1e9a99e952")
public static final String FIELDNAME_Location_Remit_ToAddress="d8d9da21-96b9-6bdb-d0e4-3e1e9a99e952";

@XendraTrl(Identifier="72295679-bf16-28c4-7104-bd210448e22b")
public static String es_PE_COLUMN_IsRemitTo_Name="Dirección Remitir-A";

@XendraColumn(AD_Element_ID="277d0f50-0753-01d2-bf38-0ccf4dee1214",ColumnName="IsRemitTo",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="Y",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="72295679-bf16-28c4-7104-bd210448e22b",
Synchronized="2017-08-05 16:53:23.0")
/** Column name IsRemitTo */
public static final String COLUMNNAME_IsRemitTo = "IsRemitTo";
/** Set Ship Address.
@param IsShipTo Business Partner Shipment Address */
public void setIsShipTo (boolean IsShipTo)
{
set_Value (COLUMNNAME_IsShipTo, Boolean.valueOf(IsShipTo));
}
/** Get Ship Address.
@return Business Partner Shipment Address */
public boolean isShipTo() 
{
Object oo = get_Value(COLUMNNAME_IsShipTo);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="d7253957-5dba-3897-45ff-f74ef0a943bc")
public static String es_PE_FIELD_Location_ShipAddress_Description="Dirección del socio de negocio a donde embarcar los bienes";

@XendraTrl(Identifier="d7253957-5dba-3897-45ff-f74ef0a943bc")
public static String es_PE_FIELD_Location_ShipAddress_Help="El cuadro de verificación embarcar a la dirección indica si esta localización es la dirección a usar cuando las órdenes se embarquen a este socio de negocio";

@XendraTrl(Identifier="d7253957-5dba-3897-45ff-f74ef0a943bc")
public static String es_PE_FIELD_Location_ShipAddress_Name="Dirección Entregar-A";

@XendraField(AD_Column_ID="IsShipTo",IsCentrallyMaintained=true,
AD_Tab_ID="2903c6c2-fbe6-0c39-b227-cbc34fc03540",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=120,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d7253957-5dba-3897-45ff-f74ef0a943bc")
public static final String FIELDNAME_Location_ShipAddress="d7253957-5dba-3897-45ff-f74ef0a943bc";

@XendraTrl(Identifier="c82b6412-00cd-a66c-dcc8-eb54ae66b97d")
public static String es_PE_COLUMN_IsShipTo_Name="Dirección Entregar-A";

@XendraColumn(AD_Element_ID="16fa1ba6-01fa-1133-bcb0-6ca7a9f0aa8a",ColumnName="IsShipTo",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="Y",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c82b6412-00cd-a66c-dcc8-eb54ae66b97d",
Synchronized="2017-08-05 16:53:23.0")
/** Column name IsShipTo */
public static final String COLUMNNAME_IsShipTo = "IsShipTo";
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

@XendraTrl(Identifier="b84c530f-48f5-ab94-5209-a29345218043")
public static String es_PE_FIELD_Location_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="b84c530f-48f5-ab94-5209-a29345218043")
public static String es_PE_FIELD_Location_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraTrl(Identifier="b84c530f-48f5-ab94-5209-a29345218043")
public static String es_PE_FIELD_Location_Name_Name="Nombre";
@XendraField(AD_Column_ID="Name",
IsCentrallyMaintained=true,AD_Tab_ID="2903c6c2-fbe6-0c39-b227-cbc34fc03540",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=40,SortNo=1,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="b84c530f-48f5-ab94-5209-a29345218043")
public static final String FIELDNAME_Location_Name="b84c530f-48f5-ab94-5209-a29345218043";

@XendraTrl(Identifier="9ef2c29f-486a-1715-a029-319d740f69c0")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue=".",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9ef2c29f-486a-1715-a029-319d740f69c0",
Synchronized="2017-08-05 16:53:24.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
/** Set Phone.
@param Phone Identifies a telephone number */
public void setPhone (String Phone)
{
if (Phone != null && Phone.length() > 40)
{
log.warning("Length > 40 - truncated");
Phone = Phone.substring(0,39);
}
set_Value (COLUMNNAME_Phone, Phone);
}
/** Get Phone.
@return Identifies a telephone number */
public String getPhone() 
{
String value = (String)get_Value(COLUMNNAME_Phone);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="479805a9-a5d3-1e1f-4d74-001d8a7a7c51")
public static String es_PE_FIELD_Location_Phone_Description="Identifica un número telefónico";

@XendraTrl(Identifier="479805a9-a5d3-1e1f-4d74-001d8a7a7c51")
public static String es_PE_FIELD_Location_Phone_Help="El campo teléfono identifica un No. telefónico.";

@XendraTrl(Identifier="479805a9-a5d3-1e1f-4d74-001d8a7a7c51")
public static String es_PE_FIELD_Location_Phone_Name="Teléfono";
@XendraField(AD_Column_ID="Phone",
IsCentrallyMaintained=true,AD_Tab_ID="2903c6c2-fbe6-0c39-b227-cbc34fc03540",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=80,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="479805a9-a5d3-1e1f-4d74-001d8a7a7c51")
public static final String FIELDNAME_Location_Phone="479805a9-a5d3-1e1f-4d74-001d8a7a7c51";

@XendraTrl(Identifier="33760150-54ad-835b-8741-1de15f152bb8")
public static String es_PE_COLUMN_Phone_Name="Teléfono";

@XendraColumn(AD_Element_ID="4842df23-a82d-d921-7e1e-5869844caceb",ColumnName="Phone",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="33760150-54ad-835b-8741-1de15f152bb8",
Synchronized="2017-08-05 16:53:24.0")
/** Column name Phone */
public static final String COLUMNNAME_Phone = "Phone";
/** Set 2nd Phone.
@param Phone2 Identifies an alternate telephone number. */
public void setPhone2 (String Phone2)
{
if (Phone2 != null && Phone2.length() > 40)
{
log.warning("Length > 40 - truncated");
Phone2 = Phone2.substring(0,39);
}
set_Value (COLUMNNAME_Phone2, Phone2);
}
/** Get 2nd Phone.
@return Identifies an alternate telephone number. */
public String getPhone2() 
{
String value = (String)get_Value(COLUMNNAME_Phone2);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="04702724-7655-e4f4-f674-fee125b206f8")
public static String es_PE_FIELD_Location_2ndPhone_Description="Identifica un número telefónico alterno";

@XendraTrl(Identifier="04702724-7655-e4f4-f674-fee125b206f8")
public static String es_PE_FIELD_Location_2ndPhone_Help="El campo teléfono 2 identifica un número telefónico alterno.";

@XendraTrl(Identifier="04702724-7655-e4f4-f674-fee125b206f8")
public static String es_PE_FIELD_Location_2ndPhone_Name="Teléfono 2";

@XendraField(AD_Column_ID="Phone2",IsCentrallyMaintained=true,
AD_Tab_ID="2903c6c2-fbe6-0c39-b227-cbc34fc03540",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="04702724-7655-e4f4-f674-fee125b206f8")
public static final String FIELDNAME_Location_2ndPhone="04702724-7655-e4f4-f674-fee125b206f8";

@XendraTrl(Identifier="f0ddeec0-a759-6e8e-fb78-fd8980c2b7ff")
public static String es_PE_COLUMN_Phone2_Name="Teléfono 2";

@XendraColumn(AD_Element_ID="619d752b-db65-e4fd-b230-313afdd72a83",ColumnName="Phone2",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f0ddeec0-a759-6e8e-fb78-fd8980c2b7ff",
Synchronized="2017-08-05 16:53:24.0")
/** Column name Phone2 */
public static final String COLUMNNAME_Phone2 = "Phone2";
/** Set Ubigeo.
@param Ubigeo Ubigeo */
public void setUbigeo (String Ubigeo)
{
if (Ubigeo != null && Ubigeo.length() > 6)
{
log.warning("Length > 6 - truncated");
Ubigeo = Ubigeo.substring(0,5);
}
set_Value (COLUMNNAME_Ubigeo, Ubigeo);
}
/** Get Ubigeo.
@return Ubigeo */
public String getUbigeo() 
{
String value = (String)get_Value(COLUMNNAME_Ubigeo);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="ebfc511b-93aa-3a84-4914-93b391d0f6d2")
public static String es_PE_FIELD_Location_Ubigeo_Name="Ubigeo";
@XendraField(AD_Column_ID="Ubigeo",
IsCentrallyMaintained=true,AD_Tab_ID="2903c6c2-fbe6-0c39-b227-cbc34fc03540",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=6,IsReadOnly=false,SeqNo=70,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="ebfc511b-93aa-3a84-4914-93b391d0f6d2")
public static final String FIELDNAME_Location_Ubigeo="ebfc511b-93aa-3a84-4914-93b391d0f6d2";

@XendraTrl(Identifier="ce4d6eb1-34aa-8e43-83b5-8ad3c0198c08")
public static String es_PE_COLUMN_Ubigeo_Name="Ubigeo";

@XendraColumn(AD_Element_ID="f91bf9ca-e873-cfe2-208b-3d387a0d0641",ColumnName="Ubigeo",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=6,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ce4d6eb1-34aa-8e43-83b5-8ad3c0198c08",
Synchronized="2017-08-05 16:53:24.0")
/** Column name Ubigeo */
public static final String COLUMNNAME_Ubigeo = "Ubigeo";
}
