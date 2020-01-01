package org.xendra.modeleditor.gui.modeleditor;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import javax.swing.JPanel;
import javax.swing.Modeler;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.TreePath;

import org.columba.core.gui.frame.DefaultContainer;
import org.compiere.apps.SwingWorker;
import org.compiere.model.MColumn;
import org.compiere.model.MTable;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_AD_Column;
import org.compiere.model.persistence.X_AD_Table;
import org.compiere.util.DisplayType;
import org.compiere.util.Env;
import org.jdom.Element;
import org.xendra.modeleditor.folder.AbstractFolder;
import org.xendra.modeleditor.folder.ModelEditorTreeNode;
import org.xendra.modeleditor.gui.propertysheet.PropertySheetPage;
import org.xendra.modeleditor.gui.tree.TreeController;
import org.xendra.modeleditor.gui.tree.TreeView;
import com.mxgraph.model.mxCell;
import com.mxgraph.view.mxGraph;

public class ModelEditor extends JPanel  implements TreeSelectionListener {
	private AbstractFolder selectedFolder;
	private Modeler modeler;
	private SchemaGraphComponent graphcomponent;
	//private Integer currenttableid = 0;
	HashMap models = new HashMap();	
	HashMap<Integer, MTable> tables = new HashMap<Integer, MTable>();
	private Double x = new Double(20);
	private Double y = new Double(20);
	private String m_currentmodel;
	private PropertySheetPage m_propertysheet;
	private TreeController m_tree;

