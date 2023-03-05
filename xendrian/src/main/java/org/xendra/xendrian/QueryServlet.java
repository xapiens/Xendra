package org.xendra.xendrian;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.List;
import java.util.Optional;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.compiere.model.Query;
import org.compiere.model.persistence.X_PA_Query;
import org.compiere.util.Env;
import org.compiere.util.WebEnv;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.input.SAXBuilder;
import org.jdom.output.Format;
import org.jdom.output.XMLOutputter;

public class QueryServlet extends HttpServlet {
	public QueryServlet() {
		super();
	}
	public void init(ServletConfig config) throws ServletException
	{
		super.init(config);
		if (!WebEnv.initWeb(config))
			throw new ServletException("plugin.init");

	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Enumeration<String> parameterNames = request.getParameterNames();
		String role = request.getParameter("role");
		Optional<String> type = Optional.ofNullable(request.getParameter("type"));		
		String result = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>";
		if (type.isPresent() && type.get().equals("list")) {
			String xml = "<querys>";
			List<X_PA_Query> querys = new Query(Env.getCtx(), X_PA_Query.Table_Name, "IsActive = 'Y'", null)
			.setClient_ID()
			.list();		
			for (X_PA_Query query:querys) {
				try {
					String querycontent = query.getContent();
					SAXBuilder builder = new SAXBuilder();
					InputStream stream = new ByteArrayInputStream(querycontent.getBytes("UTF-8"));
					Document doc = builder.build(stream);
					Element e = doc.getRootElement();
					e.setAttribute(X_PA_Query.COLUMNNAME_PA_Query_ID, String.valueOf(query.getPA_Query_ID()));
					XMLOutputter xmOut = new XMLOutputter(Format.getPrettyFormat());
					xmOut.setOmitDeclaration(true);
					querycontent = xmOut.outputString(doc);
					xml += querycontent;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			xml += "</querys>";
			result += xml;			
			PrintWriter out = response.getWriter();
			response.setHeader("Content-Type", "text/xml");
			out.write(result);
			out.close();		
		} else if (type.isPresent() && type.get().equals("update")) {
			String queryid = request.getParameter("query");
			X_PA_Query query = new Query(Env.getCtx(), X_PA_Query.Table_Name, "PA_Query_ID = ?", null)
			.setParameters(Integer.valueOf(queryid))
			.first();		
			if (query != null) {
				try {
					String xml = query.getContent();
					SAXBuilder builder = new SAXBuilder();
					InputStream stream = new ByteArrayInputStream(xml.getBytes("UTF-8"));
					Document doc = builder.build(stream);
					Element e = doc.getRootElement();
					e.setAttribute(X_PA_Query.COLUMNNAME_PA_Query_ID, String.valueOf(query.getPA_Query_ID()));
					XMLOutputter xmOut = new XMLOutputter(Format.getPrettyFormat());
					xmOut.setOmitDeclaration(true);					
					result += xmOut.outputString(doc);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			PrintWriter out = response.getWriter();
			response.setHeader("Content-Type", "text/xml");
			out.write(result);
			out.close();					
		}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}
}
