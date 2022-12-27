package sambhav;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Start {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Employee Management System");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		boolean answer;
		while(true) {
			System.out.println("Enter your username");
			String username = br.readLine();
			
			System.out.println("Enter your password");
			String password = br.readLine();
			
			answer = UserDao.login(username,password);
			if(answer) {
				while(true) {
					System.out.println("press 1 to add employee");
					System.out.println("press 2 to display employee");
					System.out.println("press 3 to update employee");
					System.out.println("press 4 to delete employee");
					System.out.println("press 5 to search employee");
					System.out.println("Press 6 to exit");
					int c = Integer.parseInt(br.readLine());
					
					if(c==1) {
						//add 
						System.out.println("Enter employee name");
						String name = br.readLine();
						
						System.out.println("Enter employee phone");
						String phone = br.readLine();
						
						System.out.println("Enter employee department");
						String dept = br.readLine();
						
						Employee employee = new Employee(name, phone, dept);
						answer = EmployeeDao.addEmployee(employee);
						if(answer) {
							System.out.println("Employee is added successfully!!!");
						}
						else {
							System.out.println("Something went wrong!!!");
						}
					}
					else if(c==2) {
						//display
						EmployeeDao.showAllEmployees();
					}
					else if(c==3) {
						//update
						System.out.println("Enter employee id to update");
						int id = Integer.parseInt(br.readLine());
						
						System.out.println("Enter employee name");
						String name = br.readLine();
						
						System.out.println("Enter employee phone");
						String phone = br.readLine();
						
						System.out.println("Enter employee department");
						String dept = br.readLine();
						
						Employee employee = new Employee(id,name, phone, dept);
						answer = EmployeeDao.updateEmployee(employee);
						if(answer) {
							System.out.println("Employee is updated successfully!!!");
						}
						else {
							System.out.println("Something went wrong!!!");
						}
					}
					else if(c==4) {
						//delete
						System.out.println("Enter employee id to delete");
						int id = Integer.parseInt(br.readLine());
						answer = EmployeeDao.deleteEmployee(id);
						if(answer) {
							System.out.println("Employee is deleted successfully!!!");
						}
						else {
							System.out.println("Soething went wrong!!!");
						}
					}
					else if(c ==5) {
						System.out.println("Enter employee id to search");
						int id = Integer.parseInt(br.readLine());
						EmployeeDao.searchEmployee(id);
					}
					else if(c==6) {
						//exit
						System.out.println("Thank you for using this system!!!");
						System.out.println("See you soon.. Bye bye");
						System.exit(0);
					}
					else {
						System.out.println("Enter a valid option.");
					}
				}
			}
			else {
				System.out.println("bad credientials!!!");
				System.out.println("Press 1 to quit");
				System.out.println("Press any other number to continue");
				int quit = Integer.parseInt(br.readLine());
				if(quit==1) {
					break;
				}
				else {
					continue;
				}
			}
		}
		System.out.println("Thank you for using this system!!!");
		System.out.println("See you soon.. Bye bye");
	}
}

