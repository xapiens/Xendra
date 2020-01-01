package org.xendra.ruleeditor.gui.tree;

import java.awt.Component;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.util.Properties;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreePath;

import org.xendra.core.command.Environment;
import org.xendra.ruleeditor.gui.dialog.group.EditGroupDialog;
import org.xendra.ruleeditor.gui.frame.RuleEditorFrameController;
import org.xendra.ruleeditor.gui.propertysheet.ModelBean;
import org.xendra.ruleeditor.model.IGroupModel;
import org.xendra.ruleeditor.wizard.exportsession.ExportSessionWizardLauncher;
import org.xendra.ruleeditor.wizard.newchannel.NewChannelWizardLauncher;
import org.xendra.ruleeditor.wizard.newdecisiontable.NewDecisionTableWizardLauncher;
import org.xendra.ruleeditor.wizard.newfact.NewFactWizardLauncher;
import org.xendra.ruleeditor.wizard.newform.NewFormWizardLauncher;
import org.xendra.ruleeditor.wizard.newmodel.NewModelWizardLauncher;
import org.xendra.ruleeditor.wizard.newrgroup.NewGroupWizardLauncher;
import org.xendra.ruleeditor.wizard.newrule.NewRuleWizardLauncher;
import org.xendra.ruleeditor.wizard.newsession.NewSessionWizardLauncher;
import org.xendra.ruleeditor.folder.AbstractFolder;
import org.xendra.ruleeditor.folder.ChannelFolder;
import org.xendra.ruleeditor.folder.FactFolder;
import org.xendra.ruleeditor.folder.FormFolder;
import org.xendra.ruleeditor.folder.GroupFolder;
import org.xendra.ruleeditor.folder.KieBaseFolder;
import org.xendra.ruleeditor.folder.ModelFolder;
import org.xendra.ruleeditor.folder.PluginFolder;
import org.xendra.ruleeditor.folder.RuleFolder;
import org.columba.api.gui.focus.FocusManager;
import org.columba.api.gui.focus.FocusOwner;
import org.columba.core.gui.menu.MenuXMLDecoder;
import org.columba.core.resourceloader.IconKeys;
import org.columba.core.resourceloader.ImageLoader;
import org.compiere.apps.AEnv;
import org.compiere.apps.form.FormFrame;
import org.compiere.model.MQuery;
import org.compiere.model.PO;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_AD_Form;
import org.compiere.model.persistence.X_AD_Rule;
import org.compiere.util.Env;
import org.compiere.util.Ini;
import org.compiere.util.Msg;

public class TreeController implements FocusOwner, ActionListener {

	private static final String ADDRULE = "ADDR";
	private static final String ADDDT = "ADDDT";
	private static final String DELETE = "DEL";
	private static final String REFRESH = "REF";
	private static final String ADDFACT = "ADDFCT";
	private static final String ADDMOD = "ADDM";
	private static final String ADDCHANNEL = "ADDCHAN";
	private static final String ADDFORM = "ADDFRM";
	private static final String ADDGROUP = "ADDG";
	private static final String EDITGROUP ="EDIG";
	private static final String ADDSESSION = "ADDS";
	private static final String EXPSESSION = "ESSE";
	private static final String EXEFORM = "EFORM";
	private static final String EXEMODEL = "EMODEL";
	TreeView view;
	RuleEditorFrameController frameController;
	private JPopupMenu menu;

