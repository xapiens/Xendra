package org.xendra.modeleditor.gui.modeleditor;

import java.awt.Component;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import javax.swing.JTable;
import javax.swing.JViewport;

import org.compiere.model.MTable;
import org.compiere.model.Query;
import org.compiere.util.Env;

import com.mxgraph.model.mxCell;
import com.mxgraph.model.mxGeometry;
import com.mxgraph.swing.mxGraphComponent;
import com.mxgraph.swing.handler.mxSelectionCellsHandler;
import com.mxgraph.util.mxEventObject;
import com.mxgraph.util.mxPoint;
import com.mxgraph.util.mxUtils;
import com.mxgraph.util.mxEventSource.mxIEventListener;
import com.mxgraph.view.mxCellState;
import com.mxgraph.view.mxGraph;
import com.mxgraph.view.mxGraphView;
import org.compiere.model.persistence.X_AD_Table;
import org.xendra.common.Lock;
import org.xendra.modeleditor.gui.propertysheet.PropertySheetPage;
import org.xendra.modeleditor.gui.tree.TreeController;

public class SchemaGraphComponent extends mxGraphComponent
{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1152655782652932774L;
	private ModelEditor m_editor;
	protected final Lock lock = new Lock("locksave");
	private PropertySheetPage m_propertysheet;
	private TreeController m_tree;

	public void setEditor(ModelEditor modelEditor) {
		m_editor = modelEditor;
	}	
	public void setPropertyEditor(PropertySheetPage propertysheet) {
		m_propertysheet =  propertysheet;
	}
	public PropertySheetPage getPropertyEditor() {
		return m_propertysheet;
	}
	public void setTreeController(TreeController tree) {
		m_tree = tree;
	}
	public TreeController getTreeController() {
		return m_tree;
	}	/**
	 * 
	 * @param graph
	 */
	public SchemaGraphComponent(mxGraph graph)
	{
		super(graph);
		mxGraphView graphView = new mxGraphView(graph)
		{
			//			public void updateVertexState(mxCellState state, mxGeometry geo) {
			//				super.updateVertexState(state, geo);
			//				System.out.println("updateVertexState");
			//			}
			public void updateCellState(mxCellState state) {
				super.updateCellState(state);
				String id = ((mxCell) state.getCell()).getId();
				Integer intid = Integer.valueOf(id);
				if (m_editor != null) {
					//for (X_AD_Table table:tables) {
					//if (table.getAD_Table_ID() == intid) {						
					//if (tables.containsKey(intid)) {
					if (m_editor.containsTable(intid)) {							
						//MTable table = (MTable) tables.get(intid);
						X_AD_Table table = (X_AD_Table) m_editor.getTable(intid);
						HashMap props = table.getProperties();
						int change = props.hashCode();
						Double xx = null;
						try {
							xx = Double.parseDouble((String)props.get("x"));
						}
						catch (Exception e) {
							System.out.println((String) props.get("x"));
							e.printStackTrace();
						}
						if (xx != state.getOrigin().getX()) {
							props.put("x", String.valueOf(state.getOrigin().getX()));
						}
						Double yy = Double.parseDouble((String)props.get("y"));
						if (yy != state.getOrigin().getY()) {
							props.put("y", String.valueOf(state.getOrigin().getY()));
						}
						if (props.hashCode() != change) {								
							synchronized(lock) {
								table.setProperties(props);
								table.save();		
							}
						}						
					}
					//}
				}
				//				if (tables.containsKey(id))
				//				{
				//					MTable table = (MTable) tables.get(id);
				//					HashMap props = table.getProperties();
				//					int change = props.hashCode();
				//					Double xx = Double.parseDouble((String)props.get("x"));
				//					if (xx != state.getOrigin().getX()) {
				//						props.put("x", state.getOrigin().getX());
				//					}
				//					Double yy = Double.parseDouble((String)props.get("y"));
				//					if (yy != state.getOrigin().getY()) {
				//						props.put("y", state.getOrigin().getY());
				//					}
				//					if (props.hashCode() != change) {
				//						table.setProperties(props);
				//						table.save();		
				//					}
				//					tables.put(id, table);					
				//				}
				//				else
				//				{
				//					Integer intid = Integer.valueOf(id);
				//					if (intid > 0) {
				//						System.out.println("analyzing "+intid);
				//						MTable table = new Query(Env.getCtx(), MTable.Table_Name, "AD_Table_ID = ?", null)
				//						.setParameters(intid).first();
				//						if (table != null) {						
				//							HashMap props = table.getProperties();
				//							int change = props.hashCode();
				//							Double xx = Double.parseDouble((String)props.get("x"));
				//							if (xx != state.getOrigin().getX()) {
				//								props.put("x", state.getOrigin().getX());
				//							}
				//							Double yy = Double.parseDouble((String)props.get("y"));
				//							if (yy != state.getOrigin().getY()) {
				//								props.put("y", state.getOrigin().getY());
				//							}
				//							if (props.hashCode() != change) {
				//								table.setProperties(props);
				//								table.save();		
				//							}
				//							tables.put(id, table);
				//						}
				//					}
				//				}
			}	

			/**
			 * este es el que hace la magia de los enlaces 
			 */
			public void updateFloatingTerminalPoint(mxCellState edge,
					mxCellState start, mxCellState end, boolean isSource)
			{
				int col = getColumn(edge, isSource);
				if (col >= 0)
				{
					double y = getColumnLocation(edge, start, col);
					boolean left = start.getX() > end.getX();

					if (isSource)
					{
						double diff = Math.abs(start.getCenterX()
								- end.getCenterX())
								- start.getWidth() / 2 - end.getWidth() / 2;

						if (diff < 40)
						{
							left = !left;
						}
					}
					double x = (left) ? start.getX() : start.getX()	+ start.getWidth();
					double x2 = (left) ? start.getX() - 20 : start.getX()	+ start.getWidth() + 20;

					int index2 = (isSource) ? 1	: edge.getAbsolutePointCount() - 1;
					edge.getAbsolutePoints().add(index2, new mxPoint(x2, y));

					int index = (isSource) ? 0 : edge.getAbsolutePointCount() - 1;
					edge.setAbsolutePoint(index, new mxPoint(x, y));
				}
				else
				{
					super.updateFloatingTerminalPoint(edge, start, end,	isSource);
				}
			}
		};
		graph.setView(graphView);		
	}

