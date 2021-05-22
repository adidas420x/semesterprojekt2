package controller;

import java.time.LocalDate;
import java.util.List;

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
	
	public List<Equipment> findEquipment(String name, String eqID, LocalDate startDate, LocalDate endDate) {
		return equipmentDB.findEquipment();
	}
}