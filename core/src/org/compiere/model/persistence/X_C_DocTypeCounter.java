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
import org.compiere.model.reference.REF__DocumentAction;
/** Generated Model for C_DocTypeCounter
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_C_DocTypeCounter extends PO
{
/** Standard Constructor
@param ctx context
@param C_DocTypeCounter_ID id
@param trxName transaction
*/
public X_C_DocTypeCounter (Properties ctx, int C_DocTypeCounter_ID, String trxName)
{
super (ctx, C_DocTypeCounter_ID, trxName);
/** if (C_DocTypeCounter_ID == 0)
{
setC_DocTypeCounter_ID (0);
setC_DocType_ID (0);
setCounter_C_DocType_ID (0);
setIsCreateCounter (true);	
// Y
setIsValid (false);	
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
public X_C_DocTypeCounter (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=718 */
public static int Table_ID=MTable.getTable_ID("C_DocTypeCounter");

@XendraTrl(Identifier="d9660071-60ea-01d5-e076-c8b8cec3e62f")
public static String es_PE_TAB_CounterDocument_Description="Mantenimiento a los tipos de Contra Documentos";

@XendraTrl(Identifier="d9660071-60ea-01d5-e076-c8b8cec3e62f")
public static String es_PE_TAB_CounterDocument_Name="Contador de Documentos";

@XendraTrl(Identifier="d9660071-60ea-01d5-e076-c8b8cec3e62f")
public static String es_PE_TAB_CounterDocument_Help="Al usar los documentos explícitos para la transacción inter-organización (después de ligar a un socio de negocio a una organización), usted puede determinarse qué tipo de documento se basa el documento contrario en el tipo de documento de la transacción original. Ejemplo: una \"orden estándar\" crea un \"PO estándar\".Si usted define una relación aquí, usted sobreescribe el documento del contador de defecto de mecanografía adentro de la definición de tipo de documento. Esto permite que usted defina traz específico.Usted puede definir el contra de documentos para todas las organizaciones (de la transacción original) ó para una organización específica.";

@XendraTab(Name="Counter Document",Description="Maintain Counter Document Types",
Help="When using explicit documents for inter-org transaction (after linking a Business Partner to an Organization), you can determine what document type the counter document is based on the document type of the original transaction.  Example: a 'Standard Order' creates a 'Standard PO'.  If you define a relationship here, you overwrite the default counter document type in the Document Type definition. This allows you to define a specific mapping. You can define conter documents for all organizations (of the original transaction) or for a specific organization.",
AD_Window_ID="ed217f22-5c28-bb5e-dcc4-5e27f3875de5",SeqNo=10,TabLevel=0,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="d9660071-60ea-01d5-e076-c8b8cec3e62f",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_CounterDocument="d9660071-60ea-01d5-e076-c8b8cec3e62f";

@XendraTrl(Identifier="6a283d9e-7042-bab5-c074-033b4d7cd7e3")
public static String es_PE_TABLE_C_DocTypeCounter_Name="Tipo de Contra Documento";

@XendraTable(Name="Counter Document",Description="Counter Document Relationship",Help="",
TableName="C_DocTypeCounter",AccessLevel="2",AD_Window_ID="ed217f22-5c28-bb5e-dcc4-5e27f3875de5",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=145,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.commercial",
Identifier="6a283d9e-7042-bab5-c074-033b4d7cd7e3",Synchronized="2017-08-16 11:41:44.0")
/** TableName=C_DocTypeCounter */
public static final String Table_Name="C_DocTypeCounter";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"C_DocTypeCounter");

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
    Table_ID = MTable.getTable_ID("C_DocTypeCounter");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_C_DocTypeCounter[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Counter Document.
@param C_DocTypeCounter_ID Counter Document Relationship */
public void setC_DocTypeCounter_ID (int C_DocTypeCounter_ID)
{
if (C_DocTypeCounter_ID < 1) throw new IllegalArgumentException ("C_DocTypeCounter_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_DocTypeCounter_ID, Integer.valueOf(C_DocTypeCounter_ID));
}
/** Get Counter Document.
@return Counter Document Relationship */
public int getC_DocTypeCounter_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_DocTypeCounter_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="fec31d90-56a7-8c08-ae07-776f77732529")
public static String es_PE_FIELD_CounterDocument_CounterDocument_Description="Tipo de Contra Documento";

@XendraTrl(Identifier="fec31d90-56a7-8c08-ae07-776f77732529")
public static String es_PE_FIELD_CounterDocument_CounterDocument_Help="Cuando usan los documentos explícitos para la inter-org transacción (después de ligar a un socio de negocio a una organización), usted puede determinar qué tipo de documento se basa en el documento contrario en el tipo del documento de la transacción original, ejemplo: una \"Orden Estandard\" crear un \"PO Standard\".Si usted define una relación aquí, usted sobreescribe el tipo de documento del contador del defecto en la definición del tipo de documento. Esto permite que usted defina en específico.";

@XendraTrl(Identifier="fec31d90-56a7-8c08-ae07-776f77732529")
public static String es_PE_FIELD_CounterDocument_CounterDocument_Name="Tipo de Contra Documento";

@XendraField(AD_Column_ID="C_DocTypeCounter_ID",IsCentrallyMaintained=true,
AD_Tab_ID="d9660071-60ea-01d5-e076-c8b8cec3e62f",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="fec31d90-56a7-8c08-ae07-776f77732529")
public static final String FIELDNAME_CounterDocument_CounterDocument="fec31d90-56a7-8c08-ae07-776f77732529";
/** Column name C_DocTypeCounter_ID */
public static final String COLUMNNAME_C_DocTypeCounter_ID = "C_DocTypeCounter_ID";
/** Set Document Type.
@param C_DocType_ID Document type or rules */
public void setC_DocType_ID (int C_DocType_ID)
{
if (C_DocType_ID < 0) throw new IllegalArgumentException ("C_DocType_ID is mandatory.");
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

@XendraTrl(Identifier="e09a7f35-8434-456e-ba8d-da694c0ac736")
public static String es_PE_FIELD_CounterDocument_DocumentType_Description="Tipo de documento ó reglas";

@XendraTrl(Identifier="e09a7f35-8434-456e-ba8d-da694c0ac736")
public static String es_PE_FIELD_CounterDocument_DocumentType_Help="El tipo de documento determina la secuencia del documento y las reglas de proceso";

@XendraTrl(Identifier="e09a7f35-8434-456e-ba8d-da694c0ac736")
public static String es_PE_FIELD_CounterDocument_DocumentType_Name="Tipo de Documento";

@XendraField(AD_Column_ID="C_DocType_ID",IsCentrallyMaintained=true,
AD_Tab_ID="d9660071-60ea-01d5-e076-c8b8cec3e62f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e09a7f35-8434-456e-ba8d-da694c0ac736")
public static final String FIELDNAME_CounterDocument_DocumentType="e09a7f35-8434-456e-ba8d-da694c0ac736";

@XendraTrl(Identifier="47b6ca98-01cf-c8f8-5c8d-c1d9bd80bd36")
public static String es_PE_COLUMN_C_DocType_ID_Name="Tipo de Documento";

@XendraColumn(AD_Element_ID="099a4147-1a72-cdd0-81e0-8bdbc8c0b883",ColumnName="C_DocType_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="47b6ca98-01cf-c8f8-5c8d-c1d9bd80bd36",
Synchronized="2017-08-05 16:53:36.0")
/** Column name C_DocType_ID */
public static final String COLUMNNAME_C_DocType_ID = "C_DocType_ID";

/** Counter_C_DocType_ID AD_Reference=f06eaf85-a231-e1cf-ebf8-59d002c13ab4 */
public static final int COUNTER_C_DOCTYPE_ID_AD_Reference_ID=170;
/** Set Counter Document Type.
@param Counter_C_DocType_ID Generated Counter Document Type (To) */
public void setCounter_C_DocType_ID (int Counter_C_DocType_ID)
{
if (Counter_C_DocType_ID < 1) throw new IllegalArgumentException ("Counter_C_DocType_ID is mandatory.");
set_Value (COLUMNNAME_Counter_C_DocType_ID, Integer.valueOf(Counter_C_DocType_ID));
}
/** Get Counter Document Type.
@return Generated Counter Document Type (To) */
public int getCounter_C_DocType_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_Counter_C_DocType_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="b126c17b-f183-c8f3-c8d4-94881fb35bdf")
public static String es_PE_FIELD_CounterDocument_CounterDocumentType_Description="Tipo Generado de Contador de Documento.";

@XendraTrl(Identifier="b126c17b-f183-c8f3-c8d4-94881fb35bdf")
public static String es_PE_FIELD_CounterDocument_CounterDocumentType_Help="El tipo de documento del documento contrario generado.";

@XendraTrl(Identifier="b126c17b-f183-c8f3-c8d4-94881fb35bdf")
public static String es_PE_FIELD_CounterDocument_CounterDocumentType_Name="Tipo Contador de Documento";

@XendraField(AD_Column_ID="Counter_C_DocType_ID",IsCentrallyMaintained=true,
AD_Tab_ID="d9660071-60ea-01d5-e076-c8b8cec3e62f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsCreateCounter@=Y",DisplayLength=14,IsReadOnly=false,SeqNo=80,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="b126c17b-f183-c8f3-c8d4-94881fb35bdf")
public static final String FIELDNAME_CounterDocument_CounterDocumentType="b126c17b-f183-c8f3-c8d4-94881fb35bdf";

@XendraTrl(Identifier="2c2c6837-dc74-251a-a9e3-6e4f8abf2384")
public static String es_PE_COLUMN_Counter_C_DocType_ID_Name="Tipo Contador de Documento";

@XendraColumn(AD_Element_ID="002639f9-dfc5-ec83-0f38-f0bb605ba8f1",
ColumnName="Counter_C_DocType_ID",AD_Reference_ID=18,
AD_Reference_Value_ID="f06eaf85-a231-e1cf-ebf8-59d002c13ab4",AD_Val_Rule_ID="",FieldLength=22,
DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,
ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",
ValueMax="",Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,
ColumnSQL="",IsAllowLogging=false,Identifier="2c2c6837-dc74-251a-a9e3-6e4f8abf2384",
Synchronized="2017-08-05 16:53:36.0")
/** Column name Counter_C_DocType_ID */
public static final String COLUMNNAME_Counter_C_DocType_ID = "Counter_C_DocType_ID";
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

@XendraTrl(Identifier="5164b504-2a61-9d5f-53f6-42f5cd2b0133")
public static String es_PE_FIELD_CounterDocument_Description_Description="Observación corta opcional del registro";

@XendraTrl(Identifier="5164b504-2a61-9d5f-53f6-42f5cd2b0133")
public static String es_PE_FIELD_CounterDocument_Description_Help="Una Observación esta limitada a 255 caracteres";

@XendraTrl(Identifier="5164b504-2a61-9d5f-53f6-42f5cd2b0133")
public static String es_PE_FIELD_CounterDocument_Description_Name="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="d9660071-60ea-01d5-e076-c8b8cec3e62f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5164b504-2a61-9d5f-53f6-42f5cd2b0133")
public static final String FIELDNAME_CounterDocument_Description="5164b504-2a61-9d5f-53f6-42f5cd2b0133";

@XendraTrl(Identifier="a8557b97-39ce-133b-6222-ec2da6f93adf")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a8557b97-39ce-133b-6222-ec2da6f93adf",
Synchronized="2017-08-05 16:53:36.0")
/** Column name Description */
public static final String COLUMNNAME_Description = "Description";

/** DocAction AD_Reference=e397c9b0-c643-d1cd-8380-20bee13b2a6e */
public static final int DOCACTION_AD_Reference_ID=135;
/** Set Document Action.
@param DocAction The targeted status of the document */
public void setDocAction (String DocAction)
{
if (DocAction == null || DocAction.equals(REF__DocumentAction.Complete) || DocAction.equals(REF__DocumentAction.Approve) || DocAction.equals(REF__DocumentAction.Reject) || DocAction.equals(REF__DocumentAction.Post) || DocAction.equals(REF__DocumentAction.WaitComplete) || DocAction.equals(REF__DocumentAction.Prepare) || DocAction.equals(REF__DocumentAction.Close) || DocAction.equals(REF__DocumentAction.Placed) || DocAction.equals(REF__DocumentAction.Discount) || DocAction.equals(REF__DocumentAction.Portofolio) || DocAction.equals(REF__DocumentAction.Warranty) || DocAction.equals(REF__DocumentAction.Reverse_Correct) || DocAction.equals(REF__DocumentAction.Reverse_Accrual) || DocAction.equals(REF__DocumentAction.Invalidate) || DocAction.equals(REF__DocumentAction.Re_Activate) || DocAction.equals(REF__DocumentAction.None) || DocAction.equals(REF__DocumentAction.Unlock) || DocAction.equals(REF__DocumentAction.Returned) || DocAction.equals(REF__DocumentAction.Apply) || DocAction.equals(REF__DocumentAction.Collect) || DocAction.equals(REF__DocumentAction.ToCollect) || DocAction.equals(REF__DocumentAction.Restore) || DocAction.equals(REF__DocumentAction.Protested) || DocAction.equals(REF__DocumentAction.Receivables) || DocAction.equals(REF__DocumentAction.Void) || DocAction.equals(REF__DocumentAction.Draft) || DocAction.equals(REF__DocumentAction.InProgress) || DocAction.equals(REF__DocumentAction.WaitingPayment));
 else throw new IllegalArgumentException ("DocAction Invalid value - " + DocAction + " - Reference_ID=135 - CO - AP - RJ - PO - WC - PR - CL - PL - DS - PT - WR - RC - RA - IN - RE - -- - XL - RT - AY - CT - TC - RR - PD - RV - VO - DR - IP - WP");
if (DocAction != null && DocAction.length() > 2)
{
log.warning("Length > 2 - truncated");
DocAction = DocAction.substring(0,1);
}
set_Value (COLUMNNAME_DocAction, DocAction);
}
/** Get Document Action.
@return The targeted status of the document */
public String getDocAction() 
{
return (String)get_Value(COLUMNNAME_DocAction);
}

@XendraTrl(Identifier="d1ee9411-71ef-6a92-1be9-b7330a866f4a")
public static String es_PE_FIELD_CounterDocument_DocumentAction_Description="El estado destino del documento";

@XendraTrl(Identifier="d1ee9411-71ef-6a92-1be9-b7330a866f4a")
public static String es_PE_FIELD_CounterDocument_DocumentAction_Help="Usted encuentra el estado actual en el campo Estado del Documento";

@XendraTrl(Identifier="d1ee9411-71ef-6a92-1be9-b7330a866f4a")
public static String es_PE_FIELD_CounterDocument_DocumentAction_Name="Acción en el Documento";

@XendraField(AD_Column_ID="DocAction",IsCentrallyMaintained=true,
AD_Tab_ID="d9660071-60ea-01d5-e076-c8b8cec3e62f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsCreateCounter@=Y",DisplayLength=14,IsReadOnly=false,SeqNo=90,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="d1ee9411-71ef-6a92-1be9-b7330a866f4a")
public static final String FIELDNAME_CounterDocument_DocumentAction="d1ee9411-71ef-6a92-1be9-b7330a866f4a";

@XendraTrl(Identifier="648d1a76-e778-388e-ab40-40cbfb92df37")
public static String es_PE_COLUMN_DocAction_Name="Acción en el Documento";

@XendraColumn(AD_Element_ID="d4b9075b-18e5-ebbb-5565-d217a7e531cb",ColumnName="DocAction",
AD_Reference_ID=17,AD_Reference_Value_ID="e397c9b0-c643-d1cd-8380-20bee13b2a6e",AD_Val_Rule_ID="",
FieldLength=2,DefaultValue="--",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="648d1a76-e778-388e-ab40-40cbfb92df37",Synchronized="2017-08-05 16:53:36.0")
/** Column name DocAction */
public static final String COLUMNNAME_DocAction = "DocAction";
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
@XendraTrl(Identifier="859f9e04-9942-4b29-b8ca-44587d4b5e10")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="859f9e04-9942-4b29-b8ca-44587d4b5e10",
Synchronized="2017-08-05 16:53:36.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Create Counter Document.
@param IsCreateCounter Create Counter Document */
public void setIsCreateCounter (boolean IsCreateCounter)
{
set_Value (COLUMNNAME_IsCreateCounter, Boolean.valueOf(IsCreateCounter));
}
/** Get Create Counter Document.
@return Create Counter Document */
public boolean isCreateCounter() 
{
Object oo = get_Value(COLUMNNAME_IsCreateCounter);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="66edc0b1-c65e-4e9c-21bf-2c0a23e5ba59")
public static String es_PE_FIELD_CounterDocument_CreateCounterDocument_Description="Crea Contador de documento";

@XendraTrl(Identifier="66edc0b1-c65e-4e9c-21bf-2c0a23e5ba59")
public static String es_PE_FIELD_CounterDocument_CreateCounterDocument_Help="Si es seleccionado, crea un contador de documento especifico. Si no esta seleccionado, no crea contador de documento para el tipo de documento.";

@XendraTrl(Identifier="66edc0b1-c65e-4e9c-21bf-2c0a23e5ba59")
public static String es_PE_FIELD_CounterDocument_CreateCounterDocument_Name="Crea Contador de Documento";

@XendraField(AD_Column_ID="IsCreateCounter",IsCentrallyMaintained=true,
AD_Tab_ID="d9660071-60ea-01d5-e076-c8b8cec3e62f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="66edc0b1-c65e-4e9c-21bf-2c0a23e5ba59")
public static final String FIELDNAME_CounterDocument_CreateCounterDocument="66edc0b1-c65e-4e9c-21bf-2c0a23e5ba59";

@XendraTrl(Identifier="0478d095-35fb-3e82-f65e-9fe5f5933c59")
public static String es_PE_COLUMN_IsCreateCounter_Name="Crea Contador de Documento";

@XendraColumn(AD_Element_ID="176e0b61-2a2f-c5bc-b1ec-e15e5fa6e121",ColumnName="IsCreateCounter",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="Y",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0478d095-35fb-3e82-f65e-9fe5f5933c59",
Synchronized="2017-08-05 16:53:36.0")
/** Column name IsCreateCounter */
public static final String COLUMNNAME_IsCreateCounter = "IsCreateCounter";
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

@XendraTrl(Identifier="603fc348-d26e-644d-f1ba-05356336e7ce")
public static String es_PE_FIELD_CounterDocument_Valid_Description="El elemento es valido";

@XendraTrl(Identifier="603fc348-d26e-644d-f1ba-05356336e7ce")
public static String es_PE_FIELD_CounterDocument_Valid_Help="El elemento pasado es el cheque de la validación";

@XendraTrl(Identifier="603fc348-d26e-644d-f1ba-05356336e7ce")
public static String es_PE_FIELD_CounterDocument_Valid_Name="Valido";

@XendraField(AD_Column_ID="IsValid",IsCentrallyMaintained=true,
AD_Tab_ID="d9660071-60ea-01d5-e076-c8b8cec3e62f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsCreateCounter@=Y",DisplayLength=1,IsReadOnly=true,SeqNo=100,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="603fc348-d26e-644d-f1ba-05356336e7ce")
public static final String FIELDNAME_CounterDocument_Valid="603fc348-d26e-644d-f1ba-05356336e7ce";

@XendraTrl(Identifier="13dc9ded-c41e-cb82-3718-a2fd82cd8a0e")
public static String es_PE_COLUMN_IsValid_Name="Valido";

@XendraColumn(AD_Element_ID="394c3099-1638-2f07-2e14-7bd38bb8ad25",ColumnName="IsValid",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="13dc9ded-c41e-cb82-3718-a2fd82cd8a0e",
Synchronized="2017-08-05 16:53:36.0")
/** Column name IsValid */
public static final String COLUMNNAME_IsValid = "IsValid";
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

@XendraTrl(Identifier="5b7da9b8-e953-c964-2248-ec30e48cdbc4")
public static String es_PE_FIELD_CounterDocument_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="5b7da9b8-e953-c964-2248-ec30e48cdbc4")
public static String es_PE_FIELD_CounterDocument_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraTrl(Identifier="5b7da9b8-e953-c964-2248-ec30e48cdbc4")
public static String es_PE_FIELD_CounterDocument_Name_Name="Nombre";

@XendraField(AD_Column_ID="Name",IsCentrallyMaintained=true,
AD_Tab_ID="d9660071-60ea-01d5-e076-c8b8cec3e62f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=30,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5b7da9b8-e953-c964-2248-ec30e48cdbc4")
public static final String FIELDNAME_CounterDocument_Name="5b7da9b8-e953-c964-2248-ec30e48cdbc4";

@XendraTrl(Identifier="69a827c7-8aa1-118e-6164-735f64bc21f5")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="69a827c7-8aa1-118e-6164-735f64bc21f5",
Synchronized="2017-08-05 16:53:36.0")
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

