package database;

import model.Equipment;

public interface EquipmentDBIF {

	Equipment findEquipmentByID(String eqID) throws DataAccessException;
	
	Equipment findEquipmentByName(String eqName) throws DataAccessException;
	
}
