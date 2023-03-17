package org.xendra.mfe.gui.modeler;

import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.JPanel;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.TreePath;

import org.columba.core.gui.frame.DefaultContainer;
import org.compiere.apps.SwingWorker;
import org.compiere.model.MTable;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_AD_Column;
import org.compiere.model.persistence.X_AD_Table;
import org.compiere.util.Env;
import org.jdom.Element;
import org.xendra.mfe.gui.propertysheet.PropertySheetPage;
import org.xendra.mfe.gui.tree.TreeController;
import org.xendra.mfe.gui.tree.TreeView;
import org.xendra.model.AbstractFolder;

import com.mxgraph.model.mxCell;
import com.mxgraph.view.mxGraph;


public class MessageEditor extends JPanel  implements TreeSelectionListener {
	private AbstractFolder selectedFolder;
	private SchemaGraphComponent graphcomponent;
	private Double x = new Double(20);
	private Double y = new Double(20);
	private PropertySheetPage m_propertysheet;
	private TreeController m_tree;
	private List<Element> sections = new ArrayList<Element>();
	public MessageEditor()  {
		
	}
	public void setGraphComponent() {
		this.setLayout(new BorderLayout());		
		add(getGraphComponent(), BorderLayout.CENTER);					
	}
	public SchemaGraphComponent getGraphComponent() {
		if (graphcomponent == null) {
			graphcomponent = new SchemaGraphComponent(new customgraph());
			graphcomponent.setEditor(this);
			graphcomponent.setPropertyEditor(getPropertyEditor());
			graphcomponent.setTreeController(getTreeController());
		}
		graphcomponent.getGraphControl().addMouseListener(new MouseAdapter()
		{
			public void mouseReleased(MouseEvent e) {
				Object cell = graphcomponent.getCellAt(e.getX(), e.getY());
				if (cell != null) {
					JMessageRenderer r = graphcomponent.getMessageRenderer(cell);
					if (r != null) {
						//getTreeController().findNode(r.)
					}
				}
			}
		});
		return graphcomponent;
	}
	private PropertySheetPage getPropertyEditor() {
		return m_propertysheet;
	}

	public void setPropertyEditor(PropertySheetPage propertysheet) {
		m_propertysheet =  propertysheet;
	}

	public void setTreeController(TreeController tree) {
		m_tree = tree;
	}
	public TreeController getTreeController() {
		return m_tree;
	}
	@Override
	public void valueChanged(TreeSelectionEvent e) {
		if (!(e.getSource() instanceof TreeView))
			return;
		TreeView treeview = (TreeView) e.getSource();		
		TreePath p = treeview.getSelectionPath(); 
		if (p != null) {
			AbstractFolder folder = (AbstractFolder) p.getLastPathComponent();
			Element item = folder.getNode();
			String m_type = item.getName();			
			if (m_type == "section") {
				DefaultContainer cnt = (DefaultContainer) treeview.getFrameController().getView().getFrame();
				rendersection(folder, cnt);
			}
		}
	}
	private void rendersection(final AbstractFolder folder, final DefaultContainer cnt) {
		SwingWorker nw = new SwingWorker() {
			public Object construct() {
				cnt.setBusy(true);
				if (!sections.contains(folder.getNode())) {
					sections.add(folder.getNode());
					Element e = folder.getNode();
					mxGraph graph = getGraphComponent().getGraph();
					graph.getModel().beginUpdate();
					Object parentgraph= graph.getDefaultParent();
					HashMap<String, Double> dimension = folder.getDimension();
					x = x + dimension.get("width") + 5;
					mxCell v1 = (mxCell) graph.insertVertex(parentgraph, 
							e.getAttributeValue("uid"), 
							e.getAttributeValue("name"), 
							x, 
							y, 
							dimension.get("width"), 
							dimension.get("height"));
					v1.setValue(folder.getNode());
					v1.setVertex(true);
					//
//					if (folder.getChildCount() > 0) {
//						for (int c=0; c < folder.getChildCount(); c++) {
//							AbstractFolder child = (AbstractFolder) folder.getChildAt(c);
//							Element el = child.getElement();
//							String columnid = el.getAttributeValue("columnid");
//							if (columnid == null)
//								columnid = "";
//							if (columnid.length() > 0) {
//								X_AD_Column column = new Query(Env.getCtx(), X_AD_Column.Table_Name, "Identifier = ?", null)
//									.setParameters(columnid).first();
//								if (column != null) {
//									MTable table = new Query(Env.getCtx(), X_AD_Table.Table_Name, "AD_Table_ID = ?", null)
//									.setParameters(column.getAD_Table_ID()).first();
//									if (table != null) {
//										HashMap<String, Double> d = table.getDimension();
//										x = x + d.get("width") + 5;										
//										mxCell v2 = (mxCell) graph.insertVertex(v1, String.valueOf(table.getAD_Table_ID()), table.getName(), 
//												x , 
//												y , 
//												d.get("width"), 
//												d.get("height"));
//										//v2.setEdge(true);													
//									}
//								}
//							}
//						}
//					}
					graph.getModel().endUpdate();
				}
				cnt.setBusy(false);
				return Boolean.TRUE;
			}
		};
		nw.start();
	}
}
