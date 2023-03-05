package org.xendra.console;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;

import org.compiere.model.Query;
import org.compiere.model.persistence.X_A_MachineServer;
import org.compiere.model.reference.REF_ServerType;
import org.compiere.util.Env;
import org.xendra.xendrian.SyncModel;

import com.googlecode.lanterna.TextColor;
import com.googlecode.lanterna.gui2.BasicWindow;
import com.googlecode.lanterna.gui2.Borders;
import com.googlecode.lanterna.gui2.DefaultWindowManager;
import com.googlecode.lanterna.gui2.EmptySpace;
import com.googlecode.lanterna.gui2.GridLayout;
import com.googlecode.lanterna.gui2.Label;
import com.googlecode.lanterna.gui2.MultiWindowTextGUI;
import com.googlecode.lanterna.gui2.Panel;
import com.googlecode.lanterna.gui2.ProgressBar;
import com.googlecode.lanterna.gui2.Window;
import com.googlecode.lanterna.gui2.dialogs.MessageDialogBuilder;
import com.googlecode.lanterna.gui2.dialogs.MessageDialogButton;
import com.googlecode.lanterna.screen.Screen;

public class Xendrian {

	private static Xendrian instance;

	public void synchroreset(Screen screen) {
		final MultiWindowTextGUI gui = new MultiWindowTextGUI(screen, new DefaultWindowManager(), new EmptySpace(TextColor.ANSI.DEFAULT));
		final BasicWindow window = new BasicWindow();
		final Label status = new Label("/");
		window.setHints(Arrays.asList(Window.Hint.FULL_SCREEN));

		MessageDialogButton answerreset = new MessageDialogBuilder()
		.setTitle("Confirm")
		.setText("Este proceso reiniciara todas las estructuras, Desea continuar?")
		.addButton(MessageDialogButton.Yes)				
		.addButton(MessageDialogButton.No)
		.build()
		.showDialog(gui);	
		if (answerreset.equals(MessageDialogButton.Yes)) {
			Panel panel = new Panel();
			panel.setLayoutManager(new GridLayout(1));		
			panel.addComponent(new Label("sincronizando..."));
			panel.addComponent(status);
			window.setComponent(panel.withBorder(Borders.singleLine("Loading...")));
			gui.addWindow(window);
			ThreadRotDash dash = new ThreadRotDash(gui, status);
			dash.start();
			Thread thread = new Thread(dash);
			thread.start();						
			String error= "";
			error = SyncModel.getInstance().SyncronizeReset(dash, error);
			while (error.length() > 0) {
				MessageDialogButton answer = new MessageDialogBuilder()
				.setTitle("Syncroreset error")
				.setText(String.format("%s desea reintentar?", error))
				.addButton(MessageDialogButton.Yes)
				.addButton(MessageDialogButton.No)
				.build()
				.showDialog(gui);
				if (answer.ordinal() == MessageDialogButton.No.ordinal()) {
					error = "";				
				} else {		
					error = SyncModel.getInstance().SyncronizeReset(dash, error);					
				}
			}
			dash.stop();
		}
		window.close();		
	}

	public void synchro(Screen screen) {
		final MultiWindowTextGUI gui = new MultiWindowTextGUI(screen, new DefaultWindowManager(), new EmptySpace(TextColor.ANSI.DEFAULT));
		final BasicWindow window = new BasicWindow();
		//final Label status = new Label("/");
		final Label status = new Label("sincronizando...");
		final Label checking = new Label("");
		window.setHints(Arrays.asList(Window.Hint.FULL_SCREEN));
		Panel panel = new Panel();
		panel.setLayoutManager(new GridLayout(1));		
		panel.addComponent(status);
		//panel.addComponent(status);
		ProgressBar pbar = new ProgressBar(0,100,100);
		ProgressBar checkpbar = new ProgressBar(0,100,100);
		panel.addComponent(pbar);
		panel.addComponent(checking);
		panel.addComponent(checkpbar);
		window.setComponent(panel.withBorder(Borders.singleLine("Loading...")));
		gui.addWindow(window);
		try {
			gui.updateScreen();
		} catch (IOException e2) {
			e2.printStackTrace();
		}													
		//ThreadRotDash dash = new ThreadRotDash(gui, status);
		//dash.start();
		//Thread thread = new Thread(dash);
		//thread.start();
		SyncModel.getInstance().setGUI(gui);
		SyncModel.getInstance().setBar(pbar);
		SyncModel.getInstance().setBarChecking(checkpbar);
		SyncModel.getInstance().setLabel(status);
		SyncModel.getInstance().setLabelChecking(checking);		
		String error = "";
		error= SyncModel.getInstance().SyncronizeFull(error);
		while (error.length() > 0) {
			MessageDialogButton answer = new MessageDialogBuilder()
			.setTitle("Syncro error")
			.setText(String.format("%s desea reintentar?", error))
			.addButton(MessageDialogButton.Yes)
			.addButton(MessageDialogButton.No)
			.build()
			.showDialog(gui);
			if (answer.ordinal() == MessageDialogButton.No.ordinal()) {
				error = "";				
			} else {		
				error = SyncModel.getInstance().SyncronizeFull(error);
			}
		}
		//dash.stop();
		window.close();
	}

	public static Xendrian getInstance() {
		if (instance == null)
			instance = new Xendrian();
		return instance;
	}


	public void webserver() {
		String machineid = String.valueOf(Env.getMachine().getA_Machine_ID());
		String where = "properties->'A_Machine_ID'  = ? AND servertype = ?";
		X_A_MachineServer ms = new Query(Env.getCtx(), X_A_MachineServer.Table_Name, where, null)
		.setParameters(machineid, REF_ServerType.WebServer).first();
		if (ms == null) {
			ms = new X_A_MachineServer(Env.getCtx(), 0 , null);
			HashMap m = ms.getProperties();
			if (m == null) {
				m = new HashMap();
			}
			m.put("A_Machine_ID", machineid);
			ms.setProperties(m);
			ms.setServerType(REF_ServerType.WebServer);
			ms.save();
		} 
		HashMap m = ms.getProperties();
		m.put("port", "8080");
		m.put("secureport", "8888");
		ms.setProperties(m);
		ms.save();
		//X_A_MachineServer updateserver = new Query(Env.getCtx(), X_A_MachineServer.Table_Name, where, null)
		//setParameters(machineid, REF_ServerType.UpdateServer).first();
		//if (updateserver == null) {
		//	updateserver = new X_A_MachineServer(Env.getCtx(), 0 , null);
		//	HashMap p = updateserver.getProperties();
		//	if (p== null) {
		//		p = new HashMap();
		//	}
		//	p.put("A_Machine_ID", machineid);
		//	updateserver.setProperties(m);
		//	updateserver.setServerType(REF_ServerType.UpdateServer);
		//	updateserver.save();			
		//}
		//org.xendra.xendrian.Server.main(null);
	}


}
