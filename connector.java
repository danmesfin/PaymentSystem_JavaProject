import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connector {
	 public static  Connection getConnection()
	 {   
		 
		 /*if you created your own database do not forget to change jdbc parameters
		 "your DB name", "root" and "DB acces password" 
		 */
		 Connection connection = null;
		 try {
			  //Creating Connection Object
		     connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/myDatabase","root","0419");
			 }
			 catch (SQLException e1) {
		         e1.printStackTrace(); 
		         }
		
		return connection;
		
	 }
	 
	public static void main(String[] args)
{
		
}
}
