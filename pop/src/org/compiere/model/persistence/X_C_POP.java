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
/** Generated Model for C_POP
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_C_POP extends PO
{
/** Standard Constructor
@param ctx context
@param C_POP_ID id
@param trxName transaction
*/
public X_C_POP (Properties ctx, int C_POP_ID, String trxName)
{
super (ctx, C_POP_ID, trxName);
/** if (C_POP_ID == 0)
{
setAD_User_ID (0);
setC_CashBook_ID (0);
setC_ConversionType_ID (0);
setC_Currency_ID (0);
setC_POP_ID (0);
setC_Tax_ID (0);
setInOut_C_DocType_ID (0);
setInvoice_C_DocType_ID (0);
setM_PriceList_Version_ID (0);
setOrder_C_DocType_ID (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_C_POP (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=1000043 */
public static int Table_ID=MTable.getTable_ID("C_POP");

@XendraTrl(Identifier="c584259a-7aac-72bf-24e6-39324a0f8b0f")
public static String es_PE_TAB_POP_Name="PDC";
@XendraTab(Name="POP",Description="",Help="",
AD_Window_ID="5020fd22-079b-8104-1805-e79a96a8fbbf",SeqNo=10,TabLevel=0,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="c584259a-7aac-72bf-24e6-39324a0f8b0f",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_POP="c584259a-7aac-72bf-24e6-39324a0f8b0f";

@XendraTrl(Identifier="acf9497a-a949-403e-7513-40bef2815e57")
public static String es_PE_TABLE_C_POP_Name="Punto de Compra";

@XendraTable(Name="Point of Purchase",AD_Package_ID="98af94a4-a4cd-bdc0-5651-5880caf79899",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="",Help="",TableName="C_POP",
AccessLevel="3",AD_Window_ID="5020fd22-079b-8104-1805-e79a96a8fbbf",AD_Val_Rule_ID="",IsKey=1,
LoadSeq=0,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,
IsView=false,PO_Window_ID="",ID="org.xendra.commercial",
Identifier="acf9497a-a949-403e-7513-40bef2815e57",Synchronized="2020-03-03 21:37:27.0")
/** TableName=C_POP */
public static final String Table_Name="C_POP";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"C_POP");

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
    Table_ID = MTable.getTable_ID("C_POP");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_C_POP[").append(get_ID()).append("]");
return sb.toString();
}
/** Set AD_Rule_ID.
@param AD_Rule_ID AD_Rule_ID */
public void setAD_Rule_ID (int AD_Rule_ID)
{
if (AD_Rule_ID <= 0) set_Value (COLUMNNAME_AD_Rule_ID, null);
 else 
set_Value (COLUMNNAME_AD_Rule_ID, Integer.valueOf(AD_Rule_ID));
}
/** Get AD_Rule_ID.
@return AD_Rule_ID */
public int getAD_Rule_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Rule_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="82b18b30-b4af-4525-a269-7920eea2b10c")
public static String es_PE_COLUMN_AD_Rule_ID_Name="AD_Rule_ID";

