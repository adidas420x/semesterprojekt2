package database;

import java.time.LocalDate;

import model.Equipment;

public interface EquipmentDBIF {

	Equipment findEquipment(String name, String eqID, LocalDate startDate, LocalDate endDate) throws DataAccessException;
}
