package controller;

import database.DataAccessException;
import database.PersonDB;
import database.PersonDBIF;
import model.Employee;
import model.Person;

public class PersonController {

	private PersonDBIF personDB;
	
	public PersonController() throws DataAccessException {
		this.personDB = new PersonDB();
	}
	
	public Person findCustomerByPhone(String phoneNo) throws DataAccessException {
		return personDB.findCustomerByPhone(phoneNo);
	}

	public Employee findEmployeeByID(String employeeID) throws DataAccessException {
		return personDB.findEmployeeByID(employeeID);
	}

}
