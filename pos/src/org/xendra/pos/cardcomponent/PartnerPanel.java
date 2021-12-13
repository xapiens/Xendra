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
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DecimalFormat;
import java.util.Observable;
import java.util.logging.Level;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import net.miginfocom.swing.MigLayout;

import org.compiere.apps.*;
import org.compiere.grid.ed.VLookup;
import org.compiere.model.Lookup;
import org.compiere.model.MBPartner;
import org.compiere.model.MClientInfo;
import org.compiere.model.MColumn;
import org.compiere.model.MLookupFactory;
import org.compiere.model.MOrder;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_C_BPartner;
import org.compiere.model.persistence.X_C_Invoice;
import org.compiere.swing.*;
import org.compiere.util.*;
import org.xendra.Constants;
import org.xendra.pos.PosPanel;

public final class PartnerPanel extends CardComponentPanel implements VetoableChangeListener, ActionListener 
{	
	private static CLogger log = CLogger.getCLogger(PartnerPanel.class);
	private int m_WindowNo = 0;
	private AppsAction aFinish, aExit;
	private CButton bFinish, bExit;	
	
	private CPanel customizePane = new CPanel(new MigLayout());
	private CPanel mainPanel = new CPanel();
	private PosPanel pospanel;
	private VLookup pickPartner = new VLookup();
	private CLabel creditLimit = new CLabel();
	private CLabel creditAvailable = new CLabel();
	private DecimalFormat format = DisplayType.getNumberFormat(DisplayType.Amount);
	private MBPartner m_partner;

	/**
	 * @wbp.parser.constructor
	 */
	public PartnerPanel (PosPanel pp)
	{
		pospanel = pp;
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
	
	public PartnerPanel (Frame frame, int WindowNo, String title, PosPanel pos)
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
		int AD_Column_ID = MColumn.getColumn_ID(X_C_Invoice.Table_Name, X_C_BPartner.COLUMNNAME_C_BPartner_ID, null);    //  C_Invoice.C_BPartner_ID
		Lookup lookup = MLookupFactory.get (Env.getCtx(), m_WindowNo,	0, AD_Column_ID, DisplayType.Search);
		pickPartner = new VLookup (X_C_BPartner.COLUMNNAME_C_BPartner_ID, false, false, true, lookup);
		//pickPartner = VLookup.createBPartner(m_WindowNo);
		pickPartner.setMandatory(true);
		pickPartner.addVetoableChangeListener(this);		

		StringBuffer sb = new StringBuffer();
		sb.append(Msg.translate(Env.getCtx(), "Finish"));
		sb.append(" [F10]");
		aFinish = new AppsAction (Constants.A_FINISH, KeyStroke.getKeyStroke(KeyEvent.VK_F10, 0) , sb.toString());
		aFinish.setDelegate(this);
		bFinish = (CButton) aFinish.getButton();
		
		sb = new StringBuffer(Msg.translate(Env.getCtx(), "Cancel"));
		sb.append(" [ESC]");		
		aExit = new AppsAction (Constants.A_EXIT, KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), sb.toString());
		aExit.setDelegate(this);		
		bExit = (CButton) aExit.getButton();
	
		CPanel PayPanel = new CPanel(new MigLayout());
		PayPanel.setBorder(BorderFactory.createTitledBorder(Msg.getMsg(Env.getCtx(), "Socio de Negocio")));
		PayPanel.add(pickPartner,  "wrap");
		PayPanel.add(creditLimit, "wrap");
		PayPanel.add(creditAvailable, "wrap");
		customizePane.add(PayPanel,  "wrap");
		
		CPanel coxPanel = new CPanel(new MigLayout());
		coxPanel.setBorder(BorderFactory.createTitledBorder(Msg.getMsg(Env.getCtx(), "Acciones")));		
		coxPanel.add(bFinish);		
		coxPanel.add(bExit);		
		customizePane.add(coxPanel, "wrap");
		
		mainPanel.add(customizePane, BorderLayout.WEST);
		add(mainPanel, BorderLayout.NORTH);
	}	
		
	void Evaluation()
	{		
		pickPartner.setValue(getPOSPanel().getOrder().getC_BPartner_ID());
	}

	public void actionPerformed(ActionEvent e) {
		Component c = (Component)e.getSource();
		
		if (c == bExit)
		{
			Void();
			hideform();
		}
		if (c == bFinish)
		{
			MBPartner partner = getPOSPanel().getPartner();
			//MBPartner partner = this.getPOSPanel().getPartner();
			if (!partner.equals(m_partner))
			{
				//m_partner.addObserver(this.getPOSPanel());
				//getPOSPanel().updatePO(m_partner);
				//getPOSPanel().executerules(null, "partner");
				getPOSPanel().execute(m_partner);
			}
			Void();
			hideform();			
		}
	}	

	public void vetoableChange (PropertyChangeEvent e)
	{
		String name = e.getPropertyName();
		Object value = e.getNewValue();
		log.config(name + "=" + value);
		if (value == null)
			return;
		if (name.equals(X_C_BPartner.COLUMNNAME_C_BPartner_ID))
		{
			Integer C_BPartner_ID = Integer.valueOf(value.toString());
			m_partner = MBPartner.get(Env.getCtx(), C_BPartner_ID);
			setCredit();
		}
	}   
		
	private void setCredit() {
		creditLimit.setText(String.format("%s = %s",Msg.translate(Env.getCtx(), "CreditLimit"), m_partner.getSO_CreditLimit().toString()));
		creditAvailable.setText(String.format("%s = %s", Msg.translate(Env.getCtx(), "CreditAvailable"), m_partner.getCreditAvailable().toString()));		
	}

	public void hideform()
	{
		getPOSPanel().enableEnvironment();
		setVisible(false);
	}	//	dispose	
	
	public PosPanel getPOSPanel()
	{
		return pospanel;
	}

	@Override
	public void selection() {
		pickPartner.grabFocus();		
	}	
	
	public Boolean IsDefault()
	{
		MOrder m_order = getPOSPanel().getOrder();
		//Integer DefaultBPartner_ID = getPOSPanel().getConfig().getDefault_C_BPartner_ID();
		MClientInfo ci = MClientInfo.get(Env.getCtx());
		MBPartner partner = new Query(Env.getCtx(), X_C_BPartner.Table_Name, "C_BPartner_ID = ? ", null).setParameters(ci.getC_BPartnerCashTrx_ID()).first();						
		//return DefaultBPartner_ID.equals(m_order.getC_BPartner_ID());
		Integer DefaultBPartner_ID = partner.getC_BPartner_ID(); 
		return DefaultBPartner_ID .equals(m_order.getC_BPartner_ID());
	}

	@Override
	public void update(Observable o, Object arg) {		
		if (o instanceof MBPartner)
		{
			m_partner = (MBPartner) o;
			setCredit();
			Evaluation();
		}
	}

}
