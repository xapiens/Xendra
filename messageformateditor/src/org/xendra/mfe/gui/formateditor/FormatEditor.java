package org.xendra.mfe.gui.formateditor;

import java.awt.BorderLayout;
import java.awt.Color;
import java.util.HashMap;

import javax.swing.BlockModeHandler;
import javax.swing.CodeEditorPane;
import javax.swing.JPanel;
import javax.swing.DefaultSyntaxColorizer.RegExpHashMap;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.text.AbstractDocument;

import org.compiere.model.Query;
import org.compiere.model.persistence.X_AD_Rule;
import org.compiere.util.Env;
import org.jdom.Element;
import org.xendra.mfe.gui.tree.TreeView;
import org.xendra.model.AbstractFolder;

public class FormatEditor extends JPanel implements TreeSelectionListener {
	
	private AbstractFolder selectedFolder;
	private CodeEditorPane edit;	
	final HashMap<String, Color> m_syntax = new RegExpHashMap();
	public FormatEditor()
	{
        edit = new CodeEditorPane();

        edit.setKeywordColor(getSyntax());

        HashMap<String, String> help = new HashMap<String, String>();
        help.put("System", "The System class contains several useful class fields and methods. It cannot be instantiated.");
        help.put("out", "The \"standard\" output stream. This stream is already open and ready to accept output data.");
        help.put("err", "The \"standard\" error output stream. This stream is already open and ready to accept output data.");
        edit.setKeywordHelp(help);
        edit.setVerticalLineAtPos(80);        
        ((AbstractDocument) edit.getDocument()).setDocumentFilter(new BlockModeHandler(edit));
        this.setLayout(new BorderLayout());
        this.add(edit.getContainerWithLines(), BorderLayout.CENTER);
	}

	public CodeEditorPane getEditor()
	{
		return edit;
	}
	@Override
	public void valueChanged(TreeSelectionEvent e) {
		if (!(e.getSource() instanceof TreeView))
			return;
		TreeView treeview = (TreeView) e.getSource();
		if (treeview.getSelectionPath() != null) {
			AbstractFolder node = (AbstractFolder) treeview.getSelectionPath().getLastPathComponent();
			//FolderItem item = (FolderItem) node.getFolderItem();
			Element item = node.getNode();
			//String type = item.get("type");
			String type = item.getName();
			Integer id = Integer.valueOf(item.getAttributeValue("uid"));
			if (id > 0)
			{
				X_AD_Rule rule = new Query(Env.getCtx(), X_AD_Rule.Table_Name, "AD_Rule_ID = ?", null).setParameters(id).first();
				if (rule != null)
				{
					String code = rule.getScript();
					edit.setText(code);
			        edit.setKeywordColor(getSyntax());										
				}
			}
		}
		selectedFolder = null;				
	}
	private HashMap<String, Color> getSyntax()
	{
		if (m_syntax.size() == 0)
		{	        
			//m_syntax.put("#set", Color.RED);
			m_syntax.put("\\#set(\\w{2})", Color.RED);
			m_syntax.put("#macro", Color.RED);
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
			m_syntax.put("void", Color.MAGENTA);
			m_syntax.put("main", Color.PINK);
			//m_syntax.put("print(\\w{2})", Color.CYAN);			
		}
		return m_syntax;
	}
}
