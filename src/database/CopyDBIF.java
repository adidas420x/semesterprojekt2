package database;

import java.time.LocalDate;
import java.util.List;

import model.Copy;

public interface CopyDBIF {

	List<Copy> getAvailCopies(String eqID, LocalDate startDate, LocalDate endDate) throws DataAccessException;

}
