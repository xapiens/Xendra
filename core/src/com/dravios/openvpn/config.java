package com.dravios.openvpn;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class config implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7893403930522542022L;
	//private static config m_Config;
	private static config instance = new config();
	
	public static config getInstance() {
		return instance;
	}
		
	public config()
	{
		try {
			if (instance == null)
			{
				File fconf = new File("jopenvpn");
				if (fconf.exists())
				{
					FileInputStream in = new FileInputStream("jopenvpn");
					ObjectInputStream ins = new ObjectInputStream(in);
					instance = (config) ins.readObject();		
					setConfigFile(instance.getConfigFile());
					setManagementPort(instance.getManagementPort());
					setOpenVPNDir(instance.getOpenVPNDir());
					setUser(instance.getUser());
					setpwd(instance.getpwd());
					setcmd(instance.getcmd());
					ins.close();
					in.close();
				}				
				else
				{
					instance = new config(0);
					if (fconf.createNewFile())
					{
						// defaults
						FileOutputStream out = new FileOutputStream("jopenvpn");
						ObjectOutputStream outs = new ObjectOutputStream(out);
						outs.writeObject(instance);
						outs.close();
						out.close();
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
    public config(int i) {
		if (i == 0)
		{			
			setConfigFile("/etc/openvpn/client.conf");			
			setOpenVPNDir("openvpn");
			setManagementPort(9000);
			setUser("usuario");
			setpwd("password");
		}
	}
	private Integer managementPort = 9000;
	private String m_OpenVPNDir;
	private String m_ConfigFile;
	private String m_user = "";
	private String m_pwd = "";
	private String m_cmd = "";

	public String getOpenVPNDir() {
		//return config.getOpenVPNDir();
		//return "openvpn";
		return m_OpenVPNDir;
	}
	
	public void setOpenVPNDir(String vpndir) {
		m_OpenVPNDir = vpndir;
	}

	public String getConfigFile() {
		return m_ConfigFile;
	}

	public  void setConfigFile(String configfile) {
		m_ConfigFile = configfile;
	}
	
	public int getManagementPort() {
		//return managementPort;
		return managementPort;
	}

	public void setManagementPort(Integer mPort) {		
		managementPort = mPort;
	}
	
	public void save()
	{
		try {
			
			File fconf = new File("jopenvpn");
			boolean goahead = false;
			if (!fconf.exists())
			{
				if (fconf.createNewFile())
					goahead = true;
			}
			else
				goahead = true;
			if (goahead)
			{
				FileOutputStream out = new FileOutputStream("jopenvpn");
				ObjectOutputStream outs = new ObjectOutputStream(out);
				outs.writeObject(instance);
				outs.close();
				out.close();
			}				
		}
		catch (Exception e)		
		{
			e.printStackTrace();
		}
	}

	public String getUser() 
	{
		return m_user;
	}
	
	public void setUser(String user) {
		m_user = user;
	}

	public String getpwd()
	{
		return m_pwd;
	}
	
	public void setpwd(String pwd) {
		m_pwd = pwd;
	}
	
	public String getcmd()
	{
		return m_cmd ;
	}
	public void setcmd(String cmd) {
		m_cmd = cmd;
	}
}
