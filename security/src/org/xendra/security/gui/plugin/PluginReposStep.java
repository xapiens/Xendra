package org.columba.core.gui.plugin.wizard;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.BadLocationException;
import javax.swing.text.Style;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyleContext;
import javax.swing.text.StyledDocument;

import org.columba.core.gui.base.MultiLineLabel;
import org.compiere.model.MRole;
import org.compiere.model.MStore;
import org.compiere.model.persistence.X_AD_Plugin;
import org.compiere.util.Util;
import org.xendra.api.XendrianServer;
import org.xendra.common.FinishStep;
import org.xendra.newclient.i18n.ResourceLoader;
import org.xendra.newclient.wizard.StoreXMLParser;

import net.javaprog.ui.wizard.AbstractStep;
import net.javaprog.ui.wizard.DataModel;
import net.javaprog.ui.wizard.DefaultDataLookup;
import net.javaprog.ui.wizard.Step;
import net.javaprog.ui.wizard.StepModelCustomizer;

public class PluginReposStep extends AbstractStep implements StepModelCustomizer, ActionListener, DocumentListener {
	private DataModel data;
	private JTextPane textPane;
	//private MStore store;
	public PluginReposStep(DataModel data) {
		super(ResourceLoader.getString("dialog", "newclient", "Repository"),
				ResourceLoader.getString("dialog", "newclient", "Repository_Description"));
		this.data = data;		
		this.setCanGoNext(true);		
	}
	public void prepareRendering() {
	}
	@Override
	public void actionPerformed(ActionEvent e) {

	}	

	protected void addStylesToDocument(StyledDocument doc) {
		Style def = StyleContext.getDefaultStyleContext().getStyle(StyleContext.DEFAULT_STYLE);
		Style regular = doc.addStyle("regular", def);
		StyleConstants.setFontFamily(def, "SansSerif");

		Style s = doc.addStyle("italic", regular);
		StyleConstants.setItalic(s,  true);

		s = doc.addStyle("bold", regular);
		StyleConstants.setBold(s, true);

		s = doc.addStyle("small", regular);
		StyleConstants.setFontSize(s, 10);

		s = doc.addStyle("large", regular);
		StyleConstants.setFontSize(s, 16);

	}

	@Override
	protected JComponent createComponent() {		
		JComponent component = new JPanel();
		try {
			List<String> urls = new ArrayList<String>();
			String repository = MStore.getInstance().getRepository();
			if (repository == null)
				repository = "";
			if (repository.length() == 0) {
				//String test = String.format("%sorg%sxendra%snewclient%swizard%sstore.xml", File.separator, File.separator, File.separator, File.separator, File.separator);
				InputStream in = getClass().getResourceAsStream("store.xml");;
				//InputStream in = StoreXMLParser.class.getResourceAsStream(test); 
				urls = new StoreXMLParser().parseFormat(in);
				in.close();				
			} else {
				StringTokenizer stringTokenizer = new StringTokenizer(repository, "\n");								
				while (stringTokenizer.hasMoreTokens()) {
					urls.add(stringTokenizer.nextToken().trim());					
				}	
			}
			component.setLayout(new BoxLayout(component, BoxLayout.Y_AXIS));
			component.add(new MultiLineLabel(ResourceLoader.getString("dialog", "newclient", "Repository_Text")));
			component.add(Box.createVerticalStrut(40));
			textPane = new JTextPane();
			StyledDocument doc = textPane.getStyledDocument();
			addStylesToDocument(doc);
			for (String url:urls) {
				try {
					doc.insertString(doc.getLength(), url, doc.getStyle("regular"));
				} catch (BadLocationException e) {
					e.printStackTrace();
				}
			}
			if (MStore.getInstance().getRepository().length() == 0) {
				MStore.getInstance().setRepository(textPane.getText());
				MStore.getInstance().save();
			}
			JScrollPane scroll = new JScrollPane(textPane);
			scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
			scroll.setPreferredSize(new Dimension(250, 155));
			scroll.setMinimumSize(new Dimension(10, 100));
			component.add(scroll);
			Method method = null;
			try {
				method = textPane.getClass().getMethod("getText", null);
			} catch (NoSuchMethodException nsme) {}		
			data.registerDataLookup(X_AD_Plugin.COLUMNNAME_Source,new DefaultDataLookup(textPane, method, null));
		} catch (Exception e) {
			e.printStackTrace();
		}		
		return component;
	}
	
	@Override
	public void changedUpdate(DocumentEvent e) {
		MStore.getInstance().setRepository(textPane.getText());
		MStore.getInstance().save();		
	}
	
	@Override
	public void insertUpdate(DocumentEvent arg0) {
		// TODO Auto-generated method stub
	}
	
	@Override
	public void removeUpdate(DocumentEvent arg0) {
		// TODO Auto-generated method stub
	}

	public Step[] getPendingSteps()  {
		List<Step> steps = new ArrayList<Step>();		
		String source = MStore.getInstance().getRepository();
		StringTokenizer stringTokenizer = new StringTokenizer( source, "\n" );        
		while( stringTokenizer.hasMoreTokens() ) {
			String url = stringTokenizer.nextToken().trim();
			//String x = Util.navigateWebServer(String.format("store?type=validate&url=%s&role=%s", url, MRole.getDefault().getIdentifier()));
			String x = new XendrianServer().setServlet("store").setType("validate").setUrl(url).setRole(MRole.getDefault().getIdentifier()).start();
			if (!x.equalsIgnoreCase("ok")) {
				steps.add(new PickCertificateProviderStep(data));
				break;
			}
		}		
		//steps.add(new PluginStep(data));
		steps.add(new FinishStep());
		Step[] list = new Step[steps.size()];
		steps.toArray(list);
		return list;
	}	
}
