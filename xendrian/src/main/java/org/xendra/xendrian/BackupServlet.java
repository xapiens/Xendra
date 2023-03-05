package org.xendra.xendrian;

import io.undertow.server.HttpServerExchange;
import io.undertow.server.handlers.form.FormData;
import io.undertow.server.handlers.form.FormDataParser;
import io.undertow.server.handlers.form.FormParserFactory;
import io.undertow.servlet.spec.HttpServletRequestImpl;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.compiere.util.WebEnv;
import com.dravios.pgrman.pgrman;

public class BackupServlet extends HttpServlet {

	//private IOStreams ios;
	private static pgrman m_pgrman = new pgrman();
	public void init(ServletConfig config) throws ServletException
	{
		super.init(config);
		if (!WebEnv.initWeb(config))
			throw new ServletException("plugin.init");

	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String type = request.getParameter("type");		
		String result = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>";
		result +="<![CDATA[";
		if (type.equals("show")) {			
			result += m_pgrman.show();			
		} else if (type.equals("backup")) {
			result += m_pgrman.backup();
		}
		result +="]]>";
		response.setContentType("text/xml");		
		PrintWriter out = response.getWriter();  
		out.write(result);  
		out.close();
	}
	
	public void doPost(HttpServletRequest req, HttpServletResponse response)  
			throws ServletException, IOException {  
//		String type = "";
//		HttpServletRequestImpl httpServletRequest = (HttpServletRequestImpl) req;
//		HttpServerExchange exchange = httpServletRequest.getExchange();
//		final FormDataParser parser =  FormParserFactory.builder().build().createParser(exchange);
//		FormData data2 = parser.parseBlocking();                          
//		Iterator it2 = data2.iterator();
//		while (it2.hasNext()) {
//			String xx = (String) it2.next();
//			if (xx.equals("type")) {				
//				type = data2.getFirst("type").getValue();
//			} else if (xx.equals("fileName")) {
//				type = "upload";
//			}
//		}
//		if (type.equals("upload")) {
//
//		}
	}
}
