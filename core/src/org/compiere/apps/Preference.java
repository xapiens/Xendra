/******************************************************************************
 * Product: Xendra ERP & CRM Smart Business Solution                        *
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
package org.compiere.apps;

import java.awt.*;
import java.awt.event.*;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyVetoException;
import java.beans.VetoableChangeListener;
import java.io.*;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.util.*;
import java.util.List;
import java.util.logging.*;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import javax.swing.event.*;
import javax.swing.filechooser.FileFilter;
import javax.swing.plaf.metal.MetalLookAndFeel;
import javax.swing.plaf.metal.MetalTheme;
import javax.swing.table.*;

//
//import org.xendra.lineprinter.ESCPrinter;
import org.xendra.plaf.PLAFEditor;
import org.xendra.plaf.PLAFEditorPanel;
import org.xendra.plaf.XendraPLAF;
import org.compiere.db.*;
import org.compiere.grid.ed.*;
import org.compiere.minigrid.*;
import org.compiere.model.MRole;
import org.compiere.model.MUser;
import org.compiere.model.persistence.X_R_RequestProcessor;
import org.compiere.model.reference.REF__FrequencyType;
import org.compiere.plaf.*;
import org.compiere.print.*;
import org.compiere.swing.*;
import org.compiere.util.*;

/**
 *	Customize settings like L&F, AutoCommit, etc. & Diagnostics
 * <p>
 * Change log:
 * <ul>
 * <li>2007-02-12 - teo_sarca - [ 1658127 ] Select charset encoding on import
 * </ul>
 *
 *  @author 	Jorg Janke
 *  @version 	$Id: Preference.java 5508 2015-01-30 22:10:35Z xapiens $
 *  
 *  @author Low Heng Sin
 *  @version 2006-11-27
 */
