package database;

import model.Order;

public interface OrderDBIF {

	Order insertOrder(Order order) throws DataAccessException;

}