	public TreeController(RuleEditorFrameController frameController) {
		super();
		this.frameController = frameController;
		view = new TreeView(frameController);
		//view.addMouseListener(this);
		FocusManager.getInstance().registerComponent(this);
	}
	public TreeView getView() {
		return view;
	}
	public RuleEditorFrameController getFrameController() {
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
	public boolean isDeleteActionEnabled() {   return true;	}
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

	public void createPopupMenu() {
		try {						
			File resource = new File(Env.getResource("org.xendra.ruleeditor", "tree_contextmenu.xml"));
			if (resource.exists()) {
				InputStream is = new FileInputStream(resource);
				menu = new MenuXMLDecoder(frameController).createPopupMenu(is);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public JPopupMenu getPopupMenu(Component component) {		
		AbstractFolder f = getSelectedFolder();
		menu = new JPopupMenu("Edit");
		try {
			ImageIcon groupIcon = ImageLoader.getSmallIcon(IconKeys.USER);
			ImageIcon ruleIcon  = new ImageIcon(ImageIO.read(new File(Env.getResource("org.xendra.ruleeditor", "drools.png"))));
			ImageIcon calcIcon = new ImageIcon(ImageIO.read(new File(Env.getResource("org.xendra.ruleeditor", "nc01.png"))));
			ImageIcon channelIcon = new ImageIcon(ImageIO.read(new File(Env.getResource("org.xendra.ruleeditor","channel.png"))));
			ImageIcon factIcon =  new ImageIcon(ImageIO.read(new File(Env.getResource("org.xendra.ruleeditor", "fact.png"))));
			ImageIcon modelIcon = new ImageIcon(ImageIO.read(new File(Env.getResource("org.xendra.ruleeditor", "table.png"))));
			ImageIcon execIcon = new ImageIcon(ImageIO.read(new File(Env.getResource("org.xendra.ruleeditor", "process.png"))));
			ImageIcon deleteIcon  = new ImageIcon(ImageIO.read(new File(Env.getResource("org.columba.core", "delete.png"))));
			ImageIcon processIcon  = new ImageIcon(ImageIO.read(new File(Env.getResource("org.xendra.ruleeditor", "kiebase.png"))));
			ImageIcon refreshIcon = new ImageIcon(ImageIO.read(new File(Env.getResource("org.xendra.ruleeditor", "refresh.png"))));
			ImageIcon exportIcon = new ImageIcon(ImageIO.read(new File(Env.getResource("org.xendra.ruleeditor", "export.png"))));
			ImageIcon formIcon = new ImageIcon(ImageIO.read(new File(Env.getResource("org.xendra.ruleeditor",  "form.png"))));
			ImageIcon tableIcon = new ImageIcon(ImageIO.read(new File(Env.getResource("org.xendra.ruleeditor", "table.png"))));
			JMenuItem del = new JMenuItem(Msg.translate(Env.getCtx(), "Delete"),deleteIcon);
			del.setActionCommand(DELETE);				
			del.addActionListener(this);						

			if (f instanceof KieBaseFolder) {			
				//
				JMenuItem addrule = new JMenuItem("Add Rule", ruleIcon);
				addrule.setActionCommand(ADDRULE);
				addrule.addActionListener(this);
				menu.add(addrule);
				//
				JMenuItem adddt = new JMenuItem("Add Decision Table", calcIcon);
				adddt.setActionCommand(ADDDT);
				adddt.addActionListener(this);
				menu.add(adddt);
				//
				JMenuItem addfact = new JMenuItem("Add Fact", factIcon);
				addfact.setActionCommand(ADDFACT);
				addfact.addActionListener(this);
				menu.add(addfact);
				//
				JMenuItem modelfact = new JMenuItem("Add Model", modelIcon);
				modelfact.setActionCommand(ADDMOD);
				modelfact.addActionListener(this);
				menu.add(modelfact);
				//
				JMenuItem channelfact = new JMenuItem("Add Channel", channelIcon);
				channelfact.setActionCommand(ADDCHANNEL);
				channelfact.addActionListener(this);
				menu.add(channelfact);
				//
				JMenuItem es = new JMenuItem(Msg.translate(Env.getCtx(), "Export"), exportIcon);
				es.setActionCommand(EXPSESSION);
				es.addActionListener(this);
				menu.add(es);				
			} else if (f instanceof PluginFolder) {
				JMenuItem addgroup = new JMenuItem("Add Group", groupIcon);
				addgroup.setActionCommand(ADDGROUP);
				addgroup.addActionListener(this);
				menu.add(addgroup);
				JMenuItem addsession = new JMenuItem("Add Session",processIcon);
				addsession.setActionCommand(ADDSESSION);
				addsession.addActionListener(this);
				menu.add(addsession);
				//
				JMenuItem addfrm = new JMenuItem("Add Form", formIcon);
				addfrm.setActionCommand(ADDFORM);
				addfrm.addActionListener(this);
				menu.add(addfrm);				
				//
				JMenuItem es = new JMenuItem(Msg.translate(Env.getCtx(), "Export"), exportIcon);
				es.setActionCommand(EXPSESSION);
				es.addActionListener(this);
				menu.add(es);								
			} else if (f instanceof RuleFolder) {

			} else if (f instanceof FactFolder) {
				//
				JMenuItem addfact = new JMenuItem("Add Fact", factIcon);
				addfact.setActionCommand(ADDFACT);
				addfact.addActionListener(this);
				menu.add(addfact);				
				//
			} else if (f instanceof GroupFolder) {
				JMenuItem edtgroup = new JMenuItem("Edit Group", groupIcon);
				edtgroup.setActionCommand(EDITGROUP);
				edtgroup.addActionListener(this);
				menu.add(edtgroup);
				//
				JMenuItem es = new JMenuItem(Msg.translate(Env.getCtx(), "Export"), exportIcon);
				es.setActionCommand(EXPSESSION);
				es.addActionListener(this);
				menu.add(es);												
			} else if (f instanceof ModelFolder) {
				JMenuItem execmodel = new JMenuItem("Execute", tableIcon);
				execmodel.setActionCommand(EXEMODEL);
				execmodel.addActionListener(this);
				menu.add(execmodel);				
			}
			if (f instanceof FormFolder) {
				JMenuItem execform = new JMenuItem("Execute", execIcon);
				execform.setActionCommand(EXEFORM);
				execform.addActionListener(this);
				menu.add(execform);
			}

			menu.add(del);

			JMenuItem refresh = new JMenuItem(Msg.translate(Env.getCtx(), "Refresh"),refreshIcon);
			refresh.setActionCommand(REFRESH);				
			refresh.addActionListener(this);
			menu.add(refresh);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return menu;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		AbstractFolder f = getSelectedFolder();		
		int m_id = Integer.valueOf(f.getElement().getAttributeValue("uid"));
		if (e.getActionCommand().equals(ADDRULE)) {									
			NewRuleWizardLauncher nn = new NewRuleWizardLauncher();
			nn.setParentRuleid(m_id);
			nn.launchWizard();
		} else if (e.getActionCommand().equals(ADDDT)) {
			NewDecisionTableWizardLauncher nn = new NewDecisionTableWizardLauncher();
			nn.setParentRuleid(m_id);
			nn.launchWizard();
		} else if (e.getActionCommand().equals(ADDFACT)) {			
			NewFactWizardLauncher nn = new NewFactWizardLauncher();
			nn.setParentRuleid(m_id);
			nn.launchWizard();							
		} else if (e.getActionCommand().equals(ADDMOD)) {
			NewModelWizardLauncher nn = new NewModelWizardLauncher();
			nn.setParentRuleid(m_id);
			nn.launchWizard();
		} else if (e.getActionCommand().equals(ADDSESSION)) {
			NewSessionWizardLauncher nn = new NewSessionWizardLauncher();
			nn.launchWizard(m_id);					
		} else if (e.getActionCommand().equals(ADDCHANNEL)) {
			NewChannelWizardLauncher nn = new NewChannelWizardLauncher();
			nn.launchWizard(f);
		} else if (e.getActionCommand().equals(ADDGROUP)) {
			int AD_Plugin_ID = Integer.valueOf(f.getElement().getAttributeValue("uid"));
			NewGroupWizardLauncher nn = new NewGroupWizardLauncher();
			nn.launchWizard(AD_Plugin_ID);
		} else if (e.getActionCommand().equals(EDITGROUP)) {
			GroupFolder folder = (GroupFolder)f;
			IGroupModel group = folder.getGroup();
			EditGroupDialog dialog = new EditGroupDialog(frameController.getView().getFrame(),
					group, (AbstractFolder) folder.getParent());
			if (dialog.getResult()) {
				folder.modelChanged();
			}			
		} else if (e.getActionCommand().equals(EXPSESSION)) {
			ExportSessionWizardLauncher nn = new ExportSessionWizardLauncher();
			nn.launchWizard(f);					
		} else if (e.getActionCommand().equals(REFRESH)) {
			f.loadChildren();			
			((DefaultTreeModel) getView().getModel()).reload(f);
		} else if (e.getActionCommand().equals(EXEFORM)) {			
			startForm(m_id);
		} else if (e.getActionCommand().equals(EXEMODEL)) {
			ModelBean model = (ModelBean) frameController.getProperties().getCurrentBean();
			startModel(model);
		} else if (e.getActionCommand().equals(ADDFORM)) {						
			NewFormWizardLauncher nn = new NewFormWizardLauncher();
			nn.setParentRuleid(m_id);
			nn.launchWizard();									
		} else if (e.getActionCommand().equals(DELETE)) {
			if (f instanceof FormFolder) {
				X_AD_Form form = new Query(Env.getCtx(), X_AD_Form.Table_Name, "AD_Form_ID = ?" , null)
				.setParameters(m_id)
				.first();
				if (form != null) {
					form.setAD_Plugin_ID(0);
					form.save();
				}
			} 
			else if (f instanceof RuleFolder) {
				X_AD_Rule rule = new Query(Env.getCtx(), X_AD_Rule.Table_Name, "AD_Rule_ID = ?", null)
				.setParameters(m_id)
				.first();
				if (rule != null) {
					rule.delete(true);
				}
			}
			else if (f instanceof ModelFolder) {
				X_AD_Rule rule = new Query(Env.getCtx(), X_AD_Rule.Table_Name, "AD_Rule_ID = ?", null)
				.setParameters(m_id)
				.first();
				if (rule != null) {
					rule.delete(true);
				}
			}
			else if (f instanceof ChannelFolder) {
				X_AD_Rule rule = new Query(Env.getCtx(), X_AD_Rule.Table_Name, "AD_Rule_ID = ?", null)
				.setParameters(m_id)
				.first();
				if (rule != null) {
					rule.delete(true);
				}				
			}
		}		
		f.loadChildren();
		((DefaultTreeModel) getView().getModel()).reload(f);			
	}

	private void startModel(ModelBean model) {
		try {
			Class<?> clazz = (Class<?>) Class.forName(model.getClassname());
			MQuery kp = (MQuery) model.getFilter();						
			Constructor<?> constructor = clazz.getDeclaredConstructor(new Class[]{Properties.class, int.class, String.class});
			PO po = (PO)constructor.newInstance(new Object[] {Env.getCtx(), 0, null});
			if (kp.getRestrictionCount() > 0) {
				po = new Query(Env.getCtx(), po.get_TableName(), kp.getWhereClause(), null).first();
			}
			ModelForm m = ModelForm.get(kp);			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 *	Start Form
	 *  @param AD_Form_ID form
	 */
	private void startForm (int AD_Form_ID)
	{
		FormFrame ff = null;
		if (Ini.isPropertyBool(Ini.P_SINGLE_INSTANCE_PER_WINDOW)) {
			ff = Environment.getWindowManager().findForm(AD_Form_ID);
			if ( ff != null ) {
				ff.toFront();
				return;
			}
		}
		ff = new FormFrame();
		Environment.getWindowManager().add(ff);		
		if (!ff.openForm(AD_Form_ID)) return;		

		//	Center the window		
		if (Ini.isPropertyBool(Ini.P_OPEN_WINDOW_MAXIMIZED) ) {
			ff.pack();
			ff.setExtendedState(Frame.MAXIMIZED_BOTH);
			ff.setVisible(true);
			ff.toFront();
		} else
			AEnv.showCenterScreen(ff);
	}	
}
