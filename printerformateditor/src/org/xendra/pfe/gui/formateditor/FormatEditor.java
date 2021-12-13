package org.xendra.pfe.gui.formateditor;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.print.PageFormat;
import java.awt.print.PrinterJob;
import java.io.File;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.swing.BlockModeHandler;
import javax.swing.CodeEditorPane;
import javax.swing.JPanel;
import javax.swing.DefaultSyntaxColorizer.RegExpHashMap;
import javax.swing.JSplitPane;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.text.AbstractDocument;

import net.miginfocom.swing.MigLayout;

import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;
import org.apache.velocity.app.VelocityEngine;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_AD_Rule;
import org.compiere.util.Env;
import org.compiere.util.Util;
import org.jdom.Element;
import org.mvel2.MVEL;
import org.mvel2.ParserContext;
import org.mvel2.compiler.ExecutableStatement;
import org.mvel2.templates.TemplateRuntime;
import org.mvel2.templates.res.Node;
import org.xendra.model.AbstractFolder;
import org.xendra.pfe.folder.FormatFolder;
import org.xendra.pfe.gui.tree.TreeView;
import org.xendra.printdocument.NodeESCImage;
import org.xendra.printdocument.Formatter;
import org.xendra.printdocument.ParseFormat;
import org.xendra.printdocument.PrintDocument;
import org.xendra.printdocument.PrintWorker;
import org.xendra.printdocument.PrinterDocumentCtrl;
import org.xendra.printdocument.driver.PrinterDriver;


public class FormatEditor extends JPanel implements TreeSelectionListener {	
	private AbstractFolder selectedFolder;
	private CodeEditorPane edit;	
	private Integer m_lines;
	private Integer uid;
	private Integer m_columns;
	final HashMap<String, Color> m_syntax = new RegExpHashMap();
	//private PanoramicCtrl m_preview = new PanoramicCtrl();
	private PrintPreview m_preview = null;

	private CompileLog compilelog = new CompileLog();
	//private String m_output = "HOLA MUNDO\nHOLA MUNDO";
	private PageableText m_pageabletext;
	private JPanel previous;
	private JSplitPane split;
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
		setLayout(new BorderLayout());
		PrinterJob job = PrinterJob.getPrinterJob();
		PageFormat format = job.pageDialog(job.defaultPage());
		try {
			m_pageabletext = new PageableText("",format);
			//m_preview = new PrintPreview(new PageableText(new File("/home/americas/factura.txt"),format));
			m_preview = new PrintPreview(m_pageabletext);
		} catch (IOException e) {
			e.printStackTrace();
		}
		previous = new JPanel(new MigLayout("fill"));
		previous.add(m_preview.getControls(),"wrap");
		previous.add(m_preview);
		JSplitPane editor = new JSplitPane(JSplitPane.VERTICAL_SPLIT, edit.getContainerWithLines(), compilelog);
		editor.setDividerLocation(200);
		//JSplitPane split = new JSplitPane(JSplitPane.VERTICAL_SPLIT, m_preview, editor);        
		split = new JSplitPane(JSplitPane.VERTICAL_SPLIT, previous, editor);
		split.setDividerLocation(100);
		add(split, BorderLayout.NORTH);
		//add(edit.getContainerWithLines(), BorderLayout.NORTH);
		//add(compilelog, BorderLayout.CENTER);
	}

	public CodeEditorPane getEditor()
	{
		return edit;
	}
	@Override
	public void valueChanged(TreeSelectionEvent e) {
		if (!(e.getSource() instanceof TreeView))
			return;
		//		if (selectedFolder != null) {
		//			((AbstractFolder) selectedFolder).removeFolderListener(this);
		//		}
		TreeView treeview = (TreeView) e.getSource();
		if (treeview.getSelectionPath() != null) {
			AbstractFolder node = (AbstractFolder) treeview.getSelectionPath().getLastPathComponent();
			//FolderItem item = (FolderItem) node.getFolderItem();
			Element item = node.getNode();
			String type = item.getAttributeValue("type");			
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
	public void loadformat(FormatFolder f) {
		//Map map = f.getPrinterDocumentFormat().getPage();
		Map map = f.getPrinterDocumentFormat().getParameters();
		//Integer lines;
		String slines = (String) map.get("Lines");
		try {
			int lines = Integer.valueOf(slines);
		} catch (Exception ex) {
			slines = "26";
		}
		//Integer columns;
		String scolumns = (String) map.get("Columns");
		try {
			int columns = Integer.valueOf(scolumns);
		} catch (Exception ex) {
			scolumns = "80";
		}	
		m_lines = Integer.valueOf(slines);
		m_columns = Integer.valueOf(scolumns);
		//
		//if (!getEditor().isLoaded()) {
		getEditor().setText(f.getPrinterDocumentFormat().getFormat());			
		//f.getPrinterDocumentFormat().setFormat(m_editor.getEditor().getText());
		//}
		//f.getPrinterDocumentFormat().setFormat(m_editor.getEditor().getText());
		buildDocumentMVEL(f);
		//setFormatFolder(f);
	}

	public void print(FormatFolder f) {
		PrintDocument pd = null;
		String Format = getEditor().getText();
		f.getPrinterDocumentFormat().setFormat(Format);
		pd = f.compile();
		HashMap error = pd.getErrors();		
		try {
			Map context = new HashMap();
			context.put("pd", pd);		
			ExecutableStatement stmt = (ExecutableStatement) MVEL.compileExpression(f.getPrinterDocumentFormat().getSource());
			MVEL.executeExpression(stmt, context);
			pd.build();			
			// 
			PrinterDocumentCtrl pdfc = new PrinterDocumentCtrl(Env.getCtx(), pd);
			pdfc.setWindowNo(0);
			PrintWorker pw = pdfc.getPrintWorker();
			pdfc.print(pw);			
			try {				
			} catch (Exception ex) {

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {

		}
	}

	public void buildDocumentMVEL(FormatFolder f) {
		PrintDocument pd = null;
		String Format = getEditor().getText();
		f.getPrinterDocumentFormat().setFormat(Format);
		pd = f.compile();
		HashMap error = pd.getErrors();		
		try {
			Map context = new HashMap();
			context.put("pd", pd);		
			ExecutableStatement stmt = (ExecutableStatement) MVEL.compileExpression(f.getPrinterDocumentFormat().getSource());
			MVEL.executeExpression(stmt, context);
			pd.build();
		} catch (Exception ex) {
			List<String> errorvars = new ArrayList<String>();
			if (error.containsKey(ParseFormat.ERRORS)) {
				errorvars = (List<String>) error.get(ParseFormat.ERRORS);					
			}
			String exerror = ex.getMessage();
			errorvars.add(exerror);
			error.put(ParseFormat.ERRORS, errorvars);				
			ex.printStackTrace();
		}
		finally {
			compilelog.compile(f.getName(), error);
			PageFormat format = new PageFormat();
			try {
				m_pageabletext = new PageableText(pd,format);
				m_preview = new PrintPreview(m_pageabletext);
				previous.removeAll();
				previous.add(m_preview.getControls(),"wrap");
				previous.add(m_preview);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}


	public void setCompileLog(CompileLog compilelog) {
		this.compilelog = compilelog;
	}
	public Integer getUid() {
		return uid;
	}
	public void setUid(Integer uid) {
		this.uid = uid;
	}	
}
