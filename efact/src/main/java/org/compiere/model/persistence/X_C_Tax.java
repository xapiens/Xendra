/******************************************************************************
 * Product: Xendra ERP & CRM Smart Business Solution                          *
 * Copyright (C)  dravios       All Rights Reserved.                          *
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
/** Generated Model for C_Tax
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_C_Tax extends PO
{
/** Standard Constructor
@param ctx context
@param C_Tax_ID id
@param trxName transaction
*/
public X_C_Tax (Properties ctx, int C_Tax_ID, String trxName)
{
super (ctx, C_Tax_ID, trxName);
/** if (C_Tax_ID == 0)
{
setC_TaxCategory_ID (0);
setC_Tax_ID (0);
setIsDefault (false);	
// N
setIsDocumentLevel (false);	
// N
setIsSalesTax (false);	
// N
setIsSummary (false);	
// N
setIsTaxExempt (false);	
// N
setName (null);
setRate (Env.ZERO);
setRequiresTaxCertificate (false);	
// N
setSOPOType (null);	
// B
setValidFrom (new Timestamp(System.currentTimeMillis()));
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_C_Tax (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=261 */
public static int Table_ID=MTable.getTable_ID("C_Tax");

@XendraTrl(Identifier="83ca4a33-fb7e-f6d7-6aa9-d23b3744f82a")
public static String es_PE_TAB_Tax_Description="Definir Impuestos";

@XendraTrl(Identifier="83ca4a33-fb7e-f6d7-6aa9-d23b3744f82a")
public static String es_PE_TAB_Tax_Help="La ventana permite definir los diferentes impuestos usados para cada categoría de impuestos. Por ejemplo; el impuesto de ventas debe estar definido para cada estado en el cual aplique. Si se tienen múltiples impuestos; se crea un impuesto sumario con la tasa de impuesto total aproximada y las tasas reales de los múltiples impuestos apuntando a la tasa sumaria como su impuesto padre. El impuesto correcto es calculado cuando se procesan los documentos de la transacción. En ese caso; si un impuesto tiene como base el Total neto de la línea y otro impuesto tiene como base otro impuesto; se necesitará ajustar el porcentaje para que el cálculo de el Total correcto.";

@XendraTrl(Identifier="83ca4a33-fb7e-f6d7-6aa9-d23b3744f82a")
public static String es_PE_TAB_Tax_Name="Impuesto";
@XendraTab(Name="Tax",
Description="Tax definition",
Help="The Tax Rate Window defines the different taxes used for each tax category.  For example, Sales Tax must be defined for each State in which it applies.<br> If you have multiple taxes, create a summary level tax with the approximate total tax rate and the actual tax rates pointing to the summary level tax as their parent. When entering the order or invoice lines, the tax is estimated, the correct tax is calculated when the document is processed.  The tax is always calculated from the line net amount. If one tax has a the tax basis the line net amount and another tax, you need to adjust the percentage to result in the correct amount.<br> Valid From/To is determined by the parent tax.",
AD_Window_ID="738fa9ed-8c68-6bf1-79fe-8963640b6a8b",SeqNo=10,TabLevel=0,IsSingleRow=true,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="83ca4a33-fb7e-f6d7-6aa9-d23b3744f82a",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Tax="83ca4a33-fb7e-f6d7-6aa9-d23b3744f82a";

@XendraTrl(Identifier="bd384907-c32c-22eb-52ed-6812f64dc1ee")
public static String es_PE_TABLE_C_Tax_Name="Impuesto";

@XendraTable(Name="Tax",AD_Package_ID="98af94a4-a4cd-bdc0-5651-5880caf79899",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="Tax identifier",Help="",
TableName="C_Tax",AccessLevel="2",AD_Window_ID="738fa9ed-8c68-6bf1-79fe-8963640b6a8b",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=110,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.commercial",
Identifier="bd384907-c32c-22eb-52ed-6812f64dc1ee",Synchronized="2022-09-03 18:51:04.0")
/** TableName=C_Tax */
public static final String Table_Name="C_Tax";


@XendraIndex(Name="c_tax_identifier",Identifier="41d74326-38dd-480e-af0d-69ede9bf53a5",
Column_Names="identifier",IsUnique="false",TableIdentifier="41d74326-38dd-480e-af0d-69ede9bf53a5",
Synchronized="2020-11-02 17:49:26.0")
public static final String INDEXNAME_c_tax_identifier = "41d74326-38dd-480e-af0d-69ede9bf53a5";


@XendraIndex(Name="c_tax_name",Identifier="af3b5d7e-6aba-303a-4a47-dbcd3d556c62",
Column_Names="ad_client_id, name",IsUnique="true",
TableIdentifier="af3b5d7e-6aba-303a-4a47-dbcd3d556c62",Synchronized="2014-06-01 19:03:58.0")
public static final String INDEXNAME_c_tax_name = "af3b5d7e-6aba-303a-4a47-dbcd3d556c62";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"C_Tax");

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
    Table_ID = MTable.getTable_ID("C_Tax");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_C_Tax[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Country_ID.
@param C_Country_ID Country  */
public void setC_Country_ID (int C_Country_ID)
{
if (C_Country_ID <= 0) set_Value (COLUMNNAME_C_Country_ID, null);
 else 
set_Value (COLUMNNAME_C_Country_ID, Integer.valueOf(C_Country_ID));
}
/** Get Country_ID.
@return Country  */
public int getC_Country_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Country_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="9b71e0b2-79cd-22da-8ff0-0d37c917dc3b")
public static String es_PE_FIELD_Tax_Country_ID_Name="País";

@XendraTrl(Identifier="9b71e0b2-79cd-22da-8ff0-0d37c917dc3b")
public static String es_PE_FIELD_Tax_Country_ID_Help="El país define un país. Cada país debe ser definido antes de que pueda ser usado en un documento.";

@XendraTrl(Identifier="9b71e0b2-79cd-22da-8ff0-0d37c917dc3b")
public static String es_PE_FIELD_Tax_Country_ID_Description="País";

@XendraField(AD_Column_ID="C_Country_ID",IsCentrallyMaintained=true,
AD_Tab_ID="83ca4a33-fb7e-f6d7-6aa9-d23b3744f82a",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=180,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9b71e0b2-79cd-22da-8ff0-0d37c917dc3b")
public static final String FIELDNAME_Tax_Country_ID="9b71e0b2-79cd-22da-8ff0-0d37c917dc3b";

@XendraTrl(Identifier="ba544d29-307c-7e89-c441-b623b4c2a4a9")
public static String es_PE_COLUMN_C_Country_ID_Name="País";

@XendraColumn(AD_Element_ID="43379d46-930b-f17e-61f3-a1b7f02135c1",ColumnName="C_Country_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="da097900-8f86-9a6d-5a27-605e202ce9a8",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="ba544d29-307c-7e89-c441-b623b4c2a4a9",Synchronized="2022-05-26 14:28:17.0")
/** Column name C_Country_ID */
public static final String COLUMNNAME_C_Country_ID = "C_Country_ID";
/** Set Region.
@param C_Region_ID Identifies a geographical Region */
public void setC_Region_ID (int C_Region_ID)
{
if (C_Region_ID <= 0) set_Value (COLUMNNAME_C_Region_ID, null);
 else 
set_Value (COLUMNNAME_C_Region_ID, Integer.valueOf(C_Region_ID));
}
/** Get Region.
@return Identifies a geographical Region */
public int getC_Region_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Region_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="0ee01927-84da-0a08-04dc-3e04446fbd52")
public static String es_PE_FIELD_Tax_Region_Name="Región";

@XendraTrl(Identifier="0ee01927-84da-0a08-04dc-3e04446fbd52")
public static String es_PE_FIELD_Tax_Region_Help="La región indica una región única para este país";

@XendraTrl(Identifier="0ee01927-84da-0a08-04dc-3e04446fbd52")
public static String es_PE_FIELD_Tax_Region_Description="Identifica una región geográfica";

@XendraField(AD_Column_ID="C_Region_ID",IsCentrallyMaintained=true,
AD_Tab_ID="83ca4a33-fb7e-f6d7-6aa9-d23b3744f82a",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=200,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0ee01927-84da-0a08-04dc-3e04446fbd52")
public static final String FIELDNAME_Tax_Region="0ee01927-84da-0a08-04dc-3e04446fbd52";

@XendraTrl(Identifier="c43f2085-f852-72d4-9edb-6fbcff2e8837")
public static String es_PE_COLUMN_C_Region_ID_Name="Región";

@XendraColumn(AD_Element_ID="ebf14ae5-8cc5-d3f7-2bd3-ea81d9c6d1fe",ColumnName="C_Region_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="f560243f-2ea5-bcb4-265f-52555b17a707",
AD_Val_Rule_ID="2f48b18b-cc01-4a24-2f77-91b0071e443b",FieldLength=22,DefaultValue="",IsKey=false,
IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c43f2085-f852-72d4-9edb-6fbcff2e8837",
Synchronized="2022-05-26 14:28:17.0")
/** Column name C_Region_ID */
public static final String COLUMNNAME_C_Region_ID = "C_Region_ID";
/** Set Tax Category.
@param C_TaxCategory_ID Tax Category */
public void setC_TaxCategory_ID (int C_TaxCategory_ID)
{
if (C_TaxCategory_ID < 1) throw new IllegalArgumentException ("C_TaxCategory_ID is mandatory.");
set_Value (COLUMNNAME_C_TaxCategory_ID, Integer.valueOf(C_TaxCategory_ID));
}
/** Get Tax Category.
@return Tax Category */
public int getC_TaxCategory_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_TaxCategory_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="f07b1729-e447-caca-0791-c87794ae4d40")
public static String es_PE_FIELD_Tax_TaxCategory_Name="Categoría del Impuesto";

@XendraTrl(Identifier="f07b1729-e447-caca-0791-c87794ae4d40")
public static String es_PE_FIELD_Tax_TaxCategory_Help="La categoría de impuesto proporciona un método de agrupación de impuestos similares. (Ej. Impuesto de ventas ó Impuesto al Valor Agregado)";

@XendraTrl(Identifier="f07b1729-e447-caca-0791-c87794ae4d40")
public static String es_PE_FIELD_Tax_TaxCategory_Description="Categoría del Impuesto";

@XendraField(AD_Column_ID="C_TaxCategory_ID",IsCentrallyMaintained=true,
AD_Tab_ID="83ca4a33-fb7e-f6d7-6aa9-d23b3744f82a",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f07b1729-e447-caca-0791-c87794ae4d40")
public static final String FIELDNAME_Tax_TaxCategory="f07b1729-e447-caca-0791-c87794ae4d40";

@XendraTrl(Identifier="269d84a5-c484-79e8-9b50-e7c33f7333b5")
public static String es_PE_COLUMN_C_TaxCategory_ID_Name="Categoría del Impuesto";

@XendraColumn(AD_Element_ID="d52d1891-09d1-cd05-f9fa-46c801a8d9a6",ColumnName="C_TaxCategory_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="269d84a5-c484-79e8-9b50-e7c33f7333b5",
Synchronized="2022-05-26 14:28:18.0")
/** Column name C_TaxCategory_ID */
public static final String COLUMNNAME_C_TaxCategory_ID = "C_TaxCategory_ID";
/** Set Tax.
@param C_Tax_ID Tax identifier */
public void setC_Tax_ID (int C_Tax_ID)
{
if (C_Tax_ID < 1) throw new IllegalArgumentException ("C_Tax_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_Tax_ID, Integer.valueOf(C_Tax_ID));
}
/** Get Tax.
@return Tax identifier */
public int getC_Tax_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Tax_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="7fa71700-5b87-a93a-656d-ae0590a224f3")
public static String es_PE_FIELD_Tax_Tax_Name="Impuesto";

@XendraTrl(Identifier="7fa71700-5b87-a93a-656d-ae0590a224f3")
public static String es_PE_FIELD_Tax_Tax_Help="El Impuesto indica el tipo de impuesto para esta línea del documento";

@XendraTrl(Identifier="7fa71700-5b87-a93a-656d-ae0590a224f3")
public static String es_PE_FIELD_Tax_Tax_Description="Identificador del Impuesto";

@XendraField(AD_Column_ID="C_Tax_ID",IsCentrallyMaintained=true,
AD_Tab_ID="83ca4a33-fb7e-f6d7-6aa9-d23b3744f82a",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7fa71700-5b87-a93a-656d-ae0590a224f3")
public static final String FIELDNAME_Tax_Tax="7fa71700-5b87-a93a-656d-ae0590a224f3";
/** Column name C_Tax_ID */
public static final String COLUMNNAME_C_Tax_ID = "C_Tax_ID";
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

@XendraTrl(Identifier="ea7cb2fa-3d38-e85c-497d-e451a0b136f9")
public static String es_PE_FIELD_Tax_Description_Name="Observación";

@XendraTrl(Identifier="ea7cb2fa-3d38-e85c-497d-e451a0b136f9")
public static String es_PE_FIELD_Tax_Description_Help="Una Observación esta limitada a 255 caracteres";

@XendraTrl(Identifier="ea7cb2fa-3d38-e85c-497d-e451a0b136f9")
public static String es_PE_FIELD_Tax_Description_Description="Observación corta opcional del registro";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="83ca4a33-fb7e-f6d7-6aa9-d23b3744f82a",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ea7cb2fa-3d38-e85c-497d-e451a0b136f9")
public static final String FIELDNAME_Tax_Description="ea7cb2fa-3d38-e85c-497d-e451a0b136f9";

@XendraTrl(Identifier="0b1675b9-4567-5938-e80a-f0659496e722")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=true,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0b1675b9-4567-5938-e80a-f0659496e722",
Synchronized="2022-05-26 14:28:18.0")
/** Column name Description */
public static final String COLUMNNAME_Description = "Description";
/** Set ECE_5153.
@param ECE_5153 ECE_5153 */
public void setECE_5153 (String ECE_5153)
{
if (ECE_5153 != null && ECE_5153.length() > 3)
{
log.warning("Length > 3 - truncated");
ECE_5153 = ECE_5153.substring(0,2);
}
set_Value (COLUMNNAME_ECE_5153, ECE_5153);
}
/** Get ECE_5153.
@return ECE_5153 */
public String getECE_5153() 
{
return (String)get_Value(COLUMNNAME_ECE_5153);
}

@XendraTrl(Identifier="9e8c80c7-9eeb-4e62-83d3-36d5e158ba62")
public static String es_PE_FIELD_Tax_ECE_515_Name="ece_5153";
@XendraField(AD_Column_ID="ECE_5153",
IsCentrallyMaintained=true,AD_Tab_ID="83ca4a33-fb7e-f6d7-6aa9-d23b3744f82a",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=3,IsReadOnly=false,SeqNo=250,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2022-05-25 15:41:10.0",Identifier="9e8c80c7-9eeb-4e62-83d3-36d5e158ba62")
public static final String FIELDNAME_Tax_ECE_515="9e8c80c7-9eeb-4e62-83d3-36d5e158ba62";

@XendraTrl(Identifier="06bfc5b7-228e-4f01-a5f2-fc5f2377f25d")
public static String es_PE_COLUMN_ECE_5153_Name="ece_5153";

@XendraColumn(AD_Element_ID="6121c493-c446-412e-88cc-57c5f391b0e8",ColumnName="ECE_5153",
AD_Reference_ID=17,AD_Reference_Value_ID="4cdd85df-9b38-4ad7-82cd-f40112b627a0",AD_Val_Rule_ID="",
FieldLength=3,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="06bfc5b7-228e-4f01-a5f2-fc5f2377f25d",Synchronized="2022-05-26 14:28:18.0")
/** Column name ECE_5153 */
public static final String COLUMNNAME_ECE_5153 = "ECE_5153";
/** Set ECE_5305.
@param ECE_5305 ECE_5305 */
public void setECE_5305 (String ECE_5305)
{
if (ECE_5305 != null && ECE_5305.length() > 1)
{
log.warning("Length > 1 - truncated");
ECE_5305 = ECE_5305.substring(0,0);
}
set_Value (COLUMNNAME_ECE_5305, ECE_5305);
}
/** Get ECE_5305.
@return ECE_5305 */
public String getECE_5305() 
{
return (String)get_Value(COLUMNNAME_ECE_5305);
}

@XendraTrl(Identifier="cb5d25c0-05f3-4967-98d2-694e9ed1f13f")
public static String es_PE_FIELD_Tax_ECE_530_Name="ece_5305";
@XendraField(AD_Column_ID="ECE_5305",
IsCentrallyMaintained=true,AD_Tab_ID="83ca4a33-fb7e-f6d7-6aa9-d23b3744f82a",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=260,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2022-05-25 15:41:10.0",Identifier="cb5d25c0-05f3-4967-98d2-694e9ed1f13f")
public static final String FIELDNAME_Tax_ECE_530="cb5d25c0-05f3-4967-98d2-694e9ed1f13f";

@XendraTrl(Identifier="dd25e2a5-41d1-4b1f-ba93-5d87129d67de")
public static String es_PE_COLUMN_ECE_5305_Name="ece_5305";

@XendraColumn(AD_Element_ID="89437455-31b3-4645-a98b-f0787aea373f",ColumnName="ECE_5305",
AD_Reference_ID=17,AD_Reference_Value_ID="1340ebe7-dd50-46df-b593-6020bac6591c",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="dd25e2a5-41d1-4b1f-ba93-5d87129d67de",Synchronized="2022-05-26 14:28:18.0")
/** Column name ECE_5305 */
public static final String COLUMNNAME_ECE_5305 = "ECE_5305";
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
@XendraTrl(Identifier="950ed128-0ed0-4cdf-8b26-47bed5e530c1")
public static String es_PE_FIELD_Tax_Identifier_Name="Identifier";

@XendraField(AD_Column_ID="Identifier",IsCentrallyMaintained=true,
AD_Tab_ID="83ca4a33-fb7e-f6d7-6aa9-d23b3744f82a",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=36,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2022-05-25 15:41:10.0",
Identifier="950ed128-0ed0-4cdf-8b26-47bed5e530c1")
public static final String FIELDNAME_Tax_Identifier="950ed128-0ed0-4cdf-8b26-47bed5e530c1";

@XendraTrl(Identifier="faf9e71d-2e00-4beb-8693-cf6f3d3313f5")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="faf9e71d-2e00-4beb-8693-cf6f3d3313f5",
Synchronized="2022-05-26 14:28:18.0")
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

@XendraTrl(Identifier="ab27618b-d395-b1c5-a818-b67e2c32f28a")
public static String es_PE_FIELD_Tax_Default_Name="Predeterminado";

@XendraTrl(Identifier="ab27618b-d395-b1c5-a818-b67e2c32f28a")
public static String es_PE_FIELD_Tax_Default_Help="El cuadro de verificación indica si este registro será usado como un valor predeterminado";

@XendraTrl(Identifier="ab27618b-d395-b1c5-a818-b67e2c32f28a")
public static String es_PE_FIELD_Tax_Default_Description="Valor Predeterminado";

@XendraField(AD_Column_ID="IsDefault",IsCentrallyMaintained=true,
AD_Tab_ID="83ca4a33-fb7e-f6d7-6aa9-d23b3744f82a",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ab27618b-d395-b1c5-a818-b67e2c32f28a")
public static final String FIELDNAME_Tax_Default="ab27618b-d395-b1c5-a818-b67e2c32f28a";

@XendraTrl(Identifier="6d72eb96-aa69-3b73-17f9-c7294a12dee4")
public static String es_PE_COLUMN_IsDefault_Name="Predeterminado";

@XendraColumn(AD_Element_ID="8617f892-e113-a5fd-8715-687f792f136c",ColumnName="IsDefault",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6d72eb96-aa69-3b73-17f9-c7294a12dee4",
Synchronized="2022-05-26 14:28:18.0")
/** Column name IsDefault */
public static final String COLUMNNAME_IsDefault = "IsDefault";
/** Set Document Level.
@param IsDocumentLevel Tax is calculated on document level (rather than line by line) */
public void setIsDocumentLevel (boolean IsDocumentLevel)
{
set_Value (COLUMNNAME_IsDocumentLevel, Boolean.valueOf(IsDocumentLevel));
}
/** Get Document Level.
@return Tax is calculated on document level (rather than line by line) */
public boolean isDocumentLevel() 
{
Object oo = get_Value(COLUMNNAME_IsDocumentLevel);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="5e53fcff-8222-ab75-c65a-500e5976afc8")
public static String es_PE_FIELD_Tax_DocumentLevel_Name="Nivel del Documento";

@XendraTrl(Identifier="5e53fcff-8222-ab75-c65a-500e5976afc8")
public static String es_PE_FIELD_Tax_DocumentLevel_Help="Si el impuesto se calcula a nivel documento; todas las líneas con esa tasa de impuesto son sumadas antes de calcular el total de impuesto para el documento.";

@XendraTrl(Identifier="5e53fcff-8222-ab75-c65a-500e5976afc8")
public static String es_PE_FIELD_Tax_DocumentLevel_Description="El Impuesto es calculado a nivel de documento (No línea por línea)";

@XendraField(AD_Column_ID="IsDocumentLevel",IsCentrallyMaintained=true,
AD_Tab_ID="83ca4a33-fb7e-f6d7-6aa9-d23b3744f82a",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5e53fcff-8222-ab75-c65a-500e5976afc8")
public static final String FIELDNAME_Tax_DocumentLevel="5e53fcff-8222-ab75-c65a-500e5976afc8";

@XendraTrl(Identifier="8aa7ef93-d726-a06a-199e-3ea47151ba63")
public static String es_PE_COLUMN_IsDocumentLevel_Name="Nivel del Documento";

@XendraColumn(AD_Element_ID="f5e0baf2-4bb4-7c1e-81a8-5157e0229af2",ColumnName="IsDocumentLevel",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="8aa7ef93-d726-a06a-199e-3ea47151ba63",
Synchronized="2022-05-26 14:28:18.0")
/** Column name IsDocumentLevel */
public static final String COLUMNNAME_IsDocumentLevel = "IsDocumentLevel";
/** Set Sales Tax.
@param IsSalesTax This is a sales tax (i.e. not a value added tax) */
public void setIsSalesTax (boolean IsSalesTax)
{
set_Value (COLUMNNAME_IsSalesTax, Boolean.valueOf(IsSalesTax));
}
/** Get Sales Tax.
@return This is a sales tax (i.e. not a value added tax) */
public boolean isSalesTax() 
{
Object oo = get_Value(COLUMNNAME_IsSalesTax);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="7c7cc2ab-74a6-2c7b-80c2-7a1812cd32f3")
public static String es_PE_FIELD_Tax_SalesTax_Name="Impuesto de Venta";

@XendraTrl(Identifier="7c7cc2ab-74a6-2c7b-80c2-7a1812cd32f3")
public static String es_PE_FIELD_Tax_SalesTax_Help="Si seleccionó un impuesto CXP este es manejado como un gasto, de otra manera es manejado como un crédito al IVA ";

@XendraTrl(Identifier="7c7cc2ab-74a6-2c7b-80c2-7a1812cd32f3")
public static String es_PE_FIELD_Tax_SalesTax_Description="Esto es un Impuesto de Venta (ej. no es impuesto al valor agregado)";

@XendraField(AD_Column_ID="IsSalesTax",IsCentrallyMaintained=true,
AD_Tab_ID="83ca4a33-fb7e-f6d7-6aa9-d23b3744f82a",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=120,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7c7cc2ab-74a6-2c7b-80c2-7a1812cd32f3")
public static final String FIELDNAME_Tax_SalesTax="7c7cc2ab-74a6-2c7b-80c2-7a1812cd32f3";

@XendraTrl(Identifier="74468cfb-05f1-039c-98ba-072c5a0d8dda")
public static String es_PE_COLUMN_IsSalesTax_Name="Impuesto de Venta";

@XendraColumn(AD_Element_ID="d77d72fa-2813-4efc-747e-c2be045100bb",ColumnName="IsSalesTax",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="74468cfb-05f1-039c-98ba-072c5a0d8dda",
Synchronized="2022-05-26 14:28:18.0")
/** Column name IsSalesTax */
public static final String COLUMNNAME_IsSalesTax = "IsSalesTax";
/** Set IsSubstract.
@param IsSubstract IsSubstract */
public void setIsSubstract (boolean IsSubstract)
{
set_Value (COLUMNNAME_IsSubstract, Boolean.valueOf(IsSubstract));
}
/** Get IsSubstract.
@return IsSubstract */
public boolean isSubstract() 
{
Object oo = get_Value(COLUMNNAME_IsSubstract);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="3f155ad5-2c81-5958-48ff-2211d221d44c")
public static String es_PE_FIELD_Tax_IsSubstract_Name="Impuesto que Resta";

@XendraField(AD_Column_ID="IsSubstract",IsCentrallyMaintained=true,
AD_Tab_ID="83ca4a33-fb7e-f6d7-6aa9-d23b3744f82a",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=270,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3f155ad5-2c81-5958-48ff-2211d221d44c")
public static final String FIELDNAME_Tax_IsSubstract="3f155ad5-2c81-5958-48ff-2211d221d44c";

@XendraTrl(Identifier="dd6e6b94-64a5-682e-8b06-f4d77941b472")
public static String es_PE_COLUMN_IsSubstract_Name="issubstract";

@XendraColumn(AD_Element_ID="a7d0597f-c25b-04e8-8969-d23f6c53491c",ColumnName="IsSubstract",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="dd6e6b94-64a5-682e-8b06-f4d77941b472",
Synchronized="2022-05-26 14:28:18.0")
/** Column name IsSubstract */
public static final String COLUMNNAME_IsSubstract = "IsSubstract";
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

@XendraTrl(Identifier="8af8ed1a-fe1b-e396-297e-74dce79ef829")
public static String es_PE_FIELD_Tax_SummaryLevel_Name="Entidad Acumulada";

@XendraTrl(Identifier="8af8ed1a-fe1b-e396-297e-74dce79ef829")
public static String es_PE_FIELD_Tax_SummaryLevel_Help="Una entidad sumaria representa una rama en un árbol mas bien que un nodo final. Las entidades sumarias son usadas para reportar y no tienen valores propios";

@XendraTrl(Identifier="8af8ed1a-fe1b-e396-297e-74dce79ef829")
public static String es_PE_FIELD_Tax_SummaryLevel_Description="Esta es una entidad sumaria";

@XendraField(AD_Column_ID="IsSummary",IsCentrallyMaintained=true,
AD_Tab_ID="83ca4a33-fb7e-f6d7-6aa9-d23b3744f82a",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=130,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8af8ed1a-fe1b-e396-297e-74dce79ef829")
public static final String FIELDNAME_Tax_SummaryLevel="8af8ed1a-fe1b-e396-297e-74dce79ef829";

@XendraTrl(Identifier="47ff0408-7011-94ae-2179-d8de1d6683d7")
public static String es_PE_COLUMN_IsSummary_Name="Entidad Acumulada";

@XendraColumn(AD_Element_ID="0ecd1d56-9e2b-8778-7b05-92730d811ad4",ColumnName="IsSummary",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="47ff0408-7011-94ae-2179-d8de1d6683d7",
Synchronized="2022-05-26 14:28:18.0")
/** Column name IsSummary */
public static final String COLUMNNAME_IsSummary = "IsSummary";
/** Set Tax exempt.
@param IsTaxExempt Business partner is exempt from tax */
public void setIsTaxExempt (boolean IsTaxExempt)
{
set_Value (COLUMNNAME_IsTaxExempt, Boolean.valueOf(IsTaxExempt));
}
/** Get Tax exempt.
@return Business partner is exempt from tax */
public boolean isTaxExempt() 
{
Object oo = get_Value(COLUMNNAME_IsTaxExempt);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="cc75b06d-70c3-f4bf-f406-cb75bbda539e")
public static String es_PE_FIELD_Tax_TaxExempt_Name="Exento de Impuesto";

@XendraTrl(Identifier="cc75b06d-70c3-f4bf-f406-cb75bbda539e")
public static String es_PE_FIELD_Tax_TaxExempt_Help="El cuadro de verificación exento de impuesto identifica un socio de negocio quien no esta sujeto al impuesto de ventas.";

@XendraTrl(Identifier="cc75b06d-70c3-f4bf-f406-cb75bbda539e")
public static String es_PE_FIELD_Tax_TaxExempt_Description="Este socio de negocio esta exento del impuesto de ventas.";

@XendraField(AD_Column_ID="IsTaxExempt",IsCentrallyMaintained=true,
AD_Tab_ID="83ca4a33-fb7e-f6d7-6aa9-d23b3744f82a",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="cc75b06d-70c3-f4bf-f406-cb75bbda539e")
public static final String FIELDNAME_Tax_TaxExempt="cc75b06d-70c3-f4bf-f406-cb75bbda539e";

@XendraTrl(Identifier="8b3275e4-c378-5a3a-0fc3-2798e088424f")
public static String es_PE_COLUMN_IsTaxExempt_Name="Exento de Impuesto";

@XendraColumn(AD_Element_ID="16f91faf-5980-9ce8-0199-2fad4dad3541",ColumnName="IsTaxExempt",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="8b3275e4-c378-5a3a-0fc3-2798e088424f",
Synchronized="2022-05-26 14:28:18.0")
/** Column name IsTaxExempt */
public static final String COLUMNNAME_IsTaxExempt = "IsTaxExempt";
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

@XendraTrl(Identifier="f2df536f-cbc2-738b-8894-86cf844a2c1b")
public static String es_PE_FIELD_Tax_Name_Name="Nombre";

@XendraTrl(Identifier="f2df536f-cbc2-738b-8894-86cf844a2c1b")
public static String es_PE_FIELD_Tax_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraTrl(Identifier="f2df536f-cbc2-738b-8894-86cf844a2c1b")
public static String es_PE_FIELD_Tax_Name_Description="Identificador alfanumérico de la entidad.";

@XendraField(AD_Column_ID="Name",IsCentrallyMaintained=true,
AD_Tab_ID="83ca4a33-fb7e-f6d7-6aa9-d23b3744f82a",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=30,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f2df536f-cbc2-738b-8894-86cf844a2c1b")
public static final String FIELDNAME_Tax_Name="f2df536f-cbc2-738b-8894-86cf844a2c1b";

@XendraTrl(Identifier="6d47308f-b270-155d-eb79-8b0f65c3658a")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=true,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6d47308f-b270-155d-eb79-8b0f65c3658a",
Synchronized="2022-05-26 14:28:18.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
/** Set Parent Tax.
@param Parent_Tax_ID Parent Tax indicates a tax that is made up of multiple taxes */
public void setParent_Tax_ID (int Parent_Tax_ID)
{
if (Parent_Tax_ID <= 0) set_Value (COLUMNNAME_Parent_Tax_ID, null);
 else 
set_Value (COLUMNNAME_Parent_Tax_ID, Integer.valueOf(Parent_Tax_ID));
}
/** Get Parent Tax.
@return Parent Tax indicates a tax that is made up of multiple taxes */
public int getParent_Tax_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_Parent_Tax_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="7e4a24ea-5b4a-ac78-4c48-a5bc7d4ae761")
public static String es_PE_FIELD_Tax_ParentTax_Name="Impuesto Padre";

@XendraTrl(Identifier="7e4a24ea-5b4a-ac78-4c48-a5bc7d4ae761")
public static String es_PE_FIELD_Tax_ParentTax_Help="El Impuesto padre indica un impuesto que es una referencia para múltiples impuestos. Esto le permite cambiar múltiples impuestos en un documento introduciendo el Impuesto padre.";

@XendraTrl(Identifier="7e4a24ea-5b4a-ac78-4c48-a5bc7d4ae761")
public static String es_PE_FIELD_Tax_ParentTax_Description="Impuesto Padre indica un impuesto que esta formado por múltiples impuestos";

@XendraField(AD_Column_ID="Parent_Tax_ID",IsCentrallyMaintained=true,
AD_Tab_ID="83ca4a33-fb7e-f6d7-6aa9-d23b3744f82a",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsSummary@='N'",DisplayLength=14,IsReadOnly=false,SeqNo=140,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="7e4a24ea-5b4a-ac78-4c48-a5bc7d4ae761")
public static final String FIELDNAME_Tax_ParentTax="7e4a24ea-5b4a-ac78-4c48-a5bc7d4ae761";

@XendraTrl(Identifier="a37fa2e2-619a-27b7-c583-35954c1faf6d")
public static String es_PE_COLUMN_Parent_Tax_ID_Name="Impuesto Padre";

@XendraColumn(AD_Element_ID="edddc6be-e0f6-bdd7-b04f-9555a57e5635",ColumnName="Parent_Tax_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="411ade7b-1736-d48c-6ab6-5608326984b1",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="a37fa2e2-619a-27b7-c583-35954c1faf6d",Synchronized="2022-05-26 14:28:18.0")
/** Column name Parent_Tax_ID */
public static final String COLUMNNAME_Parent_Tax_ID = "Parent_Tax_ID";
/** Set Rate.
@param Rate Rate or Tax or Exchange */
public void setRate (BigDecimal Rate)
{
if (Rate == null) throw new IllegalArgumentException ("Rate is mandatory.");
set_Value (COLUMNNAME_Rate, Rate);
}
/** Get Rate.
@return Rate or Tax or Exchange */
public BigDecimal getRate() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Rate);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="43d66ec7-c43e-b5be-0238-768ab3045d9b")
public static String es_PE_FIELD_Tax_Rate_Name="Tasa";

@XendraTrl(Identifier="43d66ec7-c43e-b5be-0238-768ab3045d9b")
public static String es_PE_FIELD_Tax_Rate_Help="La tasa indica el porcentaje a ser multiplicado por la fuente para obtener el impuesto ó el total de la conversión.";

@XendraTrl(Identifier="43d66ec7-c43e-b5be-0238-768ab3045d9b")
public static String es_PE_FIELD_Tax_Rate_Description="Tasa, impuesto ó conversión.";

@XendraField(AD_Column_ID="Rate",IsCentrallyMaintained=true,
AD_Tab_ID="83ca4a33-fb7e-f6d7-6aa9-d23b3744f82a",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=160,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="43d66ec7-c43e-b5be-0238-768ab3045d9b")
public static final String FIELDNAME_Tax_Rate="43d66ec7-c43e-b5be-0238-768ab3045d9b";

@XendraTrl(Identifier="a4e95e0d-f3bd-a3d0-09c0-148653191ecf")
public static String es_PE_COLUMN_Rate_Name="Tasa";

@XendraColumn(AD_Element_ID="3eb861a4-ab06-c590-06e1-f57223b55231",ColumnName="Rate",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="0",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a4e95e0d-f3bd-a3d0-09c0-148653191ecf",
Synchronized="2022-05-26 14:28:18.0")
/** Column name Rate */
public static final String COLUMNNAME_Rate = "Rate";
/** Set Requires Tax Certificate.
@param RequiresTaxCertificate This tax rate requires the Business Partner to be tax exempt */
public void setRequiresTaxCertificate (boolean RequiresTaxCertificate)
{
set_Value (COLUMNNAME_RequiresTaxCertificate, Boolean.valueOf(RequiresTaxCertificate));
}
/** Get Requires Tax Certificate.
@return This tax rate requires the Business Partner to be tax exempt */
public boolean isRequiresTaxCertificate() 
{
Object oo = get_Value(COLUMNNAME_RequiresTaxCertificate);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="6e92acd5-e059-a130-2f8d-1b1244486077")
public static String es_PE_FIELD_Tax_RequiresTaxCertificate_Name="Requiere Certificado de Impuestos";

@XendraTrl(Identifier="6e92acd5-e059-a130-2f8d-1b1244486077")
public static String es_PE_FIELD_Tax_RequiresTaxCertificate_Help="El requiere certificado de Impuesto indica que un certificado de impuesto es requerido por un socio de negocio para estar ecxento de impuestos.";

@XendraTrl(Identifier="6e92acd5-e059-a130-2f8d-1b1244486077")
public static String es_PE_FIELD_Tax_RequiresTaxCertificate_Description="Esta tasa de impuesto requiere que el socio de negocio este ecxento de impuestos.";

@XendraField(AD_Column_ID="RequiresTaxCertificate",IsCentrallyMaintained=true,
AD_Tab_ID="83ca4a33-fb7e-f6d7-6aa9-d23b3744f82a",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6e92acd5-e059-a130-2f8d-1b1244486077")
public static final String FIELDNAME_Tax_RequiresTaxCertificate="6e92acd5-e059-a130-2f8d-1b1244486077";

@XendraTrl(Identifier="5732d847-8b61-7904-fb54-831c96d7d153")
public static String es_PE_COLUMN_RequiresTaxCertificate_Name="Requiere Certificado de Impuestos";

@XendraColumn(AD_Element_ID="074eac6e-fc9e-8130-9ffc-d0fc9e8cdc13",
ColumnName="RequiresTaxCertificate",AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="N",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="5732d847-8b61-7904-fb54-831c96d7d153",Synchronized="2022-05-26 14:28:18.0")
/** Column name RequiresTaxCertificate */
public static final String COLUMNNAME_RequiresTaxCertificate = "RequiresTaxCertificate";
/** Set SO/PO Type.
@param SOPOType Sales Tax applies to sales situations, Purchase Tax to purchase situations */
public void setSOPOType (String SOPOType)
{
if (SOPOType.length() > 1)
{
log.warning("Length > 1 - truncated");
SOPOType = SOPOType.substring(0,0);
}
set_Value (COLUMNNAME_SOPOType, SOPOType);
}
/** Get SO/PO Type.
@return Sales Tax applies to sales situations, Purchase Tax to purchase situations */
public String getSOPOType() 
{
return (String)get_Value(COLUMNNAME_SOPOType);
}

@XendraTrl(Identifier="0753abcb-161d-aeff-5018-3a7b2fd89aba")
public static String es_PE_FIELD_Tax_SOPOType_Name="Tipo OV / OC ";

@XendraTrl(Identifier="0753abcb-161d-aeff-5018-3a7b2fd89aba")
public static String es_PE_FIELD_Tax_SOPOType_Help="Impuesto de ventas: cargado al vender - ejemplos: Impuesto de ventas, salida de IVA (Pagadero)Impuesto de compras: el impuesto cargado al comprar - ejemplos: impuesto de uso, entrada de IVA,  (admisible)";

@XendraTrl(Identifier="0753abcb-161d-aeff-5018-3a7b2fd89aba")
public static String es_PE_FIELD_Tax_SOPOType_Description="El impuesto de ventas aplica a las situaciones de ventas, Impuesto de compras para situaciones de compra.";

@XendraField(AD_Column_ID="SOPOType",IsCentrallyMaintained=true,
AD_Tab_ID="83ca4a33-fb7e-f6d7-6aa9-d23b3744f82a",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=150,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0753abcb-161d-aeff-5018-3a7b2fd89aba")
public static final String FIELDNAME_Tax_SOPOType="0753abcb-161d-aeff-5018-3a7b2fd89aba";

@XendraTrl(Identifier="79d4c9e0-50f1-ff9d-6d0f-9706c3811e60")
public static String es_PE_COLUMN_SOPOType_Name="Tipo OV / OC ";

@XendraColumn(AD_Element_ID="a1ce8337-fa8c-6dd9-1bf8-15fe7a023ffc",ColumnName="SOPOType",
AD_Reference_ID=17,AD_Reference_Value_ID="4cb3fe77-cab1-eb20-7a95-e4bc1213d850",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="B",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="79d4c9e0-50f1-ff9d-6d0f-9706c3811e60",Synchronized="2022-05-26 14:28:18.0")
/** Column name SOPOType */
public static final String COLUMNNAME_SOPOType = "SOPOType";
/** Set Tax Alias.
@param TaxAlias Tax Alias */
public void setTaxAlias (String TaxAlias)
{
if (TaxAlias != null && TaxAlias.length() > 3)
{
log.warning("Length > 3 - truncated");
TaxAlias = TaxAlias.substring(0,2);
}
set_Value (COLUMNNAME_TaxAlias, TaxAlias);
}
/** Get Tax Alias.
@return Tax Alias */
public String getTaxAlias() 
{
return (String)get_Value(COLUMNNAME_TaxAlias);
}

@XendraTrl(Identifier="61e09874-dd5f-2a0d-6112-3f0279799f20")
public static String es_PE_FIELD_Tax_TaxAlias_Name="Sinonimo de Impuesto";

@XendraField(AD_Column_ID="TaxAlias",IsCentrallyMaintained=true,
AD_Tab_ID="83ca4a33-fb7e-f6d7-6aa9-d23b3744f82a",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=0,IsReadOnly=false,SeqNo=220,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="61e09874-dd5f-2a0d-6112-3f0279799f20")
public static final String FIELDNAME_Tax_TaxAlias="61e09874-dd5f-2a0d-6112-3f0279799f20";

@XendraTrl(Identifier="f7aee15e-3337-a41b-8203-fe244bdfee08")
public static String es_PE_COLUMN_TaxAlias_Name="Sinonimo de Impuesto";

@XendraColumn(AD_Element_ID="31eceab6-8ef8-6542-3944-c20c06ae504c",ColumnName="TaxAlias",
AD_Reference_ID=17,AD_Reference_Value_ID="3f37eeba-3f69-8954-9343-e036e7fd4c4d",AD_Val_Rule_ID="",
FieldLength=3,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="f7aee15e-3337-a41b-8203-fe244bdfee08",Synchronized="2022-05-26 14:28:18.0")
/** Column name TaxAlias */
public static final String COLUMNNAME_TaxAlias = "TaxAlias";
/** Set Tax ID.
@param TaxID Tax Identification */
public void setTaxID (String TaxID)
{
if (TaxID != null && TaxID.length() > 2)
{
log.warning("Length > 2 - truncated");
TaxID = TaxID.substring(0,1);
}
set_Value (COLUMNNAME_TaxID, TaxID);
}
/** Get Tax ID.
@return Tax Identification */
public String getTaxID() 
{
return (String)get_Value(COLUMNNAME_TaxID);
}

@XendraTrl(Identifier="896ad2d3-c99a-4099-8cff-a35e91684353")
public static String es_PE_FIELD_Tax_TaxID_Name="RFC";

@XendraTrl(Identifier="896ad2d3-c99a-4099-8cff-a35e91684353")
public static String es_PE_FIELD_Tax_TaxID_Help="El código de Identificación es el número de identificación gubernamental de esta entidad";

@XendraTrl(Identifier="896ad2d3-c99a-4099-8cff-a35e91684353")
public static String es_PE_FIELD_Tax_TaxID_Description="Código de Identificación";

@XendraField(AD_Column_ID="TaxID",IsCentrallyMaintained=true,
AD_Tab_ID="83ca4a33-fb7e-f6d7-6aa9-d23b3744f82a",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=2,IsReadOnly=false,SeqNo=230,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2022-09-03 18:51:04.0",
Identifier="896ad2d3-c99a-4099-8cff-a35e91684353")
public static final String FIELDNAME_Tax_TaxID="896ad2d3-c99a-4099-8cff-a35e91684353";

@XendraTrl(Identifier="8e9e8710-1704-4f0b-a822-79f405f79afb")
public static String es_PE_COLUMN_TaxID_Name="Tax ID";

@XendraColumn(AD_Element_ID="e0a9d0f7-835b-4f80-4c13-bff62213e232",ColumnName="TaxID",
AD_Reference_ID=17,AD_Reference_Value_ID="aaf59fc0-b972-45e3-a527-a1b89923d2ba",AD_Val_Rule_ID="",
FieldLength=2,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="8e9e8710-1704-4f0b-a822-79f405f79afb",Synchronized="2022-09-03 18:43:36.0")
/** Column name TaxID */
public static final String COLUMNNAME_TaxID = "TaxID";
/** Set Tax Indicator.
@param TaxIndicator Short form for Tax to be printed on documents */
public void setTaxIndicator (String TaxIndicator)
{
if (TaxIndicator != null && TaxIndicator.length() > 10)
{
log.warning("Length > 10 - truncated");
TaxIndicator = TaxIndicator.substring(0,9);
}
set_Value (COLUMNNAME_TaxIndicator, TaxIndicator);
}
/** Get Tax Indicator.
@return Short form for Tax to be printed on documents */
public String getTaxIndicator() 
{
String value = (String)get_Value(COLUMNNAME_TaxIndicator);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="9bb3ce26-9514-279a-4db8-a3fd6f38785c")
public static String es_PE_FIELD_Tax_TaxIndicator_Name="Identificador de Impuesto";

@XendraTrl(Identifier="9bb3ce26-9514-279a-4db8-a3fd6f38785c")
public static String es_PE_FIELD_Tax_TaxIndicator_Help="El Indicador de Impuesto identifica el nombre corto que se imprimirá en un documento haciendo referencia a este impuesto.";

@XendraTrl(Identifier="9bb3ce26-9514-279a-4db8-a3fd6f38785c")
public static String es_PE_FIELD_Tax_TaxIndicator_Description="Forma corta para que el impuesto sea impreso en los documentos";

@XendraField(AD_Column_ID="TaxIndicator",IsCentrallyMaintained=true,
AD_Tab_ID="83ca4a33-fb7e-f6d7-6aa9-d23b3744f82a",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=5,IsReadOnly=false,SeqNo=170,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9bb3ce26-9514-279a-4db8-a3fd6f38785c")
public static final String FIELDNAME_Tax_TaxIndicator="9bb3ce26-9514-279a-4db8-a3fd6f38785c";

@XendraTrl(Identifier="c028e376-e7aa-7eb1-2c5d-ac7e5ab95ceb")
public static String es_PE_COLUMN_TaxIndicator_Name="Identificador de Impuesto";

@XendraColumn(AD_Element_ID="099119b1-a377-e966-4537-2f056d06fb9d",ColumnName="TaxIndicator",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=true,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c028e376-e7aa-7eb1-2c5d-ac7e5ab95ceb",
Synchronized="2022-05-26 14:28:18.0")
/** Column name TaxIndicator */
public static final String COLUMNNAME_TaxIndicator = "TaxIndicator";
/** Set TaxTypeCode.
@param TaxTypeCode TaxTypeCode */
public void setTaxTypeCode (String TaxTypeCode)
{
if (TaxTypeCode != null && TaxTypeCode.length() > 4)
{
log.warning("Length > 4 - truncated");
TaxTypeCode = TaxTypeCode.substring(0,3);
}
set_Value (COLUMNNAME_TaxTypeCode, TaxTypeCode);
}
/** Get TaxTypeCode.
@return TaxTypeCode */
public String getTaxTypeCode() 
{
return (String)get_Value(COLUMNNAME_TaxTypeCode);
}

@XendraTrl(Identifier="11f58540-89b4-4dc0-b693-0e167d3c8e23")
public static String es_PE_FIELD_Tax_TaxTypeCode_Name="taxtypecode";

@XendraField(AD_Column_ID="TaxTypeCode",IsCentrallyMaintained=true,
AD_Tab_ID="83ca4a33-fb7e-f6d7-6aa9-d23b3744f82a",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=4,IsReadOnly=false,SeqNo=240,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2022-05-26 14:28:18.0",
Identifier="11f58540-89b4-4dc0-b693-0e167d3c8e23")
public static final String FIELDNAME_Tax_TaxTypeCode="11f58540-89b4-4dc0-b693-0e167d3c8e23";

@XendraTrl(Identifier="5cc932ea-6613-4426-a305-2b6f52ba3f26")
public static String es_PE_COLUMN_TaxTypeCode_Name="taxtypecode";

@XendraColumn(AD_Element_ID="340ea959-76eb-4235-8d80-7e734d50ac9d",ColumnName="TaxTypeCode",
AD_Reference_ID=17,AD_Reference_Value_ID="a699065c-1917-4584-b020-546bfeba6320",AD_Val_Rule_ID="",
FieldLength=4,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="5cc932ea-6613-4426-a305-2b6f52ba3f26",Synchronized="2022-05-26 14:28:18.0")
/** Column name TaxTypeCode */
public static final String COLUMNNAME_TaxTypeCode = "TaxTypeCode";
/** Set To.
@param To_Country_ID Receiving Country */
public void setTo_Country_ID (int To_Country_ID)
{
if (To_Country_ID <= 0) set_Value (COLUMNNAME_To_Country_ID, null);
 else 
set_Value (COLUMNNAME_To_Country_ID, Integer.valueOf(To_Country_ID));
}
/** Get To.
@return Receiving Country */
public int getTo_Country_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_To_Country_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="90fa67f2-ad58-adc4-c45b-023cd747735a")
public static String es_PE_FIELD_Tax_To_Name="A";

@XendraTrl(Identifier="90fa67f2-ad58-adc4-c45b-023cd747735a")
public static String es_PE_FIELD_Tax_To_Help="El A País indica el país que recibe en un documento.";

@XendraTrl(Identifier="90fa67f2-ad58-adc4-c45b-023cd747735a")
public static String es_PE_FIELD_Tax_To_Description="País que recibe";

@XendraField(AD_Column_ID="To_Country_ID",IsCentrallyMaintained=true,
AD_Tab_ID="83ca4a33-fb7e-f6d7-6aa9-d23b3744f82a",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=190,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="90fa67f2-ad58-adc4-c45b-023cd747735a")
public static final String FIELDNAME_Tax_To="90fa67f2-ad58-adc4-c45b-023cd747735a";

@XendraTrl(Identifier="6e407897-52af-7883-a59d-499fe9dee3db")
public static String es_PE_COLUMN_To_Country_ID_Name="A";

@XendraColumn(AD_Element_ID="777e77a8-1aa3-753d-457e-9ec8db1320db",ColumnName="To_Country_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="da097900-8f86-9a6d-5a27-605e202ce9a8",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="6e407897-52af-7883-a59d-499fe9dee3db",Synchronized="2022-05-26 14:28:18.0")
/** Column name To_Country_ID */
public static final String COLUMNNAME_To_Country_ID = "To_Country_ID";
/** Set To.
@param To_Region_ID Receiving Region */
public void setTo_Region_ID (int To_Region_ID)
{
if (To_Region_ID <= 0) set_Value (COLUMNNAME_To_Region_ID, null);
 else 
set_Value (COLUMNNAME_To_Region_ID, Integer.valueOf(To_Region_ID));
}
/** Get To.
@return Receiving Region */
public int getTo_Region_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_To_Region_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="59cb387d-3043-3674-075e-1222a68889a0")
public static String es_PE_FIELD_Tax_To2_Name="A";

@XendraTrl(Identifier="59cb387d-3043-3674-075e-1222a68889a0")
public static String es_PE_FIELD_Tax_To2_Help="El A Región indica la región que recibe en un documento";

@XendraTrl(Identifier="59cb387d-3043-3674-075e-1222a68889a0")
public static String es_PE_FIELD_Tax_To2_Description="Región que recibe";

@XendraField(AD_Column_ID="To_Region_ID",IsCentrallyMaintained=true,
AD_Tab_ID="83ca4a33-fb7e-f6d7-6aa9-d23b3744f82a",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=210,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="59cb387d-3043-3674-075e-1222a68889a0")
public static final String FIELDNAME_Tax_To2="59cb387d-3043-3674-075e-1222a68889a0";

@XendraTrl(Identifier="9ebd45d2-3b08-574a-c55f-cdabdf65f6f9")
public static String es_PE_COLUMN_To_Region_ID_Name="A";

@XendraColumn(AD_Element_ID="55ad1efb-84a9-f27e-9c2e-91e38130321d",ColumnName="To_Region_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="f560243f-2ea5-bcb4-265f-52555b17a707",
AD_Val_Rule_ID="a71cc79d-92f5-ea64-3006-a99129b08b2a",FieldLength=22,DefaultValue="",IsKey=false,
IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9ebd45d2-3b08-574a-c55f-cdabdf65f6f9",
Synchronized="2022-05-26 14:28:18.0")
/** Column name To_Region_ID */
public static final String COLUMNNAME_To_Region_ID = "To_Region_ID";
/** Set Valid from.
@param ValidFrom Valid from including this date (first day) */
public void setValidFrom (Timestamp ValidFrom)
{
if (ValidFrom == null) throw new IllegalArgumentException ("ValidFrom is mandatory.");
set_Value (COLUMNNAME_ValidFrom, ValidFrom);
}
/** Get Valid from.
@return Valid from including this date (first day) */
public Timestamp getValidFrom() 
{
return (Timestamp)get_Value(COLUMNNAME_ValidFrom);
}

@XendraTrl(Identifier="e2f5630b-c253-e7be-1b82-9e5ac4f53fcf")
public static String es_PE_FIELD_Tax_ValidFrom_Name="Válido Desde";

@XendraTrl(Identifier="e2f5630b-c253-e7be-1b82-9e5ac4f53fcf")
public static String es_PE_FIELD_Tax_ValidFrom_Help="La fecha válida desde indica el primer día de un rango de fechas";

@XendraTrl(Identifier="e2f5630b-c253-e7be-1b82-9e5ac4f53fcf")
public static String es_PE_FIELD_Tax_ValidFrom_Description="Válido desde; incluyendo esta fecha (primer día)";

@XendraField(AD_Column_ID="ValidFrom",IsCentrallyMaintained=true,
AD_Tab_ID="83ca4a33-fb7e-f6d7-6aa9-d23b3744f82a",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e2f5630b-c253-e7be-1b82-9e5ac4f53fcf")
public static final String FIELDNAME_Tax_ValidFrom="e2f5630b-c253-e7be-1b82-9e5ac4f53fcf";

@XendraTrl(Identifier="fd8d3670-cda0-b514-25fd-8c252c09c111")
public static String es_PE_COLUMN_ValidFrom_Name="Válido Desde";

@XendraColumn(AD_Element_ID="86b1171a-a6c6-0da5-1aea-3f3106450d07",ColumnName="ValidFrom",
AD_Reference_ID=15,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="fd8d3670-cda0-b514-25fd-8c252c09c111",
Synchronized="2022-05-26 14:28:18.0")
/** Column name ValidFrom */
public static final String COLUMNNAME_ValidFrom = "ValidFrom";
/** Set Search Key.
@param Value Search key for the record in the format required - must be unique */
public void setValue (String Value)
{
if (Value != null && Value.length() > 40)
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
@XendraTrl(Identifier="f1ab92b6-bd7f-4dcb-bf04-849be0def21f")
public static String es_PE_FIELD_Tax_SearchKey_Name="Clave de Búsqueda";

@XendraTrl(Identifier="f1ab92b6-bd7f-4dcb-bf04-849be0def21f")
public static String es_PE_FIELD_Tax_SearchKey_Help="Una clave de búsqueda le permite a usted un método rápido de encontrar un registro en particular";

@XendraTrl(Identifier="f1ab92b6-bd7f-4dcb-bf04-849be0def21f")
public static String es_PE_FIELD_Tax_SearchKey_Description="Clave de búsqueda para el registro en el formato requerido; debe ser única";

@XendraField(AD_Column_ID="Value",IsCentrallyMaintained=true,
AD_Tab_ID="83ca4a33-fb7e-f6d7-6aa9-d23b3744f82a",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=40,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2022-05-25 15:41:11.0",
Identifier="f1ab92b6-bd7f-4dcb-bf04-849be0def21f")
public static final String FIELDNAME_Tax_SearchKey="f1ab92b6-bd7f-4dcb-bf04-849be0def21f";

@XendraTrl(Identifier="0d009932-5fd4-428a-9a47-89e8c3060a8b")
public static String es_PE_COLUMN_Value_Name="Search Key";

@XendraColumn(AD_Element_ID="e75e100c-9b41-a643-2cb3-46eeced683d8",ColumnName="Value",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0d009932-5fd4-428a-9a47-89e8c3060a8b",
Synchronized="2022-05-26 14:28:18.0")
/** Column name Value */
public static final String COLUMNNAME_Value = "Value";
}
