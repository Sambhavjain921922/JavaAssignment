package sambhav;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class EmployeeDao {
	
	public static boolean addEmployee(Employee emp) {
		boolean f=false;
		try {
			//jdbc code..
			Connection connection = ConnectionProvider.createConnection();
			String query = "insert into employees(ename,ephone,edept) values(?,?,?)";
			
			//Prepared Statement
			PreparedStatement ps = connection.prepareStatement(query);
			
			//set the value of parameter
			ps.setString(1,emp.getEmpName());
			ps.setString(2, emp.getEmpPhone());
			ps.setString(3, emp.getEmpDept());
			
			//execute
			ps.executeUpdate();
			f=true;
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return f;
		
	}

	public static boolean deleteEmployee(int id) {
		
		boolean f=false;
		try {
			//jdbc code..
			Connection connection = ConnectionProvider.createConnection();
			String query = "delete from employees where eid=?";
			
			//Prepared Statement
			PreparedStatement ps = connection.prepareStatement(query);
			
			//set the value of parameter
			ps.setInt(1,id);
			//execute
			ps.executeUpdate();
			f=true;	
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return f;
	}

	public static void showAllEmployees() {
		
		try {
			//jdbc code..
			Connection connection = ConnectionProvider.createConnection();
			String query = "select * from employees";
			
			Statement statement = connection.createStatement();
			ResultSet rs = statement.executeQuery(query);
			if(!rs.next()) { 
			    System.out.println("No users to display!!!"); 
			    System.out.println(); 
			   } 
			   rs.previous();
			
			while(rs.next()) {
				
				int id = rs.getInt(1);
				String name = rs.getString(2);
				String phone = rs.getString(3);
				String dept = rs.getString(4);
				
				System.out.println("ID:"+id);
				System.out.println("Name:"+name);
				System.out.println("Phone:"+phone);
				System.out.println("Department:"+dept);
				System.out.println();
			}	
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static boolean updateEmployee(Employee emp) {
		
		boolean f=false;
		int id = emp.getEmpId();
		String name = emp.getEmpName();
		String phone = emp.getEmpPhone();
		String dept = emp.getEmpDept();
		try {
			//jdbc code..
			Connection connection = ConnectionProvider.createConnection();
			String query = "UPDATE employees SET ename = '"+name+"', ephone='"+phone+"',edept='"+dept+"' WHERE eid ="+id+";";
			Statement statement = connection.createStatement();
			statement.executeUpdate(query);
			f=true;
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return f;
	}

	public static void searchEmployee(int id) {

		try {
			//jdbc code..
			Connection connection = ConnectionProvider.createConnection();
			String query = "select * from employees where eid="+id;
			
			Statement statement = connection.createStatement();
			ResultSet rs = statement.executeQuery(query);
			if(!rs.next()){
	            System.out.println("No such user available!!!");
	            System.out.println();
	        }
			else {
				int eid = rs.getInt(1);
				String name = rs.getString(2);
				String phone = rs.getString(3);
				String dept = rs.getString(4);
				
				System.out.println("ID:"+eid);
				System.out.println("Name:"+name);
				System.out.println("Phone:"+phone);
				System.out.println("Department:"+dept);
				System.out.println();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
