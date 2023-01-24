package action;

import java.sql.*;

import com.opensymphony.xwork2.ActionSupport;

import employee_details.Employee;
import employee_details.EmployeeDao;

public class EmpEditAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String name, email, designation, gender, phonenumber;
	private long salary;
	private String msg = "", submitEmp;

	ResultSet rs = null;

	EmployeeDao empdao = new EmployeeDao();
	Employee emp;

	@Override
	public String execute() throws Exception {
		try {
			System.out.println("id.." + id);
			emp=new Employee();

			if (submitEmp.equals("editdata")) {
				System.out.println("sub mit...id.." + id);
				rs = empdao.getEmpbyId(id);
				emp = new Employee();

				if (rs != null) {
					while (rs.next()) {
						// System.out.println("if...");

						name = rs.getString("name");
						email = rs.getString("email");
						designation = rs.getString("designation");
						salary = rs.getLong("salary");
						gender = rs.getString("gender");
						phonenumber = rs.getString("phonenumber");
					}
				}
			} else {
				int i = empdao.editEmployee(this);

				if (i > 0) {
					msg = "Record Updated Successfuly";
				} else {
					msg = "error";
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return "EDIT EMPLOYEE";
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

	public void setGender(String gender) {
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

	public Employee getEmp() {
		return emp;
	}

	public void setEmp(Employee emp) {
		this.emp = emp;
	}

	public String getSubmitEmp() {
		return submitEmp;
	}

	public void setSubmitEmp(String submitEmp) {
		this.submitEmp = submitEmp;
	}

}
