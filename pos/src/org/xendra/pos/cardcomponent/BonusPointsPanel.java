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
import java.util.logging.Level;
import javax.swing.*;

import org.compiere.apps.*;
import org.compiere.apps.search.InfoProduct;
import org.compiere.grid.ed.VLookup;
import org.compiere.grid.ed.VNumber;
import org.compiere.model.Lookup;
import org.compiere.model.MBPartner;
import org.compiere.model.MBonus;
import org.compiere.model.MBonusMA;
import org.compiere.model.MDocType;
import org.compiere.model.MInvoice;
import org.compiere.model.MLookup;
import org.compiere.model.MLookupFactory;
import org.compiere.model.MLookupInfo;
import org.compiere.model.MOrder;
import org.compiere.model.MPeriod;
import org.compiere.model.MProduct;
import org.compiere.model.MProductPricing;
import org.compiere.model.reference.REF_C_DocTypeDocBaseType;
import org.compiere.swing.*;
import org.compiere.util.*;
import org.xendra.Constants;
import org.xendra.common.ICardPanel;
import org.xendra.exceptions.XendraException;
import org.xendra.pos.PosPanel;

public final class BonusPointsPanel extends CardComponentPanel implements VetoableChangeListener, ActionListener 
{	
	private static CLogger log = CLogger.getCLogger(BonusPointsPanel.class);

	private static final String A_EXIT = "Cancelar";
	private int m_WindowNo = 0;		
	private AppsAction aFinish, aExit;
	private CButton bFinish, bExit;	
	private static final String A_FINISH = "Finish";
	private CPanel couponPanel = new CPanel();
	private CPanel customizePane = new CPanel(new GridBagLayout());
	private CPanel mainPanel = new CPanel();
	private VLookup pickPartner;
	private PosPanel pospanel;
	private VLookup pickBPartnerLocation;
	private MLookup lookupDocType;
	private JLabel labelDocType;
	private JLabel GrandTotalAmtLabel = new JLabel();
	public VLookup pickDocType = null;
	public CButton pickProduct = new CButton();
	private VLookup fieldSalesRep;
	private JLabel  PayAmountLabel = new JLabel("Cantidad");
	private VNumber fAmtFrom = new VNumber("AmtFrom", false, false, true, DisplayType.Amount, Msg.translate(Env.getCtx(), "AmtFrom"));
	private JLabel VueltoAmtLabel = new JLabel();
	//private String PaymentTerm = "";
	private BigDecimal m_PointsAvailable;
	private MProduct m_Product;
	private BigDecimal m_PriceList;
	private boolean m_showdialoginfo = false;

	private int M_BonusPriceList_ID;

