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
 *****************************************************************************/
package org.xendra.apps.form.BillExchange;

import org.compiere.apps.AEnv;
import org.compiere.apps.ALogin;
import org.compiere.apps.ConfirmPanel;
import org.compiere.apps.form.FormFrame;
import org.compiere.apps.form.FormPanel;
import org.compiere.model.MInvoice;
import org.compiere.model.MLookup;
import org.compiere.model.MLookupFactory;
import org.compiere.model.MLookupInfo;
import org.compiere.model.MOrder;
import org.compiere.swing.CFrame;
import org.compiere.swing.CTabbedPane;
import org.compiere.util.CLogger;
import org.compiere.util.DisplayType;
import org.compiere.util.Env;
import org.compiere.util.Splash;
import org.compiere.util.Util;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JSplitPane;
import javax.swing.BoxLayout;
import org.compiere.grid.ed.VLookup;

import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.SwingConstants;
import java.awt.Panel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;
import java.awt.Component;

public class WizardBillExchange extends CFrame implements FormPanel, ActionListener {

	private static CLogger log = CLogger.getCLogger(WizardBillExchange.class);
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					org.compiere.Xendra.startup(true);
					Splash splash = Splash.getSplash();
					ALogin login = new ALogin(splash);
					if (!login.initLogin())		//	no automatic login
					{
						//	Center the window
						try
						{
							AEnv.showCenterScreen(login);	//	HTML load errors
						}
						catch (Exception ex)
						{
							log.severe(ex.toString());
						}
						if (!login.isConnected() || !login.isOKpressed())
							AEnv.exit(1);
					}										
					WizardBillExchange frame = new WizardBillExchange();
					//frame.setPreferredSize(new Dimension( 450, 200 ));
					frame.pack();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	private int m_WindowNo = 0;
	private InvoicePanel Invoicepanel = new InvoicePanel();
	private BillExchangePanel billExchangePanel = new BillExchangePanel();
	private JLabel lblSocioDeNegocio;
	private JLabel lblDocumentType;
	private VLookup pickDocType;
	private JLabel lblQtyBillExchanges;
	private JSpinner QtyBillExchanges;
	private JLabel lblQtyDueDays;
	private JSpinner QtyDueDays;
	private JLabel lblCurrencyInvoice;
	private VLookup pickCurrencyInvoice;
	private JLabel lblCurrencyBOE;
	private VLookup pickCurrencyExchange;
	private JLabel lblConversionType;
	private VLookup pickConversionType;		
	private VLookup pickPartner = VLookup.createBPartner(1);
	private ConfirmPanel confirmPanel = new ConfirmPanel(false, true, false, false, false, false, false);
	private FormFrame m_frame;

