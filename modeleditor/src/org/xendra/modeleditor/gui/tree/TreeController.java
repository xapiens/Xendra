package org.xendra.modeleditor.gui.tree;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.lang.reflect.Method;
import java.util.List;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JFileChooser;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.JTextArea;
import javax.swing.UIManager;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreePath;

import org.xendra.developer.GenerateProcedure;
import org.xendra.developer.ReferencetoAnnotation;
import org.xendra.modeleditor.folder.AbstractFolder;
import org.xendra.modeleditor.folder.ColumnFolder;
import org.xendra.modeleditor.folder.PackageFolder;
import org.xendra.modeleditor.folder.PluginFolder;
import org.xendra.modeleditor.folder.FunctionFolder;
import org.xendra.modeleditor.folder.TabFolder;
import org.xendra.modeleditor.folder.TableFolder;
import org.xendra.modeleditor.folder.ViewFolder;
import org.xendra.modeleditor.folder.WindowFolder;
import org.xendra.modeleditor.gui.dialog.tab.EditFieldsDialog;
import org.xendra.modeleditor.gui.frame.ModelEditorFrameController;
import org.xendra.modeleditor.gui.propertysheet.InfoDialog;
import org.xendra.modeleditor.gui.tree.TreeView;
import org.xendra.modeleditor.plugin.IExtensionHandlerKeys;
import org.xendra.modeleditor.wizard.newcolumn.NewColumnWizardLauncher;
import org.xendra.modeleditor.wizard.newpackage.NewPackageWizardLauncher;
import org.xendra.modeleditor.wizard.newplugin.NewPluginWizardLauncher;
import org.xendra.modeleditor.wizard.newtab.NewTabWizardLauncher;
import org.xendra.modeleditor.wizard.newtable.NewTableWizardLauncher;
import org.xendra.modeleditor.wizard.newwindow.NewWindowWizardLauncher;
import org.adempiere.util.ProcessUtil;
import org.columba.api.gui.focus.FocusManager;
import org.columba.api.gui.focus.FocusOwner;
import org.columba.core.gui.base.DoubleClickListener;
import org.columba.core.gui.menu.MenuXMLDecoder;
import org.compiere.apps.ADialog;
import org.compiere.model.MPInstance;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_AD_Column;
import org.compiere.model.persistence.X_AD_Field;
import org.compiere.model.persistence.X_AD_Plugin;
import org.compiere.model.persistence.X_AD_Process;
import org.compiere.model.persistence.X_AD_Tab;
import org.compiere.model.persistence.X_AD_Table;
import org.compiere.model.reference.REF__EntityType;
import org.compiere.process.ProcessInfo;
import org.compiere.util.DB;
import org.compiere.util.Env;
import org.compiere.util.Msg;
import org.compiere.util.Trx;
import org.jdom.Element;
import org.postgresql.PGConnection;
import org.postgresql.copy.CopyManager;

import com.l2fprod.common.swing.JDirectoryChooser;
import com.mchange.v2.c3p0.C3P0ProxyConnection;

public class TreeController extends DoubleClickListener implements FocusOwner, ActionListener {

	private static final String ADDCOLUMN = "ADDC";
	private static final String FILLDATA = "FILLD";
	private static final String ADDWINDOW = "ADDW";
	private static final String ADDTAB = "ADDTAB";
	private static final String GENMODEL = "GENM";
	private static final String GENPROC = "GENPROC";
	private static final String GENVIEW = "GENVIEW";
	private static final String GENWINDOW = "GENW";
	private static final String GENCATALOG = "GENC";
	private static final String GENREF = "GENR";
	private static final String GENENCODE = "GENE";
	private static final String GENDECODE = "GEND";
	private static final String GENVALR = "GENVR";
	private static final String DELETE = "DEL";
	private static final String ADDPLUGIN = "ADDP";
	private static final String ADDTABLE = "ADDT";
	private static final String ADDPACKAGE = "ADDPKG";
	private static final String SYNCHRO = "SYNCHRO";
	private static final String REFRESH = "REFRSH";

