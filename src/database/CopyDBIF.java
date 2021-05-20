package database;

import model.Copy;

public interface CopyDBIF {

	Copy getAvailCopies(String eqAvailability) throws DataAccessException;

}
