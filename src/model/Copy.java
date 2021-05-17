package model;

public class Copy {
	
	private String serialNo;
	private String eqAvailability;
	
	public Copy(String serialNo, String eqAvailability) {
		super();
		this.serialNo = serialNo;
		this.eqAvailability = eqAvailability;
	}

	public String getSerialNo() {
		return serialNo;
	}

	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
	}

	public String getEqAvailability() {
		return eqAvailability;
	}

	public void setEqAvailability(String eqAvailability) {
		this.eqAvailability = eqAvailability;
	}
}
