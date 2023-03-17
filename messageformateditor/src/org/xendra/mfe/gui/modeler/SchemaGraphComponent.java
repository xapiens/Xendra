package org.xendra.mfe.gui.modeler;

import java.awt.Component;

import org.jdom.Element;
import org.xendra.mfe.gui.propertysheet.PropertySheetPage;
import org.xendra.mfe.gui.tree.TreeController;

import com.mxgraph.model.mxCell;
import com.mxgraph.swing.mxGraphComponent;
import com.mxgraph.view.mxCellState;
import com.mxgraph.view.mxGraph;
import com.mxgraph.view.mxGraphView;

public class SchemaGraphComponent extends mxGraphComponent {
	private PropertySheetPage m_propertysheet;
	private TreeController m_tree;
	private MessageEditor m_editor;
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
	}
	public SchemaGraphComponent(mxGraph graph)
	{
		super(graph);
		mxGraphView graphView = new mxGraphView(graph)
		{
			public void updateCellState(mxCellState state) {
				super.updateCellState(state);
				String id = ((mxCell) state.getCell()).getId();
				Integer intid = Integer.valueOf(id);
				if (m_editor != null) {
				}
			}
		};
		graph.setView(graphView);
	}
	/**
	 * 
	 */
	public Component[] createComponents(mxCellState state)
	{
		if (getGraph().getModel().isVertex(state.getCell()))
		{			
			JMessageRenderer c = new JMessageRenderer();
			c.setCell((mxCell) state.getCell());
			c.setGraphContainer(this);
			c.setPropertyEditor(getPropertyEditor());
			c.setTreeController(getTreeController());
			c.build();
			return new Component[] { c };
		} else if (getGraph().getModel().isEdge(state.getCell())) 
		{
			JTableRenderer c =  new JTableRenderer();
			c.setCell((mxCell) state.getCell());
			c.setGraphContainer(this);
			c.setPropertyEditor(getPropertyEditor());
			c.setTreeController(getTreeController());
			c.build();
			return new Component[] { c };			
		}
		return null;
	}
	public void setEditor(MessageEditor messageEditor) {	
		m_editor = messageEditor;
	}
	public JMessageRenderer getMessageRenderer(Object cell) {		
		return null;
	}
}
