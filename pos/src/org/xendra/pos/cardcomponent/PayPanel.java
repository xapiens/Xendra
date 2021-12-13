/******************************************************************************
 * Product: Xendra ERP & CRM Smart Business Solution                          *
 * Copyright (C) 2007 Dravio SAC. All Rights Reserved.                		  *
 * This program is free software; you can redistribute it and/or modify it    *
 * under the terms version 2 of the GNU General Public License as published   *
 * by the Free Software Foundation. This program is distributed in the hope   *
 * that it will be useful, but WITHOUT ANY WARRANTY; without even the implied *
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.           *
 * See the GNU General Public License for more details.                       *
 * You should have received a copy of the GNU General Public License along    *
 * with this program; if not, write to the Free Software Foundation, Inc.,    *
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.                     *
 *****************************************************************************/
package org.xendra.pos.cardcomponent;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.KeyEvent;
import java.beans.PropertyChangeEvent;
import java.beans.VetoableChangeListener;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.text.DecimalFormat;
import java.util.Observable;
import java.util.logging.Level;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import net.miginfocom.swing.MigLayout;

import org.compiere.apps.*;
import org.compiere.grid.ed.VDate;
import org.compiere.grid.ed.VLookup;
import org.compiere.grid.ed.VNumber;
import org.compiere.model.Lookup;
import org.compiere.model.MBPartner;
import org.compiere.model.MBPartnerLocation;
import org.compiere.model.MBankAccount;
import org.compiere.model.MDocType;
import org.compiere.model.MInvoice;
import org.compiere.model.MLookup;
import org.compiere.model.MLookupFactory;
import org.compiere.model.MLookupInfo;
import org.compiere.model.MOrder;
import org.compiere.model.MPOS;
import org.compiere.model.MUser;
import org.compiere.model.persistence.X_C_BPartner;
import org.compiere.model.persistence.X_C_Cash;
import org.compiere.model.persistence.X_C_Currency;
import org.compiere.model.persistence.X_C_Order;
import org.compiere.model.persistence.X_C_POS;
import org.compiere.model.persistence.X_C_Payment;
import org.compiere.model.persistence.X_C_PaymentTerm;
import org.compiere.model.reference.REF_C_BankAccountType;
import org.compiere.model.reference.REF_C_PaymentTenderType;
import org.compiere.model.reference.REF_C_PaymentTrxType;
import org.compiere.swing.*;
import org.compiere.util.*;
import org.kie.api.runtime.rule.FactHandle;

import org.xendra.Constants;
import org.xendra.pos.PosPanel;
import org.xendra.pos.rules.model.PolicyRequest;
import org.xendra.pos.wizard.MachineCreator;
import org.xendra.rules.model.PaymentType;



public final class PayPanel extends CardComponentPanel implements VetoableChangeListener, ActionListener 
{	
	private static CLogger log = CLogger.getCLogger(PayPanel.class);
	private static final String A_EXIT = "Cancelar";
	private static final String A_PARTIAL = "Partial";
	private static final String A_FINISH = "Finish";
	private AppsAction aFinish, aPartial,  aExit;
	private CButton    bFinish, bPartial,  bExit;	