	TreeView view;
	ModelEditorFrameController frameController;
	private JPopupMenu menu;	
	private String m_directory = "";
	private ByteArrayOutputStream baos;
	private PrintStream old;

	public TreeController(ModelEditorFrameController frameController) {
		super();
		this.frameController = frameController;
		view = new TreeView(frameController);
		view.addMouseListener(this);
		FocusManager.getInstance().registerComponent(this);
	}
	public TreeView getView() {
		return view;
	}
	public ModelEditorFrameController getFrameController() {
		return frameController;
	}
	public AbstractFolder getSelectedFolder() {
		return (AbstractFolder) getView().getLastSelectedPathComponent();
	}
	public void setSelectedFolder(AbstractFolder folder) {
		getView().clearSelection();
		TreePath path = new TreePath(folder.getPath());
		getView().setSelectionPath(path);
	}
	@Override
	public boolean isCutActionEnabled() {		return false;	}
	public boolean isCopyActionEnabled() {		return false;	}
	public boolean isPasteActionEnabled() {		return false;	}
	public boolean isDeleteActionEnabled() {   return false;	}
	public boolean isSelectAllActionEnabled() {		return false; }
	public boolean isUndoActionEnabled() {		return false;}
	public boolean isRedoActionEnabled() {return false;	}
	public void cut() {}
	public void copy() {}
	public void paste() {}
	public void delete() {}
	public void undo() {}
	public void redo() {}
	public void selectAll() {}

	@Override
	public JComponent getComponent() {
		return getView();
	}

