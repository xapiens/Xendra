package org.xendra.transferbackup;

import java.util.List;

import org.compiere.model.MProcess;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_A_Xendrian_Message;
import org.compiere.process.SvrProcess;
import org.compiere.util.Env;
import org.kie.api.KieBase;
import org.kie.api.runtime.KieSession;
import org.kie.api.runtime.rule.EntryPoint;
import org.xendra.transfer.process.GeneralMessageProcessor;
import org.xendra.transfer.process.TransferPolicyRequest;

public class AcceptTransfer extends SvrProcess {

	private String m_entrypoint;
	private String m_agenda;

	@Override
	protected void prepare() {
		// TODO Auto-generated method stub		
	}

	@Override
	protected String doIt() throws Exception {
		MProcess proc = MProcess.get(Env.getCtx(), getProcessInfo().getAD_Process_ID());
		KieBase kb = Env.startRule(proc.getAD_Rule_ID());
		m_entrypoint = Env.getSessionEntrypoints(proc.getAD_Rule_ID());
		m_agenda = Env.getAgenda(proc.getAD_Rule_ID());		
		if (kb != null) // KieBase initialized
		{
			KieSession session = kb.newKieSession();
			EntryPoint point = session.getEntryPoint(m_entrypoint);
			System.out.println("ejecutando AcceptorTransfer");
			if (m_entrypoint != null && m_agenda != null)
			{
				String query = "AD_Process_ID = ? AND Processed = 'N'";		
				List<X_A_Xendrian_Message> messages = new Query(Env.getCtx(), X_A_Xendrian_Message.Table_Name, query, get_TrxName()).setParameters(proc.getAD_Rule_ID()).list();
				int count = 1;
				int percent = 0;
				for (X_A_Xendrian_Message message:messages)
				{
					GeneralMessageProcessor possale = new GeneralMessageProcessor();
					String error = possale.setMessage(message.getMessage());
					if (error.length() == 0)
					{
						possale.setXendrianMessage(message);
						try {
							TransferPolicyRequest spr = new TransferPolicyRequest();					    
							spr.setMessage(possale);	
							point.insert(spr);
							session.getAgenda().getAgendaGroup( m_agenda ).setFocus();
							session.fireAllRules();	
							if ( count * 100 / messages.size() != percent )
							{
								percent = count * 100 / messages.size();
								System.out.print("Sales "+percent);
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
						message.save();
					}
				}						
			}		
			else
			{
				System.out.println("reglas aun no inicializadas");
			}
			session.dispose();
		}
		System.out.println("terminado AcceptorTransfer");
		return null;
	}
}
