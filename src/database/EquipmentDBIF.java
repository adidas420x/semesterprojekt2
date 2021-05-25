package database;

import java.time.LocalDate;
import java.util.List;

import model.Equipment;

public interface EquipmentDBIF {

	List<Equipment> findEquipment(String name, String eqID, LocalDate startDate, LocalDate endDate) throws DataAccessException;
}
