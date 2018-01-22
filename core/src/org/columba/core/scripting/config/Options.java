/*
  The contents of this file are subject to the Mozilla Public License Version 1.1
  (the "License"); you may not use this file except in compliance with the 
  License. You may obtain a copy of the License at http://www.mozilla.org/MPL/
  
  Software distributed under the License is distributed on an "AS IS" basis,
  WITHOUT WARRANTY OF ANY KIND, either express or implied. See the License 
  for the specific language governing rights and
  limitations under the License.

  The Original Code is "The Columba Project"
  
  The Initial Developers of the Original Code are Frederik Dietz and Timo Stich.
  Portions created by Frederik Dietz and Timo Stich are Copyright (C) 2003. 
  
  All Rights Reserved.
*/
package org.columba.core.scripting.config;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.xml.bind.annotation.*;

import org.columba.core.config.DefaultItem;
import org.columba.core.config.jaxbobject;
import org.columba.core.xml.XmlElement;

/**
    @author Celso Pinto (cpinto@yimports.com)
 */
@XmlRootElement(name = "options")
@XmlAccessorType(XmlAccessType.FIELD)
public class Options extends jaxbobject {
	@XmlAttribute
	Integer poll_interval = 5;
	@XmlAttribute 
	Boolean polling_enabled = true;
    public static final int INTERVAL_TIME_UNIT = 1000; // seconds
    
    private List observers = new ArrayList();

    //public Options(XmlElement aRoot)
    //{
    //    super(aRoot);
    //}
    public Options()
    {
        
    }
   
    public Integer getPoll_interval() {
		return poll_interval;
	}
	public void setPoll_interval(Integer interval) {
		Integer old = this.poll_interval;
		this.poll_interval = interval;
        if (old != interval)
        {
            for (Iterator it = observers.iterator(); it.hasNext();)
                ((OptionsObserver) it.next()).pollingIntervalChanged(interval);
        }		
	}
	public Boolean getPolling_enabled() {
		return polling_enabled;
	}
	public void setPolling_enabled(Boolean poll) {
		Boolean old = this.polling_enabled;
		this.polling_enabled = poll;
        if (old != poll)
        {
            for (Iterator it = observers.iterator(); it.hasNext();)
                ((OptionsObserver) it.next()).pollingStateChanged(poll);
        }		
	}
    public void addObserver(OptionsObserver observer)
    {
        if (!observers.contains(observer)) observers.add(observer);
    }
    public void removeObserver(OptionsObserver observer)
    {
        observers.remove(observer);
    }
    void setDefaultData()
    {
        setPoll_interval(5);
        setPolling_enabled(true);        
    }
    public int getInternalPollingInterval()
    {
        return getPoll_interval() * INTERVAL_TIME_UNIT;
    }
}
