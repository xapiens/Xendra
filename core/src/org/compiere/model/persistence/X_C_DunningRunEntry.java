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
/** Generated Model for C_DunningRunEntry
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_C_DunningRunEntry extends PO
{
/** Standard Constructor
@param ctx context
@param C_DunningRunEntry_ID id
@param trxName transaction
*/
public X_C_DunningRunEntry (Properties ctx, int C_DunningRunEntry_ID, String trxName)
{
super (ctx, C_DunningRunEntry_ID, trxName);
/** if (C_DunningRunEntry_ID == 0)
{
setAmt (Env.ZERO);	
// 0
setC_BPartner_ID (0);
setC_BPartner_Location_ID (0);
setC_Currency_ID (0);
setC_DunningRunEntry_ID (0);
setC_DunningRun_ID (0);
setProcessed (false);	
// N
setQty (Env.ZERO);
setSalesRep_ID (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_C_DunningRunEntry (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=527 */
public static int Table_ID=MTable.getTable_ID("C_DunningRunEntry");

@XendraTrl(Identifier="2b375208-6c0d-3301-b20c-c5006d4c5ec7")
public static String es_PE_TAB_Entry_Name="Entrada";
@XendraTab(Name="Entry",
Description="Dunning Run Entry",
Help="Maintain details of the dunning letter to a business partner",
AD_Window_ID="a455d38f-dfdf-f625-e59d-84fe05432eea",SeqNo=20,TabLevel=1,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",
AD_Process_ID="a7e68555-5122-1be3-7461-e321c54b06df",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="2b375208-6c0d-3301-b20c-c5006d4c5ec7",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Entry="2b375208-6c0d-3301-b20c-c5006d4c5ec7";

@XendraTrl(Identifier="8afb1aba-a893-d018-983c-195af718d78f")
public static String es_PE_TABLE_C_DunningRunEntry_Name="Entrada de secuencial de Morosidad";


@XendraTable(Name="Dunning Run Entry",AD_Package_ID="98af94a4-a4cd-bdc0-5651-5880caf79899",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="Dunning Run Entry",Help="",
TableName="C_DunningRunEntry",AccessLevel="3",AD_Window_ID="a455d38f-dfdf-f625-e59d-84fe05432eea",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=140,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.commercial",
Identifier="8afb1aba-a893-d018-983c-195af718d78f",Synchronized="2020-03-03 21:36:53.0")
/** TableName=C_DunningRunEntry */
public static final String Table_Name="C_DunningRunEntry";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"C_DunningRunEntry");

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
    Table_ID = MTable.getTable_ID("C_DunningRunEntry");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_C_DunningRunEntry[").append(get_ID()).append("]");
return sb.toString();
}
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

@XendraTrl(Identifier="fd04abd4-1da0-d1e3-534e-85337e5181ed")
public static String es_PE_FIELD_Entry_UserContact_Name="Usuario";

@XendraTrl(Identifier="fd04abd4-1da0-d1e3-534e-85337e5181ed")
public static String es_PE_FIELD_Entry_UserContact_Description="ID de Usuario dentro del sistema";

@XendraTrl(Identifier="fd04abd4-1da0-d1e3-534e-85337e5181ed")
public static String es_PE_FIELD_Entry_UserContact_Help="La ID de usuario identifica un usuario único en el sistema";

@XendraField(AD_Column_ID="AD_User_ID",IsCentrallyMaintained=true,
AD_Tab_ID="2b375208-6c0d-3301-b20c-c5006d4c5ec7",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="fd04abd4-1da0-d1e3-534e-85337e5181ed")
public static final String FIELDNAME_Entry_UserContact="fd04abd4-1da0-d1e3-534e-85337e5181ed";

@XendraTrl(Identifier="6c21491e-11ef-ac29-8af1-f20465e82501")
public static String es_PE_COLUMN_AD_User_ID_Name="Usuario";

@XendraColumn(AD_Element_ID="abdf8dee-d3cd-73ec-c758-683e907797f4",ColumnName="AD_User_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="f4ac36a1-4200-1386-677e-14ac90afb4fe",
FieldLength=22,DefaultValue="-1",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="6c21491e-11ef-ac29-8af1-f20465e82501",Synchronized="2019-08-30 22:21:33.0")
/** Column name AD_User_ID */
public static final String COLUMNNAME_AD_User_ID = "AD_User_ID";
/** Set Amount.
@param Amt Amount */
public void setAmt (BigDecimal Amt)
{
if (Amt == null) throw new IllegalArgumentException ("Amt is mandatory.");
set_Value (COLUMNNAME_Amt, Amt);
}
/** Get Amount.
@return Amount */
public BigDecimal getAmt() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Amt);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="0d9575e2-737f-11be-b91e-97967d90d0d0")
public static String es_PE_FIELD_Entry_Amount_Name="Total";

