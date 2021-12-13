package org.xendra.pop.cardcomponent;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.KeyboardFocusManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyVetoException;
import java.beans.VetoableChangeListener;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Observable;
import java.util.Observer;
import java.util.logging.Level;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.KeyStroke;
import javax.swing.SwingConstants;

import net.miginfocom.swing.MigLayout;

import org.compiere.apps.ADialog;
import org.compiere.apps.AppsAction;
import org.compiere.grid.ed.VDate;
import org.compiere.grid.ed.VLookup;
import org.compiere.grid.ed.VNumber;
import org.compiere.grid.ed.VString;
import org.compiere.model.Lookup;
import org.compiere.model.MBPartner;
import org.compiere.model.MDocType;
import org.compiere.model.MLookup;
import org.compiere.model.MLookupFactory;
import org.compiere.model.MLookupInfo;
import org.compiere.model.MOrder;
import org.compiere.model.MUser;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_C_BPartner;
import org.compiere.model.persistence.X_C_Invoice;
import org.compiere.model.persistence.X_C_PaymentTerm;
import org.compiere.model.persistence.X_M_InOut;
import org.compiere.model.persistence.X_M_Warehouse;
import org.compiere.model.MPaymentTerm;
import org.compiere.model.MPeriod;
import org.compiere.model.persistence.X_C_Order;
//import org.compiere.model.reference.REF_POPType;
import org.compiere.model.reference.REF__PaymentRule;
import org.compiere.swing.CButton;
import org.compiere.swing.CComboBox;
import org.compiere.swing.CLabel;
import org.compiere.swing.CPanel;
import org.compiere.swing.CTextField;
import org.compiere.util.CLogger;
import org.compiere.util.DB;
import org.compiere.util.DisplayType;
import org.compiere.util.Env;
import org.compiere.util.KeyNamePair;
import org.compiere.util.Msg;
import org.compiere.util.Util;
import org.compiere.util.NamePair;
import org.xendra.common.ICardPanel;
import org.xendra.objectview.ObjectViewModel;
import org.xendra.pop.PopPanel;
import org.xendra.pop.wizard.MachineCreator;

public class BuyPanel extends CardComponentPanel implements ICardPanel, VetoableChangeListener, ActionListener, Observer {

	private static CLogger log = CLogger.getCLogger(BuyPanel.class);
	private static final String A_EXIT = "Cancelar";
	private static final String A_PARTIAL = "Partial";
	private static final String A_FINISH = "Finish";
	private AppsAction aFinish, /*aPartial,*/  aExit;
	private CButton    bFinish, /*bPartial,*/  bExit;	
	private String PaymentTerm = "";
	private PopPanel poppanel;
	private int m_WindowNo;
	private CPanel PayPanel = new CPanel();
	private CPanel mainPanel = new CPanel();

	private CPanel southPanel = new CPanel();
	private BorderLayout southLayout = new BorderLayout();	

	private JLabel lbl_SelectPayType = new JLabel();
	JLabel     PayType;
	private VLookup fieldSalesRep;			
	private CTextField fieldName = new CTextField(10);	
	private CLabel labelName = new CLabel();
	private String ClientAlias = "";
	private VLookup pickPartner;
	//private VLookup pickWarehouse;	
	public  VLookup pickPaymentTerm;
	private VLookup pickBPartnerLocation;
	private BigDecimal TotalCard = Env.ZERO;
	private BigDecimal TotalCash = Env.ZERO;	
	private VDate pickDateOrdered = new VDate("DateFrom", true, false, true, DisplayType.DateTime, Msg.translate(Env.getCtx(), "DateFrom"));
	private VString pickInvoiceSerial = new VString("pickInvoiceSerial", true, false, true, 5, 5, null, null);
	private VString pickInvoiceDocNumber = new VString("pickInvoiceDocNumber", true, false, true, 10, 10 , null, null);
	//private CTextField pickInOutDocNumber = new CTextField(10);
	private final VDate pickDateAcct = new VDate();
	private final VDate pickDateInvoice = new VDate();
	//private final VDate pickDateInOut = new VDate("DateInOut", true, false, true, DisplayType.DateTime, Msg.translate(Env.getCtx(),"DateInOut"));
	private final VDate pickDatePromised = new VDate();
	private VLookup pickPriorityRule;
	private VNumber Freight;
	private CComboBox pickDocType;

