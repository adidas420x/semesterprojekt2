package model;

import java.util.List;

public class Equipment {

	private String eqName;
	private String eqID;
	private String storageLocation;
	private String description;
	private String manufacturer;
	private int stock;
	private String owner;
	private List<Copy> copies;

	public Equipment(String eqName, String eqID, String storageLocation, String description, String manufacturer,
			int stock, String owner) {
		super();
		this.eqName = eqName;
		this.eqID = eqID;
		this.storageLocation = storageLocation;
		this.description = description;
		this.manufacturer = manufacturer;
		this.stock = stock;
		this.owner = owner;
	}
	
	public String getEqName() {
		return eqName;
	}

	public List<Copy> getCopies() {
		return copies;
	}

	public void setCopies(List<Copy> copies) {
		this.copies = copies;
	}

	public void setEqName(String eqName) {
		this.eqName = eqName;
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

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

}
