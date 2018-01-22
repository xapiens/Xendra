package com.dravios.openvpn;								
//								,_-=(!7(7/zs_.             
//								.='  ' .`/,/!(=)Zm.           
//								.._,,._..  ,-`- `,\ ` -` -`\\7//WW.         
//								,v=~/.-,-\- -!|V-s.)iT-|s|\-.'   `///mK%.        
//								v!`i!-.e]-g`bT/i(/[=.Z/m)K(YNYi..   /-]i44M.       
//								v`/,`|v]-DvLcfZ/eV/iDLN\D/ZK@%8W[Z..   `/d!Z8m       
//								//,c\(2(X/NYNY8]ZZ/bZd\()/\7WY%WKKW)   -'|(][%4.      
//								,\\i\c(e)WX@WKKZKDKWMZ8(b5/ZK8]Z7%ffVM,   -.Y!bNMi      
//								/-iit5N)KWG%%8%%%%W8%ZWM(8YZvD)XN(@.  [   \]!/GXW[      
//								/ ))G8\NMN%W%%%%%%%%%%8KK@WZKYK*ZG5KMi,-   vi[NZGM[      
//								i\!(44Y8K%8%%%**~YZYZ@%%%%%4KWZ/PKN)ZDZ7   c=//WZK%!      
//								,\v\YtMZW8W%%f`,`.t/bNZZK%%W%%ZXb*K(K5DZ   -c\\/KM48       
//								-|c5PbM4DDW%f  v./c\[tMY8W%PMW%D@KW)Gbf   -/(=ZZKM8[       
//								2(N8YXWK85@K   -'c|K4/KKK%@  V%@@WD8e~  .//ct)8ZK%8`       
//								=)b%]Nd)@KM[  !'\cG!iWYK%%|   !M@KZf    -c\))ZDKW%`        
//								YYKWZGNM4/Pb  '-VscP4]b@W%     'Mf`   -L\///KM(%W!         
//								!KKW4ZK/W7)Z. '/cttbY)DKW%     -`  .',\v)K(5KW%%f          
//								'W)KWKZZg)Z2/,!/L(-DYYb54%  ,,`, -\-/v(((KK5WW%f           
//								\M4NDDKZZ(e!/\7vNTtZd)8\Mi!\-,-/i-v((tKNGN%W%%            
//								'M8M88(Zd))///((|D\tDY\\KK-`/-i(=)KtNNN@W%%%@%[           
//								!8%@KW5KKN4///s(\Pd!ROBY8/=2(/4ZdzKD%K%%%M8@%%           
//								'%%%W%dGNtPK(c\/2\[Z(ttNYZ2NZW8W8K%%%%YKM%M%%.          
//								*%%W%GW5@/%!e]_tZdY()v)ZXMZW%W%%%*5Y]K%ZK%8[          
//								'*%%%%8%8WK\)[/ZmZ/Zi]!/M%%%%@f\ \Y/NNMK%%!          
//								'VM%%%%W%WN5Z/Gt5/b)((cV@f`  - |cZbMKW%%|          
//								'V*M%%%WZ/ZG\t5((+)L\'-,,/  -)X(NWW%%           
//								`~`MZ/DZGNZG5(((\,    ,t\\Z)KW%@           
//								'M8K%8GN8\5(5///]i!v\K)85W%%f           
//								YWWKKKKWZ8G54X/GGMeK@WM8%@            
//								!M8%8%48WG@KWYbW%WWW%%%@             
//								VM%WKWK%8K%%8WWWW%%%@`             
//								~*%%%%%%W%%%%%%%@~               
//								~*MM%%%%%%@f`                 
//								 '''''                     
import java.awt.AWTException;
import java.awt.Component;
import java.awt.Image;
import java.awt.MenuItem;
import java.awt.SystemTray;
import java.awt.TrayIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URL;
import java.util.HashMap;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JPopupMenu;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

import org.compiere.apps.AppsAction;


public class VpnClient implements ActionListener {
	
