package org.xendra.xendrian;

import org.hornetq.api.core.HornetQException;
import org.hornetq.core.remoting.FailureListener;

public class CleanupFailureListener implements FailureListener {
	  private Object id;
	  public CleanupFailureListener(Object id) {
		   this.id = id;
		  }	  
	@Override
	public void connectionFailed(HornetQException exception, boolean failedover) {
		// TODO Auto-generated method stub
		 //connectionFailureListeners.remove(id);
		exception.printStackTrace();
	}

}
