package model;

public class Employee extends Person {

	private String employeeID;
	private String name;

	public Employee(String email, String phoneNo, String address, String zipCode, String city, String employeeID,
			String name) {
		super(email, phoneNo, address, zipCode, city);
		this.employeeID = employeeID;
		this.name = name;
	}

	public String getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(String employeeID) {
		this.employeeID = employeeID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}