	protected static final String CONNECT = "CONNECT";
	protected static final String DISCONNECT = "DISCONNECT";
	protected static final String VPNCOMMAND = "VPNCOMMAND";
	protected static final String EXIT = "EXIT";
	protected static final String CONFIG = "CONFIG";
	private static String disabled = "images/LedDisabled24.png";
	public static String enabled = "images/LedEnabled24.png";
	private static String state   = "Estado";
	private static String Connect = "Conectar";
	private static String Disconnect = "Desconectar";
	private static String m_state = "";
	private static vpn m_vpn = new vpn();
	private HashMap<String, AppsAction> AppsActions = new HashMap();
	private JPopupMenu m_popup;
	private static VpnClient m_vpnclient = null;
	
	public static VpnClient getInstance()
	{
		if (m_vpnclient == null)
			m_vpnclient = new VpnClient();
		return m_vpnclient;
	}
	
	public VpnClient()
	{
		AppsActions.put(CONNECT, new AppsAction(CONNECT, null, false));
		AppsActions.get(CONNECT).setDelegate(this);
		AppsActions.put(DISCONNECT, new AppsAction(DISCONNECT, null, false));
		AppsActions.get(DISCONNECT).setDelegate(this);
		AppsActions.put(VPNCOMMAND, new AppsAction(VPNCOMMAND, null, false));
		AppsActions.get(VPNCOMMAND).setDelegate(this);
		AppsActions.put(EXIT, new AppsAction(EXIT, null, false));
		AppsActions.get(EXIT).setDelegate(this);
		AppsActions.put(CONFIG, new AppsAction(CONFIG, null, false));
		AppsActions.get(CONFIG).setDelegate(this);
	}
	
	public JPopupMenu getMenu()
	{
		if (m_popup == null)
		{
			m_popup   = new JPopupMenu();
			JMenu stateMenu = new JMenu(state);
			stateMenu.add(AppsActions.get(CONNECT).getMenuItem());
			stateMenu.add(AppsActions.get(DISCONNECT).getMenuItem());			        
			m_popup.add(stateMenu);
			m_popup.add(AppsActions.get(CONFIG).getMenuItem());
			m_popup.addSeparator();
			m_popup.add(AppsActions.get(VPNCOMMAND).getMenuItem());
			m_popup.addSeparator();		        
			m_popup.add(AppsActions.get(EXIT).getMenuItem());
		}
		return m_popup;
	}
	
	/**
	 * @param args
	 */	
	public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            //private MenuItem connectItem;
			private TrayIcon trayIcon;
			private DialogConf panel;
						

			public void run() {
                createAndShowGUI();
            }

			private void createAndShowGUI() {
		        if (SystemTray.isSupported()) {
			        trayIcon = new TrayIcon(createImage(disabled, "tray icon"));
			        final SystemTray tray   = SystemTray.getSystemTray();
			        
			        trayIcon.setImageAutoSize(true);
			        trayIcon.setToolTip("Conexion VPN");
			        // Create a popup menu components
			        //connectItem = new MenuItem(Connect);
			        //
			        
			        //MenuItem connectItem = new MenuItem(Connect);
			        //JMenuItem connectItem = AppsActions.get(CONNECT).getMenuItem();
			        //JMenuItem disconnectItem = AppsActions.get(DISCONNECT).getMenuItem();
			        //MenuItem exitItem = new MenuItem("Salir");
			        //JMenuItem exitItem = AppsActions.get(EXIT).getMenuItem();
			        //MenuItem cmdItem = new MenuItem("Ejecutar Comando");
			        //MenuItem configItem = new MenuItem("Configuración");
			        
			        //trayIcon.setPopupMenu(popup);
			        trayIcon.addMouseListener( new MouseAdapter() {
			        	@Override
			        	public void mouseReleased(MouseEvent e) {
			        		ShowPopup(e);
			        	}
			        	public void mousePressed(MouseEvent e) {
			        		ShowPopup(e);
			        	}
			        	private void ShowPopup(MouseEvent e) {
			        		if (e.isPopupTrigger()) {
			        			VpnClient.getInstance().getMenu().setLocation(e.getX(), e.getY());
			        			VpnClient.getInstance().getMenu().setInvoker(VpnClient.getInstance().getMenu());
			        			VpnClient.getInstance().getMenu().setVisible(true);
			        		}
			        	}
			        });
			        
			        try {
			            tray.add(trayIcon);
			        } catch (AWTException e) {
			            System.out.println("TrayIcon could not be added.");
			            return;
			        }
			        
			        trayIcon.addActionListener(new ActionListener() {
			            public void actionPerformed(ActionEvent e) {
			                JOptionPane.showMessageDialog(null,
			                        "This dialog box is run from System Tray");
			            }
			        });			        
		        }
		        panel = new DialogConf();
		        panel.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);		        		        
		        
