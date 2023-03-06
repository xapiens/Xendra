package org.xendra.xendrian;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.Vector;
import java.util.logging.Level;

import org.columba.api.plugin.ExtensionForm;
import org.columba.api.plugin.ExtensionFormTrl;
import org.columba.api.plugin.ExtensionMenuItem;
import org.columba.api.plugin.ExtensionMenuItemTrl;
import org.columba.api.plugin.ExtensionMetadata;
import org.columba.api.plugin.PluginMetadata;
import org.columba.api.plugin.ServletMetadata;
import org.columba.core.io.ZipFileIO;
import org.columba.core.plugin.ExtensionXMLParser;
import org.compiere.model.MTree_Base;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_AD_Config;
import org.compiere.model.persistence.X_AD_Extension;
import org.compiere.model.persistence.X_AD_ExtensionList;
import org.compiere.model.persistence.X_AD_Form;
import org.compiere.model.persistence.X_AD_Menu;
import org.compiere.model.persistence.X_AD_Plugin;
import org.compiere.model.persistence.X_AD_Process;
import org.compiere.model.persistence.X_AD_Process_Access;
import org.compiere.model.persistence.X_AD_ReplicationFile;
import org.compiere.model.persistence.X_AD_RoleType;
import org.compiere.model.persistence.X_AD_Servlet;
import org.compiere.model.persistence.X_AD_ServletList;
import org.compiere.model.persistence.X_AD_TreeNodeMM;
import org.compiere.model.reference.REF_AD_MenuAction;
import org.compiere.model.reference.REF_AD_TableAccessLevels;
import org.compiere.model.reference.REF_AD_TreeTypeType;
import org.compiere.util.CLogger;
import org.compiere.util.DB;
import org.compiere.util.Env;
import org.compiere.util.Util;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.input.SAXBuilder;
import org.xendra.Constants;
import org.xendra.api.XendrianServer;
import org.xendra.messages.MessageFormatParser;
import org.xendra.printdocument.PrintFormatXMLParser;
import org.xendra.report.ReportXMLParser;
import org.xendra.rules.RuleXMLParser;
import org.xendra.util.UpdatePO;

public class Plugin {
	private static CLogger log = CLogger.getCLogger (Plugin.class);
	static Plugin m_plugin;
	private Vector globalmenutrl = new Vector();
	private Vector globalmenu = new Vector();
	Hashtable server = null;

	public String deployplugins()  {
		String error = "";
		log.log(Level.WARNING, String.format("Search new plugins in Xendra Store dir (%s)...", Env.getMachine().getStoreFolder()));
		int count = 0;
		List<File> files = new LinkedList<File>(Arrays.asList(Env.getMachine().getStoreFolder().listFiles()));
		Iterator it = files.iterator(); 
		while (it.hasNext()) {
			File file = (File) it.next();
			if (file.isFile()) {
				if (file.getName().equals("core.zip")) {
					error = processplugin(file);
					count ++;					
					it.remove();
					break;
				}				
			}
		}
		it = files.iterator();
		while (it.hasNext()) {
			File file = (File) it.next();
			if (file.isFile()) {
				if (file.getName().equals("xendrian.zip")) {
					error = processplugin(file);
					count ++;
					it.remove();
					break;
				}				
			}
		}
		it = files.iterator();
		while (it.hasNext()) {
			File file = (File) it.next();
			if (file.isFile()) {
				error = processplugin(file);
				count ++;
			}
		} 				
		log.log(Level.WARNING, String.format("%d plugin(s) found(s)", count));
		return error;
	}		

