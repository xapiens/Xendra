package org.xendra.mfe.gui.modeler;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.AbstractAction;
import javax.swing.BorderFactory;
import javax.swing.DefaultListSelectionModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.border.BevelBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import org.compiere.util.Env;
import org.jdom.Element;
import org.xendra.mfe.gui.propertysheet.PropertySheetPage;
import org.xendra.mfe.gui.tree.TreeController;
import org.xendra.swing.ShadowBorder;

import com.mxgraph.model.mxCell;
import com.mxgraph.swing.mxGraphComponent;
import com.mxgraph.view.mxGraph;

public class JMessageRenderer extends JComponent {

	protected mxCell cell;
	protected mxGraphComponent graphContainer;
	protected mxGraph graph;
	private TreeController m_tree;
	private PropertySheetPage m_propertysheet;
	private Element e;
	private Section section;
	private Element m_element;
	public TreeController getTreeController() {
		return m_tree;
	}
	public void setTreeController(TreeController m_tree) {
		this.m_tree = m_tree;
	}
	public PropertySheetPage getPropertyEditor() {
		return m_propertysheet;
	}
	public void setPropertyEditor(PropertySheetPage m_propertysheet) {
		this.m_propertysheet = m_propertysheet;
	}
	public void setCell(mxCell var) {
		cell = var;		
		setElement((Element) cell.getValue());
	}
	public void setGraphContainer(SchemaGraphComponent var) {
		graphContainer = var;
		graph = graphContainer.getGraph();	
	}
	public void build() {
		setLayout(new BorderLayout());
		setBorder(BorderFactory.createCompoundBorder(ShadowBorder.getSharedInstance(), BorderFactory.createBevelBorder(BevelBorder.RAISED)));
		e = (Element) ((mxCell) cell).getValue();
		JPanel title = new JPanel();
		title.setBackground(new Color(149, 173, 239));
		title.setOpaque(true);
		title.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 1));
		title.setLayout(new BorderLayout());
		//
		try {
			JLabel icon = new JLabel(new ImageIcon(ImageIO.read(new File(Env.getResource("org.xendra.mfe", "message.png")))));
			icon.setBorder(BorderFactory.createEmptyBorder(0, 2, 0, 1));
			title.add(icon, BorderLayout.WEST);
			JLabel label = new JLabel(e.getAttributeValue("name"));
			label.setForeground(Color.WHITE);
			label.setFont(title.getFont().deriveFont(Font.BOLD, 11));
			label.setBorder(BorderFactory.createEmptyBorder(0, 1, 0, 2));
			title.add(label, BorderLayout.CENTER);

			JPanel toolBar2 = new JPanel();
			toolBar2.setLayout(new FlowLayout(FlowLayout.LEFT, 1, 2));
			toolBar2.setOpaque(false);
			JButton button = new JButton(new AbstractAction("", new ImageIcon(ImageIO.read(new File(Env.getResource("org.xendra.mfe", "minimize.gif")))))
			{
				public void actionPerformed(ActionEvent e) {
					
				}
			});
			button.setPreferredSize(new Dimension(16, 16));
			button.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			button.setToolTipText("Collapse/Expand");
			button.setOpaque(false);
			toolBar2.add(button);
			
			title.add(toolBar2, BorderLayout.EAST);
			add(title, BorderLayout.NORTH);			
			section = new Section(e);
			section.getSelectionModel().setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
			section.getSelectionModel().addListSelectionListener(
					new ListSelectionListener() {
						public void valueChanged(ListSelectionEvent event) {
							DefaultListSelectionModel sel = (DefaultListSelectionModel) event.getSource();
							Element field = (Element) section.getModel().getValueAt(sel.getMaxSelectionIndex(),  2);
							getTreeController().findNode(field);
						}
					});					
			JScrollPane scrollPane = new JScrollPane(section);
			scrollPane.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			if (graph.getModel().getChildCount(cell) == 0){
				scrollPane.getViewport().setBackground(Color.WHITE);
				setOpaque(true);
				add(scrollPane, BorderLayout.CENTER);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void setElement(Element e) {
		m_element = e;		
	}
}
