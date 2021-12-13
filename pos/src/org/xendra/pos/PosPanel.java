/******************************************************************************
 * Copyright (C) 2007-2010 Dravio SAC. All Rights Reserved.           		  *
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
package org.xendra.pos;

import net.javaprog.ui.wizard.DataModel;
import net.miginfocom.swing.MigLayout;

import org.compiere.Xendra;
import org.compiere.apps.ADialog;
import org.compiere.apps.AEnv;
import org.compiere.apps.ALayout;
import org.compiere.apps.ALayoutConstraint;
import org.compiere.apps.ALogin;
import org.compiere.apps.AppsAction;
import org.compiere.apps.Waiting;
import org.compiere.apps.form.FormFrame;
import org.compiere.apps.form.FormPanel;
import org.compiere.apps.search.Info;
import org.compiere.apps.search.InfoInvoice;
import org.compiere.apps.search.InfoOrder;
import org.compiere.apps.search.InfoProduct;
import org.compiere.db.CConnection;
import org.compiere.model.MAttributeSet;
import org.compiere.model.MAttributeSetInstance;
import org.compiere.model.MBPartner;
import org.compiere.model.MBPartnerLocation;
import org.compiere.model.MBankAccount;
import org.compiere.model.MCampaignBonus;
import org.compiere.model.MCampaignDiscount;
import org.compiere.model.MCashBook;
import org.compiere.model.MClient;
import org.compiere.model.MClientInfo;
import org.compiere.model.MCurrency;
import org.compiere.model.MDiscountSchema;
import org.compiere.model.MDocType;
import org.compiere.model.MInOut;
import org.compiere.model.MInvoice;
import org.compiere.model.MInvoiceLine;
import org.compiere.model.MLocation;
import org.compiere.model.MMessageFormat;
import org.compiere.model.MOrder;
import org.compiere.model.MOrderLine;
import org.compiere.model.MOrg;
import org.compiere.model.MOrgInfo;
import org.compiere.model.MPOS;
import org.compiere.model.MPOSLine;
import org.compiere.model.MPaymentTerm;
import org.compiere.model.MPriceList;
import org.compiere.model.MPrinterDocumentFormat;
import org.compiere.model.MProduct;
import org.compiere.model.MProductBonus;
import org.compiere.model.MQuery;
import org.compiere.model.MSession;
import org.compiere.model.MStorage;
import org.compiere.model.MTax;
import org.compiere.model.MTaxCategory;
import org.compiere.model.MUOM;
import org.compiere.model.MUOMConversion;
import org.compiere.model.MUser;
import org.compiere.model.MWarehouse;
import org.compiere.model.Machine;
import org.compiere.model.Obscure;
import org.compiere.model.PO;
import org.compiere.model.Query;
import org.compiere.model.Tax;
import org.compiere.model.persistence.X_AD_Client;
import org.compiere.model.persistence.X_AD_MessageFormat;
import org.compiere.model.persistence.X_AD_Org;
import org.compiere.model.persistence.X_AD_Rule;
import org.compiere.model.persistence.X_AD_User;
import org.compiere.model.persistence.X_A_Machine;
import org.compiere.model.persistence.X_A_MachinePrinter;
import org.compiere.model.persistence.X_A_MachineServer;
import org.compiere.model.persistence.X_A_Xendrian_Message;
import org.compiere.model.persistence.X_C_BPartner;
import org.compiere.model.persistence.X_C_BPartner_Location;
import org.compiere.model.persistence.X_C_BankAccount;
import org.compiere.model.persistence.X_C_CampaignBonus;
import org.compiere.model.persistence.X_C_CampaignDiscount;
import org.compiere.model.persistence.X_C_Cash;
import org.compiere.model.persistence.X_C_CashBook;
import org.compiere.model.persistence.X_C_Coupon;
import org.compiere.model.persistence.X_C_Currency;
import org.compiere.model.persistence.X_C_DocType;
import org.compiere.model.persistence.X_C_Invoice;
import org.compiere.model.persistence.X_C_InvoiceTax;
import org.compiere.model.persistence.X_C_Order;
import org.compiere.model.persistence.X_C_OrderLine;
import org.compiere.model.persistence.X_C_POS;
import org.compiere.model.persistence.X_C_POSDocType;
import org.compiere.model.persistence.X_C_Payment;
import org.compiere.model.persistence.X_C_PaymentTerm;
import org.compiere.model.persistence.X_C_PrinterFormat;
import org.compiere.model.persistence.X_C_Tax;
import org.compiere.model.persistence.X_C_TaxCategory;
import org.compiere.model.persistence.X_HR_WorkShift;
import org.compiere.model.persistence.X_M_AttributeSet;
import org.compiere.model.persistence.X_M_AttributeSetInstance;
import org.compiere.model.persistence.X_M_Product;
import org.compiere.model.persistence.X_M_Warehouse;
import org.compiere.model.reference.REF_AD_FieldObscureType;
import org.compiere.model.reference.REF_C_DocTypeSubType;
import org.compiere.model.reference.REF_C_OrderDeliveryRule;
import org.compiere.model.reference.REF_M_DiscountType;
import org.compiere.model.reference.REF_ServerType;
import org.compiere.process.DocAction;
import org.compiere.process.ProcessInfo;
import org.compiere.swing.CButton;
import org.compiere.swing.CFrame;
import org.compiere.swing.CLabel;
import org.compiere.swing.CMenuItem;
import org.compiere.swing.CPanel;
import org.compiere.util.CLogger;
import org.compiere.util.DB;
import org.compiere.util.DisplayType;
import org.compiere.util.Env;
import org.compiere.util.Ini;
import org.compiere.util.Msg;
import org.compiere.util.Splash;
import org.compiere.util.Trx;
import org.compiere.util.Util;
import org.compiere.util.ValueNamePair;
import org.hornetq.api.core.Message;
import org.hornetq.api.core.client.ClientSession;
import org.hornetq.api.core.client.SendAcknowledgementHandler;
import org.hornetq.jms.client.HornetQSession;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xendra.Constants;
import org.xendra.apps.form.DescriptionDialog;
import org.xendra.apps.form.VoidTransactionDialog;
import org.xendra.exceptions.XendraException;
import org.xendra.line.LineKeyAdapter;
import org.xendra.message.EmbeddedMessageServer;
import org.xendra.message.wizard.MessageWizardLauncher;
import org.xendra.objectview.*;
import org.xendra.rules.model.SimpleRule;
import org.xendra.swing.LED;
import org.xendra.swing.PriceListCtrl;
import org.xendra.util.KeyNameIdentifier;
import org.xendra.util.POUtil;
import org.xendra.common.ButtonPanel;
import org.xendra.common.ICardPanel;
import org.xendra.common.Point;
import org.xendra.common.PushButton;
import org.xendra.common.DialogAskPassword;
import org.xendra.common.DialogInputQty;
import org.xendra.common.ErrorPanel;
import org.xendra.wf.WorkflowUtils;
import org.xendra.xendrian.FormatMessage;
import org.kie.api.KieBase;
import org.kie.api.event.rule.DebugRuleRuntimeEventListener;
import org.kie.api.runtime.KieSession;
import org.kie.api.runtime.rule.FactHandle;
import org.mvel2.MVEL;
import org.mvel2.compiler.ExecutableStatement;
import org.mvel2.templates.TemplateRuntime;
import org.xendra.pos.cardcomponent.BonusPointsPanel;
import org.xendra.pos.cardcomponent.CardComponentPanel;
import org.xendra.pos.cardcomponent.CollectionPanel;
import org.xendra.pos.cardcomponent.CouponPanel;
import org.xendra.pos.cardcomponent.PartnerPanel;
import org.xendra.pos.cardcomponent.ShippingPanel;
import org.xendra.pos.cardcomponent.PayPanel;
import org.xendra.pos.cardcomponent.UserPanel;
import org.xendra.pos.components.DigitalClock;
import org.xendra.pos.cardcomponent.RenditionPanel;
import org.xendra.pos.reports.WorkerCredit;
import org.xendra.pos.rules.model.PolicyRequest;
import org.xendra.pos.util.DialogInputID;
import org.xendra.pos.wizard.MachineCreator;
import org.xendra.pos.wizard.POSWizardLauncher;
import org.xendra.printdocument.DataSource;
import org.xendra.printdocument.MVELParseFormat;
import org.xendra.printdocument.Pretty;
import org.xendra.printdocument.PrintConstants;
import org.xendra.printdocument.PrintDocument;
import org.xendra.printdocument.PrintWorker;
import org.xendra.printdocument.PrinterDocumentCtrl;
import org.xendra.printdocument.wizard.PrintServer;
import org.xendra.printdocument.wizard.PrintServerWizardLauncher;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.DefaultKeyboardFocusManager;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.KeyboardFocusManager;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.Map.Entry;

import javax.imageio.ImageIO;
import javax.jms.MessageProducer;
import javax.jms.Queue;
import javax.jms.QueueConnection;
import javax.jms.QueueConnectionFactory;
import javax.jms.QueueRequestor;
import javax.jms.QueueSession;
import javax.jms.Session;
import javax.jms.TextMessage;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.TableColumn;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.jdesktop.fuse.InjectedResource;
import org.jdesktop.fuse.ResourceInjector;
import org.jdesktop.fuse.swing.SwingModule;

public class PosPanel extends CFrame implements Point, Observer, FormPanel, ActionListener, SendAcknowledgementHandler { 

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					org.compiere.Xendra.startup(true);
					Splash splash = Splash.getSplash();
					ALogin login = new ALogin(splash);
					if (!login.initLogin()) // no automatic login
					{
						// Center the window
						try {
							AEnv.showCenterScreen(login); // HTML load errors
						} catch (Exception ex) {
							log.severe(ex.toString());							
						}
						if (!login.isConnected() || !login.isOKpressed())
							AEnv.exit(1);
					}
					PosPanel frame = new PosPanel();
					frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					AEnv.showCenterScreen(frame);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	private HashMap<String, Object> props = new HashMap();
	private static final long serialVersionUID = 1L;
	private HashMap<Integer, MMessageFormat> formats = new HashMap();
	private HashMap<String, AppsAction> AppsActions = new HashMap();	
	private HashMap<String, PushButton> PushButtons = new HashMap();
	private Map<String, PO> businessobjects = new HashMap();
	private HashMap<String, BufferedImage> BufferedImages = new HashMap();
	private HashMap<String, BigDecimal> amounts = new HashMap();
	private HashMap<Integer, BigDecimal> baseamounts = new HashMap();
	private HashMap<Integer, BigDecimal> taxamounts = new HashMap();
	private HashMap<String, List> observers = new HashMap();
	private HashMap<String, String> boagenda = new HashMap();
	private CButton bCashBased;	 
	private PaymentPOS m_payment = new PaymentPOS();
	private FormFrame m_Frame;
	private CPanel topPanel = new CPanel();
	private CPanel bottomPanel = new CPanel();
	private CPanel TotalsPanel = new CPanel();
	public String PaymentTerm = "";
	private String zero = "0.00";
	private GridBagLayout BottomLayout = new GridBagLayout();
	private GridBagLayout TotalsLayout = new GridBagLayout();
	public static Insets s_insets = new Insets(5, 5, 5, 5);
	@InjectedResource
	private Font pospriceFont;
	@InjectedResource
	private Font posgridFont;
	private String DocVoid = Msg.translate(Env.getCtx(), "Voided");
	boolean m_delegate = false;
	boolean m_addproduct = false;
	private MPOS config = null;
	DefaultObjectViewModel m_model = null;
	ObjectView view = null;
	Row m_row = null;
	// keyboard stuff
	DefaultKeyboardFocusManager actualFocusManager = null;
	KeyboardFocusManager originalFocusManager = null;
	private CPanel salespanel = new CPanel();
	private CLabel DocumentNo = new CLabel();
	private CLabel lPriceList = new CLabel();
	//private VComboBox pickPriceListVersion = new VComboBox();
	private JSplitPane infoPanel = new JSplitPane();
	private ButtonPanel buttonPanel = new ButtonPanel();
	private HashMap<String, CardComponentPanel> CardPanels = new HashMap();
	private UserPanel userpanel;
	private CollectionPanel collectionpanel;
	private ErrorPanel errorpanel;
	private RenditionPanel renditionpanel;
	private BonusPointsPanel bonuspointpanel;
	private ShippingPanel shippingpanel;
	private CouponPanel couponpanel;
	private JScrollPane scrollPane = null;
	private JScrollPane scroll_Products;
	private CLabel infosearch = new CLabel();
	private JLabel infogridbottom = new JLabel();
	private static final CLogger log = CLogger.getCLogger(PosPanel.class);
	private static final String buttonpanel = "buttonpanel";
	private static final String collection = "collection";
	private static final String coupon = "coupon";
	private static final String partner = "partner";
	private static final String rendition = "rendition";
	private static final String bonus = "bonus";
	private static final String pay = "paypanel";
	private static final String panelerror = "errorpanel";
	private static final int BUTTONPANELSTATE = 0;
	private static final int CARDPANELSTATE = 1;
	private int panelstate;
	private HashMap<Integer, Integer> margin = new HashMap<Integer, Integer>();
	int m_WindowNo;
	PosPanel m_Panel = this;
	private StatusBar statusBar = new StatusBar();
	private String mTextToFind = "";
	private JLabel BPartnerInfo = new JLabel("Info");
	private JLabel labelTotalAmount = new JLabel("0.00");
	private JLabel labelDiscountAmount = new JLabel("0.00");
	private CLabel labelNetAmount = new CLabel("0.00");
	private CLabel lconexion = new CLabel("");
	private CPanel GridPanel = new CPanel();
	private BorderLayout GridLayout = new BorderLayout();
	Vector<Vector<Object>> columnsPOS = new Vector<Vector<Object>>();
	private String m_password;
	private boolean m_OverWritePriceLimit;
	private boolean m_OverWritePriceList;
	private boolean m_CanDelete;
	private boolean m_CanVoid;
	private boolean m_CanExit;
	private boolean m_IsFromVoided;
	private boolean m_BlockPriceList = false;
	//private String m_SupervisorPassword;
	private Integer C_DocTypeTargetID = 0;
	private int m_rowcount = 0;
	private BigDecimal m_QtyByDefault = Env.ZERO;
	private BigDecimal m_QtyBySelection = Env.ZERO;
	private String error = "";
	private String info = null;
	private String DocNumber = "";
	private List<X_C_Coupon> m_Coupons = new ArrayList<X_C_Coupon>();
	private Waiting m_waiting;	
	private boolean m_showdialoginfo = true;
	private int m_StartCodeBalance;
	private int m_EndCodeBalance;
	private int m_StartWeightBalance;
	private int m_EndWeightBalance;
	private boolean m_IsBalance;
	//private boolean m_IsSearchAtBegin;
	private BigDecimal m_BP_PaidTo3party = Env.ZERO;
	private Boolean m_IsPaidTo3party = true;

	private LineKeyAdapter lkaPointOfSales;

	ArrayList<Object[]> campaignbonus = new ArrayList<Object[]>();
	ArrayList<Object[]> campaigndiscount = new ArrayList<Object[]>();
	private boolean m_IsAllowCampaign = false;
	private Boolean m_DefaultIsTaxIncluded = false;
	private Boolean m_DefaultEnforcePriceLimit = false;
	private List<PrintWorker> lpw = new ArrayList<PrintWorker>();
	private Queue queue;	
	private ArrayList<Object[]> m_SendWithoutACK = new ArrayList<Object[]>();
	private ClientSession coreSession;
	private Integer AD_Client_ID = Env.getAD_Client_ID(Env.getCtx());
	private Integer AD_Org_ID = Env.getAD_Org_ID(Env.getCtx());
	private LED ledJMSServer = new LED();
	public CMenuItem mBarAdd = new CMenuItem();
	public CMenuItem mBarMoreInfo = new CMenuItem();
	public JPopupMenu popMenuBar = new JPopupMenu();
	private LabelTop m_topSelected = null;
	private DecimalFormat formatamount = DisplayType.getNumberFormat(DisplayType.Amount);	
	private Map<String, String> documents = new HashMap<String, String>(); 
	private HashMap<String, FactHandle> FactHandlers = new HashMap();
	private HashMap<String, JButton> toolbarbuttons = new HashMap();
	private List m_lostSales = new ArrayList<Vector>();
	private Header h = new Header();
	private Footer footer = new Footer();
	SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
	private String SerialToInvoice = "";
	private String InvoiceDocumentNo = "";	
	private List<Row> lines = new ArrayList<Row>();
	private JPanel cardPanel;
	private String m_usename = "";
	private String m_posname = "";
	private localvars m_session = new localvars();
	private KieSession ksession;
	private MCashBook m_cashbook;
	private double currentwidth;
	private double buttonspanelwidth;
	private double cardpanelwidth;
	private String m_AdjustType;
	private PriceListCtrl salespricelist = new PriceListCtrl(true);
	private KeyNameIdentifier workshift = new KeyNameIdentifier(0, "N/A", "");
	private JLabel currentworkshift = new JLabel();	

	public PosPanel() {

	}

	public void UpsertFact(String key, Object rule) {
		if (FactHandlers.containsKey(key))
		{
			boolean found = false;
			FactHandle fhmap = FactHandlers.get(key);
			Iterator it = ksession.getFactHandles().iterator();
			while (it.hasNext()) {
				FactHandle fhcurrent = (FactHandle) it.next();
				if (fhcurrent.equals(fhmap)) {					
					ksession.update(fhcurrent, rule);
					FactHandlers.put(key, fhcurrent);
					found = true;
					break;
				}				
			}			
			if (!found) {
				FactHandle fh = ksession.insert(rule);
				FactHandlers.put(key, fh);				
			}
		}
		else
		{
			FactHandle fh = ksession.insert(rule);
			FactHandlers.put(key, fh);
		}		
	}

	public KieSession getksession()
	{
		return ksession;
	}
	public void setPartnerInfo(String info)
	{
		BPartnerInfo.setText(info);
	}

	public String getDocNumber() {
		return DocNumber;
	}
	public void setDocNumber(String docnumber) {
		DocNumber = docnumber;
	}

	public Timestamp getDateOrdered() {
		return getOrder().getDateOrdered();
	}

	public void setDateOrdered(Timestamp dateordered) {
		getOrder().setDateOrdered(dateordered);
	}

	public String getError() {
		return error;
	}

	public void setError(String merror) {
		error = merror;
	}

	public String getInfo() {
		if (info == null)
			info = "";
		return info;
	}

	public void setInfo(String minfo) {
		info = minfo;
	}

	public void setCreditOff() {
		PushButtons.get(Constants.A_CREDIT).setEnabled(false);
	}

	public void setCreditOn() {
		PushButtons.get(Constants.A_CREDIT).setEnabled(true);
	}

	public int getRowCount() {
		return m_rowcount;
	}

	public Integer getC_DocTypeTargetID() {
		return C_DocTypeTargetID;
	}

	public void setC_DocTypeTargetID(Integer cDocTypeTargetID) {
		C_DocTypeTargetID = cDocTypeTargetID;
	}

	public String getM_password() {
		return m_password;
	}

	public void setM_password(String mPassword) {
		m_password = mPassword;
	}

	private String TestQueue() {
		X_A_Machine message = null;
		HashMap p = Env.getMachine().getProperties();
		if (p.containsKey(REF_ServerType.MessageServer)) {
			String id = (String) p.get(REF_ServerType.MessageServer);
			X_A_MachineServer ms = new Query(Env.getCtx(), X_A_MachineServer.Table_Name, "A_MachineServer_ID = ?", null)
			.setParameters(Integer.valueOf(id)).first();
			if (ms != null) {
				if (ms.getProperties().containsKey(X_A_Machine.COLUMNNAME_A_Machine_ID)) {
					String mid = (String) ms.getProperties().get(X_A_Machine.COLUMNNAME_A_Machine_ID);
					X_A_Machine m = new Query(Env.getCtx(), X_A_Machine.Table_Name, "A_Machine_ID = ?", null)
					.setParameters(Integer.valueOf(mid)).first();
					message = m;
				}
			}
		}
		if (message == null) {
			error = launchWizardMessage();			
		}
		else
		{
			error = EmbeddedMessageServer.getInstance().Test(message.getName(), Constants.QPOSQUEUE);
			if (error.length() > 0)
			{
				error = launchWizardMessage();
			}
		}
		return error;
	}

	private String launchWizardMessage() {
		String error = "";
		X_A_Machine message = Env.getMessageHost();
		MessageWizardLauncher nn = new MessageWizardLauncher();
		nn.launchWizard();
		DataModel dm = nn.getDataModel();
		PrintServer ps = (PrintServer) dm.getData(PrintConstants.PrintServer);	
		if (ps == null)				
			error = "no existe servidor de mensaje disponible";
		else
		{
			error = EmbeddedMessageServer.getInstance().Test(ps.getName(), Constants.QPOSQUEUE);
			if (error.length() == 0)
			{
				message = new Query(Env.getCtx(), X_A_Machine.Table_Name, "A_Machine_ID = ?", null)
				.setParameters(ps.getA_Machine_ID()).first();
				Env.setMessageHost(message);
			}
		}		
		if (Env.getMessageHost() != null) {
			try {
				String query = String.format("servertype = ? AND properties->'%s'  = ?", X_A_Machine.COLUMNNAME_A_Machine_ID); 
				X_A_MachineServer ms = new Query(Env.getCtx(), X_A_MachineServer.Table_Name, query, null)
				.setParameters(REF_ServerType.MessageServer, String.valueOf(Env.getMessageHost().getA_Machine_ID())).first();
				if (ms == null) {
					if (Env.getMessageHost() != null)
						throw new Exception(String.format("no existe definicion del MessageServer %s", Env.getMessageHost().getName()));
					else 
						throw new Exception(String.format("no existe definicion de MessageServer"));
				}
				HashMap p = Env.getMachine().getProperties();
				p.put(REF_ServerType.MessageServer, String.valueOf(ms.getA_MachineServer_ID()));
				Env.getMachine().setProperties(p);
				Env.getMachine().save();
			} catch (Exception e) {
				error = e.getMessage();
			}
		}
		return error;
	}

	private DataModel LaunchPSWizard() {
		PrintServerWizardLauncher nn = new PrintServerWizardLauncher();
		nn.setMacAddress(Util.getLocalMacAddress());
		nn.setModel(config);
		nn.launchWizard();
		return nn.getDataModel();
	}

	public MPOS getConfig()
	{	
		if (config != null)
			return config;
		Machine machine = Env.getMachine();
		MPOS config = null;				
		try {
			Integer C_POS_ID = machine.getIntProperty(X_C_POS.COLUMNNAME_C_POS_ID);
			if (C_POS_ID == 0)
			{
				POSWizardLauncher nn = new POSWizardLauncher();	
				nn.launchWizard();
				DataModel dm = nn.getDataModel();
				PO po = (PO) dm.getData(Constants.Model);
				if (po == null)
					throw new Exception("No se definio la caja asignada");				
				C_POS_ID = po.get_ID();
			}
			MSession sesion = MSession.get (Env.getCtx(), false);			
			config = new Query(Env.getCtx(),X_C_POS.Table_Name, "C_POS_ID = ? AND AD_Org_ID = ?", null)
			.setParameters(C_POS_ID, Env.getAD_Org_ID(Env.getCtx())).first();
			if (config == null)
				throw new Exception("Configuracion no existe para el  asignado.");
		}
		catch (Exception e)
		{
			e.printStackTrace();
			error = e.getMessage();
			return null;			
		}
		MOrg org = MOrg.get(Env.getCtx(), Env.getAD_Org_ID(Env.getCtx()));
		Integer M_Warehouse_ID = Env.getContextAsInt(Env.getCtx(), "#M_Warehouse_ID");

		if (M_Warehouse_ID.compareTo(config.getM_Warehouse_ID()) != 0 )
		{			
			Env.setContext(Env.getCtx(), "#M_Warehouse_ID", config.getM_Warehouse_ID());
		}
		if (error.length() > 0) {
			ADialog.error(m_WindowNo, null, "PosError",  error);
			return null;
		}			
		return config;
	}

	public String initialize() {
		try {
			config = getConfig();
			if (config == null) {
				throw new Exception(error);
			}
			MOrgInfo orginfo = MOrgInfo.get(Env.getCtx(), Env.getAD_Org_ID(Env.getCtx()));
			Integer C_BPartner_ID = orginfo.getC_BPartner_ID();
			if (C_BPartner_ID.equals(0)) {
				error = "Es necesario definir el socio de Negocio que representa la organización en Informacion de Negocio";
				throw new Exception(error);
			}			
			MBPartner partner = MBPartner.get(Env.getCtx(), C_BPartner_ID);
			setPOSName(config.getName());			
			props.put(MachineCreator.iscredit, config.getbool(MachineCreator.iscredit));
			props.put(MachineCreator.iscash, config.getbool(MachineCreator.iscash));
			props.put(MachineCreator.iscoupon,config.getbool(MachineCreator.iscoupon));
			props.put(MachineCreator.ispartial, config.getbool(MachineCreator.ispartial));
			props.put(MachineCreator.ispayment, config.getbool(MachineCreator.ispayment));
			props.put(MachineCreator.isBonusPoints, config.getbool(MachineCreator.isBonusPoints));
			props.put(MachineCreator.isGlobalDiscount, config.getbool(MachineCreator.isGlobalDiscount));
			props.put(MachineCreator.ismodifyPriceList, config.getbool(MachineCreator.ismodifyPriceList));
			props.put(MachineCreator.ismodifyprice, config.getbool(MachineCreator.ismodifyprice));
			//setOverwritePriceLimit(config.getbool(MachineCreator.overwritepricelimit));
			setOverWritePriceList(config.getbool(MachineCreator.overwritepricelist));
			setIsCanDelete(config.getbool(MachineCreator.iscandelete));
			setIsCanVoid(config.getbool(MachineCreator.iscanvoid));
			//setPassword(config.getPassword());
			error = TestQueue();
			if (error.length() > 0) {
				throw new Exception(error);
			}
			infoPanel.addPropertyChangeListener(JSplitPane.DIVIDER_LOCATION_PROPERTY, 
					new PropertyChangeListener() {
				@Override
				public void propertyChange(PropertyChangeEvent pce) {
					int width = (int) pce.getNewValue();
					if (panelstate == BUTTONPANELSTATE) {
						if (margin.containsKey(BUTTONPANELSTATE)) {}
						margin.put(BUTTONPANELSTATE, width);
					}
					else if (panelstate == CARDPANELSTATE) {
						if (margin.containsKey(CARDPANELSTATE))
							margin.put(CARDPANELSTATE, width);
					}							
				}

			});			
			X_A_Machine machine = null;
			HashMap p = Env.getMachine().getProperties();
			if (p.containsKey(REF_ServerType.MessageServer)) {
				String id = (String) p.get(REF_ServerType.MessageServer);
				X_A_MachineServer ms = new Query(Env.getCtx(), X_A_MachineServer.Table_Name, "A_MachineServer_ID = ?", null)
				.setParameters(Integer.valueOf(id)).first();
				if (ms != null) {
					if (ms.getProperties().containsKey(X_A_Machine.COLUMNNAME_A_Machine_ID)) {
						String mid = (String) ms.getProperties().get(X_A_Machine.COLUMNNAME_A_Machine_ID);
						X_A_Machine m = new Query(Env.getCtx(), X_A_Machine.Table_Name, "A_Machine_ID = ?", null)
						.setParameters(Integer.valueOf(mid)).first();
						machine = m;
					}
				}
			} else {

			}				
			lconexion.setText(String.format("jnp://%s:%s", machine.getName(), Util.getAppsPort()));
			lconexion.addMouseListener(new MouseAdapter()  
			{  
				public void mouseClicked(MouseEvent e)  
				{  
					if (requestAuthorization(config.getWizardPassword()))
					{
						//String host = "";
						error = "";
						PrintServer ps = null;
						MessageWizardLauncher nn = new MessageWizardLauncher();
						nn.launchWizard();
						if (nn.isOk())
						{
							DataModel dm = nn.getDataModel();				
							ps = (PrintServer) dm.getData(PrintConstants.PrintServer);
						}
						if (ps == null)				
							error = "no existe servidor de mensaje disponible";
						else
						{
							error = EmbeddedMessageServer.getInstance().Test(ps.getName(), Constants.QPOSQUEUE);
							if (error.length() == 0)
							{
								X_A_Machine machine = new Query(Env.getCtx(), X_A_Machine.Table_Name,"A_Machine_ID = ?", null)
								.setParameters(ps.getA_Machine_ID()).first();
								Env.setMessageHost(machine);
							}
						}
					}
				}  
			}); 			
			m_IsBalance = config.getbool(MachineCreator.isBalance);
			//m_IsSearchAtBegin = config.getbool(MachineCreator.isSearchAtBegin);
			if (m_IsBalance) {
				m_StartCodeBalance = config.getint(MachineCreator.startcodebalance);
				m_EndCodeBalance = config.getint(MachineCreator.endcodebalance);
				m_StartWeightBalance = config.getint(MachineCreator.startweightbalance);
				m_EndWeightBalance = config.getint(MachineCreator.endweightbalance);
				if (m_StartCodeBalance >= m_EndCodeBalance
						|| m_StartWeightBalance >= m_EndWeightBalance
						|| m_EndCodeBalance <= 0 || m_EndWeightBalance <= 0) {
					error = "Este POS utiliza balance pero los rangos para codigo y peso no son correctos, comuniquese con el supervisor";
					throw new Exception(error);
				}
			}
			m_rowcount = 0;
			m_QtyByDefault = config.getQtyEntered();
			double decimals = m_QtyByDefault.doubleValue() % 1;
			if (decimals > 0)
				m_QtyByDefault = m_QtyByDefault.setScale(2,	BigDecimal.ROUND_HALF_UP);
			else
				m_QtyByDefault = m_QtyByDefault.setScale(0, BigDecimal.ROUND_HALF_UP);
			m_Coupons = new ArrayList<X_C_Coupon>();
			PolicyRequest.getInstance().setWindowNo(m_WindowNo);
			error = startknowledge();
			if (error.length() > 0)
				throw new Exception(error);
			currentworkshift.setText(String.format("Machine: %s USER: %s TURNO: %s", config.getName() , getUser().getName(), getWorkShift().getName()));
			resetPriceList();
		} catch (Exception e) {
			e.printStackTrace();
			error = e.getMessage();
		}
		return error;
	}
	private String startknowledge()
	{		
		if (config.getAD_Rule_ID() > 0)
		{
			X_AD_Rule startrule = new Query(Env.getCtx(), X_AD_Rule.Table_Name, "AD_Rule_ID = ?", null).setParameters(config.getAD_Rule_ID()).first();
			if (startrule == null)
			{
				error = "Main Rule not found";
			}
			else
			{
				KieBase kb = Env.startRule(config.getAD_Rule_ID());
				if (kb != null)
				{
					ksession = kb.newKieSession();
					ksession.addEventListener(new DebugRuleRuntimeEventListener());					
					ksession.setGlobal("ctx", Env.getCtx());										
					//Env.startDT(kb, new File("/home/americas/projects/drools/test.xls"));
					InitializePO();
					UpsertFact("POS", this);
					//ksession.insert(this);
				}
				else
				{
					error = Env.getKieError(config.getAD_Rule_ID());
				}
			}
		}
		else
		{
			error = "no se definio que regla usar";
		}
		return error;
	}
	private void InitializePO()
	{
		String entrypoint = Env.getSessionEntrypoints(config.getAD_Rule_ID());
		String agenda = Env.getAgenda(config.getAD_Rule_ID());
		updatePO(config, "init");
		executerules(entrypoint, agenda);								
		updatePO(new MOrder(Env.getCtx(), 0, null), "order");
		executerules(entrypoint, "order");
		//MClient client = MClient.get(Env.getCtx());
		MClientInfo ci = MClientInfo.get(Env.getCtx());
		MBPartner partner = new Query(Env.getCtx(), X_C_BPartner.Table_Name, "C_BPartner_ID = ? ", null).setParameters(ci.getC_BPartnerCashTrx_ID()).first();		
		//updatePO(MBPartner.get(Env.getCtx(), config.getDefault_C_BPartner_ID()), "partner");
		updatePO(partner, "partner");
		executerules(entrypoint, "partner");
		updatePO(MUser.get(Env.getCtx(), Env.getAD_User_ID(Env.getCtx())), "user");
		executerules(entrypoint, "user");
	}

	public PO getPO(String poname) {
		PO retval = null;
		if (businessobjects.containsKey(poname))
			retval = businessobjects.get(poname);
		return retval;
	}

	private void updatePO(PO po, String agenda) {
		businessobjects.put(po.get_TableName(), po);
		List<String> panels = this.getObservers(po.get_TableName());
		for (String panel:panels)
		{
			po.addObserver(CardPanels.get(panel));
		}		
		po.addObserver(this);
		if (!boagenda.containsKey(po.get_TableName()))			
			boagenda.put(po.get_TableName(),agenda);
		UpsertFact(po.get_TableName(), po);
		//FactHandle fh = getFact(po.get_TableName());
		//if (fh != null) {
		//	ksession.update(fh, po);
		//} else {
		//	setFact(po.get_TableName(), fh);
		//}
		//if (FactHandlers.containsKey(po.get_TableName()))
		//{
		//	FactHandle fh = FactHandlers.get(po.get_TableName());
		//	ksession.update(fh, po);
		//}
		//else
		//{
		//	FactHandle fh = ksession.insert(po);
		//	FactHandlers.put(po.get_TableName(), fh);
		//}		
	}
	private void registerObserver(String tableName, String CardName) {
		List<String> panels = observers.get(tableName);
		if (panels == null)
		{
			panels = new ArrayList<String>();
		}
		if (!panels.contains(CardName))
			panels.add(CardName);			
		observers.put(tableName, panels);
	}
	private List<String> getObservers(String tableName)
	{
		List<String> panels = observers.get(tableName);
		if (panels == null)
			panels = new ArrayList<String>();
		return panels;
	}

	private void reset() {
		InitializePO();
		CardLayout cl = (CardLayout) (cardPanel.getLayout());
		cl.show(cardPanel, buttonpanel);
		enableEnvironment();
		cleanlines();
		NewLine(null);
		resetSequence();
		resetPayment();
		resetPriceList();		
	}

//	private void setPassword(String password) {
//		m_SupervisorPassword = password;
//	}
//
//	private String getPassword() {
//		if (m_SupervisorPassword == null)
//			return "";
//		return m_SupervisorPassword;
//	}

	private void setIsCanDelete(boolean canDelete) {
		m_CanDelete = canDelete;
	}

	private void setIsCanVoid(boolean canVoid) {
		m_CanVoid = canVoid;
	}

	public boolean DeleteRow() {
		Boolean lok = false;
		Row SelectedRow = (Row) view.getSelectedRowObject();
		if (!SelectedRow.IsBonus()) {
			if (IsCanDelete()) {
				if (m_IsAllowCampaign)
					RemoveCampaign(SelectedRow);
				if (SelectedRow.getRef_AttributeSetInstance_ID() > 0) {
					MAttributeSetInstance asi = new MAttributeSetInstance(
							Env.getCtx(),
							SelectedRow.getM_AttributeSetInstance_ID(), null);
					if (asi.getM_AttributeSetInstance_ID() > 0) {
						asi.setIsActive(false);
						if (!asi.save())
							return false;
					}
				}
				Row[] rowchilds = SelectedRow.getChilds();
				for (Row child : rowchilds) {
					((DefaultObjectViewModel) view.getDataModel())
					.removeRow(child);
				}
				((DefaultObjectViewModel) view.getDataModel())
				.removeRow(SelectedRow);
				//save.setEnabled(hasValidLines());
				toolbarbuttons.get(Constants.T_SAVE).setEnabled(hasValidLines());
				lok = true;
			}
		}
		return lok;
	}

	private Boolean hasValidLines() {
		Boolean hasvalidLines = false;
		ObjectViewModel adapter = view.getDataModel();
		for (int j = 0; j < adapter.getRowCount(); j++) {
			Row row = (Row) adapter.getRowObject(j);
			if (row.getM_Product_ID() > 0) {
				hasvalidLines = true;
				break;
			}
		}
		return hasvalidLines;
	}
	
	public boolean IsCanDelete() {
		boolean ok = true;
		if (!m_CanDelete) {			
			if (config.getDeletePassword().length() > 0)
			{
				DialogAskPassword dialog = new DialogAskPassword(getFrame(),
						config.getDeletePassword());
				dialog.pack();
				dialog.setLocationRelativeTo(getFrame());
				dialog.setVisible(true);
				ok = dialog.getPasswordOk();
				if (!ok)
					ADialog.error(m_WindowNo, this, "AccessCannotReport");
			}
		} 
		return ok;
	}

	private boolean IsCanVoid() {
		if (!m_CanVoid) {
			return requestAuthorization(config.getVoidPassword());
		} else
			return true;
	}

	//public boolean requestAuthorization() {
	//	return requestAuthorization(getPassword());
	//}

	public boolean requestAuthorization(String password) {
		DialogAskPassword dialog = new DialogAskPassword(getFrame(), password);
		dialog.pack();
		dialog.setLocationRelativeTo(getFrame());
		dialog.setVisible(true);
		return dialog.getPasswordOk();
	}

	public boolean IsPriceListOk() {
		if (getOrder().getM_PriceList_ID() == 0) {
			// getOrder().setM_PriceList_ID( m_DefaultPriceList );
			// getOrder().setM_PriceList_ID( M_PriceList_ID );
			// getOrder().setM_PriceList_Version_ID(m_DefaultPriceListVersion_ID);
		}
		if (getOrder().getM_PriceList_ID() == 0) {
			if (m_showdialoginfo)
				//ADialog.info(m_WindowNo, getFrame(), );
				showErrorPanel(Msg.translate(Env.getCtx(), "PriceListVersion"));
			return false;
		}
		return true;
	}

	private void setOverWritePriceList(boolean overWritePriceList) {
		m_OverWritePriceList = overWritePriceList;
	}

	private boolean IsOverWritePriceList() {
		return m_OverWritePriceList;
	}

	private MMessageFormat getMessage() {
		MDocType dt = MDocType.get(Env.getCtx(), getOrder().getC_DocTypeTarget_ID());
		if (!formats.containsKey(dt.getAD_MessageFormat_ID())) {
			MMessageFormat format = new Query(Env.getCtx(), X_AD_MessageFormat.Table_Name, "AD_MessageFormat_ID = ?", null)
			.setParameters(dt.getAD_MessageFormat_ID()).first();
			if (format != null) {
				formats.put(dt.getAD_MessageFormat_ID(), format); 						
			}									
		}
		MMessageFormat format = formats.get(dt.getAD_MessageFormat_ID());
		return format;		
	}

	public void datasource() {
		DataSource.clear("pos");
		MClient c = MClient.get(Env.getCtx(), Env.getAD_Client_ID(Env.getCtx()));
		MOrg o = MOrg.get(Env.getCtx(), Env.getAD_Org_ID(Env.getCtx()));
		MCurrency currency = MCurrency.get(Env.getCtx(), getOrder().getC_Currency_ID());
		String AmountInText = Msg.getAmtInWords(Env.getLanguage(Env.getCtx()), amounts.get(Constants.A_TOTALNET).toString()).concat(" ").concat(currency.getDescription());
		MUser u = MUser.get(Env.getCtx(), Env.getAD_User_ID(Env.getCtx()));
		MUser sr = MUser.get(Env.getCtx(), getOrder().getSalesRep_ID());		
		MPaymentTerm pt = new MPaymentTerm(Env.getCtx(), getOrder().getC_PaymentTerm_ID(), null);
		MPriceList pl = MPriceList.get(Env.getCtx(), getOrder().getM_PriceList_ID(), null);
		MWarehouse wh = MWarehouse.get(Env.getCtx(), getOrder().getM_Warehouse_ID());
		X_C_BPartner_Location bl = new Query(Env.getCtx(), X_C_BPartner_Location.Table_Name, "C_BPartner_Location_ID = ?", null)
		.setParameters(getOrder().getC_BPartner_Location_ID()).first();				
		String TaxID = MBPartner.get(Env.getCtx(), getOrder().getC_BPartner_ID()).getTaxID();
		if (TaxID == null)
			TaxID = "";		
		MBPartner p = MBPartner.get(Env.getCtx(), getOrder().getC_BPartner_ID());
		MBPartner paypatner = MBPartner.get(Env.getCtx(), getOrder().getPay_BPartner_ID());
		if (paypatner == null) {
			paypatner = new MBPartner(Env.getCtx(), 0, null);
		}
		MBPartner billpatner = MBPartner.get(Env.getCtx(), getOrder().getBill_BPartner_ID());
		MBPartnerLocation billlocation = new Query(Env.getCtx(), MBPartnerLocation.Table_Name, "C_BPartner_Location_ID = ?", null)
		.setParameters(getOrder().getBill_Location_ID()).first();
		MUser billuser = MUser.get(Env.getCtx(), getOrder().getBill_User_ID());
		//
		MDocType dt = MDocType.get(Env.getCtx(), getOrder().getC_DocTypeTarget_ID());
		if (SerialToInvoice.length() == 0 && InvoiceDocumentNo.length() == 0) {			
			X_C_POSDocType pdt = new Query(Env.getCtx(), X_C_POSDocType.Table_Name, "C_DocType_ID = ? AND C_POS_ID = ?", null)
			.setParameters(dt.getC_DocType_ID(), getConfig().getC_POS_ID()).first();
			Boolean isorder = pdt.getA_MachinePrinter_ID() > 0 && pdt.getC_PrinterDocumentFormat_ID() > 0;
			if (isorder) {											
				if (getDocNumber() != null)
					InvoiceDocumentNo = getDocNumber();
				if (InvoiceDocumentNo.length() == 0)
				{
					if (dt.getC_DocTypeInvoice_ID() > 0)
					{
						InvoiceDocumentNo = DB.getDocumentNo(dt.getC_DocTypeInvoice_ID(), null, false, null);
						SerialToInvoice = DB.getSQLValueString(	null,"SELECT s.Serial FROM C_DocType t, AD_Sequence s WHERE t.C_DocType_ID=? AND s.AD_Sequence_ID=t.DocNoSequence_ID",
								dt.getC_DocTypeInvoice_ID());
					}
					if (SerialToInvoice == null)
						SerialToInvoice = "";
				}
			}		
		}
		DataSource.set(X_C_Order.COLUMNNAME_SerialToInvoice, SerialToInvoice);
		DataSource.set(X_C_Order.COLUMNNAME_C_DocType_ID, new ValueNamePair(dt.getIdentifier(), dt.getName()));
		DataSource.set(X_C_Order.COLUMNNAME_C_DocTypeTarget_ID, new ValueNamePair(dt.getIdentifier(), dt.getName()));		
		DataSource.set(X_HR_WorkShift.COLUMNNAME_HR_WorkShift_ID, new ValueNamePair(getWorkShift().getIdentifier(), getWorkShift().getName()));
		DataSource.set(Constants.COLUMNNAME_AD_Client_ID, new ValueNamePair(c.getIdentifier(), c.getName()));		
		DataSource.set(Constants.COLUMNNAME_AD_Org_ID, new ValueNamePair(o.getIdentifier(), o.getName()));
		DataSource.set(Constants.COLUMNNAME_Created, new Timestamp(System.currentTimeMillis()));
		DataSource.set(X_C_Order.COLUMNNAME_DateOrdered, DataSource.get(Constants.COLUMNNAME_Created));
		DataSource.set(X_C_Order.COLUMNNAME_C_Currency_ID, new ValueNamePair(currency.getIdentifier(), currency.getISO_Code()));
		DataSource.set(X_C_POS.COLUMNNAME_MachineSerial, getConfig().getMachineSerial());
		ObjectViewModel adapter = view.getDataModel();
		for (int line=0;line < adapter.getRowCount(); line++)				
		{
			Row row = (Row) adapter.getRowObject(line);
			if (row.getM_Product_ID() == 0 && row.getQtyOrdered().compareTo(Env.ZERO) == 0) {
				continue;
			}			
			MAttributeSet mas = MAttributeSet.get(Env.getCtx(), row.getM_AttributeSet_ID(), null);
			X_M_AttributeSetInstance asi = new Query(Env.getCtx(), X_M_AttributeSetInstance.Table_Name, "M_AttributeSetInstance_ID = ?", null)
			.setParameters(row.getM_AttributeSetInstance_ID()).first();
			MTax tax = MTax.get(Env.getCtx(), row.getC_Tax_ID());
			MUOM uom = MUOM.get(Env.getCtx(), row.getC_UOM_ID());
			DataSource.setLine(X_C_OrderLine.COLUMNNAME_M_Product_ID, new ValueNamePair(row.getProduct().getValue(),row.getProduct().getName()));			
			DataSource.setLine(X_M_Product.COLUMNNAME_M_AttributeSet_ID, new ValueNamePair(mas.getIdentifier(), mas.getName()));
			DataSource.setLine(X_C_OrderLine.COLUMNNAME_PriceActual, row.getPriceActual());
			DataSource.setLine(X_C_OrderLine.COLUMNNAME_PriceList, row.getPriceList());
			DataSource.setLine(X_C_OrderLine.COLUMNNAME_PriceLimit, row.getPriceLimit());
			DataSource.setLine(X_C_OrderLine.COLUMNNAME_PriceEntered, row.getPriceEntered());
			DataSource.setLine(X_C_OrderLine.COLUMNNAME_QtyOrdered, row.getQtyOrdered());
			DataSource.setLine(X_C_OrderLine.COLUMNNAME_QtyEntered, row.getQtyEntered());
			DataSource.setLine(X_C_OrderLine.COLUMNNAME_PriceBase, row.getPriceBase());
			DataSource.setLine(X_C_OrderLine.COLUMNNAME_Discount, row.getDiscount());
			DataSource.setLine(X_C_OrderLine.COLUMNNAME_Discount1, row.getDiscount1());
			DataSource.setLine(X_C_OrderLine.COLUMNNAME_Discount2, row.getDiscount2());
			DataSource.setLine(X_C_OrderLine.COLUMNNAME_Discount3, row.getDiscount3());
			DataSource.setLine(X_C_OrderLine.COLUMNNAME_Discount4, row.getDiscount4());
			DataSource.setLine(X_C_OrderLine.COLUMNNAME_M_AttributeSetInstance_ID, new ValueNamePair(asi.getIdentifier(), asi.getDescription()));
			DataSource.setLine(X_C_OrderLine.COLUMNNAME_IsBonus,row.IsBonus() ? "Y" : "N");					
			DataSource.setLine(X_C_OrderLine.COLUMNNAME_C_Tax_ID, new ValueNamePair(tax.getIdentifier(), tax.getName()));
			DataSource.setLine(X_C_OrderLine.COLUMNNAME_C_UOM_ID, new ValueNamePair(uom.getIdentifier(), uom.getUOMSymbol()));			
			DataSource.setLine(X_C_OrderLine.COLUMNNAME_LineNetAmt, row.getTotal());
			DataSource.setLine(X_M_Product.COLUMNNAME_ShortName, row.getProduct().getShortName());						//DataSource.setLine(X_C_OrderLine.COLUMNNAME_PriceEntered, row.getPriceEntered());
			DataSource.setLine(X_C_OrderLine.COLUMNNAME_C_OrderLine_ID, Util.getUUID());
		}
		DataSource.set(X_C_Order.COLUMNNAME_C_Order_ID, Util.getUUID());		
		DataSource.set(Constants.AD_User_ID, new ValueNamePair(u.getIdentifier(), u.getName()));		
		DataSource.set(X_C_Order.COLUMNNAME_SalesRep_ID, new ValueNamePair(sr.getIdentifier(), sr.getName()));
		DataSource.set(X_C_Order.COLUMNNAME_C_BPartner_ID, new ValueNamePair(p.getIdentifier(), p.getName()));
		DataSource.set(X_C_Order.COLUMNNAME_GrandTotal, amounts.get(Constants.A_TOTALNET));
		DataSource.set(X_C_Order.COLUMNNAME_DifferenceAmt, getOrder().getDifferenceAmt());
		DataSource.set(X_C_Order.COLUMNNAME_PrinterSerial, getConfig().getPrinterSerial());
		DataSource.set(X_C_Order.COLUMNNAME_C_PaymentTerm_ID, new ValueNamePair(pt.getIdentifier(), pt.getName()));
		DataSource.set(X_C_Order.COLUMNNAME_DocumentNoToInvoice, InvoiceDocumentNo);		
		DataSource.set(X_C_Order.COLUMNNAME_C_BPartner_Location_ID,  new ValueNamePair(bl.getIdentifier(), bl.getName()));
		DataSource.set(X_C_BPartner.COLUMNNAME_TaxID, TaxID);		
		DataSource.set(X_C_Order.COLUMNNAME_GrandTotal, amounts.get(Constants.A_TOTALNET));
		DataSource.set(X_C_Order.COLUMNNAME_DifferenceAmt, getOrder().getDifferenceAmt());
		DataSource.set(X_C_Order.COLUMNNAME_DebtAmt, getOrder().getDebtAmt());
		DataSource.set(X_C_Order.COLUMNNAME_PrinterSerial, getConfig().getPrinterSerial());
		DataSource.set("AmountInText", AmountInText);
		DataSource.set(X_C_Order.COLUMNNAME_M_PriceList_ID, new ValueNamePair(pl.getIdentifier(), pl.getName()));
		DataSource.set(X_C_Order.COLUMNNAME_M_Warehouse_ID, new ValueNamePair(wh.getIdentifier(), wh.getName()));			
		DataSource.set(X_C_Order.COLUMNNAME_Pay_BPartner_ID, new ValueNamePair(paypatner.getIdentifier(), paypatner.getName()));
		DataSource.set(X_C_Order.COLUMNNAME_Bill_BPartner_ID, new ValueNamePair(billpatner.getIdentifier(), billpatner.getName()));		
		DataSource.set(X_C_Order.COLUMNNAME_Bill_Location_ID, new ValueNamePair(billlocation.getIdentifier(), billlocation.toString()));		
		DataSource.set(X_C_Order.COLUMNNAME_Bill_User_ID,  new ValueNamePair(billuser.getIdentifier(), billuser.getName()));
		DataSource.set(X_C_Order.COLUMNNAME_POReference, getOrder().getPOReference());
		DataSource.set(X_C_Order.COLUMNNAME_Description, getOrder().getDescription());
		DataSource.set(X_C_Order.COLUMNNAME_IsDiscountPrinted,	getOrder().isDiscountPrinted() ? "Y" : "N");
		DataSource.set(X_C_Order.COLUMNNAME_InvoiceRule,	getOrder().getInvoiceRule());
		DataSource.set(X_C_Order.COLUMNNAME_DeliveryRule,	getOrder().getDeliveryRule());
		DataSource.set(X_C_Order.COLUMNNAME_PaymentRule,	getOrder().getPaymentRule());
		DataSource.set(X_C_Order.COLUMNNAME_FreightCostRule, getOrder().getFreightCostRule());
		DataSource.set(X_C_Order.COLUMNNAME_IsSOTrx, "Y");
		DataSource.set(X_C_Order.COLUMNNAME_IsTaxIncluded, getOrder().isTaxIncluded() ? "Y" : "N");
		DataSource.set(X_C_Order.COLUMNNAME_PriorityRule, getOrder().getPriorityRule());
		DataSource.set(X_C_Order.COLUMNNAME_DeliveryViaRule, getOrder().getDeliveryViaRule());
		DataSource.set(X_C_Order.COLUMNNAME_C_BPartner_Points_ID,	String.valueOf(getOrder().getC_BPartner_Points_ID()));
		// each document created must be a new identifier because the identifier is called in the server
		// in case the process was interrupted by hangout or something.		
		DataSource.set(X_C_Order.COLUMNNAME_Identifier, Util.getUUID());
		DataSource.set(X_C_POS.COLUMNNAME_C_POS_ID,	new ValueNamePair(getConfig().getIdentifier(), getConfig().getName()));
		DataSource.set(X_C_Order.COLUMNNAME_WriteOffAmt, getOrder().getWriteOffAmt());
		DataSource.set(X_C_Order.COLUMNNAME_WriteOffType, getOrder().getWriteOffType());
		DataSource.set(Constants.WriteOffName, Util.RefListValue("6848d0e2-1489-4297-b62e-a6e9631fcb83"));

		//format.AddProperty(Constants.HEADER, X_C_Order.COLUMNNAME_SerialToInvoice, SerialToInvoice);
		//format.AddProperty(Constants.HEADER, X_C_Order.COLUMNNAME_DocumentNoToInvoice, InvoiceDocumentNo);
		//
		DataSource.set(X_A_Machine.COLUMNNAME_A_Machine_ID, new ValueNamePair(Env.getMachine().getIdentifier(), Env.getMachine().getName()));

		BigDecimal pcash = getAmt(Constants.A_CASH).divide(amounts.get(Constants.A_TOTALNET), 4, BigDecimal.ROUND_HALF_UP);
		BigDecimal pcredit =  getAmt(Constants.A_CREDIT).divide(amounts.get(Constants.A_TOTALNET), 4, BigDecimal.ROUND_HALF_UP);
		BigDecimal ppayment = getAmt(Constants.A_PAY).divide(amounts.get(Constants.A_TOTALNET), 4, BigDecimal.ROUND_HALF_UP);
		BigDecimal pcoupon = getAmt(Constants.A_COUPON).divide(amounts.get(Constants.A_TOTALNET), 4, BigDecimal.ROUND_HALF_UP);	
		DataSource.set(Constants.A_CASH, pcash);
		DataSource.set(Constants.A_CREDIT, pcredit);
		DataSource.set(Constants.A_PAY, ppayment);
		DataSource.set(Constants.A_COUPON, pcoupon);		
		if (getAmt(Constants.A_CASH).compareTo(BigDecimal.ZERO) > 0) {
			//format.AddProperty("cash", X_C_CashBook.COLUMNNAME_C_CashBook_ID, m_cashbook.getIdentifier());
			MDocType dtcash = MDocType.get(Env.getCtx(), getConfig().getCash_C_DocType_ID());
			//X_HR_WorkShift ws = new Query(Env.getCtx(), X_HR_WorkShift.Table_Name, "HR_WorkShift_ID = ?", null)
			//.setParameters(getWorkShift().getKey()).first();			
			//if (ws == null) {
			//	ws = new X_HR_WorkShift(Env.getCtx(), 0, null);
			//}			
			DataSource.set(Constants.A_CASH, X_C_CashBook.COLUMNNAME_C_CashBook_ID, new ValueNamePair(m_cashbook.getIdentifier(), m_cashbook.getName()));
			DataSource.set(Constants.A_CASH, X_C_Order.COLUMNNAME_WriteOffAmt, getOrder().getWriteOffAmt());
			DataSource.set(Constants.A_CASH, X_C_Order.COLUMNNAME_WriteOffType, getOrder().getWriteOffType());			
			DataSource.set(Constants.A_CASH, X_C_Cash.COLUMNNAME_C_DocType_ID, new ValueNamePair(dtcash.getIdentifier(), dtcash.getName()));						
			DataSource.set(Constants.A_CASH, Constants.WriteOffName, Util.RefListValue("6848d0e2-1489-4297-b62e-a6e9631fcb83") );
		}
		if (getAmt(Constants.A_PAY).compareTo(BigDecimal.ZERO) > 0) {

			MDocType paydoctype = MDocType.get(Env.getCtx(), getConfig().getPayment_C_DocType_ID());
			MBankAccount payba = MBankAccount.get(Env.getCtx(), m_payment.getC_BankAccount_ID());
			DataSource.set(Constants.A_PAY, X_C_Payment.COLUMNNAME_C_Payment_ID, Util.getUUID());
			DataSource.set(Constants.A_PAY, X_C_Payment.COLUMNNAME_C_DocType_ID, new ValueNamePair(paydoctype.getIdentifier(), paydoctype.getName()));
			DataSource.set(Constants.A_PAY, X_C_Payment.COLUMNNAME_CreditCardNumber, m_payment.getCreditCardNumber());
			DataSource.set(Constants.A_PAY, X_C_Payment.COLUMNNAME_CreditCardType, m_payment.getCreditCardType());
			DataSource.set(Constants.A_PAY, X_C_Payment.COLUMNNAME_TenderType, m_payment.getTenderType());
			DataSource.set(Constants.A_PAY, X_C_Payment.COLUMNNAME_CheckNo,  m_payment.getCheckNo());
			DataSource.set(Constants.A_PAY, X_C_Payment.COLUMNNAME_C_BankAccount_ID, new ValueNamePair(payba.getIdentifier(), payba.getName()));
			DataSource.set(Constants.A_PAY, X_C_Payment.COLUMNNAME_TrxType, m_payment.getTrxType());			
			DataSource.set(Constants.A_PAY, X_C_Payment.COLUMNNAME_C_BPartner_ID, new ValueNamePair(p.getIdentifier(), p.getName()));
			DataSource.set(Constants.A_PAY, X_C_Payment.COLUMNNAME_C_Currency_ID,new ValueNamePair(currency.getIdentifier(), currency.getISO_Code()));			
		}
		if (getAmt(Constants.A_CREDIT).compareTo(BigDecimal.ZERO) > 0) {

		}
		if (getAmt(Constants.A_COUPON).compareTo(BigDecimal.ZERO) > 0) {
			for (X_C_Coupon coupon:m_Coupons)
			{
				MBPartner couponpartner = MBPartner.get(Env.getCtx(), coupon.getC_BPartner_ID());
				MCurrency couponcurrency = MCurrency.get(Env.getCtx(), coupon.getC_Currency_ID());
				DataSource.setLine(Constants.A_COUPON, X_C_Coupon.COLUMNNAME_C_Coupon_ID, new ValueNamePair(coupon.getIdentifier(), coupon.getDocumentNo()));
				DataSource.setLine(Constants.A_COUPON, X_C_Coupon.COLUMNNAME_C_BPartner_ID, new ValueNamePair(couponpartner.getIdentifier(), couponpartner.getName()));
				DataSource.setLine(Constants.A_COUPON, X_C_Coupon.COLUMNNAME_C_Currency_ID, new ValueNamePair(couponcurrency.getIdentifier(), couponcurrency.getISO_Code()));
				DataSource.setLine(Constants.A_COUPON, X_C_Coupon.COLUMNNAME_DocumentNo, coupon.getDocumentNo());
				DataSource.setLine(Constants.A_COUPON, X_C_Coupon.COLUMNNAME_GrandTotal, coupon.getGrandTotal());				
			}				
		}
	}

	public KeyNameIdentifier getWorkShift() {
		return workshift;
	}
	public void setWorkShift(KeyNameIdentifier value) {
		workshift = value;	
		currentworkshift.setText(String.format("USER: %s TURNO: %s", getUser().getName(), getWorkShift().getName()));
	}	
	//public String getWorkShiftName() {		
	//	return workshift.getName();
	//}	
	public String transaction() {
		String error = "";
		try {			 
			MMessageFormat format = getMessage();
			MDocType dt = MDocType.get(Env.getCtx(), getOrder().getC_DocTypeTarget_ID());
			if (format == null) {
				throw new Exception(String.format("el tipo de documento %s no tiene definido un formato de mensaje",dt.getName()));
			} else {
				format.getDocument();
			}
			DataSource.getInstance().setModeValue("V");
			format.startMessage();
			//MCurrency currency = MCurrency.get(Env.getCtx(), getOrder().getC_Currency_ID());						
			///MPriceList pl = MPriceList.get(Env.getCtx(), getOrder().getM_PriceList_ID(), null);
			//String TaxID = MBPartner.get(Env.getCtx(), getOrder().getC_BPartner_ID()).getTaxID();
			//String AmountInText = Msg.getAmtInWords(Env.getLanguage(Env.getCtx()), amounts.get(Constants.A_TOTALNET).toString()).concat(" ").concat(currency.getDescription());			
			ObjectViewModel adapter = view.getDataModel();
			for (int line=0;line < adapter.getRowCount(); line++)				
			{
				Row row = (Row) adapter.getRowObject(line);	
				if (row.getM_Product_ID() == 0 && row.getQtyOrdered().compareTo(Env.ZERO) == 0) {
					continue;
				}
				//MUOM uom = MUOM.get(Env.getCtx(), row.getC_UOM_ID());
				format.AddProperty("item",X_C_OrderLine.COLUMNNAME_M_Product_ID, DataSource.getLine(X_C_OrderLine.COLUMNNAME_M_Product_ID));
				format.AddProperty("item",X_M_Product.COLUMNNAME_M_AttributeSet_ID, DataSource.getLine(X_M_Product.COLUMNNAME_M_AttributeSet_ID));
				format.AddProperty("item",X_C_OrderLine.COLUMNNAME_PriceActual, DataSource.getLine(X_C_OrderLine.COLUMNNAME_PriceActual));
				format.AddProperty("item",X_C_OrderLine.COLUMNNAME_PriceList, DataSource.getLine(X_C_OrderLine.COLUMNNAME_PriceList));				
				format.AddProperty("item",X_C_OrderLine.COLUMNNAME_PriceLimit, DataSource.getLine(X_C_OrderLine.COLUMNNAME_PriceLimit));
				format.AddProperty("item",X_C_OrderLine.COLUMNNAME_PriceEntered, DataSource.getLine(X_C_OrderLine.COLUMNNAME_PriceEntered));
				format.AddProperty("item",X_C_OrderLine.COLUMNNAME_QtyOrdered, DataSource.getLine(X_C_OrderLine.COLUMNNAME_QtyOrdered));
				format.AddProperty("item",X_C_OrderLine.COLUMNNAME_QtyEntered, DataSource.getLine(X_C_OrderLine.COLUMNNAME_QtyEntered));
				format.AddProperty("item",X_C_OrderLine.COLUMNNAME_PriceBase, DataSource.getLine(X_C_OrderLine.COLUMNNAME_PriceBase));
				format.AddProperty("item",X_C_OrderLine.COLUMNNAME_Discount, DataSource.getLine(X_C_OrderLine.COLUMNNAME_Discount));
				format.AddProperty("item",X_C_OrderLine.COLUMNNAME_Discount1, DataSource.getLine(X_C_OrderLine.COLUMNNAME_Discount1));
				format.AddProperty("item",X_C_OrderLine.COLUMNNAME_Discount2, DataSource.getLine(X_C_OrderLine.COLUMNNAME_Discount2));
				format.AddProperty("item",X_C_OrderLine.COLUMNNAME_Discount3, DataSource.getLine(X_C_OrderLine.COLUMNNAME_Discount3));
				format.AddProperty("item",X_C_OrderLine.COLUMNNAME_Discount4, DataSource.getLine(X_C_OrderLine.COLUMNNAME_Discount4));
				format.AddProperty("item",X_C_OrderLine.COLUMNNAME_M_AttributeSetInstance_ID, DataSource.getLine(X_C_OrderLine.COLUMNNAME_M_AttributeSetInstance_ID));
				//format.AddProperty("item",X_C_OrderLine.COLUMNNAME_Ref_AttributeSetInstance_ID,POUtil.getid(X_M_AttributeSetInstance.Table_Name, row.getRef_AttributeSetInstance_ID()));					
				format.AddProperty("item",X_C_OrderLine.COLUMNNAME_IsBonus,DataSource.getLine(X_C_OrderLine.COLUMNNAME_IsBonus));
				format.AddProperty("item",X_C_OrderLine.COLUMNNAME_C_Tax_ID,DataSource.getLine(X_C_OrderLine.COLUMNNAME_C_Tax_ID));
				format.AddProperty("item",X_C_OrderLine.COLUMNNAME_C_UOM_ID, DataSource.getLine(X_C_OrderLine.COLUMNNAME_C_UOM_ID));
				//format.AddProperty("item",X_C_OrderLine.COLUMNNAME_C_CampaignBonus_ID, DataSource.getLine(X_C_OrderLine.COLUMNNAME_C_CampaignBonus_ID));
				//format.AddProperty("item",X_C_OrderLine.COLUMNNAME_C_CampaignDiscount_ID, DataSource.getLine(X_C_OrderLine.COLUMNNAME_C_CampaignDiscount_ID));
				format.AddProperty("item",X_C_OrderLine.COLUMNNAME_LineNetAmt, DataSource.getLine(X_C_OrderLine.COLUMNNAME_LineNetAmt));
				format.AddProperty("item",X_M_Product.COLUMNNAME_ShortName,DataSource.getLine(X_M_Product.COLUMNNAME_ShortName));
				//format.AddProperty("item",X_C_OrderLine.COLUMNNAME_PriceEntered, DataSource.getLine(X_C_OrderLine.COLUMNNAME_PriceEntered));
				//format.AddProperty("item",X_C_OrderLine.COLUMNNAME_Identifier, Util.getUUID());				
				format.AddProperty("item",X_C_OrderLine.COLUMNNAME_C_OrderLine_ID, DataSource.getLine(X_C_OrderLine.COLUMNNAME_C_OrderLine_ID)); 
				format.ValidateSection("item");				
			}
			format.AddProperty("client", Constants.COLUMNNAME_AD_Client_ID,DataSource.get(Constants.COLUMNNAME_AD_Client_ID));
			format.ValidateSection("client");
			format.AddProperty("org", Constants.COLUMNNAME_AD_Org_ID,DataSource.get(Constants.COLUMNNAME_AD_Org_ID));
			format.ValidateSection("org");
			//
			//format.AddProperty(Constants.HEADER,"version","2.0");
			//format.AddProperty("Header", "id", Util.getUUID());
			format.AddProperty(Constants.HEADER, X_C_Order.COLUMNNAME_C_Order_ID, DataSource.get(X_C_Order.COLUMNNAME_C_Order_ID));
			format.AddProperty(Constants.HEADER, Constants.COLUMNNAME_AD_Client_ID,DataSource.get(Constants.COLUMNNAME_AD_Client_ID));
			format.AddProperty(Constants.HEADER, Constants.COLUMNNAME_AD_Org_ID,DataSource.get(Constants.COLUMNNAME_AD_Org_ID));
			format.AddProperty(Constants.HEADER, X_C_Order.COLUMNNAME_C_Currency_ID, DataSource.get(X_C_Order.COLUMNNAME_C_Currency_ID));
			format.AddProperty(Constants.HEADER, Constants.AD_User_ID,DataSource.get(Constants.AD_User_ID));			
			//format.AddProperty(Constants.HEADER, Constants.COLUMNNAME_Created, actual.toString().substring(0, 16));
			format.AddProperty(Constants.HEADER, Constants.COLUMNNAME_Created, DataSource.get(Constants.COLUMNNAME_Created));
			format.AddProperty(Constants.HEADER, X_C_Order.COLUMNNAME_SalesRep_ID, DataSource.get(X_C_Order.COLUMNNAME_SalesRep_ID));

			//MPaymentTerm pt = new MPaymentTerm(Env.getCtx(), getOrder().getC_PaymentTerm_ID(), null);

			//String SerialToInvoice = ""; 
			//InvoiceDocumentNo = "";

			//DataSource.set(X_C_Order.COLUMNNAME_SalesRep_ID, getname(X_AD_User.Table_Name, getOrder().getSalesRep_ID()));
			//DataSource.set(X_C_Order.COLUMNNAME_C_BPartner_ID, getname(X_AD_User.Table_Name, getOrder().getSalesRep_ID()));
			//DataSource.set(X_C_Order.COLUMNNAME_GrandTotal, amounts.get(Constants.A_TOTALNET));
			//DataSource.set(X_C_Order.COLUMNNAME_DifferenceAmt, getOrder().getDifferenceAmt());
			//DataSource.set(X_C_Order.COLUMNNAME_PrinterSerial, getConfig().getPrinterSerial());
			//DataSource.set(X_C_Order.COLUMNNAME_C_PaymentTerm_ID, pt.getName());
			//DataSource.set(X_C_Order.COLUMNNAME_SerialToInvoice, SerialToInvoice);
			//DataSource.set(X_C_Order.COLUMNNAME_DocumentNoToInvoice, InvoiceDocumentNo);

			format.AddProperty(Constants.HEADER, X_C_Order.COLUMNNAME_C_BPartner_ID, DataSource.get(X_C_Order.COLUMNNAME_C_BPartner_ID));
			format.AddProperty(Constants.HEADER, X_C_Order.COLUMNNAME_C_BPartner_Location_ID, DataSource.get(X_C_Order.COLUMNNAME_C_BPartner_Location_ID));
			format.AddProperty(Constants.HEADER, X_C_BPartner.COLUMNNAME_TaxID, DataSource.get(X_C_BPartner.COLUMNNAME_TaxID));
			format.AddProperty(Constants.HEADER, X_C_Order.COLUMNNAME_GrandTotal, DataSource.get(X_C_Order.COLUMNNAME_GrandTotal));
			format.AddProperty(Constants.HEADER, X_C_Order.COLUMNNAME_DifferenceAmt, DataSource.get(X_C_Order.COLUMNNAME_DifferenceAmt));
			format.AddProperty(Constants.HEADER, X_C_Order.COLUMNNAME_DebtAmt, DataSource.get(X_C_Order.COLUMNNAME_DebtAmt));
			format.AddProperty(Constants.HEADER, X_C_Order.COLUMNNAME_PrinterSerial, DataSource.get(X_C_Order.COLUMNNAME_PrinterSerial));			
			format.AddProperty(Constants.HEADER, X_C_Order.COLUMNNAME_C_PaymentTerm_ID,	DataSource.get(X_C_Order.COLUMNNAME_C_PaymentTerm_ID));			
			format.AddProperty(Constants.HEADER, "AmountInText", DataSource.get("AmountInText"));
			format.AddProperty(Constants.HEADER, X_C_Order.COLUMNNAME_M_PriceList_ID, DataSource.get(X_C_Order.COLUMNNAME_M_PriceList_ID));
			format.AddProperty(Constants.HEADER, X_C_Order.COLUMNNAME_C_DocType_ID,	DataSource.get(X_C_Order.COLUMNNAME_C_DocType_ID));
			format.AddProperty(Constants.HEADER, X_C_Order.COLUMNNAME_C_DocTypeTarget_ID,	DataSource.get(X_C_Order.COLUMNNAME_C_DocTypeTarget_ID));
			format.AddProperty(Constants.HEADER, X_C_Order.COLUMNNAME_M_Warehouse_ID, DataSource.get(X_C_Order.COLUMNNAME_M_Warehouse_ID));					
			format.AddProperty(Constants.HEADER, X_C_Order.COLUMNNAME_Pay_BPartner_ID, DataSource.get(X_C_Order.COLUMNNAME_Pay_BPartner_ID));
			format.AddProperty(Constants.HEADER, X_C_Order.COLUMNNAME_Bill_BPartner_ID,  DataSource.get(X_C_Order.COLUMNNAME_Bill_BPartner_ID));
			format.AddProperty(Constants.HEADER, X_C_Order.COLUMNNAME_Bill_Location_ID, DataSource.get(X_C_Order.COLUMNNAME_Bill_Location_ID));
			format.AddProperty(Constants.HEADER, X_C_Order.COLUMNNAME_Bill_User_ID, DataSource.get(X_C_Order.COLUMNNAME_Bill_User_ID));
			format.AddProperty(Constants.HEADER, X_C_Order.COLUMNNAME_POReference,	DataSource.get(X_C_Order.COLUMNNAME_POReference));
			format.AddProperty(Constants.HEADER, X_C_Order.COLUMNNAME_Description,	DataSource.get(X_C_Order.COLUMNNAME_Description));
			format.AddProperty(Constants.HEADER, X_C_Order.COLUMNNAME_IsDiscountPrinted, DataSource.get(X_C_Order.COLUMNNAME_IsDiscountPrinted));
			format.AddProperty(Constants.HEADER, X_C_Order.COLUMNNAME_InvoiceRule,	DataSource.get(X_C_Order.COLUMNNAME_InvoiceRule));
			format.AddProperty(Constants.HEADER, X_C_Order.COLUMNNAME_DeliveryRule,	DataSource.get(X_C_Order.COLUMNNAME_DeliveryRule));
			format.AddProperty(Constants.HEADER, X_C_Order.COLUMNNAME_PaymentRule,	DataSource.get(X_C_Order.COLUMNNAME_PaymentRule));
			format.AddProperty(Constants.HEADER, X_C_Order.COLUMNNAME_FreightCostRule, DataSource.get(X_C_Order.COLUMNNAME_FreightCostRule));
			format.AddProperty(Constants.HEADER, X_C_Order.COLUMNNAME_IsSOTrx, DataSource.get(X_C_Order.COLUMNNAME_IsSOTrx));
			format.AddProperty(Constants.HEADER, X_C_Order.COLUMNNAME_IsTaxIncluded, DataSource.get(X_C_Order.COLUMNNAME_IsTaxIncluded));
			format.AddProperty(Constants.HEADER, X_C_Order.COLUMNNAME_PriorityRule, DataSource.get(X_C_Order.COLUMNNAME_PriorityRule));
			format.AddProperty(Constants.HEADER, X_C_Order.COLUMNNAME_DeliveryViaRule, DataSource.get(X_C_Order.COLUMNNAME_DeliveryViaRule));
			format.AddProperty(Constants.HEADER, X_C_Order.COLUMNNAME_C_BPartner_Points_ID,	DataSource.get(X_C_Order.COLUMNNAME_C_BPartner_Points_ID));
			// each document created must be a new identifier because the identifier is called in the server
			// in case the process was interrupted by hangout or something.
			format.AddProperty(Constants.HEADER, X_C_Order.COLUMNNAME_Identifier, Util.getUUID());
			format.AddProperty(Constants.HEADER, X_C_POS.COLUMNNAME_C_POS_ID,	DataSource.get(X_C_POS.COLUMNNAME_C_POS_ID));
			//format.AddProperty(Constants.HEADER, X_C_Order.COLUMNNAME_WriteOffAmt, DataSource.get(X_C_Order.COLUMNNAME_WriteOffAmt));
			//format.AddProperty(Constants.HEADER, X_C_Order.COLUMNNAME_WriteOffType, DataSource.get(X_C_Order.COLUMNNAME_WriteOffType));
			format.AddProperty(Constants.HEADER, Constants.WriteOffName, DataSource.get(Constants.WriteOffName));
			//
			format.AddProperty(Constants.HEADER, X_C_Order.COLUMNNAME_SerialToInvoice, DataSource.get(X_C_Order.COLUMNNAME_SerialToInvoice));
			format.AddProperty(Constants.HEADER, X_C_Order.COLUMNNAME_DocumentNoToInvoice, DataSource.get(X_C_Order.COLUMNNAME_DocumentNoToInvoice));
			//
			format.AddProperty(Constants.HEADER, X_C_Order.COLUMNNAME_DateOrdered, DataSource.get(Constants.COLUMNNAME_Created));
			format.AddProperty(Constants.HEADER, X_A_Machine.COLUMNNAME_A_Machine_ID, DataSource.get(X_A_Machine.COLUMNNAME_A_Machine_ID));
			if (getWorkShift().getKey() > 0) {
				format.AddProperty(Constants.HEADER, X_HR_WorkShift.COLUMNNAME_HR_WorkShift_ID, DataSource.get(X_HR_WorkShift.COLUMNNAME_HR_WorkShift_ID));
			}
			//
			format.ValidateSection(Constants.HEADER);
			//
			//BigDecimal pcash = getAmt(Constants.A_CASH).divide(amounts.get(Constants.A_TOTALNET), 4, BigDecimal.ROUND_HALF_UP);
			//BigDecimal pcredit =  getAmt(Constants.A_CREDIT).divide(amounts.get(Constants.A_TOTALNET), 4, BigDecimal.ROUND_HALF_UP);
			//BigDecimal ppayment = getAmt(Constants.A_PAY).divide(amounts.get(Constants.A_TOTALNET), 4, BigDecimal.ROUND_HALF_UP);
			//BigDecimal pcoupon = getAmt(Constants.A_COUPON).divide(amounts.get(Constants.A_TOTALNET), 4, BigDecimal.ROUND_HALF_UP);
			//format.AddProperty("pay","cash", getAmt(Constants.A_CASH).toString());
			format.AddProperty("pay","cash", DataSource.get(Constants.A_CASH));
			format.AddProperty("pay","credit", DataSource.get(Constants.A_CREDIT));
			format.AddProperty("pay","payment", DataSource.get(Constants.A_PAY));
			format.AddProperty("pay","coupon", DataSource.get(Constants.A_COUPON));
			format.ValidateSection("pay");			
			format.AddProperty("currency", X_C_Order.COLUMNNAME_C_Currency_ID, DataSource.get(X_C_Order.COLUMNNAME_C_Currency_ID));
			format.ValidateSection("currency");
			if (getAmt(Constants.A_CASH).compareTo(BigDecimal.ZERO) > 0) {
				format.AddProperty("cash", X_C_CashBook.COLUMNNAME_C_CashBook_ID, 	DataSource.get(Constants.A_CASH, X_C_CashBook.COLUMNNAME_C_CashBook_ID));
				format.AddProperty("cash", X_C_Order.COLUMNNAME_WriteOffAmt, 		DataSource.get(Constants.A_CASH, X_C_Order.COLUMNNAME_WriteOffAmt));
				format.AddProperty("cash", X_C_Order.COLUMNNAME_WriteOffType, 		DataSource.get(Constants.A_CASH, X_C_Order.COLUMNNAME_WriteOffType));
				format.AddProperty("cash", X_C_Cash.COLUMNNAME_C_DocType_ID, 		DataSource.get(Constants.A_CASH, X_C_Cash.COLUMNNAME_C_DocType_ID));				
				format.AddProperty("cash", Constants.WriteOffName, DataSource.get(Constants.A_CASH, Constants.WriteOffName) );
				format.ValidateSection("pay","cash");
			}
			if (getAmt(Constants.A_PAY).compareTo(BigDecimal.ZERO) > 0) {
				format.AddProperty("payment", X_C_Payment.COLUMNNAME_C_Payment_ID, 		DataSource.get(Constants.A_PAY, X_C_Payment.COLUMNNAME_C_Payment_ID));
				format.AddProperty("payment", X_C_Payment.COLUMNNAME_C_DocType_ID, 		DataSource.get(Constants.A_PAY, X_C_Payment.COLUMNNAME_C_DocType_ID)); // ARR				
				format.AddProperty("payment", X_C_Payment.COLUMNNAME_CreditCardNumber, 	DataSource.get(Constants.A_PAY, X_C_Payment.COLUMNNAME_CreditCardNumber));
				format.AddProperty("payment", X_C_Payment.COLUMNNAME_C_BankAccount_ID,	DataSource.get(Constants.A_PAY, X_C_Payment.COLUMNNAME_C_BankAccount_ID));
				format.AddProperty("payment", X_C_Payment.COLUMNNAME_TrxType, 			DataSource.get(Constants.A_PAY, X_C_Payment.COLUMNNAME_TrxType));
				format.AddProperty("payment", X_C_Payment.COLUMNNAME_C_BPartner_ID,		DataSource.get(Constants.A_PAY, X_C_Payment.COLUMNNAME_C_BPartner_ID));
				format.AddProperty("payment", X_C_Payment.COLUMNNAME_CreditCardNumber, 	DataSource.get(Constants.A_PAY, X_C_Payment.COLUMNNAME_CreditCardNumber));
				format.AddProperty("payment", X_C_Payment.COLUMNNAME_C_Currency_ID,		DataSource.get(Constants.A_PAY, X_C_Payment.COLUMNNAME_C_Currency_ID));
				format.AddProperty("payment", X_C_Payment.COLUMNNAME_CreditCardType, 	DataSource.get(Constants.A_PAY, X_C_Payment.COLUMNNAME_CreditCardType));
				format.AddProperty("payment", X_C_Payment.COLUMNNAME_TenderType, 		DataSource.get(Constants.A_PAY, X_C_Payment.COLUMNNAME_TenderType));				
				format.AddProperty("payment", X_C_Payment.COLUMNNAME_CheckNo,			DataSource.get(Constants.A_PAY, X_C_Payment.COLUMNNAME_CheckNo));
				format.ValidateSection("pay","payment");
			}
			if (getAmt(Constants.A_CREDIT).compareTo(BigDecimal.ZERO) > 0) {

			}
			if (getAmt(Constants.A_COUPON).compareTo(BigDecimal.ZERO) > 0) {
				for (X_C_Coupon coupon:m_Coupons)
				{
					format.AddProperty("coupon", X_C_Coupon.COLUMNNAME_C_Coupon_ID,		DataSource.getLine(Constants.A_COUPON, X_C_Coupon.COLUMNNAME_C_Coupon_ID));
					format.AddProperty("coupon", X_C_Coupon.COLUMNNAME_C_BPartner_ID,	DataSource.getLine(Constants.A_COUPON, X_C_Coupon.COLUMNNAME_C_BPartner_ID));
					format.AddProperty("coupon", X_C_Coupon.COLUMNNAME_C_Currency_ID,	DataSource.getLine(Constants.A_COUPON, X_C_Coupon.COLUMNNAME_C_Currency_ID));
					format.AddProperty("coupon", X_C_Coupon.COLUMNNAME_DocumentNo, 		DataSource.getLine(Constants.A_COUPON, X_C_Coupon.COLUMNNAME_DocumentNo));
					format.AddProperty("coupon", X_C_Coupon.COLUMNNAME_GrandTotal, 		DataSource.getLine(Constants.A_COUPON, X_C_Coupon.COLUMNNAME_GrandTotal));
					format.ValidateSection("pay","coupon");
				}				
			}
			//
			format.ValidateMessage();
			X_C_POSDocType pdt = new Query(Env.getCtx(), X_C_POSDocType.Table_Name, "C_DocType_ID = ? AND C_POS_ID = ?", null)
			.setParameters(dt.getC_DocType_ID(), getConfig().getC_POS_ID()).first();
			Boolean isorder = pdt.getA_MachinePrinter_ID() > 0 && pdt.getC_PrinterDocumentFormat_ID() > 0;
			if (isorder) {											
				//if (getDocNumber() != null)
				//	InvoiceDocumentNo = getDocNumber();
				//if (InvoiceDocumentNo.length() == 0)
				//{
				//	if (dt.getC_DocTypeInvoice_ID() > 0)
				//	{
				//		InvoiceDocumentNo = DB.getDocumentNo(dt.getC_DocTypeInvoice_ID(), null, false, null);
				//		SerialToInvoice = DB.getSQLValueString(	null,"SELECT s.Serial FROM C_DocType t, AD_Sequence s WHERE t.C_DocType_ID=? AND s.AD_Sequence_ID=t.DocNoSequence_ID",
				//				dt.getC_DocTypeInvoice_ID());
				//	}
				//	if (SerialToInvoice == null)
				//		SerialToInvoice = "";
				//}
				X_A_MachinePrinter mp = new Query(Env.getCtx(), X_A_MachinePrinter.Table_Name, "A_MachinePrinter_ID = ?", null)
				.setParameters(pdt.getA_MachinePrinter_ID()).first();
				if (mp != null)
				{
					X_A_Machine machine = new X_A_Machine(Env.getCtx(), mp.getA_Machine_ID(), null);
					PrintWorker pworker = getPrintWorkerMessage();
					pworker.setPrintServer(machine);
					MPrinterDocumentFormat pdf = new MPrinterDocumentFormat(Env.getCtx(), pdt.getC_PrinterDocumentFormat_ID(), null);
					PrintDocument pd = MVELParseFormat.getInstance().parse(pdf);
					//pd.setMessage(getMessage());								
					DataSource.getInstance().setModeValue("N");
					pd.setData(DataSource.getInstance());
					pd.setSource(pdt.getSource());
					Iterator iter = baseamounts.keySet().iterator();
					while (iter.hasNext())
					{
						Integer key = (Integer) iter.next();
						BigDecimal baseamount = (BigDecimal) baseamounts.get(key);
						if (baseamount.compareTo(BigDecimal.ZERO) > 0)
						{				
							MTax tax = MTax.get(Env.getCtx(), key);
							MTaxCategory taxcat = new MTaxCategory(Env.getCtx(), tax.getC_TaxCategory_ID(), null);
							pd.addeachvar(X_C_TaxCategory.COLUMNNAME_C_TaxCategory_ID,taxcat.getName());
							pd.addeachvar(X_C_InvoiceTax.COLUMNNAME_TaxBaseAmt,baseamount.toString());
						}
					}
					Iterator iter2 = taxamounts.keySet().iterator();
					while (iter2.hasNext())
					{
						Integer key = (Integer) iter2.next();
						BigDecimal taxamount = (BigDecimal) taxamounts.get(key);
						if (taxamount.compareTo(BigDecimal.ZERO) > 0)
						{				
							MTax tax = MTax.get(Env.getCtx(), key);
							pd.addeachvar(X_C_Tax.COLUMNNAME_C_Tax_ID,tax.getName());
							pd.addeachvar(X_C_InvoiceTax.COLUMNNAME_TaxAmt,taxamount.toString());
						}
					}		
					error = pworker.setPrintDocument(pd);						
					if (error.length() > 0) {
						throw new Exception(error);
					}
					pworker.setQueueName(mp.getQueueName());
					error = pworker.Print(PrintWorker.ReceiveJob);
				}
				else
				{
					throw new Exception(String.format("no se definio impresora para %s ",dt.getName()));
				}
			}
			if (error.length() == 0 || error.contains("HQ119014")) {															 
				if (getAmt(Constants.A_CREDIT).compareTo(BigDecimal.ZERO) > 0) {						
					error = printCreditWorker();
					if (error.length() != 0)
						throw new Exception(error);
				}
			} else
				throw new Exception(error);
			error = SendMessage();
			if (error.length() > 0)
				throw new Exception(error);
		} catch (Exception e) {
			e.printStackTrace();
			error = e.getMessage();
		}		
		return error;		
	}

	public String oldtransaction() {
		String error = "";
		try {
			//Timestamp actual = );

			// verify message format
			MDocType dt = MDocType.get(Env.getCtx(), getOrder().getC_DocTypeTarget_ID());
			MMessageFormat format = getMessage();
			if (format == null) {
				throw new Exception(String.format("el tipo de documento %s no tiene definido un formato de mensaje",dt.getName()));
			} else {
				format.getDocument();
			}
			format.startMessage();
			MCurrency currency = MCurrency.get(Env.getCtx(), getOrder().getC_Currency_ID());						
			MPriceList pl = MPriceList.get(Env.getCtx(), getOrder().getM_PriceList_ID(), null);
			String TaxID = MBPartner.get(Env.getCtx(), getOrder().getC_BPartner_ID()).getTaxID();
			String AmountInText = Msg.getAmtInWords(Env.getLanguage(Env.getCtx()), amounts.get(Constants.A_TOTALNET).toString()).concat(" ").concat(currency.getDescription());

			ObjectViewModel adapter = view.getDataModel();
			for (int line=0;line < adapter.getRowCount(); line++)				
			{
				Row row = (Row) adapter.getRowObject(line);	
				if (row.getM_Product_ID() == 0 && row.getQtyOrdered().compareTo(Env.ZERO) == 0) {
					continue;
				}
				MUOM uom = MUOM.get(Env.getCtx(), row.getC_UOM_ID());

				format.AddProperty("item",X_C_OrderLine.COLUMNNAME_M_Product_ID, row.getProduct().getValue());
				format.AddProperty("item",X_M_Product.COLUMNNAME_M_AttributeSet_ID, POUtil.getid(X_M_AttributeSet.Table_Name,row.getM_AttributeSet_ID()));
				format.AddProperty("item",X_C_OrderLine.COLUMNNAME_PriceActual, row.getPriceActual().toString());
				format.AddProperty("item",X_C_OrderLine.COLUMNNAME_PriceList, row.getPriceList().toString());
				format.AddProperty("item",X_C_OrderLine.COLUMNNAME_PriceLimit, row.getPriceLimit().toString());
				format.AddProperty("item",X_C_OrderLine.COLUMNNAME_PriceEntered, row.getPriceEntered().toString());
				format.AddProperty("item",X_C_OrderLine.COLUMNNAME_QtyOrdered, row.getQtyOrdered().toString());
				format.AddProperty("item",X_C_OrderLine.COLUMNNAME_QtyEntered, row.getQtyEntered().toString());
				format.AddProperty("item",X_C_OrderLine.COLUMNNAME_PriceBase, row.getPriceBase().toString());
				format.AddProperty("item",X_C_OrderLine.COLUMNNAME_Discount, row.getDiscount().toString());
				format.AddProperty("item",X_C_OrderLine.COLUMNNAME_Discount1, row.getDiscount1().toString());
				format.AddProperty("item",X_C_OrderLine.COLUMNNAME_Discount2, row.getDiscount2().toString());
				format.AddProperty("item",X_C_OrderLine.COLUMNNAME_Discount3, row.getDiscount3().toString());
				format.AddProperty("item",X_C_OrderLine.COLUMNNAME_Discount4, row.getDiscount4().toString());
				format.AddProperty("item",X_C_OrderLine.COLUMNNAME_M_AttributeSetInstance_ID,POUtil.getid(X_M_AttributeSetInstance.Table_Name, row.getM_AttributeSetInstance_ID()));
				//format.AddProperty("item",X_C_OrderLine.COLUMNNAME_Ref_AttributeSetInstance_ID,POUtil.getid(X_M_AttributeSetInstance.Table_Name, row.getRef_AttributeSetInstance_ID()));					
				format.AddProperty("item",X_C_OrderLine.COLUMNNAME_IsBonus,row.IsBonus() ? "Y" : "N");
				format.AddProperty("item",X_C_OrderLine.COLUMNNAME_C_Tax_ID,POUtil.getid(X_C_Tax.Table_Name, row.getC_Tax_ID()));
				format.AddProperty("item",X_C_OrderLine.COLUMNNAME_C_UOM_ID, uom.getIdentifier(), uom.getUOMSymbol());
				format.AddProperty("item",X_C_OrderLine.COLUMNNAME_C_CampaignBonus_ID,POUtil.getid(X_C_CampaignBonus.Table_Name, row.getC_CampaignBonus_ID()));
				format.AddProperty("item",X_C_OrderLine.COLUMNNAME_C_CampaignDiscount_ID,POUtil.getid(X_C_CampaignDiscount.Table_Name, row.getC_CampaignDiscount_ID()));
				format.AddProperty("item",X_C_OrderLine.COLUMNNAME_LineNetAmt, row.getTotal().toString());
				format.AddProperty("item",X_M_Product.COLUMNNAME_ShortName,row.getProduct().getShortName());
				format.AddProperty("item",X_C_OrderLine.COLUMNNAME_PriceEntered, row.getPriceEntered().toString());
				//format.AddProperty("item",X_C_OrderLine.COLUMNNAME_Identifier, Util.getUUID());				
				format.AddProperty("item",X_C_OrderLine.COLUMNNAME_C_OrderLine_ID, Util.getUUID());
				format.ValidateSection("item");				
			}
			format.AddProperty("client", Constants.COLUMNNAME_AD_Client_ID,POUtil.getid(X_AD_Client.Table_Name, Env.getAD_Client_ID(Env.getCtx())));
			format.ValidateSection("client");
			format.AddProperty("org", Constants.COLUMNNAME_AD_Org_ID,POUtil.getid(X_AD_Org.Table_Name, Env.getAD_Org_ID(Env.getCtx())));
			format.ValidateSection("org");
			//
			//format.AddProperty(Constants.HEADER,"version","2.0");
			//format.AddProperty("Header", "id", Util.getUUID());
			format.AddProperty(Constants.HEADER, X_C_Order.COLUMNNAME_C_Order_ID, Util.getUUID());
			format.AddProperty(Constants.HEADER, Constants.COLUMNNAME_AD_Client_ID,POUtil.getid(X_AD_Client.Table_Name,Env.getAD_Client_ID(Env.getCtx())));
			format.AddProperty(Constants.HEADER, Constants.COLUMNNAME_AD_Org_ID,POUtil.getid(X_AD_Org.Table_Name, Env.getAD_Org_ID(Env.getCtx())));
			format.AddProperty(Constants.HEADER, X_C_Order.COLUMNNAME_C_Currency_ID, currency.getIdentifier());
			format.AddProperty(Constants.HEADER, Constants.AD_User_ID,POUtil.getid(X_AD_User.Table_Name, Env.getAD_User_ID(Env.getCtx())));			
			//format.AddProperty(Constants.HEADER, Constants.COLUMNNAME_Created, actual.toString().substring(0, 16));
			format.AddProperty(Constants.HEADER, Constants.COLUMNNAME_Created, DataSource.get(Constants.COLUMNNAME_Created));
			//format.AddProperty(Constants.HEADER, X_C_Order.COLUMNNAME_SalesRep_ID, POUtil.getid(X_AD_User.Table_Name,getOrder().getSalesRep_ID()), getname(X_AD_User.Table_Name, getOrder().getSalesRep_ID()));

			MPaymentTerm pt = new MPaymentTerm(Env.getCtx(), getOrder().getC_PaymentTerm_ID(), null);

			String SerialToInvoice = ""; 
			InvoiceDocumentNo = "";

			//DataSource.set(X_C_Order.COLUMNNAME_SalesRep_ID, getname(X_AD_User.Table_Name, getOrder().getSalesRep_ID()));
			//DataSource.set(X_C_Order.COLUMNNAME_C_BPartner_ID, getname(X_AD_User.Table_Name, getOrder().getSalesRep_ID()));
			DataSource.set(X_C_Order.COLUMNNAME_GrandTotal, amounts.get(Constants.A_TOTALNET));
			DataSource.set(X_C_Order.COLUMNNAME_DifferenceAmt, getOrder().getDifferenceAmt());
			DataSource.set(X_C_Order.COLUMNNAME_PrinterSerial, getConfig().getPrinterSerial());
			DataSource.set(X_C_Order.COLUMNNAME_C_PaymentTerm_ID, pt.getName());
			DataSource.set(X_C_Order.COLUMNNAME_SerialToInvoice, SerialToInvoice);
			DataSource.set(X_C_Order.COLUMNNAME_DocumentNoToInvoice, InvoiceDocumentNo);

			//format.AddProperty(Constants.HEADER, X_C_Order.COLUMNNAME_C_BPartner_ID,POUtil.getid(X_C_BPartner.Table_Name, getOrder().getC_BPartner_ID()),	getname(X_C_BPartner.Table_Name, getOrder().getC_BPartner_ID()));
			//format.AddProperty(Constants.HEADER, X_C_Order.COLUMNNAME_C_BPartner_Location_ID,POUtil.getid(X_C_BPartner_Location.Table_Name, getOrder().getC_BPartner_Location_ID()), 
			//		getname(X_C_BPartner_Location.Table_Name, getOrder().getC_BPartner_Location_ID()) );
			if (TaxID == null)
				TaxID = "";
			format.AddProperty(Constants.HEADER, X_C_BPartner.COLUMNNAME_TaxID, TaxID);
			format.AddProperty(Constants.HEADER, X_C_Order.COLUMNNAME_GrandTotal, amounts.get(Constants.A_TOTALNET).toString());
			format.AddProperty(Constants.HEADER, X_C_Order.COLUMNNAME_DifferenceAmt, getOrder().getDifferenceAmt().toString());

			format.AddProperty(Constants.HEADER, X_C_Order.COLUMNNAME_DebtAmt, getOrder().getDebtAmt().toString());
			format.AddProperty(Constants.HEADER, X_C_Order.COLUMNNAME_PrinterSerial, getConfig().getPrinterSerial());			
			format.AddProperty(Constants.HEADER, X_C_Order.COLUMNNAME_C_PaymentTerm_ID,	POUtil.getid(X_C_PaymentTerm.Table_Name, pt.getC_PaymentTerm_ID()));			
			format.AddProperty(Constants.HEADER, "AmountInText", AmountInText);
			format.AddProperty(Constants.HEADER, X_C_Order.COLUMNNAME_M_PriceList_ID, pl.getIdentifier());
			format.AddProperty(Constants.HEADER, X_C_Order.COLUMNNAME_C_DocType_ID,		POUtil.getid(X_C_DocType.Table_Name, getOrder().getC_DocType_ID()));
			format.AddProperty(Constants.HEADER, X_C_Order.COLUMNNAME_C_DocTypeTarget_ID,	POUtil.getid(X_C_DocType.Table_Name, getOrder().getC_DocTypeTarget_ID()));
			format.AddProperty(Constants.HEADER, X_C_Order.COLUMNNAME_M_Warehouse_ID, 
					POUtil.getid(X_M_Warehouse.Table_Name, getOrder().getM_Warehouse_ID()));
			format.AddProperty(Constants.HEADER, X_C_Order.COLUMNNAME_Pay_BPartner_ID,	
					POUtil.getid(X_C_BPartner.Table_Name, getOrder().getPay_BPartner_ID()));
			//format.AddProperty(Constants.HEADER, X_C_Order.COLUMNNAME_Bill_BPartner_ID,  
			//		POUtil.getid(X_C_BPartner.Table_Name, getOrder().getBill_BPartner_ID()), 
			//		getname(X_C_BPartner.Table_Name, getOrder().getBill_BPartner_ID()));
			//format.AddProperty(Constants.HEADER,	X_C_Order.COLUMNNAME_Bill_Location_ID, 
			//		POUtil.getid(X_C_BPartner_Location.Table_Name, getOrder().getBill_Location_ID()),
			//		getname(X_C_BPartner_Location.Table_Name, getOrder().getBill_Location_ID()));
			format.AddProperty(Constants.HEADER,	X_C_Order.COLUMNNAME_Bill_User_ID,POUtil.getid(X_AD_User.Table_Name, getOrder().getBill_User_ID()));
			format.AddProperty(Constants.HEADER, X_C_Order.COLUMNNAME_POReference,	getOrder().getPOReference());
			format.AddProperty(Constants.HEADER,	X_C_Order.COLUMNNAME_Description,	getOrder().getDescription());
			format.AddProperty(Constants.HEADER,	X_C_Order.COLUMNNAME_IsDiscountPrinted,	getOrder().isDiscountPrinted() ? "Y" : "N");
			format.AddProperty(Constants.HEADER,	X_C_Order.COLUMNNAME_InvoiceRule,	getOrder().getInvoiceRule());
			format.AddProperty(Constants.HEADER,	X_C_Order.COLUMNNAME_DeliveryRule,	getOrder().getDeliveryRule());
			format.AddProperty(Constants.HEADER,	X_C_Order.COLUMNNAME_PaymentRule,	getOrder().getPaymentRule());
			format.AddProperty(Constants.HEADER,	X_C_Order.COLUMNNAME_FreightCostRule, getOrder().getFreightCostRule());
			format.AddProperty(Constants.HEADER, 	X_C_Order.COLUMNNAME_IsSOTrx, "Y");
			format.AddProperty(Constants.HEADER, 	X_C_Order.COLUMNNAME_IsTaxIncluded, getOrder().isTaxIncluded() ? "Y" : "N");
			format.AddProperty(Constants.HEADER,	X_C_Order.COLUMNNAME_PriorityRule, getOrder().getPriorityRule());
			format.AddProperty(Constants.HEADER,	X_C_Order.COLUMNNAME_DeliveryViaRule, getOrder().getDeliveryViaRule());
			format.AddProperty(Constants.HEADER,	X_C_Order.COLUMNNAME_C_BPartner_Points_ID,	String.valueOf(getOrder().getC_BPartner_Points_ID()));
			// each document created must be a new identifier because the identifier is called in the server
			// in case the process was interrupted by hangout or something.
			format.AddProperty(Constants.HEADER, X_C_Order.COLUMNNAME_Identifier, Util.getUUID());
			format.AddProperty(Constants.HEADER, X_C_POS.COLUMNNAME_C_POS_ID,	POUtil.getid(X_C_POS.Table_Name, getConfig().get_ID()));
			format.AddProperty(Constants.HEADER, X_C_Order.COLUMNNAME_WriteOffAmt, getOrder().getWriteOffAmt().toString());
			format.AddProperty(Constants.HEADER, X_C_Order.COLUMNNAME_WriteOffType, getOrder().getWriteOffType());
			format.AddProperty(Constants.HEADER, Constants.WriteOffName, Util.RefListValue("6848d0e2-1489-4297-b62e-a6e9631fcb83") );
			//
			format.AddProperty(Constants.HEADER, X_C_Order.COLUMNNAME_SerialToInvoice, SerialToInvoice);
			format.AddProperty(Constants.HEADER, X_C_Order.COLUMNNAME_DocumentNoToInvoice, InvoiceDocumentNo);
			//
			format.AddProperty(Constants.HEADER, X_C_Order.COLUMNNAME_DateOrdered, DataSource.get(Constants.COLUMNNAME_Created));
			format.AddProperty(Constants.HEADER, X_A_Machine.COLUMNNAME_A_Machine_ID, Env.getMachine().getIdentifier());
			//
			format.ValidateSection(Constants.HEADER);
			//
			BigDecimal pcash = getAmt(Constants.A_CASH).divide(amounts.get(Constants.A_TOTALNET), 4, BigDecimal.ROUND_HALF_UP);
			BigDecimal pcredit =  getAmt(Constants.A_CREDIT).divide(amounts.get(Constants.A_TOTALNET), 4, BigDecimal.ROUND_HALF_UP);
			BigDecimal ppayment = getAmt(Constants.A_PAY).divide(amounts.get(Constants.A_TOTALNET), 4, BigDecimal.ROUND_HALF_UP);
			BigDecimal pcoupon = getAmt(Constants.A_COUPON).divide(amounts.get(Constants.A_TOTALNET), 4, BigDecimal.ROUND_HALF_UP);
			//format.AddProperty("pay","cash", getAmt(Constants.A_CASH).toString());
			format.AddProperty("pay","cash", pcash.toString());
			format.AddProperty("pay","credit", pcredit.toString());
			format.AddProperty("pay","payment", ppayment.toString());
			format.AddProperty("pay","coupon", pcoupon.toString());
			format.ValidateSection("pay");
			format.AddProperty("currency", X_C_Currency.COLUMNNAME_C_Currency_ID,POUtil.getid(X_C_Currency.Table_Name, getOrder().getC_Currency_ID()));
			format.ValidateSection("currency");
			if (getAmt(Constants.A_CASH).compareTo(BigDecimal.ZERO) > 0) {
				format.AddProperty("cash", X_C_CashBook.COLUMNNAME_C_CashBook_ID, m_cashbook.getIdentifier());
				format.AddProperty("cash", X_C_Order.COLUMNNAME_WriteOffAmt, getOrder().getWriteOffAmt().toString());
				format.AddProperty("cash", X_C_Order.COLUMNNAME_WriteOffType, getOrder().getWriteOffType());
				format.AddProperty("cash", X_C_Cash.COLUMNNAME_C_DocType_ID, POUtil.getid(X_C_DocType.Table_Name, getConfig().getCash_C_DocType_ID()));
				if (getWorkShift().getKey() > 0) {
					format.AddProperty("cash", X_HR_WorkShift.COLUMNNAME_HR_WorkShift_ID, POUtil.getid(X_HR_WorkShift.Table_Name, getWorkShift().getKey()));
				}
				format.AddProperty("cash", Constants.WriteOffName, Util.RefListValue("6848d0e2-1489-4297-b62e-a6e9631fcb83") );
				format.ValidateSection("pay","cash");
			}
			if (getAmt(Constants.A_PAY).compareTo(BigDecimal.ZERO) > 0) {
				format.AddProperty("payment", X_C_Payment.COLUMNNAME_C_Payment_ID, Util.getUUID());
				format.AddProperty("payment", X_C_Payment.COLUMNNAME_C_DocType_ID, "4726b119-513b-498a-b027-70160fae6937"); // ARR				
				format.AddProperty("payment", X_C_Payment.COLUMNNAME_CreditCardNumber, m_payment.getCreditCardNumber());
				format.AddProperty("payment", X_C_Payment.COLUMNNAME_C_BankAccount_ID,POUtil.getid(X_C_BankAccount.Table_Name, m_payment.getC_BankAccount_ID()));
				format.AddProperty("payment", X_C_Payment.COLUMNNAME_TrxType, m_payment.getTrxType());
				format.AddProperty("payment", X_C_Payment.COLUMNNAME_C_BPartner_ID,POUtil.getid(X_C_BPartner.Table_Name, getOrder().getC_BPartner_ID()));
				format.AddProperty("payment", X_C_Payment.COLUMNNAME_CreditCardNumber, m_payment.getCreditCardNumber());
				format.AddProperty("payment", X_C_Payment.COLUMNNAME_C_Currency_ID,POUtil.getid(X_C_Currency.Table_Name, getOrder().getC_Currency_ID()));
				format.AddProperty("payment", X_C_Payment.COLUMNNAME_CreditCardType, m_payment.getCreditCardType());
				format.AddProperty("payment", X_C_Payment.COLUMNNAME_TenderType, m_payment.getTenderType());				
				format.AddProperty("payment", X_C_Payment.COLUMNNAME_CheckNo,m_payment.getCheckNo());
				format.ValidateSection("pay","payment");
			}
			if (getAmt(Constants.A_CREDIT).compareTo(BigDecimal.ZERO) > 0) {

			}
			if (getAmt(Constants.A_COUPON).compareTo(BigDecimal.ZERO) > 0) {
				for (X_C_Coupon coupon:m_Coupons)
				{
					format.AddProperty("coupon", X_C_Coupon.COLUMNNAME_C_BPartner_ID,POUtil.getid(X_C_BPartner.Table_Name, coupon.getC_BPartner_ID()));
					format.AddProperty("coupon", X_C_Coupon.COLUMNNAME_C_Currency_ID,POUtil.getid(X_C_Currency.Table_Name, coupon.getC_Currency_ID()));
					format.AddProperty("coupon", X_C_Coupon.COLUMNNAME_DocumentNo, coupon.getDocumentNo());
					format.AddProperty("coupon", X_C_Coupon.COLUMNNAME_GrandTotal, coupon.getGrandTotal().toString());
					format.ValidateSection("pay","coupon");
				}				
			}
			//
			format.ValidateMessage();
			X_C_POSDocType pdt = new Query(Env.getCtx(), X_C_POSDocType.Table_Name, "C_DocType_ID = ? AND C_POS_ID = ?", null)
			.setParameters(dt.getC_DocType_ID(), getConfig().getC_POS_ID()).first();
			Boolean isorder = pdt.getA_MachinePrinter_ID() > 0 && pdt.getC_PrinterDocumentFormat_ID() > 0;
			if (isorder) {											
				if (getDocNumber() != null)
					InvoiceDocumentNo = getDocNumber();
				if (InvoiceDocumentNo.length() == 0)
				{
					if (dt.getC_DocTypeInvoice_ID() > 0)
					{
						InvoiceDocumentNo = DB.getDocumentNo(dt.getC_DocTypeInvoice_ID(), null, false, null);
						SerialToInvoice = DB.getSQLValueString(	null,"SELECT s.Serial FROM C_DocType t, AD_Sequence s WHERE t.C_DocType_ID=? AND s.AD_Sequence_ID=t.DocNoSequence_ID",
								dt.getC_DocTypeInvoice_ID());
					}
					if (SerialToInvoice == null)
						SerialToInvoice = "";
				}
				X_A_MachinePrinter mp = new Query(Env.getCtx(), X_A_MachinePrinter.Table_Name, "A_MachinePrinter_ID = ?", null)
				.setParameters(pdt.getA_MachinePrinter_ID()).first();
				if (mp != null)
				{
					X_A_Machine machine = new X_A_Machine(Env.getCtx(), mp.getA_Machine_ID(), null);
					PrintWorker pworker = getPrintWorkerMessage();
					pworker.setPrintServer(machine);
					MPrinterDocumentFormat pdf = new MPrinterDocumentFormat(Env.getCtx(), pdt.getC_PrinterDocumentFormat_ID(), null);
					PrintDocument pd = MVELParseFormat.getInstance().parse(pdf);
					//pd.setMessage(getMessage());
					DataSource.getInstance().setModeValue("N");
					pd.setData(DataSource.getInstance());
					pd.setSource(pdt.getSource());
					Iterator iter = baseamounts.keySet().iterator();
					while (iter.hasNext())
					{
						Integer key = (Integer) iter.next();
						BigDecimal baseamount = (BigDecimal) baseamounts.get(key);
						if (baseamount.compareTo(BigDecimal.ZERO) > 0)
						{				
							MTax tax = MTax.get(Env.getCtx(), key);
							MTaxCategory taxcat = new MTaxCategory(Env.getCtx(), tax.getC_TaxCategory_ID(), null);
							pd.addeachvar(X_C_TaxCategory.COLUMNNAME_C_TaxCategory_ID,taxcat.getName());
							pd.addeachvar(X_C_InvoiceTax.COLUMNNAME_TaxBaseAmt,baseamount.toString());
						}
					}
					Iterator iter2 = taxamounts.keySet().iterator();
					while (iter2.hasNext())
					{
						Integer key = (Integer) iter2.next();
						BigDecimal taxamount = (BigDecimal) taxamounts.get(key);
						if (taxamount.compareTo(BigDecimal.ZERO) > 0)
						{				
							MTax tax = MTax.get(Env.getCtx(), key);
							pd.addeachvar(X_C_Tax.COLUMNNAME_C_Tax_ID,tax.getName());
							pd.addeachvar(X_C_InvoiceTax.COLUMNNAME_TaxAmt,taxamount.toString());
						}
					}		
					error = pworker.setPrintDocument(pd);						
					if (error.length() > 0) {
						throw new Exception(error);
					}
					pworker.setQueueName(mp.getQueueName());
					error = pworker.Print(PrintWorker.ReceiveJob);
				}
				else
				{
					throw new Exception(String.format("no se definio impresora para %s ",dt.getName()));
				}
			}
			if (error.length() == 0) {															 
				if (getAmt(Constants.A_CREDIT).compareTo(BigDecimal.ZERO) > 0) {						
					error = printCreditWorker();
					if (error.length() != 0)
						throw new Exception(error);
				}
			} else
				throw new Exception(error);
			error = SendMessage();
			if (error.length() > 0)
				throw new Exception(error);
		} catch (Exception e) {
			e.printStackTrace();
			error = e.getMessage();
		}		
		return error;
	}

	//	public String transaction2() {
	//		String error = "";
	//		try {			
	//			MDocType dt = MDocType.get(Env.getCtx(), getOrder().getC_DocTypeTarget_ID());
	//			X_C_POSDocType pdt = new Query(Env.getCtx(), X_C_POSDocType.Table_Name, "C_DocType_ID = ? AND C_POS_ID = ?", null)
	//			.setParameters(dt.getC_DocType_ID(), getConfig().getC_POS_ID()).first();			
	//			// verify format printer
	//			MDocType dtinv = null;
	//			Boolean isorder = false;
	//			if (dt.getC_DocTypeInvoice_ID() > 0) {
	//				dtinv = new Query(Env.getCtx(), X_C_DocType.Table_Name, "C_DocType_ID = ?", null)
	//				.setParameters(dt.getC_DocTypeInvoice_ID()).first();
	//				if (dtinv != null) {
	//					isorder = dtinv.isPrintOnComplete(); 
	//				}
	//			}
	//			//else 
	//			//{
	//			//	isorder = dt.isPrintOnComplete();
	//			//}
	//			//isorder = pdt.isOrder();
	//			isorder = false;
	//			// verify print format
	//			if (!isorder)
	//			{
	//				if (dtinv != null)
	//				{
	//					X_C_PrinterDocumentFormat df = new Query(Env.getCtx(), X_C_PrinterDocumentFormat.Table_Name, "C_PrinterDocumentFormat_ID = ?", null)
	//					.setParameters(dtinv.getC_PrinterDocumentFormat_ID()).first();
	//					if (df == null) {
	//						throw new Exception(String.format("no se definio formato de impresion %s", dtinv.getName()));
	//					}
	//					X_A_MachinePrinter mp = new Query(Env.getCtx(), X_A_MachinePrinter.Table_Name, "A_MachinePrinter_ID = ?", null)
	//					.setParameters(dtinv.getA_MachinePrinter_ID()).first();
	//					if (mp == null)	{
	//						throw new Exception(String.format("no se definio impresora para %s ",dtinv.getName()));
	//					}
	//				}
	//			}						
	//			// verify message format
	//			MMessageFormat format = getMessage();
	//			if (format == null) {
	//				throw new Exception(String.format("el tipo de documento %s no tiene definido un formato de mensaje",dt.getName()));
	//			} else {
	//				format.getDocument();
	//			}
	//			format.startMessage();
	//			MCurrency currency = MCurrency.get(Env.getCtx(), getOrder().getC_Currency_ID());
	//			Timestamp actual = new Timestamp(System.currentTimeMillis());			
	//			MPriceList pl = MPriceList.get(Env.getCtx(), getOrder().getM_PriceList_ID(), null);
	//
	//			String TaxID = MBPartner.get(Env.getCtx(), getOrder().getC_BPartner_ID()).getTaxID();
	//			String AmountInText = Msg.getAmtInWords(Env.getLanguage(Env.getCtx()), amounts.get(Constants.A_TOTALNET).toString()).concat(" ").concat(currency.getDescription());
	//
	//			ObjectViewModel adapter = view.getDataModel();
	//			for (int line=0;line < adapter.getRowCount(); line++)				
	//			{
	//				Row row = (Row) adapter.getRowObject(line);	
	//				if (row.getM_Product_ID() == 0 && row.getQtyOrdered().compareTo(Env.ZERO) == 0) {
	//					continue;
	//				}
	//				MUOM uom = MUOM.get(Env.getCtx(), row.getC_UOM_ID());
	//
	//				format.AddProperty("item",X_C_OrderLine.COLUMNNAME_M_Product_ID, row.getProduct().getValue());
	//				format.AddProperty("item",X_M_Product.COLUMNNAME_M_AttributeSet_ID, POUtil.getid(X_M_AttributeSet.Table_Name,row.getM_AttributeSet_ID()));
	//				format.AddProperty("item",X_C_OrderLine.COLUMNNAME_PriceActual, row.getPriceActual().toString());
	//				format.AddProperty("item",X_C_OrderLine.COLUMNNAME_PriceList, row.getPriceList().toString());
	//				format.AddProperty("item",X_C_OrderLine.COLUMNNAME_PriceLimit, row.getPriceLimit().toString());
	//				format.AddProperty("item",X_C_OrderLine.COLUMNNAME_PriceEntered, row.getPriceEntered().toString());
	//				format.AddProperty("item",X_C_OrderLine.COLUMNNAME_QtyOrdered, row.getQtyOrdered().toString());
	//				format.AddProperty("item",X_C_OrderLine.COLUMNNAME_QtyEntered, row.getQtyEntered().toString());
	//				format.AddProperty("item",X_C_OrderLine.COLUMNNAME_PriceBase, row.getPriceBase().toString());
	//				format.AddProperty("item",X_C_OrderLine.COLUMNNAME_Discount, row.getDiscount().toString());
	//				format.AddProperty("item",X_C_OrderLine.COLUMNNAME_Discount1, row.getDiscount1().toString());
	//				format.AddProperty("item",X_C_OrderLine.COLUMNNAME_Discount2, row.getDiscount2().toString());
	//				format.AddProperty("item",X_C_OrderLine.COLUMNNAME_Discount3, row.getDiscount3().toString());
	//				format.AddProperty("item",X_C_OrderLine.COLUMNNAME_Discount4, row.getDiscount4().toString());
	//				format.AddProperty("item",X_C_OrderLine.COLUMNNAME_M_AttributeSetInstance_ID,POUtil.getid(X_M_AttributeSetInstance.Table_Name, row.getM_AttributeSetInstance_ID()));
	//				//format.AddProperty("item",X_C_OrderLine.COLUMNNAME_Ref_AttributeSetInstance_ID,POUtil.getid(X_M_AttributeSetInstance.Table_Name, row.getRef_AttributeSetInstance_ID()));					
	//				format.AddProperty("item",X_C_OrderLine.COLUMNNAME_IsBonus,row.IsBonus() ? "Y" : "N");
	//				format.AddProperty("item",X_C_OrderLine.COLUMNNAME_C_Tax_ID,POUtil.getid(X_C_Tax.Table_Name, row.getC_Tax_ID()));
	//				format.AddProperty("item",X_C_OrderLine.COLUMNNAME_C_UOM_ID, uom.getIdentifier(), uom.getUOMSymbol());
	//				format.AddProperty("item",X_C_OrderLine.COLUMNNAME_C_CampaignBonus_ID,POUtil.getid(X_C_CampaignBonus.Table_Name, row.getC_CampaignBonus_ID()));
	//				format.AddProperty("item",X_C_OrderLine.COLUMNNAME_C_CampaignDiscount_ID,POUtil.getid(X_C_CampaignDiscount.Table_Name, row.getC_CampaignDiscount_ID()));
	//				format.AddProperty("item",X_C_OrderLine.COLUMNNAME_LineNetAmt, row.getTotal().toString());
	//				format.AddProperty("item",X_M_Product.COLUMNNAME_ShortName,row.getProduct().getShortName());
	//				format.AddProperty("item",X_C_OrderLine.COLUMNNAME_PriceEntered, row.getPriceEntered().toString());
	//				//format.AddProperty("item",X_C_OrderLine.COLUMNNAME_Identifier, Util.getUUID());				
	//				format.AddProperty("item",X_C_OrderLine.COLUMNNAME_C_OrderLine_ID, Util.getUUID());
	//				format.ValidateSection("item");				
	//			}
	//			format.AddProperty("client", Constants.COLUMNNAME_AD_Client_ID,POUtil.getid(X_AD_Client.Table_Name, Env.getAD_Client_ID(Env.getCtx())));
	//			format.ValidateSection("client");
	//			format.AddProperty("org", Constants.COLUMNNAME_AD_Org_ID,POUtil.getid(X_AD_Org.Table_Name, Env.getAD_Org_ID(Env.getCtx())));
	//			format.ValidateSection("org");
	//			//
	//			//format.AddProperty(Constants.HEADER,"version","2.0");
	//			//format.AddProperty("Header", "id", Util.getUUID());
	//			format.AddProperty(Constants.HEADER, X_C_Order.COLUMNNAME_C_Order_ID, Util.getUUID());
	//			format.AddProperty(Constants.HEADER, Constants.COLUMNNAME_AD_Client_ID,POUtil.getid(X_AD_Client.Table_Name,Env.getAD_Client_ID(Env.getCtx())));
	//			format.AddProperty(Constants.HEADER, Constants.COLUMNNAME_AD_Org_ID,POUtil.getid(X_AD_Org.Table_Name, Env.getAD_Org_ID(Env.getCtx())));
	//			format.AddProperty(Constants.HEADER, X_C_Order.COLUMNNAME_C_Currency_ID, currency.getIdentifier());
	//			format.AddProperty(Constants.HEADER, Constants.AD_User_ID,POUtil.getid(X_AD_User.Table_Name, Env.getAD_User_ID(Env.getCtx())));			
	//			format.AddProperty(Constants.HEADER, Constants.COLUMNNAME_Created, actual.toString().substring(0, 16));
	//			format.AddProperty(Constants.HEADER, X_C_Order.COLUMNNAME_SalesRep_ID, POUtil.getid(X_AD_User.Table_Name,getOrder().getSalesRep_ID()), getname(X_AD_User.Table_Name, getOrder().getSalesRep_ID()));
	//			format.AddProperty(Constants.HEADER, X_C_Order.COLUMNNAME_C_BPartner_ID,POUtil.getid(X_C_BPartner.Table_Name, getOrder().getC_BPartner_ID()),	getname(X_C_BPartner.Table_Name, getOrder().getC_BPartner_ID()));
	//			format.AddProperty(Constants.HEADER, X_C_Order.COLUMNNAME_C_BPartner_Location_ID,POUtil.getid(X_C_BPartner_Location.Table_Name, getOrder().getC_BPartner_Location_ID()), 
	//					getname(X_C_BPartner_Location.Table_Name, getOrder().getC_BPartner_Location_ID()) );
	//			if (TaxID == null)
	//				TaxID = "";
	//			format.AddProperty(Constants.HEADER, X_C_BPartner.COLUMNNAME_TaxID, TaxID);
	//			format.AddProperty(Constants.HEADER, X_C_Order.COLUMNNAME_GrandTotal, amounts.get(Constants.A_TOTALNET).toString());
	//			format.AddProperty(Constants.HEADER, X_C_Order.COLUMNNAME_DifferenceAmt, getOrder().getDifferenceAmt().toString());
	//			format.AddProperty(Constants.HEADER, X_C_Order.COLUMNNAME_DebtAmt, getOrder().getDebtAmt().toString());
	//			format.AddProperty(Constants.HEADER, X_C_Order.COLUMNNAME_PrinterSerial, getConfig().getPrinterSerial());
	//			MPaymentTerm pt = new MPaymentTerm(Env.getCtx(), getOrder().getC_PaymentTerm_ID(), null);
	//			format.AddProperty(Constants.HEADER, X_C_Order.COLUMNNAME_C_PaymentTerm_ID,	POUtil.getid(X_C_PaymentTerm.Table_Name, pt.getC_PaymentTerm_ID()));			
	//			format.AddProperty(Constants.HEADER, "AmountInText", AmountInText);
	//			format.AddProperty(Constants.HEADER, X_C_Order.COLUMNNAME_M_PriceList_ID, pl.getIdentifier());
	//			format.AddProperty(Constants.HEADER, X_C_Order.COLUMNNAME_C_DocType_ID,		POUtil.getid(X_C_DocType.Table_Name, getOrder().getC_DocType_ID()));
	//			format.AddProperty(Constants.HEADER, X_C_Order.COLUMNNAME_C_DocTypeTarget_ID,	POUtil.getid(X_C_DocType.Table_Name, getOrder().getC_DocTypeTarget_ID()));
	//			format.AddProperty(Constants.HEADER, X_C_Order.COLUMNNAME_M_Warehouse_ID, 
	//					POUtil.getid(X_M_Warehouse.Table_Name, getOrder().getM_Warehouse_ID()));
	//			format.AddProperty(Constants.HEADER, X_C_Order.COLUMNNAME_Pay_BPartner_ID,	
	//					POUtil.getid(X_C_BPartner.Table_Name, getOrder().getPay_BPartner_ID()));
	//			format.AddProperty(Constants.HEADER, X_C_Order.COLUMNNAME_Bill_BPartner_ID,  
	//					POUtil.getid(X_C_BPartner.Table_Name, getOrder().getBill_BPartner_ID()), 
	//					getname(X_C_BPartner.Table_Name, getOrder().getBill_BPartner_ID()));
	//			format.AddProperty(Constants.HEADER,	X_C_Order.COLUMNNAME_Bill_Location_ID, 
	//					POUtil.getid(X_C_BPartner_Location.Table_Name, getOrder().getBill_Location_ID()),
	//					getname(X_C_BPartner_Location.Table_Name, getOrder().getBill_Location_ID()));
	//			format.AddProperty(Constants.HEADER,	X_C_Order.COLUMNNAME_Bill_User_ID,POUtil.getid(X_AD_User.Table_Name, getOrder().getBill_User_ID()));
	//			format.AddProperty(Constants.HEADER, X_C_Order.COLUMNNAME_POReference,	getOrder().getPOReference());
	//			format.AddProperty(Constants.HEADER,	X_C_Order.COLUMNNAME_Description,	getOrder().getDescription());
	//			format.AddProperty(Constants.HEADER,	X_C_Order.COLUMNNAME_IsDiscountPrinted,	getOrder().isDiscountPrinted() ? "Y" : "N");
	//			format.AddProperty(Constants.HEADER,	X_C_Order.COLUMNNAME_InvoiceRule,	getOrder().getInvoiceRule());
	//			format.AddProperty(Constants.HEADER,	X_C_Order.COLUMNNAME_DeliveryRule,	getOrder().getDeliveryRule());
	//			format.AddProperty(Constants.HEADER,	X_C_Order.COLUMNNAME_PaymentRule,	getOrder().getPaymentRule());
	//			format.AddProperty(Constants.HEADER,	X_C_Order.COLUMNNAME_FreightCostRule, getOrder().getFreightCostRule());
	//			format.AddProperty(Constants.HEADER, 	X_C_Order.COLUMNNAME_IsSOTrx, "Y");
	//			format.AddProperty(Constants.HEADER, 	X_C_Order.COLUMNNAME_IsTaxIncluded, getOrder().isTaxIncluded() ? "Y" : "N");
	//			format.AddProperty(Constants.HEADER,	X_C_Order.COLUMNNAME_PriorityRule, getOrder().getPriorityRule());
	//			format.AddProperty(Constants.HEADER,	X_C_Order.COLUMNNAME_DeliveryViaRule, getOrder().getDeliveryViaRule());
	//			format.AddProperty(Constants.HEADER,	X_C_Order.COLUMNNAME_C_BPartner_Points_ID,	String.valueOf(getOrder().getC_BPartner_Points_ID()));
	//			// each document created must be a new identifier because the identifier is called in the server
	//			// in case the process was interrupted by hangout or something.
	//			format.AddProperty(Constants.HEADER, X_C_Order.COLUMNNAME_Identifier, Util.getUUID());
	//			format.AddProperty(Constants.HEADER, X_C_POS.COLUMNNAME_C_POS_ID,	POUtil.getid(X_C_POS.Table_Name, getConfig().get_ID()));
	//			format.AddProperty(Constants.HEADER, X_C_Order.COLUMNNAME_WriteOffAmt, getOrder().getWriteOffAmt().toString());
	//			format.AddProperty(Constants.HEADER, X_C_Order.COLUMNNAME_WriteOffType, getOrder().getWriteOffType());
	//			format.AddProperty(Constants.HEADER, Constants.WriteOffName, Util.RefListValue("6848d0e2-1489-4297-b62e-a6e9631fcb83") );
	//			//
	//			//			
	//			//Boolean printoncomplete = dt.isPrintOnComplete();
	//			String SerialToInvoice = ""; 
	//			InvoiceDocumentNo = "";
	//			if (!isorder) {											
	//				if (getDocNumber() != null)
	//					InvoiceDocumentNo = getDocNumber();
	//				if (InvoiceDocumentNo.length() == 0)
	//				{
	//					if (dt.getC_DocTypeInvoice_ID() > 0)
	//					{
	//						InvoiceDocumentNo = DB.getDocumentNo(dt.getC_DocTypeInvoice_ID(), null, false, null);
	//						SerialToInvoice = DB.getSQLValueString(	null,"SELECT s.Serial FROM C_DocType t, AD_Sequence s WHERE t.C_DocType_ID=? AND s.AD_Sequence_ID=t.DocNoSequence_ID",
	//								dt.getC_DocTypeInvoice_ID());
	//					}
	//					if (SerialToInvoice == null)
	//						SerialToInvoice = "";
	//				}
	//			}
	//			format.AddProperty(Constants.HEADER, X_C_Order.COLUMNNAME_SerialToInvoice, SerialToInvoice, isorder);
	//			format.AddProperty(Constants.HEADER, X_C_Order.COLUMNNAME_DocumentNoToInvoice, InvoiceDocumentNo, isorder);
	//			//
	//			format.AddProperty(Constants.HEADER, X_C_Order.COLUMNNAME_DateOrdered, actual.toString());
	//			format.AddProperty(Constants.HEADER, X_A_Machine.COLUMNNAME_A_Machine_ID, Env.getMachine().getIdentifier());
	//			//
	//			format.ValidateSection(Constants.HEADER);
	//			//
	//			BigDecimal pcash = getAmt(Constants.A_CASH).divide(amounts.get(Constants.A_TOTALNET), 4, BigDecimal.ROUND_HALF_UP);
	//			BigDecimal pcredit =  getAmt(Constants.A_CREDIT).divide(amounts.get(Constants.A_TOTALNET), 4, BigDecimal.ROUND_HALF_UP);
	//			BigDecimal ppayment = getAmt(Constants.A_PAY).divide(amounts.get(Constants.A_TOTALNET), 4, BigDecimal.ROUND_HALF_UP);
	//			BigDecimal pcoupon = getAmt(Constants.A_COUPON).divide(amounts.get(Constants.A_TOTALNET), 4, BigDecimal.ROUND_HALF_UP);
	//			//format.AddProperty("pay","cash", getAmt(Constants.A_CASH).toString());
	//			format.AddProperty("pay","cash", pcash.toString());
	//			format.AddProperty("pay","credit", pcredit.toString());
	//			format.AddProperty("pay","payment", ppayment.toString());
	//			format.AddProperty("pay","coupon", pcoupon.toString());
	//			format.ValidateSection("pay");
	//			format.AddProperty("currency", X_C_Currency.COLUMNNAME_C_Currency_ID,POUtil.getid(X_C_Currency.Table_Name, getOrder().getC_Currency_ID()));
	//			format.ValidateSection("currency");
	//			if (getAmt(Constants.A_CASH).compareTo(BigDecimal.ZERO) > 0) {
	//				format.AddProperty("cash", X_C_CashBook.COLUMNNAME_C_CashBook_ID, m_cashbook.getIdentifier());
	//				format.AddProperty("cash", X_C_Order.COLUMNNAME_WriteOffAmt, getOrder().getWriteOffAmt().toString());
	//				format.AddProperty("cash", X_C_Order.COLUMNNAME_WriteOffType, getOrder().getWriteOffType());
	//				format.AddProperty("cash", X_C_Cash.COLUMNNAME_C_DocType_ID, POUtil.getid(X_C_DocType.Table_Name, getConfig().getCash_C_DocType_ID()));
	//				if (workshift.getKey() > 0) {
	//					format.AddProperty("cash", X_HR_WorkShift.COLUMNNAME_HR_WorkShift_ID, POUtil.getid(X_HR_WorkShift.Table_Name, workshift.getKey()));
	//				}
	//				format.AddProperty("cash", Constants.WriteOffName, Util.RefListValue("6848d0e2-1489-4297-b62e-a6e9631fcb83") );
	//				format.ValidateSection("pay","cash");
	//			}
	//			if (getAmt(Constants.A_PAY).compareTo(BigDecimal.ZERO) > 0) {
	//				format.AddProperty("payment", X_C_Payment.COLUMNNAME_C_Payment_ID, Util.getUUID());
	//				format.AddProperty("payment", X_C_Payment.COLUMNNAME_C_DocType_ID, "4726b119-513b-498a-b027-70160fae6937"); // ARR				
	//				format.AddProperty("payment", X_C_Payment.COLUMNNAME_CreditCardNumber, m_payment.getCreditCardNumber());
	//				format.AddProperty("payment", X_C_Payment.COLUMNNAME_C_BankAccount_ID,POUtil.getid(X_C_BankAccount.Table_Name, m_payment.getC_BankAccount_ID()));
	//				format.AddProperty("payment", X_C_Payment.COLUMNNAME_TrxType, m_payment.getTrxType());
	//				format.AddProperty("payment", X_C_Payment.COLUMNNAME_C_BPartner_ID,POUtil.getid(X_C_BPartner.Table_Name, getOrder().getC_BPartner_ID()));
	//				format.AddProperty("payment", X_C_Payment.COLUMNNAME_CreditCardNumber, m_payment.getCreditCardNumber());
	//				format.AddProperty("payment", X_C_Payment.COLUMNNAME_C_Currency_ID,POUtil.getid(X_C_Currency.Table_Name, getOrder().getC_Currency_ID()));
	//				format.AddProperty("payment", X_C_Payment.COLUMNNAME_CreditCardType, m_payment.getCreditCardType());
	//				format.AddProperty("payment", X_C_Payment.COLUMNNAME_TenderType, m_payment.getTenderType());				
	//				format.AddProperty("payment", X_C_Payment.COLUMNNAME_CheckNo,m_payment.getCheckNo());
	//				format.ValidateSection("pay","payment");
	//			}
	//			if (getAmt(Constants.A_CREDIT).compareTo(BigDecimal.ZERO) > 0) {
	//
	//			}
	//			if (getAmt(Constants.A_COUPON).compareTo(BigDecimal.ZERO) > 0) {
	//				for (X_C_Coupon coupon:m_Coupons)
	//				{
	//					format.AddProperty("coupon", X_C_Coupon.COLUMNNAME_C_BPartner_ID,POUtil.getid(X_C_BPartner.Table_Name, coupon.getC_BPartner_ID()));
	//					format.AddProperty("coupon", X_C_Coupon.COLUMNNAME_C_Currency_ID,POUtil.getid(X_C_Currency.Table_Name, coupon.getC_Currency_ID()));
	//					format.AddProperty("coupon", X_C_Coupon.COLUMNNAME_DocumentNo, coupon.getDocumentNo());
	//					format.AddProperty("coupon", X_C_Coupon.COLUMNNAME_GrandTotal, coupon.getGrandTotal().toString());
	//					format.ValidateSection("pay","coupon");
	//				}				
	//			}
	//			//
	//			format.ValidateMessage();
	//			if (!isorder)
	//			{
	//				if (dtinv != null)
	//				{
	//					X_A_MachinePrinter mp = new Query(Env.getCtx(), X_A_MachinePrinter.Table_Name, "A_MachinePrinter_ID = ?", null)
	//					.setParameters(dtinv.getA_MachinePrinter_ID()).first();
	//					if (mp != null)
	//					{
	//						X_A_Machine machine = new X_A_Machine(Env.getCtx(), mp.getA_Machine_ID(), null);
	//						PrintWorker pworker = getPrintWorkerMessage();
	//						pworker.setPrintServer(machine);
	//						MPrinterDocumentFormat pdf = new MPrinterDocumentFormat(Env.getCtx(), dtinv.getC_PrinterDocumentFormat_ID(), null);
	//						PrintDocument pd = MVELParseFormat.getInstance().parse(pdf);
	//						error = pworker.setPrintDocument(pd);						
	//						//error = pworker.AssignPrinterDocumentFormat(dtinv.getC_PrinterDocumentFormat_ID());
	//						if (error.length() > 0) {
	//							throw new Exception(error);
	//						}
	//						pworker.setQueueName(mp.getQueueName());
	//						error = pworker.Print(PrintWorker.ReceiveJob);
	//					}
	//					else
	//					{
	//						throw new Exception(String.format("no se definio impresora para %s ",dtinv.getName()));
	//					}
	//				}
	//			}
	//			if (error.length() == 0) {															 
	//				if (getAmt(Constants.A_CREDIT).compareTo(BigDecimal.ZERO) > 0) {						
	//					error = printCreditWorker();
	//					if (error.length() != 0)
	//						throw new Exception(error);
	//				}
	//			} else
	//				throw new Exception(error);
	//			error = SendMessage();
	//			if (error.length() > 0)
	//				throw new Exception(error);
	//		} catch (Exception e) {
	//			e.printStackTrace();
	//			error = e.getMessage();
	//		}		
	//		return error;
	//	}



	//	private String getname(String tableName, int uid) {
	//		String name = "";
	//		PO po = new Query(Env.getCtx(), tableName, String.format("%s_ID = ?", tableName), null).setParameters(uid).first();
	//		if (po != null) {
	//			if (po.get_ColumnIndex(X_AD_Client.COLUMNNAME_Name) > 0) {
	//				name = (String) po.get_Value(X_AD_Client.COLUMNNAME_Name);
	//			}			
	//		}
	//		return name;
	//	}

	public BigDecimal getAmt(String key) {
		BigDecimal amt = BigDecimal.ZERO;		
		if (amounts.containsKey(key))
			amt = amounts.get(key);
		return amt;
	}
	public void setAmt(String key, BigDecimal amt) {
		if (key == null || amt == null)
			return;
		amounts.put(key, amt);
		if (PushButtons.get(key) != null)
			PushButtons.get(key).setAmount(amt);
		BigDecimal partial = getTotalPayment();
		if (PushButtons.get(Constants.A_PARTIAL) != null)
			PushButtons.get(Constants.A_PARTIAL).setAmount(partial);		
	}
	public BigDecimal getTotalPayment() {
		BigDecimal totalpay = getAmt(Constants.A_CASH)
				.add(getAmt(Constants.A_PAY))	
				.add(getAmt(Constants.A_CREDIT))
				.add(getAmt(Constants.A_COUPON));		
		return totalpay;		
	}

	private String SendMessage() {
		String error = "";
		try {
			MMessageFormat format = getMessage();
			ledJMSServer.setState(LED.LIGHTGREEN);
			QueueConnectionFactory cf = null;			
			//X_A_Machine machine = Env.getMessageHost(Env.getMachine());
			X_A_Machine machine = null;
			HashMap p = Env.getMachine().getProperties();
			if (p.containsKey(REF_ServerType.MessageServer)) {
				String id = (String) p.get(REF_ServerType.MessageServer);
				X_A_MachineServer ms = new Query(Env.getCtx(), X_A_MachineServer.Table_Name, "A_MachineServer_ID = ?", null)
				.setParameters(Integer.valueOf(id)).first();
				if (ms != null) {
					if (ms.getProperties().containsKey(X_A_Machine.COLUMNNAME_A_Machine_ID)) {
						String mid = (String) ms.getProperties().get(X_A_Machine.COLUMNNAME_A_Machine_ID);
						X_A_Machine m = new Query(Env.getCtx(), X_A_Machine.Table_Name, "A_Machine_ID = ?", null)
						.setParameters(Integer.valueOf(mid)).first();
						machine = m;
					}
				}
			}
			queue = (Queue) CConnection.get().lookup(machine.getName(), Constants.QPOSQUEUE);
			cf = (QueueConnectionFactory) CConnection.get().lookup(	machine.getName(), Constants.QConnectionFactory);
			QueueConnection connection = cf.createQueueConnection();
			connection.start();
			QueueSession session = connection.createQueueSession(false,	Session.AUTO_ACKNOWLEDGE);
			coreSession = ((HornetQSession) session).getCoreSession();
			coreSession.setSendAcknowledgementHandler(this);
			ledJMSServer.setState(LED.GREEN);
			String id = Util.getUUID();
			TextMessage request = session.createTextMessage(format.getValidMessage());
			//request.setStringProperty(org.hornetq.core.message.impl.MessageImpl.HDR_DUPLICATE_DETECTION_ID.toString(), id);
			//request.setStringProperty("type", "pos");
			request.setStringProperty(X_A_Xendrian_Message.COLUMNNAME_Identifier, id);
			//request.setStringProperty("replicationtype", "L");
			MessageProducer sender = null;
			sender = session.createProducer(queue);
			sender.send(request);
			connection.close();
		} catch (Exception e) {
			error = e.getMessage();
		}
		return error;
	}
	public void sendAcknowledged(Message message) {
		try {
			if (!documents.containsKey(String.valueOf(getOrder().getC_DocTypeTarget_ID()))) {
				// xapiens
			}
			synchronized (this) {
				String id = message.getStringProperty("id");
				Iterator<Object[]> iter = m_SendWithoutACK.iterator();
				while (iter.hasNext()) {
					Object[] msg = iter.next();
					//
					if (msg[0].equals(id)) {
						String file = Ini.getXendraHome() + File.separator + id
								+ ".sales";
						File f = new File(file);
						if (f.exists())
							f.delete();
						iter.remove();
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	public String printCreditWorker() {
		String error = "";
		X_C_PrinterFormat pf = new Query(Env.getCtx(), X_C_PrinterFormat.Table_Name, "AD_Table_ID = ? AND Record_ID = ? AND Value = ?", null)
		.setParameters(X_C_POS.Table_ID, getConfig().getC_POS_ID(), MachineCreator.POSCreditFormat).first();
		if (pf.getC_PrinterDocumentFormat_ID() > 0)
		{	
			X_A_MachinePrinter mp = new X_A_MachinePrinter(Env.getCtx(), pf.getA_MachinePrinter_ID(), null);
			X_A_Machine machine = new X_A_Machine(Env.getCtx(), mp.getA_Machine_ID(), null);
			PrintWorker pworker = new PrintWorker(machine);
			MPrinterDocumentFormat pdf = new MPrinterDocumentFormat(Env.getCtx(), pf.getC_PrinterDocumentFormat_ID(), null);
			PrintDocument pd = MVELParseFormat.getInstance().parse(pdf);
			//pf.getSource();
			pd.setSource(pf.getSource());
			Map context = new HashMap();
			context.put("pd", pd);
			context.put("source", DataSource.getInstance());			
			ExecutableStatement stmt = (ExecutableStatement) MVEL.compileExpression(pd.getSource());
			MVEL.executeExpression(stmt, context);
			pd.setSource("");
			error = pworker.setPrintDocument(pd);						
			if (error.length() > 0) {
				//throw new Exception(error);
			}
			pworker.setQueueName(mp.getQueueName());
			error = pworker.Print(PrintWorker.ReceiveJob);
			//getMessage().getData("Header0", X_C_Order.COLUMNNAME_SalesRep_ID, true);
			//WorkerCredit wc = new WorkerCredit(pf);
			//			wc.setSalesRep_ID(getMessage().getData("Header0", X_C_Order.COLUMNNAME_SalesRep_ID, true));
			//			wc.setC_BPartner_ID(getMessage().getData("Header0", X_C_Order.COLUMNNAME_C_BPartner_ID, true));
			//			wc.setGrandTotal(getMessage().getData("Header0", X_C_Order.COLUMNNAME_GrandTotal, true));			
			//			wc.setDifferenceAmt(getMessage().getData("Header0", X_C_Order.COLUMNNAME_DifferenceAmt));
			//			wc.setPrinterSerial(getMessage().getData("Header0", X_C_Order.COLUMNNAME_PrinterSerial));
			//			wc.setMachineSerial(getMessage().getData("Header0", X_C_Order.COLUMNNAME_MachineSerial));
			//			wc.setC_PaymentTerm_ID(getMessage().getData("Header0", X_C_Order.COLUMNNAME_C_PaymentTerm_ID, true));
			//			wc.setSerialToInvoice(getMessage().getData("Header0", X_C_Order.COLUMNNAME_SerialToInvoice));
			//			wc.setDocumentNoToInvoice(getMessage().getData("Header0", X_C_Order.COLUMNNAME_DocumentNoToInvoice));
			//error = wc.print();
		}				
		return error;
	}

	public PrintWorker getPrintWorkerMessage() {
		PrintWorker pw = new PrintWorker();
		pw.setJobName(getMessage().getProperty(Constants.HEADER,	X_C_Order.COLUMNNAME_DocumentNoToInvoice));		
		//		pw.setVariable(Constants.COLUMNNAME_Created, getMessage().getData("Header0", Constants.COLUMNNAME_Created));
		List<org.jdom.Element> header = getMessage().get(Constants.HEADER);
		Iterator it = header.iterator();
		while (it.hasNext()) {
			org.jdom.Element p = (org.jdom.Element) it.next();
			pw.setVariable(Constants.COLUMNNAME_Created, p.getAttributeValue(Constants.COLUMNNAME_Created));
			pw.setVariable(X_C_Order.COLUMNNAME_SalesRep_ID, p.getAttributeValue(X_C_Order.COLUMNNAME_SalesRep_ID));
			pw.setVariable(X_C_Order.COLUMNNAME_C_BPartner_ID, p.getAttributeValue(X_C_Order.COLUMNNAME_C_BPartner_ID));
			pw.setVariable(X_C_Order.COLUMNNAME_C_BPartner_Location_ID, p.getAttributeValue(X_C_Order.COLUMNNAME_C_BPartner_Location_ID));
			pw.setVariable(X_C_BPartner.COLUMNNAME_TaxID, p.getAttributeValue(X_C_BPartner.COLUMNNAME_TaxID));
			pw.setVariable(X_C_Order.COLUMNNAME_GrandTotal, p.getAttributeValue(X_C_Order.COLUMNNAME_GrandTotal));
			pw.setVariable(X_C_Order.COLUMNNAME_DifferenceAmt, p.getAttributeValue(X_C_Order.COLUMNNAME_DifferenceAmt));
			pw.setVariable(X_C_Order.COLUMNNAME_DebtAmt, p.getAttributeValue(X_C_Order.COLUMNNAME_DebtAmt));
			pw.setVariable(X_C_Order.COLUMNNAME_PrinterSerial, p.getAttributeValue(X_C_Order.COLUMNNAME_PrinterSerial));
			pw.setVariable(X_C_Order.COLUMNNAME_MachineSerial, p.getAttributeValue(X_C_Order.COLUMNNAME_MachineSerial));
			pw.setVariable(X_C_Order.COLUMNNAME_C_PaymentTerm_ID, p.getAttributeValue(X_C_Order.COLUMNNAME_C_PaymentTerm_ID));
			pw.setVariable("AmountInText", p.getAttributeValue("AmountInText"));
			pw.setVariable("SubTotal", p.getAttributeValue("SubTotal"));
			pw.setVariable(X_C_OrderLine.COLUMNNAME_C_Tax_ID, p.getAttributeValue(X_C_OrderLine.COLUMNNAME_C_Tax_ID));
			pw.setVariable(X_C_Order.COLUMNNAME_SerialToInvoice, p.getAttributeValue(X_C_Order.COLUMNNAME_SerialToInvoice));
			pw.setVariable(X_C_Order.COLUMNNAME_DocumentNoToInvoice, p.getAttributeValue(X_C_Order.COLUMNNAME_DocumentNoToInvoice));

			pw.setVariable(X_C_Order.COLUMNNAME_WriteOffAmt, p.getAttributeValue(X_C_Order.COLUMNNAME_WriteOffAmt));
			pw.setVariable(Constants.WriteOffName, p.getAttributeValue(Constants.WriteOffName));
		}

		//		pw.setVariable(X_C_Order.COLUMNNAME_SalesRep_ID, getMessage().getData("Header0", X_C_Order.COLUMNNAME_SalesRep_ID, true));
		//		pw.setVariable(X_C_Order.COLUMNNAME_C_BPartner_ID, getMessage().getData("Header0", X_C_Order.COLUMNNAME_C_BPartner_ID, true));
		//		pw.setVariable(X_C_Order.COLUMNNAME_C_BPartner_Location_ID, getMessage().getData("Header0", X_C_Order.COLUMNNAME_C_BPartner_Location_ID, true));
		//		pw.setVariable(X_C_BPartner.COLUMNNAME_TaxID, getMessage().getData("Header0", X_C_BPartner.COLUMNNAME_TaxID));
		//		pw.setVariable(X_C_Order.COLUMNNAME_GrandTotal, getMessage().getData("Header0", X_C_Order.COLUMNNAME_GrandTotal));
		//		pw.setVariable(X_C_Order.COLUMNNAME_DifferenceAmt, getMessage().getData("Header0", X_C_Order.COLUMNNAME_DifferenceAmt));
		//		pw.setVariable(X_C_Order.COLUMNNAME_DebtAmt, getMessage().getData("Header0", X_C_Order.COLUMNNAME_DebtAmt));
		//		pw.setVariable(X_C_Order.COLUMNNAME_PrinterSerial, getMessage().getData("Header0", X_C_Order.COLUMNNAME_PrinterSerial));
		//		pw.setVariable(X_C_Order.COLUMNNAME_MachineSerial, getMessage().getData("Header0", X_C_Order.COLUMNNAME_MachineSerial));
		//		pw.setVariable(X_C_Order.COLUMNNAME_C_PaymentTerm_ID, getMessage().getData("Header0", X_C_Order.COLUMNNAME_C_PaymentTerm_ID, true));
		//		pw.setVariable("AmountInText", getMessage().getData("Header0", "AmountInText"));
		//		pw.setVariable("SubTotal",getMessage().getData("Header0", "SubTotal"));
		//		pw.setVariable(X_C_OrderLine.COLUMNNAME_C_Tax_ID, getMessage().getData("Header0", X_C_OrderLine.COLUMNNAME_C_Tax_ID, true));
		//		pw.setVariable(X_C_Order.COLUMNNAME_SerialToInvoice, getMessage().getData("Header0", X_C_Order.COLUMNNAME_SerialToInvoice));
		//		pw.setVariable(X_C_Order.COLUMNNAME_DocumentNoToInvoice, getMessage().getData("Header0", X_C_Order.COLUMNNAME_DocumentNoToInvoice));
		// obscure card number
		String cardnumber = (String) getMessage().getProperty(Constants.HEADER, X_C_Payment.COLUMNNAME_CreditCardNumber);
		if (cardnumber == null)
			cardnumber = "";
		if (cardnumber.length() > 0)
			cardnumber = Obscure.obscure(cardnumber,REF_AD_FieldObscureType.ObscureDigitsButLast4);
		pw.AddProperty(X_C_Payment.COLUMNNAME_CreditCardNumber, cardnumber);

		//		pw.setVariable(Constants.WriteOffName, getMessage().getData("Header0", Constants.WriteOffName));
		//		pw.setVariable(X_C_Order.COLUMNNAME_WriteOffAmt, getMessage().getData("Header0", X_C_Order.COLUMNNAME_WriteOffAmt));	
		int lines = getMessage().getCounts("item");
		List<org.jdom.Element> items = getMessage().get("item");
		it = items.iterator();
		while (it.hasNext()) {
			org.jdom.Element p = (org.jdom.Element) it.next();
			pw.setVariableLine(X_C_OrderLine.COLUMNNAME_M_Product_ID,p.getAttributeValue(X_C_OrderLine.COLUMNNAME_M_Product_ID));
			pw.setVariableLine(X_C_OrderLine.COLUMNNAME_QtyEntered, p.getAttributeValue(X_C_OrderLine.COLUMNNAME_QtyEntered));
			pw.setVariableLine(X_C_OrderLine.COLUMNNAME_C_UOM_ID, p.getAttributeValue(X_C_OrderLine.COLUMNNAME_C_UOM_ID));
			pw.setVariableLine(X_C_OrderLine.COLUMNNAME_PriceEntered, p.getAttributeValue(X_C_OrderLine.COLUMNNAME_PriceEntered));
			pw.setVariableLine(X_C_OrderLine.COLUMNNAME_LineNetAmt, p.getAttributeValue(X_C_OrderLine.COLUMNNAME_LineNetAmt));
		}
		//Integer lines = getMessage().getSectionCount(Constants.LINES);
		for (int i = 1; i <= lines; i++) {
			String lineno = String.format("Line%d", i);
			//			pw.setVariableLine(X_C_OrderLine.COLUMNNAME_M_Product_ID, getMessage().getData(String.format("item%s", i), X_C_OrderLine.COLUMNNAME_M_Product_ID, true));
			//			pw.setVariableLine(X_C_OrderLine.COLUMNNAME_QtyEntered, getMessage().getData(String.format("item%s", i), X_C_OrderLine.COLUMNNAME_QtyEntered));
			//			pw.setVariableLine(X_C_OrderLine.COLUMNNAME_C_UOM_ID, getMessage().getData(String.format("item%s", i), X_C_OrderLine.COLUMNNAME_C_UOM_ID, true));
			//			pw.setVariableLine(X_C_OrderLine.COLUMNNAME_PriceEntered, getMessage().getData(String.format("item%s", i), X_C_OrderLine.COLUMNNAME_PriceEntered));
			//			pw.setVariableLine(X_C_OrderLine.COLUMNNAME_LineNetAmt, getMessage().getData(String.format("item%s", i), X_C_OrderLine.COLUMNNAME_LineNetAmt));
		}		
		Iterator iter = baseamounts.keySet().iterator();
		while (iter.hasNext())
		{
			Integer key = (Integer) iter.next();
			BigDecimal baseamount = (BigDecimal) baseamounts.get(key);
			if (baseamount.compareTo(BigDecimal.ZERO) > 0)
			{				
				MTax tax = MTax.get(Env.getCtx(), key);
				MTaxCategory taxcat = new MTaxCategory(Env.getCtx(), tax.getC_TaxCategory_ID(), null);
				pw.AddPropertyLine(X_C_TaxCategory.COLUMNNAME_C_TaxCategory_ID,taxcat.getName());
				pw.AddPropertyLine(X_C_InvoiceTax.COLUMNNAME_TaxBaseAmt,baseamount);
			}
		}
		Iterator iter2 = taxamounts.keySet().iterator();
		while (iter2.hasNext())
		{
			Integer key = (Integer) iter2.next();
			BigDecimal taxamount = (BigDecimal) taxamounts.get(key);
			if (taxamount.compareTo(BigDecimal.ZERO) > 0)
			{				
				MTax tax = MTax.get(Env.getCtx(), key);
				pw.AddPropertyLine(X_C_Tax.COLUMNNAME_C_Tax_ID,tax.getName());
				pw.AddPropertyLine(X_C_InvoiceTax.COLUMNNAME_TaxAmt,taxamount);
			}
		}		
		return pw;
	}


	private void addLine(Row row) {
		lines.add(row);
	}

	public String replacevars(String content, Element elem,
			Map<Integer, String> headervars) {
		String first = content;
		ArrayList<String> vars = new ArrayList<String>();

		while (first.contains("<")) {
			String var = first.substring(first.indexOf('<') + 1,
					first.indexOf('>'));
			vars.add(var);
			first = first.substring(first.indexOf('>') + 1);
		}

		for (String var : vars) {
			String value = Util.getattrStr(elem, var);
			if (headervars.containsKey(value)) {
				value = headervars.get(value);
				content = content.replace('<' + var + '>', value);
			}
		}
		return content;
	}

	public String process() {
		String error = "";
		//m_Difference = pDifference;
		//m_Debt = pDebt;
		error = beforetransaction();
		if (error.length() == 0) {
			//purgeorderlinesdeleted(null);
			datasource();
			error = transaction();
			// setInfo(getProcessMsg());
			if (error.length() > 0) {
				if (m_showdialoginfo)
					//ADialog.error(m_WindowNo, null, error);
					showErrorPanel(error);
			} else {
				if (getInfo().length() > 0 && m_showdialoginfo)
					//ADialog.info(m_WindowNo, null, getInfo());
					showErrorPanel(getInfo());
				statusBar.setStatusLine(".", false);
				Void();
			}
		}
		return error;
	}

	private String beforetransaction() {
		error = "";
		error = TestQueue();
		error += this.StockNoAvailable();
		error += this.AmountisZero();
		return error;
	}

	private String AmountisZero() {
		String error = "";
		if (getAmt(Constants.A_TOTALNET).compareTo(BigDecimal.ZERO) <= 0) {
			error = "el monto no puede ser igual o menor a 0";
		}
		return error;
	}

	public void InsertKey() {
		DialogInputQty dialog = new DialogInputQty(getFrame());
		dialog.pack();
		dialog.setLocationRelativeTo(getFrame());
		dialog.setVisible(true);
		m_QtyBySelection = dialog.getQtyEntered();
		view.requestFocus();
	}

	public void HomeKey() {
		DialogInputID dialog = new DialogInputID(getFrame(), view);
		dialog.pack();
		dialog.setLocationRelativeTo(getFrame());
		dialog.setVisible(true);
		if (dialog.getFoundRow() > 0) {
			int found = dialog.getFoundRow();
			view.setRowSelectionInterval(found - 1, found - 1);
			int mDefault = ((DefaultObjectViewModel) view.getDataModel())
					.getPosition("Default");
			view.setColumnSelectionInterval(mDefault, mDefault);
		}
		view.requestFocus();
	}

	//	private void purgeorderlinesdeleted(String trxname) {
	//		for (int j = 0; j < orderlinetoDel.size(); j++) {
	//			Integer C_OrderLine_ID = orderlinetoDel.get(j);
	//			if (C_OrderLine_ID != 0) {
	//				MOrderLine ol = new MOrderLine(Env.getCtx(), C_OrderLine_ID,
	//						trxname);
	//				if (ol.delete(true))
	//					orderlinetoDel.remove(j);
	//			}
	//		}
	//	}

	//	public void setstatusBarInfo(String msg) {
	//		statusBar.setInfo(msg);
	//		statusBar.repaint();
	//	}

	@SuppressWarnings("deprecation")
	public void init(int windowNo, FormFrame frame) {
		AppsActions.put(Constants.T_LOAD, new AppsAction(Constants.T_LOAD, KeyStroke.getKeyStroke(KeyEvent.VK_F3, 0), false));
		AppsActions.put(Constants.T_VOID, new AppsAction(Constants.T_VOID, KeyStroke.getKeyStroke(KeyEvent.VK_F3, 0), false));
		AppsActions.put(Constants.T_VOIDDOC, new AppsAction(Constants.T_VOIDDOC, KeyStroke.getKeyStroke(KeyEvent.VK_F3, 0), false));
		AppsActions.put(Constants.T_SAVE, new AppsAction(Constants.T_SAVE, KeyStroke.getKeyStroke(KeyEvent.VK_F3, 0), false));
		AppsActions.put(Constants.T_PRINT, new AppsAction(Constants.T_PRINT, KeyStroke.getKeyStroke(KeyEvent.VK_F4, 0), false));
		AppsActions.put(Constants.T_USER, new AppsAction(Constants.T_USER, KeyStroke.getKeyStroke(KeyEvent.VK_F5, 0), false));
		AppsActions.put(Constants.A_GLOBALDISCOUNT, new AppsAction(Constants.A_GLOBALDISCOUNT, KeyStroke.getKeyStroke(KeyEvent.VK_F9, 0), Msg.translate(Env.getCtx(), "Discount")));
		AppsActions.put(Constants.A_CASHBASED, new AppsAction(Constants.A_CASHBASED, KeyStroke.getKeyStroke(KeyEvent.VK_F11, 0), "Enviar a caja"));
		m_WindowNo = windowNo;
		File configuration = new File(Env.getResource("org.xendra.pos", "poskeyboard.uitheme"));
		if (configuration.exists())
			error = initialize();
		else
			error = ("no se encuentra xenpos.uitheme");
		if (error.length() == 0) {
			ResourceInjector.addModule(new SwingModule());
			ResourceInjector.get().load(configuration);
			ResourceInjector.get().inject(this);
			try {
				IObjetViewColumn[] columns = getColumns();
				if (columns == null)
				{
					throw new Exception(error);
				}
				Row[] rows = { newrow() };
				m_model = new DefaultObjectViewModel(columns, Arrays.asList(rows));
				m_cashbook = MCashBook.get(Env.getCtx(),getConfig().getC_CashBook_ID());
				//
				BufferedImages.put(Constants.A_PARTNER, ImageIO.read(new File(Env.getResource("org.xendra.pos", "bpartner.png"))));
				BufferedImages.put(Constants.A_CASH, ImageIO.read(new File(Env.getResource("org.xendra.pos", "cash.png"))));
				BufferedImages.put(Constants.A_PARTIAL, ImageIO.read(new File(Env.getResource("org.xendra.pos", "partial.png"))));
				BufferedImages.put(Constants.A_COUPON, ImageIO.read(new File(Env.getResource("org.xendra.pos", "coupon.png"))));
				BufferedImages.put(Constants.A_COLLECTION, ImageIO.read(new File(Env.getResource("org.xendra.pos", "collection.png"))));
				BufferedImages.put(Constants.A_PAY,ImageIO.read(new File(Env.getResource("org.xendra.pos", "card.png"))));
				BufferedImages.put(Constants.A_CREDIT, ImageIO.read(new File(Env.getResource("org.xendra.pos", "credit.png"))));
				BufferedImages.put(Constants.A_RENDITION, ImageIO.read(new File(Env.getResource("org.xendra.pos", "cashcount.png"))));
				BufferedImages.put(Constants.A_BONUS, ImageIO.read(new File(Env.getResource("org.xendra.pos","bonus.png"))));
				BufferedImages.put(Constants.A_CONFIG, ImageIO.read(new File(Env.getResource("org.xendra.pos", "config.png"))));
				BufferedImages.put(Constants.A_SHIPPING, ImageIO.read(new File(Env.getResource("org.xendra.pos","shipper.png"))));
				m_Frame = frame;
				Env.setContext(Env.getCtx(), m_WindowNo, "IsSOTrx", "Y");
				frame.setExtendedState(java.awt.Frame.MAXIMIZED_BOTH);
				createToolBar();
				salespanel.setLayout(new BorderLayout());
				salespanel.add(topPanel, BorderLayout.NORTH);
				salespricelist.addListener((ActionListener) this);

				topPanel.setLayout(new ALayout());

				infosearch.setHorizontalAlignment(JLabel.LEFT);
				infosearch.setForeground(Color.BLACK);
				infosearch.setFont(new java.awt.Font("Monospaced", 0, 20));

				labelTotalAmount.setForeground(Color.RED);
				labelTotalAmount.setFont(pospriceFont);

				labelDiscountAmount.setForeground(Color.RED);
				labelDiscountAmount.setFont(pospriceFont);

				labelNetAmount.setForeground(Color.RED);
				labelNetAmount.setFont(pospriceFont);

				int n = 0;
				topPanel.add(labelNetAmount, new ALayoutConstraint(0, n++));

				DecimalFormat s_format = DisplayType.getNumberFormat(DisplayType.Quantity);
				view = new ObjectView(m_model);
				view.setColumnSelectionAllowed(false);
				view.setFont(posgridFont);
				view.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
				view.configcontrols(m_WindowNo);
				view.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0),"KEYENTER");
				view.getInputMap(JComponent.WHEN_FOCUSED).put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0),	"KEYENTER");

				lkaPointOfSales = new LineKeyAdapter();
				lkaPointOfSales.setRowClass("org.xendra.pos.Row");
				lkaPointOfSales.setContext(getFrame(), this, view, m_showdialoginfo, m_WindowNo, infosearch, m_QtyByDefault, mTextToFind);
				lkaPointOfSales.funcKeyHome("HomeKey");
				lkaPointOfSales.funcKeyInsert("InsertKey");
				lkaPointOfSales.funcCalculateTotalLines("calculateTotalLines");
				lkaPointOfSales.funcShowException("ShowException");
				lkaPointOfSales.funcNewLine("NewLine");
				lkaPointOfSales.funcNextColumn("nextcolumn");
				lkaPointOfSales.funcValidationForAddLine("IsPriceListOk");
				lkaPointOfSales.funcAddLine("AddProduct");
				lkaPointOfSales.funcValidationForDelLine("DeleteRow");
				lkaPointOfSales.setKeys(m_model.getPosition("Key"),
						m_model.getPosition("Description"),
						m_model.getPosition("NextLine"),
						m_model.getPosition("Default"));
				//
				view.addKeyListener(lkaPointOfSales);
				view.setContext(this);
				view.funcCalculateTotalLines("calculateTotalLines");

				Action actions = new AbstractAction() {

					public void actionPerformed(ActionEvent ae) {
					}
				};

				view.getActionMap().put("KEYENTER", actions);
				view.setMakeIndex(true);

				view.getSelectionModel().addListSelectionListener(
						new ListSelectionListener() {
							public void valueChanged(ListSelectionEvent event) {
								List selection = view.getSelectedRowObjects();
								Row row = null;
								if (selection.size() > 0) {
									row = (Row) selection.get(0);
									if (row != null) {
										Env.setContext(Env.getCtx(), m_WindowNo, "M_Product_ID", row.getM_Product_ID());
									}

								}

							}
						});

				view.addMouseListener(new MouseAdapter() {

				});

				TotalsPanel.setLayout(TotalsLayout);
				infogridbottom.setHorizontalAlignment(SwingConstants.RIGHT);
				infogridbottom.setHorizontalTextPosition(SwingConstants.RIGHT);
				infogridbottom.setText(".");
				//
				cardPanel = new JPanel(new CardLayout());
				//
				String layout = String.format("wrap %d",config.getint(MachineCreator.nrocolumnspanel));
				buttonPanel.setLayout(new MigLayout(layout));
				buttonPanel.setName(buttonpanel);				
				collectionpanel = new CollectionPanel(this);
				collectionpanel.setName(collection);				
				couponpanel = new CouponPanel(this);
				couponpanel.setName(coupon);
				renditionpanel = new RenditionPanel(this);
				renditionpanel.setName(rendition);
				bonuspointpanel = new BonusPointsPanel(this);
				bonuspointpanel.setName(bonus);
				shippingpanel = new ShippingPanel(this);
				shippingpanel.setName(Constants.A_SHIPPING);
				errorpanel = new ErrorPanel(this);
				errorpanel.setName(panelerror);
				cardPanel.add(buttonPanel, buttonpanel);
				cardPanel.add(collectionpanel, collection);
				cardPanel.add(couponpanel, coupon);
				cardPanel.add(getPartnerPanel(), partner);
				cardPanel.add(renditionpanel, rendition);
				cardPanel.add(shippingpanel, Constants.A_SHIPPING);
				cardPanel.add(errorpanel, panelerror);
				scrollPane = new JScrollPane(cardPanel);

				scroll_Products = new JScrollPane(view);

				GridPanel.setLayout(GridLayout);

				GridPanel.add(infosearch, BorderLayout.NORTH);
				GridPanel.add(scroll_Products, BorderLayout.CENTER);
				GridPanel.add(TotalsPanel, BorderLayout.SOUTH);

				salespanel.add(infoPanel, BorderLayout.CENTER);

				infoPanel.setOrientation(JSplitPane.HORIZONTAL_SPLIT);
				infoPanel.setBorder(BorderFactory.createEtchedBorder());
				infoPanel.setRightComponent(scrollPane);
				infoPanel.setLeftComponent(GridPanel);
				infoPanel.setContinuousLayout(true);				

				salespanel.add(bottomPanel, BorderLayout.SOUTH);

				StringBuffer sb = new StringBuffer();

				bottomPanel.setLayout(BottomLayout);
				Boolean partial = (boolean) props.get(MachineCreator.ispartial);
				if ((boolean) props.get(MachineCreator.iscredit)) {
					PushButtons.put(Constants.A_CREDIT, new PushButton(BufferedImages.get(Constants.A_CREDIT), Constants.A_PAY, KeyStroke.getKeyStroke(KeyEvent.VK_F5, 0),	Msg.translate(Env.getCtx(), "Credit"), partial));
					PushButtons.get(Constants.A_CREDIT).settypePayAmt(Constants.A_CREDIT);
					PushButtons.get(Constants.A_CREDIT).setC_PaymentTerm_ID(config.getCredit_C_PaymentTerm_ID());
					PushButtons.get(Constants.A_CREDIT).setDelegate(this);
				}

				PushButtons.put(Constants.A_CASH, new PushButton(BufferedImages.get(Constants.A_CASH), Constants.A_PAY,KeyStroke.getKeyStroke(KeyEvent.VK_F11, 0), Msg.translate(Env.getCtx(), "Cash"), partial));
				PushButtons.get(Constants.A_CASH).settypePayAmt(Constants.A_CASH);
				PushButtons.get(Constants.A_CASH).setC_PaymentTerm_ID(config.getCash_C_PaymentTerm_ID());
				PushButtons.get(Constants.A_CASH).setIsPartial((boolean) props.get(MachineCreator.ispartial));
				PushButtons.get(Constants.A_CASH).setDelegate(this);

				PushButtons.put(Constants.A_PAY, new PushButton(BufferedImages.get(Constants.A_PAY), Constants.A_PAY,KeyStroke.getKeyStroke(KeyEvent.VK_F12, 0), Msg.translate(Env.getCtx(), "Card"), partial));
				PushButtons.get(Constants.A_PAY).settypePayAmt(Constants.A_PAY);
				PushButtons.get(Constants.A_PAY).setC_PaymentTerm_ID(config.getCredit_C_PaymentTerm_ID());
				PushButtons.get(Constants.A_PAY).setDelegate(this);				

				PushButtons.put(Constants.A_COUPON, new PushButton(BufferedImages.get(Constants.A_COUPON), Constants.A_COUPON,KeyStroke.getKeyStroke(KeyEvent.VK_F9, 0), Msg.translate(Env.getCtx(), X_C_Coupon.COLUMNNAME_C_Coupon_ID), partial));
				PushButtons.get(Constants.A_COUPON).settypePayAmt(Constants.A_COUPON);
				PushButtons.get(Constants.A_COUPON).setC_PaymentTerm_ID(config.getCredit_C_PaymentTerm_ID());
				PushButtons.get(Constants.A_COUPON).setDelegate(this);				
				PushButtons.put(Constants.A_PARTIAL, new PushButton(BufferedImages.get(Constants.A_PARTIAL), Constants.A_PARTIAL,KeyStroke.getKeyStroke(KeyEvent.VK_F7, 0), Msg.translate(Env.getCtx(), "Pago Parcial"), partial));
				PushButtons.get(Constants.A_PARTIAL).setDelegate(this);				
				PushButtons.put(Constants.A_BONUS, new PushButton(BufferedImages.get(Constants.A_BONUS), Constants.A_BONUS,null, Msg.translate(Env.getCtx(), "Puntos Bonus"),partial));
				PushButtons.get(Constants.A_BONUS).setDelegate(this);				
				PushButtons.put(Constants.A_PARTNER, new PushButton(BufferedImages.get(Constants.A_PARTNER), Constants.A_PARTNER,null, Msg.translate(Env.getCtx(), "BPartner")));
				PushButtons.get(Constants.A_PARTNER).setDelegate(this);				
				PushButtons.put(Constants.A_CONFIG, new PushButton(BufferedImages.get(Constants.A_CONFIG), Constants.A_CONFIG, null, Msg.translate(Env.getCtx(), "Config")));
				PushButtons.get(Constants.A_CONFIG).setDelegate(this);								
				PushButtons.put(Constants.A_GLOBALDISCOUNT, new PushButton(AppsActions.get(Constants.A_GLOBALDISCOUNT)));
				//					if (config.getPOSType().compareTo(
				//							REF_POSType.POSPaymentCash) == 0) {
				PushButtons.put(Constants.A_COLLECTION, new PushButton(BufferedImages.get(Constants.A_COLLECTION), Constants.A_COLLECTION, KeyStroke.getKeyStroke(KeyEvent.VK_F8, 0), Msg.translate(Env.getCtx(), "Cobranza")));
				PushButtons.get(Constants.A_COLLECTION).setDelegate(this);													
				PushButtons.put(Constants.A_RENDITION, new PushButton(BufferedImages.get(Constants.A_RENDITION), Constants.A_RENDITION, null, Msg.translate(Env.getCtx(), "CashCount")));
				PushButtons.get(Constants.A_RENDITION).setDelegate(this);																		
				//}
				PushButtons.put(Constants.A_SHIPPING, new PushButton(BufferedImages.get(Constants.A_SHIPPING), Constants.A_SHIPPING, null, Msg.translate(Env.getCtx(), "Shipper")));
				PushButtons.get(Constants.A_SHIPPING).setDelegate(this);

				buttonPanel.add(PushButtons.get(Constants.A_PARTNER));
				if ((boolean) props.get(MachineCreator.iscash))
					buttonPanel.add(PushButtons.get(Constants.A_CASH));
				if ((boolean) props.get(MachineCreator.ispayment))
					buttonPanel.add(PushButtons.get(Constants.A_PAY));
				if ((boolean) props.get(MachineCreator.iscoupon))
					buttonPanel.add(PushButtons.get(Constants.A_COUPON));
				if ((boolean) props.get(MachineCreator.iscredit))
					buttonPanel.add(PushButtons.get(Constants.A_CREDIT));
				if ((boolean) props.get(MachineCreator.isGlobalDiscount))
					buttonPanel.add(PushButtons.get(Constants.A_GLOBALDISCOUNT));
				if ((boolean) props.get(MachineCreator.ispartial))
					buttonPanel.add(PushButtons.get(Constants.A_PARTIAL));
				if ((boolean) props.get(MachineCreator.isBonusPoints))
					buttonPanel.add(PushButtons.get(Constants.A_BONUS));
				buttonPanel.add(PushButtons.get(Constants.A_COLLECTION));
				buttonPanel.add(PushButtons.get(Constants.A_RENDITION));
				buttonPanel.add(PushButtons.get(Constants.A_SHIPPING));
				buttonPanel.add(PushButtons.get(Constants.A_CONFIG));

				InitializeRightMenu();
				//
				String fileName = Ini.getXendraHome() + File.separator	+ "pos.properties";
				loadSettings(fileName);
				frame.getContentPane().add(salespanel, BorderLayout.CENTER);
				statusBar.setDialog(true);
				JPanel panel = new JPanel();
				ledJMSServer.setState(LED.LIGHTGREEN);					
				panel.add(new JLabel(getConfig().getName()));
				panel.add(ledJMSServer);
				statusBar.addStatusComponent(panel);
				frame.getContentPane().add(statusBar, BorderLayout.SOUTH);
				frame.pack();
				Dimension dim = new Dimension(10,10);
				//buttonPanel.getComponents();
				// Unified for the same dimension all buttons of buttonPanel
				Component childs[] = buttonPanel.getComponents();
				for (Component c : childs) {
					if (c instanceof PushButton)
					{
						if ( dim.getHeight() < c.getHeight() || dim.getWidth() < c.getWidth())
						{							
							dim = c.getSize();
						}
					}
				}		
				for (Component c : childs) {
					if (c instanceof PushButton)
					{
						c.setPreferredSize(dim);
						c.setSize(dim);						
						c.validate();
					}
				}	
				double buttonsize = dim.getWidth();
				buttonspanelwidth = buttonsize * config.getint(MachineCreator.nrocolumnspanel) + 40;			
				Dimension d = new Dimension(10,10);        		
				for (int i=0; i < cardPanel.getComponentCount(); i++)
				{
					Component c = cardPanel.getComponent(i);
					if ( d.getHeight() < c.getHeight() || d.getWidth() < c.getWidth())
						d = c.getSize();
				}
				cardpanelwidth = d.getWidth();				
				//
				int bpw = config.getint("BUTTONPANELSTATE");
				if (bpw == 0) {
					bpw = (int) (currentwidth - buttonspanelwidth);				
				}
				int cpw = config.getint("CARDPANELSTATE");
				if (cpw == 0) {
					cpw = (int) (currentwidth - cardpanelwidth);
				}
				margin.put(BUTTONPANELSTATE, bpw);
				margin.put(CARDPANELSTATE, cpw);				
				//				double x = dim.getWidth();
				//				x=x * config.getint(MachineCreator.nrocolumnspanel);				
				//				x= frame.getWidth() - x;
				//				infoPanel.setDividerLocation((int)x);	
				//				System.out.print("f");
				frame.addComponentListener(new resizeListener());
			} catch (Exception e) {
				e.printStackTrace();
				error = e.getMessage();
				showFrameError(frame);
			}		
		} else {
			showFrameError(frame);
		}
	}
	public void resizetobuttonpanel()
	{
		panelstate = BUTTONPANELSTATE;
		int width = 0;
		if (!margin.containsKey(BUTTONPANELSTATE)) {
			width = (int) (currentwidth - buttonspanelwidth);
			margin.put(BUTTONPANELSTATE, width);
		}
		width = margin.get(BUTTONPANELSTATE);
		infoPanel.setDividerLocation(width);

	}
	public void resizetocardpanel()
	{
		panelstate = CARDPANELSTATE;
		int width = 0;
		if (!margin.containsKey(CARDPANELSTATE)) {
			width = (int) (currentwidth - cardpanelwidth);
			margin.put(CARDPANELSTATE, width);
		}
		width = margin.get(CARDPANELSTATE);
		infoPanel.setDividerLocation(width);		
	}
	private class resizeListener extends ComponentAdapter {
		public void componentResized(ComponentEvent e) {
			currentwidth = e.getComponent().getWidth();
			if (getView().isEnabled())
			{
				resizetobuttonpanel();
			}
			else
			{
				resizetocardpanel();
			}
		}
	}	

	private void showFrameError(FormFrame frame)
	{
		JPanel panel = new JPanel(new MigLayout());
		JButton launchwiz = new JButton("Launch Wizard");
		launchwiz.addActionListener(new ActionListener() {				
			public void actionPerformed(ActionEvent e)
			{
				//return requestAuthorization(config.getVoidPassword());				
				if (config == null) { 
				//if (IsCanDelete()) {					
					POSWizardLauncher nn = new POSWizardLauncher();	
					nn.launchWizard();	
				} else if (requestAuthorization(config.getWizardPassword())) {
					POSWizardLauncher nn = new POSWizardLauncher();	
					nn.launchWizard();						
				}
			}
		});
		panel.add(new CLabel(error, Env.getImageIcon("BPartner10.gif"), JLabel.CENTER), "wrap");
		panel.add(launchwiz);
		frame.getContentPane().add(panel);		
	}


	private void InitializeRightMenu() {
		mBarAdd.setText(Msg.getMsg(Env.getCtx(), "Add"));
		mBarAdd.setActionCommand("BarAdd");
		mBarAdd.addActionListener(this);
		mBarMoreInfo.setText(Msg.getMsg(Env.getCtx(), "MoreInfo"));
		mBarMoreInfo.setActionCommand("BarMoreInfo");
		mBarMoreInfo.addActionListener(this);
		popMenuBar.setLightWeightPopupEnabled(false);
		popMenuBar.add(mBarAdd);
		popMenuBar.add(mBarMoreInfo);
	}

	public void moveSelection(int number) {
		int nrows = m_model.getRowCount();
		if (nrows > 0) {
			int selectedIndex = view.getSelectedRow();
			if (selectedIndex == -1)
				selectedIndex = 0;

			if (selectedIndex + number < 0 || selectedIndex + number >= nrows)
				return;

			view.setRowSelectionInterval(selectedIndex + number, selectedIndex
					+ number);

		}
	}

	Row newrow() {
		return new Row();
	}

	public IObjetViewColumn[] getColumns() {
		int mIsKey = -1;
		int mIsDescription = -1;
		int mNextLine = -1;
		int mDefault = -1;

		List<DefaultTableViewColumn> newcolumns = new ArrayList<DefaultTableViewColumn>();
		try {
			MPOSLine[] lines = config.getLines();
			for (int i = 0; i < lines.length; i++) {
				MPOSLine line = lines[i];
				Method getter = Row.class.getDeclaredMethod(String.format("get%s", line.getSourceMethodName().trim()), null);
				Method setter = null;
				//if (line.isReadWrite() && line.getClassname() != null) {
				if (line.isReadWrite()) {
					Class[] setterParam = null;
					if (line.getClassname().equals("String"))
						setterParam = new Class[] { String.class };
					else if (line.getClassname().equals("BigDecimal"))
						setterParam = new Class[] { BigDecimal.class };
					else if (line.getClassname().equals("Integer"))
						setterParam = new Class[] { Integer.class };
					if (setterParam != null) {
						setter = Row.class.getDeclaredMethod(String.format("set%s",	line.getSourceMethodName().trim()), setterParam);
					}
				}
				if (line.isKey()) {
					mIsKey = i;
					if (setter != null) {
						setter = null;
						line.setIsReadWrite(false);
						line.save();
					}
				}
				if (line.isDescription()) {
					mIsDescription = i;
					if (setter != null) {
						setter = null;
						line.setIsReadWrite(false);
						line.save();
					}
				}
				if (line.isNextLine())
					mNextLine = i;
				if (line.isDefault())
					mDefault = i;

				Class[] setdisplayParam = new Class[] { Integer.class, Object.class, Object.class };
				Method setDisplay = Row.class.getDeclaredMethod("setDisplayColumn", setdisplayParam);
				Class[] getdisplayParam = new Class[] { Integer.class,	Object.class };
				Method getDisplay = Row.class.getDeclaredMethod("getDisplayColumn", getdisplayParam);

				newcolumns.add(new DefaultTableViewColumn(Msg.translate(Env.getCtx(), line.getName().trim()), null,
						(Method) getter, (Method) setter, true, /* visible */
						null, /* format */
						false, /* sortable */
						false, /* searchable */
						line.isKey(), line.isDescription(), line.isNextLine(),
						line.isDefault(), line.isColorColumn(), line.getAD_Column_ID(), line.getAD_Reference_ID(),
						(Method) getDisplay, (Method) setDisplay, line
						.isOverwrite()));
				// }
			}
			//			Method getError = Row.class.getDeclaredMethod("getError", null);
			//			Class[] ErrorParam = new Class[] { BigDecimal.class };
			//			Method setError = Row.class.getDeclaredMethod("setError", ErrorParam);
			//			
			//			Class[] setdisplayParam = new Class[] { Integer.class, Object.class, Object.class };
			//			Method setDisplay = Row.class.getDeclaredMethod("setDisplayColumn", setdisplayParam);
			//			Class[] getdisplayParam = new Class[] { Integer.class,	Object.class };
			//			Method getDisplay = Row.class.getDeclaredMethod("getDisplayColumn", getdisplayParam);
			//			
			////			
			////			String pName, Comparator pComparator,
			////            Method pGetter, Method pSetter,  boolean pDefaultVisible,
			////            Format pFormat, boolean pSortable, boolean pSearchable, 
			////            boolean pIsKey, boolean pDescription, boolean pNextLine, boolean pDefault, 
			////            boolean pIsColorColumn, 
			////			  Integer AD_Column_ID, Integer DisplayType, Method pGetDisplay, Method pSetDisplay, boolean pOverwrite) {			
			//			newcolumns.add(new DefaultTableViewColumn("error", null,  
			//				getError, setError, true,
			//				null, false, false,
			//				false, false, false, false,
			//				true, 
			//				0 /* AD_Column_ID */, 0,   
			//				getDisplay, setDisplay, true));
			// if ( mIsKey == -1 || mIsDescription == -1 || mNextLine == -1 ||
			// mDefault == -1 )
			if (mIsDescription == -1 || mNextLine == -1 || mDefault == -1) {
				throw new XendraException(
						String.format(
								"un valor -1 es invalido, los valores para %s es %s, %s es %s, %s es %s, %s es %s",
								Msg.translate(Env.getCtx(), "IsKey"), mIsKey,
								Msg.translate(Env.getCtx(), "IsDescription"),
								mIsDescription,
								Msg.translate(Env.getCtx(), "NextLine"),
								mNextLine,
								Msg.translate(Env.getCtx(), "Default"),
								mDefault));
			}
		} 
		catch (Exception e) {			
			error = e.getMessage();
			return null;
		}
		IObjetViewColumn[] columns = new IObjetViewColumn[newcolumns.size()];
		newcolumns.toArray(columns);
		return columns;
	}

	public void nextcolumn() {
		// int nextColumn = SelectedColumn + 1;
		int nextColumn = lkaPointOfSales.getSelectedColumn() + 1;
		if (nextColumn > view.getColumnCount())
			nextColumn = 0;
		nextcolumn(nextColumn);
	}

	public void nextcolumn(int i) {
		int nextColumn = i;
		Rectangle rect = view.getVisibleRect();
		Rectangle cRect = view.getCellRect(lkaPointOfSales.getSelectedRow(),
				nextColumn, true);
		rect.y = cRect.y;
		rect.height = cRect.height;
		view.scrollRectToVisible(rect);
		view.changeSelection(lkaPointOfSales.getSelectedRow(), nextColumn,
				false, false);
	}

	public void NewLine(Row row) {
		Boolean lContinue = false;
		if (row != null) {
			// if (row.getQtyOrdered().compareTo(Env.ZERO) > 0 &&
			// row.IsAttributeOK())
			if (row.getQtyOrdered().compareTo(Env.ZERO) > 0)
				lContinue = true;
		} else
			lContinue = true;
		if (lContinue) {
			if (view.getCellEditor() != null)
				view.getCellEditor().stopCellEditing();
			AddLine();
			// mTextToFind = "";
			// Row newrow = new Row();
			// ( (DefaultTableViewModel) view.getDataModel()).addRow(newrow);
			// int LastRow = view.getRowCount()-1;
			// Rectangle rect = view.getVisibleRect();
			// Rectangle cRect = view.getCellRect(LastRow, 0, true);
			// rect.y = cRect.y;
			// rect.height = cRect.height;
			// view.scrollRectToVisible(rect);
			// view.changeSelection(LastRow, 0, false, false);
			// view.getTableHeader().repaint();
			// view.repaint();
		}
	}

	private void AddLine() {
		Row newrow = new Row();
		((DefaultObjectViewModel) view.getDataModel()).addRow(newrow);
		int LastRow = view.getRowCount() - 1;
		Rectangle rect = view.getVisibleRect();
		Rectangle cRect = view.getCellRect(LastRow, 0, true);
		rect.y = cRect.y;
		rect.height = cRect.height;
		view.scrollRectToVisible(rect);
		view.changeSelection(LastRow, 0, false, false);
		view.getTableHeader().repaint();
		view.repaint();
	}

	/************************
	 * Create Reset Button wlth label text
	 * 
	 * @param Text
	 *            text
	 * @return button
	 */
	public void cleanlines() {
		view.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		view.selectAll();
		List selection = view.getSelectedRowObjects();
		view.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		m_model.removeRows(selection);
	}

	public void Void() {
		reset();
		m_Coupons = new ArrayList<X_C_Coupon>();

		campaignbonus = new ArrayList<Object[]>();
		campaigndiscount = new ArrayList<Object[]>();

		Iterator keys = amounts.keySet().iterator();
		while (keys.hasNext())
		{
			String key = (String)keys.next();
			setAmt(key, BigDecimal.ZERO);
		}
		if (PushButtons.get(Constants.A_PARTIAL) != null)
			PushButtons.get(Constants.A_PARTIAL).setEnabled(false);
		labelTotalAmount.setText(zero);
		labelDiscountAmount.setText(zero);
		labelNetAmount.setText(zero);
		if (IsFromVoided())
			this.setIsFromVoided(false);
		if (view.getRowCount() == 0)
			AddLine();

		int mDefault = ((DefaultObjectViewModel) view.getDataModel())
				.getPosition("Default");
		view.setRowSelectionInterval(0, 0);
		view.setColumnSelectionInterval(mDefault, mDefault);
		view.requestFocus();
		statusBar.setStatusLine("", false);
	}

	/**
	 * Main handler for all events. All the program's reaction to external
	 * events end up here, where the appropiate action is done.
	 * 
	 * @param iskey
	 *            si es el codigo del producto para la busqueda en caso no se
	 *            encuentre.
	 * @param product
	 *            la clase del objeto Product
	 * @param Qty
	 *            la cantidad digitada
	 * @param C_OrderLine_ID
	 *            id. de la linea de orden origen.
	 * @param C_UOM_ID
	 *            el ID de la unidad de medida.
	 * @param Price
	 *            (opcional)
	 * @param M_AttributeSetInstance_ID
	 *            lote
	 * @param isVoidTransaction
	 *            - si viene de una transaccion anulada.
	 */
	public void AddProduct(Boolean isKey, MProduct product, BigDecimal Qty,
			Integer C_OrderLine_ID, Integer C_UOM_ID, BigDecimal Price,
			Integer M_AttributeSetInstance_ID, Boolean isVoidTransaction) {
		if (m_QtyBySelection.compareTo(Env.ZERO) > 0)
			Qty = m_QtyBySelection;

		mTextToFind = lkaPointOfSales.getTextToFind();
		Info m_info = null;
		if (product == null)
			product = MProduct.getByValue(Env.getCtx(), mTextToFind, null);

		if (product == null && m_IsBalance
				&& mTextToFind.length() >= m_EndWeightBalance) {
			// aca podriamos descomponer el UPC code
			String code = mTextToFind.substring(m_StartCodeBalance,
					m_EndCodeBalance);
			if (code.length() > 0) {
				product = MProduct.getByValue(Env.getCtx(), code, null);
				if (product != null) {
					String sqty = mTextToFind.substring(m_StartWeightBalance,
							m_EndWeightBalance);
					BigDecimal temp = new BigDecimal(sqty);
					Qty = temp.divide(new BigDecimal(1000.0), 10,
							BigDecimal.ROUND_HALF_UP);
					Qty = Qty.setScale(3, BigDecimal.ROUND_HALF_UP);
				}
			}

		}
		if (product != null) {
			// validando
			String sql = "SELECT "
					.concat("p.M_Product_ID from M_Product p LEFT OUTER JOIN M_ProductPrice pr ")
					.concat("ON (p.M_Product_ID=pr.M_Product_ID AND pr.IsActive='Y') ")
					.concat("WHERE p.M_Product_ID=? AND pr.M_PriceList_Version_ID=? AND p.IsActive='Y'");

			// .m_DefaultPriceListVersion_ID
			int m_product = DB.getSQLValue(null, sql,
					product.getM_Product_ID(),
					this.getOrder().getM_PriceList_Version_ID());
			if (m_product == -1) {
				product = null;
			}
		}

		if (product == null) {
			String searchKey = "";
			if (isKey)
				searchKey = mTextToFind.trim();
			else {
				searchKey = "@" + mTextToFind.trim();
			}

			Env.setContext(Env.getCtx(), Env.WINDOW_INFO, Env.TAB_INFO, "M_Product_ID", "0");
			m_info = new InfoProduct(getFrame(), true, Env.WINDOW_INFO,	getOrder().getM_Warehouse_ID(), getOrder().getM_PriceList_ID(),
					0, /* config.getM_PriceList_Version_ID() */
					// isKey?mTextToFind.trim(): "@"+ mTextToFind.trim() +"%",
					// // value
					searchKey, // value
					false, "", true, true);
			m_info.setFocusinGrid();
			AEnv.showCenterWindow(getFrame(), m_info);
			if (m_info.isCancelled())
				mTextToFind = "";
			Integer new_Product_ID = Env.getContextAsInt(Env.getCtx(),
					Env.WINDOW_INFO, Env.TAB_INFO, "M_Product_ID");
			product = MProduct.get(Env.getCtx(), new_Product_ID, null);
		}
		//
		if (product != null && product.getM_Product_ID() > 0) {
			mTextToFind = "";
			ObjectViewAdapter adapter = (ObjectViewAdapter) view.getModel();
			Row SelectedRow = (Row) view.getSelectedRowObject();
			int found = 0;
			if (!config.getbool(MachineCreator.isallowduplicated)) {
				for (int j = 0; j < view.getRowCount(); j++) {
					Row data = (Row) adapter.getNewRow(j);
					if (data.getM_Product_ID() == product.getM_Product_ID()
							&& data.getM_AttributeSetInstance_ID() == 0) {
						found = j + 1;
						break;
					}
				}
			}
			if (found > 0) {
				if (m_showdialoginfo)
					//ADialog.error(m_WindowNo, null, "PosError", "AlreadyExists");
					showErrorPanel("AlreadyExists");
				DefaultObjectViewModel mModel = (DefaultObjectViewModel) view
						.getDataModel();
				mModel.removeRow(SelectedRow);
				int mDefault = ((DefaultObjectViewModel) view.getDataModel())
						.getPosition("Default");
				view.setRowSelectionInterval(found - 1, found - 1);
				view.setColumnSelectionInterval(mDefault, mDefault);
				return;
			}
			// if (IsQuickPOS())
			// {
			// Boolean lContinue = false;
			if (SelectedRow.getM_Product_ID() != 0) {
				Boolean lFound = false;
				while (!lFound) {
					for (int j = 0; j < view.getRowCount(); j++) {
						Row data = (Row) adapter.getNewRow(j);
						if (data.getM_Product_ID() == 0) {
							lFound = true;
							view.setRowSelectionInterval(j, j);
							SelectedRow = (Row) view.getSelectedRowObject();
							// truchaza pero que xuxa
							lkaPointOfSales.setSelectedRow(j);
							break;
						}
					}
					if (!lFound) {
						this.AddLine();
					}
				}
			}
			// }
			Row row = new Row();
			row.setisVoidTransaction(isVoidTransaction);
			row.setPOSPanel(this);
			// row.setOverwritePriceLimit(config.isOverwritePriceList());
			row.setOverwritePriceLimit(config.getbool(MachineCreator.overwritepricelimit));
			row.setC_OrderLine_ID(C_OrderLine_ID);
			row.setDeliveryRule(getOrder().getDeliveryRule());
			row.setC_BPartner_ID(getOrder().getC_BPartner_ID());
			row.setM_PriceList_ID(getOrder().getM_PriceList_ID());
			row.setM_PriceListVersion_ID(getOrder().getM_PriceList_Version_ID());
			row.setWindowNo(m_WindowNo);
			row.setC_Currency_ID(getOrder().getC_Currency_ID());
			row.setM_Warehouse_ID(getOrder().getM_Warehouse_ID());
			row.setM_AttributeSetInstance_ID(M_AttributeSetInstance_ID);						
			row.setWithholdingType(product.getWithholdingType());
			row.setDateOrdered(getOrder().getDateOrdered());
			row.setDatePromised(getOrder().getDateOrdered());
			row.setTaxIncluded(getOrder().isTaxIncluded());
			row.product(product);
			row.setQtyEntered(Qty);
			//			int iTax = Tax.getProduct(Env.getCtx(), product.getM_Product_ID(),
			//					getOrder().getDateOrdered(), getOrder().getDateOrdered(),
			//					getOrder().getAD_Org_ID(), getOrder().getM_Warehouse_ID(),
			//					getOrder().getBill_Location_ID(),
			//					getOrder().getC_BPartner_Location_ID(), false);
			//			if (iTax != 0)
			//				row.setC_Tax_ID(iTax);
			// if (!row.IsAttributeOK() && !isVoidTransaction)
			// row.createAttribute();			
			if (Price != null)
				row.setPriceEntered(Price);
			if (C_UOM_ID > 0)
				row.setC_UOM_ID(C_UOM_ID);
			row.setisVoidTransaction(false);
			row.setorderid(getOrder().getIdentifier());
			row.setIsChanged(true);
			if (row.getM_processMsg() != null && C_OrderLine_ID == 0
					&& !isVoidTransaction) {
				if (m_showdialoginfo) {
					//ADialog.info(m_WindowNo, getFrame(), row.getM_processMsg());
					showErrorPanel(row.getM_processMsg());
				}
			} else {
				if (row.getM_processMsg() != null && isVoidTransaction) {
					if (m_showdialoginfo)
						//ADialog.info(m_WindowNo, getFrame(), row.getM_processMsg());
						showErrorPanel(row.getM_processMsg());
				}
				DefaultObjectViewModel mModel = (DefaultObjectViewModel) view.getDataModel();
				mModel.updateRow(SelectedRow, row);
				// view.
				int nPos = view.getRowCount() - 1;
				view.setRowSelectionInterval(nPos, nPos);
				// view.setRowSelectionInterval(index0, index1)
				int mDefault = ((DefaultObjectViewModel) view.getDataModel())
						.getPosition("Default");
				if (mDefault > 0)
					view.setColumnSelectionInterval(mDefault, mDefault);
				if (m_IsAllowCampaign)
					AddCampaign(row);
				AddProductEvent(row);
				if (row.getM_processMsg() != null) {
					if (m_showdialoginfo) {
						//ADialog.info(m_WindowNo, getFrame(), row.getM_processMsg());
						showErrorPanel(row.getM_processMsg());
					}
				}
			}
		}
		// reseteamos para que solo se active cuando lo seleccione el usuario
		m_QtyBySelection = Env.ZERO;
	}

	public void showError(String m_processMsg) {
		setError(m_processMsg);
		showErrorPanel(m_processMsg);
	}

	public void showErrorPanel(String m_processMsg) {
		disableEnvironment();			
		String prevcard = "";
		for (Component comp : cardPanel.getComponents()) {
			if (comp.isVisible()) {
				prevcard = comp.getName();		        
				break;
			}
		}		
		if (!prevcard.equals(panelerror))
		{
			CardLayout cl = (CardLayout) (cardPanel.getLayout());		
			cl.show(cardPanel, "errorpanel");
		}		
		errorpanel.setMessage(m_processMsg, prevcard);		
		errorpanel.selection();					
	}


	private void AddProduct(MOrderLine oline, Boolean isVoid) {
		AddLine();
		int nPos = view.getSelectedRow();
		Row row = new Row();
		row.setPOSPanel(this);
		row.setisVoidTransaction(isVoid);
		// row.setOverwritePriceLimit(config.isOverwritePriceList());
		row.setOverwritePriceLimit(config.getbool(MachineCreator.overwritepricelimit));
		row.setWindowNo(m_WindowNo);
		row.setC_BPartner_ID(getOrder().getC_BPartner_ID());
		row.setM_PriceList_ID(getOrder().getM_PriceList_ID());
		row.setM_PriceListVersion_ID(getOrder().getM_PriceList_Version_ID());
		row.FromOrderLine(oline);
		Object SelectedRow = view.getSelectedRowObject();
		DefaultObjectViewModel mModel = (DefaultObjectViewModel) view
				.getDataModel();
		mModel.updateRow(SelectedRow, row);
		view.setRowSelectionInterval(nPos, nPos);
	}

	private void RemoveCampaign(Row row) {
		if (row.IsBonus())
			return;

		if (row.getProduct() == null)
			return;

		MCampaignBonus[] productbonus = row.getProduct().getCampaignBonus();
		//
		for (MCampaignBonus pb : productbonus) {
			int w = 0;
			Boolean found = false;
			while (w < campaignbonus.size() && !found) {
				MCampaignBonus bonus = (MCampaignBonus) campaignbonus.get(w)[0];
				if (pb.equals(bonus)) {
					campaignbonus.get(w)[1] = (Integer) campaignbonus.get(w)[1] - 1;
					found = true;
				}
				w++;
			}
		}

		MCampaignDiscount[] productdiscount = row.getProduct()
				.getCampaignDiscount();

		for (MCampaignDiscount pd : productdiscount) {
			int w = 0;
			Boolean found = false;
			while (w < campaigndiscount.size() && !found) {
				MCampaignDiscount discount = (MCampaignDiscount) campaigndiscount
						.get(w)[0];
				if (pd.equals(discount)) {
					campaigndiscount.get(w)[1] = (Integer) campaigndiscount
							.get(w)[1] - 1;
					found = true;
				}
				w++;
			}
		}
	}

	private void ExecuteCampaignDiscount() {
		Row SelectedRow = (Row) view.getSelectedRowObject();
		int w = 0;
		Boolean found = false;

		SelectedRow.setDiscount1(Env.ZERO);		
		SelectedRow.setDiscount2(Env.ZERO);
		SelectedRow.setDiscount3(Env.ZERO);
		SelectedRow.setDiscount4(Env.ZERO);

		while (w < campaigndiscount.size() && !found) {
			MCampaignDiscount campdiscount = (MCampaignDiscount) campaigndiscount
					.get(w)[0];
			if (SelectedRow.hasCampaignDiscount(campdiscount
					.getC_CampaignDiscount_ID())) {
				BigDecimal Qty = null;
				if (campdiscount.getC_UOM_ID() != 0) {
					Qty = MUOMConversion.convertProductTo(Env.getCtx(),
							SelectedRow.getProduct().getM_Product_ID(),
							campdiscount.getC_UOM_ID(),
							SelectedRow.getQtyOrdered());
				}
				if (Qty == null)
					Qty = SelectedRow.getQtyOrdered();
				MDiscountSchema ds = MDiscountSchema.get(Env.getCtx(),
						campdiscount.getM_DiscountSchema_ID());
				BigDecimal discount = ds
						.calculateDiscount(Qty, SelectedRow.getPriceEntered(),
								SelectedRow.getProduct().getM_Product_ID(),
								SelectedRow.getProduct()
								.getM_Product_Category_ID(), Env.ZERO/* BPartnerFlatDiscount */);

				if (discount.compareTo(Env.ZERO) != 0) {
					if (REF_M_DiscountType.FlatPercent.equals(ds
							.getDiscountType()))
						SelectedRow.setDiscount1(SelectedRow.getDiscount1().add(discount));						
					else {
						SelectedRow.setDiscount2(SelectedRow.getDiscount2()
								.add(discount));
						SelectedRow.setC_CampaignDiscount_ID(ds
								.getM_DiscountSchema_ID());
					}

				}
			}
			w++;
		}
	}

	private void ExecuteCampaignBonus() {

		Row SelectedRow = (Row) view.getSelectedRowObject();

		ObjectViewModel adapter = view.getDataModel();

		int h = 0;
		while (h < view.getRowCount()) {
			Row row = (Row) adapter.getRowObject(h);
			if (row.IsBonus()) {
				((DefaultObjectViewModel) view.getDataModel()).removeRow(row);
				h = 0;
				continue;
			}
			h++;
		}
		int w = 0;
		Boolean found = false;
		// ArrayList<MProductBonus> ProductBonusList = new
		// ArrayList<MProductBonus>();

		for (int j = 0; j < view.getRowCount(); j++) {
			Row row = (Row) adapter.getRowObject(j);
			row.killBonusChilds();
			w = 0;
			while (w < campaignbonus.size() && !found) {
				MCampaignBonus bonus = (MCampaignBonus) campaignbonus.get(w)[0];
				if (row.hasCampaignBonus(bonus)) {
					BigDecimal Qty = null;
					if (bonus.getC_UOM_ID() != 0) {
						Qty = MUOMConversion.convertProductTo(Env.getCtx(), row
								.getProduct().getM_Product_ID(), bonus
								.getC_UOM_ID(), row.getQtyOrdered());
					}
					if (Qty == null)
						Qty = SelectedRow.getQtyOrdered();

					MProductBonus[] bonusproduct = bonus.calculateBonus(
							row.getM_Product_ID(), Qty,
							/* row.getC_UOM_ID(), */
							row.getPriceEntered());

					if (bonusproduct == null) {
						w++;
						continue;
					}

					for (MProductBonus pbl : bonusproduct) {
						BigDecimal QtyOrdered = MUOMConversion
								.convertProductFrom(Env.getCtx(),
										pbl.getM_Product_ID(),
										pbl.getC_UOM_ID(), pbl.getQtyEntered());
						String ProductName = MStorage.getProductName(
								pbl.getM_Product_ID(), null);
						if (QtyOrdered == null)
							QtyOrdered = Env.ZERO;
						BigDecimal available = MStorage.getQtyAvailable(getOrder().getM_Warehouse_ID(), 0, pbl.getM_Product_ID(), 0, null);
						if (available == null)
							available = Env.ZERO;
						if (available.signum() == 0) {
							//ADialog.error(m_WindowNo,this,"PosError",ProductName+ Msg.getMsg(Env.getCtx(),"NoQtyAvailable"));
							showErrorPanel(ProductName+ Msg.getMsg(Env.getCtx(),"NoQtyAvailable"));
						} else if (available.compareTo(QtyOrdered) < 0)
							//ADialog.error(m_WindowNo, this,	"PosError", ProductName	+ Msg.getMsg(Env.getCtx(),"InsufficientQtyAvailable"));
							showErrorPanel(ProductName	+ Msg.getMsg(Env.getCtx(),"InsufficientQtyAvailable"));
						else {
							Row newrow = new Row(false);
							newrow.setIsBonus(true);
							newrow.setisVoidTransaction(false);
							newrow.setPOSPanel(this);
							newrow.setC_CampaignBonus_ID(bonus
									.getC_CampaignBonus_ID());
							// newrow.setOverwritePriceLimit(config.isOverwritePriceList());
							newrow.setOverwritePriceLimit(config.getbool(MachineCreator.overwritepricelimit));
							newrow.setDeliveryRule(getOrder().getDeliveryRule());
							newrow.setC_BPartner_ID(getOrder().getC_BPartner_ID());
							newrow.setM_PriceList_ID(getOrder().getM_PriceList_ID());
							newrow.setM_PriceListVersion_ID(getOrder().getM_PriceList_Version_ID());
							newrow.setWindowNo(m_WindowNo);
							newrow.setC_Currency_ID(getOrder().getC_Currency_ID());
							newrow.setM_Warehouse_ID(getOrder().getM_Warehouse_ID());
							newrow.product(pbl.getM_Product_ID());
							newrow.setDateOrdered(getOrder().getDateOrdered());
							newrow.setDatePromised(getOrder().getDateOrdered());
							newrow.setTaxIncluded(getOrder().isTaxIncluded());
							newrow.setC_UOM_ID(pbl.getC_UOM_ID());
							newrow.setQtyEntered(pbl.getQtyEntered());
							int iTax = Tax.getProduct(Env.getCtx(),
									pbl.getM_Product_ID(),
									getOrder().getDateOrdered(),
									getOrder().getDateOrdered(),
									getOrder().getAD_Org_ID(),
									getOrder().getM_Warehouse_ID(),
									getOrder().getBill_Location_ID(),
									getOrder().getC_BPartner_Location_ID(), false);
							if (iTax != 0)
								newrow.setC_Tax_ID(iTax);
							// if (!newrow.IsAttributeOK())
							// newrow.createAttribute();
							newrow.setDiscount1(Env.ONEHUNDRED);							
							newrow.setisVoidTransaction(false);
							row.AddBonusRow(newrow);
							// parentrow.setC_CampaignBonus_ID(pbl.getC_CampaignBonus_ID());
							// ( (DefaultObjectViewModel)
							// view.getDataModel()).addRow(newrow);
						}
					}

				}
				w++;
			}
		}

		for (int j = 0; j < view.getRowCount(); j++) {
			Row row = (Row) adapter.getRowObject(j);
			if (row.IsBonus())
				continue;

			if (row.getSizeOfChilds() > 0) {
				Row rowchild = row.getFirstChild();
				if (rowchild != null) {
					row.setC_CampaignBonus_ID(rowchild.getC_CampaignBonus_ID());
					Boolean lfoundobjectblank = false;
					for (int k = 0; k < view.getRowCount(); k++) {
						Row rowblank = (Row) adapter.getRowObject(k);
						if (rowblank.getM_Product_ID() == 0
								&& rowblank.getQtyOrdered().compareTo(Env.ZERO) == 0) {
							((DefaultObjectViewModel) view.getDataModel())
							.updateRow(rowblank, rowchild);
							lfoundobjectblank = true;
						}
					}
					if (!lfoundobjectblank)
						((DefaultObjectViewModel) view.getDataModel())
						.addRow(rowchild);
				}
			}
		}
	}

	private void ExecuteCampaign() {
		Row SelectedRow = (Row) view.getSelectedRowObject();
		if (SelectedRow != null && SelectedRow.IsChanged()
				&& !SelectedRow.IsBonus() && SelectedRow.hasCampaignDiscount()) {
			ExecuteCampaignDiscount();
		}
		if (SelectedRow != null && SelectedRow.IsChanged()
				&& !SelectedRow.IsBonus() && SelectedRow.hasCampaignBonus()) {
			ExecuteCampaignBonus();
		}
	}

	private void AddCampaign(Row row) {

		if (row.IsBonus())
			return;

		MCampaignBonus[] productbonus = row.getProduct().getCampaignBonus();
		//
		for (MCampaignBonus pb : productbonus) {
			row.addC_CampaignBonus_ID(pb);
			int w = 0;
			Boolean found = false;
			while (w < campaignbonus.size() && !found) {
				MCampaignBonus bonus = (MCampaignBonus) campaignbonus.get(w)[0];
				if (pb.equals(bonus)) {
					campaignbonus.get(w)[1] = (Integer) campaignbonus.get(w)[1] + 1;
					found = true;
				}
				w++;
			}
			if (!found) {
				campaignbonus.add(new Object[2]);
				int last = campaignbonus.size() - 1;
				campaignbonus.get(last)[0] = pb;
				campaignbonus.get(last)[1] = 1;
			}
		}

		MCampaignDiscount[] productdiscount = row.getProduct()
				.getCampaignDiscount();

		for (MCampaignDiscount pd : productdiscount) {
			int w = 0;
			Boolean found = false;
			row.addC_CampaignDiscount_ID(pd.getC_CampaignDiscount_ID());
			while (w < campaigndiscount.size() && !found) {
				MCampaignDiscount discount = (MCampaignDiscount) campaigndiscount
						.get(w)[0];
				if (pd.equals(discount)) {
					campaigndiscount.get(w)[1] = (Integer) campaigndiscount
							.get(w)[1] + 1;
					found = true;
				}
				w++;
			}
			if (!found) {
				campaigndiscount.add(new Object[2]);
				int last = campaigndiscount.size() - 1;
				campaigndiscount.get(last)[0] = pd;
				campaigndiscount.get(last)[1] = 1;
			}
		}
	}

	public void actionPerformed(ActionEvent e) {
		Component c = (Component) e.getSource();
		if (e.getActionCommand().equals("Discount")) {
			ObjectViewModel adapter = view.getDataModel();
			AEnv.showCenterScreen(new DiscountDialog(m_WindowNo, this, adapter));
		}		

		if (e.getActionCommand().equals(Constants.T_LOAD)) {
			LoadOffer();
		}
		if (e.getActionCommand().equals(Constants.T_USER)) {
			showUserPanel();
		}
		if (e.getActionCommand().equals(Constants.T_SAVE)) {
			MOrder order = SaveOffer();			
			if (order != null) {
				cleanlines();
				Void();
				resetPriceList();
				// if (config.isShowDocument())
				if (config.getbool(MachineCreator.isshowDocument)) {
					if (m_showdialoginfo) {
						//ADialog.info(m_WindowNo, null, String.format("%s : %s (%s)",Msg.translate(Env.getCtx(), "C_Order_ID"),order.getDocumentNo(), order.getDescription()));
						showErrorPanel(String.format("%s : %s (%s)",Msg.translate(Env.getCtx(), "C_Order_ID"),order.getDocumentNo(), order.getDescription()));
					}
				}
			}
			toolbarbuttons.get(Constants.T_SAVE).setEnabled(hasValidLines());
		}
		if (e.getActionCommand().equals(Constants.T_VOID)) {
			if (ADialog.ask(m_WindowNo, getFrame(),
					Msg.getMsg(Env.getCtx(), "Anular ?"))) {
				if (IsCanDelete()) {
					ObjectViewModel adapter = view.getDataModel();
					for (int j = 0; j < adapter.getRowCount(); j++) {
						Row row = (Row) adapter.getRowObject(j);
						//						if (row != null && row.getC_OrderLine_ID() != 0)
						//							orderlinetoDel.add(row.getC_OrderLine_ID());
					}
					Void();					
				}

			}
		}
		if (e.getActionCommand().equals(Constants.T_PRINT)) {
			Info info = new InfoInvoice(getFrame(), true, m_WindowNo, "",
					false, "DocStatus='CO' AND M_PriceList_ID = "
							+ getOrder().getM_PriceList_ID());
			AEnv.showCenterWindow(null, info);
			Integer C_Invoice_ID = (Integer) info.getSelectedKey();
			if (C_Invoice_ID != null) {
				if (IsPriceListOk() && IsCanVoid()) {
					try {
						MInvoice invoice = MInvoice.get(Env.getCtx(), C_Invoice_ID);						
						MDocType dt = new MDocType(Env.getCtx(), invoice.getC_DocType_ID(), null);

						MQuery m_query = new MQuery();
						m_query.addRestriction(X_C_Invoice.COLUMNNAME_C_Invoice_ID, MQuery.EQUAL, C_Invoice_ID);

						MPrinterDocumentFormat pf = new MPrinterDocumentFormat(Env.getCtx(), dt.getC_PrinterDocumentFormat_ID(), null);
						X_A_MachinePrinter mp = new X_A_MachinePrinter(Env.getCtx(), dt.getA_MachinePrinter_ID(), null);
						PrinterDocumentCtrl pdfc = new PrinterDocumentCtrl(Env.getCtx(), pf, m_query);
						PrintWorker pw = pdfc.getPrintWorker();
						pdfc.print(pw);		
					} catch (Exception e1) {
						e1.printStackTrace();
					}
				}
				else
				{
					ADialog.error(this.m_WindowNo, this, "AccessCannotReport", "");
				}
			}
		}
		if (e.getActionCommand().equals(Constants.T_VOIDDOC)) {
			if (IsCanDelete() && IsPriceListOk()) {
				MInvoice invoice = null;
				MOrder order = null;
				try {
					Info info = new InfoInvoice(getFrame(), true, m_WindowNo, "", false, "DocStatus='CO' AND M_PriceList_ID = "	+ getOrder().getM_PriceList_ID());
					AEnv.showCenterWindow(null, info);
					Integer C_Invoice_ID = (Integer) info.getSelectedKey();
					if (C_Invoice_ID != null) {
						invoice = MInvoice.get(Env.getCtx(), (int) info.getSelectedKey());
						order = new MOrder(Env.getCtx(), invoice.getC_Order_ID(), null);
						if (order.getM_Warehouse_ID() != getOrder().getM_Warehouse_ID())
						{						
							error = "el ".concat(Msg.translate(Env.getCtx(), "M_Warehouse_ID")).concat(" de ").concat(Msg.translate(Env.getCtx(), "M_InOut_ID")).concat(" no es igual al de ").concat(Msg.translate(Env.getCtx(), "C_Order_ID"));
							throw new Exception(error);
						}
						m_session.addVar(X_C_Invoice.COLUMNNAME_C_Invoice_ID, invoice);
						if (m_session.getVar(X_C_Invoice.COLUMNNAME_C_Invoice_ID) != null) {
							if (IsPriceListOk() && IsCanVoid()) {						
								if (invoice != null && ADialog.ask(m_WindowNo,	getFrame(),	String.format("Esta seguro de ANULAR la factura %s",invoice))) {
									VoidTransactionDialog ddialog = new VoidTransactionDialog( getFrame(), m_WindowNo, invoice);
									if (ddialog.isOK()) {
										getFrame().setBusy(true);
										org.compiere.apps.SwingWorker worker = new org.compiere.apps.SwingWorker() {
											public Object construct() {
												cmd_process();
												return Boolean.TRUE;
											}

											private void cmd_process() {
												String err = voidTransaction((MInvoice) m_session.getVar(X_C_Invoice.COLUMNNAME_C_Invoice_ID), m_WindowNo);
												if (err.length() > 0)
													statusBar.setStatusLine( err ,	true);
												else
													setIsFromVoided(true);
												getFrame().setBusy(false);
											}
										};
										worker.start();
									}
								}
								if (invoice != null)
									invoice = null;
							}
						}
					}
				} 
				catch (Exception ex)
				{
					ex.printStackTrace();					
					statusBar.setStatusLine( ex.getMessage(), true);
				}
				finally
				{
					if (invoice != null)
						invoice = null;
					if (order != null)
						order = null;
				}
			}
		}
		if (c.getName() == DocVoid) {

		} 
		else if (c == bCashBased) {			
			getOrder().setC_PaymentTerm_ID(config.getCash_C_PaymentTerm_ID());
			EntryPointPay(Constants.A_CASH);
		} 
		if (c == salespricelist) {
			UpdatePriceList();
		}		
		else if (c == PushButtons.get(Constants.A_COLLECTION)) {
			disableEnvironment();
			CardLayout cl = (CardLayout) (cardPanel.getLayout());			
			cl.show(cardPanel, collection);
			collectionpanel.selection();
		}
		else if (c instanceof PushButton) {
			pushbuttonpanel((PushButton) c, e.getActionCommand());
		}
		else if (e.getSource() instanceof JMenuItem) {
			if (e.getActionCommand().equals("BarAdd")) {
				MProduct prod = MProduct.get(Env.getCtx(), m_topSelected.getM_Product_ID(), null);
				AddProduct(false, prod, Env.ONE, 0,
						m_topSelected.getC_UOM_ID(), null, 0, false);
			} else if (e.getActionCommand().equals("BarMoreInfo"))
			{}
		}
		return;
	}

	private void showUserPanel() {
		if (userpanel == null) {
			userpanel = new UserPanel(this);
			cardPanel.add(userpanel, "userpanel");
		}
		disableEnvironment();
		CardLayout cl = (CardLayout) (cardPanel.getLayout());
		cl.show(cardPanel, "userpanel");

	}

	public CouponPanel getCouponPanel() {
		CouponPanel couponpanel = (CouponPanel) CardPanels.get(coupon);
		if (couponpanel == null) {
			couponpanel = new CouponPanel(this);
			couponpanel.setName(coupon);
			CardPanels.put(coupon, couponpanel);
		}
		return couponpanel;
	}

	public PayPanel getPayPanel()
	{
		PayPanel paypanel = (PayPanel) CardPanels.get(pay);
		if (paypanel == null) {
			paypanel = new PayPanel(this);
			paypanel.setName(pay);
			registerObserver(X_AD_User.Table_Name, pay);
			registerObserver(X_C_BPartner.Table_Name, pay);
			CardPanels.put(pay, paypanel);
		}
		return paypanel;
	}
	public PartnerPanel getPartnerPanel()
	{		    
		PartnerPanel partnerpanel = (PartnerPanel) CardPanels.get(partner);
		if (partnerpanel == null) {
			partnerpanel = new PartnerPanel(this);
			partnerpanel.setName(partner);
			registerObserver(X_C_BPartner.Table_Name, partner);
			CardPanels.put(partner, partnerpanel);
		}
		return partnerpanel;
	}

	private void showPayPanel(String PayTypeAmt) {		
		cardPanel.add(getPayPanel(), pay);		
		CardLayout cl = (CardLayout) (cardPanel.getLayout());
		cl.show(cardPanel, pay);
		getPayPanel().update();
		getPayPanel().setPaymentTermType(PayTypeAmt);
		getPayPanel().selection();
	}


	private void pushbuttonpanel(PushButton c, String ActionCommand) {
		if (ActionCommand.equals(Constants.A_RENDITION)) {
			if (IsCanDelete()) {
				CardLayout cl = (CardLayout) (cardPanel.getLayout());
				cl.show(cardPanel, rendition);
			}
			return;
		}		
		if (ActionCommand.equals(Constants.A_PARTNER)) {
			CardLayout cl = (CardLayout) (cardPanel.getLayout());
			cl.show(cardPanel, partner);
			return;
		}		
		if (ActionCommand.equals(Constants.A_CONFIG)) {
			if (requestAuthorization(config.getWizardPassword())) {
			//if (IsCanDelete()) {
				POSWizardLauncher nn = new POSWizardLauncher();	
				nn.launchWizard();
			}
			return;
		}
		String error = beforetransaction();
		if (error.length() > 0) {
			showErrorPanel(error);
			return;
		}		
		if (ActionCommand.equals(Constants.A_PAY)) {
			getOrder().setC_PaymentTerm_ID(c.getC_PaymentTerm_ID());
			EntryPointPay(c.gettypePayAmt());
		} 
		else if (ActionCommand.equals(Constants.A_COUPON)) {
			getOrder().setC_PaymentTerm_ID(c.getC_PaymentTerm_ID());
			CardLayout cl = (CardLayout) (cardPanel.getLayout());
			couponpanel.setPayTypeAmt(c.getName());
			cl.show(cardPanel, coupon);
		}
		else if (ActionCommand.equals(Constants.A_SHIPPING)) {
			CardLayout cl = (CardLayout) (cardPanel.getLayout());
			shippingpanel.selection();
			cl.show(cardPanel, Constants.A_SHIPPING);			
			return;
		}
		else if (ActionCommand.equals(Constants.A_BONUS)) {
			CardLayout cl = (CardLayout) (cardPanel.getLayout());
			cl.show(cardPanel, bonus);			
		} 
		else if (ActionCommand.equals(Constants.A_PARTIAL)) {
			BigDecimal Partial = getAmt(Constants.A_TOTALNET).subtract(this.getTotalPayment());
			if (Partial.compareTo(BigDecimal.ZERO) == 0) {				
				statusBar.setStatusLine("Generando pago parcial...", false);
				getOrder().setC_PaymentTerm_ID(config.getCredit_C_PaymentTerm_ID());
				String err = process();
				enableEnvironment();
				if (err != null && err.length() > 0) {
					if (m_showdialoginfo)
						showErrorPanel(err);
				}
			}
		}
	}

	public void enableEnvironment() {
		resizetobuttonpanel();
		getView().setEnabled(true);
		getView().requestFocusInWindow();
	}

	public void disableEnvironment() {
		resizetocardpanel();
		getView().setEnabled(false);
	}

	private void EntryPointPay(String PayTypeAmt) {		
		showPayPanel(PayTypeAmt);		
	}

	private String StockNoAvailable() {
		int productvalids = 0;
		StringBuffer sb = new StringBuffer("");
		ObjectViewModel adapter = view.getDataModel();
		for (int j = 0; j < view.getRowCount(); j++) {
			Row row = (Row) adapter.getRowObject(j);
			if (!getOrder().getDeliveryRule().equals(REF_C_OrderDeliveryRule.Force)) {
				if (row.getQtyAvailable().compareTo(BigDecimal.ZERO) < 0) {
					if (sb.length() == 0)
						sb.append(Msg.translate(Env.getCtx(),
								"NotEnoughStocked"));
					sb.append("\n");

					sb.append(row.getName());
					sb.append(" ");
					sb.append(row.getQtyAvailable());
					sb.append("\n");
				}
			}
			if (row.getProduct() != null) {
				productvalids++;
			}
		}
		if (productvalids == 0) {
			sb.append(Msg.translate(Env.getCtx(), "NoLines"));
		}
		return sb.toString();
	}

	private void UpdatePriceList() {
		if (salespricelist.getMPriceList() != null) {
			int M_PriceList_ID = salespricelist.getM_PriceList_ID();
			int M_PriceListVersion_ID = salespricelist.getM_PriceList_Version_ID();
			getOrder().setM_PriceList_ID(M_PriceList_ID);
			getOrder().setM_PriceList_Version_ID(M_PriceListVersion_ID);
			getOrder().setC_Currency_ID(salespricelist.getMPriceList().getC_Currency_ID());
			getOrder().setIsTaxIncluded(salespricelist.getMPriceList().isTaxIncluded());
			if (salespricelist.getMPriceListVersion() == null) {
				throw new XendraException(String.format("no existe version de %s para la fecha %s",
						salespricelist.getMPriceList().getName(),
						getOrder().getDateOrdered()));
			}			
		} 
	}

	public String voidTransaction(MInvoice invoice, int WindowNo) {
		List<MOrderLine> orderlines = new ArrayList<MOrderLine>();
		Integer C_Order_ID = 0;
		String error = "";
		Trx trx = Trx.get(Trx.createTrxName(), true);
		trx.start();			        
		String trxName = trx.getTrxName();
		try 
		{						
			MInOut io = MInOut.getbyC_Invoice_ID(invoice.getC_Invoice_ID(), trxName);
			if (io == null)
			{
				throw new XendraException("Guia no encontrada");
			}			
			if (!io.getDocStatus().equals(DocAction.STATUS_Completed))
				throw new XendraException("guia "+io.toString()+" estado "+io.getDocStatusName());
			invoice.setDocAction(DocAction.ACTION_Void);
			if (!invoice.save())
				throw new XendraException(String.format("no se pudo cambiar el estado de %s",invoice));
			io.setDocAction(DocAction.ACTION_Void);
			if (!io.save())
				throw new XendraException(String.format("no se pudo cambiar el estado de %s", io));
			C_Order_ID = invoice.getC_Order_ID();
			MInvoiceLine[] lines = invoice.getLines();
			for (MInvoiceLine line:lines)
			{
				MOrderLine oline = new MOrderLine(Env.getCtx(), line.getC_OrderLine_ID(), trxName);
				orderlines.add(oline);
			}
			ProcessInfo pi = WorkflowUtils.Process(invoice, trxName);
			if (pi.isError())
				throw new Exception(pi.getSummary());
			pi = WorkflowUtils.Process(io, trxName);
			if (pi.isError())
				throw new Exception(pi.getSummary());
			MOrder order = new Query(Env.getCtx(), X_C_Order.Table_Name, "C_Order_ID = ?", trxName)
			.setParameters(C_Order_ID).first();
			if (order != null)
			{
				MOrder newOrder = MOrder.copyFrom(order, 
						order.getDateOrdered(), 
						order.getC_DocTypeTarget_ID(), 
						order.isSOTrx(), 
						true, 
						true, /* copyASI */ 
						false, /* Include Lines */
						null, trxName);
				newOrder.setC_DocType_ID(order.getC_DocTypeTarget_ID());
				if (!newOrder.save())
					throw new Exception("can't create order");
				//trx.commit();
				C_Order_ID = newOrder.getC_Order_ID();

				for (MOrderLine line:orderlines)
				{
					MOrderLine newline = new MOrderLine(Env.getCtx(), 0, trxName);
					X_C_OrderLine.copyValues(line, newline);
					newline.setC_Order_ID(C_Order_ID);
					newline.save();
				}
			}
			trx.commit();
			Trx m_trx2 = Trx.get(trx.getTrxName(), false);
			if (m_trx2 != null)
				m_trx2.commit();			
		}
		catch (Exception e) {			
			C_Order_ID = 0;
			error = e.getMessage();
			e.printStackTrace();
			trx.rollback();						
		}
		finally {
			trx.close();
		};		
		if (C_Order_ID > 0) 
			LoadOffer(C_Order_ID);

		return error;				
	}
	/**
	 * Voids the specified order and its invoice and material receipt.
	 * 
	 * @param C_Order_ID
	 *            The order to void.
	 * @return Null on success, a message to be translated on error.
	 */
	public String voidTransaction2(MInvoice invoice, int WindowNo) {
		if (invoice == null)
			return null;
		String error = "";
		String properties = Env.getRemoteContextToXML(Env.getCtx());

		String host = Env.getContext(Env.getCtx(), "#HostMessenger");

		FormatMessage s = new FormatMessage(Constants.VOIDMESSAGE);
		s.AddDocumentPart(Constants.HEADER, "");
		s.AddProperty(Constants.HEADER, Constants.ID, Util.getUUID());
		try {			
			Queue queue = (Queue) CConnection.get().lookup(host, Constants.QVOIDQUEUE);
			QueueConnectionFactory cf = (QueueConnectionFactory) CConnection.get().lookup(host,	Constants.QConnectionFactory);
			QueueConnection connection = cf.createQueueConnection();
			connection.start();			
			QueueSession session = connection.createQueueSession(false,	Session.AUTO_ACKNOWLEDGE);
			QueueRequestor queueRequestor = new QueueRequestor(session, queue);
			TextMessage request = session.createTextMessage(s.getMessage());
			request.setIntProperty("C_Invoice_ID", invoice.getC_Invoice_ID());
			//request.setIntProperty("M_Warehouse_ID", getOrder().getM_Warehouse_ID());			
			request.setStringProperty("Properties", properties);
			request.setStringProperty(X_C_Order.COLUMNNAME_Identifier, invoice.getIdentifier());
			TextMessage reply = (TextMessage) queueRequestor.request(request);
			error = reply.getStringProperty("Message");
			int C_Order_ID = reply.getIntProperty("C_Order_ID");
			if (C_Order_ID > 0) {
				LoadOffer(C_Order_ID);
			} 
			//else
			//	err_msg = voidMessage;
			connection.close();
			System.out.println("Send request: " + request.getText());
			System.out.println("Received reply:" + reply.getText());			
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		return error;
	}

	@SuppressWarnings("deprecation")
	private MOrder SaveOffer() {
		Trx trx = Trx.get(Trx.createTrxName(), true);
		trx.start();
		String trxname = trx.getTrxName();
		DescriptionDialog ddialog = new DescriptionDialog(this,getOrder(),trxname);
		MOrder order = null;
		if (ddialog.isOK()) {
			try {
				order = ddialog.getOrder();
				MDocType[] dt = MDocType.getDocSubType(Env.getCtx(), REF_C_DocTypeSubType.Proposal);
				if (dt.length == 0)
					throw new XendraException("dt length = 0 ");
				else {
					order.setC_DocType_ID(dt[0].getC_DocType_ID());
					order.setC_DocTypeTarget_ID(dt[0].getC_DocType_ID());
					order.setDocAction(DocAction.STATUS_Completed);
					order.setDocStatus(DocAction.STATUS_Drafted);
				}
				// }
				if (!order.save(trxname))
					throw new XendraException("error");
				//purgeorderlinesdeleted(trxname);
				ObjectViewModel adapter = view.getDataModel();
				List<X_C_OrderLine> lines = new Query(Env.getCtx(), X_C_OrderLine.Table_Name, "C_Order_ID = ?", null)
				.setParameters(order.getC_Order_ID()).list();
				for (X_C_OrderLine line:lines)
				{
					boolean found = false;
					for (int j = 0; j < adapter.getRowCount(); j++) {
						Row row = (Row) adapter.getRowObject(j);
						if (row.getC_OrderLine_ID() > 0)
						{
							if (line.getC_OrderLine_ID() == row.getC_OrderLine_ID())
							{
								found = true;
							}
						}
					}
					if (!found)
					{
						line.delete(true);
					}
				}
				for (int j = 0; j < adapter.getRowCount(); j++) {
					Row row = (Row) adapter.getRowObject(j);
					if (row.getM_Product_ID() > 0
							&& row.getQtyOrdered().compareTo(Env.ZERO) != 0) {
						MOrderLine line = null;
						if (row.getC_OrderLine_ID() != 0
								&& getOrder().getC_Order_ID() != 0)
							//line = new MOrderLine(Env.getCtx(), row.getC_OrderLine_ID(), trxname);
							line = new Query(Env.getCtx(), X_C_OrderLine.Table_Name, "C_OrderLine_ID = ?", null)
						.setParameters(row.getC_OrderLine_ID()).first();
						if (line == null)
							line = new MOrderLine(order);
						row.ToOrderLine(line);
						line.save(trxname);
					}
				}
				if (!trx.commit())
					throw new XendraException("");
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				trx.close();				
			}
		}
		return order;
	}

	private void LoadOffer() {

		if (!IsPriceListOk())
			return;

		MDocType[] dt = MDocType.getDocSubType(Env.getCtx(),REF_C_DocTypeSubType.Proposal);
		String DocType = "";
		for (MDocType dtdoc : dt) {
			Integer C_DocType_ID = dtdoc.getC_DocType_ID();
			if (DocType.length() == 0)
				DocType = "(";
			else
				DocType = DocType.concat(",");
			DocType = DocType.concat(C_DocType_ID.toString());
		}
		if (DocType.length() > 0)
			DocType = DocType.concat(")");
		// Info m_info = new InfoOrder (getFrame(), true,
		// Env.WINDOW_INFO,"",false,
		// String.format("docstatus ='DR' AND isactive='Y' AND M_PriceList_ID=%s  AND C_DocTypeTarget_ID in %s",getOrder().getM_PriceList_ID(),DocType));
		Info m_info = new InfoOrder(getFrame(), true, Env.WINDOW_INFO, "",
				false, String.format("C_Order.M_PriceList_ID=%s AND C_Order.AD_Org_ID=%s ", getOrder().getM_PriceList_ID(), Env.getAD_Org_ID(Env.getCtx())));
		if (!m_info.loadedOK()) {
			m_info.dispose();
		}
		m_info.setVisible(true);
		Integer C_Order_ID = (Integer) m_info.getSelectedKey();
		//LoadOffer(C_Order_ID, false);
		LoadOffer(C_Order_ID);
	}

	//private void LoadOffer(Integer C_Order_ID, Boolean IsVoidTransaction) {
	private void LoadOffer(Integer C_Order_ID) {
		if (C_Order_ID != null) {
			m_BlockPriceList = true;
			Void();
			cleanlines();
			MySwingWorker wks = new MySwingWorker(C_Order_ID);
			wks.start();

		}
	}

	class MySwingWorker extends org.compiere.apps.SwingWorker {
		Integer C_Order_ID;
		//Boolean IsVoid;		
		//public MySwingWorker(int Order_ID, Boolean m_IsVoid) {
		public MySwingWorker(int Order_ID) {
			C_Order_ID = Order_ID;
			//IsVoid = m_IsVoid;
			//orderlines = lines;
		}

		public Object construct() {
			view.setEnabled(false);
			//updatePO(new MOrder(Env.getCtx(), C_Order_ID, null));
			execute(new MOrder(Env.getCtx(), C_Order_ID, null));
			execute(new MUser(Env.getCtx(), getOrder().getSalesRep_ID(), null));
			execute(new MBPartner(Env.getCtx(), getOrder().getC_BPartner_ID(), null));
			getPartner().notifyObservers();			
			//updatePO(MBPartner.get(Env.getCtx(), getOrder().getC_BPartner_ID()), "partner");
			//executerules(null, "partner");

			//bPartner(getOrder().getC_BPartner_ID());			
			//DocumentNo.setText(getOrder().getDocumentNo());
			MOrderLine[] lines = getOrder().getLines();
			for (MOrderLine line : lines) {
				//				if (orderlines != null)
				//				{
				//					for (MOrderLine orderline:orderlines)
				//					{
				//						if (line.equals(orderline))
				//						{
				//							AddLine();
				//							Row row = AddRow(line, true);
				//							break;
				//						}
				//					}
				//				}
				//				else
				//				{
				AddLine();
				Row row = AddRow(line, false);
				//				}
				// AddCampaign(row);
				// ExecuteCampaign();
			}
			if (lines.length == 0)
				AddLine();
			calculateTotalLines();
			view.setEnabled(true);
			return Boolean.TRUE;
		}

		public void finished() {
			toolbarbuttons.get(Constants.T_SAVE).setEnabled(hasValidLines());
		}
	}

	private Row AddRow(MOrderLine line, Boolean IsVoid) {
		Row row = new Row();
		row.setPOSPanel(this);
		// row.setOverwritePriceLimit(config.isOverwritePriceList());
		row.setOverwritePriceLimit(config.getbool(MachineCreator.overwritepricelimit));
		row.setDeliveryRule(getOrder().getDeliveryRule());
		row.setC_BPartner_ID(getOrder().getC_BPartner_ID());
		row.setM_PriceList_ID(getOrder().getM_PriceList_ID());
		row.setM_PriceListVersion_ID(getOrder().getM_PriceList_Version_ID());
		row.setWindowNo(m_WindowNo);
		row.setC_Currency_ID(getOrder().getC_Currency_ID());
		row.setM_Warehouse_ID(getOrder().getM_Warehouse_ID());
		row.setDateOrdered(getOrder().getDateOrdered());
		row.setDatePromised(getOrder().getDateOrdered());
		row.setTaxIncluded(getOrder().isTaxIncluded());
		row.setOrderLine(line, IsVoid);
		//updateRow(row);
		DefaultObjectViewModel mModel = (DefaultObjectViewModel) view.getDataModel();
		Object SelectedRow = view.getSelectedRowObject();
		mModel.updateRow(SelectedRow, row);
		int selectedIndex = view.getSelectedRow();
		if (selectedIndex == -1)
			selectedIndex = 0;

		view.setRowSelectionInterval(selectedIndex, selectedIndex);
		int mDefault = ((DefaultObjectViewModel) view.getDataModel()).getPosition("Default");
		if (mDefault > 0)
			view.setColumnSelectionInterval(mDefault, mDefault);
		return row;
	}

	public boolean IsOverMaxAmount(BigDecimal maxamount)
	{
		boolean isover = false;
		if (maxamount.equals(BigDecimal.ZERO))
			return isover;
		isover = PolicyRequest.getInstance().IsOverMaxAmount(view, maxamount);
		return isover;
	}

	public synchronized void calculateTotalLines() {
		// to the next update
		//executerules(null, "total");		
		PolicyRequest.getInstance().Total((MOrder) getPO(X_C_Order.Table_Name), view, amounts, baseamounts, taxamounts);
		//		Iterator iter = amounts.entrySet().iterator();
		//		while (iter.hasNext())
		//		{
		//			
		//		}		
		//		BigDecimal PerceptionAmt = Env.ZERO;
		//		m_rowcount = 0;
		//		int sequence = 1;
		//		ObjectViewModel adapter = view.getDataModel();
		//		for (int j = 0; j < view.getRowCount(); j++) {
		//			Row row = (Row) adapter.getRowObject(j);
		//			row.setRowID(sequence);
		//			sequence++;
		//			if (row.getAncientAttributeSetInstance_ID() > 0) {
		//				CreateAncientAttributeSetInstance(row);
		//			}
		//			if (row.getM_Product_ID() > 0	&& row.getQtyOrdered().compareTo(Env.ZERO) != 0) {
		//				setAmt(Constants.A_TOTALGROSS, getAmt(Constants.A_TOTALGROSS).add(row.getGross()));
		//				setAmt(Constants.A_TOTALNET, getAmt(Constants.A_TOTALNET).add(row.getTotal()));
		//				if (row.getDiscount().compareTo(Env.ZERO) != 0) {
		//					BigDecimal discount = row.getPriceList().multiply(row.getQtyEntered());
		//					discount = discount.multiply(row.getDiscount().divide(Env.ONEHUNDRED));
		//					discount = discount.setScale(2, BigDecimal.ROUND_HALF_UP);					
		//					setAmt(Constants.A_TOTALDISCOUNT, getAmt(Constants.A_TOTALDISCOUNT).add(discount));
		//				}
		//				if (row.getWithholdingType().equals(REF_WithholdingType.Perception)) {
		//					PerceptionAmt = PerceptionAmt.add(getAmt(Constants.A_TOTALNET));
		//				}
		//				m_rowcount++;
		//			}
		//		}
		if (m_IsAllowCampaign)
			ExecuteCampaign();
		labelTotalAmount.setText(getAmt(Constants.A_TOTALGROSS).toString());
		labelDiscountAmount.setText(getAmt(Constants.A_TOTALDISCOUNT).toString());
		labelNetAmount.setText(getAmt(Constants.A_TOTALNET).toString());
		view.revalidate();
	}

	public void ShowException(Row row) {
		if (m_showdialoginfo)
			//ADialog.error(m_WindowNo, null, "PosError", Msg.getMsg(Env.getCtx(), row.getM_processMsg()));
			showErrorPanel(Msg.getMsg(Env.getCtx(), row.getM_processMsg()));
		if (row.getQtyLostSales().signum() > 0) {
			Vector LostSales = new Vector();
			LostSales.add(row.getM_Product_ID());
			LostSales.add(row.getC_UOM_ID());
			LostSales.add(row.getQtyLostSales());
			m_lostSales.add(LostSales);
		}
		row.setM_processMsg(null);
	}

	private void CreateAncientAttributeSetInstance(Row row) {
		//
		System.out.println("D");
		Row rowclone = row.Clone();
		if (rowclone != null) {
			int AncientAttributeSetInstance = row.getAncientAttributeSetInstance_ID();
			BigDecimal Qty = row.getAncientAttributeSetInstanceQtyAvailable();
			// rowclone.setAncientAttributeSetInstance_ID(0);
			rowclone.setM_AttributeSetInstance_ID(AncientAttributeSetInstance);
			// se pone null xq si el atributo se cambia pero no el total deja un
			// mensaje de error xq aun no cambiamos el monto.
			// y para cuando cambiamos el monto el lote ya debe estar cambiado.
			rowclone.setM_processMsg(null);
			if (rowclone.qty("QtyOrdered", Qty)	&& rowclone.amt("QtyOrdered", Qty)) {
				((DefaultObjectViewModel) view.getDataModel()).addRow(rowclone);
				row.setAncientAttributeSetInstance_ID(0);
				row.setAncientAttributeSetInstanceQtyAvailable(Env.ZERO);
			}
		}
	}

	public ObjectView getView() {
		return view;
	}

	protected void createToolBar() {
		final JToolBar bar = new JToolBar();
		bar.add(BPartnerInfo);		
		toolbarbuttons.put(Constants.T_VOID, AEnv.createActionButton(AppsActions.get(Constants.T_VOID), null, "New24",	"Nuevo documento"));		
		toolbarbuttons.get(Constants.T_VOID).addActionListener(this);
		bar.add(toolbarbuttons.get(Constants.T_VOID));

		toolbarbuttons.put(Constants.T_LOAD, AEnv.createActionButton(AppsActions.get(Constants.T_LOAD), null, "Open24",	"Cargar documento"));
		toolbarbuttons.get(Constants.T_LOAD).addActionListener(this);
		bar.add(toolbarbuttons.get(Constants.T_LOAD));

		toolbarbuttons.put(Constants.T_SAVE, AEnv.createActionButton(AppsActions.get(Constants.T_SAVE), null, "document-save","Grabar documento"));
		toolbarbuttons.get(Constants.T_SAVE).addActionListener(this);
		bar.add(toolbarbuttons.get(Constants.T_SAVE));

		toolbarbuttons.put(Constants.T_VOIDDOC, AEnv.createActionButton(AppsActions.get(Constants.T_VOIDDOC), null, "DocVoid16","Anular documento"));
		toolbarbuttons.get(Constants.T_VOIDDOC).addActionListener(this);
		bar.add(toolbarbuttons.get(Constants.T_VOIDDOC));
		bar.addSeparator(new Dimension(5, 0));
		toolbarbuttons.put(Constants.T_PRINT, AEnv.createActionButton(AppsActions.get(Constants.T_PRINT), null, "Print24","Re Imprimir Documento"));
		toolbarbuttons.get(Constants.T_PRINT).addActionListener(this);
		bar.add(toolbarbuttons.get(Constants.T_PRINT));
		bar.addSeparator(new Dimension(5, 0));
		toolbarbuttons.put(Constants.T_USER, AEnv.createActionButton(AppsActions.get(Constants.T_USER), null, "InfoBPartner24","Usuario"));
		toolbarbuttons.get(Constants.T_USER).addActionListener(this);
		bar.add(toolbarbuttons.get(Constants.T_USER));		
		bar.addSeparator(new Dimension(5, 0));		
		bar.add(currentworkshift );		
		bar.addSeparator(new Dimension(5, 0));
		bar.add(salespricelist);

		bar.addSeparator(new Dimension(5, 0));
		bar.add(lconexion);
		bar.addSeparator(new Dimension(260, 0));
		bar.setFloatable(false);
		DigitalClock myClock = new DigitalClock();
		//
		Component box = Box.createHorizontalGlue();
		bar.add(box);

		JPanel throbberPanel = new JPanel();
		throbberPanel.setLayout(new BorderLayout());
		throbberPanel.add(myClock, BorderLayout.EAST);

		bar.add(throbberPanel);
		//
		bar.add(myClock);
		getFrame().getContentPane().add(BorderLayout.NORTH, bar);
	}

	protected JPanel createToolbarItemPanel(JComponent component) {
		final JPanel pagePanel = new JPanel(new GridBagLayout());
		pagePanel.add(component);
		return pagePanel;
	}

	public MBPartner getPartner() {
		MBPartner partner = (MBPartner) getPO(X_C_BPartner.Table_Name);
		return partner;
	}
	//	public void setPartner(MBPartner partner) {
	//		m_bpartner = partner;
	//	}	
	public MOrder getOrder()
	{
		MOrder order = (MOrder) getPO(X_C_Order.Table_Name);
		return order;
	}

	public MUser getUser()
	{
		MUser user = (MUser) getPO(X_AD_User.Table_Name);
		return user;
	}

	//	public PO getPO(String key) {
	//		PO retval = Test.getInstance().getPO(getId(), key);
	//		return retval;
	//	}
	public void updateRow(Row row) {
		UpsertFact(row.getIdentifier(), row);
		//if (FactHandlers.containsKey(row.getIdentifier()))
		//{
		//	FactHandle fh = FactHandlers.get(row.getIdentifier());
		//	ksession.update(fh, row);
		//}
		//else
		//{
		//	FactHandle fh = ksession.insert(row);
		//	FactHandlers.put(row.getIdentifier(), fh);
		//}
	}
	public void updatePO(PO po) {
		if (po == null)
			return;
		//Test.getInstance().updatePO(getId(), po);
		businessobjects.put(po.get_TableName(), po);
		List<String> panels = this.getObservers(po.get_TableName());
		for (String panel:panels)
		{
			po.addObserver(CardPanels.get(panel));
		}
		po.addObserver(this);
		UpsertFact(po.get_TableName(), po);
		//if (FactHandlers.containsKey(po.get_TableName()))
		//{
		//	FactHandle fh = FactHandlers.get(po.get_TableName());
		//	ksession.update(fh, po);
		//}
		//else
		//{
		//	FactHandle fh = ksession.insert(po);
		//	FactHandlers.put(po.get_TableName(), fh);
		//}		
	}
	public void execute(String rule) {
		Iterator it = boagenda.entrySet().iterator();
		while (it.hasNext())
		{
			Map.Entry entry = (Entry) it.next();
			String agenda = (String) entry.getValue();
			if (agenda.equals(rule))
			{
				ksession.getAgenda().getAgendaGroup(agenda).setFocus();
				ksession.fireAllRules();
				break;
			}
		}
	}
	public void execute(PO po) {
		updatePO(po);
		String agenda = (String) boagenda.get(po.get_TableName());
		if (agenda != null)
		{
			ksession.getAgenda().getAgendaGroup(agenda).setFocus();
			ksession.fireAllRules();
		}
	}
	public void executerules(String entrypoint, String agenda) {
		if (agenda != null)
		{
			ksession.getAgenda().getAgendaGroup( agenda ).setFocus();
		}
		if (entrypoint != null)
		{

		}
		ksession.fireAllRules();
	}
	public void updateRule(SimpleRule rule, String agenda) {
		if (!boagenda.containsKey(agenda))
			boagenda.put(rule.getName(), agenda);
		UpsertFact(rule.getName(), rule);
		//if (FactHandlers.containsKey(rule.getName()))
		//{
		//	FactHandle fh = FactHandlers.get(rule.getName());
		//	ksession.update(fh, rule);
		//}
		//else
		//{
		//	FactHandle fh = ksession.insert(rule);
		//	FactHandlers.put(rule.getName(), fh);
		//}		
	}


	public PaymentPOS getPayment() {
		return m_payment;
	}

	protected void finalize() throws Throwable {
		// m_replication = null;
	}

	public boolean candispose() {		
		boolean goahead = true;
		if (config != null)
		{
			if (!config.getbool(MachineCreator.isCloseWindow))
				if (requestAuthorization(config.getClosePassword()))
					goahead = true;
		}			
		return goahead;
	}	

	public void dispose() {
		super.dispose();
		HashMap props = Env.getMachine().getProperties();
		props.put("BUTTONPANELSTATE", margin.get(BUTTONPANELSTATE));
		props.put("CARDPANELSTATE", margin.get(CARDPANELSTATE));
		Env.getMachine().setProperties(props);
		Env.getMachine().save();
		String fileName = Ini.getXendraHome() + File.separator+ "pos.properties";
		saveSettings(fileName);			
	} // dispose

	private void showmessages(boolean b) {
		m_showdialoginfo = b;
	}

	private void setIsFromVoided(boolean b) {
		m_IsFromVoided = b;
	}

	public boolean IsFromVoided() {
		return m_IsFromVoided;
	}

	private void importcsv(String filename) {
		try {
			BufferedReader br = new BufferedReader(new FileReader(filename));
			StringTokenizer st = null;
			boolean lContinue = true;
			int linenumber = 0, tokennumber = 0;
			int iM_Product_ID = 0, iValue = 0, iM_PriceList_ID = 0, iQty = 0, iUOM = 0, iName = 0, iBrand = 0, iPrice = 0;
			int M_Product_ID = 0, UOM = 0, M_PriceList_ID = 0;
			BigDecimal Qty = Env.ZERO, Price = Env.ZERO;			
			while ((filename = br.readLine()) != null) {
				linenumber++;
				st = new StringTokenizer(filename, ",");
				while (st.hasMoreTokens()) {
					String tok = st.nextToken();
					if (linenumber == 1) {
						if (tok.equals("M_Product_ID"))
							iM_Product_ID = tokennumber;
						else if (tok.equals("Value"))
							iValue = tokennumber;
						else if (tok.equals("M_PriceList_ID"))
							iM_PriceList_ID = tokennumber;
						else if (tok.equals("Qty"))
							iQty = tokennumber;
						else if (tok.equals("UOM"))
							iUOM = tokennumber;
						else if (tok.equals("Name"))
							iName = tokennumber;
						else if (tok.equals("Brand"))
							iBrand = tokennumber;
						else if (tok.equals("Price"))
							iPrice = tokennumber;
					} else {
						if (tokennumber == iM_Product_ID)
							M_Product_ID = Integer.parseInt(tok);
						else if (tokennumber == iValue) {
						} else if (tokennumber == iM_PriceList_ID) {
							M_PriceList_ID = Integer.parseInt(tok);
						} else if (tokennumber == iQty)
							Qty = new BigDecimal(tok);
						else if (tokennumber == iUOM)
							UOM = Integer.parseInt(tok);
						else if (tokennumber == iName) {
						} else if (tokennumber == iBrand) {
						} else if (tokennumber == iPrice) {
							Price = new BigDecimal(tok);
						}
					}
					tokennumber++;
				}
				if (linenumber > 1) {
					if (M_PriceList_ID != getOrder().getM_PriceList_ID()) {
						lContinue = false;
						if (getOrder().getM_PriceList_ID() == 0) {
							MPriceList mpl = MPriceList.get(Env.getCtx(),
									M_PriceList_ID, null);
							int PriceListVersion_ID = mpl.getPriceListVersion(getOrder().getDateOrdered()).getM_PriceList_Version_ID();
							// pickPriceListVersion.setValue();
							salespricelist.setM_PriceList_ID(getOrder().getM_PriceList_ID());
							//							int item = 0;
							//							while (item < pickPriceListVersion.getItemCount()) {
							//								KeyNamePair option = (KeyNamePair) pickPriceListVersion.getItemAt(item);
							//								if (PriceListVersion_ID == option.getKey()) {
							//									lContinue = true;
							//									getOrder().setM_PriceList_ID(M_PriceList_ID);
							//									UpdatePrice(getOrder().getM_PriceList_ID());
							//									break;
							//								}
							//								item++;
							//							}
						}
					}
					if (M_Product_ID > 0 && UOM > 0 && Qty != null
							&& Price != null && lContinue) {
						MProduct product = MProduct.get(Env.getCtx(), M_Product_ID, null);
						AddLine();
						AddProduct(false, product, Qty, 0, UOM, Price, 0, false);
					}
				}
				tokennumber = 0;
			}
			br.close();			
			if (!lContinue)
				showErrorPanel("PriceListVersion no coincide");
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}

	public void setCoupons(List<X_C_Coupon> Coupons) {
		m_Coupons = Coupons;
	}

	//	public void stateChanged(ChangeEvent e) {
	//
	//	}

	//	public void resetPartner() {
	//		Integer C_BPartner_ID = model.getDefaultBPartner();
	//		bPartner(C_BPartner_ID);
	//	}

	public String bPartner(Object C_BPartner_ID) {
		return "";
		//return PartnerPanel.getInstance(this).bPartner(C_BPartner_ID);		
	}

	public void resetOrder() {
		Calendar time = Calendar.getInstance();
		time.setTimeInMillis(System.currentTimeMillis());
		time.setTimeZone(TimeZone.getTimeZone("GMT-5:00"));
		execute(new MOrder(Env.getCtx(), 0, null));
		MClientInfo ci = MClientInfo.get(Env.getCtx());
		MBPartner partner = new Query(Env.getCtx(), X_C_BPartner.Table_Name, "C_BPartner_ID = ? ", null).setParameters(ci.getC_BPartnerCashTrx_ID()).first();				
		//execute(MBPartner.get(Env.getCtx(), config.getDefault_C_BPartner_ID()));
		execute(partner);
		execute(MUser.get(Env.getCtx(), Env.getAD_User_ID(Env.getCtx())));
		//orderlinetoDel = new Vector<Integer>();
		Env.setContext(Env.getCtx(), m_WindowNo, "M_Warehouse_ID",	config.getM_Warehouse_ID());
		if (getC_DocTypeTargetID() != 0)
			getOrder().setC_DocTypeTarget_ID(getC_DocTypeTargetID());
		lines.clear();
	}

	public void resetPriceList() {
		if (m_BlockPriceList)
		{
			m_BlockPriceList = false;
			return;
		}
		m_IsAllowCampaign = false;
		if (config.getM_PriceList_ID() == 0
				|| getUser().isFullPriceListAccess()) {
			salespricelist.setM_PriceList_ID(0);
			salespricelist.setReadWrite(true);
		} else {
			lPriceList.setText(Msg.getMsg(Env.getCtx(), "PriceList"));
			salespricelist.setM_PriceList_ID(config.getM_PriceList_ID());
			salespricelist.setReadWrite(false);
			UpdatePriceList();
		}
	}

	public void resetSequence() {
		SerialToInvoice = "";
		InvoiceDocumentNo = "";
	}

	public void resetPayment() {
		m_payment = new PaymentPOS();
	}

	public void tableViewChanged(ObjectViewModelEvent pEvent) {
		System.out.println("oa");
	}

	/**
	 * Load the setings from the xml file name
	 * 
	 * @param pFileName
	 *            the xml file name
	 */
	public void loadSettings(String pFileName) {
		File file = new File(pFileName);
		if (!file.exists())
			return;
		ObjectViewAdapter adapter = (ObjectViewAdapter) view.getModel();
		IObjetViewColumn[] columns = adapter.getModel().getColumns();
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		try {
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document doc = builder.parse(file.getAbsolutePath());

			NodeList divs = doc.getElementsByTagName("divider");
			Integer defaultwidth = 840;
			if (divs.getLength() > 0) {
				Element div = (Element) divs.item(0);
				Integer divwidth = new Integer(div.getAttribute("width"))
				.intValue();
				if (divwidth > 0)
					defaultwidth = divwidth;
			}

			// infoPanel.setDividerLocation(defaultwidth);

			NodeList nodelist = doc.getElementsByTagName("column");
			for (int i = 0; i < nodelist.getLength(); i++) {
				Element elem = (Element) nodelist.item(i);
				if (elem.getTagName().compareTo("column") == 0) {
					for (int j = 0; j < columns.length; j++) {
						final IObjetViewColumn column = columns[j];
						TableColumn tableColumn = view.getColumnModel()
								.getColumn(j);
						if (column.getName().compareTo(elem.getAttribute("id")) == 0) {
							if (elem.getAttribute("visible")
									.compareToIgnoreCase("true") == 0) {
								if (!adapter.isVisible(column)) {
									adapter.setVisible(column, true);
								}
							} else {
								if (adapter.isVisible(column)) {
									adapter.setVisible(column, false);
								}
							}
							if (elem.getAttribute("width").length() > 0) {
								Integer width = new Integer(
										elem.getAttribute("width")).intValue();
								if (width > 0)
									tableColumn.setPreferredWidth(width);
							}
						}
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Saves the setting to a file
	 * 
	 * @param pFileName
	 *            the fale nema
	 */
	public void saveSettings(String pFileName) {
		if (view == null)
			return;
		ObjectViewAdapter adapter = (ObjectViewAdapter) view.getModel();
		IObjetViewColumn[] columns = adapter.getModel().getColumns();
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		try {
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document doc = builder.newDocument();
			Element xroot = doc.createElement("xml");
			doc.appendChild(xroot);
			Element broot = doc.createElement("body");
			xroot.appendChild(broot);
			Element er = doc.createElement("divider");
			Integer divider = infoPanel.getDividerLocation();
			er.setAttribute("width", divider.toString());

			broot.appendChild(er);

			// enabled/disabled columns
			for (int i = 0; i < columns.length; i++) {
				final IObjetViewColumn column = columns[i];
				Element e = doc.createElement("column");
				broot.appendChild(e);
				// column name
				e.setAttribute("id", column.getName());
				// visibility
				if (adapter.isVisible(column)) {
					e.setAttribute("visible", "true");
				} else {
					e.setAttribute("visible", "false");
				}
				e.setAttribute("displaytype", column.getDisplayType()
						.toString());
				// column width
				for (int j = 0; j < view.getColumnCount(); j++) {
					TableColumn tableColumn = view.getColumnModel()
							.getColumn(j);
					if (tableColumn.getHeaderValue().toString()
							.compareTo(column.getName()) == 0) {
						e.setAttribute("width",
								new Integer(tableColumn.getWidth()).toString());
						break;
					}
				}
			}
			// save the document
			writeXmlToFile(pFileName, doc);
		} catch (Exception e) {
			e.printStackTrace(); // To change body of catch statement use File |
			// Settings | File Templates.
		}
	}

	/**
	 * Write to an XML file
	 * 
	 * @param pFilename
	 *            the file name
	 * @param pDocument
	 *            the document
	 */
	public static void writeXmlToFile(String pFilename, Document pDocument) {
		try {
			// Prepare the DOM document for writing
			Source source = new DOMSource(pDocument);
			// Prepare the output file
			File file = new File(pFilename);
			Result result = new StreamResult(file);
			// Write the DOM document to the file
			// Get Transformer
			Transformer xformer = TransformerFactory.newInstance()
					.newTransformer();
			// Write to a file
			xformer.setOutputProperty(OutputKeys.INDENT, "yes"); // add newlines
			xformer.transform(source, result);
		} catch (TransformerException e) {
			e.printStackTrace(); // To change body of catch statement use File |
			// Settings | File Templates.
		}
	}

	public StatusBar getStatusBar() {
		return statusBar;
	}

	class LabelTop extends JLabel implements MouseListener, ActionListener {
		public int M_Product_ID = 0;
		public int C_UOM_ID = 0;

		public LabelTop(String string) {
			super(string);
			addMouseListener(this);
		}

		int getM_Product_ID() {
			return M_Product_ID;
		}

		public void setM_Product_ID(int Product_ID) {
			M_Product_ID = Product_ID;
		}

		int getC_UOM_ID() {
			return C_UOM_ID;
		}

		public void setC_UOM_ID(int UOM_ID) {
			C_UOM_ID = UOM_ID;
		}

		@Override
		public void mouseClicked(MouseEvent e) {
			if (SwingUtilities.isRightMouseButton(e)) {
				m_topSelected = (LabelTop) e.getSource();
				popMenuBar.show((Component) e.getSource(), e.getX(), e.getY());
			}
		}

		@Override
		public void mouseEntered(MouseEvent arg0) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseExited(MouseEvent arg0) {
			// TODO Auto-generated method stub
		}

		@Override
		public void mousePressed(MouseEvent e) {

		}

		@Override
		public void mouseReleased(MouseEvent arg0) {
			// TODO Auto-generated method stub
		}

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub

		}
	}


	public FormFrame getFrame() {
		return m_Frame;
	}

	public void setUser(MUser user) {
		//uptePO(user);
		this.execute(user);
	}

	private void setUsername(String name) {
		m_usename = name;
		updatestatusBar();
	}

	private void setPOSName(String name) {
		m_posname = name;
		updatestatusBar();
	}

	private void updatestatusBar() {
		statusBar
		.setStatusLine(m_posname.concat("  ").concat(m_usename), false);
	}

	public void AddProductEvent(RowBase row) {
		toolbarbuttons.get(Constants.T_SAVE).setEnabled(hasValidLines());
		//		if (config.getbool(MachineCreator.ismodifyPriceList))
		//		{
		//			error = EmbeddedMessageServer.getInstance().SendMessage(Constants.QDEMAND, ((Row) row).getMessage());
		//			if (error.length() > 0) {
		//				row.setM_processMsg(error);
		//			}
		//		}
	}

	public void activecard(String m_prevcard) {
		CardLayout cl = (CardLayout) (cardPanel.getLayout());		
		cl.show(cardPanel, m_prevcard);			
		for (Component comp : cardPanel.getComponents()) {
			if (comp.isVisible() == true) {
				if (comp.getName().equals(buttonpanel))
				{

				}
				else		    			
					((ICardPanel) comp).selection();		        
				break;
			}
		}				

	}

	public void setStatusLine(String msg, boolean error) {
		statusBar.setStatusLine(msg, error);		
	}

	public void update(Observable observable, Object arg1) {
		if (observable instanceof MOrder)
		{	
		}
		else if (observable instanceof  MBPartner)
		{
			MBPartner partner = (MBPartner) observable;
			BPartnerInfo.setText(partner.getName());
		}
		else if (observable instanceof MUser)
		{
			System.out.println("X");
		}
	}
	public void setAdjustType(String value) {		
		m_AdjustType = value;
	}
	public boolean isCanChangePrice() {
		Boolean canchangeprice = (Boolean) props.get(MachineCreator.ismodifyprice);		
		if (!canchangeprice)
			canchangeprice = requestAuthorization(config.getChangePricePassword());
		return canchangeprice;
	}
	public int getWindowNo() {
		return m_WindowNo;
	}
	public MDocType getDocType()  {
		PayPanel pay = getPayPanel();
		MDocType dt = pay.getDocType();
		return dt;
	}
	public String getPaymentTermType() {
		PayPanel pay = getPayPanel();
		String pt = pay.getPaymentTermType();
		return pt;
	}
	public Integer getPaymentTerm() {
		PayPanel pay = getPayPanel();		
		Integer pt = pay.getPaymenTerm();
		return pt;
	}	
	public String getTrxType() {
		PayPanel pay = getPayPanel();
		String trxtype = pay.getTrxType();
		return trxtype;
	}
	public String getTenderType() {
		PayPanel pay = getPayPanel();
		String tendertype = pay.getTenderType();
		return tendertype;
	}
	public String getCreditCardType() {
		PayPanel pay = getPayPanel();
		String creditcardtype = pay.getCreditCardType();
		return creditcardtype;		
	}
	public String getCreditCardNumber() {
		PayPanel pay = getPayPanel();
		String creditcardnumber = pay.getCreditCardNumber();
		return creditcardnumber;		
	}	
}


class Header {
	HashMap properties = new HashMap();

	public String getMessage() {
		return "header";
	}

	public void AddProperty(String id, String value) {
		if (properties.containsKey(id))
			System.out.println("overwrite" + id);
		properties.put(id, value);
	}

	public void setAttribute(String id, String value) {
		AddProperty(id, value);
	}
}



class Footer {
	public String getMessage() {
		return "end";
	}
}

class localvars {
	HashMap map = new HashMap();

	public void addVar(String id, Object value) {
		map.put(id, value);
	}

	public Object getVar(String id) {
		Object value = null;
		if (map.containsKey(id)) {
			value = map.get(id);
		}
		return value;
	}

}

