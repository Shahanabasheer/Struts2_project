package employee_details;

public class Employee {
	
	private String name,email,designation,gender,phonenumber;
	private int id;
	private long salary;
	
	
	
	
	public Employee() {
		super();
		
	}
	public Employee(String name, String email, String designation, String gender, String phonenumber, int id,
			long salary) {
		super();
		this.name = name;
		this.email = email;
		this.designation = designation;
		this.gender = gender;
		this.phonenumber = phonenumber;
		this.id = id;
		this.salary = salary;
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
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

}
