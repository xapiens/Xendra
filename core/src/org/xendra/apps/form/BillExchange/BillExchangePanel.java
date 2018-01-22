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

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.swing.DefaultListModel;
import javax.swing.JDialog;
import javax.swing.JList;
import javax.swing.JSpinner;
import javax.swing.ListModel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreePath;

import org.compiere.grid.ed.VLookup;
import org.compiere.model.MAllocationHdr;
import org.compiere.model.MBOE;
import org.compiere.model.MBOELine;
import org.compiere.model.MBPartner;
import org.compiere.model.MBPartnerLocation;
import org.compiere.model.MConversionType;
import org.compiere.model.MCurrency;
import org.compiere.model.MDocType;
import org.compiere.model.MGroupDoc;
import org.compiere.model.MInvoice;
import org.compiere.model.MRetention;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_C_GroupDoc;
import org.compiere.process.DocAction;
import org.compiere.util.DB;
import org.compiere.util.Env;
import org.compiere.util.Msg;
import org.compiere.util.Trx;
import org.compiere.util.Util;

import javax.swing.JScrollPane;
import java.awt.Component;
import javax.swing.JSplitPane;
import javax.swing.JPopupMenu;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyVetoException;
import java.beans.VetoableChangeListener;

import javax.swing.JTree;
import javax.swing.JSeparator;
import javax.swing.tree.DefaultTreeModel;