	/**
	 * Creates a Popup menu.
	 */
	public void createPopupMenu() {
		try {
			File resource = new File(Env.getResource("org.xendra.modeleditor", "tree_contextmenu.xml"));
			if (resource.exists()) {
				InputStream is = new FileInputStream(resource);
				menu = new MenuXMLDecoder(frameController).createPopupMenu(is);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Returns the pop up menu for the controller.
	 *
	 * @return the pop up menu.
	 */
	public JPopupMenu getPopupMenu() {
		AbstractFolder f = getSelectedFolder();
		menu = new JPopupMenu("Edit");
		try {			
			ImageIcon pluginIcon = new ImageIcon(ImageIO.read(new File(Env.getResource(IExtensionHandlerKeys.ORG_XENDRA_MODELEDITOR, "plugin.png"))));
			ImageIcon addcolIcon  = new ImageIcon(ImageIO.read(new File(Env.getResource(IExtensionHandlerKeys.ORG_XENDRA_MODELEDITOR, "add.png"))));
			ImageIcon addtblIcon  = new ImageIcon(ImageIO.read(new File(Env.getResource(IExtensionHandlerKeys.ORG_XENDRA_MODELEDITOR, "table.png"))));
			ImageIcon processIcon = new ImageIcon(ImageIO.read(new File(Env.getResource(IExtensionHandlerKeys.ORG_XENDRA_MODELEDITOR,  "process.png"))));
			ImageIcon deleteIcon  = new ImageIcon(ImageIO.read(new File(Env.getResource("org.columba.core", "delete.png"))));
			ImageIcon refreshIcon = new ImageIcon(ImageIO.read(new File(Env.getResource(IExtensionHandlerKeys.ORG_XENDRA_MODELEDITOR, "refresh.png"))));
			ImageIcon windowIcon = new ImageIcon(ImageIO.read(new File(Env.getResource(IExtensionHandlerKeys.ORG_XENDRA_MODELEDITOR,  "window.png"))));
			ImageIcon formIcon = new ImageIcon(ImageIO.read(new File(Env.getResource(IExtensionHandlerKeys.ORG_XENDRA_MODELEDITOR, "form.png"))));
			ImageIcon packageIcon  = new ImageIcon(ImageIO.read(new File(Env.getResource(IExtensionHandlerKeys.ORG_XENDRA_MODELEDITOR, "package.png"))));
			JMenuItem del = new JMenuItem(Msg.translate(Env.getCtx(), "Delete"),deleteIcon);
			del.setActionCommand(DELETE);				
			del.addActionListener(this);						


			if (f instanceof TableFolder) {
				JMenuItem addcolumn = new JMenuItem("Add Column", addcolIcon);
				addcolumn.setActionCommand(ADDCOLUMN);
				addcolumn.addActionListener(this);
				menu.add(addcolumn);
				//
				JMenuItem filldata = new JMenuItem("Fill ...", processIcon);
				filldata.setActionCommand(FILLDATA);
				filldata.addActionListener(this);
				menu.add(filldata);
				//
				JMenuItem genmodel = new JMenuItem("Generate Model", processIcon);
				genmodel.setActionCommand(GENMODEL);
				genmodel.addActionListener(this);
				menu.add(genmodel);
				//
				JMenuItem genref = new JMenuItem("Generate Reference", processIcon);
				genref.setActionCommand(GENREF);
				genref.addActionListener(this);
				menu.add(genref);
				//
				JMenuItem gencode = new JMenuItem("Generate Encode (read)", processIcon);
				gencode.setActionCommand(GENENCODE);
				gencode.addActionListener(this);
				menu.add(gencode);
				//
				JMenuItem gdecode = new JMenuItem("Generate Decode (write)", processIcon);
				gdecode.setActionCommand(GENDECODE);
				gdecode.addActionListener(this);
				menu.add(gdecode);				
				//
				JMenuItem genvalrule = new  JMenuItem("Generate ValRule", processIcon);
				genvalrule.setActionCommand(GENVALR);
				genvalrule.addActionListener(this);
				menu.add(genvalrule);
				//
				JMenuItem sync = new JMenuItem("Synchronize", refreshIcon);
				sync.setActionCommand(SYNCHRO);
				sync.addActionListener(this);
				menu.add(sync);
				//
				menu.add(del);
				//
			} else if (f instanceof ColumnFolder) {
				menu.add(del);
			} else if (f instanceof TabFolder) {
				JMenuItem sync = new JMenuItem("Synchronize", refreshIcon);
				sync.setActionCommand(SYNCHRO);
				sync.addActionListener(this);
				menu.add(sync);
				menu.add(del);
			} else if (f instanceof FunctionFolder) {
				JMenuItem genproc = new JMenuItem("Generate Procedure", processIcon);
				genproc.setActionCommand(GENPROC);
				genproc.addActionListener(this);
				menu.add(genproc); 
			} else if (f instanceof ViewFolder) {
				JMenuItem genview = new JMenuItem("Generate View", processIcon);
				genview.setActionCommand(GENVIEW);
				genview.addActionListener(this);
				menu.add(genview);
			} else if (f instanceof PackageFolder) {
				JMenuItem addcolumn = new JMenuItem("Add Table", addtblIcon);
				addcolumn.setActionCommand(ADDTABLE);
				addcolumn.addActionListener(this);
				menu.add(addcolumn);
				JMenuItem addwindow = new JMenuItem("Add Window", windowIcon);
				addwindow.setActionCommand(ADDWINDOW);
				addwindow.addActionListener(this);
				menu.add(addwindow);				
			} else if (f instanceof PluginFolder) {
				JMenuItem genwindows = new JMenuItem("Generate Windows", windowIcon);
				genwindows.setActionCommand(GENWINDOW);
				genwindows.addActionListener(this);
				menu.add(genwindows);
				JMenuItem addpackage = new JMenuItem("Add Package", packageIcon);
				addpackage.setActionCommand(ADDPACKAGE);
				addpackage.addActionListener(this);
				menu.add(addpackage);
				JMenuItem addplugin = new JMenuItem("Add Plugin", pluginIcon);
				addplugin.setActionCommand(ADDPLUGIN);
				addplugin.addActionListener(this);
				menu.add(addplugin);				
				JMenuItem gencatalog = new JMenuItem("Generate catalog", processIcon);
				gencatalog.setActionCommand(GENCATALOG);
				gencatalog.addActionListener(this);
				menu.add(gencatalog);
			} else if (f instanceof WindowFolder) {
				JMenuItem addtab = new JMenuItem("Add Tab", formIcon);
				addtab.setActionCommand(ADDTAB);
				addtab.addActionListener(this);
				menu.add(addtab);
			}
			JMenuItem refresh = new JMenuItem("Refresh", refreshIcon);
			refresh.setActionCommand(REFRESH);
			refresh.addActionListener(this);
			menu.add(refresh);
		} catch (Exception e) {
			e.printStackTrace();
		}	
		return menu;
	}	

	@Override
	public void doubleClick(MouseEvent e) {
		if (e.getButton()==MouseEvent.BUTTON1 && e.getClickCount() > 1) {
			AbstractFolder f = getSelectedFolder();
			if (!(f instanceof TabFolder) )
				return;			
			TabFolder folder = (TabFolder) f;

			if (folder == null)
				return;

			EditFieldsDialog dialog = new EditFieldsDialog(
					frameController.getView().getFrame(),  (AbstractFolder) folder);
			if (dialog.getResult()) {
				//folder.modelChanged();
			}			
		}

	}

	public boolean getResult() {
		return false;
	}

	public void findNode(Integer nodeid) {
		AbstractFolder folder = getView().getRootFolder();
		AbstractFolder node = folder.findNode(nodeid);
		if (node != null)
		{
			TreePath treePath = new TreePath(node.getPath());
			view.setSelectionPath(treePath);
			view.makeVisible(treePath);       	//	expand it
			view.scrollPathToVisible(treePath);
		}
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		AbstractFolder f = getSelectedFolder();		
		Element item = f.getElement();
		String m_uid = item.getAttributeValue("uid");
		if (e.getActionCommand().equals(ADDCOLUMN)) {			
			NewColumnWizardLauncher nn = new NewColumnWizardLauncher();
			nn.launchWizard(m_uid);
			f.loadChildren();			
		} else if (e.getActionCommand().equals(SYNCHRO)) {
			if (f instanceof  TableFolder) {
				runprocess("143f62fd-832b-2e26-c8ca-e2467cbaeff3", Integer.valueOf(m_uid));
			} else if (f instanceof TabFolder) {
				runprocess("aa07b771-26a1-2115-5a8c-2761edd6e6cf", Integer.valueOf(m_uid));
			}			
			f.loadChildren();
		} else if (e.getActionCommand().equals(GENMODEL)) {
			setGenerateModel(Integer.valueOf(m_uid), selectDirectory(m_directory));
		} else if (e.getActionCommand().equals(GENPROC)) {
			setGeneralProc(f, selectDirectory(m_directory));
		} else if (e.getActionCommand().equals(GENVIEW)) {
			setGeneralView(f, selectDirectory(m_directory));
		} else if (e.getActionCommand().equals(GENWINDOW)) {
			setGenerateWindows(selectDirectory(m_directory));		
		} else if (e.getActionCommand().equals(GENCATALOG)) {
			setGenerateCatalog(Integer.valueOf(m_uid),selectDirectory(m_directory));
		} else if (e.getActionCommand().equals(FILLDATA)) {
			FillData(selectFile(m_directory));
		} else if (e.getActionCommand().equals(GENREF)) {
			GenerateReferences(Integer.valueOf(m_uid), selectDirectory(m_directory));
		} else if (e.getActionCommand().equals(GENENCODE)) {
			setEncode(Integer.valueOf(m_uid), selectDirectory(m_directory));
		} else if (e.getActionCommand().equals(GENDECODE)) {
			setDecode(Integer.valueOf(m_uid), selectDirectory(m_directory));			
		} else if (e.getActionCommand().equals(GENVALR)) {
			setValRule(Integer.valueOf(m_uid), selectDirectory(m_directory));
		} else if (e.getActionCommand().equals(ADDPLUGIN)) {
			NewPluginWizardLauncher nn = new NewPluginWizardLauncher();
			nn.launchWizard();
		} else if (e.getActionCommand().equals(ADDPACKAGE)) {
			NewPackageWizardLauncher nn = new NewPackageWizardLauncher();
			nn.launchWizard();
		} else if (e.getActionCommand().equals(ADDTABLE)) {
			String ID = item.getAttributeValue("ID");
			String plugin_id = item.getAttributeValue("AD_Plugin_ID");
			NewTableWizardLauncher nn = new NewTableWizardLauncher();
			nn.setAD_Plugin_ID(Integer.valueOf(plugin_id));
			nn.setID(ID);
			nn.launchWizard();
		} else if (e.getActionCommand().equals(ADDTAB)) {
			NewTabWizardLauncher nn = new NewTabWizardLauncher();
			nn.setAD_Window_ID(Integer.valueOf(m_uid));
			nn.launchWizard();
		} else if (e.getActionCommand().equals(ADDWINDOW)) {
			String ID = item.getAttributeValue("ID");
			String plugin_id = item.getAttributeValue("AD_Plugin_ID");
			NewWindowWizardLauncher nn = new NewWindowWizardLauncher();
			nn.setAD_Plugin_ID(Integer.valueOf(plugin_id));
			nn.setID(ID);
			nn.launchWizard();
		} else if (e.getActionCommand().equals(REFRESH)) {
			f.loadChildren();			
			((DefaultTreeModel) getView().getModel()).reload(f);			
		} else if (e.getActionCommand().equals(DELETE)) {		
			if (f instanceof ColumnFolder) {
				if (m_uid.length() > 0) {
					X_AD_Column c = new Query(Env.getCtx(), X_AD_Column.Table_Name, "AD_Column_ID = ?", null)
					.setParameters(Integer.valueOf(m_uid)).first();
					if (c != null) {
						List<X_AD_Field> fields = new Query(Env.getCtx(), X_AD_Field.Table_Name, "AD_Column_ID = ?", null)
						.setParameters(c.getAD_Column_ID()).list();
						for (X_AD_Field field:fields) {
							field.delete(false);
						}
						if (!c.delete(false)) {
							ADialog.error(0, null, "no se pudo borrar!");
						} else {
							TableFolder table = (TableFolder) f.getParent();
							table.loadChildren();
						}
					}
				}
			} else if (f instanceof TableFolder) {
				String message = String.format("Desea borrar %s", f.getName());
				if (ADialog.ask(0, null, message)) {
					List<X_AD_Column> columns = new Query(Env.getCtx(), X_AD_Column.Table_Name, "AD_Table_ID = ?", null)
					.setParameters(Integer.valueOf(m_uid)).list();
					for (X_AD_Column column:columns) {
						column.delete(true);
					}
					X_AD_Table table = new Query(Env.getCtx(), X_AD_Table.Table_Name, "AD_Table_ID = ?", null)
					.setParameters(Integer.valueOf(m_uid)).first();
					if (table != null) {
						table.delete(true);
					}
				}
			} else if (f instanceof TabFolder) {
				String message = String.format("Desea borrar %s", f.getName());
				if (ADialog.ask(0, null, message)) {
					List<X_AD_Field> fields = new Query(Env.getCtx(), X_AD_Field.Table_Name, "AD_Tab_ID = ?", null)
					.setParameters(Integer.valueOf(m_uid)).list();
					for (X_AD_Field field:fields) {
						field.delete(true);
					}
					X_AD_Tab tab = new Query(Env.getCtx(), X_AD_Tab.Table_Name, "AD_Tab_ID = ?", null)
					.setParameters(Integer.valueOf(m_uid)).first();
					if (tab != null) {
						tab.delete(true);
					}
				}
			}
		}
		((DefaultTreeModel) getView().getModel()).reload(f);
	}

	private void runprocess(String identifier, int uid) {
		X_AD_Process p = new Query(Env.getCtx(), X_AD_Process.Table_Name, "Identifier = ?", null)
		.setParameters(identifier).first();		
		ProcessInfo pi = new ProcessInfo ("", p.getAD_Process_ID(), X_AD_Table.Table_ID, uid);
		MPInstance instance = new MPInstance(Env.getCtx(),pi.getAD_Process_ID(), uid);
		if (!instance.save())
		{

		}		
		pi.setAD_PInstance_ID (instance.getAD_PInstance_ID());
		pi.setClassName(p.getClassname());
		pi.setRecord_ID(uid);								
		String trxName = "CopyColumnsFromTable";	
		Trx trx = Trx.get(trxName, true);	//trx needs to be committed too		
		ProcessUtil.startJavaProcess(Env.getCtx(), pi, trx);			
		trx.close();		
	}

	private void setEncode(Integer AD_Table_ID, File selectDirectory) {
		X_AD_Table t = new Query(Env.getCtx(), X_AD_Table.Table_Name, "AD_Table_ID = ?", null)
		.setParameters(AD_Table_ID).first();		
		String[] args = {selectDirectory.getAbsolutePath().concat("/"),
				t.getTableName()};
		startcapture();
		org.xendra.developer.encode.main(args);
		stopcapture();
		String info = getcapture();
		InfoDialog id = new InfoDialog();
		id.setMessage(info);
	}

	private void setDecode(Integer AD_Table_ID, File selectDirectory) {
		X_AD_Table t = new Query(Env.getCtx(), X_AD_Table.Table_Name, "AD_Table_ID = ?", null)
		.setParameters(AD_Table_ID).first();		
		String[] args = {selectDirectory.getAbsolutePath().concat("/"),
				t.getTableName()};
		startcapture();
		org.xendra.developer.encode.maindecode(args);
		stopcapture();
		String info = getcapture();
		InfoDialog id = new InfoDialog();
		id.setMessage(info);
	}

	
	private void setValRule(Integer AD_Table_ID, File selectDirectory) {
		X_AD_Table t = new Query(Env.getCtx(), X_AD_Table.Table_Name, "AD_Table_ID = ?", null)
		.setParameters(AD_Table_ID).first();		
		String[] args = {selectDirectory.getAbsolutePath().concat("/"),
				t.getTableName()};
		startcapture();
		org.xendra.developer.genValRule.main(args);
		stopcapture();
		String info = getcapture();
		InfoDialog id = new InfoDialog();
		id.setMessage(info);		
	}


	private void GenerateReferences(Integer AD_Table_ID, File selectDirectory) {
		X_AD_Table t = new Query(Env.getCtx(), X_AD_Table.Table_Name, "AD_Table_ID = ?", null)
		.setParameters(AD_Table_ID).first();		
		List<X_AD_Column> columns = new Query(Env.getCtx(), X_AD_Column.Table_Name, "AD_Table_ID = ?", null)
		.setParameters(t.getAD_Table_ID()).list();
		String info = "";
		for (X_AD_Column column:columns) {
			if (column.getAD_Reference_Value_ID() > 0) {
				String[] args = {selectDirectory.getAbsolutePath().concat("/"),
						String.valueOf(column.getAD_Reference_Value_ID())};
				startcapture();
				ReferencetoAnnotation.main(args);					
				stopcapture();
				info += getcapture();
			}
		}
		InfoDialog id = new InfoDialog();
		id.setMessage(info);						
	}

	private void FillData(File fillfile) {
		try {
			C3P0ProxyConnection proxycon = (C3P0ProxyConnection) DB.getConnectionRW();
			Method m = PGConnection.class.getMethod("getCopyAPI", new Class[]{});
			Object[] arg = new Object[] {};
			CopyManager copyManager = (CopyManager) proxycon.rawConnectionOperation(m, C3P0ProxyConnection.RAW_CONNECTION, arg);
			String cpcommand = "COPY %s FROM STDIN WITH (FORMAT csv, header false, delimiter '|')";			
			long records = copyManager.copyIn(String.format(cpcommand, "xendra.ad_package"), new FileReader(fillfile));
			System.out.println(String.format("copy %s:%s record(s)", fillfile.getAbsoluteFile(), records));
		} catch (Exception e) {
			System.out.println("X");
			System.out.println(String.format("Table with error %s", fillfile.getAbsoluteFile()));
			e.printStackTrace();
		}		
	}

	private void setGenerateCatalog(Integer AD_Plugin_ID, File selectDirectory) {
		try {
			X_AD_Plugin plugin = new Query(Env.getCtx(), X_AD_Plugin.Table_Name, "AD_Plugin_ID = ?", null)
			.setParameters(AD_Plugin_ID).first();
			String plugincontent = plugin.getplugin();
			String filedest = String.format("%s%s", System.getProperty("java.io.tmpdir") + System.getProperty("file.separator"),"plugin.xml");
			PrintStream out = new PrintStream(new FileOutputStream(filedest));
			out.print(plugincontent);
			out.flush();
			out.close();
			String[] args = {selectDirectory.getAbsolutePath().concat("/"),
					filedest};
			startcapture();
			org.xendra.developer.GenerateCatalog.main(args);
			stopcapture();
			String info = getcapture();
			InfoDialog id = new InfoDialog();
			id.setMessage(info);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void setGenerateWindows(File selectDirectory) {
		String[] args = {selectDirectory.getAbsolutePath().concat("/")};
		startcapture();
		org.xendra.developer.WindowFormtoAnnotation.main(args);
		stopcapture();
		String info = getcapture();
		InfoDialog id = new InfoDialog();
		id.setMessage(info);
	}

	private void setGeneralView(AbstractFolder f, File selectDirectory) {
		startcapture();
		Object[] args = {selectDirectory.getAbsolutePath().concat("/"),
				f.getElement()
		};
		org.xendra.developer.GenerateView.main(args);
		stopcapture();
		String info = getcapture();
		InfoDialog id = new InfoDialog();
		id.setMessage(info);
	}
	
	private void setGeneralProc(AbstractFolder f, File selectDirectory) {
		startcapture();
		Object[] args = {selectDirectory.getAbsolutePath().concat("/"),
				f.getElement()
		};
		org.xendra.developer.GenerateProcedure.main(args);
		stopcapture();
		String info = getcapture();
		InfoDialog id = new InfoDialog();
		id.setMessage(info);
	}
	
	private void setGenerateModel(Integer AD_Table_ID, File selectDirectory) {
		X_AD_Table t = new Query(Env.getCtx(), X_AD_Table.Table_Name, "AD_Table_ID = ?", null)
		.setParameters(AD_Table_ID).first();
		//		
		String[] args = {selectDirectory.getAbsolutePath().concat("/"), 
				"org.compiere.model.persistence", 				
				String.format("'%s'", REF__EntityType.Dictionary),
				String.format("'%s'",t.getTableName())};
		startcapture();
		org.xendra.developer.GenerateModelView.main(args);
		stopcapture();
		String info = getcapture();
		InfoDialog id = new InfoDialog();
		id.setMessage(info);
	}

	public void startcapture() {
		baos = new ByteArrayOutputStream();
		PrintStream ps = new PrintStream(baos);
		old = System.out;
		System.setOut(ps);
	} 	

	public void stopcapture() {
		System.out.flush();
		System.setOut(old);		
	}	

	public String getcapture() {
		return baos.toString();
	}

	File selectFile(String selectedFile) {
		File ret = null;
		JFileChooser fc = new JFileChooser(new File(selectedFile));
		fc.setDialogType(JFileChooser.OPEN_DIALOG);
		fc.setFileSelectionMode(JFileChooser.FILES_ONLY);
		fc.setMultiSelectionEnabled(false);
		fc.setDialogTitle("Fill");
		if (fc.showOpenDialog(null) == JFileChooser.APPROVE_OPTION)
			ret = new File(fc.getSelectedFile().getAbsolutePath());
		return ret;
	}

	File selectDirectory(String selectedFile) {
		File ret = null;
		JDirectoryChooser chooser;
		chooser = new JDirectoryChooser();
		if (selectedFile != null) {
			chooser.setSelectedFile(new File(selectedFile));
		}
		JTextArea accessory = new JTextArea("seleccione el folder donde desea generar el modelo");
		accessory.setLineWrap(true);
		accessory.setWrapStyleWord(true);
		accessory.setEditable(false);
		accessory.setOpaque(false);
		accessory.setFont(UIManager.getFont("Tree.font"));
		chooser.setAccessory(accessory);
		int choice = chooser.showOpenDialog(null);
		if (choice == JDirectoryChooser.APPROVE_OPTION) {
			File[] selectedFiles = chooser.getSelectedFiles();
			for (int i = 0, c = selectedFiles.length; i < c; i++) {				
				ret = selectedFiles[i];
			}
		}
		m_directory = selectedFile;
		return ret;
	}

}
