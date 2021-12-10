package org.xendra.console;

import java.math.BigDecimal;
import java.util.Arrays;

import org.compiere.util.Util;

import com.googlecode.lanterna.TextColor;
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
import com.googlecode.lanterna.gui2.ProgressBar;
import com.googlecode.lanterna.gui2.Window;
import com.googlecode.lanterna.gui2.table.Table;
import com.googlecode.lanterna.screen.Screen;

public class DBInfo {
	Screen screen;
	public DBInfo(Screen screen) {
		this.screen = screen;
		setup();		
	}
	private void setup() {
		final Table<String> tablehint = new Table<String>("hints");
		//
		tablehint.getTableModel().addRow(String.format("TOTAL %s USED %s", 
				Util.format_size(DBmonitor.get().getTotalMemory()), 
				Util.format_size(DBmonitor.get().getUsedMemory())));
		tablehint.getTableModel().addRow(String.format("FREE %s SHARED %s", 
				Util.format_size(DBmonitor.get().getFreeMemory()), 
				Util.format_size(DBmonitor.get().getSharedMemory())));
		tablehint.getTableModel().addRow(String.format("BUFFER %s CACHED %s", 
				Util.format_size(DBmonitor.get().getBufferMemory()), 
				Util.format_size(DBmonitor.get().getCachedMemory())));												
		//}
		if (DBmonitor.get().getOvercommit_memory() != 2) {
			tablehint.getTableModel().addRow("Memory overcommitment is allowed");				
			tablehint.getTableModel().addRow("set vm.overcommit_memory=2 in /etc/sysctl.conf");
			tablehint.getTableModel().addRow("Memory overcommitment is allowed in the system");
			tablehint.getTableModel().addRow("this can lead to OOM Killer killing some Postgresql process");
			tablehint.getTableModel().addRow("which call cause a PostgreSQL restart (crash recovery)");
		}
		//Integer overcommit_ratio = Integer.valueOf(ajua2);			
		tablehint.getTableModel().addRow(String.format("sysctl vm.overcommit_ratio %s", DBmonitor.get().getOvercommit_ratio()));
		if (DBmonitor.get().getOvercommit_ratio() <= 50) {				
			tablehint.getTableModel().addRow("vm.overcommit_ratio is too small");
			tablehint.getTableModel().addRow("the limit is $overcommit_ratio*RAM+SWAP for applications");
		} else {
			tablehint.getTableModel().addRow(String.format("vm.overcommit_ratio = %s", DBmonitor.get().getOvercommit_ratio()));
			tablehint.getTableModel().addRow("the value is ok ($overcommit_ratio*RAM+SWAP for apps)");
		}
		//String hipervisor = "";
		if (DBmonitor.get().getHipervisor().length() >0) {
			tablehint.getTableModel().addRow(String.format("running in %s", DBmonitor.get().getHipervisor()));
		} else {
			tablehint.getTableModel().addRow("running in physical machine");
		}
		tablehint.getTableModel().addRow(String.format("Version : %s", DBmonitor.get().getServer_version()));
		//if (settings.containsKey("server_version")) {
		//Vector vector = (Vector) settings.get("server_version");
		//String setting = (String) vector.firstElement();
		//System.out.println(String.format("Version : %s", setting));
		//}
		//
		if (DBmonitor.get().getUpdatime().doubleValue() < DBmonitor.get().getDay()) {			
			tablehint.getTableModel().addRow("Uptime is less that 1 day");
		}

		if (DBmonitor.get().getExtensions().contains("pg_stat_statements")) {			
			tablehint.getTableModel().addRow("Extension pg_stat_statements is enabled");
		} else {
			tablehint.getTableModel().addRow("enable pg_stat_statements to collect statistics");
		}
		
		//System.out.println(String.format("max connections: %s", max_connections));
		tablehint.getTableModel().addRow(String.format("max connections: %s", DBmonitor.get().getMax_connections()));
		//System.out.println(String.format("current used connections: %s (%s%%)", current_connections, current_connections_percent));
		tablehint.getTableModel().addRow(String.format("current used connections: %s (%s%%)", DBmonitor.get().getCurrent_connections(), DBmonitor.get().getCurrent_connections_percent()));
		if (DBmonitor.get().getCurrent_connections_percent() > 70) {
			//System.out.println("using more 70%. Increase max_connections before saturation of connection slots");
			tablehint.getTableModel().addRow("using more 70%. Increase max_connections before saturation of connection slots");
		} else if (DBmonitor.get().getCurrent_connections_percent() > 90) {
			//System.out.println("using more 90%. Increase max_connections before saturation of connection slots");
			tablehint.getTableModel().addRow("using more 90%. Increase max_connections before saturation of connection slots");
		} 
		//if (settings.containsKey("superuser_reserved_connections")) {
		//Vector vector = (Vector) settings.get("superuser_reserved_connections");
		//setting = (String) vector.firstElement();
		//int superuser_reserved_connections = Integer.valueOf(setting);
		//Double 
		//int superuser_reserved_connections_ratio = (int) (superuser_reserved_connections * 100 / max_connections);
		if (DBmonitor.get().getSuperuser_reserved_connections() == 0) {
			tablehint.getTableModel().addRow("No connection is reserved for superuser","add values to superuser_reserved_connections");
		} else {
			tablehint.getTableModel().addRow(String.format("%s (%s%%) connections are reserved for superuser",DBmonitor.get().getSuperuser_reserved_connections(), DBmonitor.get().getSuperuser_reserved_connections_ratio()));
		}
		if (DBmonitor.get().getSuperuser_reserved_connections_ratio() > 20) {
			tablehint.getTableModel().addRow(String.format("%s%% of conns are reserved for super user, this is too much",DBmonitor.get().getSuperuser_reserved_connections_ratio()));
		}
		tablehint.getTableModel().addRow(String.format("Average connection age: %s", DBmonitor.get().format_epoch_to_time(DBmonitor.get().getConnection_age_average())));
		int age_average = DBmonitor.get().getConnection_age_average().setScale(2, BigDecimal.ROUND_HALF_UP).intValue(); 
		if ( age_average < 1 * DBmonitor.get().getMin()) {
			tablehint.getTableModel().addRow("Average connection age is less than 1 minute");
			tablehint.getTableModel().addRow(" use a connection pooler to limit new connection/seconds");
		} else if (age_average < 10 * DBmonitor.get().getMin()) {
			tablehint.getTableModel().addRow("Average connection age is less than 10 minute");
			tablehint.getTableModel().addRow("use a connection pooler to limit new connection/seconds");
		}
		// pre auth delay			
		if (DBmonitor.get().getPre_auth_delay()  > 0) {
			tablehint.getTableModel().addRow(String.format("pre_auth_delay=%s: this is a developer feature ", DBmonitor.get().getPre_auth_delay()));
			tablehint.getTableModel().addRow(String.format("for debugging and decrease connection delay of %s seconds", DBmonitor.get().getPre_auth_delay()));
		}
		// post auth delay			
		if (DBmonitor.get().getPost_auth_delay()  > 0) {
			tablehint.getTableModel().addRow(String.format("post_auth_delay=%s: this is a developer feature ",DBmonitor.get().getPost_auth_delay()));
			tablehint.getTableModel().addRow(String.format("for debugging and decrease connection delay of %s seconds", DBmonitor.get().getPost_auth_delay(), DBmonitor.get().getPost_auth_delay()));
		}
		tablehint.getTableModel().addRow(String.format("configured work mem: %s", Util.format_size(DBmonitor.get().getWork_mem())));			
		tablehint.getTableModel().addRow(String.format("average ratio of work_mem buffers by connection of %s%% ", DBmonitor.get().getWork_mem_per_connection_percent()));
		tablehint.getTableModel().addRow("(use --wmp to change it)");
		tablehint.getTableModel().addRow(String.format("total work_mem (per connection): %s", Util.format_size(DBmonitor.get().getWork_mem()*DBmonitor.get().getWork_mem_per_connection_percent()/100)));
		tablehint.getTableModel().addRow(String.format("shared buffers: %s", Util.format_size(DBmonitor.get().getShared_buffers())));
		tablehint.getTableModel().addRow(String.format("Track activity reserved size: %s", Util.format_size(DBmonitor.get().getTrack_activity_size())));			
		if (DBmonitor.get().getMaintenance_work_mem() <= 64*1024*1024) {				
			tablehint.getTableModel().addRow(String.format("maintenance_work_mem (%s) ",Util.format_size(DBmonitor.get().getMaintenance_work_mem())));
			tablehint.getTableModel().addRow(String.format("is less or equal default value (%s).",Util.format_size((double) (64*1024*1024))));
			tablehint.getTableModel().addRow(String.format("Increase it to reduce maintenance task time"));
		} else {
			tablehint.getTableModel().addRow(String.format("maintenance_work_mem %s", Util.format_size(DBmonitor.get().getMaintenance_work_mem())));
		}						
		
		tablehint.getTableModel().addRow("Max Memory usage:");
		tablehint.getTableModel().addRow(String.format(" shared buffers %s",Util.format_size(DBmonitor.get().getShared_buffers())));
		tablehint.getTableModel().addRow("+max_connections* work_mem* average_work_mem_buffers_per_connection"); 		
		tablehint.getTableModel().addRow(String.format("(%s * %s * %s / 100 = %s)",DBmonitor.get().getMax_connections(),Util.format_size(DBmonitor.get().getWork_mem()), DBmonitor.get().getWork_mem_per_connection_percent(), Util.format_size(DBmonitor.get().getMax_connections()*DBmonitor.get().getWork_mem()*DBmonitor.get().getWork_mem_per_connection_percent()/100)));			
		tablehint.getTableModel().addRow("+autovacuum_max_workers * maintenance_work_mem");		
		tablehint.getTableModel().addRow(String.format(" ( %s * %s = %s)",DBmonitor.get().getAutovacuum_max_workers(), Util.format_size(DBmonitor.get().getMaintenance_work_mem()), Util.format_size(DBmonitor.get().getAutovacuum_max_workers()*DBmonitor.get().getMaintenance_work_mem())));
		tablehint.getTableModel().addRow(String.format("+track activity size (%s)", Util.format_size(DBmonitor.get().getTrack_activity_size())));
		tablehint.getTableModel().addRow(String.format("=%s", Util.format_size(DBmonitor.get().getMax_memory())));
		tablehint.getTableModel().addRow(String.format("effective_cache_size: %s", Util.format_size(DBmonitor.get().getEffective_cache_size())));
		tablehint.getTableModel().addRow(String.format("size of all databases: %s", Util.format_size(DBmonitor.get().getAll_database_size().doubleValue())),"");
		if (DBmonitor.get().getShared_buffers_usage()< 0.7) {
			tablehint.getTableModel().addRow("shared buffer is too big for the total databases size, memory is lost");
		}
		tablehint.getTableModel().addRow(String.format("PostgreSQL maximum memory usage:  %.2f%%", DBmonitor.get().getPercent_postgresql_max_memory()));
		if (DBmonitor.get().getPercent_postgresql_max_memory() > 100) {
			tablehint.getTableModel().addRow("Max possible memory usage more than system total RAM.");
			tablehint.getTableModel().addRow("Add more RAM or reduce PostgreSQL memory");
		} else if (DBmonitor.get().getPercent_postgresql_max_memory() > 80) {
			tablehint.getTableModel().addRow("Max possible memory usage is more than 80% of the RAM");
		} else if (DBmonitor.get().getPercent_postgresql_max_memory() < 60) {
			tablehint.getTableModel().addRow("Max possible memory usage is less than 60% of the RAM.");
			tablehint.getTableModel().addRow("On a dedicated host you can increase buffers");
		} else {
			tablehint.getTableModel().addRow("Max possible memory usage for PostgreSQL is good");
		}
		if (DBmonitor.get().getTrack_activity_ratio() > 1d) {
			tablehint.getTableModel().addRow("Track activity reserved size is more than 1% of your RAM");
			tablehint.getTableModel().addRow("Your track activity reserved size is too high. ");
			tablehint.getTableModel().addRow("Reduce track_activity_query_size and/or max_connections");
		}
		if (DBmonitor.get().getPercent_mem_usage() < 60 && DBmonitor.get().getShared_buffers_usage() > 1) {
			tablehint.getTableModel().addRow("Increase shared buffers/effective cache_size to use more memory");
		} else {
			tablehint.getTableModel().addRow("the sum of max_memory and effective_cache_size is too high");
			tablehint.getTableModel().addRow(" the planner can find bad plans ");
			tablehint.getTableModel().addRow(" if system cache is smaller than expected");
		}		
		tablehint.getTableModel().addRow(String.format("log_checkpoint is %s", DBmonitor.get().getLog_Checkpoints()));
		if (DBmonitor.get().min_version("9.5")) {
			tablehint.getTableModel().addRow(String.format("min wal size %s", DBmonitor.get().getMin_wal_size()));
			tablehint.getTableModel().addRow(String.format("max wal size %s", DBmonitor.get().getMax_wal_size()));
		}
		else {
			tablehint.getTableModel().addRow(String.format("checkpoint_segments %s", DBmonitor.get().getCheckpoint_segments()));			
			tablehint.getTableModel().addRow(String.format(" the wal size is %s", Util.format_size(DBmonitor.get().getCheckpoint_segments()*DBmonitor.get().getWal_segment_size())));
		}
		tablehint.getTableModel().addRow(String.format("checkpoint timeout %s", DBmonitor.get().getCheckpoint_timeout()));
		if (DBmonitor.get().getCheckpoint_timeout().equals("300s")) {
			tablehint.getTableModel().addRow(" the checkpoint timeout equal default value 300s (5 min)");
			tablehint.getTableModel().addRow(" increment to 1 hour or more ");
		}		
		tablehint.getTableModel().addRow(String.format("checkpoint_warning %s", DBmonitor.get().getCheckpoint_warning()));
		final MultiWindowTextGUI gui = new MultiWindowTextGUI(screen, new DefaultWindowManager(), new EmptySpace(TextColor.ANSI.DEFAULT));
		final BasicWindow window = new BasicWindow();
		window.setHints(Arrays.asList(Window.Hint.FULL_SCREEN));
		Panel mainPanel = new Panel();			
		mainPanel.setLayoutManager(new LinearLayout(Direction.VERTICAL));
		mainPanel.addComponent(tablehint);
		Button accept = new Button("Ok", new Runnable() {
			@Override
			public void run() {
				window.close();
			}
		});
		mainPanel.addComponent(accept);
		window.setComponent(mainPanel.withBorder(Borders.singleLine("Hints")));
		gui.addWindowAndWait(window);		
	}
}