	public ModelEditor() {		
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
		
			public void mouseReleased(MouseEvent e)
			{
				Object cell = graphcomponent.getCellAt(e.getX(), e.getY());
				
				if (cell != null)
				{
					JTableRenderer r = graphcomponent.getTableRenderer(cell);
					if (r != null) {
						getTreeController().findNode(r.table.getTableID());
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
			Element item = folder.getElement();
			String m_type = item.getName();
			if (m_type == "table") {
				//Integer id = Integer.valueOf(item.get("uid"));
				Integer id = Integer.valueOf(item.getAttributeValue("uid"));
				if (id > 0)
				{
					X_AD_Table table = new Query(Env.getCtx(), X_AD_Table.Table_Name, "AD_Table_ID = ?", null)
					.setParameters(id).first();					
					//if (table.getAD_Table_ID() != currenttableid) {
					//clearmodel();
					//currenttableid = table.getAD_Table_ID();
					DefaultContainer cnt = (DefaultContainer) treeview.getFrameController().getView().getFrame();
					//rendermodel(currentid, cnt);
					//rendertable(currenttableid, cnt);
					rendertable(id, cnt);
					//}
				}
			}
		}
		selectedFolder = null;				

	}
	private void setModel(String id) {
		m_currentmodel = id;
	}
	private String getModel() {
		return m_currentmodel;
	}
	private void rendertable(final Integer modelid, final DefaultContainer cnt) {
		SwingWorker nw = new SwingWorker() {
			public Object construct() {
				cnt.setBusy(true);
				if (!tables.containsKey(modelid)) {
					MTable table = new Query(Env.getCtx(), X_AD_Table.Table_Name, "AD_Table_ID = ?", null)
					.setParameters(modelid).first();
					if (table != null) {
						tables.put(modelid, table);
						mxGraph graph = getGraphComponent().getGraph();
						graph.getModel().beginUpdate();						
						HashMap<String, Double> dimension = table.getDimension();					
						Object parentgraph = graph.getDefaultParent();
						x = x + dimension.get("width") + 5;
						mxCell v1 = (mxCell) graph.insertVertex(parentgraph, String.valueOf(table.getAD_Table_ID()), table.getName(), 
								x , 
								y , 
								dimension.get("width"), 
								dimension.get("height"));
						v1.setVertex(true);
						// tables relationships
						List<X_AD_Column> columns = new Query(Env.getCtx(), X_AD_Column.Table_Name, "AD_Table_ID = ?", null)
						.setParameters(modelid).list();
						for (X_AD_Column column:columns) {
							if (column.getAD_Reference_ID() == DisplayType.TableDir) {
								String tablename = column.getColumnName().substring(0, column.getColumnName().toUpperCase().indexOf("_ID"));
								table = new Query(Env.getCtx(), X_AD_Table.Table_Name, "TableName = ?", null)
								.setParameters(tablename).first();
								if (table != null) {
								if (!tables.containsKey(table.getAD_Table_ID())) {
									tables.put(table.getAD_Table_ID(), table);
									dimension = table.getDimension();
									x = x + dimension.get("width") + 5;
									v1 = (mxCell) graph.insertVertex(parentgraph, String.valueOf(table.getAD_Table_ID()), table.getName(),											
											x, 
											y, 
											dimension.get("width"), 
											dimension.get("height"));
									v1.setVertex(true);									
								}
								} else {
									System.out.println("X");
								}
								
							}
						}
						graph.getModel().endUpdate();
					}
				} else {
					Object[] sadasdsada = getGraphComponent().getGraphControl().getComponents();
					for (Object object:sadasdsada) {
						if (object instanceof JTableRenderer) {
							JTableRenderer ctrl =  (JTableRenderer) object;
							if (ctrl.table.tableid == modelid) {
								getGraphComponent().getGraph().setSelectionCell(ctrl);
								getGraphComponent().invalidate();
								break;
							}
							//ctrl.getVertex(ctrl);
							//getGraphComponent().getGraphControl().computeVisibleRect(ctrl);
						}
					}
				}
				//mxGraph graph = getGraphComponent().getGraph();
				//Object parentgraph = graph.getDefaultParent();
				cnt.setBusy(false);
				return Boolean.TRUE;
			}			
		};
		nw.start();
	}
	private void rendermodel(String modelid, final DefaultContainer cnt) {		
		int x = 20;
		int y = 20;
		int width = 150;
		int height = 200;
		setModel(modelid);
		try
		{
			if (models.containsKey(modelid)) {
				SwingWorker nw = new SwingWorker() {					
					public Object construct() {
						cnt.setBusy(true);
						int x = 20;
						int y = 20;
						int width = 150;
						int height = 200;						
						mxGraph graph = getGraphComponent().getGraph();
						Object parentgraph = graph.getDefaultParent();
						HashMap map = (HashMap) models.get(getModel());
						Iterator it = map.keySet().iterator();
						graph.getModel().beginUpdate();
						while (it.hasNext()) {							
							Integer tableid = (Integer) it.next();
							X_AD_Table table = (X_AD_Table) map.get(tableid);
							HashMap props = table.getProperties();
							if (!props.containsKey("x")) {
								props.put("x", String.valueOf(x));
							}
							if (!props.containsKey("y")) {
								props.put("y", String.valueOf(y));
							}
							if (!props.containsKey("width")) {
								props.put("width", String.valueOf(width));					
							}
							if (!props.containsKey("height")) {
								props.put("height", String.valueOf(height));
							}					
							double ix = Double.parseDouble((String) props.get("x"));
							double iy = Double.parseDouble((String) props.get("y"));
							double iw = Double.parseDouble((String) props.get("width"));
							double ih = Double.parseDouble((String) props.get("height"));
							mxCell v1 = (mxCell) graph.insertVertex(parentgraph, String.valueOf(table.getAD_Table_ID()), table.getName(), ix, iy, iw, ih);
							v1.setVertex(true);							
						}						
						graph.getModel().endUpdate();
						List<Vector> parents = new ArrayList<Vector>();
						List<Vector> pks = new ArrayList<Vector>();
						Object[] sadasdsada = getGraphComponent().getGraphControl().getComponents();
						for (Object object:sadasdsada) {
							if (object instanceof JTableRenderer) {
								JTableRenderer ctrl =  (JTableRenderer) object;
								int count = ctrl.table.getModel().getRowCount();
								for (int i=0; i < count; i++) {
									Boolean iskey 	 = (Boolean) ctrl.table.getModel().getValueAt(i, 0); // column_id
									Boolean isparent = (Boolean) ctrl.table.getModel().getValueAt(i, 3); // column_id
									if (iskey) {
										Integer columnid = (Integer) ctrl.table.getModel().getValueAt(i, 5); // column_id
										if (!pks.contains(columnid)) {
											Vector vector = new Vector();
											vector.add(ctrl.cell);
											vector.add(i);
											vector.add(columnid);
											pks.add(vector);
										}
									}
									if (isparent) {
										Integer columnid = (Integer) ctrl.table.getModel().getValueAt(i, 5); // column_id
										if (!parents.contains(columnid)){
											Vector vector = new Vector();
											vector.add(ctrl.cell);
											vector.add(i);
											vector.add(columnid);
											parents.add(vector);										
										}
									}								
								}								
							}
						}						
						if (parents.size() > 0) {
							for (Vector parent:parents) {
								Integer parentid = (Integer) parent.get(2);
								MColumn pcolumn = MColumn.get(Env.getCtx(), parentid);
								for (Vector pk:pks) {
									Integer pkid = (Integer) pk.get(2);
									MColumn pkcolumn = MColumn.get(Env.getCtx(), pkid);
									if (pkcolumn.getName().equals(pcolumn.getName()) && pkcolumn.getAD_Column_ID() != pcolumn.getAD_Column_ID()) {
										mxCell parentcell = (mxCell) parent.get(0);
										mxCell pkcell = (mxCell) pk.get(0);
										Integer rowparent = (Integer) parent.get(1);
										Integer rowpk = (Integer) pk.get(1);
										Object edge = graph.insertEdge(null, null, null,
												pkcell, parentcell, "sourceRow=" + rowparent + ";targetRow=" + rowpk);
										break;
									}
								}
							}
						}													
						cnt.setBusy(false);
						return Boolean.TRUE;
					}					
				};				
				nw.start();
			} else {				
				SwingWorker nw = new SwingWorker() {
					public Object construct() {
						cnt.setBusy(true);
						int x = 20;
						int y = 20;
						int width = 150;
						int height = 200;												
						mxGraph graph = getGraphComponent().getGraph();
						Object parentgraph = graph.getDefaultParent();						
						HashMap map = new HashMap();
						List<X_AD_Table> tables = new Query(Env.getCtx(), X_AD_Table.Table_Name, "ID = ?", null)
						.setParameters(getModel()).list();
						graph.getModel().beginUpdate();
						for (X_AD_Table table:tables) {
							if (!map.containsKey(table.getAD_Table_ID())) {						
								HashMap props = table.getProperties();
								if (!props.containsKey("x")) {
									props.put("x", String.valueOf(x));
								}
								if (!props.containsKey("y")) {
									props.put("y", String.valueOf(y));
								}
								if (!props.containsKey("width")) {
									props.put("width", String.valueOf(width));					
								}
								if (!props.containsKey("height")) {
									props.put("height", String.valueOf(height));
								}					
								double ix = Double.parseDouble((String) props.get("x"));
								double iy = Double.parseDouble((String) props.get("y"));
								double iw = Double.parseDouble((String) props.get("width"));
								double ih = Double.parseDouble((String) props.get("height"));
								if (table.getAD_Table_ID() == 1000083)
									System.out.println("X");
								mxCell v1 = (mxCell) graph.insertVertex(parentgraph, String.valueOf(table.getAD_Table_ID()), table.getTableName(), ix, iy, iw, ih);
								//v1.getGeometry().setAlternateBounds(new mxRectangle(0, 0, 140, 25));
								v1.setVertex(true);
								map.put(table.getAD_Table_ID(), table);
								if (props.hashCode() != table.getProperties().hashCode()) {
									table.setProperties(props);
									table.save();
								}
								x = x + width + 5;
							}
						}
						graph.getModel().endUpdate();
						List<Vector> parents = new ArrayList<Vector>();
						List<Vector> pks = new ArrayList<Vector>();
						Object[] sadasdsada = getGraphComponent().getGraphControl().getComponents();
						for (Object object:sadasdsada) {
							if (object instanceof JTableRenderer) {
								JTableRenderer ctrl =  (JTableRenderer) object;
								int count = ctrl.table.getModel().getRowCount();
								for (int i=0; i < count; i++) {
									Boolean iskey 	 = (Boolean) ctrl.table.getModel().getValueAt(i, 0); // column_id
									Boolean isparent = (Boolean) ctrl.table.getModel().getValueAt(i, 3); // column_id
									if (iskey) {
										Integer columnid = (Integer) ctrl.table.getModel().getValueAt(i, 5); // column_id
										if (!pks.contains(columnid)) {
											Vector vector = new Vector();
											vector.add(ctrl.cell);
											vector.add(i);
											vector.add(columnid);
											pks.add(vector);
										}
									}
									if (isparent) {
										Integer columnid = (Integer) ctrl.table.getModel().getValueAt(i, 5); // column_id
										if (!parents.contains(columnid)){
											Vector vector = new Vector();
											vector.add(ctrl.cell);
											vector.add(i);
											vector.add(columnid);
											parents.add(vector);										
										}
									}								
								}								
							}
						}
						if (parents.size() > 0) {
							for (Vector parent:parents) {
								Integer parentid = (Integer) parent.get(2);
								MColumn pcolumn = MColumn.get(Env.getCtx(), parentid);
								for (Vector pk:pks) {
									Integer pkid = (Integer) pk.get(2);
									MColumn pkcolumn = MColumn.get(Env.getCtx(), pkid);
									if (pkcolumn.getName().equals(pcolumn.getName()) && pkcolumn.getAD_Column_ID() != pcolumn.getAD_Column_ID()) {
										mxCell parentcell = (mxCell) parent.get(0);
										mxCell pkcell = (mxCell) pk.get(0);
										Integer rowparent = (Integer) parent.get(1);
										Integer rowpk = (Integer) pk.get(1);
										Object edge = graph.insertEdge(null, null, null,
												pkcell, parentcell, "sourceRow=" + rowparent + ";targetRow=" + rowpk);
										break;
									}
								}
							}
						}						
						models.put(getModel(), map);
						cnt.setBusy(false);
						return Boolean.TRUE;
					}					
				};				
				nw.start();				
			}				
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
		}				
	}

	public boolean containsTable(Integer intid) {
		boolean containtable = false;
		HashMap map = (HashMap) models.get(getModel());
		if (map != null)
			containtable = map.containsKey(intid);
		return containtable;
	}

	public X_AD_Table getTable(Integer intid) {
		HashMap map = (HashMap) models.get(getModel());
		return (X_AD_Table) map.get(intid);
	}

	private void clearmodel() {
		mxGraph graph = getGraphComponent().getGraph();
		mxCell root = new mxCell();
		root.insert(new mxCell());
		graph.getModel().setRoot(root);
		getGraphComponent().zoomAndCenter();

	}

}