@XendraColumn(AD_Element_ID="4b4afdeb-6aca-d182-6e3a-83f0f6d29f7d",ColumnName="AD_Rule_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="82b18b30-b4af-4525-a269-7920eea2b10c",
Synchronized="2019-08-30 22:22:03.0")
/** Column name AD_Rule_ID */
public static final String COLUMNNAME_AD_Rule_ID = "AD_Rule_ID";
/** Set User/Contact.
@param AD_User_ID User within the system - Internal or Business Partner Contact */
public void setAD_User_ID (int AD_User_ID)
{
if (AD_User_ID < 1) throw new IllegalArgumentException ("AD_User_ID is mandatory.");
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

@XendraTrl(Identifier="a8a28353-9acb-301e-ceb1-3bb02143aed5")
public static String es_PE_FIELD_POP_UserContact_Name="Usuario";

@XendraTrl(Identifier="a8a28353-9acb-301e-ceb1-3bb02143aed5")
public static String es_PE_FIELD_POP_UserContact_Description="ID de Usuario dentro del sistema";

@XendraTrl(Identifier="a8a28353-9acb-301e-ceb1-3bb02143aed5")
public static String es_PE_FIELD_POP_UserContact_Help="La ID de usuario identifica un usuario único en el sistema";

@XendraField(AD_Column_ID="AD_User_ID",IsCentrallyMaintained=true,
AD_Tab_ID="c584259a-7aac-72bf-24e6-39324a0f8b0f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a8a28353-9acb-301e-ceb1-3bb02143aed5")
public static final String FIELDNAME_POP_UserContact="a8a28353-9acb-301e-ceb1-3bb02143aed5";

@XendraTrl(Identifier="186edea3-34d6-9946-7028-4cf528fd486b")
public static String es_PE_COLUMN_AD_User_ID_Name="Usuario";

@XendraColumn(AD_Element_ID="abdf8dee-d3cd-73ec-c758-683e907797f4",ColumnName="AD_User_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="3ec35ccd-e6b3-d5a5-4c64-d26ca1da80e0",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="186edea3-34d6-9946-7028-4cf528fd486b",Synchronized="2019-08-30 22:22:03.0")
/** Column name AD_User_ID */
public static final String COLUMNNAME_AD_User_ID = "AD_User_ID";
/** Set Machine .
@param A_Machine_ID Machine  */
public void setA_Machine_ID (int A_Machine_ID)
{
if (A_Machine_ID <= 0) set_Value (COLUMNNAME_A_Machine_ID, null);
 else 
set_Value (COLUMNNAME_A_Machine_ID, Integer.valueOf(A_Machine_ID));
}
/** Get Machine .
@return Machine  */
public int getA_Machine_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_A_Machine_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="ce89d97d-8aeb-4d07-91d0-832275f5ba83")
public static String es_PE_COLUMN_A_Machine_ID_Name="Machine ";

@XendraColumn(AD_Element_ID="5ca659c9-c8cc-4dd1-8e7c-ddc2fe399392",ColumnName="A_Machine_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ce89d97d-8aeb-4d07-91d0-832275f5ba83",
Synchronized="2019-08-30 22:22:03.0")
/** Column name A_Machine_ID */
public static final String COLUMNNAME_A_Machine_ID = "A_Machine_ID";
/** Set Cash Book.
@param C_CashBook_ID Cash Book for recording petty cash transactions */
public void setC_CashBook_ID (int C_CashBook_ID)
{
if (C_CashBook_ID < 1) throw new IllegalArgumentException ("C_CashBook_ID is mandatory.");
set_Value (COLUMNNAME_C_CashBook_ID, Integer.valueOf(C_CashBook_ID));
}
/** Get Cash Book.
@return Cash Book for recording petty cash transactions */
public int getC_CashBook_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_CashBook_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="d7cae760-110d-4056-626c-35a8e01eccad")
public static String es_PE_FIELD_POP_CashBook_Name="Libro de Efectivo";

@XendraTrl(Identifier="d7cae760-110d-4056-626c-35a8e01eccad")
public static String es_PE_FIELD_POP_CashBook_Description="Libro de efectivo para registrar transacciones de caja chica.";

@XendraTrl(Identifier="d7cae760-110d-4056-626c-35a8e01eccad")
public static String es_PE_FIELD_POP_CashBook_Help="El libro de efectivo identifica un libro de efectivo único. El libro de efectivo se usa para registrar transacciones de efectivo.";

@XendraField(AD_Column_ID="C_CashBook_ID",IsCentrallyMaintained=true,
AD_Tab_ID="c584259a-7aac-72bf-24e6-39324a0f8b0f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d7cae760-110d-4056-626c-35a8e01eccad")
public static final String FIELDNAME_POP_CashBook="d7cae760-110d-4056-626c-35a8e01eccad";

@XendraTrl(Identifier="2765062b-2ce8-69a5-62ac-9520562e6c86")
public static String es_PE_COLUMN_C_CashBook_ID_Name="Libro de Efectivo";

@XendraColumn(AD_Element_ID="30688c51-d454-8026-32c4-990b9ea9ddf2",ColumnName="C_CashBook_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2765062b-2ce8-69a5-62ac-9520562e6c86",
Synchronized="2019-08-30 22:22:03.0")
/** Column name C_CashBook_ID */
public static final String COLUMNNAME_C_CashBook_ID = "C_CashBook_ID";
/** Set Currency Type.
@param C_ConversionType_ID Currency Conversion Rate Type */
public void setC_ConversionType_ID (int C_ConversionType_ID)
{
if (C_ConversionType_ID < 1) throw new IllegalArgumentException ("C_ConversionType_ID is mandatory.");
set_Value (COLUMNNAME_C_ConversionType_ID, Integer.valueOf(C_ConversionType_ID));
}
/** Get Currency Type.
@return Currency Conversion Rate Type */
public int getC_ConversionType_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_ConversionType_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="a8e52bf9-e274-7eb8-9835-20b77bc1f351")
public static String es_PE_FIELD_POP_CurrencyType_Name="Tipo de Moneda";

@XendraTrl(Identifier="a8e52bf9-e274-7eb8-9835-20b77bc1f351")
public static String es_PE_FIELD_POP_CurrencyType_Description="Tipo de índice de conversión de moneda ";