	private int M_Warehouse_ID;
//
//	public String getPaymentTerm() {
//		return PaymentTerm;
//	}
//
//	public void setPaymentTerm(String paymentTerm) {
//		PaymentTerm = paymentTerm;
//	}
	public BonusPointsPanel (PosPanel pm)
	{
		pospanel = pm;
		//PaymentTerm =  pospanel.getPaymentTerm();
		try
		{
			java.util.Set<KeyStroke> forwardTab = new java.util.HashSet<KeyStroke>();
			forwardTab.add(KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ENTER, 0));
			this.setFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS, forwardTab);
			jbInit();
		}
		catch(Exception e)
		{
			//log.log(Level.SEVERE, "Find", e);
			e.printStackTrace();
		}
	}

	private void jbInit() {						
		M_BonusPriceList_ID  = getPOSPanel().getConfig().getM_BonusPriceList_ID();
		M_Warehouse_ID = getPOSPanel().getConfig().getM_BonusWarehouse_ID(); 

		pickPartner = VLookup.createBPartner(m_WindowNo);
		pickPartner.setMandatory(true);
		pickPartner.addVetoableChangeListener(this);

		pickProduct.setIcon(Env.getImageIcon2("Product24"));
		pickProduct.addActionListener(this);

		int AD_Column_ID = Util.getColumnID(MOrder.Table_ID, "C_BPartner_Location_ID");
		Lookup lookup = MLookupFactory.get (Env.getCtx(), m_WindowNo, 0, AD_Column_ID, DisplayType.TableDir);
		pickBPartnerLocation = new VLookup ("C_BPartner_Location_ID", true, false, true, lookup);
		pickBPartnerLocation.addVetoableChangeListener(this);

		labelDocType = new JLabel(Msg.translate(Env.getCtx(), "DocumentNo"));		

		AD_Column_ID  = Util.getColumnID(MOrder.Table_ID, "C_DocTypeTarget_ID");

		MLookupInfo lookupInfo = MLookupFactory.getLookupInfo (Env.getCtx(), m_WindowNo, AD_Column_ID, DisplayType.Table,
				Env.getLanguage(Env.getCtx()), "C_DocTypeTarget_ID", 170,
				false,String.format("  C_DocType.C_DocTypeInvoice_ID IN (SELECT C_DocType_ID FROM C_DocType WHERE DocBaseType = '%s') ",REF_C_DocTypeDocBaseType.ARInvoiceFreeTransfer));
		
		//false, "C_DocType.DocBaseType = 'FTR'  AND C_DocType.IsActive='Y'");

		lookupDocType = new MLookup (lookupInfo, 0);
		pickDocType = new VLookup("C_DocTypeTarget_ID", true, false, true, lookupDocType);
		pickDocType.addActionListener(this);
		if (lookupDocType.getSize() > 0)
			pickDocType.setValue(((NamePair) lookupDocType.getElementAt(0)).getID());

		AD_Column_ID = Util.getColumnID(MOrder.Table_ID,"SalesRep_ID");
		lookup = MLookupFactory.get (Env.getCtx(), 0, 0, AD_Column_ID, DisplayType.Search);
		fieldSalesRep = new VLookup ("SalesRep_ID", true, false, true, lookup);	
		fieldSalesRep.setValue( pospanel.getOrder().getSalesRep_ID() );

		fAmtFrom.setReadWrite(false);

		StringBuffer sb = new StringBuffer();
		sb.append(Msg.translate(Env.getCtx(), "Finish"));
		sb.append(" [F10]");
		aFinish = new AppsAction (A_FINISH, KeyStroke.getKeyStroke(KeyEvent.VK_F10, 0) , sb.toString());
		aFinish.setDelegate(this);
		bFinish = (CButton) aFinish.getButton();
		bFinish.setEnabled(false);

		sb = new StringBuffer(Msg.translate(Env.getCtx(), "Cancel"));
		sb.append(" [ESC]");		
		aExit = new AppsAction (A_EXIT, KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), sb.toString());
		aExit.setDelegate(this);		
		bExit = (CButton) aExit.getButton();


		couponPanel.setLayout(new BorderLayout());

		CPanel PayPanel = new CPanel();
		PayPanel.setBorder(BorderFactory.createTitledBorder(Msg.getMsg(Env.getCtx(), "Socio de Negocio")));
		PayPanel.setLayout(new GridBagLayout());
		PayPanel.add(pickPartner,          new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0	,GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(2, 2, 2, 0), 0, 0));
		PayPanel.add(pickBPartnerLocation, new GridBagConstraints(1, 0, 1, 1, 1.0, 0.0	,GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(2, 2, 2, 0), 0, 0));
		PayPanel.add(labelDocType,         new GridBagConstraints(0, 2, 1, 1, 1.0, 0.0	,GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(2, 2, 2, 0), 0, 0));
		PayPanel.add(pickDocType,          new GridBagConstraints(1, 2, 1, 1, 1.0, 0.0	,GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(2, 2, 2, 0), 0, 0));

		customizePane.add(PayPanel,   new GridBagConstraints(0, 1, 1, 1, 1.0, 0.0	,GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL, new Insets(2, 0, 2, 0), 0, 0));		

		CPanel bonusPanel = new CPanel();
		bonusPanel.setBorder(BorderFactory.createTitledBorder("Producto"));
		bonusPanel.add(pickProduct); // ,          new GridBagConstraints(0, 0, 1, 1, 1.0, 0.0	,GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(2, 2, 2, 0), 0, 0));		

		customizePane.add(bonusPanel, new GridBagConstraints(0, 2, 1, 1, 1.0, 0.0	,GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL, new Insets(2, 0, 2, 0), 0, 0));		

		CPanel conPanel = new CPanel();
		conPanel.setBorder(BorderFactory.createTitledBorder(Msg.getMsg(Env.getCtx(), "Venta")));
		conPanel.setLayout(new GridBagLayout());
		conPanel.add(new JLabel("Venta:"),   new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0	,GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(2, 2, 2, 0), 0, 0));
		conPanel.add(GrandTotalAmtLabel,     new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0	,GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(2, 2, 2, 0), 0, 0));

		conPanel.add(PayAmountLabel, 		 new GridBagConstraints(0, 1, 1, 1, 0.0, 0.0	,GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(2, 2, 2, 0), 0, 0));
		conPanel.add(fAmtFrom,      		 new GridBagConstraints(1, 1, 1, 1, 1.0, 0.0	,GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(2, 2, 2, 0), 0, 0));
		conPanel.add(new JLabel("Vuelto:"),  new GridBagConstraints(0, 2, 1, 1, 0.0, 0.0	,GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(2, 2, 2, 0), 0, 0));
		conPanel.add(VueltoAmtLabel,         new GridBagConstraints(1, 2, 1, 1, 0.0, 0.0	,GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(2, 2, 2, 0), 0, 0));

		conPanel.add(new JLabel("Vendedor:"),new GridBagConstraints(0, 3, 1, 1, 1.0, 0.0	,GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(2, 2, 2, 0), 0, 0));
		conPanel.add(fieldSalesRep,          new GridBagConstraints(1, 3, 1, 1, 0.0, 0.0	,GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(2, 2, 2, 0), 0, 0));

		customizePane.add(conPanel, new GridBagConstraints(0, 3, 1, 1, 1.0, 0.0	,GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL, new Insets(2, 0, 2, 0), 0, 0));


		CPanel optionsPanel = new CPanel();
		optionsPanel.setBorder(BorderFactory.createTitledBorder(Msg.getMsg(Env.getCtx(), "Acciones")));
		optionsPanel.setLayout(new GridBagLayout());
		optionsPanel.add(bFinish, 		 new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0	,GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(2, 2, 2, 0), 0, 0));
		optionsPanel.add(bExit,    		 new GridBagConstraints(1, 0, 1, 1, 1.0, 0.0	,GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(2, 2, 2, 0), 0, 0));

		customizePane.add(optionsPanel, new GridBagConstraints(0, 4, 1, 1, 1.0, 0.0	,GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL, new Insets(2, 0, 2, 0), 0, 0));

		mainPanel.add(couponPanel,   BorderLayout.NORTH);
		mainPanel.add(customizePane, BorderLayout.CENTER);
		add(mainPanel, BorderLayout.NORTH);
	}	

	private Boolean UpdateOrder() {
		Boolean OrderIsReady = true;

		if (pickDocType.getValue() != null)
		{
			MDocType doctype = MDocType.get(Env.getCtx(), (Integer) pickDocType.getValue());
			MDocType doctypeInvoice  = MDocType.get(Env.getCtx(), (Integer)doctype.getC_DocTypeInvoice_ID());
			if ( !MPeriod.isOpen(Env.getCtx(), Env.getContextAsDate(Env.getCtx(), "#Date"), doctypeInvoice.getDocBaseType(), pospanel.getOrder().getAD_Org_ID(), pospanel.getOrder().getAD_Client_ID() ))

			{
				getPOSPanel().getStatusBar().setStatusLine(Msg.translate(Env.getCtx(), "PeriodNotValid"), true);
				log.log(Level.FINE, "period open");
				OrderIsReady = false;
			}						 
//			if (doctype.getAD_LP_ID() == 0)
//			{
//				getPOSPanel().getStatusBar().setStatusLine("No esta definida la impresora para el documento", true);
//				OrderIsReady = false;
//			}
		}
		else
		{
			getPOSPanel().getStatusBar().setStatusLine(Msg.translate(Env.getCtx(), "InvalidDocType"), true);
			log.log(Level.FINE, "invalid doc type");
			OrderIsReady = false;
		}
		if (this.pickPartner.getValue() == null)
		{
			getPOSPanel().getStatusBar().setStatusLine(Msg.translate(Env.getCtx(), "C_BPartner"), true);
			OrderIsReady = false;
		}
		if (fieldSalesRep.getValue()==null)
		{
			getPOSPanel().getStatusBar().setStatusLine(Msg.translate(Env.getCtx(), "SalesRep_ID"),true);
			OrderIsReady = false;
		}
		if (!pospanel.IsPriceListOk())
		{
			OrderIsReady = false;
		}

		return OrderIsReady;
	}

	public void actionPerformed(ActionEvent e) {
		Component c = (Component)e.getSource();		

		if (c == fAmtFrom)
		{
			//BigDecimal debt = pospanel.getTotalNet();
			BigDecimal debt = getAmt(Constants.A_TOTALNET);  
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

		if (c == this.pickProduct)
		{
			Integer oldM_PriceList_Version_ID = Env.getContextAsInt(Env.getCtx(), Env.WINDOW_INFO, Env.TAB_INFO, "M_PriceList_Version_ID");
			Env.setContext(Env.getCtx(), Env.WINDOW_INFO, Env.TAB_INFO, "M_Product_ID",  "0");
			InfoProduct m_info = new InfoProduct (getPOSPanel().getFrame(), true, Env.WINDOW_INFO,					
					M_Warehouse_ID,
					M_BonusPriceList_ID /*model.priceListVersion.getM_PriceList_ID()*/,
					0/*m_order.getM_PriceListVersion_ID()*/ /*model.config.getM_PriceList_Version_ID()*/,					
					//isKey?mTextToFind.trim(): "@"+ mTextToFind.trim() +"%",		//	value
					"",		//	value
					false, 
					"", 
					true, true);
			AEnv.showCenterWindow(getPOSPanel().getFrame(), m_info);		
			if (m_info.isCancelled())
			{
				m_Product = null;
				pickProduct.setText("");
				m_PriceList = Env.ZERO;
			}
			else
			{
				Integer M_Product_ID = Env.getContextAsInt(Env.getCtx(), Env.WINDOW_INFO, Env.TAB_INFO, "M_Product_ID");
				m_Product = MProduct.get(Env.getCtx(), M_Product_ID, null);
				MProductPricing pp = new MProductPricing (M_Product_ID.intValue(), (Integer) this.pickPartner.getValue() , Env.ZERO, true);
				pp.setM_PriceList_ID(M_BonusPriceList_ID);
				int M_PriceList_Version_ID;
				M_PriceList_Version_ID = Env.getContextAsInt(Env.getCtx(), Env.WINDOW_INFO, Env.TAB_INFO, "M_PriceList_Version_ID");
				// restauramos el PriceListVersion anterior para que se venda con la lista de precios definida en el POS
				Env.setContext(Env.getCtx(), Env.WINDOW_INFO, Env.TAB_INFO, "M_PriceList_Version_ID", String.valueOf(oldM_PriceList_Version_ID));
				pp.setM_PriceList_Version_ID(M_PriceList_Version_ID); 
				pp.setPriceDate(pospanel.getDateOrdered());
				m_PriceList = pp.getPriceList();
				DecimalFormat format = DisplayType.getNumberFormat(DisplayType.Amount);
				GrandTotalAmtLabel.setText(format.format(m_PriceList));				
				pickProduct.setText(m_Product.getName());
				//
				BigDecimal vuelto = m_PointsAvailable.subtract(m_PriceList); 
				// calculamos
				if ( vuelto.compareTo(Env.ZERO) >= 0 )
				{
					VueltoAmtLabel.setText(format.format(vuelto));
					this.bFinish.setEnabled(true);
				}
				else
					this.bFinish.setEnabled(false);
			}
		}

		if (c == bExit)
		{
			this.hideform();
			this.getPOSPanel().enableEnvironment();
		}
		if (c == bFinish)
		{			
			if (UpdateOrder())
			{
				getPOSPanel().getStatusBar().setStatusLine("Generando e imprimiendo...", false);				
				process();			
				hideform();
			}
		}		
	}	

	private void process() {
		int C_BPartner_ID = (Integer) pickPartner.getValue();
		pospanel.resetOrder();
		pospanel.Void();

		MOrder order = pospanel.getOrder();
		order.setC_DocType_ID((Integer) pickDocType.getValue());
		order.setC_DocTypeTarget_ID((Integer) pickDocType.getValue());
		order.setC_BPartner_ID(C_BPartner_ID);
		order.setBill_BPartner_ID(C_BPartner_ID); // el bill partner ID se usa para crear el socio de negocio en la factura.
		order.setC_BPartner_Location_ID((Integer)pickBPartnerLocation.getValue());
		order.setSalesRep_ID((Integer) fieldSalesRep.getValue());
		order.setM_Warehouse_ID(M_Warehouse_ID);

		pospanel.AddProduct(false, m_Product, Env.ONE, 0, 0, null, 0, false);
		String error = pospanel.process();
		if (error.length() == 0)
		{
			Trx trx = Trx.get(Trx.createTrxName(), true);
			trx.start();
			try {				
			} 
			catch (Exception e) {
				e.printStackTrace();
				trx.rollback();
			} finally {
				trx.close();
			}				
		}
	}

	public String getErrorMsg() { return null; }

	public void setError(String error) {}

	public String getProcessMsg() { return null; }

	public void setInfo(String info) {}

	public String getInfo() {return null;}

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

			m_PointsAvailable = MBonus.getPointsByBPartner((Integer) value);

			fAmtFrom.setValue(m_PointsAvailable);
		}
	}   //  vetoableChange

	public void hideform()
	{
		setVisible(false);
	}	//	dispose	

	public PosPanel getPOSPanel()
	{
		return pospanel;
	}

	public void selection() {
		this.pickPartner.requestFocus();
	}

	@Override
	public void Void() {
		// TODO Auto-generated method stub
		
	}
}
