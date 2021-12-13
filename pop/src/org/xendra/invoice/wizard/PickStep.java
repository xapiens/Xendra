package org.xendra.invoice.wizard;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.lang.reflect.Method;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFileChooser;
import javax.swing.JPanel;
import org.columba.core.base.SwingWorker;
import org.columba.core.gui.base.LabelWithMnemonic;
import org.columba.core.gui.base.WizardTextField;
import org.columba.core.gui.util.ProgressCircle;
import org.compiere.apps.ADialog;
import org.compiere.util.Env;
import org.compiere.util.ExtensionFileFilter;
import org.compiere.util.Msg;
import org.xendra.pop.util.ResourceLoader;
import net.javaprog.ui.wizard.AbstractStep;
import net.javaprog.ui.wizard.DataModel;

public class PickStep extends AbstractStep implements ActionListener {
	protected DataModel data;
	private JButton buttonLoadFact = new JButton();
	private File m_file;
	private ProgressCircle progress;	

	public PickStep(DataModel data) {
		super(ResourceLoader.getString("dialog", "pop", "importinvoice"),
				ResourceLoader.getString("dialog", "pop",   "importinvoice_description"));		
		this.data = data;
		this.setCanGoNext(false);			
	}

	@Override
	protected JComponent createComponent() {
		JComponent component = new JPanel();
		component.setLayout(new BoxLayout(component, BoxLayout.Y_AXIS));
		progress = new ProgressCircle(200,200);
		LabelWithMnemonic importaccountLabel = new LabelWithMnemonic(ResourceLoader.getString("dialog", "pop", "importinvoice"));
		importaccountLabel.setLabelFor(buttonLoadFact);
		buttonLoadFact.setText(Msg.translate(Env.getCtx(), "LoadInvoice"));
		buttonLoadFact.addActionListener(this);
		WizardTextField middlePanel = new WizardTextField();
		middlePanel.addTextField(buttonLoadFact);
		//Method method = null;
		//try {			
		//	method = InvoiceParser.getInstance().getClass().getMethod("get", null);
		//} 
		//catch (NoSuchMethodException nsme) {
		//}			    	
		//data.registerDataLookup(X_C_Invoice.COLUMNNAME_C_Invoice_ID,new DefaultDataLookup(InvoiceParser.getInstance(), method, null));
		middlePanel.addEmptyExample();
		component.add(progress);
		component.add(middlePanel);
		return component;
	}
	public void prepareRendering() {
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(buttonLoadFact))
			m_file = getFile();			
	}

	/**
	 *  Get File for CoA
	 *  @return File
	 */
	private File getFile()
	{
		File file = null;
		String dirName = org.compiere.Xendra.getXendraHome();
		JFileChooser chooser = new JFileChooser(dirName);
		chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
		chooser.setMultiSelectionEnabled(false);
		chooser.setDialogTitle(Msg.translate(Env.getCtx(), "LoadInvoice"));
		chooser.addChoosableFileFilter(new ExtensionFileFilter("xml", Msg.getMsg(Env.getCtx(), "FileXML")));
		if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
			file = chooser.getSelectedFile();
			Task tsk = new Task(file);
			tsk.start();
		}
		else
			file = null;
		chooser = null;

		if (file == null)
			buttonLoadFact.setText(Msg.translate(Env.getCtx(), "LoadInvoice"));
		else {
		}
		return file;
	}   //  getFile
	class Task extends SwingWorker {
		File m_file;
		public Task(File file) {
			m_file = file;
		}

		public Object construct() {
			buttonLoadFact.setText(m_file.getAbsolutePath());			
			String line = null;
			String errMsg = "";
			try
			{
				//pi.load("/home/americas/Downloads/F002-00013191.xml");
				int percent = 0;
				InvoiceParser.getInstance().load(m_file);
				if (!InvoiceParser.getInstance().existDoc()) {
					InvoiceParser.getInstance().parseDoc();
					int lines = InvoiceParser.getInstance().getLinesofDoc();
					for (float current=0; current  < lines; current++) {
						InvoiceParser.getInstance().parseLine();
						percent = (int) (( current / (lines-1) ) * 100);
						update(percent);													
					}
				} else {
					errMsg = String.format("%s ya existe", InvoiceParser.getInstance().getDocumentNo());
					ADialog.error(0, null, errMsg);
					setCanGoNext(false);			
				}
			}
			catch (Exception ioe)
			{
				String s = ioe.getLocalizedMessage();
				if (s == null || s.length() == 0)
					s = ioe.toString();
			}

			if (errMsg.length() != 0)
			{
				setCanGoNext(false);		
			}			
			else
			{
				setCanGoNext(true);		
			}
			return null;
		}
	}
	
	public void update(int percent) {
		progress.setProgress(percent);
	}
}