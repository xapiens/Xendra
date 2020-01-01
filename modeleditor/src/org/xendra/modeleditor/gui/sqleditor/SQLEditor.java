package org.xendra.modeleditor.gui.sqleditor;

import java.awt.BorderLayout;
import java.awt.Color;
import java.util.HashMap;

import javax.swing.CodeEditorPane;
import javax.swing.JPanel;
import javax.swing.DefaultSyntaxColorizer.RegExpHashMap;

public class SQLEditor extends JPanel  {
	final HashMap<String, Color> m_syntax = new RegExpHashMap();
	private CodeEditorPane edit;
	public SQLEditor() {
		setLayout(new BorderLayout());
		edit = new CodeEditorPane();
		HashMap<String, String> help = new HashMap<String, String>();
		help.put("System", "The System class contains several useful class fields and methods. It cannot be instantiated.");
		help.put("out", "The \"standard\" output stream. This stream is already open and ready to accept output data.");
		help.put("err", "The \"standard\" error output stream. This stream is already open and ready to accept output data.");
		edit.setKeywordHelp(help);
		edit.setVerticalLineAtPos(80);
		edit.setKeywordColor(getSyntax());
		add(edit);
	}
	
	public void setCode(String code) {
		edit.setText(code);								
	}
	
	public String getCode() {
		return edit.getText();
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
}
