package org.xendra.xendrian;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.jsqlparser.parser.CCJSqlParserUtil;
import net.sf.jsqlparser.statement.select.Select;

import org.compiere.util.DB;
import org.compiere.util.WebEnv;

public class Csvservlet extends HttpServlet {
	public Csvservlet() {
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
		String type = "";
		Integer productid = 0;
		Integer year = 0;
		while (parameterNames.hasMoreElements()) {
			String paramName = parameterNames.nextElement();
			String[] paramValues = request.getParameterValues(paramName);
			for (int i = 0; i < paramValues.length; i++) {
				String paramValue = paramValues[i];
				System.out.println(paramValue);
				if (paramName.equals("product")) {
					productid = Integer.valueOf(paramValue);
				} else if (paramName.equals("type")) {
					type = paramValue;
				} else if (paramName.equals("year")) {
					year = Integer.valueOf(paramValue);
				}				
			}						
		}			
		try {
			String filename = "new.csv";
			//String mimeType = new MimetypesFileTypeMap().getContentType( filename );
			if (type.equals("demand")) {
				createdemand(productid);
			} else if (type.equals("demandyear")) {
				createdemandyear(productid, year);
			}
			File f = new File(filename);
			OutputStream out = response.getOutputStream();
			FileInputStream in = new FileInputStream(filename);
			byte[] buffer = new byte[4096];
			int length;
			while ((length = in.read(buffer)) > 0) {
				out.write(buffer, 0, length);
			}
			in.close();
			out.flush();									
		} catch (Exception e) {
			e.printStackTrace();
		}
		//select movementdate, sum(qtysource) over (order by movementdate,movementtype,record_id) 
		//from m_carding where m_product_id = 2006611 and m_locator_id = 1000156 order by movementdate		
	}
	private void createdemandyear(Integer productid, Integer year) {		
		try {
			Select select = (Select) CCJSqlParserUtil.parse("select abs(sum(qtysource)) from m_carding where m_product_id = ? and m_locator_id = 1000156 and date_part('year', movementdate) = ? AND movementtype = 'C-'");			
			BigDecimal demand = DB.getSQLValueBD(null, select.toString(), productid, year);
			FileWriter csvWriter = new FileWriter("new.csv");
			csvWriter.append("DEMAND");
			csvWriter.append("\n");
			csvWriter.append(demand.toString());
			csvWriter.append("\n");
			csvWriter.append(demand.toString());
			csvWriter.append("\n");			
			csvWriter.flush();
			csvWriter.close();			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private void createdemand(Integer productid) {
		try {
			Select select = (Select) CCJSqlParserUtil.parse("select movementdate, sum(qtysource) over (order by movementdate,movementtype,record_id) from m_carding where m_product_id = ? and m_locator_id = 1000156 order by movementdate");
			PreparedStatement pstmt = DB.prepareStatement (select.toString(), null);				
			pstmt.setInt (1, productid);
			ResultSet rs = pstmt.executeQuery ();
			if (rs.next()) {					
				FileWriter csvWriter = new FileWriter("new.csv");
				csvWriter.append("DATE");
				csvWriter.append(",");
				csvWriter.append("VALUE");
				csvWriter.append("\n");
				while (rs.next()) {
					csvWriter.append(rs.getString(1));
					csvWriter.append(",");
					csvWriter.append(rs.getString(2));
					csvWriter.append("\n");
				}
				csvWriter.flush();
				csvWriter.close();
			}		
		} catch (Exception e) {
			e.printStackTrace();
		}												
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}
}
