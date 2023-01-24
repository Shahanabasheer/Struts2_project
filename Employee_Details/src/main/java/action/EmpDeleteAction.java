package action;



import com.opensymphony.xwork2.ActionSupport;

import employee_details.EmployeeDao;

public class EmpDeleteAction extends ActionSupport{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String msg = "";
	
	

	EmployeeDao empdao = new EmployeeDao();
	
	@Override
	public String execute() throws Exception {
		try {
			System.out.println("DEle..id.."+id);
			int isDel=empdao.deleteEmployee(id);
			
			if (isDel > 0) {
				msg = "Record deleted successfully";
			} else {
				msg = "Some error";
			}
		}catch (Exception e) {
			e.printStackTrace();
			
			// TODO: handle exception
		}
		return "DELETE EMPLOYEE";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

}
