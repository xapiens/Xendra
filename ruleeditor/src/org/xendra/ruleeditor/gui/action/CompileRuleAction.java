package org.xendra.ruleeditor.gui.action;

import java.awt.event.ActionEvent;

import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.TreePath;

import org.columba.api.gui.frame.IFrameMediator;
import org.columba.core.gui.action.AbstractColumbaAction;
import org.columba.core.resourceloader.ImageLoader;
import org.xendra.ruleeditor.compile.CompileLog;
import org.xendra.ruleeditor.folder.RuleEditorTreeNode;
import org.xendra.ruleeditor.folder.RuleFolder;
import org.xendra.ruleeditor.gui.codeeditor.DroolsEditor;
import org.xendra.ruleeditor.gui.frame.RuleEditorFrameController;
import org.xendra.ruleeditor.gui.frame.RuleEditorFrameMediator;
import org.xendra.ruleeditor.util.ResourceLoader;

@SuppressWarnings("serial")
public class CompileRuleAction extends AbstractColumbaAction implements TreeSelectionListener {

	private RuleEditorTreeNode treeNode;
	private DroolsEditor m_editor;
	private CompileLog m_compilelog = new CompileLog();
	private Integer m_id;

	public CompileRuleAction(IFrameMediator frameMediator) {
		super(frameMediator, ResourceLoader.getString("menu", "mainframe", "menu_file_compilerule"));
		putValue(SHORT_DESCRIPTION, ResourceLoader.getString("menu","mainframe","menu_file_compilerule_tooltip")
				.replaceAll("&", ""));
		putValue(TOOLBAR_NAME, ResourceLoader.getString("menu", "mainframe","menu_file_compilerule_toolbar"));		
		putValue(SMALL_ICON, ImageLoader.getSmallIconFromResource("org.xendra.ruleeditor", "system-run.png"));
		putValue(LARGE_ICON, ImageLoader.getLargeIconFromResource("org.xendra.ruleeditor", "system-run.png"));
		if (frameMediator instanceof RuleEditorFrameMediator) {
			m_editor = ((RuleEditorFrameController) frameMediator).GetEditor();
			m_compilelog = ((RuleEditorFrameController) frameMediator).GetCompileLog();
			((RuleEditorFrameMediator) frameMediator).addTreeSelectionListener(this);
			setEnabled(false);
		} 
		else
			setEnabled(false);		

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (m_editor != null)
		{		
			String code = m_editor.getEditor().getText();			
			m_compilelog.compile(m_id);			
		}			
	}

	@Override
	public void valueChanged(TreeSelectionEvent e) {
		TreePath path = e.getNewLeadSelectionPath();
		if (path != null) {
			RuleEditorTreeNode node = (RuleEditorTreeNode) path.getLastPathComponent();
			if (node != null)
			{				
				if (node instanceof RuleFolder)
				{
					m_id = Integer.valueOf(node.getElement().getAttributeValue("uid"));
					setEnabled(true);
				}
				else
					setEnabled(false);			
			} else {
				setEnabled(false);
			}				
		}
	}
}