	private String processplugin(File file)  {
		String error = "";
		if (file.isFile()) {		
			//new XendrianServer().setServlet("store").newsession();
			String client = new XendrianServer().setServlet("store").getProperty("client");
			if (client.length() == 0)
				new XendrianServer().setServlet("store").addProperty("client", 0);
			String filename = new XendrianServer().setServlet("store").getProperty("filename");
			if (filename.length() == 0)
				new XendrianServer().setServlet("store").addProperty("filename", file.getName());	
			String force = new XendrianServer().setServlet("store").getProperty("force");
			if (force.length() == 0)						
				new XendrianServer().setServlet("store").addProperty("force", "N");			
			boolean update = true;			
			log.log(Level.WARNING, String.format("processing %s from store", file.getName()));
			new XendrianServer().setServlet("store").addMessage(String.format("processing %s from store\n", file.getName()));
			Timestamp lasmodified = new Timestamp(file.lastModified());
			X_AD_Plugin plugin = new Query(Env.getCtx(), X_AD_Plugin.Table_Name, "filename = ?", null)
			.setParameters(file.getName()).first();
			if (plugin != null)
			{
				if (plugin.getSynchronized() != null && lasmodified.compareTo(plugin.getSynchronized()) <= 0)		        
					update = false;		            	
			}		        
			if (update)
			{
				Boolean plugininstalled = true;
				File pluginDirectory = null;
				try {
					// extract plugin
					pluginDirectory = ZipFileIO.getFirstFile(file);
					if (pluginDirectory != null)
					{
						File outdatedpluginDirectory = new File(Env.getMachine().getPluginsFolder(), pluginDirectory.getName());
						if (outdatedpluginDirectory.exists())
						{
							Date curDate = new Date();
							SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmm");
							String name = sdf.format(curDate);
							name += pluginDirectory.getName();
							//File destfile = new File(dirtrash, name);
							File destfile = new File(Env.getMachine().getTrashFolder(), name);
							if (outdatedpluginDirectory.renameTo(destfile))
							{

							}									
						}
						ZipFileIO.extract(file, Env.getMachine().getPluginsFolder());
					}												
				} catch (IOException ioe) {
					error = ioe.getMessage();
					return error; 
				}
				if (pluginDirectory != null) {
					// the plugin directory is "<config-folder>/plugins/<plugin-id>"
					String foldername = pluginDirectory.getPath();
					pluginDirectory = new File(Env.getMachine().getPluginsFolder(), pluginDirectory.getName());							
					//LOG.info("plugin directory="+pluginDirectory.getAbsolutePath());
					// the path to the plugin.xml descriptor file is:
					// "<config-folder>/plugins/<plugin-id>/plugin.xml
					if (pluginDirectory != null)
					{
						File hornetqconfig = new File(pluginDirectory, "hornetqconfig");
						if (hornetqconfig != null && hornetqconfig.exists())
						{
							for (final File hornetqfile : hornetqconfig.listFiles()) {
								if (hornetqfile.isFile()) {
									X_AD_ReplicationFile rf = new Query(Env.getCtx(), X_AD_ReplicationFile.Table_Name,"name = ?", null)
									.setParameters(hornetqfile.getName()).first();
									if (rf != null)
									{
										long lm = file.lastModified();
										Calendar cal = Calendar.getInstance();										
										cal.setTime(rf.getSynchronized());
										cal.set(Calendar.MILLISECOND, 0);					
										if (cal.getTimeInMillis() != lm)
										{
											rf.setContent(getContent(hornetqfile));
											rf.setSynchronized(new Timestamp(hornetqfile.lastModified()));
											rf.save();
										}
									}
									if (rf == null)
									{
										rf = new X_AD_ReplicationFile(Env.getCtx(), 0, null);
										rf.setName(hornetqfile.getName());
										rf.setSynchronized(new Timestamp(hornetqfile.lastModified()));
										rf.setContent(getContent(hornetqfile));
										rf.save();
									}
								}									
							}
						}
						File webdir = new File(pluginDirectory, Constants.WEB);
						if (webdir != null && webdir.exists()) {
							for (final File webfile : webdir.listFiles()) {
								try {									
									if (webfile.isFile()) {									
										File outdatedpluginDirectory = new File(Env.getMachine().getWebFolder(), webfile.getName());
										//File fillfile = new File(webfile.getPath(), pluginDirectory.getName());
										if (outdatedpluginDirectory.exists())
										{
											Date curDate = new Date();
											SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmm");
											String name = sdf.format(curDate);
											name += webfile.getName();
											//File destfile = new File(dirtrash, name);
											File destfile = new File(Env.getMachine().getTrashFolder(), name);
											if (outdatedpluginDirectory.renameTo(destfile))
											{

											}									
										}				
										ZipFileIO.extract(webfile, Env.getMachine().getWebFolder());
										//fillfile = new File(replicationFile.getPath(), String.format("%s%s%s",pluginDirectory.getName(),File.separator,resource.getName()));
										///resource.renameTo(fillfile);
									}
								} catch (Exception e) {
									e.printStackTrace();
								}
							}
						}												
					}
					File pluginDirectoryPlugin = new File(pluginDirectory, "plugin.xml");
					if (pluginDirectoryPlugin != null)
					{	        					
						String strFileContents = Util.getStringFromFile(pluginDirectoryPlugin);
						if (strFileContents.length() == 0)
						{
							error = String.format("definicion de plugin.xml en %s esta vacia", file.getAbsolutePath());
							return error;
						}

						Hashtable extensionlist = new Hashtable();
						Hashtable servletlist = new Hashtable();						
						Hashtable formlist= new Hashtable();
						HashMap Properties = new HashMap();
						HashMap directory = new HashMap();
						BufferedInputStream buf = null;
						try {
							buf = new BufferedInputStream(new FileInputStream(pluginDirectoryPlugin));
						} catch (Exception e) {
							//String err = e.getMessage();
							//if (err == null) {
							//	err = "nullpointer";
							//}
							error = e.getMessage();
							new XendrianServer().setServlet("store").addMessage(String.format("error %s in %s\n", error, pluginDirectoryPlugin));
						}
						HashMap map = new ExtensionXMLParser().parsePlugin(file.getName(), buf);
						if (map != null) {
							PluginMetadata pluginMetadata = (PluginMetadata) map.get("metadata");
							//							Vector menu = (Vector) map.get("menu");
							//							addglobalmenu(menu);
							//							Vector menutrl = (Vector) map.get("menutrl");
							//							addglobalmenutrl(menutrl);
							extensionlist = (Hashtable) map.get(Constants.XML_ELEMENT_EXTENSIONLIST);
							server = (Hashtable) map.get("server");
							servletlist = (Hashtable) map.get("servletlist");
							directory = (HashMap) map.get("directory");
							Properties = (HashMap) map.get(Constants.XML_ELEMENT_PROPERTIES);
							if (Properties == null) {
								Properties = new HashMap();
							}							
							Properties.put("directory", pluginDirectoryPlugin.getParent());
							formlist = (Hashtable) map.get("form");
							if (plugin == null)
								plugin = new X_AD_Plugin(Env.getCtx(),0, null);
							plugin.setName(pluginMetadata.getName());
							plugin.setDescription(pluginMetadata.getDescription());
							plugin.setFileName(file.getName());
							plugin.setFileSize((int) file.length());
							plugin.setFolder(foldername);				
							plugin.setProperties(Properties);
							plugin.setplugin(strFileContents);
							plugin.setID(pluginMetadata.getId());
							plugin.setCategoryName(pluginMetadata.getCategory());
							plugin.setAccessLevel(REF_AD_TableAccessLevels.SystemPlusClient);
							plugin.setVersion(new BigDecimal(pluginMetadata.getVersion()));
							plugin.setSynchronized(pluginMetadata.getSynchronized());
							if (plugin.save())
							{    
								List<X_AD_Config> configs = new Query(Env.getCtx(), X_AD_Config.Table_Name, "AD_Plugin_ID = ?", null)
									.setParameters(plugin.getAD_Plugin_ID()).list();
								for (X_AD_Config config:configs) {
									config.delete(true);
								}
								File pluginResource = new File(pluginDirectory, "fill");
								if (pluginResource != null && pluginResource.exists())
								{
									try {
										if (pluginResource.listFiles().length > 0) {
											//SyncModel.getInstance().parsereplicatefile(fillfile);
											//SyncModel.getInstance().SyncronizeLight();
											SyncModel.getInstance().setModeServer();
											SyncModel.getInstance().SyncronizeFull("");
											//SyncModel.getInstance().Replication();
										}										
									} catch (Exception e) {
										e.printStackTrace();
									}
									for (final File resource : pluginResource.listFiles()) {
										if (resource.isFile()) {
											try {
												File fillfile = new File(Env.getMachine().getReplicationFolder(), pluginDirectory.getName());
												new XendrianServer().setServlet("store").addMessage(String.format("fill %s\n", fillfile.getName()));
												if (!fillfile.exists()) {
													if (!fillfile.mkdirs()) {
														throw new Exception(String.format("can't create %s , check write permissions ", fillfile.getAbsolutePath()));
													}
												}				
												fillfile = new File(Env.getMachine().getReplicationFolder(), String.format("%s%s%s",pluginDirectory.getName(),File.separator,resource.getName()));
												resource.renameTo(fillfile);
												error = SyncModel.getInstance().parsereplicatefile(plugin.getFileName(), fillfile);
												if (error.length() > 0) {
													new XendrianServer().setServlet("store").addMessage(error);
												}
											} catch (Exception e) {
												e.printStackTrace();
											}										
										}
									}
								}								
								plugin.setIsInstalled(plugininstalled);
								if (plugin.save())
								{
									StringBuilder pluginpath = new StringBuilder(Env.getMachine().getPluginsFolder().toString());
									pluginpath.append(File.separator).append(pluginMetadata.getId());
									Util.addPath(pluginpath.toString());
								}								
								//								if (!complete)
								//								{
								//									Server.getInstance().UpdateXendra();
								//								}
								File pluginPrintDocumentFormats = new File(pluginDirectory, "printdocumentformat");
								if (pluginPrintDocumentFormats != null && pluginPrintDocumentFormats.exists())
								{
									for (final File printdocumentformat : pluginPrintDocumentFormats.listFiles()) {
										if (printdocumentformat.isFile()) {
											BufferedInputStream bufpdf = null;
											try {
												bufpdf = new BufferedInputStream(new FileInputStream(printdocumentformat));
											} catch (Exception e) {
												String err = e.getMessage();
												if (err == null) {
													err = "nullpointer";
												}
												new XendrianServer().setServlet("store").addMessage(error);
											}
											PrintFormatXMLParser pf = new PrintFormatXMLParser(plugin).setForce(force.equals("Y"));
											String err = pf.parseFormat(bufpdf);
											if (err.length() > 0) {
												new XendrianServer().setServlet("store").addMessage(String.format("error %s in %s\n", err, printdocumentformat.getName()));
											} else {
												new XendrianServer().setServlet("store").addMessage(String.format("printdocumentformat %s\n", printdocumentformat.getName()));
											}
										}									
									}
								}								
								File pluginrules = new File(pluginDirectory, "rules");
								if (pluginrules != null && pluginrules.exists())
								{										
									File groups =  new File(pluginrules, "groups.xml");
									if (groups.exists()) {
										BufferedInputStream bufgroups = null;
										try {
											bufgroups = new BufferedInputStream(new FileInputStream(groups));
										} catch (Exception e) {
											String err = e.getMessage();
											if (err == null) {
												err = "nullpointer";
											}
											new XendrianServer().setServlet("store").addMessage(String.format("error %s in %s\n", err, groups.getAbsoluteFile()));
										}
										new RuleXMLParser(plugin).parseGroups(bufgroups);
										groups.delete();
									}
									for (final File rule : pluginrules.listFiles()) {
										if (rule.isFile()) {
											log.log(Level.WARNING, String.format("parsing rule %s",rule.getAbsoluteFile()));
											BufferedInputStream bufrule = null;
											try {
												bufrule = new BufferedInputStream(new FileInputStream(rule));
											} catch (Exception e) {
												String err = e.getMessage();
												if (err == null) {
													err = "nullpointer";
												}
												new XendrianServer().setServlet("store").addMessage(String.format("error %s in %s\n", err, rule.getAbsoluteFile()));
											}
											String result = new RuleXMLParser(plugin).setForce(force.equals("Y")).parseFormat(bufrule);
											new XendrianServer().setServlet("store").addMessage(String.format("rule %s %s\n", rule.getName(), result));
										}									
									}
								}										
								File pluginmessages = new File(pluginDirectory, "messageformat");
								if (pluginmessages != null && pluginmessages.exists()) {
									for (final File messageformat : pluginmessages.listFiles()) {
										if (messageformat.isFile()) {
											log.log(Level.WARNING, String.format("parsing messageformat %s", messageformat.getAbsoluteFile()));
											BufferedInputStream bufmessage = null;
											try {
												bufmessage = new BufferedInputStream(new FileInputStream(messageformat));
											} catch (Exception e) {
												String err = e.getMessage();
												if (err == null) {
													err = "nullpointer";
												}
												new XendrianServer().setServlet("store").addMessage(String.format("error %s in %s\n", err, messageformat.getAbsoluteFile()));
											}
											new MessageFormatParser(plugin).setForce(force.equals("Y")).parserFormat(bufmessage);
											new XendrianServer().setServlet("store").addMessage(String.format("messageformat %s\n", messageformat.getName()));
										}
									}
								}
								File pluginReports = new File(pluginDirectory, "report");
								if (pluginReports != null && pluginReports.exists())
								{
									Document menuit = null;
									String menuitem = (String) map.get(Constants.XML_ELEMENT_MENUITEM);
									if (menuitem != null) {
										menuitem = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n"+menuitem;
										try {
											InputStream stream = new ByteArrayInputStream(menuitem.getBytes("UTF-8"));										
											SAXBuilder builder=new SAXBuilder();
											menuit=builder.build(stream);
										} catch (Exception e) {
											String err = e.getMessage();
											if (err == null) {
												err = "nullpointer";
											}
											new XendrianServer().setServlet("store").addMessage(String.format("error %s in %s\n", err, menuitem));
										}
									}
									for(final File report:pluginReports.listFiles()) {
										if (report.isFile()) {
											log.log(Level.WARNING, String.format("processing %s from plugin", report.getName()));
											BufferedInputStream bufrule = null;
											try {
												bufrule = new BufferedInputStream(new FileInputStream(report));
											} catch (Exception e) {
												String err = e.getMessage();
												if (err == null) {
													err = "nullpointer";
												}
												new XendrianServer().setServlet("store").addMessage(String.format("error %s in %s\n", err, report.getAbsoluteFile()));
											}
											new ReportXMLParser(plugin, menuit).setForce(force.equals("Y")).parserFormat(bufrule);
											new XendrianServer().setServlet("store").addMessage(String.format("report %s\n", report.getName()));
										}
									}				
									X_AD_Menu m = new Query(Env.getCtx(), X_AD_Menu.Table_Name, "Anchor = ?", null)
									.setParameters("REPORTS").first();
									if (m != null) {
										createreportmenu(m, menuit.getRootElement());
									}
								}	
								if (formlist != null)
								{
									for (Iterator it = formlist.entrySet().iterator(); it.hasNext();)
									{
										Map.Entry entry = (Map.Entry) it.next();
										String id = (String) entry.getKey();
										ExtensionForm form = (ExtensionForm) entry.getValue();
										List<ExtensionFormTrl> listfrmtrl = form.getTrl();
										X_AD_Form dbform = new Query(Env.getCtx(), X_AD_Form.Table_Name, "Identifier = ?", null)
										.setParameters(form.getIdentifier()).first();
										if (dbform == null) {
											dbform = new Query(Env.getCtx(), X_AD_Form.Table_Name, "classname = ?", null)
											.setParameters(form.getClassname()).first();
											if (dbform != null) {
												dbform.setIdentifier(form.getIdentifier());
												dbform.save();
											}
										}
										if (dbform == null) {
											dbform = new X_AD_Form(Env.getCtx(), 0, null);
											dbform.setName(form.getName());
											dbform.setDescription(form.getDescription());
											dbform.setClassname(form.getClassname());
											dbform.setAccessLevel(form.getAccesslevel());
											dbform.setIdentifier(form.getIdentifier());
											dbform.setEntityType(form.getEntityType());
											dbform.setSynchronized(form.getSynchro());
											dbform.setAD_Plugin_ID(plugin.getAD_Plugin_ID());
											dbform.setID(pluginMetadata.getId());
											dbform.save();
										}
										for (ExtensionFormTrl frmtrl:listfrmtrl) {
											UpdatePO po = new UpdatePO();
											po.setTablename("AD_Form_TRL");
											po.setField("Name", frmtrl.getName());
											po.setField("Description", frmtrl.getDescription());
											po.setField("Help", frmtrl.getHelp());
											po.setField("IsTranslated", Constants.YES);
											po.setField(X_AD_Form.COLUMNNAME_AD_Form_ID, dbform.getAD_Form_ID());												
											if (po.update(String.format("AD_Form_ID=%s AND ad_language='%s'",dbform.getAD_Form_ID(), frmtrl.getLang()), null) == 0) {
												po.setField("AD_Language", frmtrl.getLang());
												int no = po.insert(null);
											}
										}
									}
								}
								if (globalmenu != null && globalmenu.size() > 0)
								{
									setupmenu(globalmenu, globalmenutrl);
								}
								if (servletlist != null)
								{
									for (Iterator it = servletlist.entrySet().iterator(); it.hasNext();)
									{
										Map.Entry entry = (Map.Entry) it.next();
										String id = (String) entry.getKey();	
										Vector props = (Vector) entry.getValue();
										ServletMetadata sm = (ServletMetadata) props.get(0);
										X_AD_ServletList el = new Query(Env.getCtx(), X_AD_ServletList.Table_Name, "id = ?", null)
										.setParameters(id).first();
										if (el == null)
											el = new X_AD_ServletList(Env.getCtx(), 0, null);
										el.setAD_Plugin_ID(plugin.getAD_Plugin_ID());
										el.setName(sm.getContainername());
										el.setcontext(sm.getContainercontext());
										el.setID(id);
										if (el.save())
										{
											//Vector props = (Vector) entry.getValue();
											Iterator v = props.iterator();
											while (v.hasNext())
											{
												//ServletMetadata 
												sm = (ServletMetadata) v.next();
												X_AD_Servlet servlet = new Query(Env.getCtx(), X_AD_Servlet.Table_Name, "ad_servletlist_id = ? AND classname = ?", null)
												.setParameters(el.getAD_ServletList_ID(), sm.getClassname()).first();
												if (servlet == null)
												{
													servlet = new X_AD_Servlet(Env.getCtx(), 0, null);
													servlet.setAD_ServletList_ID(el.getAD_ServletList_ID());												
												}
												servlet.setName(sm.getName());
												servlet.setClassname(sm.getClassname());
												servlet.setMapping(sm.getMapping());
												servlet.save();											
											}
										}
									}
								}
								if (extensionlist != null) 
								{
									for (Iterator it = extensionlist.entrySet().iterator(); it.hasNext();)
									{
										Map.Entry entry = (Map.Entry) it.next();
										String id = (String) entry.getKey();
										X_AD_ExtensionList el = new Query(Env.getCtx(), X_AD_ExtensionList.Table_Name, "id = ?", null)
										.setParameters(id).first();
										if (el == null)
											el = new X_AD_ExtensionList(Env.getCtx(), 0, null);
										el.setID(id);
										if (el.save())
										{
											Vector props = (Vector) entry.getValue();	
											Iterator v = props.iterator();
											while (v.hasNext())
											{
												ExtensionMetadata em = (ExtensionMetadata) v.next();
												X_AD_Extension ext = new Query(Env.getCtx(), X_AD_Extension.Table_Name, "id = ? ", null)
												.setParameters(em.getId()).first();
												if (ext == null)
													ext = new X_AD_Extension(Env.getCtx(), 0, null);
												ext.setID(em.getId());
												ext.setAD_ExtensionList_ID(el.getAD_ExtensionList_ID());
												ext.setAD_Plugin_ID(plugin.getAD_Plugin_ID());
												ext.setClassname(em.getClassname());	
												ext.save();
											}
										}
									}
								}
								if (directory != null && directory.size() > 0) {
									Iterator it = directory.keySet().iterator();
									while (it.hasNext()) {
										String key = (String) it.next();
										String location = (String) directory.get(key);
										File dirplugins = Env.getMachine().getPluginsFolder();
										Path destination = Paths.get(dirplugins.getPath(), location);
										if (destination.toFile().exists()) {
											Date curDate = new Date();
											SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmm");
											String oldname = sdf.format(curDate);
											oldname += key;
											File destfile = new File(Env.getMachine().getTrashFolder(), oldname);
											if (destination.toFile().renameTo(destfile)) {

											}																				
										}
										File source = new File(pluginDirectory, key);
										if (source.renameTo(destination.toFile())) {

										}										
									}
								}
							} else {
								log.log(Level.WARNING, String.format("plugin %s can't be save (check constraints)", plugin.getName()));
								error = DB.getLastError();
								if (error == null)
									error = "";
								if (error.length() == 0)
									error = String.format("plugin %s can't be save (check constraints)", plugin.getName());
							}
						}
					}
				}		            	
			}				
			//			if (plugin != null && !getClass().getPackage().getName().equals(plugin.getID()))
			//			{
			//				// al pertenecer al package del core
			//				// actualizamos la libreria y al finalizar reiniciamos
			//				URL location = getClass().getResource('/'+getClass().getName().replace('.', '/')+".class");
			//				System.out.println(location);
			//			}
			//File destfile = new File(installedfile.getPath(), file.getName());
			File destfile = new File(Env.getMachine().getInstalledFolder(), file.getName());
			if (file.renameTo(destfile))
			{

			}
		}	
		return error;
	}
	private void createreportmenu(X_AD_Menu m, Element node) {
		X_AD_TreeNodeMM mm = new Query(Env.getCtx(), X_AD_TreeNodeMM.Table_Name, "node_id = ?",null)
		.setParameters(m.getAD_Menu_ID()).first(); // anchor

		X_AD_Menu item = null;
		String name = node.getAttributeValue("Name");
		if (name == null) {
			name = "";
		}
		String processid = node.getAttributeValue(X_AD_Process.COLUMNNAME_AD_Process_ID);
		if (processid == null) {
			processid = "";
		}
		String baseroles = node.getAttributeValue(X_AD_RoleType.COLUMNNAME_BaseRole);
		if (baseroles == null) {
			baseroles = "";
		}
		X_AD_Process p = null;
		if (processid.length() > 0) {
			p = new Query(Env.getCtx(), X_AD_Process.Table_Name, "AD_Process_ID = ?", null)
			.setParameters(Integer.valueOf(processid)).first();
			if (p != null) {
				name = p.getName();
				if (baseroles.length() > 0) {
					List<Integer> roles = new ArrayList<Integer>();
					StringTokenizer st = new StringTokenizer(baseroles, ",", false);
					while (st.hasMoreTokens())
					{
						String token = st.nextToken().trim();
						List<X_AD_RoleType> types = new Query(Env.getCtx(), X_AD_RoleType.Table_Name, "BASEROLE = ?", null)
						.setParameters(token).list();
						for (X_AD_RoleType type:types) {
							if (!roles.contains(type.getAD_Role_ID())) {
								roles.add(type.getAD_Role_ID());
							}	
						} 								
					}
					for (Integer role:roles) {
						X_AD_Process_Access access = new Query(Env.getCtx(), X_AD_Process_Access.Table_Name, "AD_Role_ID = ? AND AD_Process_ID = ?", null)
						.setParameters(role, p.getAD_Process_ID()).first();
						if (access == null) {
							access = new X_AD_Process_Access(Env.getCtx(), 0, null);
							access.setAD_Process_ID(p.getAD_Process_ID());
							access.setAD_Role_ID(role);
							access.save();
						}
					}
				}				
			}
		}		
		List<X_AD_TreeNodeMM> mms = new Query(Env.getCtx(), X_AD_TreeNodeMM.Table_Name, "parent_id = ?", null)
		.setParameters(mm.getNode_ID()).list();		
		for (X_AD_TreeNodeMM n:mms) {
			X_AD_Menu childmenu = new Query(Env.getCtx(), X_AD_Menu.Table_Name, "AD_Menu_ID = ?", null)
			.setParameters(n.getNode_ID()).first();
			if (childmenu != null) {
				System.out.println(childmenu.getName());	
				if (name.equals(childmenu.getName())) {
					item = childmenu;
					break;
				}
			}
		}		
		if (item == null) {
			String seqno = node.getAttributeValue(X_AD_TreeNodeMM.COLUMNNAME_SeqNo);
			if (seqno == null) {
				seqno = "0";
			}
			if (p != null) {
				item = new X_AD_Menu(Env.getCtx(), 0, null);
				item.setName(name);
				new XendrianServer().setServlet("store").addMessage(String.format("add menu %s to process %s \n", name, p.getName()));
				item.setDescription(p.getDescription());
				item.setIsSummary(false);				
				item.setIsSOTrx(false);
				item.setIsReadOnly(false);
				item.setEntityType(p.getEntityType());
				item.setAD_Process_ID(p.getAD_Process_ID());
				item.setAction(REF_AD_MenuAction.Report);				
			} else {
				String summary = node.getAttributeValue(X_AD_Menu.COLUMNNAME_IsSummary);
				String issotrx = node.getAttributeValue(X_AD_Menu.COLUMNNAME_IsSOTrx);
				String isreadonly = node.getAttributeValue(X_AD_Menu.COLUMNNAME_IsReadOnly);
				String EntityType = node.getAttributeValue(X_AD_Menu.COLUMNNAME_EntityType);
				if (summary!=null && issotrx != null && isreadonly != null && EntityType != null) {
					item = new X_AD_Menu(Env.getCtx(), 0, null);
					item.setName(name);					
					new XendrianServer().setServlet("store").addMessage(String.format("add menu %s\n", name));	
					item.setIsSummary(node.getAttributeValue(X_AD_Menu.COLUMNNAME_IsSummary).equals("Y"));
					item.setIsSOTrx(node.getAttributeValue(X_AD_Menu.COLUMNNAME_IsSOTrx).equals("Y"));
					item.setIsReadOnly(node.getAttributeValue(X_AD_Menu.COLUMNNAME_IsReadOnly).equals("Y"));
					item.setEntityType(node.getAttributeValue(X_AD_Menu.COLUMNNAME_EntityType));									
				}
			}
			if (item!= null && item.save()) {
				new XendrianServer().setServlet("store").addMessage(String.format("try to add node %s to menu... \n", item.getName()));
				if (MTree_Base.addNode(Env.getCtx(), REF_AD_TreeTypeType.Menu, item.getAD_Menu_ID(),  null))
				{
					new XendrianServer().setServlet("store").addMessage(String.format("node to menu %s is added... \n", item.getName()));
					String sqlinsert = String.format("UPDATE AD_TreeNodeMM set Parent_ID = %s, SeqNo= %s WHERE Node_ID = %s", m.getAD_Menu_ID(), seqno, item.getAD_Menu_ID());
					int no = DB.executeUpdate(sqlinsert, null);
				}			
			}
		}
		if (item!= null) {
			List childrens = node.getChildren();
			for (int i = 0; i < childrens.size(); i++) {
				Element currentNode = (Element) childrens.get(i);
				createreportmenu(item, currentNode);
			}
		}
	}
	//	private void createreportmenu2(Element node) {
	//		String Menu_ID = node.getAttributeValue("AD_Menu_ID");
	//		if (Menu_ID == null) {
	//			Menu_ID = "";
	//		}					
	//
	//		List childrens = node.getChildren();
	//		for (int i = 0; i < childrens.size(); i++) {
	//			Element currentNode = (Element) childrens.get(i);
	//			createreportmenu2(currentNode);
	//		}
	//	}

