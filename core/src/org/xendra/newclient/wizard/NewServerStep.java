package org.xendra.newclient.wizard;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.HashMap;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.Timer;
import javax.swing.text.Style;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyleContext;
import javax.swing.text.StyledDocument;
import org.columba.core.base.SwingWorker;
import org.compiere.apps.AGlassPane;
import org.compiere.model.Machine;
import org.compiere.model.persistence.X_A_Machine;
import org.compiere.model.persistence.X_A_MachineServer;
import org.compiere.model.reference.REF_ServerType;
import org.compiere.util.Env;
import org.xendra.newclient.i18n.ResourceLoader;
import net.javaprog.ui.wizard.AbstractStep;
import net.javaprog.ui.wizard.DataModel;
import net.miginfocom.swing.MigLayout;

public class NewServerStep extends AbstractStep implements ActionListener {
	private DataModel data;
	private Timer timer;	
	private ByteArrayOutputStream baos;
	private PrintStream old;
	private JTextPane textPane;
	private JFrame waitpanel;
	private AGlassPane m_glassPane;	
	public NewServerStep(DataModel data) {
		super(ResourceLoader.getString("dialog","newclient","importpricelist"),
				ResourceLoader.getString("dialog","newclient","importpricelist_description"));
		this.data = data;
		this.setCanGoNext(false);
	}	
	public void prepareRendering() {		
	}

	protected JComponent createComponent() {
		timer = new Timer(1000, this);
		timer.start();
		JPanel p = new JPanel(new MigLayout());
		textPane = new JTextPane();
		StyledDocument doc = textPane.getStyledDocument();
		addStylesToDocument(doc);
		JScrollPane scroll = new JScrollPane(textPane);
		scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		scroll.setPreferredSize(new Dimension(250, 155));
		scroll.setMinimumSize(new Dimension(10, 100));
		p.add(scroll,"grow");		
		return p;
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
	class Task extends SwingWorker {
		public Object construct() {
			Machine m = Env.getMachine();
			HashMap props = new HashMap();
			String text = "";
			m_glassPane.setMessage("creating server...");
			props.put(X_A_Machine.COLUMNNAME_A_Machine_ID, m.getA_Machine_ID());
			X_A_MachineServer ms = new X_A_MachineServer(Env.getCtx(), 0, null);
			ms.setServerType(REF_ServerType.WebServer);
			int port = 8080;
			props.put("port",port);
			ms.setProperties(props);
			ms.save();
			text += "Web Server created\n";
			props = new HashMap();
			props.put(X_A_Machine.COLUMNNAME_A_Machine_ID, m.getA_Machine_ID());
			ms = new X_A_MachineServer(Env.getCtx(), 0, null);
			ms.setServerType(REF_ServerType.MessageServer);
			ms.setProperties(props);
			ms.save();		
			text += "Message Server created\n";
			//ms = new X_A_MachineServer(Env.getCtx(), 0, null);
			//ms.setServerType(REF_ServerType.UpdateServer);
			//ms.setProperties(props);
			//ms.save();
			//text += "Update Server created\n";
			//try {
				textPane.setText(text);
			//} catch (Exception e) {
			//	e.printStackTrace();
			//}
			//String info = getcapture();			
			return "";
		}
		@Override
		public void finished() {
			m_glassPane.setBusyTimer(0);
			waitpanel.setVisible(false);			
			setCanGoNext(true);
		}		
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

	public void actionPerformed(ActionEvent evt) {
		if (evt.getSource().equals(timer)) {
			timer.stop();
			waitpanel = new JFrame();
			waitpanel.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
			waitpanel.setUndecorated(true);
			waitpanel.setPreferredSize(new Dimension(200,200));
			waitpanel.setAlwaysOnTop(true);
			waitpanel.setSize(new Dimension(300,200));
			m_glassPane = new AGlassPane();
			waitpanel.setGlassPane(m_glassPane);
			waitpanel.setLocationRelativeTo(null);
			waitpanel.setVisible(true);
			m_glassPane.setBusyTimer(10000000);			
			Task tsk = new Task();
			tsk.start();			
		}
	}
}
