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
/** Generated Model for B_Topic
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_B_Topic extends PO
{
/** Standard Constructor
@param ctx context
@param B_Topic_ID id
@param trxName transaction
*/
public X_B_Topic (Properties ctx, int B_Topic_ID, String trxName)
{
super (ctx, B_Topic_ID, trxName);
/** if (B_Topic_ID == 0)
{
setB_TopicCategory_ID (0);
setB_Topic_ID (0);
setB_TopicType_ID (0);
setDecisionDate (new Timestamp(System.currentTimeMillis()));
setDocumentNo (null);
setIsPublished (false);	
// N
setName (null);
setProcessed (false);	
// N
setTopicAction (null);
setTopicStatus (null);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_B_Topic (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=679 */
public static int Table_ID=MTable.getTable_ID("B_Topic");

@XendraTrl(Identifier="6ffc2cd0-3bd7-3391-1390-09b3b83b9b1b")
public static String es_PE_TAB_BidTopic_Description="Asunto de la subasta";

@XendraTrl(Identifier="6ffc2cd0-3bd7-3391-1390-09b3b83b9b1b")
public static String es_PE_TAB_BidTopic_Name="Tema de Oferta";

@XendraTrl(Identifier="6ffc2cd0-3bd7-3391-1390-09b3b83b9b1b")
public static String es_PE_TAB_BidTopic_Help="Descripción del artículo a vender ó de crear/fondo";

@XendraTab(Name="Bid Topic",Description="Topic of the Auction",
Help="Description of the item to sell or create/fund.",
AD_Window_ID="b526b654-eee4-ce2f-a903-14ef1f1b7296",SeqNo=10,TabLevel=0,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="6ffc2cd0-3bd7-3391-1390-09b3b83b9b1b",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_BidTopic="6ffc2cd0-3bd7-3391-1390-09b3b83b9b1b";

@XendraTrl(Identifier="467d5949-a148-fe6c-3850-8bcd38fc54ef")
public static String es_PE_TABLE_B_Topic_Name="Asunto";

@XendraTable(Name="Topic",Description="Auction Topic",Help="",TableName="B_Topic",AccessLevel="3",
AD_Window_ID="b526b654-eee4-ce2f-a903-14ef1f1b7296",AD_Val_Rule_ID="",IsKey=1,LoadSeq=140,
IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,IsView=false,
PO_Window_ID="",ID="org.xendra.bids",Identifier="467d5949-a148-fe6c-3850-8bcd38fc54ef",
Synchronized="2017-08-16 11:41:17.0")
/** TableName=B_Topic */
public static final String Table_Name="B_Topic";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"B_Topic");

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
    Table_ID = MTable.getTable_ID("B_Topic");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_B_Topic[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Topic Category.
@param B_TopicCategory_ID Auction Topic Category */
public void setB_TopicCategory_ID (int B_TopicCategory_ID)
{
if (B_TopicCategory_ID < 1) throw new IllegalArgumentException ("B_TopicCategory_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_B_TopicCategory_ID, Integer.valueOf(B_TopicCategory_ID));
}
/** Get Topic Category.
@return Auction Topic Category */
public int getB_TopicCategory_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_B_TopicCategory_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="623e39f6-f108-5ca6-47ee-9be710199092")
public static String es_PE_FIELD_BidTopic_TopicCategory_Description="Categoria del asunto de la subasta";

@XendraTrl(Identifier="623e39f6-f108-5ca6-47ee-9be710199092")
public static String es_PE_FIELD_BidTopic_TopicCategory_Help="Para un tipo de asunto de la subasta, defina las diversas categorías usadas.";

@XendraTrl(Identifier="623e39f6-f108-5ca6-47ee-9be710199092")
public static String es_PE_FIELD_BidTopic_TopicCategory_Name="Categoría del Asunto";

@XendraField(AD_Column_ID="B_TopicCategory_ID",IsCentrallyMaintained=true,
AD_Tab_ID="6ffc2cd0-3bd7-3391-1390-09b3b83b9b1b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="623e39f6-f108-5ca6-47ee-9be710199092")
public static final String FIELDNAME_BidTopic_TopicCategory="623e39f6-f108-5ca6-47ee-9be710199092";

@XendraTrl(Identifier="7bc4ce31-f920-fdfb-fe34-665ad5048658")
public static String es_PE_COLUMN_B_TopicCategory_ID_Name="Categoría del Asunto";

@XendraColumn(AD_Element_ID="2f302e46-b335-712a-fe6c-c07cd4d2475b",ColumnName="B_TopicCategory_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7bc4ce31-f920-fdfb-fe34-665ad5048658",
Synchronized="2017-08-05 16:53:07.0")
/** Column name B_TopicCategory_ID */
public static final String COLUMNNAME_B_TopicCategory_ID = "B_TopicCategory_ID";
/** Set Topic.
@param B_Topic_ID Auction Topic */
public void setB_Topic_ID (int B_Topic_ID)
{
if (B_Topic_ID < 1) throw new IllegalArgumentException ("B_Topic_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_B_Topic_ID, Integer.valueOf(B_Topic_ID));
}
/** Get Topic.
@return Auction Topic */
public int getB_Topic_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_B_Topic_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="70c0a798-9085-19f1-986d-5dc30dfab0af")
public static String es_PE_FIELD_BidTopic_Topic_Description="Asunto de la subasta.";

@XendraTrl(Identifier="70c0a798-9085-19f1-986d-5dc30dfab0af")
public static String es_PE_FIELD_BidTopic_Topic_Help="Decripción del articulo a vender ó a crear.";

@XendraTrl(Identifier="70c0a798-9085-19f1-986d-5dc30dfab0af")
public static String es_PE_FIELD_BidTopic_Topic_Name="Asunto";

@XendraField(AD_Column_ID="B_Topic_ID",IsCentrallyMaintained=true,
AD_Tab_ID="6ffc2cd0-3bd7-3391-1390-09b3b83b9b1b",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=10,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="70c0a798-9085-19f1-986d-5dc30dfab0af")
public static final String FIELDNAME_BidTopic_Topic="70c0a798-9085-19f1-986d-5dc30dfab0af";
/** Column name B_Topic_ID */
public static final String COLUMNNAME_B_Topic_ID = "B_Topic_ID";
/** Set Topic Type.
@param B_TopicType_ID Auction Topic Type */
public void setB_TopicType_ID (int B_TopicType_ID)
{
if (B_TopicType_ID < 1) throw new IllegalArgumentException ("B_TopicType_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_B_TopicType_ID, Integer.valueOf(B_TopicType_ID));
}
/** Get Topic Type.
@return Auction Topic Type */
public int getB_TopicType_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_B_TopicType_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="75614a0e-178c-166a-d4ba-f59a9891fc73")
public static String es_PE_FIELD_BidTopic_TopicType_Description="Tipo de Asunto";

@XendraTrl(Identifier="75614a0e-178c-166a-d4ba-f59a9891fc73")
public static String es_PE_FIELD_BidTopic_TopicType_Help="El tipo de asunto determina qué clase de subasta se utiliza para un área en particular";

@XendraTrl(Identifier="75614a0e-178c-166a-d4ba-f59a9891fc73")
public static String es_PE_FIELD_BidTopic_TopicType_Name="Tipo de Asunto";

@XendraField(AD_Column_ID="B_TopicType_ID",IsCentrallyMaintained=true,
AD_Tab_ID="6ffc2cd0-3bd7-3391-1390-09b3b83b9b1b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="75614a0e-178c-166a-d4ba-f59a9891fc73")
public static final String FIELDNAME_BidTopic_TopicType="75614a0e-178c-166a-d4ba-f59a9891fc73";

@XendraTrl(Identifier="fb02a6f8-5e60-bbe2-d408-61279f7760ed")
public static String es_PE_COLUMN_B_TopicType_ID_Name="Tipo de Asunto";

@XendraColumn(AD_Element_ID="0e53506f-06a5-867f-a233-a03fbf8f6ba1",ColumnName="B_TopicType_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="fb02a6f8-5e60-bbe2-d408-61279f7760ed",
Synchronized="2017-08-05 16:53:07.0")
/** Column name B_TopicType_ID */
public static final String COLUMNNAME_B_TopicType_ID = "B_TopicType_ID";
/** Set Decision date.
@param DecisionDate Decision date */
public void setDecisionDate (Timestamp DecisionDate)
{
if (DecisionDate == null) throw new IllegalArgumentException ("DecisionDate is mandatory.");
set_Value (COLUMNNAME_DecisionDate, DecisionDate);
}
/** Get Decision date.
@return Decision date */
public Timestamp getDecisionDate() 
{
return (Timestamp)get_Value(COLUMNNAME_DecisionDate);
}

@XendraTrl(Identifier="bda27527-6eed-e0fb-25df-d1414b9ccc42")
public static String es_PE_FIELD_BidTopic_DecisionDate_Name="F. Decisión";

@XendraField(AD_Column_ID="DecisionDate",IsCentrallyMaintained=true,
AD_Tab_ID="6ffc2cd0-3bd7-3391-1390-09b3b83b9b1b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="bda27527-6eed-e0fb-25df-d1414b9ccc42")
public static final String FIELDNAME_BidTopic_DecisionDate="bda27527-6eed-e0fb-25df-d1414b9ccc42";

@XendraTrl(Identifier="ccd716e2-37ca-e9ad-2e63-fd1c47125aaf")
public static String es_PE_COLUMN_DecisionDate_Name="F. Decisión";

@XendraColumn(AD_Element_ID="e5217e0b-f9be-6088-c45b-2a837e2250ff",ColumnName="DecisionDate",
AD_Reference_ID=15,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ccd716e2-37ca-e9ad-2e63-fd1c47125aaf",
Synchronized="2017-08-05 16:53:07.0")
/** Column name DecisionDate */
public static final String COLUMNNAME_DecisionDate = "DecisionDate";
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

@XendraTrl(Identifier="86eaf88c-c62a-8051-5e3c-2b4fe06b7bac")
public static String es_PE_FIELD_BidTopic_Description_Description="Observación";

@XendraTrl(Identifier="86eaf88c-c62a-8051-5e3c-2b4fe06b7bac")
public static String es_PE_FIELD_BidTopic_Description_Help="Observación";

@XendraTrl(Identifier="86eaf88c-c62a-8051-5e3c-2b4fe06b7bac")
public static String es_PE_FIELD_BidTopic_Description_Name="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="6ffc2cd0-3bd7-3391-1390-09b3b83b9b1b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="86eaf88c-c62a-8051-5e3c-2b4fe06b7bac")
public static final String FIELDNAME_BidTopic_Description="86eaf88c-c62a-8051-5e3c-2b4fe06b7bac";

@XendraTrl(Identifier="c3e70633-9d38-9f57-eb3e-a9c8ebec4b2f")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c3e70633-9d38-9f57-eb3e-a9c8ebec4b2f",
Synchronized="2017-08-05 16:53:07.0")
/** Column name Description */
public static final String COLUMNNAME_Description = "Description";
/** Set Document No.
@param DocumentNo Document sequence number of the document */
public void setDocumentNo (String DocumentNo)
{
if (DocumentNo == null) throw new IllegalArgumentException ("DocumentNo is mandatory.");
if (DocumentNo.length() > 30)
{
log.warning("Length > 30 - truncated");
DocumentNo = DocumentNo.substring(0,29);
}
set_Value (COLUMNNAME_DocumentNo, DocumentNo);
}
/** Get Document No.
@return Document sequence number of the document */
public String getDocumentNo() 
{
String value = (String)get_Value(COLUMNNAME_DocumentNo);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="0fa3d7a7-6722-664f-aed7-6a61d5d94b77")
public static String es_PE_FIELD_BidTopic_DocumentNo_Description="Número de secuencia del documento para cada documento";

@XendraTrl(Identifier="0fa3d7a7-6722-664f-aed7-6a61d5d94b77")
public static String es_PE_FIELD_BidTopic_DocumentNo_Help="El número del documento es usualmente generado en automático por el sistema y determinado por el tipo del documento. Si el documento no se salva; el número preliminar se despliega entre \"<>\"";

@XendraTrl(Identifier="0fa3d7a7-6722-664f-aed7-6a61d5d94b77")
public static String es_PE_FIELD_BidTopic_DocumentNo_Name="No. del Documento";

@XendraField(AD_Column_ID="DocumentNo",IsCentrallyMaintained=true,
AD_Tab_ID="6ffc2cd0-3bd7-3391-1390-09b3b83b9b1b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=40,SortNo=-1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0fa3d7a7-6722-664f-aed7-6a61d5d94b77")
public static final String FIELDNAME_BidTopic_DocumentNo="0fa3d7a7-6722-664f-aed7-6a61d5d94b77";

@XendraTrl(Identifier="cd2ef45b-0d53-8e07-b70d-50d4eaa2991f")
public static String es_PE_COLUMN_DocumentNo_Name="No. del Documento";

@XendraColumn(AD_Element_ID="e3ca6e28-702a-2722-d941-b2072a0de9cb",ColumnName="DocumentNo",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=30,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="cd2ef45b-0d53-8e07-b70d-50d4eaa2991f",
Synchronized="2017-08-05 16:53:07.0")
/** Column name DocumentNo */
public static final String COLUMNNAME_DocumentNo = "DocumentNo";
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
@XendraTrl(Identifier="0e0e7d1d-11b9-44f2-bdfb-212e2cf72a8c")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0e0e7d1d-11b9-44f2-bdfb-212e2cf72a8c",
Synchronized="2017-08-05 16:53:07.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Published.
@param IsPublished The Topic is published and can be viewed */
public void setIsPublished (boolean IsPublished)
{
set_Value (COLUMNNAME_IsPublished, Boolean.valueOf(IsPublished));
}
/** Get Published.
@return The Topic is published and can be viewed */
public boolean isPublished() 
{
Object oo = get_Value(COLUMNNAME_IsPublished);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="af27f3df-3a7d-f5c8-0c0e-c040ec4ecca5")
public static String es_PE_FIELD_BidTopic_Published_Description="El asunto se pública y puede ser visto.";

@XendraTrl(Identifier="af27f3df-3a7d-f5c8-0c0e-c040ec4ecca5")
public static String es_PE_FIELD_BidTopic_Published_Help="Si no esta seleccionado, el asunto no es visible para el público en general.";

@XendraTrl(Identifier="af27f3df-3a7d-f5c8-0c0e-c040ec4ecca5")
public static String es_PE_FIELD_BidTopic_Published_Name="Publicidad";

@XendraField(AD_Column_ID="IsPublished",IsCentrallyMaintained=true,
AD_Tab_ID="6ffc2cd0-3bd7-3391-1390-09b3b83b9b1b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="af27f3df-3a7d-f5c8-0c0e-c040ec4ecca5")
public static final String FIELDNAME_BidTopic_Published="af27f3df-3a7d-f5c8-0c0e-c040ec4ecca5";

@XendraTrl(Identifier="b62e2b78-97da-bc84-552f-42e6f342878b")
public static String es_PE_COLUMN_IsPublished_Name="Publicidad";

@XendraColumn(AD_Element_ID="3860735c-ded7-1371-1560-6504513bd5a0",ColumnName="IsPublished",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b62e2b78-97da-bc84-552f-42e6f342878b",
Synchronized="2017-08-05 16:53:07.0")
/** Column name IsPublished */
public static final String COLUMNNAME_IsPublished = "IsPublished";
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

@XendraTrl(Identifier="94aa3b44-ff39-a8c7-004c-418c24c32a57")
public static String es_PE_FIELD_BidTopic_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="94aa3b44-ff39-a8c7-004c-418c24c32a57")
public static String es_PE_FIELD_BidTopic_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraTrl(Identifier="94aa3b44-ff39-a8c7-004c-418c24c32a57")
public static String es_PE_FIELD_BidTopic_Name_Name="Nombre";
@XendraField(AD_Column_ID="Name",
IsCentrallyMaintained=true,AD_Tab_ID="6ffc2cd0-3bd7-3391-1390-09b3b83b9b1b",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=50,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="94aa3b44-ff39-a8c7-004c-418c24c32a57")
public static final String FIELDNAME_BidTopic_Name="94aa3b44-ff39-a8c7-004c-418c24c32a57";

@XendraTrl(Identifier="1a1d4b7c-27b4-24a0-49d1-30b8bdc528f8")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="1a1d4b7c-27b4-24a0-49d1-30b8bdc528f8",
Synchronized="2017-08-05 16:53:07.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
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

@XendraTrl(Identifier="8f226dae-e767-acc8-3ea3-82e1d5c9d355")
public static String es_PE_FIELD_BidTopic_Processed_Description="El documento ha sido procesado";

@XendraTrl(Identifier="8f226dae-e767-acc8-3ea3-82e1d5c9d355")
public static String es_PE_FIELD_BidTopic_Processed_Help="El cuadro de verificación procesada indica que un documento ha sido procesado";

@XendraTrl(Identifier="8f226dae-e767-acc8-3ea3-82e1d5c9d355")
public static String es_PE_FIELD_BidTopic_Processed_Name="Procesado";

@XendraField(AD_Column_ID="Processed",IsCentrallyMaintained=true,
AD_Tab_ID="6ffc2cd0-3bd7-3391-1390-09b3b83b9b1b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=true,SeqNo=170,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8f226dae-e767-acc8-3ea3-82e1d5c9d355")
public static final String FIELDNAME_BidTopic_Processed="8f226dae-e767-acc8-3ea3-82e1d5c9d355";

@XendraTrl(Identifier="5bb91b6d-e8cb-73da-4b39-f0f34a7980c9")
public static String es_PE_COLUMN_Processed_Name="Procesado";

@XendraColumn(AD_Element_ID="3f7035d2-fa5e-7416-fc0c-e49e43f9e083",ColumnName="Processed",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5bb91b6d-e8cb-73da-4b39-f0f34a7980c9",
Synchronized="2017-08-05 16:53:07.0")
/** Column name Processed */
public static final String COLUMNNAME_Processed = "Processed";
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

@XendraTrl(Identifier="b09ac2cf-d6e9-52ff-20cd-8046e8e7b40d")
public static String es_PE_FIELD_BidTopic_ProcessNow_Name="Procesar Ahora";

@XendraField(AD_Column_ID="Processing",IsCentrallyMaintained=true,
AD_Tab_ID="6ffc2cd0-3bd7-3391-1390-09b3b83b9b1b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=160,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b09ac2cf-d6e9-52ff-20cd-8046e8e7b40d")
public static final String FIELDNAME_BidTopic_ProcessNow="b09ac2cf-d6e9-52ff-20cd-8046e8e7b40d";

@XendraTrl(Identifier="7a50e627-4dfd-fdfe-377f-5b783964f7ed")
public static String es_PE_COLUMN_Processing_Name="Procesar Ahora";

@XendraColumn(AD_Element_ID="f2096404-1a98-35ec-09ea-273b3e19b7de",ColumnName="Processing",
AD_Reference_ID=28,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7a50e627-4dfd-fdfe-377f-5b783964f7ed",
Synchronized="2017-08-05 16:53:07.0")
/** Column name Processing */
public static final String COLUMNNAME_Processing = "Processing";
/** Set Details.
@param TextDetails Details */
public void setTextDetails (String TextDetails)
{
set_Value (COLUMNNAME_TextDetails, TextDetails);
}
/** Get Details.
@return Details */
public String getTextDetails() 
{
String value = (String)get_Value(COLUMNNAME_TextDetails);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="d0a40f85-5c31-71b7-df08-fa2ffcaecd8b")
public static String es_PE_FIELD_BidTopic_Details_Name="Detalles";

@XendraField(AD_Column_ID="TextDetails",IsCentrallyMaintained=true,
AD_Tab_ID="6ffc2cd0-3bd7-3391-1390-09b3b83b9b1b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=120,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d0a40f85-5c31-71b7-df08-fa2ffcaecd8b")
public static final String FIELDNAME_BidTopic_Details="d0a40f85-5c31-71b7-df08-fa2ffcaecd8b";

@XendraTrl(Identifier="4ecc4cd1-9055-24f6-c4be-90acf3f3426d")
public static String es_PE_COLUMN_TextDetails_Name="Detalles";

@XendraColumn(AD_Element_ID="154b6a3d-b0cd-8ad4-6e5e-420989103e64",ColumnName="TextDetails",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=4000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="4ecc4cd1-9055-24f6-c4be-90acf3f3426d",
Synchronized="2017-08-05 16:53:07.0")
/** Column name TextDetails */
public static final String COLUMNNAME_TextDetails = "TextDetails";
/** Set Text Message.
@param TextMsg Text Message */
public void setTextMsg (String TextMsg)
{
set_Value (COLUMNNAME_TextMsg, TextMsg);
}
/** Get Text Message.
@return Text Message */
public String getTextMsg() 
{
String value = (String)get_Value(COLUMNNAME_TextMsg);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="fab534bf-5653-91ea-4b1e-b3677ae81979")
public static String es_PE_FIELD_BidTopic_TextMessage_Description="Mensaje de texto";

@XendraTrl(Identifier="fab534bf-5653-91ea-4b1e-b3677ae81979")
public static String es_PE_FIELD_BidTopic_TextMessage_Name="Mensaje de texto";

@XendraField(AD_Column_ID="TextMsg",IsCentrallyMaintained=true,
AD_Tab_ID="6ffc2cd0-3bd7-3391-1390-09b3b83b9b1b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=130,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="fab534bf-5653-91ea-4b1e-b3677ae81979")
public static final String FIELDNAME_BidTopic_TextMessage="fab534bf-5653-91ea-4b1e-b3677ae81979";

@XendraTrl(Identifier="1790dd5a-0523-6960-dd81-1a3c5241ef41")
public static String es_PE_COLUMN_TextMsg_Name="Mensaje de texto";

@XendraColumn(AD_Element_ID="377bebfe-238a-1c79-c1a9-13afa4448222",ColumnName="TextMsg",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="1790dd5a-0523-6960-dd81-1a3c5241ef41",
Synchronized="2017-08-05 16:53:07.0")
/** Column name TextMsg */
public static final String COLUMNNAME_TextMsg = "TextMsg";
/** Set Topic Action.
@param TopicAction Topic Action */
public void setTopicAction (String TopicAction)
{
if (TopicAction == null) throw new IllegalArgumentException ("TopicAction is mandatory.");
if (TopicAction.length() > 2)
{
log.warning("Length > 2 - truncated");
TopicAction = TopicAction.substring(0,1);
}
set_Value (COLUMNNAME_TopicAction, TopicAction);
}
/** Get Topic Action.
@return Topic Action */
public String getTopicAction() 
{
return (String)get_Value(COLUMNNAME_TopicAction);
}

@XendraTrl(Identifier="6cfc83d7-537a-d98f-d56b-d0896dc2af67")
public static String es_PE_FIELD_BidTopic_TopicAction_Description="Acción del Asunto";

@XendraTrl(Identifier="6cfc83d7-537a-d98f-d56b-d0896dc2af67")
public static String es_PE_FIELD_BidTopic_TopicAction_Help="La acción del asunto indica la acción que se esta realizando.";

@XendraTrl(Identifier="6cfc83d7-537a-d98f-d56b-d0896dc2af67")
public static String es_PE_FIELD_BidTopic_TopicAction_Name="Acción del Asunto";

@XendraField(AD_Column_ID="TopicAction",IsCentrallyMaintained=true,
AD_Tab_ID="6ffc2cd0-3bd7-3391-1390-09b3b83b9b1b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=150,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6cfc83d7-537a-d98f-d56b-d0896dc2af67")
public static final String FIELDNAME_BidTopic_TopicAction="6cfc83d7-537a-d98f-d56b-d0896dc2af67";

@XendraTrl(Identifier="8c720022-a691-7c94-9920-8186d6221590")
public static String es_PE_COLUMN_TopicAction_Name="Acción del Asunto";

@XendraColumn(AD_Element_ID="486adc19-e433-9620-d260-491e44e898e5",ColumnName="TopicAction",
AD_Reference_ID=17,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="8c720022-a691-7c94-9920-8186d6221590",
Synchronized="2017-08-05 16:53:07.0")
/** Column name TopicAction */
public static final String COLUMNNAME_TopicAction = "TopicAction";
/** Set Topic Status.
@param TopicStatus Topic Status */
public void setTopicStatus (String TopicStatus)
{
if (TopicStatus == null) throw new IllegalArgumentException ("TopicStatus is mandatory.");
if (TopicStatus.length() > 2)
{
log.warning("Length > 2 - truncated");
TopicStatus = TopicStatus.substring(0,1);
}
set_Value (COLUMNNAME_TopicStatus, TopicStatus);
}
/** Get Topic Status.
@return Topic Status */
public String getTopicStatus() 
{
return (String)get_Value(COLUMNNAME_TopicStatus);
}

@XendraTrl(Identifier="a5ec9020-29c2-1545-1cdf-23059541bd1c")
public static String es_PE_FIELD_BidTopic_TopicStatus_Name="Estado del Asunto";

@XendraField(AD_Column_ID="TopicStatus",IsCentrallyMaintained=true,
AD_Tab_ID="6ffc2cd0-3bd7-3391-1390-09b3b83b9b1b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=140,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a5ec9020-29c2-1545-1cdf-23059541bd1c")
public static final String FIELDNAME_BidTopic_TopicStatus="a5ec9020-29c2-1545-1cdf-23059541bd1c";

@XendraTrl(Identifier="6e419bc5-3d33-55de-9f39-389914f964ad")
public static String es_PE_COLUMN_TopicStatus_Name="Estado del Asunto";

@XendraColumn(AD_Element_ID="20d876e7-427f-dda5-1a11-9ae1f96d72cf",ColumnName="TopicStatus",
AD_Reference_ID=17,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6e419bc5-3d33-55de-9f39-389914f964ad",
Synchronized="2017-08-05 16:53:07.0")
/** Column name TopicStatus */
public static final String COLUMNNAME_TopicStatus = "TopicStatus";
}
