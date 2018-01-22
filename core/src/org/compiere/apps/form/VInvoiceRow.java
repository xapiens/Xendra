package org.compiere.apps.form;

import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Properties;
import java.util.Vector;

import org.compiere.model.MBOE;
import org.compiere.model.MConversionRate;
import org.compiere.model.MDocType;
import org.compiere.model.MInvoice;
import org.compiere.util.DB;
import org.compiere.util.Env;
import org.compiere.util.Msg;
import org.compiere.util.Util;
import org.xendra.objectview.DefaultTableViewColumn;
import org.xendra.objectview.RowBase;
import org.xendra.objectview.IObjetViewColumn;

public class VInvoiceRow extends RowBase {
	Timestamp TrxDate = new Timestamp(System.currentTimeMillis());
	Boolean Select = false;
	String Serial = "";
	String DocumentNo = "";
	String Document = "";
	BigDecimal Amount = Env.ZERO;
	BigDecimal Retention = Env.ZERO;
	BigDecimal ConvertedAmount  = Env.ZERO;
	//BigDecimal Open = Env.ZERO;
	BigDecimal ConvertedOpen = Env.ZERO;
	BigDecimal Discount = Env.ZERO;
	BigDecimal Apply = Env.ZERO;
	BigDecimal WriteOff = Env.ZERO;
	BigDecimal MultiplierAP = Env.ONE;
	Integer C_DocType_ID = 0;
	Integer C_Invoice_ID = 0;
	Integer C_Currency_ID = 0;
	Integer C_BPartner_Location_ID = 0;
	Integer C_CurrencyTo_ID = 0;
	Boolean IsInvoice = false;
	private MInvoice Invoice;
	private MBOE boe;
	int StdPrecision = 2;
	