	private JPanel Initialize() {
		JPanel BillExchange = new JPanel();
		BillExchange.setLayout(new BorderLayout(0, 0));
		JPanel Wizard = new JPanel();
		//getContentPane().add(Wizard, BorderLayout.NORTH);
		BillExchange.add(Wizard);
		Wizard.setLayout(new BoxLayout(Wizard, BoxLayout.Y_AXIS));		

		JPanel mainPanel = new JPanel();
		mainPanel.setAlignmentY(0.0f);
		mainPanel.setAlignmentX(0.0f);
		Wizard.add(mainPanel);

		int AD_Column_ID = Util.getColumnID(MInvoice.Table_ID,"C_Currency_ID");
		MLookup lookupCurrInvoice = MLookupFactory.get (Env.getCtx(), m_WindowNo, 0, AD_Column_ID, DisplayType.TableDir);		

		AD_Column_ID = Util.getColumnID(MOrder.Table_ID,"C_DocTypeTarget_ID");		
		MLookupInfo lookupInfo = MLookupFactory.getLookupInfo (Env.getCtx(), m_WindowNo, AD_Column_ID, DisplayType.Table,
				Env.getLanguage(Env.getCtx()), "C_DocTypeTarget_ID", 170,
				false, "C_DocType.DocBaseType IN ('BOE') ");		
		MLookup lookupDocType = new MLookup (lookupInfo, 0);

		AD_Column_ID = Util.getColumnID(MInvoice.Table_ID,"C_ConversionType_ID");
		MLookup lookupConversionType = MLookupFactory.get (Env.getCtx(), m_WindowNo, 0, AD_Column_ID, DisplayType.TableDir);		

		AD_Column_ID = Util.getColumnID(MInvoice.Table_ID,"C_Currency_ID");
		MLookup lookupCurrExchange = MLookupFactory.get (Env.getCtx(), m_WindowNo, 0, AD_Column_ID, DisplayType.TableDir);				

		pickDocType = new VLookup("C_DocType_ID", true, false, true, lookupDocType);

		GridBagLayout gbl_mainPanel = new GridBagLayout();
		gbl_mainPanel.columnWidths = new int[]{57, 30, 137, 30, 0};
		gbl_mainPanel.rowHeights = new int[]{22, 0, 0, 0, 0, 0};
		gbl_mainPanel.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_mainPanel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		mainPanel.setLayout(gbl_mainPanel);


		lblSocioDeNegocio = new JLabel("Socio de negocio");
		//pickPartner.addVetoableChangeListener(this);
		GridBagConstraints gbc_lblSocioDeNegocio = new GridBagConstraints();
		gbc_lblSocioDeNegocio.fill = GridBagConstraints.BOTH;
		gbc_lblSocioDeNegocio.anchor = GridBagConstraints.WEST;
		gbc_lblSocioDeNegocio.insets = new Insets(0, 0, 5, 5);
		gbc_lblSocioDeNegocio.gridx = 0;
		gbc_lblSocioDeNegocio.gridy = 0;
		mainPanel.add(lblSocioDeNegocio, gbc_lblSocioDeNegocio);

		//pickPartner = new VLookup();
		GridBagConstraints gbc_lookup = new GridBagConstraints();
		gbc_lookup.insets = new Insets(0, 0, 5, 5);
		gbc_lookup.gridx = 1;
		gbc_lookup.gridy = 0;
		mainPanel.add(pickPartner, gbc_lookup);

		lblCurrencyInvoice = new JLabel("Moneda");
		GridBagConstraints gbc_lblCurrencyInvoice = new GridBagConstraints();
		gbc_lblCurrencyInvoice.fill = GridBagConstraints.BOTH;
		gbc_lblCurrencyInvoice.anchor = GridBagConstraints.WEST;
		gbc_lblCurrencyInvoice.insets = new Insets(0, 0, 5, 5);
		gbc_lblCurrencyInvoice.gridx = 2;
		gbc_lblCurrencyInvoice.gridy = 0;
		mainPanel.add(lblCurrencyInvoice, gbc_lblCurrencyInvoice);
		pickCurrencyInvoice = new VLookup("I_C_Currency_ID", true, false, true, lookupCurrInvoice);


		//pickCurrencyInvoice.setValue();
		//pickCurrencyInvoice.addVetoableChangeListener(this);

		GridBagConstraints gbc_pickCurrencyInvoice = new GridBagConstraints();
		gbc_pickCurrencyInvoice.fill = GridBagConstraints.BOTH;
		gbc_pickCurrencyInvoice.insets = new Insets(0, 0, 5, 0);
		gbc_pickCurrencyInvoice.gridx = 3;
		gbc_pickCurrencyInvoice.gridy = 0;
		mainPanel.add(pickCurrencyInvoice, gbc_pickCurrencyInvoice);
		Invoicepanel.setCurrency(pickCurrencyInvoice);

		lblDocumentType = new JLabel("Tipo de Documento");
		GridBagConstraints gbc_lblDocumentType = new GridBagConstraints();
		gbc_lblDocumentType.fill = GridBagConstraints.BOTH;
		gbc_lblDocumentType.insets = new Insets(0, 0, 5, 5);
		gbc_lblDocumentType.gridx = 0;
		gbc_lblDocumentType.gridy = 1;
		mainPanel.add(lblDocumentType, gbc_lblDocumentType);

		GridBagConstraints gbc_pickDocType = new GridBagConstraints();
		gbc_pickDocType.fill = GridBagConstraints.BOTH;
		gbc_pickDocType.insets = new Insets(0, 0, 5, 5);
		gbc_pickDocType.gridx = 1;
		gbc_pickDocType.gridy = 1;
		mainPanel.add(pickDocType, gbc_pickDocType);

		Invoicepanel.setDocType(pickDocType);

		lblConversionType = new JLabel("Tipo de Moneda");
		GridBagConstraints gbc_lblConversionType = new GridBagConstraints();
		gbc_lblConversionType.fill = GridBagConstraints.BOTH;
		gbc_lblConversionType.insets = new Insets(0, 0, 5, 5);
		gbc_lblConversionType.gridx = 2;
		gbc_lblConversionType.gridy = 1;
		mainPanel.add(lblConversionType, gbc_lblConversionType);
		pickConversionType = new VLookup("C_ConversionType_ID", true, false, true, lookupConversionType);

		GridBagConstraints gbc_pickConversionType = new GridBagConstraints();
		gbc_pickConversionType.fill = GridBagConstraints.BOTH;
		gbc_pickConversionType.insets = new Insets(0, 0, 5, 0);
		gbc_pickConversionType.gridx = 3;
		gbc_pickConversionType.gridy = 1;
		mainPanel.add(pickConversionType, gbc_pickConversionType);

		lblQtyDueDays = new JLabel("a dias");
		lblQtyDueDays.setHorizontalAlignment(SwingConstants.RIGHT);
		GridBagConstraints gbc_lblQtyDueDays = new GridBagConstraints();
		gbc_lblQtyDueDays.fill = GridBagConstraints.BOTH;
		gbc_lblQtyDueDays.anchor = GridBagConstraints.WEST;
		gbc_lblQtyDueDays.insets = new Insets(0, 0, 5, 5);
		gbc_lblQtyDueDays.gridx = 0;
		gbc_lblQtyDueDays.gridy = 2;
		mainPanel.add(lblQtyDueDays, gbc_lblQtyDueDays);

		QtyDueDays = new JSpinner();
		QtyDueDays.setModel(new SpinnerNumberModel(1, 1, 300, 5));
		GridBagConstraints gbc_QtyDueDays = new GridBagConstraints();
		gbc_QtyDueDays.fill = GridBagConstraints.BOTH;
		gbc_QtyDueDays.insets = new Insets(0, 0, 5, 5);
		gbc_QtyDueDays.gridx = 1;
		gbc_QtyDueDays.gridy = 2;
		mainPanel.add(QtyDueDays, gbc_QtyDueDays);
		billExchangePanel.setQtyDueDays(QtyDueDays);


		lblQtyBillExchanges = new JLabel("Cantidad");
		lblQtyBillExchanges.setHorizontalAlignment(SwingConstants.RIGHT);
		GridBagConstraints gbc_lblQtyBillExchanges = new GridBagConstraints();
		gbc_lblQtyBillExchanges.fill = GridBagConstraints.BOTH;
		gbc_lblQtyBillExchanges.insets = new Insets(0, 0, 0, 5);
		gbc_lblQtyBillExchanges.gridx = 0;
		gbc_lblQtyBillExchanges.gridy = 4;
		mainPanel.add(lblQtyBillExchanges, gbc_lblQtyBillExchanges);

		QtyBillExchanges = new JSpinner();
		QtyBillExchanges.setModel(new SpinnerNumberModel(1, 1, 50, 1));
		GridBagConstraints gbc_QtyBillExchanges = new GridBagConstraints();
		gbc_QtyBillExchanges.fill = GridBagConstraints.VERTICAL;
		gbc_QtyBillExchanges.insets = new Insets(0, 0, 0, 5);
		gbc_QtyBillExchanges.gridx = 1;
		gbc_QtyBillExchanges.gridy = 4;
		mainPanel.add(QtyBillExchanges, gbc_QtyBillExchanges);
		billExchangePanel.setQtyBillExchange(QtyBillExchanges);		


		lblCurrencyBOE = new JLabel("Moneda");
		GridBagConstraints gbc_lblCurrencyBOE = new GridBagConstraints();
		gbc_lblCurrencyBOE.fill = GridBagConstraints.VERTICAL;
		gbc_lblCurrencyBOE.anchor = GridBagConstraints.WEST;
		gbc_lblCurrencyBOE.insets = new Insets(0, 0, 0, 5);
		gbc_lblCurrencyBOE.gridx = 2;
		gbc_lblCurrencyBOE.gridy = 4;
		mainPanel.add(lblCurrencyBOE, gbc_lblCurrencyBOE);
		pickCurrencyExchange = new VLookup("B_C_Currency_ID", true, false, true, lookupCurrExchange);



		GridBagConstraints gbc_pickCurrencyExchange = new GridBagConstraints();
		gbc_pickCurrencyExchange.fill = GridBagConstraints.VERTICAL;
		gbc_pickCurrencyExchange.gridx = 3;
		gbc_pickCurrencyExchange.gridy = 4;
		mainPanel.add(pickCurrencyExchange, gbc_pickCurrencyExchange);
		billExchangePanel.setCurrency(pickCurrencyExchange);
		billExchangePanel.setConversionType(pickConversionType);
		JSplitPane splitPane = new JSplitPane();
		splitPane.setContinuousLayout(true);
		Wizard.add(splitPane);		
		//Invoicepanel.setPreferredSize(new Dimension(400,0));
		//billExchangePanel.setPreferredSize(new Dimension(400,0));
		splitPane.setLeftComponent(Invoicepanel);			
		splitPane.setRightComponent(billExchangePanel);		
		Invoicepanel.setBPartner(pickPartner);
		Invoicepanel.setBillExchangePanel(billExchangePanel);
		confirmPanel.addActionListener(this);

		//getContentPane().add(confirmPanel, BorderLayout.SOUTH);
		BillExchange.add(confirmPanel, BorderLayout.SOUTH);
		return BillExchange;
	}
	public WizardBillExchange() {
		Initialize();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String cmd = e.getActionCommand();
		if (cmd.equals(ConfirmPanel.A_REFRESH))
		{
			Invoicepanel.configure();
		}
	}

	@Override
	public void init(int WindowNo, FormFrame frame) {
		m_WindowNo = WindowNo;
		Invoicepanel.setWindowNo(WindowNo);
		billExchangePanel.setWindowNo(WindowNo);
		m_frame = frame;
		frame.getContentPane().add(Initialize());
	}
	public boolean candispose() {
		return true;
	}		
}