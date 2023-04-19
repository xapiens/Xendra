package org.xendra.console;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import org.compiere.util.DB;
import org.compiere.util.Util;

import com.googlecode.lanterna.TextColor;
import com.googlecode.lanterna.gui2.AnimatedLabel;
import com.googlecode.lanterna.gui2.BasicWindow;
import com.googlecode.lanterna.gui2.Borders;
import com.googlecode.lanterna.gui2.Button;
import com.googlecode.lanterna.gui2.DefaultWindowManager;
import com.googlecode.lanterna.gui2.Direction;
import com.googlecode.lanterna.gui2.EmptySpace;
import com.googlecode.lanterna.gui2.GridLayout;
import com.googlecode.lanterna.gui2.LinearLayout;
import com.googlecode.lanterna.gui2.MultiWindowTextGUI;
import com.googlecode.lanterna.gui2.Panel;
import com.googlecode.lanterna.gui2.Window;
import com.googlecode.lanterna.gui2.table.Table;
import com.googlecode.lanterna.screen.Screen;

public class DBTuning {
	HashMap<String, String> tundb = new HashMap<String, String>();
	Screen screen;	
	public DBTuning(Screen screen) {
		this.screen = screen;
		setup();		
	}
	private String bgwriter() {
		String sql = "with test as (";
		sql+="		SELECT  now()-pg_postmaster_start_time()    \"Uptime\",";
		sql+="		now()-stats_reset     \"Since stats reset\","; 
		sql+="		round(100.0*checkpoints_req/total_checkpoints,1)    \"Forced checkpoint ratio (%)\","; 
		sql+="		round(np.min_since_reset/total_checkpoints,2)                       \"Minutes between checkpoints\","; 
		sql+="		round(checkpoint_write_time::numeric/(total_checkpoints*1000),2)    \"Average write time per checkpoint (s)\","; 
		sql+="		round(checkpoint_sync_time::numeric/(total_checkpoints*1000),2)     \"Average sync time per checkpoint (s)\", ";
		sql+="		round(total_buffers/np.mp,1)                                        \"Total MB written\", ";
		sql+="		round(buffers_checkpoint/(np.mp*total_checkpoints),2)               \"MB per checkpoint\", ";
		sql+="		round(buffers_checkpoint/(np.mp*np.min_since_reset*60),2)           \"Checkpoint MBps\", ";
		sql+="		round(buffers_clean/(np.mp*np.min_since_reset*60),2)                \"Bgwriter MBps\", ";
		sql+="		round(buffers_backend/(np.mp*np.min_since_reset*60),2)              \"Backend MBps\", ";
		sql+="		round(total_buffers/(np.mp*np.min_since_reset*60),2)                \"Total MBps\", ";
		sql+="		round(1.0*buffers_alloc/total_buffers,3)                            \"New buffer allocation ratio\","; 
		sql+="			round(100.0*buffers_checkpoint/total_buffers,1)                     \"Clean by checkpoints (%)\",";
		sql+="			round(100.0*buffers_clean/total_buffers,1)                          \"Clean by bgwriter (%)\", ";
		sql+="			round(100.0*buffers_backend/total_buffers,1)                        \"Clean by backends (%)\", ";
		sql+="			round(100.0*maxwritten_clean/(np.min_since_reset*60000/np.bgwr_delay),2)            \"Bgwriter halt-only length (buffers)\","; 
		sql+="			coalesce(round(100.0*maxwritten_clean/(nullif(buffers_clean,0)/np.bgwr_maxp),2),0)  \"Bgwriter halt ratio (%)\",";
		sql+="			'--------------------------------------'         \"--------------------------------------\", ";
		sql+="			bgstats.* FROM (SELECT bg.*, checkpoints_timed + checkpoints_req total_checkpoints, buffers_checkpoint + buffers_clean + buffers_backend total_buffers, pg_postmaster_start_time() startup, current_setting('checkpoint_timeout') checkpoint_timeout, current_setting('max_wal_size') max_wal_size, current_setting('checkpoint_completion_target') checkpoint_completion_target, current_setting('bgwriter_delay') bgwriter_delay, current_setting('bgwriter_lru_maxpages') bgwriter_lru_maxpages, current_setting('bgwriter_lru_multiplier') bgwriter_lru_multiplier FROM pg_stat_bgwriter bg) bgstats, (SELECT round(extract('epoch' from now() - stats_reset)/60)::numeric min_since_reset, (1024 * 1024 / block.setting::numeric) mp, delay.setting::numeric bgwr_delay, lru.setting::numeric bgwr_maxp FROM pg_stat_bgwriter bg JOIN pg_settings lru   ON lru.name = 'bgwriter_lru_maxpages' JOIN pg_settings delay ON delay.name = 'bgwriter_delay' JOIN pg_settings block ON block.name = 'block_size') np ";
		sql+="		)";
		sql+="		select 'Uptime'::text as title, \"Uptime\"::text from test";
		sql+="		UNION ALL";
		sql+="		select 'Since stats reset'::text as title, \"Since stats reset\"::text from test";
		sql+="		UNION ALL";
		sql+="		select 'Forced checkpoint ratio (%)'::text as title, \"Forced checkpoint ratio (%)\"::text  from test";
		sql+="		UNION ALL";
		sql+="		SELECT 'Minutes between checkpoints'::text as title, \"Minutes between checkpoints\"::text  from test";
		sql+="		UNION ALL ";
		sql+="		SELECT 'Average write time per checkpoint (s)'::text as title, \"Average write time per checkpoint (s)\"::text from test";
		sql+="		UNION ALL";
		sql+="		SELECT 'Average sync time per checkpoint (s)'::text as title, \"Average sync time per checkpoint (s)\"::text from test";
		sql+="		UNION ALL";
		sql+="		SELECT 'Total MB written'::text as title, \"Total MB written\"::text from test";
		sql+="		UNION ALL";
		sql+="		SELECT 'MB per checkpoint'::text as title, \"MB per checkpoint\"::text from test";
		sql+="		UNION ALL";
		sql+="		SELECT 'Checkpoint MBps'::text as title, \"Checkpoint MBps\"::text from test";
		sql+="		UNION ALL";
		sql+="		SELECT 'Bgwriter MBps'::text as title, \"Bgwriter MBps\"::text from test";
		sql+="		UNION ALL";
		sql+="		SELECT 'Backend MBps'::text as title, \"Backend MBps\"::text from test";
		sql+="		UNION ALL";
		sql+="		SELECT 'Total MBps'::text as title, \"Total MBps\"::text from test";
		sql+="		UNION ALL";
		sql+="		SELECT 'New buffer allocation ratio'::text as title, \"New buffer allocation ratio\"::text from test";
		sql+="		UNION ALL";
		sql+="		SELECT 'Clean by checkpoints (%)'::text as title, \"Clean by checkpoints (%)\"::text from test";
		sql+="		UNION ALL";
		sql+="		SELECT 'Clean by bgwriter (%)'::text as title, \"Clean by bgwriter (%)\"::text from test";
		sql+="		UNION ALL";
		sql+="		SELECT 'Clean by backends (%)'::Text as title, \"Clean by backends (%)\"::text from test";
		sql+="		UNION ALL";
		sql+="		SELECT 'Bgwriter halt-only length (buffers)'::text as title, \"Bgwriter halt-only length (buffers)\"::text from test";
		sql+="		UNION ALL";
		sql+="		SELECT 'Bgwriter halt ratio (%)'::text as title, \"Bgwriter halt ratio (%)\"::text from test";
		sql+="		UNION ALL";
		sql+="		SELECT 'checkpoints_req'::text as title, checkpoints_req::text from test";
		sql+="		UNION ALL";
		sql+="		SELECT 'checkpoints_timed'::text as title, checkpoints_timed::text from test";
		sql+="		UNION ALL";
		sql+="		SELECT 'checkpoint_write_time'::text as title, checkpoint_write_time::text from test";
		sql+="		UNION ALL";
		sql+="		SELECT 'checkpoint_sync_time'::text as title, checkpoint_sync_time::text from test";
		sql+="		UNION ALL";
		sql+="		SELECT 'buffers_checkpoint'::text as title, buffers_checkpoint::text from test";
		sql+="		UNION ALL";
		sql+="		SELECT 'buffers_clean'::text as title, buffers_clean::text from test";
		sql+="		UNION ALL";
		sql+="		SELECT 'maxwritten_clean'::text as title, maxwritten_clean::text from test";
		sql+="		UNION ALL";
		sql+="		SELECT 'buffers_backend'::text as title, buffers_backend::text from test";
		sql+="		UNION ALL";
		sql+="		SELECT 'buffers_backend_fsync'::text as title, buffers_backend_fsync::text from test";
		sql+="      UNION ALL";
		sql+="      SELECT 'buffers_alloc'::text as title, buffers_alloc::text from test";
		sql+="		UNION ALL";
		sql+="		SELECT 'stats_reset'::text as title, stats_reset::text from test";
		sql+="		UNION ALL";
		sql+="		SELECT 'total_checkpoints'::text as title, total_checkpoints::text from test";
		sql+="		UNION ALL";
		sql+="		SELECT 'total_buffers'::text as title, total_buffers::text from test";
		sql+="		UNION ALL";
		sql+="		SELECT 'startup'::text as title, startup::text from test";
		sql+="		UNION ALL";
		sql+="		SELECT 'checkpoint_timeout'::text as title, checkpoint_timeout::text from test";
		sql+="		UNION ALL";
		sql+="		SELECT 'max_wal_size'::text, max_wal_size::text from test";
		sql+="		UNION ALL";
		sql+="		SELECT 'checkpoint_completion_target'::text, checkpoint_completion_target::text from test";
		sql+="		UNION ALL";
		sql+="		SELECT 'bgwriter_delay'::text, bgwriter_delay::text from test";
		sql+="		UNION ALL";
		sql+="		SELECT 'bgwriter_lru_maxpages'::text, bgwriter_lru_maxpages::text from test";
		sql+="		UNION ALL";
		sql+="		SELECT 'bgwriter_lru_multiplier'::text, bgwriter_lru_multiplier::text from test";		
        return sql;
     }
	private String getsequential() {
		String sql = "SELECT schemaname, relname, seq_scan, seq_tup_read, ";
		sql += " seq_tup_read / seq_scan as avg_seq_tup_read FROM pg_stat_all_tables ";
		sql += " WHERE seq_scan > 0	ORDER BY 5 DESC LIMIT 5";	 
		return sql;
	}
	private String getLongquerys() {
		String sql = "SELECT now() - query_start AS running_for, query";
		sql += " FROM pg_stat_activity WHERE state = 'active'" ;
		sql += " ORDER BY 1 DESC LIMIT 5";		
		return sql;
	}
	private void setup() {
		final Table<String> sequential = new Table<String>("schemaname","table","seqscan","seq_tup_read","avg_seq_tup");
		buildrows(getsequential(), sequential);
		final Table<String> longquerys = new Table<String>("running_for","query");
		buildrows(getLongquerys(), longquerys);
		Double dur = DBmonitor.get().get_settingD("log_min_duration_statement");
		final Table<String> bgwriter = new Table<String>("parameter","value");
		buildrows(bgwriter(), bgwriter);
		bgwriter.getTableModel().addRow("log_min_duration_statement ",String.valueOf(dur));
		bgwriter.getTableModel().addRow("Shared buffers", Util.format_size(DBmonitor.get().getShared_buffers()));
		List<String> track_activities = DBmonitor.get().get_setting("track_activities");
		bgwriter.getTableModel().addRow("track activities", track_activities.get(0));
		bgwriter.getTableModel().addRow("log_checkpoints", DBmonitor.get().getLog_Checkpoints());
		// advice
		final Table<String> advice = new Table<String>("advice");
		String maxwritten_clean = tundb.get("maxwritten_clean");
		String bgwriter_lru_maxpages = tundb.get("bgwriter_lru_maxpages");
		String buffers_clean = tundb.get("buffers_clean");
		String buffers_backend = tundb.get("buffers_backend");
		String buffers_backend_fsync = tundb.get("buffers_backend_fsync");
		String bgwriter_lru_multiplier = tundb.get("bgwriter_lru_multiplier");
		String bgwriter_delay = tundb.get("bgwriter_delay");
		String checkpoint_timeout = tundb.get("checkpoint_timeout");
		String max_wal_size = tundb.get("max_wal_size");
		advice.getTableModel().addRow("Work mem settings");
		advice.getTableModel().addRow(String.format("configured work mem: %s", Util.format_size(DBmonitor.get().getWork_mem())));			
		advice.getTableModel().addRow(String.format("average ratio of work_mem buffers by connection of %s%% ", DBmonitor.get().getWork_mem_per_connection_percent()));
		advice.getTableModel().addRow("(use --wmp to change it)");
		advice.getTableModel().addRow(String.format("total work_mem (per connection): %s", Util.format_size(DBmonitor.get().getWork_mem()*DBmonitor.get().getWork_mem_per_connection_percent()/100)));
		advice.getTableModel().addRow("Checkpoint settings");
		advice.getTableModel().addRow(String.format("A checkpoint started every checkpoint_timeout=%s, or if max_wal_size=%s is about to be exceeded, whichever comes first",checkpoint_timeout,max_wal_size));
		advice.getTableModel().addRow("Bgwriter settings");
		advice.getTableModel().addRow(String.format("maxwritten_clean=%s show many times bgwriter stopped because maxpages was exceeded",maxwritten_clean));
		advice.getTableModel().addRow(String.format("when you see high values there, you should increase bgwriter_lru_maxpages=%s.",bgwriter_lru_maxpages));
		advice.getTableModel().addRow(String.format("buffers_clean=%s should be greater than buffers_backend=%s.",buffers_clean,buffers_backend));
		advice.getTableModel().addRow(String.format("Otherwise, you should increase bgwriter_lru_multiplier=%s and decrease bgwriter_delay=%s.",bgwriter_lru_multiplier,bgwriter_delay));		
		advice.getTableModel().addRow(String.format("also may be a sign that you have insufficient shared buffers "));
		advice.getTableModel().addRow(String.format("and hot part of your data don’t fit into shared buffers and forced to travel between RAM and disks."));				
		advice.getTableModel().addRow(String.format("buffers_backend_fsync=%s Any values above zero point to problems with storage.",buffers_backend_fsync));
		final MultiWindowTextGUI gui = new MultiWindowTextGUI(screen, new DefaultWindowManager(), new EmptySpace(TextColor.ANSI.DEFAULT));
		final BasicWindow window = new BasicWindow();
		window.setHints(Arrays.asList(Window.Hint.FULL_SCREEN));
		Panel mainPanel = new Panel();			
		mainPanel.setLayoutManager(new LinearLayout(Direction.VERTICAL));
		mainPanel.addComponent(sequential);
		mainPanel.addComponent(longquerys);		
		mainPanel.addComponent(bgwriter);
		mainPanel.addComponent(advice);	
		Button accept = new Button("Ok", new Runnable() {
			@Override
			public void run() {
				window.close();
			}
		});
		//mainPanel.addComponent(AnimatedLabel.createClassicSpinningLine());
		mainPanel.addComponent(accept);
		window.setComponent(mainPanel.withBorder(Borders.singleLine("Hints")));
		gui.addWindowAndWait(window);				
	}
	private void buildrows(String sql, Table<String> table) {		
		PreparedStatement pstmt = DB.prepareStatement(sql, null);
		try {
			ResultSet rs = pstmt.executeQuery();
			ResultSetMetaData rsmd = rs.getMetaData();
			int column = 1;
			int column_count = rsmd.getColumnCount();			
			while (rs.next()) {
				List<String> values = new ArrayList<String>();
				while (column <= column_count) {
					String value = rs.getString(column);
					values.add(value);
					column++;
				}
				if (column == 3) {
					tundb.put(values.get(0), values.get(1));
				}
				column = 1;				
				table.getTableModel().addRow(values);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}						
	}
}