public class BillExchangePanel extends JSplitPane implements 	ListSelectionListener, 
ActionListener, 
MouseListener, 
ChangeListener, 
VetoableChangeListener {

	private JList listDraftExchange  = new JList();
	private final JPopupMenu popupMenu = new JPopupMenu();
	private BillExchangeHeader BillExchangeHeaderAll = new BillExchangeHeader();
	private ArrayList<InvoiceItem> m_invoices = new ArrayList<InvoiceItem>() ;	
	private final JTree tree = new JTree();
	private final JMenuItem mntmEditar = new JMenuItem("Editar");
	private final JMenuItem mntmAgrupar = new JMenuItem("Agrupar");
	private final JSeparator separator = new JSeparator();
	private final JPopupMenu popupMenu_1 = new JPopupMenu();
	private final JMenuItem mntmDeshacer = new JMenuItem("Deshacer");
	private final JMenuItem mntmGenerar = new JMenuItem("Generar");
	private DefaultMutableTreeNode top;
	private MDocType m_DocType;
	private MBPartner partner;
	private MConversionType conversiontype;
	private MBPartnerLocation[] m_locations;
	private MCurrency currency;
	private JSpinner m_QtyBillExchange;
	private JSpinner m_QtyDueDays;
	private Integer m_C_DocType_ID;

	private VLookup m_pickCurrency;
	private VLookup m_pickConversionType;
	private InvoicePanel m_InvoicePanel;
	private int m_WindowNo;	

	public BillExchangePanel() {
		listDraftExchange.setCellRenderer(new BillExchangeRenderer());
		listDraftExchange.getSelectionModel().addListSelectionListener(this);

		JScrollPane scrollPaneAll = new JScrollPane(listDraftExchange);

		addPopup(listDraftExchange, popupMenu);
		mntmEditar.addActionListener(this);

		popupMenu.add(mntmEditar);

		popupMenu.add(separator);
		mntmAgrupar.addActionListener(this);

		popupMenu.add(mntmAgrupar);

		scrollPaneAll.setColumnHeaderView(BillExchangeHeaderAll);		
		setLeftComponent(scrollPaneAll);
		tree.setModel(new DefaultTreeModel(
				new DefaultMutableTreeNode("Grupos") {
					{
					}
				}
		));

		JScrollPane scrollPaneSel = new JScrollPane(tree);		
		addPopup(tree, popupMenu_1);		
		mntmDeshacer.addActionListener(this);
		popupMenu_1.add(mntmDeshacer);		
		mntmGenerar.addActionListener(this);
		popupMenu_1.add(mntmGenerar);
		setRightComponent(scrollPaneSel);		

		MouseListener ml = new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
			}
		};
		tree.addMouseListener(this);
		tree.setCellRenderer(new BillExchangeTreeCellRenderer());
	}


	public void fillList(ArrayList<InvoiceItem> invoices) {		
		DefaultListModel model = new DefaultListModel();				
		listDraftExchange.setModel(model);
		for (InvoiceItem invoice:invoices)
		{
			model.addElement(invoice);
		}		
	}

	public void valueChanged(ListSelectionEvent ev) {
		if (ev.getValueIsAdjusting())
			return;

		int selected[] = listDraftExchange.getSelectedIndices();
		if (selected.length > 0)
		{
			BigDecimal total = Env.ZERO;
			DefaultListModel modelAll = (DefaultListModel) listDraftExchange.getModel();
		}		
	}

	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}

	public void setInvoices(ArrayList<InvoiceItem> invoices) {
		m_invoices = invoices;
		configure(true);
	}

	public void configure(Boolean create) {
		//Timestamp dueday = new Timestamp(System.currentTimeMillis());
		// 84600000 milliseconds in a day		
		long dueday = System.currentTimeMillis();
		String qtyDue = String.valueOf((Integer) m_QtyDueDays.getValue());
		long days = Long.parseLong(qtyDue);
		long due = days * 24 * 60 * 60 * 1000;

		if (create)
		{
			BigDecimal Total = Env.ZERO;
			BigDecimal TotalbyBillExchange = Env.ZERO;
			BigDecimal TotalAdjust = Env.ZERO;
			BigDecimal Withholding = Env.ZERO;
			BigDecimal WithholdingbyBillExchange = Env.ZERO;
			BigDecimal WithholdingAdjust = Env.ZERO;
			Integer C_Withholding_ID = 0;
			for (InvoiceItem invoice:m_invoices)
			{
				Total = Total.add(invoice.getOpen());
				Withholding = Withholding.add(invoice.getWithholdingAmt());
				if (invoice.getC_Withholding_ID() > 0)
					C_Withholding_ID = invoice.getC_Withholding_ID();
				
			}		

			DefaultListModel modelDraft = new DefaultListModel();
			listDraftExchange.setModel(modelDraft);		 		
			int QtyBillExchange = (Integer) m_QtyBillExchange.getValue();
			TotalbyBillExchange = Total.divide(BigDecimal.valueOf(QtyBillExchange), 2, RoundingMode.HALF_UP);
			WithholdingbyBillExchange = Withholding.divide(BigDecimal.valueOf(QtyBillExchange), 2, RoundingMode.HALF_UP);
			for (int i=0; i < QtyBillExchange; i++)
			{
				BillExchangeItem item = new BillExchangeItem();
				item.setDueDate(new Timestamp(dueday));
				item.setTotal(TotalbyBillExchange);			
				item.setWithholdingAmt(WithholdingbyBillExchange);
				item.setC_Withholding_ID(C_Withholding_ID);
				modelDraft.addElement(item);
				TotalAdjust = TotalAdjust.add(TotalbyBillExchange);
				WithholdingAdjust = WithholdingAdjust.add(WithholdingbyBillExchange);
				dueday = dueday + due;
			}		
			if (modelDraft.size() > 0)
			{
				if (TotalAdjust.compareTo(Total) != 0)
				{
					if (TotalAdjust.compareTo(Total) > 0)	
					{
						TotalAdjust = TotalAdjust.subtract(Total);
						BillExchangeItem item = (BillExchangeItem) modelDraft.get(modelDraft.getSize()-1);
						item.setTotal(item.getTotal().subtract(TotalAdjust));
					}
					else
					{
						TotalAdjust = Total.subtract(TotalAdjust);
						BillExchangeItem item = (BillExchangeItem) modelDraft.get(modelDraft.getSize()-1);
						item.setTotal(item.getTotal().add(TotalAdjust));
					}
				}
				if (WithholdingAdjust.compareTo(Withholding) != 0)
				{
					if (WithholdingAdjust.compareTo(Withholding) > 0)	
					{
						WithholdingAdjust = WithholdingAdjust.subtract(Withholding);
						BillExchangeItem item = (BillExchangeItem) modelDraft.get(modelDraft.getSize()-1);
						item.setWithholdingAmt(item.getWithholdingAmt().subtract(WithholdingAdjust));
					}
					else
					{
						WithholdingAdjust = Withholding.subtract(WithholdingAdjust);
						BillExchangeItem item = (BillExchangeItem) modelDraft.get(modelDraft.getSize()-1);
						item.setWithholdingAmt(item.getWithholdingAmt().add(WithholdingAdjust));
					}					
				}
			}
		}
		else
		{
			if (listDraftExchange.getModel().getSize() > 0)
			{
				DefaultListModel modelDraft = (DefaultListModel) listDraftExchange.getModel();			
				for (int i = 0; i < modelDraft.getSize(); i ++)
				{					
					BillExchangeItem item = (BillExchangeItem) modelDraft.get(i);
					item.setDueDate(new Timestamp(dueday));
					dueday = dueday + due;					
				}
			}
		}
		listDraftExchange.updateUI();
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(mntmEditar))
		{
			DefaultListModel modelDraft = (DefaultListModel) listDraftExchange.getModel();
			if (modelDraft.size() > 0)
			{
				ArrayList<BillExchangeItem> boes = new ArrayList<BillExchangeItem>();
				for (int i=0; i < modelDraft.size(); i ++)
				{
					BillExchangeItem item = (BillExchangeItem) modelDraft.get(i);
					boes.add(item);
				}
				BillExchangeListEdit dialog = new BillExchangeListEdit();
				dialog.setBillExchanges(boes);
				dialog.setMode("Created");
				dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
				dialog.setVisible(true);
				listDraftExchange.updateUI();
				if (dialog.IsOK())
				{
					Timestamp Created = dialog.getdateCreated();
					for (BillExchangeItem boe:boes)
					{
						boe.setBOEDate(Created);
					}
				}
			}
		}
		else if (e.getSource().equals(mntmAgrupar))
		{

			DefaultListModel modelDraft = (DefaultListModel) listDraftExchange.getModel();
			if (modelDraft.size() > 0)
			{
				// calculamos el total
				BigDecimal total = Env.ZERO;
				for (int i=0; i < modelDraft.size(); i ++)
				{
					BillExchangeItem boe = (BillExchangeItem) modelDraft.get(i);
					total = total.add(boe.getTotal());
				}				
				MGroupDoc groupdoc = new MGroupDoc(Env.getCtx(), 0, null);
				groupdoc.setName(new Date().toString());
				groupdoc.setC_BPartner_ID(partner.getC_BPartner_ID());
				if (groupdoc.save())
				{						
					DefaultMutableTreeNode tgroup = new DefaultMutableTreeNode(groupdoc);
					for (int i=0; i < modelDraft.size(); i ++)
					{
						BillExchangeItem item = (BillExchangeItem) modelDraft.get(i);
						MBOE boe = new MBOE(Env.getCtx(), 0, null);						
						boe.setC_BPartner_ID(partner.getC_BPartner_ID());
						boe.setC_GroupDoc_ID(groupdoc.getC_GroupDoc_ID());
						boe.setDocStatus(DocAction.STATUS_Drafted);
						if (item.getDocumentNo().length()>0)
							boe.setDocumentNo(item.getDocumentNo());
						boe.setDocAction(DocAction.ACTION_Portfolio);
						boe.setDueDate(item.getDueDate());
						boe.setStatusDate(new Timestamp(System.currentTimeMillis()));
						boe.setDateBOE(item.getBOEDate());
						boe.setC_DocType_ID(m_DocType.getC_DocType_ID());
						boe.setC_DocTypeTarget_ID(m_DocType.getC_DocType_ID());
						boe.setC_BPartner_Location_ID(m_locations[0].getC_Location_ID());
						boe.setC_Currency_ID(currency.getC_Currency_ID());
						boe.setC_ConversionType_ID(conversiontype.getC_ConversionType_ID());
						boe.setC_Withholding_ID(item.getC_Withholding_ID());
						boe.setWithholdingAmt(item.getWithholdingAmt());
						boe.setGrandTotal(item.getTotal());
						boe.setProcessed(false);
						boe.setIsSOTrx(m_DocType.isSOTrx());
						if (boe.save())
						{
							DefaultMutableTreeNode tboe = new DefaultMutableTreeNode(boe);
							for (InvoiceItem invoice:m_invoices)
							{
								BigDecimal factor = boe.getGrandTotal().divide(total, 10 , BigDecimal.ROUND_HALF_UP);
								BigDecimal totalInvoice   = invoice.getOpen();
								BigDecimal totalRetention = invoice.getRetention();
								totalInvoice = totalInvoice.subtract(totalRetention);
								totalInvoice = totalInvoice.multiply(factor).setScale(2, BigDecimal.ROUND_HALF_UP);
								MBOELine boeline = new MBOELine(boe);		
								if (invoice.IsInvoice())
								{
									boeline.setC_Invoice_ID(invoice.getC_Invoice_ID());
									MInvoice inv = MInvoice.get(Env.getCtx(), invoice.getC_Invoice_ID());
									DefaultMutableTreeNode tinvoice = new DefaultMutableTreeNode(inv);
									tboe.add(tinvoice);
								}
								else
								{
									boeline.setC_Invoice_ID(0);
									boeline.setRef_BOE_ID(invoice.getC_Invoice_ID());
								}
								boeline.setC_GroupDoc_ID(groupdoc.getC_GroupDoc_ID());
								boeline.setAmount(totalInvoice);
								boeline.setProcessed(false);
								boeline.save();												
							}
							tgroup.add(tboe);
						}
					}
					DefaultTreeModel model = (DefaultTreeModel) tree.getModel();			
					DefaultMutableTreeNode root = (DefaultMutableTreeNode) model.getRoot();					
					model.insertNodeInto(tgroup, root, 0);
					while (modelDraft.size() > 0)
					{
						modelDraft.remove(0);
					}
					m_invoices = new ArrayList<InvoiceItem>();
					m_InvoicePanel.clearSel();
				}
			}
		}		
		else if (e.getSource().equals(mntmGenerar))
		{	
			//DefaultListModel modelDraft = (DefaultListModel) listDraftExchange.getModel();
			//ArrayList<BillExchangeItem> boes = new ArrayList<BillExchangeItem>();
			
			TreePath path = tree.getSelectionPath();
			if (path != null)
			{
				DefaultTreeModel model = (DefaultTreeModel) (tree.getModel());
				DefaultMutableTreeNode nd = (DefaultMutableTreeNode) path.getLastPathComponent();
				Object xc = nd.getUserObject();
				if (xc instanceof X_C_GroupDoc)
				{
					Trx m_trx = Trx.get(Trx.createTrxName(Util.getUUID()), true);
					String trxName = m_trx.getTrxName();
					try {						
						//
						X_C_GroupDoc group = (X_C_GroupDoc) nd.getUserObject();

						MBOE[] boes = MBOE.getGroup(group.getC_GroupDoc_ID(), trxName);
						BillExchangeListEdit dialog = new BillExchangeListEdit();
						//dialog.setBillExchanges(boes);
						dialog.setMode("Exchange");
						dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
						dialog.setVisible(true);
						//listDraftExchange.updateUI();
						if (dialog.IsOK())
						{
							Timestamp Exchange = dialog.getdateExchange();							
						
							MAllocationHdr alloc = new MAllocationHdr(Env.getCtx(),
									false /* is manual */, 
									Exchange,
									currency.getC_Currency_ID(),
									Msg.translate(Env.getCtx(), "C_GroupDoc_ID") + ": " + group.getC_GroupDoc_ID(), trxName);
							alloc.setAD_Org_ID(Env.getAD_Org_ID(Env.getCtx()));
							alloc.setIsExchange(true);
							if (!alloc.save())
							{	
								throw new Exception("no se pudo grabar alloc");
							}							
							group.setC_AllocationHdr_ID(alloc.getC_AllocationHdr_ID());
							if (!group.save(trxName))
							{
								throw new Exception("no se pudo grabar group");
							}
							
							for (int j = 0; j < boes.length ; j++) 
							{
								MBOE boe = boes[j];
								boolean sucessfully = false;
								try {
									sucessfully  = boe.processIt(DocAction.ACTION_Portfolio);
								} catch (Exception ex) {
									ex.printStackTrace();
								}
								if (sucessfully && boe.save())					
								{
									if (!boe.save())
									{
										throw new Exception("no se pudo grabar boe");
									}			
	
								}
								else
								{
									throw new Exception(boe.getProcessMsg());						
								}
							}
	
							MRetention[] retentions = MRetention.getGroup(group.getC_GroupDoc_ID(), trxName);
	
							for (int j = 0; j < retentions.length ; j++) 
							{
								MRetention retention = retentions[j];
								boolean sucessfully = false;
								try {
									sucessfully  = retention.processIt(DocAction.ACTION_ToCollect);
								} catch (Exception ex) {
									ex.printStackTrace();
								}
								if (sucessfully && retention.save())					
								{
									if (!retention.save())
									{
										throw new Exception("no se pudo grabar retention");
									}			
	
								}
								else
								{
									throw new Exception(retention.getProcessMsg());
								}					
							}
	
							alloc = new MAllocationHdr(Env.getCtx(), group.getC_AllocationHdr_ID(), trxName);
							if (alloc.processIt(DocAction.ACTION_Complete))
							{
								if (!alloc.save())
								{
									throw new Exception("no se pudo grabar alloc");
								}
							}
							else
							{
								throw new Exception(alloc.getProcessMsg());
							}
							group.setProcessed(true);					
							if (!group.save())
							{
								throw new Exception("no se pudo grabar group");
							}			
							//
							model.removeNodeFromParent(nd);
							m_trx.commit();
						}
						else
						{
							m_trx.rollback();
						}
					}
					catch (Exception ex2)
					{
						ex2.printStackTrace();
						m_trx.rollback();
					}
					finally 
					{
						m_trx.close();
					}
				}
			}
		}
		else if (e.getSource().equals(mntmDeshacer))
		{
			TreePath path = tree.getSelectionPath();
			if (path != null)
			{
				DefaultTreeModel model = (DefaultTreeModel) (tree.getModel());
				DefaultMutableTreeNode nd = (DefaultMutableTreeNode) path.getLastPathComponent();
				Object xc = nd.getUserObject();
				if (xc instanceof X_C_GroupDoc)
				{
					X_C_GroupDoc group = (X_C_GroupDoc) nd.getUserObject();
					if ( deletegroup(MBOE.Table_Name, group.getC_GroupDoc_ID()) && 
							deletegroup(MBOELine.Table_Name,group.getC_GroupDoc_ID()) && 
							deletegroup(MGroupDoc.Table_Name, group.getC_GroupDoc_ID()) &&
							deletegroup(MRetention.Table_Name, group.getC_GroupDoc_ID()))
					{
						model.removeNodeFromParent(nd);
					}

				}
			}
		}	
	}

	private boolean deletegroup(String tableName, int C_GroupDoc_ID) {
		StringBuffer sql = new StringBuffer("DELETE FROM "+tableName+" WHERE C_GroupDoc_ID=").append(C_GroupDoc_ID);
		int no = DB.executeUpdate(sql.toString(), null);
		return true;
	}


	public String Load(MBPartner partner) {
		this.partner = partner;		
		m_locations = partner.getLocations(false);
		if (m_locations.length == 0)
			return "no hay direccion";
		//String where = " C_BPartner_ID = ? AND Processed = 'N' ";

		String where = " C_BPartner_ID = ? ";
		String orderBy = " C_GroupDoc_ID Desc ";
		List<X_C_GroupDoc> groups = new Query(Env.getCtx(), X_C_GroupDoc.Table_Name, where, null)
		.setParameters(partner.getC_BPartner_ID()).setOrderBy(orderBy).list();

		top = new DefaultMutableTreeNode("Grupos");

		for (X_C_GroupDoc group:groups)
		{
			DefaultMutableTreeNode tgroup = new DefaultMutableTreeNode(group);			
			MBOE[] boes = MBOE.getGroup(group.getC_GroupDoc_ID(), null);
			if (boes.length > 0)
			{
				for (MBOE boe:boes)
				{
					DefaultMutableTreeNode tboe = new DefaultMutableTreeNode(boe);					
					MBOELine[] belines = boe.getLines(true);
					for (MBOELine beline:belines)
					{
						MInvoice invoice = MInvoice.get(Env.getCtx(), beline.getC_Invoice_ID());
						DefaultMutableTreeNode tinvoice = new DefaultMutableTreeNode(invoice);
						tboe.add(tinvoice);
					}
					tgroup.add(tboe);
				}
			}
			//m_boesQty = boes.length;		
			MRetention[] retentions = MRetention.getGroup(group.getC_GroupDoc_ID(), null);
			if (retentions.length > 0)
			{
				for (MRetention retention:retentions)
				{
					DefaultMutableTreeNode tretention = new DefaultMutableTreeNode(retention);
					tgroup.add(tretention);
				}
			}
			top.add(tgroup);
		}		
		DefaultTreeModel model = (DefaultTreeModel)tree.getModel();
		model.setRoot(top);
		return "";
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub		
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
		int selRow = tree.getRowForLocation(e.getX(), e.getY());
		TreePath selPath = tree.getPathForLocation(e.getX(), e.getY());
		if(selRow != -1) {
			if (e.getButton() == 3) // boton izquierdo
			{
				DefaultMutableTreeNode nd = (DefaultMutableTreeNode) tree.getSelectionPath().getLastPathComponent();
				Object xc = nd.getUserObject();
				if (xc instanceof X_C_GroupDoc)
				{
					X_C_GroupDoc group = (X_C_GroupDoc) nd.getUserObject();
					if (group.isProcessed())
					{
						mntmDeshacer.setEnabled(false);
						mntmGenerar.setEnabled(false);            			
					}
					else
					{
						mntmDeshacer.setEnabled(true);
						mntmGenerar.setEnabled(true);						
					}
				}
				else if (xc instanceof MBOE)
				{
					mntmDeshacer.setEnabled(false);
					mntmGenerar.setEnabled(false);
				}
				else if (xc instanceof MInvoice)
				{
					mntmDeshacer.setEnabled(false);
					mntmGenerar.setEnabled(false);
				}        		
			}
		}		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub		
	}

	public void setQtyBillExchange(JSpinner QtyBillExchange) {
		m_QtyBillExchange = QtyBillExchange;
		m_QtyBillExchange.addChangeListener(this);
	}

	public void setCurrency(VLookup pickCurrency) {
		m_pickCurrency = pickCurrency;
		m_pickCurrency.addVetoableChangeListener(this);
	}

	public void setConversionType(VLookup pickConversionType) {
		m_pickConversionType = pickConversionType;
		m_pickConversionType.addVetoableChangeListener(this);
	}

	public void setQtyDueDays(JSpinner QtyDueDays) {
		m_QtyDueDays = QtyDueDays;
		m_QtyDueDays.addChangeListener(this);
	}

	public void stateChanged(ChangeEvent e) {
		if (e.getSource().equals(m_QtyDueDays))
			configure(false);
		else
			configure(true);
	}

	public void setDocType(MDocType docType) {
		m_DocType = docType;		
	}

	public MDocType getDocType()
	{
		return m_DocType;
	}

	public void vetoableChange(PropertyChangeEvent e)
	throws PropertyVetoException {
		String name = e.getPropertyName();
		Object value = e.getNewValue();		
		if (value == null)
			return;

		if (name.equals("B_C_Currency_ID"))
		{
			currency = MCurrency.get(Env.getCtx(),(Integer) value);
		}
		else if (name.equals("C_ConversionType_ID"))
		{
			conversiontype = MConversionType.get(Env.getCtx(), (Integer) value);
		}		
		//		
		configure(false);		
	}


	public void setInvoicePanel(InvoicePanel invoicePanel) {
		m_InvoicePanel = invoicePanel;		
	}


	public void setWindowNo(int windowNo) {
		m_WindowNo = windowNo;		
	}


	public String isok() {
		String error = "";
		if (currency == null)
			error += " moneda ";
		if (conversiontype == null)
			error += " tipo de cambio ";
		if (error.length() > 0)
			error = String.format("debe seleccionar %s", error);
		return error;
	}
}