package sambhav;
public class Employee {

	private int empId;
	private String empName;
	private String empPhone;
	private String empDept;

	public Employee(int empId, String empName, String empPhone, String empDept) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empPhone = empPhone;
		this.empDept = empDept;
	}

	public Employee(String empName, String empPhone, String empDept) {
		super();
		this.empName = empName;
		this.empPhone = empPhone;
		this.empDept = empDept;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpPhone() {
		return empPhone;
	}

	public void setEmpPhone(String empPhone) {
		this.empPhone = empPhone;
	}

	public String getEmpDept() {
		return empDept;
	}

	public void setEmpDept(String empDept) {
		this.empDept = empDept;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empPhone=" + empPhone + ", empDept=" + empDept
				+ "]";
	}

}
