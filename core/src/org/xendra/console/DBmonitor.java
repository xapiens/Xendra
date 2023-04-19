package org.xendra.console;

import java.io.IOException;
import java.math.BigDecimal;
import java.sql.Array;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.StringTokenizer;
import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.compiere.util.DB;

import com.googlecode.lanterna.gui2.MultiWindowTextGUI;
import com.googlecode.lanterna.gui2.dialogs.MessageDialogBuilder;
import com.googlecode.lanterna.gui2.dialogs.MessageDialogButton;
// DB Acitivity pg_top display.c 
// select datid, datname, numbackends, xact_commit, xact_rollback, blks_read,blks_hit, tup_returned, tup_fetched, tup_inserted, tup_updated, tup_deleted,conflicts FROM pg_stat_database;


public class DBmonitor {
	public static DBmonitor instance = null;
	private HashMap settings = new HashMap();
	public static DBmonitor get() {
		if (instance == null)
			instance = new DBmonitor();
		return instance;
	}
	private Double TotalMemory;
	private Double UsedMemory;
	private Double FreeMemory;
	private Double SharedMemory;
	private Double BufferMemory;
	private Double CachedMemory;
	private Integer overcommit_memory;
	private Integer overcommit_ratio;
	private String hipervisor = "";
	private String server_version;
	private List<String> users = new ArrayList<String>();
	private List<String> extensions = new ArrayList<String>();
	Double min = 60d;
	Double hour = 60*min;
	Double day = 24*hour;
	Double max_connections = 0d;
	Double work_mem_per_connection_percent = 150d;
	BigDecimal updatime;
	private int current_connections;
	private double current_connections_percent;
	private double superuser_reserved_connections;
	private int superuser_reserved_connections_ratio;
	private BigDecimal connection_age_average;
	private Double pre_auth_delay;
	private Double post_auth_delay;
	private Double work_mem;
	private double work_mem_total;
	private Double shared_buffers;
	private double track_activity_size;
	private Double maintenance_work_mem;
	private double maintenance_work_mem_total;
	private Double autovacuum_max_workers;
	private double max_memory;
	private double track_activity_ratio;
	private Double effective_cache_size;
	private double percent_mem_usage;
	private double shared_buffers_usage;
	private double percent_postgresql_max_memory;
	private BigDecimal all_database_size;
	private String Log_Checkpoints;
	private String Checkpoint_warning;
	private String Checkpoint_timeout;
	private Double Checkpoint_segments;
	private Double min_wal_size;
	private Double max_wal_size;
	private Double wal_segment_size;
	public DBmonitor() {
		try {
			String sql = "select * from pg_settings";
			PreparedStatement pstmt = DB.prepareStatement(sql, null);
			try {				
				ResultSet rs = pstmt.executeQuery();			
				while (rs.next())
				{
					Vector vector = new Vector();					
					String name = rs.getString("name");
					//vector.add(name);
					String setting = rs.getString("setting");
					vector.add(setting);
					String unit = rs.getString("unit");
					vector.add(unit);
					String category = rs.getString("category");
					vector.add(category);
					String short_desc = rs.getString("short_desc");
					vector.add(short_desc);
					String extra_desc = rs.getString("extra_desc");
					vector.add(extra_desc);
					String context = rs.getString("context");
					vector.add(context);
					String vartype = rs.getString("vartype");
					vector.add(vartype);
					String source = rs.getString("source");
					vector.add(source);
					String min_val = rs.getString("min_val");
					vector.add(min_val);
					String max_val = rs.getString("max_val");
					vector.add(max_val);
					settings.put(name, vector);
					//String enumvals = rs.getString("enumvals");
					Array enumvals = rs.getArray("enumvals");
					String boot_val = rs.getString("boot_val");
					String reset_val = rs.getString("reset_val");
					String sourcefile = rs.getString("sourcefile");
					Integer sourceline = rs.getInt("sourceline");					
				}
				rs.close();
				//work_mem_per_connection_percent = 150
				//ssh_opts = batchmode = yes ???
				sql = "select * from pg_user";
				pstmt = DB.prepareStatement(sql, null);
				rs = pstmt.executeQuery();			
				while (rs.next()) {
					String username = rs.getString("usename");
					Boolean usecreatedb  = rs.getBoolean("usecreatedb");
					Boolean usesuper = rs.getBoolean("usesuper");
					users.add(String.format("%s%s",username, usesuper ? "(SuperUser)":""));					
				}		

				// usesuper determine if superuser
				sql = "select extname from pg_extension";
				pstmt = DB.prepareStatement(sql, null);
				String os = System.getProperty("os.name");
				String version = System.getProperty("os.version");
				String arch = System.getProperty("os.arch");
				rs = pstmt.executeQuery();
				while (rs.next()) {					
					String extname = rs.getString("extname");
					extensions.add(extname);
					
				}
			} catch (Exception e) {
				e.printStackTrace();
			} finally {

			}			
			String ajua = execute("free -b");
			String pattern = "\\s+([0-9]+)";
			List<String> memory = new ArrayList<String>();
			Pattern pattern2 = Pattern.compile(pattern);
			Matcher matcher = pattern2.matcher(ajua);			
			while (matcher.find()) {
				memory.add(matcher.group());
			}
			if (memory.size() > 0) {
				setTotalMemory(Double.valueOf(memory.get(0)));
				setUsedMemory(Double.valueOf(memory.get(1)));
				setFreeMemory(Double.valueOf(memory.get(2)));
				setSharedMemory(Double.valueOf(memory.get(3)));
				setBufferMemory(Double.valueOf(memory.get(4)));
				setCachedMemory(Double.valueOf(memory.get(5)));
			}
			String ajua2 = execute("sysctl vm.overcommit_memory -n");
			overcommit_memory = Integer.valueOf(ajua2);

			ajua2 = execute("sysctl vm.overcommit_ratio -n");
			setOvercommit_ratio(Integer.valueOf(ajua2));
			String dmesg = execute("dmesg");
			String[] array1 = dmesg.split("\n");			
			for (String line:array1) {
				if (line.contains("vmware")) {
					hipervisor = "VMware";
				} else if (line.contains("kvm\t")) {
					hipervisor = "KVM";
				} else if (line.contains("xen\t")) {
					hipervisor = "XEN";
				} else if (line.contains("vbox\t")) {
					hipervisor = "VirtualBox";
				} else if (line.contains("hyper-v")) {
					hipervisor = "Hyper-V";
				}
			}
			ajua2 = execute("ls /sys/block");
			StringTokenizer st = new StringTokenizer(ajua2, "\n");
			Integer rotational_disks = 0;
			while (st.hasMoreElements()) {
				String disk = st.nextElement().toString();
				if (disk.startsWith("s") && (!disk.equals("sr0"))) {
					String ajua3 = execute(String.format("cat /sys/block/%s/queue/scheduler", disk));
					System.out.println(String.format("active schedulers %s ?", ajua3));
					String var = execute(String.format("cat /sys/block/%s/queue/rotational", disk));
					Integer rotational = Integer.valueOf(var);
					rotational_disks += rotational;					
				}				
			}
			setServer_version(get_setting("server_version").get(0));			
			System.out.println(String.format("Version : %s", getServer_version()));
			updatime = DB.getSQLValueBD(null, "select extract(epoch from now()-pg_postmaster_start_time())");			
			System.out.println(String.format("Service uptime: %s", format_epoch_to_time(updatime)));
			sql = "select datname from pg_database where not datistemplate and datallowconn";
			pstmt = DB.prepareStatement(sql, null);
			ResultSet rs = pstmt.executeQuery();
			int count = 0;
			String databases = "";
			while (rs.next()) {
				databases += String.format("%s ",rs.getString("datname"));				
				count++;
			}
			System.out.println(String.format("Database list (except templates %s)", databases ));
			System.out.println(String.format("Database count %s (except templates)", count));			
			max_connections = get_settingD("max_connections");
			current_connections = DB.getSQLValue(null, "select count(1)  from pg_stat_activity");
			current_connections_percent = Double.valueOf(current_connections)*100/Double.valueOf(max_connections);
			superuser_reserved_connections = get_settingD("superuser_reserved_connections");
			superuser_reserved_connections_ratio = (int) (superuser_reserved_connections * 100 / max_connections);
			connection_age_average = DB.getSQLValueBD(null, "select extract(epoch from avg(now()-backend_start)) as age from pg_stat_activity");
			pre_auth_delay = get_settingD("pre_auth_delay");
			post_auth_delay = get_settingD("post_auth_delay");
			setLog_Checkpoints(get_setting("log_checkpoints").get(0));
			setCheckpoint_warning(get_setting("checkpoint_warning"));
			setCheckpoint_timeout(get_setting("checkpoint_timeout"));
			if (min_version("9.5")) {
				setMin_wal_size(get_settingD("min_wal_size"));
				setMax_wal_size(get_settingD("max_wal_size"));
			}
			else {
				setCheckpoint_segments(get_settingD("checkpoint_segments"));	
			}						
			setWal_segment_size(get_settingD("wal_segment_size"));						
			work_mem =get_settingD("work_mem");			
			work_mem_total = work_mem * work_mem_per_connection_percent / 100 * max_connections;
			shared_buffers = get_settingD("shared_buffers");
			autovacuum_max_workers = get_settingD("autovacuum_max_workers");
			Double max_processes = max_connections + autovacuum_max_workers;
			if (min_version("9.4")) {
				max_processes = get_settingD("max_worker_processes");
			}
			track_activity_size = get_settingD("track_activity_query_size")*max_processes;
			maintenance_work_mem = get_settingD("maintenance_work_mem");
			maintenance_work_mem_total = maintenance_work_mem * autovacuum_max_workers;
			max_memory = shared_buffers  + work_mem_total + maintenance_work_mem_total + track_activity_size;
			effective_cache_size = get_settingD("effective_cache_size");
			all_database_size = DB.getSQLValueBD(null, "select sum(pg_database_size(datname)) from pg_database");
			shared_buffers_usage = all_database_size.doubleValue() / shared_buffers;
			if (shared_buffers_usage < 0.7) {
				//System.out.println("shared buffer is too big for the total databases size, memory is lost");
				//tablehint.getTableModel().addRow("shared buffer is too big for the total databases size, memory is lost","");
			}
			percent_postgresql_max_memory = getMax_memory()*100/getTotalMemory();
			// track activity ratio
			track_activity_ratio = track_activity_size*100/TotalMemory;
			percent_mem_usage = (max_memory + effective_cache_size)*100/TotalMemory;
		} catch (Exception e) {
			e.printStackTrace();
		}
	}				
	public double getPercent_postgresql_max_memory() {
		return percent_postgresql_max_memory;
	}
	public void setPercent_postgresql_max_memory(
			double percent_postgresql_max_memory) {
		this.percent_postgresql_max_memory = percent_postgresql_max_memory;
	}
	public Double getTotalMemory() {
		return TotalMemory;
	}
	public void setTotalMemory(Double totalMemory) {
		TotalMemory = totalMemory;
	}
	public Double getUsedMemory() {
		return UsedMemory;
	}
	public void setUsedMemory(Double usedMemory) {
		UsedMemory = usedMemory;
	}
	public Double getFreeMemory() {
		return FreeMemory;
	}
	public void setFreeMemory(Double freeMemory) {
		FreeMemory = freeMemory;
	}
	public Double getSharedMemory() {
		return SharedMemory;
	}
	public void setSharedMemory(Double sharedMemory) {
		SharedMemory = sharedMemory;
	}
	public Double getBufferMemory() {
		return BufferMemory;
	}
	public void setBufferMemory(Double bufferMemory) {
		BufferMemory = bufferMemory;
	}
	public Double getCachedMemory() {
		return CachedMemory;
	}
	public void setCachedMemory(Double cachedMemory) {
		CachedMemory = cachedMemory;
	}	
	public Integer getOvercommit_memory() {
		return overcommit_memory;
	}
	public void setOvercommit_memory(Integer overcommit_memory) {
		this.overcommit_memory = overcommit_memory;
	}
	public Integer getOvercommit_ratio() {
		return overcommit_ratio;
	}
	public void setOvercommit_ratio(Integer overcommit_ratio) {
		this.overcommit_ratio = overcommit_ratio;
	}
	public String getHipervisor() {
		return hipervisor;
	}
	public void setHipervisor(String hipervisor) {
		this.hipervisor = hipervisor;
	}	
	public List<String> getUsers() {
		return users;
	}
	public void setUsers(List<String> users) {
		this.users = users;
	}
	public List<String> getExtensions() {
		return extensions;
	}
	public void setExtensions(List<String> extensions) {
		this.extensions = extensions;
	}	
	public String getServer_version() {
		return server_version;
	}
	public void setServer_version(String server_version) {
		this.server_version = server_version;
	}	
	public BigDecimal getUpdatime() {
		return updatime;
	}
	public void setUpdatime(BigDecimal updatime) {
		this.updatime = updatime;
	}
	public Double getDay() {
		return day;
	}
	public void setDay(Double day) {
		this.day = day;
	}			
	public Double getMax_connections() {
		return max_connections;
	}
	public void setMax_connections(Double max_connections) {
		this.max_connections = max_connections;
	}	
	public int getCurrent_connections() {
		return current_connections;
	}
	public void setCurrent_connections(int current_connections) {
		this.current_connections = current_connections;
	}
	public double getCurrent_connections_percent() {
		return current_connections_percent;
	}
	public void setCurrent_connections_percent(double current_connections_percent) {
		this.current_connections_percent = current_connections_percent;
	}
	