@XendraTrl(Identifier="a8e52bf9-e274-7eb8-9835-20b77bc1f351")
public static String es_PE_FIELD_POP_CurrencyType_Help="El tipo del índice de conversión de monedas le deja definir diversos tipos de tarifas, tarifas ej. del punto, corporativas y/o de Ventas/Compras.";

@XendraField(AD_Column_ID="C_ConversionType_ID",IsCentrallyMaintained=true,
AD_Tab_ID="c584259a-7aac-72bf-24e6-39324a0f8b0f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=0,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a8e52bf9-e274-7eb8-9835-20b77bc1f351")
public static final String FIELDNAME_POP_CurrencyType="a8e52bf9-e274-7eb8-9835-20b77bc1f351";

@XendraTrl(Identifier="57154fef-3b54-53db-3582-b243f0c0b624")
public static String es_PE_COLUMN_C_ConversionType_ID_Name="Tipo de Moneda";

@XendraColumn(AD_Element_ID="66f5d039-c94d-0957-487b-eb3118bd7719",
ColumnName="C_ConversionType_ID",AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="57154fef-3b54-53db-3582-b243f0c0b624",Synchronized="2019-08-30 22:22:03.0")
/** Column name C_ConversionType_ID */
public static final String COLUMNNAME_C_ConversionType_ID = "C_ConversionType_ID";
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

@XendraTrl(Identifier="908fa7d6-224e-1e64-ff33-97807ce459e9")
public static String es_PE_FIELD_POP_Currency_Name="Moneda";

@XendraTrl(Identifier="908fa7d6-224e-1e64-ff33-97807ce459e9")
public static String es_PE_FIELD_POP_Currency_Description="Moneda para este registro";

@XendraTrl(Identifier="908fa7d6-224e-1e64-ff33-97807ce459e9")
public static String es_PE_FIELD_POP_Currency_Help="Indica la moneda a ser usada cuando se procese ó Informe este registro";

@XendraField(AD_Column_ID="C_Currency_ID",IsCentrallyMaintained=true,
AD_Tab_ID="c584259a-7aac-72bf-24e6-39324a0f8b0f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="908fa7d6-224e-1e64-ff33-97807ce459e9")
public static final String FIELDNAME_POP_Currency="908fa7d6-224e-1e64-ff33-97807ce459e9";

@XendraTrl(Identifier="24ea3e9e-ac08-cb2a-12a0-d69a28eed480")
public static String es_PE_COLUMN_C_Currency_ID_Name="Moneda";

@XendraColumn(AD_Element_ID="8daec488-bca2-50fe-f9de-abf0cba2a34a",ColumnName="C_Currency_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="24ea3e9e-ac08-cb2a-12a0-d69a28eed480",
Synchronized="2019-08-30 22:22:03.0")
/** Column name C_Currency_ID */
public static final String COLUMNNAME_C_Currency_ID = "C_Currency_ID";
/** Set Point of Purchase.
@param C_POP_ID Point of Purchase */
public void setC_POP_ID (int C_POP_ID)
{
if (C_POP_ID < 1) throw new IllegalArgumentException ("C_POP_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_POP_ID, Integer.valueOf(C_POP_ID));
}
/** Get Point of Purchase.
@return Point of Purchase */
public int getC_POP_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_POP_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="c2cf882c-3725-c269-f7b5-6c5d4c287a15")
public static String es_PE_FIELD_POP_PointOfPurchase_Name="Punto de Compra";

@XendraField(AD_Column_ID="C_POP_ID",IsCentrallyMaintained=true,
AD_Tab_ID="c584259a-7aac-72bf-24e6-39324a0f8b0f",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c2cf882c-3725-c269-f7b5-6c5d4c287a15")
public static final String FIELDNAME_POP_PointOfPurchase="c2cf882c-3725-c269-f7b5-6c5d4c287a15";
/** Column name C_POP_ID */
public static final String COLUMNNAME_C_POP_ID = "C_POP_ID";
/** Set POS Key Layout.
@param C_POSKeyLayout_ID POS Function Key Layout */
public void setC_POSKeyLayout_ID (int C_POSKeyLayout_ID)
{
if (C_POSKeyLayout_ID <= 0) set_Value (COLUMNNAME_C_POSKeyLayout_ID, null);
 else 
set_Value (COLUMNNAME_C_POSKeyLayout_ID, Integer.valueOf(C_POSKeyLayout_ID));
}
/** Get POS Key Layout.
@return POS Function Key Layout */
public int getC_POSKeyLayout_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_POSKeyLayout_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="9c6212e5-7740-8faa-5fcb-b88e9ce862d7")
public static String es_PE_FIELD_POP_POSKeyLayout_Name="PDV Disposición de la llave";

@XendraTrl(Identifier="9c6212e5-7740-8faa-5fcb-b88e9ce862d7")
public static String es_PE_FIELD_POP_POSKeyLayout_Description="Disposición de la llave de funcionamiento PDV";

@XendraTrl(Identifier="9c6212e5-7740-8faa-5fcb-b88e9ce862d7")
public static String es_PE_FIELD_POP_POSKeyLayout_Help="Disposición de la llave de funcionamiento PDV";

@XendraField(AD_Column_ID="C_POSKeyLayout_ID",IsCentrallyMaintained=true,
AD_Tab_ID="c584259a-7aac-72bf-24e6-39324a0f8b0f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=0,IsReadOnly=false,SeqNo=150,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9c6212e5-7740-8faa-5fcb-b88e9ce862d7")
public static final String FIELDNAME_POP_POSKeyLayout="9c6212e5-7740-8faa-5fcb-b88e9ce862d7";

@XendraTrl(Identifier="c3961c3f-7a4f-5615-f88d-39bdb94bbc50")
public static String es_PE_COLUMN_C_POSKeyLayout_ID_Name="PDV Disposición de la llave";

@XendraColumn(AD_Element_ID="4665a4ce-9921-ee8e-32d7-b2602f5804bf",ColumnName="C_POSKeyLayout_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c3961c3f-7a4f-5615-f88d-39bdb94bbc50",
Synchronized="2019-08-30 22:22:03.0")
/** Column name C_POSKeyLayout_ID */
public static final String COLUMNNAME_C_POSKeyLayout_ID = "C_POSKeyLayout_ID";
/** Set Tax.
@param C_Tax_ID Tax identifier */
public void setC_Tax_ID (int C_Tax_ID)
{
if (C_Tax_ID < 1) throw new IllegalArgumentException ("C_Tax_ID is mandatory.");
set_Value (COLUMNNAME_C_Tax_ID, Integer.valueOf(C_Tax_ID));
}
/** Get Tax.
@return Tax identifier */
public int getC_Tax_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Tax_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="3bf354d3-3124-36ae-66ae-ced28c3d77f3")
public static String es_PE_FIELD_POP_Tax_Name="Impuesto";