	/**
	 * @wbp.parser.constructor
	 */
	public PayPanel(PosPanel pp) {
		try
		{			
			pospanel = pp;
			java.util.Set<KeyStroke> forwardTab = new java.util.HashSet<KeyStroke>();
			forwardTab.add(KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ENTER, 0));
			setFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS, forwardTab);			
			jbInit();
		}
		catch(Exception e)
		{
			e.printStackTrace();
			log.log(Level.SEVERE, "Find", e);
		}				
	}

	private JLabel GrandTotalAmtLabel = new JLabel();
	private JLabel WriteOffLabel = new JLabel("0.00");
	private JLabel VueltoAmtLabel = new JLabel("0.00");
	private JLabel PayAmountLabel = new JLabel("Cantidad");
	private VNumber fAmtFrom = null;
	public VLookup pickWriteOffType = null;
	private JLabel labelDocType = new JLabel(Msg.translate(Env.getCtx(), "DocumentNo"));	
	public VLookup pickDocType = null;

	private VLookup fieldSalesRep;
	private VLookup fieldPayPartnerID;
	private VLookup fieldTenderType;
	private VLookup fieldTrxType;
	private CLabel  labelCheck = new CLabel(Msg.getMsg(Env.getCtx(), "Check"));
	private JLabel  labelCash = new JLabel(Msg.translate(Env.getCtx(), X_C_Cash.COLUMNNAME_C_Cash_ID));
	private CLabel  labelCredit = new CLabel(Msg.translate(Env.getCtx(),X_C_Payment.COLUMNNAME_C_Payment_ID));
	private CLabel  labelCreditCardType = new CLabel("Tipo Tarjeta:");
	private CLabel  labelTrxType = new CLabel("Tipo Transacci�n:");
	private CLabel  labelCreditCardNumber = new CLabel("No Tarjeta:");
	private CLabel  labelBankAccount = new CLabel(Msg.translate(Env.getCtx(), "C_BankAccount_ID"));
	private VLookup fieldCreditCardType;
	private CTextField fieldName = new CTextField(10);	
	private CTextField fieldCreditCardNumber = new CTextField(10);
	private CTextField checkNro = new CTextField(10);
	private VLookup fieldBankAccount;
	private CLabel labelName = new CLabel(Msg.getMsg(Env.getCtx(), "Name"));
	private String ClientAlias = "";
	private VLookup pickPartner;
	private VLookup pickCurrency;
	public  VLookup pickPaymentTerm;
	private VLookup pickPartnerPoints;
	private VLookup pickPartnerLocation;
	private BigDecimal TotalCard = Env.ZERO;
	private BigDecimal TotalCash = Env.ZERO;
	private String zero = "0.00";
	private MLookup lookupDocType;
	private CLabel labelDate = new CLabel(Msg.translate(Env.getCtx(), "DateOrdered"));
	private VDate DatePick = new VDate("DateFrom", true, false, true, DisplayType.DateTime, Msg.translate(Env.getCtx(), "DateFrom"));
	private CLabel labelDocNumber = new CLabel(Msg.translate(Env.getCtx(), "Value"));
	private CTextField pickDocNumber = new CTextField(10);
	private CCheckBox ForceBPartner = new CCheckBox(Msg.translate(Env.getCtx(), "Force"));
	private CLabel BPartner = new CLabel();
	private PaymentType m_PayTypeAmt = new PaymentType();	

	public Integer getPaymenTerm() {
		Integer ppayterm = (Integer) pickPaymentTerm.getValue();
		if (ppayterm == null) {
			ppayterm = 0;
		}
		return ppayterm;
	}
	
	public String getPaymentTermType() {
		return m_PayTypeAmt.getValue();
	}
	public void setPaymentTermType(String paymentTerm) {
		m_PayTypeAmt.setName("paytype");
		m_PayTypeAmt.setValue(paymentTerm);
		getPOSPanel().UpsertFact("POS", getPOSPanel());
		getPOSPanel().updateRule(m_PayTypeAmt, "payment");
		getPOSPanel().execute("payment");		
	}

	private void jbInit() {		
		fAmtFrom = new VNumber("AmtFrom", false, false, true, DisplayType.Amount, Msg.translate(Env.getCtx(), "AmtFrom"));
		fAmtFrom.addActionListener(this);

		pickPartner = VLookup.createBPartner(getPOSPanel().getWindowNo());
		pickPartner.setMandatory(true);
		pickPartner.addVetoableChangeListener(this);
		
		fieldName.setInputVerifier(new DescriptionVerifier());

		int AD_Column_ID = 0;
		Lookup lookup = null;
		if (getPOSPanel().getConfig().getbool(MachineCreator.isBonusPoints))
		{
			pickPartnerPoints = getLookup(MInvoice.Table_ID, X_C_Order.COLUMNNAME_C_BPartner_Points_ID, DisplayType.Search, true);
		}

		pickPartnerLocation = getLookup(MOrder.Table_ID, "C_BPartner_Location_ID",DisplayType.TableDir, true);
		pickCurrency = getLookup(MOrder.Table_ID, X_C_Currency.COLUMNNAME_C_Currency_ID, DisplayType.Search, false);
		pickPaymentTerm = getLookup(MOrder.Table_ID, X_C_PaymentTerm.COLUMNNAME_C_PaymentTerm_ID, DisplayType.TableDir, true);				
		String IsSOTrx = "Y";

		AD_Column_ID  = Util.getColumnID(MOrder.Table_ID, X_C_Order.COLUMNNAME_C_DocTypeTarget_ID);
		MLookupInfo lookupInfo = MLookupFactory.getLookupInfo (Env.getCtx(), getPOSPanel().getWindowNo(), AD_Column_ID, DisplayType.Table,
				Env.getLanguage(Env.getCtx()), "C_DocTypeTarget_ID", 170,
				false, "C_DocType.C_DocType_ID IN (SELECT C_DocType_ID FROM C_POSDocType WHERE C_POS_ID = "+getPOSPanel().getConfig().getC_POS_ID()+")");

		lookupDocType = new MLookup (lookupInfo, 0);
		Object[] values = lookupDocType.getData(false, false, true, false).toArray();
		pickDocType = new VLookup("C_DocTypeTarget_ID", true, false, true, lookupDocType);		
		if (lookupDocType.size() > 0)
			pickDocType.setValue(((NamePair) lookupDocType.getElementAt(0)).getID());
		pickDocType.addActionListener(this);
		pickWriteOffType = getLookup(MPOS.Table_ID, X_C_POS.COLUMNNAME_WriteOffType, DisplayType.List, false);
		pickWriteOffType.addVetoableChangeListener(this);
		if (getPOSPanel().getConfig().getWriteOffType() != null)
			pickWriteOffType.setValue(getPOSPanel().getConfig().getWriteOffType());
		else
			pickWriteOffType.setFirstValue();			
		fieldTenderType = getLookup(X_C_Payment.Table_ID, X_C_Payment.COLUMNNAME_TenderType, DisplayType.List, true);

		StringBuffer sb = new StringBuffer();
		sb.append(Msg.translate(Env.getCtx(), "Finish"));
		sb.append(" [F10]");
		aFinish = new AppsAction (A_FINISH, KeyStroke.getKeyStroke(KeyEvent.VK_F10, 0) , sb.toString());
		aFinish.setDelegate(this);
		bFinish = (CButton) aFinish.getButton();		

		sb = new StringBuffer(Msg.translate(Env.getCtx(), "Partial"));
		sb.append(" [F2]");		
		aPartial = new AppsAction (A_PARTIAL, KeyStroke.getKeyStroke(KeyEvent.VK_F2, 0), sb.toString());
		aPartial.setDelegate(this);		
		bPartial = (CButton) aPartial.getButton();

		sb = new StringBuffer(Msg.translate(Env.getCtx(), "Cancel"));
		sb.append(" [ESC]");		
		aExit = new AppsAction (A_EXIT, KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), sb.toString());
		aExit.setDelegate(this);		
		bExit = (CButton) aExit.getButton();


		fieldCreditCardType = getLookup(X_C_Payment.Table_ID, X_C_Payment.COLUMNNAME_CreditCardType, DisplayType.List, true);

		fieldTrxType = getLookup(X_C_Payment.Table_ID, X_C_Payment.COLUMNNAME_TrxType, DisplayType.List, true);
		fieldTrxType.setValue(REF_C_PaymentTrxType.Sales);

		fieldCreditCardNumber.setVisible(false);


		fieldSalesRep = getLookup(X_C_Order.Table_ID, X_C_Order.COLUMNNAME_SalesRep_ID, DisplayType.Search, true);

		AD_Column_ID = Util.getColumnID(MOrder.Table_ID, "C_BPartner_ID");
		lookup = MLookupFactory.get (Env.getCtx(), 0, 0, AD_Column_ID, DisplayType.Search);
		fieldPayPartnerID = new VLookup ("User1", true, false, true, lookup);

		fieldBankAccount = getLookup(X_C_Payment.Table_ID, X_C_Payment.COLUMNNAME_C_BankAccount_ID, DisplayType.Table, true);

		DatePick.setValue(getPOSPanel().getDateOrdered());
		DatePick.addVetoableChangeListener(this);

		pickDocNumber.setValue(getPOSPanel().getDocNumber());
		pickDocNumber.addFocusListener(
				new FocusAdapter() {        
					public void focusLost(FocusEvent e) {
						if ( !pickDocNumber.getValue().equals(getPOSPanel().getDocNumber()))
						{
							getPOSPanel().setDocNumber((String) pickDocNumber.getValue());
						}
					}
				});

		ForceBPartner.addChangeListener(new ChangeListener() {

			@Override
			public void stateChanged(ChangeEvent evt) {		
				Boolean state = ((CCheckBox)evt.getSource()).isSelected();				  
				pickPartner.setVisible(state);							
				pickPartnerLocation.setVisible(state);	
				BPartner.setVisible(!state);				
				if (state)
				{
					pickPartner.setValue(null);
					pickPartnerLocation.setValue(null);
				}
				else
				{
					pickPartner.setValue(getPOSPanel().getOrder().getC_BPartner_ID());					
					pickPartnerLocation.setValue(getPOSPanel().getOrder().getC_BPartner_Location_ID());					
				}

			}
		});
		CPanel containerPanel = new CPanel();		
		containerPanel.setLayout(new MigLayout("flowy", "[75%,fill,grow]", "[fill,grow]"));
		containerPanel.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));

		CPanel partnerPanel = new CPanel();
		partnerPanel.setBorder(BorderFactory.createTitledBorder(Msg.getMsg(Env.getCtx(), "Socio de negocio")));
		partnerPanel.setLayout(new MigLayout("hidemode 3"));
		partnerPanel.add(labelDocType);
		partnerPanel.add(pickDocType,"span,wrap");
		partnerPanel.add(labelName);
		partnerPanel.add(fieldName,"span, wrap");
		partnerPanel.add(ForceBPartner, "wrap");
		partnerPanel.add(BPartner,"span 2");
		partnerPanel.add(pickPartner,"span, growx");
		partnerPanel.add(pickPartnerLocation,"span, growx");
		if (getPOSPanel().getConfig().getbool(MachineCreator.isModifyDate))
		{
			partnerPanel.add(labelDate);
			partnerPanel.add(DatePick,"wrap");   
		}
		if (getPOSPanel().getConfig().getbool(MachineCreator.ismodifydocnumber))
		{
			partnerPanel.add(labelDocNumber);
			partnerPanel.add(pickDocNumber,"wrap");	
		}
		containerPanel.add(partnerPanel);	
		CPanel payformPanel = new CPanel();
		payformPanel.setBorder(BorderFactory.createTitledBorder(Msg.getMsg(Env.getCtx(), "Forma de Pago")));
		payformPanel.setLayout(new MigLayout("hidemode 3"));
		payformPanel.add(labelCash);
		payformPanel.add(labelCredit);
		payformPanel.add(pickPaymentTerm, "wrap");
		payformPanel.add(fieldTenderType,"wrap");
		payformPanel.add(labelCheck);
		payformPanel.add(checkNro,"wrap");
		payformPanel.add(labelBankAccount);
		payformPanel.add(fieldBankAccount, "wrap");
		payformPanel.add(labelCreditCardType);
		payformPanel.add(fieldCreditCardType,"wrap");
		payformPanel.add(labelCreditCardNumber);
		payformPanel.add(fieldCreditCardNumber,"wrap");			
		payformPanel.add(labelTrxType);
		payformPanel.add(fieldTrxType, "wrap");
		containerPanel.add(payformPanel);			
		if (getPOSPanel().getConfig().getbool(MachineCreator.isBonusPoints))
		{
			CPanel bonusPanel = new CPanel();
			bonusPanel.setBorder(BorderFactory.createTitledBorder(Msg.getMsg(Env.getCtx(), "Puntos Bonus")));
			bonusPanel.setLayout(new MigLayout());
			bonusPanel.add(new JLabel("Asignar:"));
			bonusPanel.add(pickPartnerPoints, "wrap");
			containerPanel.add(bonusPanel);				
		}
		CPanel payPanel = new CPanel();
		payPanel.setBorder(BorderFactory.createTitledBorder(Msg.getMsg(Env.getCtx(), "Venta")));
		payPanel.setLayout(new MigLayout("hidemode 3"));
		payPanel.add(new JLabel("Venta:"));
		payPanel.add(GrandTotalAmtLabel, "wrap");			
		payPanel.add(pickWriteOffType);
		payPanel.add(WriteOffLabel,"wrap");

		payPanel.add(new JLabel("Vendedor:"));
		payPanel.add(fieldSalesRep,"wrap");

		if (getPOSPanel().getConfig().getbool(MachineCreator.isThirdSalesman))				
		{
			payPanel.add(new JLabel("Socio:"));
			payPanel.add(fieldPayPartnerID,"wrap");				
		}
		payPanel.add(PayAmountLabel);
		payPanel.add(fAmtFrom,      "wrap");
		payPanel.add(new JLabel("Vuelto:"));
		payPanel.add(VueltoAmtLabel, "wrap");

		containerPanel.add(payPanel);

		CPanel payActionPanel = new CPanel();
		payActionPanel.setBorder(BorderFactory.createTitledBorder(Msg.getMsg(Env.getCtx(), "Acciones")));
		payActionPanel.setLayout(new MigLayout());			
		payActionPanel.add(bFinish);
		payActionPanel.add(bPartial);		
		payActionPanel.add(bExit);
		containerPanel.add(payActionPanel);
		add(containerPanel);		
	}	

	private VLookup getLookup(int AD_Table_ID, String ColumnName, int DisplayType, boolean addvetoable) {
		int AD_Column_ID = Util.getColumnID(AD_Table_ID, ColumnName);
		Lookup lookup = MLookupFactory.get (Env.getCtx(), getPOSPanel().getWindowNo(), 0, AD_Column_ID, DisplayType);
		VLookup control = new VLookup (ColumnName, true, false, true, lookup);
		if (addvetoable)
			control.addVetoableChangeListener(this);
		return control;
	}
	public boolean isDocTypeUsePartner() 
	{
		Boolean isNeeded = false;
		MDocType dt = MDocType.get(Env.getCtx(), (Integer) pickDocType.getValue());
		if (dt == null)			
			;		
		else if (dt.getC_DocTypeInvoice_ID() > 0)
		{
			dt = MDocType.get(Env.getCtx(), dt.getC_DocTypeInvoice_ID());
			if (dt != null)
				isNeeded = dt.isUseBPartner();
		}
		else 
			isNeeded = dt.isUseBPartner();
		return isNeeded;		
	}

	public boolean isNeedPartner()
	{
		if (ForceBPartner.isSelected())
			return true;
		return isDocTypeUsePartner();
	}
	public void setDocNumber()
	{
		if (getPOSPanel().getConfig().getbool(MachineCreator.ismodifydocnumber))
		{
			labelDocNumber.setVisible(true);
			pickDocNumber.setVisible(true);			
		}
		else
		{
			labelDocNumber.setVisible(false);
			pickDocNumber.setVisible(false);			
		}
	}

	public void setPartner() 
	{
		fieldName.setValue(getPOSPanel().getOrder().getDescription());		
		pickPartner.setValue(getPOSPanel().getOrder().getC_BPartner_ID());
		pickPartnerLocation.setValue(getPOSPanel().getOrder().getC_BPartner_Location_ID());

		if (isNeedPartner())
		{
			pickPartner.setVisible(true);		
			pickPartnerLocation.setVisible(true);
			BPartner.setVisible(false);
			if (!isDocTypeUsePartner())
				ForceBPartner.setVisible(true);
			else
				ForceBPartner.setVisible(false);
		}
		else
		{
			pickPartner.setVisible((Boolean)ForceBPartner.getValue());			
			pickPartnerLocation.setVisible((Boolean)ForceBPartner.getValue());
			BPartner.setText(pickPartner.getDisplay());
			BPartner.setVisible(true);		
			ForceBPartner.setVisible(true);
		}
	}
	public void setCard()
	{
		Evaluation();
		BigDecimal Net = getAmt(Constants.A_TOTALNET); // .add(getAmt(Constants.A_CASH));
		DecimalFormat format = DisplayType.getNumberFormat(DisplayType.Amount);		
		GrandTotalAmtLabel.setText(format.format(Net));

		fieldTenderType.setVisible(true);
		fieldTenderType.setValue(REF_C_PaymentTenderType.CreditCard);
		fieldTenderType.setReadWrite(false);
		bFinish.setEnabled(false);
		labelCash.setVisible(false);
		labelCredit.setVisible(false);
		pickPaymentTerm.setVisible(false);
		WriteOffLabel.setVisible(false);
		pickWriteOffType.setVisible(false);
		BigDecimal partial = isPartial(Constants.A_PAY); 
		if (partial.compareTo(BigDecimal.ZERO) > 0)
		{
			setAmt(Constants.A_PAY, Net.subtract(partial));
			fAmtFrom.setValue(getAmt(Constants.A_PAY));
		}
		else
			fAmtFrom.setValue(Net);					
		fAmtFrom.selectAll();
		//
		if (fieldTenderType.getValue() == null)
		{

		}
		else if (fieldTenderType.getValue().equals(REF_C_PaymentTenderType.CreditCard))
		{
			getPOSPanel().getPayment().setTenderType(REF_C_PaymentTenderType.CreditCard);
			labelCreditCardType.setVisible(true);
			fieldCreditCardType.setVisible(true);
			labelTrxType.setVisible(true);
			fieldTrxType.setVisible(true);
			labelCreditCardNumber.setVisible(true);
			fieldCreditCardNumber.setVisible(true);
		}
		else if (fieldTenderType.getValue().equals(REF_C_PaymentTenderType.Check))
		{
			getPOSPanel().getPayment().setTenderType(REF_C_PaymentTenderType.Check);
			labelCheck.setVisible(true);
			checkNro.setVisible(true);
		}			
	}

	private BigDecimal isPartial(String concept) {
		BigDecimal value = BigDecimal.ZERO;
		if (concept.equals(Constants.A_PAY))
		{
			value = getAmt(Constants.A_CASH).add(getAmt(Constants.A_CREDIT)).add(getAmt(Constants.A_COUPON));
		}
		else if (concept.equals(Constants.A_CASH))
		{
			value = getAmt(Constants.A_PAY).add(getAmt(Constants.A_CREDIT)).add(getAmt(Constants.A_COUPON));
		}
		else if (concept.equals(Constants.A_CREDIT))
		{
			value = getAmt(Constants.A_PAY).add(getAmt(Constants.A_CASH)).add(getAmt(Constants.A_COUPON));
		}
		else if (concept.equals(Constants.A_COUPON))
		{
			value = getAmt(Constants.A_CASH).add(getAmt(Constants.A_CREDIT)).add(getAmt(Constants.A_PAY));
		}
		return value;
	}

	public void setCredit()
	{
		Evaluation();
		bFinish.setEnabled(false);
		bPartial.setEnabled(false);
		fieldTenderType.setVisible(false);
		labelCash.setVisible(false);
		labelCredit.setVisible(true);
		pickWriteOffType.setVisible(false);
		WriteOffLabel.setVisible(false);
		pickPaymentTerm.setVisible(true);
		int ii = this.getPOSPanel().getConfig().getEmployee_C_PaymentTerm_ID();
		if (ii > 0)
		{
			pickPaymentTerm.setValue(ii);
			pickPaymentTerm.setReadWrite(false);
		}
		else
		{
			pickPaymentTerm.setValue(null);
			pickPaymentTerm.setReadWrite(true);
		}
		fAmtFrom.setReadWrite(false);
		BigDecimal Net = getAmt(Constants.A_TOTALNET); // .subtract(getTotalPayment());
		DecimalFormat format = DisplayType.getNumberFormat(DisplayType.Amount);		
		GrandTotalAmtLabel.setText(format.format(Net));				
		if ( getPOSPanel().getOrder().getC_BPartner_ID() > 0 )
		{
			BigDecimal credit = BigDecimal.ZERO;
			BigDecimal amt = this.isPartial(Constants.A_CREDIT);
			BigDecimal debt = getAmt(Constants.A_TOTALNET).subtract(amt);
			if (getPOSPanel().getPartner().getCreditAvailable().compareTo(debt) >= 0)
			{
				credit = debt;
				fAmtFrom.setValue(debt);			
				if (debt.compareTo(getAmt(Constants.A_TOTALNET)) < 0) // es un pago parcial
				{
					bPartial.setEnabled(true);
					bFinish.setEnabled(false);
				}
				else
				{
					bPartial.setEnabled(false);
					bFinish.setEnabled(true);
				}
			}
			else					
			{
				credit = getPartner().getCreditAvailable();
				if (credit.compareTo(BigDecimal.ZERO) > 0)
				{
					setAmt(Constants.A_CREDIT, credit);
					fAmtFrom.setValue(credit);
					bFinish.setEnabled(false);
					bPartial.setEnabled(true);
				}
			}
			if (credit.compareTo(BigDecimal.ZERO) > 0)
				setAmt(Constants.A_CREDIT, credit);
		}
	}
	public boolean isCoupon()
	{
		return getPaymentTermType().equals(Constants.A_COUPON);
	}
	public void setCoupon()
	{
		Evaluation();
		fAmtFrom.setValue(getAmt(Constants.A_COUPON));	
	}	
	public void setCash()
	{
		Evaluation();
		Rounding();
		BigDecimal Net = getAmt(Constants.A_TOTALNET); 
		BigDecimal WriteOff = getAmt(Constants.WriteOff);			
		DecimalFormat format = DisplayType.getNumberFormat(DisplayType.Amount);		
		GrandTotalAmtLabel.setText(format.format(Net));			
		WriteOffLabel.setText(format.format(WriteOff));
		pickWriteOffType.setVisible(true);
		WriteOffLabel.setVisible(true);
		fieldTenderType.setValue(null);
		fieldTenderType.setVisible(false);
		bFinish.setEnabled(false);
		labelCash.setVisible(true);
		labelCredit.setVisible(false);
		pickPaymentTerm.setVisible(false);		
		setCashAmtFrom();
	}	

	private void setCashAmtFrom() {		
		BigDecimal Net = null;
		BigDecimal value = isPartial(Constants.A_CASH);
		if (value.compareTo(BigDecimal.ZERO) > 0)
		{
			Net = getAmt(Constants.A_CASH);
		}
		else		
			Net = getAmt(Constants.A_TOTALNET);
		BigDecimal WriteOff = getAmt(Constants.WriteOff);

		fAmtFrom.setValue(Net.add(WriteOff));
		fAmtFrom.selectAll();		
	}

	private void Rounding() {
		BigDecimal value = isPartial(Constants.A_CASH);
		if (value.compareTo(BigDecimal.ZERO) > 0)
		{
			setAmt(Constants.A_CASH, getAmt(Constants.A_TOTALNET).subtract(getAmt(Constants.A_CASH)));
			value = getAmt(Constants.A_CASH);
		}		
		else
			value = getAmt(Constants.A_TOTALNET);
		PolicyRequest.getInstance().Cash(getPOSPanel().getOrder(), (String) pickWriteOffType.getValue(), value);
		setAmt(Constants.WriteOff,getPOSPanel().getOrder().getWriteOffAmt());
		BigDecimal WriteOff = getAmt(Constants.WriteOff);
		DecimalFormat format = DisplayType.getNumberFormat(DisplayType.Amount);
		WriteOffLabel.setText(format.format(WriteOff));
		getPOSPanel().setAdjustType((String) pickWriteOffType.getValue());
	}
	private void Evaluation()
	{
		labelCash.setVisible(false);
		WriteOffLabel.setVisible(false);
		labelCredit.setVisible(false);
		pickPaymentTerm.setVisible(false);			
		labelCheck.setVisible(false);		
		checkNro.setVisible(false);		
		labelCreditCardType.setVisible(false);		
		labelTrxType.setVisible(false);		
		labelCreditCardNumber.setVisible(false);	
		fieldCreditCardNumber.setVisible(false);
		fieldCreditCardType.setVisible(false);		
		fieldTrxType.setVisible(false);
		labelBankAccount.setVisible(false);
		fieldBankAccount.setVisible(false);		
		fAmtFrom.setReadWrite(true);			
		labelDocType.setVisible(true);
		pickDocType.setVisible(true);
		setPartner();
		setDocNumber();
		if (lookupDocType.containsKey(getPOSPanel().getOrder().getC_DocTypeTarget_ID()))
		{
			pickDocType.setValue(getPOSPanel().getOrder().getC_DocTypeTarget_ID());
			System.out.println("asignado pickDoctype ");
		}
		int AD_User_ID = getPOSPanel().getUser().getAD_User_ID();		
		fieldSalesRep.setValue(AD_User_ID);		
		getPOSPanel().getFrame().setBusy(false);
	}

	private BigDecimal getTotalPayment() {
		return getPOSPanel().getTotalPayment();
	}

	public void actionPerformed(ActionEvent e) {
		Component c = (Component)e.getSource();
		if (c.getName().equals(X_C_Order.COLUMNNAME_C_BPartner_Points_ID))
		{
			if (pickPartnerPoints.getValue() != null)
			{
				int points = Integer.valueOf(pickPartnerPoints.getValue().toString());
				MBPartner partner = MBPartner.get(Env.getCtx(), points);        		
				if (partner != null)
					this.getPOSPanel().getOrder().setC_BPartner_Points_ID(partner.getC_BPartner_ID());
			}
		}
		else if (c == fAmtFrom)
		{
			Object value;			
			if (getPOSPanel().getConfig().getbool(MachineCreator.isForceSalesman))
			{
				value = fieldSalesRep.getValue();
				if (value == null || ( value != null && value.toString().length()==0) )
				{
					if (fieldSalesRep.isMandatory())
					{
						fieldSalesRep.requestFocus();
						return;
					}
				}
			}
			value = this.pickPartner.getValue();
			if ( value == null || (value != null && value.toString().length() == 0) )
			{
				if (pickPartner.isVisible())
				{
					pickPartner.requestFocus();
					return;
				}
			}
			value = pickPartnerLocation.getValue(); 
			if ( value == null || (value != null && value.toString().length() == 0) )
			{
				if (pickPartnerLocation.isVisible())
				{
					pickPartnerLocation.requestFocus();
					return;
				}
			}			
			BigDecimal Pay = (BigDecimal) fAmtFrom.getValue();
			if (Pay == null)
				Pay = BigDecimal.ZERO;
			Pay = Pay.setScale(2, BigDecimal.ROUND_HALF_UP);	
			BigDecimal TotalPayment = getTotalPayment();
			BigDecimal Debt = getAmt(Constants.A_TOTALNET).add(getAmt(Constants.WriteOff)); // .subtract(TotalPayment);			
			if (Pay.compareTo(Debt) >= 0)
			{
				if (Pay.compareTo(getAmt(Constants.A_TOTALNET).add(getAmt(Constants.WriteOff))) >= 0)
				{
					if (getAmt(Constants.A_TOTALNET).add(getAmt(Constants.WriteOff)).compareTo(Debt) < 0)
						bFinish.setEnabled(false);
					else
					{
						bFinish.setEnabled(true);
						bFinish.requestFocus();
					}
					bPartial.setEnabled(false);
				}
				//Difference = Pay.subtract(Debt);
				//Difference = Difference.setScale(2, BigDecimal.ROUND_HALF_UP);
				setAmt(m_PayTypeAmt.getValue(), Debt);
				getPOSPanel().getOrder().setDebtAmt(Pay);
				getPOSPanel().getOrder().setDifferenceAmt(Pay.subtract(Debt).setScale(2, BigDecimal.ROUND_HALF_UP));
				//VueltoAmtLabel.setText(Pay.toString());
				VueltoAmtLabel.setText(getPOSPanel().getOrder().getDifferenceAmt().toString());				
			}				
			else
			{
				VueltoAmtLabel.setText(zero);
				//Difference = Env.ZERO;
				getPOSPanel().getOrder().setDifferenceAmt(BigDecimal.ZERO);
				//Debt = Env.ZERO;
				//Pay = Env.ZERO;
				getPOSPanel().getOrder().setDebtAmt(BigDecimal.ZERO);
				bFinish.setEnabled(false);
				bPartial.setEnabled(true);
			}
		}
		if (c.getParent() == fieldTenderType && fieldTenderType.getValue() != null)			
		{
			String tendertype = (String) fieldTenderType.getValue();
			if ( tendertype.length() > 0 )
				getPOSPanel().getPayment().setTenderType(tendertype);

			labelCheck.setVisible(false);
			checkNro.setVisible(false);
			labelCreditCardType.setVisible(false);
			fieldCreditCardType.setVisible(false);
			labelTrxType.setVisible(false);
			fieldTrxType.setVisible(false);
			labelCreditCardNumber.setVisible(false);
			fieldCreditCardNumber.setVisible(false);
			labelBankAccount.setVisible(false);
			fieldBankAccount.setVisible(false);

			if (tendertype.equals(REF_C_PaymentTenderType.CreditCard))
			{
				labelCreditCardType.setVisible(true);
				fieldCreditCardType.setVisible(true);
				labelTrxType.setVisible(true);
				fieldTrxType.setVisible(true);
				labelCreditCardNumber.setVisible(true);
				fieldCreditCardNumber.setVisible(true);
				//setSize(m_width, m_height + 50 );
			}
			else if (tendertype.equals(REF_C_PaymentTenderType.DirectDeposit))
			{
				labelBankAccount.setVisible(true);
				fieldBankAccount.setVisible(true);
				if (fieldBankAccount.getValue() != null)
				{
					Integer BankAccountID = (Integer) fieldBankAccount.getValue();
					if (BankAccountID.compareTo(getPOSPanel().getPayment().getC_BankAccount_ID()) != 0)
						getPOSPanel().getPayment().setC_BankAccount_ID(BankAccountID);
				}
				labelTrxType.setVisible(true);
				fieldTrxType.setVisible(true);
			}
			else if (tendertype.equals(REF_C_PaymentTenderType.Check))
			{
				labelCheck.setVisible(true);
				checkNro.setVisible(true);
			}	
		}
		if (c.getParent() == fieldCreditCardType)
		{
			if (fieldCreditCardType.getValue() != null)
				getPOSPanel().getPayment().setCreditCardType((String) fieldCreditCardType.getValue());
		}
		if (c.getParent() == fieldBankAccount)
		{
			if (fieldBankAccount.getValue() != null)
				getPOSPanel().getPayment().setC_BankAccount_ID((Integer) fieldBankAccount.getValue());			
		}
		if (c == bPartial)
		{
			try {
				getPOSPanel().UpsertFact("POS", getPOSPanel());				
				//this.getPOSPanel().getksession().insert(getPOSPanel());
				this.getPOSPanel().executerules(null, "validation");					
				//if (!IsDocTypeReady())
				//	throw new Exception();
				//if (!isPartnerReady())
				//	throw new Exception();
				//if (!isPaymentReady())
				//	throw new Exception();
				//ready();
				if (this.getPOSPanel().getError().length() == 0) {
					getPOSPanel().UpsertFact("POS", getPOSPanel());					
					getPOSPanel().UpsertFact("paymentpos", getPOSPanel().getPayment());
					this.getPOSPanel().executerules(null, "prepare");
					partial();
				}
			}
			catch (Exception ex)
			{
				ex.printStackTrace();
			}						
		}
		if ( c == pickCurrency)
		{
			if (pickCurrency.getValue()!= null)
				getPOSPanel().getPayment().setC_Currency_ID((Integer)pickCurrency.getValue());
		}
		if (c.getParent() == pickDocType)
		{
			if (pickDocType.getValue() != null)
			{				
				getPOSPanel().getOrder().setC_DocTypeTarget_ID((Integer) pickDocType.getValue());
				setPartner();
				//Evaluation(false);
			}
		}
		if (c == bExit)
		{			
			Void();
			hideform();			
		}
		if (c == pickWriteOffType)
		{
			Rounding();
		}
		if (c == bFinish)
		{			
			if (!bFinish.isEnabled())
				ADialog.error(0, this , "su petici�n esta siendo procesada, un momento por favor..." );
			else
			{	
				try {
					//this.getPOSPanel().getksession().insert(getPOSPanel());
					getPOSPanel().UpsertFact("POS", getPOSPanel());
					getPOSPanel().UpsertFact("paymentpos", getPOSPanel().getPayment());
					//getPOSPanel().getksession().insert(getPOSPanel().getPayment());
					this.getPOSPanel().executerules(null, "validation");					
					//if (!IsDocTypeReady())
					//	throw new Exception();
					//if (!isPartnerReady())
					//	throw new Exception();
					//if (!isPaymentReady())
					//	throw new Exception();
					if (this.getPOSPanel().getError().length() == 0) {
						//FactHandle xx = this.getPOSPanel().getksession().insert(getPOSPanel());						 
						//this.getPOSPanel().executerules(this.getPOSPanel().getksession().getEntryPointId(), "prepare");
						getPOSPanel().UpsertFact("POS", getPOSPanel());
						//getPOSPanel().getksession().insert(getPOSPanel().getPayment());
						getPOSPanel().UpsertFact("paymentpos", getPOSPanel().getPayment());
						this.getPOSPanel().executerules(null, "prepare");
						ready();
					}
				}
				catch (Exception ex)
				{
					ex.printStackTrace();
				}
			}
		}		
	}	

	public void ready() {
		bFinish.setEnabled(false);
		getPOSPanel().setStatusLine("Generando e imprimiendo...", false);
		String error = process();
		if (error.length() == 0)
		{
			Void();
			hideform();					
		}		
	}

	public void Void() {
		GrandTotalAmtLabel.setText("");
		WriteOffLabel.setText("");
		if (lookupDocType.size() > 0)
			pickDocType.setValue(((NamePair) lookupDocType.getElementAt(0)).getID());
		fieldTenderType.setValue(null);
		pickPartnerLocation.refresh();
		fieldTrxType.setValue(null);
		fieldCreditCardNumber.setValue(null);
		pickPaymentTerm.setValue(null);
		ForceBPartner.setSelected(false);
		pickDocNumber.setValue(null);
		//fieldSalesRep.setValue(null);
		checkNro.setValue(null);
		fieldBankAccount.setValue(null);
		fieldCreditCardType.setValue(null);
		fieldCreditCardNumber.setValue(null);
		fieldTrxType.setValue(null);
		if (pickPartnerPoints != null)
			pickPartnerPoints.setValue(null);
		fieldPayPartnerID.setValue(null);							
		//Pay = BigDecimal.ZERO; 
		//Difference = BigDecimal.ZERO;		
		fAmtFrom.setValue(BigDecimal.ZERO);
		setAmt(m_PayTypeAmt.getValue(), BigDecimal.ZERO);
		if (m_PayTypeAmt.isCash())
			setAmt(Constants.WriteOff, BigDecimal.ZERO);
		getPOSPanel().enableEnvironment();
	}

	private void partial() {
		BigDecimal amount = (BigDecimal) fAmtFrom.getValue();
		setAmt(m_PayTypeAmt.getValue(), amount);
		setAmt(Constants.WriteOff, BigDecimal.ZERO);
		this.getPOSPanel().getOrder().setWriteOffAmt(BigDecimal.ZERO);
		this.setVisible(false);
	}
	public MDocType getDocType() {
		MDocType doctype = null;
		if (pickDocType != null) {
			Integer doctypeid = (Integer) pickDocType.getValue();
			if (doctypeid == null)
				doctypeid = 0;
			doctype = MDocType.get(Env.getCtx(), doctypeid);
		}
		return doctype;
	}
