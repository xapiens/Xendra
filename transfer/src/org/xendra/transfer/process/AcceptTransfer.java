package org.xendra.transfer.process;

import java.util.List;
import java.util.logging.Level;

import org.compiere.model.MProcess;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_A_Xendrian_Message;
import org.compiere.process.SvrProcess;
import org.compiere.util.Env;
import org.kie.api.KieBase;
import org.kie.api.runtime.KieSession;
import org.kie.api.runtime.rule.EntryPoint;

public class AcceptTransfer extends SvrProcess  {

	private String m_entrypoint;
	private String m_agenda;
	
	@Override
	protected void prepare() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected String doIt() throws Exception {
		log.log(Level.WARNING, "ejecutando AcceptorTransfer");
		MProcess proc = MProcess.get(Env.getCtx(), getProcessInfo().getAD_Process_ID());
		KieBase kb = Env.startRule(proc.getAD_Rule_ID());	
		if (kb == null)
		{
			String m_processMsg = Env.getKieError(proc.getAD_Rule_ID());
			if (m_processMsg == null)
				m_processMsg = "Error in Rule AcceptSales";
			throw new Exception(m_processMsg);
		}
		m_entrypoint = Env.getSessionEntrypoints(proc.getAD_Rule_ID());
		m_agenda = Env.getAgenda(proc.getAD_Rule_ID());
		//KieBase kb = Env.getkieBase();
		if (kb != null) // KieBase initialized
		{
			KieSession session = kb.newKieSession();
			EntryPoint point = session.getEntryPoint(m_entrypoint);
			System.out.println("ejecutando AcceptorTransfer");			
			if (point == null)
				System.out.println("X");
			if (point != null && m_entrypoint != null && m_agenda != null)
			{
				String query = "AD_Process_ID = ? AND Processed = 'N'";		
				//List<X_A_Xendrian_Message> messages = new Query(Env.getCtx(), X_A_Xendrian_Message.Table_Name, query, get_TrxName()).setParameters(proc.getAD_Rule_ID()).list();
				List<X_A_Xendrian_Message> messages = new Query(Env.getCtx(), X_A_Xendrian_Message.Table_Name, query, null).setParameters(proc.getAD_Rule_ID()).list();
				int count = 1;
				int percent = 0;
				for (X_A_Xendrian_Message message:messages)
				{
					TransferMessageProcessor transfer = new TransferMessageProcessor();
					String error = transfer.setMessage(message.getMessage());
					if (error.length() == 0) {
						transfer.setXendrianMessage(message);
						try {
							TransferPolicyRequest tqr = new TransferPolicyRequest();
							tqr.setMessage(transfer);
							point.insert(tqr);
							session.getAgenda().getAgendaGroup( m_agenda ).setFocus();
							session.fireAllRules();
							if (count * 100 / messages.size() != percent ) {
								percent = count * 100 / messages.size();
								System.out.println(String.format("Transference %s%%",percent));								
							}								
						} catch (Exception e) {
							e.printStackTrace();
						}
					} else {
						message.setErrorMsg(error);
						message.setProcessed(true);
						message.save();
					}
//					SalesMessageProcessor possale = new SalesMessageProcessor();
//					String error = possale.setMessage(message.getMessage());
//					if (error.length() == 0)
//					{
//						possale.setXendrianMessage(message);
//						try {
//							SalesPolicyRequest spr = new SalesPolicyRequest();		
//							spr.setMessage(possale);	
//							//KieSession session = Env.getSession();
//							//EntryPoint point = Env.getEntrypoint(m_entrypoint);
//							point.insert(spr);
//							session.getAgenda().getAgendaGroup( m_agenda ).setFocus();
//							session.fireAllRules();	
//							//Env.insert(m_entrypoint, m_agenda, spr);
//							//m_inteligence.insert(spr);
//							if ( count * 100 / messages.size() != percent )
//							{
//								percent = count * 100 / messages.size();
//								System.out.print("Sales "+percent);
//								System.out.println("%");
//							}
//							count ++;				
//						}
//						catch (Exception e)
//						{
//							e.printStackTrace();
//						}
//					}
//					else
//					{
//						message.setErrorMsg(error);
//						message.setProcessed(true);
//						message.save();
//					}					
				}						
			}		
			else
			{
				System.out.println("reglas aun no inicializadas");
				Env.resetRule(proc.getAD_Rule_ID());
			}
			session.dispose();
		}
		System.out.println("terminado AcceptorTransfer");
		return null;
	}

}
