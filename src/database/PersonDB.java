package database;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Customer;
import model.Employee;
import model.Person;

public class PersonDB implements PersonDBIF {
	private static final String findCustomerByPhoneQ = "select email, phoneNo, zipcode," + 
			" address, from persons where phoneNo = ? and type = c";
	private static final String findEmployeeByIDQ = "select email, phoneNo, zipCode, " + 
			" address, from persons where employeeID = ? and type = e";
	
	private PreparedStatement findCustomerByPhone;
	private PreparedStatement findEmployeeByID;
	
	public PersonDB() throws DataAccessException {
		try {
			findCustomerByPhone = DBConnection.getInstance().getConnection()
					.prepareStatement(findCustomerByPhoneQ);
			findEmployeeByID = DBConnection.getInstance().getConnection()
					.prepareStatement(findEmployeeByIDQ);
		} catch (SQLException e) {
			throw new DataAccessException(e, "could not prepare statements");
		}
	}
	
	@Override
	public Customer findCustomerByPhone(String phoneNo) throws DataAccessException {
		try {
			findCustomerByPhone.setString(2, phoneNo);
			ResultSet rs = findCustomerByPhone.executeQuery();
			Customer c = null;
			if (rs.next()) {
				c = buildCustomerObject(rs);
			}
			return c;
			
		} catch (SQLException e) {
			throw new DataAccessException(e, "could not find costumer by phone");
		}
	}
	
	@Override
	public Employee findEmployeeByID(String employeeID) throws DataAccessException {
		try {
			findEmployeeByID.setString(1, employeeID);
			ResultSet rs = findEmployeeByID.executeQuery();
			Employee e = null;
			if (rs.next()) {
			e = buildEmployeeObject(rs);
			}
			return e;
		} catch(SQLException e) {
			throw new DataAccessException(e, "could not find employee by id");
		}
	}
	
	private Employee buildEmployeeObject(ResultSet rs) throws SQLException {
		Employee e = new Employee (
				rs.getString("email"),
				rs.getString("phoneNo"),
				rs.getString("address"),
				rs.getString("zipCode"),
				rs.getString("city"),
				rs.getString("employeeID"),
				rs.getString("name")
				);
		return e;
	}
	
	private Customer buildCustomerObject(ResultSet rs) throws SQLException {
		Customer c = new Customer (
				rs.getString("email"),
				rs.getString("phoneNo"),
				rs.getString("address"),
				rs.getString("zipcode"),
				rs.getString("city"),
				rs.getString("companyName")
				);
		return c;
	}
	
	private List<Customer> buildCustomerObjects(ResultSet rs) throws SQLException{
		List<Customer> res = new ArrayList<>();
		while(rs.next()) {
			res.add(buildCustomerObject(rs));
		}
		return res;
	}
	
	private List<Employee> buildEmployeeObjects(ResultSet rs) throws SQLException{
		List<Employee> res = new ArrayList<>();
		while(rs.next()) {
			res.add(buildEmployeeObject(rs));
		}
		return res;
	}

}