	protected mxSelectionCellsHandler createSelectionCellHandler() {
		return new SelectionCellsHandler(this);
	}		

	/**
	 * 
	 * @param edge
	 * @param isSource
	 * @return the column number the edge is attached to
	 */
	public int getColumn(mxCellState state, boolean isSource)
	{
		if (state != null)
		{
			if (isSource)
			{
				return mxUtils.getInt(state.getStyle(), "sourceRow", -1);
			}
			else
			{
				return mxUtils.getInt(state.getStyle(), "targetRow", -1);
			}
		}

		return -1;
	}

	public JTableRenderer getTableRenderer(Object cell) {
		JTableRenderer r = null;
		if (components.containsKey(cell)) {
			Component[] c = components.get(cell);
			for (int i=0; i < c.length; i++) {
				Object x = c[i];
				if (x instanceof JTableRenderer) {
					r = (JTableRenderer) x;
				}
			}
		}
		return r;
	}
	/**
	 * 
	 */
	public int getColumnLocation(mxCellState edge, mxCellState terminal, int column)
	{
		Component[] c = components.get(terminal.getCell());
		int y = 0;

		if (c != null)
		{
			for (int i = 0; i < c.length; i++)
			{
				if (c[i] instanceof JTableRenderer)
				{
					JTableRenderer vertex = (JTableRenderer) c[i];

					JTable table = vertex.table;
					JViewport viewport = (JViewport) table.getParent();
					double dy = -viewport.getViewPosition().getY();
					y = (int) Math.max(terminal.getY() + 22, terminal.getY()
							+ Math.min(terminal.getHeight() - 20, 30 + dy
									+ column * 16));
				}
			}
		}

		return y;
	}

	/**
	 * 
	 */
	public Component[] createComponents(mxCellState state)
	{
		if (getGraph().getModel().isVertex(state.getCell()))
		{
			JTableRenderer c = new JTableRenderer();
			c.setCell((mxCell) state.getCell());
			c.setGraphContainer(this);
			c.setPropertyEditor(getPropertyEditor());
			c.setTreeController(getTreeController());
			c.build();
			return new Component[] { c };
			//return new Component[] { new JTableRenderer(state.getCell(), this, getPropertyEditor()) };
		}

		return null;
	}
}
