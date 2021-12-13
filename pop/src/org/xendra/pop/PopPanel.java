/******************************************************************************
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
package org.xendra.pop;

import net.javaprog.ui.wizard.DataModel;
import net.miginfocom.swing.MigLayout;
import net.sf.jsqlparser.JSQLParserException;
import net.sf.jsqlparser.parser.CCJSqlParserUtil;
import net.sf.jsqlparser.statement.select.Select;

import org.columba.api.gui.frame.IDockable;
import org.columba.core.gui.frame.FrameMediatorDockable;
import org.compiere.apps.*;
import org.compiere.apps.form.*;
import org.compiere.apps.search.*;
import org.compiere.db.CConnection;
import org.compiere.grid.ed.VLookup;
import org.compiere.model.Lookup;
import org.compiere.model.MAttributeSet;
import org.compiere.model.MBPartner;
import org.compiere.model.MBPartnerLocation;
import org.compiere.model.MClient;
import org.compiere.model.MCurrency;
import org.compiere.model.MDocType;
import org.compiere.model.MInOut;
import org.compiere.model.MLocation;
import org.compiere.model.MLookup;
import org.compiere.model.MLookupFactory;
import org.compiere.model.MLookupInfo;
import org.compiere.model.MMessageFormat;
import org.compiere.model.MOrder;
import org.compiere.model.MOrderLine;
import org.compiere.model.MOrg;
import org.compiere.model.MPOP;
import org.compiere.model.MPOPLine;
import org.compiere.model.MPaymentTerm;
import org.compiere.model.MPriceList;
import org.compiere.model.MPriceListVersion;
import org.compiere.model.MProduct;
import org.compiere.model.MProductPrice;
import org.compiere.model.MProductPricing;
import org.compiere.model.MSession;
import org.compiere.model.MTax;
import org.compiere.model.MUOM;
import org.compiere.model.MUOMConversion;
import org.compiere.model.MUser;
import org.compiere.model.MWarehouse;
import org.compiere.model.Machine;
import org.compiere.model.PO;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_AD_Client;
import org.compiere.model.persistence.X_AD_MessageFormat;
import org.compiere.model.persistence.X_AD_Org;
import org.compiere.model.persistence.X_AD_Rule;
import org.compiere.model.persistence.X_AD_User;
import org.compiere.model.persistence.X_A_Machine;
import org.compiere.model.persistence.X_A_MachineServer;
import org.compiere.model.persistence.X_A_Xendrian_Message;
import org.compiere.model.persistence.X_C_BPartner;
import org.compiere.model.persistence.X_C_BPartner_Location;
import org.compiere.model.persistence.X_C_Contact;
import org.compiere.model.persistence.X_C_Currency;
import org.compiere.model.persistence.X_C_DocType;
import org.compiere.model.persistence.X_C_Location;
import org.compiere.model.persistence.X_C_Order;
import org.compiere.model.persistence.X_C_OrderLine;
import org.compiere.model.persistence.X_C_POP;
import org.compiere.model.persistence.X_C_PaymentTerm;
import org.compiere.model.persistence.X_C_Tax;
import org.compiere.model.persistence.X_C_UOM;
import org.compiere.model.persistence.X_M_AttributeSetInstance;
import org.compiere.model.persistence.X_M_PriceList;
import org.compiere.model.persistence.X_M_PriceList_Version;
import org.compiere.model.persistence.X_M_Warehouse;
import org.compiere.model.reference.REF_C_DocTypeSubType;
import org.compiere.model.reference.REF_C_OrderDeliveryRule;
import org.compiere.model.reference.REF_C_OrderInvoiceRule;
import org.compiere.model.reference.REF_ServerType;
import org.compiere.model.reference.REF_TypePOPLine;
import org.compiere.model.reference.REF__PaymentRule;
import org.compiere.process.DocAction;
import org.compiere.swing.CComboBox;
import org.compiere.swing.CFrame;
import org.compiere.swing.CLabel;
import org.compiere.swing.CPanel;
import org.compiere.util.CLogMgt;
import org.compiere.util.CLogger;
import org.compiere.util.DB;
import org.compiere.util.DisplayType;
import org.compiere.util.Env;
import org.compiere.util.KeyNamePair;
import org.compiere.util.Msg;
import org.compiere.util.Util;
import org.compiere.util.ValueNamePair;

import org.flexdock.docking.DockingConstants;
import org.flexdock.docking.DockingManager;
import org.flexdock.docking.DockingPort;
import org.flexdock.docking.defaults.DefaultDockingPort;
import org.hornetq.api.core.Message;
import org.hornetq.api.core.client.ClientSession;
import org.hornetq.api.core.client.SendAcknowledgementHandler;
import org.hornetq.jms.client.HornetQSession;
import org.kie.api.KieBase;
import org.kie.api.event.rule.DebugRuleRuntimeEventListener;
import org.kie.api.runtime.KieSession;
import org.kie.api.runtime.rule.FactHandle;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xendra.Constants;
import org.xendra.apps.form.DescriptionDialog;
import org.xendra.common.ButtonPanel;
import org.xendra.common.DialogAskPassword;
import org.xendra.common.ICardPanel;
import org.xendra.common.Point;
import org.xendra.common.ErrorPanel;
import org.xendra.objectview.RowBase;
import org.xendra.exceptions.XendraException;
import org.xendra.invoice.wizard.ImportWizardLauncher;
import org.xendra.line.LineKeyAdapter;

import org.xendra.message.EmbeddedMessageServer;
import org.xendra.message.wizard.MessageWizardLauncher;

import org.xendra.messages.MessageExpression;
import org.xendra.objectview.DefaultObjectViewModel;
import org.xendra.objectview.DefaultTableViewColumn;
import org.xendra.objectview.ObjectView;
import org.xendra.objectview.IObjetViewColumn;
import org.xendra.objectview.ObjectViewAdapter;
import org.xendra.objectview.ObjectViewModel;
import org.xendra.objectview.ObjectViewModelEvent;
import org.xendra.objectview.ObjectViewModelListener;
import org.xendra.common.PushButton;
import org.xendra.pop.Row;
import org.xendra.pop.cardcomponent.BuyPanel;
import org.xendra.pop.cardcomponent.CardComponentPanel;
import org.xendra.pop.cardcomponent.DebugPanel;
import org.xendra.pop.wizard.POPWizardLauncher;
import org.xendra.pop.wizard.MachineCreator;
import org.xendra.model.PolicyRequest;
import org.xendra.printdocument.DataSource;
import org.xendra.printdocument.PrintConstants;
import org.xendra.printdocument.PrintWorker;
import org.xendra.printdocument.wizard.PrintServer;
import org.xendra.printdocument.wizard.PrintServerWizardLauncher;
import org.xendra.rules.model.SimpleRule;
import org.xendra.swing.LED;
import org.xendra.swing.PriceListCtrl;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyVetoException;
import java.beans.VetoableChangeListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.*;
import java.util.logging.Level;

import javax.imageio.ImageIO;
import javax.jms.MessageProducer;
import javax.jms.Queue;
import javax.jms.QueueConnection;
import javax.jms.QueueConnectionFactory;
import javax.jms.QueueSession;
import javax.jms.Session;
import javax.jms.TextMessage;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.filechooser.FileFilter;
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

import org.jdesktop.fuse.ResourceInjector;
import org.jdesktop.fuse.swing.SwingModule;

public class PopPanel extends CFrame implements Point, 
FormPanel, ActionListener,	
ObjectViewModelListener, VetoableChangeListener,
SendAcknowledgementHandler, Observer {
	private HashMap<Integer, MMessageFormat> formats = new HashMap();	
	private static final long serialVersionUID = 1L;
	private boolean m_CanDelete;
	private FormFrame m_Frame;
	private CPanel bottomPanel = new CPanel(new MigLayout("center"));
	public String PaymentTerm = "";
	private String zero = "0.00";
	public static Insets s_insets = new Insets(0, 10, 0, 10);
	private static final String A_CASH = "Cash";
	private static final String buy = "buypanel";	
	private static final String panelerror = "errorpanel";
	private String DocVoid = Msg.translate(Env.getCtx(), "Voided");
	boolean m_delegate = false;
	boolean m_addproduct = false;
	MPOP config = null;
	DefaultObjectViewModel modelPointOfPurchase = null;
	DefaultObjectViewModel modelUpdatePrice = null;
	DefaultObjectViewModel modelOthers = null;
	ObjectView viewPointOfPurchase = null;
	ObjectView viewUpdatePrice = null;

	Row m_row = null;
	private IDockable pointOfPurchasePanel;
	private IDockable updatePricePanel;
	private PriceListCtrl buypricelist = new PriceListCtrl(false);
	private PriceListCtrl salespricelist = new PriceListCtrl(true);
	private VLookup pickPartner;
	private VLookup pickPartnerContact;	
	private VLookup pickWarehouse;
	private CLabel labelPriceListVersion = new CLabel();
	private CLabel infosearch = new CLabel();
	private static CLogger log = CLogger.getCLogger(PopPanel.class);
	int m_WindowNo;
	PopPanel m_Panel = this;
	protected StatusBar statusBar = new StatusBar();
	private String mTextToFind = "";
	private JLabel labelNetAmount = new JLabel("0.00", JLabel.RIGHT);
	private JLabel labelTaxAmount = new JLabel("0.00", JLabel.RIGHT);
	private JLabel labelTotAmount = new JLabel("0.00", JLabel.RIGHT);
	private CPanel gridPointOfPurchasePanel = new CPanel();
	private CPanel gridUpdatePricePanel = new CPanel();
	Vector<Vector<Object>> columnsPOS = new Vector<Vector<Object>>();
	private HashMap<String, Object> props = new HashMap();
	private String m_password;

	private String m_SupervisorPassword;
	public BuyPanel m_PayPanel;
	private Integer C_DocTypeTargetID = 0;
	private int m_rowcount = 0;
	private BigDecimal TotalParcial = Env.ZERO;
	private BigDecimal QtyByDefault = Env.ZERO;
	private BigDecimal CreditAvailable = Env.ZERO;
	private String error = "";
	private String info = "";
	public BigDecimal TotalGross = Env.ZERO;
	public BigDecimal TotalNet = Env.ZERO;
	public BigDecimal TotalTax = Env.ZERO;
	public BigDecimal Total = Env.ZERO;
	public BigDecimal TotalDiscount = Env.ZERO;

	private String m_processMsg;
	private String m_errorMsg = "";
	public boolean m_showdialoginfo = true;
	private LineKeyAdapter lkaPointOfPurchase;
	private LineKeyAdapter lkaUpdatePrice;
	private List<Row> pContent;
	private MInOut shipment = null;
	private Document document;
	private Integer AD_Client_ID = Env.getAD_Client_ID(Env.getCtx());
	private Integer AD_Org_ID = Env.getAD_Org_ID(Env.getCtx());
	private boolean IsQueueInitialized;
	private Queue queue;
	private QueueConnection connection;
	private QueueSession session;
	private ClientSession coreSession;
	private JLabel lconexion = new JLabel("");
	private TransformerFactory tFactory = TransformerFactory.newInstance();
	private ArrayList<String[]> m_ToSend = new ArrayList<String[]>();
	private ArrayList<String[]> m_SendWithoutACK = new ArrayList<String[]>();
	private HashMap<String, CardComponentPanel> CardPanels = new HashMap();
	private HashMap<String, BigDecimal> amounts = new HashMap();
	private DefaultDockingPort dockingPort;
	private KieSession ksession;
	private String m_entrypoint;
	private String m_agenda;

	private JScrollPane scrollPane = null;
	private JSplitPane infoPanel = new JSplitPane();
	private ButtonPanel buttonPanel = new ButtonPanel();
	private BuyPanel buypanel;
	private ErrorPanel errorpanel;
	private JPanel cardPanel;
	private HashMap<String, BufferedImage> BufferedImages = new HashMap();	
	private HashMap<String, PushButton> PushButtons = new HashMap();
	private static final String A_PAY = "Pay";
	private static final String buttonpanel = "buttonpanel";
	private static final String M_PriceSalesListVersion_ID = "M_PriceSalesListVersion_ID";
	private static final String BuyPriceListVersion_ID = "BuyPriceListVersion_ID";
	private static final String UOMBonus_ID = "UOMBonus_ID";
	private static final String QtyBonusOrdered = "QtyBonusOrdered";
	private static final String SalesPrice = "SalesPrice";
	private HashMap<String, AppsAction> AppsActions = new HashMap();
	private Map<String, PO> businessobjects = new HashMap();
	private HashMap<String, List> observers = new HashMap();
	private HashMap<String, String> boagenda = new HashMap();
	private HashMap<String, FactHandle> FactHandlers = new HashMap();
	private HashMap<String, JButton> toolbarbuttons = new HashMap();
	private boolean m_CanVoid;
	private double currentwidth;
	private double buttonspanelwidth;
	private double cardpanelwidth;

	public BigDecimal getTotalParcial() {
		return TotalParcial;
	}

	public BigDecimal getTotalGross() {
		return TotalGross;
	}

	public void setTotalGross(BigDecimal totalGross) {
		TotalGross = totalGross;
	}

	public BigDecimal getTotalNet() {
		return TotalNet;
	}

	public void setTotalNet(BigDecimal totalNet) {
		TotalNet = totalNet;
	}

	public BigDecimal getTotalDiscount() {
		return TotalDiscount;
	}

	public void setTotalDiscount(BigDecimal totalDiscount) {
		TotalDiscount = totalDiscount;
	}

	public String getError() {
		return error;
	}

	public void setError(String merror) {
		error = merror;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String minfo) {
		info = minfo;
	}

	public int getRowCount() {
		return m_rowcount;
	}

	public String getM_password() {
		return m_password;
	}

	public void setM_password(String mPassword) {
		m_password = mPassword;
	}

	public PopPanel() {
		// InitializeQueue();
	}

	public MPOP getConfig()
	{
		if (config != null)
			return config;
		Machine machine = Env.getMachine();
		MPOP config = null;				
		try {
			Integer C_POP_ID = machine.getIntProperty(X_C_POP.COLUMNNAME_C_POP_ID);
			if (C_POP_ID == 0)
			{
				POPWizardLauncher nn = new POPWizardLauncher();	
				nn.launchWizard();
				DataModel dm = nn.getDataModel();
				PO po = (PO) dm.getData(Constants.Model);
				if (po == null)
					throw new Exception("No se definio la caja asignada");
				C_POP_ID = machine.getIntProperty(X_C_POP.COLUMNNAME_C_POP_ID);
			}
			MSession sesion = MSession.get (Env.getCtx(), false);			
			config = new Query(Env.getCtx(),X_C_POP.Table_Name, "C_POP_ID = ? AND AD_Org_ID = ?", null)
			.setParameters(C_POP_ID, Env.getAD_Org_ID(Env.getCtx())).first();
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
			Env.setContext(Env.getCtx(), getWindowNo(), "M_Warehouse_ID", config.getM_Warehouse_ID());
		}
		if (error.length() > 0) {
			ADialog.error(getWindowNo(), null, "PosError",  error);
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
			error = startknowledge();
			if (error.length() > 0)
				throw new Exception(error);
			props.put(MachineCreator.overwritepricelimit, config.getbool(MachineCreator.overwritepricelimit));
			props.put(MachineCreator.overwritepricelist, config.getbool(MachineCreator.overwritepricelist));
			setIsCanDelete(config.getbool(MachineCreator.iscandelete));
			props.put(MachineCreator.iscanvoid, config.getbool(MachineCreator.iscanvoid));
			props.put(MachineCreator.ismodifysopricelist, config.getbool(MachineCreator.ismodifysopricelist));
			m_rowcount = 0;
			QtyByDefault = Env.ZERO;
			TotalParcial = Env.ZERO;
			CreditAvailable = Env.ZERO;			
			Env.setContext(Env.getCtx(), getWindowNo(), "DateOrdered", getOrder().getDateOrdered());
			Env.setContext(Env.getCtx(), getWindowNo(), "DateAcct", getOrder().getDateAcct());
			error = TestQueue();
		} catch (Exception e) {
			e.printStackTrace();
			error = e.getMessage();
		}
		return error;
	}

	private String startknowledge() {
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
					ksession.insert(this);
					InitializePO();
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

	private void InitializePO() {
		String entrypoint = Env.getSessionEntrypoints(config.getAD_Rule_ID());
		String agenda = Env.getAgenda(config.getAD_Rule_ID());
		updatePO(config, "init");
		executerules(entrypoint, agenda);			
		MOrder order = new MOrder(Env.getCtx(), 0, null);
		order.setIsSOTrx(false);
		order.setC_DocTypeTarget_ID();
		updatePO(order, "order");
		executerules(entrypoint, "order");
		updatePO(new MBPartner(Env.getCtx(), 0, null), "partner");
		executerules(entrypoint, "partner");
		updatePO(MUser.get(Env.getCtx(), Env.getAD_User_ID(Env.getCtx())), "user");
		executerules(entrypoint, "user");		
		updatePO(new MPriceListVersion(Env.getCtx(), 0, null), "pricelistversion");
	}

	public PO getPO(String poname) {
		PO retval = null;
		if (businessobjects.containsKey(poname))
			retval = businessobjects.get(poname);
		return retval;
	}

	public void updatePO(PO po) {
		if (po == null)
			return;
		businessobjects.put(po.get_TableName(), po);
		List<String> panels = this.getObservers(po.get_TableName());
		for (String panel:panels)
		{
			po.addObserver(CardPanels.get(panel));
		}
		po.addObserver(this);
		if (FactHandlers.containsKey(po.get_TableName()))
		{
			FactHandle fh = FactHandlers.get(po.get_TableName());
			ksession.update(fh, po);
		}
		else
		{
			FactHandle fh = ksession.insert(po);
			FactHandlers.put(po.get_TableName(), fh);
		}		
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
		if (FactHandlers.containsKey(po.get_TableName()))
		{
			FactHandle fh = FactHandlers.get(po.get_TableName());
			ksession.update(fh, po);
		}
		else
		{
			FactHandle fh = ksession.insert(po);
			FactHandlers.put(po.get_TableName(), fh);
		}		
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
		if (FactHandlers.containsKey(rule.getName()))
		{
			FactHandle fh = FactHandlers.get(rule.getName());
			ksession.update(fh, rule);
		}
		else
		{
			FactHandle fh = ksession.insert(rule);
			FactHandlers.put(rule.getName(), fh);
		}		
	}

	public void updateRow(Row row) {
		if (FactHandlers.containsKey(row.getIdentifier()))
		{
			FactHandle fh = FactHandlers.get(row.getIdentifier());
			ksession.update(fh, row);
		}
		else
		{
			FactHandle fh = ksession.insert(row);
			FactHandlers.put(row.getIdentifier(), fh);
		}
	}

	private void setPassword(String password) {
		m_SupervisorPassword = password;
	}

	private String getPassword() {
		if (m_SupervisorPassword == null)
			return "";
		return m_SupervisorPassword;
	}

	private void setIsCanVoid(boolean canVoid) {
		m_CanVoid = canVoid;
	}

	public boolean canDeleteLineofPointOfPurchase() {
		Object SelectedRow = viewPointOfPurchase.getSelectedRowObject();
		((DefaultObjectViewModel) viewPointOfPurchase.getDataModel()).removeRow(SelectedRow);
		((DefaultObjectViewModel) viewUpdatePrice.getDataModel()).removeRow(SelectedRow);
		if (!hasValidLines())
		{
			AddLine();
		}
		return true;
	}

	private Boolean hasValidLines() {
		Boolean hasvalidLines = false;
		ObjectViewModel adapter = viewPointOfPurchase.getDataModel();
		for (int j = 0; j < adapter.getRowCount(); j++) {
			Row row = (Row) adapter.getRowObject(j);
			if (row.getM_Product_ID() > 0
					&& row.getQtyOrdered().compareTo(Env.ZERO) != 0) {
				hasvalidLines = true;
				break;
			}
		}
		return hasvalidLines;
	}

	private boolean IsCanVoid() {
		return true;
	}
	public boolean isPriceListAndPartnerDefined() {
		boolean partner = isBPartnerDefined();
		boolean pricelist = isPriceListPointOfPurchaseDefined();
		if (partner && pricelist)
			return true;
		return false;
	}
	public boolean isBPartnerDefined() {
		if (getOrder().getC_BPartner_ID() == 0) {
			if (m_showdialoginfo)
				ADialog.info(getWindowNo(), getFrame(), "BPartnerNotFound");
			return false;
		}
		return true;
	}
	public boolean isPriceListPointOfPurchaseDefined() {
		if (getOrder().getM_PriceList_ID() == 0) {
			if (Env.getContextAsInt(Env.getCtx(), "#M_PriceList_ID") > 0)
				getOrder().setM_PriceList_ID(Env.getContextAsInt(Env.getCtx(),"#M_PriceList_ID"));
		}
		if (getOrder().getM_PriceList_ID() == 0) {
			if (m_showdialoginfo)
				ADialog.info(getWindowNo(), getFrame(), "PriceListVersion");
			return false;
		}
		return true;
	}

	private String getBPartnerAddress(int Location_ID) {
		MBPartnerLocation blocation = new MBPartnerLocation(Env.getCtx(),Location_ID, null);
		MLocation loc = blocation.getLocation(true);
		String address = loc.getAddress1() == null ? "" : loc.getAddress1();
		return address;
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
			launchWizardMessage();
		}
		else
		{
			error = EmbeddedMessageServer.getInstance().Test(message.getName(), Constants.QPOSQUEUE);
			if (error.length() > 0)
			{
				launchWizardMessage();
			}
		}
		return error;
	}

	private void launchWizardMessage() {
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
	}

	private DataModel LaunchPSWizard() {
		PrintServerWizardLauncher nn = new PrintServerWizardLauncher();
		nn.setMacAddress(Util.getLocalMacAddress());
		nn.launchWizard();
		return nn.getDataModel();
	}

	private String TestPrintServer() {
		String error = "";
		X_A_Machine ps = null;
		if (ps == null)
			ps = new X_A_Machine(Env.getCtx(), config.getA_Machine_ID(), null);
		if (ps.getA_Machine_ID() == 0) {
			DataModel dm = LaunchPSWizard();
			ps = new X_A_Machine(Env.getCtx(), config.getA_Machine_ID(), null);
			if (ps.getA_Machine_ID() == 0) {
				error = "el PrintServer especificado no existe";
			}
		} else {
			PrintWorker pw = new PrintWorker(ps);
			error = pw.connect();
			if (error.length() == 0) {
				; //ledPrintServer.setState(LED.GREEN);
			} else {
				DataModel dm = LaunchPSWizard();
				ps = new X_A_Machine(Env.getCtx(), config.getA_Machine_ID(), null);
				pw = new PrintWorker(ps);
				error = pw.connect();
			}
			pw = null;
		}
		return error;
	}

	public void datasource() {
		DataSource.clear("pop");
		MClient c = MClient.get(Env.getCtx(), Env.getAD_Client_ID(Env.getCtx()));
		MOrg o = MOrg.get(Env.getCtx(), Env.getAD_Org_ID(Env.getCtx()));
		MCurrency currency = MCurrency.get(Env.getCtx(), getOrder().getC_Currency_ID());
		MUser u = MUser.get(Env.getCtx(), Env.getAD_User_ID(Env.getCtx()));
		MUser sr = MUser.get(Env.getCtx(), getOrder().getSalesRep_ID());
		MWarehouse wh = MWarehouse.get(Env.getCtx(), getOrder().getM_Warehouse_ID());
		MDocType dt = MDocType.get(Env.getCtx(), getOrder().getC_DocTypeTarget_ID());
		MPriceList pl = MPriceList.get(Env.getCtx(), getOrder().getM_PriceList_ID(), null);

		MBPartner p = MBPartner.get(Env.getCtx(), getOrder().getC_BPartner_ID());
		MBPartner paypatner = MBPartner.get(Env.getCtx(), getOrder().getPay_BPartner_ID());
		if (paypatner == null) {
			paypatner = p;
		}
		X_C_BPartner_Location bl = new Query(Env.getCtx(), X_C_BPartner_Location.Table_Name, "C_BPartner_Location_ID = ?", null)
		.setParameters(getOrder().getC_BPartner_Location_ID()).first();				

		MUser billuser = MUser.get(Env.getCtx(), getOrder().getBill_User_ID());

		MBPartner billpatner = MBPartner.get(Env.getCtx(), getOrder().getBill_BPartner_ID());
		MBPartnerLocation billlocation = new Query(Env.getCtx(), MBPartnerLocation.Table_Name, "C_BPartner_Location_ID = ?", null)
		.setParameters(getOrder().getBill_Location_ID()).first();

		DataSource.set(Constants.COLUMNNAME_AD_Client_ID, new ValueNamePair(c.getIdentifier(), c.getName()));		
		DataSource.set(Constants.COLUMNNAME_AD_Org_ID, new ValueNamePair(o.getIdentifier(), o.getName()));
		DataSource.set(Constants.COLUMNNAME_Created, new Timestamp(System.currentTimeMillis()));
		DataSource.set(X_C_Order.COLUMNNAME_DateOrdered, DataSource.get(Constants.COLUMNNAME_Created));		
		DataSource.set(Constants.AD_User_ID, new ValueNamePair(u.getIdentifier(), u.getName()));

		ObjectViewModel adapter = viewPointOfPurchase.getDataModel();
		for (int j = 0; j < viewPointOfPurchase.getRowCount(); j++) {
			Row row = (Row) adapter.getRowObject(j);
			if (row.getM_Product_ID() > 0	&& 
					(row.getQtyOrdered().compareTo(Env.ZERO) != 0 || row.getQtyBonus().compareTo(Env.ZERO) != 0)) 
			{

				MAttributeSet mas = MAttributeSet.get(Env.getCtx(), row.getM_AttributeSet_ID(), null);
				X_M_AttributeSetInstance asi = new Query(Env.getCtx(), X_M_AttributeSetInstance.Table_Name, "M_AttributeSetInstance_ID = ?", null)
				.setParameters(row.getM_AttributeSetInstance_ID()).first();
				MUOM uom = MUOM.get(Env.getCtx(), row.getC_UOM_ID());
				MUOM uombonus = MUOM.get(Env.getCtx(), row.getC_UOMBonus_ID());
				MTax tax = MTax.get(Env.getCtx(), row.getC_Tax_ID());
				DataSource.setLine(X_C_OrderLine.COLUMNNAME_M_Product_ID, new ValueNamePair(row.getProduct().getValue(),row.getProduct().getName()));																
				DataSource.setLine(X_C_OrderLine.COLUMNNAME_PriceActual, row.getPriceActual());
				DataSource.setLine(X_C_OrderLine.COLUMNNAME_PriceList, row.getPriceList());
				DataSource.setLine(X_C_OrderLine.COLUMNNAME_PriceLimit, row.getPriceLimit());
				DataSource.setLine(X_C_OrderLine.COLUMNNAME_Margin, row.getMargin());
				DataSource.setLine(X_C_OrderLine.COLUMNNAME_PriceEntered, row.getPriceEntered());
				DataSource.setLine(X_C_OrderLine.COLUMNNAME_QtyOrdered, row.getQtyOrdered());				
				DataSource.setLine(X_C_OrderLine.COLUMNNAME_QtyEntered, row.getQtyEntered());				
				DataSource.setLine(X_C_OrderLine.COLUMNNAME_PriceBase, row.getPriceBase());
				DataSource.setLine(X_C_OrderLine.COLUMNNAME_Discount, 	row.getDiscount());
				DataSource.setLine(X_C_OrderLine.COLUMNNAME_Discount1, 	row.getDiscount1());
				DataSource.setLine(X_C_OrderLine.COLUMNNAME_Discount2, 	row.getDiscount2());
				DataSource.setLine(X_C_OrderLine.COLUMNNAME_Discount3, 	row.getDiscount3());
				DataSource.setLine(X_C_OrderLine.COLUMNNAME_Discount4, 	row.getDiscount4());
				DataSource.setLine(X_C_OrderLine.COLUMNNAME_DiscountAcquire1, 	row.getDiscountAcquire1());
				DataSource.setLine(X_C_OrderLine.COLUMNNAME_PriceAcquisition, 	row.getPriceAcquisition());
				DataSource.setLine(X_C_OrderLine.COLUMNNAME_M_AttributeSetInstance_ID, 	new ValueNamePair(asi.getIdentifier(), asi.getDescription()));
				DataSource.setLine(X_C_OrderLine.COLUMNNAME_QtyBonus, row.getQtyBonus());
				DataSource.setLine(UOMBonus_ID, new ValueNamePair(uombonus.getIdentifier(), uombonus.getName()));
				DataSource.setLine(QtyBonusOrdered, row.getQtyBonusOrdered());
				DataSource.setLine(X_C_OrderLine.COLUMNNAME_C_Tax_ID, new ValueNamePair(tax.getIdentifier(), tax.getName()));				
				DataSource.setLine(X_C_OrderLine.COLUMNNAME_C_UOM_ID, new ValueNamePair(uom.getIdentifier(), uom.getName()));
				DataSource.setLine(X_C_OrderLine.COLUMNNAME_LineNetAmt, row.getTotal());
				DataSource.setLine(SalesPrice, row.getSalesPriceList());
				DataSource.setLine(Constants.ChangePrice, row.getUpdatePrice());
				DataSource.setLine(X_C_OrderLine.COLUMNNAME_C_OrderLine_ID, Util.getUUID());
			}
		}
		if (salespricelist.getMPriceList() != null) {
			DataSource.set(Constants.M_PriceSalesList_ID, new ValueNamePair(salespricelist.getMPriceList().getIdentifier(), salespricelist.getMPriceList().getName()));
		}
		DataSource.set(X_C_Order.COLUMNNAME_C_Order_ID, Util.getUUID());
		DataSource.set(X_C_Order.COLUMNNAME_SerialToInvoice, getOrder().getSerialToInvoice());								
		DataSource.set(X_C_Order.COLUMNNAME_DocumentNoToInvoice, getOrder().getDocumentNoToInvoice());
		DataSource.set("InOutDocNumber", getOrder().getInOutDocNumber());
		DataSource.set(X_C_Order.COLUMNNAME_M_Warehouse_ID, new ValueNamePair(wh.getIdentifier(), wh.getName()));
		DataSource.set(X_C_Order.COLUMNNAME_M_PriceList_ID, new ValueNamePair(pl.getIdentifier(), pl.getName()));
		DataSource.set(X_C_Order.COLUMNNAME_DateOrdered, getOrder().getDateOrdered());			
		DataSource.set(X_C_Order.COLUMNNAME_DatePromised, getOrder().getDatePromised());
		DataSource.set(X_C_Order.COLUMNNAME_DateAcct, getOrder().getDateAcct());
		DataSource.set(X_C_Order.COLUMNNAME_DateInvoiced, getOrder().getDateInvoiced());
		DataSource.set(X_C_Order.COLUMNNAME_IsSOTrx, "N");
		DataSource.set(X_C_Order.COLUMNNAME_PriorityRule, getOrder().getPriorityRule());
		DataSource.set(X_C_Order.COLUMNNAME_C_DocTypeTarget_ID, new ValueNamePair(dt.getIdentifier(), dt.getName()));
		DataSource.set(X_C_Order.COLUMNNAME_C_DocType_ID, new ValueNamePair(dt.getIdentifier(), dt.getName()));

		MPaymentTerm pt = new Query(Env.getCtx(), MPaymentTerm.Table_Name, "C_PaymentTerm_ID = ?", null)
		.setParameters(getOrder().getC_PaymentTerm_ID()).first();
		if (pt == null) {
			pt = new Query(Env.getCtx(), MPaymentTerm.Table_Name, "C_PaymentTerm_ID = ?", null)
			.setParameters(Env.getContextAsInt(Env.getCtx(),	"#C_PaymentTerm_ID")).first();
		}
		if (pt == null) {
			Select select = null;
			try {
				select = (Select) CCJSqlParserUtil.parse("SELECT C_PaymentTerm_ID FROM C_PaymentTerm WHERE AD_Client_ID=? AND IsDefault='Y'");
				int ii = DB.getSQLValue(null, select.toString(),	getOrder().getAD_Client_ID());
				pt = new Query(Env.getCtx(), MPaymentTerm.Table_Name, "C_PaymentTerm_ID = ?", null)
				.setParameters(ii).first();
			} catch (JSQLParserException e) {
				e.printStackTrace();
			}				
		}
		if (pt != null) {
			DataSource.set(X_C_Order.COLUMNNAME_C_PaymentTerm_ID, new ValueNamePair(pt.getIdentifier(), pt.getName()));
		}
		DataSource.set(X_C_Order.COLUMNNAME_PaymentRule, getOrder().getPaymentRule());
		DataSource.set(X_C_Order.COLUMNNAME_InvoiceRule, getOrder().getInvoiceRule());
		DataSource.set(X_C_Order.COLUMNNAME_DeliveryRule, getOrder().getDeliveryRule());
		DataSource.set(X_C_Order.COLUMNNAME_FreightCostRule, getOrder().getFreightCostRule());
		DataSource.set(X_C_Order.COLUMNNAME_DeliveryViaRule, getOrder().getDeliveryViaRule());
		DataSource.set(X_C_Order.COLUMNNAME_IsDiscountPrinted, getOrder().isDiscountPrinted()? "Y" : "N");
		DataSource.set(X_C_Order.COLUMNNAME_IsTaxIncluded, getOrder().isTaxIncluded()? "Y" : "N");
		DataSource.set(X_C_Order.COLUMNNAME_Bill_Location_ID, new ValueNamePair(billlocation.getIdentifier(), billlocation.toString()));
		DataSource.set(X_C_Order.COLUMNNAME_C_BPartner_ID, new ValueNamePair(p.getIdentifier(), p.getName()));
		DataSource.set(X_C_Order.COLUMNNAME_C_BPartner_Location_ID, new ValueNamePair(bl.getIdentifier(), bl.getName()));
		DataSource.set(X_C_Order.COLUMNNAME_Pay_BPartner_ID, new ValueNamePair(paypatner.getIdentifier(), paypatner.getName()));
		DataSource.set(X_C_Order.COLUMNNAME_SalesRep_ID,new ValueNamePair(sr.getIdentifier(), sr.getName()));
		DataSource.set(X_C_Order.COLUMNNAME_Bill_User_ID,  new ValueNamePair(billuser.getIdentifier(), billuser.getName()));
		DataSource.set(X_C_Order.COLUMNNAME_C_Currency_ID, new ValueNamePair(currency.getIdentifier(), currency.getISO_Code()));
		DataSource.set(X_C_Order.COLUMNNAME_Bill_BPartner_ID, new ValueNamePair(billpatner.getIdentifier(), billpatner.getName()));
		DataSource.set(X_C_Order.COLUMNNAME_Description, getOrder().getDescription());
		DataSource.set(X_C_Order.COLUMNNAME_C_BPartner_Points_ID, String.valueOf(getOrder().getC_BPartner_Points_ID()));
		DataSource.set(X_C_Order.COLUMNNAME_POReference, getOrder().getPOReference());						
	}
	
	public String transaction() {
		error = "";
		try {			
			MMessageFormat format = getMessage();
			if (format == null) {				
				throw new Exception(getError());
			} else {
				format.getDocument();
			}
			format.startMessage();
			MOrder o = getOrder();
			//o.setC_DocTypeTarget_ID(doctype.getC_DocType_ID());
			KeyNamePair kp = (KeyNamePair) pickDocType.getValue();
			o.setC_DocTypeTarget_ID(kp.getKey());
			this.updatePO(o);
			MCurrency currency = MCurrency.get(Env.getCtx(), getOrder().getC_Currency_ID());
			Timestamp actual = new Timestamp(System.currentTimeMillis());			
			MPriceList pl = MPriceList.get(Env.getCtx(), getOrder().getM_PriceList_ID(), null);
			ObjectViewModel adapter = viewPointOfPurchase.getDataModel();
			int spricelist = salespricelist.getM_PriceList_ID();
			//
			for (int j = 0; j < viewPointOfPurchase.getRowCount(); j++) {
				Row row = (Row) adapter.getRowObject(j);
				if (row.getM_Product_ID() > 0	&& 
						(row.getQtyOrdered().compareTo(Env.ZERO) != 0 || row.getQtyBonus().compareTo(Env.ZERO) != 0)) 
				{
					format.AddProperty("item",  X_C_OrderLine.COLUMNNAME_C_OrderLine_ID,			DataSource.getLine(X_C_OrderLine.COLUMNNAME_C_OrderLine_ID));
					format.AddProperty("item",	X_C_OrderLine.COLUMNNAME_M_Product_ID,				DataSource.getLine(X_C_OrderLine.COLUMNNAME_M_Product_ID));
					format.AddProperty("item",	X_C_OrderLine.COLUMNNAME_PriceActual,				DataSource.getLine(X_C_OrderLine.COLUMNNAME_PriceActual));
					format.AddProperty("item",	X_C_OrderLine.COLUMNNAME_PriceList, 				DataSource.getLine(X_C_OrderLine.COLUMNNAME_PriceList));
					format.AddProperty("item",	X_C_OrderLine.COLUMNNAME_PriceLimit, 				DataSource.getLine(X_C_OrderLine.COLUMNNAME_PriceLimit));
					format.AddProperty("item", 	X_C_OrderLine.COLUMNNAME_Margin, 					DataSource.getLine(X_C_OrderLine.COLUMNNAME_Margin));
					format.AddProperty("item",	X_C_OrderLine.COLUMNNAME_PriceEntered,				DataSource.getLine(X_C_OrderLine.COLUMNNAME_PriceEntered));
					format.AddProperty("item",	X_C_OrderLine.COLUMNNAME_QtyOrdered, 				DataSource.getLine(X_C_OrderLine.COLUMNNAME_QtyOrdered));
					format.AddProperty("item",	X_C_OrderLine.COLUMNNAME_QtyEntered, 				DataSource.getLine(X_C_OrderLine.COLUMNNAME_QtyEntered));
					format.AddProperty("item",	X_C_OrderLine.COLUMNNAME_PriceBase, 				DataSource.getLine(X_C_OrderLine.COLUMNNAME_PriceBase));
					format.AddProperty("item",	X_C_OrderLine.COLUMNNAME_Discount, 					DataSource.getLine(X_C_OrderLine.COLUMNNAME_Discount));
					format.AddProperty("item",	X_C_OrderLine.COLUMNNAME_Discount1, 				DataSource.getLine(X_C_OrderLine.COLUMNNAME_Discount1));
					format.AddProperty("item",	X_C_OrderLine.COLUMNNAME_Discount2, 				DataSource.getLine(X_C_OrderLine.COLUMNNAME_Discount2));
					format.AddProperty("item",	X_C_OrderLine.COLUMNNAME_Discount3, 				DataSource.getLine(X_C_OrderLine.COLUMNNAME_Discount3));
					format.AddProperty("item",	X_C_OrderLine.COLUMNNAME_Discount4, 				DataSource.getLine(X_C_OrderLine.COLUMNNAME_Discount4));
					format.AddProperty("item",  X_C_OrderLine.COLUMNNAME_DiscountAcquire1, 			DataSource.getLine(X_C_OrderLine.COLUMNNAME_DiscountAcquire1));
					format.AddProperty("item",  X_C_OrderLine.COLUMNNAME_PriceAcquisition, 			DataSource.getLine(X_C_OrderLine.COLUMNNAME_PriceAcquisition));
					format.AddProperty("item",  X_C_OrderLine.COLUMNNAME_M_AttributeSetInstance_ID, DataSource.getLine(X_C_OrderLine.COLUMNNAME_M_AttributeSetInstance_ID));
					format.AddProperty("item",  X_C_OrderLine.COLUMNNAME_QtyBonus, 					DataSource.getLine(X_C_OrderLine.COLUMNNAME_QtyBonus));
					format.AddProperty("item",  UOMBonus_ID, 										DataSource.getLine(UOMBonus_ID));
					format.AddProperty("item",	QtyBonusOrdered, 									DataSource.getLine(QtyBonusOrdered));
					format.AddProperty("item",	X_C_OrderLine.COLUMNNAME_C_Tax_ID, 					DataSource.getLine(X_C_OrderLine.COLUMNNAME_C_Tax_ID));
					format.AddProperty("item",  X_C_OrderLine.COLUMNNAME_C_UOM_ID, 					DataSource.getLine(X_C_OrderLine.COLUMNNAME_C_UOM_ID));
					format.AddProperty("item",  X_C_OrderLine.COLUMNNAME_LineNetAmt, 				DataSource.getLine(X_C_OrderLine.COLUMNNAME_LineNetAmt));
					format.AddProperty("item",  SalesPrice, 										DataSource.getLine(SalesPrice));					
					format.AddProperty("item", 	Constants.ChangePrice, 								DataSource.getLine(Constants.ChangePrice));
					format.ValidateSection("item");
				}
			}						
			format.AddProperty("client", Constants.COLUMNNAME_AD_Client_ID,DataSource.get(Constants.COLUMNNAME_AD_Client_ID));
			format.ValidateSection("client");
			format.AddProperty("org", Constants.COLUMNNAME_AD_Org_ID,DataSource.get(Constants.COLUMNNAME_AD_Org_ID));
			format.ValidateSection("org");			
			format.AddProperty(Constants.HEADER, Constants.COLUMNNAME_AD_Client_ID,DataSource.get(Constants.COLUMNNAME_AD_Client_ID));
			format.AddProperty(Constants.HEADER, Constants.COLUMNNAME_AD_Org_ID,DataSource.get(Constants.COLUMNNAME_AD_Org_ID));
			format.AddProperty(Constants.HEADER, Constants.AD_User_ID,DataSource.get(Constants.AD_User_ID));
			format.AddProperty(Constants.HEADER, Constants.COLUMNNAME_Created, DataSource.get(Constants.COLUMNNAME_Created));
			if (salespricelist.getMPriceList() != null) {
				format.AddProperty(Constants.HEADER, Constants.M_PriceSalesList_ID,	DataSource.get(Constants.M_PriceSalesList_ID));
			}
			format.AddProperty(Constants.HEADER, X_C_Order.COLUMNNAME_M_PriceList_ID, DataSource.get(X_C_Order.COLUMNNAME_M_PriceList_ID));
			format.AddProperty(Constants.HEADER, X_C_Order.COLUMNNAME_SerialToInvoice,	DataSource.get(X_C_Order.COLUMNNAME_SerialToInvoice));			
			format.AddProperty(Constants.HEADER, X_C_Order.COLUMNNAME_DocumentNoToInvoice,	DataSource.get(X_C_Order.COLUMNNAME_DocumentNoToInvoice));
			format.AddProperty(Constants.HEADER, "InOutDocNumber",	DataSource.get("InOutDocNumber"));
			format.AddProperty(Constants.HEADER, X_C_Order.COLUMNNAME_M_Warehouse_ID,	DataSource.get(X_C_Order.COLUMNNAME_M_Warehouse_ID));
			format.AddProperty(Constants.HEADER, X_C_Order.COLUMNNAME_M_PriceList_ID,	DataSource.get(X_C_Order.COLUMNNAME_M_PriceList_ID));			
			//format.AddProperty(Constants.HEADER, X_C_Order.COLUMNNAME_C_Contact_ID,		DataSource.get(X_C_Order.COLUMNNAME_C_Contact_ID));
			format.AddProperty(Constants.HEADER, X_C_Order.COLUMNNAME_DateOrdered, DataSource.get(X_C_Order.COLUMNNAME_DateOrdered));
			format.AddProperty(Constants.HEADER, X_C_Order.COLUMNNAME_DatePromised, DataSource.get(X_C_Order.COLUMNNAME_DatePromised));
			format.AddProperty(Constants.HEADER, X_C_Order.COLUMNNAME_DateAcct,		DataSource.get(X_C_Order.COLUMNNAME_DateAcct));
			format.AddProperty(Constants.HEADER, X_C_Order.COLUMNNAME_DateInvoiced, DataSource.get(X_C_Order.COLUMNNAME_DateInvoiced));
			format.AddProperty(Constants.HEADER, X_C_Order.COLUMNNAME_IsSOTrx, DataSource.get(X_C_Order.COLUMNNAME_IsSOTrx));
			format.AddProperty(Constants.HEADER, X_C_Order.COLUMNNAME_PriorityRule, DataSource.get(X_C_Order.COLUMNNAME_PriorityRule));
			format.AddProperty(Constants.HEADER, X_C_Order.COLUMNNAME_C_DocTypeTarget_ID, DataSource.get(X_C_Order.COLUMNNAME_C_DocTypeTarget_ID));
			format.AddProperty(Constants.HEADER,		X_C_Order.COLUMNNAME_C_DocType_ID,	DataSource.get(X_C_Order.COLUMNNAME_C_DocType_ID));
			format.AddProperty(Constants.HEADER,	X_C_Order.COLUMNNAME_C_PaymentTerm_ID,	DataSource.get(X_C_Order.COLUMNNAME_C_PaymentTerm_ID));
			format.AddProperty(Constants.HEADER,	X_C_Order.COLUMNNAME_PaymentRule, 		DataSource.get(X_C_Order.COLUMNNAME_PaymentRule));
			format.AddProperty(Constants.HEADER,	X_C_Order.COLUMNNAME_InvoiceRule, 		DataSource.get(X_C_Order.COLUMNNAME_InvoiceRule));
			format.AddProperty(Constants.HEADER,	X_C_Order.COLUMNNAME_DeliveryRule,		DataSource.get(X_C_Order.COLUMNNAME_DeliveryRule));
			format.AddProperty(Constants.HEADER,	X_C_Order.COLUMNNAME_FreightCostRule,	DataSource.get(X_C_Order.COLUMNNAME_FreightCostRule));
			format.AddProperty(Constants.HEADER,	X_C_Order.COLUMNNAME_DeliveryViaRule, 	DataSource.get(X_C_Order.COLUMNNAME_DeliveryViaRule));
			format.AddProperty(Constants.HEADER,	X_C_Order.COLUMNNAME_IsDiscountPrinted,	DataSource.get(X_C_Order.COLUMNNAME_IsDiscountPrinted));
			format.AddProperty(Constants.HEADER,	X_C_Order.COLUMNNAME_IsTaxIncluded,		DataSource.get(X_C_Order.COLUMNNAME_IsTaxIncluded));
			format.AddProperty(Constants.HEADER,	X_C_Order.COLUMNNAME_Bill_Location_ID,	DataSource.get(X_C_Order.COLUMNNAME_Bill_Location_ID));
			format.AddProperty(Constants.HEADER,	X_C_Order.COLUMNNAME_C_BPartner_ID,				DataSource.get(X_C_Order.COLUMNNAME_C_BPartner_ID));
			format.AddProperty(Constants.HEADER,	X_C_Order.COLUMNNAME_C_BPartner_Location_ID, 	DataSource.get(X_C_Order.COLUMNNAME_C_BPartner_Location_ID));
			format.AddProperty(Constants.HEADER,	X_C_Order.COLUMNNAME_Pay_BPartner_ID,		 DataSource.get(X_C_Order.COLUMNNAME_Pay_BPartner_ID));
			format.AddProperty(Constants.HEADER,	X_C_Order.COLUMNNAME_AD_User_ID,			 DataSource.get(X_C_Order.COLUMNNAME_AD_User_ID));
			format.AddProperty(Constants.HEADER,	X_C_Order.COLUMNNAME_SalesRep_ID,			 DataSource.get(X_C_Order.COLUMNNAME_SalesRep_ID));
			format.AddProperty(Constants.HEADER,	X_C_Order.COLUMNNAME_Bill_User_ID,			 DataSource.get(X_C_Order.COLUMNNAME_Bill_User_ID));
			format.AddProperty(Constants.HEADER,	X_C_Order.COLUMNNAME_C_Currency_ID,			 DataSource.get(X_C_Order.COLUMNNAME_C_Currency_ID));
			format.AddProperty(Constants.HEADER,	X_C_Order.COLUMNNAME_Bill_BPartner_ID,		 DataSource.get(X_C_Order.COLUMNNAME_Bill_BPartner_ID));
			format.AddProperty(Constants.HEADER,	X_C_Order.COLUMNNAME_Description,			 getOrder().getDescription());
			format.AddProperty(Constants.HEADER,	X_C_Order.COLUMNNAME_POReference,			 getOrder().getPOReference());
			format.AddProperty(Constants.HEADER,  	X_C_Order.COLUMNNAME_C_Order_ID,			 DataSource.get(X_C_Order.COLUMNNAME_C_Order_ID));
			format.ValidateSection(Constants.HEADER);			
			format.ValidateMessage();	
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
		error = "";		
		try {			
			MMessageFormat format = getMessage();
			if (format == null) {				
				throw new Exception(getError());
			} else {
				format.getDocument();
			}
			MOrder o = getOrder();
			//o.setC_DocTypeTarget_ID(doctype.getC_DocType_ID());
			KeyNamePair kp = (KeyNamePair) pickDocType.getValue();
			o.setC_DocTypeTarget_ID(kp.getKey());
			this.updatePO(o);
			MCurrency currency = MCurrency.get(Env.getCtx(), getOrder().getC_Currency_ID());
			Timestamp actual = new Timestamp(System.currentTimeMillis());			
			MPriceList pl = MPriceList.get(Env.getCtx(), getOrder().getM_PriceList_ID(), null);
			ObjectViewModel adapter = viewPointOfPurchase.getDataModel();
			//int nLinesPosition = 0;			
			//int linesprocessed = 0;
			//int linesbonus = 0;			
			//int LineCount = adapter.getRowCount();
			int spricelist = salespricelist.getM_PriceList_ID();
			//
			for (int j = 0; j < viewPointOfPurchase.getRowCount(); j++) {
				Row row = (Row) adapter.getRowObject(j);
				if (row.getM_Product_ID() > 0	&& 
						(row.getQtyOrdered().compareTo(Env.ZERO) != 0 || row.getQtyBonus().compareTo(Env.ZERO) != 0)) 
				{
					//int spricelist = salespricelist != null ? salespricelist.getM_PriceList_ID() : 0;					
					//int spricelistversion = salespricelistversion != null ? salespricelistversion.getM_PriceList_Version_ID() : 0;
					//int spricelistversion = salespricelist.getM_PriceList_Version_ID();
					format.AddProperty("item",	X_C_OrderLine.COLUMNNAME_M_Product_ID,	row.getProduct().getValue());					
					//format.AddProperty("item",	Constants.M_PriceSalesList_ID,	String.valueOf(spricelist));
					//format.AddProperty("item",	M_PriceSalesListVersion_ID,	String.valueOf(spricelistversion));					
					//format.AddProperty("item",	BuyPriceListVersion_ID, String.valueOf(buypricelist.getM_PriceList_Version_ID()));					
					format.AddProperty("item",	X_C_OrderLine.COLUMNNAME_PriceActual,	row.getPriceActual().toString());
					format.AddProperty("item",	X_C_OrderLine.COLUMNNAME_PriceList, 	row.getPriceList().toString());
					format.AddProperty("item",	X_C_OrderLine.COLUMNNAME_PriceLimit, 	row.getPriceLimit().toString());
					format.AddProperty("item", 	X_C_OrderLine.COLUMNNAME_Margin, 		row.getMargin().toString());
					format.AddProperty("item",	X_C_OrderLine.COLUMNNAME_PriceEntered,	row.getPriceEntered().toString());
					format.AddProperty("item",	X_C_OrderLine.COLUMNNAME_QtyOrdered, 	row.getQtyOrdered().toString());
					format.AddProperty("item",	X_C_OrderLine.COLUMNNAME_QtyEntered, 	row.getQtyEntered().toString());
					format.AddProperty("item",	X_C_OrderLine.COLUMNNAME_PriceBase, 	row.getPriceBase().toString());
					format.AddProperty("item",	X_C_OrderLine.COLUMNNAME_Discount, 	row.getDiscount().toString());					
					format.AddProperty("item",	X_C_OrderLine.COLUMNNAME_Discount1, 	row.getDiscount1().toString());
					format.AddProperty("item",	X_C_OrderLine.COLUMNNAME_Discount2, 	row.getDiscount2().toString());
					format.AddProperty("item",	X_C_OrderLine.COLUMNNAME_Discount3, 	row.getDiscount3().toString());
					format.AddProperty("item",	X_C_OrderLine.COLUMNNAME_Discount4, 	row.getDiscount4().toString());
					format.AddProperty("item",	X_C_OrderLine.COLUMNNAME_DiscountAcquire1, 	row.getDiscountAcquire1().toString());
					format.AddProperty("item",	X_C_OrderLine.COLUMNNAME_PriceAcquisition, 	row.getPriceActual().toString());
					format.AddProperty("item",	X_C_OrderLine.COLUMNNAME_M_AttributeSetInstance_ID,	row.getM_AttributeSetInstance_ID().toString());
					format.AddProperty("item",	X_C_OrderLine.COLUMNNAME_QtyBonus, 			row.getQtyBonus().toString());
					format.AddProperty("item",	UOMBonus_ID, 			row.getQtyBonus().toString());
					format.AddProperty("item",	QtyBonusOrdered, 			row.getQtyBonusOrdered().toString());
					format.AddProperty("item",	X_C_OrderLine.COLUMNNAME_C_Tax_ID, getid(X_C_Tax.Table_Name, row.getC_Tax_ID()));
					format.AddProperty("item",  X_C_OrderLine.COLUMNNAME_C_UOM_ID, 	getid(X_C_UOM.Table_Name, row.getC_UOM_ID()));
					format.AddProperty("item",  X_C_OrderLine.COLUMNNAME_LineNetAmt, 	row.getTotal().toString());
					format.AddProperty("item",  SalesPrice, 	row.getSalesPriceList().toString());					
					format.AddProperty("item", 	Constants.ChangePrice, row.getUpdatePrice() ? "Y":"N");
					format.AddProperty("item",	X_C_OrderLine.COLUMNNAME_C_OrderLine_ID, Util.getUUID());
					format.ValidateSection("item");
				}
			}						
			format.AddProperty("client", Constants.COLUMNNAME_AD_Client_ID, getid(X_AD_Client.Table_Name, Env.getAD_Client_ID(Env.getCtx())));
			format.ValidateSection("client");
			format.AddProperty("org", Constants.COLUMNNAME_AD_Org_ID, getid(X_AD_Org.Table_Name, Env.getAD_Org_ID(Env.getCtx())));
			format.ValidateSection("org");			
			format.AddProperty(Constants.HEADER, Constants.COLUMNNAME_AD_Client_ID,	AD_Client_ID.toString());
			format.AddProperty(Constants.HEADER, Constants.COLUMNNAME_AD_Org_ID,	AD_Org_ID.toString());
			format.AddProperty(Constants.HEADER, Constants.AD_User_ID,	String.valueOf(Env.getAD_User_ID(Env.getCtx())));
			format.AddProperty(Constants.HEADER, Constants.COLUMNNAME_Created, actual.toString().substring(0, 16));
			if (salespricelist.getMPriceList() != null) {
				format.AddProperty(Constants.HEADER, Constants.M_PriceSalesList_ID,	salespricelist.getMPriceList().getIdentifier());
			}
			format.AddProperty(Constants.HEADER, X_C_Order.COLUMNNAME_M_PriceList_ID, getid(X_M_PriceList.Table_Name, getOrder().getM_PriceList_ID()));
			format.AddProperty(Constants.HEADER, X_C_Order.COLUMNNAME_SerialToInvoice,	getOrder().getSerialToInvoice());			
			format.AddProperty(Constants.HEADER, X_C_Order.COLUMNNAME_DocumentNoToInvoice,	getOrder().getDocumentNoToInvoice());
			format.AddProperty(Constants.HEADER, "InOutDocNumber",	getOrder().getInOutDocNumber());
			format.AddProperty(Constants.HEADER,	X_C_Order.COLUMNNAME_M_Warehouse_ID,	getid(X_M_Warehouse.Table_Name, getOrder().getM_Warehouse_ID()));
			format.AddProperty(Constants.HEADER,	X_C_Order.COLUMNNAME_M_PriceList_ID,	getid(X_M_PriceList.Table_Name, getOrder().getM_PriceList_ID()));			
			format.AddProperty(Constants.HEADER,	X_C_Order.COLUMNNAME_C_Contact_ID,		getid(X_C_Contact.Table_Name, getOrder().getC_Contact_ID()));
			format.AddProperty(Constants.HEADER,	X_C_Order.COLUMNNAME_DateOrdered, getOrder().getDateOrdered().toString());
			format.AddProperty(Constants.HEADER,	X_C_Order.COLUMNNAME_DatePromised, getOrder().getDatePromised().toString());
			format.AddProperty(Constants.HEADER, X_C_Order.COLUMNNAME_DateAcct,		getOrder().getDateAcct().toString());
			//format.AddProperty(Constants.HEADER, "SalesPriceListVersion_ID", getid(X_M_PriceList.Table_Name,salespricelist.getM_PriceList_Version_ID()));
			//format.AddProperty(Constants.HEADER, "BuyPriceListVersion_ID", getid(X_M_PriceList.Table_Name, buypricelist.getM_PriceList_Version_ID()));
			format.AddProperty(Constants.HEADER, X_C_Order.COLUMNNAME_DateInvoiced, getOrder().getDateInvoiced().toString());
			format.AddProperty(Constants.HEADER, X_C_Order.COLUMNNAME_IsSOTrx, "N");
			format.AddProperty(Constants.HEADER, X_C_Order.COLUMNNAME_PriorityRule, getOrder().getPriorityRule());
			//format.AddProperty(Constants.HEADER,	X_M_InOut.COLUMNNAME_DateReceived, getOrder().getDateInOut().toString());
			//format.AddProperty(Constants.HEADER,	X_C_Invoice.COLUMNNAME_DateInvoiced, getOrder().getDateInvoiced().toString());
			//if (getOrder().getC_DocTypeTarget_ID() <= 0)	
			//{
			//	X_C_DocType dt = new Query(Env.getCtx(), X_C_DocType.Table_Name, " docsubtype = ?" , null)
			//		.setParameters(REF_C_DocTypeSubType.Proposal).first();				
			//	if (dt != null)
			//	{
			//		format.AddProperty(Constants.HEADER,	X_C_Order.COLUMNNAME_C_DocTypeTarget_ID, String.valueOf(dt.getC_DocType_ID()));
			//	}
			//}
			//else
			format.AddProperty(Constants.HEADER,	X_C_Order.COLUMNNAME_C_DocTypeTarget_ID, getid(X_C_DocType.Table_Name, getOrder().getC_DocTypeTarget_ID()));
			format.AddProperty(Constants.HEADER,		X_C_Order.COLUMNNAME_C_DocType_ID,	getid(X_C_DocType.Table_Name, getOrder().getC_DocType_ID()));
			if (getOrder().getC_PaymentTerm_ID() != 0)
				format.AddProperty(Constants.HEADER,	X_C_Order.COLUMNNAME_C_PaymentTerm_ID,	getid(X_C_PaymentTerm.Table_Name, getOrder().getC_PaymentTerm_ID()));
			else {
				int ii = Env.getContextAsInt(Env.getCtx(),	"#C_PaymentTerm_ID");
				if (ii != 0)
					format.AddProperty(Constants.HEADER,	X_C_Order.COLUMNNAME_C_PaymentTerm_ID,	getid(X_C_PaymentTerm.Table_Name, ii));
				else {
					String sql = "SELECT C_PaymentTerm_ID FROM C_PaymentTerm WHERE AD_Client_ID=? AND IsDefault='Y'";
					ii = DB.getSQLValue(null, sql,	getOrder().getAD_Client_ID());
					if (ii != 0)
						format.AddProperty(Constants.HEADER,	X_C_Order.COLUMNNAME_C_PaymentTerm_ID,	getid(X_C_PaymentTerm.Table_Name, ii));
				}
			}
			format.AddProperty(Constants.HEADER, 	X_C_Order.COLUMNNAME_C_Order_ID, 			 Util.getUUID());
			format.AddProperty(Constants.HEADER,	X_C_Order.COLUMNNAME_PaymentRule, 			 getOrder().getPaymentRule());
			format.AddProperty(Constants.HEADER,	X_C_Order.COLUMNNAME_InvoiceRule, 			 getOrder().getInvoiceRule());
			format.AddProperty(Constants.HEADER,	X_C_Order.COLUMNNAME_DeliveryRule,			 getOrder().getDeliveryRule());
			format.AddProperty(Constants.HEADER,	X_C_Order.COLUMNNAME_FreightCostRule, 		 getOrder().getFreightCostRule());
			format.AddProperty(Constants.HEADER,	X_C_Order.COLUMNNAME_DeliveryViaRule, 	 	 getOrder().getDeliveryViaRule());
			format.AddProperty(Constants.HEADER,	X_C_Order.COLUMNNAME_IsDiscountPrinted,		 getOrder().isDiscountPrinted() ? "Y" : "N");
			format.AddProperty(Constants.HEADER,	X_C_Order.COLUMNNAME_IsTaxIncluded,			 getOrder().isTaxIncluded() ? "Y" : "N");
			format.AddProperty(Constants.HEADER,	X_C_Order.COLUMNNAME_Bill_Location_ID,		 getid(X_C_Location.Table_Name, getOrder().getBill_Location_ID()));
			format.AddProperty(Constants.HEADER,	X_C_Order.COLUMNNAME_C_BPartner_ID,			 getid(X_C_BPartner.Table_Name, getOrder().getC_BPartner_ID()));
			format.AddProperty(Constants.HEADER,	X_C_Order.COLUMNNAME_C_BPartner_Location_ID, getid(X_C_BPartner_Location.Table_Name, getOrder().getC_BPartner_Location_ID()));
			format.AddProperty(Constants.HEADER,	X_C_Order.COLUMNNAME_Pay_BPartner_ID,		 getid(X_C_BPartner.Table_Name, getOrder().getPay_BPartner_ID()));
			format.AddProperty(Constants.HEADER,	X_C_Order.COLUMNNAME_AD_User_ID,			 getid(X_AD_User.Table_Name, getConfig().getAD_User_ID()));
			format.AddProperty(Constants.HEADER,	X_C_Order.COLUMNNAME_SalesRep_ID,			 getid(X_AD_User.Table_Name, getOrder().getSalesRep_ID()));
			format.AddProperty(Constants.HEADER,	X_C_Order.COLUMNNAME_Bill_User_ID,			 getid(X_AD_User.Table_Name, getOrder().getBill_User_ID()));
			format.AddProperty(Constants.HEADER,	X_C_Order.COLUMNNAME_C_Currency_ID,			 getid(X_C_Currency.Table_Name, getOrder().getC_Currency_ID()));
			format.AddProperty(Constants.HEADER,	X_C_Order.COLUMNNAME_Bill_BPartner_ID,		 getid(X_C_BPartner.Table_Name, getOrder().getBill_BPartner_ID()));
			format.AddProperty(Constants.HEADER,	X_C_Order.COLUMNNAME_Description,			 getOrder().getDescription());
			//format.AddProperty(Constants.HEADER,	X_C_Order.COLUMNNAME_C_BPartner_Points_ID,	 String.valueOf(getOrder().getC_BPartner_Points_ID()));
			format.AddProperty(Constants.HEADER,	X_C_Order.COLUMNNAME_POReference,			 getOrder().getPOReference());
			format.ValidateSection(Constants.HEADER);			
			format.ValidateMessage();	
			error = SendMessage();
			if (error.length() > 0)
				throw new Exception(error);			
		} catch (Exception e) {
			e.printStackTrace();
			error = e.getMessage();
		}
		return error;
	}

	private String getid(String tableName, int uid) {
		String id = "";
		PO po = new Query(Env.getCtx(), tableName, String.format("%s_ID = ?", tableName), null).setParameters(uid).first();
		if (po != null) {
			if (po.get_ColumnIndex(X_AD_Client.COLUMNNAME_Identifier) >= 0) {
				id = (String) po.get_Value(X_AD_Client.COLUMNNAME_Identifier);				
				if (id == null)
					id = "NSD";
			}			
		}
		return id;
	}

	private MMessageFormat getMessage() {
		KeyNamePair kp = (KeyNamePair) pickDocType.getValue();
		MDocType dt = MDocType.get(Env.getCtx(), kp.getKey());
		//MDocType dt = MDocType.get(Env.getCtx(), getOrder().getC_DocTypeTarget_ID());
		if (!formats.containsKey(dt.getAD_MessageFormat_ID())) {
			MMessageFormat format = new Query(Env.getCtx(), X_AD_MessageFormat.Table_Name, "AD_MessageFormat_ID = ?", null)
			.setParameters(dt.getAD_MessageFormat_ID()).first();
			if (format != null) {
				try {
					MessageExpression me = MessageExpression.get(format.getIdentifier());
					if (me != null) {
						formats.put(dt.getAD_MessageFormat_ID(), format);
					} 
				} catch (Exception e) {
					error = e.getMessage();
					e.printStackTrace();
				}
			} else {
				error = String.format("el tipo de documento %s no tiene definido un formato de mensaje",pickDocType.getValue());
			}						

		}
		MMessageFormat format = formats.get(dt.getAD_MessageFormat_ID());
		return format;		
	}

	private String SendMessage() {
		try {
			MMessageFormat format = getMessage();
			//ledJMSServer.setState(LED.LIGHTGREEN);
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
			//MMessageFormat format = getMessage();
			//X_A_Machine machine = Env.getMessageHost(Env.getMachine());
			//QueueConnectionFactory cf = null;				
			queue = (Queue) CConnection.get().lookup(machine.getName(), Constants.QPOPQUEUE);				
			cf = (QueueConnectionFactory) CConnection.get().lookup(machine.getName(),	Constants.QConnectionFactory);
			QueueConnection connection = cf.createQueueConnection();
			connection.start();
			QueueSession session = connection.createQueueSession(false,	Session.AUTO_ACKNOWLEDGE);
			coreSession = ((HornetQSession) session).getCoreSession();
			coreSession.setSendAcknowledgementHandler(this);			
			String id = Util.getUUID();
			TextMessage request = session.createTextMessage(format.getValidMessage());
			request.setStringProperty(X_A_Xendrian_Message.COLUMNNAME_Identifier, id);
			MessageProducer sender = null;
			sender = session.createProducer(queue);
			sender.send(request);
			connection.close();

		} catch (Exception e) {
			error = e.getMessage();
		}
		return error;
	}

	public Integer doTransaction(
			// OrderPOP order,
			MOrder order, ObjectView view, ObjectView view2, ObjectView view3,
			String DocNumber) {

		return 1;
	}

	public List<Row> getRows() {
		List<Row> rows = new ArrayList<Row>();
		ObjectViewModel adapter = viewPointOfPurchase.getDataModel();
		for (int j = 0; j < viewPointOfPurchase.getRowCount(); j++) {
			Row row = (Row) adapter.getRowObject(j);
			if (row.getM_Product_ID() > 0	&& 
					(row.getQtyOrdered().compareTo(Env.ZERO) != 0 || row.getQtyBonus().compareTo(Env.ZERO) != 0)) 
			{
				rows.add(row);
			}
		}		
		return rows;
	}

	private MProductPrice createPrice(int mPriceListVersionID,
			Integer mProductID, BigDecimal newSPL, String trxName) {

		MProductPrice pp = null;
		pp = new MProductPrice(Env.getCtx(), (Integer) mPriceListVersionID,
				mProductID, trxName);
		pp.setPriceList(newSPL);
		pp.setPriceStd(newSPL);
		pp.setPriceLimit(newSPL.subtract(newSPL.multiply(Env.ONE.divide(
				Env.ONEHUNDRED, 10, BigDecimal.ROUND_HALF_UP))));
		pp.save();
		return pp;
	}

	/**
	 * Get Process Message
	 * 
	 * @return clear text error message
	 */
	public String getProcessMsg() {
		return m_processMsg;
	} // getProcessMsg

	/**
	 * Get Error Message
	 * 
	 * @return clear text error message
	 */
	public String getErrorMsg() {
		return m_errorMsg;
	} // getErrorMsg

	public String process() {
		error = beforetransaction();
		if (error.length() == 0) {

			if (viewPointOfPurchase.getRowCount() > 0) {
				try {
					datasource();
					error = transaction();
					if (error.length() > 0) {
						if (m_showdialoginfo)
							showErrorPanel(error);
					} else {
						if (getInfo().length() > 0 && m_showdialoginfo)
							ADialog.info(getWindowNo(), null, getInfo());
						statusBar.setStatusLine(".", false);
						Void();
						viewPointOfPurchase.requestFocus();
						nextColumnPointOfPurchase(0);
					}
				} catch (Exception e)
				{
					error = e.getMessage();
				}
			} 
			else
				error = "no hay lineas";
		}
		return error;
	}

	public void setstatusBarInfo(String msg) {
		statusBar.setInfo(msg);
		statusBar.repaint();
	}

	public void init(int windowNo, FormFrame frame) {		
		setWindowNo(windowNo);
		AppsActions.put(Constants.T_VOID,   new AppsAction(Constants.T_VOID,   KeyStroke.getKeyStroke(KeyEvent.VK_F3, 0), false));
		AppsActions.put(Constants.T_LOAD,   new AppsAction(Constants.T_LOAD,   KeyStroke.getKeyStroke(KeyEvent.VK_F3, 0), false));
		AppsActions.put(Constants.T_IMPORT, new AppsAction(Constants.T_IMPORT, KeyStroke.getKeyStroke(KeyEvent.VK_F4, 0), false));
		AppsActions.put(Constants.T_SAVE,   new AppsAction(Constants.T_SAVE,   KeyStroke.getKeyStroke(KeyEvent.VK_F3, 0), false));

		File resource = new File(Env.getResource("org.xendra.pop", "popkeyboard.uitheme"));
		//File resource = new File(Ini.getXendraResource("pos") + "xenpos.uitheme");
		if (resource.exists())		
			error = initialize();
		else
			error = ("no se encuentra xenpos.uitheme");			
		if (error.length() == 0) {
			ResourceInjector.addModule(new SwingModule());
			ResourceInjector.get().load(resource);
			ResourceInjector.get().inject(this);			
			m_Frame = frame;
			Env.setContext(Env.getCtx(), getWindowNo(), "IsSOTrx", "N");
			buypricelist.addListener((ActionListener) this);
			salespricelist.addListener((ActionListener) this);

			pickPartner = VLookup.createBPartner(getWindowNo());
			pickPartner.setMandatory(true);
			pickPartner.addVetoableChangeListener(this);

			int AD_Column_ID = Util.getColumnID(MOrder.Table_ID, X_C_Order.COLUMNNAME_M_Warehouse_ID);
			Lookup lookup = MLookupFactory.get (Env.getCtx(), m_WindowNo, 0, AD_Column_ID, DisplayType.TableDir);		
			pickWarehouse = new VLookup (X_M_Warehouse.COLUMNNAME_M_Warehouse_ID, false, false, true, lookup);
			pickWarehouse.setValue(getWarehouse());


			AD_Column_ID = Util.getColumnID(MOrder.Table_ID, X_C_Order.COLUMNNAME_C_Contact_ID);
			lookup = MLookupFactory.get(Env.getCtx(), getWindowNo(), 0, AD_Column_ID, DisplayType.TableDir);
			pickPartnerContact = new VLookup(X_C_Order.COLUMNNAME_C_Contact_ID, true, false, true, lookup);
			pickPartnerContact.setMandatory(true);
			pickPartnerContact.addVetoableChangeListener(this);

			infosearch.setHorizontalAlignment(JLabel.LEFT);
			infosearch.setForeground(Color.BLACK);
			infosearch.setFont(new java.awt.Font("Monospaced", 0, 20));

			labelNetAmount.setForeground(Color.RED);
			labelNetAmount.setFont(new java.awt.Font("Monospaced", 0, 50));

			labelTaxAmount.setForeground(Color.RED);
			labelTaxAmount.setFont(new java.awt.Font("Monospaced", 0, 50));

			labelTotAmount.setForeground(Color.RED);
			labelTotAmount.setFont(new java.awt.Font("Monospaced", 0, 50));

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
			lconexion.setText(String.format("jnp://%s:%s", machine.getName(), Util.getAppsPort()));
			lconexion.addMouseListener(new MouseAdapter()  
			{  
				public void mouseClicked(MouseEvent e)  
				{  
					String host = "";
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
						error = EmbeddedMessageServer.getInstance().Test(ps.getName(), Constants.QPOPQUEUE);
						if (error.length() == 0)
						{
							host = ps.getName();
							X_A_Machine machine = new Query(Env.getCtx(), X_A_Machine.Table_Name, "A_Machine_ID = ?", null)
							.setParameters(ps.getA_Machine_ID()).first();
							Env.setMessageHost(machine);
						}
					}			    	
				}  
			}); 

			final JToolBar bar = new JToolBar();
			bar.setLayout(new MigLayout());

			try {
				BufferedImages.put(Constants.T_IMPORT, ImageIO.read(new File(Env.getResource("org.xendra.pop", "folder-inbox-new.png"))));
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			
			toolbarbuttons.put(Constants.T_VOID, AEnv.createActionButton(AppsActions.get(Constants.T_VOID), null, "New24",	"Nuevo documento"));		
			toolbarbuttons.get(Constants.T_VOID).addActionListener(this);
			bar.add(toolbarbuttons.get(Constants.T_VOID));

			toolbarbuttons.put(Constants.T_LOAD, AEnv.createActionButton(AppsActions.get(Constants.T_LOAD), null, "Open24",	"Cargar documento"));
			toolbarbuttons.get(Constants.T_LOAD).addActionListener(this);
			bar.add(toolbarbuttons.get(Constants.T_LOAD));

			toolbarbuttons.put(Constants.T_IMPORT, AEnv.createActionButton(AppsActions.get(Constants.T_IMPORT), null, BufferedImages.get(Constants.T_IMPORT),	"Importar documento"));					
			toolbarbuttons.get(Constants.T_IMPORT).addActionListener(this);
			bar.add(toolbarbuttons.get(Constants.T_IMPORT));						

			toolbarbuttons.put(Constants.T_SAVE, AEnv.createActionButton(AppsActions.get(Constants.T_SAVE), null, "document-save","Grabar documento"));
			toolbarbuttons.get(Constants.T_SAVE).addActionListener(this);
			bar.add(toolbarbuttons.get(Constants.T_SAVE));

			bar.add(pickPartner);
			bar.addSeparator(new Dimension(5, 0));
			bar.add(pickWarehouse);
			bar.addSeparator(new Dimension(5, 0));
			bar.add(buypricelist);
			bar.addSeparator(new Dimension(5, 0));
			bar.add(lconexion);
			bar.setFloatable(false);

			try {
				IObjetViewColumn[] columnsPointOfPurchase = getColumns(REF_TypePOPLine.PointOfPurchase);
				IObjetViewColumn[] columnsOthers = getColumns(REF_TypePOPLine.Others);
				IObjetViewColumn[] columnsUpdatePrice = getColumns(REF_TypePOPLine.UpdatePrice);

				Row[] rows = { newrow() };

				pContent = Arrays.asList(rows);

				modelPointOfPurchase = new DefaultObjectViewModel(columnsPointOfPurchase, pContent);
				modelPointOfPurchase.addTableViewModelListener(this);

				modelOthers = new DefaultObjectViewModel(columnsOthers, pContent);
				modelOthers.addTableViewModelListener(this);

				modelUpdatePrice = new DefaultObjectViewModel( columnsUpdatePrice, pContent);
				modelUpdatePrice.addTableViewModelListener(this);

				viewPointOfPurchase = new ObjectView(modelPointOfPurchase);
				viewPointOfPurchase.setColumnSelectionAllowed(false);
				viewPointOfPurchase
				.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
				viewPointOfPurchase.configcontrols(getWindowNo());
				viewPointOfPurchase.getInputMap(
						JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0), "KEYENTER");
				viewPointOfPurchase.getInputMap(JComponent.WHEN_FOCUSED).put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0), "KEYENTER");

				viewUpdatePrice = new ObjectView(modelUpdatePrice);
				viewUpdatePrice.setColumnSelectionAllowed(false);
				viewUpdatePrice.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
				viewUpdatePrice.configcontrols(getWindowNo());
				viewUpdatePrice.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)
				.put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0), "KEYENTER");
				viewUpdatePrice.getInputMap(JComponent.WHEN_FOCUSED).put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0), "KEYENTER");

				Action actions = new AbstractAction() {

					public void actionPerformed(ActionEvent ae) {
					}
				};

				viewPointOfPurchase.getActionMap().put("KEYENTER", actions);
				viewPointOfPurchase.setMakeIndex(true);

				viewUpdatePrice.getActionMap().put("KEYENTER", actions);
				viewUpdatePrice.setMakeIndex(true);

				viewPointOfPurchase.getSelectionModel()
				.addListSelectionListener(new ListSelectionListener() {
					public void valueChanged(ListSelectionEvent event) {
						List selection = viewPointOfPurchase.getSelectedRowObjects();
						Row row = null;
						if (selection.size() > 0) {
							row = (Row) selection.get(0);
							if (row != null)
								Env.setContext(Env.getCtx(), getWindowNo(), "M_Product_ID", row.getM_Product_ID());
						}
					}
				});

				viewUpdatePrice.getSelectionModel().addListSelectionListener(
						new ListSelectionListener() {
							public void valueChanged(ListSelectionEvent event) {
								List selection = viewUpdatePrice
										.getSelectedRowObjects();
								Row row = null;
								if (selection.size() > 0) {
									row = (Row) selection.get(0);
									if (row != null)
										Env.setContext(Env.getCtx(),
												getWindowNo(), "M_Product_ID",
												row.getM_Product_ID());
								}
							}
						});

				lkaPointOfPurchase = new LineKeyAdapter();
				lkaPointOfPurchase.setRowClass("org.xendra.pop.Row");
				lkaPointOfPurchase.setContext(getFrame(), this, viewPointOfPurchase, m_showdialoginfo, getWindowNo(),	infosearch, QtyByDefault, mTextToFind);
				lkaPointOfPurchase.funcCalculateTotalLines("calculatePointOfPurchaseTotalLines");
				lkaPointOfPurchase.funcNewLine("newLinePointOfPurchase");
				lkaPointOfPurchase.funcNextColumn("nextColumnPointOfPurchase");
				lkaPointOfPurchase.funcValidationForAddLine("isPriceListAndPartnerDefined");
				lkaPointOfPurchase.funcAddLine("AddProduct");
				lkaPointOfPurchase.funcValidationForDelLine("canDeleteLineofPointOfPurchase");
				lkaPointOfPurchase.setKeys(
						modelPointOfPurchase.getPosition("Key"),
						modelPointOfPurchase.getPosition("Description"),
						modelPointOfPurchase.getPosition("NextLine"),
						modelPointOfPurchase.getPosition("Default"));
				//
				viewPointOfPurchase.addKeyListener(lkaPointOfPurchase);
				viewPointOfPurchase.setContext(this);
				viewPointOfPurchase.funcCalculateTotalLines("calculatePointOfPurchaseTotalLines");

				lkaUpdatePrice = new LineKeyAdapter();
				lkaUpdatePrice.setContext(getFrame(), this, viewUpdatePrice,
						m_showdialoginfo, getWindowNo(), infosearch, QtyByDefault,
						mTextToFind);
				lkaUpdatePrice
				.funcCalculateTotalLines("calculateUpdatePriceTotal");
				lkaUpdatePrice.funcNextColumn("nextColumnUpdatePrice");
				lkaUpdatePrice.setKeys(modelUpdatePrice.getPosition("Key"),
						modelUpdatePrice.getPosition("Description"),
						modelUpdatePrice.getPosition("NextLine"),
						modelUpdatePrice.getPosition("Default"));
				//
				viewUpdatePrice.addKeyListener(lkaUpdatePrice);
				viewUpdatePrice.setContext(this);
				viewUpdatePrice.funcCalculateTotalLines("calculateUpdatePriceTotal");
				//
				gridPointOfPurchasePanel.setLayout(new BorderLayout());
				gridPointOfPurchasePanel.add(infosearch, BorderLayout.NORTH);
				gridPointOfPurchasePanel.add(new JScrollPane(viewPointOfPurchase), BorderLayout.CENTER);
				gridPointOfPurchasePanel.add(bottomPanel, BorderLayout.SOUTH);
				pointOfPurchasePanel = new FrameMediatorDockable("id", Msg.getMsg(Env.getCtx(), "Sales"), gridPointOfPurchasePanel, null);

				gridUpdatePricePanel.setLayout(new BorderLayout());
				JPanel panel = new JPanel();
				panel.setLayout(new MigLayout("center"));
				panel.add(labelPriceListVersion);
				panel.add(salespricelist);
				gridUpdatePricePanel.add(panel, BorderLayout.NORTH);
				gridUpdatePricePanel.add(new JScrollPane(viewUpdatePrice),	BorderLayout.CENTER);
				updatePricePanel = new FrameMediatorDockable("id2", Msg.getMsg(Env.getCtx(), "UpdatePrice"), gridUpdatePricePanel, null);

				dockingPort = new DefaultDockingPort();

				DockingManager.dock((Component) pointOfPurchasePanel.getView(),	(DockingPort) dockingPort, DockingConstants.CENTER_REGION);
				//DockingManager.dock((Component) othersPanel.getView(),	(DockingPort) dockingPort, DockingConstants.CENTER_REGION);
				DockingManager.dock((Component) updatePricePanel.getView(),	(DockingPort) dockingPort, DockingConstants.CENTER_REGION);
				DockingManager.display("id");

				BufferedImages.put(Constants.A_CASH, ImageIO.read(new File(Env.getResource("org.xendra.pop", "cash.png"))));
				BufferedImages.put(Constants.A_CONFIG, ImageIO.read(new File(Env.getResource("org.xendra.pop", "config.png"))));
				BufferedImages.put(Constants.A_DEBUG, ImageIO.read(new File(Env.getResource("org.xendra.pop", "bug.png"))));


				PushButtons.put(Constants.A_CASH, new PushButton(BufferedImages.get(Constants.A_CASH), Constants.A_PAY,KeyStroke.getKeyStroke(KeyEvent.VK_F11, 0), Msg.translate(Env.getCtx(), "Cash"), false));
				PushButtons.get(Constants.A_CASH).setDelegate(this);

				PushButtons.put(Constants.A_CONFIG, new PushButton(BufferedImages.get(Constants.A_CONFIG), Constants.A_CONFIG, null, Msg.translate(Env.getCtx(), "Config")));
				PushButtons.get(Constants.A_CONFIG).setDelegate(this);

				PushButtons.put(Constants.A_DEBUG, new PushButton(BufferedImages.get(Constants.A_DEBUG), Constants.A_DEBUG, null, Msg.translate(Env.getCtx(), "DEBUG")));
				PushButtons.get(Constants.A_DEBUG).setDelegate(this);				

				StringBuffer sb = new StringBuffer();

				bottomPanel.setLayout(new MigLayout("fill"));
				bottomPanel.add(labelNetAmount,"cell 0 0, growx");
				bottomPanel.add(labelTaxAmount,"cell 0 1, growx");
				bottomPanel.add(labelTotAmount,"cell 0 2, growx");

				frame.setBounds(0, 0, 760, 600);
				getFrame().getContentPane().add(BorderLayout.NORTH, bar);

				cardPanel = new JPanel(new CardLayout());
				String layout = String.format("wrap %d",config.getint(MachineCreator.nrocolumnspanel));
				buttonPanel.setLayout(new MigLayout(layout));
				buttonPanel.setName(buttonpanel);
				buttonPanel.add(PushButtons.get(Constants.A_CASH));			
				buttonPanel.add(PushButtons.get(Constants.A_CONFIG));				
				if (CLogMgt.DEBUG) {
					buttonPanel.add(PushButtons.get(Constants.A_DEBUG));
				}
				errorpanel = new ErrorPanel(this);
				errorpanel.setName(panelerror);				
				cardPanel.add(buttonPanel, buttonpanel);
				cardPanel.add(errorpanel, panelerror);
				scrollPane = new JScrollPane(cardPanel);

				infoPanel.setOrientation(JSplitPane.HORIZONTAL_SPLIT);
				infoPanel.setBorder(BorderFactory.createEtchedBorder());
				infoPanel.setRightComponent(scrollPane);
				infoPanel.setLeftComponent(dockingPort);
				infoPanel.setContinuousLayout(true);

				frame.getContentPane().add(infoPanel, BorderLayout.CENTER);				
				String fileName = Env.getResource("org.xendra.pop", "popview.properties");
				loadSettings(fileName);
				statusBar.setDialog(true);

				Dimension dim = new Dimension(10,10);
				Component childs[] = buttonPanel.getComponents();
				for (Component c : childs) {
					if (c instanceof PushButton)
					{
						if ( dim.getHeight() < c.getHeight() || dim.getWidth() < c.getWidth())
						{							
							dim = c.getSize();
						}
						else if (dim.getHeight() < c.getPreferredSize().getHeight() || dim.getWidth() < c.getPreferredSize().getWidth())
						{
							dim = c.getPreferredSize();
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
				cardpanelwidth = 600;
				initializedoctype();
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

	private void showFrameError(FormFrame frame)
	{
		JPanel panel = new JPanel(new MigLayout());
		JButton launchwiz = new JButton("Launch Wizard");
		launchwiz.addActionListener(new ActionListener() {				
			public void actionPerformed(ActionEvent e)
			{
				if (IsCanDelete()) {
					POPWizardLauncher nn = new POPWizardLauncher();	
					nn.launchWizard();	
				}
			}
		});
		panel.add(new CLabel(error, Env.getImageIcon("BPartner10.gif"), JLabel.CENTER), "wrap");
		panel.add(launchwiz);
		frame.getContentPane().add(panel);		
	}
	public void resizetobuttonpanel()
	{
		int margin = (int) (currentwidth - buttonspanelwidth);
		infoPanel.setDividerLocation(margin);		
	}
	public void resizetocardpanel()
	{
		int margin = (int) (currentwidth - cardpanelwidth);
		infoPanel.setDividerLocation(margin);		
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

	private void setWindowNo(int windowNo) {
		m_WindowNo = windowNo;		
	}
	private int getWindowNo() {
		return m_WindowNo;
	}
	public void moveSelection(int number) {
		int nrows = modelPointOfPurchase.getRowCount();
		if (nrows > 0) {
			int selectedIndex = viewPointOfPurchase.getSelectedRow();
			if (selectedIndex == -1)
				selectedIndex = 0;

			if (selectedIndex + number < 0 || selectedIndex + number >= nrows)
				return;

			viewPointOfPurchase.setRowSelectionInterval(selectedIndex + number,
					selectedIndex + number);

		}
	}

	Row newrow() {
		return new Row();
	}

	public IObjetViewColumn[] getColumns(String type) {
		int mIsKey = -1;
		int mIsDescription = -1;
		int mNextLine = -1;
		int mDefault = -1;
		ArrayList<DefaultTableViewColumn> newcolumns = new ArrayList<DefaultTableViewColumn>();
		try {
			List<MPOPLine> lines = config.getLines(type);
			int i = 0;
			for (MPOPLine line:lines) {
				Method getter = null;
				try {
					getter = Row.class.getDeclaredMethod(String.format("get%s", line.getSourceMethodName().trim()), null);
				}
				catch (Exception e2)
				{
					line.setIsVisible(false);
					line.save();					 
					continue;
				}
				Method setter = null;
				if (line.isReadWrite() && line.getClassname() != null) {
					Class[] setterParam = null;
					if (line.getClassname().equals("String"))
						setterParam = new Class[] { String.class };
					else if (line.getClassname().equals("BigDecimal"))
						setterParam = new Class[] { BigDecimal.class };
					else if (line.getClassname().equals("Integer"))
						setterParam = new Class[] { Integer.class };
					else if (line.getClassname().equals("Boolean"))
						setterParam = new Class[] { Boolean.class };
					try {
						setter = Row.class.getDeclaredMethod(String.format("set%s",	line.getSourceMethodName().trim()), setterParam);
					}
					catch (Exception e)
					{
						line.setIsReadWrite(false);
						line.save();
					}
				}
				if (line.isKey()
						&& type.equals(REF_TypePOPLine.PointOfPurchase))
					mIsKey = i;
				if (line.isDescription()
						&& type.equals(REF_TypePOPLine.PointOfPurchase))
					mIsDescription = i;
				if (line.isNextLine()
						&& type.equals(REF_TypePOPLine.PointOfPurchase))
					mNextLine = i;
				if (line.isDefault()
						&& type.equals(REF_TypePOPLine.PointOfPurchase))
					mDefault = i;

				newcolumns.add(new DefaultTableViewColumn(Msg.translate(
						Env.getCtx(), line.getName().trim()), null,
						(Method) getter, (Method) setter, true, /* visible */
						null, /* format */
						false, /* sortable */
						false, /* searchable */
						line.isKey(), line.isDescription(), line.isNextLine(),
						line.isDefault(), line.isColorColumn(), line
						.getAD_Column_ID(), line.getAD_Reference_ID(),
						null, null, line.isOverwrite()));
				i++;
			}
			String error = "";
			if (mIsKey == -1 && type.equals(REF_TypePOPLine.PointOfPurchase))
			{
				error = String.format("%s", Msg.translate(Env.getCtx(), "IsKey"));
			}
			if (mIsDescription == -1 && type.equals(REF_TypePOPLine.PointOfPurchase))
			{
				if (error.length() > 0)
					error += ",";
				error += String.format("%s", Msg.translate(Env.getCtx(), "IsDescription"));
			}
			if (mNextLine == -1 && type.equals(REF_TypePOPLine.PointOfPurchase))
			{
				if (error.length() > 0)
					error += ",";
				error += String.format("%s", Msg.translate(Env.getCtx(), "NextLine"));
			}
			if (mDefault == -1 && type.equals(REF_TypePOPLine.PointOfPurchase))
			{
				if (error.length() > 0)
					error += ",";
				error += String.format("%s", Msg.translate(Env.getCtx(), "Default"));
			}
			if (error.length() > 0) {
				error = String.format("es obligatorio marcar campo(s) indicando que son %s", error);
				throw new XendraException(error);
			}
		} catch (Exception e) {
			e.printStackTrace();
			ADialog.error(getWindowNo(), this, e.getMessage());
			return null;
		} // getter
		IObjetViewColumn[] columns = new IObjetViewColumn[newcolumns.size()];
		newcolumns.toArray(columns);
		return columns;
	}

	public void nextColumnPointOfPurchase() {
		int nextColumn = lkaPointOfPurchase.getSelectedColumn() + 1;
		if (nextColumn > viewPointOfPurchase.getColumnCount())
			nextColumn = 0;
		nextColumnPointOfPurchase(nextColumn);
	}

	public void nextColumnPointOfPurchase(int i) {
		int nextColumn = i;
		Rectangle rect = viewPointOfPurchase.getVisibleRect();
		Rectangle cRect = viewPointOfPurchase.getCellRect(
				lkaPointOfPurchase.getSelectedRow(), nextColumn, true);
		rect.y = cRect.y;
		rect.height = cRect.height;
		viewPointOfPurchase.scrollRectToVisible(rect);
		viewPointOfPurchase.changeSelection(
				lkaPointOfPurchase.getSelectedRow(), nextColumn, false, false);
	}
	public void newLinePointOfPurchase(Row row) {
		updateRow(row);
		executerules(null, "rownewline");
	}
	public void AddLine() {
		Row newrow = new Row();
		((DefaultObjectViewModel) viewPointOfPurchase.getDataModel())
		.addRow(newrow);

		Object SelectedRow = viewPointOfPurchase.getSelectedRowObject();

		((DefaultObjectViewModel) viewUpdatePrice.getDataModel()).updateRow(SelectedRow, newrow);

		int LastRow = viewPointOfPurchase.getRowCount() - 1;
		Rectangle rect = viewPointOfPurchase.getVisibleRect();
		Rectangle cRect = viewPointOfPurchase.getCellRect(LastRow, 0, true);
		rect.y = cRect.y;
		rect.height = cRect.height;
		viewPointOfPurchase.scrollRectToVisible(rect);
		viewPointOfPurchase.changeSelection(LastRow, 0, false, false);
		viewPointOfPurchase.getTableHeader().repaint();
		viewPointOfPurchase.repaint();
	}

	/************************
	 * Create Reset Button wlth label text
	 * 
	 * @param text
	 *            text
	 * @return button
	 */
	public void Void(Boolean block) {
		Void();
	}

	public void cleanlines() {
		viewPointOfPurchase
		.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		viewPointOfPurchase.selectAll();
		List selection = viewPointOfPurchase.getSelectedRowObjects();
		viewPointOfPurchase
		.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		modelPointOfPurchase.removeRows(selection);

	}

	public void Void() {
		ObjectViewModel adapter = viewPointOfPurchase.getDataModel();
		while (adapter.getRowCount() > 0)
		{
			Row row = (Row) adapter.getRowObject(0);
			((DefaultObjectViewModel) viewPointOfPurchase.getDataModel()).removeRow(row);
			//((DefaultObjectViewModel) viewOthers.getDataModel()).removeRow(row);
			((DefaultObjectViewModel) viewUpdatePrice.getDataModel()).removeRow(row);			
		}
		AddLine();
		InitializePO();				
		pickPartner.setValue(null);
		labelNetAmount.setText(zero);
		labelTaxAmount.setText(zero);
		labelTotAmount.setText(zero);
		buypricelist.setSelectedItem(null);
		buypricelist.setReadWrite(true);
		salespricelist.setSelectedItem(null);
		CardLayout cl = (CardLayout) (cardPanel.getLayout());
		cl.show(cardPanel, buttonpanel);		 
		enableEnvironment();
		updatestatusBar();
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
	 */
	public void AddProduct(Boolean isKey, MProduct product, BigDecimal Qty,
			Integer C_OrderLine_ID, Integer C_UOM_ID, BigDecimal Price,
			Integer M_AttributeSetInstance_ID, Boolean isVoidTransaction) {
		mTextToFind = lkaPointOfPurchase.getTextToFind();
		Info m_info = null;
		int nPos = viewPointOfPurchase.getSelectedRow();
		if (product == null)
			product = MProduct.getByValue(Env.getCtx(), mTextToFind, null);

		if (product == null) {
			// aca podriamos descomponer el UPC code

			//
			Env.setContext(Env.getCtx(), Env.WINDOW_INFO, Env.TAB_INFO,"M_Product_ID", "0");
			m_info = new InfoProduct(
					getFrame(),
					true,
					Env.WINDOW_INFO,
					getOrder().getM_Warehouse_ID(),
					getOrder().getM_PriceList_ID() /*
					 * model.priceListVersion.
					 * getM_PriceList_ID()
					 */,
					 0/* getOrder().getM_PriceListVersion_ID() *//*
					  * model.config.
					  * getM_PriceList_Version_ID
					  * ()
					  */,
					  isKey ? mTextToFind.trim() : "@" + mTextToFind.trim() + "%", // value
							  false, "", true, false);
			AEnv.showCenterWindow(getFrame(), m_info);
			Integer new_Product_ID = Env.getContextAsInt(Env.getCtx(), Env.WINDOW_INFO, Env.TAB_INFO, "M_Product_ID");
			product = MProduct.get(Env.getCtx(), new_Product_ID, null);
		} else {
			int M_PriceList_Version_ID;
			M_PriceList_Version_ID = Env.getContextAsInt(Env.getCtx(),Env.WINDOW_INFO, Env.TAB_INFO, "M_PriceList_Version_ID");
			if (M_PriceList_Version_ID == 0)
				M_PriceList_Version_ID = Env.getContextAsInt(Env.getCtx(), getWindowNo(), "M_PriceList_Version_ID");

			// validando
			String sql = "SELECT "
					.concat("p.M_Product_ID from M_Product p LEFT OUTER JOIN M_ProductPrice pr ")
					.concat("ON (p.M_Product_ID=pr.M_Product_ID AND pr.IsActive='Y') ")
					.concat("WHERE p.M_Product_ID=? AND pr.M_PriceList_Version_ID=? AND p.IsActive='Y'");

			int m_product = DB.getSQLValue(null, sql,
					product.getM_Product_ID(), M_PriceList_Version_ID);
			if (m_product == -1) {
				product = null;
			}
		}
		//
		if (product != null && product.getM_Product_ID() > 0) {
			ObjectViewModel adapter = viewPointOfPurchase.getDataModel();
			Vector v = new Vector();
			for (int j = 0; j < viewPointOfPurchase.getRowCount(); j++) {
				Row row = (Row) adapter.getRowObject(j);
				if (row.getM_Product_ID() == product.getM_Product_ID()) {
					v.add(row.getM_AttributeSetInstance_ID());
				}
			}

			Row row = new Row();
			row.setParent(this);
			row.setIsNew(true);
			row.setC_OrderLine_ID(C_OrderLine_ID);
			row.setC_BPartner_ID(getOrder().getC_BPartner_ID());
			row.setM_PriceList_ID(getOrder().getM_PriceList_ID());
			row.setM_PriceListVersion_ID(buypricelist.getM_PriceList_Version_ID());
			row.setWindowNo(getWindowNo());
			row.setC_Currency_ID(getOrder().getC_Currency_ID());
			row.setM_Warehouse_ID(getOrder().getM_Warehouse_ID());			
			row.setDateOrdered(getOrder().getDateOrdered());
			row.setDatePromised(getOrder().getDateOrdered());
			row.addASIExceptions(v);
			row.setTaxIncluded(getOrder().isTaxIncluded());
			row.product(product);
			row.setM_AttributeSetInstance_ID(M_AttributeSetInstance_ID);
			// actualizacion de precio de venta
			if (salespricelist.getM_PriceList_Version_ID() > 0)
			{
				//Integer splv = (Integer) pickSalesPriceListVersion.getValue();
				//salespricelistversion = new Query(Env.getCtx(), X_M_PriceList_Version.Table_Name, "M_PriceList_Version_ID = ?", null)
				//	.setParameters(splv).first();
				//if (salespricelistversion != null)
				//{
				//salespricelist = MPriceList.get(Env.getCtx(), salespricelistversion.getM_PriceList_ID(), null);

				MProductPricing pp = new MProductPricing(product.getM_Product_ID(),	getOrder().getC_BPartner_ID(), null, false);
				pp.setM_PriceList_ID(salespricelist.getM_PriceList_ID());
				pp.setM_PriceList_Version_ID(salespricelist.getM_PriceList_Version_ID());

				BigDecimal PriceList = MUOMConversion.convertProductFrom(
						Env.getCtx(), product.getM_Product_ID(), row.getC_UOM_ID(),
						pp.getPriceList());

				row.setSalesPriceList(PriceList);
				//}
			}
			//row.setSalesMargin();
			if (Price != null)
				row.setPriceEntered(Price);
			if (C_UOM_ID > 0) {
				row.setC_UOM_ID(C_UOM_ID);
				row.setC_UOMBonus_ID(C_UOM_ID);
			}
			row.setQtyEntered(Qty);
			//		
			//			int ii = 0;
			//			MTax[] taxes = MTax.getAll (Env.getCtx());
			//			for (MTax tax:taxes)
			//			{
			//				if (tax.getC_TaxCategory_ID() == product.getC_TaxCategory_ID())
			//				{
			//					if (tax.isDefault())
			//					{
			//						ii = tax.getC_Tax_ID();
			//					}
			//				}
			//			}			
			//			if (ii == 0)
			//			{
			//				ii = Tax.get(Env.getCtx(), row.getM_Product_ID(),
			//						0, getOrder().getDateOrdered(),
			//						getOrder().getDateOrdered(),
			//						getOrder().getAD_Org_ID(),
			//						getOrder().getM_Warehouse_ID(),
			//						getOrder().getC_BPartner_Location_ID(), // should
			//						// be
			//						// bill
			//						// to
			//						getOrder().getC_BPartner_Location_ID(), true);
			//			}
			//			row.setC_Tax_ID(ii);
			if (row.getM_processMsg() != null && C_OrderLine_ID == 0
					&& !isVoidTransaction) {
				if (m_showdialoginfo)
					ADialog.info(getWindowNo(), getFrame(), row.getM_processMsg());
			} else {
				if (row.getM_processMsg() != null && isVoidTransaction) {
					if (m_showdialoginfo)
						ADialog.info(getWindowNo(), getFrame(), row.getM_processMsg());
				}
				Object SelectedRow = viewPointOfPurchase.getSelectedRowObject();
				((DefaultObjectViewModel) viewPointOfPurchase.getDataModel()).updateRow(SelectedRow, row);
				//((DefaultObjectViewModel) viewOthers.getDataModel()).updateRow(	SelectedRow, row);
				((DefaultObjectViewModel) viewUpdatePrice.getDataModel()).updateRow(SelectedRow, row);
				viewPointOfPurchase.setRowSelectionInterval(nPos, nPos);
				if (((DefaultObjectViewModel) viewPointOfPurchase
						.getDataModel()).getPosition("Default") > 0) {
					int mDefault = ((DefaultObjectViewModel) viewPointOfPurchase
							.getDataModel()).getPosition("Default");
					viewPointOfPurchase.setColumnSelectionInterval(mDefault,
							mDefault);
				}
			}
		}
		return;
	}

	public void actionPerformed(ActionEvent e) {
		Component c = (Component) e.getSource();
		if (e.getActionCommand().equals(Constants.T_LOAD)) {
			LoadOffer();
		}
		if (e.getActionCommand().equals(Constants.T_IMPORT)) {
			ImportOffer();
		}
		if (e.getActionCommand().equals(Constants.T_SAVE)) {
			String error = SaveOffer(null, "");
			if (error.length() > 0)
			{
				showErrorPanel(error);
			}
			else
			{
				Void();
				//resetOrder();
				cleanlines();
				newLinePointOfPurchase(null);
				if (m_showdialoginfo)
					ADialog.info(getWindowNo(), null, String.format("%s : %s",	Msg.translate(Env.getCtx(), "C_Order_ID"), getOrder().getDocumentNo()));

			}			
		}		
		if (c instanceof PushButton) {
			pushbuttonpanel((PushButton) c, e.getActionCommand());
		}
		if (c == pickWarehouse) {
			Integer M_Warehouse_ID = (Integer) pickWarehouse.getValue();
			getOrder().setM_Warehouse_ID(M_Warehouse_ID);
		}
		if (c.getName() == DocVoid) {
		} 
		if (c == salespricelist) {
			UpdateSalesPriceList();
		}
		if (c.equals(buypricelist)) 
			setPriceList();
		return;

	}

	private void pushbuttonpanel(PushButton c, String ActionCommand) {
		if (ActionCommand.equals(Constants.A_CONFIG)) {
			if (IsCanDelete()) {
				POPWizardLauncher nn = new POPWizardLauncher();	
				nn.launchWizard();
			}
			return;
		}		
		String error = beforetransaction();
		if (error.length() > 0) {
			showErrorPanel(error);
			return;
		}
		disableEnvironment();
		if (ActionCommand.equals(A_PAY)) {
			// 
			Row row = (Row) viewPointOfPurchase.getSelectedRowObject();
			if (row.IsAttributeOK())
				EntryPointPay();
			else
				showErrorPanel("PAttributeNoAttributeSet");
		}
		if (ActionCommand.equals(Constants.A_DEBUG)) {
			showDebugPanel();
		}
	}

	private void setIsCanDelete(boolean canDelete) {
		m_CanDelete = canDelete;
	}

	public boolean IsCanDelete() {
		boolean ok = true;
		if (!m_CanDelete) {
			if (getPassword().length() > 0)
			{
				DialogAskPassword dialog = new DialogAskPassword(getFrame(),
						getPassword());
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

	public FormFrame getFrame() {
		return m_Frame;
	}
	public String getErrorMessagePanel()
	{
		return errorpanel.getErrorMsg();
	}
	public void showErrorPanel(String m_processMsg) {
		resizetocardpanel();
		disableEnvironment();
		String prevcard = "";
		for (Component comp : cardPanel.getComponents()) {
			if (comp.isVisible() == true) {
				prevcard = comp.getName();		        
				break;
			}
		}		
		if (!prevcard.equals(panelerror))
		{
			CardLayout cl = (CardLayout) (cardPanel.getLayout());		
			cl.show(cardPanel, panelerror);
			errorpanel.setMessage(m_processMsg, prevcard);
		}
	}

	private void EntryPointPay() {
		lock();		
		ObjectViewModel adapter = viewPointOfPurchase.getDataModel();
		String msg = "";
		String msglot = "";
		Boolean lcontinue = true;
		for (int j = 0; j < viewPointOfPurchase.getRowCount(); j++) {
			Row row = (Row) adapter.getRowObject(j);
			if (row.getSalesPriceList().compareTo(Env.ZERO) > 0
					&& row.getPriceActual().compareTo(Env.ZERO) > 0) {
				BigDecimal diff = new BigDecimal(row.getSalesPriceList()
						.floatValue() / row.getPriceActual().floatValue());
				diff = Env.ONE.subtract(diff);
				if (diff.floatValue() > .05) {
					msg = msg.concat(row.getName()).concat(
							" vario "
									+ diff.multiply(Env.ONEHUNDRED).setScale(2,
											BigDecimal.ROUND_HALF_UP) + "% \n");
				}
			}
		}
		if (msg.length() > 0) {
			msg = msg
					.concat("\n existen diferencias mayores al 5% desea continuar ? ");
			lcontinue = ADialog.ask(getWindowNo(), getFrame(), msg);
		}
		if (msglot.length() > 0) {
			ADialog.error(getWindowNo(), getFrame(), msglot);
			lcontinue = false;
		}
		if (lcontinue) {
			showPayPanel();
		} else
			unlock();
	}

	public DebugPanel getDebugPanel() {
		DebugPanel debugpanel = (DebugPanel) CardPanels.get(Constants.A_DEBUG);
		if (debugpanel == null) {
			debugpanel = new DebugPanel(this);
			debugpanel.setName(Constants.A_DEBUG);
			CardPanels.put(Constants.A_DEBUG, debugpanel);
		}
		return debugpanel;
	}

	public BuyPanel getBuyPanel()
	{
		BuyPanel buypanel = (BuyPanel) CardPanels.get(buy);
		if (buypanel == null) {
			buypanel = new BuyPanel(this);
			buypanel.setName(buy);
			registerObserver(X_AD_User.Table_Name, buy);
			registerObserver(X_C_BPartner.Table_Name, buy);
			CardPanels.put(buy, buypanel);
		}
		return buypanel;
	}

	private void showPayPanel() {
		cardPanel.add(getBuyPanel(), buy);		
		CardLayout cl = (CardLayout) (cardPanel.getLayout());
		cl.show(cardPanel, buy);
		getBuyPanel().update();
		getBuyPanel().selection();		
	}

	private void showDebugPanel() {
		cardPanel.add(getDebugPanel(), Constants.A_DEBUG);
		CardLayout cl = (CardLayout) (cardPanel.getLayout());
		cl.show(cardPanel, Constants.A_DEBUG);
		getDebugPanel().update();
		getDebugPanel().selection();
	}


	public Object getWarehouse() {
		return getOrder().getM_Warehouse_ID();
	}

	private void setPriceList() {
		Integer PriceListVersion = buypricelist.getM_PriceList_Version_ID();
		if (PriceListVersion > 0) {
			MPriceList pricelist = buypricelist.getMPriceList();
			Env.setContext(Env.getCtx(), getWindowNo(), "M_PriceList_ID",			buypricelist.getM_PriceList_ID());
			Env.setContext(Env.getCtx(), getWindowNo(), "M_PriceList_Version_ID",	PriceListVersion);
			Env.setContext(Env.getCtx(), getWindowNo(), "IsTaxIncluded",			pricelist.isTaxIncluded());
			Env.setContext(Env.getCtx(), getWindowNo(), "EnforcePriceLimit",		pricelist.isEnforcePriceLimit());
			execute(buypricelist.getMPriceListVersion());
			buypricelist.setReadWrite(false);
		}
	}

	private void UpdatePrice(Integer M_PriceList_ID) {
		if (M_PriceList_ID > 0) {
			MPriceList mpl = MPriceList.get(Env.getCtx(), M_PriceList_ID, null);
			//pickBuyPriceListVersion.setValue(mpl.getPriceListVersion(getOrder().getDateOrdered()).getM_PriceList_Version_ID());
			labelPriceListVersion.setText(mpl.getPriceListVersion(getOrder().getDateOrdered()).getName());
			Env.setContext(Env.getCtx(), getWindowNo(), "M_PriceList_ID",	mpl.getM_PriceList_ID());
			Env.setContext(Env.getCtx(), getWindowNo(), "M_PriceList_Version_ID",	mpl.getPriceListVersion(getOrder().getDateOrdered())
					.getM_PriceList_Version_ID());
			Env.setContext(Env.getCtx(), getWindowNo(), "IsTaxIncluded",		mpl.isTaxIncluded());
			Env.setContext(Env.getCtx(), getWindowNo(), "EnforcePriceLimit",	mpl.isEnforcePriceLimit());
			getOrder().setM_PriceList_ID(M_PriceList_ID);
			getOrder().setC_Currency_ID(mpl.getC_Currency_ID());
			// getOrder().setTaxIncluded(mpl.isTaxIncluded());
			getOrder().setIsTaxIncluded(mpl.isTaxIncluded());
		}
	}

	private void UpdateSalesPriceList() {
		ObjectViewModel adapter = viewPointOfPurchase.getDataModel();
		if (salespricelist != null) {
			for (int j = 0; j < viewPointOfPurchase.getRowCount(); j++) {
				Row row = (Row) adapter.getRowObject(j);

				MProductPricing pp = new MProductPricing( row.getM_Product_ID(), getOrder().getC_BPartner_ID(), null, false);
				pp.setM_PriceList_ID(salespricelist.getM_PriceList_ID());
				pp.setM_PriceList_Version_ID(salespricelist.getM_PriceList_Version_ID());
				row.setSalesPriceList(pp.getPriceList());
				row.setC_UOMSales_ID(pp.getC_UOM_ID());
			}
			viewUpdatePrice.repaint();
		}		
	}

	private MOrder getOfferName(String trxname) {
		DescriptionDialog ddialog = new DescriptionDialog(this, getOrder(),
				trxname);
		if (ddialog.isOK())
			return ddialog.getOrder();
		return null;
	}

	private String SaveOffer(String trxname, String offername) {
		String error = "";
		MOrder order = getOfferName(trxname);
		if (order == null)
			return Msg.getMsg(Env.getAD_Language(Env.getCtx()), "ProcessCancelled");
		order.setIsSOTrx(false);
		order.setC_DocTypeTarget_ID();
		if (pickPartnerContact.getValue() != null)
			order.setC_Contact_ID((Integer) pickPartnerContact.getValue());
		order.setDocAction(DocAction.STATUS_Completed);
		order.setDocStatus(DocAction.STATUS_Drafted);
		if (order.save(trxname)) {
			//purgeorderlinesdeleted(trxname);
			ObjectViewModel adapter = viewPointOfPurchase.getDataModel();
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
					try {
						MOrderLine line = null;
						if (row.getC_OrderLine_ID() != 0 && order.getC_Order_ID() > 0)
							line = new Query(Env.getCtx(), X_C_OrderLine.Table_Name, "C_OrderLine_ID = ?", trxname)
						.setParameters(row.getC_OrderLine_ID()).first();
						if (line == null)
							line = new MOrderLine(order);
						line.setM_Warehouse_ID(row.getM_Warehouse_ID());
						line.setM_Product_ID(row.getM_Product_ID(), true);
						line.setPriceActual(row.getPriceActual());
						line.setPriceList(row.getPriceList());
						line.setPriceLimit(row.getPriceLimit());
						line.setPriceEntered(row.getPriceEntered());
						line.setQtyOrdered(row.getQtyOrdered());
						line.setQtyEntered(row.getQtyEntered());
						line.setM_AttributeSetInstance_ID(row
								.getM_AttributeSetInstance_ID());
						line.setC_Tax_ID(row.getC_Tax_ID());
						line.setC_UOM_ID(row.getC_UOM_ID());
						line.setLineNetAmt(row.getTotal());
						if (!line.save(trxname)) {
							viewPointOfPurchase.setRowSelectionInterval(j, j);
							if (((DefaultObjectViewModel) viewPointOfPurchase
									.getDataModel()).getPosition("Default") > 0) {
								int mDefault = ((DefaultObjectViewModel) viewPointOfPurchase
										.getDataModel()).getPosition("Default");
								viewPointOfPurchase.setColumnSelectionInterval(
										mDefault, mDefault);
							}
							break;
						}
					}
					catch (Exception e)
					{
						error = e.getMessage();												
					}
				}
			}
		}
		unlock();
		return error;
	}

	private void LoadOffer() {
		if (!isPriceListPointOfPurchaseDefined())
			return;
		Info m_info = new InfoOrder(
				getFrame(),
				true,
				getWindowNo(),
				"",
				false,
				String.format(
						"docstatus ='DR' AND isactive='Y' AND M_PriceList_ID=%s ",
						getOrder().getM_PriceList_ID()));
		if (!m_info.loadedOK()) {
			m_info.dispose();
		}
		m_info.setVisible(true);
		Integer C_Order_ID = (Integer) m_info.getSelectedKey();
		LoadOffer(C_Order_ID);
	}

	private void ImportOffer() {
		if (!isPriceListPointOfPurchaseDefined()) 
			return;
		ImportWizardLauncher nn = new ImportWizardLauncher();
		nn.launchWizard();		
	}

	private void LoadOffer(Integer C_Order_ID) {
		if (C_Order_ID != null) {
			Void(true);
			cleanlines();
			MySwingWorker wks = new MySwingWorker(C_Order_ID);
			wks.start();
		}
	}

	class MySwingWorker extends org.compiere.apps.SwingWorker {
		Integer C_Order_ID;

		public MySwingWorker(int Order_ID) {
			C_Order_ID = Order_ID;
		}

		public Object construct() {
			MOrder order = new Query(Env.getCtx(), X_C_Order.Table_Name, "C_Order_ID = ?", null).setParameters(C_Order_ID).first();
			if (order != null)
			{
				MBPartner partner = new MBPartner(Env.getCtx(), order.getBill_BPartner_ID(), null);
				MPriceList mpl = new MPriceList(Env.getCtx(), order.getM_PriceList_ID(), null);
				MPriceListVersion mplv = new Query(Env.getCtx(), X_M_PriceList_Version.Table_Name, "M_PriceList_ID  = ?", null)
				.setParameters(mpl.getM_PriceList_ID()).first();				
				String entrypoint = Env.getSessionEntrypoints(config.getAD_Rule_ID());
				updatePO(order, "order");
				executerules(entrypoint, "order");				
				updatePO(partner, "partner");
				executerules(entrypoint, "partner");
				updatePO(MUser.get(Env.getCtx(), Env.getAD_User_ID(Env.getCtx())), "user");
				executerules(entrypoint, "user");		
				if (mplv != null)
					updatePO(mplv, "pricelistversion");
				//
				//pickBuyPriceListVersion.setValue(mplv.getM_PriceList_Version_ID());
				setPriceList();
				//				if (getOrder().getM_PriceList_Version_ID() > 0) {
				//					pickBuyPriceListVersion.setValue(getOrder().getM_PriceList_Version_ID());
				//				} else if (getOrder().getM_PriceList_ID() > 0) {
				//					MPriceList pl = MPriceList.get(Env.getCtx(),
				//							getOrder().getM_PriceList_ID(), null);
				//					MPriceListVersion plv = pl.getPriceListVersion(null);
				//					if (plv != null)
				//						pickBuyPriceListVersion.setValue(plv.getM_PriceList_Version_ID());					
				//				} else {
				//					System.out.println("excepcion no contemplada");
				//				}
				MOrderLine[] lines = getOrder().getLines();
				for (MOrderLine line : lines) {
					MProduct product = MProduct.get(Env.getCtx(),line.getM_Product_ID(), null);
					AddLine();
					AddOrderLine(line);
					// AddProduct(true,
					// product,
					// line.getQtyEntered(),
					// line.getC_OrderLine_ID(),
					// line.getC_UOM_ID(),
					// line.getPriceActual(),
					// line.getM_AttributeSetInstance_ID(),
					// false);
				}
				if (lines.length == 0)
					AddLine();
				calculatePointOfPurchaseTotalLines();			
			}
			return Boolean.TRUE;
		}

	}


	public void AddOrderLine(MOrderLine ol) {
		ObjectViewModel adapter = viewPointOfPurchase.getDataModel();
		Vector v = new Vector();
		int nPos = viewPointOfPurchase.getSelectedRow();
		MProduct product = MProduct.get(Env.getCtx(), ol.getM_Product_ID(), ol.get_TrxName());

		for (int j = 0; j < viewPointOfPurchase.getRowCount(); j++) {
			Row row = (Row) adapter.getRowObject(j);
			if (row.getM_Product_ID() == product.getM_Product_ID()) {
				v.add(row.getM_AttributeSetInstance_ID());
			}
		}

		Row row = new Row();	
		row.setParent(this);
		row.setC_OrderLine_ID(ol.getC_OrderLine_ID());
		row.setC_BPartner_ID(getOrder().getC_BPartner_ID());
		row.setM_PriceList_ID(getOrder().getM_PriceList_ID());		
		//row.setM_PriceListVersion_ID(pricelistversion.getM_PriceList_Version_ID());
		row.setM_PriceListVersion_ID(buypricelist.getM_PriceList_Version_ID());
		row.setWindowNo(getWindowNo());
		row.setC_Currency_ID(getOrder().getC_Currency_ID());
		row.setM_Warehouse_ID(getOrder().getM_Warehouse_ID());
		row.setM_AttributeSetInstance_ID(ol.getM_AttributeSetInstance_ID());
		row.setDateOrdered(getOrder().getDateOrdered());
		row.setDatePromised(getOrder().getDatePromised());
		//row.setDateOrdered((Timestamp) pickDateOrder.getValue());
		//row.setDatePromised((Timestamp) pickDateOrder.getValue());
		row.addASIExceptions(v);
		row.setTaxIncluded(getOrder().isTaxIncluded());
		row.setC_Tax_ID(ol.getC_Tax_ID());
		row.product(product);
		// actualizacion de precio de venta
		//		MProductPricing pp = new MProductPricing(product.getM_Product_ID(),
		//				getOrder().getC_BPartner_ID(), null, false);
		//		pp.setM_PriceList_ID(salespricelist.getM_PriceList_ID());
		//		pp.setM_PriceList_Version_ID(salespricelistversion.getM_PriceList_Version_ID());
		//
		//		BigDecimal PriceList = MUOMConversion
		//				.convertProductFrom(Env.getCtx(), product.getM_Product_ID(),
		//						row.getC_UOM_ID(), pp.getPriceList());
		//
		//		row.setSalesPriceList(PriceList);
		//row.setSalesMargin();
		row.setQtyEntered(ol.getQtyEntered());
		row.setPriceEntered(ol.getPriceEntered());
		row.setC_UOM_ID(ol.getC_UOM_ID());
		row.setC_UOMBonus_ID(ol.getC_UOM_ID());
		if (row.getM_processMsg() != null) {
			if (m_showdialoginfo)
				ADialog.info(getWindowNo(), getFrame(), row.getM_processMsg());
		}
		{
			Object SelectedRow = viewPointOfPurchase.getSelectedRowObject();
			((DefaultObjectViewModel) viewPointOfPurchase.getDataModel()).updateRow(SelectedRow, row);
			//((DefaultObjectViewModel) viewOthers.getDataModel()).updateRow(SelectedRow, row);
			((DefaultObjectViewModel) viewUpdatePrice.getDataModel()).updateRow(SelectedRow, row);
			viewPointOfPurchase.setRowSelectionInterval(nPos, nPos);
			if (((DefaultObjectViewModel) viewPointOfPurchase.getDataModel())
					.getPosition("Default") > 0) {
				int mDefault = ((DefaultObjectViewModel) viewPointOfPurchase
						.getDataModel()).getPosition("Default");
				viewPointOfPurchase.setColumnSelectionInterval(mDefault,
						mDefault);
			}
		}
	}


	private void lock() {
		//		this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
		//		m_waiting = new Waiting(this, Msg.getMsg(Env.getCtx(), "Processing"),
		//				false, 0);
		//		new Thread() {
		//			public void run() {
		//				if (m_waiting != null) {
		//					m_waiting.toFront();
		//					m_waiting.setVisible(true);
		//				}
		//			}
		//		}.start();
	}

	private void unlock() {
		//		if (m_waiting != null)
		//			m_waiting.dispose();
		//		m_waiting = null;
		//		this.setCursor(Cursor.getDefaultCursor());
	} // unlock

	public synchronized void calculatePointOfPurchaseTotalLines() {
		PolicyRequest.getInstance().Total((MOrder) getPO(X_C_Order.Table_Name), viewPointOfPurchase, amounts);
		labelTotAmount.setText(getAmt(Constants.A_TOTALGROSS).toString());
		labelTaxAmount.setText(getAmt(Constants.A_TOTALTAX).toString());
		labelNetAmount.setText(getAmt(Constants.A_TOTALNET).toString());
		viewPointOfPurchase.revalidate();		
	}

	public ObjectView getView() {
		return viewPointOfPurchase;
	}

	protected JPanel createToolbarItemPanel(JComponent component) {
		final JPanel pagePanel = new JPanel(new GridBagLayout());
		pagePanel.add(component);
		pagePanel.setMaximumSize(pagePanel.getPreferredSize());
		return pagePanel;
	}

	public MOrder getOrder() {
		MOrder order = (MOrder) getPO(X_C_Order.Table_Name);
		return order;
	}
	public MUser getUser() {
		MUser user = (MUser) getPO(X_AD_User.Table_Name);
		return user;
	}

	protected void finalize() throws Throwable {
		// m_replication = null;
	}

	public void dispose() {
		super.dispose();
		String fileName = Env.getResource("org.xendra.pop", "popview.properties");
		saveSettings(fileName);					
	} // dispose

	private void showmessages(boolean b) {
		m_showdialoginfo = b;
	}

	private final Action saveAction = new AbstractAction() {
		private static final long serialVersionUID = 1L;

		public void actionPerformed(ActionEvent e) {
			try {
				String trxName = null;
				//if (pickDocType.getValue() == null
				if (	getOrder().getC_DocType_ID() == 0
						|| getOrder().getC_BPartner_ID() == 0
						|| getOrder().getC_BPartner_Location_ID() == 0) {
					ADialog.info(getWindowNo(), null, "faltan campos obligatorios");
					return;
				}
				String error = SaveOffer(trxName, "");
				if (error.length() > 0)
				{
					showErrorPanel(error);
				}
				else
				{
					Void();
					//resetOrder();
					cleanlines();
					newLinePointOfPurchase(null);
					if (m_showdialoginfo)
						ADialog.info(getWindowNo(), null, String.format("%s : %s",	Msg.translate(Env.getCtx(), "C_Order_ID"), getOrder().getDocumentNo()));

				}
			} catch (Exception e1) {
				if (m_showdialoginfo)
					ADialog.error(getWindowNo(), null, e1.getLocalizedMessage());

			} finally {
			}
		}
	};

	private final Action loadAction = new AbstractAction() {
		private static final long serialVersionUID = 1L;

		public void actionPerformed(ActionEvent e) {
			LoadOffer();
		}
	};

	private final Action voidAction = new AbstractAction() {
		private static final long serialVersionUID = 1L;

		public void actionPerformed(ActionEvent e) {
			if (ADialog.ask(getWindowNo(), getFrame(),
					Msg.getMsg(Env.getCtx(), "Anular ?"))) {
				if (canDeleteLineofPointOfPurchase()) {
					ObjectViewModel adapter = viewPointOfPurchase
							.getDataModel();
					for (int j = 0; j < adapter.getRowCount(); j++) {
						Row row = (Row) adapter.getRowObject(j);
						//if (row != null && row.getC_OrderLine_ID() != 0)
						//orderlinetoDel.add(row.getC_OrderLine_ID());
					}
					Void();
					//resetOrder();
					cleanlines();
					newLinePointOfPurchase(null);
				}

			}
		}
	};

	private final Action ImportDocAction = new AbstractAction() {
		private static final long serialVersionUID = 1L;

		public void actionPerformed(ActionEvent e) {
			if (!isPriceListPointOfPurchaseDefined())
				return;
			final JFileChooser fc = new JFileChooser();
			fc.setFileFilter(new FileFilter() {

				public String getDescription() {
					return "CSV File";
				}

				public boolean accept(File f) {
					return f.isDirectory()
							|| f.getName().toLowerCase().endsWith(".csv");
				}

			});

			if (fc.showOpenDialog(getFrame().getContentPane()) != JFileChooser.APPROVE_OPTION) {
				return;
			}
			File targetFile = fc.getSelectedFile();
			String filename = targetFile.getAbsolutePath();
			importcsv(filename);
		}
		//
	};

	private final Action ExportDocAction = new AbstractAction() {
		private static final long serialVersionUID = 1L;

		public void actionPerformed(ActionEvent e) {
			if (!isPriceListPointOfPurchaseDefined())
				return;
			final JFileChooser fc = new JFileChooser();
			fc.setFileFilter(new FileFilter() {

				public String getDescription() {
					return "CSV File";
				}

				public boolean accept(File f) {
					return f.isDirectory()
							|| f.getName().toLowerCase().endsWith(".csv");
				}

			});

			if (fc.showSaveDialog(getFrame().getContentPane()) != JFileChooser.APPROVE_OPTION) {
				return;
			}

			File targetFile = fc.getSelectedFile();
			if (!targetFile.getName().toLowerCase().endsWith(".csv")) {
				targetFile = new File(targetFile.getParentFile(),
						targetFile.getName() + ".csv");
			}
			if (targetFile.exists()) {
				if (JOptionPane.showConfirmDialog(getFrame().getContentPane(),
						"Desea sobreescribir el archivo?") != JOptionPane.YES_OPTION) {
					return;
				}
			}
			lock();
			exportcsv(targetFile.getAbsolutePath());
			unlock();
		}

	};
	private CComboBox pickDocType = new CComboBox();

	private void importcsv(String filename) {
		try {
			BufferedReader br = new BufferedReader(new FileReader(filename));
			StringTokenizer st = null;
			boolean lContinue = true;
			int linenumber = 0, tokennumber = 0;
			int iM_Product_ID = 0, iValue = 0, iM_PriceList_ID = 0, iQty = 0, iUOM = 0, iName = 0, iBrand = 0, iPrice = 0;
			int M_Product_ID = 0, UOM = 0, M_PriceList_ID = 0;
			BigDecimal Qty = Env.ZERO, Price = Env.ZERO;
			lock();
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
							//MPriceList mpl = MPriceList.get(Env.getCtx(),	M_PriceList_ID, null);
							//int PriceListVersion_ID = mpl.getPriceListVersion(
							//		getOrder().getDateOrdered())
							//		.getM_PriceList_Version_ID();
							// pickPriceListVersion.setValue();
							buypricelist.setM_PriceList_ID(M_PriceList_ID);
							int item = 0;
							//while (item < pickBuyPriceListVersion.getItemCount()) {
							//	KeyNamePair option = (KeyNamePair) pickBuyPriceListVersion.getItemAt(item);
							//	if (PriceListVersion_ID == option.getKey()) {
							//		lContinue = true;
							//		getOrder().setM_PriceList_ID(M_PriceList_ID);
							//		UpdatePrice(getOrder().getM_PriceList_ID());
							//		break;
							//	}
							//	item++;
							//}
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
			unlock();
			if (!lContinue)
				ADialog.info(getWindowNo(), getFrame(),
						"PriceListVersion no coincide");
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}

	private void exportcsv(String filepath) {
		try {
			File file = new File(filepath);
			if (!file.exists())
				file.createNewFile();
			FileWriter writer = new FileWriter(filepath);
			if (viewPointOfPurchase != null) {
				ObjectViewModel adapter = viewPointOfPurchase.getDataModel();
				for (int j = 0; j < viewPointOfPurchase.getRowCount(); j++) {
					Row row = (Row) adapter.getRowObject(j);
					if (j == 0) {
						writer.append("M_Product_ID");
						writer.append(',');
						writer.append("Value");
						writer.append(',');
						writer.append("M_PriceList_ID");
						writer.append(',');
						writer.append("Qty");
						writer.append(',');
						writer.append("UOM");
						writer.append(',');
						writer.append("Name");
						writer.append(',');
						writer.append("Brand");
						writer.append(',');
						writer.append("Price");
						writer.append('\n');
					}
					if (row != null && row.getM_Product_ID() > 0) {
						writer.append(row.getM_Product_ID().toString());
						writer.append(',');
						writer.append(row.getValue());
						writer.append(',');
						writer.append(row.getM_PriceList_ID().toString());
						writer.append(',');
						writer.append(row.getQtyEntered().toString());
						writer.append(',');
						writer.append(row.getC_UOM_ID().toString());
						writer.append(',');
						writer.append(row.getName());
						writer.append(',');
						writer.append(row.getProductBrand());
						writer.append(',');
						writer.append(row.getPriceList().toString());
						writer.append('\n');
					}
				}
			}
			writer.flush();
			writer.close();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}

	public void resetOrder() {
		InitializePO();
		Integer M_PriceList_ID = 0;
		if (M_PriceList_ID == null)
			M_PriceList_ID = 0;
		if (M_PriceList_ID == 0 || getUser().isFullPriceListAccess())
		{
			labelPriceListVersion.setVisible(false);
			setPriceList();
		} else {
			UpdatePrice(M_PriceList_ID);
		}
		if (C_DocTypeTargetID != 0)
			getOrder().setC_DocTypeTarget_ID(C_DocTypeTargetID);

		// creacion de lista de precios
		if (config.getM_PriceSalesList_ID() == 0) {
			ADialog.error(
					getWindowNo(),
					this,
					"la Lista de Venta principal  no esta configurada \n es necesario configurar la Lista de Venta principal para la comparativa de precios y margenes");
		} else {			
			salespricelist.setM_PriceList_ID(config.getM_PriceSalesList_ID());
		}
		if (viewPointOfPurchase != null
				&& viewPointOfPurchase.getRowCount() == 0) {
			AddLine();
		}
		updatestatusBar();
	}
	private void updatestatusBar() {
		String msg = "";
		statusBar.setStatusLine(msg, false);
	}
	public void tableViewChanged(ObjectViewModelEvent pEvent) {
	}
	@Override
	public void vetoableChange(PropertyChangeEvent e)
			throws PropertyVetoException {

		String name = e.getPropertyName();
		Object value = e.getNewValue();
		log.config(name + "=" + value);
		if (value == null)
			return;

		if (name.equals("C_OrderDate")) {
			getOrder().setDateOrdered((Timestamp) value);
			Timestamp tvalue = (Timestamp) value;
			Env.setContext(Env.getCtx(), getWindowNo(), X_C_Order.COLUMNNAME_DateOrdered, tvalue);
		}
		if (name.equals("C_AcctDate")) {
			getOrder().setDateAcct((Timestamp) value);
		}
		if (name.equals("C_Tax_ID")) {
			ObjectViewModel adapter = viewPointOfPurchase.getDataModel();
			for (int j = 0; j < viewPointOfPurchase.getRowCount(); j++) {
				Row row = (Row) adapter.getRowObject(j);
				row.setC_Tax_ID((Integer) value);
				calculatePointOfPurchaseTotalLines();
			}
		}
		if (name.equals(X_C_Order.COLUMNNAME_C_DocType_ID))
		{
			getOrder().setC_DocType_ID((Integer) value); 
		}
		if (name.equals(X_C_Order.COLUMNNAME_C_BPartner_ID)) {
			MBPartner partner = new Query(Env.getCtx(), MBPartner.Table_Name, "C_BPartner_ID = ?", null).setParameters(value).first();
			execute(partner);
		}
		if (name.equals(X_C_Order.COLUMNNAME_C_Contact_ID)) {
			if (this.pickPartnerContact.getValue() != null) {
				getOrder().setC_Contact_ID(
						(Integer) this.pickPartnerContact.getValue());
			}
		}
	}

	public void refreshPartner(Object value) {
		if (value != null)
		{
			Env.setContext(Env.getCtx(), getWindowNo(), X_C_Order.COLUMNNAME_C_BPartner_ID,	value.toString());
			bPartner(value);
		}
	}		

	/**
	 * Order Header - BPartner. - M_PriceList_ID (+ Context) -
	 * C_BPartner_Location_ID - Bill_BPartner_ID/Bill_Location_ID - AD_User_ID -
	 * POReference - SO_Description - IsDiscountPrinted -
	 * InvoiceRule/DeliveryRule/PaymentRule/FreightCost/DeliveryViaRule -
	 * C_PaymentTerm_ID
	 * 
	 * @param ctx
	 *            Context
	 * @param WindowNo
	 *            current Window No
	 * @param mTab
	 *            Model Tab
	 * @param mField
	 *            Model Field
	 * @param value
	 *            The new value
	 * @return Error message or ""
	 */
	// public String bPartner (MOrder order, Object value)
	public String bPartner(Object value) {
		Integer C_BPartner_ID = (Integer) value;
		if (C_BPartner_ID == null || C_BPartner_ID.intValue() == 0)
			return "";

		getOrder().setC_BPartner_ID(C_BPartner_ID);

		String sql = "SELECT p.AD_Language,p.C_PaymentTerm_ID,"
				+ " COALESCE(p.M_PriceList_ID,g.M_PriceList_ID) AS M_PriceList_ID, p.PaymentRule,p.POReference,"
				+ " p.SO_Description,p.IsDiscountPrinted,"
				+ " p.InvoiceRule,p.DeliveryRule,p.FreightCostRule,DeliveryViaRule,"
				+ " p.SO_CreditLimit, (p.SO_CreditLimit+p.SO_CreditOverLimit)-p.SO_CreditUsed AS CreditAvailable,"
				+ " lship.C_BPartner_Location_ID,c.AD_User_ID,"
				+ " COALESCE(p.PO_PriceList_ID,g.PO_PriceList_ID) AS PO_PriceList_ID, p.PaymentRulePO,p.PO_PaymentTerm_ID,"
				+ " lbill.C_BPartner_Location_ID AS Bill_Location_ID, p.SOCreditStatus, "
				+ " p.SalesRep_ID "
				+ "FROM C_BPartner p"
				+ " INNER JOIN C_BP_Group g ON (p.C_BP_Group_ID=g.C_BP_Group_ID)"
				+ " LEFT OUTER JOIN C_BPartner_Location lbill ON (p.C_BPartner_ID=lbill.C_BPartner_ID AND lbill.IsBillTo='Y' AND lbill.IsActive='Y')"
				+ " LEFT OUTER JOIN C_BPartner_Location lship ON (p.C_BPartner_ID=lship.C_BPartner_ID AND lship.IsShipTo='Y' AND lship.IsActive='Y')"
				+ " LEFT OUTER JOIN AD_User c ON (p.C_BPartner_ID=c.C_BPartner_ID) "
				+ "WHERE p.C_BPartner_ID=? AND p.IsActive='Y'"; // #1

		boolean IsSOTrx = false; // "Y".equals(Env.getContext(ctx, WindowNo,
		// "IsSOTrx"));

		try {
			PreparedStatement pstmt = DB.prepareStatement(sql, null);
			pstmt.setInt(1, C_BPartner_ID.intValue());
			ResultSet rs = pstmt.executeQuery();
			if (rs.next()) {
				// Sales Rep - If BP has a default SalesRep then default it
				Integer salesRep = rs.getInt("SalesRep_ID");
				if (IsSOTrx && salesRep != 0) {
					getOrder().setSalesRep_ID(salesRep);
				}

				// Bill-To
				getOrder().setBill_BPartner_ID(C_BPartner_ID);
				int bill_Location_ID = rs.getInt("Bill_Location_ID");
				if (bill_Location_ID == 0)
					getOrder().setBill_Location_ID(0);
				else
					getOrder().setBill_Location_ID(new Integer(bill_Location_ID));
				// Ship-To Location
				int shipTo_ID = rs.getInt("C_BPartner_Location_ID");
				// overwritten by InfoBP selection - works only if InfoWindow
				// was used otherwise creates error (uses last value, may belong
				// to differnt BP)
				if (C_BPartner_ID.toString().equals(
						Env.getContext(Env.getCtx(), Env.WINDOW_INFO,Env.TAB_INFO, "C_BPartner_ID"))) {
					String loc = Env.getContext(Env.getCtx(), Env.WINDOW_INFO,Env.TAB_INFO, "C_BPartner_Location_ID");
					if (loc.length() > 0)
						shipTo_ID = Integer.parseInt(loc);
				}
				if (getOrder().getC_BPartner_Location_ID() == 0) {
					if (shipTo_ID > 0)
						// getOrder().setC_BPartner_Location_ID(0);
						// else
						getOrder().setC_BPartner_Location_ID(new Integer(shipTo_ID));
				}
				// Contact - overwritten by InfoBP selection
				int contID = rs.getInt("AD_User_ID");
				if (C_BPartner_ID.toString().equals(Env.getContext(Env.getCtx(), Env.WINDOW_INFO, Env.TAB_INFO, "C_BPartner_ID"))) {
					String cont = Env.getContext(Env.getCtx(), Env.WINDOW_INFO,	Env.TAB_INFO, "AD_User_ID");
					if (cont.length() > 0)
						contID = Integer.parseInt(cont);
				}
				if (contID == 0)
					getOrder().setAD_User_ID(0);
				else {
					getOrder().setAD_User_ID(new Integer(contID));
					getOrder().setBill_User_ID(new Integer(contID));
				}

				// PO Reference
				String s = rs.getString("POReference");
				if (s != null && s.length() != 0)
					// mTab.setValue("POReference", s);
					getOrder().setPOReference(s);
				// should not be reset to null if we entered already value!
				// VHARCQ, accepted YS makes sense that way
				// TODO: should get checked and removed if no longer needed!
				/*
				 * else mTab.setValue("POReference", null);
				 */

				// SO Description
				s = rs.getString("SO_Description");
				if (s != null && s.trim().length() != 0)
					getOrder().setDescription(s);
				// IsDiscountPrinted
				s = rs.getString("IsDiscountPrinted");
				if (s != null && s.length() != 0)
					getOrder().setIsDiscountPrinted(new Boolean(s.equals("Y")));
				else
					getOrder().setIsDiscountPrinted(false);

				// Defaults, if not Walkin Receipt or Walkin Invoice
				String OrderType = Env.getContext(Env.getCtx(), getWindowNo(),"OrderType");
				getOrder().setInvoiceRule(REF_C_OrderInvoiceRule.AfterDelivery);
				getOrder().setDeliveryRule(REF_C_OrderDeliveryRule.Availability);
				getOrder().setPaymentRule(REF__PaymentRule.OnCredit);
				if (OrderType.equals(REF_C_DocTypeSubType.PrepayOrder)) {
					getOrder().setInvoiceRule(REF_C_OrderInvoiceRule.Immediate);
					getOrder().setDeliveryRule(REF_C_OrderDeliveryRule.AfterReceipt);
				} else if (OrderType.equals(REF_C_DocTypeSubType.POSOrder)) // for POS
					getOrder().setPaymentRule(REF__PaymentRule.Cash);
				else {
					// PaymentRule
					s = rs.getString(IsSOTrx ? "PaymentRule" : "PaymentRulePO");
					if (s != null && s.length() != 0) {
						if (s.equals(REF__PaymentRule.Cash)) // No Cache in
							// Non POS
							s = "P";
						if (IsSOTrx
								&& (s.equals(REF__PaymentRule.Check) || s
										.equals("U"))) // No Check/Transfer for
							// SO_Trx
							s = "P"; // Payment Term
						// mTab.setValue("PaymentRule", s);
						getOrder().setPaymentRule(s);
					}
					// Payment Term
					Integer ii = new Integer(rs.getInt(IsSOTrx ? "C_PaymentTerm_ID" : "PO_PaymentTerm_ID"));
					if (!rs.wasNull() && ii > 0)
						getOrder().setC_PaymentTerm_ID(ii);
					// InvoiceRule
					s = rs.getString("InvoiceRule");
					if (s != null && s.length() != 0)
						getOrder().setInvoiceRule(s);
					// DeliveryRule
					s = rs.getString("DeliveryRule");
					if (s != null && s.length() != 0)
						getOrder().setDeliveryRule(s);
					// FreightCostRule
					s = rs.getString("FreightCostRule");
					if (s != null && s.length() != 0)
						getOrder().setFreightCostRule(s);
					// DeliveryViaRule
					s = rs.getString("DeliveryViaRule");
					if (s != null && s.length() != 0)
						getOrder().setDeliveryViaRule(s);
				}
			}
			rs.close();
			pstmt.close();
		} catch (SQLException e) {
			log.log(Level.SEVERE, sql, e);
			return e.getLocalizedMessage();
		}
		return "";
	} // bPartner	

	public void calculateUpdatePriceTotal() {

	}

	public void nextColumnUpdatePrice() {

	}

	public String ChangePriceValid() {
		String productsinvalid = "";
		ObjectViewModel adapter = viewPointOfPurchase.getDataModel();
		for (int j = 0; j < viewPointOfPurchase.getRowCount(); j++) {
			Row row = (Row) adapter.getRowObject(j);
			if (row.getM_Product_ID() > 0
					&& row.getMargin().compareTo(Env.ZERO) <= 0
					&& row.getQtyEntered().compareTo(Env.ZERO) > 0) {
				productsinvalid = productsinvalid.concat(row.getName().concat("\n"));
			}
		}
		if (productsinvalid.length() > 0)
			productsinvalid = productsinvalid
			.concat(" su margen de venta es menor o igual a 0, se recomienda no proceder con la actualizacion de precios , Desea continuar ?");
		return productsinvalid;
	}

	//	public Boolean IsChangePrice() {
	//		return m_ChangePrice;
	//	}
	//
	//	public void setIsChangePrice(boolean ask) {
	//		m_ChangePrice = ask;
	//	}

	@Override
	public void sendAcknowledged(Message message) {
		try {
			synchronized (this) {
				String id = message.getStringProperty("id");
				Iterator<String[]> iter = m_SendWithoutACK.iterator();
				while (iter.hasNext()) {
					String[] msg = iter.next();
					if (msg[0].equals(id))
						iter.remove();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public boolean candispose() {
		return true;
	}

	private String beforetransaction() {
		error = TestQueue();
		return error;
	}

	public void AddProductEvent(RowBase row) {

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
	public void enableEnvironment() {
		resizetobuttonpanel();
		getView().setEnabled(true);
		getView().requestFocusInWindow();
	}

	public void disableEnvironment() {
		resizetocardpanel();
		getView().setEnabled(false);
	}

	public void setStatusLine(String msg, boolean error) {
		statusBar.setStatusLine(msg, error);			
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
			ObjectViewModel adapter = viewPointOfPurchase.getDataModel();
			for (int j = 0; j < viewPointOfPurchase.getRowCount(); j++) {
				Row row = (Row) adapter.getRowObject(j);
				row.setC_BPartner_ID(partner.getC_BPartner_ID());
			}
			//BPartnerInfo.setText(partner.getName());
		}
		else if (observable instanceof MUser)
		{
			System.out.println("X");
		}
	}		
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
	}

	public void calculateFreight(BigDecimal freight) {
		if (TotalNet.compareTo(Env.ZERO) == 0)
			return;		
		if (freight == null)
			freight = Env.ZERO;
		ObjectViewModel adapter = viewPointOfPurchase.getDataModel();
		for (int j = 0; j < viewPointOfPurchase.getRowCount(); j++) {
			Row row = (Row) adapter.getRowObject(j);
			BigDecimal FreightPercent = Env.ZERO;
			if (row.getM_Product_ID() > 0
					&& row.getTotal().compareTo(Env.ZERO) != 0) {
				if (freight.compareTo(Env.ZERO) == 0
						&& row.getFreight().compareTo(Env.ZERO) != 0)
					row.setFreight(Env.ZERO);
				else if (freight.compareTo(Env.ZERO) != 0) {
					FreightPercent = new BigDecimal(row.getTotal().floatValue()
							/ TotalNet.floatValue());
					FreightPercent = FreightPercent.multiply(freight);
					BigDecimal Qty = row.getQtyBonus().add(row.getQtyEntered());
					if (Qty.compareTo(Env.ZERO) > 0) {
						FreightPercent = FreightPercent.divide(Qty,
								Env.divideprecision, BigDecimal.ROUND_HALF_UP);
					}
					row.setFreight(FreightPercent);
				}
			}
		}		
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
		ObjectViewAdapter adapter = (ObjectViewAdapter) viewPointOfPurchase.getModel();
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
						TableColumn tableColumn = viewPointOfPurchase.getColumnModel()
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
		if (viewPointOfPurchase == null)
			return;
		File file = new File(pFileName);
		if (file.exists())
		{
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			try {
				DocumentBuilder builder = factory.newDocumentBuilder();
				Document doc = builder.parse(file.getAbsolutePath());
				NodeList bodylist = doc.getElementsByTagName("body");
				if (bodylist.getLength() > 0) {
					Element body = (Element) bodylist.item(0);
					String reset = body.getAttribute("reset");
					if (reset.equals("yes"))
					{
						file.delete();
						return;
					}					
				}
			}
			catch (Exception e)
			{
				e.printStackTrace();
			}
		}		
		ObjectViewAdapter adapter = (ObjectViewAdapter) viewPointOfPurchase.getModel();
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
				for (int j = 0; j < viewPointOfPurchase.getColumnCount(); j++) {
					TableColumn tableColumn = viewPointOfPurchase.getColumnModel()
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
			Source source = new DOMSource(pDocument);
			File file = new File(pFilename);
			Result result = new StreamResult(file);
			Transformer xformer = TransformerFactory.newInstance()
					.newTransformer();
			xformer.setOutputProperty(OutputKeys.INDENT, "yes"); // add newlines
			xformer.transform(source, result);
		} catch (TransformerException e) {
			e.printStackTrace(); 
		}
	}

	public void initializedoctype() {
		MLookup lookupDocType;
		int AD_Column_ID = 0;		
		MLookupInfo lookupInfo = MLookupFactory.getLookupInfo (Env.getCtx(), m_WindowNo, AD_Column_ID, DisplayType.Table,
				Env.getLanguage(Env.getCtx()), "C_DocTypeTarget_ID", 170,
				false, "C_DocType.C_DocType_ID IN (SELECT C_DocType_ID FROM C_POPDocType WHERE C_POP_ID = "+getConfig().getC_POP_ID()+")");
		lookupDocType = new MLookup (lookupInfo, 0);
		Object[] values = lookupDocType.getData(false, false, true, false).toArray();
		for (Object kp:values) {
			pickDocType.addItem(kp);
		}
	}

	public CComboBox getpickDocType() {
		return pickDocType;
	}	
}