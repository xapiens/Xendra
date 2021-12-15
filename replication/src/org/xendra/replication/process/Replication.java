package org.xendra.replication.process;

import java.io.StringReader;
import java.util.List;

import org.compiere.model.MClient;
import org.compiere.model.MProcess;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_AD_Client;
import org.compiere.model.persistence.X_A_Xendrian_Replication;
import org.compiere.model.reference.REF_ReplicationType;
import org.compiere.process.SvrProcess;
import org.compiere.util.Env;
import org.jdom.Document;
import org.jdom.input.SAXBuilder;
import org.xendra.replication.ReplicationEngine;

/**
 *  Replication   
 *
 *  @author xapiens
 *  @version $Id: Replication.java 5842 2016-06-20 01:36:32Z xapiens $
 *
 */
public class Replication extends SvrProcess {
	private MClient client = null;
	@Override
	protected void prepare() {
		client = new Query(Env.getCtx(),X_AD_Client.Table_Name, "IsReplicated = 'Y' AND IsActive = 'Y'", null).first();
		if (client != null)
			Env.setContext(getCtx(), "#AD_Client_ID", client.getAD_Client_ID());
	}

	@Override
	protected String doIt() throws Exception {
		MProcess proc = MProcess.get(Env.getCtx(), getProcessInfo().getAD_Process_ID());		
		System.out.println("ejecutando Replication");
		String query = "Processed = 'N' AND ReplicationType = ?";		
		int count = 1;
		int percent = 0;		
		List<X_A_Xendrian_Replication> messages = new Query(Env.getCtx(), X_A_Xendrian_Replication.Table_Name, query,  null)
			.setParameters(REF_ReplicationType.Reference)			
			.setOrderBy(X_A_Xendrian_Replication.COLUMNNAME_A_Xendrian_Replication_ID).setLimit(1000).list();
		for (X_A_Xendrian_Replication message:messages)
		{
			SAXBuilder builder = new SAXBuilder();
			Document document = null;
			try {
				document = (Document) builder.build(new StringReader(message.getMessage()));
			}
			catch (Exception e)
			{
				e.printStackTrace();
				message.setErrorMsg(e.getMessage());
				message.setProcessed(true);
				message.save();
				continue;
			}
			String errormsg = ReplicationEngine.getInstance().encode(document);
			if (errormsg.length() > 0)
			{
				message.setErrorMsg(errormsg);
			}
			message.setProcessed(true);
			message.save();
			if ( count * 100 / messages.size() != percent )
			{
				percent = count * 100 / messages.size();
				System.out.print("replication " + percent);
				System.out.println("%");
			}
			count ++;				
		}
		System.out.println("terminado replication");
		return null;
	}	
}