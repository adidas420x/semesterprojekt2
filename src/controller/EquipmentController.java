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
	
	public Equipment findEquipmentByName(String name) throws DataAccessException {
		return equipmentDB.findEquipmentByName(name);
	}
	
	public Equipment findEquipmentByID(String eqID) throws DataAccessException {
		return equipmentDB.findEquipmentByID(eqID);
	}
	
	
	public Equipment addEquipmentToOrder(String eqID, quantity??) {
		return null;
	}
}
