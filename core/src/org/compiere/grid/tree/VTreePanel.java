/******************************************************************************
 * Product: Xendra ERP & CRM Smart Business Solution                        *
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
package org.compiere.grid.tree;


import java.awt.*;
import java.awt.datatransfer.*;
import java.awt.dnd.*;
import java.awt.event.*;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.File;
import java.sql.PreparedStatement;
import java.util.*;
import java.util.logging.*;
import javax.swing.*;
import javax.swing.plaf.SplitPaneUI;
import javax.swing.plaf.basic.BasicSplitPaneUI;
import javax.swing.tree.*;

import org.xendra.developer.common;
import org.xendra.plaf.XendraPLAF;
import org.compiere.apps.*;
import org.compiere.apps.graph.PAPanel;
import org.compiere.model.MRole;
import org.compiere.model.MTab;
import org.compiere.model.MTree;
import org.compiere.model.MTreeNode;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_AD_Menu;
import org.compiere.model.persistence.X_AD_Process;
import org.compiere.model.reference.REF_AD_MenuAction;
import org.compiere.swing.*;
import org.compiere.util.*;

import org.frapuccino.awt.ObjectArrayTransferable;
import org.frapuccino.iconpanel.ClickableIcon;
import org.frapuccino.iconpanel.IconPanel;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;

/**
 *  Tree Panel displays trees.
 *  <br>
 *	When a node is selected, a propertyChange (NODE_SELECTION) event is fired
 *  <pre>
 *		PropertyChangeListener -
 *			treePanel.addPropertyChangeListener(VTreePanel.NODE_SELECTION, this);
 *			calls: public void propertyChange(PropertyChangeEvent e)
 *  </pre>
 *  To select a specific node call
 *      setSelectedNode(NodeID);
 *
 *  @author 	Jorg Janke
 *  @version 	$Id: VTreePanel.java 5231 2014-02-28 00:40:07Z xapiens $
 */
