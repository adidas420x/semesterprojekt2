package database;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.Order;

public class OrderDB implements OrderDBIF {

	private static final String insertOrderQ = "insert into orders orderid = ?, eventstartdate = ?, eventenddate = ?, eventstatus = ?, eventid = ?, ephoneno = ?";

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
			insertOrder.setString(1, order.getOrderID());
			insertOrder.setDate(2, Date.valueOf(order.getStartDate()));
			insertOrder.setDate(3, Date.valueOf(order.getEndDate()));
			insertOrder.setString(4, order.getEventStatus());
			//insertOrder.setString(5, event.getEventID());
			//insertOrder.setString(6, orderController.getEmployee().get);
			insertOrder.executeUpdate();
			return order;
		} catch (SQLException e) {
			throw new DataAccessException(e, "Could not insert Order");
		}
	}
}
