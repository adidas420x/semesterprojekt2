package database;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Customer;
import model.Person;

public class PersonDB implements PersonDBIF {
	private static final String findCustomerByPhoneQ = "select email, phoneNo, zipcode," + 
	 " address, from persons where phoneNo = ? and type = c";
	
	//private static final String findEmployeeByIDQ = "select email, phoneNo, zipCode, address, from persons where "
	
	private PreparedStatement findCustomerByPhone;
	
	public PersonDB() throws DataAccessException {
		try {
			findCustomerByPhone = DBConnection.getInstance().getConnection().prepareStatement(findCustomerByPhoneQ);
		} catch (SQLException e) {
			throw new DataAccessException(e, "could not prepare statement");
		}
	}
	
	@Override
	public Customer findCustomerByPhone(String phoneNo) throws DataAccessException {
		try {
			findCustomerByPhone.setString(2, phoneNo);
			ResultSet rs = findCustomerByPhone.executeQuery();
			Customer c = null;
			if (rs.next()) {
				c = buildObject(rs);
			}
			return c;
			
		} catch (SQLException e) {
			throw new DataAccessException(e, "could not find by phone");
		}
	}
	
	private Person buildObject(ResultSet rs) throws SQLException {
		Customer c = new Customer (
				rs.getString("email"),
				rs.getString("phoneNo"),
				rs.getString("zipcode"),
				rs.getString("adress"),
				rs.getString("type")
				);
		return c;
	}
	
	private List<Customer> buildObjects(ResultSet rs) throws SQLException{
		List<Customer> res = new ArrayList<>();
		while(rs.next()) {
			res.add(buildObject(rs));
		}
		return res;
	}
	
	
}
