package org.xendra.console;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.xendra.api.Connection;

public class config {

	public static void main(String[] args) throws IOException {
		List<Location> locationList = new ArrayList<Location>();
		locationList.add(new Location("MessageServer"));
		// proceso de servidor
		Connection t = new Connection();
		LanterminalEngine lE = new LanterminalEngine(t);
		try {
			lE.turnOn();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		System.out.println("Killing threads; exit");	
	}
}