		        ActionListener listener = new ActionListener() {		            
					public void actionPerformed(ActionEvent e) {
		                MenuItem item = (MenuItem)e.getSource();
		                if (Connect.equals(item.getLabel())) {
		                	if (m_state.length() == 0)
		                	{
		                	}
		                }
		                else if (Disconnect.equals(item.getLabel())) {
		                }
		            }
		        };

		        //connectItem.addActionListener(listener);
		        //disconnectItem.addActionListener(listener);
		        
//		        configItem.addActionListener(new ActionListener() {
//		        	public void actionPerformed(ActionEvent e) {
//		        	}
//		        });
//		        cmdItem.addActionListener(new ActionListener() {
//		        	private Runtime runtimeEnv  = Runtime.getRuntime ();
//
//					public void actionPerformed(ActionEvent e) {
//		        		String cmd = m_vpn.getConfig().getcmd();
//						if (cmd == null)
//							cmd = "";
//						if (cmd.length() > 0)
//						{
//							try {
//								Process process = runtimeEnv.exec(cmd);
//							} catch (IOException e1) {
//								e1.printStackTrace();
//							}	
//						}									        		
//		        	}
//		        });
//		        exitItem.addActionListener(new ActionListener() {
//		            public void actionPerformed(ActionEvent e) {
//		                tray.remove(trayIcon);
//		                System.exit(0);
//		            }
//		        });				
			}

        });
	}

	public static Image createImage(String path, String description) {
        URL imageURL = VpnClient.class.getResource(path);
        
        if (imageURL == null) {
            System.err.println("Resource not found: " + path);
            return null;
        } else {
            return (new ImageIcon(imageURL, description)).getImage();
        }
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Component c = (Component) e.getSource();
		if (e.getActionCommand().equals(CONNECT)) {
			org.compiere.apps.SwingWorker worker = new org.compiere.apps.SwingWorker()
			{
				public Object construct()
				{
					try 
					{
                		// first connec|tion
                		String error = m_vpn.check();
                		if (error.length() == 0)
                		{
                			m_state = enabled;
                			//m_vpn.settrayIcon(trayIcon);
                			//m_vpn.setControlstatus(panel);
	                		m_vpn.start();			                				    			                				    			                				    			                		    			                		
                		}
                		else
                		{		                			
                			//panel.setConfig(m_vpn.getConfig());
                			//panel.setVisible(true);		                			
                		}
					}
					catch (Exception e)
					{

					}
					return Boolean.TRUE;						
				}
			};
			worker.start();		                					
		}
		else if (e.getActionCommand().equals(DISCONNECT)) {
			org.compiere.apps.SwingWorker worker = new org.compiere.apps.SwingWorker()
			{
				public Object construct()
				{
					try 
					{
						if (m_state.equals(enabled))
						{
							m_vpn.stop();
						}
					}
					catch (Exception e)
					{

					}
					return Boolean.TRUE;						
				}
			};
			worker.start();		                				                				
		}
		else if (e.getActionCommand().equals(CONFIG)) {		
    		//panel.setConfig(m_vpn.getConfig());
    		//panel.setVisible(true);			
		}
		else if (e.getActionCommand().equals(VPNCOMMAND)) {		
    		String cmd = m_vpn.getConfig().getcmd();
			if (cmd == null)
				cmd = "";
			if (cmd.length() > 0)
			{
				try {
					Process process = Runtime.getRuntime().exec(cmd);
				} catch (IOException e1) {
					e1.printStackTrace();
				}	
			}					
		}
		else if (e.getActionCommand().equals(EXIT)) {
            //tray.remove(trayIcon);
            //System.exit(0);			
		}
	}			
}
