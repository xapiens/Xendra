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
package org.compiere.grid.ed;

import java.awt.*;
import java.awt.event.*;
import java.util.logging.*;

import javax.swing.*;

import org.xendra.plaf.XendraPLAF;
import org.xendra.utils.Sunat;
import org.compiere.apps.*;
import org.compiere.model.MBPartner;
import org.compiere.model.MBPartnerLocation;
import org.compiere.model.MLocation;
import org.compiere.model.MLocationLookup;
import org.compiere.model.MLookup;
import org.compiere.model.MLookupFactory;
import org.compiere.model.MLookupInfo;
import org.compiere.model.MRole;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_C_Contact;
import org.compiere.model.reference.REF_C_BP_DocTypeI;
import org.compiere.plaf.*;
import org.compiere.swing.*;
import org.compiere.util.*;

/**
 *	Business Partner Editor.
 *	Set BPartner: loadBPartner
 *	Get result: getC_BPartner_ID
 *
 *  @author 	Jorg Janke
 *  @version 	$Id: VBPartner.java 3602 2011-09-26 22:38:44Z xapiens $
 */
public final class VBPartner extends CDialog implements ActionListener
{
	/**
	 *	Constructor.
	 *	Requires call loadBPartner
	 * 	@param frame	parent
	 * 	@param WindowNo	Window No
	 */
	public VBPartner(Frame frame, int WindowNo)
	{
		super(frame, Msg.translate(Env.getCtx(), "C_BPartner_ID"), true);
		m_WindowNo = WindowNo;
		m_readOnly = !MRole.getDefault().canUpdate(
			Env.getAD_Client_ID(Env.getCtx()), Env.getAD_Org_ID(Env.getCtx()), 
			MBPartner.Table_ID, 0, false);
		log.info("R/O=" + m_readOnly);
		try
		{
			jbInit();
		}
		catch(Exception ex)
		{
			log.log(Level.SEVERE, ex.getMessage());
		}
		initBPartner();
		//
		AEnv.positionCenterWindow(frame, this);
	}	//	VBPartner

	private int 			m_WindowNo;
	/** The Partner				*/
	private MBPartner		m_partner = null;
	/** The Location			*/
	private MBPartnerLocation	m_pLocation = null;
	/** The User				*/
	//private MUser			m_user = null;
	private X_C_Contact 	m_contact = null;
	/** Read Only				*/
	private boolean			m_readOnly = false;

	
	private Insets			m_labelInsets = new Insets(2,15,2,0);		// 	top,left,bottom,right
	private Insets			m_fieldInsets = new Insets(2,5,2,10);		// 	top,left,bottom,right
	private GridBagConstraints m_gbc = new GridBagConstraints();
	private int				m_line;
	private MLookupInfo     m_doctype;
	private VLookup			pickDocType;
	private Object[]		m_greeting;
	private Object[]		m_organization;	
	/**	Logger			*/
	private static CLogger log = CLogger.getCLogger(VBPartner.class);
	//
	private VString	fValue, fName, fName2;
	//private VString fContact;
	private VString ffirstname, fsecondname,  fTitle, fPhone, fFax, fPhone2, fEMail, fTaxID;
	private VLocation 		fAddress;
	private JComboBox 		fGreetingBP, fGreetingC, fOrganization;
	//
	private CPanel mainPanel = new CPanel();
	private BorderLayout mainLayout = new BorderLayout();
	private CPanel centerPanel = new CPanel();
	private CPanel southPanel = new CPanel();
	private GridBagLayout centerLayout = new GridBagLayout();
	private ConfirmPanel confirmPanel = new ConfirmPanel(true);
	private BorderLayout southLayout = new BorderLayout();

	
	/**
	 *	Static Init
	 * 	@throws Exception
	 */
	void jbInit() throws Exception
	{
		mainPanel.setLayout(mainLayout);
		southPanel.setLayout(southLayout);
		centerPanel.setLayout(centerLayout);
		mainLayout.setVgap(5);
		getContentPane().add(mainPanel);
		mainPanel.add(centerPanel, BorderLayout.CENTER);
		mainPanel.add(southPanel, BorderLayout.SOUTH);
		southPanel.add(confirmPanel, BorderLayout.CENTER);
		//
		confirmPanel.addActionListener(this);
	}	//	jbInit