@XendraTrl(Identifier="3bf354d3-3124-36ae-66ae-ced28c3d77f3")
public static String es_PE_FIELD_POP_Tax_Description="Identificador del Impuesto";

@XendraTrl(Identifier="3bf354d3-3124-36ae-66ae-ced28c3d77f3")
public static String es_PE_FIELD_POP_Tax_Help="El Impuesto indica el tipo de impuesto para esta línea del documento";

@XendraField(AD_Column_ID="C_Tax_ID",IsCentrallyMaintained=true,
AD_Tab_ID="c584259a-7aac-72bf-24e6-39324a0f8b0f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=0,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3bf354d3-3124-36ae-66ae-ced28c3d77f3")
public static final String FIELDNAME_POP_Tax="3bf354d3-3124-36ae-66ae-ced28c3d77f3";

@XendraTrl(Identifier="e7a38f88-0b32-53c5-8990-2c1226f78ad7")
public static String es_PE_COLUMN_C_Tax_ID_Name="Impuesto";

@XendraColumn(AD_Element_ID="38ff24fc-b68c-51a9-60f8-ef2a1f060de2",ColumnName="C_Tax_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e7a38f88-0b32-53c5-8990-2c1226f78ad7",
Synchronized="2019-08-30 22:22:03.0")
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

@XendraTrl(Identifier="fdf3904a-7c32-575a-99f3-555cad64af1c")
public static String es_PE_FIELD_POP_Description_Name="Observación";

@XendraTrl(Identifier="fdf3904a-7c32-575a-99f3-555cad64af1c")
public static String es_PE_FIELD_POP_Description_Description="Observación";

@XendraTrl(Identifier="fdf3904a-7c32-575a-99f3-555cad64af1c")
public static String es_PE_FIELD_POP_Description_Help="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="c584259a-7aac-72bf-24e6-39324a0f8b0f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=255,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="fdf3904a-7c32-575a-99f3-555cad64af1c")
public static final String FIELDNAME_POP_Description="fdf3904a-7c32-575a-99f3-555cad64af1c";

