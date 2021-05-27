package database;

import model.Customer;
import model.Employee;
import model.Person;

public interface PersonDBIF {

	Customer findCustomerByPhone(String phoneNo) throws DataAccessException;

	Employee findEmployeeByID(String employeeID) throws DataAccessException;
}