//	public boolean IsDocTypeReady()	
//	{
//		boolean isReady = true;
//		try {
//			if (pickDocType.getValue() != null)
//			{
//				MDocType doctype = MDocType.get(Env.getCtx(), (Integer) pickDocType.getValue());
//				if (doctype.getDocBaseType().equals(REF_C_DocTypeDocBaseType.SalesOrder))
//				{
//					if (doctype.getC_DocTypeInvoice_ID() <= 0)
//						throw new Exception(Msg.translate(Env.getCtx(), "InvoiceNotValiXd"));			
//
//					MDocType doctypeInvoice  = MDocType.get(Env.getCtx(), (Integer)doctype.getC_DocTypeInvoice_ID());
//					if ( !MPeriod.isOpen(Env.getCtx(), Env.getContextAsDate(Env.getCtx(), "#Date"), 
//							doctypeInvoice.getDocBaseType(),
//							getPOSPanel().getOrder().getAD_Org_ID(),
//							getPOSPanel().getOrder().getAD_Client_ID()))							
//						throw new Exception(String.format("%s %s",Msg.translate(Env.getCtx(), "PeriodNotValid"), doctypeInvoice.getDocBaseType()));
//
//					if (this.getPOSPanel().IsOverMaxAmount(doctypeInvoice.getMaxAmt()))
//					{
//						throw new Exception("una linea excede el monto maximo por boleta");
//					}
//				}
//				getPOSPanel().getOrder().setC_DocType_ID(doctype.getC_DocType_ID());
//				getPOSPanel().getOrder().setC_DocTypeTarget_ID(doctype.getC_DocType_ID());
//			}
//			else					
//				throw new Exception(Msg.translate(Env.getCtx(), "InvalidDocType"));
//		}
//		catch (Exception e)
//		{
//			String error = e.getMessage();
//			//getPOSPanel().showErrorPanel(error);
//			isReady = false;
//		}
//		return isReady;
//	}
//	public boolean isPartnerReady()
//	{
//		boolean isReady = true;
//		try {
//			if (pickPartnerPoints != null && pickPartnerPoints.getValue() != null)
//				getPOSPanel().getOrder().setC_BPartner_Points_ID((Integer) pickPartnerPoints.getValue());		
//			getPOSPanel().getPayment().setC_BPartner_ID(getPOSPanel().getOrder().getC_BPartner_ID());
//			getPOSPanel().getOrder().setDescription(fieldName.getText());			
//
//			if ( getPartner().getC_BPartner_ID() == 0 && ClientAlias.length() == 0 )			
//				throw new Exception(Msg.translate(Env.getCtx(), "C_BPartner"));
//
//			if (fieldPayPartnerID.getValue()!=null)			
//				getPOSPanel().getOrder().setPay_BPartner_ID(((Integer) fieldPayPartnerID.getValue()));				
//		} 
//		catch (Exception e)
//		{
//			String error = e.getMessage();
//			getPOSPanel().showErrorPanel(error);
//			isReady = false;			
//		}
//		return isReady;
//	}
	public String getTrxType() {
		String trxtype = (String) fieldTrxType.getValue();
		return trxtype;
	}