@XendraTrl(Identifier="126af4d7-cbad-12f8-0737-bf6977a4d821")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="126af4d7-cbad-12f8-0737-bf6977a4d821",
Synchronized="2019-08-30 22:22:03.0")
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
@XendraTrl(Identifier="7ef67bc8-88c4-46ca-8aed-e3a5ee273bfe")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7ef67bc8-88c4-46ca-8aed-e3a5ee273bfe",
Synchronized="2019-08-30 22:22:03.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set InOut_C_DocType_ID.
@param InOut_C_DocType_ID Document type or rules */
public void setInOut_C_DocType_ID (int InOut_C_DocType_ID)
{
if (InOut_C_DocType_ID < 1) throw new IllegalArgumentException ("InOut_C_DocType_ID is mandatory.");
set_Value (COLUMNNAME_InOut_C_DocType_ID, Integer.valueOf(InOut_C_DocType_ID));
}
/** Get InOut_C_DocType_ID.
@return Document type or rules */
public int getInOut_C_DocType_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_InOut_C_DocType_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="1aae653c-e0d9-74f2-6384-fc09a682f7ae")
public static String es_PE_FIELD_POP_InOut_C_DocType_ID_Name="Tipo de Documento";

@XendraTrl(Identifier="1aae653c-e0d9-74f2-6384-fc09a682f7ae")
public static String es_PE_FIELD_POP_InOut_C_DocType_ID_Description="Tipo de documento ó reglas";

@XendraTrl(Identifier="1aae653c-e0d9-74f2-6384-fc09a682f7ae")
public static String es_PE_FIELD_POP_InOut_C_DocType_ID_Help="El tipo de documento determina la secuencia del documento y las reglas de proceso";

@XendraField(AD_Column_ID="InOut_C_DocType_ID",IsCentrallyMaintained=true,
AD_Tab_ID="c584259a-7aac-72bf-24e6-39324a0f8b0f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=120,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1aae653c-e0d9-74f2-6384-fc09a682f7ae")
public static final String FIELDNAME_POP_InOut_C_DocType_ID="1aae653c-e0d9-74f2-6384-fc09a682f7ae";

@XendraTrl(Identifier="f956d26a-0cd5-7f9b-1e80-8c09d2a842a1")
public static String es_PE_COLUMN_InOut_C_DocType_ID_Name="Tipo de Documento";

@XendraColumn(AD_Element_ID="b1f794a3-838b-a7ba-04e4-b935bf1944d3",ColumnName="InOut_C_DocType_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="f06eaf85-a231-e1cf-ebf8-59d002c13ab4",
AD_Val_Rule_ID="dd6fc25f-c92c-fb01-6714-8c13e0ee2cde",FieldLength=10,DefaultValue="",IsKey=false,
IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f956d26a-0cd5-7f9b-1e80-8c09d2a842a1",
Synchronized="2019-08-30 22:22:03.0")
/** Column name InOut_C_DocType_ID */
public static final String COLUMNNAME_InOut_C_DocType_ID = "InOut_C_DocType_ID";
/** Set Invoice_C_DocType_ID.
@param Invoice_C_DocType_ID Document type or rules */
public void setInvoice_C_DocType_ID (int Invoice_C_DocType_ID)
{
if (Invoice_C_DocType_ID < 1) throw new IllegalArgumentException ("Invoice_C_DocType_ID is mandatory.");
set_Value (COLUMNNAME_Invoice_C_DocType_ID, Integer.valueOf(Invoice_C_DocType_ID));
}
/** Get Invoice_C_DocType_ID.
@return Document type or rules */
public int getInvoice_C_DocType_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_Invoice_C_DocType_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="8f0fb100-e319-1565-39d1-e43ba3f55eec")
public static String es_PE_FIELD_POP_Invoice_C_DocType_ID_Name="Tipo de Documento";

@XendraTrl(Identifier="8f0fb100-e319-1565-39d1-e43ba3f55eec")
public static String es_PE_FIELD_POP_Invoice_C_DocType_ID_Description="Tipo de documento ó reglas";

@XendraTrl(Identifier="8f0fb100-e319-1565-39d1-e43ba3f55eec")
public static String es_PE_FIELD_POP_Invoice_C_DocType_ID_Help="El tipo de documento determina la secuencia del documento y las reglas de proceso";

@XendraField(AD_Column_ID="Invoice_C_DocType_ID",IsCentrallyMaintained=true,
AD_Tab_ID="c584259a-7aac-72bf-24e6-39324a0f8b0f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=130,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8f0fb100-e319-1565-39d1-e43ba3f55eec")
public static final String FIELDNAME_POP_Invoice_C_DocType_ID="8f0fb100-e319-1565-39d1-e43ba3f55eec";

