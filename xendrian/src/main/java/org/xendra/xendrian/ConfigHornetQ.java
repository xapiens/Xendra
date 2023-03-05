package org.xendra.xendrian;

import java.io.File;
import java.io.PrintWriter;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.List;
import java.util.logging.Level;

import org.compiere.model.Query;
import org.compiere.model.persistence.X_AD_ReplicationFile;
import org.compiere.util.CLogger;
import org.compiere.util.Env;

public class ConfigHornetQ {
	private static CLogger 		log = CLogger.getCLogger (ConfigHornetQ.class);
	private String m_dir;
	ConfigHornetQ(String dir) 
	{
		if (!org.compiere.Xendra.startup(false))
		{					
			log.log(Level.SEVERE, "can't connect to database");
			return;
		}		
		m_dir = dir;

	}
	private void update() {						
		File programFolder = new File(m_dir);
		if (!programFolder.exists())
		{
			if (!programFolder.mkdirs())
				return;
		}
		File[] programList = programFolder.listFiles();
		List<X_AD_ReplicationFile> rfs = new Query(Env.getCtx(), X_AD_ReplicationFile.Table_Name,"", null).list();
		for (X_AD_ReplicationFile rf:rfs)
		{
			for (File file:programList)
			{
				if (rf.getName().equals(file.getName()))
				{
					long lm = file.lastModified();
					Calendar cal = Calendar.getInstance();
					cal.setTime(rf.getSynchronized());
					cal.set(Calendar.MILLISECOND, 0);					
					if (cal.getTimeInMillis() != lm)
					{
						try {
							PrintWriter out = new PrintWriter(file.getAbsoluteFile());
							out.println(rf.getContent().toString());
							file.setLastModified(rf.getSynchronized().getTime());
						}
						catch (Exception e)
						{
							e.printStackTrace();
						}
					}
				}
			}
		}		
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ConfigHornetQ config = new ConfigHornetQ("/home/americas/test");
		config.update();
	}
}
