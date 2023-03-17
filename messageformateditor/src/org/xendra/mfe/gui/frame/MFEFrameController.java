package org.xendra.mfe.gui.frame;

import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.SwingUtilities;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.TreePath;
import org.columba.api.gui.frame.IContainer;
import org.columba.api.gui.frame.IDock;
import org.columba.api.gui.frame.IDockable;
import org.columba.core.config.View;
import org.columba.core.gui.frame.DockFrameController;
import org.columba.core.io.DiskIO;
import org.compiere.model.MConfig;
import org.xendra.mfe.gui.modeler.MessageEditor;
import org.xendra.mfe.gui.propertysheet.PropertySheetPage;
import org.xendra.mfe.gui.tree.TreeController;
import org.xendra.mfe.gui.tree.TreeMouseListener;
import org.xendra.mfe.util.ResourceLoader;
import org.xendra.model.AbstractFolder;

import com.mxgraph.swing.mxGraphOutline;

public class MFEFrameController extends DockFrameController implements TreeSelectionListener {
	protected TreeController tree;
	protected PropertySheetPage propertysheet;	
	private MessageEditor modeleditor;
	protected mxGraphOutline zoomeditor;
	private IDockable treePanel;
	private IDockable editorPanel;
	private IDockable propertysheetPanel;
	private JSplitPane inner;	
	private JSplitPane inner2;	
	public MFEFrameController(View viewItem) {
		super(viewItem);
		tree = new TreeController(this);
		propertysheet = new PropertySheetPage();
		modeleditor = new MessageEditor();
		modeleditor.setPropertyEditor(propertysheet);
		modeleditor.setTreeController(tree);
		modeleditor.setGraphComponent();
		//editor = new NewEditor();		 
		tree.getView().addTreeSelectionListener(this);
		//tree.getView().addTreeSelectionListener(editor);
		tree.getView().addTreeSelectionListener(modeleditor);
		tree.getView().addTreeSelectionListener(propertysheet);
		tree.getView().addMouseListener(new TreeMouseListener(tree));
		JScrollPane treeScrollPane = new JScrollPane(tree.getView());
		//
		zoomeditor = new mxGraphOutline(modeleditor.getGraphComponent());
		inner = new JSplitPane(JSplitPane.VERTICAL_SPLIT, treeScrollPane, zoomeditor);
		inner.setDividerLocation(320);
		inner.setResizeWeight(1);
		inner.setDividerSize(6);
		inner.setBorder(null);	
		//		
		//treeScrollPane.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
		//inner = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, treeScrollPane, editor);
		//inner.setDividerLocation(320);
		//inner.setResizeWeight(1);
		//inner.setDividerSize(6);
		//inner.setBorder(null);			
		tree.createPopupMenu();
		registerDockables();		
	}

	private void registerDockables() {	
		treePanel = registerDockable("mfe_foldertree", ResourceLoader.getString("global",  "dockable_foldertree"), inner, null);
		editorPanel = registerDockable("modeleditor", ResourceLoader.getString("global", "editor"), modeleditor, null);
		propertysheetPanel = registerDockable("propertysheetpanel", ResourceLoader.getString("global","docable_prop"), propertysheet, null);
	}

	public void loadDefaultPosition() {
		super.dock(editorPanel, IDock.REGION.WEST);
		super.dock(treePanel, IDock.REGION.WEST);
		super.dock(propertysheetPanel , IDock.REGION.EAST);		
	}

	public void valueChanged(TreeSelectionEvent arg0) {
		AbstractFolder selectedFolder = (AbstractFolder) arg0.getPath().getLastPathComponent();
		if (selectedFolder != null) {
			fireTitleChanged(selectedFolder.getName());
		}
	}	
	public void extendMenu(IContainer container) {
		try {
			InputStream is = DiskIO.getResourceStream("org/xendra/mfe/action/menu.xml");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void extendToolBar(IContainer container) {
		try {
			MConfig config = MConfig.getbyIdentifier("org.xendra.mfe","main_toolbar");
			InputStream is2 = new ByteArrayInputStream(config.getContent().getBytes());
			container.extendToolbar(this, is2);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	public TreeController getTree()   {		
		return tree;	
	}
	public void addTreeSelectionListener(TreeSelectionListener listener) {
		getTree().getView().addTreeSelectionListener(listener);
	}
	public String getString(String sPath, String sName, String sID) {
		return ResourceLoader.getString(sPath, sName, sID);
	}

	public void loadPositions() {		
		super.loadPositions("org.xendra.mfe");		
	}
}