@XendraTrl(Identifier="044b1188-3afd-5b52-ee30-8344527f42a5")
public static String es_PE_COLUMN_Invoice_C_DocType_ID_Name="Tipo de Documento";

@XendraColumn(AD_Element_ID="f1ceb8f9-8e12-74d4-2476-a12e609d912c",
ColumnName="Invoice_C_DocType_ID",AD_Reference_ID=18,
AD_Reference_Value_ID="f06eaf85-a231-e1cf-ebf8-59d002c13ab4",
AD_Val_Rule_ID="e39bf052-270d-5f9b-f637-ce49c647089f",FieldLength=10,DefaultValue="",IsKey=false,
IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="044b1188-3afd-5b52-ee30-8344527f42a5",
Synchronized="2019-08-30 22:22:03.0")
/** Column name Invoice_C_DocType_ID */
public static final String COLUMNNAME_Invoice_C_DocType_ID = "Invoice_C_DocType_ID";
/** Set IsModifySOPriceList.
@param IsModifySOPriceList IsModifySOPriceList */
public void setIsModifySOPriceList (boolean IsModifySOPriceList)
{
set_Value (COLUMNNAME_IsModifySOPriceList, Boolean.valueOf(IsModifySOPriceList));
}
/** Get IsModifySOPriceList.
@return IsModifySOPriceList */
public boolean isModifySOPriceList() 
{
Object oo = get_Value(COLUMNNAME_IsModifySOPriceList);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="1a1ccc67-c5f1-f7ef-1a42-044af503fc06")
public static String es_PE_FIELD_POP_IsModifySOPriceList_Name="Modifica Precio de Venta";

@XendraField(AD_Column_ID="IsModifySOPriceList",IsCentrallyMaintained=true,
AD_Tab_ID="c584259a-7aac-72bf-24e6-39324a0f8b0f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=180,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1a1ccc67-c5f1-f7ef-1a42-044af503fc06")
public static final String FIELDNAME_POP_IsModifySOPriceList="1a1ccc67-c5f1-f7ef-1a42-044af503fc06";

@XendraTrl(Identifier="4510f808-7062-e2b0-3d75-d52693effc6d")
public static String es_PE_COLUMN_IsModifySOPriceList_Name="IsModifySOPriceList";

@XendraColumn(AD_Element_ID="d3c7a5fc-4383-ab17-f390-9a7e9fec7cc2",
ColumnName="IsModifySOPriceList",AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="N",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="4510f808-7062-e2b0-3d75-d52693effc6d",Synchronized="2019-08-30 22:22:03.0")
/** Column name IsModifySOPriceList */
public static final String COLUMNNAME_IsModifySOPriceList = "IsModifySOPriceList";
/** Set M_PriceList_ID.
@param M_PriceList_ID Unique identifier of a Price List */
public void setM_PriceList_ID (int M_PriceList_ID)
{
if (M_PriceList_ID <= 0) set_Value (COLUMNNAME_M_PriceList_ID, null);
 else 
set_Value (COLUMNNAME_M_PriceList_ID, Integer.valueOf(M_PriceList_ID));
}
/** Get M_PriceList_ID.
@return Unique identifier of a Price List */
public int getM_PriceList_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_PriceList_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="18923be6-c4d3-4d96-96f8-bc7cfcd3de53")
public static String es_PE_COLUMN_M_PriceList_ID_Name="M_PriceList_ID";

@XendraColumn(AD_Element_ID="652afdd3-9ff1-082d-5831-6aad828e0e09",ColumnName="M_PriceList_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="18923be6-c4d3-4d96-96f8-bc7cfcd3de53",
Synchronized="2019-08-30 22:22:03.0")
/** Column name M_PriceList_ID */
public static final String COLUMNNAME_M_PriceList_ID = "M_PriceList_ID";
/** Set Price List Version.
@param M_PriceList_Version_ID Identifies a unique instance of a Price List */
public void setM_PriceList_Version_ID (int M_PriceList_Version_ID)
{
if (M_PriceList_Version_ID < 1) throw new IllegalArgumentException ("M_PriceList_Version_ID is mandatory.");
set_Value (COLUMNNAME_M_PriceList_Version_ID, Integer.valueOf(M_PriceList_Version_ID));
}
/** Get Price List Version.
@return Identifies a unique instance of a Price List */
public int getM_PriceList_Version_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_PriceList_Version_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="00899654-94af-4011-11c0-7fbb3beeca96")
public static String es_PE_FIELD_POP_PriceListVersion_Name="Versión de Lista de Precios";

@XendraTrl(Identifier="00899654-94af-4011-11c0-7fbb3beeca96")
public static String es_PE_FIELD_POP_PriceListVersion_Description="Identifica una instancia única de una lista de precios";

