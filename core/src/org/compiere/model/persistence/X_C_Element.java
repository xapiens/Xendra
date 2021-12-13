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
/** Generated Model for C_Element
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_C_Element extends PO
{
/** Standard Constructor
@param ctx context
@param C_Element_ID id
@param trxName transaction
*/
public X_C_Element (Properties ctx, int C_Element_ID, String trxName)
{
super (ctx, C_Element_ID, trxName);
/** if (C_Element_ID == 0)
{
setAD_Tree_ID (0);
setC_Element_ID (0);
setElementType (null);	
// A
setIsBalancing (false);	
// N
setIsNaturalAccount (false);	
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
public X_C_Element (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=142 */
public static int Table_ID=MTable.getTable_ID("C_Element");

@XendraTrl(Identifier="4714a449-c106-9244-66e5-58aa04b42ba3")
public static String es_PE_TAB_Element_Description="Definir Elemento de cuenta";

@XendraTrl(Identifier="4714a449-c106-9244-66e5-58aa04b42ba3")
public static String es_PE_TAB_Element_Help="La pestaña de elementos define el nombre; descripción y formato de los elementos.";

@XendraTrl(Identifier="4714a449-c106-9244-66e5-58aa04b42ba3")
public static String es_PE_TAB_Element_Name="Plan Contable";
@XendraTab(Name="Element",
Description="Account Element definition",
Help="The Element Tab defines the Name, Description and Format for an Element.  Additionally, a Type of Account or User Defined is selected. Each Account Schema must have an Account Element type.  The User Defined Elements are optional.",
AD_Window_ID="ed28a38f-7f48-c102-93c3-c8952924b221",SeqNo=10,TabLevel=0,IsSingleRow=true,
IsInfoTab=true,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="4714a449-c106-9244-66e5-58aa04b42ba3",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Element="4714a449-c106-9244-66e5-58aa04b42ba3";

@XendraTrl(Identifier="c7befe81-b307-6f97-298a-cdef3f9edf4a")
public static String es_PE_TABLE_C_Element_Name="Elemento";

@XendraTable(Name="Element",AD_Package_ID="2ac04657-d663-47c2-4ec1-927ad71f1e96",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="Accounting Element",Help="",
TableName="C_Element",AccessLevel="2",AD_Window_ID="ed28a38f-7f48-c102-93c3-c8952924b221",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=95,IsSecurityEnabled=false,IsDeleteable=false,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.accounting",
Identifier="c7befe81-b307-6f97-298a-cdef3f9edf4a",Synchronized="2020-03-03 21:36:54.0")
/** TableName=C_Element */
public static final String Table_Name="C_Element";


@XendraIndex(Name="c_element_name",Identifier="42e798de-4905-62d7-de58-52892231d2e1",
Column_Names="ad_client_id, name",IsUnique="true",
TableIdentifier="42e798de-4905-62d7-de58-52892231d2e1",Synchronized="2014-06-01 19:03:58.0")
public static final String INDEXNAME_c_element_name = "42e798de-4905-62d7-de58-52892231d2e1";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"C_Element");

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
    Table_ID = MTable.getTable_ID("C_Element");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_C_Element[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Tree.
@param AD_Tree_ID Identifies a Tree */
public void setAD_Tree_ID (int AD_Tree_ID)
{
if (AD_Tree_ID < 1) throw new IllegalArgumentException ("AD_Tree_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_AD_Tree_ID, Integer.valueOf(AD_Tree_ID));
}
/** Get Tree.
@return Identifies a Tree */
public int getAD_Tree_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Tree_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="72cf692b-5ae6-2bc7-0165-51244332d61f")
public static String es_PE_FIELD_Element_Tree_Name="Árbol";

@XendraTrl(Identifier="72cf692b-5ae6-2bc7-0165-51244332d61f")
public static String es_PE_FIELD_Element_Tree_Description="Identifica un árbol";

@XendraTrl(Identifier="72cf692b-5ae6-2bc7-0165-51244332d61f")
public static String es_PE_FIELD_Element_Tree_Help="El campo árbol identifica un árbol único en el sistema. Los árboles definen niveles sumarios o de roll up de información. Son usados en Informes para definir niveles de sumarización y puntos del Informe";

@XendraField(AD_Column_ID="AD_Tree_ID",IsCentrallyMaintained=true,
AD_Tab_ID="4714a449-c106-9244-66e5-58aa04b42ba3",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="72cf692b-5ae6-2bc7-0165-51244332d61f")
public static final String FIELDNAME_Element_Tree="72cf692b-5ae6-2bc7-0165-51244332d61f";

@XendraTrl(Identifier="c2e18738-ac37-af59-b53a-779ccaacacc4")
public static String es_PE_COLUMN_AD_Tree_ID_Name="Árbol";

@XendraColumn(AD_Element_ID="508a9d7a-21fa-0280-ccad-9b24fc387a77",ColumnName="AD_Tree_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="0eab8314-f495-4c79-cfdc-7920053b0e41",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="c2e18738-ac37-af59-b53a-779ccaacacc4",Synchronized="2019-08-30 22:21:34.0")
/** Column name AD_Tree_ID */
public static final String COLUMNNAME_AD_Tree_ID = "AD_Tree_ID";
/** Set Element.
@param C_Element_ID Accounting Element */
public void setC_Element_ID (int C_Element_ID)
{
if (C_Element_ID < 1) throw new IllegalArgumentException ("C_Element_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_Element_ID, Integer.valueOf(C_Element_ID));
}
/** Get Element.
@return Accounting Element */
public int getC_Element_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Element_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="caf5ee3d-b7f2-ddca-72f3-7fe08343c835")
public static String es_PE_FIELD_Element_Element_Name="Elemento";

@XendraTrl(Identifier="caf5ee3d-b7f2-ddca-72f3-7fe08343c835")
public static String es_PE_FIELD_Element_Element_Description="Elemento de Cuenta";

@XendraTrl(Identifier="caf5ee3d-b7f2-ddca-72f3-7fe08343c835")
public static String es_PE_FIELD_Element_Element_Help="El elemento cuenta identifica únicamente una cuenta. El conjunto es conocido comúnmente como catálogo de cuentas";

@XendraField(AD_Column_ID="C_Element_ID",IsCentrallyMaintained=true,
AD_Tab_ID="4714a449-c106-9244-66e5-58aa04b42ba3",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=10,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="caf5ee3d-b7f2-ddca-72f3-7fe08343c835")
public static final String FIELDNAME_Element_Element="caf5ee3d-b7f2-ddca-72f3-7fe08343c835";
/** Column name C_Element_ID */
public static final String COLUMNNAME_C_Element_ID = "C_Element_ID";
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

@XendraTrl(Identifier="e7715fdd-b43c-ed0f-8e4c-5f95114c3b73")
public static String es_PE_FIELD_Element_Description_Name="Observación";

@XendraTrl(Identifier="e7715fdd-b43c-ed0f-8e4c-5f95114c3b73")
public static String es_PE_FIELD_Element_Description_Description="Observación";

@XendraTrl(Identifier="e7715fdd-b43c-ed0f-8e4c-5f95114c3b73")
public static String es_PE_FIELD_Element_Description_Help="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="4714a449-c106-9244-66e5-58aa04b42ba3",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e7715fdd-b43c-ed0f-8e4c-5f95114c3b73")
public static final String FIELDNAME_Element_Description="e7715fdd-b43c-ed0f-8e4c-5f95114c3b73";

@XendraTrl(Identifier="2382f474-90c7-a55f-a8db-88ee7f4e4024")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2382f474-90c7-a55f-a8db-88ee7f4e4024",
Synchronized="2019-08-30 22:21:34.0")
/** Column name Description */
public static final String COLUMNNAME_Description = "Description";
/** Set Type.
@param ElementType Element Type (account or user defined) */
public void setElementType (String ElementType)
{
if (ElementType.length() > 1)
{
log.warning("Length > 1 - truncated");
ElementType = ElementType.substring(0,0);
}
set_ValueNoCheck (COLUMNNAME_ElementType, ElementType);
}
/** Get Type.
@return Element Type (account or user defined) */
public String getElementType() 
{
return (String)get_Value(COLUMNNAME_ElementType);
}

@XendraTrl(Identifier="36b2c1b6-67da-269e-e322-43a3f5f7f952")
public static String es_PE_FIELD_Element_Type_Name="Tipo";

@XendraTrl(Identifier="36b2c1b6-67da-269e-e322-43a3f5f7f952")
public static String es_PE_FIELD_Element_Type_Description="Tipo de Elemento (cuenta ó definido por el usuario)";

@XendraTrl(Identifier="36b2c1b6-67da-269e-e322-43a3f5f7f952")
public static String es_PE_FIELD_Element_Type_Help="Indica si este elemento es el elemento cuenta ó es un elemento definido por el usuario";

@XendraField(AD_Column_ID="ElementType",IsCentrallyMaintained=true,
AD_Tab_ID="4714a449-c106-9244-66e5-58aa04b42ba3",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="36b2c1b6-67da-269e-e322-43a3f5f7f952")
public static final String FIELDNAME_Element_Type="36b2c1b6-67da-269e-e322-43a3f5f7f952";

@XendraTrl(Identifier="af3981e9-5a03-e4b1-5cd2-c6d810de84b2")
public static String es_PE_COLUMN_ElementType_Name="Tipo";

@XendraColumn(AD_Element_ID="3c5013c0-9720-b812-2dd4-b97cb379d525",ColumnName="ElementType",
AD_Reference_ID=17,AD_Reference_Value_ID="06ba249a-d8a9-09ef-c38f-d7e00896f167",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="A",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="af3981e9-5a03-e4b1-5cd2-c6d810de84b2",Synchronized="2019-08-30 22:21:34.0")
/** Column name ElementType */
public static final String COLUMNNAME_ElementType = "ElementType";
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
@XendraTrl(Identifier="2f71d5b8-33f5-43d9-b022-b41436f6b888")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2f71d5b8-33f5-43d9-b022-b41436f6b888",
Synchronized="2019-08-30 22:21:34.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Balancing.
@param IsBalancing All transactions within an element value must balance (e.g. cost centers) */
public void setIsBalancing (boolean IsBalancing)
{
set_Value (COLUMNNAME_IsBalancing, Boolean.valueOf(IsBalancing));
}
/** Get Balancing.
@return All transactions within an element value must balance (e.g. cost centers) */
public boolean isBalancing() 
{
Object oo = get_Value(COLUMNNAME_IsBalancing);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="f21ec6e3-8167-9aea-37b4-b38305a84609")
public static String es_PE_FIELD_Element_Balancing_Name="Balanceando";

@XendraTrl(Identifier="f21ec6e3-8167-9aea-37b4-b38305a84609")
public static String es_PE_FIELD_Element_Balancing_Description="Todas las transacciones dentro de un elemento deben balancear (Ej. Centros de Costo)";

@XendraTrl(Identifier="f21ec6e3-8167-9aea-37b4-b38305a84609")
public static String es_PE_FIELD_Element_Balancing_Help="El Cuadro de Verificación Balanceo indica si este elemento debe balancear en cada transacción de póliza. Por Ej. Si han sido definidos centros de costo como elementos balanceados entonces los débitos y créditos para cada centro de costo único deben netear a 0.00";

@XendraField(AD_Column_ID="IsBalancing",IsCentrallyMaintained=true,
AD_Tab_ID="4714a449-c106-9244-66e5-58aa04b42ba3",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@ElementType@=U",DisplayLength=1,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f21ec6e3-8167-9aea-37b4-b38305a84609")
public static final String FIELDNAME_Element_Balancing="f21ec6e3-8167-9aea-37b4-b38305a84609";

@XendraTrl(Identifier="a9bb30d6-6c3b-e5cd-f8d1-075940049bdc")
public static String es_PE_COLUMN_IsBalancing_Name="Balanceando";

@XendraColumn(AD_Element_ID="2ce0569a-c7c8-5caf-4193-07fe3caa6126",ColumnName="IsBalancing",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a9bb30d6-6c3b-e5cd-f8d1-075940049bdc",
Synchronized="2019-08-30 22:21:34.0")
/** Column name IsBalancing */
public static final String COLUMNNAME_IsBalancing = "IsBalancing";
/** Set Natural Account.
@param IsNaturalAccount The primary natural account */
public void setIsNaturalAccount (boolean IsNaturalAccount)
{
set_Value (COLUMNNAME_IsNaturalAccount, Boolean.valueOf(IsNaturalAccount));
}
/** Get Natural Account.
@return The primary natural account */
public boolean isNaturalAccount() 
{
Object oo = get_Value(COLUMNNAME_IsNaturalAccount);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="15351d36-0418-a1b5-44dc-c92466077b47")
public static String es_PE_FIELD_Element_NaturalAccount_Name="Cuenta Natural";

@XendraTrl(Identifier="15351d36-0418-a1b5-44dc-c92466077b47")
public static String es_PE_FIELD_Element_NaturalAccount_Description="La cuenta natural primaria";

@XendraTrl(Identifier="15351d36-0418-a1b5-44dc-c92466077b47")
public static String es_PE_FIELD_Element_NaturalAccount_Help="La cuenta natural está frecuentemente basada en catálogo de cuenta (específico de la industria)";

@XendraField(AD_Column_ID="IsNaturalAccount",IsCentrallyMaintained=true,
AD_Tab_ID="4714a449-c106-9244-66e5-58aa04b42ba3",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@ElementType@!U",DisplayLength=1,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="15351d36-0418-a1b5-44dc-c92466077b47")
public static final String FIELDNAME_Element_NaturalAccount="15351d36-0418-a1b5-44dc-c92466077b47";

@XendraTrl(Identifier="34cc3bdf-8366-8083-39d8-b180bf5c5eb1")
public static String es_PE_COLUMN_IsNaturalAccount_Name="Cuenta Natural";

@XendraColumn(AD_Element_ID="5bb45cb4-97d7-a83d-f28a-10512e06b6bb",ColumnName="IsNaturalAccount",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="34cc3bdf-8366-8083-39d8-b180bf5c5eb1",
Synchronized="2019-08-30 22:21:34.0")
/** Column name IsNaturalAccount */
public static final String COLUMNNAME_IsNaturalAccount = "IsNaturalAccount";
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

@XendraTrl(Identifier="c1cc3b79-6551-4cf1-da73-843dfa020d7a")
public static String es_PE_FIELD_Element_Name_Name="Nombre";

@XendraTrl(Identifier="c1cc3b79-6551-4cf1-da73-843dfa020d7a")
public static String es_PE_FIELD_Element_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="c1cc3b79-6551-4cf1-da73-843dfa020d7a")
public static String es_PE_FIELD_Element_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraField(AD_Column_ID="Name",IsCentrallyMaintained=true,
AD_Tab_ID="4714a449-c106-9244-66e5-58aa04b42ba3",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=40,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c1cc3b79-6551-4cf1-da73-843dfa020d7a")
public static final String FIELDNAME_Element_Name="c1cc3b79-6551-4cf1-da73-843dfa020d7a";

@XendraTrl(Identifier="5cde1c17-9014-b944-6bba-d3fc70c7d2af")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5cde1c17-9014-b944-6bba-d3fc70c7d2af",
Synchronized="2019-08-30 22:21:34.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
/** Set Value Format.
@param VFormat Format of the value: Can contain fixed format elements, Variables: '_lLoOaAcCa09' */
public void setVFormat (String VFormat)
{
if (VFormat != null && VFormat.length() > 40)
{
log.warning("Length > 40 - truncated");
VFormat = VFormat.substring(0,39);
}
set_Value (COLUMNNAME_VFormat, VFormat);
}
/** Get Value Format.
@return Format of the value: Can contain fixed format elements, Variables: '_lLoOaAcCa09' */
public String getVFormat() 
{
String value = (String)get_Value(COLUMNNAME_VFormat);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="aab79fb9-24e7-5510-afe2-9353ab6b21af")
public static String es_PE_FIELD_Element_ValueFormat_Name="Formato del Valor";

@XendraTrl(Identifier="aab79fb9-24e7-5510-afe2-9353ab6b21af")
public static String es_PE_FIELD_Element_ValueFormat_Description="Formato del valor; puede contener elementos de formato fijo; Variables: \"_lLoOaAcCa09\"";

@XendraTrl(Identifier="aab79fb9-24e7-5510-afe2-9353ab6b21af")
public static String es_PE_FIELD_Element_ValueFormat_Help="<B>Elementos de validación:</B>";

@XendraField(AD_Column_ID="VFormat",IsCentrallyMaintained=true,
AD_Tab_ID="4714a449-c106-9244-66e5-58aa04b42ba3",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="aab79fb9-24e7-5510-afe2-9353ab6b21af")
public static final String FIELDNAME_Element_ValueFormat="aab79fb9-24e7-5510-afe2-9353ab6b21af";

@XendraTrl(Identifier="fcf12a08-c5be-4ec8-0c51-bbc0565a9e4a")
public static String es_PE_COLUMN_VFormat_Name="Formato del Valor";

@XendraColumn(AD_Element_ID="041d14f4-3102-bf3a-cf36-5153817cbfad",ColumnName="VFormat",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="fcf12a08-c5be-4ec8-0c51-bbc0565a9e4a",
Synchronized="2019-08-30 22:21:34.0")
/** Column name VFormat */
public static final String COLUMNNAME_VFormat = "VFormat";
}