public final class Preference extends CDialog
	implements ActionListener, ListSelectionListener, VetoableChangeListener
{
	private int m_WindowNo;

	/**
	 *	Standard Constructor
	 *  @param frame frame
	 *  @param WindowNo window
	 */
	public Preference(Frame frame, int WindowNo)
	{		
		super(frame, Msg.getMsg(Env.getCtx(), "Preference"), true);
		m_WindowNo = WindowNo;
		log.config("Preference");
		try
		{
			jbInit();
		}
		catch(Exception ex)
		{
			log.log(Level.SEVERE, ex.getMessage());
		}
		load();
		//
		StringBuffer sta = new StringBuffer("#");
		sta.append(Env.getCtx().size()).append(" - ")
			.append(Msg.translate(Env.getCtx(), "AD_Window_ID"))
			.append("=").append(WindowNo);
		statusBar.setStatusLine(sta.toString());
		statusBar.setStatusDB("");
		AEnv.positionCenterWindow(frame, this);
	}	//	Preference

	/**	Logger			*/
	private static CLogger log = CLogger.getCLogger(Preference.class);

	private CPanel panel = new CPanel();
	private BorderLayout panelLayout = new BorderLayout();
	private CTabbedPane tabPane = new CTabbedPane();
	private CPanel customizePane = new CPanel();
	private CPanel contextPane = new CPanel();
	private GridBagLayout customizeLayout = new GridBagLayout();
	private CCheckBox autoCommit = new CCheckBox();
	private CCheckBox autoNew = new CCheckBox();
	private CCheckBox printPreview = new CCheckBox();	
	private CCheckBox validateConnectionOnStartup = new CCheckBox();
	private CCheckBox singleInstancePerWindow = new CCheckBox();
	private CCheckBox openWindowMaximized = new CCheckBox();
	private CPanel southPanel = new CPanel();
	private BorderLayout southLayout = new BorderLayout();
	private BorderLayout icontextLayout = new BorderLayout();
	private JList infoList = new JList();
	private JScrollPane contextListScrollPane = new JScrollPane(infoList);
	private CPanel contextSouthPanel = new CPanel();
	private CTextArea contextHeader = new CTextArea(4,15);
	private CTextArea contextDetail = new CTextArea(4,35);
	private CTextArea infoArea = new CTextArea(5, 30);
	private BorderLayout contextSouthLayout = new BorderLayout();
	private StatusBar statusBar = new StatusBar();
	private ConfirmPanel confirm = new ConfirmPanel(true);
	private CComboBox traceLevel = new CComboBox(CLogMgt.LEVELS);
	private CLabel traceLabel = new CLabel();
	private CCheckBox traceFile = new CCheckBox();
	private CCheckBox autoLogin = new CCheckBox();
	private CCheckBox xendraSys = new CCheckBox();
	private CCheckBox storePassword = new CCheckBox();
	private CCheckBox showTrl = new CCheckBox();
	private CCheckBox showAcct = new CCheckBox();
	private CCheckBox showAdvanced = new CCheckBox();
	private CCheckBox cacheWindow = new CCheckBox();
	private CLabel lPrinter = new CLabel();
	private CPrinter fPrinter = new CPrinter();
	//private CLabel lMachineSerial = new CLabel(Msg.translate(Env.getCtx(), "MachineSerial"),JLabel.LEFT);
	//private CTextField fMachineSerial = new CTextField(10);
	private CLabel lDate = new CLabel();
	private VDate fDate = new VDate();	
	//private CComboBox connectionProfile = new CComboBox(CConnection.CONNECTIONProfiles);
	private CLabel connectionProfileLabel = new CLabel();
	private CPanel errorPane = new CPanel();
	private BorderLayout errorLayout = new BorderLayout();
	private JScrollPane errorScrollPane = new JScrollPane();
	private MiniTable errorTable = new MiniTable();
	private CPanel errorPanel = new CPanel(new FlowLayout(FlowLayout.TRAILING));
	//private CPanel holonPanel = new CPanel();
	private CToggleButton bErrorsOnly = new CToggleButton(Msg.getMsg(Env.getCtx(), "ErrorsOnly"));
	private CButton bErrorReset = new CButton(Msg.getMsg(Env.getCtx(), "Reset"));
	private CButton bErrorEMail = new CButton(Msg.getMsg(Env.getCtx(), "SendEMail"));
	private CButton bErrorSave = new CButton(Msg.getMsg(Env.getCtx(), "SaveFile"));
	private CButton bRoleInfo = new CButton(Msg.translate(Env.getCtx(), "AD_Role_ID"));
	// Charset:
	private CLabel lCharset = new CLabel();
	private CComboBox fCharset = new CComboBox(Ini.getAvailableCharsets());

	private CPanel configPanel = new CPanel();

	private PLAFEditorPanel plafEditor = new PLAFEditorPanel();

	private String mLocal_Host = "";
	
	private static ImageIcon iOpen = new ImageIcon(org.compiere.Xendra.class.getResource("images/mOpen.gif"));
	VNumber nwebport = new VNumber();	
	JPanel panel_1 = new JPanel();
	private JPanel panel_1_1;
	JPanel panel_1a = new JPanel();	
	JPanel panel_2 = new JPanel();
	private JPanel panel_2_1;	
	JPanel panel_3 = new JPanel();
	JLabel lblpoolclient = new JLabel();
	VNumber npoolclient = new VNumber();
	CLabel lblUpdate;
	JTextField textField_1;
	JButton btnNewButton;
	JProgressBar progressBar;	
	CLabel lblHornetq;		
	CPanel panel_4;
		
	JPanel panel_5;
	JPanel panel_6;
	CLabel lblRegistros;
	CLabel lblRegistros_1;

	ArrayList <ValueNamePair> frequencytype = new ArrayList<ValueNamePair>();
	//CCheckBox chkStartWebServer = new CCheckBox();
	//CTextField fLinePrinter = new CTextField();
	//CLabel lLineprinter = new CLabel();
	//CCheckBox escp24pin = new CCheckBox();
	//CButton btnTest;
	
	/**
	 *	Static Init.
	 *  <pre>
	 *  - panel
	 *      - tabPane
	 *          - customizePane
	 *              - infoArea
	 *              - fields ...
	 *          - contextPane
	 *              - contextList
	 *              - contextSouthPanel
	 *                  - contextHeader
	 *                  - contextDetail
	 * 			- errorPane
	 * 				- errorScollPane
	 * 					- errorTable
	 *      - southPanel
	 *  </pre>
	 *  @throws Exception
	 */
	void jbInit() throws Exception
	{
		frequencytype.add(new ValueNamePair(REF__FrequencyType.Minute, "minuto"));
		frequencytype.add(new ValueNamePair(REF__FrequencyType.Hour, "hora"));
		frequencytype.add(new ValueNamePair(REF__FrequencyType.Day, "dia"));

		traceLabel.setRequestFocusEnabled(false);
		traceLabel.setText(Msg.getMsg(Env.getCtx(), "TraceLevel", true));
		traceLabel.setToolTipText(Msg.getMsg(Env.getCtx(), "TraceLevel", false));
		traceFile.setText(Msg.getMsg(Env.getCtx(), "TraceFile", true));
		traceFile.setToolTipText(Msg.getMsg(Env.getCtx(), "TraceFile", false));

		autoCommit.setText(Msg.getMsg(Env.getCtx(), "AutoCommit", true));
		autoCommit.setToolTipText(Msg.getMsg(Env.getCtx(), "AutoCommit", false));
		autoNew.setText(Msg.getMsg(Env.getCtx(), "AutoNew", true));
		autoNew.setToolTipText(Msg.getMsg(Env.getCtx(), "AutoNew", false));
		xendraSys.setText(Msg.getMsg(Env.getCtx(), "XendraSys", true));
		xendraSys.setToolTipText(Msg.getMsg(Env.getCtx(), "XendraSys", false));
		printPreview.setText(Msg.getMsg(Env.getCtx(), "AlwaysPrintPreview", true));
		printPreview.setToolTipText(Msg.getMsg(Env.getCtx(), "AlwaysPrintPreview", false));
		validateConnectionOnStartup.setText(Msg.getMsg(Env.getCtx(), "ValidateConnectionOnStartup", true));
		validateConnectionOnStartup.setToolTipText(Msg.getMsg(Env.getCtx(), "ValidateConnectionOnStartup", false));
		singleInstancePerWindow.setText(Msg.getMsg(Env.getCtx(), "SingleInstancePerWindow", true));
		singleInstancePerWindow.setToolTipText(Msg.getMsg(Env.getCtx(), "SingleInstancePerWindow", false));
		openWindowMaximized.setText(Msg.getMsg(Env.getCtx(), "OpenWindowMaximized", true));
		openWindowMaximized.setToolTipText(Msg.getMsg(Env.getCtx(), "OpenWindowMaximized", false));
		autoLogin.setText(Msg.getMsg(Env.getCtx(), "AutoLogin", true));
		autoLogin.setToolTipText(Msg.getMsg(Env.getCtx(), "AutoLogin", false));
		storePassword.setText(Msg.getMsg(Env.getCtx(), "StorePassword", true));
		storePassword.setToolTipText(Msg.getMsg(Env.getCtx(), "StorePassword", false));
		showTrl.setText(Msg.getMsg(Env.getCtx(), "ShowTrlTab", true));
		showTrl.setToolTipText(Msg.getMsg(Env.getCtx(), "ShowTrlTab", false));
		showAcct.setText(Msg.getMsg(Env.getCtx(), "ShowAcctTab", true));
		showAcct.setToolTipText(Msg.getMsg(Env.getCtx(), "ShowAcctTab", false));
		showAdvanced.setText(Msg.getMsg(Env.getCtx(), "ShowAdvancedTab", true));
		showAdvanced.setToolTipText(Msg.getMsg(Env.getCtx(), "ShowAdvancedTab", false));
		connectionProfileLabel.setText(Msg.getElement(Env.getCtx(), "ConnectionProfile"));
		cacheWindow.setText(Msg.getMsg(Env.getCtx(), "CacheWindow", true));
		cacheWindow.setToolTipText(Msg.getMsg(Env.getCtx(), "CacheWindow", false));
//		lLineprinter.setText(Msg.getMsg(Env.getCtx(), "LinePrinter", true));
//		lLineprinter.setToolTipText(Msg.getMsg(Env.getCtx(), "LinePrinter", false));
//		escp24pin.setText(Msg.getMsg(Env.getCtx(),"Isa24pines", true));
//		escp24pin.setToolTipText(Msg.getMsg(Env.getCtx(),"Isa24pines", false));
		lPrinter.setText(Msg.getMsg(Env.getCtx(), "Printer"));
		lDate.setText(Msg.getMsg(Env.getCtx(), "Date"));
		infoArea.setReadWrite(false);
		// Charset:
		lCharset.setText(Msg.getMsg(Env.getCtx(), "Charset", true));
		lCharset.setToolTipText(Msg.getMsg(Env.getCtx(), "Charset", false));
		
		getContentPane().add(panel);
		panel.setLayout(panelLayout);
		panel.add(tabPane, BorderLayout.CENTER);
		//	Customize
		tabPane.add(customizePane,  Msg.getMsg(Env.getCtx(), "Preference"));
		customizeLayout.columnWeights = new double[]{1.0};
		customizePane.setLayout(customizeLayout);
		customizePane.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		
		Border insetBorder = BorderFactory.createEmptyBorder(2, 2, 2, 0); 
		CPanel loginPanel = new CPanel();
		loginPanel.setBorder(BorderFactory.createTitledBorder(Msg.getMsg(Env.getCtx(), "Login")));
		loginPanel.setLayout(new GridLayout(1, 2));
		autoLogin.setBorder(insetBorder);
		storePassword.setBorder(insetBorder);
		loginPanel.add(autoLogin);
		loginPanel.add(storePassword);
		customizePane.add(loginPanel, new GridBagConstraints(0, 0, 1, 1, 1.0, 0.0
				,GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL, new Insets(2, 0, 5, 0), 0, 0));
		
		CPanel windowPanel = new CPanel();
		windowPanel.setBorder(BorderFactory.createTitledBorder(Msg.getMsg(Env.getCtx(), "Window")));
		windowPanel.setLayout(new GridLayout(4, 2));
		windowPanel.add(showAcct);showAcct.setBorder(insetBorder);
		windowPanel.add(showTrl);showTrl.setBorder(insetBorder);
		windowPanel.add(showAdvanced);showAdvanced.setBorder(insetBorder);
		windowPanel.add(autoCommit);autoCommit.setBorder(insetBorder);
		windowPanel.add(autoNew);autoNew.setBorder(insetBorder);
		windowPanel.add(cacheWindow);cacheWindow.setBorder(insetBorder);
		windowPanel.add(openWindowMaximized);openWindowMaximized.setBorder(insetBorder);
		windowPanel.add(singleInstancePerWindow);singleInstancePerWindow.setBorder(insetBorder);
		customizePane.add(windowPanel, new GridBagConstraints(0, 1, 1, 1, 1.0, 0.0
				,GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL, new Insets(2, 0, 5, 0), 0, 0));
		
		CPanel connPanel = new CPanel();
		connPanel.setBorder(BorderFactory.createTitledBorder(Msg.getMsg(Env.getCtx(), "Connection")));
		GridBagLayout gbl_connPanel = new GridBagLayout();
		gbl_connPanel.columnWeights = new double[]{0.0, 0.0, 1.0, 0.0};
		connPanel.setLayout(gbl_connPanel);
		connPanel.add(connectionProfileLabel,    new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0
				,GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(2, 2, 5, 5), 0, 0));
		//connPanel.add(connectionProfile,    new GridBagConstraints(1, 0, 1, 1, 1.0, 0.0
		//	,GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(2, 2, 5, 5), 0, 0));
		
		lblpoolclient.setText(Msg.getMsg(Env.getCtx(), "poolclient", true));
		GridBagConstraints gbc_lblpoolclient = new GridBagConstraints();
		gbc_lblpoolclient.insets = new Insets(0, 0, 5, 5);
		gbc_lblpoolclient.gridx = 2;
		gbc_lblpoolclient.gridy = 0;
		connPanel.add(lblpoolclient, gbc_lblpoolclient);
		
		npoolclient = new VNumber();
		GridBagConstraints gbc_npoolclient = new GridBagConstraints();
		gbc_npoolclient.insets = new Insets(0, 0, 5, 0);
		gbc_npoolclient.gridx = 3;
		gbc_npoolclient.gridy = 0;
		connPanel.add(npoolclient, gbc_npoolclient);
		connPanel.add(validateConnectionOnStartup,    new GridBagConstraints(0, 1, 2, 1, 1.0, 0.0
				,GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(2, 2, 2, 5), 0, 0));
		customizePane.add(connPanel, new GridBagConstraints(0, 2, 1, 1, 1.0, 0.0
				,GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL, new Insets(2, 0, 5, 0), 0, 0));
		
		CPanel tracePanel = new CPanel();
		tracePanel.setBorder(BorderFactory.createTitledBorder(Msg.getMsg(Env.getCtx(), "TraceInfo")));
		tracePanel.setLayout(new GridBagLayout());
		tracePanel.add(traceLabel,    new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0
			,GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(2, 2, 2, 0), 0, 0));
		tracePanel.add(traceLevel,       new GridBagConstraints(1, 0, 1, 1, 1.0, 0.0
			,GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(2, 2, 2, 0), 0, 0));
		tracePanel.add(traceFile,       new GridBagConstraints(0, 1, 2, 1, 1.0, 0.0
			,GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(2, 2, 2, 0), 0, 0));
		
		customizePane.add(tracePanel, new GridBagConstraints(0, 3, 1, 1, 1.0, 0.0
				,GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL, new Insets(2, 0, 5, 0), 0, 0));
		
		CPanel printPanel = new CPanel();
		printPanel.setBorder(BorderFactory.createTitledBorder(Msg.getMsg(Env.getCtx(), "Printing")));
		GridBagLayout gbl_printPanel = new GridBagLayout();
		gbl_printPanel.columnWidths = new int[]{0, 91, 151, 0};
		gbl_printPanel.columnWeights = new double[]{0.0, 1.0, 0.0, 0.0};
		printPanel.setLayout(gbl_printPanel);
		printPanel.add(lPrinter,      new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0 ,GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(2, 2, 5, 5), 0, 0));
		printPanel.add(fPrinter,      new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0 ,GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(2, 2, 5, 5), 0, 0));
		printPanel.add(printPreview,  new GridBagConstraints(2, 0, 1, 1, 2.0, 0.0 ,GridBagConstraints.EAST, GridBagConstraints.NONE, new Insets(2, 0, 5, 5), 0, 0));
		//printPanel.add(printPreview.setBorder(insetBorder));
		customizePane.add(printPanel, new GridBagConstraints(0, 4, 1, 1, 1.0, 0.0 ,GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL, new Insets(2, 0, 5, 0), 0, 0));
				