	public BuyPanel(PopPanel pp) {	
		try
		{
			poppanel = pp;	
			java.util.Set<KeyStroke> forwardTab = new java.util.HashSet<KeyStroke>();
			forwardTab.add(KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ENTER, 0));
			setFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS, forwardTab);
			jbInit();
			Evaluation();
		}
		catch(Exception e)
		{
			log.log(Level.SEVERE, "Find", e);
		}						
	}
	private void Evaluation() {
		// TODO Auto-generated method stub

	}
	private void jbInit() {
		southPanel.setLayout(southLayout);
		add(southPanel, BorderLayout.SOUTH);

		pickPartner = VLookup.createBPartner(m_WindowNo);
		pickPartner.setMandatory(true);
		pickPartner.setValue(getOrder().getC_BPartner_ID());
		pickPartner.addVetoableChangeListener(this);

		Freight = new VNumber("Freight", false, false, true,	DisplayType.Amount, "ajua");
		Freight.addActionListener(this);

		//int AD_Column_ID = Util.getColumnID(MOrder.Table_ID, X_C_Order.COLUMNNAME_M_Warehouse_ID);
		//Lookup lookup = MLookupFactory.get (Env.getCtx(), m_WindowNo, 0, AD_Column_ID, DisplayType.TableDir);		
		//pickWarehouse = new VLookup (X_M_Warehouse.COLUMNNAME_M_Warehouse_ID, false, false, true, lookup);
		//pickWarehouse.setValue(poppanel.getWarehouse());

		int AD_Column_ID = Util.getColumnID(MOrder.Table_ID,  X_C_Order.COLUMNNAME_PriorityRule);
		Lookup lookup = MLookupFactory.get(Env.getCtx(), m_WindowNo, 0, AD_Column_ID, DisplayType.List); 
		pickPriorityRule = new VLookup(X_C_Order.COLUMNNAME_PriorityRule, true, false, true, lookup);
		pickPriorityRule.addVetoableChangeListener(this);
		pickPriorityRule.setValue(poppanel.getOrder().getPriorityRule());
		
		AD_Column_ID = Util.getColumnID(MOrder.Table_ID, X_C_Order.COLUMNNAME_C_BPartner_Location_ID);
		lookup = MLookupFactory.get (Env.getCtx(), m_WindowNo, 0, AD_Column_ID, DisplayType.TableDir);
		pickBPartnerLocation = new VLookup (X_C_Order.COLUMNNAME_C_BPartner_Location_ID, true, false, true, lookup);
		pickBPartnerLocation.addVetoableChangeListener(this);
		pickBPartnerLocation.setValue(getOrder().getC_BPartner_Location_ID());

		AD_Column_ID = Util.getColumnID(MOrder.Table_ID, X_C_Order.COLUMNNAME_C_PaymentTerm_ID);
		lookup = MLookupFactory.get( Env.getCtx(),m_WindowNo, 0, AD_Column_ID, DisplayType.TableDir);
		pickPaymentTerm = new VLookup(X_C_Order.COLUMNNAME_C_PaymentTerm_ID, true, false, true, lookup);

		String IsSOTrx = "N";
		Env.setContext(Env.getCtx(), m_WindowNo, X_C_Order.COLUMNNAME_IsSOTrx, IsSOTrx);		

		//labelWarehouse = new JLabel(Msg.translate(Env.getCtx(), X_C_Order.COLUMNNAME_M_Warehouse_ID));

		pickDocType = this.getPOPPanel().getpickDocType(); 
		pickDocType.addActionListener(this);
		StringBuffer sb = new StringBuffer();
		sb.append(Msg.translate(Env.getCtx(), "Finish"));
		sb.append(" [F10]");
		aFinish = new AppsAction (A_FINISH, KeyStroke.getKeyStroke(KeyEvent.VK_F10, 0) , sb.toString());
		aFinish.setDelegate(this);
		bFinish = (CButton) aFinish.getButton();

		sb = new StringBuffer(Msg.translate(Env.getCtx(), "Cancel"));
		sb.append(" [ESC]");		
		aExit = new AppsAction (A_EXIT, KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), sb.toString());
		aExit.setDelegate(this);		
		bExit = (CButton) aExit.getButton();

		pickPaymentTerm.addVetoableChangeListener(this);

		AD_Column_ID = Util.getColumnID(MOrder.Table_ID,"SalesRep_ID");
		lookup = MLookupFactory.get (Env.getCtx(), 0, 0, AD_Column_ID, DisplayType.Search);
		fieldSalesRep = new VLookup (X_C_Order.COLUMNNAME_SalesRep_ID, true, false, true, lookup);			

		getOrder().setDateAcct(getOrder().getDateOrdered());

		CPanel customizePane = new CPanel();
		customizePane.setLayout(new MigLayout());

		CPanel PayPanel = new CPanel();
		PayPanel.setBorder(BorderFactory.createTitledBorder(Msg.translate(Env.getCtx(), X_C_BPartner.COLUMNNAME_C_BPartner_ID)));
		PayPanel.setLayout(new MigLayout());
		PayPanel.add(pickPartner, "wrap");
		PayPanel.add(pickBPartnerLocation, "wrap");
		customizePane.add(PayPanel, "wrap");
		
		CPanel CConditions = new CPanel();
		CConditions.setBorder(BorderFactory.createTitledBorder(Msg.translate(Env.getCtx(), X_C_PaymentTerm.COLUMNNAME_C_PaymentTerm_ID)));
		CConditions.setLayout(new MigLayout());
		//labelDocType = new JLabel(Msg.translate(Env.getCtx(), X_C_Order.COLUMNNAME_C_DocType_ID));		
		//CConditions.add(labelDocType);
		CConditions.add(new CLabel(Msg.translate(Env.getCtx(), X_C_Order.COLUMNNAME_C_DocType_ID)));
		CConditions.add(pickDocType,"wrap");
		//CConditions.add(labelWarehouse);
		//CConditions.add(new JLabel(Msg.translate(Env.getCtx(), X_C_Order.COLUMNNAME_M_Warehouse_ID)));
		//CConditions.add(pickWarehouse,"wrap");
		//CConditions.add(labelDate);
		CConditions.add(new JLabel(Msg.translate(Env.getCtx(), X_C_Order.COLUMNNAME_DateOrdered)));
		pickDateOrdered.addVetoableChangeListener(this);
		CConditions.add(pickDateOrdered, "wrap");		
		CConditions.add(new CLabel("Date Promised", SwingConstants.LEADING));
		CConditions.add(pickDatePromised, "wrap");
		CConditions.add(new CLabel(Msg.translate(Env.getCtx(), X_C_Order.COLUMNNAME_PriorityRule), SwingConstants.LEADING));
		CConditions.add(pickPriorityRule, "wrap");
		CConditions.add(new CLabel(Msg.translate(Env.getCtx(), "Freight")));
		CConditions.add(Freight);		
		customizePane.add(CConditions, "wrap");