	public double getSuperuser_reserved_connections() {
		return superuser_reserved_connections;
	}
	public void setSuperuser_reserved_connections(
			double superuser_reserved_connections) {
		this.superuser_reserved_connections = superuser_reserved_connections;
	}	
	public int getSuperuser_reserved_connections_ratio() {
		return superuser_reserved_connections_ratio;
	}
	public void setSuperuser_reserved_connections_ratio(
			int superuser_reserved_connections_ratio) {
		this.superuser_reserved_connections_ratio = superuser_reserved_connections_ratio;
	}	
	public BigDecimal getConnection_age_average() {
		return connection_age_average;
	}
	public void setConnection_age_average(BigDecimal connection_age_average) {
		this.connection_age_average = connection_age_average;
	}	
	public Double getMin() {
		return min;
	}
	public void setMin(Double min) {
		this.min = min;
	}	
	public Double getPre_auth_delay() {
		return pre_auth_delay;
	}
	public void setPre_auth_delay(Double pre_auth_delay) {
		this.pre_auth_delay = pre_auth_delay;
	}
	public Double getPost_auth_delay() {
		return post_auth_delay;
	}
	public void setPost_auth_delay(Double post_auth_delay) {
		this.post_auth_delay = post_auth_delay;
	}	
	public Double getWork_mem() {
		return work_mem;
	}
	public void setWork_mem(Double work_mem) {
		this.work_mem = work_mem;
	}
	public double getWork_mem_total() {
		return work_mem_total;
	}
	public void setWork_mem_total(double work_mem_total) {
		this.work_mem_total = work_mem_total;
	}	
	public Double getWork_mem_per_connection_percent() {
		return work_mem_per_connection_percent;
	}
	public void setWork_mem_per_connection_percent(
			Double work_mem_per_connection_percent) {
		this.work_mem_per_connection_percent = work_mem_per_connection_percent;
	}	
	public double getTrack_activity_size() {
		return track_activity_size;
	}
	public void setTrack_activity_size(double track_activity_size) {
		this.track_activity_size = track_activity_size;
	}
	public Double getShared_buffers() {
		return shared_buffers;
	}
	public void setShared_buffers(Double shared_buffers) {
		this.shared_buffers = shared_buffers;
	}	
	public Double getMaintenance_work_mem() {
		return maintenance_work_mem;
	}
	public void setMaintenance_work_mem(Double maintenance_work_mem) {
		this.maintenance_work_mem = maintenance_work_mem;
	}
	public double getMaintenance_work_mem_total() {
		return maintenance_work_mem_total;
	}
	public void setMaintenance_work_mem_total(double maintenance_work_mem_total) {
		this.maintenance_work_mem_total = maintenance_work_mem_total;
	}	
	public Double getAutovacuum_max_workers() {
		return autovacuum_max_workers;
	}
	public void setAutovacuum_max_workers(Double autovacuum_max_workers) {
		this.autovacuum_max_workers = autovacuum_max_workers;
	}
	public double getMax_memory() {
		return max_memory;
	}
	public void setMax_memory(double max_memory) {
		this.max_memory = max_memory;
	}
	public double getTrack_activity_ratio() {
		return track_activity_ratio;
	}
	public void setTrack_activity_ratio(double track_activity_ratio) {
		this.track_activity_ratio = track_activity_ratio;
	}	
	public Double getEffective_cache_size() {
		return effective_cache_size;
	}
	public void setEffective_cache_size(Double effective_cache_size) {
		this.effective_cache_size = effective_cache_size;
	}
	public double getPercent_mem_usage() {
		return percent_mem_usage;
	}
	public void setPercent_mem_usage(double percent_mem_usage) {
		this.percent_mem_usage = percent_mem_usage;
	}
	public double getShared_buffers_usage() {
		return shared_buffers_usage;
	}
	public void setShared_buffers_usage(double shared_buffers_usage) {
		this.shared_buffers_usage = shared_buffers_usage;
	}	
	public BigDecimal getAll_database_size() {
		return all_database_size;
	}
	public void setAll_database_size(BigDecimal all_database_size) {
		this.all_database_size = all_database_size;
	}	
	public String getLog_Checkpoints() {
		return Log_Checkpoints;
	}
	public void setLog_Checkpoints(String log_Checkpoints) {
		Log_Checkpoints = log_Checkpoints;
	}	
	public String getCheckpoint_warning() {
		return Checkpoint_warning;
	}
	public void setCheckpoint_warning(List<String> varlist) {
		String warning = "";
		for (String var:varlist) {
			warning += var;
		}
		Checkpoint_warning = warning;
	}		
	public String getCheckpoint_timeout() {
		return Checkpoint_timeout;
	}
	public void setCheckpoint_timeout(List<String> varlist) {
		String warning = "";
		for (String var:varlist) {
			warning += var;
		}		
		Checkpoint_timeout = warning;
	}
	public Double getCheckpoint_segments() {
		return Checkpoint_segments;
	}
	public void setCheckpoint_segments(Double checkpoint_segments) {
		Checkpoint_segments = checkpoint_segments;
	}	
	public Double getMin_wal_size() {
		return min_wal_size;
	}
	public void setMin_wal_size(Double min_wal_size) {
		this.min_wal_size = min_wal_size;
	}
	public Double getMax_wal_size() {
		return max_wal_size;
	}
	public void setMax_wal_size(Double max_wal_size) {
		this.max_wal_size = max_wal_size;
	}
	public void setWal_segment_size(Double wal_segment_size) {
		this.wal_segment_size = wal_segment_size;
	}
	public Double getWal_segment_size() {
		return wal_segment_size;
	}
	//getLog_Checkpoints
	public String execute(String command) throws IOException, InterruptedException {
		List<String> commands = new ArrayList<String>();
		commands.add("/bin/sh");
		commands.add("-c");
		commands.add(command);
		// execute the command
		SystemCommandExecutor commandExecutor = new SystemCommandExecutor(commands);
		int result = commandExecutor.executeCommand();
		StringBuilder stdout = commandExecutor.getStandardOutputFromCommand();
		String var = "";
		if (stdout != null) {
			var = stdout.toString().trim();
		}
		return var;
	}
	Double get_settingD(String key) {
		List<String> var = get_setting(key);
		Double dvar = Double.valueOf(var.get(0));
		return dvar;
	}
	List<String> get_setting(String key) {		
		List<String> setting = new ArrayList<String>();
		String value = "";
		String unit = "";
		if (settings.containsKey(key)) {
			Vector vector = (Vector) settings.get(key);
			value = (String) vector.firstElement();
			unit = (String) vector.get(1);
			if (unit != null) {
				//setting.add(value);
				//setting.add(unit);
				//return setting;
			//} else {
				Double dvalue = Double.valueOf(value);			
				if (unit.equals("kB") || unit.equals("K")) {
					dvalue = dvalue*1024d;
					value = String.valueOf(dvalue);
				} else if (unit.equals("8kB")) {
					dvalue = dvalue*8d*1024d;
					value = String.valueOf(dvalue);
				} else if (unit.equals("16kB")) {
					dvalue = dvalue*16d*1024d;
					value = String.valueOf(dvalue);
				} else if (unit.equals("M")) {
					dvalue = dvalue*1024d*1024d;
					value = String.valueOf(dvalue);
				} else if (unit.equals("G")) {
					dvalue = dvalue*1024d*1024d*1024d;
					value = String.valueOf(dvalue);
				} else if (unit.equals("s")) {
					//value += "s";
				} else if (unit.equals("ms")) {
					//value += "ms";
				}
			}
		}
		setting.add(value);
		setting.add(unit);
		return setting;								
	}
	public String format_epoch_to_time(BigDecimal updatime) {		
		Double epoch = updatime.doubleValue();
		String time = "";
		if (epoch > day) {
			Double days = epoch / day;
			epoch = epoch % day; 
			BigDecimal bigDecimal = new BigDecimal(String.valueOf(days));
			time += String.format("%sd ", bigDecimal.intValue());
		}
		if (epoch > hour) {
			Double hours = epoch / hour;
			epoch = epoch % hours;
			BigDecimal bigDecimal = new BigDecimal(String.valueOf(hours));
			time += String.format("%sh ", bigDecimal.intValue());			
		}
		if (epoch > min) {
			Double mins = epoch / min;
			epoch = epoch % mins;
			time += String.format("%.2fm", mins);			
		}
		return time;
	}
	