	/**
	 *	Dynamic Init
	 */
	private void initBPartner()
	{
		//	Get Data
		m_greeting = fillGreeting();
		//  Get DocType
		m_doctype = fillDocType();
		MLookup lookupDocType = new MLookup (m_doctype, 0);
		pickDocType = new VLookup("C_DocTypeTarget_ID", true, false, true, lookupDocType);
		
		
		//
		m_organization = fillOrganization();
		//	Display
		m_gbc.anchor = GridBagConstraints.NORTHWEST;
		m_gbc.gridx = 0;
		m_gbc.gridy = 0;
		m_gbc.gridwidth = 1;
		m_gbc.weightx = 0;
		m_gbc.weighty = 0;
		m_gbc.fill = GridBagConstraints.HORIZONTAL;
		m_gbc.ipadx = 0;
		m_gbc.ipady = 0;
		m_line = 0;

		//  Organization
		fOrganization = new JComboBox (m_organization);
		createLine (fOrganization, "Organization", false);
		// DocType
		createLine(pickDocType, "Tipo Doc Identidad", false);
		//
		fTaxID = new VString("TaxID", true, false, true, 30, 60, "" , null);
		fTaxID.addActionListener(this);
		createLine(fTaxID, "Doc Identidad", false);
		//	Value
		fValue = new VString("Value", true, false, true, 30, 60, "", null);
		fValue.addActionListener(this);
		createLine (fValue, "Value", true);		
		//	Greeting Business Partner
		fGreetingBP = new JComboBox (m_greeting);
		createLine (fGreetingBP, "Greeting", false);
		//	Name
		fName = new VString("Name", true, false, true, 30, 60, "", null);
		fName.addActionListener(this);
		createLine (fName, "Name", false).setFontBold(true);
		//	Name2
		fName2 = new VString("Name2", false, false, true, 30, 60, "", null);
		createLine (fName2, "Name2", false);
		
		//	Contact
		//	Greeting Contact
		fGreetingC = new JComboBox (m_greeting);
		createLine (fGreetingC, "Greeting", false);
		//	Title
		//fContact = new VString("Contact", false, false, true, 30, 60, "", null);
		//createLine (fContact, "Contact", true).setFontBold(true);
		ffirstname = new VString("First Name", false, false, true, 30, 60, "", null);
		createLine(ffirstname, "First Name", true).setFontBold(true);		
		fsecondname = new VString("Second Name", false, false, true, 30, 50, "", null);
		createLine(fsecondname, "Second Name", true).setFontBold(true);
		fTitle = new VString("Title", false, false, true, 30, 60, "", null);
		createLine(fTitle, "Title", false);
		//	Email
		fEMail = new VString("EMail", false, false, true, 30, 40, "", null);
		createLine (fEMail, "EMail", false);
		
		//	Location
		boolean ro = m_readOnly;
		if (!ro)
			ro = !MRole.getDefault().canUpdate(
				Env.getAD_Client_ID(Env.getCtx()), Env.getAD_Org_ID(Env.getCtx()), 
				MBPartnerLocation.Table_ID, 0, false);
		if (!ro)
			ro = !MRole.getDefault().canUpdate(
				Env.getAD_Client_ID(Env.getCtx()), Env.getAD_Org_ID(Env.getCtx()), 
				MLocation.Table_ID, 0, false);
		fAddress = new VLocation ("C_Location_ID", false, ro, true, new MLocationLookup (Env.getCtx(), m_WindowNo));
		fAddress.setValue (null);
		createLine (fAddress, "C_Location_ID", true).setFontBold(true);
		//	Phone
		fPhone = new VString("Phone", false, false, true, 30, 40, "", null);
		createLine (fPhone, "Phone", true);
		//	Phone2
		fPhone2 = new VString("Phone2", false, false, true, 30, 40, "", null);
		createLine (fPhone2, "Phone2", false);
		//	Fax
		fFax = new VString("Fax", false, false, true, 30, 40, "", null);
		createLine (fFax, "Fax", false);
		//
		fName.setBackground(XendraPLAF.getFieldBackground_Mandatory());
		fAddress.setBackground(XendraPLAF.getFieldBackground_Mandatory());
	}	//	initBPartner