@XendraTrl(Identifier="00899654-94af-4011-11c0-7fbb3beeca96")
public static String es_PE_FIELD_POP_PriceListVersion_Help="Cada lista de precios puede tener múltiples versiones. El uso más común es indicar las fechas en que es válida una lista de precios.";

@XendraField(AD_Column_ID="M_PriceList_Version_ID",IsCentrallyMaintained=true,
AD_Tab_ID="c584259a-7aac-72bf-24e6-39324a0f8b0f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=0,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="00899654-94af-4011-11c0-7fbb3beeca96")
public static final String FIELDNAME_POP_PriceListVersion="00899654-94af-4011-11c0-7fbb3beeca96";

@XendraTrl(Identifier="635e8248-e722-9717-1b03-a1e06eec4755")
public static String es_PE_COLUMN_M_PriceList_Version_ID_Name="Versión de Lista de Precios";

@XendraColumn(AD_Element_ID="6c31f4d5-58fe-0b61-33f1-e2549c3f35f6",
ColumnName="M_PriceList_Version_ID",AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="635e8248-e722-9717-1b03-a1e06eec4755",Synchronized="2019-08-30 22:22:03.0")
/** Column name M_PriceList_Version_ID */
public static final String COLUMNNAME_M_PriceList_Version_ID = "M_PriceList_Version_ID";
/** Set M_PriceSalesList_ID.
@param M_PriceSalesList_ID M_PriceSalesList_ID */
public void setM_PriceSalesList_ID (int M_PriceSalesList_ID)
{
if (M_PriceSalesList_ID <= 0) set_Value (COLUMNNAME_M_PriceSalesList_ID, null);
 else 
set_Value (COLUMNNAME_M_PriceSalesList_ID, Integer.valueOf(M_PriceSalesList_ID));
}
/** Get M_PriceSalesList_ID.
@return M_PriceSalesList_ID */
public int getM_PriceSalesList_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_PriceSalesList_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="c6c75364-651d-909f-2f73-0f14b5538ae2")
public static String es_PE_FIELD_POP_M_PriceSalesList_ID_Name="Lista de Precio Ventas";

@XendraField(AD_Column_ID="M_PriceSalesList_ID",IsCentrallyMaintained=true,
AD_Tab_ID="c584259a-7aac-72bf-24e6-39324a0f8b0f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=160,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c6c75364-651d-909f-2f73-0f14b5538ae2")
public static final String FIELDNAME_POP_M_PriceSalesList_ID="c6c75364-651d-909f-2f73-0f14b5538ae2";

@XendraTrl(Identifier="d84c967a-83a1-2d26-d4c8-95a4df74c7b2")
public static String es_PE_COLUMN_M_PriceSalesList_ID_Name="m_pricesaleslist_id";

@XendraColumn(AD_Element_ID="714031ed-baca-16b0-d6a5-283b2c86f971",
ColumnName="M_PriceSalesList_ID",AD_Reference_ID=18,
AD_Reference_Value_ID="a20c07c8-1fb7-74c6-ec9d-66afd2d29682",AD_Val_Rule_ID="",FieldLength=10,
DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,
ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",
ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,
ColumnSQL="",IsAllowLogging=false,Identifier="d84c967a-83a1-2d26-d4c8-95a4df74c7b2",
Synchronized="2019-08-30 22:22:03.0")
/** Column name M_PriceSalesList_ID */
public static final String COLUMNNAME_M_PriceSalesList_ID = "M_PriceSalesList_ID";
/** Set Warehouse.
@param M_Warehouse_ID Storage Warehouse and Service Point */
public void setM_Warehouse_ID (int M_Warehouse_ID)
{
if (M_Warehouse_ID <= 0) set_Value (COLUMNNAME_M_Warehouse_ID, null);
 else 
set_Value (COLUMNNAME_M_Warehouse_ID, Integer.valueOf(M_Warehouse_ID));
}
/** Get Warehouse.
@return Storage Warehouse and Service Point */
public int getM_Warehouse_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_Warehouse_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="cc8def18-6896-fa9f-2338-6d4eb039bb1e")
public static String es_PE_COLUMN_M_Warehouse_ID_Name="Warehouse";