	//	private void addglobalmenutrl(Vector menutrl) {
	//		if (menutrl == null)
	//			return;
	//		for (Iterator it = menutrl.iterator(); it.hasNext();)			
	//		{
	//			ExtensionMenuItemTrl vector = (ExtensionMenuItemTrl) it.next();
	//			globalmenutrl .add(vector);
	//		}		
	//	}
	//
	//	private void addglobalmenu(Vector menu) {		
	//		if (menu == null)
	//			return;
	//		for (Iterator it = menu.iterator(); it.hasNext();)			
	//		{
	//			ExtensionMenuItem vector = (ExtensionMenuItem) it.next();
	//			globalmenu.add(vector);
	//		}		
	//	}

	private void setupmenu(Vector menu, Vector menutrl) {
		X_AD_Menu dbmenu = null;
		for (Iterator it = menu.iterator(); it.hasNext();)
		{				
			ExtensionMenuItem pmenuitem = (ExtensionMenuItem) it.next();
			//			if (pmenuitem.getAD_Process_ID().length() > 0)
			//			{
			//				X_AD_Process process = new Query(Env.getCtx(), X_AD_Process.Table_Name, "Identifier = ?", null)
			//				.setParameters(pmenuitem.getAD_Process_ID()).first();
			//				if (process == null)
			//				{
			//					continue;
			//				}
			//			}
			//			else if (pmenuitem.getAD_Form_ID().length() > 0)
			//			{			
			//				X_AD_Form form = new Query(Env.getCtx(), X_AD_Form.Table_Name, "Identifier = ?", null)
			//				.setParameters(pmenuitem.getAD_Form_ID()).first();
			//				if (form == null)
			//				{
			//					continue;
			//				}
			//			}			
			//if (pmenuitem.getIdentifier().equals(menuitem.getIdentifier()))
			//{
			Timestamp menusync = pmenuitem.getSynchronized();
			dbmenu = new Query(Env.getCtx(), X_AD_Menu.Table_Name, "identifier = ?", null)
			.setParameters(pmenuitem.getIdentifier()).first();
			if (dbmenu == null)
			{
				dbmenu = new Query(Env.getCtx(), X_AD_Menu.Table_Name, "AD_Menu_ID = ?", null)
				.setParameters(pmenuitem.getAD_Menu_ID()).first();
				if (dbmenu != null) {
					dbmenu.setIdentifier(pmenuitem.getIdentifier());
					dbmenu.save();
				}
			}
			if (dbmenu == null)	{
				dbmenu = new X_AD_Menu(Env.getCtx(), 0 , null);
				dbmenu.setIdentifier(pmenuitem.getIdentifier());						
			}
			else {
				if (!dbmenu.isActive()) {
					dbmenu.setIsActive(true);
					dbmenu.save();
				}
			}
			if (dbmenu.getSynchronized() == null || menusync.compareTo(dbmenu.getSynchronized()) != 0)
			{
				dbmenu.setName(pmenuitem.getName());
				dbmenu.setDescription(pmenuitem.getDescription());
				dbmenu.setIsSummary(pmenuitem.getIsSummary());
				dbmenu.setIsSOTrx(pmenuitem.getIsSOTrx());
				dbmenu.setIsReadOnly(pmenuitem.getIsReadOnly());			
				if (pmenuitem.getAction().length() > 0)
					dbmenu.setAction(pmenuitem.getAction());					
				if (pmenuitem.getAD_Form_ID().length() > 0)
				{
					X_AD_Form dbform = new Query(Env.getCtx(), X_AD_Form.Table_Name, "Identifier = ?", null)
					.setParameters(pmenuitem.getAD_Form_ID()).first();
					if (dbform != null)
					{
						dbmenu.setAD_Form_ID(dbform.getAD_Form_ID());		
					}
				}	
				else if (pmenuitem.getAD_Process_ID().length() > 0)
				{
					X_AD_Process dbprocess = new Query(Env.getCtx(), X_AD_Process.Table_Name, "Identifier = ?", null)
					.setParameters(pmenuitem.getAD_Process_ID()).first();
					if (dbprocess != null)
					{
						dbmenu.setAD_Process_ID(dbprocess.getAD_Process_ID());
					}
				}
				dbmenu.setEntityType(pmenuitem.getEntityType());															
				dbmenu.setSynchronized(menusync);
				dbmenu.save();
			}
		}
		X_AD_TreeNodeMM mm = null;
		for (Iterator it = menu.iterator(); it.hasNext();)
		{
			ExtensionMenuItem pmenuitem = (ExtensionMenuItem) it.next();


			dbmenu = new Query(Env.getCtx(), X_AD_Menu.Table_Name, "Identifier = ?", null)
			.setParameters(pmenuitem.getIdentifier()).first();
			if (dbmenu == null)	{
				String formid = pmenuitem.getAD_Form_ID();
				X_AD_Form form = new Query(Env.getCtx(), X_AD_Form.Table_Name, "Identifier = ?", null)
				.setParameters(formid).first();
				if (form != null) {
					dbmenu = new Query(Env.getCtx(), X_AD_Menu.Table_Name, "AD_Form_ID = ?", null)
					.setParameters(form.getAD_Form_ID()).first();					
				}				
			}
			if (dbmenu == null) {
				String parentid = pmenuitem.getParent_ID();
				X_AD_Menu parentmenu = new Query(Env.getCtx(), X_AD_Menu.Table_Name, "Identifier = ?", null)
				.setParameters(parentid).first();
				if (parentmenu != null) {
					dbmenu = new X_AD_Menu(Env.getCtx(), 0, null);

				}
			}
			mm = new Query(Env.getCtx(), X_AD_TreeNodeMM.Table_Name, "node_id = ?",null)
			.setParameters(dbmenu.getAD_Menu_ID()).first();
			if (mm == null)
			{																				
				if (MTree_Base.addNode(Env.getCtx(), REF_AD_TreeTypeType.Menu, dbmenu.getAD_Menu_ID(), null))
				{
					mm = new Query(Env.getCtx(), X_AD_TreeNodeMM.Table_Name, "node_id = ?",null)
					.setParameters(dbmenu.getAD_Menu_ID()).first();									
				}
			}
			if (pmenuitem.getParent_ID().length() > 0)
			{
				X_AD_Menu parentitem = new Query(Env.getCtx(), X_AD_Menu.Table_Name, "identifier = ?", null)
				.setParameters(pmenuitem.getParent_ID()).first();
				mm.setParent_ID(parentitem.getAD_Menu_ID());
				//mm.save();
				int no = 0;
				int count = DB.getSQLValue(null, "SELECT count(*) from AD_TreeNodeMM where parent_id = ? and exists(select 1 from ad_menu where ad_menu_id = node_id)", parentitem.getAD_Menu_ID());
				if (count > 0)
				{
					no = DB.getSQLValue(null, "SELECT MAX(seqno) from AD_TreeNodeMM where parent_id = ? and exists(select 1 from ad_menu where ad_menu_id = node_id)", parentitem.getAD_Menu_ID());
					no++;
				}						
				mm.setSeqNo(no);				
				mm.save();									
			}				
			//if (mm != null)
			//{
			//}
		}		
		for (Iterator it = menutrl.iterator(); it.hasNext();)
		{
			ExtensionMenuItemTrl trl = (ExtensionMenuItemTrl) it.next();											
			if (trl.getIdentifier().equals(dbmenu.getIdentifier()))
			{
				String sqlupdate = String.format("UPDATE %s_trl set %s='%s' WHERE %s=%s AND ad_language='%s'",
						X_AD_Menu.Table_Name,trl.getColumnName(),trl.getTranslate(),X_AD_Menu.COLUMNNAME_AD_Menu_ID, dbmenu.getAD_Menu_ID(),trl.getLang());
				int no = DB.executeUpdate(sqlupdate, null);														
				if (no == 0)
				{
					String sqlinsert = String.format("INSERT INTO %s_trl (%s_ID,AD_Client_ID, AD_Org_ID, createdby,created, updatedby, updated,%s,ad_language) values (%s,0,0,0,now(),0,now(),%s,'%s')",
							X_AD_Menu.Table_Name,X_AD_Menu.Table_Name,trl.getColumnName(),dbmenu.getAD_Menu_ID(),trl.getTranslate(),trl.getLang());
					no = DB.executeUpdate(sqlinsert, null);
					if (no < 0)
					{
						System.out.println("X");
					}								
				}							
			}
		}		
	}