	/**
	 * 	Create Line
	 * 	@param field 	field
	 * 	@param title	label value
	 * 	@param addSpace	add more space
	 * 	@return label
	 */
	private CLabel createLine (JComponent field, String title, boolean addSpace)
	{
		if (addSpace)
		{
			m_gbc.gridy = m_line++;
			m_gbc.gridx = 1;
			m_gbc.insets = m_fieldInsets;
			centerPanel.add (Box.createHorizontalStrut(6), m_gbc);
		}

		//	Line
		m_gbc.gridy = m_line++;

		//	Label
		m_gbc.gridx = 0;
		m_gbc.insets = m_labelInsets;
		m_gbc.fill = GridBagConstraints.HORIZONTAL;
		CLabel label = new CLabel(Msg.translate(Env.getCtx(), title));
		centerPanel.add(label, m_gbc);

		//	Field
		m_gbc.gridx = 1;
		m_gbc.insets = m_fieldInsets;
		m_gbc.fill = GridBagConstraints.HORIZONTAL;
		centerPanel.add(field, m_gbc);
		if (m_readOnly)
			field.setEnabled(false);
		return label;
	}	//	createLine

	/**
	 *	Fill Greeting
	 * 	@return KeyNamePair Array of Greetings
	 */
	private Object[] fillGreeting()
	{
		String sql = "SELECT C_Greeting_ID, Name FROM C_Greeting WHERE IsActive='Y' ORDER BY 2";
		sql = MRole.getDefault().addAccessSQL(sql, "C_Greeting", MRole.SQL_NOTQUALIFIED, MRole.SQL_RO);
		return DB.getKeyNamePairs(sql, true);
	}	//	fillGreeting
	
	private MLookupInfo fillDocType()
	{
		Language language = Language.getLanguage(Env.getAD_Language(Env.getCtx()));
		int reference = MLookupInfo.getAD_Reference_ID("C_BP_DocTypeI");
		MLookupInfo info = null;		
		info = MLookupFactory.getLookup_List(language, MLookupInfo.getAD_Reference_ID("C_BP_DocTypeI"));
		if ( reference == 0 )
			ADialog.error(m_WindowNo, this, "Reference C_BP_DocTypeI NotFound");			
		return info;
	}

	private Object[] fillOrganization()
	{
		String sql = "SELECT AD_Org_ID, Name FROM AD_Org WHERE IsActive='Y' AND IsSummary='N' ORDER BY 2";
		sql = MRole.getDefault().addAccessSQL(sql, "AD_Org", MRole.SQL_NOTQUALIFIED, MRole.SQL_RO);
		return DB.getKeyNamePairs(sql, true);		
	}
	/**
	 *	Search m_greeting for key
	 * 	@param key	C_Greeting_ID
	 * 	@return	Greeting
	 */
	private KeyNamePair getGreeting (int key)
	{
		for (int i = 0; i < m_greeting.length; i++)
		{
			KeyNamePair p = (KeyNamePair)m_greeting[i];
			if (p.getKey() == key)
				return p;
		}
		return new KeyNamePair(-1, " ");
	}	//	getGreeting

	/**
	 *	Search m_greeting for key
	 * 	@param key	C_Org_ID
	 * 	@return	Organization
	 */
	private KeyNamePair getOrganization (int key)
	{
		for (int i = 0; i < m_organization.length; i++)
		{
			KeyNamePair p = (KeyNamePair)m_organization[i];
			if (p.getKey() == key)
				return p;
		}
		return new KeyNamePair(-1, " ");
	}	//	getOrganization
	
