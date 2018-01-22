package org.xendra.printdocument;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;

public class Test {
	public static void main(String[] args) {
		String hostname = "localhost";
		int port = 5151;
		try {
			Socket socket = new Socket(hostname, port);

			PrintWorker obj = new PrintWorker();
			//obj.setQueueName("factura");
			obj.setQueueName("document");
			obj.setPrinterDocumentFormat_ID(1);
			obj.setCommand(PrintWorker.ReceiveJob);
			obj.AddProperty("name", "nombre");
			obj.AddProperty("tema", 1);
			ArrayList<Integer> lista = new ArrayList<Integer>();
			lista.add(1);
			lista.add(2);
			lista.add(3);
			obj.AddProperty("lista", lista);

			String controlfile = 
					new String("C1\n"+
							"JJob name\n"+
							"LUser\n"+
							"Muser\n"+
							"NName\n"+
							"PName\n"+
							"Ttitle\n"+
							"HHost\n");
							//"Icount\n"+
							//"Sdevice inode\n"+							
							//"Ufile\n"+
							//"Wwidth\n"+
							//"1file\n"+
							//"2file\n"+
							//"3file\n"+
							//"4file\n"+
							//"cfile\n"+
							//"dfile\n"+
							//"ffile\n"+
							//"gfile\n"+
							//"lfile\n"+
							//"nfile\n"+
							//"ofile\n"+
							//"pfile\n"+
							//"rfile\n"+
							//"tfile\n"+
							//"vfile\n");

	        //System.out.println("controlfile[" + controlfile + "]");
	        byte[] bytes = controlfile.getBytes();
			obj.setContents(bytes);
			obj.setType("PRINT");
			//obj.persist(true);
			//ByteArrayOutputStream baos = new ByteArrayOutputStream();
		    //ObjectOutputStream oos = new ObjectOutputStream(baos);
		    //InputStream is = new ByteArrayInputStream(baos.toByteArray());		    
			BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			String inputLine;
			Boolean send = false;
			Boolean list = false;
			Boolean dele = false;
            //while ((inputLine = in.readLine()) != null || cont)			
			ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
			while (!send)
            {
        		    oos.writeObject(obj);
        		    //oos.writeObject(obj);
                	int x = in.read();
                	if (x == 0)
                	{
                		System.out.println("ACK");
                	}
                	//System.out.println(x);        		    
        		    send = true;
        		    in.close();
        		    oos.close();
            }
//			socket = new Socket(hostname, port);
//			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
//			oos = new ObjectOutputStream(socket.getOutputStream());
//			if (!list)
//        	{
//    			Objeto obj2 = new Objeto();    			
//    			obj2.setQueueName("factura");
//    			//obj2.setFormat("formato");
//    			obj2.setCommand(Objeto.ReportQueueStateLong);
//        		oos.writeObject(obj2);
//        		list = true;        		
//        		//byte[] x = in.read();
//        		String x = in.readLine();
//        		//while (x != null)
//        		//{
//        			System.out.println(x);
//        		//	x = in.readLine();
//        		//}
//        		in.close();
//        		oos.close();
//        	}
//			socket = new Socket(hostname, port);
//			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
//			oos = new ObjectOutputStream(socket.getOutputStream());
//			if (!dele)
//        	{
//    			Objeto obj3 = new Objeto();
//    			obj3.setQueueName("factura");
//    			obj3.setCommand(Objeto.RemovePrintJob);
//        		oos.writeObject(obj3);
//        		dele = true;        		
//        		//String x = in.readLine();
//        		//while (x != null)
//        		//{
//        		//	System.out.println(x);
//        		//	x = in.readLine();
//        		//}
//        		in.close();
//        		oos.close();
//        	}
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}
