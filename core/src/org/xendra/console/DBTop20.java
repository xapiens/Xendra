package org.xendra.console;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Arrays;

import org.compiere.util.DB;

import com.googlecode.lanterna.TextColor;
import com.googlecode.lanterna.gui2.BasicWindow;
import com.googlecode.lanterna.gui2.Borders;
import com.googlecode.lanterna.gui2.Button;
import com.googlecode.lanterna.gui2.DefaultWindowManager;
import com.googlecode.lanterna.gui2.Direction;
import com.googlecode.lanterna.gui2.EmptySpace;
import com.googlecode.lanterna.gui2.LinearLayout;
import com.googlecode.lanterna.gui2.MultiWindowTextGUI;
import com.googlecode.lanterna.gui2.Panel;
import com.googlecode.lanterna.gui2.Window;
import com.googlecode.lanterna.gui2.table.Table;
import com.googlecode.lanterna.screen.Screen;

public class DBTop20 {
	Screen screen;
	public DBTop20(Screen screen) {
		this.screen = screen;
		setup();		
	}
	private void setup() {
		final MultiWindowTextGUI gui = new MultiWindowTextGUI(screen, new DefaultWindowManager(), new EmptySpace(TextColor.ANSI.DEFAULT));
		final BasicWindow window = new BasicWindow();
		final Table<String> top20 = new Table<String>("schema","name","total","data", "external");
		StringBuilder sql = new StringBuilder("select schemaname as table_schema, relname as table_name,")		
		.append("pg_size_pretty(pg_total_relation_size(relid)) as total_size,")
		.append("pg_size_pretty(pg_relation_size(relid)) as data_size,")
		.append("pg_size_pretty(pg_total_relation_size(relid) - pg_relation_size(relid))")
		.append("  as external_size ")
		.append(" from pg_catalog.pg_statio_user_tables ")
		.append(" order by pg_total_relation_size(relid) desc,pg_relation_size(relid) desc ")
        .append(" limit 20");
		PreparedStatement pstmt = DB.prepareStatement(sql.toString(), null);
		try {				
			ResultSet rs = pstmt.executeQuery();			
			while (rs.next())
			{
				String schema = rs.getString("table_schema");
				String name = rs.getString("table_name");
				String size = rs.getString("total_size");
				String data = rs.getString("data_size");
				String ext_size = rs.getString("external_size");
				top20.getTableModel().addRow(schema, name, size, data, ext_size);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		Button accept = new Button("Ok", new Runnable() {
			@Override
			public void run() {
				window.close();
			}
		});
		Panel panelinfo = new Panel();		
		panelinfo.setLayoutManager(new LinearLayout(Direction.VERTICAL));
		panelinfo.addComponent(top20);		
		panelinfo.addComponent(accept);
		window.setHints(Arrays.asList(Window.Hint.FULL_SCREEN));
		window.setComponent(panelinfo.withBorder(Borders.singleLine("info")));
		gui.addWindowAndWait(window);						
	}
}