public final class VTreePanel extends CPanel
implements ActionListener, DragGestureListener, DragSourceListener, DropTargetListener
{
	protected boolean m_lookAndFeelChanged = false;

	/**
	 *  Tree Panel for browsing and editing of a tree.
	 *  Need to call initTree
	 *  @param  WindowNo	WindowNo
	 *  @param  editable    if true you can edit it
	 *  @param  hasBar      has OutlookBar
	 */
	public VTreePanel(int WindowNo, boolean hasBar, boolean editable)
	{
		super();
		log.config("Bar=" + hasBar + ", Editable=" + editable);
		m_WindowNo = WindowNo;
		m_hasBar = hasBar;
		m_editable = editable;

		//	static init
		jbInit();
		if (!hasBar)
		{
			iconpanelgroup.setPreferredSize(new Dimension(0,0));			
			centerSplitPane.setDividerLocation(centerSplitPane.getWidth() * .8);
			centerSplitPane.setDividerSize(0);
			popMenuTree.remove(mBarAdd);
		}
		else {						
			// getPreferredSize().getWidth()/2
			//centerSplitPane.setDividerLocation(469);
			Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
			int xx = (int) (dim.getWidth()*.7);
			centerSplitPane.setDividerLocation(xx);			
			UIManager.addPropertyChangeListener(new PropertyChangeListener() {
				public void propertyChange(PropertyChangeEvent evt) {
					if ("lookAndFeel".equals(evt.getPropertyName()))
						m_lookAndFeelChanged = true;
				}
			});
		}
		//  base settings
		if (editable)
			tree.setDropTarget(dropTarget);
		else
		{
			popMenuTree.remove(mFrom);
			popMenuTree.remove(mTo);
		}
	}   //  VTreePanel

	/**
	 *  Tree initialization.
	 * 	May be called several times
	 *	@param	AD_Tree_ID	tree to load
	 *  @return true if loaded ok
	 *  @deprecated by sergioaguayo 09/10/2007
	 */
	public boolean initTree (int AD_Tree_ID)
	{
		return initTree(AD_Tree_ID, 0);
	}

	/**
	 *  Tree initialization.
	 * 	May be called several times
	 *	@param	AD_Tree_ID	tree to load
	 *	@param	AD_Tab_ID	the tab for which this tree is drawn
	 *  @return true if loaded ok
	 */
	public boolean initTree(int AD_Tree_ID, int AD_Tab_ID)
	{				
		log.config("AD_Tree_ID=" + AD_Tree_ID);
		//
		m_AD_Tree_ID = AD_Tree_ID;
		String where = null;
		/* sergioaguayo: honor where clause for tabs */
		if (AD_Tab_ID != 0) {
			MTab tab = new MTab(Env.getCtx(), AD_Tab_ID, null);
			where = tab.getWhereClause();
		}

		//  Get Tree
		MTree vTree = new MTree (Env.getCtx(), AD_Tree_ID, m_editable, true, where, null);
		m_root = vTree.getRoot();
		log.config("root=" + m_root);
		m_nodeTableName = vTree.getNodeTableName();
		treeModel = new DefaultTreeModel(m_root, true);
		tree.setModel(treeModel);

		//  Shortcut Bar
		if (m_hasBar)
		{
			Enumeration en = m_root.preorderEnumeration();
			while (en.hasMoreElements())
			{
				MTreeNode nd = (MTreeNode)en.nextElement();
				if (nd.isOnBar())
					addToBar(nd);
			}
		}

		return true;
	}   //  initTree

	/**	Logger			*/
	private static CLogger log = CLogger.getCLogger(VTreePanel.class);

	private BorderLayout mainLayout = new BorderLayout();
	private JTree tree = new JTree();
	private DefaultTreeModel treeModel;
	private DefaultTreeSelectionModel treeSelect = new DefaultTreeSelectionModel();
	private CPanel southPanel = new CPanel();
	private CCheckBox treeExpand = new CCheckBox();
	private CTextField treeSearch = new CTextField(10);
	private CLabel treeSearchLabel = new CLabel();
	private JPopupMenu popMenuTree = new JPopupMenu();
	private JPopupMenu popMenuBar = new JPopupMenu();
	private CMenuItem mFrom = new CMenuItem();
	private CMenuItem mTo = new CMenuItem();
	private IconPanelGroup iconpanelgroup = new IconPanelGroup(this);
	
	private CMenuItem mBarAdd = new CMenuItem();
	private CMenuItem mBarRemove = new CMenuItem();
	private CMenuItem mBarRemoveFromRol = new CMenuItem();
	private CMenuItem mBarExport = new CMenuItem();
	private BorderLayout southLayout = new BorderLayout();
	private JSplitPane centerSplitPane = new JSplitPane();
	private JScrollPane treePane = new JScrollPane();
	private MouseListener mouseListener = new VTreePanel_mouseAdapter(this);
	private KeyListener keyListener = new VTreePanel_keyAdapter(this);
	//
	private int			m_WindowNo;
	/** Tree ID                     */
	private int			m_AD_Tree_ID = 0;
	/** Table Name for TreeNode     */
	private String      m_nodeTableName = null;
	/** Tree is editable (can move nodes) - also not active shown   */
	private boolean     m_editable;
	/** Tree has a shortcut Bar     */
	private boolean     m_hasBar;
	/** The root node               */
	private MTreeNode  	m_root = null;


	private MTreeNode   m_moveNode;    	//	the node to move
	private String      m_search = "";
	private Enumeration m_nodeEn;
	private MTreeNode   m_selectedNode;	//	the selected model node
	private CButton     m_buttonSelected;

	/**	Property Listener NodeSelected			*/
	public static final String NODE_SELECTION = "NodeSelected";

	/**
	 *  Static Component initialization.
	 *  <pre>
	 *  - centerSplitPane
	 *      - treePane
	 *          - tree
	 *      - bar
	 *  - southPanel
	 *  </pre>
	 */
	private void jbInit()
	{
		this.setLayout(mainLayout);
		mainLayout.setVgap(5);
		iconpanelgroup.createIconGroup();
		//
		//  only one node to be selected
		//.setSelectionMode(DefaultTreeSelectionModel.SINGLE_TREE_SELECTION);
		//tree.setSelectionModel(treeSelect);
		tree.getSelectionModel().setSelectionMode(TreeSelectionModel.SINGLE_TREE_SELECTION);
		//
		tree.setEditable(false);		            //	allows to change the text
		tree.addMouseListener(mouseListener);
		tree.addKeyListener(keyListener);
		tree.setCellRenderer(new VTreeCellRenderer());
		treePane.setViewportView(tree);
		treePane.setBorder(new ShadowBorder());
		tree.setBorder(BorderFactory.createEmptyBorder());
		//		treePane.setPreferredSize(new Dimension(50,200));
		//		tree.setPreferredSize(new Dimension(100,150));
		//
		treeExpand.setText(Msg.getMsg(Env.getCtx(), "ExpandTree"));
		treeExpand.setActionCommand("Expand");
		treeExpand.addMouseListener(mouseListener);
		treeExpand.addActionListener(this);
		treeSearchLabel.setIcon(new ImageIcon(VTreePanel.class.getResource("/org/compiere/images/Find16.gif")));
		//
		//treeSearchLabel.setText(Msg.getMsg(Env.getCtx(), "TreeSearch") + " ");
		treeSearchLabel.setLabelFor(treeSearch);
		treeSearchLabel.setToolTipText(Msg.getMsg(Env.getCtx(), "TreeSearchText"));

		treeSearch.setBackground(XendraPLAF.getInfoBackground());
		treeSearch.addKeyListener(keyListener);
		southLayout.setHgap(4);
		southPanel.setLayout(southLayout);
		southPanel.add(treeExpand, BorderLayout.WEST);
		southPanel.add(treeSearchLabel, BorderLayout.CENTER);
		southPanel.add(treeSearch, BorderLayout.EAST);
		this.add(southPanel, BorderLayout.SOUTH);
		//
		centerSplitPane.setOpaque(false);
		//		toolbar.setOpaque(false);
		centerSplitPane.add(treePane, JSplitPane.RIGHT);
		//		centerSplitPane.add(bar, JSplitPane.LEFT);
		centerSplitPane.add(iconpanelgroup, JSplitPane.LEFT);
		centerSplitPane.setBorder(BorderFactory.createEmptyBorder());
		removeSplitPaneBorder();

		this.add(centerSplitPane, BorderLayout.CENTER);
		//
		mFrom.setText(Msg.getMsg(Env.getCtx(), "ItemMove"));
		mFrom.setActionCommand("From");
		mFrom.addActionListener(this);
		mTo.setEnabled(false);
		mTo.setText(Msg.getMsg(Env.getCtx(), "ItemInsert"));
		mTo.setActionCommand("To");
		mTo.addActionListener(this);
		//		
		iconpanelgroup.setMinimumSize(new Dimension (50,50));
		//iconpanelgroup.setPreferredSize(new Dimension(500,200));
		iconpanelgroup.setBorder(new ShadowBorder());

		mBarAdd.setText(Msg.getMsg(Env.getCtx(), "BarAdd"));
		mBarAdd.setActionCommand("BarAdd");
		mBarAdd.addActionListener(this);
		//
		mBarExport.setText(Msg.getMsg(Env.getCtx(), "Export"));
		mBarExport.setActionCommand("BarExport");
		mBarExport.addActionListener(this);
		//
		mBarRemove.setText(Msg.getMsg(Env.getCtx(), "BarRemove"));		
		mBarRemove.setActionCommand("BarRemove");
		mBarRemove.addActionListener(this);
		mBarRemoveFromRol.setText(Msg.getMsg(Env.getCtx(), "RolRemove"));
		mBarRemoveFromRol.setActionCommand("RolRemove");
		mBarRemoveFromRol.addActionListener(this);
		//
		popMenuTree.setLightWeightPopupEnabled(false);
		popMenuTree.add(mBarAdd);
		popMenuTree.add(mBarRemove);
		popMenuTree.addSeparator();
		popMenuTree.add(mFrom);
		popMenuTree.add(mTo);
		if (MRole.getDefault().isSuperUser())
		{
			popMenuTree.addSeparator();
			popMenuTree.add(mBarRemoveFromRol);
			popMenuTree.add(mBarExport);
		}
		popMenuBar.setLightWeightPopupEnabled(false);
		//popMenuBar.add(mBarRemove);			
	}   //  jbInit


	private void removeSplitPaneBorder() {
		if (centerSplitPane != null) {
			SplitPaneUI splitPaneUI = centerSplitPane.getUI();
			if (splitPaneUI instanceof BasicSplitPaneUI) {
				BasicSplitPaneUI basicUI = (BasicSplitPaneUI) splitPaneUI;
				basicUI.getDivider().setBorder(BorderFactory.createEmptyBorder());
			}
		}
	}

	/**
	 * 	Set Divider Location
	 *	@param location location (80 default)
	 */
	public void setDividerLocation(int location)
	{
		centerSplitPane.setDividerLocation(location);
	}	//	setDividerLocation

	/**
	 * 	Get Divider Location
	 *	@return divider location
	 */
	public int getDividerLocation()
	{
		return centerSplitPane.getDividerLocation();
	}	//	getDividerLocation


	/*************************************************************************
	 *	Drag & Drop
	 */
	protected DragSource dragSource	= DragSource.getDefaultDragSource();
	protected DropTarget dropTarget	= new DropTarget(tree, DnDConstants.ACTION_MOVE, this, true, null);
	protected DragGestureRecognizer recognizer	= dragSource.createDefaultDragGestureRecognizer(tree, DnDConstants.ACTION_MOVE, this);


	/**
	 *	Drag Gesture Interface	** Start **
	 *  @param e event
	 */
	public void dragGestureRecognized(DragGestureEvent e)
	{
		if (!m_editable)
			return;
		//
		try
		{
			m_moveNode = (MTreeNode)tree.getSelectionPath().getLastPathComponent();
		}
		catch (Exception ex)	//	nothing selected
		{
			return;
		}
		//	start moving
		StringSelection content = new StringSelection(m_moveNode.toString());
		e.startDrag(DragSource.DefaultMoveDrop,		//	cursor
				content,						//	Transferable
				this);
		log.fine( "Drag: " + m_moveNode.toString());
	}	//	dragGestureRecognized


	/**
	 *	DragSourceListener interface - noop
	 *  @param e event
	 */
	public void dragDropEnd(DragSourceDropEvent e)	{}
	/**
	 *	DragSourceListener interface - noop
	 *  @param e event
	 */
	public void dragEnter(DragSourceDragEvent e)	{}
	/**
	 *	DragSourceListener interface - noop
	 *  @param e event
	 */
	public void dragExit(DragSourceEvent e)	{}
	/**
	 *	DragSourceListener interface - noop
	 *  @param e event
	 */
	public void dragOver(DragSourceDragEvent e)	{}
	/**
	 *	DragSourceListener interface - noop
	 *  @param e event
	 */
	public void dropActionChanged(DragSourceDragEvent e)	{}

	/**
	 *	DropTargetListener interface
	 *  @param e event
	 */
	public void dragEnter(DropTargetDragEvent e)
	{
		e.acceptDrag(DnDConstants.ACTION_MOVE);
	}
	/**
	 *	DragSourceListener interface - noop
	 *  @param e event
	 */
	public void dropActionChanged(DropTargetDragEvent e)	{}
	/**
	 *	DragSourceListener interface - noop
	 *  @param e event
	 */
	public void dragExit(DropTargetEvent e)	{}


	/**
	 *	Drag over 				** Between **
	 *  @param e event
	 */
	public void dragOver(DropTargetDragEvent e)
	{
		Point mouseLoc = e.getLocation(); 	//	where are we?
		TreePath path = tree.getClosestPathForLocation(mouseLoc.x, mouseLoc.y);
		tree.setSelectionPath(path);		//	show it by selecting
		MTreeNode toNode = (MTreeNode)path.getLastPathComponent();
		//
		//	log.fine( "Move: " + toNode);
		if (m_moveNode == null				//	nothing to move
				||	toNode == null)				//	nothing to drop on
			e.rejectDrag();
		else
			e.acceptDrag(DnDConstants.ACTION_MOVE);
	}	//	dragOver


	/**
	 *	Drop					** End **
	 *  @param e event
	 */
	public void drop(DropTargetDropEvent e)
	{
		Point mouseLoc = e.getLocation(); 	//	where are we?
		TreePath path = tree.getClosestPathForLocation(mouseLoc.x, mouseLoc.y);
		tree.setSelectionPath(path);		//	show it by selecting
		MTreeNode toNode = (MTreeNode)path.getLastPathComponent();
		//
		log.fine( "Drop: " + toNode);
		if (m_moveNode == null				//	nothing to move
				||	toNode == null)				//	nothing to drop on
		{
			e.rejectDrop();
			return;
		}
		//
		e.acceptDrop(DnDConstants.ACTION_MOVE);
		moveNode(m_moveNode, toNode);

		e.dropComplete(true);
		m_moveNode = null;
	}	//	drop


	/**
	 *	Move TreeNode
	 *	@param	movingNode	The node to be moved
	 *	@param	toNode		The target node
	 */
	private void moveNode(MTreeNode movingNode, MTreeNode toNode)
	{
		log.info(movingNode.toString() + " to " + toNode.toString());

		if (movingNode == toNode)
			return;

		//  remove
		MTreeNode oldParent = (MTreeNode)movingNode.getParent();
		movingNode.removeFromParent();
		treeModel.nodeStructureChanged(oldParent);

		//  insert
		MTreeNode newParent;
		int index;
		if (!toNode.isSummary())	//	drop on a child node
		{
			newParent = (MTreeNode)toNode.getParent();
			index = newParent.getIndex(toNode) + 1;	//	the next node
		}
		else									//	drop on a summary node
		{
			newParent = toNode;
			index = 0;                   			//	the first node
		}
		newParent.insert(movingNode, index);
		treeModel.nodeStructureChanged(newParent);

		//	***	Save changes to disk
		setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
		Trx trx = Trx.get ("VTreePanel", true);
		try
		{
			//begin vpj-cd e-evolution 07/12/2005 PostgreSQL
			//Statement stmt = trx.getConnection().createStatement();
			//end vpj-cd e-evolution 07/12/2005 PostgreSQL
			//	START TRANSACTION   **************
			int no = 0;
			for (int i = 0; i < oldParent.getChildCount(); i++)
			{
				MTreeNode nd = (MTreeNode)oldParent.getChildAt(i);
				StringBuffer sql = new StringBuffer("UPDATE ");
				sql.append(m_nodeTableName)
				.append(" SET Parent_ID=").append(oldParent.getNode_ID())
				.append(", SeqNo=").append(i)
				.append(", Updated=CURRENT_TIMESTAMP")
				.append(" WHERE AD_Tree_ID=").append(m_AD_Tree_ID)
				.append(" AND Node_ID=").append(nd.getNode_ID());
				log.fine(sql.toString());
				//begin vpj-cd e-evolution 07/12/2005 PostgreSQL       
				//stmt.executeUpdate(sql.toString());
				no = DB.executeUpdate(sql.toString(),trx.getTrxName());
				//end vpj-cd e-evolution 07/12/2005 PostgreSQL 
			}
			if (oldParent != newParent)
				for (int i = 0; i < newParent.getChildCount(); i++)
				{
					MTreeNode nd = (MTreeNode)newParent.getChildAt(i);
					StringBuffer sql = new StringBuffer("UPDATE ");
					sql.append(m_nodeTableName)
					.append(" SET Parent_ID=").append(newParent.getNode_ID())
					.append(", SeqNo=").append(i)
					.append(", Updated=CURRENT_TIMESTAMP")
					.append(" WHERE AD_Tree_ID=").append(m_AD_Tree_ID)
					.append(" AND Node_ID=").append(nd.getNode_ID());
					log.fine(sql.toString());
					//begin vpj-cd e-evolution 07/12/2005 PostgreSQL     
					//stmt.executeUpdate(sql.toString());
					no = DB.executeUpdate(sql.toString(),trx.getTrxName());
					//end vpj-cd e-evolution 07/12/2005 PostgreSQL
				}
			//	COMMIT          *********************
			trx.commit(true);
			//begin vpj-cd e-evolution 07/12/2005 PostgreSQL     
			//stmt.close();
			//end vpj-cd e-evolution 07/12/2005 PostgreSQL
		}
		///begin vpj-cd e-evolution 07/12/2005 PostgreSQL 
		//catch (SQLException e)
		catch (Exception e)
		//end vpj-cd e-evolution 07/12/2005 PostgreSQL
		{
			trx.rollback();
			log.log(Level.SEVERE, "move", e);
			ADialog.error(m_WindowNo, this, "TreeUpdateError", e.getLocalizedMessage());
		}
		trx.close();
		trx = null;
		setCursor(Cursor.getDefaultCursor());
		log.config("complete");
	}	//	moveNode


	/*************************************************************************/

	/**
	 *  Enter Key
	 *  @param e event
	 */
	protected void keyPressed(KeyEvent e)
	{
		//  *** Tree ***
		if (e.getSource() instanceof JTree
				|| (e.getSource() == treeSearch && e.getModifiers() != 0))	//	InputEvent.CTRL_MASK
		{
			TreePath tp = tree.getSelectionPath();
			if (tp == null)
				ADialog.beep();
			else
			{
				MTreeNode tn = (MTreeNode)tp.getLastPathComponent();
				setSelectedNode(tn);
			}
		}

		//  *** treeSearch ***
		else if (e.getSource() == treeSearch)
		{
			String search = treeSearch.getText();
			boolean found = false;

			//  at the end - try from top
			if (m_nodeEn != null && !m_nodeEn.hasMoreElements())
				m_search = "";

			//  this is the first time
			if (!search.equals(m_search))
			{
				//  get enumeration of all nodes
				m_nodeEn = m_root.preorderEnumeration();
				m_search = search;
			}

			//  search the nodes
			while(!found && m_nodeEn != null && m_nodeEn.hasMoreElements())
			{
				MTreeNode nd = (MTreeNode)m_nodeEn.nextElement();
				//	compare in upper case
				if (nd.toString().toUpperCase().indexOf(search.toUpperCase()) != -1)
				{
					found = true;
					TreePath treePath = new TreePath(nd.getPath());
					tree.setSelectionPath(treePath);
					tree.makeVisible(treePath);			//	expand it
					tree.scrollPathToVisible(treePath);
				}
			}
			if (!found)
				ADialog.beep();
		}   //  treeSearch

	}   //  keyPressed


	/*************************************************************************/

	/**
	 *  Mouse clicked
	 *  @param e event
	 */
	protected void mouseClicked(MouseEvent e)
	{
		//  *** JTree ***
		if (e.getSource() instanceof JTree)
		{
			//  Left Double Click
			if (SwingUtilities.isLeftMouseButton(e)
					&& e.getClickCount() > 0)
			{
				int selRow = tree.getRowForLocation(e.getX(), e.getY());
				if(selRow != -1)
				{
					MTreeNode tn = (MTreeNode)tree.getPathForLocation
					(e.getX(), e.getY()).getLastPathComponent();
					setSelectedNode(tn);
				}
			}

			//  Right Click for PopUp
			else if ((m_editable || m_hasBar)
					&& SwingUtilities.isRightMouseButton(e)
					&& tree.getSelectionPath() != null)         //  need select first
			{
				MTreeNode nd = (MTreeNode)tree.getSelectionPath().getLastPathComponent();
				//	if (nd.isLeaf())                    //  only leaves
				{
					Rectangle r = tree.getPathBounds(tree.getSelectionPath());
					popMenuTree.show(tree, (int)r.getMaxX(), (int)r.getY());
				}
			}
		}   //  JTree

		//  *** JButton ***
		else if (e.getSource() instanceof JButton)
		{
			if (SwingUtilities.isRightMouseButton(e))
			{
				m_buttonSelected = (CButton)e.getSource();
				popMenuBar.show(m_buttonSelected, e.getX(), e.getY());
			}
		}   //  JButton

	}   //  mouseClicked


	/**
	 *  Get currently selected node
	 *  @return MTreeNode
	 */
	public MTreeNode getSelectedNode()
	{
		return m_selectedNode;
	}   //  getSelectedNode

	/**
	 *  Search Field
	 *  @return Search Field
	 */
	public JComponent getSearchField()
	{
		return treeSearch;
	}   //  getSearchField

	/**
	 *  Set Selection to Node in Event
	 *  @param nodeID Node ID
	 * 	@return true if selected
	 */
	public boolean setSelectedNode (int nodeID)
	{
		log.config("ID=" + nodeID);
		if (nodeID != -1)				//	new is -1
			return selectID(nodeID, true);     //  show selection
		return false;
	}   //  setSelectedNode

	/**
	 *  Select ID in Tree
	 *  @param nodeID	Node ID
	 *  @param show	scroll to node
	 * 	@return true if selected
	 */
	private boolean selectID (int nodeID, boolean show)
	{
		if (m_root == null)
			return false;
		log.config("NodeID=" + nodeID 
				+ ", Show=" + show + ", root=" + m_root);
		//  try to find the node
		MTreeNode node = m_root.findNode (nodeID);
		if (node != null)
		{
			TreePath treePath = new TreePath(node.getPath());
			log.config("Node=" + node 
					+ ", Path=" + treePath.toString());
			tree.setSelectionPath(treePath);
			if (show)
			{
				tree.makeVisible(treePath);       	//	expand it
				tree.scrollPathToVisible(treePath);
			}
			return true;
		}
		log.info("Node not found; ID=" + nodeID);
		return false;
	}   //  selectID


	/**
	 *  Set the selected node & initiate all listeners
	 *  @param nd node
	 */
	private void setSelectedNode (MTreeNode nd)
	{
		log.config("Node = " + nd);
		m_selectedNode = nd;
		//
		// start XendraFrameMediator::propertyChange 
		firePropertyChange(NODE_SELECTION, null, nd);
	}   //  setSelectedNode


	/**************************************************************************
	 *  Node Changed - synchromize Node
	 *
	 *  @param  save    true the node was saved (changed/added), false if the row was deleted
	 *  @param  keyID   the ID of the row changed
	 *  @param  name	name
	 *  @param  description	description
	 *  @param  isSummary	summary node
	 *  @param  imageIndicator image indicator
	 */
	public void nodeChanged (boolean save, int keyID,
			String name, String description, boolean isSummary, String imageIndicator)
	{
		log.config("Save=" + save + ", KeyID=" + keyID
				+ ", Name=" + name + ", Description=" + description 
				+ ", IsSummary=" + isSummary + ", ImageInd=" + imageIndicator
				+ ", root=" + m_root);
		//	if ID==0=root - don't update it
		if (keyID == 0)
			return;	

		//  try to find the node
		MTreeNode node = m_root.findNode(keyID);

		//  Node not found and saved -> new
		if (node == null && save)
		{
			node = new MTreeNode (keyID, 0, name, description,
					m_root.getNode_ID(), isSummary, imageIndicator, false, null);
			m_root.add (node);
		}

		//  Node found and saved -> change
		else if (node != null && save)
		{
			node.setName (name);
			node.setAllowsChildren(isSummary);
		}

		//  Node found and not saved -> delete
		else if (node != null && !save)
		{
			MTreeNode parent = (MTreeNode)node.getParent();
			node.removeFromParent();
			node = parent;  //  select Parent
		}

		//  Error
		else
		{
			log.log(Level.SEVERE, "Save=" + save + ", KeyID=" + keyID + ", Node=" + node);
			node = null;
		}

		//  Nothing to display
		if (node == null)
			return;

		//  (Re) Display Node
		tree.updateUI();
		TreePath treePath = new TreePath(node.getPath());
		tree.setSelectionPath(treePath);
		tree.makeVisible(treePath);       	//	expand it
		tree.scrollPathToVisible(treePath);
	}   //  nodeChanged


	/**************************************************************************
	 *  ActionListener
	 *  @param e event
	 */
	public void actionPerformed(ActionEvent e)
	{
		//  bar button pressed
		if (e.getSource() instanceof JButton)
		{
			//  Find Node - don't show
			selectID(Integer.parseInt(e.getActionCommand()), false);
			//  Select it
			MTreeNode tn = (MTreeNode)tree.getSelectionPath().getLastPathComponent();
			setSelectedNode(tn);
		}

		//  popup menu commands
		else if (e.getSource() instanceof JMenuItem)
		{
			if (e.getActionCommand().equals("From"))
				moveFrom();
			else if (e.getActionCommand().equals("To"))
				moveTo();
			else if (e.getActionCommand().equals("BarAdd"))
				barAdd();
			else if (e.getActionCommand().equals("BarRemove"))
				barRemove();
			else if (e.getActionCommand().equals("BarExport"))
				barExport();
			else if (e.getActionCommand().equals("RolRemove"))
				rolRemove();
		}

		else if (e.getSource() instanceof JCheckBox)
		{
			if (e.getActionCommand().equals("Expand"))
				expandTree();
		}
	}   //  actionPerformed


	/*************************************************************************/

	/**
	 *  Copy Node into buffer
	 */
	private void moveFrom()
	{
		m_moveNode = (MTreeNode)tree.getSelectionPath().getLastPathComponent();
		if (m_moveNode != null)
			mTo.setEnabled(true);		//	enable menu
	}   //  mFrom_actionPerformed

	/**
	 *  Move Node
	 */
	private void moveTo()
	{
		mFrom.setEnabled(true);
		mTo.setEnabled(false);
		if (m_moveNode == null)
			return;

		MTreeNode toNode = (MTreeNode)tree.getSelectionPath().getLastPathComponent();
		moveNode(m_moveNode, toNode);
		//	cleanup
		m_moveNode = null;
	}   //  mTo_actionPerformed

	/**
	 *  Add selected TreeNode to Bar
	 */
	private void barAdd()
	{
		MTreeNode nd = (MTreeNode)tree.getSelectionPath().getLastPathComponent();
		if (barDBupdate(true, nd.getNode_ID()))
			addToBar(nd);
	}   //  barAdd

	/**
	 *  Remove from Bar
	 */
	private void barRemove()
	{
		MTreeNode nd = (MTreeNode)tree.getSelectionPath().getLastPathComponent();
		if (barDBupdate(false, nd.getNode_ID()))
			iconpanelgroup.removeicon(nd.getNode_ID());
		//		toolbar.remove(m_buttonSelected);
		//		bar.validate();
		//		bar.repaint();
//		int index = iconpanelgroup.RemoveSelectedItem();
//		if (index > 0)
//		{
				
			//iconpanelgroup.validate();
			//iconpanelgroup.repaint();			
			//barDBupdate(false, Integer.parseInt(m_buttonSelected.getActionCommand()));				
	}   //  barRemove
	
	private void barExport()
	{
		MTreeNode nd = (MTreeNode)tree.getSelectionPath().getLastPathComponent();
		int node_id = nd.getNode_ID();
		
		X_AD_Menu menu = new Query(Env.getCtx(), X_AD_Menu.Table_Name, "AD_Menu_ID = ?", null)
			.setParameters(node_id).first();
		if (menu != null)
		{							
			if (menu.getAction().equals(REF_AD_MenuAction.Report))
			{
				String where = "AD_Process_ID = ?";
				X_AD_Process proc = new Query(Env.getCtx(), X_AD_Process.Table_Name, where, null)
				.setParameters(menu.getAD_Process_ID()).first();		
				if (proc != null)
				{
					File diroutput = new File(System.getProperty("user.home")+System.getProperty("file.separator")+"report");
					if (!diroutput.exists())
						diroutput.mkdirs();
					String reportname = proc.getJasperReport();					
					reportname = reportname.replaceAll(".*/([^/]+)", "$1");
					File xmlfile = new File(diroutput.getAbsolutePath() +File.separator+ reportname);
					common.addProcess(diroutput, proc,xmlfile);
				}			
			}
			String Menuid = menu.getIdentifier();
			HashMap menumap = new HashMap();
			common.addMenu(menu, menumap);
		}		
		System.out.println("vtreepanel.barexport");
//		sql.append("SELECT m.AD_Menu_ID,  t.Name,t.Description,m.IsSummary,m.Action, "
//				+ "m.AD_Window_ID, m.AD_Process_ID, m.AD_Form_ID, m.AD_Workflow_ID, m.AD_Task_ID, m.AD_Workbench_ID, m.ISSOTrx "
//				+ "FROM AD_Menu m, AD_Menu_Trl t");
//		if (!base)
//			sql.append(" WHERE m.AD_Menu_ID=t.AD_Menu_ID AND t.AD_Language='")
//				.append(Env.getAD_Language(Env.getCtx())).append("'")
//				.append(" AND m.AD_Menu_ID=?");
//		else
//			sql.append(" WHERE m.AD_Menu_ID=?");
//		//
//		if (!r.isMenu())
//			sql.append("SELECT * FROM AD_WF_Node WHERE AD_WF_Node_ID=?");
//			//sql = "SELECT * FROM AD_WF_Node WHERE AD_WF_Node_ID=?";			)
//		PreparedStatement pstmt = DB.prepareStatement(sql.toString(), null);
	}
	/**
	 *  Add TreeNode to Bar
	 *  @param nd node
	 */
	private void addToBar(MTreeNode nd)
	{
		//	Only first word of Label
		String label = nd.toString().trim();
		int space = label.indexOf(' ');

		iconpanelgroup.addicon(nd.getIcon(),label, nd.getDescription(), nd.getNode_ID());
		iconpanelgroup.validate();
		if (centerSplitPane.getDividerLocation() == -1)
			centerSplitPane.setDividerLocation(nd.getIcon().getIconWidth());
		//		bar.repaint();
		iconpanelgroup.repaint();
	}   //  addToBar

	private void rolRemove()
	{
		MTreeNode nd = (MTreeNode)tree.getSelectionPath().getLastPathComponent();
		//MTreeNode node = m_root.findNode(nd.getNode_ID());
		if (nd.isProcess() || nd.isWindow() || nd.isForm() || nd.isReport() || nd.isWorkFlow())
		{
			X_AD_Menu menu = new Query(Env.getCtx(), X_AD_Menu.Table_Name, "AD_Menu_ID = ?", null)
			.setParameters(nd.getNode_ID()).firstOnly();
			if (menu != null)
			{
				int AD_Role_ID = Env.getAD_Role_ID(Env.getCtx());
				int no = 0;
				if (nd.isProcess() || nd.isReport())					
				{
					int AD_Process_ID = menu.getAD_Process_ID();					
					String sql = "UPDATE AD_Process_Access SET IsActive = 'N' WHERE AD_Process_ID = ? AND AD_Role_ID = ?";
					Object[] params = new Object[]{new Integer(AD_Process_ID), new Integer(AD_Role_ID)};
					no = DB.executeUpdate(sql, params, true, null);					
				}
				else if (nd.isWindow())
				{
					int AD_Window_ID = menu.getAD_Window_ID();
					String sql = "UPDATE AD_Window_Access SET IsActive = 'N'  WHERE AD_Window_ID = ? AND AD_Role_ID = ?";
					Object[] params = new Object[]{new Integer(AD_Window_ID), new Integer(AD_Role_ID)};
					no = DB.executeUpdate(sql, params, true, null);					
				}
				else if (nd.isForm())
				{
					int AD_Form_ID = menu.getAD_Form_ID();
					String sql = "UPDATE AD_Form_Access SET IsActive = 'N'  WHERE AD_Form_ID = ? AND AD_Role_ID = ?";
					Object[] params = new Object[]{new Integer(AD_Form_ID), new Integer(AD_Role_ID)};
					no = DB.executeUpdate(sql, params, true, null);										
				}	
				else if (nd.isWorkFlow())
				{
					int AD_Workflow_ID = menu.getAD_Workflow_ID();
					String sql = "UPDATE AD_Workflow_Access SET IsActive = 'N'  WHERE AD_Workflow_ID = ? AND AD_Role_ID = ?";
					Object[] params = new Object[]{new Integer(AD_Workflow_ID), new Integer(AD_Role_ID)};
					no = DB.executeUpdate(sql, params, true, null);										
				}
				System.out.println(no);
			}
			
		}
	}
	/**
	 *	Make Bar add/remove persistent
	 *  @param add true if add - otherwise remove
	 *  @param Node_ID Node ID
	 *  @return true if updated
	 */
	private boolean barDBupdate (boolean add, int Node_ID)
	{
		int AD_Client_ID = Env.getAD_Client_ID(Env.getCtx());
		int AD_Org_ID = Env.getContextAsInt(Env.getCtx(), "#AD_Org_ID");
		int AD_User_ID = Env.getContextAsInt(Env.getCtx(), "#AD_User_ID");
		StringBuffer sql = new StringBuffer();
		if (add)
			sql.append("INSERT INTO AD_TreeBar "
					+ "(AD_Tree_ID,AD_User_ID,Node_ID, "
					+ "AD_Client_ID,AD_Org_ID, "
					+ "IsActive,Created,CreatedBy,Updated,UpdatedBy)VALUES (")
					.append(m_AD_Tree_ID).append(",").append(AD_User_ID).append(",").append(Node_ID).append(",")
					.append(AD_Client_ID).append(",").append(AD_Org_ID).append(",")
					.append("'Y',CURRENT_TIMESTAMP,").append(AD_User_ID).append(",CURRENT_TIMESTAMP,").append(AD_User_ID).append(")");
		//	if already exist, will result in ORA-00001: unique constraint (ADEMPIERE.AD_TREEBAR_KEY)
		else
			sql.append("DELETE FROM AD_TreeBar WHERE AD_Tree_ID=").append(m_AD_Tree_ID)
			.append(" AND AD_User_ID=").append(AD_User_ID)
			.append(" AND Node_ID=").append(Node_ID);
		int no = DB.executeUpdate(sql.toString(), true, null);
		return no == 1;
	}	//	barDBupdate


	/**
	 *  Clicked on Expand All
	 */
	private void expandTree()
	{
		if (treeExpand.isSelected())
		{
			for (int row = 0; row < tree.getRowCount(); row++)
				tree.expandRow(row);
		}
		else
		{
			//			patch: 1654055 +jgubo Changed direction of collapsing the tree nodes
			for (int row = tree.getRowCount(); row > 0; row--)
				tree.collapseRow(row);
		}
	}   //  expandTree

	@Override
	public void paint(Graphics g) {
		if (m_lookAndFeelChanged) {
			m_lookAndFeelChanged = false;
			if (m_hasBar) removeSplitPaneBorder();
		}
		super.paint(g);
	}

	public void selectItem(int xx) {
		selectID(xx, false);
		//  Select it
		MTreeNode tn = (MTreeNode)tree.getSelectionPath().getLastPathComponent();
		setSelectedNode(tn);		
	}

	class IconPanelGroup extends JSplitPane implements MouseListener
	{
		//private IconPanel iconPanel2 = new IconPanel();
		//private PAPanel iconPanel2 = null;
		private CPanel iconPanel2 = new CPanel();
		private CPanel panel = new CPanel();
		//private PAPanel panel = PAPanel.get();
		private ArrayList<Integer> iconlist = new ArrayList<Integer>();
		private VTreePanel m_treePanel;
		public IconPanelGroup(VTreePanel treePanel) {
			super(JSplitPane.VERTICAL_SPLIT, true);
			m_treePanel = treePanel;
			setResizeWeight(0.5);				
			//setLeftComponent(iconPanel);

			AbstractAction action = new AbstractAction() {

				public void actionPerformed(ActionEvent e) {
					int index = ((IconPanel) e.getSource()).getSelectedIndex();
					if (index >= 0 && index < iconlist.size())
					{
						m_treePanel.selectItem(iconlist.get(index));
					}
				}

			};
			panel.addMouseListener(this);
			//iconPanel.setDragEnabled(true);
			//iconPanel.setTransferHandler(new simpleTransferHandler());
			//iconPanel.setMinimumSize(new Dimension(10, 10));			
			//iconPanel.setDoubleClickAction(action);
			//iconPanel.addMouseListener(this);			
		}
		public void createIconGroup()
		{
			PAPanel papanel = PAPanel.get();
			if (papanel != null)
				iconPanel2.add(papanel);
//			iconPanel2.setDragEnabled(true);
			iconPanel2.setTransferHandler(new simpleTransferHandler());
			iconPanel2.setMinimumSize(new Dimension(10, 10));
//			iconPanel2.setDoubleClickAction(action);	
			setLeftComponent(panel);
			setRightComponent(iconPanel2);			
		}
		
		public int RemoveSelectedItem() {
//			int index = iconPanel.getSelectedIndex();
//			if (index >= 0 && index < iconlist.size())
			{
//				iconPanel.remove(index);
//				iconlist.remove(index);
//				iconPanel.validate();
//				return index;
			}
			return 0;
		}
		public void removeicon(Integer node_id) {
			Component[] components = panel.getComponents();
			for (Component comp:components)
			{
				if (comp instanceof JButton)
				{
					JButton btn = (JButton) comp;
					if (btn.getActionCommand().equals(String.valueOf(node_id)))
					{
						panel.remove(btn);
						break;
					}
				}
			}			
		}
		public void addicon(Icon icon, String name, String description, int node_ID) {
			//AEnv.createActionButton(voidAction,	null,"New24","Nuevo documento");			
			JButton btn = AEnv.getDarkButton(icon, name, description);			
			btn.setActionCommand(String.valueOf(node_ID));			
			btn.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	            	m_treePanel.selectItem(Integer.valueOf(e.getActionCommand()));
	            }
	        });
			
			panel.add(btn);
			iconlist.add(node_ID);
			
			Component[] components = panel.getComponents();
			Dimension dimmax = null;
			for (Component comp:components)
			{
				if (comp instanceof JButton)
				{
					//Dimension dim = comp.getSize();
					Dimension dim = comp.getPreferredSize();
					if (dimmax == null)
						dimmax = dim;
					else if (dimmax.getWidth() < dim.getWidth())
						dimmax = dim;
				}
			}			
			for (Component comp:components)
			{
				if (comp instanceof JButton)
				{
					//comp.setSize(dimmax);
					comp.setPreferredSize(dimmax);
				}
			}									
		}

		/**
		 * simpleTransferhandler.
		 */
		private class simpleTransferHandler extends TransferHandler {

			/** {@inheritDoc} */
			public int getSourceActions(JComponent c) {
				return TransferHandler.COPY_OR_MOVE;
			}

			/** {@inheritDoc} */
			public boolean canImport(JComponent comp, DataFlavor[] transferFlavors) {
				return (comp instanceof IconPanel);
			}

			/** {@inheritDoc} */
			protected Transferable createTransferable(JComponent c) {		
	            //Object[] selected = ((IconPanel) c).getSelectedIcons();
	            //return new ObjectArrayTransferable(c, selected);
	            return null;
			}

			/** {@inheritDoc} */
			protected void exportDone(JComponent source, Transferable data, int action) {
				if (action == TransferHandler.MOVE) {
					ObjectArrayTransferable object;
					try {
						//Object[] array = (Object[]) t.getTransferData(ObjectArrayTransferable.FLAVOR);
						((IconPanel) source).removeSelected();
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}

			/** {@inheritDoc} */
			public boolean importData(JComponent comp, Transferable t) {
				boolean successfulImport = false;
				try {

					Object[] array = (Object[]) t.getTransferData(ObjectArrayTransferable.FLAVOR);
					for (int i = 0; i < array.length; i++) {
						ClickableIcon icon = (ClickableIcon) array[i];
						//((IconPanel) comp).add(createIcon(icon.getText()), icon.getText(), "Imported = " + icon.getText());
					}
					successfulImport = true;
				} catch (Exception e) {
					e.printStackTrace();
				}
				return successfulImport;
			}
		}

		@Override
		public void mouseClicked(MouseEvent e) {
			if (SwingUtilities.isRightMouseButton(e) )
			{
				int index = ((IconPanel) e.getSource()).getSelectedIndex();
				if (index >=0 && index <= iconlist.size())
				{
					popMenuBar.show((Component)e.getSource(), e.getX(), e.getY());
				}
			}		
		}
		@Override
		public void mouseEntered(MouseEvent arg0) {			
		}
		@Override
		public void mouseExited(MouseEvent arg0) {			
		}
		@Override
		public void mousePressed(MouseEvent arg0) {			
		}
		@Override
		public void mouseReleased(MouseEvent arg0) {			
		}    
	}	
}   //  VTreePanel