	/**
	 *	Load BPartner
	 *  @param C_BPartner_ID - existing BPartner or 0 for new
	 * 	@return true if loaded
	 */
	public boolean loadBPartner (int C_BPartner_ID)
	{
		log.config("C_BPartner_ID=" + C_BPartner_ID);
		//  New bpartner
		if (C_BPartner_ID == 0)
		{
			m_partner = null;
			m_pLocation = null;
			//m_user = null;
			m_contact = null;
			return true;
		}

		m_partner = new MBPartner (Env.getCtx(), C_BPartner_ID, null);
		if (m_partner.get_ID() == 0)
		{
			ADialog.error(m_WindowNo, this, "BPartnerNotFound");
			return false;
		}

		//	BPartner - Load values
		fOrganization.setSelectedItem(getOrganization(m_partner.getAD_Org_ID()));
		fValue.setText(m_partner.getValue());
		fGreetingBP.setSelectedItem(getGreeting(m_partner.getC_Greeting_ID()));
		fName.setText(m_partner.getName());
		fName2.setText(m_partner.getName2());

		//	Contact - Load values
		m_pLocation = m_partner.getLocation(Env.getContextAsInt(Env.getCtx(), m_WindowNo, "C_BPartner_Location_ID"));
		if (m_pLocation != null)
		{
			int location = m_pLocation.getC_Location_ID();
			fAddress.setValue (new Integer(location));
			//
			fPhone.setText(m_pLocation.getPhone());
			fPhone2.setText(m_pLocation.getPhone2());
			fFax.setText(m_pLocation.getFax());
		}
		//	User - Load values
		m_contact = new Query(Env.getCtx(), X_C_Contact.Table_Name, "C_BPartner_ID = ?", null)
			.setParameters(m_partner.getC_BPartner_ID()).first();		
		//m_user = m_partner.getContact(Env.getContextAsInt(Env.getCtx(), m_WindowNo, "AD_User_ID"));
		//if (m_user != null)
		if (m_contact != null)
		{				
			//fGreetingC.setSelectedItem(getGreeting(m_user.getC_Greeting_ID()));
			fGreetingC.setSelectedItem(m_contact.getC_Greeting_ID());
			//fContact.setText(m_user.getName());
			ffirstname.setText(m_contact.getFirstName());
			fsecondname.setText(m_contact.getFirstSurName());
			//fTitle.setText(m_user.getTitle());
			fTitle.setText(m_contact.getTitle());
			//fEMail.setText(m_user.getEMail());
			fEMail.setText(m_contact.getEMail());
			//
			//fPhone.setText(m_user.getPhone());
			fPhone.setText(m_contact.getPhone());
			//fPhone2.setText(m_user.getPhone2());
			fPhone2.setText(m_contact.getPhone2());
			//fFax.setText(m_user.getFax());
			fFax.setText(m_contact.getFax());
		}
		return true;
	}	//	loadBPartner


	/**
	 *	Action Listener
	 * 	@param e event
	 */
	public void actionPerformed(ActionEvent e)
	{
		if (m_readOnly)
			dispose();
		//	copy value
		else if (e.getSource() == fTaxID)
		{										
			if (fValue.getText() == null || fValue.getText().length() == 0)
				fValue.setText(fTaxID.getText());
		}
		else if (e.getSource() == fValue)
		{
			if (fName.getText() == null || fName.getText().length() == 0)
				fName.setText(fValue.getText());
		}
		else if (e.getSource() == fName)
		{
			if (ffirstname.getText() == null || ffirstname.getText().length() == 0)
				ffirstname.setText(fName.getText());
			//if (fContact.getText() == null || fContact.getText().length() == 0)
			//	fContact.setText(fName.getText());
		}
		//	OK pressed
		else if (e.getActionCommand().equals(ConfirmPanel.A_OK) 
			&& actionSave())
			dispose();
		//	Cancel pressed
		else if (e.getActionCommand().equals(ConfirmPanel.A_CANCEL))
			dispose();
	}	//	actionPerformed

