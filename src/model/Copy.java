package model;

public class Copy {
	
	private String eqID;
	private String eqAvailability;
	
	public Copy(String eqID, String eqAvailability) {
		super();
		this.eqID = eqID;
		this.eqAvailability = eqAvailability;
	}

	public String getEqID() {
		return eqID;
	}

	public void setEqID(String eqID) {
		this.eqID = eqID;
	}

	public String getEqAvailability() {
		return eqAvailability;
	}

	public void setEqAvailability(String eqAvailability) {
		this.eqAvailability = eqAvailability;
	}
}
