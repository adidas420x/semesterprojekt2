package model;

public class Equipment {

	private String serialNo;
	private String storageLocation;
	private String description;
	private int stock;
	
	public Equipment(String serialNo, String storageLocation, String description, int stock) {
		super();
		this.serialNo = serialNo;
		this.storageLocation = storageLocation;
		this.description = description;
		this.stock = stock;
	}

	public String getSerialNo() {
		return serialNo;
	}

	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
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