@XendraTrl(Identifier="0d9575e2-737f-11be-b91e-97967d90d0d0")
public static String es_PE_FIELD_Entry_Amount_Description="Total límite para el envío de facturas";

@XendraTrl(Identifier="0d9575e2-737f-11be-b91e-97967d90d0d0")
public static String es_PE_FIELD_Entry_Amount_Help="El campo total indica el límite en el que las facturas no serán generadas. Si el total total de la factura esta por debajo de este total; la factura  no será enviada en esta corrida programada. Este campo es solamente desplegado si el cuadro de verificación de total límite es seleccionado";

@XendraField(AD_Column_ID="Amt",IsCentrallyMaintained=true,
AD_Tab_ID="2b375208-6c0d-3301-b20c-c5006d4c5ec7",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=90,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0d9575e2-737f-11be-b91e-97967d90d0d0")
public static final String FIELDNAME_Entry_Amount="0d9575e2-737f-11be-b91e-97967d90d0d0";

@XendraTrl(Identifier="a79d9581-2075-3fc1-51b2-fb5184987bbd")
public static String es_PE_COLUMN_Amt_Name="Total";

@XendraColumn(AD_Element_ID="42827f15-aceb-2f14-cc38-b4a7c6022136",ColumnName="Amt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a79d9581-2075-3fc1-51b2-fb5184987bbd",
Synchronized="2019-08-30 22:21:33.0")
/** Column name Amt */
public static final String COLUMNNAME_Amt = "Amt";
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

@XendraTrl(Identifier="fbe9502d-a973-9e07-351d-a6aeda7cc031")
public static String es_PE_FIELD_Entry_BusinessPartner_Name="Socio de Negocio";

@XendraTrl(Identifier="fbe9502d-a973-9e07-351d-a6aeda7cc031")
public static String es_PE_FIELD_Entry_BusinessPartner_Description="Identifica un Socio de Negocio";

@XendraTrl(Identifier="fbe9502d-a973-9e07-351d-a6aeda7cc031")
public static String es_PE_FIELD_Entry_BusinessPartner_Help="Un socio de negocio es cualquiera con quien usted realiza transacciones. Este puede incluir Proveedores; Clientes; Empleados ó Vendedores.";

@XendraField(AD_Column_ID="C_BPartner_ID",IsCentrallyMaintained=true,
AD_Tab_ID="2b375208-6c0d-3301-b20c-c5006d4c5ec7",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=50,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="fbe9502d-a973-9e07-351d-a6aeda7cc031")
public static final String FIELDNAME_Entry_BusinessPartner="fbe9502d-a973-9e07-351d-a6aeda7cc031";

@XendraTrl(Identifier="428a4130-1844-3c75-5935-68225cd757d1")
public static String es_PE_COLUMN_C_BPartner_ID_Name="Socio de Negocio";

@XendraColumn(AD_Element_ID="fe333dc3-4f40-1276-5f6a-d09bb66dc423",ColumnName="C_BPartner_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="06fdbbe9-e1c4-3ee4-4a9d-73d1a990cc42",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=true,SeqNo=2,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="428a4130-1844-3c75-5935-68225cd757d1",Synchronized="2019-08-30 22:21:33.0")
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

@XendraTrl(Identifier="865c1e7d-7d83-ab0a-9e49-3a561b8651ee")
public static String es_PE_FIELD_Entry_PartnerLocation_Name="Dirección del Socio del Negocio";

@XendraTrl(Identifier="865c1e7d-7d83-ab0a-9e49-3a561b8651ee")
public static String es_PE_FIELD_Entry_PartnerLocation_Description="Identifica la dirección para este socio de negocio";

@XendraTrl(Identifier="865c1e7d-7d83-ab0a-9e49-3a561b8651ee")
public static String es_PE_FIELD_Entry_PartnerLocation_Help="La dirección de un socio indica la ubicación de un socio de negocio";

@XendraField(AD_Column_ID="C_BPartner_Location_ID",IsCentrallyMaintained=true,
AD_Tab_ID="2b375208-6c0d-3301-b20c-c5006d4c5ec7",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="865c1e7d-7d83-ab0a-9e49-3a561b8651ee")
public static final String FIELDNAME_Entry_PartnerLocation="865c1e7d-7d83-ab0a-9e49-3a561b8651ee";

@XendraTrl(Identifier="5c781cf7-61e5-4bac-13d3-2e905c2c7c60")
public static String es_PE_COLUMN_C_BPartner_Location_ID_Name="Dirección del Socio del Negocio";

@XendraColumn(AD_Element_ID="0dab7dc6-2832-26dc-2462-cba2d40235f2",
ColumnName="C_BPartner_Location_ID",AD_Reference_ID=19,AD_Reference_Value_ID="",
AD_Val_Rule_ID="623d98c0-19fc-56a2-f511-8992974d3c05",FieldLength=22,DefaultValue="",IsKey=false,
IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5c781cf7-61e5-4bac-13d3-2e905c2c7c60",
Synchronized="2019-08-30 22:21:33.0")
/** Column name C_BPartner_Location_ID */
public static final String COLUMNNAME_C_BPartner_Location_ID = "C_BPartner_Location_ID";
/** Set Currency.
@param C_Currency_ID The Currency for this record */
public void setC_Currency_ID (int C_Currency_ID)
{
if (C_Currency_ID < 1) throw new IllegalArgumentException ("C_Currency_ID is mandatory.");
set_Value (COLUMNNAME_C_Currency_ID, Integer.valueOf(C_Currency_ID));
}
/** Get Currency.
@return The Currency for this record */
public int getC_Currency_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Currency_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="055ccae1-215b-9e21-b7c1-8c06b737839c")
public static String es_PE_FIELD_Entry_Currency_Name="Moneda";

@XendraTrl(Identifier="055ccae1-215b-9e21-b7c1-8c06b737839c")
public static String es_PE_FIELD_Entry_Currency_Description="Moneda para este registro";

@XendraTrl(Identifier="055ccae1-215b-9e21-b7c1-8c06b737839c")
public static String es_PE_FIELD_Entry_Currency_Help="Indica la moneda a ser usada cuando se procese ó Informe este registro";

@XendraField(AD_Column_ID="C_Currency_ID",IsCentrallyMaintained=true,
AD_Tab_ID="2b375208-6c0d-3301-b20c-c5006d4c5ec7",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="055ccae1-215b-9e21-b7c1-8c06b737839c")
public static final String FIELDNAME_Entry_Currency="055ccae1-215b-9e21-b7c1-8c06b737839c";

@XendraTrl(Identifier="73abc187-94d6-3cc5-4e5d-1dda2a095916")
public static String es_PE_COLUMN_C_Currency_ID_Name="Moneda";

@XendraColumn(AD_Element_ID="8daec488-bca2-50fe-f9de-abf0cba2a34a",ColumnName="C_Currency_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="73abc187-94d6-3cc5-4e5d-1dda2a095916",
Synchronized="2019-08-30 22:21:33.0")
/** Column name C_Currency_ID */
public static final String COLUMNNAME_C_Currency_ID = "C_Currency_ID";
/** Set Dunning Run Entry.
@param C_DunningRunEntry_ID Dunning Run Entry */
public void setC_DunningRunEntry_ID (int C_DunningRunEntry_ID)
{
if (C_DunningRunEntry_ID < 1) throw new IllegalArgumentException ("C_DunningRunEntry_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_DunningRunEntry_ID, Integer.valueOf(C_DunningRunEntry_ID));
}
/** Get Dunning Run Entry.
@return Dunning Run Entry */
public int getC_DunningRunEntry_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_DunningRunEntry_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="3f2c5d94-b4b5-9ea9-6485-5018be48d4ca")
public static String es_PE_FIELD_Entry_DunningRunEntry_Name="Entrada de secuencial de Morosidad";

@XendraTrl(Identifier="3f2c5d94-b4b5-9ea9-6485-5018be48d4ca")
public static String es_PE_FIELD_Entry_DunningRunEntry_Description="Entrada del secuencial de Informes de morosidad";

@XendraField(AD_Column_ID="C_DunningRunEntry_ID",IsCentrallyMaintained=true,
AD_Tab_ID="2b375208-6c0d-3301-b20c-c5006d4c5ec7",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3f2c5d94-b4b5-9ea9-6485-5018be48d4ca")
public static final String FIELDNAME_Entry_DunningRunEntry="3f2c5d94-b4b5-9ea9-6485-5018be48d4ca";
/** Column name C_DunningRunEntry_ID */
public static final String COLUMNNAME_C_DunningRunEntry_ID = "C_DunningRunEntry_ID";
/** Set Dunning Run.
@param C_DunningRun_ID Dunning Run */
public void setC_DunningRun_ID (int C_DunningRun_ID)
{
if (C_DunningRun_ID < 1) throw new IllegalArgumentException ("C_DunningRun_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_DunningRun_ID, Integer.valueOf(C_DunningRun_ID));
}
/** Get Dunning Run.
@return Dunning Run */
public int getC_DunningRun_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_DunningRun_ID);
if (ii == null) return 0;
return ii.intValue();
}
/** Get Record ID/ColumnName
@return ID/ColumnName pair
*/public KeyNamePair getKeyNamePair() 
{
return new KeyNamePair(get_ID(), String.valueOf(getC_DunningRun_ID()));
}

@XendraTrl(Identifier="18ec4961-d1eb-213e-10ab-e6ee510184fd")
public static String es_PE_FIELD_Entry_DunningRun_Name="Secuencial de Morosidad";

@XendraTrl(Identifier="18ec4961-d1eb-213e-10ab-e6ee510184fd")
public static String es_PE_FIELD_Entry_DunningRun_Description="Secuencial de Informes de morosidad corridos";

@XendraField(AD_Column_ID="C_DunningRun_ID",IsCentrallyMaintained=true,
AD_Tab_ID="2b375208-6c0d-3301-b20c-c5006d4c5ec7",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="18ec4961-d1eb-213e-10ab-e6ee510184fd")
public static final String FIELDNAME_Entry_DunningRun="18ec4961-d1eb-213e-10ab-e6ee510184fd";

@XendraTrl(Identifier="8e8827e7-750f-cb65-78e1-7e60e9388d60")
public static String es_PE_COLUMN_C_DunningRun_ID_Name="Secuencial de Morosidad";

@XendraColumn(AD_Element_ID="5db17723-521d-2ae6-5eb2-8d12faa1417a",ColumnName="C_DunningRun_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="8e8827e7-750f-cb65-78e1-7e60e9388d60",
Synchronized="2019-08-30 22:21:33.0")
/** Column name C_DunningRun_ID */
public static final String COLUMNNAME_C_DunningRun_ID = "C_DunningRun_ID";
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
@XendraTrl(Identifier="20dd804e-b01b-4d78-852f-4e465b0a85d5")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="20dd804e-b01b-4d78-852f-4e465b0a85d5",
Synchronized="2019-08-30 22:21:33.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Note.
@param Note Optional additional user defined information */
public void setNote (String Note)
{
set_Value (COLUMNNAME_Note, Note);
}
/** Get Note.
@return Optional additional user defined information */
public String getNote() 
{
String value = (String)get_Value(COLUMNNAME_Note);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="ea0fa839-f419-8e63-2d8a-3af7c55906a3")
public static String es_PE_FIELD_Entry_Note_Name="Nota";

@XendraTrl(Identifier="ea0fa839-f419-8e63-2d8a-3af7c55906a3")
public static String es_PE_FIELD_Entry_Note_Description="Información adicional opcional definida por el usuario";

@XendraTrl(Identifier="ea0fa839-f419-8e63-2d8a-3af7c55906a3")
public static String es_PE_FIELD_Entry_Note_Help="El campo Nota permite una entrada opcional de información definida por el usuario considerando este registro";

@XendraField(AD_Column_ID="Note",IsCentrallyMaintained=true,
AD_Tab_ID="2b375208-6c0d-3301-b20c-c5006d4c5ec7",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=120,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ea0fa839-f419-8e63-2d8a-3af7c55906a3")
public static final String FIELDNAME_Entry_Note="ea0fa839-f419-8e63-2d8a-3af7c55906a3";

@XendraTrl(Identifier="b25ec15c-a6dc-c547-e977-08a8a4a0bfc0")
public static String es_PE_COLUMN_Note_Name="Nota";

@XendraColumn(AD_Element_ID="5fea140b-6b26-b544-b237-3b3fa64ae1c6",ColumnName="Note",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b25ec15c-a6dc-c547-e977-08a8a4a0bfc0",
Synchronized="2019-08-30 22:21:33.0")
/** Column name Note */
public static final String COLUMNNAME_Note = "Note";
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

@XendraTrl(Identifier="23a12492-7d5d-ec36-6891-84f82bccbf02")
public static String es_PE_FIELD_Entry_Processed_Name="Procesado";

@XendraTrl(Identifier="23a12492-7d5d-ec36-6891-84f82bccbf02")
public static String es_PE_FIELD_Entry_Processed_Description="El documento ha sido procesado";

@XendraTrl(Identifier="23a12492-7d5d-ec36-6891-84f82bccbf02")
public static String es_PE_FIELD_Entry_Processed_Help="El cuadro de verificación procesada indica que un documento ha sido procesado";

@XendraField(AD_Column_ID="Processed",IsCentrallyMaintained=true,
AD_Tab_ID="2b375208-6c0d-3301-b20c-c5006d4c5ec7",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=true,SeqNo=130,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="23a12492-7d5d-ec36-6891-84f82bccbf02")
public static final String FIELDNAME_Entry_Processed="23a12492-7d5d-ec36-6891-84f82bccbf02";

@XendraTrl(Identifier="c207074f-1ead-a934-c1cf-d49a3ac734f3")
public static String es_PE_COLUMN_Processed_Name="Procesado";

@XendraColumn(AD_Element_ID="3f7035d2-fa5e-7416-fc0c-e49e43f9e083",ColumnName="Processed",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c207074f-1ead-a934-c1cf-d49a3ac734f3",
Synchronized="2019-08-30 22:21:33.0")
/** Column name Processed */
public static final String COLUMNNAME_Processed = "Processed";
/** Set Quantity.
@param Qty Quantity */
public void setQty (BigDecimal Qty)
{
if (Qty == null) throw new IllegalArgumentException ("Qty is mandatory.");
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

@XendraTrl(Identifier="5a11a932-1d58-c8a6-42a8-a949bcc6519f")
public static String es_PE_FIELD_Entry_Quantity_Name="Cantidad";

@XendraTrl(Identifier="5a11a932-1d58-c8a6-42a8-a949bcc6519f")
public static String es_PE_FIELD_Entry_Quantity_Description="Cantidad";

@XendraTrl(Identifier="5a11a932-1d58-c8a6-42a8-a949bcc6519f")
public static String es_PE_FIELD_Entry_Quantity_Help="La Cantidad indica el número de un producto específico o artículo para este documento";

@XendraField(AD_Column_ID="Qty",IsCentrallyMaintained=true,
AD_Tab_ID="2b375208-6c0d-3301-b20c-c5006d4c5ec7",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=110,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5a11a932-1d58-c8a6-42a8-a949bcc6519f")
public static final String FIELDNAME_Entry_Quantity="5a11a932-1d58-c8a6-42a8-a949bcc6519f";

@XendraTrl(Identifier="bf9d1473-32ef-525a-11ea-9d5ee99c4c75")
public static String es_PE_COLUMN_Qty_Name="Cantidad";

@XendraColumn(AD_Element_ID="c9d74a25-87c5-9592-5660-4f397607dad3",ColumnName="Qty",
AD_Reference_ID=29,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="bf9d1473-32ef-525a-11ea-9d5ee99c4c75",
Synchronized="2019-08-30 22:21:33.0")
/** Column name Qty */
public static final String COLUMNNAME_Qty = "Qty";
/** Set Sales Representative.
@param SalesRep_ID Sales Representative or Company Agent */
public void setSalesRep_ID (int SalesRep_ID)
{
if (SalesRep_ID < 1) throw new IllegalArgumentException ("SalesRep_ID is mandatory.");
set_Value (COLUMNNAME_SalesRep_ID, Integer.valueOf(SalesRep_ID));
}
/** Get Sales Representative.
@return Sales Representative or Company Agent */
public int getSalesRep_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_SalesRep_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="0546f214-18a6-2eff-9764-80c22c58b662")
public static String es_PE_FIELD_Entry_SalesRepresentative_Name="Agente Cía";

@XendraTrl(Identifier="0546f214-18a6-2eff-9764-80c22c58b662")
public static String es_PE_FIELD_Entry_SalesRepresentative_Description="Representante de Ventas";

@XendraTrl(Identifier="0546f214-18a6-2eff-9764-80c22c58b662")
public static String es_PE_FIELD_Entry_SalesRepresentative_Help="El representante de ventas indica el representante de ventas para esta región.";

@XendraField(AD_Column_ID="SalesRep_ID",IsCentrallyMaintained=true,
AD_Tab_ID="2b375208-6c0d-3301-b20c-c5006d4c5ec7",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0546f214-18a6-2eff-9764-80c22c58b662")
public static final String FIELDNAME_Entry_SalesRepresentative="0546f214-18a6-2eff-9764-80c22c58b662";

@XendraTrl(Identifier="8ceabc93-8809-45a7-e8a1-ec6b6714e372")
public static String es_PE_COLUMN_SalesRep_ID_Name="Agente Cía";

@XendraColumn(AD_Element_ID="197a9c3a-ff10-c291-d65f-5e05a36d3710",ColumnName="SalesRep_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="15251147-a1b6-4a83-a3a5-2d3ae7db69d9",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="8ceabc93-8809-45a7-e8a1-ec6b6714e372",Synchronized="2019-08-30 22:21:34.0")
/** Column name SalesRep_ID */
public static final String COLUMNNAME_SalesRep_ID = "SalesRep_ID";
}
