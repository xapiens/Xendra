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
/** Generated Model for GL_Distribution
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_GL_Distribution extends PO
{
/** Standard Constructor
@param ctx context
@param GL_Distribution_ID id
@param trxName transaction
*/
public X_GL_Distribution (Properties ctx, int GL_Distribution_ID, String trxName)
{
super (ctx, GL_Distribution_ID, trxName);
/** if (GL_Distribution_ID == 0)
{
setAnyAcct (true);	
// Y
setAnyActivity (true);	
// Y
setAnyBPartner (true);	
// Y
setAnyCampaign (true);	
// Y
setAnyLocFrom (true);	
// Y
setAnyLocTo (true);	
// Y
setAnyOrg (true);	
// Y
setAnyOrgTrx (true);	
// Y
setAnyProduct (true);	
// Y
setAnyProject (true);	
// Y
setAnySalesRegion (true);	
// Y
setAnyUser1 (true);	
// Y
setAnyUser2 (true);	
// Y
setC_AcctSchema_ID (0);
setGL_Distribution_ID (0);
setIsLink (true);	
// Y
setIsValid (false);	
// N
setName (null);
setPercentTotal (Env.ZERO);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_GL_Distribution (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=708 */
public static int Table_ID=MTable.getTable_ID("GL_Distribution");

@XendraTrl(Identifier="bc29674f-75da-59c7-97b4-f7cc128a627f")
public static String es_PE_TAB_Distribution_Description="Distribución general del libro mayor";

@XendraTrl(Identifier="bc29674f-75da-59c7-97b4-f7cc128a627f")
public static String es_PE_TAB_Distribution_Help="Si los criterios de la combinación de la cuenta de distribución se resuelven, la fijación a la combinación de cuenta es substituida por las combinaciones de cuenta de las líneas de distribución. La distribución está prorrateada basada en el cociente de las líneas. La distribución debe ser válida para ser utilizada.";

@XendraTrl(Identifier="bc29674f-75da-59c7-97b4-f7cc128a627f")
public static String es_PE_TAB_Distribution_Name="Distribución";
@XendraTab(Name="Distribution",
Description="General Ledger Distribution",
Help="If the account combination criteria of the Distribution is met, the posting to the account combination is replaced by the account combinations of the distribution lines.   The distribution is prorated based on the percentage of the lines. If the total percent is less then 100 and one line is 0 (null), it gets the remainder.  If there is no line with 0, any rounding is adjusted in the line with the biggest amount.",
AD_Window_ID="10aae78a-1106-df06-4101-244820ee0343",SeqNo=10,TabLevel=0,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="bc29674f-75da-59c7-97b4-f7cc128a627f",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Distribution="bc29674f-75da-59c7-97b4-f7cc128a627f";

@XendraTrl(Identifier="8e97acc8-5b59-c83b-1c19-14491246adbd")
public static String es_PE_TABLE_GL_Distribution_Name="Distribución CG";

@XendraTable(Name="GL Distribution",AD_Package_ID="2ac04657-d663-47c2-4ec1-927ad71f1e96",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="General Ledger Distribution",
Help="",TableName="GL_Distribution",AccessLevel="2",
AD_Window_ID="10aae78a-1106-df06-4101-244820ee0343",AD_Val_Rule_ID="",IsKey=1,LoadSeq=140,
IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,IsView=false,
PO_Window_ID="",ID="org.xendra.accounting",Identifier="8e97acc8-5b59-c83b-1c19-14491246adbd",
Synchronized="2020-03-03 21:37:56.0")
/** TableName=GL_Distribution */
public static final String Table_Name="GL_Distribution";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"GL_Distribution");

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
    Table_ID = MTable.getTable_ID("GL_Distribution");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_GL_Distribution[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Account.
@param Account_ID Account used */
public void setAccount_ID (int Account_ID)
{
if (Account_ID <= 0) set_Value (COLUMNNAME_Account_ID, null);
 else 
set_Value (COLUMNNAME_Account_ID, Integer.valueOf(Account_ID));
}
/** Get Account.
@return Account used */
public int getAccount_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_Account_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="509218e6-ad88-b380-2e58-5f0b3ad912bb")
public static String es_PE_FIELD_Distribution_Account_Name="Cuenta";

@XendraTrl(Identifier="509218e6-ad88-b380-2e58-5f0b3ad912bb")
public static String es_PE_FIELD_Distribution_Account_Description="Cuenta usada";

@XendraTrl(Identifier="509218e6-ad88-b380-2e58-5f0b3ad912bb")
public static String es_PE_FIELD_Distribution_Account_Help="La cuenta (natural) usada";

@XendraField(AD_Column_ID="Account_ID",IsCentrallyMaintained=true,
AD_Tab_ID="bc29674f-75da-59c7-97b4-f7cc128a627f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@AnyAcct@=N",DisplayLength=14,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="509218e6-ad88-b380-2e58-5f0b3ad912bb")
public static final String FIELDNAME_Distribution_Account="509218e6-ad88-b380-2e58-5f0b3ad912bb";

@XendraTrl(Identifier="a140a8ae-c06a-30b8-23e2-17125026a23f")
public static String es_PE_COLUMN_Account_ID_Name="Cuenta";

@XendraColumn(AD_Element_ID="80f1c2b7-bd3e-7c80-0596-67c2f7ca3812",ColumnName="Account_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="fca59846-3472-6195-37e9-9b8f95376f02",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="a140a8ae-c06a-30b8-23e2-17125026a23f",Synchronized="2019-08-30 22:22:33.0")
/** Column name Account_ID */
public static final String COLUMNNAME_Account_ID = "Account_ID";
/** Set Trx Organization.
@param AD_OrgTrx_ID Performing or initiating organization */
public void setAD_OrgTrx_ID (int AD_OrgTrx_ID)
{
if (AD_OrgTrx_ID <= 0) set_Value (COLUMNNAME_AD_OrgTrx_ID, null);
 else 
set_Value (COLUMNNAME_AD_OrgTrx_ID, Integer.valueOf(AD_OrgTrx_ID));
}
/** Get Trx Organization.
@return Performing or initiating organization */
public int getAD_OrgTrx_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_OrgTrx_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="b27ad609-d32b-3a27-fc7d-0a9aa0a1829a")
public static String es_PE_FIELD_Distribution_TrxOrganization_Name="Organización de la Trans.";

@XendraTrl(Identifier="b27ad609-d32b-3a27-fc7d-0a9aa0a1829a")
public static String es_PE_FIELD_Distribution_TrxOrganization_Description="Organización que inicia ó ejecuta la transacción";

@XendraTrl(Identifier="b27ad609-d32b-3a27-fc7d-0a9aa0a1829a")
public static String es_PE_FIELD_Distribution_TrxOrganization_Help="La organización que inicia ó ejecuta la transacción (para otra organización). La organización poseedora puede no ser la organización de la transacción en un ambiente de buró de servicio; con servicios centralizados y transacciones inter- organización.";

@XendraField(AD_Column_ID="AD_OrgTrx_ID",IsCentrallyMaintained=true,
AD_Tab_ID="bc29674f-75da-59c7-97b4-f7cc128a627f",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="@$Element_OT@=Y & @AnyOrgTrx@=N",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="b27ad609-d32b-3a27-fc7d-0a9aa0a1829a")
public static final String FIELDNAME_Distribution_TrxOrganization="b27ad609-d32b-3a27-fc7d-0a9aa0a1829a";

@XendraTrl(Identifier="64283175-c447-f4e0-5cf3-4abe30116a6b")
public static String es_PE_COLUMN_AD_OrgTrx_ID_Name="Organización de la Trans.";

@XendraColumn(AD_Element_ID="b4180358-67aa-fe55-0409-6367a60e0a2e",ColumnName="AD_OrgTrx_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="54e78591-f7f4-c613-ea27-e64b3dac5198",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="64283175-c447-f4e0-5cf3-4abe30116a6b",Synchronized="2019-08-30 22:22:33.0")
/** Column name AD_OrgTrx_ID */
public static final String COLUMNNAME_AD_OrgTrx_ID = "AD_OrgTrx_ID";
/** Set Any Account.
@param AnyAcct Match any value of the Account segment */
public void setAnyAcct (boolean AnyAcct)
{
set_Value (COLUMNNAME_AnyAcct, Boolean.valueOf(AnyAcct));
}
/** Get Any Account.
@return Match any value of the Account segment */
public boolean isAnyAcct() 
{
Object oo = get_Value(COLUMNNAME_AnyAcct);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="90fd4b4e-1357-698f-fa6e-2ef7ac5cd98e")
public static String es_PE_FIELD_Distribution_AnyAccount_Name="Cualquier Cuenta";

@XendraTrl(Identifier="90fd4b4e-1357-698f-fa6e-2ef7ac5cd98e")
public static String es_PE_FIELD_Distribution_AnyAccount_Description="Empareja cualquier valor del de la cuenta.";

@XendraTrl(Identifier="90fd4b4e-1357-698f-fa6e-2ef7ac5cd98e")
public static String es_PE_FIELD_Distribution_AnyAccount_Help="Si está seleccionado, cualquier valor del segmento de la cuenta se emparejará. Si no esta seleccionado, pero no se selecciona ningún valor del segmento de la contabilidad, el valor emparejado debe ser nulo (es decir no definido).";

@XendraField(AD_Column_ID="AnyAcct",IsCentrallyMaintained=true,
AD_Tab_ID="bc29674f-75da-59c7-97b4-f7cc128a627f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="90fd4b4e-1357-698f-fa6e-2ef7ac5cd98e")
public static final String FIELDNAME_Distribution_AnyAccount="90fd4b4e-1357-698f-fa6e-2ef7ac5cd98e";

@XendraTrl(Identifier="32b754cf-c2a6-a768-fb3e-0209a72e1994")
public static String es_PE_COLUMN_AnyAcct_Name="Cualquier Cuenta";

@XendraColumn(AD_Element_ID="9d0e9d9e-487f-30b5-fe3b-cd2abb6eaede",ColumnName="AnyAcct",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="Y",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="32b754cf-c2a6-a768-fb3e-0209a72e1994",
Synchronized="2019-08-30 22:22:33.0")
/** Column name AnyAcct */
public static final String COLUMNNAME_AnyAcct = "AnyAcct";
/** Set Any Activity.
@param AnyActivity Match any value of the Activity segment */
public void setAnyActivity (boolean AnyActivity)
{
set_Value (COLUMNNAME_AnyActivity, Boolean.valueOf(AnyActivity));
}
/** Get Any Activity.
@return Match any value of the Activity segment */
public boolean isAnyActivity() 
{
Object oo = get_Value(COLUMNNAME_AnyActivity);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="0ed2ff0b-d00b-c076-8418-79d5e0d946b6")
public static String es_PE_FIELD_Distribution_AnyActivity_Name="Cualquier Actividad";

@XendraTrl(Identifier="0ed2ff0b-d00b-c076-8418-79d5e0d946b6")
public static String es_PE_FIELD_Distribution_AnyActivity_Description="Empareja cualquier valor del segmento de la actividad";

@XendraTrl(Identifier="0ed2ff0b-d00b-c076-8418-79d5e0d946b6")
public static String es_PE_FIELD_Distribution_AnyActivity_Help="Si está seleccionado, cualquier valor del segmento de la cuenta se emparejará. Si no esta seleccionado, pero no se selecciona ningún valor del segmento de la contabilidad, el valor emparejado debe ser nulo (es decir no definido).";

@XendraField(AD_Column_ID="AnyActivity",IsCentrallyMaintained=true,
AD_Tab_ID="bc29674f-75da-59c7-97b4-f7cc128a627f",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="@$Element_AY@=Y",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0ed2ff0b-d00b-c076-8418-79d5e0d946b6")
public static final String FIELDNAME_Distribution_AnyActivity="0ed2ff0b-d00b-c076-8418-79d5e0d946b6";

@XendraTrl(Identifier="7b453d12-d85c-d416-2bce-8f2bdc3df5fe")
public static String es_PE_COLUMN_AnyActivity_Name="Cualquier Actividad";

@XendraColumn(AD_Element_ID="02731401-8337-5e00-8391-bb4227cefffc",ColumnName="AnyActivity",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="Y",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7b453d12-d85c-d416-2bce-8f2bdc3df5fe",
Synchronized="2019-08-30 22:22:33.0")
/** Column name AnyActivity */
public static final String COLUMNNAME_AnyActivity = "AnyActivity";
/** Set Any Bus.Partner.
@param AnyBPartner Match any value of the Business Partner segment */
public void setAnyBPartner (boolean AnyBPartner)
{
set_Value (COLUMNNAME_AnyBPartner, Boolean.valueOf(AnyBPartner));
}
/** Get Any Bus.Partner.
@return Match any value of the Business Partner segment */
public boolean isAnyBPartner() 
{
Object oo = get_Value(COLUMNNAME_AnyBPartner);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="e024082c-8ea4-7185-1e7e-5391bcf0ce88")
public static String es_PE_FIELD_Distribution_AnyBusPartner_Name="Cualquier Soc.Neg.";

@XendraTrl(Identifier="e024082c-8ea4-7185-1e7e-5391bcf0ce88")
public static String es_PE_FIELD_Distribution_AnyBusPartner_Description="Empareja cualquier valor del segmento del socio de negocio";

@XendraTrl(Identifier="e024082c-8ea4-7185-1e7e-5391bcf0ce88")
public static String es_PE_FIELD_Distribution_AnyBusPartner_Help="Si está seleccionado, cualquier valor del segmento de la cuenta se emparejará. Si no está seleccionado, pero no se selecciona ningún valor del segmento de la contabilidad, el valor emparejado debe ser nulo (es decir no definido).";

@XendraField(AD_Column_ID="AnyBPartner",IsCentrallyMaintained=true,
AD_Tab_ID="bc29674f-75da-59c7-97b4-f7cc128a627f",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="@$Element_BP@=Y",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e024082c-8ea4-7185-1e7e-5391bcf0ce88")
public static final String FIELDNAME_Distribution_AnyBusPartner="e024082c-8ea4-7185-1e7e-5391bcf0ce88";

@XendraTrl(Identifier="3e2316b3-2687-09ce-79de-3c7079c1ff87")
public static String es_PE_COLUMN_AnyBPartner_Name="Cualquier Soc.Neg.";

@XendraColumn(AD_Element_ID="91768cb7-9330-e6a5-284e-04cad0862fa9",ColumnName="AnyBPartner",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="Y",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3e2316b3-2687-09ce-79de-3c7079c1ff87",
Synchronized="2019-08-30 22:22:33.0")
/** Column name AnyBPartner */
public static final String COLUMNNAME_AnyBPartner = "AnyBPartner";
/** Set Any Campaign.
@param AnyCampaign Match any value of the Campaign segment */
public void setAnyCampaign (boolean AnyCampaign)
{
set_Value (COLUMNNAME_AnyCampaign, Boolean.valueOf(AnyCampaign));
}
/** Get Any Campaign.
@return Match any value of the Campaign segment */
public boolean isAnyCampaign() 
{
Object oo = get_Value(COLUMNNAME_AnyCampaign);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="02e81d13-0f4e-fae9-c4e3-0758f258295e")
public static String es_PE_FIELD_Distribution_AnyCampaign_Name="Cualquier Campaña";

@XendraTrl(Identifier="02e81d13-0f4e-fae9-c4e3-0758f258295e")
public static String es_PE_FIELD_Distribution_AnyCampaign_Description="Empareja cualquier valor del segmento de la campaña";

@XendraTrl(Identifier="02e81d13-0f4e-fae9-c4e3-0758f258295e")
public static String es_PE_FIELD_Distribution_AnyCampaign_Help="Si está seleccionado, cualquier valor del segmento de la cuenta se emparejará. Si no esta seleccionado, pero no se selecciona ningún valor del segmento de la contabilidad, el valor emparejado debe ser nulo (es decir no definido).";

@XendraField(AD_Column_ID="AnyCampaign",IsCentrallyMaintained=true,
AD_Tab_ID="bc29674f-75da-59c7-97b4-f7cc128a627f",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="@$Element_MC@=Y",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="02e81d13-0f4e-fae9-c4e3-0758f258295e")
public static final String FIELDNAME_Distribution_AnyCampaign="02e81d13-0f4e-fae9-c4e3-0758f258295e";

@XendraTrl(Identifier="33fb0585-6b81-88db-aacc-b5d040110f85")
public static String es_PE_COLUMN_AnyCampaign_Name="Cualquier Campaña";

@XendraColumn(AD_Element_ID="357f9444-afd7-2cd0-98b2-0d775cf055ab",ColumnName="AnyCampaign",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="Y",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="33fb0585-6b81-88db-aacc-b5d040110f85",
Synchronized="2019-08-30 22:22:33.0")
/** Column name AnyCampaign */
public static final String COLUMNNAME_AnyCampaign = "AnyCampaign";
/** Set Any Location From.
@param AnyLocFrom Match any value of the Location From segment */
public void setAnyLocFrom (boolean AnyLocFrom)
{
set_Value (COLUMNNAME_AnyLocFrom, Boolean.valueOf(AnyLocFrom));
}
/** Get Any Location From.
@return Match any value of the Location From segment */
public boolean isAnyLocFrom() 
{
Object oo = get_Value(COLUMNNAME_AnyLocFrom);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="01b2d05e-556e-719c-4720-9c191760c84e")
public static String es_PE_FIELD_Distribution_AnyLocationFrom_Name="Cualquier Loc desde";

@XendraTrl(Identifier="01b2d05e-556e-719c-4720-9c191760c84e")
public static String es_PE_FIELD_Distribution_AnyLocationFrom_Description="Empareja cualquier valor de la localización del segmento";

@XendraTrl(Identifier="01b2d05e-556e-719c-4720-9c191760c84e")
public static String es_PE_FIELD_Distribution_AnyLocationFrom_Help="Si está seleccionado, cualquier valor del segmento de la cuenta se emparejará. Si no esta seleccionado, pero no se selecciona ningún valor del segmento de la contabilidad, el valor emparejado debe ser nulo (es decir no definido).";

@XendraField(AD_Column_ID="AnyLocFrom",IsCentrallyMaintained=true,
AD_Tab_ID="bc29674f-75da-59c7-97b4-f7cc128a627f",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="@$Element_LF@=Y",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="01b2d05e-556e-719c-4720-9c191760c84e")
public static final String FIELDNAME_Distribution_AnyLocationFrom="01b2d05e-556e-719c-4720-9c191760c84e";

@XendraTrl(Identifier="ccb87a34-a872-2f1b-8bc6-c89a777ada16")
public static String es_PE_COLUMN_AnyLocFrom_Name="Cualquier Loc desde";

@XendraColumn(AD_Element_ID="2628b7bc-34f3-36d9-1281-1e5c1d1874ae",ColumnName="AnyLocFrom",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="Y",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ccb87a34-a872-2f1b-8bc6-c89a777ada16",
Synchronized="2019-08-30 22:22:33.0")
/** Column name AnyLocFrom */
public static final String COLUMNNAME_AnyLocFrom = "AnyLocFrom";
/** Set Any Location To.
@param AnyLocTo Match any value of the Location To segment */
public void setAnyLocTo (boolean AnyLocTo)
{
set_Value (COLUMNNAME_AnyLocTo, Boolean.valueOf(AnyLocTo));
}
/** Get Any Location To.
@return Match any value of the Location To segment */
public boolean isAnyLocTo() 
{
Object oo = get_Value(COLUMNNAME_AnyLocTo);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="f647211a-feee-6f57-82b7-f94632e187c6")
public static String es_PE_FIELD_Distribution_AnyLocationTo_Name="Cualquier Loc Para";

@XendraTrl(Identifier="f647211a-feee-6f57-82b7-f94632e187c6")
public static String es_PE_FIELD_Distribution_AnyLocationTo_Description="Empareja cualquier valor del segmento de Loc. para.";

@XendraTrl(Identifier="f647211a-feee-6f57-82b7-f94632e187c6")
public static String es_PE_FIELD_Distribution_AnyLocationTo_Help="Si está seleccionado, cualquier valor del segmento de la cuenta se emparejará. Si no esta seleccionado, pero no se selecciona ningún valor del segmento de la contabilidad, el valor emparejado debe ser nulo (es decir no definido).";

@XendraField(AD_Column_ID="AnyLocTo",IsCentrallyMaintained=true,
AD_Tab_ID="bc29674f-75da-59c7-97b4-f7cc128a627f",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="@$Element_LT@=Y",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f647211a-feee-6f57-82b7-f94632e187c6")
public static final String FIELDNAME_Distribution_AnyLocationTo="f647211a-feee-6f57-82b7-f94632e187c6";

@XendraTrl(Identifier="641143c0-bc4d-2374-00ec-4380a4826030")
public static String es_PE_COLUMN_AnyLocTo_Name="Cualquier Loc Para";

@XendraColumn(AD_Element_ID="792800fc-1751-83ad-ff3a-a82612b50520",ColumnName="AnyLocTo",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="Y",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="641143c0-bc4d-2374-00ec-4380a4826030",
Synchronized="2019-08-30 22:22:33.0")
/** Column name AnyLocTo */
public static final String COLUMNNAME_AnyLocTo = "AnyLocTo";
/** Set Any Organization.
@param AnyOrg Match any value of the Organization segment */
public void setAnyOrg (boolean AnyOrg)
{
set_Value (COLUMNNAME_AnyOrg, Boolean.valueOf(AnyOrg));
}
/** Get Any Organization.
@return Match any value of the Organization segment */
public boolean isAnyOrg() 
{
Object oo = get_Value(COLUMNNAME_AnyOrg);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="d1554bd1-7554-7ec5-15eb-66875e7cc3f6")
public static String es_PE_FIELD_Distribution_AnyOrganization_Name="Cualquier Organización";

@XendraTrl(Identifier="d1554bd1-7554-7ec5-15eb-66875e7cc3f6")
public static String es_PE_FIELD_Distribution_AnyOrganization_Description="Empareja cualquier valor del segmento de la organización";

@XendraTrl(Identifier="d1554bd1-7554-7ec5-15eb-66875e7cc3f6")
public static String es_PE_FIELD_Distribution_AnyOrganization_Help="Si está seleccionado, cualquier valor del segmento de la cuenta se emparejará. Si no está seleccionado, pero no se selecciona ningún valor del segmento de la contabilidad, el valor emparejado debe ser nulo (es decir no definido).";

@XendraField(AD_Column_ID="AnyOrg",IsCentrallyMaintained=true,
AD_Tab_ID="bc29674f-75da-59c7-97b4-f7cc128a627f",AD_FieldGroup_ID="Selection",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d1554bd1-7554-7ec5-15eb-66875e7cc3f6")
public static final String FIELDNAME_Distribution_AnyOrganization="d1554bd1-7554-7ec5-15eb-66875e7cc3f6";

@XendraTrl(Identifier="abd59b09-b690-bac6-d3f5-a9d0ee012743")
public static String es_PE_COLUMN_AnyOrg_Name="Cualquier Organización";

@XendraColumn(AD_Element_ID="0ab68a31-fe73-31db-7468-e2bb958660e8",ColumnName="AnyOrg",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="Y",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="abd59b09-b690-bac6-d3f5-a9d0ee012743",
Synchronized="2019-08-30 22:22:33.0")
/** Column name AnyOrg */
public static final String COLUMNNAME_AnyOrg = "AnyOrg";
/** Set Any Trx Organization.
@param AnyOrgTrx Match any value of the Transaction Organization segment */
public void setAnyOrgTrx (boolean AnyOrgTrx)
{
set_Value (COLUMNNAME_AnyOrgTrx, Boolean.valueOf(AnyOrgTrx));
}
/** Get Any Trx Organization.
@return Match any value of the Transaction Organization segment */
public boolean isAnyOrgTrx() 
{
Object oo = get_Value(COLUMNNAME_AnyOrgTrx);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="4ea54e0e-a0e5-cb79-0185-4ad78032803c")
public static String es_PE_FIELD_Distribution_AnyTrxOrganization_Name="Cualquier Tran de Organización";

@XendraTrl(Identifier="4ea54e0e-a0e5-cb79-0185-4ad78032803c")
public static String es_PE_FIELD_Distribution_AnyTrxOrganization_Description="Empareja cualquier valor del segmento de transacción de organización";

@XendraTrl(Identifier="4ea54e0e-a0e5-cb79-0185-4ad78032803c")
public static String es_PE_FIELD_Distribution_AnyTrxOrganization_Help="Si está seleccionado, cualquier valor del segmento de la cuenta se emparejará. Si no está seleccionado, pero no se selecciona ningún valor del segmento de la contabilidad, el valor emparejado debe ser nulo (es decir no definido).";

@XendraField(AD_Column_ID="AnyOrgTrx",IsCentrallyMaintained=true,
AD_Tab_ID="bc29674f-75da-59c7-97b4-f7cc128a627f",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="@$Element_OT@=Y",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="4ea54e0e-a0e5-cb79-0185-4ad78032803c")
public static final String FIELDNAME_Distribution_AnyTrxOrganization="4ea54e0e-a0e5-cb79-0185-4ad78032803c";

@XendraTrl(Identifier="e969be52-c88e-48bd-fa3b-1553a5bc7533")
public static String es_PE_COLUMN_AnyOrgTrx_Name="Cualquier Tran de Organización";

@XendraColumn(AD_Element_ID="a6942637-0363-d3b9-a009-6121b019dbc7",ColumnName="AnyOrgTrx",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="Y",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e969be52-c88e-48bd-fa3b-1553a5bc7533",
Synchronized="2019-08-30 22:22:33.0")
/** Column name AnyOrgTrx */
public static final String COLUMNNAME_AnyOrgTrx = "AnyOrgTrx";
/** Set Any Product.
@param AnyProduct Match any value of the Product segment */
public void setAnyProduct (boolean AnyProduct)
{
set_Value (COLUMNNAME_AnyProduct, Boolean.valueOf(AnyProduct));
}
/** Get Any Product.
@return Match any value of the Product segment */
public boolean isAnyProduct() 
{
Object oo = get_Value(COLUMNNAME_AnyProduct);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="6d52c031-12bf-e84c-7cb7-a8a4beff8d47")
public static String es_PE_FIELD_Distribution_AnyProduct_Name="Cualquier Producto";

@XendraTrl(Identifier="6d52c031-12bf-e84c-7cb7-a8a4beff8d47")
public static String es_PE_FIELD_Distribution_AnyProduct_Description="Empareja cualquier valor del segmento del producto";

@XendraTrl(Identifier="6d52c031-12bf-e84c-7cb7-a8a4beff8d47")
public static String es_PE_FIELD_Distribution_AnyProduct_Help="Si está seleccionado, cualquier valor del segmento de la cuenta se emparejará. Si no está seleccionado, pero no se selecciona ningún valor del segmento de la contabilidad, el valor emparejado debe ser nulo (es decir no definido).";

@XendraField(AD_Column_ID="AnyProduct",IsCentrallyMaintained=true,
AD_Tab_ID="bc29674f-75da-59c7-97b4-f7cc128a627f",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="@$Element_PR@=Y",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6d52c031-12bf-e84c-7cb7-a8a4beff8d47")
public static final String FIELDNAME_Distribution_AnyProduct="6d52c031-12bf-e84c-7cb7-a8a4beff8d47";

@XendraTrl(Identifier="863a9f07-284f-b49b-c11a-bd8f61ded6f9")
public static String es_PE_COLUMN_AnyProduct_Name="Cualquier Producto";

@XendraColumn(AD_Element_ID="09e75d82-dd33-a93d-fc7d-d9e6f4cd8c66",ColumnName="AnyProduct",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="Y",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="863a9f07-284f-b49b-c11a-bd8f61ded6f9",
Synchronized="2019-08-30 22:22:33.0")
/** Column name AnyProduct */
public static final String COLUMNNAME_AnyProduct = "AnyProduct";
/** Set Any Project.
@param AnyProject Match any value of the Project segment */
public void setAnyProject (boolean AnyProject)
{
set_Value (COLUMNNAME_AnyProject, Boolean.valueOf(AnyProject));
}
/** Get Any Project.
@return Match any value of the Project segment */
public boolean isAnyProject() 
{
Object oo = get_Value(COLUMNNAME_AnyProject);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="2d09cb2f-9013-c9b7-5840-abbc968ce0f4")
public static String es_PE_FIELD_Distribution_AnyProject_Name="Cualquier Proyecto";

@XendraTrl(Identifier="2d09cb2f-9013-c9b7-5840-abbc968ce0f4")
public static String es_PE_FIELD_Distribution_AnyProject_Description="Empareja cualquier valor del segmento del proyecto";

@XendraTrl(Identifier="2d09cb2f-9013-c9b7-5840-abbc968ce0f4")
public static String es_PE_FIELD_Distribution_AnyProject_Help="Si está seleccionado, cualquier valor del segmento de la cuenta se emparejará. Si no está seleccionado, pero no se selecciona ningún valor del segmento de la contabilidad, el valor emparejado debe ser nulo (es decir no definido).";

@XendraField(AD_Column_ID="AnyProject",IsCentrallyMaintained=true,
AD_Tab_ID="bc29674f-75da-59c7-97b4-f7cc128a627f",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="@$Element_PJ@=Y",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2d09cb2f-9013-c9b7-5840-abbc968ce0f4")
public static final String FIELDNAME_Distribution_AnyProject="2d09cb2f-9013-c9b7-5840-abbc968ce0f4";

@XendraTrl(Identifier="6e2dbd07-cdf3-8efa-e477-43c8203a49a3")
public static String es_PE_COLUMN_AnyProject_Name="Cualquier Proyecto";

@XendraColumn(AD_Element_ID="b1e87fed-b614-8389-7c16-a14860ef31b7",ColumnName="AnyProject",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="Y",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6e2dbd07-cdf3-8efa-e477-43c8203a49a3",
Synchronized="2019-08-30 22:22:33.0")
/** Column name AnyProject */
public static final String COLUMNNAME_AnyProject = "AnyProject";
/** Set Any Sales Region.
@param AnySalesRegion Match any value of the Sales Region segment */
public void setAnySalesRegion (boolean AnySalesRegion)
{
set_Value (COLUMNNAME_AnySalesRegion, Boolean.valueOf(AnySalesRegion));
}
/** Get Any Sales Region.
@return Match any value of the Sales Region segment */
public boolean isAnySalesRegion() 
{
Object oo = get_Value(COLUMNNAME_AnySalesRegion);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="67d87c3c-0523-1765-db16-09eee801b3d0")
public static String es_PE_FIELD_Distribution_AnySalesRegion_Name="Cualquier Región de Ventas";

@XendraTrl(Identifier="67d87c3c-0523-1765-db16-09eee801b3d0")
public static String es_PE_FIELD_Distribution_AnySalesRegion_Description="Empareja cualquier valor del segmento de región de ventas";

@XendraTrl(Identifier="67d87c3c-0523-1765-db16-09eee801b3d0")
public static String es_PE_FIELD_Distribution_AnySalesRegion_Help="Si está seleccionado, cualquier valor del segmento de la cuenta se emparejará. Si no está seleccionado, pero no se selecciona ningún valor del segmento de la contabilidad, el valor emparejado debe ser nulo (es decir no definido).";

@XendraField(AD_Column_ID="AnySalesRegion",IsCentrallyMaintained=true,
AD_Tab_ID="bc29674f-75da-59c7-97b4-f7cc128a627f",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="@$Element_SR@=Y",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="67d87c3c-0523-1765-db16-09eee801b3d0")
public static final String FIELDNAME_Distribution_AnySalesRegion="67d87c3c-0523-1765-db16-09eee801b3d0";

@XendraTrl(Identifier="9c8a7343-ce20-3769-aa75-deff5bc7cd7c")
public static String es_PE_COLUMN_AnySalesRegion_Name="Cualquier Región de Ventas";

@XendraColumn(AD_Element_ID="d5d14b3c-99e2-c3f1-ade5-8808a1bdde32",ColumnName="AnySalesRegion",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="Y",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9c8a7343-ce20-3769-aa75-deff5bc7cd7c",
Synchronized="2019-08-30 22:22:33.0")
/** Column name AnySalesRegion */
public static final String COLUMNNAME_AnySalesRegion = "AnySalesRegion";
/** Set Any User 1.
@param AnyUser1 Match any value of the User 1 segment */
public void setAnyUser1 (boolean AnyUser1)
{
set_Value (COLUMNNAME_AnyUser1, Boolean.valueOf(AnyUser1));
}
/** Get Any User 1.
@return Match any value of the User 1 segment */
public boolean isAnyUser1() 
{
Object oo = get_Value(COLUMNNAME_AnyUser1);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="3fe44b0f-586b-b63b-9eeb-9d63f01d563c")
public static String es_PE_FIELD_Distribution_AnyUser_Name="Cualquier Usuario 1";

@XendraTrl(Identifier="3fe44b0f-586b-b63b-9eeb-9d63f01d563c")
public static String es_PE_FIELD_Distribution_AnyUser_Description="Empareja cualquier valor del segmento del usuario 1";

@XendraTrl(Identifier="3fe44b0f-586b-b63b-9eeb-9d63f01d563c")
public static String es_PE_FIELD_Distribution_AnyUser_Help="Si está seleccionado, cualquier valor del segmento de la cuenta se emparejará. Si no está seleccionado, pero no se selecciona ningún valor del segmento de la contabilidad, el valor emparejado debe ser nulo (es decir no definido).";

@XendraField(AD_Column_ID="AnyUser1",IsCentrallyMaintained=true,
AD_Tab_ID="bc29674f-75da-59c7-97b4-f7cc128a627f",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="@$Element_U1@=Y",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3fe44b0f-586b-b63b-9eeb-9d63f01d563c")
public static final String FIELDNAME_Distribution_AnyUser="3fe44b0f-586b-b63b-9eeb-9d63f01d563c";

@XendraTrl(Identifier="32e14e8e-a3c1-511d-76e3-df9c316c13fe")
public static String es_PE_COLUMN_AnyUser1_Name="Cualquier Usuario 1";

@XendraColumn(AD_Element_ID="5b840ac1-9c10-4f14-86bd-4d1792ffd38c",ColumnName="AnyUser1",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="Y",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="32e14e8e-a3c1-511d-76e3-df9c316c13fe",
Synchronized="2019-08-30 22:22:33.0")
/** Column name AnyUser1 */
public static final String COLUMNNAME_AnyUser1 = "AnyUser1";
/** Set Any User 2.
@param AnyUser2 Match any value of the User 2 segment */
public void setAnyUser2 (boolean AnyUser2)
{
set_Value (COLUMNNAME_AnyUser2, Boolean.valueOf(AnyUser2));
}
/** Get Any User 2.
@return Match any value of the User 2 segment */
public boolean isAnyUser2() 
{
Object oo = get_Value(COLUMNNAME_AnyUser2);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="d480051b-0578-e89c-ddf0-1c0348f609a6")
public static String es_PE_FIELD_Distribution_AnyUser22_Name="Cualquier Usuario 2";

@XendraTrl(Identifier="d480051b-0578-e89c-ddf0-1c0348f609a6")
public static String es_PE_FIELD_Distribution_AnyUser22_Description="Empareja cualquier valor del segmento del usuario 2";

@XendraTrl(Identifier="d480051b-0578-e89c-ddf0-1c0348f609a6")
public static String es_PE_FIELD_Distribution_AnyUser22_Help="Si está seleccionado, cualquier valor del segmento de la cuenta se emparejará. Si no está seleccionado, pero no se selecciona ningún valor del segmento de la contabilidad, el valor emparejado debe ser nulo (es decir no definido)";

@XendraField(AD_Column_ID="AnyUser2",IsCentrallyMaintained=true,
AD_Tab_ID="bc29674f-75da-59c7-97b4-f7cc128a627f",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="@$Element_U2@=Y",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d480051b-0578-e89c-ddf0-1c0348f609a6")
public static final String FIELDNAME_Distribution_AnyUser22="d480051b-0578-e89c-ddf0-1c0348f609a6";

@XendraTrl(Identifier="9668d7d4-0581-dbe1-e225-222636450cc3")
public static String es_PE_COLUMN_AnyUser2_Name="Cualquier Usuario 2";

@XendraColumn(AD_Element_ID="dd9e4d86-4c8e-dcae-4aaf-c10557fe1012",ColumnName="AnyUser2",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="Y",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9668d7d4-0581-dbe1-e225-222636450cc3",
Synchronized="2019-08-30 22:22:33.0")
/** Column name AnyUser2 */
public static final String COLUMNNAME_AnyUser2 = "AnyUser2";
/** Set Accounting Schema.
@param C_AcctSchema_ID Rules for accounting */
public void setC_AcctSchema_ID (int C_AcctSchema_ID)
{
if (C_AcctSchema_ID < 1) throw new IllegalArgumentException ("C_AcctSchema_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_AcctSchema_ID, Integer.valueOf(C_AcctSchema_ID));
}
/** Get Accounting Schema.
@return Rules for accounting */
public int getC_AcctSchema_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_AcctSchema_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="60029cfa-fcfd-811b-c132-8e5cab4cabd4")
public static String es_PE_FIELD_Distribution_AccountingSchema_Name="Esquema Contable";

@XendraTrl(Identifier="60029cfa-fcfd-811b-c132-8e5cab4cabd4")
public static String es_PE_FIELD_Distribution_AccountingSchema_Description="Reglas para contabilizar";

@XendraTrl(Identifier="60029cfa-fcfd-811b-c132-8e5cab4cabd4")
public static String es_PE_FIELD_Distribution_AccountingSchema_Help="Un esquema contable define las reglas contables usadas tales como método de costeo; moneda y calendario";

@XendraField(AD_Column_ID="C_AcctSchema_ID",IsCentrallyMaintained=true,
AD_Tab_ID="bc29674f-75da-59c7-97b4-f7cc128a627f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="60029cfa-fcfd-811b-c132-8e5cab4cabd4")
public static final String FIELDNAME_Distribution_AccountingSchema="60029cfa-fcfd-811b-c132-8e5cab4cabd4";

@XendraTrl(Identifier="5b47a860-ca62-e234-2623-ad196879c753")
public static String es_PE_COLUMN_C_AcctSchema_ID_Name="Esquema Contable";

@XendraColumn(AD_Element_ID="561c9a32-9b35-9c1a-fabc-8abf7f2bb4ae",ColumnName="C_AcctSchema_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5b47a860-ca62-e234-2623-ad196879c753",
Synchronized="2019-08-30 22:22:33.0")
/** Column name C_AcctSchema_ID */
public static final String COLUMNNAME_C_AcctSchema_ID = "C_AcctSchema_ID";
/** Set Activity.
@param C_Activity_ID Business Activity */
public void setC_Activity_ID (int C_Activity_ID)
{
if (C_Activity_ID <= 0) set_Value (COLUMNNAME_C_Activity_ID, null);
 else 
set_Value (COLUMNNAME_C_Activity_ID, Integer.valueOf(C_Activity_ID));
}
/** Get Activity.
@return Business Activity */
public int getC_Activity_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Activity_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="586ffd2f-770a-c6fb-5d0f-867f13842d32")
public static String es_PE_FIELD_Distribution_Activity_Name="Tipo de Gasto";

@XendraTrl(Identifier="586ffd2f-770a-c6fb-5d0f-867f13842d32")
public static String es_PE_FIELD_Distribution_Activity_Description="Actividad de Negocio";

@XendraTrl(Identifier="586ffd2f-770a-c6fb-5d0f-867f13842d32")
public static String es_PE_FIELD_Distribution_Activity_Help="Las actividades indican tareas que son ejecutadas en el curso de un negocio; las actividades son usadas para el costeo por actividad (ABC)";

@XendraField(AD_Column_ID="C_Activity_ID",IsCentrallyMaintained=true,
AD_Tab_ID="bc29674f-75da-59c7-97b4-f7cc128a627f",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="@$Element_AY@=Y & @AnyActivity@=N",DisplayLength=14,IsReadOnly=false,SeqNo=0,
SortNo=0,IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="586ffd2f-770a-c6fb-5d0f-867f13842d32")
public static final String FIELDNAME_Distribution_Activity="586ffd2f-770a-c6fb-5d0f-867f13842d32";

@XendraTrl(Identifier="21e1a7f9-bc10-6eff-e19c-b58bab80bc9d")
public static String es_PE_COLUMN_C_Activity_ID_Name="Tipo de Gasto";

@XendraColumn(AD_Element_ID="bfeadbb3-d866-26e3-8eee-3e2fdf0ff753",ColumnName="C_Activity_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="21e1a7f9-bc10-6eff-e19c-b58bab80bc9d",
Synchronized="2019-08-30 22:22:33.0")
/** Column name C_Activity_ID */
public static final String COLUMNNAME_C_Activity_ID = "C_Activity_ID";
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

@XendraTrl(Identifier="1713d97d-0f9b-40d3-f6cd-53f13cddd2bc")
public static String es_PE_FIELD_Distribution_BusinessPartner_Name="Socio de Negocio";

@XendraTrl(Identifier="1713d97d-0f9b-40d3-f6cd-53f13cddd2bc")
public static String es_PE_FIELD_Distribution_BusinessPartner_Description="Identifica un Socio de Negocio";

@XendraTrl(Identifier="1713d97d-0f9b-40d3-f6cd-53f13cddd2bc")
public static String es_PE_FIELD_Distribution_BusinessPartner_Help="Un socio de negocio es cualquiera con quien usted realiza transacciones. Este puede incluir Proveedores; Clientes; Empleados ó Vendedores.";

@XendraField(AD_Column_ID="C_BPartner_ID",IsCentrallyMaintained=true,
AD_Tab_ID="bc29674f-75da-59c7-97b4-f7cc128a627f",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="@$Element_BP@=Y & @AnyBPartner@=N",DisplayLength=26,IsReadOnly=false,SeqNo=0,
SortNo=0,IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="1713d97d-0f9b-40d3-f6cd-53f13cddd2bc")
public static final String FIELDNAME_Distribution_BusinessPartner="1713d97d-0f9b-40d3-f6cd-53f13cddd2bc";

@XendraTrl(Identifier="cedc40a6-298c-4722-ac9f-7a712d1a611f")
public static String es_PE_COLUMN_C_BPartner_ID_Name="Socio de Negocio";

@XendraColumn(AD_Element_ID="fe333dc3-4f40-1276-5f6a-d09bb66dc423",ColumnName="C_BPartner_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="06fdbbe9-e1c4-3ee4-4a9d-73d1a990cc42",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="cedc40a6-298c-4722-ac9f-7a712d1a611f",Synchronized="2019-08-30 22:22:33.0")
/** Column name C_BPartner_ID */
public static final String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";
/** Set Campaign.
@param C_Campaign_ID Marketing Campaign */
public void setC_Campaign_ID (int C_Campaign_ID)
{
if (C_Campaign_ID <= 0) set_Value (COLUMNNAME_C_Campaign_ID, null);
 else 
set_Value (COLUMNNAME_C_Campaign_ID, Integer.valueOf(C_Campaign_ID));
}
/** Get Campaign.
@return Marketing Campaign */
public int getC_Campaign_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Campaign_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="603e98c4-029a-ad98-68d8-64c3fe40918f")
public static String es_PE_FIELD_Distribution_Campaign_Name="Campaña";

@XendraTrl(Identifier="603e98c4-029a-ad98-68d8-64c3fe40918f")
public static String es_PE_FIELD_Distribution_Campaign_Description="Campaña de Mercadeo";

@XendraTrl(Identifier="603e98c4-029a-ad98-68d8-64c3fe40918f")
public static String es_PE_FIELD_Distribution_Campaign_Help="La Campaña define un programa de mercadotecnia único. Los proyectos pueden estar asociados con una campaña de mercadotecnia única. Usted puede entonces reportar basado en una campaña específica";

@XendraField(AD_Column_ID="C_Campaign_ID",IsCentrallyMaintained=true,
AD_Tab_ID="bc29674f-75da-59c7-97b4-f7cc128a627f",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="@$Element_MC@=Y& @AnyCampaign@=N",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="603e98c4-029a-ad98-68d8-64c3fe40918f")
public static final String FIELDNAME_Distribution_Campaign="603e98c4-029a-ad98-68d8-64c3fe40918f";

@XendraTrl(Identifier="a2c0b9dc-e339-5113-9ac8-25f6aaa113da")
public static String es_PE_COLUMN_C_Campaign_ID_Name="Campaña";

@XendraColumn(AD_Element_ID="6cf08e31-d355-ee38-9c0b-bee20b3ea5b6",ColumnName="C_Campaign_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a2c0b9dc-e339-5113-9ac8-25f6aaa113da",
Synchronized="2019-08-30 22:22:33.0")
/** Column name C_Campaign_ID */
public static final String COLUMNNAME_C_Campaign_ID = "C_Campaign_ID";
/** Set Document Type.
@param C_DocType_ID Document type or rules */
public void setC_DocType_ID (int C_DocType_ID)
{
if (C_DocType_ID <= 0) set_Value (COLUMNNAME_C_DocType_ID, null);
 else 
set_Value (COLUMNNAME_C_DocType_ID, Integer.valueOf(C_DocType_ID));
}
/** Get Document Type.
@return Document type or rules */
public int getC_DocType_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_DocType_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="156b3043-3fa8-4c82-5b36-12d5506cf268")
public static String es_PE_FIELD_Distribution_DocumentType_Name="Tipo de Documento";

@XendraTrl(Identifier="156b3043-3fa8-4c82-5b36-12d5506cf268")
public static String es_PE_FIELD_Distribution_DocumentType_Description="Tipo de documento ó reglas";

@XendraTrl(Identifier="156b3043-3fa8-4c82-5b36-12d5506cf268")
public static String es_PE_FIELD_Distribution_DocumentType_Help="El tipo de documento determina la secuencia del documento y las reglas de proceso";

@XendraField(AD_Column_ID="C_DocType_ID",IsCentrallyMaintained=true,
AD_Tab_ID="bc29674f-75da-59c7-97b4-f7cc128a627f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="156b3043-3fa8-4c82-5b36-12d5506cf268")
public static final String FIELDNAME_Distribution_DocumentType="156b3043-3fa8-4c82-5b36-12d5506cf268";

@XendraTrl(Identifier="a35ec5a9-57a1-9068-7878-567bcd4ac56e")
public static String es_PE_COLUMN_C_DocType_ID_Name="Tipo de Documento";

@XendraColumn(AD_Element_ID="099a4147-1a72-cdd0-81e0-8bdbc8c0b883",ColumnName="C_DocType_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a35ec5a9-57a1-9068-7878-567bcd4ac56e",
Synchronized="2019-08-30 22:22:33.0")
/** Column name C_DocType_ID */
public static final String COLUMNNAME_C_DocType_ID = "C_DocType_ID";
/** Set Location From.
@param C_LocFrom_ID Location that inventory was moved from */
public void setC_LocFrom_ID (int C_LocFrom_ID)
{
if (C_LocFrom_ID <= 0) set_Value (COLUMNNAME_C_LocFrom_ID, null);
 else 
set_Value (COLUMNNAME_C_LocFrom_ID, Integer.valueOf(C_LocFrom_ID));
}
/** Get Location From.
@return Location that inventory was moved from */
public int getC_LocFrom_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_LocFrom_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="b62df533-6009-2eb2-0233-272755edeaa2")
public static String es_PE_FIELD_Distribution_LocationFrom_Name="Desde Localización";

@XendraTrl(Identifier="b62df533-6009-2eb2-0233-272755edeaa2")
public static String es_PE_FIELD_Distribution_LocationFrom_Description="Ubicación desde la que el inventario fue movido";

@XendraTrl(Identifier="b62df533-6009-2eb2-0233-272755edeaa2")
public static String es_PE_FIELD_Distribution_LocationFrom_Help="La ubicación desde indica la ubicación desde la que un producto fue movido";

@XendraField(AD_Column_ID="C_LocFrom_ID",IsCentrallyMaintained=true,
AD_Tab_ID="bc29674f-75da-59c7-97b4-f7cc128a627f",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="@$Element_LF@=Y & @AnyLocFrom@=N",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="b62df533-6009-2eb2-0233-272755edeaa2")
public static final String FIELDNAME_Distribution_LocationFrom="b62df533-6009-2eb2-0233-272755edeaa2";

@XendraTrl(Identifier="6694db3f-f976-47be-083d-b49e97d4ef46")
public static String es_PE_COLUMN_C_LocFrom_ID_Name="Desde Localización";

@XendraColumn(AD_Element_ID="5c54374e-b27b-3cd4-f5a8-8705436152bc",ColumnName="C_LocFrom_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="69189951-7109-d2c7-f034-b4660d43b572",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="6694db3f-f976-47be-083d-b49e97d4ef46",Synchronized="2019-08-30 22:22:33.0")
/** Column name C_LocFrom_ID */
public static final String COLUMNNAME_C_LocFrom_ID = "C_LocFrom_ID";
/** Set Location To.
@param C_LocTo_ID Location that inventory was moved to */
public void setC_LocTo_ID (int C_LocTo_ID)
{
if (C_LocTo_ID <= 0) set_Value (COLUMNNAME_C_LocTo_ID, null);
 else 
set_Value (COLUMNNAME_C_LocTo_ID, Integer.valueOf(C_LocTo_ID));
}
/** Get Location To.
@return Location that inventory was moved to */
public int getC_LocTo_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_LocTo_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="c91b4b35-f29f-4952-85f7-89b74935742a")
public static String es_PE_FIELD_Distribution_LocationTo_Name="A Localización";

@XendraTrl(Identifier="c91b4b35-f29f-4952-85f7-89b74935742a")
public static String es_PE_FIELD_Distribution_LocationTo_Description="Ubicación a la que el inventario fue movido.";

@XendraTrl(Identifier="c91b4b35-f29f-4952-85f7-89b74935742a")
public static String es_PE_FIELD_Distribution_LocationTo_Help="La Ubicación A indica la ubicación a la que un producto fue movido.";

@XendraField(AD_Column_ID="C_LocTo_ID",IsCentrallyMaintained=true,
AD_Tab_ID="bc29674f-75da-59c7-97b4-f7cc128a627f",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="@$Element_LT@=Y & @AnyLocTo@=N",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="c91b4b35-f29f-4952-85f7-89b74935742a")
public static final String FIELDNAME_Distribution_LocationTo="c91b4b35-f29f-4952-85f7-89b74935742a";

@XendraTrl(Identifier="1ff5debd-8dd3-69f3-07cd-2fa834c25637")
public static String es_PE_COLUMN_C_LocTo_ID_Name="A Localización";

@XendraColumn(AD_Element_ID="531e981d-5722-db37-a6eb-54ec21b60a90",ColumnName="C_LocTo_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="69189951-7109-d2c7-f034-b4660d43b572",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="1ff5debd-8dd3-69f3-07cd-2fa834c25637",Synchronized="2019-08-30 22:22:33.0")
/** Column name C_LocTo_ID */
public static final String COLUMNNAME_C_LocTo_ID = "C_LocTo_ID";
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

@XendraTrl(Identifier="f3d0dc58-fb67-f379-d6bf-a67366a8c37d")
public static String es_PE_FIELD_Distribution_Project_Name="Proyecto";

@XendraTrl(Identifier="f3d0dc58-fb67-f379-d6bf-a67366a8c37d")
public static String es_PE_FIELD_Distribution_Project_Description="Identifica un proyecto único";

@XendraTrl(Identifier="f3d0dc58-fb67-f379-d6bf-a67366a8c37d")
public static String es_PE_FIELD_Distribution_Project_Help="La ID de un proyecto es un identificador definido por el usuario para un proyecto";

@XendraField(AD_Column_ID="C_Project_ID",IsCentrallyMaintained=true,
AD_Tab_ID="bc29674f-75da-59c7-97b4-f7cc128a627f",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="@$Element_PJ@=Y & @AnyProject@=N",DisplayLength=26,IsReadOnly=false,SeqNo=0,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="f3d0dc58-fb67-f379-d6bf-a67366a8c37d")
public static final String FIELDNAME_Distribution_Project="f3d0dc58-fb67-f379-d6bf-a67366a8c37d";

@XendraTrl(Identifier="d9362749-7871-12a0-196e-aca7ec442a3e")
public static String es_PE_COLUMN_C_Project_ID_Name="Proyecto";

@XendraColumn(AD_Element_ID="16ff5dcc-9178-73dd-e618-e88bd79d573b",ColumnName="C_Project_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d9362749-7871-12a0-196e-aca7ec442a3e",
Synchronized="2019-08-30 22:22:33.0")
/** Column name C_Project_ID */
public static final String COLUMNNAME_C_Project_ID = "C_Project_ID";
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

@XendraTrl(Identifier="b1d1ec60-f7f2-a403-889a-dd70d9e4a62c")
public static String es_PE_FIELD_Distribution_SalesRegion_Name="Región de Ventas";

@XendraTrl(Identifier="b1d1ec60-f7f2-a403-889a-dd70d9e4a62c")
public static String es_PE_FIELD_Distribution_SalesRegion_Description="Región de cobertura de ventas.";

@XendraTrl(Identifier="b1d1ec60-f7f2-a403-889a-dd70d9e4a62c")
public static String es_PE_FIELD_Distribution_SalesRegion_Help="La región de ventas indica una área de cobertura de ventas específica.";

@XendraField(AD_Column_ID="C_SalesRegion_ID",IsCentrallyMaintained=true,
AD_Tab_ID="bc29674f-75da-59c7-97b4-f7cc128a627f",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="@$Element_SR@=Y & @AnySalesRegion@=N",DisplayLength=14,IsReadOnly=false,SeqNo=0,
SortNo=0,IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="b1d1ec60-f7f2-a403-889a-dd70d9e4a62c")
public static final String FIELDNAME_Distribution_SalesRegion="b1d1ec60-f7f2-a403-889a-dd70d9e4a62c";

@XendraTrl(Identifier="d3297a91-b9d4-5143-3bb6-9d9b28dba4e8")
public static String es_PE_COLUMN_C_SalesRegion_ID_Name="Región de Ventas";

@XendraColumn(AD_Element_ID="26b40f06-df79-27f7-adb4-8ae6c5a1c9b8",ColumnName="C_SalesRegion_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d3297a91-b9d4-5143-3bb6-9d9b28dba4e8",
Synchronized="2019-08-30 22:22:33.0")
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

@XendraTrl(Identifier="9d843d4e-e453-efab-a4b0-cbef47ca2992")
public static String es_PE_FIELD_Distribution_Description_Name="Observación";

@XendraTrl(Identifier="9d843d4e-e453-efab-a4b0-cbef47ca2992")
public static String es_PE_FIELD_Distribution_Description_Description="Observación corta opcional del registro";

@XendraTrl(Identifier="9d843d4e-e453-efab-a4b0-cbef47ca2992")
public static String es_PE_FIELD_Distribution_Description_Help="Una Observación esta limitada a 255 caracteres";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="bc29674f-75da-59c7-97b4-f7cc128a627f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9d843d4e-e453-efab-a4b0-cbef47ca2992")
public static final String FIELDNAME_Distribution_Description="9d843d4e-e453-efab-a4b0-cbef47ca2992";

@XendraTrl(Identifier="054b77c4-79b8-0326-4fe9-d0d5857b73e3")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="054b77c4-79b8-0326-4fe9-d0d5857b73e3",
Synchronized="2019-08-30 22:22:33.0")
/** Column name Description */
public static final String COLUMNNAME_Description = "Description";
/** Set GL Distribution.
@param GL_Distribution_ID General Ledger Distribution */
public void setGL_Distribution_ID (int GL_Distribution_ID)
{
if (GL_Distribution_ID < 1) throw new IllegalArgumentException ("GL_Distribution_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_GL_Distribution_ID, Integer.valueOf(GL_Distribution_ID));
}
/** Get GL Distribution.
@return General Ledger Distribution */
public int getGL_Distribution_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_GL_Distribution_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="79ed3d17-449a-1786-3a5c-7d44422771a5")
public static String es_PE_FIELD_Distribution_GLDistribution_Name="Distribución CG";

@XendraTrl(Identifier="79ed3d17-449a-1786-3a5c-7d44422771a5")
public static String es_PE_FIELD_Distribution_GLDistribution_Description="Distribución de contabilidad general";

@XendraTrl(Identifier="79ed3d17-449a-1786-3a5c-7d44422771a5")
public static String es_PE_FIELD_Distribution_GLDistribution_Help="Si los criterios de combinación de la cuenta de distribución se resuelven, la fijación a la combinación de la cuenta es substituida por las combinaciones de la cuenta de líneas de distribución. La distribución está prorrateada basada en el cociente de las líneas. La distribución debe ser válida para ser utilizada.";

@XendraField(AD_Column_ID="GL_Distribution_ID",IsCentrallyMaintained=true,
AD_Tab_ID="bc29674f-75da-59c7-97b4-f7cc128a627f",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="79ed3d17-449a-1786-3a5c-7d44422771a5")
public static final String FIELDNAME_Distribution_GLDistribution="79ed3d17-449a-1786-3a5c-7d44422771a5";
/** Column name GL_Distribution_ID */
public static final String COLUMNNAME_GL_Distribution_ID = "GL_Distribution_ID";
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

@XendraTrl(Identifier="c7ed73c2-54cd-53db-cef3-caddd88be4ce")
public static String es_PE_FIELD_Distribution_CommentHelp_Name="Ayuda";

@XendraTrl(Identifier="c7ed73c2-54cd-53db-cef3-caddd88be4ce")
public static String es_PE_FIELD_Distribution_CommentHelp_Description="Ayuda; Comentario o Sugerencia";

@XendraTrl(Identifier="c7ed73c2-54cd-53db-cef3-caddd88be4ce")
public static String es_PE_FIELD_Distribution_CommentHelp_Help="El campo ayuda contiene una sugerencia; comentario o ayuda acerca del uso de esta partida";

@XendraField(AD_Column_ID="Help",IsCentrallyMaintained=true,
AD_Tab_ID="bc29674f-75da-59c7-97b4-f7cc128a627f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c7ed73c2-54cd-53db-cef3-caddd88be4ce")
public static final String FIELDNAME_Distribution_CommentHelp="c7ed73c2-54cd-53db-cef3-caddd88be4ce";

@XendraTrl(Identifier="16fc15f6-1e84-f9d2-c7b0-c62db5a7049d")
public static String es_PE_COLUMN_Help_Name="Ayuda";

@XendraColumn(AD_Element_ID="a6fda582-56f9-6bb7-8436-285ce4f8de3f",ColumnName="Help",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="16fc15f6-1e84-f9d2-c7b0-c62db5a7049d",
Synchronized="2019-08-30 22:22:33.0")
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
@XendraTrl(Identifier="8f823055-921b-462f-bb48-6688de05116c")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="8f823055-921b-462f-bb48-6688de05116c",
Synchronized="2019-08-30 22:22:33.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Is linked account.
@param IsLink Defines if the distribution process should delete the source element or not. */
public void setIsLink (boolean IsLink)
{
set_Value (COLUMNNAME_IsLink, Boolean.valueOf(IsLink));
}
/** Get Is linked account.
@return Defines if the distribution process should delete the source element or not. */
public boolean isLink() 
{
Object oo = get_Value(COLUMNNAME_IsLink);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="f86fea3e-9df1-7f88-bf03-6dc4f3c257e5")
public static String en_GB_FIELD_Distribution_IsLinkedAccount_Name="Is linked account";

@XendraTrl(Identifier="f86fea3e-9df1-7f88-bf03-6dc4f3c257e5")
public static String es_PE_FIELD_Distribution_IsLinkedAccount_Name="Es amarre";

@XendraTrl(Identifier="f86fea3e-9df1-7f88-bf03-6dc4f3c257e5")
public static String en_GB_FIELD_Distribution_IsLinkedAccount_Description="Defines if the distribution process should delete the source element or not.";

@XendraTrl(Identifier="f86fea3e-9df1-7f88-bf03-6dc4f3c257e5")
public static String es_PE_FIELD_Distribution_IsLinkedAccount_Description="Define si el proceso de distribucion debe borrar el asiento de origen o no.";

@XendraTrl(Identifier="f86fea3e-9df1-7f88-bf03-6dc4f3c257e5")
public static String en_GB_FIELD_Distribution_IsLinkedAccount_Help="If set, this flag will cause the source accounting element not to be deleted, while the destination element will be created anyway.";

@XendraTrl(Identifier="f86fea3e-9df1-7f88-bf03-6dc4f3c257e5")
public static String es_PE_FIELD_Distribution_IsLinkedAccount_Help="Si esta seleccionada, esta opcion hara que el asiento de origen no sea borrado, mientras que el asiento de destino se creara de todas formas.";

@XendraField(AD_Column_ID="IsLink",IsCentrallyMaintained=true,
AD_Tab_ID="bc29674f-75da-59c7-97b4-f7cc128a627f",AD_FieldGroup_ID="Other options",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=130,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f86fea3e-9df1-7f88-bf03-6dc4f3c257e5")
public static final String FIELDNAME_Distribution_IsLinkedAccount="f86fea3e-9df1-7f88-bf03-6dc4f3c257e5";

@XendraTrl(Identifier="69debacb-7b0b-1151-0410-cce80df2105c")
public static String en_GB_COLUMN_IsLink_Name="Is linked account";

@XendraTrl(Identifier="69debacb-7b0b-1151-0410-cce80df2105c")
public static String es_PE_COLUMN_IsLink_Name="Es amarre";

@XendraColumn(AD_Element_ID="ea23e353-29da-f5ea-a9f1-d34e39dc6bb8",ColumnName="IsLink",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="Y",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="69debacb-7b0b-1151-0410-cce80df2105c",
Synchronized="2019-08-30 22:22:33.0")
/** Column name IsLink */
public static final String COLUMNNAME_IsLink = "IsLink";
/** Set Valid.
@param IsValid Element is valid */
public void setIsValid (boolean IsValid)
{
set_Value (COLUMNNAME_IsValid, Boolean.valueOf(IsValid));
}
/** Get Valid.
@return Element is valid */
public boolean isValid() 
{
Object oo = get_Value(COLUMNNAME_IsValid);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="ac2c04d3-c5e2-fc01-1a6d-7ebb98f68dc3")
public static String es_PE_FIELD_Distribution_Valid_Name="Valido";

@XendraTrl(Identifier="ac2c04d3-c5e2-fc01-1a6d-7ebb98f68dc3")
public static String es_PE_FIELD_Distribution_Valid_Description="El elemento es valido";

@XendraTrl(Identifier="ac2c04d3-c5e2-fc01-1a6d-7ebb98f68dc3")
public static String es_PE_FIELD_Distribution_Valid_Help="El elemento pasado es el cheque de la validación";

@XendraField(AD_Column_ID="IsValid",IsCentrallyMaintained=true,
AD_Tab_ID="bc29674f-75da-59c7-97b4-f7cc128a627f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=true,SeqNo=140,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ac2c04d3-c5e2-fc01-1a6d-7ebb98f68dc3")
public static final String FIELDNAME_Distribution_Valid="ac2c04d3-c5e2-fc01-1a6d-7ebb98f68dc3";

@XendraTrl(Identifier="cf11a25b-163c-ddd5-109d-cb6fe620ec7b")
public static String es_PE_COLUMN_IsValid_Name="Valido";

@XendraColumn(AD_Element_ID="394c3099-1638-2f07-2e14-7bd38bb8ad25",ColumnName="IsValid",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="cf11a25b-163c-ddd5-109d-cb6fe620ec7b",
Synchronized="2019-08-30 22:22:33.0")
/** Column name IsValid */
public static final String COLUMNNAME_IsValid = "IsValid";
/** Set Product.
@param M_Product_ID Product, Service, Item */
public void setM_Product_ID (int M_Product_ID)
{
if (M_Product_ID <= 0) set_Value (COLUMNNAME_M_Product_ID, null);
 else 
set_Value (COLUMNNAME_M_Product_ID, Integer.valueOf(M_Product_ID));
}
/** Get Product.
@return Product, Service, Item */
public int getM_Product_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_Product_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="513d2d32-9ff0-e8af-b320-fa813e1c16bc")
public static String es_PE_FIELD_Distribution_Product_Name="Producto";

@XendraTrl(Identifier="513d2d32-9ff0-e8af-b320-fa813e1c16bc")
public static String es_PE_FIELD_Distribution_Product_Description="Producto; servicio ó artículo.";

@XendraTrl(Identifier="513d2d32-9ff0-e8af-b320-fa813e1c16bc")
public static String es_PE_FIELD_Distribution_Product_Help="Identifica un artículo que puede ser comprado ó vendido es esta organización.";

@XendraField(AD_Column_ID="M_Product_ID",IsCentrallyMaintained=true,
AD_Tab_ID="bc29674f-75da-59c7-97b4-f7cc128a627f",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="@$Element_PR@=Y & @AnyProduct@=N",DisplayLength=26,IsReadOnly=false,SeqNo=0,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="513d2d32-9ff0-e8af-b320-fa813e1c16bc")
public static final String FIELDNAME_Distribution_Product="513d2d32-9ff0-e8af-b320-fa813e1c16bc";

@XendraTrl(Identifier="5e436b52-2464-e4d9-79cf-86a320400749")
public static String es_PE_COLUMN_M_Product_ID_Name="Producto";

@XendraColumn(AD_Element_ID="b4701f57-f2fc-567c-58e2-a6aefbc3932c",ColumnName="M_Product_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="4281f8eb-238e-6b28-eb66-8cc866e6312c",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="5e436b52-2464-e4d9-79cf-86a320400749",Synchronized="2019-08-30 22:22:33.0")
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

@XendraTrl(Identifier="20a7fae5-3755-a19b-62ee-fd2fb0688b64")
public static String es_PE_FIELD_Distribution_Name_Name="Nombre";

@XendraTrl(Identifier="20a7fae5-3755-a19b-62ee-fd2fb0688b64")
public static String es_PE_FIELD_Distribution_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="20a7fae5-3755-a19b-62ee-fd2fb0688b64")
public static String es_PE_FIELD_Distribution_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraField(AD_Column_ID="Name",IsCentrallyMaintained=true,
AD_Tab_ID="bc29674f-75da-59c7-97b4-f7cc128a627f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=30,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="20a7fae5-3755-a19b-62ee-fd2fb0688b64")
public static final String FIELDNAME_Distribution_Name="20a7fae5-3755-a19b-62ee-fd2fb0688b64";

@XendraTrl(Identifier="22bc8893-61bb-ef94-e5c5-cae3d07acd4b")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="22bc8893-61bb-ef94-e5c5-cae3d07acd4b",
Synchronized="2019-08-30 22:22:33.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
/** Set Organization.
@param Org_ID Organizational entity within client */
public void setOrg_ID (int Org_ID)
{
if (Org_ID <= 0) set_Value (COLUMNNAME_Org_ID, null);
 else 
set_Value (COLUMNNAME_Org_ID, Integer.valueOf(Org_ID));
}
/** Get Organization.
@return Organizational entity within client */
public int getOrg_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_Org_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="f2baaa3a-ddcc-ace6-5d27-bf4cde5764f7")
public static String es_PE_FIELD_Distribution_Organization_Name="Organización";

@XendraTrl(Identifier="f2baaa3a-ddcc-ace6-5d27-bf4cde5764f7")
public static String es_PE_FIELD_Distribution_Organization_Description="Entidad organizacional dentro de la empresa.";

@XendraTrl(Identifier="f2baaa3a-ddcc-ace6-5d27-bf4cde5764f7")
public static String es_PE_FIELD_Distribution_Organization_Help="Una organización es una unidad de su compañía ó entidad legal. Ej. tiendas; departamentos";

@XendraField(AD_Column_ID="Org_ID",IsCentrallyMaintained=true,
AD_Tab_ID="bc29674f-75da-59c7-97b4-f7cc128a627f",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="@AnyOrg@=N",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f2baaa3a-ddcc-ace6-5d27-bf4cde5764f7")
public static final String FIELDNAME_Distribution_Organization="f2baaa3a-ddcc-ace6-5d27-bf4cde5764f7";

@XendraTrl(Identifier="8311152e-9368-3b4b-6341-74c97f36122c")
public static String es_PE_COLUMN_Org_ID_Name="Organización";

@XendraColumn(AD_Element_ID="a4e75444-9eb1-c885-3445-9b55e2eb765a",ColumnName="Org_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="54e78591-f7f4-c613-ea27-e64b3dac5198",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="8311152e-9368-3b4b-6341-74c97f36122c",Synchronized="2019-08-30 22:22:33.0")
/** Column name Org_ID */
public static final String COLUMNNAME_Org_ID = "Org_ID";
/** Set Total Percent.
@param PercentTotal Sum of the Percent details  */
public void setPercentTotal (BigDecimal PercentTotal)
{
if (PercentTotal == null) throw new IllegalArgumentException ("PercentTotal is mandatory.");
set_Value (COLUMNNAME_PercentTotal, PercentTotal);
}
/** Get Total Percent.
@return Sum of the Percent details  */
public BigDecimal getPercentTotal() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_PercentTotal);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="48e9b571-9551-59b6-9c55-9b07afee85d0")
public static String es_PE_FIELD_Distribution_TotalPercent_Name="Porcentaje Total";

@XendraTrl(Identifier="48e9b571-9551-59b6-9c55-9b07afee85d0")
public static String es_PE_FIELD_Distribution_TotalPercent_Description="Suma de detalles de porcentajes.";

@XendraField(AD_Column_ID="PercentTotal",IsCentrallyMaintained=true,
AD_Tab_ID="bc29674f-75da-59c7-97b4-f7cc128a627f",AD_FieldGroup_ID="Status",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=120,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="48e9b571-9551-59b6-9c55-9b07afee85d0")
public static final String FIELDNAME_Distribution_TotalPercent="48e9b571-9551-59b6-9c55-9b07afee85d0";

@XendraTrl(Identifier="b55e1654-a384-5c51-cb80-b37164862300")
public static String es_PE_COLUMN_PercentTotal_Name="Porcentaje Total";

@XendraColumn(AD_Element_ID="77b1cbd9-110f-ae7b-f788-143538b13dbb",ColumnName="PercentTotal",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b55e1654-a384-5c51-cb80-b37164862300",
Synchronized="2019-08-30 22:22:33.0")
/** Column name PercentTotal */
public static final String COLUMNNAME_PercentTotal = "PercentTotal";
/** Set PostingType.
@param PostingType The type of posted amount for the transaction */
public void setPostingType (String PostingType)
{
if (PostingType != null && PostingType.length() > 1)
{
log.warning("Length > 1 - truncated");
PostingType = PostingType.substring(0,0);
}
set_Value (COLUMNNAME_PostingType, PostingType);
}
/** Get PostingType.
@return The type of posted amount for the transaction */
public String getPostingType() 
{
return (String)get_Value(COLUMNNAME_PostingType);
}

@XendraTrl(Identifier="b1a54bd5-4df9-c8be-9ebf-c8af3892146e")
public static String es_PE_FIELD_Distribution_PostingType_Name="Tipo de Aplicación";

@XendraTrl(Identifier="b1a54bd5-4df9-c8be-9ebf-c8af3892146e")
public static String es_PE_FIELD_Distribution_PostingType_Description="El tipo de total que esta póliza actualizó";

@XendraTrl(Identifier="b1a54bd5-4df9-c8be-9ebf-c8af3892146e")
public static String es_PE_FIELD_Distribution_PostingType_Help="El tipo de aplicación indica el tipo de total (actual; gravamen; presupuesto) que esta póliza actualizó";

@XendraField(AD_Column_ID="PostingType",IsCentrallyMaintained=true,
AD_Tab_ID="bc29674f-75da-59c7-97b4-f7cc128a627f",AD_FieldGroup_ID="Only ..",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b1a54bd5-4df9-c8be-9ebf-c8af3892146e")
public static final String FIELDNAME_Distribution_PostingType="b1a54bd5-4df9-c8be-9ebf-c8af3892146e";

@XendraTrl(Identifier="3f198456-3c93-173d-8f0d-9f21f2ee70ce")
public static String es_PE_COLUMN_PostingType_Name="Tipo de Aplicación";

@XendraColumn(AD_Element_ID="465cd8dd-d2b8-aa76-fc18-7f8df439b182",ColumnName="PostingType",
AD_Reference_ID=17,AD_Reference_Value_ID="1ad48d23-2ec9-09d0-cb68-38688c5e6ce0",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="3f198456-3c93-173d-8f0d-9f21f2ee70ce",Synchronized="2019-08-30 22:22:33.0")
/** Column name PostingType */
public static final String COLUMNNAME_PostingType = "PostingType";
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

@XendraTrl(Identifier="bfb1a724-d151-10f6-d045-d5050810f41a")
public static String es_PE_FIELD_Distribution_ProcessNow_Name="Verifica ";

@XendraTrl(Identifier="bfb1a724-d151-10f6-d045-d5050810f41a")
public static String es_PE_FIELD_Distribution_ProcessNow_Description="Verifica Distribución CG";

@XendraField(AD_Column_ID="Processing",IsCentrallyMaintained=true,
AD_Tab_ID="bc29674f-75da-59c7-97b4-f7cc128a627f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=150,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="bfb1a724-d151-10f6-d045-d5050810f41a")
public static final String FIELDNAME_Distribution_ProcessNow="bfb1a724-d151-10f6-d045-d5050810f41a";

@XendraTrl(Identifier="e740f8df-6d2f-f210-4d49-9089ed718172")
public static String es_PE_COLUMN_Processing_Name="Procesar Ahora";

@XendraColumn(AD_Element_ID="f2096404-1a98-35ec-09ea-273b3e19b7de",ColumnName="Processing",
AD_Reference_ID=28,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="39029466-c4cc-0dc4-e4e3-7de4f7341590",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="e740f8df-6d2f-f210-4d49-9089ed718172",Synchronized="2019-08-30 22:22:33.0")
/** Column name Processing */
public static final String COLUMNNAME_Processing = "Processing";
/** Set TypeClose.
@param TypeClose TypeClose */
public void setTypeClose (String TypeClose)
{
if (TypeClose != null && TypeClose.length() > 1)
{
log.warning("Length > 1 - truncated");
TypeClose = TypeClose.substring(0,0);
}
set_Value (COLUMNNAME_TypeClose, TypeClose);
}
/** Get TypeClose.
@return TypeClose */
public String getTypeClose() 
{
return (String)get_Value(COLUMNNAME_TypeClose);
}

@XendraTrl(Identifier="3a34ba01-9172-47a4-8f99-9f7cd3934578")
public static String es_PE_COLUMN_TypeClose_Name="TypeClose";

@XendraColumn(AD_Element_ID="7b920f53-657b-4ef1-1ffd-466b9f55f0c9",ColumnName="TypeClose",
AD_Reference_ID=17,AD_Reference_Value_ID="29486b5d-16b4-4e83-7680-302bfbaad4f9",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="A",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="3a34ba01-9172-47a4-8f99-9f7cd3934578",Synchronized="2019-08-30 22:22:33.0")
/** Column name TypeClose */
public static final String COLUMNNAME_TypeClose = "TypeClose";
/** Set User List 1.
@param User1_ID User defined list element #1 */
public void setUser1_ID (int User1_ID)
{
if (User1_ID <= 0) set_Value (COLUMNNAME_User1_ID, null);
 else 
set_Value (COLUMNNAME_User1_ID, Integer.valueOf(User1_ID));
}
/** Get User List 1.
@return User defined list element #1 */
public int getUser1_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_User1_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="33def502-353f-fcc6-da5d-adbb86411840")
public static String es_PE_FIELD_Distribution_UserList_Name="Usuario 1";

@XendraTrl(Identifier="33def502-353f-fcc6-da5d-adbb86411840")
public static String es_PE_FIELD_Distribution_UserList_Description="El usuario definió el elemento # 1";

@XendraTrl(Identifier="33def502-353f-fcc6-da5d-adbb86411840")
public static String es_PE_FIELD_Distribution_UserList_Help="El elemento definido por el usuario despliega los elementos opcionales que han sido definidos para esta combinación de cuentas";

@XendraField(AD_Column_ID="User1_ID",IsCentrallyMaintained=true,
AD_Tab_ID="bc29674f-75da-59c7-97b4-f7cc128a627f",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="@$Element_U1@=Y & @AnyUser1@=N",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="33def502-353f-fcc6-da5d-adbb86411840")
public static final String FIELDNAME_Distribution_UserList="33def502-353f-fcc6-da5d-adbb86411840";

@XendraTrl(Identifier="087bdf86-40d3-2ffd-de33-aa5e02ff6c0e")
public static String es_PE_COLUMN_User1_ID_Name="Usuario 1";

@XendraColumn(AD_Element_ID="07453e74-aadd-d9c9-e543-837a6fdb3094",ColumnName="User1_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="5a2fe161-044f-67cb-3791-6d615980cabb",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="087bdf86-40d3-2ffd-de33-aa5e02ff6c0e",Synchronized="2019-08-30 22:22:33.0")
/** Column name User1_ID */
public static final String COLUMNNAME_User1_ID = "User1_ID";
/** Set User List 2.
@param User2_ID User defined list element #2 */
public void setUser2_ID (int User2_ID)
{
if (User2_ID <= 0) set_Value (COLUMNNAME_User2_ID, null);
 else 
set_Value (COLUMNNAME_User2_ID, Integer.valueOf(User2_ID));
}
/** Get User List 2.
@return User defined list element #2 */
public int getUser2_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_User2_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="f2a2de8a-9f60-0beb-63f7-74838a4da11d")
public static String es_PE_FIELD_Distribution_UserList22_Name="Usuario 2";

@XendraTrl(Identifier="f2a2de8a-9f60-0beb-63f7-74838a4da11d")
public static String es_PE_FIELD_Distribution_UserList22_Description="El usuario definió el elemento # 2";

@XendraTrl(Identifier="f2a2de8a-9f60-0beb-63f7-74838a4da11d")
public static String es_PE_FIELD_Distribution_UserList22_Help="El elemento definido por el usuario despliega los elementos opcionales que han sido definidos para esta combinación de cuentas";

@XendraField(AD_Column_ID="User2_ID",IsCentrallyMaintained=true,
AD_Tab_ID="bc29674f-75da-59c7-97b4-f7cc128a627f",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="@$Element_U2@=Y & @AnyUser2@=N",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="f2a2de8a-9f60-0beb-63f7-74838a4da11d")
public static final String FIELDNAME_Distribution_UserList22="f2a2de8a-9f60-0beb-63f7-74838a4da11d";

@XendraTrl(Identifier="7addc6e4-1750-84d5-e4bc-37c2fd0bfbea")
public static String es_PE_COLUMN_User2_ID_Name="Usuario 2";

@XendraColumn(AD_Element_ID="1b668c90-6743-20a2-df62-576857d72c06",ColumnName="User2_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="6a357ab2-7bb6-fce4-ffee-8bdd855a77fc",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="7addc6e4-1750-84d5-e4bc-37c2fd0bfbea",Synchronized="2019-08-30 22:22:33.0")
/** Column name User2_ID */
public static final String COLUMNNAME_User2_ID = "User2_ID";
}
