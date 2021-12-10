package org.xendra.api;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.ConnectionPool;
import okhttp3.FormBody;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

import org.compiere.model.Query;
import org.compiere.model.persistence.X_AD_Servlet;
import org.compiere.model.persistence.X_A_Machine;
import org.compiere.model.reference.REF_ServerType;
import org.compiere.util.Env;
import org.jdom.Document;
import org.jdom.input.SAXBuilder;

public class XendrianServer {
	private String m_servlet;
	private String m_type = "";
	private String m_internalurl;
	private String m_role;
	private String m_password;
	private String m_filename;
	private String m_certid;
	private String m_pluginid;
	private X_A_Machine m_machine;
	private String m_action;
	private String m_processid;
	private Integer m_instanceId;
	private Integer m_QueryId;	
	private String key;
	private String property;
	static ConnectionPool pool = new ConnectionPool(5, 10000, TimeUnit.MILLISECONDS);
	static OkHttpClient client = new OkHttpClient.Builder().connectionPool(pool).build();
	public Map<String, X_AD_Servlet> servlets = new HashMap<String, X_AD_Servlet>();;
	public XendrianServer() {
	}
	public XendrianServer(String servletname) {
		m_servlet = servletname;
	}
	public String get(String var) {
		m_type = var;
		String url = buildurl();
		return null;
	}
	public XendrianServer setServlet(String var) {
		m_servlet = var;
		return this;
	}
	public XendrianServer setType(String var) {
		m_type = var;
		return this;
	}
	public XendrianServer setCertId(String var) {
		m_certid = var;
		return this;
	}
	//	public XendrianServer setInstance(Integer instanceId) {
	//		m_instanceId = instanceId;
	//		return this;
	//	}
	public XendrianServer setUrl(String var) {
		m_internalurl = var;
		return this;
	}
	public XendrianServer setRole(String var) {
		m_role = var;
		return this;
	}
	public XendrianServer setPassword(String var) {
		m_password = var;
		return this;
	}
	public XendrianServer setFileName(String var) {
		m_filename = var;
		return this;
	}
	public XendrianServer setQuery(Integer id) {
		m_QueryId = id;
		return this;
	}
	public XendrianServer setPluginID(String id) {
		m_pluginid = id;
		return this;
	}
	public XendrianServer setAction(String id) {
		m_action = id;
		return this;
	}
	public XendrianServer setRunNow(String procid) {	
		m_processid = procid;
		return this;
	}
	public String buildurl() {		  
		String url = null;
		if (m_machine == null) {
			url = String.format("%s/%s", getWebServerUrl(), m_servlet);
		} else {
			HashMap props = Env.getServerProperties(m_machine.getA_Machine_ID(), REF_ServerType.WebServer); 
			int port = 0;
			if (props.containsKey("port")) {
				port = Integer.valueOf(props.get("port").toString());
			}		
			url = String.format("http://%s:%s/%s", m_machine.getName(), port, m_servlet);
		}		
		if (!servlets.containsKey(m_servlet)) {
			X_AD_Servlet servlet = new Query(Env.getCtx(), X_AD_Servlet.Table_Name,  "name = ?", null)
				.setParameters(m_servlet).first();
			if (servlet != null) {
				servlets.put(m_servlet, servlet);
			}
		}
		if (servlets.containsKey(m_servlet)) {
			String format = "";
			X_AD_Servlet servlet = servlets.get(m_servlet);
			HashMap props = servlet.getProperties();
			if (props.containsKey(m_type)) {
				format = (String) servlet.getUrlFormat().get(m_type);
								
			} else {
				url = String.format("%s?type=%s", url,m_type);
			}
		}
		if (m_servlet.equals("store")) {				
			if (m_type.equals("install")) {
				url = String.format("%s?type=%s&instance=%s", url,m_type,m_instanceId);			
			} else if (m_type.equals("addclient")) {
				url = String.format("%s?type=%s&instance=%s", url,m_type,m_instanceId);
			} else if (m_type.equals("status"))	{
				url = String.format("%s?type=%s", url,m_type);
			} else if (m_type.equals("validate")) {
				url = String.format("%s?type=%s&url=%s&role=%s", url,m_type, m_internalurl, m_role);
				//String x = Util.navigateWebServer(String.format("store?type=validate&url=%s&role=%s", url, MRole.getDefault().getIdentifier()));
			} else if (m_type.equals("refreshstore")) {
				url = String.format("%s?type=%s", url, m_type);
			} else if (m_type.equals("createstore")) {
				//String x = Util.navigateWebServer(String.format("store?type=createstore&role=%s&password=%s", MRole.getDefault().getIdentifier(), pwdsecure));
				url = String.format("%s?type=%s&role=%s&password=%s", url, m_type,m_role, m_password);
			} else if (m_type.equals("client")) {
				//String result = Util.navigateWebServer(String.format("store?type=client&filename=%s", pluginfilename));
				url = String.format("%s?type=%s&filename=%s",url,m_type,m_filename);
			} else if (m_type.equals("addcert")) {
				url = String.format("%s?type=%s&id=%s&%roleid=%s", url, m_type, m_certid, m_role);
				//String url = String.format("http://%s:%s/store?type=addcerts&id=%s&roleid=%s", webserver.getName(),port, pickcert.getValue() ,MRole.getDefault().getIdentifier());
			} else if (m_type.equals("list")) {
				url = String.format("%s?type=%s", url, m_type);
			} else if (m_type != null) {
				url = String.format("%s?type=%s", url, m_type);
			}
		} else if (m_servlet.equals("plugin")) {
			if (m_type.equals("core")) {
				url = String.format("%s?type=%s", url,m_type);
			} else if (m_type.equals("alive")) {
				//String url = String.format("http://%s:%s/plugin?type=alive", webserver.getName(),port);
				url = String.format("%s?type=%s", url,m_type);
			} else if (m_type.equals("list")) {
				url = String.format("%s?type=%s&ad_role_id=%s", url,m_type, m_role);
				//url = String.format("http://%s:%s/plugin?ad_role_id=%s&type=list", Env.getServerUpdate().getName(),port, Env.getAD_Role_ID(Env.getCtx()));
			} else if (m_type.equals("plugin")) {
				url = String.format("%s?type=%s&id=%s",url, m_type, m_pluginid);
				//String url = String.format("http://%s:%s/plugin?type=plugin&id=%s",Env.getServerUpdate().getName(), port, plugin.getId());
			} else if (m_type.equals("pluginsize")) {
				url = String.format("%s?type=%s&id=%s",url, m_type, m_pluginid);
			}
		} else if (m_servlet.equals("query")) {
			if (m_type.equals("update")) {
				url = String.format("%s?type=%s&role=%s&query=%s", url, m_type, m_role, m_QueryId);
			} else {
				url = String.format("%s?type=%s&role=%s",url, m_type, m_role);
			}
		} else if (m_servlet.equals("replication")) {
			//if (m_type.equals("list")) {
			//String url = String.format("http:/%s:%s/replication?action=list", m_machine.getName(), webport);
			url = String.format("%s?action=%s", url, m_action);
			//}
		} else if (m_servlet.equals("monitor")) {

			if (m_type.equals("runnow")) {
				url = String.format("%s?RunNow=%s", url, m_processid);
			} else {
				url = String.format("%s?Action=", url, m_action);
			}
		}
		return url;
	}
	public void newsession() {
		String url = buildurl();
		String result = "";
		RequestBody formBody = new FormBody.Builder()
		.add("type", XendrianConstants.NewSession)
		.build();
		Request request = new Request.Builder()
		.url(url)
		.post(formBody)
		.build();
		try {
			Response response = client.newCall(request).execute();
			result = response.body().string();
			response.close();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			client.connectionPool().evictAll();
		}							
	}

