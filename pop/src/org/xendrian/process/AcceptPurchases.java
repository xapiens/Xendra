package org.xendrian.process;

import java.util.List;
import java.util.logging.Level;

import org.compiere.model.MProcess;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_AD_MessageFormat;
import org.compiere.model.persistence.X_A_Xendrian_Message;
import org.compiere.process.SvrProcess;
import org.compiere.util.Env;
import org.kie.api.KieBase;
import org.kie.api.runtime.KieSession;
import org.kie.api.runtime.rule.EntryPoint;
import org.xendra.messages.BuyPolicyRequest;
import org.xendra.messages.MessageProcessor;

public class AcceptPurchases extends SvrProcess {

	private String m_entrypoint;
	private String m_agenda;

	@Override
	protected void prepare() {
		// TODO Auto-generated method stub		
	}

	@Override
	protected String doIt() throws Exception {
		log.log(Level.FINE, "ejecutando Accept Purchases");
		MProcess proc = MProcess.get(Env.getCtx(), getProcessInfo().getAD_Process_ID());
		X_AD_MessageFormat format = new Query(Env.getCtx(), X_AD_MessageFormat.Table_Name, "AD_Rule_ID = ?", null)
		.setParameters(proc.getAD_Rule_ID()).first();		
		if (format == null) {			
			throw new Exception(String.format("format not found in %s AcceptPurchase", proc.getName()));			
		}
		KieBase kb = Env.startRule(proc.getAD_Rule_ID());		
		if (kb == null) {
			String m_processMsg = Env.getKieError(proc.getAD_Rule_ID());
			if (m_processMsg == null)
				m_processMsg = "Error in Rule AcceptPurchase";
			throw new Exception(m_processMsg);
		}
		m_entrypoint = Env.getSessionEntrypoints(proc.getAD_Rule_ID());
		m_agenda = Env.getAgenda(proc.getAD_Rule_ID());
		if (kb != null) // KieBase initialized
		{
			KieSession session = kb.newKieSession();
			EntryPoint point = session.getEntryPoint(m_entrypoint);
			if (point == null) {
				Thread.sleep(1000);
				kb = Env.startRule(proc.getAD_Rule_ID(), true);
				session = kb.newKieSession();
				point = session.getEntryPoint(m_entrypoint);
			}
			if (m_entrypoint != null && m_agenda != null )
			{
				String query = "AD_Process_ID = ? AND Processed = 'N' AND COALESCE(ErrorMsg,'') = '' ";		
				List<X_A_Xendrian_Message> messages = new Query(Env.getCtx(), X_A_Xendrian_Message.Table_Name, query, get_TrxName())
				.setParameters(proc.getAD_Rule_ID()).list();
				int count = 1;
				int percent = 0;
				for (X_A_Xendrian_Message message:messages)
				{
					MessageProcessor p = MessageProcessor.getInstance();
					String error = p.setMessage(format.getIdentifier(), message, get_TrxName());					
					if (error.length() == 0)
					{
						p.commit();
						try {
							BuyPolicyRequest spr = new BuyPolicyRequest();					    
							spr.setMessageProcessor(p);
							point.insert(spr);
							session.getAgenda().getAgendaGroup( m_agenda ).setFocus();
							session.fireAllRules();	
							if ( count * 100 / messages.size() != percent )
							{
								percent = count * 100 / messages.size();
								System.out.print(percent);
								System.out.println("%");
							}
							count ++;				
						}
						catch (Exception e)
						{
							e.printStackTrace();
						}
					}
					else
					{
						message.setErrorMsg(error);
						message.setProcessed(true);
						message.save();						
					}			
				}
			}
			else
			{
				System.out.println("reglas aun no inicializadas");
				Env.resetRule(proc.getAD_Rule_ID());
			}		
			session.dispose();			
		}
		return null;
	}
}
