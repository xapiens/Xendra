package org.xendra.pos;

import org.compiere.model.MBankAccount;
import org.compiere.model.reference.REF_C_BankAccountType;
import org.compiere.model.reference.REF_C_PaymentTenderType;
import org.compiere.model.reference.REF_C_PaymentTrxType;
import org.compiere.util.Env;
import org.compiere.util.Util;

public class PaymentPOS {
	String CheckNo = "";
	String TenderType = REF_C_PaymentTenderType.Check;
	String Identifier = Util.getUUID();
	String CreditCardType = "";
	String CreditCardNumber = "";
	Integer C_Currency_ID = 0;
	Integer C_BPartner_ID = 0;
	Integer C_BankAccount_ID = 0;
	String TrxType = REF_C_PaymentTrxType.Sales;
	
	public String getIdentifier() {
		return Identifier;
	}
	public void setIdentifier(String identifier) {
		Identifier = identifier;
	}
	public String getTrxType() {
		return TrxType;
	}
	public void setTrxType(String trxType) {
		TrxType = trxType;
	}
	public String getCheckNo() {
		return CheckNo;
	}
	public void setCheckNo(String checkNo) {
		CheckNo = checkNo;
	}
	public String getTenderType() {
		return TenderType;
	}
	public void setTenderType(String tenderType) {
		TenderType = tenderType;
	}
	public String getCreditCardType() {
		return CreditCardType;
	}
	public void setCreditCardType(String creditCardType) {
		CreditCardType = creditCardType;
	}
	public String getCreditCardNumber() {
		return CreditCardNumber;
	}
	public void setCreditCardNumber(String creditCardNumber) {
		CreditCardNumber = creditCardNumber;
	}
	public Integer getC_Currency_ID() {
		return C_Currency_ID;
	}
	public void setC_Currency_ID(Integer cCurrencyID) {
		C_Currency_ID = cCurrencyID;
	}
	public Integer getC_BPartner_ID() {
		return C_BPartner_ID;
	}
	public void setC_BPartner_ID(int cBPartnerID) {
		C_BPartner_ID = cBPartnerID;
	}
	public Integer getC_BankAccount_ID() {
		return C_BankAccount_ID;
	}
	public void setC_BankAccount_ID(Integer c_BankAccount_ID) {
		C_BankAccount_ID = c_BankAccount_ID;
	}
	public void setBankAccountCard() {
		MBankAccount ac = MBankAccount.get(Env.getCtx(), REF_C_BankAccountType.Card);
		if (ac != null) {
			setC_BankAccount_ID(ac.getC_BankAccount_ID());
		}
	}
}