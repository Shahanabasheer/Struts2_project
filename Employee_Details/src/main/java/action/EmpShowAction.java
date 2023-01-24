package action;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import employee_details.Employee;
import employee_details.EmployeeDao;

public class EmpShowAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int id;
	ResultSet rs = null;
	Employee employee = null;
	List<Employee> emplist = null;
	EmployeeDao empdao = new EmployeeDao();

	@Override
	public String execute() throws Exception {

		try {
			emplist = new ArrayList<Employee>();
			
			rs = empdao.showEmployee();
			
			if (rs != null) {
				while (rs.next()) {
					
					employee = new Employee();

					employee.setId(rs.getInt("id"));
					employee.setName(rs.getString("name"));
					employee.setEmail(rs.getString("email"));
					employee.setDesignation(rs.getString("designation"));
					employee.setSalary(rs.getLong("salary"));
					employee.setGender(rs.getString("gender"));
					employee.setPhonenumber(rs.getString("phonenumber"));
					
                    emplist.add(employee);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "SHOW EMPLOYEE";
	}

	public List<Employee> getEmplist() {
		return emplist;
	}

	public void setEmplist(List<Employee> emplist) {
		this.emplist = emplist;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
}
