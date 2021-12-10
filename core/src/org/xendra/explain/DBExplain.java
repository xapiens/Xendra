package org.xendra.explain;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.math.BigDecimal;
import java.nio.charset.StandardCharsets;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.compiere.util.DB;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.Namespace;
import org.jdom.input.SAXBuilder;

import com.googlecode.lanterna.gui2.MultiWindowTextGUI;
import com.googlecode.lanterna.gui2.dialogs.MessageDialogBuilder;
import com.googlecode.lanterna.gui2.dialogs.MessageDialogButton;

public class DBExplain {
	Element plan;
	IMetrics last;
	String sql;
	MultiWindowTextGUI gui;
	static Namespace ns = Namespace.getNamespace("http://www.postgresql.org/2009/explain");
	public DBExplain(MultiWindowTextGUI gui, String sql) {
		this.gui = gui;
		this.sql = sql;
	}
	
	public String sanitazeSQL() {		
		String error = "";
		PreparedStatement pstmt = DB.prepareStatement(sql, null);
		try {				
			ResultSet rs = pstmt.executeQuery();
			rs.close();
			pstmt.close();
		} catch (Exception e) {
			error = e.getMessage();
		}						
		return error;
	}
	
	public List<String> explain() {
		List<String> tunings = new ArrayList<String>();
		String explainsql = String.format("explain (FORMAT XML) %s", sql);				
		PreparedStatement pstmt = DB.prepareStatement(explainsql, null);
		try {				
			ResultSet rs = pstmt.executeQuery();			
			if (rs.next())
			{
				String id = rs.getString(1);
				System.out.println(id);
				InputStream is = new ByteArrayInputStream(id.getBytes(StandardCharsets.UTF_8));
				SAXBuilder builder = new SAXBuilder();
				builder.setIgnoringElementContentWhitespace(true);
				builder.setValidation(false);
				Document doc = null;
				try {
					doc = builder.build(is);					
					Element root = doc.getRootElement();					
					Element query = root.getChild("Query",ns);
					plan = query.getChild("Plan",ns);
					IMetrics metrics = parseplan(plan);
					boolean goahead = true;
					BigDecimal plan_rows = metrics.getPlan_Rows();
					if (plan_rows.compareTo(BigDecimal.TEN) < 0) {										
						MessageDialogButton answer = new MessageDialogBuilder()
						.setTitle("Warning")
						.setText(String.format("Este Plan retorna %s registro(s) \n se recomienda usar con resultados mas extensos\n desea continuar?", plan_rows.intValue()))
						.addButton(MessageDialogButton.Yes)			
						.addButton(MessageDialogButton.No)
						.build()
						.showDialog(gui);
						if (answer.ordinal() == MessageDialogButton.No.ordinal()) {
							goahead = false;
						}											
					}
					if (goahead) {
						tunings = metrics.tuning();
					}					
				} catch (Exception e) {
					e.printStackTrace();
				}						
			}			
		} catch (Exception e) {
			e.printStackTrace();
		}					
		return tunings; 
	}
	
	public static IMetrics parseplan(Element plan) {
		IMetrics ret = null;
		Element nodetype = plan.getChild("Node-Type", ns);
		if (nodetype.getValue().equals("Limit")) {
			Limit limit = new Limit(plan);
			ret = limit;
		} else if (nodetype.getValue().equals("Nested Loop")) {
			NestedLoop nl = new NestedLoop(plan);
			ret = nl;
		} else if (nodetype.getValue().equals("Merge Join")) {
			MergeJoin mj = new MergeJoin(plan);
			ret = mj;
		} else if (nodetype.getValue().equals("Sort")) {
			Sort sort = new Sort(plan);
			ret = sort;
		} else if (nodetype.getValue().equals("Seq Scan")) {
			SeqScan seqscan = new SeqScan(plan);
			ret = seqscan;
		}
		return ret;
	}
}
