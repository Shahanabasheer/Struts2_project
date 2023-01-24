package employee_details;

import java.sql.*;

import action.EmpAddAction;
import action.EmpEditAction;

public class EmployeeDao {

	// method for create connection
	public static Connection getConnection() throws Exception {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			return DriverManager.getConnection("jdbc:mysql://localhost:3306/data1", "root", "");
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public int addEmployee(EmpAddAction em) {
		// System.out.println("Add employee");
		int status = 0;
		try {

			Connection con = getConnection();
			PreparedStatement ps = con.prepareStatement(
					"insert into employee(id,name,email,designation,salary,gender,phonenumber) values(?,?,?,?,?,?,?)");

			ps.setInt(1, em.getId());
			ps.setString(2, em.getName());
			ps.setString(3, em.getEmail());
			ps.setString(4, em.getDesignation());
			ps.setLong(5, em.getSalary());
			ps.setString(6, em.getGender());
			ps.setString(7, em.getPhonenumber());

			status = ps.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}

	public ResultSet showEmployee() throws SQLException, Exception {
		// System.out.println("showww...");
		ResultSet rs = null;
		try {
			Connection con = getConnection();
			PreparedStatement ps = con.prepareStatement("select * from employee");
			rs = ps.executeQuery();
			return rs;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public ResultSet getEmpbyId(int eid) throws SQLException, Exception {
		ResultSet rs = null;
		try {
			Connection con = getConnection();
			PreparedStatement ps = con.prepareStatement("select * from employee where id=?");
			ps.setInt(1, eid);
			rs = ps.executeQuery();
			return rs;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public int editEmployee(EmpEditAction em) throws SQLException, Exception {
		int status = 0;
		try {

			Connection con = getConnection();
			PreparedStatement ps = con.prepareStatement(
					"update employee set name=?,email=?,designation=?,salary=?,gender=?,phonenumber=? where id=?");

			ps.setString(1, em.getName());
			ps.setString(2, em.getEmail());
			ps.setString(3, em.getDesignation());
			ps.setLong(4, em.getSalary());
			ps.setString(5, em.getGender());
			ps.setString(6, em.getPhonenumber());
			ps.setInt(7, em.getId());
			// System.out.println("Edit emp..."+id);
			status = ps.executeUpdate();
			System.out.println("Edit emp..." + status);
		} catch (Exception e) {
			// TODO: handle exception
		}

		return status;
	}

	public int deleteEmployee(int id) {
		int status = 0;
		try {
			Connection con = getConnection();
			PreparedStatement ps = con.prepareStatement("delete from employee where id=?");

			ps.setInt(1, id);

			status = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}
}