//	public boolean isPaymentReady()
//	{
//		boolean isReady = true;
//		try {
//			//if (getPaymentTerm().equals(REF__PaymentRule.OnCredit) && pickPaymentTerm.getValue() == null )
//			if (getPaymentTermType().equals(Constants.A_CREDIT) && pickPaymentTerm.getValue() == null )
//				throw new Exception("la forma de pago es obligatoria");
//
//			//if ( fieldTenderType.getValue() != null && getPaymentTerm().equals(REF__PaymentRule.CreditCard))
//			if ( fieldTenderType.getValue() != null && getPaymentTermType().equals(Constants.A_PAY))
//			{
//				String trxtypevalue = (String) fieldTrxType.getValue();
//				if (trxtypevalue == null)
//					trxtypevalue = "";
//				if ( trxtypevalue.length() == 0 && 
//						fieldTenderType.getValue().equals(REF_C_PaymentTenderType.CreditCard) )
//					throw new Exception("Tipo de transaccion es obligatoria");
//
//				else if ( trxtypevalue.length() == 0 && fieldTenderType.getValue().equals(REF_C_PaymentTenderType.DirectDeposit) )							
//					throw new Exception("Tipo de transaccion es obligatoria");
//
//				else if ( trxtypevalue.length() == 0  && 
//						fieldTenderType.getValue().equals(REF_C_PaymentTenderType.DirectDeposit) )
//					throw new Exception("Tipo de transaccion es obligatoria");
//				else
//				{
//					if (trxtypevalue.length() > 0 )
//						getPOSPanel().getPayment().setTrxType((String)fieldTrxType.getValue());
//				}
//				if (fieldTenderType.getValue().equals(REF_C_PaymentTenderType.CreditCard) && 
//						fieldCreditCardType.getValue() == null )			
//					throw new Exception("el tipo de tarjeta es obligatorio");						
//
//
//				else if ( fieldTenderType.getValue().equals(REF_C_PaymentTenderType.CreditCard) && 
//						(fieldCreditCardNumber.getValue() == null ||  fieldCreditCardNumber.getValue().toString().length() == 0 )
//						)			
//					throw new Exception("el numero de tarjeta es obligatorio");				
//
//				else if ( fieldTenderType.getValue().equals(REF_C_PaymentTenderType.CreditCard) && 
//						fieldCreditCardNumber.getValue() != null && fieldCreditCardType.getValue() != null )
//				{
					MBankAccount ac = MBankAccount.get(Env.getCtx(), REF_C_BankAccountType.Card);
