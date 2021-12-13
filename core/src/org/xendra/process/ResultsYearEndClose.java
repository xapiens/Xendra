/******************************************************************************
 * Product: Xendra ERP & CRM Smart Business Solution                          *
 * Copyright (C) 1999-2006 ComPiere, Inc. All Rights Reserved.                *
 * This program is free software; you can redistribute it and/or modify it    *
 * under the terms version 2 of the GNU General Public License as published   *
 * by the Free Software Foundation. This program is distributed in the hope   *
 * that it will be useful, but WITHOUT ANY WARRANTY; without even the implied *
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.           *
 * See the GNU General Public License for more details.                       *
 * You should have received a copy of the GNU General Public License along    *
 * with this program; if not, write to the Free Software Foundation, Inc.,    *
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.                     *
 * For the text or an alternative of this public license, you may reach us    *
 * ComPiere, Inc., 2620 Augustine Dr. #245, Santa Clara, CA 95054, USA        *
 * or via info@compiere.org or http://www.compiere.org/license.html           *
 * Contributor(s): Teo Sarca                                                  *
 *****************************************************************************/
// carana 
package org.xendra.process;

import java.math.BigDecimal;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.logging.Level;

import org.compiere.model.MAccount;
import org.compiere.model.MAcctSchema;
import org.compiere.model.MAcctSchemaGL;
import org.compiere.model.MConversionType;
import org.compiere.model.MDocType;
import org.compiere.model.MJournal;
import org.compiere.model.MJournalBatch;
import org.compiere.model.MJournalLine;
import org.compiere.model.MPeriod;
import org.compiere.process.ProcessInfoParameter;
import org.compiere.process.SvrProcess;
import org.compiere.util.CLogger;
import org.compiere.util.DB;
import org.compiere.util.Env;

public class ResultsYearEndClose extends SvrProcess {
       private int m_AD_Client_ID;
       private int m_C_AcctSchema_ID;
       private String m_PostingType = null;
       private int m_Year;
       private int m_AccountValue_From;
       private int m_AccountValue_To;
       private Timestamp m_DateAcctClose = null;
       /*private Timestamp m_DateAcctOpen = null;*/
       private int m_C_DocType_ID;

       protected void prepare() {
               ProcessInfoParameter[] para = getParameter();
               for (int i = 0; i < para.length; i++)
               {
                       String name = para[i].getParameterName();
                       if (para[i].getParameter() == null)
                               ;
                       else if (name.equals("AD_Client_ID"))
                               m_AD_Client_ID = para[i].getParameterAsInt();
                       else if (name.equals("C_AcctSchema_ID"))
                               m_C_AcctSchema_ID = para[i].getParameterAsInt();
                       else if (name.equals("PostingType")) {
                               m_PostingType = (String)para[i].getParameter();
                       }
                       else if (name.equals("Year")) {
                               m_Year = para[i].getParameterAsInt();
                       }
                       else if (name.equals("AccountValue")) {
                               m_AccountValue_From = para[i].getParameterAsInt();
                               m_AccountValue_To = para[i].getParameter_ToAsInt();
                       }
                       else if (name.equals("DateAcctClose")) {
                               m_DateAcctClose = (Timestamp)para[i].getParameter();
                       }
               /*      else if (name.equals("DateAcctOpen")) {
                               m_DateAcctOpen = (Timestamp)para[i].getParameter();
                       }*/
                       else if (name.equals("C_DocType_ID")) {
                               m_C_DocType_ID = para[i].getParameterAsInt();
                       }
                       else
                               log.log(Level.SEVERE, "Unknown Parameter: " + name);
               }
       }

