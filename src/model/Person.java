package model;

public class Person {

	private String email;
	private String phoneNo;
	private String zipCode;
	private String city;
	private String address;
	
	public Person(String email, String phoneNo, String zipCode, String city, String address) {
		super();
		this.email = email;
		this.phoneNo = phoneNo;
		this.zipCode = zipCode;
		this.city = city;
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