@XendraTrl(Identifier="e09f56c6-2a50-0077-ab23-139841d48698")
public static String es_PE_FIELD_CounterDocument_ProcessNow_Name="Valida tipo de documento";

@XendraField(AD_Column_ID="Processing",IsCentrallyMaintained=true,
AD_Tab_ID="d9660071-60ea-01d5-e076-c8b8cec3e62f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsCreateCounter@=Y",DisplayLength=23,IsReadOnly=false,SeqNo=110,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="e09f56c6-2a50-0077-ab23-139841d48698")
public static final String FIELDNAME_CounterDocument_ProcessNow="e09f56c6-2a50-0077-ab23-139841d48698";

@XendraTrl(Identifier="8a4375a5-3be4-fb75-242e-5c54466a3864")
public static String es_PE_COLUMN_Processing_Name="Procesar Ahora";

@XendraColumn(AD_Element_ID="f2096404-1a98-35ec-09ea-273b3e19b7de",ColumnName="Processing",
AD_Reference_ID=28,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="5f5a1e19-d48c-005e-d863-207b8b125308",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="8a4375a5-3be4-fb75-242e-5c54466a3864",Synchronized="2017-08-05 16:53:36.0")
/** Column name Processing */
public static final String COLUMNNAME_Processing = "Processing";
}