	public Integer getC_CurrencyTo_ID() {
		return C_CurrencyTo_ID;
	}
	public void setC_CurrencyTo_ID(Integer cCurrencyToID) {
		C_CurrencyTo_ID = cCurrencyToID;
	}
//	public Integer getConvertedTo() {
//		return ConvertedTo;
//	}
	public void setConvertedTo(Integer convertedTo) {
		if (convertedTo == null || ((IsInvoice && Invoice == null) || (!IsInvoice && boe == null)))
			return;		
		C_CurrencyTo_ID = convertedTo;
		if ( IsInvoice )
		{
			
			StringBuffer sql = new StringBuffer("SELECT i.MultiplierAP,"); 
			sql.append( "currencyConvert(i.GrandTotal*i.MultiplierAP,0,i.C_Currency_ID,?,i.DateInvoiced,i.C_ConversionType_ID,i.AD_Client_ID,i.AD_Org_ID) as ConvertedAmount, "); //  6   #1  Converted
			sql.append( "currencyConvert(invoiceOpen(C_Invoice_ID,C_InvoicePaySchedule_ID),0,i.C_Currency_ID,?,i.DateInvoiced,i.C_ConversionType_ID,i.AD_Client_ID,i.AD_Org_ID)*i.MultiplierAP AS ConvertedOpen , " );  //  7   #2  Converted Open
			sql.append( "currencyConvert(invoiceDiscount(i.C_Invoice_ID,?,C_InvoicePaySchedule_ID),0,i.C_Currency_ID,?,i.DateInvoiced,i.C_ConversionType_ID,i.AD_Client_ID,i.AD_Org_ID)*i.Multiplier*i.MultiplierAP AS Discount FROM C_Invoice_v i where C_Invoice_ID = ?" );              //  #3, #4			
			try {
				PreparedStatement pstmt = DB.prepareStatement(sql.toString(), null);
				pstmt.setInt(1, C_CurrencyTo_ID);
				pstmt.setInt(2, C_CurrencyTo_ID);
				pstmt.setTimestamp(3, TrxDate);
				pstmt.setInt(4, C_CurrencyTo_ID);
				pstmt.setInt(5, C_Invoice_ID);
				ResultSet rs = pstmt.executeQuery();
				if (rs.next())
				{
					MultiplierAP = rs.getBigDecimal("MultiplierAP");
					ConvertedAmount = rs.getBigDecimal("ConvertedAmount");
					ConvertedOpen = rs.getBigDecimal("ConvertedOpen");
					Discount = rs.getBigDecimal("Discount");
				}
				pstmt.close();
				rs.close();				
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
		else
		{
			StringBuffer sql = new StringBuffer("SELECT "); 
			sql.append(" CurrencyConvert(b.GrandTotal,0,b.C_Currency_ID,?,b.StatusDate,b.C_ConversionType_ID,b.AD_Client_ID,b.AD_Org_ID) as ConvertedAmount,");
			sql.append(" CurrencyConvert(boeOpen(b.C_boe_ID),0,b.C_Currency_ID,?,b.StatusDate,b.C_ConversionType_ID,b.AD_Client_ID,b.AD_Org_ID) AS ConvertedOpen ");
			sql.append(" from C_BOE b WHERE C_BOE_ID = ?");
			try {
				PreparedStatement pstmt = DB.prepareStatement(sql.toString(), null);
				pstmt.setInt(1, C_CurrencyTo_ID);
				pstmt.setInt(2, C_CurrencyTo_ID);
				pstmt.setInt(3, C_Invoice_ID);
				ResultSet rs = pstmt.executeQuery();
				if (rs.next())
				{
					ConvertedAmount = rs.getBigDecimal("ConvertedAmount");
					ConvertedOpen = rs.getBigDecimal("ConvertedOpen");
					//Discount = rs.getBigDecimal("Discount");
				}
				pstmt.close();
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}
	public MInvoice getInvoice() {
		return Invoice;
	}
	public void setInvoice(MInvoice invoice) {
		Invoice = invoice;
	}
	public BigDecimal getRetention() {
		return Retention;
	}
	public void setRetention(BigDecimal retention) {
		Retention = retention;
	}
	public BigDecimal getWriteOff() {
		return WriteOff;
	}
	public void setWriteOff(BigDecimal writeOff) {
		if (writeOff == null)
			writeOff = Env.ZERO;
		if (WriteOff.compareTo(writeOff) == 0)
			return;		
		writeOff = writeOff.setScale(StdPrecision , BigDecimal.ROUND_HALF_UP);
		
		WriteOff = writeOff;
		setIsChanged(true);
		
	}
	public String getDocument() {
		return Document;
	}
	public void setDocument(String document) {
		Document = document;
	}
	public Boolean getIsInvoice() {
		return IsInvoice;
	}
	public void setIsInvoice(Boolean isInvoice) {
		IsInvoice = isInvoice;
	}
	
	public BigDecimal ConvertedAmount(BigDecimal convertedAmount) {
		BigDecimal operationConverted = Env.ZERO;
		if ( (IsInvoice && Invoice == null) || (!IsInvoice && boe == null))
			return operationConverted;
		
		operationConverted = 
			MConversionRate.convertBase(Env.getCtx(), Invoice.getC_DocType_ID(), this.getAmount(),	//	CM adjusted 
				IsInvoice ? Invoice.getC_Currency_ID() : boe.getC_Currency_ID(), 
				IsInvoice ?	Invoice.getDateInvoiced() : boe.getDateBOE(), 
				IsInvoice ? Invoice.getC_ConversionType_ID() : boe.getC_ConversionType_ID(), 
				IsInvoice ? Invoice.getAD_Client_ID() : boe.getAD_Client_ID(),
				IsInvoice ? Invoice.getAD_Org_ID() : boe.getAD_Org_ID());
		if (operationConverted == null)
			operationConverted = Env.ZERO;
		return operationConverted;
	}
	
	public BigDecimal getConvertedAmount() {
		return ConvertedAmount;
	}
	public void setConvertedAmount(BigDecimal convertedAmount) {
		ConvertedAmount = convertedAmount;
	}
	public Integer getC_BPartner_Location_ID() {
		return C_BPartner_Location_ID;
	}
	public void setC_BPartner_Location_ID(Integer cBPartnerLocationID) {
		C_BPartner_Location_ID = cBPartnerLocationID;
	}
	public Integer getC_Currency_ID() {
		return C_Currency_ID;
	}
	public void setC_Currency_ID(Integer cCurrencyID) {
		C_Currency_ID = cCurrencyID;
	}
	public Timestamp getTrxDate() {
		return TrxDate;
	}
	public void setTrxDate(Timestamp trxDate) {
		TrxDate = trxDate;
	}
	public Boolean getSelect() {
		return Select;
	}
	public void setSelect(Boolean select) {
		if (Select != select)
		{
			if (!select)
			{
				Apply = Env.ZERO;
				WriteOff = Env.ZERO;
			}
			setIsChanged(true);		
			Select = select;
		}
	}
	public String getSerial() {
		return Serial;
	}
	public void setSerial(String serial) {
		Serial = serial;
	}
	public String getDocumentNo() {
		return DocumentNo;
	}
	public void setDocumentNo(String documentNo) {
		DocumentNo = documentNo;
	}
	public BigDecimal getAmount() {
		return Amount;
	}
	public void setAmount(BigDecimal amount) {
		Amount = amount;
	}
	public BigDecimal getConvertedOpen() {
		return ConvertedOpen;
	}
	public void setConvertedOpen(BigDecimal convertedOpen) {
		ConvertedOpen = convertedOpen;
	}
	public BigDecimal getDiscount() {
		return Discount;
	}
	public void setDiscount(BigDecimal discount) {
		Discount = discount;
	}
	public BigDecimal getApply() {
		return Apply;
	}
	public void setApply(BigDecimal apply) {
		if (apply == null)
			apply = Env.ZERO;
		apply = apply.setScale(2, BigDecimal.ROUND_HALF_UP);
		if (Apply.compareTo(apply) == 0) 
			return;
		if (apply.abs().compareTo(ConvertedOpen.abs().subtract(Discount.abs())) > 0)
		{			
			WriteOff =  apply.abs().subtract(ConvertedOpen.abs().subtract(Discount.abs()));
			WriteOff = WriteOff.multiply(MultiplierAP);
			apply = apply.subtract(WriteOff);
		}
		else
			WriteOff = Env.ZERO;
		Apply = apply;
		setIsChanged(true);
	}
		
	public Integer getC_DocType_ID() {
		return C_DocType_ID;
	}
	public void setC_DocType_ID(Integer cDocTypeID) {
		C_DocType_ID = cDocTypeID;
	}
	public Integer getC_Invoice_ID() {
		return C_Invoice_ID;
	}
	public void setC_Invoice_ID(Integer cInvoiceID) {
		C_Invoice_ID = cInvoiceID;
	}
	public Boolean setDoc_ID(Integer C_Doc_ID, boolean isinvoice) {
		Boolean IsOK = true;
		if (C_Doc_ID <= 0)
			IsOK = false;

		//Document = Document.concat(name);
		
		if (isinvoice)
		{
			Invoice = MInvoice.get(Env.getCtx(), C_Doc_ID);
			if (Invoice.getC_Invoice_ID() > 0)
			{
				Serial = Invoice.getSerial();
				C_DocType_ID = Invoice.getC_DocType_ID();
				C_Currency_ID = Invoice.getC_Currency_ID();
				DocumentNo = Invoice.getDocumentNo();
				TrxDate = Invoice.getDateInvoiced();
				C_BPartner_Location_ID = Invoice.getC_BPartner_Location_ID();
				Amount = Invoice.getGrandTotal();
			}
			else
				IsOK = false;
		}
		else
		{
			boe = MBOE.get(Env.getCtx(), C_Doc_ID);
			if (boe.getC_BOE_ID() > 0)
			{
				Serial = "";
				C_DocType_ID = boe.getC_DocType_ID();
				C_Currency_ID = boe.getC_Currency_ID();
				DocumentNo = boe.getDocumentNo();	
				TrxDate = boe.getDateBOE();
				C_BPartner_Location_ID = boe.getC_BPartner_Location_ID();
				Amount = boe.getGrandTotal();
			}
			else
				IsOK = false;
		}		
		if (IsOK)
		{
			IsInvoice = isinvoice;
			C_Invoice_ID = C_Doc_ID;
			String name = MDocType.get(Env.getCtx(), C_DocType_ID).get_Translation("Name", Env.getAD_Language(Env.getCtx()));
			if (name.length() == 0)
				name = MDocType.get(Env.getCtx(), C_DocType_ID).getName();
			Document = name;						
		}
		return IsOK;
	}
	
	public static IObjetViewColumn[] getColumns() {
		Vector<Object> column = new Vector<Object>();
		ArrayList<DefaultTableViewColumn> newcolumns = new ArrayList<DefaultTableViewColumn>();
		Method getter;
		Method setter;
		try {
			getter = VInvoiceRow.class.getDeclaredMethod("getSelect", null);
		    setter = VInvoiceRow.class.getDeclaredMethod("setSelect", new Class[] {Boolean.class});
		    newcolumns.add(new DefaultTableViewColumn ( 
		    		Msg.getMsg(Env.getCtx(), "Select"), 
		    		null,
		    		(Method)   getter,
		    		(Method)   setter,
		    		true /* visible */,
		    		null /* format */,
		    		true /* sortable */,
		    		false /* searchable */,
		    		false, 0, 0 ));
			getter = VInvoiceRow.class.getDeclaredMethod("getTrxDate", null);
			setter = null;
		    newcolumns.add(new DefaultTableViewColumn ( Msg.translate(Env.getCtx(), "Date"), 
		    		null,
		    		(Method)   getter,
		    		(Method)   setter,
		    		true /* visible */,
		    		null /* format */,
		    		true /* sortable */,
		    		false /* searchable */,
		    		false, 0, 0 ));
			getter = VInvoiceRow.class.getDeclaredMethod("getDocument", null);
		    newcolumns.add(new DefaultTableViewColumn ( "Documento", 
		    		null,
		    		(Method)   getter,
		    		(Method)   setter,
		    		true /* visible */,
		    		null /* format */,
		    		true /* sortable */,
		    		false /* searchable */,
		    		false, 0, 0 ));
			getter = VInvoiceRow.class.getDeclaredMethod("getSerial", null);
		    newcolumns.add(new DefaultTableViewColumn ( "Serie", 
		    		null,
		    		(Method)   getter,
		    		(Method)   setter,
		    		true /* visible */,
		    		null /* format */,
		    		true /* sortable */,
		    		false /* searchable */,
		    		false, 0, 0 ));
		    
		    getter = VInvoiceRow.class.getDeclaredMethod("getC_Currency_ID", null);
		    newcolumns.add(new DefaultTableViewColumn ( Util.cleanAmp(Msg.translate(Env.getCtx(), "TrxCurrency")), 
		    		null,
		    		(Method)   getter,
		    		(Method)   setter,
		    		true /* visible */,
		    		null /* format */,
		    		true /* sortable */,
		    		false /* searchable */,
		    		false, 0, 0 ));		    
		    
			getter = VInvoiceRow.class.getDeclaredMethod("getAmount", null);
		    newcolumns.add(new DefaultTableViewColumn ( Msg.translate(Env.getCtx(), "Amount"), 
		    		null,
		    		(Method)   getter,
		    		(Method)   setter,
		    		true /* visible */,
		    		null /* format */,
		    		true /* sortable */,
		    		false /* searchable */,
		    		false, 0, 0 ));
			getter = VInvoiceRow.class.getDeclaredMethod("getConvertedAmount", null);
		    newcolumns.add(new DefaultTableViewColumn ( Msg.translate(Env.getCtx(), "ConvertedAmount"), 
		    		null,
		    		(Method)   getter,
		    		(Method)   setter,
		    		true /* visible */,
		    		null /* format */,
		    		true /* sortable */,
		    		false /* searchable */,
		    		false, 0, 0 ));		    
			getter = VInvoiceRow.class.getDeclaredMethod("getConvertedOpen", null);
		    newcolumns.add(new DefaultTableViewColumn(Msg.getMsg(Env.getCtx(), "Open"), 
		    		null,
		    		(Method)   getter,
		    		(Method)   setter,
		    		true /* visible */,
		    		null /* format */,
		    		false /* sortable */,
		    		false /* searchable */,
		    		false, 0, 0 ));
			getter = VInvoiceRow.class.getDeclaredMethod("getDiscount", null);
		    newcolumns.add(new DefaultTableViewColumn(Msg.translate(Env.getCtx(), "Discount"), 
		    		null,
		    		(Method)   getter,
		    		(Method)   setter,
		    		true /* visible */,
		    		null /* format */,
		    		true /* sortable */,
		    		false /* searchable */,
		    		false, 0, 0 ));
			getter = VInvoiceRow.class.getDeclaredMethod("getWriteOff", null);
			setter = VInvoiceRow.class.getDeclaredMethod("setWriteOff", new Class[] {BigDecimal.class});
		    newcolumns.add(new DefaultTableViewColumn(Msg.translate(Env.getCtx(), "AutoWriteOff"), 
		    		null,
		    		(Method)   getter,
		    		(Method)   setter,
		    		true /* visible */,
		    		null /* format */,
		    		true /* sortable */,
		    		false /* searchable */,
		    		false, 0, 0 ));		    
			getter = VInvoiceRow.class.getDeclaredMethod("getApply", null);
			setter = VInvoiceRow.class.getDeclaredMethod("setApply", new Class[] {BigDecimal.class});
		    newcolumns.add(new DefaultTableViewColumn(Msg.getMsg(Env.getCtx(), "AppliedAmt"), 
		    		null,
		    		(Method)   getter,
		    		(Method)   setter,
		    		true /* visible */,
		    		null /* format */,
		    		true /* sortable */,
		    		false /* searchable */,
		    		false, 0, 0 ));
			getter = VInvoiceRow.class.getDeclaredMethod("getRetention", null);
			setter = VInvoiceRow.class.getDeclaredMethod("setRetention", new Class[] {BigDecimal.class});
		    newcolumns.add(new DefaultTableViewColumn(Msg.getMsg(Env.getCtx(), "C_Retention_ID"), 
		    		null,
		    		(Method)   getter,
		    		(Method)   setter,
		    		true /* visible */,
		    		null /* format */,
		    		true /* sortable */,
		    		false /* searchable */,
		    		false, 0, 0 ));		    
		    //
		} catch (Exception e) {
			e.printStackTrace();
		}
	    IObjetViewColumn[] columns = new IObjetViewColumn[newcolumns.size ()];
        newcolumns.toArray(columns);
        return columns;		  
	}
	
}
