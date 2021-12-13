/******************************************************************************
 * Product: Xendra ERP & CRM Smart Business Solution                          *
 * Copyright (C) 2009 Dravio SAC. All Rights Reserved.                		  *
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

package org.xendra.apps.form;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyVetoException;
import java.beans.VetoableChangeListener;
import java.math.BigDecimal;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Enumeration;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import org.compiere.apps.form.FormFrame;
import org.compiere.apps.form.FormPanel;
import org.compiere.apps.ADialog;
import org.compiere.apps.ALayout;
import org.compiere.apps.ALayoutConstraint;
import org.compiere.apps.StatusBar;
import org.compiere.apps.Waiting;
import org.compiere.grid.ed.VComboBox;
import org.compiere.grid.ed.VLookup;
import org.compiere.grid.ed.VNumber;
import org.compiere.minigrid.MiniTable;
import org.compiere.model.MCurrency;
import org.compiere.model.MDocType;
import org.compiere.model.MInvoice;
import org.compiere.model.MInvoiceLine;
import org.compiere.model.MLookup;
import org.compiere.model.MLookupFactory;
import org.compiere.model.MOrderLine;
import org.compiere.model.MPriceList;
import org.compiere.model.MPriceListVersion;
import org.compiere.model.MProduct;
import org.compiere.model.MProductCategory;
import org.compiere.model.MProductPrice;
import org.compiere.model.MRole;
import org.compiere.model.MUOM;
import org.compiere.model.MUOMConversion;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_AD_Table;
import org.compiere.model.persistence.X_A_Xendrian_Replication;
import org.compiere.model.persistence.X_M_Product_Brand;
import org.compiere.plaf.CompiereColor;
import org.compiere.swing.CButton;
import org.compiere.swing.CFrame;
import org.compiere.swing.CPanel;
import org.compiere.swing.CTabbedPane;
import org.compiere.swing.CTextField;
import org.compiere.util.CLogger;
import org.compiere.util.DB;
import org.compiere.util.DisplayType;
import org.compiere.util.Env;
import org.compiere.util.KeyNamePair;
import org.compiere.util.Msg;
import org.compiere.util.Util;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.xendra.Constants;
import org.xendra.swing.LED;

/**
 *	Calculate price selling
 *
 * 	@author 	xapiens
 * 	@version 	$Id: 
 */
