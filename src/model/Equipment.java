package model;

public class Equipment {

	private String eqID;
	private String storageLocation;
	private String description;
	private int stock;
	
	public Equipment(String eqID, String storageLocation, String description, int stock) {
		super();
		this.eqID = eqID;
		this.storageLocation = storageLocation;
		this.description = description;
		this.stock = stock;
	}

	public String getEqID() {
		return eqID;
	}

	public void setEqID(String eqID) {
		this.eqID = eqID;
	}

	public String getStorageLocation() {
		return storageLocation;
	}

	public void setStorageLocation(String storageLocation) {
		this.storageLocation = storageLocation;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}
	
}
