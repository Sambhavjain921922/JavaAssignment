package sambhav;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserDao {

	public static boolean login(String username, String password) {
		
		boolean f=false;
		try {
			//jdbc code..
			Connection connection = ConnectionProvider.createConnection();
			String query = "select * from users where username='"+username+"' and password='"+password+"'";
			//Prepared Statement
			PreparedStatement ps = connection.prepareStatement(query);
			ResultSet rs = ps.executeQuery(query);
			
			if(rs.next()) {
				f=true;
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return f;
	}

}