//					if (ac == null)				
//						throw new Exception("no existe cuenta bancaria asignada a tarjetas de credito, comuniquese con el supervisor"); 									
//					else				
//					{
//						getPOSPanel().getPayment().setCreditCardType((String) fieldCreditCardType.getValue());
//						getPOSPanel().getPayment().setCreditCardNumber((String) fieldCreditCardNumber.getValue());
//						getPOSPanel().getPayment().setC_BankAccount_ID(ac.getC_BankAccount_ID());
//					}
//				}
//			}		
//			if (checkNro.getValue() != null)
//				getPOSPanel().getPayment().setCheckNo((String)checkNro.getValue());
//		} 
//		catch (Exception e)
//		{
//			String error = e.getMessage();
//			getPOSPanel().showErrorPanel(error);
//			isReady = false;						
//		}
//		return isReady;
//	}

	private String process() {
		String error = getPOSPanel().process();
		return error;
	}
	private MBPartner getPartner() {
		return this.getPOSPanel().getPartner();
	}

	public void hideform()
	{
		this.getPOSPanel().enableEnvironment();
		setVisible(false);		
	}	//	dispose	

	public void vetoableChange (PropertyChangeEvent e)
	{
		String name = e.getPropertyName();
		Object value = e.getNewValue();
		log.config(name + "=" + value);
		if (value == null)
			return;

		if (name.equals("SalesRep_ID"))			
		{
			MUser user = MUser.get(Env.getCtx(), (int) value ); 
			if (user != null)
			{
				this.getPOSPanel().execute(user);
			}
		}
		if (name.equals(X_C_POS.COLUMNNAME_WriteOffType))
		{
			Rounding();
			setCashAmtFrom();
		}		
		if (name.equals("C_BPartner_ID"))
		{
			MBPartner partner = this.getPOSPanel().getPartner();
			if (partner.getC_BPartner_ID() != (Integer) value)
			{
				partner = MBPartner.get(Env.getCtx(), (Integer) value);
				pickPartnerLocation.refresh();
				getPOSPanel().execute(partner);
			}

		}
		if (name.equals("DateFrom"))
		{
			Timestamp datefrom = (Timestamp) DatePick.getValue();
			getPOSPanel().setDateOrdered( datefrom );
			getPOSPanel().getOrder().setDateOrdered(datefrom);
		}
		if (name.equals("C_PaymentTerm_ID"))
		{
			if (pickPaymentTerm.getValue() != null)
				getPOSPanel().getOrder().setC_PaymentTerm_ID((Integer) pickPaymentTerm.getValue());
		}
		if (name.equals("C_BPartner_Location_ID"))
		{
			if (pickPartnerLocation.getValue() != null) {
				getPOSPanel().getOrder().setC_BPartner_Location_ID((Integer) pickPartnerLocation.getValue());
			}
		}
	}   //  vetoableChange

	public BigDecimal getCardTotal() {
		return TotalCard;
	}

	public BigDecimal getCashTotal() {
		return TotalCash;
	}

	public void clean() {
		fieldName.setValue(null);
		pickPartner.setValue(null);
		pickPartnerLocation.setValue(null);		
		pickDocType.setValue(null);
		bFinish.setEnabled(true);
	}
	public void reset() {
		if (!getPOSPanel().IsFromVoided())
		{
			VueltoAmtLabel.setText(zero);
			if (fieldTenderType.getValue() != null)
			{
				fieldTenderType.setValue(null);
				fieldCreditCardType.setValue(null);
				fieldTrxType.setValue(null);
				fieldCreditCardNumber.setValue(null);				
			}
			if (checkNro.getValue() != null)
			{
				checkNro.setValue(null);
			}	
			if (pickDocNumber.getValue() != null)
			{
				pickDocNumber.setValue(null);
			}
			if (DatePick.getValue() != null)
			{
				DatePick.setValue(null);
			}
			this.pickPartnerPoints.setValue(null);
			if (lookupDocType.size() > 0)
				pickDocType.setValue(((NamePair) lookupDocType.getElementAt(0)).getID());
		}
	}
	public PosPanel getPOSPanel()
	{
		return pospanel;
	}

	public void selection() {	
		pickDocType.grabFocus();
		getPOSPanel().disableEnvironment();
	}

	public void update() {
		//fieldSalesRep.setValue(getPOSPanel().getUser().getAD_User_ID());
	}

	@Override
	public void update(Observable o, Object arg) {
		if (o instanceof MUser)
		{
			int AD_User_ID = getPOSPanel().getUser().getAD_User_ID();		
			fieldSalesRep.setValue(AD_User_ID);				
		}
		if (o instanceof MBPartner)
		{
			MBPartner p = (MBPartner) o;
			pickPartner.setValue(p.getC_BPartner_ID());		
			Env.setContext(Env.getCtx(), getPOSPanel().getWindowNo(), X_C_BPartner.COLUMNNAME_C_BPartner_ID, p.getC_BPartner_ID());
			pickPartnerLocation.setValue(null);
			pickPartnerLocation.refresh();
			// xapiens
			MBPartnerLocation ploc = p.getShipLocation();
			if (ploc != null) {
				pickPartnerLocation.setValue(ploc.getC_BPartner_Location_ID());
			}
			if (m_PayTypeAmt.isCredit())
			{
				setCredit();				
			}
		}
	}
	public String getTenderType() {
		String tendertype = (String) fieldTenderType.getValue();
		return tendertype;
	}
	public String getCreditCardType() {
		String cctype = (String) fieldCreditCardType.getValue();
		return cctype;
	}
	public String getCreditCardNumber()  {
		String ccnumber = fieldCreditCardNumber.getText();
		if (ccnumber == null)
			ccnumber = "";
		return ccnumber;
	}
	class DescriptionVerifier extends InputVerifier {
	    @Override
	    public boolean verify(JComponent input) {
	        String description = ((CTextField) input).getText();
	        getPOSPanel().getOrder().setDescription(description);   
	        return true;
	    }
	}	
}
