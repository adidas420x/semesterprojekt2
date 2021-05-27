package model;

public class Customer extends Person {

	private String companyName;

	public Customer(String email, String phoneNo, String address, String zipCode, String city, String companyName) {
		super(email, phoneNo, address, zipCode, city);
		this.companyName = companyName;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
}