	/**
	 *	Save.
	 *	Checks mandatory fields and saves Partner, Contact and Location
	 * 	@return true if saved
	 */
	private boolean actionSave()
	{
		log.config("");

		if  (pickDocType.getValue() == null)
		{
			pickDocType.setBackground(XendraPLAF.getFieldBackground_Error());
			return false;
		}
		//	Check Mandatory fields		
		String BP_DocTypeI = (String) pickDocType.getValue();
		if (!Sunat.isValidRUC(fTaxID.getText()) && BP_DocTypeI.compareTo(REF_C_BP_DocTypeI.RUC) == 0)
		{
			ADialog.error(m_WindowNo, this, "InvalidRUC");
			fTaxID.setBackground(XendraPLAF.getFieldBackground_Error());
			return false;
		}
		if (fName.getText().equals(""))
		{
			fName.setBackground(XendraPLAF.getFieldBackground_Error());
			return false;
		}
		else
			fName.setBackground(XendraPLAF.getFieldBackground_Mandatory());
		if (fAddress.getC_Location_ID() == 0)
		{
			fAddress.setBackground(XendraPLAF.getFieldBackground_Error());
			return false;
		}
		else
			fAddress.setBackground(XendraPLAF.getFieldBackground_Mandatory());

		//	***** Business Partner *****
		if (m_partner == null)
		{
			int AD_Client_ID = Env.getAD_Client_ID(Env.getCtx());
			m_partner = MBPartner.getTemplate(Env.getCtx(), AD_Client_ID);
			boolean isSOTrx = !"N".equals(Env.getContext(Env.getCtx(), m_WindowNo, "IsSOTrx"));
			m_partner.setIsCustomer (isSOTrx);
			m_partner.setIsVendor (!isSOTrx);
		}
		//	Check Value
		String value = fValue.getText();
		if (value == null || value.length() == 0)
		{
			//	get Table Documet No
			value = DB.getDocumentNo (Env.getAD_Client_ID(Env.getCtx()), "C_BPartner", null);
			fValue.setText(value);
		}
		m_partner.setTaxID(fTaxID.getText());
		m_partner.setValue(fValue.getText());
		//
		m_partner.setName(fName.getText());
		m_partner.setName2(fName2.getText());
		
		KeyNamePair q = (KeyNamePair)fOrganization.getSelectedItem();
		if (q != null && q.getKey() > 0)
			m_partner.setAD_Org_ID(q.getKey());
		else
			m_partner.setAD_Org_ID(0);
		
		//if (pickDocType.getValue() != null)
		//	m_partner.setC_BP_DocTypeI( (String) pickDocType.getValue());
		
		KeyNamePair p = (KeyNamePair)fGreetingBP.getSelectedItem();
		if (p != null && p.getKey() > 0)
			m_partner.setC_Greeting_ID(p.getKey());
		else
			m_partner.setC_Greeting_ID(0);
		if (m_partner.save())
		{		
			//	***** Business Partner - Location *****
			if (m_pLocation == null)
				m_pLocation = new MBPartnerLocation(m_partner);
			m_pLocation.setC_Location_ID(fAddress.getC_Location_ID());
			//
			m_pLocation.setPhone(fPhone.getText());
			m_pLocation.setPhone2(fPhone2.getText());
			m_pLocation.setFax(fFax.getText());
			if (m_pLocation.save())
				log.fine("C_BPartner_Location_ID=" + m_pLocation.getC_BPartner_Location_ID());
			else
				ADialog.error(m_WindowNo, this, "BPartnerNotSaved", Msg.translate(Env.getCtx(), "C_BPartner_Location_ID"));

			//	***** Business Partner - User *****
			//String contact = fContact.getText();
			String contact = String.format("%s %s", ffirstname.getText(), this.fsecondname.getText());
			String email = fEMail.getText();
			//if (m_user == null && (contact.length() > 0 || email.length() > 0))
			if (m_contact == null && (contact.length() > 0 || email.length() > 0))
			{
				//m_user = new MUser (m_partner);
				m_contact = new X_C_Contact(Env.getCtx(), 0, null);
				m_contact.setC_BPartner_ID(m_partner.getC_BPartner_ID());
			}
			//if (m_user != null)
			if (m_contact != null)
			{
				if (contact.length() == 0)
				{
					m_contact.setFirstName(fName.getText());
				}
				else
				{
					//m_user.setName(contact);
					m_contact.setFirstName(ffirstname.getText());
					m_contact.setSecondSurName(fsecondname.getText());
				}
				//m_user.setEMail(email);
				m_contact.setEMail(email);
				//m_user.setTitle(fTitle.getText());
				m_contact.setTitle(fTitle.getText());
				p = (KeyNamePair)fGreetingC.getSelectedItem();
				if (p != null && p.getKey() > 0)
					//m_user.setC_Greeting_ID(p.getKey());
					m_contact.setC_Greeting_ID(p.getKey());
				else
					m_contact.setC_Greeting_ID(0);
					//m_user.setC_Greeting_ID(0);
				//
				//m_user.setPhone(fPhone.getText());
				m_contact.setPhone(fPhone.getText());
				//m_user.setPhone2(fPhone2.getText());
				m_contact.setPhone2(fPhone2.getText());
				//m_user.setFax(fFax.getText());
				m_contact.setFax(fFax.getText());
				//if (m_user.save())
				if (m_contact.save())
					//log.fine("AD_User_ID=" + m_user.getAD_User_ID());
					log.fine("C_Contact=" +  m_contact.getC_Contact_ID());
				else
					ADialog.error(m_WindowNo, this, "BPartnerNotSaved", Msg.translate(Env.getCtx(), "AD_User_ID"));
			}		
			log.fine("C_BPartner_ID=" + m_partner.getC_BPartner_ID());
		}
		else
		{
			m_partner = null;
			ADialog.error(m_WindowNo, this, CLogger.retrieveErrorString("BPartnerExist"));
			return false;
		}

		return true;
	}	//	actionSave


	/**
	 *	Returns BPartner ID
	 *	@return C_BPartner_ID (0 = not saved)
	 */
	public int getC_BPartner_ID()
	{
		if (m_partner == null)
			return 0;
		return m_partner.getC_BPartner_ID();
	}	//	getBPartner_ID

}	//	VBPartner

