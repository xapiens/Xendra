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
import java.awt.event.KeyEvent;
import java.beans.PropertyChangeEvent;
import java.beans.VetoableChangeListener;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import net.miginfocom.swing.MigLayout;

import org.compiere.apps.*;
import org.compiere.grid.ed.VDate;
import org.compiere.grid.ed.VLookup;
import org.compiere.grid.ed.VNumber;
import org.compiere.model.Lookup;
import org.compiere.model.MCoupon;
import org.compiere.model.MDocType;
import org.compiere.model.MInvoice;
import org.compiere.model.MLookup;
import org.compiere.model.MLookupFactory;
import org.compiere.model.MLookupInfo;
import org.compiere.model.MOrder;
import org.compiere.model.MOrderLine;
import org.compiere.model.MPeriod;
import org.compiere.model.persistence.X_C_Coupon;
import org.compiere.swing.*;
import org.compiere.util.*;
import org.xendra.Constants;
import org.xendra.common.ICardPanel;
import org.xendra.pos.wizard.MachineCreator;
import org.xendra.pos.CouponItem;
import org.xendra.pos.CouponRenderer;
import org.xendra.pos.PosPanel;
import org.xendra.pos.StatusBar;

public final class CouponPanel extends CardComponentPanel implements VetoableChangeListener, ActionListener, ListSelectionListener 
{	
	private static final long serialVersionUID = 3870922921972902720L;
	private static CLogger log = CLogger.getCLogger(CouponPanel.class);
	
	private int m_WindowNo = 0;
	protected StatusBar statusBar = new StatusBar();
	private boolean partial = false;
	
	private AppsAction aFinish, aExit, aPartial;
	private CButton bFinish, bExit, bPartial;	
	
	private BigDecimal TotalCoupon;
	private CLabel lTotalCoupon = new CLabel("0.00", JLabel.RIGHT);
	private CPanel couponPanel = new CPanel();
	private CPanel customizePane = new CPanel(new MigLayout());
	private CPanel mainPanel = new CPanel();
	private VLookup pickPartnerPoints;
	private VLookup pickPartner;
	private CLabel labelName = new CLabel();
	private CTextField fieldName = new CTextField(10);
	//private PosPanel pospanel;
	private String ClientAlias = "";
	private VLookup pickBPartnerLocation;
	private MLookup lookupDocType;
	private JLabel labelDocType;
	private JLabel GrandTotalAmtLabel = new JLabel();
	public VLookup pickDocType = null;
	private CLabel labelDate = new CLabel(Msg.translate(Env.getCtx(), "DateOrdered"));
	private VDate DatePick = new VDate("DateFrom", true, false, true, DisplayType.DateTime, Msg.translate(Env.getCtx(), "DateFrom"));
	private CLabel labelDocNumber = new CLabel(Msg.translate(Env.getCtx(), "Value"));
	private CTextField pickDocNumber = new CTextField(10);
	private VLookup fieldSalesRep;
	private JLabel  PayAmountLabel = new JLabel("Cantidad");
	private VNumber fAmtFrom = new VNumber("AmtFrom", false, false, true, DisplayType.Amount, Msg.translate(Env.getCtx(), "AmtFrom"));
	private JLabel VueltoAmtLabel = new JLabel();
	private String PaymentTerm = "";
	private JButton addbutton;
	private JList listDraftExchange;
	private VLookup pickCoupon;
	private DefaultListModel couponmodel;	
	private String m_PayTypeAmt = "";
	
