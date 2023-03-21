package org.xendra.efact.ftp;

import java.io.File;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.apache.ftpserver.FtpServer;
import org.apache.ftpserver.FtpServerFactory;
import org.apache.ftpserver.ftplet.Authority;
import org.apache.ftpserver.ftplet.FtpException;
import org.apache.ftpserver.ftplet.FtpReply;
import org.apache.ftpserver.ftplet.FtpRequest;
import org.apache.ftpserver.ftplet.FtpSession;
import org.apache.ftpserver.ftplet.Ftplet;
import org.apache.ftpserver.ftplet.FtpletContext;
import org.apache.ftpserver.ftplet.FtpletResult;
import org.apache.ftpserver.ftplet.UserManager;
import org.apache.ftpserver.listener.ListenerFactory;
import org.apache.ftpserver.usermanager.PasswordEncryptor;
import org.apache.ftpserver.usermanager.PropertiesUserManagerFactory;
import org.apache.ftpserver.usermanager.impl.BaseUser;
import org.apache.ftpserver.usermanager.impl.WritePermission;
import org.compiere.model.MBPartnerCertificate;
import org.compiere.model.Query;
import org.compiere.util.Env;
import org.compiere.util.Ini;
import org.compiere.util.Language;
import org.xendra.efact.EFactConstants;

public class FtpXendrian {
	private String m_FtpBase;

	public void create() {
		FtpServerFactory serverFactory = new FtpServerFactory();
		ListenerFactory factory = new ListenerFactory();

		// set the port of the listener
		factory.setPort(1234);

		// replace the default listener
		serverFactory.addListener("default", factory.createListener());

		PropertiesUserManagerFactory userManagerFactory = new PropertiesUserManagerFactory();
		userManagerFactory.setFile(new File("/home/xapiens/myusers.properties"));
		userManagerFactory.setPasswordEncryptor(new PasswordEncryptor()
		{
			@Override
			public String encrypt(String password) {
				return password;
			}
			@Override
			public boolean matches(String passwordToCheck, String storedPassword) {
				return passwordToCheck.equals(storedPassword);
						
			}
		});
		// let's add user, since our myusers.properties file is empty on our first test run
		BaseUser user = new BaseUser();
		user.setName("test");
		user.setPassword("test");
		user.setHomeDirectory(m_FtpBase);
		List<Authority> authorities = new ArrayList<Authority>();
		authorities.add(new WritePermission());
		user.setAuthorities(authorities);
		UserManager um = userManagerFactory.createUserManager();
		try {
			um.save(user);
		}
		catch (FtpException e1) 
		{
			// deal with the exception as you need			
		}
		serverFactory.setUserManager(um);
		Map<String, Ftplet> m = new HashMap<String, Ftplet>();
		m.put("miaFtplet", new Ftplet() {
			
			@Override
			public void init(FtpletContext ftpletContext) throws FtpException {
				// TODO Auto-generated method stub				
			}			
			@Override
			public void destroy() {
				
			}
			@Override
			public FtpletResult beforeCommand(FtpSession session, FtpRequest request) throws FtpException, IOException {
				return null;
			}			
			@Override
			public FtpletResult afterCommand(FtpSession session, FtpRequest request, FtpReply reply) throws FtpException, IOException {
				return FtpletResult.DEFAULT;
			}
			@Override
			public FtpletResult onConnect(FtpSession session) throws FtpException, IOException {
				return FtpletResult.DEFAULT;
			}
			@Override
			public FtpletResult onDisconnect(FtpSession session) throws FtpException, IOException {
				return FtpletResult.DEFAULT;
			}
		});
		serverFactory.setFtplets(m);		
		//Map<String, Ftplet> mappa = serverFactory.getFtplets();
	    //System.out.println(mappa.size());
	    //System.out.println("Thread #" + Thread.currentThread().getId());
	    //System.out.println(mappa.toString());
		FtpServer server = serverFactory.createServer();
		try {
			server.start();
		} catch (FtpException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws Exception {
		if (!org.compiere.Xendra.startup(false))
		{					
			return;
		}
		Env.setContext(Env.getCtx(), "#Date", new Timestamp(System.currentTimeMillis()));
		Optional<String> langName = Optional.ofNullable(Ini.getProperty(Ini.P_LANGUAGE));
		Language language = Language.getLanguage(langName.isPresent()?langName.get():"");
		Env.setContext(Env.getCtx(), Env.LANGUAGE, language.getAD_Language());
		//
		FtpXendrian ftp = new FtpXendrian();
		ftp.setC_BPartner_Certificate(2000000);
		ftp.create();
	}

	private void setC_BPartner_Certificate(int C_BPartner_Certificate_ID) {
		MBPartnerCertificate pc = new Query(Env.getCtx(), 
					MBPartnerCertificate.Table_Name, "C_BPartner_ID = ?", null)
					.setParameters(C_BPartner_Certificate_ID).first();
		m_FtpBase = pc.get(EFactConstants.FTPBASE);
	}
}
