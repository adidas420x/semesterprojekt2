package database;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.Order;

public class OrderDB implements OrderDBIF {

	private static final String insertOrderQ = "insert into orders eventstartdate = ?, eventenddate = ?, eventstatus = ?, employeeid = ?";

	private PreparedStatement insertOrder;
	
	public OrderDB() throws DataAccessException{
		try {
			insertOrder = DBConnection.getInstance().getConnection().prepareStatement(insertOrderQ);
		} catch (SQLException e) {
			throw new DataAccessException(e, "Could not insert Order into database");
		}
	}
	
	@Override
	public Order insertOrder(Order order) throws DataAccessException{
		try {
			insertOrder.setDate(1, Date.valueOf(order.getEventStartDate()));
			insertOrder.setDate(2, Date.valueOf(order.getEventEndDate()));
			insertOrder.setString(3, order.getEventStatus());
			insertOrder.setString(4, order.getEmployeeID());
			insertOrder.executeUpdate();
			return order;
		} catch (SQLException e) {
			throw new DataAccessException(e, "Could not insert Order");
		}
	}
}
