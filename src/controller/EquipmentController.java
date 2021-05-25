package controller;

import java.time.LocalDate;
import java.util.List;

import database.CopyDB;
import database.CopyDBIF;
import database.DataAccessException;
import database.EquipmentDB;
import database.EquipmentDBIF;
import model.Copy;
import model.Equipment;

public class EquipmentController {

	private EquipmentDBIF equipmentDB;
	private CopyDBIF copyDB;
	
	public EquipmentController() throws DataAccessException {
		super();
		this.equipmentDB = new EquipmentDB();
	}
	
	public List<Equipment> findEquipment(String eqName, String eqID, LocalDate startDate, LocalDate endDate) throws DataAccessException {
		List<Equipment> equipments = equipmentDB.findEquipment(eqID, eqID, endDate, endDate);
		return equipments;
	}
	
	public List<Copy> getCopiesFromTemp(String eqID, LocalDate startDate, LocalDate endDate) throws DataAccessException{
		List<Copy> copies = copyDB.getAvailCopies(eqID, startDate, endDate);	
		return copies;
	}
}