	public String start() {
		String url = buildurl();
		System.out.println(String.format("url=>%s",url));
		String result = "";
		Request request = new Request.Builder().url(url).build();
		try {

			Response response = client.newCall(request).execute();
			result = response.body().string();
		}
		catch (Exception e) {
			e.printStackTrace();
		} finally {
			client.connectionPool().evictAll();
		}
		return result;		
	}
	public Response getResponse()  {
		String url = buildurl();
		Request request = new Request.Builder().url(url).build();				
		Response response = null;
		try {
			response = client.newCall(request).execute();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return response;
	}
	
	public String getTextResponse()  {
		String url = buildurl();
		Request request = new Request.Builder().url(url).build();				
		Response response = null;
		String textresponse = "";
		try {
			response = client.newCall(request).execute();
			textresponse = response.body().string();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return textresponse;
	}		

	public String getProperty(String key) {
		String result = "";
		String url = buildurl();
		RequestBody formBody = new FormBody.Builder()
		.add("type", XendrianConstants.getProperty)
		.add("key", key)
		.build();
		Request request = new Request.Builder()
		.url(url)
		.post(formBody)
		.build();
		try {
			Response response = client.newCall(request).execute();			
			result = response.body().string();
			response.close();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			client.connectionPool().evictAll();
		}
		return result;
	}
	public String getError() {
		String url = buildurl();
		String result = "";
		RequestBody formBody = new FormBody.Builder()
		.add("type",XendrianConstants.getError)
		.build();
		Request request = new Request.Builder()
		.url(url)
		.post(formBody)
		.build();
		try {
			Response response = client.newCall(request).execute();
			result = response.body().string();
			response.close();		
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			client.connectionPool().evictAll();
		}
		return result;
	}
	public String getMessage() {
		String url = buildurl();
		String result = "";
		RequestBody formBody = new FormBody.Builder()
		.add("type", XendrianConstants.getMessage)
		.build();
		Request request = new Request.Builder()
		.url(url)
		.post(formBody)
		.build();
		try {
			Response response = client.newCall(request).execute();
			result = response.body().string();
			response.close();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			client.connectionPool().evictAll();
		}				
		return result;
	}
	public void addMessage(String message) {	
		String url = buildurl();
		RequestBody formBody = new FormBody.Builder()
		.add("type", XendrianConstants.addMessage)
		.add("message", message)
		.build();
		Request request = new Request.Builder()
		.url(url)
		.post(formBody)
		.build();
		try {
			Response response = client.newCall(request).execute();
			response.close();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			client.connectionPool().evictAll();
		}				
	}

	public void addProperty(String key, Object var) {
		this.key = key;
		if (var instanceof Integer) {
			this.property = String.valueOf(var);
		} else {
			this.property = (String) var;
		}
		String url = buildurl();
		//OkHttpClient client = new OkHttpClient();
		RequestBody formBody = new FormBody.Builder()
		.add("type", XendrianConstants.addProperty)
		.add("key", key)
		.add("value", property)
		.build();
		Request request = new Request.Builder()
		.url(url)
		.post(formBody)
		.build();
		try {
			Response response = client.newCall(request).execute();
			response.close();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			client.connectionPool().evictAll();
		}		
	}

	public Document getDocument() {
		Document doc = null;
		String result = start();
		if (result.length() > 0) {
			SAXBuilder builder = new SAXBuilder();		
			try {
				InputStream stream = new ByteArrayInputStream(result.getBytes("UTF-8"));
				doc = builder.build(stream);
			} catch (Exception e) {

			}
		}
		return doc;
	}
	public static X_A_Machine getWebServer() {
		X_A_Machine webserver = Env.getServerWeb(Env.getMachine());
		return webserver;		
	}
	public static String getWebServerName()  {
		String result = "";
		X_A_Machine webserver = Env.getServerWeb(Env.getMachine());
		if (webserver == null) {
			return result;			
		}				
		result = webserver.getName();
		return result;
	}
	public static String getWebServerUrl() {
		String result = "";
		X_A_Machine webserver = Env.getServerWeb(Env.getMachine());
		if (webserver == null) {
			return result;			
		}				
		HashMap props = Env.getServerProperties(webserver.getA_Machine_ID(), REF_ServerType.WebServer); 
		int port = 0;
		if (props.containsKey("port")) {
			port = Integer.valueOf(props.get("port").toString());
		}						
		result = String.format("http://%s:%s", webserver.getName(),port);
		return result;
	}
	
	public XendrianServer setMachineName(X_A_Machine machine) {
		m_machine = machine;
		return this;
	}
	
	public XendrianServer upload(File file) {
		String url = buildurl();
        
		
		
		RequestBody requestBody = new MultipartBody.Builder()
			.setType(MultipartBody.FORM)
			.addFormDataPart("fileName", file.getName(),						
				RequestBody.create(MediaType.parse("application/zip"), file))
			.addFormDataPart("some-field", "some-value")
			.build();
		Request request = new Request.Builder()
		.url(url)
		.post(requestBody)
		.build();
		client.newCall(request).enqueue(new Callback() {
			@Override
			public void onFailure(final Call call, final IOException e) {
				// Handle the error
				e.printStackTrace();
			}
			@Override
			public void onResponse(final Call call, final Response response) throws IOException {
				if (!response.isSuccessful()) {
					System.out.println("X");
				}
				// Upload successful
			}
		});		
		return this;
	}
}