package database;

import model.Customer;
import model.Person;

public interface PersonDBIF {

	Person findPersonByPhone(String phoneNo) throws DataAccessException;

	Customer findCustomerByPhone(String phoneNo) throws DataAccessException;

}