//		GridBagConstraints gbc_lLineprinter = new GridBagConstraints();
//		gbc_lLineprinter.insets = new Insets(0, 0, 0, 5);
//		gbc_lLineprinter.anchor = GridBagConstraints.EAST;
//		gbc_lLineprinter.gridx = 0;
//		gbc_lLineprinter.gridy = 1;
//		printPanel.add(lLineprinter, gbc_lLineprinter);
//				
//		fLinePrinter.setColumns(10);
//		GridBagConstraints gbc_fLinePrinter = new GridBagConstraints();
//		gbc_fLinePrinter.insets = new Insets(0, 0, 0, 5);
//		gbc_fLinePrinter.fill = GridBagConstraints.HORIZONTAL;
//		gbc_fLinePrinter.gridx = 1;
//		gbc_fLinePrinter.gridy = 1;
//		printPanel.add(fLinePrinter, gbc_fLinePrinter);
//		
//		GridBagConstraints gbc_escp24pin = new GridBagConstraints();
//		gbc_escp24pin.insets = new Insets(0, 0, 0, 5);
//		gbc_escp24pin.anchor = GridBagConstraints.WEST;
//		gbc_escp24pin.gridx = 2;
//		gbc_escp24pin.gridy = 1;
//		printPanel.add(escp24pin, gbc_escp24pin);
		
//		btnTest = new CButton();
//		btnTest.addActionListener(this);
//		btnTest.setText("test");
//		GridBagConstraints gbc_btnTest = new GridBagConstraints();
//		gbc_btnTest.gridx = 3;
//		gbc_btnTest.gridy = 1;
//		printPanel.add(btnTest, gbc_btnTest);

		CPanel posPanel = new CPanel();
		posPanel.setBorder(BorderFactory.createTitledBorder(Msg.translate(Env.getCtx(),"C_POS_ID")));
		posPanel.setLayout(new GridLayout(1, 4));
		
//		posPanel.add(lMachineSerial);
//		posPanel.add(fMachineSerial);
		customizePane.add(posPanel,   new GridBagConstraints(0, 6, 1, 1, 1.0, 0.0, GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL, new Insets(2, 0, 5, 0), 0, 0));

		CPanel otherPanel = new CPanel();
		otherPanel.setBorder(BorderFactory.createEmptyBorder());
		otherPanel.setLayout(new GridLayout());
		CPanel datePanel = new CPanel();
		datePanel.setLayout(new FlowLayout());
		((FlowLayout)datePanel.getLayout()).setAlignment(FlowLayout.LEFT);
		datePanel.add(lDate);
		datePanel.add(fDate);
		otherPanel.add(datePanel);datePanel.setBorder(insetBorder);
		otherPanel.add(xendraSys);xendraSys.setBorder(insetBorder);
		customizePane.add(otherPanel, new GridBagConstraints(0, 8, 1, 1, 1.0, 0.0
				,GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL, new Insets(2, 0, 5, 0), 0, 0));
		
		// Charset:
		CPanel charsetPanel = new CPanel();
		charsetPanel.setBorder(BorderFactory.createEmptyBorder());
		charsetPanel.setLayout(new FlowLayout());
		((FlowLayout)charsetPanel.getLayout()).setAlignment(FlowLayout.LEFT);
		charsetPanel.add(lCharset);
		charsetPanel.add(fCharset);
		customizePane.add(charsetPanel, new GridBagConstraints(0, 9, 1, 1, 1.0, 0.0
				,GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL, new Insets(2, 0, 2, 0), 0, 0));
		
		CPanel themePanel = new CPanel();
		themePanel.setLayout(new GridLayout(1, 1));
		
		themePanel.add(plafEditor);
		tabPane.add(themePanel, Msg.getMsg(Env.getCtx(), "UITheme", true));
		
		configPanel.setLayout(new BorderLayout());
		configPanel.add(infoArea, BorderLayout.CENTER);
		CPanel configSouth = new CPanel();
		configSouth.setLayout(new FlowLayout());
		((FlowLayout)configSouth.getLayout()).setAlignment(FlowLayout.RIGHT);
		configSouth.add(bRoleInfo);
		configPanel.add(configSouth, BorderLayout.SOUTH);
		tabPane.add(configPanel, Msg.getMsg(Env.getCtx(), "Info"));
		
		//	Info
		tabPane.add(contextPane,  Msg.getMsg(Env.getCtx(), "Context"));
		contextPane.setLayout(icontextLayout);
		contextPane.add(contextListScrollPane, BorderLayout.CENTER);
		contextListScrollPane.setPreferredSize(new Dimension(200, 300));
		infoList.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		infoList.setBackground(XendraPLAF.getFieldBackground_Inactive());
		infoList.addListSelectionListener(this);
		infoList.setFixedCellWidth(30);
		contextPane.add(contextSouthPanel, BorderLayout.SOUTH);
		contextSouthPanel.setLayout(contextSouthLayout);
		contextSouthPanel.add(contextHeader, BorderLayout.WEST);
		contextHeader.setBackground(SystemColor.info);
		contextHeader.setReadWrite(false);
		contextHeader.setLineWrap(true);
		contextHeader.setWrapStyleWord(true);
		contextHeader.setBorder(BorderFactory.createLoweredBevelBorder());
		contextSouthPanel.add(contextDetail, BorderLayout.CENTER);
		contextDetail.setBackground(SystemColor.info);
		contextDetail.setReadWrite(false);
		contextDetail.setLineWrap(true);
		contextDetail.setWrapStyleWord(true);
		contextDetail.setBorder(BorderFactory.createLoweredBevelBorder());
		//	Error Pane
		errorPane.setLayout(errorLayout);
