package database;

import model.Person;

public interface PersonDBIF {

	Person findPersonByPhone(String phoneNo) throws DataAccessException;

}