	private void setupmenu2(ExtensionMenuItem menuitem, Vector menu, Vector menutrl) {
		int parentid = 0;
		X_AD_TreeNodeMM mm = null;
		if (menuitem.getAD_Process_ID().length() > 0)
		{
			X_AD_Process process = new Query(Env.getCtx(), X_AD_Process.Table_Name, "Identifier = ?", null)
			.setParameters(menuitem.getAD_Process_ID()).first();
			if (process == null)
			{
				return;		
			}
		}
		else if (menuitem.getAD_Form_ID().length() > 0)
		{
			X_AD_Form form = new Query(Env.getCtx(), X_AD_Form.Table_Name, "Identifier = ?", null)
			.setParameters(menuitem.getAD_Form_ID()).first();
			if (form == null)
			{
				return;
			}
		}
		List<ExtensionMenuItem> items = new ArrayList<ExtensionMenuItem>();
		String menuid = menuitem.getIdentifier();
		if  (menu.size() > 0)
		{
			while (menuid.length() > 0) 
			{
				for (Iterator it = menu.iterator(); it.hasNext();)
				{
					ExtensionMenuItem pmenuitem = (ExtensionMenuItem) it.next();											
					if (pmenuitem.getIdentifier().equals(menuid))
					{
						items.add(pmenuitem);
						menuid = pmenuitem.getParent_ID();
						it.remove();
						break;
					}
				}						
			}
		}
		for (int i = 1; i < 10; i ++)
		{
			for (ExtensionMenuItem item:items)
			{
				if (item.getLevel() == i)
				{
					X_AD_Menu dbmenu = new Query(Env.getCtx(), X_AD_Menu.Table_Name, "identifier = ?", null)
					.setParameters(item.getIdentifier()).first();
					if (dbmenu == null)
					{
						dbmenu = new Query(Env.getCtx(), X_AD_Menu.Table_Name, "name = ?", null)
						.setParameters(item.getName()).first();
						if (dbmenu != null)
						{
							dbmenu.setIdentifier(item.getIdentifier());
							dbmenu.setSynchronized(null);
						}											
						if (dbmenu == null)
						{
							dbmenu = new X_AD_Menu(Env.getCtx(), 0 , null);
							dbmenu.setIdentifier(item.getIdentifier());
						}
						//
					}
					Timestamp menusync = item.getSynchronized();
					if (dbmenu.getSynchronized() == null || menusync.compareTo(dbmenu.getSynchronized()) != 0)
					{
						dbmenu.setName(item.getName());
						dbmenu.setDescription(item.getDescription());
						dbmenu.setIsSummary(item.getIsSummary());
						dbmenu.setIsSOTrx(item.getIsSOTrx());
						dbmenu.setIsReadOnly(item.getIsReadOnly());			
						if (item.getAction().length() > 0)
							dbmenu.setAction(item.getAction());					
						if (item.getAD_Process_ID().length() > 0)
						{
							X_AD_Process process = new Query(Env.getCtx(), X_AD_Process.Table_Name, "Identifier = ?", null)
							.setParameters(item.getAD_Process_ID()).first();
							if (process != null)
							{
								dbmenu.setAD_Process_ID(process.getAD_Process_ID());		
							}
						}					
						dbmenu.setEntityType(item.getEntityType());															
						dbmenu.setSynchronized(menusync);
						dbmenu.save();
					}											
					String keytrl = String.format("%s_trl", X_AD_Menu.COLUMNNAME_AD_Menu_ID);
					ExtensionMenuItemTrl trl = null;
					for (Iterator it = menutrl.iterator(); it.hasNext();)
					{
						if (trl.getIdentifier().equals(dbmenu.getIdentifier()))
							trl = (ExtensionMenuItemTrl) it.next();											
						{
							String sqlupdate = String.format("UPDATE %s_trl set %s='%s' WHERE %s=%s AND ad_language='%s'",
									X_AD_Menu.Table_Name,trl.getColumnName(),trl.getTranslate(),X_AD_Menu.COLUMNNAME_AD_Menu_ID, dbmenu.getAD_Menu_ID(),trl.getLang());
							int no = DB.executeUpdate(sqlupdate, null);														
							if (no == 0)
							{
								String sqlinsert = String.format("INSERT INTO %s_trl (%s_ID,AD_Client_ID, AD_Org_ID, createdby,created, updatedby, updated,%s,ad_language) values (%s,0,0,0,now(),0,now(),%s,'%s')",
										X_AD_Menu.Table_Name,X_AD_Menu.Table_Name,trl.getColumnName(),dbmenu.getAD_Menu_ID(),trl.getTranslate(),trl.getLang());
								no = DB.executeUpdate(sqlinsert, null);
								if (no < 0)
								{
									System.out.println("X");
								}								
							}							
						}
					}
					if (trl != null)						
					{
						menutrl.remove(trl);
					}
					mm = new Query(Env.getCtx(), X_AD_TreeNodeMM.Table_Name, "node_id = ?",null)
					.setParameters(dbmenu.getAD_Menu_ID()).first();
					if (mm == null)
					{																				
						if (MTree_Base.addNode(Env.getCtx(), REF_AD_TreeTypeType.Menu, dbmenu.getAD_Menu_ID(), null))
						{
							mm = new Query(Env.getCtx(), X_AD_TreeNodeMM.Table_Name, "node_id = ?",null)
							.setParameters(dbmenu.getAD_Menu_ID()).first();
						}
					}	
					int parent = 0;
					if (item.getParent_ID().length() > 0)
					{
						X_AD_Menu parentitem = new Query(Env.getCtx(), X_AD_Menu.Table_Name, "identifier = ?", null)
						.setParameters(item.getParent_ID()).first();
						if (parentitem != null)
						{
							parent = parentitem.getAD_Menu_ID();
						}
						mm.setParent_ID(parentitem.getAD_Menu_ID());
					}
					int no = 0;
					int count = DB.getSQLValue(null, "SELECT count(*) from AD_TreeNodeMM where parent_id = ? and exists(select 1 from ad_menu where ad_menu_id = node_id)", parent);
					if (count > 0)
					{
						no = DB.getSQLValue(null, "SELECT MAX(seqno) from AD_TreeNodeMM where parent_id = ? and exists(select 1 from ad_menu where ad_menu_id = node_id)", parent);
						no++;
					}						
					mm.setSeqNo(no);				
					mm.save();
				}
			}
		}
	}

	private String getContent(File hornetqfile) {
		StringBuilder  content = new StringBuilder();
		try {
			BufferedReader reader = null;
			reader = new BufferedReader( new FileReader (hornetqfile));
			String         line = null;		
			String         ls = System.getProperty("line.separator");

			while( ( line = reader.readLine() ) != null ) {
				content.append( line );
				content.append( ls );
			}
			reader.close();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		return content.toString();
	}

	public static Plugin getInstance() {
		if (m_plugin == null)
			m_plugin = new Plugin();
		return m_plugin;
	}

	public void afterReplication() {
		
	}
}