public class VCalculateWizardAdquisition extends CFrame implements 	FormPanel, 
																	VetoableChangeListener, 
																	ActionListener, 
																	TableModelListener, 
																	ChangeListener
{
	public VCalculateWizardAdquisition() {
		Initialize();
	}

	private CPanel Initialize() {
		int AD_Column_ID = Util.getColumnID(MInvoice.Table_ID,"C_Invoice_ID");
		MLookup lookupInvoice = MLookupFactory.get (Env.getCtx(), m_WindowNo, 0, AD_Column_ID, DisplayType.Search);		
		
		pickInvoice = new VLookup("C_Invoice_ID", true, false, true, lookupInvoice);
		pickInvoice.addVetoableChangeListener(this);

		AD_Column_ID = Util.getColumnID(MProduct.Table_ID,"M_Product_Brand_ID");
		MLookup lookupBrand = MLookupFactory.get (Env.getCtx(), m_WindowNo, 0, AD_Column_ID, DisplayType.Search);
		
		pickBrand = new VLookup("M_Product_Brand_ID", true, false,true, lookupBrand);
		pickBrand.addVetoableChangeListener(this);
		
		addInvoice.setText(Msg.translate(Env.getCtx(), "Add"));
		addInvoice.addActionListener(this);

		addPriceList.setText(Msg.translate(Env.getCtx(), "Add"));
		addPriceList.addActionListener(this);
				
		statusBar.setStatusLine(Msg.getMsg(Env.getCtx(), "CalculateWizardAdquisition"));
		statusBar.setStatusDB("");
		
		//
		CompiereColor.setBackground(this);
		setInvoice(true);
		setProduct(true);
		setHistoryProduct(true);
		setPriceList(true);
		setProductListPrice(true);
		fillPicks(0, pickexportPriceList);
		pickexportPriceList.addActionListener(this);
		fillPicks(0, this.pickPriceList);

		mainPanel = new CPanel();
		mainPanel.setLayout(new BorderLayout());
		
		infoPanel.setOrientation(JSplitPane.VERTICAL_SPLIT);
		infoPanel.setBorder(BorderFactory.createEtchedBorder());
		infoPanel.add(tabbedPane, JSplitPane.TOP);
		infoPanel.add(exportpriceList, JSplitPane.BOTTOM);
		infoPanel.setContinuousLayout(true);
		infoPanel.setPreferredSize(new Dimension(800,300));
		infoPanel.setDividerLocation(130);
		
		mainPanel.add(infoPanel, BorderLayout.CENTER);
		
		invoicePanel.setLayout(new BorderLayout());
		
		CPanel productPanel = new CPanel();
		productPanel.setLayout(new BorderLayout());
		productPanel.add(parameterInvoicePanel, BorderLayout.NORTH);
		
		CPanel productPanel3Level = new CPanel();
		productPanel3Level.setLayout(new ALayout());
		productPanel3Level.add(new JLabel(Msg.translate(Env.getCtx(),"MarginProfit")), new ALayoutConstraint(0,0));
		productPanel3Level.add(marginProfit, null);
		productPanel3Level.add(new JLabel(Msg.translate(Env.getCtx(),"MarginLimit")), null);
		productPanel3Level.add(marginLimit, null);
		productPanel3Level.add(fillMargen, null);
		productPanel3Level.add(consolidate, null);
		productPanel3Level.add(new JLabel(Msg.translate(Env.getCtx(),"Freight")), new ALayoutConstraint(1,0));
		productPanel3Level.add(freight, null);
		
		JSplitPane productPanel2Level = new JSplitPane();
		productPanel2Level.setOrientation(JSplitPane.VERTICAL_SPLIT);
		productPanel2Level.add(productPanel3Level, JSplitPane.TOP);
		productPanel2Level.add(productInfoPanel, JSplitPane.BOTTOM);
		productPanel2Level.setContinuousLayout(true);
		productPanel2Level.setDividerLocation(60);
		
		JSplitPane productPanel1Level = new JSplitPane();
		productPanel1Level.setOrientation(JSplitPane.VERTICAL_SPLIT);
		productPanel1Level.setBorder(BorderFactory.createEtchedBorder());
		productPanel1Level.add(invoiceScrollPane, JSplitPane.TOP);
		productPanel1Level.add(productPanel2Level, JSplitPane.BOTTOM);
		productPanel1Level.setContinuousLayout(true);
		productPanel1Level.setDividerLocation(50);

		productPanel.add(productPanel1Level, BorderLayout.CENTER);

		
		invoicePanel.add(productPanel, BorderLayout.NORTH);

		tabbedPane.add(invoicePanel,   Msg.translate(Env.getCtx(), "C_Invoice_ID"));
		tabbedPane.add(priceListPanel, Msg.translate(Env.getCtx(), "PriceList"));
		tabbedPane.addChangeListener(this);				
		
		// Invoice Part
		
		parameterInvoicePanel.setLayout(new ALayout());
		parameterInvoicePanel.add(new JLabel("Seleccione Factura"), new ALayoutConstraint(0,0));
		parameterInvoicePanel.add(pickInvoice, null);
		parameterInvoicePanel.add(addInvoice, null);
		invoiceScrollPane.setViewportView(invoiceTable);

		// List Price Part
		
		parameterPriceListPanel.setLayout(new ALayout());
		parameterPriceListPanel.add(new JLabel("Seleccione Lista de precio"), new ALayoutConstraint(0,0));
		parameterPriceListPanel.add(pickPriceList, null);
		parameterPriceListPanel.add(pickBrand, null);
		parameterPriceListPanel.add(new JLabel(Msg.translate(Env.getCtx(), "Name")));
		parameterPriceListPanel.add(searchName , null);
		parameterPriceListPanel.add(addPriceList, null);
		parameterPriceListPanel.add(new JLabel(Msg.translate(Env.getCtx(), "Margin")), new ALayoutConstraint(1,0));
		parameterPriceListPanel.add(marginPriceListProfit, null);
		parameterPriceListPanel.add(new JLabel(Msg.translate(Env.getCtx(), "PriceLimit")), null);
		parameterPriceListPanel.add(marginPriceLimit, null);		
		marginPriceListProfit.addActionListener(this);
		marginPriceLimit.addActionListener(this);
		HistoryproductScrollpane.setViewportView(HistoryproductTable);
	
		JScrollPane plpt = new JScrollPane();
		plpt.setViewportView(productListPriceTable);
		priceListPanel.setLayout(new BorderLayout());
		priceListPanel.add(parameterPriceListPanel, BorderLayout.NORTH);
		priceListPanel.add(plpt, BorderLayout.CENTER);
		fillMargen.setText("colocar margenes");
		fillMargen.setIcon(Env.getImageIcon("Process16.gif"));       //  16*1
		fillMargen.addActionListener(this);
		
		consolidate.setText("Consolidar precio");
		consolidate.setIcon(Env.getImageIcon("Process16.gif"));       //  16*1
		consolidate.addActionListener(this);
		
		export.setText("Exportar Lista de precio");
		export.setIcon(Env.getImageIcon("Process16.gif"));       //  16*1
		export.addActionListener(this);

		exportpriceList.setLayout(new ALayout());
		exportpriceList.add(new JLabel(Msg.translate(Env.getCtx(),"PriceList")), new ALayoutConstraint(0,0));
		exportpriceList.add(pickexportPriceList, null);
		exportpriceList.add(new JLabel(Msg.translate(Env.getCtx(),"Consolidate")), null);
		exportpriceList.add(export, null);

		//exportpriceList
		DefaultCategoryDataset dataset = createDataset();
		String chartTitle = "Historico";
		JFreeChart chart = createBar(dataset, chartTitle);
		ChartPanel chartPanel = new ChartPanel(chart);
		AllPriceListpane.setViewportView(AllPriceListTable);
		tabbedProductPane.add(AllPriceListpane, Msg.translate(Env.getCtx(), "M_PriceList_ID"));
		tabbedProductPane.add(HistoryproductScrollpane,   Msg.translate(Env.getCtx(), "C_Invoice_ID"));
		tabbedProductPane.add(chartPanel, Msg.translate(Env.getCtx(), "PriceList"));
		tabbedProductPane.addChangeListener(this);				
		
		productInfoPanel.setOrientation(JSplitPane.VERTICAL_SPLIT);
		productInfoPanel.setBorder(BorderFactory.createEtchedBorder());
		productInfoPanel.add(productScrollPane, JSplitPane.TOP);
		productInfoPanel.add(tabbedProductPane, JSplitPane.BOTTOM);
		productInfoPanel.setContinuousLayout(true);

		productInfoPanel.setDividerLocation(130);
		productScrollPane.setViewportView(productTable);
		//		
		return mainPanel;
	}

	private int m_WindowNo;
	private FormFrame m_Frame;
	private CTabbedPane tabbedPane = new CTabbedPane();
	private CTabbedPane tabbedProductPane = new CTabbedPane();
	private CPanel mainPanel = null;
	private CPanel priceListPanel = new CPanel();
	private StatusBar statusBar = new StatusBar();
	private CPanel parameterInvoicePanel = new CPanel();
	private CPanel parameterPriceListPanel = new CPanel();
	private VLookup pickInvoice;
	private VComboBox pickPriceList = new VComboBox();
	private VLookup pickBrand;
	private VNumber marginProfit = new VNumber();
	private VNumber marginPriceListProfit = new VNumber();
	private VNumber marginPriceLimit = new VNumber();
	private VNumber marginLimit = new VNumber();
	private VNumber freight = new VNumber();
	private VComboBox pickexportPriceList = new VComboBox();
	private CButton addInvoice = new CButton();
	private CButton addPriceList = new CButton();
	private JButton fillMargen = new JButton();
	private MiniTable invoiceTable = new MiniTable();
	private MiniTable productTable = new MiniTable();
	private MiniTable productListPriceTable = new MiniTable();
	private MiniTable HistoryproductTable = new  MiniTable();
	private MiniTable AllPriceListTable = new MiniTable(); 
	private CPanel exportpriceList = new CPanel();
	private JScrollPane invoiceScrollPane = new JScrollPane();
	private JScrollPane HistoryproductScrollpane = new JScrollPane();
	private JScrollPane AllPriceListpane = new JScrollPane();
	private CPanel invoicePanel = new CPanel();
	private JScrollPane productScrollPane = new JScrollPane();
	private JSplitPane infoPanel = new JSplitPane();
	private JSplitPane productInfoPanel = new JSplitPane();
	private boolean callout = false;	
	private JButton consolidate = new JButton();
	private JButton export = new JButton();
	private int m_scale = 3;
	private CTextField searchName = new CTextField(15);
	private static CLogger log = CLogger.getCLogger(VBoeGen.class);
	private Waiting m_waiting;
	
	private static final int	SELECTION = 0;
	private static final int	BONUS = 1;
	private static final int	SERIAL = 2;
	private static final int	DOCUMENTNO = 3;	
	private static final int	VALUE = 4;
	private static final int	NAME = 5;
	private static final int    PBRAND = 6;
	private static final int    PUOM = 7;
	private static final int	PRICEENTERED = 8;
	private static final int    PRICEBYCONTAINER = 9;
	private static final int	QTYENTERED = 10;
	private static final int    PUOMUNIT = 11;
	private static final int    PRICECONVERTED = 12;
	private static final int	CALCULATE1 = 13;
	private static final int	ADJUST = 14;
	private static final int    FREIGHT = 15;
	private static final int	CALCULATE2 = 16;
	private static final int	MARGIN = 17;
	private static final int	NEWPRICE = 18;
	private static final int	NEWPRICEBYCONTAINER = 19;
	private static final int    PRICEPREVIOUS= 20; 
	private static final int	MARGINPL = 21;
	private static final int    PRICELIMIT = 22;

	private static final int PLSELECTION = 0;
	private static final int PLNAME = 1;
	private static final int PLPBRAND = 2;
	private static final int PLADJUST = 3;	
	private static final int PLCALCULATE = 4;
	private static final int PLMARGIN = 5;
	private static final int PLNEWPRICE = 6;
	private static final int PLPRICELIST = 7;
	private static final int PLPRICESTD = 8;
	private static final int PLMARGINPL = 9;
	private static final int PLPRICELIMIT = 10;
	LED ldFf;
	LED led;
	

	public void init(int WindowNo, FormFrame frame) {
		m_WindowNo = WindowNo;
		m_Frame = frame;		
		try
		{
			//dynInit()
			//jbInit();
			frame.getContentPane().add(mainPanel, BorderLayout.CENTER);
			frame.getContentPane().add(statusBar, BorderLayout.SOUTH);						
		}
		catch(Exception e)
		{
			log.log(Level.SEVERE, "", e);
		}
		
	}

	
    private  DefaultCategoryDataset createDataset() {
    	  DefaultCategoryDataset dataset = new DefaultCategoryDataset();
    	  dataset.setValue(6, "Science", "Rahul");
    	  dataset.setValue(8, "Maths", "Rahul");
    	  dataset.setValue(5, "Science", "Deepak");
    	  dataset.setValue(3, "Maths", "Deepak");
    	  dataset.setValue(6, "Science", "Vinod");
    	  dataset.setValue(9, "Maths", "Vinod");
    	  dataset.setValue(2, "Science", "Chandan");
    	  dataset.setValue(4, "Maths", "Chandan");
    	  return dataset;
        
    }
	
    /**
     * Creates a chart
     */
    private JFreeChart createBar(DefaultCategoryDataset dataset, String title) {
        
        JFreeChart chart = ChartFactory.createBarChart3D(title, "X","Y", dataset, PlotOrientation.VERTICAL, true, true, false);

        chart.setBackgroundPaint(Color.yellow);
        chart.getTitle().setPaint(Color.blue); 
        CategoryPlot p = chart.getCategoryPlot(); 
        p.setRangeGridlinePaint(Color.red); 
        return chart;
        
    }    
    
	private void jbInit() {
	}


	private void dynInit() {		
	}
	
	public void dispose() {
		if (m_Frame != null)
			m_Frame.dispose();
		m_Frame = null;			
	}

	public void vetoableChange(PropertyChangeEvent evt)
			throws PropertyVetoException {
	}

	public void actionPerformed(ActionEvent e) {
		Component c = (Component)e.getSource();
		if (c==addInvoice && pickInvoice.getValue() != null)
		{
			Integer plvID =(Integer)pickexportPriceList.getValue();
			
			if (plvID == 0)
			{
				ADialog.info(m_WindowNo, this, "Seleccione la lista de precio a exportar");
				return;
			}
			
			MInvoice invoice = new MInvoice(Env.getCtx(), (Integer) pickInvoice.getValue(), null);
			
			if (invoice != null)
			{
				String invoiceDocumentNo = invoice.getDocumentNo();
				if (invoiceDocumentNo == null)
					invoiceDocumentNo = "";
				String invoiceSerial = invoice.getSerial();
				if (invoiceSerial == null)
					invoiceSerial = "";
				//
				Boolean found = false;
				TableModel model = invoiceTable.getModel();
				for (int x = 0; x < model.getRowCount(); x++)
				{
					KeyNamePair pp = (KeyNamePair) model.getValueAt(x, 5);
					String DocumentNo = pp.getName();
					if (DocumentNo == null)
						DocumentNo = "";
					String serial = (String) model.getValueAt(x, 4);
					if (serial == null)
						serial = "";
					if ( ( DocumentNo.compareTo(invoiceDocumentNo) == 0) && (serial.compareTo(invoiceSerial) == 0 ))
					{
						found = true;
					}
				}
				// 
				if (!found)
				{
					// analizando factura y buscando productos en caso no existan agregarlos
					TableModel productModel =  productTable.getModel();
					MInvoiceLine[] lines = invoice.getLines();	
					int ProductCount = 0;
					callout = true;
					//Integer plvID =(Integer)pickexportPriceList.getValue();
					lock();
					Boolean lcontinue = true;
					StringBuffer sb = new StringBuffer();
					for (int j = 0; j < lines.length; j++)
					{
						lcontinue = true;
						MInvoiceLine line = lines[j];						
						MProduct product = MProduct.get(Env.getCtx(), line.getM_Product_ID(), null);
						MUOM uom = MUOM.get(Env.getCtx(), line.getC_UOM_ID());
						KeyNamePair kpuom = new KeyNamePair(uom.getC_UOM_ID(), uom.getName());							
						MUOM uomunit = MUOM.get(Env.getCtx(), product.getC_UOM_ID());
						KeyNamePair kpuomunit = new KeyNamePair(uomunit.getC_UOM_ID(), uomunit.getName());
						BigDecimal Rate = MUOMConversion.getProductRateFrom(Env.getCtx(), product.getM_Product_ID(), kpuom.getKey());
						if (Rate == null || 
								(kpuom.getKey() != kpuomunit.getKey() && line.getQtyEntered().floatValue() == line.getQtyInvoiced().floatValue()))
						{
							if (sb.length() == 0)
								sb.append("conversion del(os) producto(s):\n");
							sb.append(product.getName()).append(" a ").append(uom.getName()).append("\n");
							lcontinue = false;
						}
						if (product.getM_Product_ID() != 0 && lcontinue)
						{
							Integer row = productTable.getRowCount();							
							productTable.setRowCount(row+1);
							productTable.setValueAt(new Boolean(true),row, SELECTION);           // 0 - Selection
							if (line.getPriceEntered().compareTo(Env.ZERO) == 0)
								productTable.setValueAt(new Boolean(true),row, BONUS);           // 1 - Bonus
							else
								productTable.setValueAt(new Boolean(false),row, BONUS);           // 1 - Bonus
							productTable.setValueAt(invoiceSerial,row, SERIAL);           // 2-Value
							KeyNamePair pp = new KeyNamePair(invoice.getC_Invoice_ID(), invoiceDocumentNo);
							productTable.setValueAt(pp,row,DOCUMENTNO);           // 3-Name						
							productTable.setValueAt(product.getValue(),row, VALUE);           // 4-Value
							KeyNamePair p = new KeyNamePair(product.getM_Product_ID(), product.getName());
							productTable.setValueAt(p,row,NAME);           // 5-Name
							X_M_Product_Brand pb = new X_M_Product_Brand(Env.getCtx(), product.getM_Product_Brand_ID(), null);
							MProductCategory pc = MProductCategory.get(Env.getCtx(), product.getM_Product_Category_ID());
							productTable.setValueAt(kpuom, row, PUOM);          
							productTable.setValueAt(pb.getName(), row, PBRAND);
							productTable.setValueAt(kpuomunit, row, PUOMUNIT);
							// conversion a unidad minima.
							
							BigDecimal priceEntered = line.getPriceEntered().multiply(new BigDecimal(line.getQtyEntered().floatValue() / line.getQtyInvoiced().floatValue()));
							priceEntered = priceEntered.setScale(m_scale,BigDecimal.ROUND_HALF_UP);
							productTable.setValueAt(priceEntered == null ? Env.ZERO :priceEntered,row,PRICECONVERTED);
							productTable.setValueAt(priceEntered == null ? Env.ZERO :line.getPriceEntered(),row,PRICEENTERED);		
							productTable.setValueAt(priceEntered == null ? Env.ZERO :line.getQtyEntered(),row,QTYENTERED);
							// previous price
							MProductPrice prodprice = MProductPrice.get(Env.getCtx(), plvID, product.getM_Product_ID(), null);
							
							BigDecimal previousprice = Env.ZERO;
							if (prodprice == null)
							{
								MProductPrice newpp = new MProductPrice(Env.getCtx(), plvID, product.getM_Product_ID(), null);
								if (newpp.save())
									prodprice = newpp;
							}
							if (prodprice.getPriceList() != null)
								previousprice = prodprice.getPriceList();
							productTable.setValueAt(previousprice, row, PRICEPREVIOUS);

							ProductCount++;
						}
						
					}
					if (sb.length() != 0)
					{
						sb.append("\nno fue(ron) definido(s) de forma correcta\n");
						ADialog.error(m_WindowNo, null,"CalculateWizardAdquisition", sb.toString());
					}
					if (ProductCount > 0)
					{
						productTable.autoSize();
						// agregando factura
						Integer row = invoiceTable.getRowCount();
						invoiceTable.setRowCount(row+1);
						MDocType doc = MDocType.get(Env.getCtx(), invoice.getC_DocType_ID());
						invoiceTable.setValueAt(new Boolean(false), row, 0);   //  0 - Selection
						invoiceTable.setValueAt(new Boolean(false), row, 1);   //  1 - Discount
						invoiceTable.setValueAt(invoice.getDateInvoiced(), 	row, 2);   //  2 - DateInvoiced
						invoiceTable.setValueAt(doc.getName(), 	row, 3);   //  3 - name					
						invoiceTable.setValueAt(invoice.getSerial(), 		row, 4);   //  4 - serial
						KeyNamePair pp = new KeyNamePair(invoice.getC_Invoice_ID(), invoice.getDocumentNo());
						invoiceTable.setValueAt(pp, 	row, 5);   //  5 . N. Documento
						invoiceTable.setValueAt(MCurrency.getISO_Code(Env.getCtx(), invoice.getC_Currency_ID()), row, 6);   // 6 - Moneda
						invoiceTable.setValueAt(invoice.getGrandTotal(), 	row, 7); // 7 - Total
					}
					else
						ADialog.error(m_WindowNo, null,"CalculateWizardAdquisition", "esta factura no tiene productos validos");
					callout = false;
					unlock();
				}
				else
				{
					ADialog.error(m_WindowNo, null, "CalculateWizardAdquisition", "AlreadyExists");
				}
			}
		}
		else if (c == this.addPriceList)
		{
			if (pickPriceList.getValue() != null)
			{
        		int q = 0;
        		DefaultTableModel model = (DefaultTableModel) this.productListPriceTable.getModel();
				while (q < model.getRowCount())
					model.removeRow(q);
				
				MPriceListVersion mpl = new MPriceListVersion(Env.getCtx(), (Integer) this.pickPriceList.getValue(), null);
				if (mpl == null)
					ADialog.error(m_WindowNo, null , "Version de Lista de precios no encontrada");
				else
				{
					String where = "";
					if (pickBrand.getValue() != null)
					{
						where = String.format(" AND pp.M_PRODUCT_ID IN (SELECT P.M_PRODUCT_ID FROM M_PRODUCT P LEFT OUTER JOIN M_PRODUCT_BRAND PB ON P.M_PRODUCT_BRAND_ID=PB.M_PRODUCT_BRAND_ID WHERE PB.M_PRODUCT_BRAND_ID = %s)", pickBrand.getValue());
					}
					if (searchName.getValue() != null)
					{
						where = where.concat(" AND pp.M_PRODUCT_ID IN (SELECT P.M_PRODUCT_ID FROM M_PRODUCT P WHERE P.Name like \'%").concat(searchName.getValue().toString().toUpperCase()).concat("%\')");
					}
					if ( where.length() > 0 )
					{
						StringBuffer sql = new StringBuffer("SELECT p.M_Product_ID,p.name as productname,pb.name as productbrandname,pp.* FROM M_ProductPrice  pp ");
						sql.append(" inner JOIN M_PRODUCT p ON pp.m_product_id = p.m_product_id "); 
						sql.append(" LEFT OUTER JOIN M_PRODUCT_BRAND pb ON p.M_Product_Brand_ID = pb.M_Product_Brand_ID "); 
						sql.append(" WHERE M_PriceList_Version_ID=? ");
						sql.append(where);
						try
						{
							lock();
							callout = true;														
							PreparedStatement pstmt = DB.prepareStatement(sql.toString(), null);
							pstmt.setInt(1, mpl.getM_PriceList_Version_ID());
							ResultSet rs = pstmt.executeQuery();								
							while (rs.next())
							{
								Integer row = productListPriceTable.getRowCount();
								productListPriceTable.setRowCount(row+1);
								productListPriceTable.setValueAt(new Boolean(true),row, PLSELECTION);           // 0 - Selection
								KeyNamePair p = new KeyNamePair(rs.getInt("M_Product_ID"), rs.getString("ProductName"));
								productListPriceTable.setValueAt(p,row,PLNAME);           // 5-Name
								productListPriceTable.setValueAt(rs.getString("productbrandname"), row, PLPBRAND);
								BigDecimal pricelist = rs.getBigDecimal("PriceList");
								BigDecimal pricestd  = rs.getBigDecimal("PriceStd");
								BigDecimal pricelimit = rs.getBigDecimal("PriceLimit");
								productListPriceTable.setValueAt(pricelist, row, PLCALCULATE);
								productListPriceTable.setValueAt(pricelist,row,PLNEWPRICE);
								productListPriceTable.setValueAt(pricelist,row,PLPRICELIST);
								productListPriceTable.setValueAt(pricestd,row,PLPRICESTD);
								productListPriceTable.setValueAt(pricelimit, row, PLPRICELIMIT);
									
							}
							callout = false;
							unlock();
						}							
						catch (Exception ex)
						{
							ex.printStackTrace();
						}
						finally {
							
						}
					}
				}
			}
		}
		else if (c == consolidate)
		{
			consolidate();
		}
		else if (c == export)
		{
			export();
		}
		else if (c == fillMargen)
		{
			fillmargen();
		}
		else if (c == pickexportPriceList)
		{
			Integer M_PriceList_Version_ID =(Integer)pickexportPriceList.getValue();
			if (M_PriceList_Version_ID > 0)
			{
				MPriceListVersion plv = new MPriceListVersion(Env.getCtx(),M_PriceList_Version_ID, null);
				MPriceList pricelist = MPriceList.get(Env.getCtx(), plv.getM_PriceList_ID(), null);
				m_scale = pricelist.getPricePrecisionInt();		
				//consolidate();
			}
		}
		else if ( c == marginPriceListProfit)
		{			
			BigDecimal margin = (BigDecimal) marginPriceListProfit.getValue();
			if (margin == null)
				margin = Env.ZERO;
			
			DefaultTableModel model = (DefaultTableModel) this.productListPriceTable.getModel();
			callout = true;
			for (int j=0; j < model.getRowCount(); j++)
			{
				if ((Boolean) productListPriceTable.getValueAt(j, PLSELECTION))
				{
					productListPriceTable.setValueAt(margin, j, PLMARGIN);
					processlinepricelist(j);
				}
			}
			callout = false;
		}
		else if ( c == marginPriceLimit)
		{			
			BigDecimal margin = (BigDecimal) marginPriceLimit.getValue();
			if (margin == null)
				margin = Env.ZERO;
			
			DefaultTableModel model = (DefaultTableModel) this.productListPriceTable.getModel();
			callout = true;
			for (int j=0; j < model.getRowCount(); j++)
			{
				if ((Boolean) productListPriceTable.getValueAt(j, PLSELECTION))
				{
					productListPriceTable.setValueAt(margin, j, PLMARGINPL);
					processlinepricelist(j);
				}
			}
			callout = false;
		}
		
	}			

	private void fillmargen() {
		BigDecimal newlimit = (BigDecimal) marginLimit.getValue();
		BigDecimal newprofit = (BigDecimal) marginProfit.getValue();
		if (newprofit == null)
			newprofit = Env.ZERO;
		if (newlimit == null)
			newlimit = Env.ZERO;
		DefaultTableModel productModel = (DefaultTableModel) productTable.getModel();
		callout = true;
		for (int j=0; j < productModel.getRowCount(); j++)
		{
			if ((Boolean) productTable.getValueAt(j, SELECTION))
			{				
				BigDecimal margin   = (BigDecimal) productTable.getValueAt(j, MARGIN);
				if (margin == null)
					margin = Env.ZERO;
				if (margin.compareTo(Env.ZERO) == 0)
					productTable.setValueAt(newprofit, j, MARGIN);
				BigDecimal marginPL   = (BigDecimal) productTable.getValueAt(j, MARGINPL);
				if (marginPL == null)
					marginPL = Env.ZERO;
				if (marginPL.compareTo(Env.ZERO) == 0)
					productTable.setValueAt(newlimit, j, MARGINPL);				
			}
		}		
		callout = false;
	}


	private void consolidate() {
		DefaultTableModel productModel = (DefaultTableModel) productTable.getModel();
		Vector<Vector<Object>> PriceList = new Vector<Vector<Object>>();
		BigDecimal Total = Env.ZERO;
		BigDecimal PriceEntered = Env.ZERO;
		BigDecimal QtyEntered = Env.ZERO;
		BigDecimal Freight = (BigDecimal) freight.getValue();
		if (Freight == null)
			Freight = Env.ZERO;
		BigDecimal FreightPercent = Env.ZERO;
		callout = true;
		for (int j=0; j < productModel.getRowCount(); j++)
		{
			productTable.setValueAt(Env.ZERO, j, CALCULATE2); // new price to 0;
			
			if ((Boolean) productTable.getValueAt(j, SELECTION))
			{
				if (!(Boolean) productTable.getValueAt(j, BONUS))
				{
					Boolean found = false;
					Enumeration en = PriceList.elements();
					while (en.hasMoreElements() )
					{
						Vector<Object> product =  (Vector<Object>) en.nextElement();
						String value =  (String) product.firstElement();						
						if ( value.equals(productTable.getValueAt(j, VALUE)) )
						{
							PriceEntered =  (BigDecimal) productTable.getValueAt(j, PRICEENTERED);
							if (PriceEntered == null)
								PriceEntered = Env.ZERO;
							if (PriceEntered.compareTo(Env.ZERO) != 0)
							{
								QtyEntered =  (BigDecimal) productTable.getValueAt(j, QTYENTERED);
								if (QtyEntered == null)
									QtyEntered = Env.ZERO;
								QtyEntered = QtyEntered.add((BigDecimal) product.elementAt(3)); // Qty
								product.setElementAt(QtyEntered, 3);
								Total = Total.add(PriceEntered.multiply(QtyEntered));
							}
							found = true;
						}
					}					
					if (!found)
					{
						Vector<Object> product = new Vector<Object>();
						PriceEntered = (BigDecimal) productTable.getValueAt(j, PRICEENTERED);
						QtyEntered = (BigDecimal) productTable.getValueAt(j, QTYENTERED);						
						product.add(productTable.getValueAt(j, VALUE));       //  Value
						product.add(productTable.getValueAt(j, NAME));       //  Name
						product.add(PriceEntered);       //  PriceEntered
						product.add(QtyEntered);       //  QtyEntered
						PriceList.add(product);
						 
						Total = Total.add(PriceEntered.multiply(QtyEntered));
					}
				}
			}
		}
		if (Total.compareTo(Env.ZERO) != 0 && Freight.compareTo(Env.ZERO) != 0)
		{
			FreightPercent = new BigDecimal ( Freight.floatValue() / Total.floatValue());
		}
		for (int j=0; j < productModel.getRowCount(); j++)
		{
			if ((Boolean) productTable.getValueAt(j, SELECTION))
			{
				if ((Boolean) productTable.getValueAt(j, BONUS))
				{
					Enumeration en = PriceList.elements();
					while (en.hasMoreElements() )
					{
						Vector<Object> product =  (Vector<Object>) en.nextElement();
						String value =  (String) product.firstElement();						
						String ProductValue = (String) productTable.getValueAt(j, VALUE);
						if (ProductValue == null)
							ProductValue = "";
						if ( value.compareTo(ProductValue) == 0)
						{
							QtyEntered =  (BigDecimal) productTable.getValueAt(j, QTYENTERED);
							if (QtyEntered == null)
								QtyEntered = Env.ZERO;
							QtyEntered = QtyEntered.add((BigDecimal) product.elementAt(3)); // Qty
							product.setElementAt(QtyEntered, 3);
						}
					}
				}
			}
		}
		Enumeration en = PriceList.elements();
		while (en.hasMoreElements() )
		{
			Vector<Object> product =  (Vector<Object>) en.nextElement();
			String value =  (String) product.firstElement();						
			PriceEntered = (BigDecimal) product.get(2);
			QtyEntered = (BigDecimal) product.get(3);
			for (int j=0; j < productModel.getRowCount(); j++)
			{
				if ((Boolean) productTable.getValueAt(j, SELECTION))
				{
					productTable.setValueAt(null, j, CALCULATE1);					
					BigDecimal Price = getPrice(j);
					if (!(Boolean) productTable.getValueAt(j, BONUS) && Price.compareTo(Env.ZERO) != 0)
					{
						String ProductValue = (String) productTable.getValueAt(j, VALUE);
						if (ProductValue == null)
							ProductValue = "";
						if ( value.compareTo(ProductValue) == 0)
						{
							BigDecimal oldQtyEntered = (BigDecimal) productTable.getValueAt(j, QTYENTERED);
							if (oldQtyEntered == null)
								oldQtyEntered = Env.ZERO;							
							// freight
							BigDecimal newbaseprice = Env.ZERO;
							if (Freight.compareTo(Env.ZERO) > 0 && FreightPercent.compareTo(Env.ZERO) != 0)
							{
								BigDecimal distFreight = oldQtyEntered.multiply(PriceEntered);								
								distFreight = distFreight.multiply(FreightPercent);
								distFreight = distFreight.divide(QtyEntered);
								productTable.setValueAt(distFreight, j, FREIGHT);
							}														
							// aca si la cantidad anterior es diferente (es decir no hubo consolidado) amerita un recalculo con cantidades
							// de lo contrario no. es decir cuando no hay que consolidar nada.
							if (oldQtyEntered.compareTo(QtyEntered) != 0)
							{
								PriceEntered = PriceEntered.multiply(oldQtyEntered).divide(QtyEntered, 10, BigDecimal.ROUND_HALF_UP);
								if (QtyEntered.compareTo(Env.ZERO) != 0)			
								{
									KeyNamePair kpProduct = (KeyNamePair) productTable.getValueAt(j,NAME);
									KeyNamePair uom = (KeyNamePair) productTable.getValueAt(j, PUOM);
									KeyNamePair uomunit = (KeyNamePair) productTable.getValueAt(j, PUOMUNIT);											
									if ( uom.getKey() != uomunit.getKey() )
									{
										BigDecimal Rate = MUOMConversion.getProductRateFrom(Env.getCtx(), kpProduct.getKey(), uom.getKey());		
										newbaseprice = PriceEntered.divide(Rate, 10, BigDecimal.ROUND_HALF_UP);
									}
									else
										newbaseprice = new BigDecimal(PriceEntered.doubleValue() / QtyEntered.doubleValue()  );
								}	
								newbaseprice = newbaseprice.setScale(m_scale,BigDecimal.ROUND_HALF_UP);
								productTable.setValueAt(newbaseprice, j, CALCULATE1);
								processline(j, null);
							}
							else
								processline(j, null);							
						}
					}					
					else if (!(Boolean) productTable.getValueAt(j, BONUS) && Price.compareTo(Env.ZERO) == 0 ) //&& priceList.compareTo(Env.ZERO) != 0)
					{
						BigDecimal margen = (BigDecimal) productTable.getValueAt(j, MARGIN);
						if (margen == null)
							margen = Env.ZERO;
						if ( margen.compareTo(Env.ZERO) != 0 )
						{
							BigDecimal price = (BigDecimal) productTable.getValueAt( j, NEWPRICE);	
							BigDecimal newprice = price.add(price.multiply(margen.divide(Env.ONEHUNDRED,10,BigDecimal.ROUND_HALF_UP)));
							newprice = newprice.setScale(m_scale,BigDecimal.ROUND_HALF_UP);
						}
						BigDecimal margenPL = (BigDecimal) productTable.getValueAt(j, MARGINPL);
						if (margenPL == null)
							margenPL = Env.ZERO;
						if ( margenPL.compareTo(Env.ZERO) != 0 )
						{
							BigDecimal newprice = (BigDecimal) productTable.getValueAt( j, NEWPRICE);								
							BigDecimal pricelimit = newprice.add(newprice.multiply(margenPL.divide(Env.ONEHUNDRED,10,BigDecimal.ROUND_HALF_UP)));
							pricelimit = pricelimit.setScale(m_scale,BigDecimal.ROUND_HALF_UP);
							productTable.setValueAt(pricelimit, j, PRICELIMIT);
						}														
					}
				}
			}
		}
		callout = false;
	}

	private BigDecimal getPrice(int row) {
		BigDecimal Price = Env.ZERO;
		if ((BigDecimal) productTable.getValueAt(row, CALCULATE1) == null)
			Price = (BigDecimal) productTable.getValueAt(row, PRICECONVERTED);
		else
			Price = (BigDecimal) productTable.getValueAt(row, CALCULATE1);
		if (Price == null)
			Price = Env.ZERO;
		return Price;
	}

	private void processlinepricelist(int row) {
		BigDecimal newprice = Env.ZERO;
		BigDecimal newbaseprice = (BigDecimal) productListPriceTable.getValueAt(row, PLPRICELIST);
		if (newbaseprice == null)
			return;		
		BigDecimal adjust = (BigDecimal) productListPriceTable.getValueAt(row, PLADJUST);
		if (adjust == null)
			adjust = Env.ZERO;
		if (adjust.compareTo(Env.ZERO) != 0 )
		{
			newbaseprice = newbaseprice.add(newbaseprice.multiply(adjust.divide(Env.ONEHUNDRED,10,BigDecimal.ROUND_HALF_UP)));
			productListPriceTable.setValueAt(newbaseprice, row, PLCALCULATE);
		}
		BigDecimal margen = (BigDecimal) productListPriceTable.getValueAt(row, PLMARGIN);
		if (margen == null)
			margen = Env.ZERO;
		if ( margen.compareTo(Env.ZERO) != 0 )
		{
			newprice = newbaseprice.add(newbaseprice.multiply(margen.divide(Env.ONEHUNDRED,10,BigDecimal.ROUND_HALF_UP)));
			newprice = newprice.setScale(m_scale,BigDecimal.ROUND_HALF_UP);
			productListPriceTable.setValueAt(newprice, row, PLNEWPRICE);
			productListPriceTable.setValueAt(newprice, row, PLPRICESTD);								
		}
		else
		{
			newprice = newbaseprice;
			productListPriceTable.setValueAt(newprice, row, PLNEWPRICE);
			productListPriceTable.setValueAt(newprice, row, PLPRICESTD);											
		}
		BigDecimal margenPL = (BigDecimal) productListPriceTable.getValueAt(row, PLMARGINPL);
		if (margenPL == null)
			margenPL = Env.ZERO;
		if ( margenPL.compareTo(Env.ZERO) != 0 )
		{
			BigDecimal pricelimit = newprice.add(newprice.multiply(margenPL.divide(Env.ONEHUNDRED,10,BigDecimal.ROUND_HALF_UP)));
			pricelimit = pricelimit.setScale(m_scale,BigDecimal.ROUND_HALF_UP);
			productListPriceTable.setValueAt(pricelimit, row, PLPRICELIMIT);
		}															
	}
	private void processline(int row,BigDecimal p_newPrice) {
		BigDecimal Rate = Env.ZERO;
		BigDecimal newprice = Env.ZERO;
		BigDecimal newPriceByContainer = Env.ZERO;
		KeyNamePair kpProduct = (KeyNamePair) productTable.getValueAt(row,NAME);
		KeyNamePair uom = (KeyNamePair) productTable.getValueAt(row, PUOM);          
		BigDecimal newbaseprice = this.getPrice(row);
		if (newbaseprice == null)
			return;
		newbaseprice = newbaseprice.setScale(m_scale,BigDecimal.ROUND_HALF_UP);
		BigDecimal adjust = (BigDecimal) productTable.getValueAt(row, ADJUST);
		if (adjust == null)
			adjust = Env.ZERO;
		if (adjust.compareTo(Env.ZERO) != 0)
		{
			newbaseprice = newbaseprice.add(newbaseprice.multiply(adjust.divide(Env.ONEHUNDRED,10, BigDecimal.ROUND_HALF_UP)));
			newbaseprice = newbaseprice.setScale(m_scale,BigDecimal.ROUND_HALF_UP);
		}
		BigDecimal freight = (BigDecimal) productTable.getValueAt(row, FREIGHT);
		if (freight == null)
			freight = Env.ZERO;
		productTable.setValueAt(newbaseprice, row, CALCULATE2);
		productTable.setValueAt(newbaseprice, row, NEWPRICE);
		if (p_newPrice == null)
		{
			BigDecimal margen = (BigDecimal) productTable.getValueAt(row, MARGIN);
			if (margen == null)
				margen = Env.ZERO;
			if ( margen.compareTo(Env.ZERO) != 0)
			{
				newprice = newbaseprice.add(newbaseprice.multiply(margen.divide(Env.ONEHUNDRED,10,BigDecimal.ROUND_HALF_UP)));
				newprice = newprice.setScale(m_scale,BigDecimal.ROUND_HALF_UP);
				productTable.setValueAt(newprice, row, NEWPRICE);
			}
		}
		else
		{
			BigDecimal margen = p_newPrice.divide(newbaseprice, 10 , BigDecimal.ROUND_HALF_UP);
			margen = margen.subtract(Env.ONE);
			margen = margen.multiply(Env.ONEHUNDRED);
			newprice = p_newPrice;
			productTable.setValueAt(margen, row, MARGIN);
			productTable.setValueAt(newprice, row, NEWPRICE);
		}	
		if (uom != null)
		{
			Rate = MUOMConversion.getProductRateFrom(Env.getCtx(), kpProduct.getKey(), uom.getKey());					
			newPriceByContainer = newprice.multiply(Rate);  
			productTable.setValueAt(newPriceByContainer, row, NEWPRICEBYCONTAINER);
		}		
		if (freight.compareTo(Env.ZERO) != 0)
		{
			newbaseprice = newbaseprice.add(freight);
		}
//		if (uom != null)
//		{
//			Rate = MUOMConversion.getProductRateFrom(Env.getCtx(), kpProduct.getKey(), uom.getKey());					
//			newPriceByContainer = newbaseprice.multiply(Rate);  
//			productTable.setValueAt(newPriceByContainer, row, NEWPRICEBYCONTAINER);
//		}
//		
		BigDecimal margenPL = (BigDecimal) productTable.getValueAt(row, MARGINPL);
		if (margenPL == null)
			margenPL = Env.ZERO;
		if ( margenPL.compareTo(Env.ZERO) != 0 )
		{
			newprice = (BigDecimal) productTable.getValueAt( row, NEWPRICE);								
			BigDecimal pricelimit = newprice.add(newprice.multiply(margenPL.divide(Env.ONEHUNDRED,10,BigDecimal.ROUND_HALF_UP)));
			pricelimit = pricelimit.setScale(m_scale,BigDecimal.ROUND_HALF_UP);
			productTable.setValueAt(pricelimit, row, PRICELIMIT);
		}		
	}
	
	private void setPriceList(boolean initialize) {
		if (initialize)
		{
			AllPriceListTable.addColumn(Msg.translate(Env.getCtx(), "M_PriceList_Version_ID"));
			AllPriceListTable.addColumn(Msg.translate(Env.getCtx(), "M_Product_ID"));
			AllPriceListTable.addColumn(Msg.translate(Env.getCtx(), "PriceList"));
			AllPriceListTable.addColumn(Msg.translate(Env.getCtx(), "PriceStd"));
			AllPriceListTable.addColumn(Msg.translate(Env.getCtx(), "PriceLimit"));
		}
		else
		{
			
		}
	}

	void setInvoice(Boolean initialize)
	{
		if (initialize)
		{
			//  Header Info
			invoiceTable.addColumn(Msg.getMsg(Env.getCtx(), "Select"));
			invoiceTable.addColumn(Msg.translate(Env.getCtx(), "Bonus"));
			invoiceTable.addColumn(Msg.translate(Env.getCtx(), "Date"));
			invoiceTable.addColumn(Util.cleanAmp(Msg.translate(Env.getCtx(), "Documento")));
			invoiceTable.addColumn(Util.cleanAmp(Msg.translate(Env.getCtx(), "Serie")));
			invoiceTable.addColumn(Util.cleanAmp(Msg.translate(Env.getCtx(), "DocumentNo")));
			invoiceTable.addColumn(Msg.translate(Env.getCtx(), "C_Currency_ID"));
			invoiceTable.addColumn(Msg.translate(Env.getCtx(), "Amount"));
			invoiceTable.addColumn(Msg.translate(Env.getCtx(), "Factor"));
			DefaultTableModel model =  (DefaultTableModel)invoiceTable.getModel();
			model.addTableModelListener(this);
			invoiceTable.setModel(model);
			int i = 0;
			invoiceTable.setColumnClass(i++, Boolean.class, false);         //  0-Selection
			invoiceTable.setColumnClass(i++, Boolean.class, false);         //  1-Discount
			invoiceTable.setColumnClass(i++, Timestamp.class, true);        //  2-TrxDate
			invoiceTable.setColumnClass(i++, String.class, true);           //  3-Document Type
			invoiceTable.setColumnClass(i++, String.class, true);           //  4-Document serial
			invoiceTable.setColumnClass(i++, String.class, true);           //  5-Document No
			invoiceTable.setColumnClass(i++, String.class, true);           //  6-ISO Currency
			invoiceTable.setColumnClass(i++, BigDecimal.class, true);       //  7-Amount
			invoiceTable.setColumnClass(i++, BigDecimal.class, true);       //  8-Factor
			invoiceTable.autoSize();			
			invoiceTable.getSelectionModel().addListSelectionListener(
					new ListSelectionListener() {
						public void valueChanged(ListSelectionEvent event) {
							int viewRow = invoiceTable.getSelectedRow();
							if (viewRow < 0 ) {
								
							} else {

							}
						}
					}
			);
			
			invoiceTable.addKeyListener(new KeyAdapter() {
				public void keyPressed(KeyEvent e) {
					int key = e.getKeyCode();
					if ( key == KeyEvent.VK_DELETE)
					{
		            	if (ADialog.ask(0, m_Frame, Msg.getMsg(Env.getCtx(), "DeleteRecord?")))
		            	{
		            		int selection = invoiceTable.getSelectedRow();
		            		DefaultTableModel model =  (DefaultTableModel) invoiceTable.getModel();
		            		KeyNamePair pp =(KeyNamePair) invoiceTable.getValueAt(selection, 5);
		            		DefaultTableModel productModel = (DefaultTableModel) productTable.getModel();
		            		int q = 0;
							while (q < productModel.getRowCount())
							{
								KeyNamePair ppp = (KeyNamePair) productTable.getValueAt(q, 3);
								if (ppp.getKey() == pp.getKey())
								{
									productModel.removeRow(q);
									q = 0;
								}
								else
									q++;
							}		            		
		            		model.removeRow(selection);
		            	}	                           	
					}	
				}	
			});
		}
	}

	void setProduct(Boolean initialize)
	{
		if (initialize)
		{			
			//  Header Info
			productTable.addColumn(Msg.getMsg(Env.getCtx(), "Select"));
			productTable.addColumn(Msg.getMsg(Env.getCtx(), "Bonus"));
			productTable.addColumn(Msg.translate(Env.getCtx(), "Serial"));
			productTable.addColumn(Msg.translate(Env.getCtx(), "DocumentNo"));						
			productTable.addColumn(Msg.translate(Env.getCtx(), "Value"));
			productTable.addColumn(Msg.translate(Env.getCtx(), "Name"));
			productTable.addColumn(Msg.translate(Env.getCtx(), "M_Product_Brand_ID"));
			productTable.addColumn(Msg.translate(Env.getCtx(), "C_UOM_ID"));
			productTable.addColumn(Msg.translate(Env.getCtx(), "PriceEntered"));
			productTable.addColumn(Msg.translate(Env.getCtx(), "PricebyContainer"));
			productTable.addColumn(Msg.translate(Env.getCtx(), "QtyEntered"));
			productTable.addColumn(Msg.translate(Env.getCtx(), "C_UOM_ID"));
			productTable.addColumn(Msg.translate(Env.getCtx(), "PriceConverted"));
			productTable.addColumn(Msg.translate(Env.getCtx(), "Calculate1"));
			productTable.addColumn(Msg.translate(Env.getCtx(), "Adjust"));
			productTable.addColumn(Msg.translate(Env.getCtx(), "Freight"));			
			productTable.addColumn(Msg.translate(Env.getCtx(), "Calculate2"));
			productTable.addColumn(Msg.translate(Env.getCtx(), "MarginProfit"));		
			productTable.addColumn(Msg.translate(Env.getCtx(), "newPrice"));
			productTable.addColumn(Msg.translate(Env.getCtx(), "newPriceByContainer"));
			productTable.addColumn(Msg.translate(Env.getCtx(), "PricePrevious"));
			productTable.addColumn(Msg.translate(Env.getCtx(), "MarginLimit"));
			productTable.addColumn(Msg.translate(Env.getCtx(), "PriceLimit"));
			DefaultTableModel model =  (DefaultTableModel)productTable.getModel();
			model.addTableModelListener(this);
			productTable.setModel(model);
			int i = 0;
			productTable.setColumnClass(i++, Boolean.class, false);         // 0-Selection
			productTable.setColumnClass(i++, Boolean.class, false);         // 1-Bonus
			productTable.setColumnClass(i++, String.class, true);           // 2-serial
			productTable.setColumnClass(i++, String.class, true);           // 3-Documento		
			productTable.setColumnClass(i++, String.class, true);           // 4-Value
			productTable.setColumnClass(i++, String.class, true);           // 5-Name
			productTable.setColumnClass(i++, String.class, true);           // 6-Product Brand
			productTable.setColumnClass(i++, String.class, true);           // 7-C_UOM_ID
			productTable.setColumnClass(i++, BigDecimal.class, true);       // 8-Price entered
			productTable.setColumnClass(i++, BigDecimal.class, false);      // 9-Price by Container
			productTable.setColumnClass(i++, BigDecimal.class, true);       //10-Qty entered
			productTable.setColumnClass(i++, String.class, true);           //11-C_UOM_ID
			productTable.setColumnClass(i++, BigDecimal.class, true);       //12 -Price converted
			productTable.setColumnClass(i++, BigDecimal.class, true);		//13-Calculate1
			productTable.setColumnClass(i++, BigDecimal.class, false);      //14-Adjust
			productTable.setColumnClass(i++, BigDecimal.class, true);       //15-Calculate2
			productTable.setColumnClass(i++, BigDecimal.class, false);      //16-Freight
			productTable.setColumnClass(i++, BigDecimal.class, false);      //17-Marginprofit
			productTable.setColumnClass(i++, BigDecimal.class, false);      //18-new Price
			productTable.setColumnClass(i++, BigDecimal.class, true);       //19-new Price by Container
 			productTable.setColumnClass(i++, BigDecimal.class, true);       //20-Price Previous
			productTable.setColumnClass(i++, BigDecimal.class, false);      //21-Margin			
			productTable.setColumnClass(i++, BigDecimal.class, true);       //22-PriceLimit
			productTable.autoSize();									
			
			productTable.getSelectionModel().addListSelectionListener(
					new ListSelectionListener() {
						public void valueChanged(ListSelectionEvent event) {
							int viewRow = productTable.getSelectedRow();
							if (viewRow < 0 ) {
								
							} else {

							}
						}
					}
			);
			
			productTable.addKeyListener(new KeyAdapter() {
				public void keyPressed(KeyEvent e) {
					int key = e.getKeyCode();
					if ( key == KeyEvent.VK_DELETE)
					{
		            	if (ADialog.ask(0, m_Frame, Msg.getMsg(Env.getCtx(), "DeleteRecord?")))
		            	{
		            		
		            	}	                           	
					}	
				}	
			});
		}
	}

	void setProductListPrice(Boolean initialize)
	{
		if (initialize)
		{			
			//  Header Info
			productListPriceTable.addColumn(Msg.getMsg(Env.getCtx(), "Select"));
			productListPriceTable.addColumn(Msg.translate(Env.getCtx(), "Name"));
			productListPriceTable.addColumn(Msg.translate(Env.getCtx(), "M_Product_Brand_ID"));
			productListPriceTable.addColumn(Msg.translate(Env.getCtx(), "Adjust"));
			productListPriceTable.addColumn(Msg.translate(Env.getCtx(), "Calculate1"));
			productListPriceTable.addColumn(Msg.translate(Env.getCtx(), "MarginProfit"));		
			productListPriceTable.addColumn(Msg.translate(Env.getCtx(), "newPrice"));
			productListPriceTable.addColumn(Msg.translate(Env.getCtx(), "PriceList"));
			productListPriceTable.addColumn(Msg.translate(Env.getCtx(), "PriceStandard"));
			productListPriceTable.addColumn(Msg.translate(Env.getCtx(), "MarginLimit"));
			productListPriceTable.addColumn(Msg.translate(Env.getCtx(), "PriceLimit"));
			DefaultTableModel model =  (DefaultTableModel)productListPriceTable.getModel();
			model.addTableModelListener(this);
			productListPriceTable.setModel(model);
			int i = 0;
			productListPriceTable.setColumnClass(i++, Boolean.class, false);         // 0-Selection
			productListPriceTable.setColumnClass(i++, String.class, true);           // 1-Name
			productListPriceTable.setColumnClass(i++, String.class, true);           // 2-Product Brand
			productListPriceTable.setColumnClass(i++, BigDecimal.class, false);      // 3-Adjust
			productListPriceTable.setColumnClass(i++, BigDecimal.class, true);		//  4-Calculate1
			productListPriceTable.setColumnClass(i++, BigDecimal.class, false);      // 5-Marginprofit
			productListPriceTable.setColumnClass(i++, BigDecimal.class, false);      // 6-new Price
 			productListPriceTable.setColumnClass(i++, BigDecimal.class, true);       // 7-Price List
			productListPriceTable.setColumnClass(i++, BigDecimal.class, true);       // 8-Price Standard			
			productListPriceTable.setColumnClass(i++, BigDecimal.class, false);      // 9-Margin			
			productListPriceTable.setColumnClass(i++, BigDecimal.class, true);       //10-PriceLimit
			productListPriceTable.autoSize();									
			
			productListPriceTable.getSelectionModel().addListSelectionListener(
					new ListSelectionListener() {
						public void valueChanged(ListSelectionEvent event) {
							int viewRow = productListPriceTable.getSelectedRow();
							if (viewRow < 0 ) {
								
							} else {

							}
						}
					}
			);
			
			productListPriceTable.addKeyListener(new KeyAdapter() {
				public void keyPressed(KeyEvent e) {
					int key = e.getKeyCode();
					if ( key == KeyEvent.VK_DELETE)
					{
		            	if (ADialog.ask(0, m_Frame, Msg.getMsg(Env.getCtx(), "DeleteRecord?")))
		            	{
		            		
		            	}	                           	
					}	
				}	
			});
		}
	}
	
	void setHistoryProduct(Boolean initialize)
	{
		if (initialize)
		{			
			//  Header Info
			//dsdsds
			HistoryproductTable.addColumn(Msg.translate(Env.getCtx(), "Serial"));
			HistoryproductTable.addColumn(Msg.translate(Env.getCtx(), "DocumentNo"));						
			HistoryproductTable.addColumn(Msg.translate(Env.getCtx(), "Date"));
			HistoryproductTable.addColumn(Util.cleanAmp(Msg.translate(Env.getCtx(), "Documento")));
			HistoryproductTable.addColumn(Util.cleanAmp(Msg.translate(Env.getCtx(), "Serie")));
			HistoryproductTable.addColumn(Util.cleanAmp(Msg.translate(Env.getCtx(), "DocumentNo")));
			HistoryproductTable.addColumn(Msg.translate(Env.getCtx(), "C_Currency_ID"));
			HistoryproductTable.addColumn(Msg.translate(Env.getCtx(), "Amount"));
			DefaultTableModel model =  (DefaultTableModel)HistoryproductTable.getModel();
			model.addTableModelListener(this);
			HistoryproductTable.setModel(model);
			int i = 0;
			HistoryproductTable.setColumnClass(i++, String.class, true);           // 0-serial
			HistoryproductTable.setColumnClass(i++, String.class, true);           // 1-Documento
			HistoryproductTable.setColumnClass(i++, Timestamp.class, true);        // 2-TrxDate
			HistoryproductTable.setColumnClass(i++, String.class, true);           // 3-DocumentNo
			HistoryproductTable.setColumnClass(i++, String.class, true);           // 4-Serie
			HistoryproductTable.setColumnClass(i++, String.class, true);           // 5-DocumentNo
			HistoryproductTable.setColumnClass(i++, String.class, true);           // 6-C_Currency
			HistoryproductTable.setColumnClass(i++, BigDecimal.class, true);       // 7-Amoun
			HistoryproductTable.autoSize();									
			
			productTable.getSelectionModel().addListSelectionListener(
					new ListSelectionListener() {
						public void valueChanged(ListSelectionEvent event) {
							int viewRow = HistoryproductTable.getSelectedRow();
							if (viewRow < 0 ) {
								
							} else {

							}
						}
					}
			);
			
			productTable.addKeyListener(new KeyAdapter() {
				public void keyPressed(KeyEvent e) {
					int key = e.getKeyCode();
					if ( key == KeyEvent.VK_DELETE)
					{
		            	if (ADialog.ask(0, m_Frame, Msg.getMsg(Env.getCtx(), "DeleteRecord?")))
		            	{
		            		
		            	}	                           	
					}	
				}	
			});
		}
	}
	
	public void tableChanged(TableModelEvent e) {
		System.out.println("X");
		if ( e.getType() == e.INSERT  || e.getType() == e.UPDATE)
		{
			if ( !callout )
			{	
				callout = true;
				if (e.getSource() == invoiceTable.getModel() && invoiceTable.getValueAt(e.getFirstRow(), 1) != null  )
				{
					BigDecimal factor = Env.ZERO;
					if ( (Boolean) invoiceTable.getValueAt(e.getFirstRow(), 1))  // selected 
					{
						// si esta factura tiene productos, no puede ser considerada para descuento
						KeyNamePair pp = (KeyNamePair) invoiceTable.getValueAt(e.getFirstRow(), 5);
						TableModel productModel = productTable.getModel();
						for (int q = 0; q < productModel.getRowCount(); q++)
						{
							KeyNamePair ppp = (KeyNamePair) productTable.getValueAt(q, 3);
							if (ppp.getKey() == pp.getKey())
							{
								// esta factura tiene products, ergo no puede ser usada para descuento
								ADialog.error(m_WindowNo, null, "InvoiceWithProductCantbeUsed", "");
								callout = false;
								invoiceTable.setValueAt(false,e.getFirstRow(), 1);
								return;
							}
						}
						//
						BigDecimal TotalInvoice = Env.ZERO;
						TableModel model = invoiceTable.getModel();
						for (int j = 0; j < model.getRowCount(); j++)
						{					
							if ( (Boolean) invoiceTable.getValueAt(j, 0) && !(Boolean) invoiceTable.getValueAt(j, 1) )
							{
								BigDecimal Total = (BigDecimal) invoiceTable.getValueAt(j,7);
								if (Total == null)
									Total = Env.ZERO;						
								TotalInvoice = TotalInvoice.add(Total);
							}
						}
						BigDecimal TotalDiscount = (BigDecimal) invoiceTable.getValueAt(e.getFirstRow(), 7);
						if (TotalDiscount == null)
							TotalDiscount = Env.ZERO;
						if ( TotalInvoice.equals(Env.ZERO) )
						{
							ADialog.error(m_WindowNo, null, "CalculateWizardAdquisition", "");
						}
						else
						{
							factor = new BigDecimal ((TotalDiscount.doubleValue()) / TotalInvoice.doubleValue() * 100.0);
							invoiceTable.setValueAt(factor, e.getFirstRow(), 8 );
						}
					}
					else
					{
						factor = (BigDecimal) invoiceTable.getValueAt(e.getFirstRow(), 8);
						if (factor == null)
							factor = Env.ZERO;
						if ( factor.compareTo(Env.ZERO) != 0 )
							invoiceTable.setValueAt(Env.ZERO, e.getFirstRow(), 8 );
					}
				}
				else if (e.getSource() == this.productTable.getModel())
				{
					if (e.getColumn() == PRICEBYCONTAINER)
					{
						KeyNamePair kuom     = (KeyNamePair) productTable.getValueAt(e.getFirstRow(), PUOM);          
						KeyNamePair kuomunit = (KeyNamePair) productTable.getValueAt(e.getFirstRow(), PUOMUNIT);
						KeyNamePair product  = (KeyNamePair) productTable.getValueAt(e.getFirstRow(), NAME);
						BigDecimal priceEntered = (BigDecimal) productTable.getValueAt(e.getFirstRow(), PRICEBYCONTAINER);
						if (priceEntered == null)
							priceEntered = Env.ZERO;
						BigDecimal Freight = (BigDecimal) freight.getValue();
						if (Freight == null)
							Freight = Env.ZERO;												
						if (priceEntered.compareTo(Env.ZERO) != 0)
						{
							BigDecimal Rate = MUOMConversion.getProductRateFrom(Env.getCtx(), product.getKey(), kuom.getKey());
							if (Rate == null)
								System.out.println("XX");
							BigDecimal newprice = priceEntered.divide(Rate, 10, BigDecimal.ROUND_HALF_UP);
							BigDecimal margin = newprice.subtract(this.getPrice(e.getFirstRow())).divide(getPrice(e.getFirstRow()), 10, BigDecimal.ROUND_HALF_UP);
							margin = margin.multiply(Env.ONEHUNDRED).setScale(m_scale, BigDecimal.ROUND_HALF_UP);
							productTable.setValueAt(margin,e.getFirstRow(),MARGIN);
							processline(e.getFirstRow(), null);
						}
						else
						{
							productTable.setValueAt(Env.ZERO,e.getFirstRow(),MARGIN);							
							processline(e.getFirstRow(), null);
						}
					}
					else if (e.getColumn() == MARGIN)
					{
						processline(e.getFirstRow(), null);
					}
					else if (e.getColumn() == ADJUST)
					{
						processline(e.getFirstRow(), null);
					}
					else if (e.getColumn() == FREIGHT)
					{
						processline(e.getFirstRow(), null);
					}
					else if (e.getColumn() == NEWPRICE)
					{
						BigDecimal newprice = (BigDecimal) productTable.getValueAt(e.getFirstRow(), NEWPRICE);
						//BigDecimal price = this.getPrice(e.getFirstRow());
						//if (price != null)
						//{
						//	BigDecimal margin = newprice.subtract(price).divide(price, 10, BigDecimal.ROUND_HALF_UP);
						//	margin = margin.multiply(Env.ONEHUNDRED).setScale(2, BigDecimal.ROUND_HALF_UP);
						//	productTable.setValueAt(margin,e.getFirstRow(),MARGIN);
							processline(e.getFirstRow(), newprice);
							//}
					}
				}
				else if (e.getSource() == this.productListPriceTable.getModel() )
				{
					if (e.getColumn() == PLADJUST )
					{
						processlinepricelist(e.getFirstRow());
					}
					else if (e.getColumn() == PLMARGIN)
					{
						processlinepricelist(e.getFirstRow());
					}
					else if (e.getColumn() == PLNEWPRICE)
					{
						BigDecimal newprice = (BigDecimal) productListPriceTable.getValueAt(e.getFirstRow(), PLNEWPRICE);						
						BigDecimal oldprice = (BigDecimal) productListPriceTable.getValueAt(e.getFirstRow(), PLPRICELIST);
						BigDecimal diff = newprice.subtract(oldprice);
						BigDecimal margin = new BigDecimal( diff.floatValue() / oldprice.floatValue() );
						margin = margin.multiply(Env.ONEHUNDRED).setScale(2, BigDecimal.ROUND_HALF_UP);
						productListPriceTable.setValueAt(margin, e.getFirstRow(), PLMARGIN);
						processlinepricelist(e.getFirstRow());
					}
					else if (e.getColumn() == PLMARGINPL)
					{
						processlinepricelist(e.getFirstRow());
					}
				}
				callout = false;
			}
		}		
	}	

	/**
	 *	Fill Picks with values
	 *
	 * @param M_PriceList_ID price list
	 */
	private void fillPicks (int M_PriceList_ID, VComboBox pick)
	{
		//	Price List
		String SQL = "SELECT M_PriceList_Version.M_PriceList_Version_ID,"
			+ " M_PriceList_Version.Name || ' (' || c.Iso_Code || ')' AS ValueName "
			+ "FROM M_PriceList_Version, M_PriceList pl, C_Currency c "
			+ "WHERE M_PriceList_Version.M_PriceList_ID=pl.M_PriceList_ID"
			+ " AND pl.C_Currency_ID=c.C_Currency_ID"
			+ " AND M_PriceList_Version.IsActive='Y' AND pl.IsActive='Y'";
		//	Same PL currency as original one
		if (M_PriceList_ID != 0)
			if (MRole.getDefault().isOnlySoPriceListAccess())
				SQL += " AND EXISTS (SELECT * FROM M_PriceList xp WHERE xp.M_PriceList_ID=" + M_PriceList_ID
				+ " AND pl.issopricelist='Y' AND pl.C_Currency_ID=xp.C_Currency_ID)";				
			else				
				SQL += " AND EXISTS (SELECT * FROM M_PriceList xp WHERE xp.M_PriceList_ID=" + M_PriceList_ID
					+ " AND pl.C_Currency_ID=xp.C_Currency_ID)";
		//	Add Access & Order
		SQL = MRole.getDefault().addAccessSQL (SQL, "M_PriceList_Version", true, false)	// fully qualidfied - RO 
			+ " ORDER BY M_PriceList_Version.Name";
		try
		{
			pick.addItem(new KeyNamePair (0, ""));
			PreparedStatement pstmt = DB.prepareStatement(SQL, null);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next())
			{
				KeyNamePair kn = new KeyNamePair (rs.getInt(1), rs.getString(2));
				pick.addItem(kn);
			}
			rs.close();
			pstmt.close();
		}
		catch (SQLException e)
		{
			log.log(Level.SEVERE, SQL, e);
		}
	}	//	fillPicks

	public void stateChanged(ChangeEvent e) {
		// TODO Auto-generated method stub
		
	}
	private void export() {
		// primero confirmamos 
		if (ADialog.ask(m_WindowNo, this, "StartProcess?"))
		{
			Integer M_PriceList_Version_ID =(Integer)pickexportPriceList.getValue(); 
			MPriceListVersion plv = new MPriceListVersion(Env.getCtx(),M_PriceList_Version_ID, null);
			MPriceList pricelist = MPriceList.get(Env.getCtx(), plv.getM_PriceList_ID(), null);			
			int PriceListCurrency = pricelist.getC_Currency_ID();
			int changed = 0;
			int unchanged = 0;
			//String proc_msg = "";
			if (this.tabbedPane.getSelectedIndex() == 0)
			{
				DefaultTableModel model = (DefaultTableModel) productTable.getModel();
				int ncontinue = 0;
				lock();
				for (int j=0; j < model.getRowCount(); j++)
				{
					if ((Boolean) productTable.getValueAt(j, SELECTION))
					{
						BigDecimal newPrice = (BigDecimal) productTable.getValueAt(j, NEWPRICE);
						BigDecimal PriceLimit = (BigDecimal) productTable.getValueAt(j, PRICELIMIT);
						if (newPrice == null || PriceLimit == null)
						{
							ncontinue = 1;
							break;
						}
						else
						{
							if (PriceLimit.compareTo(newPrice) > 0)
							{
								ncontinue = 2;
								break;								
							}
						}
					}
				}
				if (ncontinue > 0)
				{
					if (ncontinue == 1)
						ADialog.error(m_WindowNo, null,"CalculateWizardAdquisition", "es obligatorio nuevo precio y limite de precio");
					else if (ncontinue == 2)
						ADialog.error(m_WindowNo, null,"CalculateWizardAdquisition", "el precio limite es mayor al nuevo precio");
					unlock();
					return;
				}
				for (int j=0; j < model.getRowCount(); j++)
				{
					if ((Boolean) productTable.getValueAt(j, SELECTION))
					{
						// invoice ID
						KeyNamePair i = (KeyNamePair) productTable.getValueAt(j, DOCUMENTNO);					
						MInvoice invoice  = MInvoice.get(Env.getCtx(), i.getKey());
						MInvoiceLine[] lines = invoice.getLines();
						if ( invoice.getC_Currency_ID() == PriceListCurrency )
						{
							BigDecimal Price = (BigDecimal) productTable.getValueAt(j, PRICEENTERED);
							if (Price == null)
								Price = Env.ZERO;
							if (!(Boolean) productTable.getValueAt(j, BONUS) && Price.compareTo(Env.ZERO) != 0)
							{
								KeyNamePair p = (KeyNamePair) productTable.getValueAt(j, NAME);
								Integer M_Product_ID = p.getKey();
								BigDecimal Qty = (BigDecimal) productTable.getValueAt(j, QTYENTERED);
								BigDecimal newPrice = (BigDecimal) productTable.getValueAt(j, NEWPRICE);
								BigDecimal PriceLimit = (BigDecimal) productTable.getValueAt(j, PRICELIMIT);
								BigDecimal freightAmt = (BigDecimal) productTable.getValueAt(j, FREIGHT);
								if ( freightAmt == null)
									freightAmt = Env.ZERO;							
								if (newPrice != null)
								{								
									MProductPrice pr = MProductPrice.get(Env.getCtx(), M_PriceList_Version_ID, M_Product_ID, null);
									pr.setPriceList(newPrice);
									pr.setPriceStd(newPrice);
									pr.setPriceLimit(PriceLimit);								
									if (pr.save())
									{
										if (freightAmt.compareTo(BigDecimal.ZERO) != 0)
										{
											// ahora actualizamos la factura , la orden y la guia.
											for (int u=0; u < lines.length; u++)
											{
												MInvoiceLine line = lines[u];
												if ( line.getM_Product_ID() == M_Product_ID && line.getPriceEntered().compareTo(Env.ZERO) != 0)
												{
													if (line.getC_OrderLine_ID() != 0)
													{
														MOrderLine orderline = new MOrderLine(Env.getCtx(), line.getC_OrderLine_ID(), null);
														orderline.setFreightAmt(freightAmt);
														orderline.save();												
														
													}
													line.setFreightAmt(freightAmt);
													line.save();
												}
											}
										}
										changed++;
									}
									else
										unchanged++;
								}
							}
						}
						else
						{						
							unchanged++;
						}
					}
				}
				unlock();
				ADialog.info(m_WindowNo, null, String.format("Resultados de exportacion\n %s cambiado(s) \n %s sin cambio(s)\n\n", changed, unchanged));
			}
			else if (this.tabbedPane.getSelectedIndex() == 1)
			{
				DefaultTableModel model = (DefaultTableModel) this.productListPriceTable.getModel();
				Boolean lContinue = true;
				lock();
				for (int j=0; j < model.getRowCount(); j++)
				{
					if ((Boolean) productListPriceTable.getValueAt(j, PLSELECTION))
					{
						BigDecimal newPrice = (BigDecimal) productListPriceTable.getValueAt(j, PLNEWPRICE);
						BigDecimal PriceLimit = (BigDecimal) productListPriceTable.getValueAt(j, PLPRICELIMIT);
						if (newPrice == null || PriceLimit == null)
						{
							lContinue = false;
							break;
						}
					}
				}
				if (!lContinue)
				{
					ADialog.error(m_WindowNo, null,"CalculateWizardAdquisition", "es obligatorio nuevo precio y limite de precio");
					unlock();
					return;
				}				
				for (int j=0; j < model.getRowCount(); j++)
				{
					if ((Boolean) productListPriceTable.getValueAt(j, PLSELECTION))
					{
						BigDecimal newPrice = (BigDecimal) productListPriceTable.getValueAt(j, PLNEWPRICE);
						BigDecimal priceLimit = (BigDecimal) productListPriceTable.getValueAt(j, PLPRICELIMIT);
						KeyNamePair p = (KeyNamePair) productListPriceTable.getValueAt(j, PLNAME);						
						Object[] params = new Object[]{newPrice,newPrice,priceLimit, M_PriceList_Version_ID, p.getKey()};
						String sql = "UPDATE M_ProductPrice SET PRICELIST=?,PRICESTD=?,PRICELIMIT=? WHERE M_PRICELIST_VERSION_ID=? AND M_PRODUCT_ID=?";
						int no = DB.executeUpdate(sql,params,false, null);
						if (no > 0)
							changed++;
						else
							unchanged++;
					}
				}	
				unlock();
				ADialog.info(m_WindowNo, null, String.format("Resultados de exportacion\n %s cambiado(s) \n %s sin cambio(s)\n\n", changed, unchanged));
			}
		}
	}
	private void lock() {
		this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
		m_waiting = new Waiting (this, Msg.getMsg(Env.getCtx(), "Processing"), false, 0);
		new Thread()
		{			
			public void run()
			{								
				if (m_waiting != null)
				{
					m_waiting.toFront();
					m_waiting.setVisible(true);
				}
			}
		}.start();
	}

	private void unlock ()
	{
		if (m_waiting != null)
			m_waiting.dispose();
		m_waiting = null;
		this.setCursor(Cursor.getDefaultCursor());
	}   //  unlock
	public boolean candispose() {
		return true;
	}		
}