//		tabPane.add(errorPane,  Msg.getMsg(Env.getCtx(), "Errors"));
		tabPane.add(errorPane,  "Errors");
		errorPane.add(errorScrollPane, BorderLayout.CENTER);
		errorScrollPane.setViewportView(errorTable);
		//
		errorPanel.add(bErrorsOnly);
		errorPanel.add(bErrorReset);
		errorPanel.add(bErrorEMail);
		errorPanel.add(bErrorSave);
		errorPane.add(errorPanel, BorderLayout.SOUTH);
		//	South
		panel.add(southPanel, BorderLayout.SOUTH);
		southPanel.setLayout(southLayout);
		southPanel.add(statusBar, BorderLayout.SOUTH);
		southPanel.add(confirm, BorderLayout.CENTER);
		//		
		bRoleInfo.addActionListener(this);
		confirm.addActionListener(this);
		//fMachineSerial.addActionListener(this);
		//FlowLayout flowLayout = (FlowLayout) holonPanel.getLayout();
		//
		//tabPane.add(holonPanel, "Holon");
		
		
		
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 57, 0, 0, 25, 0, 0, 0, 0, 0};
		gridBagLayout.rowWeights = new double[]{0.0, 1.0, 0.0, 1.0, 0.0, 1.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0};
		gridBagLayout.columnWeights = new double[]{1.0, 1.0, 1.0};
		gridBagLayout.columnWidths = new int[]{108, 250, 0};
		
		Insets bInsets = new Insets(0, 5, 0, 5);

		CPanel BootstrapPanel = new CPanel();
		//BootstrapPanel.setLayout(new GridLayout(1, 8));
		BootstrapPanel.setLayout(gridBagLayout);
		TitledBorder titledBorder = new TitledBorder("dummy");
		//BootstrapPanel.add(bootlabel);
		//BootstrapPanel.add(bootpath);
		//BootstrapPanel.add(isHolon);		
		JSeparator separator = new JSeparator();
		//this.add(sectionLabel,    new GridBagConstraints(0, 0, 7, 1, 0.0, 0.0
		//	,GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(15, 5, 0, 10), 0, 0));
//		BootstrapPanel.add(separator,    new GridBagConstraints(0, 0, 3, 1, 1.0, 0.0
//				,GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL, new Insets(0, 5, 5, 10), 0, 0));
//		
//		holonPanel.add(BootstrapPanel, new GridBagConstraints(0, 6, 1, 1, 1.0, 0.0, GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL, new Insets(2, 0, 2, 0), 0, 0));
//		
//		GridBagConstraints gbc_chkIsholon = new GridBagConstraints();
//		gbc_chkIsholon.anchor = GridBagConstraints.EAST;
//		gbc_chkIsholon.insets = new Insets(0, 0, 5, 5);
//		gbc_chkIsholon.gridx = 0;
//		gbc_chkIsholon.gridy = 1;
//		BootstrapPanel.add(chkIsholon, gbc_chkIsholon);
//		
//		GridBagConstraints gbc_chkIsReplication = new GridBagConstraints();
//		gbc_chkIsReplication.anchor = GridBagConstraints.EAST;
//		gbc_chkIsReplication.insets = new Insets(0, 0, 5, 5);
//		gbc_chkIsReplication.gridx = 1;
//		gbc_chkIsReplication.gridy = 1;
//		chkIsReplication.setReadWrite(false);
//		BootstrapPanel.add(chkIsReplication, gbc_chkIsReplication);
//		
//		panel_4 = new CPanel();
//		GridBagConstraints gbc_panel_4 = new GridBagConstraints();
//		gbc_panel_4.gridwidth = 3;
//		gbc_panel_4.insets = new Insets(0, 0, 5, 0);
//		gbc_panel_4.fill = GridBagConstraints.BOTH;
//		gbc_panel_4.gridx = 0;
//		gbc_panel_4.gridy = 2;
//		BootstrapPanel.add(panel_4, gbc_panel_4);
//		GridBagLayout gbl_panel_4 = new GridBagLayout();
//		gbl_panel_4.columnWidths = new int[]{37, 64, 0};
//		gbl_panel_4.rowHeights = new int[]{16, 0};
//		gbl_panel_4.columnWeights = new double[]{1.0, 1.0, Double.MIN_VALUE};
//		gbl_panel_4.rowWeights = new double[]{1.0, Double.MIN_VALUE};
//		panel_4.setLayout(gbl_panel_4);
		
