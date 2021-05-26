package model;

public class Copy {
	
	private String serialNo;
	private String eqID;
	
	public Copy(String serialNo, String eqID) {
		super();
		this.serialNo = serialNo;
		this.eqID = eqID;
	}

	
	
	public String getSerialNo() {
		return serialNo;
	}

	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
	}

	public String getEqID() {
		return eqID;
	}
	
	public void setEqID(String eqID) {
		this.eqID = eqID;
	}
}
