/**
 * 
 */
package org.xendra.apps.form.kanban;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;


/**
 * @author Ratheesh Ravindran
 * Ratheesh.Ravindran@gmail.com
 * http://crashingnhanging.blogspot.com
 */
public class FileDataStorage implements DataStorage {

	private static final String BACKLOGDATA_STORAGE = "backlogdata.storage";

	@Override
	public List<FCData> loadFCData() {
		List<FCData> fcList = new ArrayList<FCData>();
		try
	      {
	         FileInputStream fileIn =
	                          new FileInputStream(BACKLOGDATA_STORAGE);
	         ObjectInputStream in = new ObjectInputStream(fileIn);
	         fcList = (List<FCData>) in.readObject();
	         in.close();
	         fileIn.close();
	      } catch (FileNotFoundException e) {
	    	  System.out.println("File not found " + BACKLOGDATA_STORAGE);
	      } catch(IOException i) {
	         i.printStackTrace();
	      } catch (ClassNotFoundException e) {
			e.printStackTrace();
	      }
	      return fcList;
	}

	@Override
	public void saveFCData(List<FCData> fcData) {
		FileOutputStream fileOut;
		try {
			fileOut = new FileOutputStream(BACKLOGDATA_STORAGE);
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(fcData);
			out.close();
			fileOut.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void updateFCData(List<FCData> fcData) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteFCData(List<FCData> fcData) {
		// TODO Auto-generated method stub
		
	}

}
