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
package org.compiere.db;

import java.awt.BorderLayout;
import java.awt.Cursor;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.logging.Level;

import javax.swing.Icon;
import javax.swing.JLabel;
import javax.swing.JLayer;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;

import net.miginfocom.swing.MigLayout;

import org.xendra.controls.WaitLayerUI;
import org.xendra.newclient.wizard.NewClientWizardLauncher;
import org.xendra.plaf.XendraPLAF;
import org.compiere.apps.ADialog;
import org.compiere.swing.CButton;
import org.compiere.swing.CDialog;
import org.compiere.swing.CLabel;
import org.compiere.swing.CPanel;
import org.compiere.swing.CTextField;
import org.compiere.util.CLogger;
import org.compiere.util.DB;
import org.compiere.util.Ini;

import javax.swing.SwingConstants;

/**
 *  Connection Dialog.
 *
 *  @author     Jorg Janke
 *  @author     Marek Mosiewicz<marek.mosiewicz@jotel.com.pl> - support for RMI over HTTP
 *  @author     fuck all rmi & shit.
 *  @version    $Id: CConnectionDialog.java 5880 2016-07-01 23:51:13Z xapiens $
 */
public class CConnectionDialog extends CDialog implements ActionListener
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 9132784527503780794L;

	/**
	 *  Connection Dialog using current Connection
	 */
	public CConnectionDialog()
	{
		this (null);
	}   //  CConnectionDialog

	/**
	 *  Connection Dialog
	 *  @param cc Xendra Connection
	 */
	public CConnectionDialog(CConnection cc)
	{
		super((Frame)null, true);
		try
		{
			jbInit();
			setConnection (cc);
			dbHostPortField.setText(String.valueOf(m_cc.getDbPort()));			
		}
		catch(Exception e)
		{
			log.log(Level.SEVERE, "", e);
		}
		XendraPLAF.showCenterScreen(this);
	}   //  CConnection

	/** Resources							*/
	private static ResourceBundle res = ResourceBundle.getBundle("org.compiere.db.DBRes");

	/**	 Default HTTP Port					*/
	public static final String	APPS_PORT_HTTP = "80";
	/** Default RMI Port					*/
	public static final String	APPS_PORT_JNP = "1099";
	/** Default JMS Port					*/
	public static final String  APPS_PORT_JMS = "5445";
	/** Connection							*/
	private CConnection 	m_cc = null;
	//private CConnection 	m_ccResult = null;
	private boolean 		m_updating = false;
	private boolean     	m_saved = false;

	/**	Logger	*/
	private static CLogger	log	= CLogger.getCLogger (CConnectionDialog.class);

	static final String PG_URL_TEMPLATE = "jdbc:postgresql://localhost:5432/%s";

	private CPanel mainPanel = new CPanel();
	private BorderLayout mainLayout = new BorderLayout();
	private CPanel centerPanel = new CPanel();
	private CPanel southPanel = new CPanel();
	private CButton bOK = XendraPLAF.getOKButton();
	private CButton bCancel = XendraPLAF.getCancelButton();
	private FlowLayout southLayout = new FlowLayout();
	private CLabel nameLabel = new CLabel();
	private CTextField nameField = new CTextField();
	private CLabel hostLabel = new CLabel();
	private CTextField hostField = new CTextField();
	private CLabel hostportLabel = new CLabel();
	private CTextField dbHostPortField = new CTextField();
	private CLabel sidLabel = new CLabel();
	private CTextField sidField = new CTextField();
	private CLabel dbpwdLabel = new CLabel();
	private CButton bTestDB = new CButton();
	private CLabel dbUidLabel = new CLabel();
	private CTextField dbUidField = new CTextField();
	private JPasswordField dbPwdField = new JPasswordField();

	private boolean isCancel = true;

	private DB_PostgreSQL	p_db = new DB_PostgreSQL();

	private ArrayList<String> fillfiles;
	
	final WaitLayerUI layerUI = new WaitLayerUI();

	private String dbname;


	/**
	 *  Static Layout
	 *  @throws Exception
	 */
	private void jbInit() throws Exception
	{		
		this.setTitle(res.getString("CConnectionDialog"));
		mainPanel.setLayout(mainLayout);
		JLayer<JPanel> jlayer = new JLayer<JPanel>(mainPanel, layerUI);
		southPanel.setLayout(southLayout);
		southLayout.setAlignment(FlowLayout.RIGHT);
		//centerLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 1.0};
		//centerLayout.columnWidths = new int[]{0, 190, 76, 55, 0};
		centerPanel.setLayout(new MigLayout("wrap","[0][190][76][55][]","[][][]"));
		nameLabel.setText(res.getString("Name"));
		nameField.setColumns(40);
		nameField.setReadWrite(false);
		hostLabel.setText(res.getString("DBHost"));
		hostField.setColumns(30);
		sidLabel.setText(res.getString("DBName"));
		bTestDB.setText(res.getString("TestConnection"));
		bTestDB.setHorizontalAlignment(JLabel.LEFT);
		sidField.setColumns(30);
		dbUidLabel.setText(res.getString("DBUid"));		
		dbUidField.setColumns(10);
		dbpwdLabel.setText(res.getString("DBPwd"));
		//this.getContentPane().add(mainPanel, BorderLayout.CENTER);
		this.getContentPane().add(jlayer, BorderLayout.CENTER);
		mainPanel.add(centerPanel, BorderLayout.CENTER);
		mainPanel.add(southPanel,  BorderLayout.SOUTH);
		southPanel.add(bCancel, null);
		southPanel.add(bOK, null);
		//
		hostportLabel.setHorizontalAlignment(SwingConstants.LEADING);
		hostportLabel.setText(res.getString("Port"));
		dbHostPortField.setColumns(5);
		dbHostPortField.addActionListener(this);
		centerPanel.add(nameLabel,"right");
		centerPanel.add(nameField,"span 4");
		centerPanel.add(hostLabel,"right");
		centerPanel.add(hostField, "span 2");		
		centerPanel.add(hostportLabel);		
		centerPanel.add(dbHostPortField,"wrap");		
		centerPanel.add(sidLabel,"right");
		centerPanel.add(sidField,"span 2,wrap");
		centerPanel.add(dbUidLabel,"right");
		centerPanel.add(dbUidField,"span 2,grow,wrap");
		centerPanel.add(dbpwdLabel,"right");
		centerPanel.add(dbPwdField,"span 2,grow,wrap");
		centerPanel.add(bTestDB, "skip, span 2,grow");		
		nameField.addActionListener(this);
		hostField.addActionListener(this);
		sidField.addActionListener(this);
		bTestDB.addActionListener(this);
		bOK.addActionListener(this);
		bCancel.addActionListener(this);
	}   //  jbInit

	/**
	 *  Set Busy - lock UI
	 *  @param busy busy
	 */
	private void setBusy (boolean busy)
	{
		if (busy)
			this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
		else
			this.setCursor(Cursor.getDefaultCursor());
		m_updating = busy;
	}   //  setBusy

	/**
	 *  Set Connection
	 *  @param cc - if null use current connection
	 */
	public void setConnection (CConnection cc)
	{
		m_cc = cc;
		if (m_cc == null)
		{
			m_cc = CConnection.get();

			m_cc.setName();

		}
		//	Should copy values
//		try {
//			m_ccResult = (CConnection)m_cc.clone();
//		} catch (CloneNotSupportedException e) {
//			// should not happen
//			e.printStackTrace();
//		}
		//
		//String type = m_cc.getType();
		//if (type == null || type.length() == 0)
		//	dbTypeField.setSelectedItem(null);
		//else
		//	m_cc.setType(m_cc.getType());   //  sets defaults
		updateInfo();
	}   //  setConnection

	/**
	 *  Get Connection
	 *  @return CConnection
	 */
	public CConnection getConnection()
	{
		//return m_ccResult;
		return m_cc;
	}   //  getConnection;

	/**
	 *  ActionListener
	 *  @param e event
	 */
	public void actionPerformed(ActionEvent e)
	{
		if (m_updating)
			return;
		Object src = e.getSource();

		if (src == bOK)
		{
			updateCConnection();
			m_cc.setName();			
			//m_ccResult = m_cc;
			cmd_testDB();
			dispose();
			isCancel = false;
			return;
		}
		else if (src == bCancel)
		{
			m_cc.setName();
			dispose();
			return;
		}
		//		else if (src == dbTypeField)
		//		{
		//			if (dbTypeField.getSelectedItem() == null)
		//				return;
		//		}


		updateCConnection();
		//
		//if (src == bTestApps)
		//	cmd_testApps();
		//updateApp();

		//  Database Selection Changed
		//		else if (src == dbTypeField)
		//		{
		//			m_cc.setType((String)dbTypeField.getSelectedItem());
		//			dbPortField.setText(String.valueOf(m_cc.getDbPort()));
		//			cbBequeath.setSelected(m_cc.isBequeath());
		//			fwPortField.setText(String.valueOf(m_cc.getFwPort()));
		//		}
		//
		if (src == bTestDB)
			cmd_testDB();

		//  Name
		if (src == nameField)
			m_cc.setName(nameField.getText());

		updateInfo();
	}   //  actionPerformed

	private void updateCConnection() {
		//if (Ini.isClient())
		//{
			//hengsin: avoid unnecessary requery of application server status
			//if (!appsHostField.getText().equals(m_cc.getAppsHost()))
			//	m_cc.setAppsHost(appsHostField.getText());
			//if (!appsPortField.getText().equals(Integer.toString(m_cc.getAppsPort())))
			//	m_cc.setAppsPort(appsPortField.getText());
		//}
		//else
		//	m_cc.setAppsHost("localhost");
		//
		m_cc.setDbHost(hostField.getText());
		m_cc.setDbPort(dbHostPortField.getText());
		m_cc.setDbName(sidField.getText());
		m_cc.setDbUid(dbUidField.getText());
		m_cc.setDbPwd(String.valueOf(dbPwdField.getPassword()));		
	}

	/**
	 *  Update Fields from Connection
	 */
	private void updateInfo()
	{
		m_updating = true;
		nameField.setText(m_cc.getName());
		//appsHostField.setText(m_cc.getAppsHost());
		//appsPortField.setText(String.valueOf(m_cc.getAppsPort()));

		//
		//bTestApps.setIcon(getStatusIcon(m_cc.isAppsServerOK(false)));
		//	bTestApps.setToolTipText(m_cc.getRmiUri());

		//cbOverwrite.setVisible(m_cc.isAppsServerOK(false));
		//boolean rw = CConnection.isServerEmbedded() ? true : !m_cc.isAppsServerOK(false);
		boolean rw = CConnection.isServerEmbedded();
		//dbTypeField.setReadWrite(rw);
		//dbTypeField.setSelectedItem(m_cc.getType());
		//
		hostLabel.setReadWrite(rw);
		hostField.setReadWrite(rw);
		hostField.setText(m_cc.getDbHost());
		hostportLabel.setReadWrite(rw);
		dbHostPortField.setReadWrite(rw);
		dbHostPortField.setText(String.valueOf(m_cc.getDbPort()));
		sidLabel.setReadWrite(rw);
		sidField.setReadWrite(rw);
		sidField.setText(m_cc.getDbName());
		//
		dbUidLabel.setReadWrite(rw);
		dbUidField.setReadWrite(rw);
		dbUidField.setText(m_cc.getDbUid());
		dbPwdField.setEditable(rw);
		dbPwdField.setText(m_cc.getDbPwd());
		//
		//boolean fwEnabled = rw && m_cc.isViaFirewall() && m_cc.isOracle();
		//
		bTestDB.setToolTipText(m_cc.getConnectionURL());
		bTestDB.setIcon(getStatusIcon(m_cc.isDatabaseOK()));
		m_updating = false;
	}   //  updateInfo

	/**
	 *  Get Status Icon - ok or not
	 *  @param ok ok
	 *  @return Icon
	 */
	private Icon getStatusIcon (boolean ok)
	{
		if (ok)
			return bOK.getIcon();
		else
			return bCancel.getIcon();
	}   //  getStatusIcon

	/**
	 *  Test Database connection
	 */
	private void cmd_testDB()
	{
		setBusy (true);
		Exception e = m_cc.testDatabase(true);
		if (e != null)
		{
			String msg = "Desea crear un nuevo cliente?";
			if (JOptionPane.showConfirmDialog(this, msg) == JOptionPane.YES_OPTION)
			{				
				CConnection finalcc = m_cc.get();
				dbname = m_cc.getDbName();
				m_cc.setDbName("postgres");
				e = m_cc.testDatabase(true); 
				if (e == null)
				{										
					int no = DB.getSQLValue(null, String.format("SELECT 1 FROM pg_database WHERE datname = '%s'",dbname));
					if (no < 0)
					{
						msg = String.format("esta seguro de crear %s para empezar?",dbname);					
						if (JOptionPane.showConfirmDialog(this, msg) == JOptionPane.YES_OPTION)
						{							
							org.compiere.apps.SwingWorker worker = new org.compiere.apps.SwingWorker()
							{				
								public Object construct()
								{
									layerUI.start();		
									NewClientWizardLauncher nn = new NewClientWizardLauncher();							
									nn.setConnection(m_cc);							
									nn.setDBName(dbname);
									nn.setWaitLayer(layerUI);
									nn.launchWizard();																		
									sidField.setText(dbname);
									updateCConnection();
									cmd_testDB();
									layerUI.stop();
									return Boolean.TRUE;
								}
							};
							worker.start();													
						}
					}
				}
				else
				{
					ADialog.info(0, this, "No existe conexion");
				}
			}
		}
		else
		{
			try {
			} catch (Exception ex) {
				ex.printStackTrace();
			}
			//updateApp();
		}
		setBusy (false);
	}   //  cmd_testDB

	/**
	 * 	Test JDBC Connection to Server
	 * 	@param url connection string
	 *  @param uid user id
	 *  @param pwd password
	 * 	@return true if OK
	 */
	private boolean testJDBC (String url, String uid, String pwd)
	{
		try
		{
			Connection conn = p_db.getDriverConnection(url, uid, pwd);
			conn.close();
		}
		catch (Exception e)
		{
			log.severe(e.toString());
			return false;
		}
		return true;
	}	//	testJDBC

