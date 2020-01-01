package org.xendra.ruleeditor.compile;

import java.awt.BorderLayout;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.ScrollPaneConstants;

import org.compiere.Xendra;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_AD_Rule;
import org.compiere.swing.CPanel;
import org.compiere.util.Env;
import org.kie.api.KieBase;
import org.kie.api.builder.Message;
import org.kie.api.event.rule.DebugRuleRuntimeEventListener;
import org.kie.api.runtime.KieSession;

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

	public void compile(Integer ruleid) {
		X_AD_Rule rule = new Query(Env.getCtx(), X_AD_Rule.Table_Name, "AD_Rule_ID = ?", null).setParameters(ruleid).first();
		if (rule != null)
		{
			while (rule.getParent_ID() > 0)
			{
				rule = new Query(Env.getCtx(), X_AD_Rule.Table_Name, "AD_Rule_ID = ?", null).setParameters(rule.getParent_ID()).first();
			}
		}
		if (rule != null)
		{
			output.removeAll();
			String prevlog = "";
			String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Timestamp(System.currentTimeMillis()));
			String rulename = String.format("Compiling %s...%s\n",rule.getName(), timeStamp);
			prevlog = prevlog.concat(String.format("%s %s %s",Xendra.XENDRA_R, Xendra.MAIN_VERSION, rulename));
			//prevlog = prevlog.concat(Xendra.XENDRA_R.concat("\n"));
			//prevlog = prevlog.concat(Xendra.MAIN_VERSION);						
			//prevlog = prevlog.concat();
			output.setText(prevlog);
			output.invalidate();
			//String error = "";
			KieSession ksession = null;
			KieBase kb = Env.initializeRule(rule.getAD_Rule_ID());
			if (kb != null)
			{
//				ksession = kb.newKieSession();
//				ksession.addEventListener(new DebugRuleRuntimeEventListener());					
//				ksession.setGlobal("ctx", Env.getCtx());								
//				ksession.insert(this);
				prevlog = prevlog.concat("sucessfully Compile\n");
			}
			else
			{
				List<Message> msgs = Env.getKieErrorMsgs(rule.getAD_Rule_ID());
				for (Message msg:msgs)
				{							
					prevlog = prevlog.concat("\n");
					prevlog = prevlog.concat(msg.getText());
				}								
			}					
			output.setText(prevlog);
			output.invalidate();
		}		
	}
}