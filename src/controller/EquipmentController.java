package controller;

import database.DataAccessException;
import database.EquipmentDB;
import database.EquipmentDBIF;
import model.Equipment;

public class EquipmentController {

	private EquipmentDBIF equipmentDB;
	
	public EquipmentController() throws DataAccessException {
		super();
		this.equipmentDB = new EquipmentDB();
	}
	
	public Equipment findEquipmentByName(String name) {
		return EquipmentDB.findEquipmentName(name);
	}
	
	public Equipment findEquimentByID(String eqID) {
		return EquipmentDB.findEquipmentID(eqID);
	}
	
	
	public Equipment addEquipmentToOrder(String eqID, quantity??) {
		return null;
	}
}
