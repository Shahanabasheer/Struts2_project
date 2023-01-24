package action;

import com.opensymphony.xwork2.ActionSupport;

import employee_details.Employee;
import employee_details.EmployeeDao;

public class EmpAddAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String name, email, designation, gender,phonenumber;
	private long salary;
	private String msg = "";

	EmployeeDao empdao = null;
	Employee empl;

	int flag = 0;

	public String execute() throws Exception {

		empdao = new EmployeeDao();
		try {
			empl=new Employee();
			flag = empdao.addEmployee(this);//..........

			if (flag > 0) {
				msg = "Employee details added successfully";
			} else {
				msg = "Some error";
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return "ADD EMPLOYEE";
	}

	public Employee getEmpl() {
		return empl;
	}

	public void setEmpl(Employee empl) {
		this.empl = empl;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender ) {
		this.gender = gender;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public int getFlag() {
		return flag;
	}

	public void setFlag(int flag) {
		this.flag = flag;
	}

}