	public boolean min_version(String min_version) {		
		//String cur_version = get_setting("server_version").get(0);
		//String cur_version = monitor.get().getServer_version();
		StringTokenizer st = new StringTokenizer(min_version,".");
		String minmajor = "";
		String minminor = "";
		String curmajor = "";
		String curminor = "";		
		while (st.hasMoreElements()) {
			String value = (String) st.nextElement();
			if (minmajor.length() == 0) 
				minmajor = value;
			else if (minminor.length() == 0)
				minminor = value;
		}		
		st = new StringTokenizer(getServer_version(),".");
		while (st.hasMoreElements()) {
			String value = (String) st.nextElement();
			if (curmajor.length() == 0) 
				curmajor = value;
			else if (curminor.length() == 0)
				curminor = value;
		}		
		if (Integer.valueOf(curmajor).compareTo(Integer.valueOf(minmajor)) >= 0) {
			return true;
		} else if ( curmajor.equals(minmajor)) {
			if (curminor.compareTo(minminor) >= 0) {
				return true;
			} else {
				return false;
			}
		}
		return false;
	}
	public boolean isRoot(MultiWindowTextGUI gui) {
		Boolean isroot = false;
		try {
			String value = DBmonitor.get().execute("id -u");
			if (Integer.valueOf(value) == 0) {
				isroot = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}			
		if (!isroot) {
			MessageDialogButton answer = new MessageDialogBuilder()
			.setTitle("Conexion")
			.setText("root is necessary to this operation")
			.addButton(MessageDialogButton.OK)				
			.build()
			.showDialog(gui);										
		} 
		return true;
	}
}
