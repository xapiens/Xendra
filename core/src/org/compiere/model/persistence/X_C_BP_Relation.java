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
/** Generated Model for C_BP_Relation
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_C_BP_Relation extends PO
{
/** Standard Constructor
@param ctx context
@param C_BP_Relation_ID id
@param trxName transaction
*/
public X_C_BP_Relation (Properties ctx, int C_BP_Relation_ID, String trxName)
{
super (ctx, C_BP_Relation_ID, trxName);
/** if (C_BP_Relation_ID == 0)
{
setC_BPartner_ID (0);
setC_BPartnerRelation_ID (0);
setC_BPartnerRelation_Location_ID (0);
setC_BP_Relation_ID (0);
setIsBillTo (false);	
// N
setIsPayFrom (false);	
// N
setIsRemitTo (false);	
// N
setIsShipTo (false);	
// N
setName (null);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_C_BP_Relation (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=678 */
public static int Table_ID=MTable.getTable_ID("C_BP_Relation");

@XendraTrl(Identifier="c964b76d-3a1e-b95a-71ec-56ee1b2b462e")
public static String es_PE_TAB_Relation_Description="Relación de socio de negocio";

@XendraTrl(Identifier="c964b76d-3a1e-b95a-71ec-56ee1b2b462e")
public static String es_PE_TAB_Relation_Help="La relación de socio de negocio permite mantener reglas de relación de terceros: quién recibe las facturas para los envíos ó paga facturas. Si la localización del socio de negocio no se define, la regla se aplica a toda la localización de ese socio de negocio.";

@XendraTrl(Identifier="c964b76d-3a1e-b95a-71ec-56ee1b2b462e")
public static String es_PE_TAB_Relation_Name="Relación";
@XendraTab(Name="Relation",
Description="Business Partner Relation",
Help="Business Partner Relation allow to maintain Third Party Relationship rules: who receives invoices for shipments or pays for invoices.  If the Location of the Business partner is not defined, the rule applies to all location of that Business Partner",
AD_Window_ID="3f325fd1-999f-5f33-3925-a4a7490b5de7",SeqNo=10,TabLevel=0,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="c964b76d-3a1e-b95a-71ec-56ee1b2b462e",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Relation="c964b76d-3a1e-b95a-71ec-56ee1b2b462e";

@XendraTrl(Identifier="c57974e9-aefd-d26b-ba8d-3763b8da9e9f")
public static String es_PE_TABLE_C_BP_Relation_Name="Relación con Socios";

@XendraTable(Name="Partner Relation",AD_Package_ID="98af94a4-a4cd-bdc0-5651-5880caf79899",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="Business Partner Relation",
Help="",TableName="C_BP_Relation",AccessLevel="2",
AD_Window_ID="3f325fd1-999f-5f33-3925-a4a7490b5de7",AD_Val_Rule_ID="",IsKey=1,LoadSeq=145,
IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,IsView=false,
PO_Window_ID="",ID="org.xendra.commercial",Identifier="c57974e9-aefd-d26b-ba8d-3763b8da9e9f",
Synchronized="2020-03-03 21:36:39.0")
/** TableName=C_BP_Relation */
public static final String Table_Name="C_BP_Relation";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"C_BP_Relation");

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
    Table_ID = MTable.getTable_ID("C_BP_Relation");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_C_BP_Relation[").append(get_ID()).append("]");
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

@XendraTrl(Identifier="3fe34aef-a18a-834b-8f49-5d04a6b4f431")
public static String es_PE_FIELD_Relation_BusinessPartner_Name="Socio de Negocio";

@XendraTrl(Identifier="3fe34aef-a18a-834b-8f49-5d04a6b4f431")
public static String es_PE_FIELD_Relation_BusinessPartner_Description="Identifica un Socio de Negocio";

@XendraTrl(Identifier="3fe34aef-a18a-834b-8f49-5d04a6b4f431")
public static String es_PE_FIELD_Relation_BusinessPartner_Help="Un socio de negocio es cualquiera con quien usted realiza transacciones. Este puede incluir Proveedores; Clientes; Empleados ó Vendedores.";

@XendraField(AD_Column_ID="C_BPartner_ID",IsCentrallyMaintained=true,
AD_Tab_ID="c964b76d-3a1e-b95a-71ec-56ee1b2b462e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3fe34aef-a18a-834b-8f49-5d04a6b4f431")
public static final String FIELDNAME_Relation_BusinessPartner="3fe34aef-a18a-834b-8f49-5d04a6b4f431";

@XendraTrl(Identifier="295138a5-6543-ea6f-e539-de028c47e749")
public static String es_PE_COLUMN_C_BPartner_ID_Name="Socio de Negocio";

@XendraColumn(AD_Element_ID="fe333dc3-4f40-1276-5f6a-d09bb66dc423",ColumnName="C_BPartner_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="06fdbbe9-e1c4-3ee4-4a9d-73d1a990cc42",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=true,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="295138a5-6543-ea6f-e539-de028c47e749",Synchronized="2019-08-30 22:21:16.0")
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

@XendraTrl(Identifier="179cd683-340d-5b5e-5614-90064156f8fa")
public static String es_PE_FIELD_Relation_PartnerLocation_Name="Dirección del Socio del Negocio";

@XendraTrl(Identifier="179cd683-340d-5b5e-5614-90064156f8fa")
public static String es_PE_FIELD_Relation_PartnerLocation_Description="Identifica la dirección para este socio de negocio";

@XendraTrl(Identifier="179cd683-340d-5b5e-5614-90064156f8fa")
public static String es_PE_FIELD_Relation_PartnerLocation_Help="La dirección de un socio indica la ubicación de un socio de negocio";

@XendraField(AD_Column_ID="C_BPartner_Location_ID",IsCentrallyMaintained=true,
AD_Tab_ID="c964b76d-3a1e-b95a-71ec-56ee1b2b462e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="179cd683-340d-5b5e-5614-90064156f8fa")
public static final String FIELDNAME_Relation_PartnerLocation="179cd683-340d-5b5e-5614-90064156f8fa";

@XendraTrl(Identifier="c5d5d0b5-39ce-b336-2f4b-96a543e1decf")
public static String es_PE_COLUMN_C_BPartner_Location_ID_Name="Dirección del Socio del Negocio";

@XendraColumn(AD_Element_ID="0dab7dc6-2832-26dc-2462-cba2d40235f2",
ColumnName="C_BPartner_Location_ID",AD_Reference_ID=19,AD_Reference_Value_ID="",
AD_Val_Rule_ID="623d98c0-19fc-56a2-f511-8992974d3c05",FieldLength=22,DefaultValue="",IsKey=false,
IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c5d5d0b5-39ce-b336-2f4b-96a543e1decf",
Synchronized="2019-08-30 22:21:16.0")
/** Column name C_BPartner_Location_ID */
public static final String COLUMNNAME_C_BPartner_Location_ID = "C_BPartner_Location_ID";
/** Set Related Partner.
@param C_BPartnerRelation_ID Related Business Partner */
public void setC_BPartnerRelation_ID (int C_BPartnerRelation_ID)
{
if (C_BPartnerRelation_ID < 1) throw new IllegalArgumentException ("C_BPartnerRelation_ID is mandatory.");
set_Value (COLUMNNAME_C_BPartnerRelation_ID, Integer.valueOf(C_BPartnerRelation_ID));
}
/** Get Related Partner.
@return Related Business Partner */
public int getC_BPartnerRelation_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_BPartnerRelation_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="62a7c4f0-c835-4b50-5a29-66262fb1f9e6")
public static String es_PE_FIELD_Relation_RelatedPartner_Name="Socio Relacionado";

@XendraTrl(Identifier="62a7c4f0-c835-4b50-5a29-66262fb1f9e6")
public static String es_PE_FIELD_Relation_RelatedPartner_Description="Socio de negocio relacionado.";

@XendraTrl(Identifier="62a7c4f0-c835-4b50-5a29-66262fb1f9e6")
public static String es_PE_FIELD_Relation_RelatedPartner_Help="La relación de un socio de negocio actua a nombre del socio de negocio - Ejemplo: el socio relacionado paga las facturas del socio de negocio - ó pagamos al socio relacionado las facturas recibidas del negocio.";

@XendraField(AD_Column_ID="C_BPartnerRelation_ID",IsCentrallyMaintained=true,
AD_Tab_ID="c964b76d-3a1e-b95a-71ec-56ee1b2b462e",AD_FieldGroup_ID="Proxy",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="62a7c4f0-c835-4b50-5a29-66262fb1f9e6")
public static final String FIELDNAME_Relation_RelatedPartner="62a7c4f0-c835-4b50-5a29-66262fb1f9e6";

@XendraTrl(Identifier="c6b38ec6-91b0-5f27-c08c-f42feaa22630")
public static String es_PE_COLUMN_C_BPartnerRelation_ID_Name="Socio Relacionado";

@XendraColumn(AD_Element_ID="fdd5c0d9-c94d-a7c4-ec97-ba8e421ac209",
ColumnName="C_BPartnerRelation_ID",AD_Reference_ID=30,
AD_Reference_Value_ID="ed87c3fe-720d-c26d-0166-b5178b65db41",AD_Val_Rule_ID="",FieldLength=22,
DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,
ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",
ValueMax="",Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,
ColumnSQL="",IsAllowLogging=false,Identifier="c6b38ec6-91b0-5f27-c08c-f42feaa22630",
Synchronized="2019-08-30 22:21:16.0")
/** Column name C_BPartnerRelation_ID */
public static final String COLUMNNAME_C_BPartnerRelation_ID = "C_BPartnerRelation_ID";
/** Set Related Partner Location.
@param C_BPartnerRelation_Location_ID Location of the related Business Partner */
public void setC_BPartnerRelation_Location_ID (int C_BPartnerRelation_Location_ID)
{
if (C_BPartnerRelation_Location_ID < 1) throw new IllegalArgumentException ("C_BPartnerRelation_Location_ID is mandatory.");
set_Value (COLUMNNAME_C_BPartnerRelation_Location_ID, Integer.valueOf(C_BPartnerRelation_Location_ID));
}
/** Get Related Partner Location.
@return Location of the related Business Partner */
public int getC_BPartnerRelation_Location_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_BPartnerRelation_Location_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="c475e2ea-3ebb-4e14-0d9f-c500cfcd5dbc")
public static String es_PE_FIELD_Relation_RelatedPartnerLocation_Name="Localización de Socio Relacionado";

@XendraTrl(Identifier="c475e2ea-3ebb-4e14-0d9f-c500cfcd5dbc")
public static String es_PE_FIELD_Relation_RelatedPartnerLocation_Description="Localización de el socio de negocio relacionado.";

@XendraField(AD_Column_ID="C_BPartnerRelation_Location_ID",IsCentrallyMaintained=true,
AD_Tab_ID="c964b76d-3a1e-b95a-71ec-56ee1b2b462e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c475e2ea-3ebb-4e14-0d9f-c500cfcd5dbc")
public static final String FIELDNAME_Relation_RelatedPartnerLocation="c475e2ea-3ebb-4e14-0d9f-c500cfcd5dbc";

@XendraTrl(Identifier="d66564f7-14fa-a18c-ba16-b39e57ee7a89")
public static String es_PE_COLUMN_C_BPartnerRelation_Location_ID_Name="Localización de Socio Relacionado";

@XendraColumn(AD_Element_ID="e0d52cdd-1ae8-57e3-e7cc-434ed51045d5",
ColumnName="C_BPartnerRelation_Location_ID",AD_Reference_ID=18,
AD_Reference_Value_ID="8d01ccac-6606-99a5-ebc2-5a6e01980b37",
AD_Val_Rule_ID="23dc8fe3-67f0-650b-5c60-ba813a9e627e",FieldLength=22,DefaultValue="",IsKey=false,
IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d66564f7-14fa-a18c-ba16-b39e57ee7a89",
Synchronized="2019-08-30 22:21:16.0")
/** Column name C_BPartnerRelation_Location_ID */
public static final String COLUMNNAME_C_BPartnerRelation_Location_ID = "C_BPartnerRelation_Location_ID";
/** Set Partner Relation.
@param C_BP_Relation_ID Business Partner Relation */
public void setC_BP_Relation_ID (int C_BP_Relation_ID)
{
if (C_BP_Relation_ID < 1) throw new IllegalArgumentException ("C_BP_Relation_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_BP_Relation_ID, Integer.valueOf(C_BP_Relation_ID));
}
/** Get Partner Relation.
@return Business Partner Relation */
public int getC_BP_Relation_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_BP_Relation_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="f9c06a6d-8b8d-e2b3-ea49-510e2d7e6c92")
public static String es_PE_FIELD_Relation_PartnerRelation_Name="Relación con Socios";

@XendraTrl(Identifier="f9c06a6d-8b8d-e2b3-ea49-510e2d7e6c92")
public static String es_PE_FIELD_Relation_PartnerRelation_Description="Relación con Socios de negocio";

@XendraTrl(Identifier="f9c06a6d-8b8d-e2b3-ea49-510e2d7e6c92")
public static String es_PE_FIELD_Relation_PartnerRelation_Help="Relación con socios de negocio permite mantener reglas de la relación de los terceros: quién recibe las facturas para los envíos ó paga facturas.";

@XendraField(AD_Column_ID="C_BP_Relation_ID",IsCentrallyMaintained=true,
AD_Tab_ID="c964b76d-3a1e-b95a-71ec-56ee1b2b462e",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=10,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f9c06a6d-8b8d-e2b3-ea49-510e2d7e6c92")
public static final String FIELDNAME_Relation_PartnerRelation="f9c06a6d-8b8d-e2b3-ea49-510e2d7e6c92";
/** Column name C_BP_Relation_ID */
public static final String COLUMNNAME_C_BP_Relation_ID = "C_BP_Relation_ID";
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

@XendraTrl(Identifier="319df37c-e88d-73b8-5e12-42fd220f74ed")
public static String es_PE_FIELD_Relation_Description_Name="Observación";

@XendraTrl(Identifier="319df37c-e88d-73b8-5e12-42fd220f74ed")
public static String es_PE_FIELD_Relation_Description_Description="Observación";

@XendraTrl(Identifier="319df37c-e88d-73b8-5e12-42fd220f74ed")
public static String es_PE_FIELD_Relation_Description_Help="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="c964b76d-3a1e-b95a-71ec-56ee1b2b462e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="319df37c-e88d-73b8-5e12-42fd220f74ed")
public static final String FIELDNAME_Relation_Description="319df37c-e88d-73b8-5e12-42fd220f74ed";

@XendraTrl(Identifier="04482ddb-1331-2b9d-1750-471e80afc0d6")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="04482ddb-1331-2b9d-1750-471e80afc0d6",
Synchronized="2019-08-30 22:21:16.0")
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
@XendraTrl(Identifier="13ab7fd1-c3cc-4ac1-a869-51988c5a34a9")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="13ab7fd1-c3cc-4ac1-a869-51988c5a34a9",
Synchronized="2019-08-30 22:21:16.0")
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

