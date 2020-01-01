package org.xendra.ruleeditor.gui.codeeditor;

import java.awt.BorderLayout;
import java.awt.Color;
import java.util.HashMap;

import javax.swing.BlockModeHandler;
import javax.swing.CodeEditorPane;
import javax.swing.JPanel;
import javax.swing.DefaultSyntaxColorizer.RegExpHashMap;
import javax.swing.JSplitPane;
import javax.swing.JTabbedPane;
import javax.swing.LineNumbersTextPane.LineNumbersSidePane;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.text.AbstractDocument;
import javax.swing.tree.TreePath;

import org.compiere.model.Query;
import org.compiere.model.persistence.X_AD_Rule;
import org.compiere.util.Env;
import org.xendra.ruleeditor.folder.AbstractFolder;
import org.xendra.ruleeditor.folder.RuleEditorTreeNode;
import org.xendra.ruleeditor.folder.RuleFolder;
import org.xendra.ruleeditor.gui.frame.RuleEditorFrameController;
import org.xendra.ruleeditor.gui.tree.RuleEditorTreeModel;
import org.xendra.ruleeditor.gui.tree.TreeView;

public class DroolsEditor extends JPanel implements TreeSelectionListener, ChangeListener {

	private RuleEditorTreeNode selectedFolder;
	//private CodeEditorPane edit;
	private JTabbedPane panes = new JTabbedPane(JTabbedPane.BOTTOM);
	private HashMap<Integer, CodeEditorPane> editor = new HashMap<Integer, CodeEditorPane>();
	final HashMap<String, Color> m_syntax = new RegExpHashMap();
	//private X_AD_Rule rule;
	private RuleEditorFrameController controller;
	private Integer AD_Rule_ID;
	public DroolsEditor(RuleEditorFrameController controller)
	{				
		//        edit = new CodeEditorPane();
		//        edit.setKeywordColor(getSyntax());
		//        HashMap<String, String> help = new HashMap<String, String>();
		//        help.put("System", "The System class contains several useful class fields and methods. It cannot be instantiated.");
		//        help.put("out", "The \"standard\" output stream. This stream is already open and ready to accept output data.");
		//        help.put("err", "The \"standard\" error output stream. This stream is already open and ready to accept output data.");
		//        edit.setKeywordHelp(help);
		//        edit.setVerticalLineAtPos(80);        
		//        ((AbstractDocument) edit.getDocument()).setDocumentFilter(new BlockModeHandler(edit));
		this.controller = controller;
		panes.addChangeListener(this);
		setLayout(new BorderLayout());
		add(panes);
		//        this.add(edit.getContainerWithLines(), BorderLayout.CENTER);
	}

	public CodeEditorPane getEditor()
	{
		return editor.get(AD_Rule_ID);
	}
	@Override
	public void valueChanged(TreeSelectionEvent e) {
		if (!(e.getSource() instanceof TreeView))
			return;
		TreeView treeview = (TreeView) e.getSource();
		if (treeview.getSelectionPath() != null) {
			AbstractFolder node = (AbstractFolder) treeview.getSelectionPath().getLastPathComponent();
			if (node instanceof RuleFolder) {				
				AD_Rule_ID = Integer.valueOf(node.getElement().getAttributeValue("uid"));
				if (AD_Rule_ID > 0)
				{						
					if (!editor.containsKey(AD_Rule_ID)) {
						CodeEditorPane edit = new CodeEditorPane();
						edit.setKeywordColor(getSyntax());
						edit.setAD_Rule_ID(AD_Rule_ID);
						HashMap<String, String> help = new HashMap<String, String>();
						help.put("rule", "start of rule");
						help.put("when", "condition of rule");
						help.put("then", "consequence of rule");
						help.put("end", "end of rule");
						help.put("function boolean", "fuction returning a boolean value");
						edit.setKeywordHelp(help);
						edit.setVerticalLineAtPos(80);
						edit.setKeywordColor(getSyntax());
						X_AD_Rule rule = new Query(Env.getCtx(), X_AD_Rule.Table_Name, "AD_Rule_ID = ?", null)
						.setParameters(AD_Rule_ID).first();
						String code = rule.getScript();
						edit.setText(code);				
						((AbstractDocument) edit.getDocument()).setDocumentFilter(new BlockModeHandler(edit));						
						editor.put(AD_Rule_ID, edit);
						panes.addTab(rule.getName(), edit.getContainerWithLines());
					}					
				}
				for (int i = 0; i < panes.getTabCount(); i++) {
					JSplitPane ContainerWithLines = (JSplitPane) panes.getComponentAt(i);
					LineNumbersSidePane linepane = (LineNumbersSidePane) ContainerWithLines.getLeftComponent();
					CodeEditorPane cep = (CodeEditorPane) linepane.getEditor();
					if (cep.getAD_Rule_ID().equals(AD_Rule_ID)) {
						panes.getModel().setSelectedIndex(i);
						break;
					}
				} 
			}			
		}				
	}
	private HashMap<String, Color> getSyntax()
	{
		if (m_syntax.size() == 0)
		{	        
			m_syntax.put("package", Color.RED);
			m_syntax.put("import", Color.RED);
			m_syntax.put("global", Color.RED);        
			//
			m_syntax.put("rule", Color.RED);
			m_syntax.put("eval", Color.RED);
			m_syntax.put("declare", Color.RED);
			m_syntax.put("dialect", Color.RED);
			m_syntax.put("when", Color.RED);
			m_syntax.put("then", Color.RED);
			m_syntax.put("end", Color.RED);
			//
			m_syntax.put("public", Color.BLUE);
			m_syntax.put("static", Color.BLUE);
			m_syntax.put("void", Color.BLACK);
			m_syntax.put("main", Color.BLACK);
			m_syntax.put("print(\\w{2})", Color.BLUE);			
		}
		return m_syntax;
	}

	@Override
	public void stateChanged(ChangeEvent event) {
		int index = panes.getSelectedIndex();
		JSplitPane ContainerWithLines = (JSplitPane) panes.getComponentAt(index);
		LineNumbersSidePane linepane = (LineNumbersSidePane) ContainerWithLines.getLeftComponent();
		CodeEditorPane cep = (CodeEditorPane) linepane.getEditor();
		if (cep != null) {					
			RuleEditorTreeModel rem = (RuleEditorTreeModel) controller.getTree().getView().getModel();
			if (rem != null) {
				RuleEditorTreeNode retn = rem.getFolderRule(String.valueOf(cep.getAD_Rule_ID()));
				if (retn != null) {
					TreePath path = new TreePath(retn.getPath());
					controller.getTree().getView().setSelectionPath(path);
				}
			}
		}
	}
}
