package org.xendra.mfe.gui.formateditor;

import java.awt.BorderLayout;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;

import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.ScrollPaneConstants;

import org.compiere.Xendra;
import org.compiere.swing.CPanel;
import org.xendra.printdocument.ParseFormat;

public class CompileLog extends CPanel {

	private static final long serialVersionUID = 1L;
	private JTextPane output;

	public CompileLog() {
		this.setLayout(new BorderLayout());
		output = new JTextPane();
		output.setText(Xendra.XENDRA_R.concat("\n"));
		output.setText(output.getText().concat(Xendra.MAIN_VERSION));
		JScrollPane outputscroll = new JScrollPane(output);
		outputscroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		outputscroll.setAutoscrolls(true);
		add(outputscroll, BorderLayout.CENTER);
	}

	public void compile(String name, HashMap error) {
			output.removeAll();
			String prevlog = "";				
			prevlog = prevlog.concat(Xendra.XENDRA_R.concat("\n"));
			prevlog = prevlog.concat(Xendra.MAIN_VERSION);			
			String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Timestamp(System.currentTimeMillis()));
			prevlog = prevlog.concat(String.format("\nCompiling %s...%s\n",name, timeStamp));
			if (error.containsKey(ParseFormat.VARSNOTFOUND)) {
				prevlog = prevlog.concat("Vars not found\n");
				List<String> vars = (List<String>) error.get(ParseFormat.VARSNOTFOUND);
				for (String var:vars) {
					prevlog = prevlog.concat(String.format("%s\n", var));	
				}				
			}
			if (error.containsKey(ParseFormat.VARSNOTDEFINED)) {
				prevlog = prevlog.concat("Vars not defined\n");
				List<String> vars = (List<String>) error.get(ParseFormat.VARSNOTDEFINED);
				for (String var:vars) 
					prevlog = prevlog.concat(String.format("%s\n", var));												
			}
			if (error.containsKey("mv")) {
				prevlog = prevlog.concat("Message:\n");
				String mv = (String) error.get("mv");
				prevlog = prevlog.concat(String.format("%s\n", mv));
			}
			if (error.containsKey(ParseFormat.ERRORS)) {
				prevlog = prevlog.concat("Errors:\n");
				List<String> vars = (List<String>) error.get(ParseFormat.ERRORS);
				for (String var:vars) 
					prevlog = prevlog.concat(String.format("%s\n", var));												
			}
			//prevlog = prevlog.concat(msg);
			output.setText(prevlog);			
			output.invalidate();		
	}
}
