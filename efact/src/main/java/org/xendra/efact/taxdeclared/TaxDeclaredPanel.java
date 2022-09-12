package org.xendra.efact.taxdeclared;

import java.awt.Color;
import java.math.BigDecimal;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.Calendar;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.TreePath;

import org.columba.api.gui.frame.event.FrameEvent;
import org.columba.api.gui.frame.event.IFrameMediatorListener;
import org.compiere.apps.SwingWorker;
import org.compiere.model.MBPartnerCertificate;
import org.compiere.util.DB;
import org.compiere.util.Env;
import org.jdom.Element;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;
import org.xendra.efact.EFactConstants;
import org.xendra.efact.gui.frame.EFactFrameController;
import org.xendra.efact.gui.tree.TreeController;
import org.xendra.efact.folder.EFactTreeNode;
import org.xendra.efact.gui.tree.TreeView;
import org.xendra.util.SelectPO;

public class TaxDeclaredPanel extends JPanel implements IFrameMediatorListener, TreeSelectionListener  {

	private EFactFrameController controller;
	private TreeController m_tree;
	public TaxDeclaredPanel(EFactFrameController controller) {
		this.controller = controller;			
		this.controller.addListener(this);
	}

	@Override
	public void titleChanged(FrameEvent event) {
	}

	@Override
	public void statusMessageChanged(FrameEvent event) {
	}

	@Override
	public void taskStatusChanged(FrameEvent event) {
	}

	@Override
	public void visibilityChanged(FrameEvent event) {
	}

	@Override
	public void layoutChanged(FrameEvent event) {
	}

	@Override
	public void closed(FrameEvent event) {
	}

	@Override
	public void toolBarVisibilityChanged(FrameEvent event) {
	}

	@Override
	public void switchedComponent(FrameEvent event) {		
	}
	private void load() {
		SelectPO po = new SelectPO();	
		po.setField("ad_client_id");
		po.setField("ad_org_id");
		po.setField("dateinvoiced");
		po.setField("invoiced");
		po.setField("afected");
		po.setField("declared");
		po.setTablename("tax_invoice_year");
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try
		{					
			pstmt = DB.prepareStatement (po.getQuery(), null);
			rs = pstmt.executeQuery ();
			while (rs.next ())
			{
				DefaultPieDataset dataset = new DefaultPieDataset();
				int AD_Client_ID = rs.getInt("ad_client_id");
				int AD_Org_ID = rs.getInt("ad_org_id");
				Timestamp DateInvoice = rs.getTimestamp("dateinvoiced");
				BigDecimal invoiced = rs.getBigDecimal("invoiced");
				BigDecimal afected = rs.getBigDecimal("afected");				
				BigDecimal declared = rs.getBigDecimal("declared");
				afected = afected.subtract(declared);
				dataset.setValue("invoiced", invoiced);
				dataset.setValue("afected", afected);
				dataset.setValue("declared", declared);
				Pane pane = new Pane(DateInvoice, dataset);		        
				add(pane, "wrap");
			}
			rs.close ();
			pstmt.close ();
			pstmt = null;			
		}		
		catch (Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			DB.close(rs, pstmt);
			rs = null; pstmt = null;
		}		
	}
	class Pane extends JPanel {
		public Pane(Timestamp DateInvoice, DefaultPieDataset dataset) {
			super();			
			setOpaque(true);
			JFreeChart chart = createChart(DateInvoice, dataset);
			ChartPanel chartPanel = new ChartPanel(chart, false);
			chartPanel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
			chartPanel.setBackground(Color.white);		        		        
			chartPanel.setPreferredSize(new java.awt.Dimension(320, 200));
			JScrollPane pane = new JScrollPane(chartPanel);
			add(pane);
		}
	}
	private JFreeChart createChart(Timestamp Period, DefaultPieDataset dataset) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(Period);
		int Year = calendar.get(Calendar.YEAR);    	
		JFreeChart pieChart = ChartFactory.createPieChart(
				String.valueOf(Year),
				dataset,
				true, true, false);

		return pieChart;
	}

	public void setTreeController(TreeController tree) {
		m_tree = tree;		
	}

	@Override
	public void valueChanged(TreeSelectionEvent e) {
		if (!(e.getSource() instanceof TreeView))
			return;
		TreeView treeview = (TreeView) e.getSource();		
		TreePath p = treeview.getSelectionPath(); 
		if (p != null) {
			EFactTreeNode folder = (EFactTreeNode) p.getLastPathComponent();
			Element item = folder.getElement();
			String m_type = item.getName();
			if (m_type.equals("Partner")) {
				Integer id = Integer.valueOf(folder.getNode().getAttributeValue("uid"));
				MBPartnerCertificate pc = new MBPartnerCertificate(Env.getCtx(), id, null);
				if (pc.getBoolean(EFactConstants.CHECKSTATUS)) {
					SwingWorker nw = new SwingWorker() {
						public Object construct() {
							controller.getContainer().setBusy(true);
							load();
							controller.getContainer().setBusy(false);
							return Boolean.TRUE;
						}

					};
					nw.start();											
				}
			}
		}
	}		
}
