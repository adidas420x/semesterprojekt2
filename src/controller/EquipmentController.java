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
	
	public Equipment searchEquipment(String name, String eqID) {
		return EquipmentDB.findEquipment(name, eqID);
	}
	
	public Equipment addEquipmentToOrder(String eqID, quantity??) {
		return null;
	}
}