/******************************************************************************
 *  Mouse Clicked
 */
class VTreePanel_mouseAdapter extends java.awt.event.MouseAdapter
{
	VTreePanel m_adaptee;

	/**
	 * 	VTreePanel_mouseAdapter
	 *	@param adaptee
	 */
	VTreePanel_mouseAdapter(VTreePanel adaptee)
	{
		m_adaptee = adaptee;
	}

	/**
	 *	Mouse Clicked
	 *	@param e
	 */
	public void mouseClicked(MouseEvent e)
	{
		m_adaptee.mouseClicked(e);
	}
}   //  VTreePanel_mouseAdapter

/**
 *  Key Pressed
 */
class VTreePanel_keyAdapter extends java.awt.event.KeyAdapter
{
	VTreePanel m_adaptee;

	/**
	 * 	VTreePanel_keyAdapter
	 *	@param adaptee
	 */
	VTreePanel_keyAdapter(VTreePanel adaptee)
	{
		m_adaptee = adaptee;
	}

	/**
	 * 	Key Pressed
	 *	@param e
	 */
	public void keyPressed(KeyEvent e)
	{
		if (e.getKeyCode() == KeyEvent.VK_ENTER)
			m_adaptee.keyPressed(e);
	}
}   //  VTreePanel_keyAdapter

