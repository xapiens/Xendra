package org.xendra.console;

import java.io.File;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.HashMap;
import java.util.Iterator;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import okhttp3.Cache;
import okhttp3.CacheControl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.compiere.Xendra;
import org.compiere.db.CConnection;
import org.compiere.model.persistence.X_A_Machine;
import org.compiere.model.reference.REF_ServerType;
import org.compiere.util.Env;
import org.jdom.Document;
import org.jdom.Element;
import org.xendra.api.XendrianServer;
import org.xendra.security.SSLContextFactory;
import org.xendra.utils.ToolDev;

public class common {

	public static String PingToServer() {
		String error = "";
		String url = "";
		try {
			X_A_Machine webserver = Env.getServerWeb(Env.getMachine());
			if (webserver == null) {
				throw new Exception("No se encontro un servidor web donde subir los plugins");
			}					
			HashMap props = Env.getServerProperties(webserver.getA_Machine_ID(), REF_ServerType.WebServer); 
			int port = 0;
			if (props.containsKey("port")) {
				port = Integer.valueOf(props.get("port").toString());
			} else {
				throw new Exception(String.format("no exist port defined to %s in MachineServer", webserver.getName()));
			}
			Document doc = new XendrianServer().setServlet("plugin").setType("alive").getDocument();
			if (doc == null) {
				throw new Exception(String.format("no conexion %s:%s", webserver.getName(), port));
			}
			Element root = doc.getRootElement();
			if (root.getName().equals("html")) {
				throw new Exception(String.format("server outdated %s:%s", webserver.getName(), port));
			}	
			Iterator iterator = root.getChildren().listIterator();
			Element extensionXmlElement;
			String dbname = "";
			String dbhost = "";
			String version = "";
			Boolean update = false;
			while (iterator.hasNext()) {
				extensionXmlElement = (Element) iterator.next();
				if (extensionXmlElement.getName().equals("databasename")) {
					dbname = extensionXmlElement.getText();
				} else if (extensionXmlElement.getName().equals("databasehost")) { 
					dbhost = extensionXmlElement.getText();
				} else if (extensionXmlElement.getName().equals("version")) {
					version = extensionXmlElement.getText();
				} else if (extensionXmlElement.getName().equals("update")) {
					update = extensionXmlElement.getText().equals("Y");
				}
			}
			if (!update) {
				throw new Exception(String.format("no update server activate to process plugins",url));
			}
			if (version.equals(Xendra.DATE_VERSION))
			{
				CConnection m_cc = CConnection.get();
				if ( !m_cc.getDbHost().equals(dbhost) && m_cc.getDbName().equals(dbname))
				{					
					if (!m_cc.getDbHost().equals(dbhost)) {
						throw new Exception(String.format("server name don't match local (%s) <=> server (%s)",m_cc.getDbHost(),dbhost));	
					} else if (!m_cc.getDbName().equals(dbname)) {
						throw new Exception(String.format("database name don't match %s <=> %s",m_cc.getDbName(), dbname));
					}
				}
			} 
			else {
				throw new Exception(String.format("servidor no encontrado %s ",url));
			}				
		} catch (Exception e1) {
			String msg = e1.getMessage();
			if (msg == null) 
				msg = "";
			error = String.format("%s %s", url, msg);			
		}					
		return error;
	}

	public static String navigate(String url) {
		String result = "";
		try {
			if (!ToolDev.isvalidpassword()) {								
				throw new Exception("nopassword");
			} 
			if (!ToolDev.isvalidkeystore()) {				
				throw new Exception("nokeystore");				
			}		
			SSLContext sslContext = SSLContextFactory.getInstance().makeContext(ToolDev.getkeystorefile(), ToolDev.getkeystorepassword());
			if (sslContext == null) {
				result = SSLContextFactory.getInstance().getError();				
				throw new Exception(result);
			}
			int cacheSize = 10 * 1024 * 1024;
			File t = new File(System.getProperty("java.io.tmpdir"));
			Cache cache = new Cache(t, cacheSize);			
			SSLSocketFactory sslSocketFactory;				
			sslSocketFactory = sslContext.getSocketFactory();								
			OkHttpClient client = new OkHttpClient.Builder()						
			.sslSocketFactory(sslSocketFactory)
			.cache(cache)
			.build();
			Request request = new Request.Builder()
			.header("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.11 (KHTML, like Gecko) Chrome/23.0.1271.95 Safari/537.11")
			.cacheControl(new CacheControl.Builder().noCache().build())			
			.url(url).build();    			
			Response response = client.newCall(request).execute();
			if (!response.isSuccessful()) throw new IOException("Unexpected code " + response);
			result = response.body().string();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	public static String DateTimeDiff(Timestamp olddate, Timestamp newdate)  {
		String status = "";
		if (olddate == null)
			status = "not installed";
		else {
			long different = newdate.getTime() - olddate.getTime();						
			long secondsInMilli = 1000;
			long minutesInMilli = secondsInMilli * 60;
			long hoursInMilli = minutesInMilli * 60;
			long daysInMilli = hoursInMilli * 24;						
			long elapsedDays = different / daysInMilli;
			different = different % daysInMilli;
			long elapsedHours = different / hoursInMilli;
			different = different % hoursInMilli;
			long elapsedMinutes = different / minutesInMilli;
			different = different % minutesInMilli;
			long elapsedSeconds = different / secondsInMilli;
			String timepass = "";
			if (elapsedDays > 0)
				timepass = String.format("%d dias, %d horas",elapsedDays,elapsedHours);
			else if (elapsedHours > 0)
				timepass = String.format("%d horas",elapsedHours);
			else if (elapsedMinutes > 0)
				timepass = String.format("%d minutos",elapsedMinutes);
			else if (elapsedSeconds > 0)
				timepass = String.format("%d segundos%n",elapsedSeconds);
			status = timepass;
			if (status.length() == 0) {
				status = "updated";
			}
		}
		return status;
	}
}