//	private void updateApp()
//	{
//
//	}
//	/**
//	 *  Test Application connection
//	 */
//	private void cmd_testApps()
//	{
//		setBusy (true);
//		Exception e = m_cc.testAppsServer();
//		if (e != null)
//		{
//			if (e.getLocalizedMessage() != null)
//				JOptionPane.showMessageDialog(this,
//						e.getLocalizedMessage(),
//						res.getString("ServerNotActive") + " - " + m_cc.getAppsHost(),
//						JOptionPane.ERROR_MESSAGE);
//
//			Object[] options = {"Yes","No"};
//			String msg = e.getLocalizedMessage();
//			if (msg == null)
//				msg = "";
//			msg += res.getString("ServerLocal");
//			if (JOptionPane.showOptionDialog(this, msg , 
//					res.getString("ServerNotActive") + " - " + m_cc.getAppsHost(),
//					JOptionPane.YES_NO_OPTION,
//					JOptionPane.WARNING_MESSAGE,
//					null, options, options[1]) == 0)			
//			{
//				//Env.setContext(Env.getCtx(), Env.HOLON, true);
//				//				XendraHolon holon = XendraHolon.getInstance();
//				//				if (holon.isRunning())
//				//				{
//				//					appsHostField.setText("localhost");
//				//				}
//			}
//		}
//		setBusy (false);
//	}   //  cmd_testApps

	public boolean isCancel() {
		return isCancel;
	}

}   //  CConnectionDialog