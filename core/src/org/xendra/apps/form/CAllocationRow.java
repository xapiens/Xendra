package org.xendra.apps.form;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;

import org.compiere.apps.ADialog;
import org.compiere.util.Env;
import org.xendra.objectview.RowBase;

public class CAllocationRow extends RowBase {
	Date TrxDate = new Date(); // Env.getContextAsDate(Env.getCtx(), "#Date");
	Integer C_Invoice_ID = 0;
	Integer TrxCurrency = 0;
	String DocumentNo = "";
	String ISOCode = "";
	BigDecimal Pending = Env.ZERO;
    private String m_processMsg = null;
    private Integer RowID = 0;
	Integer C_Currency_ID = 0;
	Boolean Select = false;
	BigDecimal Amount = Env.ZERO;
	BigDecimal OrigAmount = Env.ZERO;
	BigDecimal ConvertedAmount = Env.ZERO;
	BigDecimal OpenAmt = Env.ZERO;
	BigDecimal DiscountAmount = Env.ZERO;
	BigDecimal WriteOffAmount = Env.ZERO;
	BigDecimal AppliedAmt = Env.ZERO;
	Boolean changed = false;
	String VendorName = "";
	private CAllocation m_Allocation;
	
	public void setVendorName(String vendor) {
		VendorName = vendor;
	}	
	public String getVendorName() {
		return VendorName;
	}			
    public BigDecimal getPending() {
		return Pending;
	}
	public void setPending(BigDecimal pending) {
		Pending = pending;
	}
	public Boolean IsChanged() 							{	return changed;  }
    public void setIsChanged(boolean Changed) 			{	changed = Changed;  }  
    
    public String getM_processMsg() {		return m_processMsg;	}
    public void setM_processMsg(String mProcessMsg) {		m_processMsg = mProcessMsg;	}

    public Integer getRowID() 							{	return RowID;  }
    public void setRowID(Integer pRowID) 					{	RowID = pRowID;  }      
	
	public BigDecimal getAmount() {
		return Amount;
	}
	public void setAmount(BigDecimal amount) {
		Amount = amount;
	}
	public Integer getTrxCurrency() {
		return TrxCurrency;
	}
	public void setTrxCurrency(Integer trxCurrency) {
		TrxCurrency = trxCurrency;
	}
	public Boolean getSelect() {
		return Select;
	}
	public void setSelect(Boolean pselect) {
		if ( pselect != Select )
		{
			BigDecimal amount = Env.ZERO;
			if (pselect)
			{
				amount = this.getOpenAmt();
				amount = amount.subtract(this.getDiscountAmount());
				
				BigDecimal ParentPayAmount = getParent().getTotalPay();
				BigDecimal ParentInvAmount = getParent().getTotalInv();
				BigDecimal Available = ParentPayAmount.subtract(ParentInvAmount);
				if (Available.abs().compareTo(amount.abs()) < 0  
						&& !Available.equals(Env.ZERO)  
						&& !ParentPayAmount.equals(Env.ZERO))
					amount = Available;
			}
			this.setWriteOffAmount(Env.ZERO);
			this.setAppliedAmt(amount);			
			Select = pselect;
			changed = true;
		}
	}
	public Date getTrxDate() {
		return TrxDate;
	}
	public void setTrxDate(Date trxDate) {
		TrxDate = trxDate;
	}
	public Integer getC_Invoice_ID() {
		return C_Invoice_ID;
	}
	public void setC_Invoice_ID(Integer cInvoiceID) {
		C_Invoice_ID = cInvoiceID;
	}
	public String getDocumentNo() {
		return DocumentNo;
	}
	public void setDocumentNo(String documentNo) {
		DocumentNo = documentNo;
	}
			
	public String getISOCode() {
		return ISOCode;
	}
	public void setISOCode(String iSOCode) {
		ISOCode = iSOCode;
	}
	public Integer getC_Currency_ID() {
		return C_Currency_ID;
	}
	public void setC_Currency_ID(Integer cCurrencyID) {
		C_Currency_ID = cCurrencyID;
	}
	public BigDecimal getOrigAmount() {
		return OrigAmount;
	}
	public void setOrigAmount(BigDecimal origAmount) {
		if (origAmount == null)
			origAmount = Env.ZERO;
		if ( OrigAmount.compareTo(origAmount) != 0 )
		{
			OrigAmount = origAmount;
			changed = true;
		}
	}
	public BigDecimal getConvertedAmount() {
		return ConvertedAmount;
	}
	public void setConvertedAmount(BigDecimal convertedAmount) {
		if (convertedAmount == null)
			convertedAmount = Env.ZERO;
		if (ConvertedAmount.compareTo(convertedAmount) != 0)
		{
			ConvertedAmount = convertedAmount;
			changed = true;
		}
	}
	public BigDecimal getOpenAmt() {
		return OpenAmt;
	}
	public void setOpenAmt(BigDecimal openAmount) {
		if (openAmount == null)
			openAmount = Env.ZERO;
		if ( OpenAmt.compareTo(openAmount) != 0)
		{
			OpenAmt = openAmount;
			changed = true;
		}
	}

	public BigDecimal getDiscountAmount() {
		return DiscountAmount;
	}
	public void setDiscountAmount(BigDecimal discountAmount) {
		if (discountAmount == null)
			discountAmount = Env.ZERO;
		if (DiscountAmount.compareTo(discountAmount) != 0)
		{
			DiscountAmount = discountAmount;
			changed = true;
		}
	}
	public BigDecimal getWriteOffAmount() {
		return WriteOffAmount;
	}
	public void setWriteOffAmount(BigDecimal pwriteOffAmount) {
		if (pwriteOffAmount == null)
			pwriteOffAmount = Env.ZERO;
		if ( WriteOffAmount.compareTo(pwriteOffAmount) != 0)
		{
			WriteOffAmount = pwriteOffAmount;
			changed = true;
		}
	}
	public BigDecimal getAppliedAmt() {
		return AppliedAmt;
	}
	public void setAppliedAmt(BigDecimal appliedAmt) {
		if (appliedAmt == null)
			appliedAmt = Env.ZERO;		
		if (AppliedAmt.compareTo(appliedAmt) != 0)
		{
			AppliedAmt = appliedAmt.setScale(2, BigDecimal.ROUND_HALF_UP);
			changed = true;
		}
	}
	public void setParent(CAllocation cAllocation) {
		m_Allocation = cAllocation;	
	}
	
	public CAllocation getParent()
	{
		return m_Allocation;
	}	
}