@XendraTrl(Identifier="5ded8b71-0ec1-69a4-47e9-66ee56f4707b")
public static String es_PE_FIELD_Relation_InvoiceAddress_Name="Dirección Facturar-A";

@XendraTrl(Identifier="5ded8b71-0ec1-69a4-47e9-66ee56f4707b")
public static String es_PE_FIELD_Relation_InvoiceAddress_Description="Indica que esta dirección es la dirección de facturar A";

@XendraTrl(Identifier="5ded8b71-0ec1-69a4-47e9-66ee56f4707b")
public static String es_PE_FIELD_Relation_InvoiceAddress_Help="El cuadro de verificación facturar A indica si esta ubicación es la dirección de facturar A para este socio de negocio";

@XendraField(AD_Column_ID="IsBillTo",IsCentrallyMaintained=true,
AD_Tab_ID="c964b76d-3a1e-b95a-71ec-56ee1b2b462e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=120,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5ded8b71-0ec1-69a4-47e9-66ee56f4707b")
public static final String FIELDNAME_Relation_InvoiceAddress="5ded8b71-0ec1-69a4-47e9-66ee56f4707b";

@XendraTrl(Identifier="395b5ca4-5083-33ed-a5c1-cb1994cbdccb")
public static String es_PE_COLUMN_IsBillTo_Name="Dirección Facturar-A";

