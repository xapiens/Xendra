/******************************************************************************
 * Product: Xendra ERP & CRM Smart Business Solution                          *
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
package org.compiere.apps.form;

import java.awt.*;
import java.awt.event.*;
import java.beans.*;
import java.math.*;
import java.sql.*;
import java.util.*;
import java.util.logging.*;

import javax.swing.*;
import javax.swing.event.*;

import org.xendra.apps.form.VAdvanceBills;
import org.xendra.plaf.XendraPLAF;
import org.compiere.apps.*;
import org.compiere.grid.ed.*;
import org.compiere.minigrid.*;
import org.compiere.model.MInvoice;
import org.compiere.model.MLookup;
import org.compiere.model.MLookupFactory;
import org.compiere.model.MLookupInfo;
import org.compiere.model.MPInstance;
import org.compiere.model.MPInstancePara;
import org.compiere.plaf.*;
import org.compiere.print.*;
import org.compiere.process.*;
import org.compiere.swing.*;
import org.compiere.util.*;

/**
 *	Manual Shipment Selection
 *
 *  @author Jorg Janke
 *  @version $Id: VInOutGen.java 5498 2014-12-22 06:24:51Z xapiens $
 */
public class VInOutGen extends CPanel
	implements FormPanel, ActionListener, VetoableChangeListener, 
		ChangeListener, TableModelListener, ASyncProcess
{
	/**
	 *	Initialize Panel
	 *  @param WindowNo window
	 *  @param frame frame
	 */
	public void init (int WindowNo, FormFrame frame)
	{
		log.info("");
		m_WindowNo = WindowNo;
		m_frame = frame;
		Env.setContext(Env.getCtx(), m_WindowNo, "IsSOTrx", "Y");
		try
		{
			fillPicks();
			jbInit();
			dynInit();
			frame.getContentPane().add(tabbedPane, BorderLayout.CENTER);
			frame.getContentPane().add(statusBar, BorderLayout.SOUTH);
		}
		catch(Exception ex)
		{
			log.log(Level.SEVERE, "init", ex);
		}
	}	//	init

	/**	Window No			*/
	private int         	m_WindowNo = 0;
	/**	FormFrame			*/
	private FormFrame 		m_frame;

	private boolean			m_selectionActive = true;
	private Object 			m_M_Warehouse_ID = null;
	private Object 			m_M_ToWarehouse_ID = null;
	private Object 			m_C_BPartner_ID = null;
	/**	Logger			*/
	private static CLogger log = CLogger.getCLogger(VInOutGen.class);
	//
	private CTabbedPane tabbedPane = new CTabbedPane();
	private CPanel selPanel = new CPanel();
	private JSplitPane orderPanel = new JSplitPane();
	private CPanel selNorthPanel = new CPanel();
	private BorderLayout selPanelLayout = new BorderLayout();
	private CLabel lWarehouse = new CLabel();
	private VLookup fWarehouse;
	private CLabel lToWarehouse = new CLabel();
	private VLookup fToWarehouse;
	private CLabel lBPartner = new CLabel();
	private VLookup fBPartner;
	private ConfirmPanel confirmPanelSel = new ConfirmPanel(true);
	private ConfirmPanel confirmPanelGen = new ConfirmPanel(false, true, false, false, false, false, true);
	private StatusBar statusBar = new StatusBar();
	private CPanel genPanel = new CPanel();
	private BorderLayout genLayout = new BorderLayout();
	private CTextPane info = new CTextPane();
	private JScrollPane scrollOrderPane = new JScrollPane();
	private JScrollPane scrollOrderLinePane = new JScrollPane();
	private MiniTable orderTable = new MiniTable();
	private MiniTable orderLineTable = new MiniTable();
	private JCheckBox fComplete = new JCheckBox();
	private JCheckBox fInvoiced = new JCheckBox();
	private JCheckBox fInvoiceComplete = new JCheckBox("Completar Factura");
	private VDate pickDate = new VDate();
	private int orderLineProduct  = 2;
	private int orderQtyOrdered = 3;
	private int orderQtyOnHand = 4;
	private int orderQtyDelivered = 5;
	private int orderQtyInquired = 6;

	/** User selection */
	private ArrayList<Integer> orderLineSelection = null;
	Vector<Vector<Object>> orderLineVector = new Vector<Vector<Object>>();
	
	private Trx trx = null;
	private boolean m_callout = false;
	private StringBuffer iTextInOutGenerated;
	private VLookup pickDocType;
	private CButton pickInvoiceAdvance;
	private CLabel lDocType = new CLabel("Tipo de Documento:");
	private Collection<Object> params;
	private static final String A_ADVANCE = "Advance";
	private static final String InvoiceAdvance = "Factura adelantada";
	/**
	 *	Static Init.
	 *  <pre>
	 *  selPanel (tabbed)
	 *      fOrg, fBPartner
	 *      scrollPane & miniTable
	 *  genPanel
	 *      info
	 *  </pre>
	 *  @throws Exception
	 */
	void jbInit() throws Exception
	{
		CompiereColor.setBackground(this);
		//
		Env.setContext(Env.getCtx(), m_WindowNo, "IsSOTrx", true);
		//int C_BPartner_ID = Env.getContextAsInt(Env.getCtx(), m_curWindowNo, "C_BPartner_ID");			

		AppsAction aa = new AppsAction (A_ADVANCE, null, InvoiceAdvance);
		this.pickInvoiceAdvance = (CButton)aa.getButton();
		this.pickInvoiceAdvance.setEnabled(false);

		int AD_Column_ID = Util.getColumnID(MInvoice.Table_ID, "C_DocTypeTarget_ID");    //  C_Order.C_DocTypeTarget_ID
		
		MLookup lookupConversionType = MLookupFactory.get (Env.getCtx(), m_WindowNo, 0, AD_Column_ID, DisplayType.TableDir);
		pickDocType = new VLookup("C_DocTypeTarget_ID", false, false, true, lookupConversionType);
		
		AD_Column_ID = Util.getColumnID(MInvoice.Table_ID,"C_Invoice_ID");
		//MLookup lookupInvoice = MLookupFactory.get (Env.getCtx(), m_WindowNo, 0, AD_Column_ID, DisplayType.Search);		

		MLookupInfo lookupInfo = MLookupFactory.getLookupInfo (Env.getCtx(), m_WindowNo, AD_Column_ID, DisplayType.TableDir,
		Env.getLanguage(Env.getCtx()), "C_Invoice_ID", 0,	false, "IsAdvance='Y'");
		
		MLookup lookupInvoice = new MLookup (lookupInfo, 0);
		
		pickInvoiceAdvance.addActionListener(this);
		
		selPanel.setLayout(selPanelLayout);
		lWarehouse.setLabelFor(fWarehouse);
		lBPartner.setLabelFor(fBPartner);
		lBPartner.setText(Msg.translate(Env.getCtx(), "C_BPartner_ID"));
		fComplete.setText("Completar guia");
		fComplete.setSelected(true);
		fComplete.addChangeListener(this);
		fInvoiced.setText("Generar Factura");
		fInvoiced.setSelected(true);
		fInvoiced.addChangeListener(this);
		pickDate.setValue(Env.getContextAsDate(Env.getCtx(), "#Date"));
		//selNorthPanel.setLayout(northPanelLayout);
		selNorthPanel.setLayout(new ALayout());
		//northPanelLayout.setAlignment(FlowLayout.LEFT);
		tabbedPane.add(selPanel, Msg.getMsg(Env.getCtx(), "Select"));
		selPanel.add(selNorthPanel, BorderLayout.NORTH);
		selNorthPanel.add(lWarehouse, new ALayoutConstraint(0,0));
		selNorthPanel.add(fWarehouse, null);
		selNorthPanel.add(lBPartner, null);
		selNorthPanel.add(fBPartner, null);
		selNorthPanel.add(lToWarehouse, new ALayoutConstraint(1,0));
		selNorthPanel.add(fToWarehouse, null);
		selNorthPanel.add(new CLabel("Fecha de envio:"), null);
		selNorthPanel.add(pickDate, null);
		selNorthPanel.add(fComplete,new ALayoutConstraint(2,0));
		selNorthPanel.add(fInvoiced,null);
		selNorthPanel.add(lDocType,null);
		selNorthPanel.add(pickDocType,null);
		selNorthPanel.add(fInvoiceComplete,null);
		selNorthPanel.add(pickInvoiceAdvance,null);
		selPanel.setName("selPanel");
		selPanel.add(confirmPanelSel, BorderLayout.SOUTH);
		scrollOrderPane.getViewport().add(orderTable, null);
		scrollOrderLinePane.getViewport().add(orderLineTable, null);
		orderPanel.setOrientation(JSplitPane.VERTICAL_SPLIT);
		orderPanel.setBorder(BorderFactory.createEtchedBorder());
		orderPanel.add(scrollOrderPane, JSplitPane.TOP);
		orderPanel.add(scrollOrderLinePane, JSplitPane.BOTTOM);
		orderPanel.setContinuousLayout(true);
		orderPanel.setPreferredSize(new Dimension(845,300));
		orderPanel.setDividerLocation(130);

		selPanel.add(orderPanel, BorderLayout.CENTER);
		confirmPanelSel.addActionListener(this);
		//
		tabbedPane.add(genPanel, Msg.getMsg(Env.getCtx(), "Generate"));
		genPanel.setLayout(genLayout);
		genPanel.add(info, BorderLayout.CENTER);
		genPanel.setEnabled(false);
		info.setBackground(XendraPLAF.getFieldBackground_Inactive());
		info.setEditable(false);
		genPanel.add(confirmPanelGen, BorderLayout.SOUTH);
		confirmPanelGen.addActionListener(this);
	}	//	jbInit

	/**
	 *	Fill Picks.
	 *		Column_ID from C_Order
	 *  @throws Exception if Lookups cannot be initialized
	 */
	private void fillPicks() throws Exception
	{
		//	C_OrderLine.M_Warehouse_ID
		MLookup orgL = MLookupFactory.get (Env.getCtx(), m_WindowNo, 0, 2223, DisplayType.TableDir);
		fWarehouse = new VLookup ("M_Warehouse_ID", true, false, true, orgL);
		lWarehouse.setText("Almacén Origen:");
		fWarehouse.addVetoableChangeListener(this);
		m_M_Warehouse_ID = fWarehouse.getValue();

		//	C_OrderLine.M_Warehouse_ID
		MLookup orgLTo = MLookupFactory.get (Env.getCtx(), m_WindowNo, 0, 2223, DisplayType.TableDir);
		fToWarehouse = new VLookup ("M_ToWarehouse_ID", true, false, true, orgLTo);
		lToWarehouse.setText("Almacén Destino:");
		fToWarehouse.addVetoableChangeListener(this);
		m_M_ToWarehouse_ID = fToWarehouse.getValue();

		//	C_Order.C_BPartner_ID
		MLookup bpL = MLookupFactory.get (Env.getCtx(), m_WindowNo, 0, 2762, DisplayType.Search);
		fBPartner = new VLookup ("C_BPartner_ID", false, false, true, bpL);
		lBPartner.setText(Msg.translate(Env.getCtx(), "C_BPartner_ID"));
		fBPartner.addVetoableChangeListener(this);
	}	//	fillPicks

	/**
	 *	Dynamic Init.
	 *	- Create GridController & Panel
	 *	- AD_Column_ID from C_Order
	 */
	private void dynInit()
	{
		
		
		//  create Columns
		orderTable.addColumn("C_Order_ID");
		orderTable.addColumn("AD_Org_ID");
		orderTable.addColumn("C_DocType_ID");
		orderTable.addColumn("DocumentNo");
		orderTable.addColumn("C_BPartner_ID");
		orderTable.addColumn("DateOrdered");
		orderTable.addColumn("TotalLines");
		orderTable.addColumn("C_BPartner_Location_ID");
		//
		orderTable.setMultiSelection(true);
		orderTable.setRowSelectionAllowed(true);
		//  set details
		orderTable.setColumnClass(0, IDColumn.class, false, " ");
		orderTable.setColumnClass(1, String.class, true, Msg.translate(Env.getCtx(), "AD_Org_ID"));
		orderTable.setColumnClass(2, String.class, true, Msg.translate(Env.getCtx(), "C_DocType_ID"));
		orderTable.setColumnClass(3, String.class, true, Msg.translate(Env.getCtx(), "DocumentNo"));
		orderTable.setColumnClass(4, String.class, true, Msg.translate(Env.getCtx(), "C_BPartner_ID"));
		orderTable.setColumnClass(5, Timestamp.class, true, Msg.translate(Env.getCtx(), "DateOrdered"));
		orderTable.setColumnClass(6, BigDecimal.class, true, Msg.translate(Env.getCtx(), "TotalLines"));
		orderTable.setColumnClass(7, String.class, true, Msg.translate(Env.getCtx(), "C_BPartner_Location_ID"));
		//
		orderTable.autoSize();
		orderTable.getModel().addTableModelListener(this);
		//
		orderLineTable.addColumn("M_OrderLine_ID");
		orderLineTable.addColumn("Line");
		orderLineTable.addColumn("M_Product_ID");							
		orderLineTable.addColumn("QtyOrdered");
		orderLineTable.addColumn("QtyOnHand");
		orderLineTable.addColumn("QtyDelivered");
		orderLineTable.addColumn("QtyInquired");
		orderLineTable.addColumn("C_UOM_ID");
		//
		orderLineTable.setMultiSelection(true);
		orderLineTable.setRowSelectionAllowed(true);
		//
		orderLineTable.setColumnClass(0, IDColumn.class,false, "");
		orderLineTable.setColumnClass(1, String.class, true,Msg.translate(Env.getCtx(),"Line"));
		orderLineTable.setColumnClass(2, String.class, true,Msg.translate(Env.getCtx(),"M_Product_ID"));
		orderLineTable.setColumnClass(orderQtyOrdered, BigDecimal.class, true,Msg.translate(Env.getCtx(),"QtyOrdered"));
		orderLineTable.setColumnClass(orderQtyOnHand, BigDecimal.class, true,Msg.translate(Env.getCtx(),"QtyOnHand"));
		orderLineTable.setColumnClass(orderQtyDelivered, BigDecimal.class, true,Msg.translate(Env.getCtx(),"QtyDelivered"));
		orderLineTable.setColumnClass(orderQtyInquired, BigDecimal.class, false,Msg.translate(Env.getCtx(),"QtyConfirmed"));
		orderLineTable.setColumnClass(7, String.class, true,Msg.translate(Env.getCtx(),"C_UOM_ID"));
		//
		orderLineTable.autoSize();
		orderLineTable.getModel().addTableModelListener(this);
		//
		orderTable.getSelectionModel().addListSelectionListener(
				new ListSelectionListener() {
					public void valueChanged(ListSelectionEvent event) {
						int viewRow = orderTable.getSelectedRow();
						if (viewRow < 0 ) {
							
						} else {
							if (m_M_ToWarehouse_ID == null )
							{
								ADialog.error(m_WindowNo, null, "necesita seleccionar el almacen destino");
								return;
							}
							buildorderLineTable(viewRow);
						}
					}

					private void buildorderLineTable(int viewRow) {
						Vector<Vector<Object>> data = new Vector<Vector<Object>>();
	                	Integer Key  =  ((IDColumn) orderTable.getValueAt(viewRow, 0)).getRecord_ID();
	                	
						StringBuffer sql = new StringBuffer("SELECT ol.C_OrderLine_ID,")
								.append("ol.Line, ")
								.append("ol.M_Product_ID, ")
								.append("p.name,")
								.append("ol.QtyOrdered,")				
								.append("bomQtyOnHand(ol.M_Product_ID,?,0) AS QtyOnHand,")
								.append("ol.QtyDelivered,")
								.append("u.name")
							.append(" FROM C_OrderLine ol ")
							.append(" LEFT OUTER JOIN M_Product p ON ol.M_Product_ID = p.M_Product_ID ")
							.append(" LEFT OUTER JOIN C_UOM u ON ol.C_UOM_ID = u.C_UOM_ID ")
							.append(" WHERE ol.C_Order_ID=? ORDER BY line");
						
						int row = 0;
						orderLineTable.setRowCount(row);

						try
						{
							PreparedStatement pstmt = DB.prepareStatement(sql.toString(), null);							
							pstmt.setInt(1, (Integer)m_M_ToWarehouse_ID);
							pstmt.setInt(2, Key);
							ResultSet rs = pstmt.executeQuery();
							while (rs.next())
							{
								//  extend table
								orderLineTable.setRowCount(row+1);
								//  set values
								IDColumn id = new IDColumn(rs.getInt(1));
								Enumeration en = orderLineVector.elements();
								while (en.hasMoreElements())
								{
									Vector<Object> line =  (Vector<Object>) en.nextElement();
									Integer key = (Integer) line.lastElement();
									if ( key.equals(id.getRecord_ID()) )
									{
										//IDColumn idorder = (IDColumn)orderLineTable.getValueAt(row, 0);     //  ID in column 0
										id.setSelected(true);
									}
								}
								m_callout = true;
								orderLineTable.setValueAt(id, row, 0);   //  C_OrderLine_ID
								orderLineTable.setValueAt(rs.getString(2), row, 1);              //  No Line
								orderLineTable.setValueAt(new KeyNamePair(rs.getInt(3),rs.getString(4)), row, orderLineProduct);              //  Product
								orderLineTable.setValueAt(rs.getBigDecimal(5), row, orderQtyOrdered);              //  QtyOrdered
								orderLineTable.setValueAt(rs.getBigDecimal(6), row, orderQtyOnHand);              //  QtyOnHand
								orderLineTable.setValueAt(rs.getBigDecimal(7), row, orderQtyDelivered); // QtyDelivered
								orderLineTable.setValueAt(rs.getString(8), row, 7);           //  Unidad de medida
								m_callout = false;
								row ++;
								
							}
							orderLineTable.autoSize();
							rs.close();
							pstmt.close();
						}
						catch (SQLException e)
						{
							log.log(Level.SEVERE, sql.toString(), e);
						}						
					}
				}
		);
		//	Info
		statusBar.setStatusLine(Msg.getMsg(Env.getCtx(), "InOutGenerateSel"));//@@
		statusBar.setStatusDB(" ");
		//	Tabbed Pane Listener
		tabbedPane.addChangeListener(this);
	}	//	dynInit

	/**
	 *  Query Info
	 */
	private void executeOrderQuery()
	{
		log.info("");
		int AD_Client_ID = Env.getAD_Client_ID(Env.getCtx());
		//  Create SQL
		//select loc.address1 from c_bpartner_location bpl LEFT OUTER JOIN c_location loc ON bpl.c_location_id = loc.c_location_id 

		StringBuffer sql = new StringBuffer(
			"SELECT C_Order_ID, o.Name, dt.Name, DocumentNo, bp.Name, DateOrdered, TotalLines, loc.address1 AS address "
			+ "FROM M_InOut_Candidate_v ic, AD_Org o, C_BPartner bp, C_DocType dt, " 
			+ "c_bpartner_location bpl LEFT OUTER JOIN c_location loc ON bpl.c_location_id = loc.c_location_id "
			+ "WHERE ic.AD_Org_ID=o.AD_Org_ID"
			+ " AND ic.C_BPartner_ID=bp.C_BPartner_ID"
			+ " AND ic.C_DocType_ID=dt.C_DocType_ID"
			+ " AND ic.C_BPartner_Location_ID=bpl.C_BPartner_Location_ID"
			+ " AND ic.AD_Client_ID=?");

		if (m_M_Warehouse_ID != null)
			sql.append(" AND ic.M_Warehouse_ID=").append(m_M_Warehouse_ID);
		if (m_C_BPartner_ID != null)
			sql.append(" AND ic.C_BPartner_ID=").append(m_C_BPartner_ID);
		//
		sql.append(" ORDER BY o.Name,bp.Name,DateOrdered");
		log.fine(sql.toString());

		//  reset table
		int row = 0;
		orderTable.setRowCount(row);
		//  Execute
		try
		{
			PreparedStatement pstmt = DB.prepareStatement(sql.toString(), null);
			pstmt.setInt(1, AD_Client_ID);
			ResultSet rs = pstmt.executeQuery();
			//
			while (rs.next())
			{
				//  extend table
				orderTable.setRowCount(row+1);
				//  set values
				orderTable.setValueAt(new IDColumn(rs.getInt(1)), row, 0);   //  C_Order_ID
				orderTable.setValueAt(rs.getString(2), row, 1);              //  Org
				orderTable.setValueAt(rs.getString(3), row, 2);              //  DocType
				orderTable.setValueAt(rs.getString(4), row, 3);              //  Doc No
				orderTable.setValueAt(rs.getString(5), row, 4);              //  BPartner
				orderTable.setValueAt(rs.getTimestamp(6), row, 5);           //  DateOrdered
				orderTable.setValueAt(rs.getBigDecimal(7), row, 6);          //  TotalLines
				orderTable.setValueAt(rs.getString(8), row, 7);              //  Partner Location
				//  prepare next
				row++;
			}
			rs.close();
			pstmt.close();
		}
		catch (SQLException e)
		{
			log.log(Level.SEVERE, sql.toString(), e);
		}
		//
		orderTable.autoSize();
	//	statusBar.setStatusDB(String.valueOf(miniTable.getRowCount()));
	}   //  executeQuery

	/**
	 * 	Dispose
	 */
	public void dispose()
	{
		if (m_frame != null)
			m_frame.dispose();
		m_frame = null;
	}	//	dispose

	/**
	 *	Action Listener
	 *  @param e event
	 */
	public void actionPerformed (ActionEvent e)
	{
		log.info("Cmd=" + e.getActionCommand());
		//
		if (e.getActionCommand().equals(ConfirmPanel.A_CANCEL))
		{
			dispose();
			return;
		}
		
		if (e.getActionCommand().equals(A_ADVANCE))
		{
			FormFrame ff = new FormFrame(getGraphicsConfiguration());
			VAdvanceBills advancebills = new VAdvanceBills();			
			advancebills.init(m_WindowNo, ff);
			params = new ArrayList<Object>();
			advancebills.setInfo(params);
			advancebills.setPanel((CPanel) this);
			AEnv.addToWindowManager(ff);
			AEnv.showCenterScreen(ff);
			return;
		}
		//
		saveSelection();
		if (orderLineSelection != null
			&& orderLineSelection.size() > 0
			&& m_selectionActive	//	on selection tab
			&& m_M_Warehouse_ID != null )
		{
			if (fInvoiced.isSelected() && pickDocType.getValue() == null)
			{
				ADialog.error(m_WindowNo, this, "Si genera Factura debe seleccionar el Tipo de Documento");
				return;
			}			
			generateShipments ();
		}
		else
			dispose();
	}	//	actionPerformed

	public void validate()
	{
		super.validate();
		if ( params != null && params.size() > 0 )
		{
			BigDecimal AdvanceTotal = Env.ZERO;
			Object[] advance = params.toArray();
			for (int x=0; x < advance.length; x++)
			{
				if ( advance[x] instanceof BigDecimal )
				{
					AdvanceTotal = AdvanceTotal.add((BigDecimal) advance[x]);
				}
			}
			this.pickInvoiceAdvance.setText(InvoiceAdvance.concat(" "+AdvanceTotal.toString()));
			
			
		}
	}
	/**
	 *	Vetoable Change Listener - requery
	 *  @param e event
	 */
	public void vetoableChange(PropertyChangeEvent e)
	{
		log.info(e.getPropertyName() + "=" + e.getNewValue());
		if (e.getPropertyName().equals("M_ToWarehouse_ID"))
		{
			m_M_ToWarehouse_ID = e.getNewValue();
			// reprocessing QtyOnHand
			int rows = orderLineTable.getRowCount();
			for (int i = 0; i < rows; i++)
			{
				KeyNamePair key = (KeyNamePair) orderLineTable.getValueAt(i, orderLineProduct);
				if (key.getKey() > 0)
				{
					BigDecimal QtyOnHand = DB.getSQLValueBD(null, "SELECT bomQtyOnHand(?,?,0)",key.getKey() , (Integer) m_M_ToWarehouse_ID);
					orderLineTable.setValueAt(QtyOnHand, i, orderQtyOnHand);
				}
			}
			return;
		}
		if (e.getPropertyName().equals("M_Warehouse_ID"))
			m_M_Warehouse_ID = e.getNewValue();
		if (e.getPropertyName().equals("C_BPartner_ID"))
		{
			m_C_BPartner_ID = e.getNewValue();
			fBPartner.setValue(m_C_BPartner_ID);	//	display value
			if (m_C_BPartner_ID != null)
			{				
				Env.setContext(Env.getCtx(), m_WindowNo, "C_BPartner_ID", (Integer) m_C_BPartner_ID);
				if (params != null && params.size() > 0) // reseteamos parametros de facturas adelantadas
					params = new ArrayList<Object>(); 
				String sql =" SELECT COUNT(*) from C_Invoice i WHERE i.Processed='Y' AND i.IsAdvance='Y'  AND i.IsSOTrx='Y' AND i.C_BPartner_ID=?  ";
				sql.concat(" AND NOT EXISTS (SELECT 1 FROM C_InvoiceAdvance WHERE C_Invoice_ID = i.C_Invoice_ID AND Processed = 'Y' ) ");
				int no = DB.getSQLValue(null, sql, m_C_BPartner_ID);
				if (no > 0)
					pickInvoiceAdvance.setEnabled(true);
				else
				{
					if (pickInvoiceAdvance.isEnabled())
						pickInvoiceAdvance.setEnabled(false);
				}
			}
		}
		executeOrderQuery();
	}	//	vetoableChange

	/**
	 *	Change Listener (Tab changed)
	 *  @param e event
	 */
	public void stateChanged (ChangeEvent e)
	{
		if (e.getSource() == fComplete)
		{
			fInvoiced.setSelected(fComplete.isSelected());
		}
		pickDocType.setVisible(fInvoiced.isSelected());
		lDocType.setVisible(fInvoiced.isSelected());
		fInvoiceComplete.setVisible(fInvoiced.isSelected());
		//lPickInvoiceAdvance.setVisible(fInvoiced.isSelected());
		pickInvoiceAdvance.setVisible(fInvoiced.isSelected());		
		int index = tabbedPane.getSelectedIndex();
		m_selectionActive = (index == 0);
	}	//	stateChanged

	/**
	 *  Table Model Listener
	 *  @param e event
	 */
	public void tableChanged(TableModelEvent e)
	{
		if (m_callout)
			return;
		boolean isOrder = (e.getSource().equals(orderTable.getModel()));
		if (isOrder && !m_callout) {
			int rowsSelected = 0;
			int rows = orderTable.getRowCount();
			for (int i = 0; i < rows; i++)
			{
				IDColumn id = (IDColumn)orderTable.getValueAt(i, 0);     //  ID in column 0
				if (id != null && id.isSelected())
					rowsSelected++;
			}
			statusBar.setStatusDB(" " + rowsSelected + " ");
		}
		else
		{
			if (e.getColumn() == 0) {
				int row = e.getFirstRow();
				int col = e.getColumn();
				IDColumn id = (IDColumn)orderLineTable.getValueAt(row, 0);     //  ID in column 0
				if (id != null && id.isSelected())
				{
					boolean found = false;
					m_callout = true;
					//					
					BigDecimal qtyOnHand = (BigDecimal) orderLineTable.getValueAt( row, orderQtyOnHand);
					if (qtyOnHand == null)
						qtyOnHand = Env.ZERO;
					BigDecimal qtyOrdered = (BigDecimal) orderLineTable.getValueAt( row, orderQtyOrdered);
					if (qtyOrdered == null)
						qtyOrdered = Env.ZERO;
					BigDecimal qtyDelivered = (BigDecimal) orderLineTable.getValueAt(row , orderQtyDelivered);
					if (qtyDelivered == null)
						qtyDelivered = Env.ZERO;
					BigDecimal qtyInquired = qtyOrdered.subtract(qtyDelivered);
					if(qtyOnHand.intValue() == 0)
					{
						id.setSelected(false);
						Enumeration en = orderLineVector.elements();
						while (en.hasMoreElements())
						{
							Vector<Object> line =  (Vector<Object>) en.nextElement();
							Integer key = (Integer) line.lastElement();
							if ( key.equals(id.getRecord_ID()) )
							{
								orderLineVector.remove(line);
							}
						}
						orderLineTable.setValueAt(id,row,0);
						orderLineTable.setValueAt(Env.ZERO, row, orderQtyInquired);
						m_callout = false;
						return;
					}
					else if (qtyOnHand.compareTo(qtyInquired) < 0 )
					{
						qtyInquired = qtyOnHand;
					}
					IDColumn idorder = (IDColumn)orderTable.getValueAt(orderTable.getSelectedRow(), 0);     //  ID in column 0
					if (!idorder.isSelected())
					{
						idorder.setSelected(true);
						orderTable.setValueAt(idorder,orderTable.getSelectedRow(), 0);
					}
					//BigDecimal totalqtyInquired = qtyInquired.add((BigDecimal) orderLineTable.getValueAt(row, orderQtyDelivered));
					//
					orderLineTable.setValueAt(qtyInquired, row, orderQtyInquired);
					m_callout = false;
					Enumeration en = orderLineVector.elements();
					while (en.hasMoreElements())
					{
						Vector<Object> line =  (Vector<Object>) en.nextElement();
						Integer key = (Integer) line.lastElement();
						if ( key.equals(id.getRecord_ID()) )
						{
							found = true;
						}
					}
					if (!found)
					{
						Vector<Object> line = new Vector<Object>();
						IDColumn OrderID = (IDColumn) orderTable.getValueAt(orderTable.getSelectedRow(), 0); 
						line.add(OrderID.getRecord_ID());       //  Order
						line.add(orderLineTable.getValueAt( row, orderQtyInquired));
						line.add(id.getRecord_ID());
						orderLineVector.add(line);
					}
				}
				else
				{
					Enumeration en = orderLineVector.elements();
					while (en.hasMoreElements())
					{
						Vector<Object> line =  (Vector<Object>) en.nextElement();
						Integer key = (Integer) line.lastElement();
						if ( key.equals(id.getRecord_ID()) )
						{
							orderLineVector.remove(line);
						}
					}
					m_callout = true;
					orderLineTable.setValueAt(Env.ZERO, row, orderQtyInquired);
					m_callout = false;
				}
			}
			else if(e.getColumn() == orderQtyInquired )
			{
				if (!m_callout )
				{
					int row = e.getFirstRow();
					BigDecimal qtyInquired = (BigDecimal) orderLineTable.getValueAt(row, orderQtyInquired);
					if (qtyInquired == null)
						return;
					BigDecimal qtyOnHand = (BigDecimal) orderLineTable.getValueAt( row, orderQtyOnHand);
					if (qtyOnHand == null)
						qtyOnHand = Env.ZERO;
					BigDecimal qtyOrdered = (BigDecimal) orderLineTable.getValueAt( row, orderQtyOrdered);
					if (qtyOrdered == null)
						qtyOrdered = Env.ZERO;
					BigDecimal totalqtyInquired = qtyInquired.add((BigDecimal) orderLineTable.getValueAt(row, orderQtyDelivered));
					if (totalqtyInquired.compareTo(qtyOrdered) <= 0 && qtyInquired.compareTo(qtyOnHand) <= 0)
					{
						IDColumn id = (IDColumn)orderLineTable.getValueAt(row, 0);     //  ID in column 0
						if (id != null && id.isSelected())
						{
							Enumeration en = orderLineVector.elements();
							while (en.hasMoreElements())
							{
								Vector<Object> line =  (Vector<Object>) en.nextElement();
								Integer key = (Integer) line.lastElement();
								if ( key.equals(id.getRecord_ID()) )
								{
									line.set(1, orderLineTable.getValueAt( row, orderQtyInquired));
								}
							}
						}
					}
					else
					{
						m_callout = true;
						orderLineTable.setValueAt(Env.ZERO, row, orderQtyInquired);
						ADialog.error(m_WindowNo, this, Msg.translate(Env.getCtx(),"QtyInsufficient"));
						orderLineTable.grabFocus();
						m_callout = false;
					}
				}
			}
		}
	}   //  tableChanged

	/**
	 *	Save Selection & return selecion Query or ""
	 *  @return where clause like C_Order_ID IN (...)
	 */
	private void saveSelection()
	{
		log.info("");
		//  ID selection may be pending
		orderTable.editingStopped(new ChangeEvent(this));
		orderLineTable.editingStopped(new ChangeEvent(this));
		//  Array of Integers
		//ArrayList<ArrayList<Integer>> results = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> results = new ArrayList<Integer>();
		orderLineSelection = null;

//		//	Get selected entries
//		int rows = orderTable.getRowCount();
//		for (int i = 0; i < rows; i++)
//		{
//			IDColumn id = (IDColumn)orderTable.getValueAt(i, 0);     //  ID in column 0
//		//	log.fine( "Row=" + i + " - " + id);
//			if (id != null && id.isSelected())
//				results.add(id.getRecord_ID());
//		}
		int rows = orderTable.getRowCount();
		for (int i = 0; i < rows; i++)
		{
			IDColumn id = (IDColumn)orderTable.getValueAt(i, 0);     //  ID in column 0
		//	log.fine( "Row=" + i + " - " + id);
			if (id != null && id.isSelected())
			{
				Enumeration en = orderLineVector.elements();
				while (en.hasMoreElements())
				{
					Vector<Object> line =  (Vector<Object>) en.nextElement();
					Integer orderKey = (Integer) line.firstElement();
					if (orderKey.equals(id.getRecord_ID()))
					{
						Integer key = (Integer) line.lastElement();
						results.add(key);
					}
				}				
			}
		}
		if (results.size() == 0)
			return;
		log.config("Selected #" + results.size());
		orderLineSelection = results;
		
	}	//	saveSelection

	
	/**************************************************************************
	 *	Generate Shipments
	 */
	private void generateShipments ()
	{
		log.info("M_ToWarehouse_ID=" + m_M_ToWarehouse_ID);
		String trxName = Trx.createTrxName("IOG");	
		trx = Trx.get(trxName, true);	//trx needs to be committed too
		
		m_selectionActive = false;  //  prevents from being called twice
		statusBar.setStatusLine(Msg.getMsg(Env.getCtx(), "InOutGenerateGen"));
		statusBar.setStatusDB(String.valueOf(orderLineSelection.size()));

		//	Prepare Process
		//int AD_Process_ID = 199;	  // M_InOutCreate - org.compiere.process.InOutGenerate
		int AD_Process_ID = 199;	  // M_InOutCreate - org.compiere.process.InOutLineGenerate
		MPInstance instance = new MPInstance(Env.getCtx(), AD_Process_ID, 0);
		if (!instance.save())
		{
			info.setText(Msg.getMsg(Env.getCtx(), "ProcessNoInstance"));
			return;
		}
		
		//insert selection
		StringBuffer insert = new StringBuffer();
		insert.append("INSERT INTO T_SELECTION2(AD_PINSTANCE_ID, T_SELECTION_ID,QUERY_ID) ");
		int counter = 0;
		int stock = 0;
		for(Integer selectedId : orderLineSelection)
		{
			counter++;
			Enumeration en = orderLineVector.elements();
			while (en.hasMoreElements())
			{
				Vector<Object> line =  (Vector<Object>) en.nextElement();
				Integer orderLineKey = (Integer) line.lastElement();
				if (orderLineKey.equals(selectedId))
				{
					stock = ((BigDecimal) line.get(1)).intValue();
				}
			}				
			if (counter > 1)
				insert.append(" UNION ");
			insert.append("SELECT ");
			insert.append(instance.getAD_PInstance_ID());
			insert.append(", ");
			insert.append(selectedId);
			insert.append(", ");
			insert.append(stock);
			insert.append("  ");
			
			if (counter == 1000) 
			{
				if ( DB.executeUpdate(insert.toString(), trxName) < 0 )
				{
					String msg = "No Shipments";     //  not translated!
					log.config(msg);
					info.setText(msg);
					trx.rollback();
					return;
				}
				insert = new StringBuffer();
				insert.append("INSERT INTO T_SELECTION2(AD_PINSTANCE_ID, T_SELECTION_ID,QUERY_ID) ");
				counter = 0;
			}
		}
		if (counter > 0)
		{
			if ( DB.executeUpdate(insert.toString(), trxName) < 0 )
			{
				String msg = "No Shipments";     //  not translated!
				log.config(msg);
				info.setText(msg);
				trx.rollback();
				return;
			}
		}
		
		//call process
		ProcessInfo pi = new ProcessInfo ("VInOutGen", AD_Process_ID);
		pi.setAD_PInstance_ID (instance.getAD_PInstance_ID());

		//	Add Parameter - Selection=Y
		MPInstancePara ip = new MPInstancePara(instance, 10);
		ip.setParameter("Selection","Y");
		if (!ip.save())
		{
			String msg = "No Parameter added";  //  not translated
			info.setText(msg);
			log.log(Level.SEVERE, msg);
			return;
		}
		//	Add Parameter - M_Warehouse_ID=x
		ip = new MPInstancePara(instance, 20);
		ip.setParameter("M_Warehouse_ID", Integer.parseInt(m_M_ToWarehouse_ID.toString()));
		if (!ip.save())
		{
			String msg = "No Parameter added";  //  not translated
			info.setText(msg);
			log.log(Level.SEVERE, msg);
			return;
		}
		//	Add Parameter - Date Shipment
		ip = new MPInstancePara(instance, 30);
		ip.setParameterName("DateShipment");
		ip.setP_Date((Timestamp) pickDate.getValue());
		//ip.setParameter("DateShipment", pickDate.getValue().toString() );
		if (!ip.save())
		{
			String msg = "No Parameter added";  //  not translated
			info.setText(msg);
			log.log(Level.SEVERE, msg);
			return;
		}
		//.add(fInvoiced,null);
		// If not completing, then add the drafted parameter
		if (fComplete.isSelected() == false) {
			ip = new MPInstancePara(instance, 40);
			ip.setParameter("DocAction", "PR");
			if (!ip.save())
			{
				String msg = "No Parameter added";  //  not translated
				info.setText(msg);
				log.log(Level.SEVERE, msg);
				return;
			}
		}
		//	Execute Process
		ProcessCtl worker = new ProcessCtl(this, Env.getWindowNo(this), pi, trx);
		worker.start();     //  complete tasks in unlockUI / generateShipments_complete
		//
	}	//	generateShipments

	/**************************************************************************
	 *	Generate Invoice
	 * @param pi 
	 */
	private void generateInvoices (ProcessInfo pi)
	{
		if (ADialog.ask(m_WindowNo, this, "InvGenerateGen"))
		{
			setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
			int[] ids = pi.getIDs();
			//	Loop through all items
			for (int i = 0; i < ids.length; i++)
			{
				int AD_Process_ID = Util.getProcessID("M_InOut_CreateInvoice");	  // M_InOutCreate - org.compiere.process.InOutLineGenerate
				MPInstance instance = new MPInstance(Env.getCtx(), AD_Process_ID, 0);
				if (!instance.save())
				{
					info.setText(Msg.getMsg(Env.getCtx(), "ProcessNoInstance"));
					return;
				}
				ProcessInfo pinfo = new ProcessInfo ("M_InOut_CreateInvoice", AD_Process_ID);
				pinfo.setAD_PInstance_ID (instance.getAD_PInstance_ID());
				pinfo.setRecord_ID(ids[i]);
				MPInstancePara ip = new MPInstancePara(instance, 10);
				ip.setParameter("C_DocTypeTarget_ID", (Integer) pickDocType.getValue());
				if (!ip.save())
				{
					String msg = "No Parameter added C_DocTypeTarget_ID";  //  not translated
					info.setText(msg);
					log.log(Level.SEVERE, msg);
					return;
				}
				if (!fInvoiceComplete.isSelected()) // el proceso por defecto considera completar  x ello solo cuando sea !CO.
				{
					ip = new MPInstancePara(instance, 20);
					ip.setParameter("DocAction", "PR");
					if (!ip.save())
					{
						String msg = "No Parameter added Complete";  //  not translated
						info.setText(msg);
						log.log(Level.SEVERE, msg);
						return;
					}
				}

				if (params != null && params.size() > 0)
				{
					Object[] advance = params.toArray();			
					ip = new MPInstancePara(instance, 30);
					ip.setParameter("C_InvoiceAdvance_ID", (Integer) advance[0]);
					if (!ip.save())
					{
						String msg = "No se agrego parametro";
						info.setText(msg);
						log.log(Level.SEVERE, msg);
						return;				
					}
											
					ip = new MPInstancePara(instance, 40);
					ip.setParameter("InvoiceAdvanceAmount", (BigDecimal) advance[1]);
					if (!ip.save())
					{
						String msg = "No se agrego parametro";
						info.setText(msg);
						log.log(Level.SEVERE, msg);
						return;				
					}
					
				}				
				ProcessCtl worker = new ProcessCtl(null, Env.getWindowNo(this), pinfo, trx);
				worker.run();     //  complete tasks in unlockUI / generateShipments_complete
				ProcessInfoUtil.setLogFromDB(pinfo);
				StringBuffer iText = new StringBuffer();
				iText.append(iTextInOutGenerated.toString());
				iText.append("<b>").append(pinfo.getSummary())
					.append("</b><br>(")
					.append(Msg.getMsg(Env.getCtx(), "InvGenerateGen"))
					//  Shipments are generated depending on the Delivery Rule selection in the Order
					.append(")<br>")
					.append(pinfo.getLogInfo(true));
				info.setText(iText.toString());
				//	Add Parameter - Selection=Y
				//int M_InOut_ID = ids[i];
				//ReportCtl.startDocumentPrint(ReportEngine.SHIPMENT, M_InOut_ID, this, Env.getWindowNo(this), true);
			}
			setCursor(Cursor.getDefaultCursor());
		}	//	OK to print shipments		
	}
	/**
	 *  Complete generating shipments.
	 *  Called from Unlock UI
	 *  @param pi process info
	 */
	private void generateShipments_complete (ProcessInfo pi)
	{
		
		trx.commit();
		trx.close();

		//  Switch Tabs
		tabbedPane.setSelectedIndex(1);
		//
		ProcessInfoUtil.setLogFromDB(pi);
		iTextInOutGenerated = new StringBuffer();
		iTextInOutGenerated.append("<b>").append(pi.getSummary())
			.append("</b><br>(")
			.append(Msg.getMsg(Env.getCtx(), "InOutGenerateInfo"))
			//  Shipments are generated depending on the Delivery Rule selection in the Order
			.append(")<br>")
			.append(pi.getLogInfo(true));
		info.setText(iTextInOutGenerated.toString());

		//	Reset Selection
		/*
		String sql = "UPDATE C_Order SET IsSelected='N' WHERE " + m_whereClause;
		int no = DB.executeUpdate(sql, null);
		log.config("Reset=" + no);*/

		//	Get results
		int[] ids = pi.getIDs();
		if (ids == null || ids.length == 0)
			return;
		log.config("PrintItems=" + ids.length);

		confirmPanelGen.getOKButton().setEnabled(false);
		//	OK to print shipments
		if (ADialog.ask(m_WindowNo, this, "PrintShipments"))
		{
		//	info.append("\n\n" + Msg.getMsg(Env.getCtx(), "PrintShipments"));
			setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
			int retValue = ADialogDialog.A_CANCEL;	//	see also ProcessDialog.printShipments/Invoices
			do
			{
				//	Loop through all items
				for (int i = 0; i < ids.length; i++)
				{
					int M_InOut_ID = ids[i];
					ReportCtl.startDocumentPrint(ReportEngine.SHIPMENT, M_InOut_ID, this, Env.getWindowNo(this), true);
				}
				ADialogDialog d = new ADialogDialog (m_frame,
					Env.getHeader(Env.getCtx(), m_WindowNo),
					Msg.getMsg(Env.getCtx(), "PrintoutOK?"),
					JOptionPane.QUESTION_MESSAGE);
				retValue = d.getReturnCode();
			}
			while (retValue == ADialogDialog.A_CANCEL);
			setCursor(Cursor.getDefaultCursor());
		}	//	OK to print shipments

		//
		confirmPanelGen.getOKButton().setEnabled(true);
	}   //  generateShipments_complete

	
	/**************************************************************************
	 *  Lock User Interface.
	 *  Called from the Worker before processing
	 *  @param pi process info
	 */
	public void lockUI (ProcessInfo pi)
	{
		this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
		this.setEnabled(false);
	}   //  lockUI

	/**
	 *  Unlock User Interface.
	 *  Called from the Worker when processing is done
	 *  @param pi result of execute ASync call
	 */
	public void unlockUI (ProcessInfo pi)
	{
		this.setEnabled(true);
		this.setCursor(Cursor.getDefaultCursor());
		//
		generateShipments_complete(pi);
		if (fInvoiced.isSelected())
			generateInvoices(pi);
	}   //  unlockUI

	/**
	 *  Is the UI locked (Internal method)
	 *  @return true, if UI is locked
	 */
	public boolean isUILocked()
	{
		return this.isEnabled();
	}   //  isUILocked

	/**
	 *  Method to be executed async.
	 *  Called from the Worker
	 *  @param pi ProcessInfo
	 */
	public void executeASync (ProcessInfo pi)
	{
	}   //  executeASync
	public boolean candispose() {
		return true;
	}	
}	//	VInOutGen