@XendraColumn(AD_Element_ID="402045cd-baa5-aeaf-b148-a921dffb7821",ColumnName="M_Warehouse_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="cc8def18-6896-fa9f-2338-6d4eb039bb1e",
Synchronized="2019-08-30 22:22:03.0")
/** Column name M_Warehouse_ID */
public static final String COLUMNNAME_M_Warehouse_ID = "M_Warehouse_ID";
/** Set Name.
@param Name Alphanumeric identifier of the entity */
public void setName (String Name)
{
if (Name != null && Name.length() > 60)
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
@XendraTrl(Identifier="0c7fe498-4c83-6571-ac5f-f8535fc8ec31")
public static String es_PE_FIELD_POP_Name_Name="Nombre";

@XendraTrl(Identifier="0c7fe498-4c83-6571-ac5f-f8535fc8ec31")
public static String es_PE_FIELD_POP_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="0c7fe498-4c83-6571-ac5f-f8535fc8ec31")
public static String es_PE_FIELD_POP_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraField(AD_Column_ID="Name",IsCentrallyMaintained=true,
AD_Tab_ID="c584259a-7aac-72bf-24e6-39324a0f8b0f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0c7fe498-4c83-6571-ac5f-f8535fc8ec31")
public static final String FIELDNAME_POP_Name="0c7fe498-4c83-6571-ac5f-f8535fc8ec31";

@XendraTrl(Identifier="a8cec636-af00-97ed-787d-d6d04a7b0969")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a8cec636-af00-97ed-787d-d6d04a7b0969",
Synchronized="2019-08-30 22:22:03.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
/** Set Order_C_DocType_ID.
@param Order_C_DocType_ID Document type or rules */
public void setOrder_C_DocType_ID (int Order_C_DocType_ID)
{
if (Order_C_DocType_ID < 1) throw new IllegalArgumentException ("Order_C_DocType_ID is mandatory.");
set_Value (COLUMNNAME_Order_C_DocType_ID, Integer.valueOf(Order_C_DocType_ID));
}
/** Get Order_C_DocType_ID.
@return Document type or rules */
public int getOrder_C_DocType_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_Order_C_DocType_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="f6faed37-05ff-e828-5b1a-ef02589361be")
public static String es_PE_FIELD_POP_Order_C_DocType_ID_Name="Tipo de Documento";

@XendraTrl(Identifier="f6faed37-05ff-e828-5b1a-ef02589361be")
public static String es_PE_FIELD_POP_Order_C_DocType_ID_Description="Tipo de documento ó reglas";

@XendraTrl(Identifier="f6faed37-05ff-e828-5b1a-ef02589361be")
public static String es_PE_FIELD_POP_Order_C_DocType_ID_Help="El tipo de documento determina la secuencia del documento y las reglas de proceso";

@XendraField(AD_Column_ID="Order_C_DocType_ID",IsCentrallyMaintained=true,
AD_Tab_ID="c584259a-7aac-72bf-24e6-39324a0f8b0f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=140,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f6faed37-05ff-e828-5b1a-ef02589361be")
public static final String FIELDNAME_POP_Order_C_DocType_ID="f6faed37-05ff-e828-5b1a-ef02589361be";

@XendraTrl(Identifier="f38f1afc-bf92-715d-f896-a045cc1de8b1")
public static String es_PE_COLUMN_Order_C_DocType_ID_Name="Tipo de Documento";

@XendraColumn(AD_Element_ID="2c8dfc82-26a0-1613-7979-a31976af6af7",ColumnName="Order_C_DocType_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="f06eaf85-a231-e1cf-ebf8-59d002c13ab4",
AD_Val_Rule_ID="414bc984-a505-7a92-1bb2-cb6bbdf3fb10",FieldLength=10,DefaultValue="",IsKey=false,
IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f38f1afc-bf92-715d-f896-a045cc1de8b1",
Synchronized="2019-08-30 22:22:03.0")
/** Column name Order_C_DocType_ID */
public static final String COLUMNNAME_Order_C_DocType_ID = "Order_C_DocType_ID";
/** Set Properties.
@param Properties Properties */
public void setProperties (HashMap Properties)
{
set_Value (COLUMNNAME_Properties, Properties);
}
/** Get Properties.
@return Properties */
public HashMap getProperties() 
{
HashMap propsrc = (HashMap)get_Value(COLUMNNAME_Properties);
if (propsrc == null) return new HashMap();
 HashMap propdst = (HashMap) propsrc.clone();
return propdst;
}

@XendraTrl(Identifier="8477d18f-e00d-40cd-b1dc-9f46393cd1cc")
public static String es_PE_COLUMN_Properties_Name="Properties";

@XendraColumn(AD_Element_ID="acc3987b-292c-475a-86b5-5104970a96f3",ColumnName="Properties",
AD_Reference_ID=46,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="8477d18f-e00d-40cd-b1dc-9f46393cd1cc",
Synchronized="2019-08-30 22:22:03.0")
/** Column name Properties */
public static final String COLUMNNAME_Properties = "Properties";
}
