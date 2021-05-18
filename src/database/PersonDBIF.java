package database;

import model.Person;

public interface PersonDBIF {

	Person findCustomerByPhone(String phoneNo) throws DataAccessException;
	
	Person findEmployeeByID(String employeeID) throws DataAccessException;

}
