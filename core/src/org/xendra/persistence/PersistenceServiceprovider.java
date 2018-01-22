package org.xendra.persistence;

public class PersistenceServiceprovider {
	private static PersistenceService instance;
	public static String configFile = "config-beans.xml";
	public static PersistenceService getPersistenceService() {
		if (instance == null){
			instance = new DistributedMapPersistenceService();
		}			
		return instance;
	}
	
	public static void clear() {
		configFile = "config-beans.xml";
		instance.clear();
		instance = null;
	}

}