//		CPanel freightPanel = new CPanel();
//		freightPanel.setBorder(BorderFactory.createTitledBorder(Msg.translate(Env.getCtx(), "Freight")));
//		freightPanel.setLayout(new MigLayout());
//		freightPanel.add(new CLabel(Msg.translate(Env.getCtx(), "Freight")));
//		freightPanel.add(Freight);		
//		customizePane.add(freightPanel, "wrap");

		CPanel invPanel = new CPanel();
		invPanel.setBorder(BorderFactory.createTitledBorder(Msg.translate(Env.getCtx(), "C_Invoice_ID")));		
		invPanel.setLayout(new MigLayout());
		//lblDateInvoice.setText("Date Invoice");		
		//lblDateacct.setText("DateAcct");								
		//invPanel.add(lblDateInvoice);
		invPanel.add(new CLabel(Msg.translate(Env.getCtx(), X_C_Invoice.COLUMNNAME_DateInvoiced)));
		invPanel.add(pickDateInvoice, "wrap");
		//invPanel.add(lblDateacct);
		invPanel.add(new CLabel(Msg.translate(Env.getCtx(), X_C_Order.COLUMNNAME_DateAcct)));
		invPanel.add(pickDateAcct, "wrap");
		///JLabel label = new JLabel(Msg.translate(Env.getCtx(), "Serial"));
		//invPanel.add(label);
		invPanel.add(new JLabel(Msg.translate(Env.getCtx(), X_C_Invoice.COLUMNNAME_Serial)));
		invPanel.add(pickInvoiceSerial, "wrap");
		//CLabel label_1 = new CLabel(Msg.translate(Env.getCtx(), "DocumentNo"));
		//invPanel.add(label_1);
		invPanel.add(new CLabel(Msg.translate(Env.getCtx(), X_C_Order.COLUMNNAME_DocumentNo)));
		invPanel.add(pickInvoiceDocNumber,"wrap");
		invPanel.add(new CLabel(Msg.translate(Env.getCtx(), X_C_PaymentTerm.COLUMNNAME_C_PaymentTerm_ID)));
		invPanel.add(pickPaymentTerm, "wrap");
		//invPanel.add(connPanel,"wrap");
		invPanel.add(new JLabel("Comprador:"));
		invPanel.add(fieldSalesRep);
		customizePane.add(invPanel,"wrap");

		//CPanel inoutPanel = new CPanel();
		//inoutPanel.setBorder(BorderFactory.createTitledBorder(Msg.translate(Env.getCtx(), "M_InOut_ID")));
		//inoutPanel.setLayout(new BoxLayout(inoutPanel, BoxLayout.LINE_AXIS));
		//lblDateinout.setText("DateInOut");		
		//inoutPanel.add(lblDateinout);
		//inoutPanel.add(new CLabel(Msg.translate(Env.getCtx(), X_M_InOut.COLUMNNAME_DateOrdered)));
		//inoutPanel.add(pickDateInOut);
		//inoutPanel.add(new CLabel(Msg.translate(Env.getCtx(), "DocumentNo")));		
		//inoutPanel.add(new CLabel(Msg.translate(Env.getCtx(), X_M_InOut.COLUMNNAME_DocumentNo)));
		//inoutPanel.add(pickInOutDocNumber);		

		//customizePane.add(inoutPanel,"wrap");

		//CPanel connPanel = new CPanel();
		//connPanel.setBorder(BorderFactory.createTitledBorder(Msg.getMsg(Env.getCtx(), "Forma de Pago")));
		//connPanel.setLayout(new MigLayout());

		//CPanel conPanel = new CPanel();
		//conPanel.setBorder(BorderFactory.createTitledBorder(Msg.getMsg(Env.getCtx(), "Venta")));
		//conPanel.setLayout(new MigLayout());
		//conPanel.add(new JLabel("Comprador:"));
		//conPanel.add(fieldSalesRep);

		//customizePane.add(conPanel, "wrap");

		CPanel coxPanel = new CPanel();
		coxPanel.setBorder(BorderFactory.createTitledBorder(Msg.getMsg(Env.getCtx(), "Acciones")));
		coxPanel.setLayout(new MigLayout());
		coxPanel.add(bFinish);
		coxPanel.add(bExit);
		customizePane.add(coxPanel);
		mainPanel.add(customizePane);					
		//
		fieldSalesRep.setValue( getOrder().getSalesRep_ID() );
		labelName.setText(Msg.getMsg(Env.getCtx(), "Name"));
		lbl_SelectPayType.setText("Select Tipo Pago");
		Timestamp dordered = getOrder().getDateOrdered();
		pickDatePromised.setValue(dordered);
		pickDateOrdered.setValue(dordered);
		pickDateAcct.setValue(dordered);
		pickDateInvoice.setValue(dordered);
		//pickDateInOut.setValue(dordered);				
		add(mainPanel, BorderLayout.NORTH);		
	}
	private MOrder getOrder() {
		return getPOPPanel().getOrder();
	}
	public void update() {
		if (getOrder().getC_BPartner_ID() > 0)
		{
			pickPartner.setValue(getOrder().getC_BPartner_ID());
			pickBPartnerLocation.setValue(getOrder().getC_BPartner_Location_ID());
		}		
	}	
	@Override
	public void update(Observable observable, Object arg1) {
		if (observable instanceof MOrder)
		{	
		}
		else if (observable instanceof  MBPartner)
		{
			MBPartner partner = (MBPartner) observable;
			this.pickPartner.setValue(partner.getC_BPartner_ID());
			this.pickBPartnerLocation.setValue(getOrder().getC_BPartner_Location_ID());
		}
		else if (observable instanceof MUser)
		{
		}
	}			
	public void selection() {
		pickPartner.grabFocus();		
	}

	@Override
	public void vetoableChange(PropertyChangeEvent e)
			throws PropertyVetoException {
		String name = e.getPropertyName();
		Object value = e.getNewValue();		
		if (name.equals(X_C_Order.COLUMNNAME_C_BPartner_ID)) {
			MBPartner partner = new Query(Env.getCtx(), MBPartner.Table_Name, "C_BPartner_ID = ?", null).setParameters(value).first();
			getPOPPanel().execute(partner);
		}		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Component c = (Component)e.getSource();
		if (c == pickDocType)
		{
			if (pickDocType.getValue() != null)
			{
				KeyNamePair kp = (KeyNamePair) pickDocType.getValue();
				MDocType doctype = MDocType.get(Env.getCtx(), kp.getKey());
				MPeriod period = MPeriod.get(Env.getCtx(), (Timestamp) pickDateOrdered.getValue(), getOrder().getAD_Org_ID(), getOrder().getAD_Client_ID());
				if ( MPeriod.isOpen(Env.getCtx(), Env.getContextAsDate(Env.getCtx(), "#Date"), doctype.getDocBaseType(), getOrder().getAD_Org_ID(), getOrder().getAD_Client_ID() ))		
				{
					getOrder().setC_DocType_ID((Integer) kp.getKey());
					getOrder().setC_DocTypeTarget_ID((Integer) kp.getKey());
				}
				else
				{
					getPOPPanel().showErrorPanel(String.format("periodo %s para %s esta cerrado", period.getName(), doctype.getName()));
				}
			}
		}
		if (c == Freight) {
			calculateFreight();
		}
		if (c == bExit)
			hideform();
		if (c == bFinish)
		{			
			if (!bFinish.isEnabled())
				getPOPPanel().showErrorPanel("su petici�n esta siendo procesada, un momento por favor..." );
			else
			{				
//				Boolean lcontinue = true;
//				poppanel.setIsChangePrice(false);				
//				if (getPOPPanel().getConfig().getbool(MachineCreator.ismodifysopricelist))
//				{
//					if (ADialog.ask(m_WindowNo, this,"Actualizar precios en las listas de precio ?")	)
//					{
//						String error = poppanel.ChangePriceValid(); 
//						if (error.length() > 0)
//						{
//							if (ADialog.ask(m_WindowNo, this, error))
//							{
//								poppanel.setIsChangePrice(true);
//							}
//							else
//								lcontinue = false;								
//						}
//						else
//							poppanel.setIsChangePrice(true);							
//					}
//
//				}if (UpdateOrder() && lcontinue)
				if (UpdateOrder())				
				{
					bFinish.setEnabled(false);
					getPOPPanel().setStatusLine("Generando e imprimiendo...", false);
					String serial = (String) pickInvoiceSerial.getValue();
					if (serial == null)
						serial = "";
					getOrder().setSerialToInvoice(serial);
					String document = (String) pickInvoiceDocNumber.getValue();
					if (document == null)
						document = "";
					getOrder().setDocumentNoToInvoice(document);
					//String iodocnum = (String) pickInOutDocNumber.getValue();
					//if (iodocnum == null)
					//	iodocnum = "";
					//getOrder().setInOutDocNumber(iodocnum);
					this.setVisible(false);
					String error = process();
					bFinish.setEnabled(true);
					if (error.length() == 0)
					{
						Void();
					}
					else
					{
						bFinish.setEnabled(true);
					}
				}
			}
		}		
	}
	private void calculateFreight() {
		BigDecimal value = (BigDecimal) Freight.getValue();
		this.getPOPPanel().calculateFreight(value);
	}
	private Boolean UpdateOrder() {
		Boolean OrderIsReady = true;
		try {
			getPOPPanel().bPartner(pickPartner.getValue());
			if (getOrder().getDescription()!= null)
			{
				getOrder().setDescription("");
				getOrder().setDescription(fieldName.getText());
			}		
			if (pickDocType.getValue() != null)
			{
				KeyNamePair kp = (KeyNamePair) pickDocType.getValue();
				MDocType doctype = MDocType.get(Env.getCtx(), kp.getKey());
				if ( !MPeriod.isOpen(Env.getCtx(), Env.getContextAsDate(Env.getCtx(), "#Date"), doctype.getDocBaseType(), getOrder().getAD_Org_ID(), getOrder().getAD_Client_ID() ))		
				{
					throw new Exception(Msg.translate(Env.getCtx(), "PeriodNotValid"));					
				}			
				getOrder().setC_DocTypeTarget_ID(kp.getKey());
			}
			else
			{				
				log.log(Level.FINE, "invalid doc type");
				throw new Exception(Msg.translate(Env.getCtx(), "InvalidDocType"));
			}
			if ( getPartner() == 0 && ClientAlias.length() == 0 )
			{
				throw new Exception(Msg.translate(Env.getCtx(), "C_BPartner"));
			}
			if (fieldSalesRep.getValue()==null)
			{				
				throw new Exception(Msg.translate(Env.getCtx(), "SalesRep_ID"));
			}
			else
				getOrder().setSalesRep_ID((Integer) fieldSalesRep.getValue());

			if (pickPaymentTerm.getValue() == null)
			{				
				throw new Exception(Msg.translate(Env.getCtx(), "PaymentTermInvalid"));
			}
			else
			{
				int PaymentTermID = (Integer) pickPaymentTerm.getValue();
				MPaymentTerm pt = new MPaymentTerm(Env.getCtx(), PaymentTermID , null);
				if ( pt.getC_PaymentTerm_ID() == 0 )
					throw new Exception(Msg.translate(Env.getCtx(), "PaymentTermInvalid"));
				else
				{
					getOrder().setC_PaymentTerm_ID(PaymentTermID);			
					if (pt.isNextBusinessDay())			
						getOrder().setPaymentRule(REF__PaymentRule.Cash);
					else
						getOrder().setPaymentRule(REF__PaymentRule.OnCredit);
				}
			}
			// buscando si el documento existe
			String sql = " SELECT count(*) from c_invoice where Serial = ? AND DocumentNo = ? AND C_BPartner_ID = ? AND IsSOTrx = 'N' ";
			int no = DB.getSQLValue(null, sql, (String) pickInvoiceSerial.getValue(), (String) pickInvoiceDocNumber.getValue(),  getOrder().getC_BPartner_ID() );
			if ( no > 0 )
			{				
				throw new Exception(Msg.translate(Env.getCtx(), "C_Invoice_ID")+" ya existe");	
			}			
//			String iodoc = (String) pickInOutDocNumber.getValue(); 
//			if ( iodoc != null && iodoc.length() > 0)
//			{
//				sql = " SELECT count(*) from m_inout where DocumentNo = ? AND C_BPartner_ID = ? AND IsSOTrx = 'N' ";
//				no = DB.getSQLValue(null, sql, (String) iodoc, getOrder().getC_BPartner_ID() );
//				if ( no > 0 )
//				{					
//					throw new Exception(Msg.translate(Env.getCtx(), "M_InOut_ID")+" ya existe");			
//				}
//			}
			if (pickInvoiceSerial.getValue().toString().length() == 0)
			{
				pickInvoiceSerial.setMandatory(true);
				pickInvoiceSerial.requestFocus();
				throw new Exception("serie no puede quedar en blanco");
			}
			else if (pickInvoiceDocNumber.getValue().toString().length() == 0)
			{
				pickInvoiceDocNumber.setMandatory(true);
				pickInvoiceDocNumber.requestFocus();
				throw new Exception("documento no puede quedar en blanco");
			}
		}
		catch (Exception e)
		{
			OrderIsReady = false;			
			getPOPPanel().showErrorPanel(Msg.translate(Env.getCtx(), e.getMessage()));
		}
		return OrderIsReady;
	}

	private Integer getPartner() {

		Integer C_Bpartner_ID = 0;
		if (fieldName.getValue().toString().length() > 0) // no Business Partner - Business Partner by default
			ClientAlias  = (String) fieldName.getValue();

		C_Bpartner_ID = getOrder().getC_BPartner_ID();

		return C_Bpartner_ID;
	}

	private String process() {
		String error = "";
		if (pickDateOrdered.getValue() != null)
		{
			Timestamp dordered = (Timestamp) pickDateOrdered.getValue();
			getOrder().setDateOrdered( dordered );
		}
		if (pickDateAcct.getValue() != null)
			getOrder().setDateAcct( (Timestamp) pickDateAcct.getValue() );		
		if (pickPaymentTerm.getValue() != null)
			getOrder().setC_PaymentTerm_ID((Integer) pickPaymentTerm.getValue());			
		if (pickBPartnerLocation.getValue() != null)
			getOrder().setC_BPartner_Location_ID((Integer) pickBPartnerLocation.getValue());			
		//if (pickWarehouse.getValue() != null)
		//	getOrder().setM_Warehouse_ID((Integer) pickWarehouse.getValue());		
		if (pickDateInvoice.getValue() != null)
			getOrder().setDateInvoiced((Timestamp)pickDateInvoice.getValue());
		//if (pickDateInOut.getValue() != null)
		//	getOrder().setDateInOut((Timestamp) pickDateInOut.getValue());
		if (pickDatePromised.getValue() != null)
			getOrder().setDatePromised((Timestamp) pickDatePromised.getValue());
		error = poppanel.process();
		return error;
	}
	private void hideform() {
		getPOPPanel().enableEnvironment();
		setVisible(false);		
	}
	public PopPanel getPOPPanel()
	{
		return poppanel;
	}
	public void Void() {
		this.pickPartner.setValue(null);
		this.pickBPartnerLocation.setValue(null);
		Freight.setValue(Env.ZERO);
		this.pickDocType.setValue(null);
		//this.pickInOutDocNumber.setValue(null);
		this.pickInvoiceSerial.setValue(null);
		this.pickInvoiceDocNumber.setValue(null);
		this.pickPaymentTerm.setValue(null);
	}
}