@XendraColumn(AD_Element_ID="c81d29d1-fa18-3d8e-50da-e912bd036c1e",ColumnName="IsBillTo",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="395b5ca4-5083-33ed-a5c1-cb1994cbdccb",
Synchronized="2019-08-30 22:21:16.0")
/** Column name IsBillTo */
public static final String COLUMNNAME_IsBillTo = "IsBillTo";
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

@XendraTrl(Identifier="04c9b683-a22c-7780-5dd4-3c7481fed552")
public static String es_PE_FIELD_Relation_Pay_FromAddress_Name="Dirección Pagar-Desde";

@XendraTrl(Identifier="04c9b683-a22c-7780-5dd4-3c7481fed552")
public static String es_PE_FIELD_Relation_Pay_FromAddress_Description="El socio de negocio paga desde esta dirección y a donde se envían las cartas de morosidad";

@XendraTrl(Identifier="04c9b683-a22c-7780-5dd4-3c7481fed552")
public static String es_PE_FIELD_Relation_Pay_FromAddress_Help="El cuadro de verificación pagado desde la dirección; indica si esta localización es la dirección donde paga el socio de negocio y a donde las cartas de morosidad serán enviadas.";

@XendraField(AD_Column_ID="IsPayFrom",IsCentrallyMaintained=true,
AD_Tab_ID="c964b76d-3a1e-b95a-71ec-56ee1b2b462e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=130,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="04c9b683-a22c-7780-5dd4-3c7481fed552")
public static final String FIELDNAME_Relation_Pay_FromAddress="04c9b683-a22c-7780-5dd4-3c7481fed552";

@XendraTrl(Identifier="7d365b3d-51cd-ce12-2faa-4cc6f84268ff")
public static String es_PE_COLUMN_IsPayFrom_Name="Dirección Pagar-Desde";

@XendraColumn(AD_Element_ID="21094cb4-fc60-7b7f-d6d2-48ab08bf2952",ColumnName="IsPayFrom",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7d365b3d-51cd-ce12-2faa-4cc6f84268ff",
Synchronized="2019-08-30 22:21:16.0")
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

@XendraTrl(Identifier="65a8fe2f-6372-785a-1de3-6b344ec4a3ed")
public static String es_PE_FIELD_Relation_Remit_ToAddress_Name="Dirección Remitir-A";

@XendraTrl(Identifier="65a8fe2f-6372-785a-1de3-6b344ec4a3ed")
public static String es_PE_FIELD_Relation_Remit_ToAddress_Description="Dirección a la que enviamos el pago";

@XendraTrl(Identifier="65a8fe2f-6372-785a-1de3-6b344ec4a3ed")
public static String es_PE_FIELD_Relation_Remit_ToAddress_Help="El cuadro de verificación remitir a la dirección indica si esta localización es la dirección a la cual se deben enviar los pagos a este socio de negocio";

@XendraField(AD_Column_ID="IsRemitTo",IsCentrallyMaintained=true,
AD_Tab_ID="c964b76d-3a1e-b95a-71ec-56ee1b2b462e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=140,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="65a8fe2f-6372-785a-1de3-6b344ec4a3ed")
public static final String FIELDNAME_Relation_Remit_ToAddress="65a8fe2f-6372-785a-1de3-6b344ec4a3ed";

@XendraTrl(Identifier="5d51316c-fb99-108b-644d-14406771019f")
public static String es_PE_COLUMN_IsRemitTo_Name="Dirección Remitir-A";

@XendraColumn(AD_Element_ID="277d0f50-0753-01d2-bf38-0ccf4dee1214",ColumnName="IsRemitTo",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5d51316c-fb99-108b-644d-14406771019f",
Synchronized="2019-08-30 22:21:16.0")
/** Column name IsRemitTo */
public static final String COLUMNNAME_IsRemitTo = "IsRemitTo";
/** Set Ship Address.
@param IsShipTo Business Partner Shipment Address */
public void setIsShipTo (boolean IsShipTo)
{
set_ValueNoCheck (COLUMNNAME_IsShipTo, Boolean.valueOf(IsShipTo));
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

@XendraTrl(Identifier="50b2d669-9723-eb99-b81e-e9f91f33d221")
public static String es_PE_FIELD_Relation_ShipAddress_Name="Dirección Entregar-A";

@XendraTrl(Identifier="50b2d669-9723-eb99-b81e-e9f91f33d221")
public static String es_PE_FIELD_Relation_ShipAddress_Description="Dirección del socio de negocio a donde embarcar los bienes";

@XendraTrl(Identifier="50b2d669-9723-eb99-b81e-e9f91f33d221")
public static String es_PE_FIELD_Relation_ShipAddress_Help="El cuadro de verificación embarcar a la dirección indica si esta localización es la dirección a usar cuando las órdenes se embarquen a este socio de negocio";

@XendraField(AD_Column_ID="IsShipTo",IsCentrallyMaintained=true,
AD_Tab_ID="c964b76d-3a1e-b95a-71ec-56ee1b2b462e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=true,SeqNo=110,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="50b2d669-9723-eb99-b81e-e9f91f33d221")
public static final String FIELDNAME_Relation_ShipAddress="50b2d669-9723-eb99-b81e-e9f91f33d221";

@XendraTrl(Identifier="ad57da36-129a-422b-688e-05b06a986685")
public static String es_PE_COLUMN_IsShipTo_Name="Dirección Entregar-A";

@XendraColumn(AD_Element_ID="16fa1ba6-01fa-1133-bcb0-6ca7a9f0aa8a",ColumnName="IsShipTo",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ad57da36-129a-422b-688e-05b06a986685",
Synchronized="2019-08-30 22:21:16.0")
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

@XendraTrl(Identifier="f5922ce6-9802-e8ac-189a-54f11fc1bc23")
public static String es_PE_FIELD_Relation_Name_Name="Nombre";

@XendraTrl(Identifier="f5922ce6-9802-e8ac-189a-54f11fc1bc23")
public static String es_PE_FIELD_Relation_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="f5922ce6-9802-e8ac-189a-54f11fc1bc23")
public static String es_PE_FIELD_Relation_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraField(AD_Column_ID="Name",IsCentrallyMaintained=true,
AD_Tab_ID="c964b76d-3a1e-b95a-71ec-56ee1b2b462e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=40,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f5922ce6-9802-e8ac-189a-54f11fc1bc23")
public static final String FIELDNAME_Relation_Name="f5922ce6-9802-e8ac-189a-54f11fc1bc23";

@XendraTrl(Identifier="e8043aef-3faa-8678-5ec4-d74a2985b8ae")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e8043aef-3faa-8678-5ec4-d74a2985b8ae",
Synchronized="2019-08-30 22:21:16.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
}
