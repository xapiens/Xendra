package org.xendra.xendrian;

import java.sql.*;

public class LoginDao {  
	public static boolean validate(String name,String pass){  
		boolean status=false;  
		try{  
			Class.forName("org.postgresql.Driver");  
			Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/corpo24062016");  

			PreparedStatement ps=con.prepareStatement("select * from AD_User where name=? and pass=?");  
			ps.setString(1,name);  
			ps.setString(2,pass);  

			ResultSet rs=ps.executeQuery();  
			status=rs.next();  

		}catch(Exception e){System.out.println(e);}  
		return status;  
	}  
}  