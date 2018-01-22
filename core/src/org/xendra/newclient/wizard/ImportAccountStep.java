package org.xendra.newclient.wizard;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFileChooser;
import javax.swing.JPanel;

import org.columba.core.base.SwingWorker;
import org.columba.core.gui.base.LabelWithMnemonic;
import org.columba.core.gui.base.WizardTextField;
import org.columba.core.gui.util.ProgressCircle;
import org.compiere.model.MElementValue;
import org.compiere.model.NaturalAccountMap;
import org.compiere.model.persistence.X_Fact_Acct;
import org.compiere.util.Env;
import org.compiere.util.ExtensionFileFilter;
import org.compiere.util.Ini;
import org.compiere.util.Msg;
import org.xendra.newclient.i18n.ResourceLoader;

import net.javaprog.ui.wizard.AbstractStep;
import net.javaprog.ui.wizard.DataModel;
import net.javaprog.ui.wizard.DefaultDataLookup;

public class ImportAccountStep extends AbstractStep implements ActionListener {
	protected DataModel data;
	private JButton buttonLoadAcct = new JButton();
	private File m_file;
	private ProgressCircle progress;
	private NaturalAccountMap<String,MElementValue> m_nap = null;
	
	public ImportAccountStep(DataModel data) {
		super(ResourceLoader.getString("dialog", "newclient", "importaccount"),
				ResourceLoader.getString("dialog", "newclient",   "importaccount_description"));		
		this.data = data;
		this.setCanGoNext(false);		
	}
	protected JComponent createComponent() {
		JComponent component = new JPanel();
		component.setLayout(new BoxLayout(component, BoxLayout.Y_AXIS));
		progress = new ProgressCircle(200,200);
		LabelWithMnemonic importaccountLabel = new LabelWithMnemonic(ResourceLoader.getString("dialog", "newclient", "importaccount"));		
		importaccountLabel.setLabelFor(buttonLoadAcct);
		buttonLoadAcct.setText(Msg.translate(Env.getCtx(), "LoadAccountingValues"));
		buttonLoadAcct.addActionListener(this);
		WizardTextField middlePanel = new WizardTextField();
		middlePanel.addTextField(buttonLoadAcct);
		Method method = null;
		try {			
			method = buttonLoadAcct.getClass().getMethod("getText", null);
		} 
		catch (NoSuchMethodException nsme) {
		}			    	
		data.registerDataLookup(X_Fact_Acct.COLUMNNAME_Fact_Acct_ID ,new DefaultDataLookup(buttonLoadAcct, method, null));
		middlePanel.addEmptyExample();
		component.add(progress);
		component.add(middlePanel);
		
		return component;
	}
	public void prepareRendering() {
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(buttonLoadAcct))
			m_file = getFile();		
	}
	
	/**
	 *  Get File for CoA
	 *  @return File
	 */
	private File getFile()
	{
		File file = null;
		String dirName = org.compiere.Xendra.getXendraHome() + File.separator + "data" + File.separator + "import";
		JFileChooser chooser = new JFileChooser(dirName);
		chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
		chooser.setMultiSelectionEnabled(false);
		chooser.setDialogTitle(Msg.translate(Env.getCtx(), "LoadAccountingValues"));
		chooser.addChoosableFileFilter(new ExtensionFileFilter("csv", Msg.getMsg(Env.getCtx(), "FileCSV")));
		//  Try selecting file
		file = new File(dirName + File.pathSeparator + "AccountingPE.csv");
		if (file.exists())
			chooser.setSelectedFile(file);

		//  Show it
		if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
			file = chooser.getSelectedFile();
			Task tsk = new Task(file);
			tsk.start();
		}
		else
			file = null;
		chooser = null;

		if (file == null)
			buttonLoadAcct.setText(Msg.translate(Env.getCtx(), "LoadAccountingValues"));
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
			buttonLoadAcct.setText(m_file.getAbsolutePath());
			
			String line = null;
			try
			{
				float total = 0;
				//  see FileImport
				BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream(m_file), Ini.getCharset()), 10240);			
				//	not safe see p108 Network pgm
				String errMsg = "";

				//  read lines
				while ((line = in.readLine()) != null && errMsg.length() == 0) {
					//errMsg = parseLine(line);
					total++;
				}

				line = "";
				in.close();
				m_nap = new NaturalAccountMap<String,MElementValue>(Env.getCtx(), null);
				in = new BufferedReader(new InputStreamReader(new FileInputStream(m_file), Ini.getCharset()), 10240);			
				//	not safe see p108 Network pgm
				errMsg = "";
				int percent = 0;
				float current = 0;
				//  read lines
				while ((line = in.readLine()) != null && errMsg.length() == 0) {
					errMsg = m_nap.parseLine(line);
					current++;
					percent = (int) (( current / total ) * 100);
					update(percent);								
				}

				line = "";
				in.close();
				//  Error
				if (errMsg.length() != 0)
					//return errMsg;
					throw new Exception (errMsg);
			}
			catch (Exception ioe)
			{
				String s = ioe.getLocalizedMessage();
				if (s == null || s.length() == 0)
					s = ioe.toString();
				//return "Parse Error: Line=" + line + " - " + s;
			}
			
			m_nap = new NaturalAccountMap<String,MElementValue>(Env.getCtx(), null);
			String errMsg = m_nap.parseFile(m_file);
			if (errMsg.length() != 0)
			{
				//log.log(Level.SEVERE, errMsg);
				//m_info.append(errMsg);
				//m_trx.rollback();
				//m_trx.close();
				//return false;
				setCanGoNext(false);		
			}			
			else
			{
				setCanGoNext(true);		
			}
			return null;
		}

		@Override
		public void finished() {
			setCanGoNext(true);
		}
	}
	public void update(int percent) {
		progress.setProgress(percent);
	}
}