	public CouponPanel (PosPanel pp)
	{
		super(pp);		
		//PaymentTerm =  pospanel.getPaymentTerm();
		m_WindowNo = 0;
		try
		{
	        java.util.Set<KeyStroke> forwardTab = new java.util.HashSet<KeyStroke>();
	        forwardTab.add(KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ENTER, 0));
	        this.setFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS, forwardTab);
			jbInit();			
			Evaluation();
		}
		catch(Exception e)
		{
			log.log(Level.SEVERE, "Find", e);
			e.printStackTrace();
		}		
	}
	
	public CouponPanel (Frame frame, int WindowNo, String title, PosPanel pos)
	{
		pospanel = pos;		
		m_WindowNo = WindowNo;
		try
		{
	        java.util.Set<KeyStroke> forwardTab = new java.util.HashSet<KeyStroke>();
	        forwardTab.add(KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ENTER, 0));
	        this.setFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS, forwardTab);
			jbInit();			
			Evaluation();
		}
		catch(Exception e)
		{
			log.log(Level.SEVERE, "Find", e);
		}
	}

	private void jbInit() {		
		//this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		pickPartner = VLookup.createBPartner(m_WindowNo);
		pickPartner.setMandatory(true);
		pickPartner.addVetoableChangeListener(this);
		
		labelName.setText(Msg.getMsg(Env.getCtx(), "Name"));

		int AD_Column_ID = Util.getColumnID(MInvoice.Table_ID, "C_BPartner_ID");
		Lookup lookup = MLookupFactory.get (Env.getCtx(), m_WindowNo, 0, AD_Column_ID, DisplayType.Search);
		pickPartnerPoints = new VLookup ("C_BPartner_Points_ID", false, false, true, lookup);
		
		AD_Column_ID = Util.getColumnID(MOrder.Table_ID, "C_BPartner_Location_ID");
		lookup = MLookupFactory.get (Env.getCtx(), m_WindowNo, 0, AD_Column_ID, DisplayType.TableDir);
		pickBPartnerLocation = new VLookup ("C_BPartner_Location_ID", true, false, true, lookup);
		pickBPartnerLocation.addVetoableChangeListener(this);
		
		labelDocType = new JLabel(Msg.translate(Env.getCtx(), "DocumentNo"));		

		AD_Column_ID  = Util.getColumnID(MOrder.Table_ID, "C_DocTypeTarget_ID");
			
		MLookupInfo lookupInfo = MLookupFactory.getLookupInfo (Env.getCtx(), m_WindowNo, AD_Column_ID, DisplayType.Table,
				Env.getLanguage(Env.getCtx()), "C_DocTypeTarget_ID", 170,
				false, "C_DocType.C_DocType_ID IN (SELECT C_DocType_ID FROM C_POSDocType WHERE C_POS_ID = "+getPOSPanel().getConfig().getC_POS_ID()+")");
				//false, "C_DocType.DocBaseType IN ('SOO') AND C_DocType.DocSubType IN ('WR','RM') AND C_DocType.IsSOTrx='Y' AND C_DocType.C_POS_ID='"+getPOSPanel().getModel().getConfig().getC_POS_ID()+"' AND C_DocType.IsActive='Y'");

		lookupDocType = new MLookup (lookupInfo, 0);				
		pickDocType = new VLookup("C_DocTypeTarget_ID", true, false, true, lookupDocType);
		pickDocType.addActionListener(this);

		AD_Column_ID = Util.getColumnID(MOrder.Table_ID,"SalesRep_ID");
		lookup = MLookupFactory.get (Env.getCtx(), 0, 0, AD_Column_ID, DisplayType.Search);
		fieldSalesRep = new VLookup ("SalesRep_ID", true, false, true, lookup);	
		fieldSalesRep.setValue(getPOSPanel().getUser().getAD_User_ID());
		
		fAmtFrom.addActionListener(this);
		
		StringBuffer sb = new StringBuffer();
		sb.append(Msg.translate(Env.getCtx(), "Finish"));
		sb.append(" [F10]");
		aFinish = new AppsAction (Constants.A_FINISH, KeyStroke.getKeyStroke(KeyEvent.VK_F10, 0) , sb.toString());
		aFinish.setDelegate(this);
		bFinish = (CButton) aFinish.getButton();
		bFinish.setEnabled(false);
		
		sb = new StringBuffer(Msg.translate(Env.getCtx(), "Partial"));
		sb.append(" [F2]");		
		aPartial = new AppsAction (Constants.A_PARTIAL, KeyStroke.getKeyStroke(KeyEvent.VK_F2, 0), sb.toString());
		//aPartial = new AppsAction (Constants.A_PARTIAL,null, sb.toString());
		aPartial.setDelegate(this);		
		bPartial = (CButton) aPartial.getButton();

		
		sb = new StringBuffer(Msg.translate(Env.getCtx(), "Cancel"));
		sb.append(" [ESC]");		
		aExit = new AppsAction (Constants.A_EXIT, KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), sb.toString());
		aExit.setDelegate(this);		
		bExit = (CButton) aExit.getButton();

		
		couponPanel.setLayout(new BorderLayout());
		CPanel testpanel = new CPanel();
		testpanel.setBorder(BorderFactory.createTitledBorder(Msg.getElement(Env.getCtx(), "Search")));
		testpanel.setLayout(new MigLayout());
		testpanel.add(new JLabel("Search"),"wrap");
		//VLookup 
		
		AD_Column_ID = Util.getColumnID(X_C_Coupon.Table_ID, X_C_Coupon.COLUMNNAME_C_Coupon_ID);
		lookup = MLookupFactory.get (Env.getCtx(), m_WindowNo, 0, AD_Column_ID, DisplayType.Search);		

		pickCoupon = new VLookup (X_C_Coupon.COLUMNNAME_C_Coupon_ID, false, false, true, lookup);
		pickCoupon.setFilter("COALESCE(C_Order_ID,0) = 0");
		addbutton = new JButton("Add");
		addbutton.addActionListener(this);
		testpanel.add(pickCoupon);
		testpanel.add(addbutton,"wrap");
		couponmodel = new DefaultListModel();
		listDraftExchange  = new JList(couponmodel);
		listDraftExchange.setSelectedIndex(0);
		listDraftExchange.setVisibleRowCount(5);
		listDraftExchange.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		listDraftExchange.setCellRenderer(new CouponRenderer());
		listDraftExchange.addListSelectionListener(this);		
		JScrollPane listScroller = new JScrollPane(listDraftExchange);
		listScroller.setPreferredSize(new Dimension(250, 80));
		testpanel.add(listScroller,"span");
		couponPanel.add(testpanel, BorderLayout.CENTER);
		couponPanel.add(lTotalCoupon , BorderLayout.SOUTH);		
		customizePane.add(couponPanel, "wrap");
		
		CPanel PayPanel = new CPanel(new MigLayout());
		PayPanel.setBorder(BorderFactory.createTitledBorder(Msg.getMsg(Env.getCtx(), "Socio de Negocio")));
		PayPanel.add(labelName,            "wrap");
		PayPanel.add(fieldName,            "wrap");
		PayPanel.add(pickPartner,          "wrap");
		PayPanel.add(pickBPartnerLocation, "wrap");
		PayPanel.add(labelDocType,         "wrap");
		PayPanel.add(pickDocType,          "wrap");

		int daterow = 0;
		if (getPOSPanel().getConfig().getbool(MachineCreator.isModifyDate))
		{
			PayPanel.add(labelDate,         "wrap");
			PayPanel.add(DatePick,          "wrap");
			
			daterow++;
		}				
		if (getPOSPanel().getConfig().getbool(MachineCreator.ismodifydocnumber))
		{
			PayPanel.add(labelDocNumber,   "wrap");
			PayPanel.add(pickDocNumber,    "wrap");
			
		}
		customizePane.add(PayPanel,  "wrap");
		CPanel bonusPanel = new CPanel(new MigLayout());
		bonusPanel.setBorder(BorderFactory.createTitledBorder(Msg.getMsg(Env.getCtx(), "Puntos Bonus")));
		bonusPanel.add(new JLabel("Asignar:"));
		bonusPanel.add(pickPartnerPoints);
		customizePane.add(bonusPanel, "wrap");
		
		CPanel conPanel = new CPanel(new MigLayout());
		conPanel.setBorder(BorderFactory.createTitledBorder(Msg.getMsg(Env.getCtx(), "Venta")));
		//
		conPanel.add(new JLabel("Venta:"));
		conPanel.add(GrandTotalAmtLabel, "wrap");
		conPanel.add(PayAmountLabel);
		conPanel.add(fAmtFrom,"wrap");
		conPanel.add(new JLabel("Vuelto:"));
		conPanel.add(VueltoAmtLabel,"wrap");
		conPanel.add(new JLabel("Vendedor:"));
		conPanel.add(fieldSalesRep, "wrap");		
		customizePane.add(conPanel, "wrap");
				
		CPanel coxPanel = new CPanel();
		coxPanel.setBorder(BorderFactory.createTitledBorder(Msg.getMsg(Env.getCtx(), "Acciones")));
		coxPanel.setLayout(new MigLayout());
		coxPanel.add(bFinish);
		coxPanel.add(bPartial);
		coxPanel.add(bExit);		
		customizePane.add(coxPanel, "wrap");

		mainPanel.add(customizePane, BorderLayout.CENTER);
		add(mainPanel, BorderLayout.NORTH);
	}	
		
	void Evaluation()
	{
		if (getPOSPanel().IsFromVoided())
		{
			fieldName.setValue(getPOSPanel().getOrder().getDescription());
			pickPartner.setValue(getPOSPanel().getOrder().getC_BPartner_ID());
			//pickBPartnerLocation.setValue(getPOSPanel().getOrder().getC_BPartner_Location_ID());
		}
		fAmtFrom.setValue(getAmt(Constants.A_COUPON));
		//labelCash.setVisible(false);
		// aca restamos lo ya generado en otros medios para solo tener pendiente el saldo.
		//BigDecimal TotalParcial = getPOSPanel().getTotalParcial();
		BigDecimal TotalParcial = getAmt(Constants.A_CASH).add(getAmt(Constants.A_PAY));
		BigDecimal Net = getAmt(Constants.A_TOTALNET); // .subtract(TotalParcial);
		DecimalFormat format = DisplayType.getNumberFormat(DisplayType.Amount);
		// monto total de la venta
		GrandTotalAmtLabel.setText(format.format(Net));
		//fAmtFrom.setValue(Net);
		fAmtFrom.selectAll();
	}

	private Integer getPartner() {
		
		Integer C_Bpartner_ID = 0;
		if (fieldName.getValue().toString().length() > 0) // no Business Partner - Business Partner by default
			ClientAlias  = (String) fieldName.getValue();

		C_Bpartner_ID = getPOSPanel().getOrder().getC_BPartner_ID();
		
		return C_Bpartner_ID;
	}
	
	

	private Boolean UpdateOrder() {
		Boolean OrderIsReady = true;
		if (pickPartnerPoints.getValue() != null)
			getPOSPanel().getOrder().setC_BPartner_Points_ID((Integer) pickPartnerPoints.getValue());
			getPOSPanel().bPartner(pickPartner.getValue());			
			getPOSPanel().getPayment().setC_BPartner_ID(getPOSPanel().getOrder().getC_BPartner_ID());
			if (getPOSPanel().getOrder().getDescription()!= null)
				getPOSPanel().getOrder().setDescription("");
		getPOSPanel().getOrder().setDescription(fieldName.getText());
		
		if (pickDocType.getValue() != null)
		{
			MDocType doctype = MDocType.get(Env.getCtx(), (Integer) pickDocType.getValue());
			MDocType doctypeInvoice  = MDocType.get(Env.getCtx(), (Integer)doctype.getC_DocTypeInvoice_ID());
			if ( !MPeriod.isOpen(Env.getCtx(), Env.getContextAsDate(Env.getCtx(), "#Date"), doctypeInvoice.getDocBaseType() , pospanel.getOrder().getAD_Org_ID(), pospanel.getOrder().getAD_Client_ID() ))
			
			{
				statusBar.setStatusLine(Msg.translate(Env.getCtx(), "PeriodNotValid"), true);
				log.log(Level.FINE, "period open");
				OrderIsReady = false;
			}						 
			getPOSPanel().getOrder().setC_DocType_ID(doctype.getC_DocType_ID());
			getPOSPanel().getOrder().setC_DocTypeTarget_ID(doctype.getC_DocType_ID());
		}
		else
		{
			statusBar.setStatusLine(Msg.translate(Env.getCtx(), "InvalidDocType"), true);
			log.log(Level.FINE, "invalid doc type");
			OrderIsReady = false;
		}
		if ( getPartner() == 0 && ClientAlias.length() == 0 )
		{
			statusBar.setStatusLine(Msg.translate(Env.getCtx(), "C_BPartner"), true);
			OrderIsReady = false;
		}
		if (fieldSalesRep.getValue()==null)
		{
			statusBar.setStatusLine(Msg.translate(Env.getCtx(), "SalesRep_ID"),true);
			OrderIsReady = false;
		}
		else
			getPOSPanel().getOrder().setSalesRep_ID((Integer) fieldSalesRep.getValue());
		
		
		return OrderIsReady;
	}
	
	public void actionPerformed(ActionEvent e) {
		Component c = (Component)e.getSource();		
		
		if (c == fAmtFrom)
		{
			//BigDecimal TotalParcial = getPOSPanel().getTotalParcial();
			BigDecimal debt = getAmt(Constants.A_TOTALNET); // .subtract(TotalParcial);
			BigDecimal Pay = (BigDecimal) fAmtFrom.getValue();
			if (Pay == null)
				Pay = Env.ZERO;
			if (Pay.compareTo(debt) >= 0)
			{
				if (Pay.compareTo(getAmt(Constants.A_TOTALNET)) >= 0)
					bFinish.setEnabled(true);				
				Pay = Pay.subtract(debt);
				Pay = Pay.setScale(2, BigDecimal.ROUND_HALF_UP);
				VueltoAmtLabel.setText(Pay.toString());
			}				
			else
			{
				VueltoAmtLabel.setText(Env.ZERO.toString());
				bFinish.setEnabled(false);
			}
		}
		
		if (c == bPartial)
		{
			//setCoupons();
			partial();
			//setVisible(false);
		}
		if (c == bExit)
		{
			//dispose();
			Void();
			hideform();
		}
		if (c == bFinish)
		{	
			this.getPOSPanel().executerules(null, "validatecoupon");
			if (this.getPOSPanel().getError().length() == 0) {
				if (UpdateOrder())
				{
					statusBar.setStatusLine("Generando e imprimiendo...", false);
					setCoupons();
					//getPOSPanel().setCouponAmt(getGrandTotal());
					setAmt(Constants.A_COUPON, getGrandTotal());
					String error = process();
					if (error.length() == 0)
					{
						Void();
						hideform();
					}
				}				
			}
		}
		if (c == addbutton)
		{		
			boolean goahead = true;
			Integer C_Coupon_ID = (Integer) pickCoupon.getValue();
			MCoupon coupon = MCoupon.get(Env.getCtx(), C_Coupon_ID, null);
			if (coupon.getC_Order_ID() > 0)
			{
				getPOSPanel().showErrorPanel("el coupon ya fue utilizado");				
			}
			else
			{
				CouponItem ci = new CouponItem();
				ci.setCoupon(coupon);
				DefaultListModel modelAll = (DefaultListModel) listDraftExchange.getModel();
				for (int j=0;j < modelAll.getSize();j++)
				{
					CouponItem cie = (CouponItem) modelAll.get(j);
					if (cie.getCoupon().equals(ci.getCoupon()))
					{
						goahead = false;
						break;
					}
				}
				if (goahead)
				{
					couponmodel.addElement(ci);
					calculate();
				}
			}
		}
	}	
	
	private void partial() {
		UpdateOrder();
		partial = true;
		setCoupons();
		//getPOSPanel().Partial(getGrandTotal());
		setAmt(Constants.A_COUPON, getGrandTotal());
		setVisible(false);
	}
	public Integer getLength()  {
		Integer size = 0;
		DefaultListModel modelAll = (DefaultListModel) listDraftExchange.getModel();
		size = modelAll.getSize();
		return size;
	}
	private void setCoupons() {

 		ArrayList<X_C_Coupon> list = new ArrayList<X_C_Coupon>();
		DefaultListModel modelAll = (DefaultListModel) listDraftExchange.getModel();
		for (int j=0;j < modelAll.getSize();j++)
		{
			CouponItem cie = (CouponItem) modelAll.get(j);
			list.add(cie.getCoupon());
		}		
		getPOSPanel().setCoupons(list);		
	}


	private String process() {
		
		String error = getPOSPanel().process();
		return error;
	}
		
	public void vetoableChange (PropertyChangeEvent e)
	{
		String name = e.getPropertyName();
		Object value = e.getNewValue();
		log.config(name + "=" + value);
		if (value == null)
			return;

		//  BPartner
		if (name.equals("C_BPartner_ID"))
		{
			Env.setContext(Env.getCtx(), m_WindowNo, "C_BPartner_ID", value.toString() );		
			pickBPartnerLocation.refresh();
			pickBPartnerLocation.requestFocus();						
		}
	}   //  vetoableChange

	
	private void calculate() {
		TotalCoupon = Env.ZERO;
		DefaultListModel modelAll = (DefaultListModel) listDraftExchange.getModel();
		for (int j=0;j < modelAll.getSize();j++)
		{
			CouponItem cie = (CouponItem) modelAll.get(j);
			TotalCoupon = TotalCoupon.add(cie.getAmount());
		}
		lTotalCoupon.setText(TotalCoupon.toString());
		fAmtFrom.setValue(TotalCoupon);
		bFinish.setEnabled(TotalCoupon.compareTo(getAmt(Constants.A_TOTALNET)) >= 0);
	}


	public BigDecimal getGrandTotal() {
		calculate();
		return TotalCoupon;
	}
		
	public void hideform()
	{
		if (partial)
		{
			//getPOSPanel().Partial( Env.ZERO);
			setAmt(Constants.A_COUPON, BigDecimal.ZERO);
		}		
		getPOSPanel().enableEnvironment();
		setVisible(false);
	}	//	dispose	
	

	public void Void() {
		DefaultListModel modelAll = (DefaultListModel) listDraftExchange.getModel();
		modelAll.clear();
		calculate();
		fieldName.setValue("");		
		VueltoAmtLabel.setText(Env.ZERO.toString());
		pickPartner.setValue(null);
		pickBPartnerLocation.setValue(null);
		lTotalCoupon.setText("");		
		fAmtFrom.setValue(BigDecimal.ZERO);

		//pickDocType.setValue(null);
		if (lookupDocType.size() > 0)
			pickDocType.setValue(((NamePair) lookupDocType.getElementAt(0)).getID());		
	}

	public void updateTerm(String paymentTerm) {
		PaymentTerm =  paymentTerm;
		Evaluation();
	}
	
	public PosPanel getPOSPanel()
	{
		return pospanel;
	}

	@Override
	public void valueChanged(ListSelectionEvent ev) {
		if (ev.getValueIsAdjusting())
			return;

		int selected[] = listDraftExchange.getSelectedIndices();
		if (selected.length > 0)
		{			
			
			//BigDecimal total = Env.ZERO;
			DefaultListModel modelAll = (DefaultListModel) listDraftExchange.getModel();
			CouponItem ci = (CouponItem) modelAll.get(selected[0]);			
			if (ADialog.ask(m_WindowNo, getPOSPanel(), ci.toString().concat(" Anular ?"))) {
				modelAll.remove(selected[0]);
				calculate();
			}
		}				
	}

	@Override
	public void selection() {
		pickCoupon.grabFocus();
	}
	public void setPayTypeAmt(String paytypeAmt) {
		m_PayTypeAmt =  paytypeAmt;		
		Evaluation();
	}

}