       protected String doIt() throws Exception {
               MAccount acctFrom = MAccount.get(getCtx(), m_AccountValue_From);
               MAccount acctTo = MAccount.get(getCtx(), m_AccountValue_To);
               String range = null;
               if (!acctFrom.equals(acctTo))
                       range = " Desde la Cuenta " + acctFrom.getAccount().getValue()+"("+acctFrom.getAccount().getDescription()+")"+" Hasta la Cuenta "+acctTo.getAccount().getValue()+" ("+acctTo.getAccount().getDescription()+")";
               else
                       range = " Cuenta " + acctFrom.getAccount().getValue()+"("+acctFrom.getAccount().getDescription()+")";

               String sqlcount = "SELECT COUNT(*) as count ";

               String sqlfields =

                       "SELECT " +
                       "AD_Org_ID," +
                       "Account_ID," +
                       "CASE WHEN (AmtAcctDr>AmtAcctCr) THEN (AmtAcctDr-AmtAcctCr)ELSE 0 END AS AmtAcctDr," +
                       "CASE WHEN (AmtAcctDr<AMtAcctCr) THEN (AmtAcctCr-AmtAcctDr)ELSE 0 END AS AmtAcctCr," +
                       "AmtAcctDr-AmtAcctCr as diff,"+
                       "'' as serial,"+
                       "''as invoicedocumentno,"+
                       "0 as C_BPartner_ID" ;

               String sqlfrom =

                    " FROM " +
                       "(" +
                       "SELECT " +
                               "f.AD_Org_ID," +
                               "f.Account_ID," +
                               "SUM(f.AmtAcctDr) AS AmtAcctDr," +
                               "SUM(f.AmtAcctCr) AS AmtAcctCr" +
                           " FROM " +
                               "Fact_Acct f " +
                               "INNER JOIN C_ElementValue ev ON (f.Account_ID=ev.C_ElementValue_ID) " +
                           "WHERE " +
                               "f.AD_Client_ID=? " +
                               "AND f.C_AcctSchema_ID=? " +
                               "AND f.DateAcct>='" + m_Year + "-01-01' " +
                               "AND f.DateAcct<'" + (m_Year+1) + "-01-01' " +
                               "AND f.PostingType=? " +
                               "AND ev.Value >= ? " +
                               "AND ev.Value <= ? " +
                           "GROUP BY " +
                               "f.Account_ID,"+
                               "f.AD_Org_ID " +
                           "ORDER BY " +
                               "MAX(ev.Value) " +
                           ") AS foo " +
                    "WHERE " +
                       "AmtAcctDr!=AmtAcctCr ";


               PreparedStatement pstmt =DB.prepareStatement(sqlcount.concat(sqlfrom), get_TrxName());
               pstmt.setInt(1, m_AD_Client_ID);
               pstmt.setInt(2, m_C_AcctSchema_ID);
               pstmt.setString(3, m_PostingType);
               pstmt.setString(4, acctFrom.getAccount().getValue());
               pstmt.setString(5, acctTo.getAccount().getValue());

               ResultSet rs = pstmt.executeQuery();

               int count = 0;
               if (rs.next())
                       count = rs.getInt("count");

               rs.close();
               pstmt.close();

               if (count == 0)
                       return "En el rango seleccionado no se encontraron saldos a trasladar";

               pstmt = DB.prepareStatement(sqlfields.concat(sqlfrom),get_TrxName());
               pstmt.setInt(1, m_AD_Client_ID);
               pstmt.setInt(2, m_C_AcctSchema_ID);
               pstmt.setString(3, m_PostingType);
               pstmt.setString(4, acctFrom.getAccount().getValue());
               pstmt.setString(5, acctTo.getAccount().getValue());

               rs = pstmt.executeQuery();

               MPeriod periodClose = MPeriod.get(getCtx(), m_DateAcctClose, 0, m_AD_Client_ID);
               /*MPeriod periodOpen = MPeriod.get(getCtx(), m_DateAcctOpen);*/
               MDocType docType = new MDocType(getCtx(), m_C_DocType_ID,get_TrxName());
               MAcctSchema schema = new MAcctSchema(getCtx(), m_C_AcctSchema_ID,get_TrxName());

               MJournalBatch batchClose = new MJournalBatch(getCtx(), 0,get_TrxName());
               batchClose.setDescription("Cierre año - Resultados " + m_Year +range);
               batchClose.setDateDoc(m_DateAcctClose);
               batchClose.setDateAcct(m_DateAcctClose);
               batchClose.setC_Period_ID(periodClose.get_ID());
               batchClose.setC_DocType_ID(m_C_DocType_ID);
               batchClose.setC_Currency_ID(schema.getC_Currency_ID());
               batchClose.setGL_Category_ID(docType.getGL_Category_ID());
               if (!batchClose.save()) return "@Error@"+CLogger.retrieveErrorString(null);



               MJournal journalClose = new MJournal(batchClose);
               journalClose.setDescription("Cierre año - Resultados " + m_Year + range);
               journalClose.setC_AcctSchema_ID(m_C_AcctSchema_ID);
               journalClose.setGL_Category_ID(docType.getGL_Category_ID());
               journalClose.setIsCloseDocument(true);

               journalClose.setC_ConversionType_ID(MConversionType.getDefault(m_AD_Client_ID));
               if (!journalClose.save()) return "@Error@"+CLogger.retrieveErrorString(null);


               BigDecimal diff = Env.ZERO;
               int AD_Org_ID = 0;
               MAccount acct = null;
               while (rs.next()) {
                       AD_Org_ID = rs.getInt(1);
                       int C_ElementValue_ID = rs.getInt(2);
                       BigDecimal AmtAcctDr = rs.getBigDecimal(3);
                       BigDecimal AmtAcctCr = rs.getBigDecimal(4);
                       int C_BPartner_ID   = rs.getInt("C_BPartner_ID");
                       String Serial = rs.getString(6);
                       String DocumentNo = rs.getString(7);
                       acct = MAccount.get(getCtx(), m_AD_Client_ID, AD_Org_ID,m_C_AcctSchema_ID, C_ElementValue_ID, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,0);

                       MJournalLine lineClose = new MJournalLine(journalClose);
                       lineClose.setAD_Org_ID(AD_Org_ID);
                       lineClose.setAmtAcct(AmtAcctCr, AmtAcctDr);
                       lineClose.setAmtSourceDr(AmtAcctCr);
                       lineClose.setAmtSourceCr(AmtAcctDr);
                       lineClose.setC_ValidCombination_ID(acct);
                       lineClose.setSerial(Serial);
                       lineClose.setReferenceNo(DocumentNo);
                       lineClose.setC_BPartner_ID(C_BPartner_ID);
                       if (!lineClose.save()) return "@Error@"+CLogger.retrieveErrorString(null);


                       diff = diff.add(rs.getBigDecimal("diff"));
               }
               boolean isDR = diff.signum() == -1;
               BigDecimal difference = diff.abs();
               MAcctSchemaGL sgl = MAcctSchemaGL.get(Env.getCtx(),schema.getC_AcctSchema_ID());
               if (!isDR) {
                       MJournalLine lineClose = new MJournalLine(journalClose);
                       lineClose.setAD_Org_ID(AD_Org_ID);
                       lineClose.setAmtAcct(difference, Env.ZERO);
                       lineClose.setAmtSourceDr(difference);
                       lineClose.setAmtSourceCr(Env.ZERO);
                       lineClose.setC_ValidCombination_ID(sgl.getSuspenseBalancing_Acct());
                       if (!lineClose.save()) return "@Error@"+CLogger.retrieveErrorString(null);

               }
               else {
                       MJournalLine lineClose = new MJournalLine(journalClose);
                       lineClose.setAD_Org_ID(AD_Org_ID);
                       lineClose.setAmtAcct(Env.ZERO, difference);
                       lineClose.setAmtSourceDr(Env.ZERO);
                       lineClose.setAmtSourceCr(difference);
                       lineClose.setC_ValidCombination_ID(sgl.getSuspenseBalancing_Acct());
                       if (!lineClose.save()) return "@Error@"+CLogger.retrieveErrorString(null);
               }
               return "@Ok@";
       }

}