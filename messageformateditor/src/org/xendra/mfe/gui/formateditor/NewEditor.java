package org.xendra.mfe.gui.formateditor;

import java.util.List;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;

import net.miginfocom.swing.MigLayout;

import org.compiere.model.MMessageFormat;
import org.compiere.model.Query;
import org.compiere.util.Env;
import org.jdom.Element;
import org.xendra.mfe.gui.tree.TreeView;
import org.xendra.model.AbstractFolder;
import org.xendra.printdocument.Formatter;

public class NewEditor extends JPanel implements TreeSelectionListener {
	private FormatEditor m_editor = new FormatEditor();
	private CompileLog compilelog = new CompileLog();	
	private MMessageFormat m_pdf;
	public NewEditor() {
		super(new MigLayout("fill"));
		JSplitPane editor = new JSplitPane(JSplitPane.VERTICAL_SPLIT, m_editor, compilelog);
		add(editor, "push, grow");
	}
	@Override
	public void valueChanged(TreeSelectionEvent e) {
		if (!(e.getSource() instanceof TreeView))
			return;			
		TreeView treeview = (TreeView) e.getSource();
		if (treeview.getSelectionPath() != null) {
			AbstractFolder node = (AbstractFolder) treeview.getSelectionPath().getLastPathComponent();			
			Element item = node.getNode();
			String type = item.getName();			
			if (type.equals("message")) {
				String uid = item.getAttributeValue("uid");
				Integer id = Integer.valueOf(uid);
				if (id > 0) {			
					m_pdf = new Query(Env.getCtx(), MMessageFormat.Table_Name, "AD_MessageFormat_ID = ?", null)
					.setParameters(id).first();
					m_editor.getEditor().setText(m_pdf.getFormat());
					buildDocument();					
				}				
			}
		}		
	}

	public void buildDocument() {				
		String Format = m_editor.getEditor().getText();
		m_pdf.setFormat(Format);		
		m_pdf.save();		
		// remove printer codes
	}
	public void save() {
		String text = m_editor.getEditor().getText();
		m_pdf.setFormat(text);
		m_pdf.save();
	}

	public List<String> getError() {
		return m_pdf.getError();		
	}
}