//		panel_5 = new JPanel();
//		panel_5.setBorder(new TitledBorder(null, "Minima Carga", TitledBorder.LEADING, TitledBorder.TOP, null, null));
//		GridBagConstraints gbc_panel_5 = new GridBagConstraints();
//		gbc_panel_5.insets = new Insets(0, 0, 0, 5);
//		gbc_panel_5.fill = GridBagConstraints.BOTH;
//		gbc_panel_5.gridx = 0;
//		gbc_panel_5.gridy = 0;
//		panel_4.add(panel_5, gbc_panel_5);
//		
//		panel_6 = new JPanel();
//		panel_6.setBorder(new TitledBorder(null, "Maxima Carga", TitledBorder.LEADING, TitledBorder.TOP, null, null));
//		GridBagConstraints gbc_panel_6 = new GridBagConstraints();
//		gbc_panel_6.fill = GridBagConstraints.BOTH;
//		gbc_panel_6.gridx = 1;
//		gbc_panel_6.gridy = 0;
//		panel_4.add(panel_6, gbc_panel_6);
//		GridBagLayout gbl_panel_6 = new GridBagLayout();
//		gbl_panel_6.columnWidths = new int[]{0, 0, 0};
//		gbl_panel_6.rowHeights = new int[]{0, 0, 0};
//		gbl_panel_6.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
//		gbl_panel_6.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
//		panel_6.setLayout(gbl_panel_6);
		
		panel_1_1 = new JPanel();
		panel_1_1.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Procesador Ingreso Datos Replicaci\u00F3n", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.gridwidth = 3;
		gbc_panel_1.insets = new Insets(0, 0, 5, 0);
		gbc_panel_1.fill = GridBagConstraints.BOTH;
		gbc_panel_1.gridx = 0;
		gbc_panel_1.gridy = 3;
		BootstrapPanel.add(panel_1_1, gbc_panel_1);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[]{0, 0, 0, 0, 0};
		gbl_panel_1.rowHeights = new int[]{0, 0, 0, 0};
		gbl_panel_1.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_1.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_1_1.setLayout(gbl_panel_1);
		
		panel_1a = new JPanel();
		panel_1a.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Procesador Salida Datos Replicaci\u00F3n", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		GridBagConstraints gbc_panel_1a = new GridBagConstraints();
		gbc_panel_1a.gridwidth = 3;
		gbc_panel_1a.insets = new Insets(0, 0, 5, 0);
		gbc_panel_1a.fill = GridBagConstraints.BOTH;
		gbc_panel_1a.gridx = 0;
		gbc_panel_1a.gridy = 4;
		BootstrapPanel.add(panel_1a, gbc_panel_1a);
		GridBagLayout gbl_panel_1a = new GridBagLayout();
		gbl_panel_1a.columnWidths = new int[]{0, 0, 93, 0, 0};
		gbl_panel_1a.rowHeights = new int[]{0, 0, 0, 0};
		gbl_panel_1a.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_1a.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_1a.setLayout(gbl_panel_1a);						
		
		panel_2_1 = new JPanel();
		panel_2_1.setBorder(new TitledBorder(null, "Replicator", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GridBagConstraints gbc_panel_2 = new GridBagConstraints();
		gbc_panel_2.gridwidth = 3;
		gbc_panel_2.insets = new Insets(0, 0, 5, 0);
		gbc_panel_2.fill = GridBagConstraints.BOTH;
		gbc_panel_2.gridx = 0;
		gbc_panel_2.gridy = 5;
		BootstrapPanel.add(panel_2_1, gbc_panel_2);
		GridBagLayout gbl_panel_2 = new GridBagLayout();
		gbl_panel_2.columnWidths = new int[]{168, 69, 111, 0, 0};
		gbl_panel_2.rowHeights = new int[]{0, 0};
		gbl_panel_2.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panel_2.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		panel_2_1.setLayout(gbl_panel_2);
		
		panel_3 = new JPanel();
		panel_3.setBorder(new TitledBorder(null, "Web Server Embebido", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GridBagConstraints gbc_panel_3 = new GridBagConstraints();
		gbc_panel_3.gridwidth = 3;
		gbc_panel_3.insets = new Insets(0, 0, 5, 0);
		gbc_panel_3.fill = GridBagConstraints.BOTH;
		gbc_panel_3.gridx = 0;
		gbc_panel_3.gridy = 6;
		BootstrapPanel.add(panel_3, gbc_panel_3);
		GridBagLayout gbl_panel_3 = new GridBagLayout();
		gbl_panel_3.columnWidths = new int[]{0, 0, 0, 0, 0};
		gbl_panel_3.rowHeights = new int[]{0, 0};
		gbl_panel_3.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_3.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		panel_3.setLayout(gbl_panel_3);
		
		//chkStartWebServer.setReadWrite(false);
		//chkStartWebServer.setText("Iniciar automaticamente");
//		GridBagConstraints gbc_chkStartWebServer = new GridBagConstraints();
//		gbc_chkStartWebServer.anchor = GridBagConstraints.WEST;
//		gbc_chkStartWebServer.insets = new Insets(0, 0, 0, 5);
//		gbc_chkStartWebServer.gridx = 0;
//		gbc_chkStartWebServer.gridy = 0;
//		panel_3.add(chkStartWebServer, gbc_chkStartWebServer);
		
		
		CLabel bootlabel = new CLabel("s");
		GridBagConstraints gbc_bootlabel = new GridBagConstraints();
		gbc_bootlabel.insets = new Insets(0, 0, 0, 5);
		gbc_bootlabel.gridx = 2;
		gbc_bootlabel.gridy = 0;
		panel_3.add(bootlabel, gbc_bootlabel);
		bootlabel.setText("Port:");
		
		GridBagConstraints gbc_nwebport = new GridBagConstraints();
		gbc_nwebport.gridx = 3;
		gbc_nwebport.gridy = 0;
		panel_3.add(nwebport, gbc_nwebport);
		
//		lblReportsdir = new JLabel("ReportsDir");
//		GridBagConstraints gbc_lblReportsdir = new GridBagConstraints();
//		gbc_lblReportsdir.anchor = GridBagConstraints.EAST;
//		gbc_lblReportsdir.insets = new Insets(0, 0, 5, 5);
//		gbc_lblReportsdir.gridx = 0;
//		gbc_lblReportsdir.gridy = 7;
//		BootstrapPanel.add(lblReportsdir, gbc_lblReportsdir);
		
//		GridBagConstraints gbc_fHolonReportDir = new GridBagConstraints();
//		gbc_fHolonReportDir.insets = new Insets(0, 0, 5, 5);
//		gbc_fHolonReportDir.fill = GridBagConstraints.HORIZONTAL;
//		gbc_fHolonReportDir.gridx = 1;
//		gbc_fHolonReportDir.gridy = 7;
//		BootstrapPanel.add(fHolonReportDir, gbc_fHolonReportDir);
//		fHolonReportDir.setColumns(10);
		
//		bHolonReportsDir = new JButton("...");
//		bHolonReportsDir.addActionListener(this);
//		GridBagConstraints gbc_bHolonReportsDir = new GridBagConstraints();
//		gbc_bHolonReportsDir.insets = new Insets(0, 0, 5, 0);
//		gbc_bHolonReportsDir.gridx = 2;
//		gbc_bHolonReportsDir.gridy = 7;
//		BootstrapPanel.add(bHolonReportsDir, gbc_bHolonReportsDir);
		
//		lblholonname = new JLabel("HolonName");
//		GridBagConstraints gbc_lblholonname = new GridBagConstraints();
//		gbc_lblholonname.anchor = GridBagConstraints.EAST;
//		gbc_lblholonname.insets = new Insets(0, 0, 5, 5);
//		gbc_lblholonname.gridx = 0;
//		gbc_lblholonname.gridy = 8;
//		BootstrapPanel.add(lblholonname, gbc_lblholonname);
//		
//		txtholonname = new CTextField();
//		GridBagConstraints gbc_txtholonname = new GridBagConstraints();
//		gbc_txtholonname.insets = new Insets(0, 0, 5, 5);
//		gbc_txtholonname.fill = GridBagConstraints.HORIZONTAL;
//		gbc_txtholonname.gridx = 1;
//		gbc_txtholonname.gridy = 8;
//		BootstrapPanel.add(txtholonname, gbc_txtholonname);
//		txtholonname.setColumns(10);
//		
//		lblHornetq = new CLabel();
//		lblHornetq.setText("Configuration");
//		GridBagConstraints gbc_lblHornetq = new GridBagConstraints();
//		gbc_lblHornetq.insets = new Insets(0, 0, 5, 5);
//		gbc_lblHornetq.anchor = GridBagConstraints.EAST;
//		gbc_lblHornetq.gridx = 0;
//		gbc_lblHornetq.gridy = 9;
//		BootstrapPanel.add(lblHornetq, gbc_lblHornetq);
//		
//		fHolonConfigDir = new CTextField();
//		GridBagConstraints gbc_fHolonConfigDir = new GridBagConstraints();
//		gbc_fHolonConfigDir.insets = new Insets(0, 0, 5, 5);
//		gbc_fHolonConfigDir.fill = GridBagConstraints.HORIZONTAL;
//		gbc_fHolonConfigDir.gridx = 1;
//		gbc_fHolonConfigDir.gridy = 9;
//		BootstrapPanel.add(fHolonConfigDir, gbc_fHolonConfigDir);
//		
//		bHolonConfigurationDir = new CButton();
//		bHolonConfigurationDir.addActionListener(this);
//		bHolonConfigurationDir.setText("...");
//		GridBagConstraints gbc_bHolonConfigurationDir = new GridBagConstraints();
//		gbc_bHolonConfigurationDir.insets = new Insets(0, 0, 5, 0);
//		gbc_bHolonConfigurationDir.gridx = 2;
//		gbc_bHolonConfigurationDir.gridy = 9;
//		BootstrapPanel.add(bHolonConfigurationDir, gbc_bHolonConfigurationDir);
//		
//		lblUpdate = new CLabel();
//		lblUpdate.setText("Update");
//		GridBagConstraints gbc_lblUpdate = new GridBagConstraints();
//		gbc_lblUpdate.anchor = GridBagConstraints.EAST;
//		gbc_lblUpdate.insets = new Insets(0, 0, 5, 5);
//		gbc_lblUpdate.gridx = 0;
//		gbc_lblUpdate.gridy = 10;
//		BootstrapPanel.add(lblUpdate, gbc_lblUpdate);
//		
//		textField_1 = new JTextField();
//		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
//		gbc_textField_1.insets = new Insets(0, 0, 5, 5);
//		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
//		gbc_textField_1.gridx = 1;
//		gbc_textField_1.gridy = 10;
//		BootstrapPanel.add(textField_1, gbc_textField_1);
//		textField_1.setColumns(10);
//		
//		btnNewButton = new JButton("Sync");
//		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
//		gbc_btnNewButton.insets = new Insets(0, 0, 5, 0);
//		gbc_btnNewButton.gridx = 2;
//		gbc_btnNewButton.gridy = 10;
//		BootstrapPanel.add(btnNewButton, gbc_btnNewButton);
//		
//		progressBar = new JProgressBar();
//		GridBagConstraints gbc_progressBar = new GridBagConstraints();
//		gbc_progressBar.insets = new Insets(0, 0, 0, 5);
//		gbc_progressBar.gridx = 1;
//		gbc_progressBar.gridy = 11;
//		BootstrapPanel.add(progressBar, gbc_progressBar);
		
	}	//	jbInit


	/**
	 *	List Selection Listener - show info in header/detail fields
	 *  @param e evant
	 */
	public void valueChanged(ListSelectionEvent e)
	{
		if (e.getValueIsAdjusting())
			return;

		String value = (String)infoList.getSelectedValue();
		if (value == null)
			return;
		int pos = value.indexOf("==");
		if (pos == -1)
		{
			contextHeader.setText("");
			contextDetail.setText(value);
		}
		else
		{
			contextHeader.setText(value.substring(0, pos).replace('|','\n'));
			contextDetail.setText(value.substring(pos+3));
		}
	}	//	valueChanged


	/**
	 * 	Set Path in Field
	 * 	@param field field to set Path
	 */
	private void setPath (CTextField field)
	{
		JFileChooser fc = new JFileChooser(field.getText());
		fc.setDialogType(JFileChooser.OPEN_DIALOG);
		fc.setFileSelectionMode(JFileChooser.FILES_ONLY);
		fc.setMultiSelectionEnabled(false);
		fc.setDialogTitle(field.getToolTipText());
        fc.setFileFilter(new FileFilter() {
            
            public String getDescription() {
                return "microcontainer xml conf";
            }
        
            public boolean accept(File f) {
                return f.isDirectory()
                    || f.getName().toLowerCase().endsWith(".xml");
            }
        
        });
        
		if (fc.showOpenDialog(this) == JFileChooser.APPROVE_OPTION)
			field.setText(fc.getSelectedFile().getAbsolutePath());		
		
	}	//	setPath
	
	/**
	 *	ActionListener
	 *  @param e event
	 */
	public void actionPerformed(ActionEvent e)
	{		
		if (e.getActionCommand().equals(ConfirmPanel.A_CANCEL))
			dispose();
		else if (e.getActionCommand().equals(ConfirmPanel.A_OK))
			cmd_save();
		//
//		else if (e.getSource() == btnTest)
//		{
//			if (fLinePrinter.getText() != null && fLinePrinter.getText().length() > 0)
//			{
////				ESCPrinter escp = new ESCPrinter(fLinePrinter.getText(), escp24pin.isSelected()); //create ESCPrinter on network location \\computer\sharename, 9pin printer
////		        if (escp.initialize()) {
////		            //escp.setCharacterSet(ESCPrinter.USA);
////		        	escp.select15CPI(); //15 characters per inch printing
////		        	escp.advanceVertical(5); //go down 5cm
////		        	escp.setAbsoluteHorizontalPosition(5); //5cm to the right
////		        	escp.bold(true);
////		        	escp.print("Xendra Line Printer Test ;)");
////		        	escp.bold(false);
////		        	escp.advanceVertical(1);
////		        	escp.setAbsoluteHorizontalPosition(5); //back to 5cm on horizontal axis
////		            escp.print("simple y rapido");
////		            escp.formFeed(); //eject paper
////		            escp.close(); //close stream		            
////		        }
//			}
//		}
		//else if (e.getSource() == bHolonReportsDir)
		//	setDirectoryPath(fHolonReportDir);
		//else if (e.getSource() == bHolonConfigurationDir)
		//	setDirectoryPath(fHolonConfigDir);
		else if (e.getSource() == bErrorsOnly)
			cmd_displayErrors();
		else if (e.getSource() == bErrorReset)
			cmd_errorReset();
		else if (e.getSource() == bErrorEMail)
			cmd_errorEMail();
		else if (e.getSource() == bErrorSave)
			cmd_errorSave();
//		else if (e.getSource() == fMachineSerial)
//		{
//			MOrg org = MOrg.get(Env.getCtx(), Env.getAD_Org_ID(Env.getCtx()));			
//			if ( fMachineSerial.getValue() !=null && !org.getMachineSerial().contains((String)fMachineSerial.getValue()))
//			{
//				ADialog.error(0, this, "el nuevo codigo de equipo (MachineSerial) no pertenece a la organización ".concat(org.getName()));
//				fMachineSerial.setValue(Ini.getProperty(Ini.P_MACHINESERIAL));
//			}
//		}
		//
		else if (e.getSource() == bRoleInfo)
			ADialog.info(0, this, "RoleInfo", MRole.getDefault().toStringX(Env.getCtx()));
	}	//	actionPerformed


	private boolean checkLocal_Host(String owner) {
		String msg = "va a activar esta estación como Servidor de Impresion";
		if (owner == null)
			owner = "";
		if (owner.length() > 0 && owner.compareTo(mLocal_Host) != 0 && mLocal_Host.length() > 0)
		{
			msg = msg.concat(", Sin embargo el servidor de impresion a sido tomado por ").concat(owner);
			ADialog.info(m_WindowNo,this,msg);
			return false;
		}
		else
		{
			if (owner.length() == 0)
			{
				msg = msg.concat(", Desea proceder de todos modos?");
				if (!ADialog.ask(m_WindowNo, this, msg))
				{
					return false;
				}
				else
					return true;
			}
			else
				return true;
		}		
	}
	/**
	 *	Load Settings - and Context
	 */
	private void load()
	{
		log.config("");
		infoArea.setText(CLogMgt.getInfo(null).toString());
		infoArea.setCaretPosition(0);

		//	--	Load Settings	--
		//	AutoCommit
		autoCommit.setSelected(Env.isAutoCommit(Env.getCtx()));
		autoNew.setSelected(Env.isAutoNew(Env.getCtx()));
		//	XendraSys
		xendraSys.setSelected(Ini.isPropertyBool(Ini.P_XENDRASYS));
		if (Env.getAD_Client_ID(Env.getCtx()) > 20)
		{
			xendraSys.setSelected(false);
			xendraSys.setEnabled(false);
		}
		//	AutoLogin
		autoLogin.setSelected(Ini.isPropertyBool(Ini.P_A_LOGIN));
		//	Save Password
		storePassword.setSelected(Ini.isPropertyBool(Ini.P_STORE_PWD));
		//	Show Acct Tab
		if (MRole.getDefault().isShowAcct())
			showAcct.setSelected(Ini.isPropertyBool(Ini.P_SHOW_ACCT));
		else
		{
			showAcct.setSelected(false);
			showAcct.setReadWrite(false);
		}
		//	Show Trl/Advanced Tab
		showTrl.setSelected(Ini.isPropertyBool(Ini.P_SHOW_TRL));
		showAdvanced.setSelected(Ini.isPropertyBool(Ini.P_SHOW_ADVANCED));
		
		//  Connection Profile
		MUser user = MUser.get(Env.getCtx());
		String cp = user.getConnectionProfile();
		if (cp == null)
			cp = MRole.getDefault().getConnectionProfile();
//		if (cp != null)
//		{
//			CConnection.get().setConnectionProfile(cp);
//			connectionProfile.setReadWrite(false);
//		}
//		connectionProfile.setSelectedItem(CConnection.get().getConnectionProfilePair());
		cacheWindow.setSelected(Ini.isCacheWindow());
		
		//  Print Preview
		printPreview.setSelected(Ini.isPropertyBool(Ini.P_PRINTPREVIEW));
		//escp24pin.setSelected(Ini.isPropertyBool(Ini.P_ESC24PIN));
				
		//chkStartWebServer.setSelected(Ini.isPropertyBool(Ini.P_STARTWEBSERVER));
		//chkIsholon.setSelected(Ini.isPropertyBool(Ini.P_ISHOLON));		
		//txtholonname.setText(Ini.getProperty(Ini.P_HOLONNAME));
		
		//fHolonReportDir.setText(Ini.getProperty(Ini.P_HOLON_REPORT_DIR));
		//fHolonConfigDir.setText(Ini.getProperty(Ini.P_HOLON_CONFIG_DIR));
		GridBagConstraints gbc_nMaxLoad = new GridBagConstraints();
		gbc_nMaxLoad.insets = new Insets(0, 0, 5, 5);
		gbc_nMaxLoad.gridx = 0;
		gbc_nMaxLoad.gridy = 0;
		//panel_6.add(nMaxLoad, gbc_nMaxLoad);
		
	
		lblRegistros_1 = new CLabel();
		lblRegistros_1.setText("registro(s)");
		GridBagConstraints gbc_lblRegistros_1 = new GridBagConstraints();
		gbc_lblRegistros_1.insets = new Insets(0, 0, 5, 0);
		gbc_lblRegistros_1.gridx = 1;
		gbc_lblRegistros_1.gridy = 0;
		//panel_6.add(lblRegistros_1, gbc_lblRegistros_1);
		
		GridBagConstraints gbc_nfrequencymax = new GridBagConstraints();
		gbc_nfrequencymax.insets = new Insets(0, 0, 0, 5);
		gbc_nfrequencymax.gridx = 0;
		gbc_nfrequencymax.gridy = 1;
		//panel_6.add(nMaxFrequency, gbc_nfrequencymax);
		
		GridBagConstraints gbc_frequencytypemax = new GridBagConstraints();
		gbc_frequencytypemax.fill = GridBagConstraints.HORIZONTAL;
		gbc_frequencytypemax.gridx = 1;
		gbc_frequencytypemax.gridy = 1;
		//panel_6.add(nMaxFrequencyType, gbc_frequencytypemax);

		GridBagLayout gbl_panel_5 = new GridBagLayout();
		gbl_panel_5.columnWidths = new int[]{96, 0, 0};
		gbl_panel_5.rowHeights = new int[]{16, 0, 0};
		gbl_panel_5.columnWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_5.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		//panel_5.setLayout(gbl_panel_5);
		GridBagConstraints gbc_nMinLoad = new GridBagConstraints();
		gbc_nMinLoad.insets = new Insets(0, 0, 5, 5);
		gbc_nMinLoad.fill = GridBagConstraints.BOTH;
		gbc_nMinLoad.gridx = 0;
		gbc_nMinLoad.gridy = 0;
		//panel_5.add(nMinLoad, gbc_nMinLoad);
		
		lblRegistros = new CLabel();
		lblRegistros.setText("registro(s)");
		GridBagConstraints gbc_lblRegistros = new GridBagConstraints();
		gbc_lblRegistros.insets = new Insets(0, 0, 5, 0);
		gbc_lblRegistros.gridx = 1;
		gbc_lblRegistros.gridy = 0;
		//panel_5.add(lblRegistros, gbc_lblRegistros);
		
		GridBagConstraints gbc_nfrequencymin = new GridBagConstraints();
		gbc_nfrequencymin.insets = new Insets(0, 0, 0, 5);
		gbc_nfrequencymin.gridx = 0;
		gbc_nfrequencymin.gridy = 1;
		//panel_5.add(nMinFrequency, gbc_nfrequencymin);
		
		GridBagConstraints gbc_frequencytypemin = new GridBagConstraints();
		gbc_frequencytypemin.fill = GridBagConstraints.HORIZONTAL;
		gbc_frequencytypemin.gridx = 1;
		gbc_frequencytypemin.gridy = 1;
		//panel_5.add(nMinFrequencyType, gbc_frequencytypemin);
				
		if ( MRole.getDefault().getAD_Role_ID() == MRole.SYSTEM_USER_ID ||
			 MRole.getDefault().getAD_Role_ID() == MRole.SUPERUSER_USER_ID 
			 )
		{			
			//chkIsholon.setReadWrite(true);
			//chkStartWebServer.setReadWrite(true);
			//txtholonname.setReadWrite(true);
			nwebport.setReadWrite(true);
			npoolclient.setReadWrite(true);			
		}
		else
		{
			//chkIsholon.setReadWrite(false);
			//chkStartWebServer.setReadWrite(false);
			//txtholonname.setReadWrite(false);			
			nwebport.setReadWrite(false);
			npoolclient.setReadWrite(false);
		}				
		//  Validate Connection on Startup
		validateConnectionOnStartup.setSelected(Ini.isPropertyBool(Ini.P_VALIDATE_CONNECTION_ON_STARTUP));

		//  Single Instance per Window
		singleInstancePerWindow.setSelected(Ini.isPropertyBool(Ini.P_SINGLE_INSTANCE_PER_WINDOW));

		//  Open Window Maximized
		openWindowMaximized.setSelected(Ini.isPropertyBool(Ini.P_OPEN_WINDOW_MAXIMIZED));
				
		Integer poolclient = Integer.valueOf(Ini.getProperty(Ini.P_POOLCLIENT));
		npoolclient.setDisplayType(DisplayType.Integer);
		npoolclient.setValue(poolclient);
		
		Integer holonwebport = Integer.valueOf(Ini.getProperty(Ini.P_HOLONWEBPORT));
		nwebport.setDisplayType(DisplayType.Integer);
		nwebport.setValue(holonwebport);
				
		//	TraceLevel
		traceLevel.setSelectedItem(CLogMgt.getLevel());
		traceFile.setSelected(Ini.isPropertyBool(Ini.P_TRACEFILE));
		//  Printer
		fPrinter.setValue(Env.getContext(Env.getCtx(), "#Printer"));
		//fLinePrinter.setValue(Ini.getProperty(Ini.P_LINEPRINTER));		
		//fMachineSerial.setValue(Ini.getProperty(Ini.P_MACHINESERIAL));
		//  Date
		fDate.setValue(Env.getContextAsDate(Env.getCtx(), "#Date"));
		// Charset
		fCharset.setSelectedItem(Ini.getCharset());

		//	--	Load and sort Context	--
		String[] context = Env.getEntireContext(Env.getCtx());
		Arrays.sort(context);
		infoList.setListData(context);

		//	Load Errors
	//	CLogMgt mgt = new CLogMgt();		//	creates test trace
		bErrorsOnly.setSelected(true);
		errorTable.setCellSelectionEnabled(true);
		cmd_displayErrors();
	//	for (int i = 2; i < 6; i++)
	//		errorTable.setColumnReadOnly(i, false);
		//
		bErrorsOnly.addActionListener(this);
		bErrorReset.addActionListener(this);
		bErrorSave.addActionListener(this);
		bErrorEMail.addActionListener(this);
	}	//	load

	/**
	 *	Save Settings
	 */
	private void cmd_save()
	{
		log.config("");
		//  UI
		//	AutoCommit
		Ini.setProperty(Ini.P_A_COMMIT, (autoCommit.isSelected()));
		Env.setAutoCommit(Env.getCtx(), autoCommit.isSelected());
		Ini.setProperty(Ini.P_A_NEW, (autoNew.isSelected()));
		Env.setAutoNew(Env.getCtx(), autoNew.isSelected());
		//	AdempiereSys
		Ini.setProperty(Ini.P_XENDRASYS, xendraSys.isSelected());
		//	AutoLogin
		Ini.setProperty(Ini.P_A_LOGIN, (autoLogin.isSelected()));
		//	Save Password
		Ini.setProperty(Ini.P_STORE_PWD, (storePassword.isSelected()));
		//	Show Acct Tab
		Ini.setProperty(Ini.P_SHOW_ACCT, (showAcct.isSelected()));
		Env.setContext(Env.getCtx(), "#ShowAcct", (showAcct.isSelected()));
		//	Show Trl Tab
		Ini.setProperty(Ini.P_SHOW_TRL, (showTrl.isSelected()));
		Env.setContext(Env.getCtx(), "#ShowTrl", (showTrl.isSelected()));
		//	Show Advanced Tab
		Ini.setProperty(Ini.P_SHOW_ADVANCED, (showAdvanced.isSelected()));
		Env.setContext(Env.getCtx(), "#ShowAdvanced", (showAdvanced.isSelected()));
		//Ini.setProperty(Ini.P_MACHINESERIAL, (String) fMachineSerial.getValue());
		Ini.setProperty(Ini.P_HOLONWEBPORT, String.valueOf(nwebport.getValue()));
		Integer ipoolclient = new Integer(Ini.getProperty(Ini.P_POOLCLIENT));
		Integer poolclient = (Integer) npoolclient.getValue();
		if (!ipoolclient.equals(poolclient))
		{
			Ini.setProperty(Ini.P_POOLCLIENT, String.valueOf(npoolclient.getValue()));
			Ini.setProperty(Ini.P_CONNECTION, "");
		}
		//Ini.setProperty(Ini.P_HOLON_REPORT_DIR, fHolonReportDir.getText());
		//Ini.setProperty(Ini.P_HOLON_CONFIG_DIR, fHolonConfigDir.getText());
		//  ConnectionProfile
//		ValueNamePair ppNew = (ValueNamePair)connectionProfile.getSelectedItem();
//		String cpNew = ppNew.getValue();
//		String cpOld = CConnection.get().getConnectionProfile(); 
//		CConnection.get().setConnectionProfile(cpNew);
//		if (!cpNew.equals(cpOld)
//			&& (cpNew.equals(CConnection.PROFILE_WAN) || cpOld.equals(CConnection.PROFILE_WAN))) 
//			ADialog.info(0, this, "ConnectionProfileChange");
		Ini.setProperty(Ini.P_CACHE_WINDOW, cacheWindow.isSelected());
		
		//  Print Preview
		Ini.setProperty(Ini.P_PRINTPREVIEW, (printPreview.isSelected()));
		//		
		//  Validate Connection on Startup
		Ini.setProperty(Ini.P_VALIDATE_CONNECTION_ON_STARTUP, (validateConnectionOnStartup.isSelected()));
		//  Single Instance per Window
		Ini.setProperty(Ini.P_SINGLE_INSTANCE_PER_WINDOW, (singleInstancePerWindow.isSelected()));
		//  Open Window Maximized
		Ini.setProperty(Ini.P_OPEN_WINDOW_MAXIMIZED, (openWindowMaximized.isSelected()));

		//	TraceLevel/File
		Level level = (Level)traceLevel.getSelectedItem();
		CLogMgt.setLevel(level);
		Ini.setProperty(Ini.P_TRACELEVEL, level.getName());
		Ini.setProperty(Ini.P_TRACEFILE, traceFile.isSelected());
		//  Printer
		String printer = (String)fPrinter.getSelectedItem();
		Env.setContext(Env.getCtx(), "#Printer", printer);
		Ini.setProperty(Ini.P_PRINTER, printer);
		//Ini.setProperty(Ini.P_LINEPRINTER, fLinePrinter.getText());
		//Ini.setProperty(Ini.P_ESC24PIN, escp24pin.isSelected());
		java.sql.Timestamp ts = (java.sql.Timestamp)fDate.getValue();
		if (ts != null)
			Env.setContext(Env.getCtx(), "#Date", ts);
		// Charset
		Charset charset = (Charset)fCharset.getSelectedItem();
		Ini.setProperty(Ini.P_CHARSET, charset.name());

		//UI
		ValueNamePair laf = plafEditor.getSelectedLook();
		ValueNamePair theme = plafEditor.getSelectedTheme();
		if ( laf != null ) {
			String clazz = laf.getValue();
			String currentLaf = UIManager.getLookAndFeel().getClass().getName();
			if (clazz != null && clazz.length() > 0 && !currentLaf.equals(clazz))
			{
				//laf changed
				XendraPLAF.setPLAF(laf, theme, true);
				AEnv.updateUI();
			}
			else
			{
				if (UIManager.getLookAndFeel() instanceof MetalLookAndFeel)
				{
					MetalTheme currentTheme = MetalLookAndFeel.getCurrentTheme();
					String themeClass = currentTheme.getClass().getName();
					String sTheme = theme.getValue();
					if (sTheme != null && sTheme.length() > 0 && !sTheme.equals(themeClass))
					{
						ValueNamePair plaf = new ValueNamePair(
								UIManager.getLookAndFeel().getClass().getName(),
								UIManager.getLookAndFeel().getName());
						XendraPLAF.setPLAF(plaf, theme, true);
						AEnv.updateUI();
					}
				}
			}
		}
		
		Ini.saveProperties(Ini.isClient());
		dispose();
	}	//	cmd_save
	
	private void setDirectoryPath(CTextField field)
	{
		JFileChooser fc = new JFileChooser(field.getText());
		fc.setDialogType(JFileChooser.OPEN_DIALOG);
		fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
		fc.setMultiSelectionEnabled(false);
		fc.setDialogTitle(field.getToolTipText());
		if (fc.showOpenDialog(this) == JFileChooser.APPROVE_OPTION)
			field.setText(fc.getSelectedFile().getAbsolutePath());		
	}
	/**
	 * 	(Re)Display Errors
	 */
	private void cmd_displayErrors()
	{
		Vector data = CLogErrorBuffer.get(true).getLogData(bErrorsOnly.isSelected());
		Vector columnNames = CLogErrorBuffer.get(true).getColumnNames(Env.getCtx());
		DefaultTableModel model = new DefaultTableModel(data, columnNames);
		errorTable.setModel(model);
		//
		if (bErrorsOnly.isSelected())
			tabPane.setTitleAt(4, Msg.getMsg(Env.getCtx(), "Errors") + " (" + data.size() + ")");
		else
			tabPane.setTitleAt(4, Msg.getMsg(Env.getCtx(), "TraceInfo") + " (" + data.size() + ")");
		errorTable.autoSize();
	}	//	cmd_errorsOnly
	
	/**
	 * 	Reset Errors
	 */
	private void cmd_errorReset()
	{
		CLogErrorBuffer.get(true).resetBuffer(bErrorsOnly.isSelected());
		cmd_displayErrors();
	}	//	cmd_errorReset

	/**
	 * 	EMail Errors
	 */
	private void cmd_errorEMail()
	{
		EMailDialog emd = new EMailDialog(this, 
			"EMail Trace", 
			MUser.get(Env.getCtx()), 
			"",			//	to 
			"Xendra Trace Info", 
			CLogErrorBuffer.get(true).getErrorInfo(Env.getCtx(), bErrorsOnly.isSelected()), 
			null);
		
	}	//	cmd_errorEMail
	
	/**
	 * 	Save Error to File
	 */
	private void cmd_errorSave()
	{
	    JFileChooser chooser = new JFileChooser();
	    chooser.setDialogType(JFileChooser.SAVE_DIALOG);
	    chooser.setDialogTitle("Xendra Trace File");
	    chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
	    chooser.setSelectedFile(new File ("traceInfo.log"));
	    int returnVal = chooser.showSaveDialog(this);
	    if(returnVal != JFileChooser.APPROVE_OPTION)
	    	return;
	    try
	    {
	    	File file = chooser.getSelectedFile();
	    	FileWriter writer = new FileWriter(file);
	    	writer.write(CLogErrorBuffer.get(true).getErrorInfo(Env.getCtx(), bErrorsOnly.isSelected()));
	    	writer.flush();
	    	writer.close();
	    }
	    catch (Exception e)
	    {
	    	log.log(Level.SEVERE, "", e);
	    }
	}	//	cmd_errorSave
	@Override
	public void vetoableChange(PropertyChangeEvent e) throws PropertyVetoException {
	
	}
		
}	//	Preference
