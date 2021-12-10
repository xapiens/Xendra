package org.xendra.controls;

import java.awt.BorderLayout;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.ScrollPaneConstants;

import org.compiere.Xendra;
import org.compiere.model.MPrinterDocumentFormat;
import org.compiere.swing.CPanel;
import org.mvel2.MVEL;
import org.mvel2.compiler.ExecutableStatement;
import org.xendra.printdocument.DataSource;
import org.xendra.printdocument.MVELParseFormat;
import org.xendra.printdocument.PrintDocument;

public class CompileLog extends CPanel {
	private JTextPane output;
	private MPrinterDocumentFormat m_pdf;
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
	public void clear()  {
		output.setText("");
		//output.invalidate();
	}
	public void compile(MPrinterDocumentFormat pdf, String source) {
		clear();
		String prevlog = "";
		String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Timestamp(System.currentTimeMillis()));
		String rulename = String.format("Compiling %s...%s\n",pdf.getName(), timeStamp);
		prevlog = prevlog.concat(String.format("%s %s %s",Xendra.XENDRA_R, Xendra.MAIN_VERSION, rulename));
		output.setText(prevlog);
		//output.invalidate();				
		PrintDocument pd = MVELParseFormat.getInstance().parse(pdf);
		Map vars = new HashMap();
		vars.put("pd", pd);
		vars.put("source", DataSource.reset());
		try {
			//ExecutableStatement stmt = (ExecutableStatement) MVEL.compileExpression(pdf.getSource());
			ExecutableStatement stmt = (ExecutableStatement) MVEL.compileExpression(source);
			MVEL.executeExpression(stmt, vars);
		} catch (Exception e) {
			//e.printStackTrace();
			prevlog = prevlog.concat(e.getMessage());
		}
		//String error = "";
		output.setText(prevlog);
		output.invalidate();
	}

}
