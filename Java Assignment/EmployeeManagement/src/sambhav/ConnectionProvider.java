package sambhav;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionProvider {
	
	static Connection con;
	
	public static Connection createConnection() {
		
		try {
			//load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			//create the connection
			String user="root";
			String password="root";
			String url="jdbc:mysql://localhost:3306/emp_management?autoReconnect=true&useSSL=false";
			con=DriverManager.getConnection(url, user, password);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return con;
		
	}

}

