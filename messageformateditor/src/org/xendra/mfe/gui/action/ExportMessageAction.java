package org.xendra.mfe.gui.action;

import java.awt.event.ActionEvent;
import java.io.StringWriter;

import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.TreePath;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.columba.api.gui.frame.IFrameMediator;
import org.columba.core.gui.action.AbstractColumbaAction;
import org.columba.core.resourceloader.ImageLoader;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.output.Format;
import org.jdom.output.XMLOutputter;
import org.xendra.mfe.folder.MessageFolder;
import org.xendra.mfe.gui.frame.MFEFrameController;
import org.xendra.mfe.util.ResourceLoader;
import org.xendra.model.AbstractFolder;

public class ExportMessageAction extends AbstractColumbaAction implements TreeSelectionListener {
	private AbstractFolder node;	
	private TransformerFactory tFactory = TransformerFactory.newInstance();
	public ExportMessageAction(IFrameMediator frameMediator) {
		super(frameMediator, ResourceLoader.getString("menu", "mainframe", "menu_file_exportmessage"));
		putValue(SHORT_DESCRIPTION, ResourceLoader.getString("menu","mainframe","menu_file_exportmessage_tooltip")
				.replaceAll("&", ""));
		putValue(TOOLBAR_NAME, ResourceLoader.getString("menu", "mainframe","menu_file_exportmessage_toolbar"));
		putValue(SMALL_ICON, ImageLoader.getSmallIconFromResource("org.xendra.mfe", "document-export.png"));
		putValue(LARGE_ICON, ImageLoader.getLargeIconFromResource("org.xendra.mfe", "document-export.png"));
		if (frameMediator instanceof MFEFrameController) {
			((MFEFrameController) frameMediator).addTreeSelectionListener(this);			
			setEnabled(false);
		}
	}
	public void actionPerformed(ActionEvent e) {
		try {
			AbstractFolder message = (AbstractFolder) node;
			Document doc = new Document();
			doc = message.export(doc, null);
			XMLOutputter xmOut = new XMLOutputter(Format.getPrettyFormat()); 
			System.out.println("----" + xmOut.outputString(doc));
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	@Override
	public void valueChanged(TreeSelectionEvent e) {
		TreePath p = e.getNewLeadSelectionPath();
		if (p == null)
			return;
		node = (AbstractFolder) p.getLastPathComponent();
		if (node != null) {
			if (node instanceof MessageFolder) {				
				setEnabled(true);
			}
			else
				setEnabled(false);						
		}		
	}		
}
