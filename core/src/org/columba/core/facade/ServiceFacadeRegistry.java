// The contents of this file are subject to the Mozilla Public License Version
// 1.1
//(the "License"); you may not use this file except in compliance with the
//License. You may obtain a copy of the License at http://www.mozilla.org/MPL/
//
//Software distributed under the License is distributed on an "AS IS" basis,
//WITHOUT WARRANTY OF ANY KIND, either express or implied. See the License
//for the specific language governing rights and
//limitations under the License.
//
//The Original Code is "The Columba Project"
//
//The Initial Developers of the Original Code are Frederik Dietz and Timo
// Stich.
//Portions created by Frederik Dietz and Timo Stich are Copyright (C) 2003.
//
//All Rights Reserved.
package org.columba.core.facade;

import java.util.Hashtable;
import java.util.Map;

import org.columba.api.exception.ServiceNotFoundException;

/**
 * Service registry and locator. Upper layers can register a service which can
 * be used by others. A service is registered using its full interface name
 * including package and the name of the implementation.
 * <p>
 * <code>ServiceManager</code> uses reflection to instanciate the
 * implementation.
 * <p>
 * This registry should be only used to enable different components to interact
 * with each other. For example: Mail component makes use of the addressbook
 * component
 * 
 * @author fdietz
 */
public class ServiceFacadeRegistry {

	private static ServiceFacadeRegistry instance = new ServiceFacadeRegistry();

	private Map<Class, Service> map = new Hashtable<Class, Service>();

	private ServiceFacadeRegistry() {
	}

	public static ServiceFacadeRegistry getInstance() {
		return instance;
	}

	public void register(Class serviceInterface, Object serviceInstance) {
		Service service = new Service(serviceInterface, serviceInstance);

		map.put(serviceInterface, service);
	}

	public void unregister(Class serviceInterface) {
		map.remove(serviceInterface);
	}

	public Object getService(Class serviceInterface)
			throws ServiceNotFoundException {
		Object o = null;
		Service service = null;

		// check if service is registered
		if (map.containsKey(serviceInterface)) {
			service = map.get(serviceInterface);

			// retrieve service instance
			if (service != null)
				o = service.getServiceInstance();
		}

		if (o == null)
			throw new ServiceNotFoundException(serviceInterface);

		return o;
	}

	/**
	 * A service is described with its service name, which is usually the name
	 * of the interface.
	 * <p>
	 * Keeps a reference to the service instanciation.
	 * 
	 * @author Frederik Dietz
	 */
	private class Service {
		private Class serviceInterface;

		private String implementationName;

		private Object serviceInstance;

		Service(Class serviceInterface, String implementationName) {
			this.serviceInterface = serviceInterface;
			this.implementationName = implementationName;
		}

		public Service(Class serviceInterface, Object serviceInstance) {
			this.serviceInterface = serviceInterface;

			this.serviceInstance = serviceInstance;
		}

		/**
		 * @return Returns the serviceInstance.
		 */
		public Object getServiceInstance() {
			// check if there's already an instanciation available
			// we can reuse here
			if (serviceInstance == null) {
				// load instance of service
				serviceInstance = loadInstance(implementationName);
			}

			return serviceInstance;
		}

		/**
		 * @return Returns the serviceName.
		 */
		public Class getServiceInterface() {
			return serviceInterface;
		}

		/**
		 * Load instance of class.
		 * <p>
		 * 
		 * @param className
		 *            class name
		 * @return instance of class
		 */
		private Object loadInstance(String className) {
			Object object = null;

			try {
				Class clazz = this.getClass().getClassLoader().loadClass(
						className);

				object = clazz.newInstance();

			} catch (ClassNotFoundException e) {

				e.printStackTrace();
			} catch (InstantiationException e) {

				e.printStackTrace();
			} catch (IllegalAccessException e) {

				e.printStackTrace();
			}

			return object;
		}
	}
}